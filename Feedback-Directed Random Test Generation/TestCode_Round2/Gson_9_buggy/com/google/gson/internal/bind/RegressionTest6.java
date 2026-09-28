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
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 'a');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter12.name("hi!");
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
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) (-1L));
        boolean boolean7 = jsonWriter4.isLenient();
        boolean boolean8 = jsonWriter4.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.value((double) '#');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(0L);
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 1L);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter14.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value((double) 10);
        boolean boolean8 = jsonWriter7.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        boolean boolean10 = jsonTreeWriter0.getSerializeNulls();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.value((double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter16.endArray();
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
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (byte) 0);
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
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 100);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((double) 10L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginObject();
        jsonWriter13.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter13.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter17.value((java.lang.Number) (byte) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter7.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.value((long) (short) -1);
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.value((java.lang.Number) (short) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((-1L));
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
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter8.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
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
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        boolean boolean10 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 1);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) -1);
        jsonWriter9.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        jsonWriter5.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter5.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) (-1.0f));
        boolean boolean13 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.endObject();
        boolean boolean10 = jsonWriter9.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 100);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
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
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(1L);
        jsonTreeWriter0.setIndent("");
        jsonTreeWriter0.flush();
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
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter20);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter16.endObject();
        jsonWriter16.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonWriter7.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter7.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        boolean boolean9 = jsonWriter8.isLenient();
        jsonWriter8.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
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
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter4.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(true);
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
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value("");
        java.lang.Class<?> wildcardClass7 = jsonWriter6.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        jsonTreeWriter0.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        jsonWriter6.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter6.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.endObject();
        boolean boolean10 = jsonWriter8.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter14.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        jsonWriter7.close();
        java.lang.Class<?> wildcardClass9 = jsonWriter7.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.nullValue();
        boolean boolean8 = jsonWriter5.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[-1.0,\"hi!\"]]");
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
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter6.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter6.value((java.lang.Number) (-1.0d));
        jsonWriter14.flush();
        jsonWriter14.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("hi!");
        boolean boolean11 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) 10.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter14.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter14.value((long) (short) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonTreeWriter0.value("hi!");
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
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginObject();
        boolean boolean15 = jsonWriter14.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.endArray();
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
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 1);
        java.lang.Class<?> wildcardClass8 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter14.endObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        jsonTreeWriter0.close();
        jsonTreeWriter0.setHtmlSafe(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) 100);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) (-1L));
        com.google.gson.JsonElement jsonElement13 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonElement13);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter12.value((long) '#');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) 0);
        jsonWriter10.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter10.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (short) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        jsonWriter8.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
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
        jsonTreeWriter0.setLenient(true);
        jsonTreeWriter0.setIndent("");
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
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
        jsonWriter16.setLenient(false);
        jsonWriter16.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        jsonWriter18.close();
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
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        boolean boolean15 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
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
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter23 = jsonTreeWriter0.value("hi!");
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
        org.junit.Assert.assertNotNull(jsonWriter21);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter18.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter19.value((java.lang.Number) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter21);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter12.value("");
        jsonWriter12.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonWriter18.value((long) (short) 10);
        boolean boolean21 = jsonWriter18.isLenient();
        jsonWriter18.setIndent("hi!");
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
        org.junit.Assert.assertNotNull(jsonWriter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        boolean boolean18 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter20.beginObject();
        jsonWriter20.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonWriter20);
        org.junit.Assert.assertNotNull(jsonWriter21);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) (byte) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter19.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        java.lang.Class<?> wildcardClass11 = jsonWriter10.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value(false);
        boolean boolean13 = jsonWriter10.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((long) (short) 10);
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
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
        jsonTreeWriter0.setLenient(false);
        jsonTreeWriter0.setHtmlSafe(false);
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
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((java.lang.Number) 10.0d);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(1L);
        jsonTreeWriter0.setIndent("");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("");
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
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("hi!");
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
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter0.value(false);
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
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) (short) 10);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value((double) 1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((java.lang.Number) 10L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
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
        jsonTreeWriter0.setSerializeNulls(false);
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
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) 100);
        jsonWriter5.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        boolean boolean12 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.close();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (byte) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        jsonWriter16.close();
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
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value(false);
        boolean boolean16 = jsonWriter13.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        boolean boolean10 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value(0.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.endArray();
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
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((-1L));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        java.lang.Number number6 = null;
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(number6);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        jsonWriter3.setIndent("hi!");
        boolean boolean6 = jsonWriter3.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter3.value((double) 10L);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value((double) (byte) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        jsonWriter3.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter3.nullValue();
        jsonWriter3.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter3.value((double) 10.0f);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter3.value(10L);
        boolean boolean13 = jsonWriter3.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter3.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        jsonTreeWriter0.flush();
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
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 1);
        jsonWriter9.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter9.value((java.lang.Number) 1.0d);
        jsonWriter9.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        jsonWriter14.setHtmlSafe(true);
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
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.name("");
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
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.endObject();
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
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter16.value((double) (short) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        boolean boolean3 = jsonTreeWriter0.getSerializeNulls();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter17.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) 'a');
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) 0);
        boolean boolean13 = jsonWriter12.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        boolean boolean8 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value((double) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter3.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter3.beginArray();
        jsonWriter3.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginArray();
        jsonWriter3.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter3.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        jsonWriter11.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.beginObject();
        jsonWriter11.setHtmlSafe(false);
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter11.close();
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
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) 100L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value(false);
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
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
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
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonWriter8.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        jsonTreeWriter0.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        boolean boolean10 = jsonWriter9.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        java.lang.Class<?> wildcardClass12 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter14.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
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
        jsonTreeWriter0.close();
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
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) 1.0f);
        jsonTreeWriter0.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter17.beginArray();
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
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("");
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
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 10);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((double) (byte) 1);
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
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
        jsonTreeWriter0.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
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
        jsonWriter17.setSerializeNulls(true);
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
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value("");
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) 100L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) 1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((long) ' ');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        jsonWriter15.close();
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
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        jsonWriter10.close();
        jsonWriter10.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.name("");
        jsonWriter8.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value((java.lang.Number) 100.0d);
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
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(0L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((-1.0d));
        jsonTreeWriter0.close();
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
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        boolean boolean20 = jsonWriter19.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        jsonWriter14.setIndent("");
        jsonWriter14.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginObject();
        jsonWriter11.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        boolean boolean9 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(0L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.name("");
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
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        boolean boolean7 = jsonTreeWriter0.isHtmlSafe();
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
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value("hi!");
        jsonWriter7.setSerializeNulls(true);
        jsonWriter7.flush();
        jsonWriter7.setLenient(false);
        jsonWriter7.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginObject();
        jsonWriter8.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setLenient(true);
        jsonTreeWriter0.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.name("hi!");
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        boolean boolean8 = jsonTreeWriter0.getSerializeNulls();
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
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value("");
        jsonWriter11.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        boolean boolean11 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginArray();
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
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        boolean boolean3 = jsonTreeWriter0.getSerializeNulls();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value((long) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.close();
        jsonTreeWriter0.setIndent("hi!");
        boolean boolean14 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        jsonWriter6.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter6.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter6.value((java.lang.Number) (-1.0d));
        jsonWriter14.flush();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter14.value((double) 0L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[]]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((java.lang.Number) 0.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((double) (byte) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.close();
        java.lang.Class<?> wildcardClass10 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        jsonTreeWriter0.close();
        java.lang.Number number13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(number13);
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
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.beginObject();
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
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(1L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
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
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("");
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
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        boolean boolean10 = jsonWriter9.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("hi!");
        boolean boolean11 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
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
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.value((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        boolean boolean6 = jsonWriter5.isLenient();
        jsonWriter5.setSerializeNulls(true);
        boolean boolean9 = jsonWriter5.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
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
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value((double) 10);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter7.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        boolean boolean9 = jsonWriter8.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((double) (short) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 0);
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
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonTreeWriter0.value(10L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter23 = jsonTreeWriter0.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter22);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("");
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value("");
        boolean boolean19 = jsonWriter18.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setHtmlSafe(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
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
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) (byte) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
        com.google.gson.JsonElement jsonElement14 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonElement14);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(10L);
        jsonTreeWriter0.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        jsonWriter7.setLenient(true);
        jsonWriter7.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value(false);
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
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) (-1.0f));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) 'a');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        jsonTreeWriter0.setSerializeNulls(true);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        jsonTreeWriter0.flush();
        boolean boolean9 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
        jsonWriter13.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        java.lang.Class<?> wildcardClass4 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.name("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginObject();
        jsonWriter13.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) 1);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.value((double) (short) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) (short) 10);
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
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        jsonWriter14.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter14.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(true);
        jsonWriter7.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter17.value(10.0d);
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter17.value("");
        boolean boolean22 = jsonWriter21.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        boolean boolean7 = jsonTreeWriter0.isLenient();
        boolean boolean8 = jsonTreeWriter0.getSerializeNulls();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
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
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginObject();
        boolean boolean6 = jsonWriter5.isLenient();
        jsonWriter5.setLenient(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 1);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) (-1L));
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        jsonWriter8.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter8.beginObject();
        jsonWriter13.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
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
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.endArray();
        java.lang.Class<?> wildcardClass21 = jsonTreeWriter0.getClass();
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
        org.junit.Assert.assertNotNull(jsonWriter20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 1L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        jsonWriter8.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.value((long) (-1));
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter7.value((double) 10);
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
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((java.lang.Number) 100.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((java.lang.Number) (-1.0f));
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((long) 0);
        java.lang.Class<?> wildcardClass18 = jsonWriter17.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (-1.0d));
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
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.JsonElement jsonElement14 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonElement14);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value("");
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        boolean boolean10 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        boolean boolean13 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        jsonWriter10.setHtmlSafe(false);
        boolean boolean13 = jsonWriter10.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) ' ');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        jsonTreeWriter0.flush();
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
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement8 = jsonTreeWriter0.get();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonElement8);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
        boolean boolean13 = jsonTreeWriter0.isHtmlSafe();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 10);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
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
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) 0L);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((double) (short) 10);
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
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
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
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
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
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        java.lang.Number number6 = null;
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(number6);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        jsonWriter6.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter6.endObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((java.lang.Number) (short) 100);
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
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.value((double) (byte) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertNotNull(jsonWriter20);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.endObject();
        jsonWriter4.flush();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.nullValue();
        jsonWriter9.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter16.value((java.lang.Number) 100L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.beginObject();
        boolean boolean12 = jsonWriter11.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter11.value((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (byte) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
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
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter16.value((double) 10);
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
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        boolean boolean10 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(10.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 100.0f);
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
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        boolean boolean12 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((double) 'a');
        boolean boolean18 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((-1L));
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) '4');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
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
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginObject();
        jsonWriter9.setIndent("hi!");
        jsonWriter9.setLenient(true);
        jsonWriter9.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(10L);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (-1.0d));
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) '#');
        boolean boolean11 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(10L);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        java.lang.Number number8 = null;
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(number8);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value("hi!");
        jsonWriter11.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) (byte) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
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
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((double) 'a');
        boolean boolean18 = jsonWriter17.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((java.lang.Number) 10.0f);
        jsonTreeWriter0.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        boolean boolean3 = jsonWriter2.isHtmlSafe();
        boolean boolean4 = jsonWriter2.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
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
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
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
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '#');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) 10L);
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
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter15.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((long) (short) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        jsonWriter3.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter3.value((java.lang.Number) (byte) -1);
        boolean boolean8 = jsonWriter3.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter3.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((double) 10);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginObject();
        boolean boolean7 = jsonWriter5.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) 1L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (-1.0d));
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(10.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value("");
        jsonWriter17.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (byte) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonTreeWriter0.value(10L);
        jsonTreeWriter0.flush();
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
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 0);
        boolean boolean10 = jsonTreeWriter0.isLenient();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
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
        jsonTreeWriter0.setHtmlSafe(false);
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
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value((java.lang.Number) (byte) 100);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
        java.lang.Class<?> wildcardClass14 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.setIndent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endObject();
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
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter16.endArray();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter16.value((long) '#');
        jsonWriter16.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(0L);
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        jsonWriter10.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        jsonWriter6.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter6.beginObject();
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
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
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
        jsonWriter14.setHtmlSafe(false);
        jsonWriter14.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
        jsonTreeWriter0.close();
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
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) -1);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.close();
        jsonTreeWriter0.setHtmlSafe(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((-1.0d));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) 1L);
        boolean boolean13 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.name("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) ' ');
        jsonWriter12.setHtmlSafe(true);
        jsonWriter12.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter12.endArray();
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
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        jsonWriter5.setLenient(true);
        jsonWriter5.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
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
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
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
        jsonWriter14.flush();
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
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) 100);
        boolean boolean14 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        boolean boolean10 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) (short) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 0L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter9.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter9.value(true);
        boolean boolean16 = jsonWriter15.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.value((long) ' ');
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
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
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
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 1);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonWriter8.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("");
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }
}

