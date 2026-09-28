package com.google.gson;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.JsonElement jsonElement7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date8 = defaultDateTypeAdapter2.fromJsonTree(jsonElement7);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.JsonElement jsonElement9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date10 = defaultDateTypeAdapter2.fromJsonTree(jsonElement9);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date4 = null;
        java.lang.String str5 = dateTypeAdapter3.toJson(date4);
        com.google.gson.JsonElement jsonElement6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date7 = dateTypeAdapter3.fromJsonTree(jsonElement6);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        com.google.gson.JsonElement jsonElement19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date20 = dateTypeAdapter6.fromJsonTree(jsonElement19);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date4 = null;
        java.lang.String str5 = dateTypeAdapter3.toJson(date4);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter8 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str9 = defaultDateTypeAdapter8.toString();
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter8.toJsonTree(date10);
        java.util.Date date12 = null;
        java.lang.String str13 = defaultDateTypeAdapter8.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = defaultDateTypeAdapter8.nullSafe();
        java.util.Date date15 = null;
        java.lang.String str16 = dateTypeAdapter14.toJson(date15);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter19 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str20 = defaultDateTypeAdapter19.toString();
        java.lang.String str21 = defaultDateTypeAdapter19.toString();
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = defaultDateTypeAdapter19.toJsonTree(date22);
        java.util.Date date24 = dateTypeAdapter14.fromJsonTree(jsonElement23);
        java.util.Date date25 = null;
        com.google.gson.JsonElement jsonElement26 = dateTypeAdapter14.toJsonTree(date25);
        java.util.Date date27 = dateTypeAdapter3.fromJsonTree(jsonElement26);
        com.google.gson.JsonElement jsonElement28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date29 = dateTypeAdapter3.fromJsonTree(jsonElement28);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        com.google.gson.JsonElement jsonElement23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date24 = dateTypeAdapter18.fromJsonTree(jsonElement23);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.JsonElement jsonElement6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date7 = dateTypeAdapter5.fromJsonTree(jsonElement6);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter8.nullSafe();
        com.google.gson.JsonElement jsonElement12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date13 = dateTypeAdapter8.fromJsonTree(jsonElement12);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter7.toJson(date8);
        java.util.Date date10 = null;
        java.lang.String str11 = dateTypeAdapter7.toJson(date10);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter14 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter14.toJsonTree(date15);
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = defaultDateTypeAdapter14.toJsonTree(date17);
        java.lang.String str19 = defaultDateTypeAdapter14.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = defaultDateTypeAdapter14.nullSafe();
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = dateTypeAdapter20.toJsonTree(date21);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter25 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date26 = null;
        com.google.gson.JsonElement jsonElement27 = defaultDateTypeAdapter25.toJsonTree(date26);
        java.util.Date date28 = null;
        com.google.gson.JsonElement jsonElement29 = defaultDateTypeAdapter25.toJsonTree(date28);
        java.util.Date date30 = dateTypeAdapter20.fromJsonTree(jsonElement29);
        java.util.Date date31 = dateTypeAdapter7.fromJsonTree(jsonElement29);
        java.util.Date date32 = null;
        com.google.gson.JsonElement jsonElement33 = dateTypeAdapter7.toJsonTree(date32);
        java.util.Date date34 = null;
        com.google.gson.JsonElement jsonElement35 = dateTypeAdapter7.toJsonTree(date34);
        com.google.gson.JsonElement jsonElement36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date37 = dateTypeAdapter7.fromJsonTree(jsonElement36);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        com.google.gson.JsonElement jsonElement13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date14 = defaultDateTypeAdapter2.fromJsonTree(jsonElement13);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        java.util.Date date23 = null;
        java.lang.String str24 = dateTypeAdapter7.toJson(date23);
        java.util.Date date25 = null;
        com.google.gson.JsonElement jsonElement26 = dateTypeAdapter7.toJsonTree(date25);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter29 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str30 = defaultDateTypeAdapter29.toString();
        java.util.Date date31 = null;
        com.google.gson.JsonElement jsonElement32 = defaultDateTypeAdapter29.toJsonTree(date31);
        java.util.Date date33 = null;
        java.lang.String str34 = defaultDateTypeAdapter29.toJson(date33);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter35 = defaultDateTypeAdapter29.nullSafe();
        java.util.Date date36 = null;
        com.google.gson.JsonElement jsonElement37 = dateTypeAdapter35.toJsonTree(date36);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter38 = dateTypeAdapter35.nullSafe();
        java.util.Date date39 = null;
        com.google.gson.JsonElement jsonElement40 = dateTypeAdapter35.toJsonTree(date39);
        java.util.Date date41 = dateTypeAdapter7.fromJsonTree(jsonElement40);
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = dateTypeAdapter7.toJsonTree(date42);
        java.util.Date date44 = null;
        java.lang.String str45 = dateTypeAdapter7.toJson(date44);
        com.google.gson.JsonElement jsonElement46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date47 = dateTypeAdapter7.fromJsonTree(jsonElement46);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter68 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str69 = defaultDateTypeAdapter68.toString();
        java.util.Date date70 = null;
        com.google.gson.JsonElement jsonElement71 = defaultDateTypeAdapter68.toJsonTree(date70);
        java.util.Date date72 = null;
        java.lang.String str73 = defaultDateTypeAdapter68.toJson(date72);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter74 = defaultDateTypeAdapter68.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter75 = defaultDateTypeAdapter68.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter78 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str79 = defaultDateTypeAdapter78.toString();
        java.util.Date date80 = null;
        java.lang.String str81 = defaultDateTypeAdapter78.toJson(date80);
        java.util.Date date82 = null;
        com.google.gson.JsonElement jsonElement83 = defaultDateTypeAdapter78.toJsonTree(date82);
        java.lang.String str84 = defaultDateTypeAdapter78.toString();
        java.util.Date date85 = null;
        java.lang.String str86 = defaultDateTypeAdapter78.toJson(date85);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter87 = defaultDateTypeAdapter78.nullSafe();
        java.util.Date date88 = null;
        com.google.gson.JsonElement jsonElement89 = dateTypeAdapter87.toJsonTree(date88);
        java.util.Date date90 = dateTypeAdapter75.fromJsonTree(jsonElement89);
        java.util.Date date91 = dateTypeAdapter8.fromJsonTree(jsonElement89);
        java.util.Date date92 = null;
        java.lang.String str93 = dateTypeAdapter8.toJson(date92);
        java.util.Date date94 = null;
        com.google.gson.JsonElement jsonElement95 = dateTypeAdapter8.toJsonTree(date94);
        com.google.gson.JsonElement jsonElement96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date97 = dateTypeAdapter8.fromJsonTree(jsonElement96);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter7.nullSafe();
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = dateTypeAdapter10.toJsonTree(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = dateTypeAdapter10.nullSafe();
        com.google.gson.JsonElement jsonElement14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date15 = dateTypeAdapter13.fromJsonTree(jsonElement14);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter11 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str12 = defaultDateTypeAdapter11.toString();
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter11.toJsonTree(date13);
        java.util.Date date15 = null;
        java.lang.String str16 = defaultDateTypeAdapter11.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = defaultDateTypeAdapter11.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = defaultDateTypeAdapter11.nullSafe();
        java.util.Date date20 = dateTypeAdapter18.fromJson("null");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter23 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str24 = defaultDateTypeAdapter23.toString();
        java.util.Date date25 = null;
        com.google.gson.JsonElement jsonElement26 = defaultDateTypeAdapter23.toJsonTree(date25);
        java.util.Date date27 = null;
        java.lang.String str28 = defaultDateTypeAdapter23.toJson(date27);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = defaultDateTypeAdapter23.nullSafe();
        java.util.Date date30 = null;
        com.google.gson.JsonElement jsonElement31 = dateTypeAdapter29.toJsonTree(date30);
        java.util.Date date32 = dateTypeAdapter18.fromJsonTree(jsonElement31);
        java.util.Date date33 = dateTypeAdapter8.fromJsonTree(jsonElement31);
        java.util.Date date34 = null;
        java.lang.String str35 = dateTypeAdapter8.toJson(date34);
        java.util.Date date36 = null;
        java.lang.String str37 = dateTypeAdapter8.toJson(date36);
        com.google.gson.JsonElement jsonElement38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date39 = dateTypeAdapter8.fromJsonTree(jsonElement38);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter10 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str11 = defaultDateTypeAdapter10.toString();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter10.toJsonTree(date12);
        java.util.Date date14 = null;
        java.lang.String str15 = defaultDateTypeAdapter10.toJson(date14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = defaultDateTypeAdapter10.nullSafe();
        java.util.Date date17 = null;
        java.lang.String str18 = dateTypeAdapter16.toJson(date17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter16.toJsonTree(date19);
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = dateTypeAdapter16.toJsonTree(date21);
        java.util.Date date23 = dateTypeAdapter5.fromJsonTree(jsonElement22);
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = dateTypeAdapter5.toJsonTree(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = dateTypeAdapter5.nullSafe();
        com.google.gson.JsonElement jsonElement27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date28 = dateTypeAdapter5.fromJsonTree(jsonElement27);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.JsonElement jsonElement7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date8 = defaultDateTypeAdapter2.fromJsonTree(jsonElement7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter27 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date28 = null;
        com.google.gson.JsonElement jsonElement29 = defaultDateTypeAdapter27.toJsonTree(date28);
        java.lang.String str30 = defaultDateTypeAdapter27.toString();
        java.util.Date date31 = null;
        com.google.gson.JsonElement jsonElement32 = defaultDateTypeAdapter27.toJsonTree(date31);
        java.util.Date date33 = null;
        com.google.gson.JsonElement jsonElement34 = defaultDateTypeAdapter27.toJsonTree(date33);
        java.util.Date date35 = dateTypeAdapter9.fromJsonTree(jsonElement34);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = dateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = dateTypeAdapter9.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter40 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date41 = null;
        java.lang.String str42 = defaultDateTypeAdapter40.toJson(date41);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter43 = defaultDateTypeAdapter40.nullSafe();
        java.util.Date date45 = dateTypeAdapter43.fromJson("null");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter48 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date49 = null;
        com.google.gson.JsonElement jsonElement50 = defaultDateTypeAdapter48.toJsonTree(date49);
        java.lang.String str51 = defaultDateTypeAdapter48.toString();
        java.util.Date date52 = null;
        com.google.gson.JsonElement jsonElement53 = defaultDateTypeAdapter48.toJsonTree(date52);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter54 = defaultDateTypeAdapter48.nullSafe();
        java.util.Date date55 = null;
        com.google.gson.JsonElement jsonElement56 = defaultDateTypeAdapter48.toJsonTree(date55);
        java.util.Date date57 = dateTypeAdapter43.fromJsonTree(jsonElement56);
        java.util.Date date58 = dateTypeAdapter37.fromJsonTree(jsonElement56);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter61 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date62 = null;
        java.lang.String str63 = defaultDateTypeAdapter61.toJson(date62);
        java.util.Date date64 = null;
        java.lang.String str65 = defaultDateTypeAdapter61.toJson(date64);
        java.lang.String str66 = defaultDateTypeAdapter61.toString();
        java.util.Date date67 = null;
        java.lang.String str68 = defaultDateTypeAdapter61.toJson(date67);
        java.util.Date date69 = null;
        com.google.gson.JsonElement jsonElement70 = defaultDateTypeAdapter61.toJsonTree(date69);
        java.util.Date date71 = dateTypeAdapter37.fromJsonTree(jsonElement70);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter72 = dateTypeAdapter37.nullSafe();
        com.google.gson.JsonElement jsonElement73 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date74 = dateTypeAdapter37.fromJsonTree(jsonElement73);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        java.lang.String str13 = defaultDateTypeAdapter2.toString();
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter2.toJsonTree(date14);
        com.google.gson.JsonElement jsonElement16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date17 = defaultDateTypeAdapter2.fromJsonTree(jsonElement16);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter7.nullSafe();
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = dateTypeAdapter10.toJsonTree(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = dateTypeAdapter10.nullSafe();
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = dateTypeAdapter10.toJsonTree(date14);
        com.google.gson.JsonElement jsonElement16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date17 = dateTypeAdapter10.fromJsonTree(jsonElement16);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.JsonElement jsonElement11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date12 = dateTypeAdapter8.fromJsonTree(jsonElement11);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        java.lang.String str13 = dateTypeAdapter11.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter11.nullSafe();
        com.google.gson.JsonElement jsonElement15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date16 = dateTypeAdapter11.fromJsonTree(jsonElement15);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        java.lang.String str9 = defaultDateTypeAdapter2.toJson(date8);
        java.util.Date date10 = null;
        java.lang.String str11 = defaultDateTypeAdapter2.toJson(date10);
        com.google.gson.JsonElement jsonElement12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date13 = defaultDateTypeAdapter2.fromJsonTree(jsonElement12);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (byte) 1);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        com.google.gson.JsonElement jsonElement4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date5 = defaultDateTypeAdapter2.fromJsonTree(jsonElement4);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        com.google.gson.JsonElement jsonElement10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date11 = defaultDateTypeAdapter2.fromJsonTree(jsonElement10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.JsonElement jsonElement4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date5 = defaultDateTypeAdapter2.fromJsonTree(jsonElement4);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date10 = null;
        java.lang.String str11 = defaultDateTypeAdapter2.toJson(date10);
        java.lang.String str12 = defaultDateTypeAdapter2.toString();
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter2.toJsonTree(date13);
        com.google.gson.JsonElement jsonElement15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date16 = defaultDateTypeAdapter2.fromJsonTree(jsonElement15);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter11 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter11.toJsonTree(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter11.toJsonTree(date14);
        java.lang.String str16 = defaultDateTypeAdapter11.toString();
        java.util.Date date17 = null;
        java.lang.String str18 = defaultDateTypeAdapter11.toJson(date17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = defaultDateTypeAdapter11.toJsonTree(date19);
        java.util.Date date21 = dateTypeAdapter8.fromJsonTree(jsonElement20);
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = dateTypeAdapter8.toJsonTree(date22);
        com.google.gson.JsonElement jsonElement24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date25 = dateTypeAdapter8.fromJsonTree(jsonElement24);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        com.google.gson.JsonElement jsonElement9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date10 = defaultDateTypeAdapter2.fromJsonTree(jsonElement9);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        com.google.gson.JsonElement jsonElement11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date12 = defaultDateTypeAdapter2.fromJsonTree(jsonElement11);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter7.nullSafe();
        com.google.gson.JsonElement jsonElement11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date12 = dateTypeAdapter10.fromJsonTree(jsonElement11);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        java.util.Date date20 = null;
        java.lang.String str21 = dateTypeAdapter8.toJson(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = dateTypeAdapter8.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter25 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date26 = null;
        java.lang.String str27 = defaultDateTypeAdapter25.toJson(date26);
        java.lang.String str28 = defaultDateTypeAdapter25.toString();
        java.util.Date date29 = null;
        com.google.gson.JsonElement jsonElement30 = defaultDateTypeAdapter25.toJsonTree(date29);
        java.util.Date date31 = dateTypeAdapter22.fromJsonTree(jsonElement30);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = dateTypeAdapter22.nullSafe();
        com.google.gson.JsonElement jsonElement33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date34 = dateTypeAdapter22.fromJsonTree(jsonElement33);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 0, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = defaultDateTypeAdapter2.toJsonTree(date4);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter2.toJsonTree(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter2.toJsonTree(date8);
        com.google.gson.JsonElement jsonElement10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date11 = defaultDateTypeAdapter2.fromJsonTree(jsonElement10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.String str4 = defaultDateTypeAdapter2.toString();
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.util.Date date7 = null;
        java.lang.String str8 = defaultDateTypeAdapter2.toJson(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        com.google.gson.JsonElement jsonElement10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date11 = defaultDateTypeAdapter2.fromJsonTree(jsonElement10);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter7.nullSafe();
        java.util.Date date11 = null;
        java.lang.String str12 = dateTypeAdapter7.toJson(date11);
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter7.toJson(date13);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter17 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = defaultDateTypeAdapter17.toJsonTree(date18);
        java.lang.String str20 = defaultDateTypeAdapter17.toString();
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = defaultDateTypeAdapter17.toJsonTree(date21);
        java.util.Date date23 = dateTypeAdapter7.fromJsonTree(jsonElement22);
        com.google.gson.JsonElement jsonElement24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date25 = dateTypeAdapter7.fromJsonTree(jsonElement24);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
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
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter27 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date28 = null;
        com.google.gson.JsonElement jsonElement29 = defaultDateTypeAdapter27.toJsonTree(date28);
        java.lang.String str30 = defaultDateTypeAdapter27.toString();
        java.util.Date date31 = null;
        com.google.gson.JsonElement jsonElement32 = defaultDateTypeAdapter27.toJsonTree(date31);
        java.util.Date date33 = null;
        com.google.gson.JsonElement jsonElement34 = defaultDateTypeAdapter27.toJsonTree(date33);
        java.util.Date date35 = dateTypeAdapter9.fromJsonTree(jsonElement34);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = dateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = dateTypeAdapter9.nullSafe();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter40 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date41 = null;
        java.lang.String str42 = defaultDateTypeAdapter40.toJson(date41);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter43 = defaultDateTypeAdapter40.nullSafe();
        java.util.Date date45 = dateTypeAdapter43.fromJson("null");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter48 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, (int) (short) 0);
        java.util.Date date49 = null;
        com.google.gson.JsonElement jsonElement50 = defaultDateTypeAdapter48.toJsonTree(date49);
        java.lang.String str51 = defaultDateTypeAdapter48.toString();
        java.util.Date date52 = null;
        com.google.gson.JsonElement jsonElement53 = defaultDateTypeAdapter48.toJsonTree(date52);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter54 = defaultDateTypeAdapter48.nullSafe();
        java.util.Date date55 = null;
        com.google.gson.JsonElement jsonElement56 = defaultDateTypeAdapter48.toJsonTree(date55);
        java.util.Date date57 = dateTypeAdapter43.fromJsonTree(jsonElement56);
        java.util.Date date58 = dateTypeAdapter37.fromJsonTree(jsonElement56);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter61 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date62 = null;
        java.lang.String str63 = defaultDateTypeAdapter61.toJson(date62);
        java.util.Date date64 = null;
        java.lang.String str65 = defaultDateTypeAdapter61.toJson(date64);
        java.lang.String str66 = defaultDateTypeAdapter61.toString();
        java.util.Date date67 = null;
        java.lang.String str68 = defaultDateTypeAdapter61.toJson(date67);
        java.util.Date date69 = null;
        com.google.gson.JsonElement jsonElement70 = defaultDateTypeAdapter61.toJsonTree(date69);
        java.util.Date date71 = dateTypeAdapter37.fromJsonTree(jsonElement70);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter72 = dateTypeAdapter37.nullSafe();
        com.google.gson.JsonElement jsonElement73 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date74 = dateTypeAdapter72.fromJsonTree(jsonElement73);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
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
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = dateTypeAdapter8.toJsonTree(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = dateTypeAdapter8.nullSafe();
        com.google.gson.JsonElement jsonElement27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date28 = dateTypeAdapter26.fromJsonTree(jsonElement27);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 1, 1);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = defaultDateTypeAdapter2.toJson(date5);
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter2.toJsonTree(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter2.toJsonTree(date10);
        java.lang.String str12 = defaultDateTypeAdapter2.toString();
        java.lang.String str13 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str15 = defaultDateTypeAdapter2.toString();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = dateTypeAdapter16.nullSafe();
        com.google.gson.JsonElement jsonElement18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date19 = dateTypeAdapter16.fromJsonTree(jsonElement18);
    }
}

