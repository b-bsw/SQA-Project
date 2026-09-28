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
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("");
        jsonWriter7.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
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
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endArray();
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
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value(false);
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("");
        jsonTreeWriter0.setLenient(false);
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 10L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value(false);
        jsonWriter9.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value((long) '4');
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        jsonWriter13.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.name("hi!");
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.name("");
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
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
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
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(10L);
        com.google.gson.JsonElement jsonElement13 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonElement13);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertNotNull(jsonWriter20);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        boolean boolean13 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endArray();
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
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.value((long) (short) -1);
        java.lang.Class<?> wildcardClass11 = jsonWriter6.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) 10.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endArray();
        jsonWriter7.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        com.google.gson.JsonElement jsonElement17 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonElement17);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) '4');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value((long) (byte) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("");
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value("");
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
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginObject();
        boolean boolean4 = jsonWriter3.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        java.lang.Class<?> wildcardClass17 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.beginArray();
        java.lang.Class<?> wildcardClass11 = jsonWriter10.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.endObject();
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
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '#');
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginArray();
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
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) 100L);
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        jsonWriter11.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter11.value((long) (short) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value("hi!");
        jsonWriter5.setHtmlSafe(false);
        jsonWriter5.setIndent("hi!");
        jsonWriter5.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.nullValue();
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
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value(false);
        boolean boolean16 = jsonWriter15.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        boolean boolean10 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.endArray();
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
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) 10.0d);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.name("");
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.beginObject();
        boolean boolean5 = jsonWriter3.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter3.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((long) 100);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter18.close();
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
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter15.endArray();
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
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        boolean boolean9 = jsonWriter8.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        jsonWriter5.setSerializeNulls(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter5.endObject();
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
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value(100.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) (-1.0f));
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.JsonElement jsonElement15 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonElement15);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.endObject();
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
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) (byte) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement9 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("hi!");
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
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
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        jsonWriter10.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        boolean boolean10 = jsonWriter9.getSerializeNulls();
        jsonWriter9.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
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
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(1.0d);
        jsonWriter9.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(false);
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
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((java.lang.Number) 10.0d);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value((java.lang.Number) (-1));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) 10.0d);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value((double) (-1));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) (byte) 10);
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.JsonElement jsonElement9 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) (short) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.beginObject();
        jsonWriter7.setLenient(false);
        boolean boolean11 = jsonWriter7.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.endArray();
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
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.isLenient();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        jsonWriter15.setLenient(true);
        jsonWriter15.setLenient(false);
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
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        boolean boolean6 = jsonWriter5.isLenient();
        boolean boolean7 = jsonWriter5.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter5.value((double) (byte) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.nullValue();
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
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10.0f);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        jsonWriter6.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((long) 'a');
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
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        jsonWriter18.setHtmlSafe(true);
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
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        boolean boolean17 = jsonWriter16.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
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
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((long) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        jsonWriter6.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        jsonTreeWriter0.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        java.lang.Class<?> wildcardClass6 = jsonWriter5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        jsonWriter6.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter6.value((java.lang.Number) 1L);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
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
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.name("hi!");
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
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter16.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter21);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        jsonWriter8.setHtmlSafe(true);
        boolean boolean11 = jsonWriter8.isHtmlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) (byte) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 10L);
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
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        jsonWriter8.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((java.lang.Number) 10.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter0.nullValue();
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
        org.junit.Assert.assertNotNull(jsonWriter21);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value((double) (byte) 1);
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
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        jsonWriter21.flush();
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
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter16.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endObject();
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
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(true);
        boolean boolean9 = jsonWriter6.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter15.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.value("hi!");
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
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(100.0d);
        jsonWriter5.flush();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((-1.0d));
        jsonWriter8.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        boolean boolean8 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(true);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 100L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 0L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 0L);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        boolean boolean11 = jsonWriter10.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) (short) 10);
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
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(100L);
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
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        jsonWriter9.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonWriter8.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
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
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        jsonWriter10.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.beginObject();
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
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        boolean boolean16 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        jsonWriter8.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(true);
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
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value(true);
        java.lang.Class<?> wildcardClass13 = jsonWriter12.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter10.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((long) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(0.0d);
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
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value("");
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
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        jsonWriter5.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter5.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter5.beginObject();
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
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        com.google.gson.stream.JsonWriter jsonWriter23 = jsonTreeWriter0.value("hi!");
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
        org.junit.Assert.assertNotNull(jsonWriter23);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) '#');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        boolean boolean10 = jsonWriter9.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(100L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        boolean boolean18 = jsonWriter17.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter17.endArray();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter6.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        jsonTreeWriter0.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        java.lang.Class<?> wildcardClass18 = jsonWriter17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.JsonElement jsonElement9 = jsonTreeWriter0.get();
        jsonTreeWriter0.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((-1L));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.nullValue();
        jsonWriter12.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter12.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        boolean boolean12 = jsonTreeWriter0.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (-1));
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
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean12 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter11.beginObject();
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
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value("hi!");
        jsonWriter5.setHtmlSafe(false);
        jsonWriter5.setIndent("hi!");
        jsonWriter5.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter5.value(true);
        boolean boolean16 = jsonWriter5.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        jsonTreeWriter0.close();
        boolean boolean9 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        boolean boolean11 = jsonTreeWriter0.getSerializeNulls();
        boolean boolean12 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 100.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) '#');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        jsonWriter13.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter15.nullValue();
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
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(true);
        jsonWriter7.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) 'a');
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((double) 1.0f);
        jsonWriter15.setSerializeNulls(false);
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
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 1);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.close();
        jsonTreeWriter0.setHtmlSafe(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((java.lang.Number) (short) 0);
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
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        boolean boolean10 = jsonWriter9.isLenient();
        java.lang.Class<?> wildcardClass11 = jsonWriter9.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        jsonWriter10.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[100]]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
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
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setIndent("hi!");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter7.value(1L);
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
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.beginObject();
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
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.endArray();
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
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value(100L);
        java.lang.Class<?> wildcardClass15 = jsonWriter12.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((long) (byte) 1);
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
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(false);
        jsonWriter6.close();
        jsonWriter6.setHtmlSafe(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
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
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        java.lang.Class<?> wildcardClass23 = jsonTreeWriter0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.close();
        jsonTreeWriter0.setHtmlSafe(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
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
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
        jsonWriter15.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value((long) 1);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter9.value((java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value("");
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
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
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
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        jsonTreeWriter0.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value((java.lang.Number) 0.0d);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter5.value((java.lang.Number) 0L);
        jsonWriter5.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        java.lang.Class<?> wildcardClass19 = jsonWriter18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) 1);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value((-1L));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginObject();
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
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        boolean boolean11 = jsonWriter10.isLenient();
        boolean boolean12 = jsonWriter10.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        jsonWriter12.flush();
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
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter1 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter1);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        jsonTreeWriter0.flush();
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
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.endArray();
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
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonElement12);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value((java.lang.Number) 100.0f);
        boolean boolean6 = jsonWriter3.isHtmlSafe();
        jsonWriter3.flush();
        boolean boolean8 = jsonWriter3.getSerializeNulls();
        jsonWriter3.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter3.value(10L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.beginObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((java.lang.Number) 0.0f);
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
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        jsonWriter10.setLenient(true);
        jsonWriter10.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        jsonWriter12.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '#');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (byte) 1);
        boolean boolean12 = jsonWriter11.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonWriter19.nullValue();
        jsonWriter20.close();
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
        org.junit.Assert.assertNotNull(jsonWriter20);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 0);
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        boolean boolean12 = jsonWriter11.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endArray();
        java.lang.Class<?> wildcardClass10 = jsonWriter9.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value("");
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
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter7.close();
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
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((-1L));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((long) (short) 1);
        jsonTreeWriter0.setSerializeNulls(true);
        jsonTreeWriter0.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        boolean boolean3 = jsonWriter2.getSerializeNulls();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter2.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        boolean boolean14 = jsonWriter13.isHtmlSafe();
        jsonWriter13.close();
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
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        boolean boolean8 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) 0.0f);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((java.lang.Number) (short) -1);
        jsonWriter12.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((long) (byte) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) 100L);
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
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginObject();
        jsonWriter9.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.endObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.close();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        boolean boolean20 = jsonWriter19.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonWriter19.value(100L);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jsonWriter22);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.JsonElement jsonElement9 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        jsonWriter8.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.value((long) (byte) 100);
        jsonWriter12.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter11.value((long) (short) -1);
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
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(true);
        jsonWriter8.close();
        jsonWriter8.setIndent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.value("hi!");
        boolean boolean13 = jsonWriter12.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        boolean boolean12 = jsonWriter11.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value((double) (short) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        jsonWriter5.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter5.value(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        java.lang.Number number16 = null;
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(number16);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value((java.lang.Number) (short) 100);
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
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        java.lang.Class<?> wildcardClass13 = jsonWriter12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter16.beginObject();
        jsonWriter17.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 0.0f);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(1.0d);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.nullValue();
        jsonWriter10.setIndent("hi!");
        jsonWriter10.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        jsonTreeWriter0.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.beginObject();
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
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) '#');
        boolean boolean11 = jsonTreeWriter0.isLenient();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        jsonTreeWriter0.close();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonElement12);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.beginObject();
        boolean boolean5 = jsonWriter4.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter4.value("hi!");
        jsonWriter8.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.beginObject();
        jsonWriter8.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginObject();
        jsonWriter12.setIndent("");
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
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter1 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter1);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        boolean boolean10 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("");
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
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(10.0d);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("");
        jsonWriter16.flush();
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
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        jsonTreeWriter0.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        jsonTreeWriter0.setSerializeNulls(true);
        java.lang.Class<?> wildcardClass23 = jsonTreeWriter0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        boolean boolean8 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        java.lang.Class<?> wildcardClass13 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.name("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter6.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0.0d);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        boolean boolean10 = jsonWriter9.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.name("");
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
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        jsonWriter8.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.JsonElement jsonElement9 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) (short) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        java.lang.Class<?> wildcardClass14 = jsonWriter13.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        jsonTreeWriter0.close();
        jsonTreeWriter0.flush();
        boolean boolean8 = jsonTreeWriter0.getSerializeNulls();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value((double) 1L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) 100L);
        jsonWriter12.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginArray();
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
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.close();
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
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) (short) 100);
        jsonWriter5.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.value((java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) ' ');
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        jsonTreeWriter0.flush();
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
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.beginArray();
        jsonWriter13.setSerializeNulls(true);
        jsonWriter13.setSerializeNulls(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter13.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter16.value((long) (byte) 100);
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
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) 1.0d);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
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
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.name("hi!");
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
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.value(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter7.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonWriter2.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter3.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(false);
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
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 0.0f);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(1.0d);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        jsonWriter13.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement8 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 0L);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) 10);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        java.lang.Number number8 = null;
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(number8);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(0L);
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
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
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
        jsonWriter12.setIndent("");
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
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value("");
        boolean boolean16 = jsonWriter15.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        java.lang.Number number6 = null;
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(number6);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.endObject();
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
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        java.lang.Class<?> wildcardClass16 = jsonWriter15.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
        boolean boolean15 = jsonWriter12.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter14.beginObject();
        jsonWriter14.flush();
        boolean boolean17 = jsonWriter14.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        jsonTreeWriter0.setLenient(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.close();
        java.lang.Class<?> wildcardClass15 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter16.value((long) ' ');
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
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value("");
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
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeWriter0.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
        jsonWriter15.setSerializeNulls(false);
        boolean boolean18 = jsonWriter15.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0.0d);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        boolean boolean11 = jsonWriter10.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((double) 1.0f);
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
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        boolean boolean4 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((double) 10L);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        java.lang.Class<?> wildcardClass10 = jsonWriter9.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("hi!");
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.name("");
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
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        boolean boolean6 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("hi!");
        jsonWriter16.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
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
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.value("");
        jsonWriter17.setSerializeNulls(true);
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
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((double) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) '4');
        jsonWriter5.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter16.value((double) 10L);
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
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) -1);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        jsonWriter14.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        jsonWriter13.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("hi!");
        jsonWriter16.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
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
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.value("hi!");
        jsonWriter20.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter20);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((java.lang.Number) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter11.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        boolean boolean5 = jsonWriter4.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter8.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value(true);
        boolean boolean13 = jsonWriter12.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value(true);
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
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
            com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value((-1L));
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
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter3.value(true);
        boolean boolean8 = jsonWriter3.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter3.value((double) 1.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
        jsonWriter3.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonWriter2.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter2.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.endObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter5.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
        com.google.gson.JsonElement jsonElement14 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((java.lang.Number) 0.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) 0L);
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
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.endObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1L);
        jsonWriter8.setLenient(false);
        jsonWriter8.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter8.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.value((long) '4');
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value("hi!");
        boolean boolean8 = jsonWriter5.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
        jsonTreeWriter0.setIndent("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value("hi!");
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
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("");
        boolean boolean10 = jsonWriter9.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
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
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(1L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value((long) (byte) 0);
        boolean boolean11 = jsonWriter8.isLenient();
        boolean boolean12 = jsonWriter8.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter8.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
        jsonWriter13.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter13.value((double) 100L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 1L);
        jsonWriter8.setLenient(false);
        jsonWriter8.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter16.name("");
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
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter13.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
        boolean boolean15 = jsonWriter13.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.endArray();
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
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
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement21 = jsonTreeWriter0.get();
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
        org.junit.Assert.assertNotNull(jsonWriter20);
        org.junit.Assert.assertNotNull(jsonElement21);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 0L);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(false);
        com.google.gson.JsonElement jsonElement13 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonElement13);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter19.name("hi!");
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
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        boolean boolean16 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter17.endObject();
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
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        jsonWriter10.setSerializeNulls(false);
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
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        jsonWriter6.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.value((java.lang.Number) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((-1L));
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("hi!");
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
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.name("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [{}]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        boolean boolean13 = jsonTreeWriter0.getSerializeNulls();
        jsonTreeWriter0.setIndent("hi!");
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
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("");
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
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
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
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
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
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.beginArray();
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
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
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
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 10);
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
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
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
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
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.name("");
        java.lang.Class<?> wildcardClass7 = jsonWriter6.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        jsonWriter8.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter13.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) 1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.name("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
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
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((java.lang.Number) (byte) 1);
        jsonWriter17.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.name("");
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
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value((long) 100);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
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
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        jsonWriter9.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter9.endObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((java.lang.Number) 10.0d);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value(false);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter10.value(true);
        boolean boolean15 = jsonWriter14.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.name("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((double) 1L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter11.endObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.name("");
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
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter23 = jsonWriter21.value("");
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
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertNotNull(jsonWriter20);
        org.junit.Assert.assertNotNull(jsonWriter21);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        boolean boolean4 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) ' ');
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((-1.0d));
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("");
        boolean boolean10 = jsonWriter9.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.value((java.lang.Number) 0L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 0.0f);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((java.lang.Number) (short) 100);
        boolean boolean14 = jsonWriter13.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter13.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginObject();
        boolean boolean7 = jsonWriter5.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
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
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        jsonTreeWriter0.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
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
        jsonWriter13.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter13.value((double) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonWriter13.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter20);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 100);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.beginObject();
        jsonWriter3.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 1L);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
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
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter14.value((double) 1L);
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
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
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
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value("");
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
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 0L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter9.value((java.lang.Number) (byte) 0);
        java.lang.Class<?> wildcardClass14 = jsonWriter13.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement5 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[[]], []]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
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
        java.lang.Class<?> wildcardClass20 = jsonWriter19.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.endObject();
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
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        jsonTreeWriter0.setIndent("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.value(true);
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
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) (byte) 1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter18.endArray();
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter19.value((java.lang.Number) (-1.0d));
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
        org.junit.Assert.assertNotNull(jsonWriter21);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        jsonTreeWriter0.setLenient(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonWriter9.flush();
        boolean boolean11 = jsonWriter9.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.beginArray();
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
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        jsonWriter13.setHtmlSafe(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter13.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
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
        boolean boolean16 = jsonWriter14.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        jsonWriter10.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter0.value("");
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
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        jsonWriter10.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.DOUBLE;
        java.lang.Class<?> wildcardClass1 = numberTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.beginObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
        jsonTreeWriter0.close();
        boolean boolean14 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        jsonTreeWriter0.setLenient(false);
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
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
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        com.google.gson.JsonElement jsonElement12 = jsonTreeWriter0.get();
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
        org.junit.Assert.assertNotNull(jsonElement12);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((-1L));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter12.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter12.value("");
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter12.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter12.value((java.lang.Number) 100);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement14 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[]]");
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
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        jsonTreeWriter0.setLenient(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        boolean boolean4 = jsonTreeWriter0.isLenient();
        java.lang.Number number5 = null;
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(number5);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.endArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement1);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (-1));
        jsonTreeWriter0.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("");
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            jsonWriter11.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Incomplete document");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.nullValue();
        boolean boolean12 = jsonWriter10.isLenient();
        java.lang.Class<?> wildcardClass13 = jsonWriter10.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 1);
        jsonWriter9.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter9.value((java.lang.Number) 1.0d);
        jsonWriter9.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
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
            com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.endArray();
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
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.value(false);
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter16.value((double) (short) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.value((long) (byte) -1);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        jsonTreeWriter0.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) '#');
        jsonWriter10.setIndent("hi!");
        jsonWriter10.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '#');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        jsonTreeWriter0.setIndent("");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        jsonTreeWriter0.flush();
        com.google.gson.JsonElement jsonElement7 = jsonTreeWriter0.get();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonElement7);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
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
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.nullValue();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
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
        java.lang.Class<?> wildcardClass13 = jsonWriter12.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("hi!");
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.name("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.name("hi!");
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
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement13 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.close();
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
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("hi!");
        jsonWriter11.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value(true);
        jsonWriter10.flush();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        jsonTreeWriter0.setSerializeNulls(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
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
        jsonWriter16.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(false);
        boolean boolean10 = jsonTreeWriter0.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
        jsonWriter16.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter16.value(true);
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
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.nullValue();
        java.lang.Class<?> wildcardClass11 = jsonWriter10.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.setIndent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.setIndent("hi!");
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) (short) 10);
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
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.endArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter5.value(true);
        jsonWriter8.setSerializeNulls(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        jsonTreeWriter0.close();
        jsonTreeWriter0.setHtmlSafe(true);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
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
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        jsonTreeWriter0.close();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement9 = jsonTreeWriter0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected one JSON element but was [[false]]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endObject();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        jsonWriter5.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter5.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
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
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter0.value(false);
        boolean boolean22 = jsonTreeWriter0.getSerializeNulls();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        java.lang.Class<?> wildcardClass14 = jsonTreeWriter0.getClass();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter20 = jsonWriter19.endArray();
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
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
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
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.value(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter4);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter17.beginArray();
        jsonWriter17.setIndent("");
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
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriter4);
        org.junit.Assert.assertNotNull(jsonWriter5);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonWriter7);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) 0L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.value("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter9.value((java.lang.Number) (byte) 0);
        jsonWriter13.flush();
        boolean boolean15 = jsonWriter13.isLenient();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 0);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (short) 0);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter15.beginArray();
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        jsonWriter11.setHtmlSafe(false);
        org.junit.Assert.assertNotNull(jsonWriter2);
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter11);
    }
}

