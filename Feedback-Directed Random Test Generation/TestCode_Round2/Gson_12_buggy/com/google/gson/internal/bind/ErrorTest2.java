package com.google.gson.internal.bind;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

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
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.skipValue();
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.beginObject();
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        double double21 = jsonTreeReader1.nextDouble();
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str8 = jsonTreeReader1.nextName();
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = jsonTreeReader1.nextString();
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.skipValue();
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        java.lang.String str5 = jsonTreeReader1.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endArray();
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        double double6 = jsonTreeReader1.nextDouble();
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        int int14 = jsonTreeReader1.nextInt();
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        java.lang.String str9 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.promoteNameToValue();
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        int int7 = jsonTreeReader1.nextInt();
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str18 = jsonTreeReader1.nextString();
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonToken jsonToken8 = jsonTreeReader1.peek();
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        boolean boolean10 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean11 = jsonTreeReader1.nextBoolean();
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endObject();
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.nextNull();
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.toString();
        boolean boolean8 = jsonTreeReader1.isLenient();
        boolean boolean9 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = jsonTreeReader1.nextName();
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        double double10 = jsonTreeReader1.nextDouble();
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonToken jsonToken16 = jsonTreeReader1.peek();
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonToken jsonToken19 = jsonTreeReader1.peek();
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonToken jsonToken17 = jsonTreeReader1.peek();
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        long long7 = jsonTreeReader1.nextLong();
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        java.lang.String str4 = jsonTreeReader1.toString();
        boolean boolean5 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endArray();
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonToken jsonToken19 = jsonTreeReader1.peek();
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.beginArray();
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean7 = jsonTreeReader1.nextBoolean();
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean10 = jsonTreeReader1.nextBoolean();
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str14 = jsonTreeReader1.nextName();
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.promoteNameToValue();
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endArray();
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endObject();
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.beginArray();
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.nextNull();
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endArray();
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endObject();
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.toString();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endArray();
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        boolean boolean11 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonToken jsonToken12 = jsonTreeReader1.peek();
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.toString();
        boolean boolean8 = jsonTreeReader1.isLenient();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean12 = jsonTreeReader1.hasNext();
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        long long19 = jsonTreeReader1.nextLong();
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
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
        boolean boolean14 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonToken jsonToken15 = jsonTreeReader1.peek();
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        long long9 = jsonTreeReader1.nextLong();
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean11 = jsonTreeReader1.hasNext();
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str11 = jsonTreeReader1.nextString();
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str19 = jsonTreeReader1.nextString();
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.beginObject();
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endObject();
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        long long18 = jsonTreeReader1.nextLong();
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.beginArray();
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endObject();
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.beginArray();
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        double double9 = jsonTreeReader1.nextDouble();
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        java.lang.String str8 = jsonTreeReader1.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.nextNull();
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.promoteNameToValue();
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean8 = jsonTreeReader1.nextBoolean();
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = jsonTreeReader1.nextName();
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.toString();
        java.lang.String str9 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str10 = jsonTreeReader1.nextString();
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.String str11 = jsonTreeReader1.toString();
        java.lang.String str12 = jsonTreeReader1.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        long long13 = jsonTreeReader1.nextLong();
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.beginArray();
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.promoteNameToValue();
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        double double14 = jsonTreeReader1.nextDouble();
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean9 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endArray();
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonToken jsonToken6 = jsonTreeReader1.peek();
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endArray();
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
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
        boolean boolean12 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean13 = jsonTreeReader1.hasNext();
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        java.lang.String str8 = jsonTreeReader1.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.beginObject();
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean6 = jsonTreeReader1.nextBoolean();
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonToken jsonToken20 = jsonTreeReader1.peek();
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        double double16 = jsonTreeReader1.nextDouble();
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        java.lang.String str13 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        long long14 = jsonTreeReader1.nextLong();
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        double double7 = jsonTreeReader1.nextDouble();
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        boolean boolean5 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.nextNull();
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str6 = jsonTreeReader1.nextName();
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        int int19 = jsonTreeReader1.nextInt();
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.getPath();
        java.lang.String str9 = jsonTreeReader1.toString();
        java.lang.String str10 = jsonTreeReader1.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endObject();
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        java.lang.String str11 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.skipValue();
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean15 = jsonTreeReader1.nextBoolean();
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        int int16 = jsonTreeReader1.nextInt();
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.nextNull();
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean18 = jsonTreeReader1.hasNext();
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        boolean boolean5 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        int int6 = jsonTreeReader1.nextInt();
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str10 = jsonTreeReader1.getPath();
        boolean boolean11 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        long long12 = jsonTreeReader1.nextLong();
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        double double4 = jsonTreeReader1.nextDouble();
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(false);
        java.lang.String str4 = jsonTreeReader1.toString();
        java.lang.String str5 = jsonTreeReader1.toString();
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.beginArray();
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        int int11 = jsonTreeReader1.nextInt();
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        double double15 = jsonTreeReader1.nextDouble();
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        java.lang.String str7 = jsonTreeReader1.toString();
        boolean boolean8 = jsonTreeReader1.isLenient();
        boolean boolean9 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endArray();
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endArray();
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.beginObject();
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.getPath();
        boolean boolean4 = jsonTreeReader1.isLenient();
        java.lang.String str5 = jsonTreeReader1.getPath();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        double double9 = jsonTreeReader1.nextDouble();
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean9 = jsonTreeReader1.isLenient();
        java.lang.String str10 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean13 = jsonTreeReader1.hasNext();
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonToken jsonToken14 = jsonTreeReader1.peek();
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        boolean boolean8 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str9 = jsonTreeReader1.nextName();
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.beginArray();
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean16 = jsonTreeReader1.hasNext();
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean11 = jsonTreeReader1.nextBoolean();
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.getPath();
        boolean boolean8 = jsonTreeReader1.isLenient();
        java.lang.String str9 = jsonTreeReader1.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        long long10 = jsonTreeReader1.nextLong();
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        java.lang.String str10 = jsonTreeReader1.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.skipValue();
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.skipValue();
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(true);
        java.lang.String str9 = jsonTreeReader1.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        int int10 = jsonTreeReader1.nextInt();
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        long long6 = jsonTreeReader1.nextLong();
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
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
        boolean boolean15 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str16 = jsonTreeReader1.nextName();
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        java.lang.String str3 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endObject();
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
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
        boolean boolean12 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.String str13 = jsonTreeReader1.nextName();
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        boolean boolean11 = jsonTreeReader1.isLenient();
        java.lang.String str12 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        long long13 = jsonTreeReader1.nextLong();
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        long long16 = jsonTreeReader1.nextLong();
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str11 = jsonTreeReader1.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        double double12 = jsonTreeReader1.nextDouble();
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        java.lang.String str5 = jsonTreeReader1.getPath();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean9 = jsonTreeReader1.nextBoolean();
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        java.lang.String str6 = jsonTreeReader1.getPath();
        java.lang.String str7 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonToken jsonToken8 = jsonTreeReader1.peek();
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        long long18 = jsonTreeReader1.nextLong();
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.toString();
        java.lang.String str8 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonToken jsonToken13 = jsonTreeReader1.peek();
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endObject();
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endArray();
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.promoteNameToValue();
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.skipValue();
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.nextNull();
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        boolean boolean6 = jsonTreeReader1.isLenient();
        boolean boolean7 = jsonTreeReader1.isLenient();
        java.lang.String str8 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.skipValue();
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        java.lang.String str4 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonToken jsonToken11 = jsonTreeReader1.peek();
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        boolean boolean6 = jsonTreeReader1.isLenient();
        java.lang.String str7 = jsonTreeReader1.getPath();
        jsonTreeReader1.setLenient(false);
        boolean boolean10 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endObject();
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(true);
        jsonTreeReader1.setLenient(false);
        jsonTreeReader1.setLenient(true);
        java.lang.String str10 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.beginArray();
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        boolean boolean2 = jsonTreeReader1.isLenient();
        boolean boolean3 = jsonTreeReader1.isLenient();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.skipValue();
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.toString();
        java.lang.String str7 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.endArray();
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.beginArray();
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        com.google.gson.JsonElement jsonElement0 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement0);
        java.lang.String str2 = jsonTreeReader1.toString();
        jsonTreeReader1.setLenient(false);
        boolean boolean5 = jsonTreeReader1.isLenient();
        java.lang.String str6 = jsonTreeReader1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader1.nextNull();
    }
}

