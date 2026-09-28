package com.google.gson;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.io.Writer writer3 = null;
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer3, date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = defaultDateTypeAdapter2.read(jsonReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonWriter jsonWriter4 = null;
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = defaultDateTypeAdapter2.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter6 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str7 = defaultDateTypeAdapter6.toString();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter6.toJsonTree(date8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJsonTree(jsonElement9);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        com.google.gson.stream.JsonReader jsonReader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = defaultDateTypeAdapter2.read(jsonReader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.stream.JsonWriter jsonWriter8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.lang.Class<?> wildcardClass6 = jsonElement5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.Class<?> wildcardClass5 = jsonElement4.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.stream.JsonReader jsonReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.read(jsonReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonReader jsonReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.read(jsonReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson("null");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.fromJson(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonWriter jsonWriter9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter11 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter11.toJsonTree(date12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = defaultDateTypeAdapter2.fromJsonTree(jsonElement13);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElement13);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.fromJson(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.fromJson(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.io.Writer writer5 = null;
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.lang.Class<?> wildcardClass6 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.io.Writer writer7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = dateTypeAdapter8.fromJson(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter8 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str9 = defaultDateTypeAdapter8.toString();
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter8.toJsonTree(date10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = defaultDateTypeAdapter2.fromJsonTree(jsonElement11);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = defaultDateTypeAdapter2.fromJson(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        java.io.Writer writer11 = null;
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.read(jsonReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonWriter jsonWriter8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = defaultDateTypeAdapter2.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        java.lang.Class<?> wildcardClass11 = dateTypeAdapter8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = dateTypeAdapter5.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        com.google.gson.stream.JsonWriter jsonWriter11 = null;
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter9 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str10 = defaultDateTypeAdapter9.toString();
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = defaultDateTypeAdapter9.toJsonTree(date11);
        java.util.Date date13 = null;
        java.lang.String str14 = defaultDateTypeAdapter9.toJson(date13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = defaultDateTypeAdapter9.nullSafe();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter15.toJsonTree(date16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = defaultDateTypeAdapter2.fromJsonTree(jsonElement17);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str10, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(jsonElement17);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter9 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter9.toJsonTree(date10);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter9.toJsonTree(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter9.toJsonTree(date14);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter9.toJsonTree(date16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = defaultDateTypeAdapter2.fromJsonTree(jsonElement17);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertNotNull(jsonElement17);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter7.toJson(writer8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.read(jsonReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter8 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter8.toJsonTree(date9);
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = defaultDateTypeAdapter8.toJsonTree(date11);
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter8.toJsonTree(date13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = defaultDateTypeAdapter2.fromJsonTree(jsonElement14);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(jsonElement14);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        com.google.gson.stream.JsonWriter jsonWriter3 = null;
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter3, date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter5 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter5.toJsonTree(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter5.toJsonTree(date8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJsonTree(jsonElement9);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = defaultDateTypeAdapter2.read(jsonReader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.Class<?> wildcardClass6 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = dateTypeAdapter8.fromJson(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.stream.JsonWriter jsonWriter5 = null;
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter11 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter11.toJsonTree(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter11.toJsonTree(date14);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter11.toJsonTree(date16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = defaultDateTypeAdapter2.fromJsonTree(jsonElement17);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertNotNull(jsonElement17);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer6 = null;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter5.toJson(writer6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = defaultDateTypeAdapter2.nullSafe();
        java.lang.Class<?> wildcardClass4 = dateTypeAdapter3.getClass();
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter6.toJson(writer7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonWriter jsonWriter6 = null;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonWriter jsonWriter6 = null;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.fromJson("null");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.fromJson(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.fromJson(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        com.google.gson.stream.JsonReader jsonReader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = defaultDateTypeAdapter2.read(jsonReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.lang.Class<?> wildcardClass7 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.lang.Class<?> wildcardClass8 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.io.Writer writer6 = null;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.Class<?> wildcardClass8 = jsonElement7.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.lang.Class<?> wildcardClass5 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter12.toJsonTree(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = defaultDateTypeAdapter12.toJsonTree(date17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = defaultDateTypeAdapter12.toJsonTree(date19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = defaultDateTypeAdapter2.fromJsonTree(jsonElement20);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNotNull(jsonElement20);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.fromJson("null");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter5 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str6 = defaultDateTypeAdapter5.toString();
        java.lang.String str7 = defaultDateTypeAdapter5.toString();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter5.toJsonTree(date8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJsonTree(jsonElement9);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        com.google.gson.stream.JsonReader jsonReader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = defaultDateTypeAdapter2.read(jsonReader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        java.lang.Class<?> wildcardClass8 = dateTypeAdapter5.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.fromJson(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.fromJson("null");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter11 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter11.toJsonTree(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter11.toJsonTree(date14);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter11.toJsonTree(date16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = defaultDateTypeAdapter2.fromJsonTree(jsonElement17);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertNotNull(jsonElement17);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        java.lang.Class<?> wildcardClass11 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter12.toJsonTree(date13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = defaultDateTypeAdapter2.fromJsonTree(jsonElement14);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement14);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = defaultDateTypeAdapter2.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        com.google.gson.stream.JsonReader jsonReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.read(jsonReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        com.google.gson.stream.JsonReader jsonReader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = defaultDateTypeAdapter2.read(jsonReader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.lang.Class<?> wildcardClass9 = dateTypeAdapter8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonWriter jsonWriter10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = defaultDateTypeAdapter2.fromJson(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer11 = null;
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter5 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter5.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter5.toString();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter5.toJsonTree(date9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.fromJsonTree(jsonElement10);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = defaultDateTypeAdapter2.nullSafe();
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = defaultDateTypeAdapter2.fromJson(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        java.lang.Class<?> wildcardClass10 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = dateTypeAdapter5.fromJson(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.stream.JsonWriter jsonWriter7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.read(jsonReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = dateTypeAdapter6.fromJson(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = dateTypeAdapter5.toJsonTree(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = dateTypeAdapter5.toJsonTree(date10);
        java.lang.Class<?> wildcardClass12 = dateTypeAdapter5.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.fromJson(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonWriter jsonWriter11 = null;
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.stream.JsonReader jsonReader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.read(jsonReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.lang.String str15 = defaultDateTypeAdapter13.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter8.fromJsonTree(jsonElement17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = dateTypeAdapter8.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        java.io.Writer writer8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.lang.String str15 = defaultDateTypeAdapter13.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter8.fromJsonTree(jsonElement17);
        java.lang.Class<?> wildcardClass19 = dateTypeAdapter8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = dateTypeAdapter7.fromJson("null");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter12.toJsonTree(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = defaultDateTypeAdapter12.toJsonTree(date17);
        java.util.Date date19 = dateTypeAdapter7.fromJsonTree(jsonElement18);
        java.io.Reader reader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = dateTypeAdapter7.fromJson(reader20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = dateTypeAdapter7.fromJson(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        com.google.gson.stream.JsonWriter jsonWriter10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.fromJson(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        com.google.gson.stream.JsonWriter jsonWriter11 = null;
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        java.io.Writer writer10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = defaultDateTypeAdapter2.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.fromJson(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = dateTypeAdapter7.fromJson("null");
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = dateTypeAdapter7.fromJson(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        com.google.gson.stream.JsonWriter jsonWriter8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.stream.JsonReader jsonReader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.read(jsonReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date11 = null;
        java.lang.String str12 = defaultDateTypeAdapter2.toJson(date11);
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = defaultDateTypeAdapter2.fromJson(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        java.lang.String str10 = defaultDateTypeAdapter2.toString();
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = defaultDateTypeAdapter2.fromJson(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str10, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter13.toJsonTree(date15);
        java.util.Date date17 = null;
        java.lang.String str18 = defaultDateTypeAdapter13.toJson(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = defaultDateTypeAdapter13.nullSafe();
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = dateTypeAdapter19.toJsonTree(date20);
        java.util.Date date22 = dateTypeAdapter8.fromJsonTree(jsonElement21);
        java.lang.Class<?> wildcardClass23 = dateTypeAdapter8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.lang.Class<?> wildcardClass8 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter9 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter9.toJsonTree(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = defaultDateTypeAdapter9.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter12.toJson(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = dateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = dateTypeAdapter6.fromJsonTree(jsonElement16);
        java.io.Writer writer18 = null;
        java.util.Date date19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter6.toJson(writer18, date19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        com.google.gson.stream.JsonReader jsonReader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = defaultDateTypeAdapter2.read(jsonReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonWriter jsonWriter7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonReader jsonReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.read(jsonReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.Class<?> wildcardClass6 = dateTypeAdapter5.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter7 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str8 = defaultDateTypeAdapter7.toString();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter7.toJsonTree(date9);
        java.util.Date date11 = null;
        java.lang.String str12 = defaultDateTypeAdapter7.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = defaultDateTypeAdapter7.nullSafe();
        java.util.Date date14 = null;
        java.lang.String str15 = dateTypeAdapter13.toJson(date14);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter18 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str19 = defaultDateTypeAdapter18.toString();
        java.lang.String str20 = defaultDateTypeAdapter18.toString();
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = defaultDateTypeAdapter18.toJsonTree(date21);
        java.util.Date date23 = dateTypeAdapter13.fromJsonTree(jsonElement22);
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = dateTypeAdapter13.toJsonTree(date24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date26 = defaultDateTypeAdapter2.fromJsonTree(jsonElement25);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str19, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str20, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement22);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertNotNull(jsonElement25);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        com.google.gson.stream.JsonReader jsonReader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = defaultDateTypeAdapter2.read(jsonReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        com.google.gson.stream.JsonReader jsonReader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = defaultDateTypeAdapter2.read(jsonReader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        java.lang.Class<?> wildcardClass9 = dateTypeAdapter8.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter5.toJson(date8);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str13 = defaultDateTypeAdapter12.toString();
        java.util.Date date14 = null;
        java.lang.String str15 = defaultDateTypeAdapter12.toJson(date14);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter12.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter5.fromJsonTree(jsonElement17);
        java.lang.Class<?> wildcardClass19 = jsonElement17.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str13, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        com.google.gson.stream.JsonReader jsonReader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.read(jsonReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter10 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = defaultDateTypeAdapter10.toJsonTree(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = defaultDateTypeAdapter10.nullSafe();
        java.util.Date date14 = null;
        java.lang.String str15 = dateTypeAdapter13.toJson(date14);
        java.util.Date date16 = null;
        java.lang.String str17 = dateTypeAdapter13.toJson(date16);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter20 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str21 = defaultDateTypeAdapter20.toString();
        java.util.Date date22 = null;
        java.lang.String str23 = defaultDateTypeAdapter20.toJson(date22);
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = defaultDateTypeAdapter20.toJsonTree(date24);
        java.util.Date date26 = dateTypeAdapter13.fromJsonTree(jsonElement25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = defaultDateTypeAdapter2.fromJsonTree(jsonElement25);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str21, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertNotNull(jsonElement25);
        org.junit.Assert.assertNull(date26);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        com.google.gson.stream.JsonReader jsonReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.read(jsonReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter7.nullSafe();
        java.lang.Class<?> wildcardClass11 = dateTypeAdapter10.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter5.toJson(date8);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str13 = defaultDateTypeAdapter12.toString();
        java.util.Date date14 = null;
        java.lang.String str15 = defaultDateTypeAdapter12.toJson(date14);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter12.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter5.fromJsonTree(jsonElement17);
        java.io.Reader reader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = dateTypeAdapter5.fromJson(reader19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str13, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = dateTypeAdapter8.fromJson(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.fromJson("null");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter5.toJson(date8);
        java.util.Date date10 = null;
        java.lang.String str11 = dateTypeAdapter5.toJson(date10);
        java.io.Writer writer12 = null;
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter5.toJson(writer12, date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter5 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter5.toJsonTree(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter5.toJsonTree(date8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJsonTree(jsonElement9);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter13.toJsonTree(date14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = defaultDateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = defaultDateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = defaultDateTypeAdapter13.nullSafe();
        java.util.Date date20 = dateTypeAdapter18.fromJson("null");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter23 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = defaultDateTypeAdapter23.toJsonTree(date24);
        java.util.Date date26 = null;
        com.google.gson.JsonElement jsonElement27 = defaultDateTypeAdapter23.toJsonTree(date26);
        java.util.Date date28 = null;
        com.google.gson.JsonElement jsonElement29 = defaultDateTypeAdapter23.toJsonTree(date28);
        java.util.Date date30 = dateTypeAdapter18.fromJsonTree(jsonElement29);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date31 = defaultDateTypeAdapter2.fromJsonTree(jsonElement29);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNotNull(jsonElement25);
        org.junit.Assert.assertNotNull(jsonElement27);
        org.junit.Assert.assertNotNull(jsonElement29);
        org.junit.Assert.assertNull(date30);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.io.Writer writer7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.io.Writer writer6 = null;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        java.util.Date date11 = null;
        java.lang.String str12 = defaultDateTypeAdapter2.toJson(date11);
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = defaultDateTypeAdapter2.fromJson(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonWriter jsonWriter7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter6 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str7 = defaultDateTypeAdapter6.toString();
        java.lang.String str8 = defaultDateTypeAdapter6.toString();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter6.toJsonTree(date9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.fromJsonTree(jsonElement10);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = defaultDateTypeAdapter2.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.lang.String str15 = defaultDateTypeAdapter13.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter8.fromJsonTree(jsonElement17);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter21 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = defaultDateTypeAdapter21.toJsonTree(date22);
        java.util.Date date24 = dateTypeAdapter8.fromJsonTree(jsonElement23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date26 = dateTypeAdapter8.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertNull(date24);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        com.google.gson.stream.JsonReader jsonReader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = defaultDateTypeAdapter2.read(jsonReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter8 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter8.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter8.nullSafe();
        java.util.Date date12 = null;
        java.lang.String str13 = dateTypeAdapter11.toJson(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = dateTypeAdapter11.toJsonTree(date14);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter11.toJsonTree(date16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = defaultDateTypeAdapter2.fromJsonTree(jsonElement17);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertNotNull(jsonElement17);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        java.io.Writer writer9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.io.Writer writer8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.fromJson(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertNotNull(jsonElement7);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        java.io.Writer writer9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter7.toJson(writer9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        java.lang.String str10 = defaultDateTypeAdapter2.toString();
        java.lang.Class<?> wildcardClass11 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str10, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter8 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str9 = defaultDateTypeAdapter8.toString();
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter8.toJsonTree(date10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = defaultDateTypeAdapter2.fromJsonTree(jsonElement11);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.io.Writer writer8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        com.google.gson.stream.JsonWriter jsonWriter6 = null;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        com.google.gson.stream.JsonWriter jsonWriter7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        java.io.Writer writer11 = null;
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = dateTypeAdapter7.fromJson(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.lang.String str15 = defaultDateTypeAdapter13.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter8.fromJsonTree(jsonElement17);
        java.lang.Class<?> wildcardClass19 = jsonElement17.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date11 = null;
        java.lang.String str12 = defaultDateTypeAdapter2.toJson(date11);
        java.lang.Class<?> wildcardClass13 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonWriter jsonWriter8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonReader jsonReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.read(jsonReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter8 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter8.toJsonTree(date9);
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = defaultDateTypeAdapter8.toJsonTree(date11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = defaultDateTypeAdapter2.fromJsonTree(jsonElement12);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonElement12);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.io.Writer writer10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter10 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = defaultDateTypeAdapter10.toJsonTree(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = defaultDateTypeAdapter10.nullSafe();
        java.util.Date date14 = null;
        java.lang.String str15 = dateTypeAdapter13.toJson(date14);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter13.toJsonTree(date16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = defaultDateTypeAdapter2.fromJsonTree(jsonElement17);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(jsonElement17);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter13.toJsonTree(date15);
        java.util.Date date17 = null;
        java.lang.String str18 = defaultDateTypeAdapter13.toJson(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = defaultDateTypeAdapter13.nullSafe();
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = dateTypeAdapter19.toJsonTree(date20);
        java.util.Date date22 = dateTypeAdapter8.fromJsonTree(jsonElement21);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter25 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date26 = null;
        com.google.gson.JsonElement jsonElement27 = defaultDateTypeAdapter25.toJsonTree(date26);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = defaultDateTypeAdapter25.nullSafe();
        java.util.Date date29 = null;
        java.lang.String str30 = dateTypeAdapter28.toJson(date29);
        java.util.Date date31 = null;
        java.lang.String str32 = dateTypeAdapter28.toJson(date31);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter35 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str36 = defaultDateTypeAdapter35.toString();
        java.util.Date date37 = null;
        java.lang.String str38 = defaultDateTypeAdapter35.toJson(date37);
        java.util.Date date39 = null;
        com.google.gson.JsonElement jsonElement40 = defaultDateTypeAdapter35.toJsonTree(date39);
        java.util.Date date41 = dateTypeAdapter28.fromJsonTree(jsonElement40);
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = dateTypeAdapter28.toJsonTree(date42);
        java.util.Date date44 = dateTypeAdapter8.fromJsonTree(jsonElement43);
        java.io.Writer writer45 = null;
        java.util.Date date46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer45, date46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(jsonElement27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "null" + "'", str30, "null");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str36, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null" + "'", str38, "null");
        org.junit.Assert.assertNotNull(jsonElement40);
        org.junit.Assert.assertNull(date41);
        org.junit.Assert.assertNotNull(jsonElement43);
        org.junit.Assert.assertNull(date44);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date11 = null;
        java.lang.String str12 = defaultDateTypeAdapter2.toJson(date11);
        java.io.Writer writer13 = null;
        java.util.Date date14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer13, date14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.io.Writer writer10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        com.google.gson.stream.JsonReader jsonReader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = defaultDateTypeAdapter2.read(jsonReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter9 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter9.toJsonTree(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = defaultDateTypeAdapter9.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter12.toJson(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = dateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = dateTypeAdapter6.fromJsonTree(jsonElement16);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = dateTypeAdapter6.nullSafe();
        java.io.Reader reader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = dateTypeAdapter18.fromJson(reader19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter10.nullSafe();
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = dateTypeAdapter10.fromJson(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.util.Date date7 = null;
        java.lang.String str8 = defaultDateTypeAdapter2.toJson(date7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson("null");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter7.nullSafe();
        java.io.Writer writer11 = null;
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter7.toJson(writer11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = dateTypeAdapter7.fromJson("null");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter12.toJsonTree(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = defaultDateTypeAdapter12.toJsonTree(date17);
        java.util.Date date19 = dateTypeAdapter7.fromJsonTree(jsonElement18);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = dateTypeAdapter7.nullSafe();
        java.lang.Class<?> wildcardClass21 = dateTypeAdapter20.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(0, (int) (byte) 1);
        com.google.gson.stream.JsonWriter jsonWriter3 = null;
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter3, date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        com.google.gson.stream.JsonWriter jsonWriter3 = null;
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter3, date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.read(jsonReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter11 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter11.toJsonTree(date12);
        java.lang.String str14 = defaultDateTypeAdapter11.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter11.toJsonTree(date15);
        java.util.Date date17 = dateTypeAdapter8.fromJsonTree(jsonElement16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = date17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.lang.Class<?> wildcardClass6 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter13.toJsonTree(date15);
        java.util.Date date17 = null;
        java.lang.String str18 = defaultDateTypeAdapter13.toJson(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = defaultDateTypeAdapter13.nullSafe();
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = dateTypeAdapter19.toJsonTree(date20);
        java.util.Date date22 = dateTypeAdapter8.fromJsonTree(jsonElement21);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = dateTypeAdapter8.nullSafe();
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = dateTypeAdapter8.fromJson(reader24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        java.lang.String str11 = defaultDateTypeAdapter2.toString();
        java.io.Writer writer12 = null;
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer12, date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str11, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter10 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = defaultDateTypeAdapter10.toJsonTree(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = defaultDateTypeAdapter10.nullSafe();
        java.util.Date date14 = null;
        java.lang.String str15 = dateTypeAdapter13.toJson(date14);
        java.util.Date date16 = null;
        java.lang.String str17 = dateTypeAdapter13.toJson(date16);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter20 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str21 = defaultDateTypeAdapter20.toString();
        java.util.Date date22 = null;
        java.lang.String str23 = defaultDateTypeAdapter20.toJson(date22);
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = defaultDateTypeAdapter20.toJsonTree(date24);
        java.util.Date date26 = dateTypeAdapter13.fromJsonTree(jsonElement25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = defaultDateTypeAdapter2.fromJsonTree(jsonElement25);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str21, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertNotNull(jsonElement25);
        org.junit.Assert.assertNull(date26);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        java.lang.String str10 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter13.toJsonTree(date14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = defaultDateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = defaultDateTypeAdapter13.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter20 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = defaultDateTypeAdapter20.toJsonTree(date21);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = defaultDateTypeAdapter20.nullSafe();
        java.util.Date date24 = null;
        java.lang.String str25 = dateTypeAdapter23.toJson(date24);
        java.util.Date date26 = null;
        com.google.gson.JsonElement jsonElement27 = dateTypeAdapter23.toJsonTree(date26);
        java.util.Date date28 = dateTypeAdapter17.fromJsonTree(jsonElement27);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter17.nullSafe();
        java.util.Date date30 = null;
        com.google.gson.JsonElement jsonElement31 = dateTypeAdapter29.toJsonTree(date30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date32 = defaultDateTypeAdapter2.fromJsonTree(jsonElement31);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str10, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertNotNull(jsonElement27);
        org.junit.Assert.assertNull(date28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(jsonElement31);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.io.Writer writer4 = null;
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = defaultDateTypeAdapter2.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter9 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter9.toJsonTree(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = defaultDateTypeAdapter9.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter12.toJson(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = dateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = dateTypeAdapter6.fromJsonTree(jsonElement16);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = dateTypeAdapter6.nullSafe();
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter18.toJsonTree(date19);
        java.io.Reader reader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = dateTypeAdapter18.fromJson(reader21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(jsonElement20);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter2.toJsonTree(date8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.fromJson("null");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        com.google.gson.stream.JsonReader jsonReader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.read(jsonReader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter2.toJsonTree(date8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.util.Date date7 = null;
        java.lang.String str8 = defaultDateTypeAdapter2.toJson(date7);
        com.google.gson.stream.JsonReader jsonReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.read(jsonReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.lang.Class<?> wildcardClass10 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        com.google.gson.stream.JsonWriter jsonWriter11 = null;
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = dateTypeAdapter8.toJsonTree(date11);
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = dateTypeAdapter8.fromJson(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonElement12);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date4 = null;
        java.lang.String str5 = dateTypeAdapter3.toJson(date4);
        java.io.Writer writer6 = null;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter3.toJson(writer6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.io.Writer writer9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        com.google.gson.stream.JsonWriter jsonWriter6 = null;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        java.lang.String str10 = defaultDateTypeAdapter2.toString();
        java.io.Writer writer11 = null;
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str10, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(0, (int) (byte) 1);
        com.google.gson.stream.JsonReader jsonReader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = defaultDateTypeAdapter2.read(jsonReader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.io.Writer writer7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = dateTypeAdapter5.toJsonTree(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = dateTypeAdapter5.toJsonTree(date10);
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = dateTypeAdapter5.fromJson(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter7.toJson(writer8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = defaultDateTypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = defaultDateTypeAdapter2.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.fromJson(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.io.Writer writer7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonReader jsonReader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.read(jsonReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.lang.Class<?> wildcardClass6 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        java.util.Date date11 = null;
        java.lang.String str12 = defaultDateTypeAdapter2.toJson(date11);
        java.io.Writer writer13 = null;
        java.util.Date date14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer13, date14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson("null");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = dateTypeAdapter7.fromJson("null");
        java.io.Writer writer10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter7.toJson(writer10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonReader jsonReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.read(jsonReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        com.google.gson.stream.JsonWriter jsonWriter10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter9 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str10 = defaultDateTypeAdapter9.toString();
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = defaultDateTypeAdapter9.toJsonTree(date11);
        java.util.Date date13 = null;
        java.lang.String str14 = defaultDateTypeAdapter9.toJson(date13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = defaultDateTypeAdapter9.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter18 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = defaultDateTypeAdapter18.toJsonTree(date19);
        java.lang.String str21 = defaultDateTypeAdapter18.toString();
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = defaultDateTypeAdapter18.toJsonTree(date22);
        java.util.Date date24 = dateTypeAdapter15.fromJsonTree(jsonElement23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = defaultDateTypeAdapter2.fromJsonTree(jsonElement23);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str10, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str21, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertNull(date24);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter9 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter9.toJsonTree(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = defaultDateTypeAdapter9.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter12.toJson(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = dateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = dateTypeAdapter6.fromJsonTree(jsonElement16);
        java.util.Date date18 = null;
        java.lang.String str19 = dateTypeAdapter6.toJson(date18);
        java.io.Writer writer20 = null;
        java.util.Date date21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter6.toJson(writer20, date21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null" + "'", str19, "null");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter11.toJsonTree(date12);
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = dateTypeAdapter11.fromJson(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        java.io.Writer writer10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter5.toJson(date8);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str13 = defaultDateTypeAdapter12.toString();
        java.util.Date date14 = null;
        java.lang.String str15 = defaultDateTypeAdapter12.toJson(date14);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter12.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter5.fromJsonTree(jsonElement17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter5.toJsonTree(date19);
        java.lang.Class<?> wildcardClass21 = jsonElement20.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str13, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter2.nullSafe();
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = defaultDateTypeAdapter2.fromJson(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter2.toJsonTree(date10);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter14 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter14.toJsonTree(date15);
        java.lang.String str17 = defaultDateTypeAdapter14.toString();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = defaultDateTypeAdapter14.toJsonTree(date18);
        java.lang.String str20 = defaultDateTypeAdapter14.toString();
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = defaultDateTypeAdapter14.toJsonTree(date21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = defaultDateTypeAdapter2.fromJsonTree(jsonElement22);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str17, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str20, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement22);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter2.toJsonTree(date10);
        com.google.gson.stream.JsonReader jsonReader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = defaultDateTypeAdapter2.read(jsonReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        com.google.gson.stream.JsonWriter jsonWriter10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.util.Date date7 = null;
        java.lang.String str8 = defaultDateTypeAdapter2.toJson(date7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson("null");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.read(jsonReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = dateTypeAdapter8.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter7.nullSafe();
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = dateTypeAdapter10.fromJson(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter11 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str12 = defaultDateTypeAdapter11.toString();
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter11.toJsonTree(date13);
        java.util.Date date15 = dateTypeAdapter7.fromJsonTree(jsonElement14);
        java.io.Writer writer16 = null;
        java.util.Date date17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter7.toJson(writer16, date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str12, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        java.lang.String str10 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonWriter jsonWriter12 = null;
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter12, date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str10, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter11 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter11.toJsonTree(date12);
        java.lang.String str14 = defaultDateTypeAdapter11.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter11.toJsonTree(date15);
        java.util.Date date17 = dateTypeAdapter8.fromJsonTree(jsonElement16);
        java.io.Reader reader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = dateTypeAdapter8.fromJson(reader18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.read(jsonReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter5.toJson(date8);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str13 = defaultDateTypeAdapter12.toString();
        java.util.Date date14 = null;
        java.lang.String str15 = defaultDateTypeAdapter12.toJson(date14);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter12.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter5.fromJsonTree(jsonElement17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter5.toJsonTree(date19);
        java.io.Reader reader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = dateTypeAdapter5.fromJson(reader21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str13, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(jsonElement20);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter2.toJsonTree(date8);
        java.lang.Class<?> wildcardClass10 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date10 = null;
        java.lang.String str11 = dateTypeAdapter9.toJson(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = dateTypeAdapter9.nullSafe();
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = dateTypeAdapter9.fromJson(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.read(jsonReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter2.toJsonTree(date10);
        java.io.Writer writer12 = null;
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer12, date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.lang.Class<?> wildcardClass9 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter11 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter11.toJsonTree(date12);
        java.lang.String str14 = defaultDateTypeAdapter11.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter11.toJsonTree(date15);
        java.util.Date date17 = dateTypeAdapter8.fromJsonTree(jsonElement16);
        java.lang.Class<?> wildcardClass18 = dateTypeAdapter8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter11 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = defaultDateTypeAdapter11.nullSafe();
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter11.toJsonTree(date13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = defaultDateTypeAdapter2.fromJsonTree(jsonElement14);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertNotNull(jsonElement14);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.util.Date date7 = null;
        java.lang.String str8 = defaultDateTypeAdapter2.toJson(date7);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter11 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date12 = null;
        java.lang.String str13 = defaultDateTypeAdapter11.toJson(date12);
        java.util.Date date14 = null;
        java.lang.String str15 = defaultDateTypeAdapter11.toJson(date14);
        java.lang.String str16 = defaultDateTypeAdapter11.toString();
        java.util.Date date17 = null;
        java.lang.String str18 = defaultDateTypeAdapter11.toJson(date17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = defaultDateTypeAdapter11.toJsonTree(date19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = defaultDateTypeAdapter2.fromJsonTree(jsonElement20);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str16, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(jsonElement20);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter13.toJsonTree(date14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = defaultDateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = defaultDateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = defaultDateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = dateTypeAdapter18.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter22 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str23 = defaultDateTypeAdapter22.toString();
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = defaultDateTypeAdapter22.toJsonTree(date24);
        java.util.Date date26 = dateTypeAdapter18.fromJsonTree(jsonElement25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = defaultDateTypeAdapter2.fromJsonTree(jsonElement25);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str23, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement25);
        org.junit.Assert.assertNull(date26);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonReader jsonReader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = defaultDateTypeAdapter2.read(jsonReader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        java.lang.String str11 = defaultDateTypeAdapter2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = defaultDateTypeAdapter2.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str11, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        java.lang.String str11 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter14 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter14.toJsonTree(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = defaultDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        java.lang.String str19 = dateTypeAdapter17.toJson(date18);
        java.util.Date date20 = null;
        java.lang.String str21 = dateTypeAdapter17.toJson(date20);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter24 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str25 = defaultDateTypeAdapter24.toString();
        java.util.Date date26 = null;
        java.lang.String str27 = defaultDateTypeAdapter24.toJson(date26);
        java.util.Date date28 = null;
        com.google.gson.JsonElement jsonElement29 = defaultDateTypeAdapter24.toJsonTree(date28);
        java.util.Date date30 = dateTypeAdapter17.fromJsonTree(jsonElement29);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date31 = defaultDateTypeAdapter2.fromJsonTree(jsonElement29);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str11, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null" + "'", str19, "null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str25, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "null" + "'", str27, "null");
        org.junit.Assert.assertNotNull(jsonElement29);
        org.junit.Assert.assertNull(date30);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonWriter jsonWriter7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter10 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str11 = defaultDateTypeAdapter10.toString();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter10.toJsonTree(date12);
        java.util.Date date14 = null;
        java.lang.String str15 = defaultDateTypeAdapter10.toJson(date14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = defaultDateTypeAdapter10.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter16.toJsonTree(date17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = defaultDateTypeAdapter2.fromJsonTree(jsonElement18);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str11, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.lang.Class<?> wildcardClass8 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.lang.String str15 = defaultDateTypeAdapter13.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter8.fromJsonTree(jsonElement17);
        java.util.Date date19 = null;
        java.lang.String str20 = dateTypeAdapter8.toJson(date19);
        java.io.Reader reader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = dateTypeAdapter8.fromJson(reader21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        java.lang.Class<?> wildcardClass10 = dateTypeAdapter9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.lang.String str10 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter13.toJsonTree(date14);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        java.lang.String str18 = defaultDateTypeAdapter13.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = defaultDateTypeAdapter13.nullSafe();
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = dateTypeAdapter19.toJsonTree(date20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = defaultDateTypeAdapter2.fromJsonTree(jsonElement21);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str10, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str18, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(jsonElement21);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.Class<?> wildcardClass7 = jsonElement6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.util.Date date7 = null;
        java.lang.String str8 = defaultDateTypeAdapter2.toJson(date7);
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        com.google.gson.stream.JsonWriter jsonWriter6 = null;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonElement8);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date11 = dateTypeAdapter9.fromJson("null");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter14 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str15 = defaultDateTypeAdapter14.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter14.toJsonTree(date16);
        java.util.Date date18 = null;
        java.lang.String str19 = defaultDateTypeAdapter14.toJson(date18);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = defaultDateTypeAdapter14.nullSafe();
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = dateTypeAdapter20.toJsonTree(date21);
        java.util.Date date23 = dateTypeAdapter9.fromJsonTree(jsonElement22);
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = dateTypeAdapter9.fromJson(reader24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null" + "'", str19, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertNotNull(jsonElement22);
        org.junit.Assert.assertNull(date23);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = defaultDateTypeAdapter2.fromJson(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter11 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter11.toJsonTree(date12);
        java.lang.String str14 = defaultDateTypeAdapter11.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter11.toJsonTree(date15);
        java.util.Date date17 = dateTypeAdapter8.fromJsonTree(jsonElement16);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter20 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str21 = defaultDateTypeAdapter20.toString();
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = defaultDateTypeAdapter20.toJsonTree(date22);
        java.util.Date date24 = dateTypeAdapter8.fromJsonTree(jsonElement23);
        java.io.Writer writer25 = null;
        java.util.Date date26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer25, date26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str21, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertNull(date24);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.stream.JsonWriter jsonWriter8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter7.toJson(date9);
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = dateTypeAdapter7.fromJson(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter2.toJsonTree(date8);
        java.lang.Class<?> wildcardClass10 = jsonElement9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.lang.String str15 = defaultDateTypeAdapter13.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter8.fromJsonTree(jsonElement17);
        java.util.Date date19 = null;
        java.lang.String str20 = dateTypeAdapter8.toJson(date19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = dateTypeAdapter8.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.Class<?> wildcardClass7 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.stream.JsonWriter jsonWriter7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonWriter jsonWriter6 = null;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.io.Writer writer5 = null;
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = dateTypeAdapter8.toJsonTree(date11);
        java.lang.Class<?> wildcardClass13 = jsonElement12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        java.lang.String str11 = defaultDateTypeAdapter2.toString();
        java.lang.String str12 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = defaultDateTypeAdapter2.read(jsonReader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str11, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str12, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter12.toJsonTree(date13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = defaultDateTypeAdapter12.nullSafe();
        java.util.Date date16 = null;
        java.lang.String str17 = dateTypeAdapter15.toJson(date16);
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = dateTypeAdapter15.toJsonTree(date18);
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = dateTypeAdapter15.toJsonTree(date20);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter24 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date25 = null;
        com.google.gson.JsonElement jsonElement26 = defaultDateTypeAdapter24.toJsonTree(date25);
        java.util.Date date27 = null;
        com.google.gson.JsonElement jsonElement28 = defaultDateTypeAdapter24.toJsonTree(date27);
        java.lang.String str29 = defaultDateTypeAdapter24.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = defaultDateTypeAdapter24.nullSafe();
        java.util.Date date31 = null;
        com.google.gson.JsonElement jsonElement32 = dateTypeAdapter30.toJsonTree(date31);
        java.util.Date date33 = dateTypeAdapter15.fromJsonTree(jsonElement32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date34 = defaultDateTypeAdapter2.fromJsonTree(jsonElement32);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNotNull(jsonElement26);
        org.junit.Assert.assertNotNull(jsonElement28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str29, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertNotNull(jsonElement32);
        org.junit.Assert.assertNull(date33);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter2.toJsonTree(date10);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter2.toJsonTree(date12);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter16 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str17 = defaultDateTypeAdapter16.toString();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = defaultDateTypeAdapter16.toJsonTree(date18);
        java.util.Date date20 = null;
        java.lang.String str21 = defaultDateTypeAdapter16.toJson(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = defaultDateTypeAdapter16.nullSafe();
        java.util.Date date23 = null;
        java.lang.String str24 = dateTypeAdapter22.toJson(date23);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter27 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str28 = defaultDateTypeAdapter27.toString();
        java.util.Date date29 = null;
        com.google.gson.JsonElement jsonElement30 = defaultDateTypeAdapter27.toJsonTree(date29);
        java.util.Date date31 = null;
        java.lang.String str32 = defaultDateTypeAdapter27.toJson(date31);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = defaultDateTypeAdapter27.nullSafe();
        java.util.Date date34 = null;
        com.google.gson.JsonElement jsonElement35 = dateTypeAdapter33.toJsonTree(date34);
        java.util.Date date36 = dateTypeAdapter22.fromJsonTree(jsonElement35);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date37 = defaultDateTypeAdapter2.fromJsonTree(jsonElement35);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str17, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null" + "'", str24, "null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str28, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertNotNull(jsonElement35);
        org.junit.Assert.assertNull(date36);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        java.lang.String str11 = defaultDateTypeAdapter2.toString();
        java.lang.Class<?> wildcardClass12 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str11, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.util.Date date7 = null;
        java.lang.String str8 = defaultDateTypeAdapter2.toJson(date7);
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str13 = defaultDateTypeAdapter12.toString();
        java.util.Date date14 = null;
        java.lang.String str15 = defaultDateTypeAdapter12.toJson(date14);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter12.toJsonTree(date16);
        java.lang.String str18 = defaultDateTypeAdapter12.toString();
        java.util.Date date19 = null;
        java.lang.String str20 = defaultDateTypeAdapter12.toJson(date19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = defaultDateTypeAdapter12.nullSafe();
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = dateTypeAdapter21.toJsonTree(date22);
        java.util.Date date24 = dateTypeAdapter9.fromJsonTree(jsonElement23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date26 = dateTypeAdapter9.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str13, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str18, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertNull(date24);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.lang.String str15 = defaultDateTypeAdapter13.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter8.fromJsonTree(jsonElement17);
        java.io.Writer writer19 = null;
        java.util.Date date20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer19, date20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = dateTypeAdapter9.fromJson(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter10 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str11 = defaultDateTypeAdapter10.toString();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter10.toJsonTree(date12);
        java.util.Date date14 = null;
        java.lang.String str15 = defaultDateTypeAdapter10.toJson(date14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = defaultDateTypeAdapter10.nullSafe();
        java.util.Date date17 = null;
        java.lang.String str18 = dateTypeAdapter16.toJson(date17);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter21 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str22 = defaultDateTypeAdapter21.toString();
        java.lang.String str23 = defaultDateTypeAdapter21.toString();
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = defaultDateTypeAdapter21.toJsonTree(date24);
        java.util.Date date26 = dateTypeAdapter16.fromJsonTree(jsonElement25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = defaultDateTypeAdapter2.fromJsonTree(jsonElement25);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str11, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str22, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str23, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement25);
        org.junit.Assert.assertNull(date26);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter13.toJsonTree(date14);
        java.lang.String str16 = defaultDateTypeAdapter13.toString();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = defaultDateTypeAdapter13.toJsonTree(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = defaultDateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = defaultDateTypeAdapter13.nullSafe();
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = dateTypeAdapter20.toJsonTree(date21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = defaultDateTypeAdapter2.fromJsonTree(jsonElement22);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str16, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertNotNull(jsonElement22);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = dateTypeAdapter7.fromJson("null");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter12.toJsonTree(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = defaultDateTypeAdapter12.toJsonTree(date17);
        java.util.Date date19 = dateTypeAdapter7.fromJsonTree(jsonElement18);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = dateTypeAdapter7.nullSafe();
        java.util.Date date21 = null;
        java.lang.String str22 = dateTypeAdapter7.toJson(date21);
        java.io.Writer writer23 = null;
        java.util.Date date24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter7.toJson(writer23, date24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = defaultDateTypeAdapter2.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date11 = dateTypeAdapter9.fromJson("null");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter14 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str15 = defaultDateTypeAdapter14.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter14.toJsonTree(date16);
        java.util.Date date18 = null;
        java.lang.String str19 = defaultDateTypeAdapter14.toJson(date18);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = defaultDateTypeAdapter14.nullSafe();
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = dateTypeAdapter20.toJsonTree(date21);
        java.util.Date date23 = dateTypeAdapter9.fromJsonTree(jsonElement22);
        java.lang.Class<?> wildcardClass24 = jsonElement22.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null" + "'", str19, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertNotNull(jsonElement22);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.io.Writer writer9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter9.nullSafe();
        java.io.Writer writer11 = null;
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter10.toJson(writer11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter13.toJsonTree(date15);
        java.util.Date date17 = null;
        java.lang.String str18 = defaultDateTypeAdapter13.toJson(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = defaultDateTypeAdapter13.nullSafe();
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = dateTypeAdapter19.toJsonTree(date20);
        java.util.Date date22 = dateTypeAdapter8.fromJsonTree(jsonElement21);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter25 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date26 = null;
        com.google.gson.JsonElement jsonElement27 = defaultDateTypeAdapter25.toJsonTree(date26);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = defaultDateTypeAdapter25.nullSafe();
        java.util.Date date29 = null;
        java.lang.String str30 = dateTypeAdapter28.toJson(date29);
        java.util.Date date31 = null;
        java.lang.String str32 = dateTypeAdapter28.toJson(date31);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter35 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str36 = defaultDateTypeAdapter35.toString();
        java.util.Date date37 = null;
        java.lang.String str38 = defaultDateTypeAdapter35.toJson(date37);
        java.util.Date date39 = null;
        com.google.gson.JsonElement jsonElement40 = defaultDateTypeAdapter35.toJsonTree(date39);
        java.util.Date date41 = dateTypeAdapter28.fromJsonTree(jsonElement40);
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = dateTypeAdapter28.toJsonTree(date42);
        java.util.Date date44 = dateTypeAdapter8.fromJsonTree(jsonElement43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass45 = date44.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(jsonElement27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "null" + "'", str30, "null");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str36, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null" + "'", str38, "null");
        org.junit.Assert.assertNotNull(jsonElement40);
        org.junit.Assert.assertNull(date41);
        org.junit.Assert.assertNotNull(jsonElement43);
        org.junit.Assert.assertNull(date44);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter9.toJson(writer10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter13.toJsonTree(date15);
        java.util.Date date17 = null;
        java.lang.String str18 = defaultDateTypeAdapter13.toJson(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = defaultDateTypeAdapter13.nullSafe();
        java.util.Date date20 = null;
        java.lang.String str21 = dateTypeAdapter19.toJson(date20);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter24 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str25 = defaultDateTypeAdapter24.toString();
        java.lang.String str26 = defaultDateTypeAdapter24.toString();
        java.util.Date date27 = null;
        com.google.gson.JsonElement jsonElement28 = defaultDateTypeAdapter24.toJsonTree(date27);
        java.util.Date date29 = dateTypeAdapter19.fromJsonTree(jsonElement28);
        java.util.Date date30 = dateTypeAdapter8.fromJsonTree(jsonElement28);
        java.util.Date date32 = dateTypeAdapter8.fromJson("null");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter35 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date36 = null;
        com.google.gson.JsonElement jsonElement37 = defaultDateTypeAdapter35.toJsonTree(date36);
        java.lang.String str38 = defaultDateTypeAdapter35.toString();
        java.lang.String str39 = defaultDateTypeAdapter35.toString();
        java.util.Date date40 = null;
        com.google.gson.JsonElement jsonElement41 = defaultDateTypeAdapter35.toJsonTree(date40);
        java.util.Date date42 = dateTypeAdapter8.fromJsonTree(jsonElement41);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date44 = dateTypeAdapter8.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str25, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str26, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement28);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertNotNull(jsonElement37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str38, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str39, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement41);
        org.junit.Assert.assertNull(date42);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.read(jsonReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.fromJson(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter7 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter7.toJsonTree(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = defaultDateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter7.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter14 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter14.toJsonTree(date15);
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = defaultDateTypeAdapter14.toJsonTree(date17);
        java.lang.String str19 = defaultDateTypeAdapter14.toString();
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = defaultDateTypeAdapter14.toJsonTree(date20);
        java.util.Date date22 = dateTypeAdapter11.fromJsonTree(jsonElement21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = defaultDateTypeAdapter2.fromJsonTree(jsonElement21);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str19, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNull(date22);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonWriter jsonWriter8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonWriter jsonWriter10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.io.Writer writer6 = null;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        com.google.gson.stream.JsonWriter jsonWriter10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.fromJson(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.read(jsonReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter13.toJsonTree(date15);
        java.util.Date date17 = null;
        java.lang.String str18 = defaultDateTypeAdapter13.toJson(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = defaultDateTypeAdapter13.nullSafe();
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = dateTypeAdapter19.toJsonTree(date20);
        java.util.Date date22 = dateTypeAdapter8.fromJsonTree(jsonElement21);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter25 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date26 = null;
        com.google.gson.JsonElement jsonElement27 = defaultDateTypeAdapter25.toJsonTree(date26);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = defaultDateTypeAdapter25.nullSafe();
        java.util.Date date29 = null;
        java.lang.String str30 = dateTypeAdapter28.toJson(date29);
        java.util.Date date31 = null;
        java.lang.String str32 = dateTypeAdapter28.toJson(date31);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter35 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str36 = defaultDateTypeAdapter35.toString();
        java.util.Date date37 = null;
        java.lang.String str38 = defaultDateTypeAdapter35.toJson(date37);
        java.util.Date date39 = null;
        com.google.gson.JsonElement jsonElement40 = defaultDateTypeAdapter35.toJsonTree(date39);
        java.util.Date date41 = dateTypeAdapter28.fromJsonTree(jsonElement40);
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = dateTypeAdapter28.toJsonTree(date42);
        java.util.Date date44 = dateTypeAdapter8.fromJsonTree(jsonElement43);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter47 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date48 = null;
        com.google.gson.JsonElement jsonElement49 = defaultDateTypeAdapter47.toJsonTree(date48);
        java.util.Date date50 = null;
        com.google.gson.JsonElement jsonElement51 = defaultDateTypeAdapter47.toJsonTree(date50);
        java.lang.String str52 = defaultDateTypeAdapter47.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter53 = defaultDateTypeAdapter47.nullSafe();
        java.util.Date date54 = null;
        com.google.gson.JsonElement jsonElement55 = dateTypeAdapter53.toJsonTree(date54);
        java.util.Date date56 = dateTypeAdapter8.fromJsonTree(jsonElement55);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter59 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str60 = defaultDateTypeAdapter59.toString();
        java.util.Date date61 = null;
        com.google.gson.JsonElement jsonElement62 = defaultDateTypeAdapter59.toJsonTree(date61);
        java.util.Date date63 = null;
        com.google.gson.JsonElement jsonElement64 = defaultDateTypeAdapter59.toJsonTree(date63);
        java.util.Date date65 = dateTypeAdapter8.fromJsonTree(jsonElement64);
        java.io.Writer writer66 = null;
        java.util.Date date67 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer66, date67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(jsonElement27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "null" + "'", str30, "null");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str36, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null" + "'", str38, "null");
        org.junit.Assert.assertNotNull(jsonElement40);
        org.junit.Assert.assertNull(date41);
        org.junit.Assert.assertNotNull(jsonElement43);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertNotNull(jsonElement49);
        org.junit.Assert.assertNotNull(jsonElement51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str52, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter53);
        org.junit.Assert.assertNotNull(jsonElement55);
        org.junit.Assert.assertNull(date56);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str60, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement62);
        org.junit.Assert.assertNotNull(jsonElement64);
        org.junit.Assert.assertNull(date65);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter10 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = defaultDateTypeAdapter10.toJsonTree(date11);
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter10.toJsonTree(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter10.toJsonTree(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = defaultDateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = dateTypeAdapter17.nullSafe();
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter17.toJsonTree(date19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = defaultDateTypeAdapter2.fromJsonTree(jsonElement20);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(jsonElement20);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        java.lang.String str10 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonReader jsonReader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = defaultDateTypeAdapter2.read(jsonReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str10, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter10 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date11 = null;
        java.lang.String str12 = defaultDateTypeAdapter10.toJson(date11);
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter10.toJsonTree(date13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = defaultDateTypeAdapter2.fromJsonTree(jsonElement14);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(jsonElement14);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = dateTypeAdapter7.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(0, (int) (byte) 1);
        java.io.Reader reader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = defaultDateTypeAdapter2.fromJson(reader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter2.toJsonTree(date8);
        java.io.Writer writer10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.util.Date date7 = null;
        java.lang.String str8 = defaultDateTypeAdapter2.toJson(date7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson("null");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter7.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.util.Date date15 = null;
        java.lang.String str16 = defaultDateTypeAdapter13.toJson(date15);
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = defaultDateTypeAdapter13.toJsonTree(date17);
        java.lang.String str19 = defaultDateTypeAdapter13.toString();
        java.util.Date date20 = null;
        java.lang.String str21 = defaultDateTypeAdapter13.toJson(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = defaultDateTypeAdapter13.nullSafe();
        java.util.Date date23 = null;
        com.google.gson.JsonElement jsonElement24 = dateTypeAdapter22.toJsonTree(date23);
        java.util.Date date25 = dateTypeAdapter10.fromJsonTree(jsonElement24);
        java.util.Date date27 = dateTypeAdapter10.fromJson("null");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date29 = dateTypeAdapter10.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str19, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertNotNull(jsonElement24);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertNull(date27);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        java.lang.String str10 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonWriter jsonWriter11 = null;
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str10, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonReader jsonReader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = defaultDateTypeAdapter2.read(jsonReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter2.toJsonTree(date10);
        java.lang.Class<?> wildcardClass12 = jsonElement11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter10.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter14 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter14.toJsonTree(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = defaultDateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = defaultDateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = defaultDateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = dateTypeAdapter19.nullSafe();
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = dateTypeAdapter20.toJsonTree(date21);
        java.util.Date date23 = dateTypeAdapter10.fromJsonTree(jsonElement22);
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = dateTypeAdapter10.fromJson(reader24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertNotNull(jsonElement22);
        org.junit.Assert.assertNull(date23);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.util.Date date7 = null;
        java.lang.String str8 = defaultDateTypeAdapter2.toJson(date7);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter11 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date12 = null;
        java.lang.String str13 = defaultDateTypeAdapter11.toJson(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter11.toJsonTree(date14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = defaultDateTypeAdapter2.fromJsonTree(jsonElement15);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(jsonElement15);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.util.Date date7 = null;
        java.lang.String str8 = defaultDateTypeAdapter2.toJson(date7);
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        com.google.gson.stream.JsonReader jsonReader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = defaultDateTypeAdapter2.read(jsonReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonWriter jsonWriter7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.lang.Class<?> wildcardClass10 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter2.toJsonTree(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter2.toJsonTree(date15);
        java.io.Reader reader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = defaultDateTypeAdapter2.fromJson(reader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonElement16);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.Class<?> wildcardClass9 = jsonElement8.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        java.lang.String str10 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter2.nullSafe();
        java.lang.Class<?> wildcardClass12 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str10, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = dateTypeAdapter7.fromJson("null");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter12.toJsonTree(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = defaultDateTypeAdapter12.toJsonTree(date17);
        java.util.Date date19 = dateTypeAdapter7.fromJsonTree(jsonElement18);
        java.util.Date date20 = null;
        java.lang.String str21 = dateTypeAdapter7.toJson(date20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = dateTypeAdapter7.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(0, (int) (byte) 1);
        java.io.Writer writer3 = null;
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer3, date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter13.toJsonTree(date15);
        java.util.Date date17 = null;
        java.lang.String str18 = defaultDateTypeAdapter13.toJson(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = defaultDateTypeAdapter13.nullSafe();
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = dateTypeAdapter19.toJsonTree(date20);
        java.util.Date date22 = dateTypeAdapter8.fromJsonTree(jsonElement21);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = dateTypeAdapter8.nullSafe();
        java.io.Writer writer24 = null;
        java.util.Date date25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer24, date25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.fromJson("null");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertNotNull(jsonElement7);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = defaultDateTypeAdapter2.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        com.google.gson.stream.JsonWriter jsonWriter5 = null;
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = defaultDateTypeAdapter2.toJson(date13);
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = defaultDateTypeAdapter2.fromJson(reader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.stream.JsonWriter jsonWriter7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        java.util.Date date11 = null;
        java.lang.String str12 = defaultDateTypeAdapter2.toJson(date11);
        java.lang.String str13 = defaultDateTypeAdapter2.toString();
        java.io.Writer writer14 = null;
        java.util.Date date15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer14, date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str13, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter2.toJsonTree(date13);
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = defaultDateTypeAdapter2.fromJson(reader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertNotNull(jsonElement14);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.lang.String str15 = defaultDateTypeAdapter13.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter8.fromJsonTree(jsonElement17);
        java.util.Date date19 = null;
        java.lang.String str20 = dateTypeAdapter8.toJson(date19);
        java.lang.Class<?> wildcardClass21 = dateTypeAdapter8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.io.Reader reader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = defaultDateTypeAdapter2.fromJson(reader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter7.toJson(date9);
        java.io.Writer writer11 = null;
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter7.toJson(writer11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = dateTypeAdapter8.fromJson(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        java.util.Date date11 = null;
        java.lang.String str12 = defaultDateTypeAdapter2.toJson(date11);
        java.lang.String str13 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonWriter jsonWriter14 = null;
        java.util.Date date15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter14, date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str13, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter9 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter9.toJsonTree(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = defaultDateTypeAdapter9.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter12.toJson(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = dateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = dateTypeAdapter6.fromJsonTree(jsonElement16);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = dateTypeAdapter6.nullSafe();
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter18.toJsonTree(date19);
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = dateTypeAdapter18.toJsonTree(date21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date24 = dateTypeAdapter18.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertNotNull(jsonElement22);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.read(jsonReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter5.toJson(date8);
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = dateTypeAdapter5.fromJson(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = dateTypeAdapter9.toJsonTree(date10);
        java.io.Writer writer12 = null;
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter9.toJson(writer12, date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.lang.String str15 = defaultDateTypeAdapter13.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter8.fromJsonTree(jsonElement17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter8.toJsonTree(date19);
        java.util.Date date21 = null;
        java.lang.String str22 = dateTypeAdapter8.toJson(date21);
        java.util.Date date23 = null;
        com.google.gson.JsonElement jsonElement24 = dateTypeAdapter8.toJsonTree(date23);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = dateTypeAdapter8.nullSafe();
        java.io.Writer writer26 = null;
        java.util.Date date27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer26, date27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertNotNull(jsonElement24);
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.Class<?> wildcardClass8 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.io.Writer writer10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter11 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter11.toJsonTree(date12);
        java.lang.String str14 = defaultDateTypeAdapter11.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter11.toJsonTree(date15);
        java.util.Date date17 = dateTypeAdapter8.fromJsonTree(jsonElement16);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter20 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str21 = defaultDateTypeAdapter20.toString();
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = defaultDateTypeAdapter20.toJsonTree(date22);
        java.util.Date date24 = dateTypeAdapter8.fromJsonTree(jsonElement23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = date24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str21, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertNull(date24);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str13 = defaultDateTypeAdapter12.toString();
        java.util.Date date14 = null;
        java.lang.String str15 = defaultDateTypeAdapter12.toJson(date14);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter12.toJsonTree(date16);
        java.lang.String str18 = defaultDateTypeAdapter12.toString();
        java.util.Date date19 = null;
        java.lang.String str20 = defaultDateTypeAdapter12.toJson(date19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = defaultDateTypeAdapter12.nullSafe();
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = dateTypeAdapter21.toJsonTree(date22);
        java.util.Date date24 = dateTypeAdapter9.fromJsonTree(jsonElement23);
        java.io.Writer writer25 = null;
        java.util.Date date26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter9.toJson(writer25, date26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str13, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str18, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertNull(date24);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = dateTypeAdapter8.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter10 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str11 = defaultDateTypeAdapter10.toString();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter10.toJsonTree(date12);
        java.util.Date date14 = null;
        java.lang.String str15 = defaultDateTypeAdapter10.toJson(date14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = defaultDateTypeAdapter10.nullSafe();
        java.util.Date date17 = null;
        java.lang.String str18 = dateTypeAdapter16.toJson(date17);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter21 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str22 = defaultDateTypeAdapter21.toString();
        java.util.Date date23 = null;
        com.google.gson.JsonElement jsonElement24 = defaultDateTypeAdapter21.toJsonTree(date23);
        java.util.Date date25 = null;
        java.lang.String str26 = defaultDateTypeAdapter21.toJson(date25);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = defaultDateTypeAdapter21.nullSafe();
        java.util.Date date28 = null;
        com.google.gson.JsonElement jsonElement29 = dateTypeAdapter27.toJsonTree(date28);
        java.util.Date date30 = dateTypeAdapter16.fromJsonTree(jsonElement29);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date31 = defaultDateTypeAdapter2.fromJsonTree(jsonElement29);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str11, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str22, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(jsonElement29);
        org.junit.Assert.assertNull(date30);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter9 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter9.toJsonTree(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = defaultDateTypeAdapter9.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter12.toJson(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = dateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = dateTypeAdapter6.fromJsonTree(jsonElement16);
        java.util.Date date18 = null;
        java.lang.String str19 = dateTypeAdapter6.toJson(date18);
        java.lang.Class<?> wildcardClass20 = dateTypeAdapter6.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null" + "'", str19, "null");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter2.toJsonTree(date8);
        java.io.Writer writer10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        java.io.Writer writer10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.lang.Class<?> wildcardClass5 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter7.toJson(date8);
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = dateTypeAdapter7.fromJson(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElement7);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter8.nullSafe();
        java.io.Writer writer12 = null;
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer12, date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.lang.String str15 = defaultDateTypeAdapter13.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter8.fromJsonTree(jsonElement17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter8.toJsonTree(date19);
        java.util.Date date21 = null;
        java.lang.String str22 = dateTypeAdapter8.toJson(date21);
        java.util.Date date23 = null;
        com.google.gson.JsonElement jsonElement24 = dateTypeAdapter8.toJsonTree(date23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date26 = dateTypeAdapter8.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertNotNull(jsonElement24);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonWriter jsonWriter7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonWriter jsonWriter9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = defaultDateTypeAdapter2.fromJson(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        java.lang.String str10 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str12 = defaultDateTypeAdapter2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = defaultDateTypeAdapter2.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str10, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str12, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter10 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = defaultDateTypeAdapter10.toJsonTree(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = defaultDateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = defaultDateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = defaultDateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter16.toJsonTree(date17);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter21 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str22 = defaultDateTypeAdapter21.toString();
        java.lang.String str23 = defaultDateTypeAdapter21.toString();
        java.util.Date date24 = null;
        java.lang.String str25 = defaultDateTypeAdapter21.toJson(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = defaultDateTypeAdapter21.nullSafe();
        java.util.Date date27 = null;
        java.lang.String str28 = dateTypeAdapter26.toJson(date27);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter31 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date32 = null;
        com.google.gson.JsonElement jsonElement33 = defaultDateTypeAdapter31.toJsonTree(date32);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter34 = defaultDateTypeAdapter31.nullSafe();
        java.util.Date date35 = null;
        java.lang.String str36 = dateTypeAdapter34.toJson(date35);
        java.util.Date date37 = null;
        com.google.gson.JsonElement jsonElement38 = dateTypeAdapter34.toJsonTree(date37);
        java.util.Date date39 = dateTypeAdapter26.fromJsonTree(jsonElement38);
        java.util.Date date40 = dateTypeAdapter16.fromJsonTree(jsonElement38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date41 = defaultDateTypeAdapter2.fromJsonTree(jsonElement38);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str22, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str23, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null" + "'", str28, "null");
        org.junit.Assert.assertNotNull(jsonElement33);
        org.junit.Assert.assertNotNull(dateTypeAdapter34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "null" + "'", str36, "null");
        org.junit.Assert.assertNotNull(jsonElement38);
        org.junit.Assert.assertNull(date39);
        org.junit.Assert.assertNull(date40);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.lang.String str15 = defaultDateTypeAdapter13.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter8.fromJsonTree(jsonElement17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter8.toJsonTree(date19);
        java.util.Date date21 = null;
        java.lang.String str22 = dateTypeAdapter8.toJson(date21);
        java.util.Date date23 = null;
        com.google.gson.JsonElement jsonElement24 = dateTypeAdapter8.toJsonTree(date23);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = dateTypeAdapter8.nullSafe();
        java.lang.Class<?> wildcardClass26 = dateTypeAdapter8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertNotNull(jsonElement24);
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        java.lang.String str10 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str12 = defaultDateTypeAdapter2.toString();
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = defaultDateTypeAdapter2.fromJson(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str10, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str12, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter2.nullSafe();
        java.lang.Class<?> wildcardClass12 = dateTypeAdapter11.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter5.toJson(date8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = dateTypeAdapter5.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        java.lang.String str10 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer13 = null;
        java.util.Date date14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer13, date14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str10, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = defaultDateTypeAdapter2.fromJson(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        com.google.gson.stream.JsonReader jsonReader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.read(jsonReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter2.toJsonTree(date8);
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.fromJson(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter7.toJson(date8);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter12.toJsonTree(date13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = defaultDateTypeAdapter12.nullSafe();
        java.util.Date date16 = null;
        java.lang.String str17 = dateTypeAdapter15.toJson(date16);
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = dateTypeAdapter15.toJsonTree(date18);
        java.util.Date date20 = dateTypeAdapter7.fromJsonTree(jsonElement19);
        java.io.Reader reader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = dateTypeAdapter7.fromJson(reader21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = dateTypeAdapter9.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter13.toJsonTree(date15);
        java.util.Date date17 = null;
        java.lang.String str18 = defaultDateTypeAdapter13.toJson(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = defaultDateTypeAdapter13.nullSafe();
        java.util.Date date20 = null;
        java.lang.String str21 = dateTypeAdapter19.toJson(date20);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter24 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str25 = defaultDateTypeAdapter24.toString();
        java.lang.String str26 = defaultDateTypeAdapter24.toString();
        java.util.Date date27 = null;
        com.google.gson.JsonElement jsonElement28 = defaultDateTypeAdapter24.toJsonTree(date27);
        java.util.Date date29 = dateTypeAdapter19.fromJsonTree(jsonElement28);
        java.util.Date date30 = dateTypeAdapter8.fromJsonTree(jsonElement28);
        java.util.Date date32 = dateTypeAdapter8.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = dateTypeAdapter8.nullSafe();
        java.util.Date date34 = null;
        java.lang.String str35 = dateTypeAdapter8.toJson(date34);
        java.io.Writer writer36 = null;
        java.util.Date date37 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer36, date37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str25, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str26, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement28);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "null" + "'", str35, "null");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.stream.JsonWriter jsonWriter8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.lang.Class<?> wildcardClass9 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = dateTypeAdapter8.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter7.toJsonTree(date9);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = defaultDateTypeAdapter2.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter2.toJsonTree(date10);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter2.toJsonTree(date12);
        com.google.gson.stream.JsonReader jsonReader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = defaultDateTypeAdapter2.read(jsonReader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement13);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.lang.String str10 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter13.toJsonTree(date14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = defaultDateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = defaultDateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = defaultDateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = dateTypeAdapter18.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter22 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str23 = defaultDateTypeAdapter22.toString();
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = defaultDateTypeAdapter22.toJsonTree(date24);
        java.util.Date date26 = dateTypeAdapter18.fromJsonTree(jsonElement25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = defaultDateTypeAdapter2.fromJsonTree(jsonElement25);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str10, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str23, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement25);
        org.junit.Assert.assertNull(date26);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        com.google.gson.stream.JsonReader jsonReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.read(jsonReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(jsonElement8);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        java.util.Date date11 = null;
        java.lang.String str12 = defaultDateTypeAdapter2.toJson(date11);
        java.lang.String str13 = defaultDateTypeAdapter2.toString();
        java.lang.String str14 = defaultDateTypeAdapter2.toString();
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = defaultDateTypeAdapter2.fromJson(reader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str13, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter9 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter9.toJsonTree(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = defaultDateTypeAdapter9.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter12.toJson(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = dateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = dateTypeAdapter6.fromJsonTree(jsonElement16);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = dateTypeAdapter6.nullSafe();
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter18.toJsonTree(date19);
        java.lang.Class<?> wildcardClass21 = jsonElement20.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.lang.String str15 = defaultDateTypeAdapter13.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter8.fromJsonTree(jsonElement17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter8.toJsonTree(date19);
        java.util.Date date21 = null;
        java.lang.String str22 = dateTypeAdapter8.toJson(date21);
        java.util.Date date23 = null;
        com.google.gson.JsonElement jsonElement24 = dateTypeAdapter8.toJsonTree(date23);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = dateTypeAdapter8.nullSafe();
        java.io.Writer writer26 = null;
        java.util.Date date27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter25.toJson(writer26, date27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertNotNull(jsonElement24);
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = defaultDateTypeAdapter12.nullSafe();
        java.util.Date date14 = null;
        java.lang.String str15 = dateTypeAdapter13.toJson(date14);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter18 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str19 = defaultDateTypeAdapter18.toString();
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = defaultDateTypeAdapter18.toJsonTree(date20);
        java.util.Date date22 = null;
        java.lang.String str23 = defaultDateTypeAdapter18.toJson(date22);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = defaultDateTypeAdapter18.nullSafe();
        java.util.Date date25 = null;
        java.lang.String str26 = dateTypeAdapter24.toJson(date25);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter29 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str30 = defaultDateTypeAdapter29.toString();
        java.lang.String str31 = defaultDateTypeAdapter29.toString();
        java.util.Date date32 = null;
        com.google.gson.JsonElement jsonElement33 = defaultDateTypeAdapter29.toJsonTree(date32);
        java.util.Date date34 = dateTypeAdapter24.fromJsonTree(jsonElement33);
        java.util.Date date35 = null;
        com.google.gson.JsonElement jsonElement36 = dateTypeAdapter24.toJsonTree(date35);
        java.util.Date date37 = dateTypeAdapter13.fromJsonTree(jsonElement36);
        java.util.Date date38 = null;
        com.google.gson.JsonElement jsonElement39 = dateTypeAdapter13.toJsonTree(date38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date40 = defaultDateTypeAdapter2.fromJsonTree(jsonElement39);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str19, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str30, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str31, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement33);
        org.junit.Assert.assertNull(date34);
        org.junit.Assert.assertNotNull(jsonElement36);
        org.junit.Assert.assertNull(date37);
        org.junit.Assert.assertNotNull(jsonElement39);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter2.nullSafe();
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = defaultDateTypeAdapter2.fromJson(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        com.google.gson.stream.JsonWriter jsonWriter8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElement7);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter2.toJsonTree(date10);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter2.toJsonTree(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter2.toJsonTree(date14);
        com.google.gson.stream.JsonWriter jsonWriter16 = null;
        java.util.Date date17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter16, date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonElement15);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.lang.Class<?> wildcardClass6 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.util.Date date7 = null;
        java.lang.String str8 = defaultDateTypeAdapter2.toJson(date7);
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        java.lang.Class<?> wildcardClass11 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter2.toJsonTree(date10);
        java.lang.Class<?> wildcardClass12 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter13.toJsonTree(date15);
        java.util.Date date17 = null;
        java.lang.String str18 = defaultDateTypeAdapter13.toJson(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = defaultDateTypeAdapter13.nullSafe();
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = dateTypeAdapter19.toJsonTree(date20);
        java.util.Date date22 = dateTypeAdapter8.fromJsonTree(jsonElement21);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = dateTypeAdapter8.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = dateTypeAdapter23.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter2.toJsonTree(date10);
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = defaultDateTypeAdapter2.fromJson(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter10 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = defaultDateTypeAdapter10.toJsonTree(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = defaultDateTypeAdapter10.nullSafe();
        java.util.Date date14 = null;
        java.lang.String str15 = dateTypeAdapter13.toJson(date14);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter13.toJsonTree(date16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = defaultDateTypeAdapter2.fromJsonTree(jsonElement17);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(jsonElement17);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter9 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter9.toJsonTree(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = defaultDateTypeAdapter9.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter12.toJson(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = dateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = dateTypeAdapter6.fromJsonTree(jsonElement16);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = dateTypeAdapter6.nullSafe();
        java.io.Writer writer19 = null;
        java.util.Date date20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter6.toJson(writer19, date20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter2.toJsonTree(date10);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter2.toJsonTree(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter2.toJsonTree(date14);
        java.lang.String str16 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = defaultDateTypeAdapter2.read(jsonReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str16, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter10 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str11 = defaultDateTypeAdapter10.toString();
        java.util.Date date12 = null;
        java.lang.String str13 = defaultDateTypeAdapter10.toJson(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter10.toJsonTree(date14);
        java.lang.String str16 = defaultDateTypeAdapter10.toString();
        java.util.Date date17 = null;
        java.lang.String str18 = defaultDateTypeAdapter10.toJson(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = defaultDateTypeAdapter10.nullSafe();
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = dateTypeAdapter19.toJsonTree(date20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = defaultDateTypeAdapter2.fromJsonTree(jsonElement21);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str11, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str16, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(jsonElement21);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonWriter jsonWriter8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonWriter jsonWriter7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter13.toJsonTree(date15);
        java.util.Date date17 = null;
        java.lang.String str18 = defaultDateTypeAdapter13.toJson(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = defaultDateTypeAdapter13.nullSafe();
        java.util.Date date20 = null;
        java.lang.String str21 = dateTypeAdapter19.toJson(date20);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter24 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str25 = defaultDateTypeAdapter24.toString();
        java.lang.String str26 = defaultDateTypeAdapter24.toString();
        java.util.Date date27 = null;
        com.google.gson.JsonElement jsonElement28 = defaultDateTypeAdapter24.toJsonTree(date27);
        java.util.Date date29 = dateTypeAdapter19.fromJsonTree(jsonElement28);
        java.util.Date date30 = dateTypeAdapter8.fromJsonTree(jsonElement28);
        java.util.Date date32 = dateTypeAdapter8.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = dateTypeAdapter8.nullSafe();
        java.io.Writer writer34 = null;
        java.util.Date date35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer34, date35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str25, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str26, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement28);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.io.Writer writer7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        java.lang.String str11 = defaultDateTypeAdapter2.toString();
        java.lang.String str12 = defaultDateTypeAdapter2.toString();
        java.util.Date date13 = null;
        java.lang.String str14 = defaultDateTypeAdapter2.toJson(date13);
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = defaultDateTypeAdapter2.fromJson(reader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str11, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str12, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter2.toJsonTree(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter2.toJsonTree(date10);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter14 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str15 = defaultDateTypeAdapter14.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter14.toJsonTree(date16);
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = defaultDateTypeAdapter14.toJsonTree(date18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = defaultDateTypeAdapter2.fromJsonTree(jsonElement19);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str4, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNotNull(jsonElement19);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        com.google.gson.stream.JsonReader jsonReader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = defaultDateTypeAdapter2.read(jsonReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = defaultDateTypeAdapter2.toJsonTree(date7);
        com.google.gson.stream.JsonReader jsonReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.read(jsonReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonElement8);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = dateTypeAdapter7.fromJson("null");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter12.toJsonTree(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = defaultDateTypeAdapter12.toJsonTree(date17);
        java.util.Date date19 = dateTypeAdapter7.fromJsonTree(jsonElement18);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = dateTypeAdapter7.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = dateTypeAdapter20.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter13.toJsonTree(date15);
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = defaultDateTypeAdapter13.toJsonTree(date17);
        java.util.Date date19 = dateTypeAdapter8.fromJsonTree(jsonElement18);
        java.lang.Class<?> wildcardClass20 = dateTypeAdapter8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter2.toJsonTree(date8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.lang.String str15 = defaultDateTypeAdapter13.toString();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter8.fromJsonTree(jsonElement17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter8.toJsonTree(date19);
        java.util.Date date21 = null;
        java.lang.String str22 = dateTypeAdapter8.toJson(date21);
        java.util.Date date23 = null;
        com.google.gson.JsonElement jsonElement24 = dateTypeAdapter8.toJsonTree(date23);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = dateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = dateTypeAdapter25.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = dateTypeAdapter25.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str15, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertNotNull(jsonElement24);
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.read(jsonReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.fromJson("null");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = dateTypeAdapter7.fromJson("null");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter12 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter12.toJsonTree(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = defaultDateTypeAdapter12.toJsonTree(date17);
        java.util.Date date19 = dateTypeAdapter7.fromJsonTree(jsonElement18);
        java.util.Date date20 = null;
        java.lang.String str21 = dateTypeAdapter7.toJson(date20);
        java.io.Reader reader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = dateTypeAdapter7.fromJson(reader22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter2.toJsonTree(date10);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter2.toJsonTree(date12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = defaultDateTypeAdapter2.fromJson("null");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement13);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonWriter jsonWriter9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonReader jsonReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.read(jsonReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.util.Date date9 = null;
        java.lang.String str10 = defaultDateTypeAdapter2.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = defaultDateTypeAdapter2.nullSafe();
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = defaultDateTypeAdapter2.fromJson(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.Class<?> wildcardClass6 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        com.google.gson.stream.JsonWriter jsonWriter6 = null;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter13.toJsonTree(date14);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter8.fromJsonTree(jsonElement17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = date18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonWriter jsonWriter9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str14 = defaultDateTypeAdapter13.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter13.toJsonTree(date15);
        java.util.Date date17 = null;
        java.lang.String str18 = defaultDateTypeAdapter13.toJson(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = defaultDateTypeAdapter13.nullSafe();
        java.util.Date date20 = null;
        java.lang.String str21 = dateTypeAdapter19.toJson(date20);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter24 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str25 = defaultDateTypeAdapter24.toString();
        java.lang.String str26 = defaultDateTypeAdapter24.toString();
        java.util.Date date27 = null;
        com.google.gson.JsonElement jsonElement28 = defaultDateTypeAdapter24.toJsonTree(date27);
        java.util.Date date29 = dateTypeAdapter19.fromJsonTree(jsonElement28);
        java.util.Date date30 = dateTypeAdapter8.fromJsonTree(jsonElement28);
        java.lang.Class<?> wildcardClass31 = jsonElement28.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str25, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str26, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement28);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        java.io.Writer writer8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }
}

