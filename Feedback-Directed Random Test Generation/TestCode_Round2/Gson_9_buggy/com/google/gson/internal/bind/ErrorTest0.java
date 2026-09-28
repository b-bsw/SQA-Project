package com.google.gson.internal.bind;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonWriter2.nullValue();
        jsonWriter2.setIndent("");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter2.jsonValue("");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.name("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.beginObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.jsonValue("hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.jsonValue("");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.jsonValue("");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        jsonWriter7.setLenient(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.jsonValue("hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.beginObject();
        jsonTreeWriter0.flush();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.jsonValue("");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.jsonValue("hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value((double) (byte) -1);
        boolean boolean9 = jsonWriter6.getSerializeNulls();
        jsonWriter6.close();
        jsonWriter6.setHtmlSafe(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter6.jsonValue("");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        jsonTreeWriter0.setHtmlSafe(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        jsonTreeWriter0.close();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.beginObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((double) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.jsonValue("hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.jsonValue("hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((long) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter11.jsonValue("");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        jsonWriter5.setHtmlSafe(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter5.jsonValue("");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonWriter2.nullValue();
        jsonWriter2.setIndent("");
        boolean boolean6 = jsonWriter2.isHtmlSafe();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter2.jsonValue("");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value(1.0d);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter6.value((long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.jsonValue("hi!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter15.jsonValue("hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        boolean boolean7 = jsonTreeWriter0.getSerializeNulls();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.jsonValue("hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.flush();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonWriter2.nullValue();
        boolean boolean4 = jsonWriter3.isHtmlSafe();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter3.jsonValue("");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        boolean boolean3 = jsonWriter2.getSerializeNulls();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter2.jsonValue("hi!");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter1 = jsonTreeWriter0.beginObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonWriter1.jsonValue("");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        jsonWriter7.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter7.beginObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter7.jsonValue("");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.jsonValue("");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonWriter2.nullValue();
        java.lang.Number number4 = null;
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter2.value(number4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.jsonValue("");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement11 = jsonTreeWriter0.get();
        jsonTreeWriter0.close();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement4 = jsonTreeWriter0.get();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.jsonValue("");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        boolean boolean9 = jsonWriter8.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.jsonValue("");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        jsonTreeWriter0.close();
        jsonTreeWriter0.setIndent("hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.jsonValue("");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value("hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.jsonValue("");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.JsonElement jsonElement1 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((long) (short) 100);
        boolean boolean4 = jsonTreeWriter0.isLenient();
        java.lang.Number number5 = null;
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(number5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.jsonValue("");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.endObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.jsonValue("");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value("hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter5.jsonValue("");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter8.jsonValue("hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.beginObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter3.jsonValue("hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        jsonTreeWriter0.flush();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) (-1L));
        boolean boolean7 = jsonWriter4.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter4.value(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.jsonValue("");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) -1);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.jsonValue("hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        boolean boolean6 = jsonWriter5.isLenient();
        jsonWriter5.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter5.nullValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.jsonValue("hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.value("hi!");
        jsonWriter5.setHtmlSafe(false);
        jsonWriter5.setIndent("hi!");
        jsonWriter5.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter5.beginArray();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter5.jsonValue("");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) '4');
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.nullValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.jsonValue("");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter13.jsonValue("hi!");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value((long) (short) -1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.beginArray();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.jsonValue("");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter7.value((double) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter7.jsonValue("hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) (-1L));
        boolean boolean7 = jsonWriter4.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter4.jsonValue("");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (byte) 0);
        boolean boolean10 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.jsonValue("");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        boolean boolean9 = jsonWriter8.isHtmlSafe();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.jsonValue("");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.jsonValue("");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.setIndent("hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.jsonValue("");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.beginObject();
        boolean boolean5 = jsonWriter4.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.endObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter4.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter4.beginArray();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.jsonValue("hi!");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.jsonValue("");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonWriter20.jsonValue("hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter10.jsonValue("hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((long) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonWriter2.setHtmlSafe(false);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter2.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.endObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.jsonValue("hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.nullValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter5.jsonValue("hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endObject();
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.jsonValue("");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.jsonValue("");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setLenient(true);
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter9.jsonValue("hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) 100L);
        jsonTreeWriter0.flush();
        boolean boolean9 = jsonTreeWriter0.isLenient();
        com.google.gson.JsonElement jsonElement10 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((double) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jsonElement3 and jsonElement10", jsonElement3.equals(jsonElement10) ? jsonElement3.hashCode() == jsonElement10.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((java.lang.Number) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.jsonValue("hi!");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter13.jsonValue("");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.jsonValue("");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.jsonValue("");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value((java.lang.Number) 1L);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter10.nullValue();
        boolean boolean12 = jsonWriter10.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter10.jsonValue("");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        boolean boolean9 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((java.lang.Number) (-1.0d));
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) (-1.0f));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.jsonValue("");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginArray();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.jsonValue("hi!");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.value("");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.jsonValue("");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonWriter14.jsonValue("hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.endArray();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.jsonValue("hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter7.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter7.value((double) 0);
        boolean boolean11 = jsonWriter10.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.jsonValue("");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) 100);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.jsonValue("hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonWriter3.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter4.value((java.lang.Number) (-1L));
        boolean boolean7 = jsonWriter4.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter4.value(false);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter4.nullValue();
        boolean boolean11 = jsonWriter10.getSerializeNulls();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter10.jsonValue("");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(10L);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value(100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.jsonValue("hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.jsonValue("hi!");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.beginArray();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter19.jsonValue("");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonWriter2.nullValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonWriter2.jsonValue("hi!");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.beginObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.name("");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.jsonValue("");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 0L);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.jsonValue("hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.endArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter8.beginObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonWriter8.jsonValue("hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value((long) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.JsonElement jsonElement6 = jsonTreeWriter0.get();
        boolean boolean7 = jsonTreeWriter0.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter10.jsonValue("");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        boolean boolean6 = jsonTreeWriter0.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) 0);
        jsonTreeWriter0.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((java.lang.Number) 100.0f);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value((java.lang.Number) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter14.jsonValue("");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (short) 1);
        boolean boolean8 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.beginObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        jsonTreeWriter0.flush();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter17.jsonValue("hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter23 = jsonWriter21.jsonValue("");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
        com.google.gson.JsonElement jsonElement14 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.beginArray();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jsonElement3 and jsonElement14", jsonElement3.equals(jsonElement14) ? jsonElement3.hashCode() == jsonElement14.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter17.jsonValue("hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonWriter17.jsonValue("hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value((double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.jsonValue("hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.jsonValue("hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value("hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((double) '#');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.value(false);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.nullValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(1L);
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter5.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter5.nullValue();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.jsonValue("");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter17.jsonValue("hi!");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((long) (byte) 100);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter9.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.value((double) (short) -1);
        jsonWriter10.setIndent("");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter10.jsonValue("");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) (short) -1);
        jsonTreeWriter0.setIndent("hi!");
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter0.value(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(0L);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter0.value((double) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((java.lang.Number) (byte) 10);
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value((double) 0L);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setSerializeNulls(false);
        com.google.gson.JsonElement jsonElement13 = jsonTreeWriter0.get();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter3.jsonValue("");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter8.jsonValue("");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        jsonTreeWriter0.setHtmlSafe(false);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) (byte) 0);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value((long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.jsonValue("hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.setHtmlSafe(true);
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter0.value("hi!");
        jsonWriter9.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.beginObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter9.jsonValue("");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) 0);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value((java.lang.Number) 0);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter11.beginObject();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter11.jsonValue("");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.JsonElement jsonElement3 = jsonTreeWriter0.get();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value("");
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonWriter6.value((double) (byte) -1);
        boolean boolean9 = jsonWriter6.getSerializeNulls();
        jsonWriter6.setSerializeNulls(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter6.jsonValue("hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value((long) '#');
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.beginObject();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.endObject();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter13.jsonValue("");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value(0.0d);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.beginArray();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter5 = jsonTreeWriter0.value(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter0.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.value("");
        boolean boolean10 = jsonWriter9.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter9.value((java.lang.Number) 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.jsonValue("hi!");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter14.jsonValue("hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value(true);
        jsonTreeWriter0.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter0.value("hi!");
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter0.value(false);
        boolean boolean13 = jsonTreeWriter0.getSerializeNulls();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter0.jsonValue("");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter11.jsonValue("hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonWriter13.jsonValue("hi!");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        boolean boolean2 = jsonTreeWriter0.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter4 = jsonTreeWriter0.value(true);
        boolean boolean5 = jsonWriter4.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter4.value((java.lang.Number) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonWriter7.jsonValue("hi!");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter11.jsonValue("");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter13.jsonValue("");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(false);
        jsonTreeWriter0.flush();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter0.value((java.lang.Number) 10);
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter0.value((long) (byte) 0);
        boolean boolean9 = jsonTreeWriter0.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter0.jsonValue("hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonWriter17.jsonValue("hi!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        jsonTreeWriter0.flush();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter0.value(100.0d);
        jsonWriter3.setLenient(false);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonWriter3.value((java.lang.Number) (byte) -1);
        boolean boolean8 = jsonWriter3.isHtmlSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonWriter3.value(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter3.jsonValue("hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter0 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter2 = jsonTreeWriter0.value(100L);
        boolean boolean3 = jsonWriter2.isHtmlSafe();
        boolean boolean4 = jsonWriter2.isHtmlSafe();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonWriter2.jsonValue("hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonWriter13.jsonValue("hi!");
    }
}

