package com.google.gson.internal.bind;

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
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(100.0d);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((long) 10);
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
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
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
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endArray();
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
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter7.value((double) 0);
        boolean boolean11 = jsonWriter10.isLenient();
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.value(100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.name("");
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) (-1L));
        boolean boolean7 = jsonWriter4.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter4.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter4.nullValue();
        jsonWriter10.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        java.lang.Class<?> wildcardClass12 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
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
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        jsonWriter9.setHtmlSafe(true);
        jsonWriter9.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[-1.0]]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 10L);
        boolean boolean10 = jsonWriter9.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endObject();
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
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value((java.lang.Number) (byte) -1);
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.name("");
        jsonWriter11.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value((java.lang.Number) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 0.0f);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((double) 0.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("");
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
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        boolean boolean10 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        boolean boolean12 = jsonWriter11.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
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
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement13);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(true);
        jsonWriter7.setHtmlSafe(true);
        jsonWriter7.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        boolean boolean12 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
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
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((double) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginArray();
        jsonWriter12.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value("");
        jsonWriter10.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        jsonWriter10.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter6.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement4);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value("hi!");
        jsonWriter5.setHtmlSafe(false);
        jsonWriter5.setIndent("hi!");
        jsonWriter5.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter5.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 100L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
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
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) (byte) 100);
        boolean boolean12 = jsonWriter11.getSerializeNulls();
        java.lang.Class<?> wildcardClass13 = jsonWriter11.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        boolean boolean13 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter6.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement14 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[-1.0,\"hi!\",null]]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value("");
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter11.value((long) 'a');
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter11.value((-1L));
        boolean boolean18 = jsonWriter17.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter17.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter16.value("hi!");
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
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
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
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.gson.TypeAdapter<java.math.BigInteger> bigIntegerTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.BIG_INTEGER;
        java.lang.Class<?> wildcardClass1 = bigIntegerTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(bigIntegerTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        jsonWriter10.setIndent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.endObject();
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
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 100);
        jsonWriter7.setLenient(true);
        java.lang.Class<?> wildcardClass10 = jsonWriter7.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value((java.lang.Number) 100.0f);
        boolean boolean6 = jsonWriter3.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter3.endArray();
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
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.nullValue();
        jsonWriter11.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.close();
        jsonTreeWriter0.setIndent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("hi!");
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
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.nullValue();
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
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement15 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[-1.0,32,[]], []]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("hi!");
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
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endArray();
        boolean boolean8 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter10.value((long) 'a');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endObject();
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
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((double) 10L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.close();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonWriter2.nullValue();
        java.lang.Number number4 = null;
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter2.value(number4);
        java.lang.Number number6 = null;
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value(number6);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        jsonTreeWriter0.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) (-1.0f));
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
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) 10.0d);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonElement14);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.JsonElement jsonElement9 = jsonTreeWriter0.get();
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter6.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
        jsonWriter13.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        jsonTreeWriter0.setLenient(false);
        jsonTreeWriter0.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endArray();
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
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) (-1L));
        boolean boolean12 = jsonWriter9.isHtmlSafe();
        jsonWriter9.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter9.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.value(0L);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        jsonWriter3.setLenient(false);
        jsonWriter3.flush();
        jsonWriter3.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter3.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter3);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter3.value("");
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter3.value((double) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value("");
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 1);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        jsonTreeWriter0.close();
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
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        boolean boolean10 = jsonWriter9.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.name("hi!");
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
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1L);
        java.lang.Class<?> wildcardClass9 = jsonWriter8.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.beginArray();
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
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        jsonTreeWriter0.close();
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter16.value((java.lang.Number) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter20 = jsonWriter16.name("hi!");
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
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        boolean boolean11 = jsonWriter10.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginArray();
        jsonWriter14.setIndent("hi!");
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
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter7.value((double) 10);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((-1.0d));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endArray();
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
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        jsonTreeWriter0.setLenient(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setIndent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter15.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) 100);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) 100L);
        jsonWriter14.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter6.nullValue();
        boolean boolean12 = jsonWriter11.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter11.value((double) 0L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 100.0f);
        jsonWriter6.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        jsonWriter15.setLenient(false);
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
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.name("");
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
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
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
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) (-1L));
        boolean boolean7 = jsonWriter4.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter4.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        boolean boolean5 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        jsonWriter11.setSerializeNulls(true);
        java.lang.Number number14 = null;
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter11.value(number14);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("");
        jsonTreeWriter0.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        jsonWriter5.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter5.beginObject();
        jsonWriter5.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter5.value(true);
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement17 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [{}]");
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
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.close();
        boolean boolean13 = jsonTreeWriter0.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginObject();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) 100);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 1L);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) 10.0d);
        jsonWriter11.setHtmlSafe(false);
        jsonWriter11.setIndent("hi!");
        jsonWriter11.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter11.value((java.lang.Number) 100L);
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter11.value((java.lang.Number) (byte) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter21);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(10.0d);
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '#');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        java.lang.Class<?> wildcardClass10 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        boolean boolean4 = jsonTreeWriter0.isLenient();
        java.lang.Number number5 = null;
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(number5);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        jsonWriter8.setLenient(false);
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((long) 1);
        java.lang.Class<?> wildcardClass12 = jsonWriter9.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter7.value((double) 0);
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement8 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[35]]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endArray();
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
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        jsonWriter6.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonTreeWriter0.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter23 = jsonWriter22.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter20);
        org.junit.Assert.assertNotNull(jsonWriter22);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) (byte) 1);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((long) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) 0.0f);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((long) '4');
        boolean boolean18 = jsonWriter17.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(0.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.name("");
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
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((-1.0d));
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
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginObject();
        boolean boolean7 = jsonWriter6.isLenient();
        jsonWriter6.setIndent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
            jsonTreeWriter0.close();
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
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 100);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter13.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter9.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter14.beginArray();
        jsonWriter15.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        jsonWriter10.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        boolean boolean15 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(false);
        boolean boolean18 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        jsonTreeWriter0.setSerializeNulls(true);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.endObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(true);
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
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        jsonWriter9.setHtmlSafe(true);
        jsonWriter9.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter9.value((long) 10);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter9.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter16.endObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (short) -1);
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
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endObject();
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
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        boolean boolean16 = jsonWriter15.getSerializeNulls();
        jsonWriter15.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) 0L);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        jsonWriter15.setSerializeNulls(true);
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
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(0.0d);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        boolean boolean15 = jsonWriter14.getSerializeNulls();
        jsonWriter14.flush();
        boolean boolean17 = jsonWriter14.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((double) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 10L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value((double) 1.0f);
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
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value(1L);
        boolean boolean11 = jsonWriter10.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.name("");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        jsonWriter7.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.beginObject();
        jsonWriter11.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value(true);
        boolean boolean5 = jsonWriter4.getSerializeNulls();
        jsonWriter4.setSerializeNulls(true);
        java.lang.Class<?> wildcardClass8 = jsonWriter4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setSerializeNulls(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("");
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
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter15.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10.0f);
        jsonWriter5.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter5.value((long) (byte) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter6.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement12);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter16.value((-1L));
        jsonWriter16.setIndent("hi!");
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
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.beginObject();
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
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        java.lang.Class<?> wildcardClass12 = jsonWriter11.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) 100);
        boolean boolean12 = jsonWriter9.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter9.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        boolean boolean13 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
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
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) 0);
        boolean boolean13 = jsonWriter12.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        boolean boolean9 = jsonWriter8.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.value((java.lang.Number) (byte) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        boolean boolean15 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        boolean boolean18 = jsonWriter17.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((long) ' ');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        jsonWriter5.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter5.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((-1L));
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) 100);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginObject();
        boolean boolean7 = jsonWriter6.isLenient();
        jsonWriter6.setIndent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(true);
        boolean boolean13 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((long) '#');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        boolean boolean7 = jsonWriter6.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) ' ');
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
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(true);
        boolean boolean9 = jsonWriter8.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.value("");
        boolean boolean12 = jsonWriter11.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        jsonTreeWriter0.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.name("hi!");
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
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(10.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value(1L);
        boolean boolean13 = jsonWriter12.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 0.0f);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value((double) 1);
        boolean boolean11 = jsonWriter8.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginObject();
        boolean boolean7 = jsonWriter6.isLenient();
        jsonWriter6.setIndent("hi!");
        jsonWriter6.flush();
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter11.value(0L);
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
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter7.endObject();
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
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(0L);
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
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value("hi!");
        jsonWriter11.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        jsonWriter15.setHtmlSafe(true);
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
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.nullValue();
        boolean boolean11 = jsonWriter9.isHtmlSafe();
        boolean boolean12 = jsonWriter9.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) (-1));
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
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        jsonTreeWriter0.close();
        jsonTreeWriter0.flush();
        boolean boolean8 = jsonTreeWriter0.getSerializeNulls();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value(0L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value((long) (byte) 0);
        boolean boolean11 = jsonWriter8.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter8.value((long) 100);
        jsonWriter8.setIndent("hi!");
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
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
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
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) 10.0d);
        boolean boolean16 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(10.0d);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginObject();
        jsonWriter8.setIndent("");
        jsonWriter8.setLenient(true);
        jsonWriter8.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter8.value("hi!");
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
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
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
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter1 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter1);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginObject();
        boolean boolean10 = jsonWriter9.getSerializeNulls();
        jsonWriter9.setHtmlSafe(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter9.value((double) 1);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1L));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.endArray();
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
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.close();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
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
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value((double) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value((long) (byte) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        jsonTreeWriter0.close();
        jsonTreeWriter0.setHtmlSafe(true);
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
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 0.0f);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginObject();
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
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        boolean boolean15 = jsonWriter14.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value("hi!");
        boolean boolean11 = jsonWriter10.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) 10);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.value(0L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value((-1.0d));
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
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        boolean boolean4 = jsonTreeWriter0.isLenient();
        java.lang.Number number5 = null;
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(number5);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value((java.lang.Number) 10.0f);
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
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
        boolean boolean16 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.nullValue();
        boolean boolean18 = jsonWriter17.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(0L);
        jsonTreeWriter0.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value((java.lang.Number) 100.0f);
        boolean boolean6 = jsonWriter3.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter3.value("");
        java.lang.Class<?> wildcardClass9 = jsonWriter8.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value((java.lang.Number) 0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("");
        boolean boolean10 = jsonWriter9.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        boolean boolean8 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) (byte) 100);
        boolean boolean11 = jsonWriter10.isHtmlSafe();
        jsonWriter10.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter10.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setLenient(true);
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.setIndent("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.endObject();
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
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) -1);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
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
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter7.beginArray();
        jsonWriter12.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        boolean boolean15 = jsonWriter14.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        boolean boolean9 = jsonWriter8.getSerializeNulls();
        boolean boolean10 = jsonWriter8.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonWriter7.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        java.lang.Number number7 = null;
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(number7);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) ' ');
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginObject();
        jsonWriter11.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        jsonWriter2.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter2.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.name("");
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
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter9.value(true);
        jsonWriter9.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        jsonWriter10.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
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
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) 0);
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
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) -1);
        jsonWriter9.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((-1L));
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter14.endObject();
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
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        java.lang.Class<?> wildcardClass12 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.name("hi!");
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
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.name("");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value("");
        boolean boolean19 = jsonWriter18.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("");
        boolean boolean8 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 1);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.value((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter10.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("hi!");
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
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter16.beginObject();
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
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value((double) (byte) -1);
        boolean boolean9 = jsonWriter6.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter6.value(true);
        java.lang.Class<?> wildcardClass12 = jsonWriter11.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endArray();
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
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setIndent("");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter18.endArray();
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
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter13.name("hi!");
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
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(0L);
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
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.name("");
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
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.beginArray();
        jsonWriter10.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        jsonWriter9.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value((java.lang.Number) 100.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter17.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("hi!");
        boolean boolean10 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(0.0d);
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
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endArray();
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
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((double) (byte) 0);
        boolean boolean12 = jsonWriter11.isLenient();
        jsonWriter11.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginObject();
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
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((double) (-1));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value((long) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        boolean boolean18 = jsonWriter17.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.value((long) (short) 10);
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
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginObject();
        jsonWriter11.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
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
        jsonWriter15.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.endArray();
        boolean boolean20 = jsonWriter19.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        jsonWriter6.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter6.endObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter6.value((double) (short) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        boolean boolean8 = jsonTreeWriter0.getSerializeNulls();
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonWriter6.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter16.value((java.lang.Number) 0);
        boolean boolean19 = jsonWriter16.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.name("hi!");
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) 100);
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
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
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
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.beginObject();
        jsonWriter14.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.value((long) (short) -1);
        boolean boolean18 = jsonWriter15.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 0);
        com.google.gson.JsonElement jsonElement8 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonElement8);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((double) 10L);
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
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 100);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("");
        java.lang.Class<?> wildcardClass10 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        boolean boolean14 = jsonWriter13.isHtmlSafe();
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
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter9.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter23 = jsonWriter9.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonWriter21);
        org.junit.Assert.assertNotNull(jsonWriter23);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1L);
        jsonWriter8.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        jsonTreeWriter0.close();
        boolean boolean18 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        jsonTreeWriter0.flush();
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
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) ' ');
        jsonWriter13.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(100L);
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
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) 0L);
        jsonWriter12.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        boolean boolean8 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
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
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
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
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value(true);
        com.google.gson.JsonElement jsonElement19 = jsonTreeWriter0.get();
        java.lang.Class<?> wildcardClass20 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((long) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(false);
        jsonWriter17.close();
        boolean boolean19 = jsonWriter17.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter0.value(false);
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
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        jsonWriter6.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter6.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [{}]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("hi!");
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
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value("");
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter11.value((long) 'a');
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter11.value((-1L));
        boolean boolean18 = jsonWriter17.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonWriter17.value((long) (byte) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jsonWriter20);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        jsonTreeWriter0.flush();
        boolean boolean9 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((java.lang.Number) (-1L));
        java.lang.Class<?> wildcardClass14 = jsonWriter11.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) (short) 1);
        boolean boolean12 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) 10.0f);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((double) ' ');
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
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        jsonWriter17.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((long) (byte) 1);
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
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) 100);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 100);
        jsonWriter7.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter7.nullValue();
        boolean boolean11 = jsonWriter10.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        java.lang.Class<?> wildcardClass18 = jsonWriter17.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter17.value((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter17.name("hi!");
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
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement13);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonWriter2.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value("");
        boolean boolean6 = jsonWriter3.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter6.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter6.value((java.lang.Number) (-1.0d));
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter14.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        jsonTreeWriter0.setHtmlSafe(false);
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
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endObject();
        boolean boolean14 = jsonWriter13.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
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
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.endArray();
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
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        boolean boolean11 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter17.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.name("hi!");
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
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 1);
        boolean boolean8 = jsonWriter7.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter7.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.JsonElement jsonElement9 = jsonTreeWriter0.get();
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("");
        jsonWriter16.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter16.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter19.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter21);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (byte) 10);
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
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter10.value((double) (-1L));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 10L);
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
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [\"closed\"]");
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
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        jsonTreeWriter0.setSerializeNulls(false);
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
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        java.lang.Number number17 = null;
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value(number17);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
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
        boolean boolean18 = jsonWriter17.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((java.lang.Number) 10.0f);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.name("");
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
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter17.value((java.lang.Number) 0);
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
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(1L);
        jsonTreeWriter0.setIndent("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endObject();
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
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.name("");
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
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) 10.0d);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.value((long) (short) -1);
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
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement13 = jsonTreeWriter0.get();
        jsonTreeWriter0.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonElement13);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        boolean boolean10 = jsonWriter8.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) 1);
        jsonTreeWriter0.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) 10.0d);
        boolean boolean14 = jsonTreeWriter0.isLenient();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter6.value(false);
        boolean boolean13 = jsonWriter12.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value((java.lang.Number) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter0.name("");
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
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(0L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        jsonWriter13.setSerializeNulls(false);
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
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) ' ');
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[]]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        jsonWriter11.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        jsonWriter5.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter5.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        boolean boolean8 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter19.value(false);
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
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (-1.0f));
        boolean boolean12 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter6.value(false);
        jsonWriter6.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        jsonWriter15.setHtmlSafe(true);
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
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonWriter2.nullValue();
        jsonWriter2.setIndent("");
        jsonWriter2.setLenient(false);
        boolean boolean8 = jsonWriter2.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter2.value((java.lang.Number) 1.0f);
        boolean boolean11 = jsonWriter2.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((double) 100);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter17.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(10.0d);
        boolean boolean14 = jsonWriter13.getSerializeNulls();
        jsonWriter13.close();
        jsonWriter13.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        jsonWriter15.setIndent("hi!");
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
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(true);
        java.lang.Number number8 = null;
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(number8);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        boolean boolean12 = jsonTreeWriter0.isLenient();
        jsonTreeWriter0.setSerializeNulls(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        boolean boolean12 = jsonTreeWriter0.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter14.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        boolean boolean17 = jsonWriter16.getSerializeNulls();
        jsonWriter16.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) 1);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(100.0d);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
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
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.value((double) 0.0f);
        boolean boolean18 = jsonWriter15.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setIndent("hi!");
        java.lang.Class<?> wildcardClass13 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((-1.0d));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.endObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) (byte) 100);
        java.lang.Number number15 = null;
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(number15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter16.name("hi!");
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
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        jsonWriter6.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) '4');
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
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) (-1L));
        jsonWriter6.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter6.nullValue();
        jsonWriter9.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
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
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement16 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[true]]");
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
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) (-1.0d));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(10.0d);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((double) 'a');
        boolean boolean17 = jsonWriter16.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonWriter2.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter2.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter2.value(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        jsonTreeWriter0.setSerializeNulls(true);
        jsonTreeWriter0.close();
        jsonTreeWriter0.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) (byte) 10);
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
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
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
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) -1);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setIndent("");
        com.google.gson.JsonElement jsonElement13 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((long) ' ');
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.beginArray();
        boolean boolean16 = jsonWriter13.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter12.value((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(0.0d);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean6 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginArray();
        jsonWriter13.setIndent("hi!");
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
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        java.lang.Class<?> wildcardClass12 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((java.lang.Number) 10.0f);
        jsonWriter17.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter9.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter23 = jsonWriter9.value((java.lang.Number) (byte) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonWriter21);
        org.junit.Assert.assertNotNull(jsonWriter23);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.value((long) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.name("hi!");
        jsonWriter6.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(1L);
        jsonTreeWriter0.setIndent("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endObject();
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
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) 1.0f);
        boolean boolean14 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.value((double) (short) 0);
        boolean boolean11 = jsonWriter6.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
        jsonTreeWriter0.setSerializeNulls(false);
        boolean boolean16 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter15.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) (-1));
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (short) 1);
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
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setSerializeNulls(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter3);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((double) (byte) 0);
        boolean boolean12 = jsonWriter11.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }
}

