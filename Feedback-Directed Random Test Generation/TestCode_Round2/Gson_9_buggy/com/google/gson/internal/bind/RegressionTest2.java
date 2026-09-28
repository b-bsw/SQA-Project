package com.google.gson.internal.bind;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value("hi!");
        jsonWriter10.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.setHtmlSafe(true);
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
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
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
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        jsonWriter9.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value("hi!");
        jsonWriter5.setHtmlSafe(false);
        jsonWriter5.setIndent("hi!");
        jsonWriter5.setSerializeNulls(true);
        boolean boolean14 = jsonWriter5.getSerializeNulls();
        boolean boolean15 = jsonWriter5.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonWriter7.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(100L);
        jsonWriter9.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        boolean boolean9 = jsonWriter8.isHtmlSafe();
        jsonWriter8.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.name("");
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
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter14.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        jsonWriter8.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.value(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter8.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endArray();
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
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        java.lang.Class<?> wildcardClass13 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter6.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.CHARACTER_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value((double) 100);
        boolean boolean15 = jsonWriter14.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.close();
        jsonTreeWriter0.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        jsonWriter9.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) 100L);
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
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        jsonTreeWriter0.flush();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        jsonWriter17.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((long) (byte) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter16.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
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
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value((double) 10);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.value((double) (short) 10);
        jsonWriter11.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.beginArray();
        jsonWriter13.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        jsonTreeWriter0.setHtmlSafe(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value("hi!");
        boolean boolean13 = jsonWriter12.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.nullValue();
        jsonWriter12.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) (short) 0);
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
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (short) 0);
        jsonWriter10.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("");
        boolean boolean10 = jsonWriter7.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonWriter2.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter3.beginObject();
        jsonWriter6.setHtmlSafe(false);
        jsonWriter6.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 1);
        java.lang.Class<?> wildcardClass8 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value((long) (byte) -1);
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
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        boolean boolean9 = jsonWriter8.isHtmlSafe();
        jsonWriter8.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 100);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("");
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.name("");
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
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement14 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [{}]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) 100);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((java.lang.Number) 100.0d);
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
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        boolean boolean15 = jsonWriter14.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 10.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) 0);
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
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement9 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [{}]");
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
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter14.nullValue();
        java.lang.Class<?> wildcardClass16 = jsonWriter15.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.close();
        jsonTreeWriter0.setHtmlSafe(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter4.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) 100);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 1L);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 1);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) ' ');
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (-1));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value("");
        jsonTreeWriter0.setLenient(false);
        boolean boolean7 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginObject();
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
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        boolean boolean8 = jsonTreeWriter0.getSerializeNulls();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        boolean boolean17 = jsonWriter13.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.name("");
        jsonTreeWriter0.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) (-1));
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
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
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
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        boolean boolean5 = jsonTreeWriter0.isLenient();
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 1);
        boolean boolean8 = jsonWriter7.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) 0L);
        jsonWriter12.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((-1L));
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value((java.lang.Number) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.endArray();
        jsonWriter11.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value((long) (short) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("");
        jsonTreeWriter0.setHtmlSafe(true);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        jsonWriter6.setIndent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter6.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.endObject();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        boolean boolean6 = jsonWriter5.isLenient();
        jsonWriter5.setSerializeNulls(true);
        jsonWriter5.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        java.lang.Class<?> wildcardClass10 = jsonWriter9.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
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
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value("");
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
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((-1L));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value((double) '#');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) (-1L));
        jsonWriter6.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter6.nullValue();
        jsonWriter6.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) ' ');
        boolean boolean15 = jsonWriter14.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) '4');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) 100);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter12.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
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
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter6.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter6.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        jsonTreeWriter0.flush();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(0L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.value((double) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter6.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.flush();
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) 0L);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.endArray();
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
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.flush();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) ' ');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endArray();
        boolean boolean17 = jsonWriter16.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter16.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((java.lang.Number) 10L);
        boolean boolean17 = jsonWriter16.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter16.name("");
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
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        jsonTreeWriter0.setIndent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter1 = jsonTreeWriter0.beginObject();
        jsonWriter1.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter1);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter3.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter6.beginObject();
        boolean boolean8 = jsonWriter7.isHtmlSafe();
        jsonWriter7.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(true);
        boolean boolean9 = jsonWriter8.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.value("");
        jsonWriter8.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        boolean boolean10 = jsonWriter9.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 1L);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        jsonWriter10.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter10.value((long) ' ');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter6.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter7.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) 1.0f);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonWriter2.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endArray();
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
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.name("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        jsonWriter13.setIndent("hi!");
        jsonWriter13.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        jsonWriter12.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.beginObject();
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
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("hi!");
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
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter6.value((double) (short) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) 1);
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonWriter2.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter3.beginObject();
        java.lang.Class<?> wildcardClass7 = jsonWriter6.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        jsonWriter4.setHtmlSafe(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter4.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        boolean boolean12 = jsonWriter11.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter6.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter6.value((long) '4');
        java.lang.Class<?> wildcardClass10 = jsonWriter9.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter13.endArray();
        jsonWriter13.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter13.value((long) (short) 0);
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
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((java.lang.Number) 10L);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        jsonWriter14.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value(true);
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
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.beginObject();
        boolean boolean5 = jsonWriter4.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter4.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter4.beginArray();
        jsonWriter9.setSerializeNulls(false);
        jsonWriter9.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        jsonTreeWriter0.close();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        jsonTreeWriter0.flush();
        boolean boolean9 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) 100.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        boolean boolean7 = jsonWriter6.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) (short) 0);
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
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) ' ');
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((double) '#');
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endArray();
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
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [{\"hi!\":null}]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        jsonWriter7.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) (-1L));
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((long) 'a');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        boolean boolean16 = jsonWriter15.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.value(false);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter17.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        boolean boolean4 = jsonTreeWriter0.isLenient();
        java.lang.Number number5 = null;
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(number5);
        jsonWriter6.setIndent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endObject();
        jsonWriter12.setSerializeNulls(false);
        jsonWriter12.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(0.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter11.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) 1);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        boolean boolean14 = jsonWriter13.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        jsonWriter13.flush();
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
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10.0f);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (byte) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) 100);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 1L);
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.JsonElement jsonElement17 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value(0.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[]]");
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
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement15 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[]]");
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
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonElement4);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        boolean boolean4 = jsonTreeWriter0.isLenient();
        java.lang.Number number5 = null;
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(number5);
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonElement7);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.URL_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter4.value(true);
        jsonWriter8.close();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [{\"hi!\":null}]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endArray();
        boolean boolean17 = jsonTreeWriter0.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        jsonWriter9.setLenient(false);
        java.lang.Class<?> wildcardClass12 = jsonWriter9.getClass();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter6.value(false);
        jsonWriter12.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter12.value((long) ' ');
        jsonWriter16.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value("");
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter14.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.value((java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        boolean boolean4 = jsonWriter3.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter3.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endArray();
        jsonTreeWriter0.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 100);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endArray();
        boolean boolean17 = jsonWriter16.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter16.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginObject();
        jsonWriter3.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(10L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value("hi!");
        jsonWriter6.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.name("");
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
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.value((long) 10);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter15.value("hi!");
        jsonWriter19.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
        com.google.gson.JsonElement jsonElement13 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(jsonElement13);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 10);
        jsonWriter12.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        jsonWriter18.setIndent("");
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
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) '#');
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) ' ');
        boolean boolean13 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(1L);
        boolean boolean14 = jsonWriter13.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (byte) 1);
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
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(false);
        boolean boolean13 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter6.value(false);
        jsonWriter12.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter12.value((long) ' ');
        boolean boolean17 = jsonWriter12.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((double) (-1));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        jsonTreeWriter0.setHtmlSafe(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        jsonTreeWriter0.setSerializeNulls(true);
        java.lang.Class<?> wildcardClass9 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(100L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((java.lang.Number) (short) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter3);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) '4');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        jsonWriter5.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter5.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement8 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 0L);
        jsonWriter12.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement15 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[true]]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean12 = jsonWriter11.getSerializeNulls();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        boolean boolean6 = jsonWriter5.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((-1L));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) ' ');
        boolean boolean15 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter14.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        boolean boolean10 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.endArray();
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
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.endObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value((-1L));
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter3.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 1);
        jsonWriter7.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(0.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        boolean boolean8 = jsonTreeWriter0.getSerializeNulls();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter12.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(0L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        java.lang.Class<?> wildcardClass14 = jsonWriter13.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) '#');
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.beginArray();
        jsonWriter10.setHtmlSafe(true);
        jsonWriter10.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.name("hi!");
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
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        boolean boolean14 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.beginObject();
        boolean boolean5 = jsonWriter4.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter4.value("hi!");
        jsonWriter8.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
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
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter3.value("");
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter3.value((double) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter3.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter0.value(false);
        jsonWriter21.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter21);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonWriter9.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 10.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter17.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1L);
        jsonWriter8.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.value((double) (byte) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setHtmlSafe(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        jsonWriter14.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(10.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
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
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
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
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        jsonTreeWriter0.setHtmlSafe(true);
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
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
        jsonWriter16.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        jsonWriter12.setLenient(true);
        java.lang.Class<?> wildcardClass15 = jsonWriter12.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[true,false,null]]");
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
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("hi!");
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
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(0.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((long) (short) 10);
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
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0.0d);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value("hi!");
        boolean boolean16 = jsonWriter15.isHtmlSafe();
        jsonWriter15.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.value((double) (byte) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 100);
        jsonTreeWriter0.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) (byte) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value((double) (short) 10);
        jsonWriter5.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        boolean boolean8 = jsonWriter7.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(0.0d);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) 100);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(true);
        jsonWriter7.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        java.lang.Class<?> wildcardClass11 = jsonWriter10.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((double) 1.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value((java.lang.Number) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
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
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginObject();
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
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 1L);
        jsonTreeWriter0.close();
        jsonTreeWriter0.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(0.0d);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(true);
        jsonWriter16.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.value((long) (short) 0);
        jsonWriter14.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter14.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((double) (short) 1);
        jsonWriter12.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((-1L));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        jsonWriter12.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        boolean boolean10 = jsonWriter8.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.endObject();
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
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((double) (byte) 0);
        jsonWriter11.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) ' ');
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [{}]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 0L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) (short) 10);
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
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) (byte) -1);
        jsonWriter10.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value("");
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter13.value(true);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter13.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        jsonTreeWriter0.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) 100);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonElement12);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        jsonTreeWriter0.close();
        jsonTreeWriter0.flush();
        boolean boolean8 = jsonTreeWriter0.getSerializeNulls();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value("");
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter12.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        boolean boolean10 = jsonWriter8.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        boolean boolean17 = jsonWriter16.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
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
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 10L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.name("hi!");
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
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(100.0d);
        jsonWriter13.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.beginObject();
        jsonWriter4.flush();
        jsonWriter4.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 10L);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value((double) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        java.lang.Class<?> wildcardClass16 = jsonWriter15.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        jsonTreeWriter0.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        jsonWriter9.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginObject();
        boolean boolean15 = jsonWriter14.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        jsonTreeWriter0.close();
        jsonTreeWriter0.flush();
        java.lang.Class<?> wildcardClass8 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginArray();
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
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonWriter18.value((long) (short) -1);
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
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter20.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
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
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter20);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        jsonWriter9.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
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
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginObject();
        java.lang.Class<?> wildcardClass4 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
        java.lang.Class<?> wildcardClass13 = jsonElement12.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        boolean boolean11 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        java.lang.Class<?> wildcardClass9 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        jsonWriter8.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter8.beginObject();
        boolean boolean14 = jsonWriter13.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(1L);
        jsonTreeWriter0.setIndent("");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) 100);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(true);
        com.google.gson.JsonElement jsonElement8 = jsonTreeWriter0.get();
        jsonTreeWriter0.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonElement8);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        jsonWriter7.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.name("hi!");
        boolean boolean14 = jsonWriter11.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter11.value((long) (-1));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
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
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        jsonWriter11.setHtmlSafe(false);
        boolean boolean14 = jsonWriter11.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setHtmlSafe(true);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginObject();
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
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) (-1));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 100);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement13 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[]]");
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
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.endArray();
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
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setIndent("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(false);
        jsonWriter15.flush();
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter15.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
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
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) 100);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 1);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setIndent("");
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) 100L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        jsonWriter9.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter6.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(10.0d);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value(1.0d);
        java.lang.Class<?> wildcardClass10 = jsonWriter9.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        jsonWriter9.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '#');
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 10L);
        jsonWriter10.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        java.lang.Class<?> wildcardClass14 = jsonWriter13.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        jsonWriter14.close();
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
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) 10.0d);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter9.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        boolean boolean9 = jsonWriter8.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.value(0L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value(0.0d);
        jsonWriter5.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((java.lang.Number) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter16.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(100.0d);
        jsonWriter13.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 'a');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value((java.lang.Number) 100.0f);
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
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.beginObject();
        jsonWriter7.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.JsonElement jsonElement14 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement14);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (byte) 0);
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
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((java.lang.Number) (short) 0);
        java.lang.Class<?> wildcardClass17 = jsonWriter16.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endObject();
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
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        boolean boolean10 = jsonWriter9.isLenient();
        boolean boolean11 = jsonWriter9.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.flush();
        boolean boolean11 = jsonTreeWriter0.isLenient();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.ENUM_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        boolean boolean10 = jsonWriter9.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter11.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter1 = jsonTreeWriter0.beginObject();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) (-1.0f));
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
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) 1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((long) 'a');
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
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.google.gson.TypeAdapter<java.math.BigDecimal> bigDecimalTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.BIG_DECIMAL;
        java.lang.Class<?> wildcardClass1 = bigDecimalTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(bigDecimalTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        jsonTreeWriter0.close();
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(1L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 100.0f);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter17.value("hi!");
        jsonWriter17.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter8.value((long) (byte) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value((double) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter12.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        boolean boolean17 = jsonWriter16.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((long) (short) 100);
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
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        boolean boolean5 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
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
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonWriter2.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value("");
        jsonWriter5.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
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
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) (-1L));
        boolean boolean7 = jsonWriter4.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter4.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter4.nullValue();
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value((java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.name("hi!");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(0L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value((double) 1.0f);
        jsonWriter10.flush();
        jsonWriter10.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(false);
        java.lang.Class<?> wildcardClass13 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 100);
        jsonTreeWriter0.setSerializeNulls(false);
        boolean boolean12 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        boolean boolean13 = jsonTreeWriter0.getSerializeNulls();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
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
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter15.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        boolean boolean10 = jsonWriter9.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.beginObject();
        jsonWriter11.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter11.value((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        jsonWriter3.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter3.nullValue();
        jsonWriter3.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter3.value((double) 10.0f);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter3.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value((double) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((long) (byte) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value("");
        boolean boolean5 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.close();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value(false);
        boolean boolean14 = jsonWriter11.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value("");
        boolean boolean16 = jsonWriter15.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(true);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) ' ');
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endObject();
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
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        jsonTreeWriter0.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter14.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.value(false);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter15.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endArray();
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
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        jsonWriter5.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter5.value(0.0d);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter5.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter5.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value(1L);
        jsonWriter8.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        boolean boolean14 = jsonWriter13.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter13.name("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        jsonTreeWriter0.close();
        boolean boolean17 = jsonTreeWriter0.getSerializeNulls();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value((java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(true);
        jsonWriter8.close();
        jsonWriter8.setIndent("hi!");
        java.lang.Class<?> wildcardClass12 = jsonWriter8.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value((long) (byte) 100);
        boolean boolean11 = jsonWriter8.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) '#');
        boolean boolean11 = jsonWriter10.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        jsonWriter3.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter3.value((java.lang.Number) 10);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }
}

