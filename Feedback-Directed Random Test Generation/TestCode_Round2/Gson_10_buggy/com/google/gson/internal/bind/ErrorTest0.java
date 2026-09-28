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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor3 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap4 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter5 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor3, strMap4);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor6 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap7 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter8 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor6, strMap7);
        com.google.gson.internal.ConstructorConstructor constructorConstructor9 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy10 = null;
        com.google.gson.internal.Excluder excluder11 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory12 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor9, fieldNamingStrategy10, excluder11);
        com.google.gson.JsonElement jsonElement13 = typeAdapterFactoryAdapter8.toJsonTree((com.google.gson.TypeAdapterFactory) excluder11);
        com.google.gson.TypeAdapterFactory typeAdapterFactory14 = typeAdapterFactoryAdapter5.fromJsonTree(jsonElement13);
        com.google.gson.TypeAdapterFactory typeAdapterFactory15 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement13);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor16 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap17 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter18 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor16, strMap17);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor19 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap20 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter21 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor19, strMap20);
        com.google.gson.internal.ConstructorConstructor constructorConstructor22 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy23 = null;
        com.google.gson.internal.Excluder excluder24 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory25 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor22, fieldNamingStrategy23, excluder24);
        com.google.gson.JsonElement jsonElement26 = typeAdapterFactoryAdapter21.toJsonTree((com.google.gson.TypeAdapterFactory) excluder24);
        com.google.gson.TypeAdapterFactory typeAdapterFactory27 = typeAdapterFactoryAdapter18.fromJsonTree(jsonElement26);
        com.google.gson.TypeAdapterFactory typeAdapterFactory28 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement26);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter29 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapterFactory typeAdapterFactory31 = typeAdapterFactoryTypeAdapter29.fromJson("null");
        com.google.gson.internal.ConstructorConstructor constructorConstructor32 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy33 = null;
        com.google.gson.internal.Excluder excluder34 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory35 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor32, fieldNamingStrategy33, excluder34);
        com.google.gson.JsonElement jsonElement36 = typeAdapterFactoryTypeAdapter29.toJsonTree((com.google.gson.TypeAdapterFactory) excluder34);
        com.google.gson.JsonElement jsonElement37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory38 = typeAdapterFactoryTypeAdapter29.fromJsonTree(jsonElement37);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor9 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap10 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter11 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor9, strMap10);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor12 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap13 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter14 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor12, strMap13);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor15 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap16 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter17 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor15, strMap16);
        com.google.gson.internal.ConstructorConstructor constructorConstructor18 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy19 = null;
        com.google.gson.internal.Excluder excluder20 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory21 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor18, fieldNamingStrategy19, excluder20);
        com.google.gson.JsonElement jsonElement22 = typeAdapterFactoryAdapter17.toJsonTree((com.google.gson.TypeAdapterFactory) excluder20);
        com.google.gson.TypeAdapterFactory typeAdapterFactory23 = typeAdapterFactoryAdapter14.fromJsonTree(jsonElement22);
        com.google.gson.TypeAdapterFactory typeAdapterFactory24 = typeAdapterFactoryAdapter11.fromJsonTree(jsonElement22);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor25 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap26 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter27 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor25, strMap26);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor28 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap29 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter30 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor28, strMap29);
        com.google.gson.internal.ConstructorConstructor constructorConstructor31 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy32 = null;
        com.google.gson.internal.Excluder excluder33 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory34 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor31, fieldNamingStrategy32, excluder33);
        com.google.gson.JsonElement jsonElement35 = typeAdapterFactoryAdapter30.toJsonTree((com.google.gson.TypeAdapterFactory) excluder33);
        com.google.gson.TypeAdapterFactory typeAdapterFactory36 = typeAdapterFactoryAdapter27.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapterFactory typeAdapterFactory37 = typeAdapterFactoryAdapter11.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapterFactory typeAdapterFactory38 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter39 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.JsonElement jsonElement40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory41 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement40);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter9 = typeAdapterFactoryTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter10 = typeAdapterFactoryTypeAdapter8.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor11 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap12 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter13 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor11, strMap12);
        com.google.gson.internal.ConstructorConstructor constructorConstructor14 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy15 = null;
        com.google.gson.internal.Excluder excluder16 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory17 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor14, fieldNamingStrategy15, excluder16);
        com.google.gson.JsonElement jsonElement18 = typeAdapterFactoryAdapter13.toJsonTree((com.google.gson.TypeAdapterFactory) excluder16);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter19 = typeAdapterFactoryAdapter13.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor20 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap21 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter22 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor20, strMap21);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor23 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap24 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter25 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor23, strMap24);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor26 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap27 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter28 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor26, strMap27);
        com.google.gson.internal.ConstructorConstructor constructorConstructor29 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy30 = null;
        com.google.gson.internal.Excluder excluder31 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory32 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor29, fieldNamingStrategy30, excluder31);
        com.google.gson.JsonElement jsonElement33 = typeAdapterFactoryAdapter28.toJsonTree((com.google.gson.TypeAdapterFactory) excluder31);
        com.google.gson.TypeAdapterFactory typeAdapterFactory34 = typeAdapterFactoryAdapter25.fromJsonTree(jsonElement33);
        com.google.gson.TypeAdapterFactory typeAdapterFactory35 = typeAdapterFactoryAdapter22.fromJsonTree(jsonElement33);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor36 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap37 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter38 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor36, strMap37);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor39 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap40 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter41 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor39, strMap40);
        com.google.gson.internal.ConstructorConstructor constructorConstructor42 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy43 = null;
        com.google.gson.internal.Excluder excluder44 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory45 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor42, fieldNamingStrategy43, excluder44);
        com.google.gson.JsonElement jsonElement46 = typeAdapterFactoryAdapter41.toJsonTree((com.google.gson.TypeAdapterFactory) excluder44);
        com.google.gson.TypeAdapterFactory typeAdapterFactory47 = typeAdapterFactoryAdapter38.fromJsonTree(jsonElement46);
        com.google.gson.TypeAdapterFactory typeAdapterFactory48 = typeAdapterFactoryAdapter22.fromJsonTree(jsonElement46);
        com.google.gson.TypeAdapterFactory typeAdapterFactory49 = typeAdapterFactoryAdapter13.fromJsonTree(jsonElement46);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter50 = typeAdapterFactoryAdapter13.nullSafe();
        com.google.gson.TypeAdapterFactory typeAdapterFactory52 = typeAdapterFactoryAdapter13.fromJson("null");
        com.google.gson.internal.ConstructorConstructor constructorConstructor53 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy54 = null;
        com.google.gson.internal.Excluder excluder55 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory56 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor53, fieldNamingStrategy54, excluder55);
        com.google.gson.JsonElement jsonElement57 = typeAdapterFactoryAdapter13.toJsonTree((com.google.gson.TypeAdapterFactory) excluder55);
        com.google.gson.TypeAdapterFactory typeAdapterFactory58 = typeAdapterFactoryTypeAdapter10.fromJsonTree(jsonElement57);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter59 = typeAdapterFactoryTypeAdapter10.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor60 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap61 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter62 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor60, strMap61);
        com.google.gson.internal.ConstructorConstructor constructorConstructor63 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy64 = null;
        com.google.gson.internal.Excluder excluder65 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory66 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor63, fieldNamingStrategy64, excluder65);
        com.google.gson.JsonElement jsonElement67 = typeAdapterFactoryAdapter62.toJsonTree((com.google.gson.TypeAdapterFactory) excluder65);
        com.google.gson.internal.ConstructorConstructor constructorConstructor68 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy69 = null;
        com.google.gson.internal.Excluder excluder70 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory71 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor68, fieldNamingStrategy69, excluder70);
        java.lang.String str72 = typeAdapterFactoryAdapter62.toJson((com.google.gson.TypeAdapterFactory) excluder70);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter73 = typeAdapterFactoryAdapter62.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter74 = typeAdapterFactoryTypeAdapter73.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter75 = typeAdapterFactoryTypeAdapter73.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor76 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap77 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter78 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor76, strMap77);
        com.google.gson.internal.ConstructorConstructor constructorConstructor79 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy80 = null;
        com.google.gson.internal.Excluder excluder81 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory82 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor79, fieldNamingStrategy80, excluder81);
        com.google.gson.JsonElement jsonElement83 = typeAdapterFactoryAdapter78.toJsonTree((com.google.gson.TypeAdapterFactory) excluder81);
        com.google.gson.TypeAdapterFactory typeAdapterFactory84 = typeAdapterFactoryTypeAdapter73.fromJsonTree(jsonElement83);
        com.google.gson.TypeAdapterFactory typeAdapterFactory85 = typeAdapterFactoryTypeAdapter10.fromJsonTree(jsonElement83);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter86 = typeAdapterFactoryTypeAdapter10.nullSafe();
        com.google.gson.JsonElement jsonElement87 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory88 = typeAdapterFactoryTypeAdapter86.fromJsonTree(jsonElement87);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor3 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap4 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter5 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor3, strMap4);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor6 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap7 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter8 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor6, strMap7);
        com.google.gson.internal.ConstructorConstructor constructorConstructor9 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy10 = null;
        com.google.gson.internal.Excluder excluder11 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory12 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor9, fieldNamingStrategy10, excluder11);
        com.google.gson.JsonElement jsonElement13 = typeAdapterFactoryAdapter8.toJsonTree((com.google.gson.TypeAdapterFactory) excluder11);
        com.google.gson.TypeAdapterFactory typeAdapterFactory14 = typeAdapterFactoryAdapter5.fromJsonTree(jsonElement13);
        com.google.gson.TypeAdapterFactory typeAdapterFactory15 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement13);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor16 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap17 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter18 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor16, strMap17);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor19 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap20 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter21 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor19, strMap20);
        com.google.gson.internal.ConstructorConstructor constructorConstructor22 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy23 = null;
        com.google.gson.internal.Excluder excluder24 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory25 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor22, fieldNamingStrategy23, excluder24);
        com.google.gson.JsonElement jsonElement26 = typeAdapterFactoryAdapter21.toJsonTree((com.google.gson.TypeAdapterFactory) excluder24);
        com.google.gson.TypeAdapterFactory typeAdapterFactory27 = typeAdapterFactoryAdapter18.fromJsonTree(jsonElement26);
        com.google.gson.TypeAdapterFactory typeAdapterFactory28 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement26);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter29 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapterFactory typeAdapterFactory31 = typeAdapterFactoryAdapter2.fromJson("null");
        com.google.gson.JsonElement jsonElement32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory33 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement32);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter9 = typeAdapterFactoryTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter10 = typeAdapterFactoryTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter11 = typeAdapterFactoryTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapterFactory typeAdapterFactory13 = typeAdapterFactoryTypeAdapter9.fromJson("null");
        com.google.gson.TypeAdapterFactory typeAdapterFactory15 = typeAdapterFactoryTypeAdapter9.fromJson("null");
        com.google.gson.JsonElement jsonElement16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory17 = typeAdapterFactoryTypeAdapter9.fromJsonTree(jsonElement16);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor9 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap10 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter11 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor9, strMap10);
        com.google.gson.internal.ConstructorConstructor constructorConstructor12 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy13 = null;
        com.google.gson.internal.Excluder excluder14 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory15 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor12, fieldNamingStrategy13, excluder14);
        com.google.gson.JsonElement jsonElement16 = typeAdapterFactoryAdapter11.toJsonTree((com.google.gson.TypeAdapterFactory) excluder14);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter17 = typeAdapterFactoryAdapter11.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor18 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy19 = null;
        com.google.gson.internal.Excluder excluder20 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory21 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor18, fieldNamingStrategy19, excluder20);
        com.google.gson.JsonElement jsonElement22 = typeAdapterFactoryTypeAdapter17.toJsonTree((com.google.gson.TypeAdapterFactory) excluder20);
        com.google.gson.TypeAdapterFactory typeAdapterFactory23 = typeAdapterFactoryTypeAdapter8.fromJsonTree(jsonElement22);
        com.google.gson.internal.ConstructorConstructor constructorConstructor24 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy25 = null;
        com.google.gson.internal.Excluder excluder26 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory27 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor24, fieldNamingStrategy25, excluder26);
        com.google.gson.JsonElement jsonElement28 = typeAdapterFactoryTypeAdapter8.toJsonTree((com.google.gson.TypeAdapterFactory) excluder26);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter29 = typeAdapterFactoryTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter30 = typeAdapterFactoryTypeAdapter29.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter31 = typeAdapterFactoryTypeAdapter30.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor32 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy33 = null;
        com.google.gson.internal.Excluder excluder34 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory35 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor32, fieldNamingStrategy33, excluder34);
        com.google.gson.JsonElement jsonElement36 = typeAdapterFactoryTypeAdapter31.toJsonTree((com.google.gson.TypeAdapterFactory) excluder34);
        com.google.gson.JsonElement jsonElement37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory38 = typeAdapterFactoryTypeAdapter31.fromJsonTree(jsonElement37);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter9 = typeAdapterFactoryTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter10 = typeAdapterFactoryTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter11 = typeAdapterFactoryTypeAdapter9.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor12 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy13 = null;
        com.google.gson.internal.Excluder excluder14 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory15 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor12, fieldNamingStrategy13, excluder14);
        com.google.gson.JsonElement jsonElement16 = typeAdapterFactoryTypeAdapter11.toJsonTree((com.google.gson.TypeAdapterFactory) excluder14);
        com.google.gson.TypeAdapterFactory typeAdapterFactory17 = null;
        com.google.gson.JsonElement jsonElement18 = typeAdapterFactoryTypeAdapter11.toJsonTree(typeAdapterFactory17);
        com.google.gson.JsonElement jsonElement19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory20 = typeAdapterFactoryTypeAdapter11.fromJsonTree(jsonElement19);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor3 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap4 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter5 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor3, strMap4);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor6 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap7 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter8 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor6, strMap7);
        com.google.gson.internal.ConstructorConstructor constructorConstructor9 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy10 = null;
        com.google.gson.internal.Excluder excluder11 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory12 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor9, fieldNamingStrategy10, excluder11);
        com.google.gson.JsonElement jsonElement13 = typeAdapterFactoryAdapter8.toJsonTree((com.google.gson.TypeAdapterFactory) excluder11);
        com.google.gson.TypeAdapterFactory typeAdapterFactory14 = typeAdapterFactoryAdapter5.fromJsonTree(jsonElement13);
        com.google.gson.TypeAdapterFactory typeAdapterFactory15 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement13);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor16 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap17 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter18 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor16, strMap17);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor19 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap20 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter21 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor19, strMap20);
        com.google.gson.internal.ConstructorConstructor constructorConstructor22 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy23 = null;
        com.google.gson.internal.Excluder excluder24 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory25 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor22, fieldNamingStrategy23, excluder24);
        com.google.gson.JsonElement jsonElement26 = typeAdapterFactoryAdapter21.toJsonTree((com.google.gson.TypeAdapterFactory) excluder24);
        com.google.gson.TypeAdapterFactory typeAdapterFactory27 = typeAdapterFactoryAdapter18.fromJsonTree(jsonElement26);
        com.google.gson.TypeAdapterFactory typeAdapterFactory28 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement26);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter29 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor30 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap31 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter32 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor30, strMap31);
        com.google.gson.internal.ConstructorConstructor constructorConstructor33 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy34 = null;
        com.google.gson.internal.Excluder excluder35 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory36 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor33, fieldNamingStrategy34, excluder35);
        com.google.gson.JsonElement jsonElement37 = typeAdapterFactoryAdapter32.toJsonTree((com.google.gson.TypeAdapterFactory) excluder35);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter38 = typeAdapterFactoryAdapter32.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor39 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap40 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter41 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor39, strMap40);
        com.google.gson.internal.ConstructorConstructor constructorConstructor42 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy43 = null;
        com.google.gson.internal.Excluder excluder44 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory45 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor42, fieldNamingStrategy43, excluder44);
        com.google.gson.JsonElement jsonElement46 = typeAdapterFactoryAdapter41.toJsonTree((com.google.gson.TypeAdapterFactory) excluder44);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter47 = typeAdapterFactoryAdapter41.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor48 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy49 = null;
        com.google.gson.internal.Excluder excluder50 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory51 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor48, fieldNamingStrategy49, excluder50);
        com.google.gson.JsonElement jsonElement52 = typeAdapterFactoryTypeAdapter47.toJsonTree((com.google.gson.TypeAdapterFactory) excluder50);
        com.google.gson.TypeAdapterFactory typeAdapterFactory53 = typeAdapterFactoryTypeAdapter38.fromJsonTree(jsonElement52);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor54 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap55 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter56 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor54, strMap55);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor57 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap58 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter59 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor57, strMap58);
        com.google.gson.internal.ConstructorConstructor constructorConstructor60 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy61 = null;
        com.google.gson.internal.Excluder excluder62 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory63 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor60, fieldNamingStrategy61, excluder62);
        com.google.gson.JsonElement jsonElement64 = typeAdapterFactoryAdapter59.toJsonTree((com.google.gson.TypeAdapterFactory) excluder62);
        com.google.gson.TypeAdapterFactory typeAdapterFactory65 = typeAdapterFactoryAdapter56.fromJsonTree(jsonElement64);
        com.google.gson.TypeAdapterFactory typeAdapterFactory66 = typeAdapterFactoryTypeAdapter38.fromJsonTree(jsonElement64);
        com.google.gson.TypeAdapterFactory typeAdapterFactory67 = null;
        com.google.gson.JsonElement jsonElement68 = typeAdapterFactoryTypeAdapter38.toJsonTree(typeAdapterFactory67);
        com.google.gson.TypeAdapterFactory typeAdapterFactory69 = typeAdapterFactoryTypeAdapter29.fromJsonTree(jsonElement68);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter70 = typeAdapterFactoryTypeAdapter29.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter71 = typeAdapterFactoryTypeAdapter29.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor72 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy73 = null;
        com.google.gson.internal.Excluder excluder74 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory75 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor72, fieldNamingStrategy73, excluder74);
        java.lang.String str76 = typeAdapterFactoryTypeAdapter29.toJson((com.google.gson.TypeAdapterFactory) excluder74);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter77 = typeAdapterFactoryTypeAdapter29.nullSafe();
        com.google.gson.JsonElement jsonElement78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory79 = typeAdapterFactoryTypeAdapter77.fromJsonTree(jsonElement78);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor9 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap10 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter11 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor9, strMap10);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor12 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap13 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter14 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor12, strMap13);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor15 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap16 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter17 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor15, strMap16);
        com.google.gson.internal.ConstructorConstructor constructorConstructor18 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy19 = null;
        com.google.gson.internal.Excluder excluder20 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory21 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor18, fieldNamingStrategy19, excluder20);
        com.google.gson.JsonElement jsonElement22 = typeAdapterFactoryAdapter17.toJsonTree((com.google.gson.TypeAdapterFactory) excluder20);
        com.google.gson.TypeAdapterFactory typeAdapterFactory23 = typeAdapterFactoryAdapter14.fromJsonTree(jsonElement22);
        com.google.gson.TypeAdapterFactory typeAdapterFactory24 = typeAdapterFactoryAdapter11.fromJsonTree(jsonElement22);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor25 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap26 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter27 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor25, strMap26);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor28 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap29 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter30 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor28, strMap29);
        com.google.gson.internal.ConstructorConstructor constructorConstructor31 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy32 = null;
        com.google.gson.internal.Excluder excluder33 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory34 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor31, fieldNamingStrategy32, excluder33);
        com.google.gson.JsonElement jsonElement35 = typeAdapterFactoryAdapter30.toJsonTree((com.google.gson.TypeAdapterFactory) excluder33);
        com.google.gson.TypeAdapterFactory typeAdapterFactory36 = typeAdapterFactoryAdapter27.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapterFactory typeAdapterFactory37 = typeAdapterFactoryAdapter11.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapterFactory typeAdapterFactory38 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter39 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapterFactory typeAdapterFactory41 = typeAdapterFactoryAdapter2.fromJson("null");
        com.google.gson.internal.ConstructorConstructor constructorConstructor42 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy43 = null;
        com.google.gson.internal.Excluder excluder44 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory45 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor42, fieldNamingStrategy43, excluder44);
        java.lang.String str46 = typeAdapterFactoryAdapter2.toJson((com.google.gson.TypeAdapterFactory) excluder44);
        com.google.gson.internal.ConstructorConstructor constructorConstructor47 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy48 = null;
        com.google.gson.internal.Excluder excluder49 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory50 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor47, fieldNamingStrategy48, excluder49);
        java.lang.String str51 = typeAdapterFactoryAdapter2.toJson((com.google.gson.TypeAdapterFactory) excluder49);
        com.google.gson.TypeAdapterFactory typeAdapterFactory52 = null;
        java.lang.String str53 = typeAdapterFactoryAdapter2.toJson(typeAdapterFactory52);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor54 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap55 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter56 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor54, strMap55);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor57 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap58 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter59 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor57, strMap58);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor60 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap61 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter62 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor60, strMap61);
        com.google.gson.internal.ConstructorConstructor constructorConstructor63 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy64 = null;
        com.google.gson.internal.Excluder excluder65 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory66 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor63, fieldNamingStrategy64, excluder65);
        com.google.gson.JsonElement jsonElement67 = typeAdapterFactoryAdapter62.toJsonTree((com.google.gson.TypeAdapterFactory) excluder65);
        com.google.gson.TypeAdapterFactory typeAdapterFactory68 = typeAdapterFactoryAdapter59.fromJsonTree(jsonElement67);
        com.google.gson.TypeAdapterFactory typeAdapterFactory69 = typeAdapterFactoryAdapter56.fromJsonTree(jsonElement67);
        com.google.gson.TypeAdapterFactory typeAdapterFactory70 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement67);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter71 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor72 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy73 = null;
        com.google.gson.internal.Excluder excluder74 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory75 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor72, fieldNamingStrategy73, excluder74);
        java.lang.String str76 = typeAdapterFactoryAdapter2.toJson((com.google.gson.TypeAdapterFactory) excluder74);
        com.google.gson.JsonElement jsonElement77 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory78 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement77);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor9 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap10 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter11 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor9, strMap10);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor12 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap13 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter14 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor12, strMap13);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor15 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap16 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter17 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor15, strMap16);
        com.google.gson.internal.ConstructorConstructor constructorConstructor18 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy19 = null;
        com.google.gson.internal.Excluder excluder20 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory21 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor18, fieldNamingStrategy19, excluder20);
        com.google.gson.JsonElement jsonElement22 = typeAdapterFactoryAdapter17.toJsonTree((com.google.gson.TypeAdapterFactory) excluder20);
        com.google.gson.TypeAdapterFactory typeAdapterFactory23 = typeAdapterFactoryAdapter14.fromJsonTree(jsonElement22);
        com.google.gson.TypeAdapterFactory typeAdapterFactory24 = typeAdapterFactoryAdapter11.fromJsonTree(jsonElement22);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor25 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap26 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter27 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor25, strMap26);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor28 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap29 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter30 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor28, strMap29);
        com.google.gson.internal.ConstructorConstructor constructorConstructor31 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy32 = null;
        com.google.gson.internal.Excluder excluder33 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory34 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor31, fieldNamingStrategy32, excluder33);
        com.google.gson.JsonElement jsonElement35 = typeAdapterFactoryAdapter30.toJsonTree((com.google.gson.TypeAdapterFactory) excluder33);
        com.google.gson.TypeAdapterFactory typeAdapterFactory36 = typeAdapterFactoryAdapter27.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapterFactory typeAdapterFactory37 = typeAdapterFactoryAdapter11.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapterFactory typeAdapterFactory38 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter39 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapterFactory typeAdapterFactory41 = typeAdapterFactoryAdapter2.fromJson("null");
        com.google.gson.internal.ConstructorConstructor constructorConstructor42 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy43 = null;
        com.google.gson.internal.Excluder excluder44 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory45 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor42, fieldNamingStrategy43, excluder44);
        java.lang.String str46 = typeAdapterFactoryAdapter2.toJson((com.google.gson.TypeAdapterFactory) excluder44);
        com.google.gson.internal.ConstructorConstructor constructorConstructor47 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy48 = null;
        com.google.gson.internal.Excluder excluder49 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory50 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor47, fieldNamingStrategy48, excluder49);
        java.lang.String str51 = typeAdapterFactoryAdapter2.toJson((com.google.gson.TypeAdapterFactory) excluder49);
        com.google.gson.TypeAdapterFactory typeAdapterFactory52 = null;
        java.lang.String str53 = typeAdapterFactoryAdapter2.toJson(typeAdapterFactory52);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor54 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap55 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter56 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor54, strMap55);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor57 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap58 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter59 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor57, strMap58);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor60 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap61 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter62 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor60, strMap61);
        com.google.gson.internal.ConstructorConstructor constructorConstructor63 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy64 = null;
        com.google.gson.internal.Excluder excluder65 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory66 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor63, fieldNamingStrategy64, excluder65);
        com.google.gson.JsonElement jsonElement67 = typeAdapterFactoryAdapter62.toJsonTree((com.google.gson.TypeAdapterFactory) excluder65);
        com.google.gson.TypeAdapterFactory typeAdapterFactory68 = typeAdapterFactoryAdapter59.fromJsonTree(jsonElement67);
        com.google.gson.TypeAdapterFactory typeAdapterFactory69 = typeAdapterFactoryAdapter56.fromJsonTree(jsonElement67);
        com.google.gson.TypeAdapterFactory typeAdapterFactory70 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement67);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter71 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter72 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor73 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy74 = null;
        com.google.gson.internal.Excluder excluder75 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory76 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor73, fieldNamingStrategy74, excluder75);
        com.google.gson.JsonElement jsonElement77 = typeAdapterFactoryTypeAdapter72.toJsonTree((com.google.gson.TypeAdapterFactory) excluder75);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter78 = typeAdapterFactoryTypeAdapter72.nullSafe();
        com.google.gson.JsonElement jsonElement79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory80 = typeAdapterFactoryTypeAdapter78.fromJsonTree(jsonElement79);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor9 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap10 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter11 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor9, strMap10);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor12 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap13 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter14 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor12, strMap13);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor15 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap16 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter17 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor15, strMap16);
        com.google.gson.internal.ConstructorConstructor constructorConstructor18 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy19 = null;
        com.google.gson.internal.Excluder excluder20 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory21 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor18, fieldNamingStrategy19, excluder20);
        com.google.gson.JsonElement jsonElement22 = typeAdapterFactoryAdapter17.toJsonTree((com.google.gson.TypeAdapterFactory) excluder20);
        com.google.gson.TypeAdapterFactory typeAdapterFactory23 = typeAdapterFactoryAdapter14.fromJsonTree(jsonElement22);
        com.google.gson.TypeAdapterFactory typeAdapterFactory24 = typeAdapterFactoryAdapter11.fromJsonTree(jsonElement22);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor25 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap26 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter27 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor25, strMap26);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor28 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap29 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter30 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor28, strMap29);
        com.google.gson.internal.ConstructorConstructor constructorConstructor31 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy32 = null;
        com.google.gson.internal.Excluder excluder33 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory34 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor31, fieldNamingStrategy32, excluder33);
        com.google.gson.JsonElement jsonElement35 = typeAdapterFactoryAdapter30.toJsonTree((com.google.gson.TypeAdapterFactory) excluder33);
        com.google.gson.TypeAdapterFactory typeAdapterFactory36 = typeAdapterFactoryAdapter27.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapterFactory typeAdapterFactory37 = typeAdapterFactoryAdapter11.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapterFactory typeAdapterFactory38 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement35);
        com.google.gson.internal.ConstructorConstructor constructorConstructor39 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy40 = null;
        com.google.gson.internal.Excluder excluder41 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory42 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor39, fieldNamingStrategy40, excluder41);
        com.google.gson.JsonElement jsonElement43 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder41);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter44 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapterFactory typeAdapterFactory46 = typeAdapterFactoryTypeAdapter44.fromJson("null");
        com.google.gson.JsonElement jsonElement47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory48 = typeAdapterFactoryTypeAdapter44.fromJsonTree(jsonElement47);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor9 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap10 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter11 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor9, strMap10);
        com.google.gson.internal.ConstructorConstructor constructorConstructor12 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy13 = null;
        com.google.gson.internal.Excluder excluder14 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory15 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor12, fieldNamingStrategy13, excluder14);
        com.google.gson.JsonElement jsonElement16 = typeAdapterFactoryAdapter11.toJsonTree((com.google.gson.TypeAdapterFactory) excluder14);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter17 = typeAdapterFactoryAdapter11.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor18 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy19 = null;
        com.google.gson.internal.Excluder excluder20 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory21 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor18, fieldNamingStrategy19, excluder20);
        com.google.gson.JsonElement jsonElement22 = typeAdapterFactoryTypeAdapter17.toJsonTree((com.google.gson.TypeAdapterFactory) excluder20);
        com.google.gson.TypeAdapterFactory typeAdapterFactory23 = typeAdapterFactoryTypeAdapter8.fromJsonTree(jsonElement22);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor24 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap25 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter26 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor24, strMap25);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor27 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap28 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter29 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor27, strMap28);
        com.google.gson.internal.ConstructorConstructor constructorConstructor30 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy31 = null;
        com.google.gson.internal.Excluder excluder32 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory33 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor30, fieldNamingStrategy31, excluder32);
        com.google.gson.JsonElement jsonElement34 = typeAdapterFactoryAdapter29.toJsonTree((com.google.gson.TypeAdapterFactory) excluder32);
        com.google.gson.TypeAdapterFactory typeAdapterFactory35 = typeAdapterFactoryAdapter26.fromJsonTree(jsonElement34);
        com.google.gson.TypeAdapterFactory typeAdapterFactory36 = typeAdapterFactoryTypeAdapter8.fromJsonTree(jsonElement34);
        com.google.gson.TypeAdapterFactory typeAdapterFactory37 = null;
        com.google.gson.JsonElement jsonElement38 = typeAdapterFactoryTypeAdapter8.toJsonTree(typeAdapterFactory37);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter39 = typeAdapterFactoryTypeAdapter8.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor40 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap41 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter42 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor40, strMap41);
        com.google.gson.internal.ConstructorConstructor constructorConstructor43 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy44 = null;
        com.google.gson.internal.Excluder excluder45 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory46 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor43, fieldNamingStrategy44, excluder45);
        com.google.gson.JsonElement jsonElement47 = typeAdapterFactoryAdapter42.toJsonTree((com.google.gson.TypeAdapterFactory) excluder45);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter48 = typeAdapterFactoryAdapter42.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor49 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap50 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter51 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor49, strMap50);
        com.google.gson.internal.ConstructorConstructor constructorConstructor52 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy53 = null;
        com.google.gson.internal.Excluder excluder54 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory55 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor52, fieldNamingStrategy53, excluder54);
        com.google.gson.JsonElement jsonElement56 = typeAdapterFactoryAdapter51.toJsonTree((com.google.gson.TypeAdapterFactory) excluder54);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter57 = typeAdapterFactoryAdapter51.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor58 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy59 = null;
        com.google.gson.internal.Excluder excluder60 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory61 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor58, fieldNamingStrategy59, excluder60);
        com.google.gson.JsonElement jsonElement62 = typeAdapterFactoryTypeAdapter57.toJsonTree((com.google.gson.TypeAdapterFactory) excluder60);
        com.google.gson.TypeAdapterFactory typeAdapterFactory63 = typeAdapterFactoryTypeAdapter48.fromJsonTree(jsonElement62);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor64 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap65 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter66 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor64, strMap65);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor67 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap68 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter69 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor67, strMap68);
        com.google.gson.internal.ConstructorConstructor constructorConstructor70 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy71 = null;
        com.google.gson.internal.Excluder excluder72 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory73 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor70, fieldNamingStrategy71, excluder72);
        com.google.gson.JsonElement jsonElement74 = typeAdapterFactoryAdapter69.toJsonTree((com.google.gson.TypeAdapterFactory) excluder72);
        com.google.gson.TypeAdapterFactory typeAdapterFactory75 = typeAdapterFactoryAdapter66.fromJsonTree(jsonElement74);
        com.google.gson.TypeAdapterFactory typeAdapterFactory76 = typeAdapterFactoryTypeAdapter48.fromJsonTree(jsonElement74);
        com.google.gson.TypeAdapterFactory typeAdapterFactory77 = typeAdapterFactoryTypeAdapter39.fromJsonTree(jsonElement74);
        com.google.gson.JsonElement jsonElement78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory79 = typeAdapterFactoryTypeAdapter39.fromJsonTree(jsonElement78);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor9 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap10 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter11 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor9, strMap10);
        com.google.gson.internal.ConstructorConstructor constructorConstructor12 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy13 = null;
        com.google.gson.internal.Excluder excluder14 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory15 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor12, fieldNamingStrategy13, excluder14);
        com.google.gson.JsonElement jsonElement16 = typeAdapterFactoryAdapter11.toJsonTree((com.google.gson.TypeAdapterFactory) excluder14);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter17 = typeAdapterFactoryAdapter11.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor18 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy19 = null;
        com.google.gson.internal.Excluder excluder20 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory21 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor18, fieldNamingStrategy19, excluder20);
        com.google.gson.JsonElement jsonElement22 = typeAdapterFactoryTypeAdapter17.toJsonTree((com.google.gson.TypeAdapterFactory) excluder20);
        com.google.gson.TypeAdapterFactory typeAdapterFactory23 = typeAdapterFactoryTypeAdapter8.fromJsonTree(jsonElement22);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor24 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap25 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter26 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor24, strMap25);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor27 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap28 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter29 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor27, strMap28);
        com.google.gson.internal.ConstructorConstructor constructorConstructor30 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy31 = null;
        com.google.gson.internal.Excluder excluder32 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory33 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor30, fieldNamingStrategy31, excluder32);
        com.google.gson.JsonElement jsonElement34 = typeAdapterFactoryAdapter29.toJsonTree((com.google.gson.TypeAdapterFactory) excluder32);
        com.google.gson.TypeAdapterFactory typeAdapterFactory35 = typeAdapterFactoryAdapter26.fromJsonTree(jsonElement34);
        com.google.gson.TypeAdapterFactory typeAdapterFactory36 = typeAdapterFactoryTypeAdapter8.fromJsonTree(jsonElement34);
        com.google.gson.TypeAdapterFactory typeAdapterFactory37 = null;
        com.google.gson.JsonElement jsonElement38 = typeAdapterFactoryTypeAdapter8.toJsonTree(typeAdapterFactory37);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter39 = typeAdapterFactoryTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter40 = typeAdapterFactoryTypeAdapter39.nullSafe();
        com.google.gson.JsonElement jsonElement41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory42 = typeAdapterFactoryTypeAdapter40.fromJsonTree(jsonElement41);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor9 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap10 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter11 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor9, strMap10);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor12 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap13 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter14 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor12, strMap13);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor15 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap16 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter17 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor15, strMap16);
        com.google.gson.internal.ConstructorConstructor constructorConstructor18 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy19 = null;
        com.google.gson.internal.Excluder excluder20 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory21 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor18, fieldNamingStrategy19, excluder20);
        com.google.gson.JsonElement jsonElement22 = typeAdapterFactoryAdapter17.toJsonTree((com.google.gson.TypeAdapterFactory) excluder20);
        com.google.gson.TypeAdapterFactory typeAdapterFactory23 = typeAdapterFactoryAdapter14.fromJsonTree(jsonElement22);
        com.google.gson.TypeAdapterFactory typeAdapterFactory24 = typeAdapterFactoryAdapter11.fromJsonTree(jsonElement22);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor25 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap26 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter27 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor25, strMap26);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor28 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap29 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter30 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor28, strMap29);
        com.google.gson.internal.ConstructorConstructor constructorConstructor31 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy32 = null;
        com.google.gson.internal.Excluder excluder33 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory34 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor31, fieldNamingStrategy32, excluder33);
        com.google.gson.JsonElement jsonElement35 = typeAdapterFactoryAdapter30.toJsonTree((com.google.gson.TypeAdapterFactory) excluder33);
        com.google.gson.TypeAdapterFactory typeAdapterFactory36 = typeAdapterFactoryAdapter27.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapterFactory typeAdapterFactory37 = typeAdapterFactoryAdapter11.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapterFactory typeAdapterFactory38 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter39 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapterFactory typeAdapterFactory41 = typeAdapterFactoryAdapter2.fromJson("null");
        com.google.gson.internal.ConstructorConstructor constructorConstructor42 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy43 = null;
        com.google.gson.internal.Excluder excluder44 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory45 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor42, fieldNamingStrategy43, excluder44);
        java.lang.String str46 = typeAdapterFactoryAdapter2.toJson((com.google.gson.TypeAdapterFactory) excluder44);
        com.google.gson.internal.ConstructorConstructor constructorConstructor47 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy48 = null;
        com.google.gson.internal.Excluder excluder49 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory50 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor47, fieldNamingStrategy48, excluder49);
        java.lang.String str51 = typeAdapterFactoryAdapter2.toJson((com.google.gson.TypeAdapterFactory) excluder49);
        com.google.gson.TypeAdapterFactory typeAdapterFactory52 = null;
        java.lang.String str53 = typeAdapterFactoryAdapter2.toJson(typeAdapterFactory52);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor54 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap55 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter56 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor54, strMap55);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor57 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap58 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter59 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor57, strMap58);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor60 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap61 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter62 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor60, strMap61);
        com.google.gson.internal.ConstructorConstructor constructorConstructor63 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy64 = null;
        com.google.gson.internal.Excluder excluder65 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory66 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor63, fieldNamingStrategy64, excluder65);
        com.google.gson.JsonElement jsonElement67 = typeAdapterFactoryAdapter62.toJsonTree((com.google.gson.TypeAdapterFactory) excluder65);
        com.google.gson.TypeAdapterFactory typeAdapterFactory68 = typeAdapterFactoryAdapter59.fromJsonTree(jsonElement67);
        com.google.gson.TypeAdapterFactory typeAdapterFactory69 = typeAdapterFactoryAdapter56.fromJsonTree(jsonElement67);
        com.google.gson.TypeAdapterFactory typeAdapterFactory70 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement67);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter71 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.JsonElement jsonElement72 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory73 = typeAdapterFactoryTypeAdapter71.fromJsonTree(jsonElement72);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.internal.ConstructorConstructor constructorConstructor8 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy9 = null;
        com.google.gson.internal.Excluder excluder10 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory11 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor8, fieldNamingStrategy9, excluder10);
        java.lang.String str12 = typeAdapterFactoryAdapter2.toJson((com.google.gson.TypeAdapterFactory) excluder10);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter13 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor14 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy15 = null;
        com.google.gson.internal.Excluder excluder16 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory17 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor14, fieldNamingStrategy15, excluder16);
        java.lang.String str18 = typeAdapterFactoryTypeAdapter13.toJson((com.google.gson.TypeAdapterFactory) excluder16);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter19 = typeAdapterFactoryTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapterFactory typeAdapterFactory21 = typeAdapterFactoryTypeAdapter19.fromJson("null");
        com.google.gson.JsonElement jsonElement22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory23 = typeAdapterFactoryTypeAdapter19.fromJsonTree(jsonElement22);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor9 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap10 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter11 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor9, strMap10);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor12 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap13 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter14 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor12, strMap13);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor15 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap16 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter17 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor15, strMap16);
        com.google.gson.internal.ConstructorConstructor constructorConstructor18 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy19 = null;
        com.google.gson.internal.Excluder excluder20 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory21 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor18, fieldNamingStrategy19, excluder20);
        com.google.gson.JsonElement jsonElement22 = typeAdapterFactoryAdapter17.toJsonTree((com.google.gson.TypeAdapterFactory) excluder20);
        com.google.gson.TypeAdapterFactory typeAdapterFactory23 = typeAdapterFactoryAdapter14.fromJsonTree(jsonElement22);
        com.google.gson.TypeAdapterFactory typeAdapterFactory24 = typeAdapterFactoryAdapter11.fromJsonTree(jsonElement22);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor25 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap26 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter27 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor25, strMap26);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor28 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap29 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter30 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor28, strMap29);
        com.google.gson.internal.ConstructorConstructor constructorConstructor31 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy32 = null;
        com.google.gson.internal.Excluder excluder33 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory34 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor31, fieldNamingStrategy32, excluder33);
        com.google.gson.JsonElement jsonElement35 = typeAdapterFactoryAdapter30.toJsonTree((com.google.gson.TypeAdapterFactory) excluder33);
        com.google.gson.TypeAdapterFactory typeAdapterFactory36 = typeAdapterFactoryAdapter27.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapterFactory typeAdapterFactory37 = typeAdapterFactoryAdapter11.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapterFactory typeAdapterFactory38 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter39 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapterFactory typeAdapterFactory41 = typeAdapterFactoryAdapter2.fromJson("null");
        com.google.gson.internal.ConstructorConstructor constructorConstructor42 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy43 = null;
        com.google.gson.internal.Excluder excluder44 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory45 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor42, fieldNamingStrategy43, excluder44);
        java.lang.String str46 = typeAdapterFactoryAdapter2.toJson((com.google.gson.TypeAdapterFactory) excluder44);
        com.google.gson.TypeAdapterFactory typeAdapterFactory47 = null;
        java.lang.String str48 = typeAdapterFactoryAdapter2.toJson(typeAdapterFactory47);
        com.google.gson.TypeAdapterFactory typeAdapterFactory49 = null;
        com.google.gson.JsonElement jsonElement50 = typeAdapterFactoryAdapter2.toJsonTree(typeAdapterFactory49);
        com.google.gson.internal.ConstructorConstructor constructorConstructor51 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy52 = null;
        com.google.gson.internal.Excluder excluder53 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory54 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor51, fieldNamingStrategy52, excluder53);
        java.lang.String str55 = typeAdapterFactoryAdapter2.toJson((com.google.gson.TypeAdapterFactory) excluder53);
        com.google.gson.JsonElement jsonElement56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory57 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement56);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter9 = typeAdapterFactoryTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter10 = typeAdapterFactoryTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter11 = typeAdapterFactoryTypeAdapter9.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor12 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap13 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter14 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor12, strMap13);
        com.google.gson.internal.ConstructorConstructor constructorConstructor15 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy16 = null;
        com.google.gson.internal.Excluder excluder17 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory18 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor15, fieldNamingStrategy16, excluder17);
        com.google.gson.JsonElement jsonElement19 = typeAdapterFactoryAdapter14.toJsonTree((com.google.gson.TypeAdapterFactory) excluder17);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter20 = typeAdapterFactoryAdapter14.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter21 = typeAdapterFactoryTypeAdapter20.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter22 = typeAdapterFactoryTypeAdapter21.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter23 = typeAdapterFactoryTypeAdapter21.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor24 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy25 = null;
        com.google.gson.internal.Excluder excluder26 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory27 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor24, fieldNamingStrategy25, excluder26);
        com.google.gson.JsonElement jsonElement28 = typeAdapterFactoryTypeAdapter23.toJsonTree((com.google.gson.TypeAdapterFactory) excluder26);
        com.google.gson.TypeAdapterFactory typeAdapterFactory29 = typeAdapterFactoryTypeAdapter9.fromJsonTree(jsonElement28);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter30 = typeAdapterFactoryTypeAdapter9.nullSafe();
        com.google.gson.JsonElement jsonElement31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory32 = typeAdapterFactoryTypeAdapter30.fromJsonTree(jsonElement31);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter9 = typeAdapterFactoryTypeAdapter8.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor10 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy11 = null;
        com.google.gson.internal.Excluder excluder12 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory13 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor10, fieldNamingStrategy11, excluder12);
        java.lang.String str14 = typeAdapterFactoryTypeAdapter8.toJson((com.google.gson.TypeAdapterFactory) excluder12);
        com.google.gson.JsonElement jsonElement15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory16 = typeAdapterFactoryTypeAdapter8.fromJsonTree(jsonElement15);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.internal.ConstructorConstructor constructorConstructor8 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy9 = null;
        com.google.gson.internal.Excluder excluder10 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory11 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor8, fieldNamingStrategy9, excluder10);
        java.lang.String str12 = typeAdapterFactoryAdapter2.toJson((com.google.gson.TypeAdapterFactory) excluder10);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor13 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap14 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter15 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor13, strMap14);
        com.google.gson.internal.ConstructorConstructor constructorConstructor16 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy17 = null;
        com.google.gson.internal.Excluder excluder18 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory19 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor16, fieldNamingStrategy17, excluder18);
        com.google.gson.JsonElement jsonElement20 = typeAdapterFactoryAdapter15.toJsonTree((com.google.gson.TypeAdapterFactory) excluder18);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter21 = typeAdapterFactoryAdapter15.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor22 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap23 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter24 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor22, strMap23);
        com.google.gson.internal.ConstructorConstructor constructorConstructor25 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy26 = null;
        com.google.gson.internal.Excluder excluder27 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory28 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor25, fieldNamingStrategy26, excluder27);
        com.google.gson.JsonElement jsonElement29 = typeAdapterFactoryAdapter24.toJsonTree((com.google.gson.TypeAdapterFactory) excluder27);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter30 = typeAdapterFactoryAdapter24.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor31 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy32 = null;
        com.google.gson.internal.Excluder excluder33 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory34 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor31, fieldNamingStrategy32, excluder33);
        com.google.gson.JsonElement jsonElement35 = typeAdapterFactoryTypeAdapter30.toJsonTree((com.google.gson.TypeAdapterFactory) excluder33);
        com.google.gson.TypeAdapterFactory typeAdapterFactory36 = typeAdapterFactoryTypeAdapter21.fromJsonTree(jsonElement35);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor37 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap38 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter39 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor37, strMap38);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor40 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap41 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter42 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor40, strMap41);
        com.google.gson.internal.ConstructorConstructor constructorConstructor43 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy44 = null;
        com.google.gson.internal.Excluder excluder45 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory46 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor43, fieldNamingStrategy44, excluder45);
        com.google.gson.JsonElement jsonElement47 = typeAdapterFactoryAdapter42.toJsonTree((com.google.gson.TypeAdapterFactory) excluder45);
        com.google.gson.TypeAdapterFactory typeAdapterFactory48 = typeAdapterFactoryAdapter39.fromJsonTree(jsonElement47);
        com.google.gson.TypeAdapterFactory typeAdapterFactory49 = typeAdapterFactoryTypeAdapter21.fromJsonTree(jsonElement47);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter50 = typeAdapterFactoryTypeAdapter21.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor51 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap52 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter53 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor51, strMap52);
        com.google.gson.internal.ConstructorConstructor constructorConstructor54 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy55 = null;
        com.google.gson.internal.Excluder excluder56 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory57 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor54, fieldNamingStrategy55, excluder56);
        com.google.gson.JsonElement jsonElement58 = typeAdapterFactoryAdapter53.toJsonTree((com.google.gson.TypeAdapterFactory) excluder56);
        com.google.gson.TypeAdapterFactory typeAdapterFactory59 = typeAdapterFactoryTypeAdapter50.fromJsonTree(jsonElement58);
        com.google.gson.TypeAdapterFactory typeAdapterFactory60 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement58);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter61 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.JsonElement jsonElement62 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory63 = typeAdapterFactoryAdapter2.fromJsonTree(jsonElement62);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter9 = typeAdapterFactoryTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter10 = typeAdapterFactoryTypeAdapter8.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor11 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap12 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter13 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor11, strMap12);
        com.google.gson.internal.ConstructorConstructor constructorConstructor14 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy15 = null;
        com.google.gson.internal.Excluder excluder16 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory17 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor14, fieldNamingStrategy15, excluder16);
        com.google.gson.JsonElement jsonElement18 = typeAdapterFactoryAdapter13.toJsonTree((com.google.gson.TypeAdapterFactory) excluder16);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter19 = typeAdapterFactoryAdapter13.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor20 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap21 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter22 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor20, strMap21);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor23 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap24 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter25 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor23, strMap24);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor26 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap27 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter28 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor26, strMap27);
        com.google.gson.internal.ConstructorConstructor constructorConstructor29 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy30 = null;
        com.google.gson.internal.Excluder excluder31 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory32 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor29, fieldNamingStrategy30, excluder31);
        com.google.gson.JsonElement jsonElement33 = typeAdapterFactoryAdapter28.toJsonTree((com.google.gson.TypeAdapterFactory) excluder31);
        com.google.gson.TypeAdapterFactory typeAdapterFactory34 = typeAdapterFactoryAdapter25.fromJsonTree(jsonElement33);
        com.google.gson.TypeAdapterFactory typeAdapterFactory35 = typeAdapterFactoryAdapter22.fromJsonTree(jsonElement33);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor36 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap37 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter38 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor36, strMap37);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor39 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap40 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter41 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor39, strMap40);
        com.google.gson.internal.ConstructorConstructor constructorConstructor42 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy43 = null;
        com.google.gson.internal.Excluder excluder44 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory45 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor42, fieldNamingStrategy43, excluder44);
        com.google.gson.JsonElement jsonElement46 = typeAdapterFactoryAdapter41.toJsonTree((com.google.gson.TypeAdapterFactory) excluder44);
        com.google.gson.TypeAdapterFactory typeAdapterFactory47 = typeAdapterFactoryAdapter38.fromJsonTree(jsonElement46);
        com.google.gson.TypeAdapterFactory typeAdapterFactory48 = typeAdapterFactoryAdapter22.fromJsonTree(jsonElement46);
        com.google.gson.TypeAdapterFactory typeAdapterFactory49 = typeAdapterFactoryAdapter13.fromJsonTree(jsonElement46);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter50 = typeAdapterFactoryAdapter13.nullSafe();
        com.google.gson.TypeAdapterFactory typeAdapterFactory52 = typeAdapterFactoryAdapter13.fromJson("null");
        com.google.gson.internal.ConstructorConstructor constructorConstructor53 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy54 = null;
        com.google.gson.internal.Excluder excluder55 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory56 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor53, fieldNamingStrategy54, excluder55);
        com.google.gson.JsonElement jsonElement57 = typeAdapterFactoryAdapter13.toJsonTree((com.google.gson.TypeAdapterFactory) excluder55);
        com.google.gson.TypeAdapterFactory typeAdapterFactory58 = typeAdapterFactoryTypeAdapter10.fromJsonTree(jsonElement57);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter59 = typeAdapterFactoryTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapterFactory typeAdapterFactory60 = null;
        java.lang.String str61 = typeAdapterFactoryTypeAdapter10.toJson(typeAdapterFactory60);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter62 = typeAdapterFactoryTypeAdapter10.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor63 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap64 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter65 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor63, strMap64);
        com.google.gson.internal.ConstructorConstructor constructorConstructor66 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy67 = null;
        com.google.gson.internal.Excluder excluder68 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory69 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor66, fieldNamingStrategy67, excluder68);
        com.google.gson.JsonElement jsonElement70 = typeAdapterFactoryAdapter65.toJsonTree((com.google.gson.TypeAdapterFactory) excluder68);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter71 = typeAdapterFactoryAdapter65.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter72 = typeAdapterFactoryTypeAdapter71.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter73 = typeAdapterFactoryTypeAdapter72.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter74 = typeAdapterFactoryTypeAdapter72.nullSafe();
        com.google.gson.TypeAdapterFactory typeAdapterFactory75 = null;
        com.google.gson.JsonElement jsonElement76 = typeAdapterFactoryTypeAdapter72.toJsonTree(typeAdapterFactory75);
        com.google.gson.TypeAdapterFactory typeAdapterFactory77 = typeAdapterFactoryTypeAdapter10.fromJsonTree(jsonElement76);
        com.google.gson.JsonElement jsonElement78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory79 = typeAdapterFactoryTypeAdapter10.fromJsonTree(jsonElement78);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter9 = typeAdapterFactoryTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter10 = typeAdapterFactoryTypeAdapter8.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor11 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap12 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter13 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor11, strMap12);
        com.google.gson.internal.ConstructorConstructor constructorConstructor14 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy15 = null;
        com.google.gson.internal.Excluder excluder16 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory17 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor14, fieldNamingStrategy15, excluder16);
        com.google.gson.JsonElement jsonElement18 = typeAdapterFactoryAdapter13.toJsonTree((com.google.gson.TypeAdapterFactory) excluder16);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter19 = typeAdapterFactoryAdapter13.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor20 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap21 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter22 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor20, strMap21);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor23 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap24 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter25 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor23, strMap24);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor26 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap27 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter28 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor26, strMap27);
        com.google.gson.internal.ConstructorConstructor constructorConstructor29 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy30 = null;
        com.google.gson.internal.Excluder excluder31 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory32 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor29, fieldNamingStrategy30, excluder31);
        com.google.gson.JsonElement jsonElement33 = typeAdapterFactoryAdapter28.toJsonTree((com.google.gson.TypeAdapterFactory) excluder31);
        com.google.gson.TypeAdapterFactory typeAdapterFactory34 = typeAdapterFactoryAdapter25.fromJsonTree(jsonElement33);
        com.google.gson.TypeAdapterFactory typeAdapterFactory35 = typeAdapterFactoryAdapter22.fromJsonTree(jsonElement33);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor36 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap37 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter38 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor36, strMap37);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor39 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap40 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter41 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor39, strMap40);
        com.google.gson.internal.ConstructorConstructor constructorConstructor42 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy43 = null;
        com.google.gson.internal.Excluder excluder44 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory45 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor42, fieldNamingStrategy43, excluder44);
        com.google.gson.JsonElement jsonElement46 = typeAdapterFactoryAdapter41.toJsonTree((com.google.gson.TypeAdapterFactory) excluder44);
        com.google.gson.TypeAdapterFactory typeAdapterFactory47 = typeAdapterFactoryAdapter38.fromJsonTree(jsonElement46);
        com.google.gson.TypeAdapterFactory typeAdapterFactory48 = typeAdapterFactoryAdapter22.fromJsonTree(jsonElement46);
        com.google.gson.TypeAdapterFactory typeAdapterFactory49 = typeAdapterFactoryAdapter13.fromJsonTree(jsonElement46);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter50 = typeAdapterFactoryAdapter13.nullSafe();
        com.google.gson.TypeAdapterFactory typeAdapterFactory52 = typeAdapterFactoryAdapter13.fromJson("null");
        com.google.gson.internal.ConstructorConstructor constructorConstructor53 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy54 = null;
        com.google.gson.internal.Excluder excluder55 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory56 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor53, fieldNamingStrategy54, excluder55);
        com.google.gson.JsonElement jsonElement57 = typeAdapterFactoryAdapter13.toJsonTree((com.google.gson.TypeAdapterFactory) excluder55);
        com.google.gson.TypeAdapterFactory typeAdapterFactory58 = typeAdapterFactoryTypeAdapter10.fromJsonTree(jsonElement57);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter59 = typeAdapterFactoryTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapterFactory typeAdapterFactory60 = null;
        java.lang.String str61 = typeAdapterFactoryTypeAdapter10.toJson(typeAdapterFactory60);
        com.google.gson.internal.ConstructorConstructor constructorConstructor62 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy63 = null;
        com.google.gson.internal.Excluder excluder64 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory65 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor62, fieldNamingStrategy63, excluder64);
        com.google.gson.JsonElement jsonElement66 = typeAdapterFactoryTypeAdapter10.toJsonTree((com.google.gson.TypeAdapterFactory) excluder64);
        com.google.gson.JsonElement jsonElement67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory68 = typeAdapterFactoryTypeAdapter10.fromJsonTree(jsonElement67);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
        com.google.gson.internal.ConstructorConstructor constructorConstructor3 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = null;
        com.google.gson.internal.Excluder excluder5 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory6 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor3, fieldNamingStrategy4, excluder5);
        com.google.gson.JsonElement jsonElement7 = typeAdapterFactoryAdapter2.toJsonTree((com.google.gson.TypeAdapterFactory) excluder5);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter8 = typeAdapterFactoryAdapter2.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter9 = typeAdapterFactoryTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter10 = typeAdapterFactoryTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter11 = typeAdapterFactoryTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter12 = typeAdapterFactoryTypeAdapter11.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor13 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy14 = null;
        com.google.gson.internal.Excluder excluder15 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory16 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor13, fieldNamingStrategy14, excluder15);
        java.lang.String str17 = typeAdapterFactoryTypeAdapter12.toJson((com.google.gson.TypeAdapterFactory) excluder15);
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor18 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap19 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter20 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor18, strMap19);
        com.google.gson.internal.ConstructorConstructor constructorConstructor21 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy22 = null;
        com.google.gson.internal.Excluder excluder23 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory24 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor21, fieldNamingStrategy22, excluder23);
        com.google.gson.JsonElement jsonElement25 = typeAdapterFactoryAdapter20.toJsonTree((com.google.gson.TypeAdapterFactory) excluder23);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter26 = typeAdapterFactoryAdapter20.nullSafe();
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor27 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap28 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter29 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor27, strMap28);
        com.google.gson.internal.ConstructorConstructor constructorConstructor30 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy31 = null;
        com.google.gson.internal.Excluder excluder32 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory33 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor30, fieldNamingStrategy31, excluder32);
        com.google.gson.JsonElement jsonElement34 = typeAdapterFactoryAdapter29.toJsonTree((com.google.gson.TypeAdapterFactory) excluder32);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter35 = typeAdapterFactoryAdapter29.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor36 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy37 = null;
        com.google.gson.internal.Excluder excluder38 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory39 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor36, fieldNamingStrategy37, excluder38);
        com.google.gson.JsonElement jsonElement40 = typeAdapterFactoryTypeAdapter35.toJsonTree((com.google.gson.TypeAdapterFactory) excluder38);
        com.google.gson.TypeAdapterFactory typeAdapterFactory41 = typeAdapterFactoryTypeAdapter26.fromJsonTree(jsonElement40);
        com.google.gson.internal.ConstructorConstructor constructorConstructor42 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy43 = null;
        com.google.gson.internal.Excluder excluder44 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory45 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor42, fieldNamingStrategy43, excluder44);
        com.google.gson.JsonElement jsonElement46 = typeAdapterFactoryTypeAdapter26.toJsonTree((com.google.gson.TypeAdapterFactory) excluder44);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter47 = typeAdapterFactoryTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter48 = typeAdapterFactoryTypeAdapter47.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter49 = typeAdapterFactoryTypeAdapter48.nullSafe();
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter50 = typeAdapterFactoryTypeAdapter49.nullSafe();
        com.google.gson.internal.ConstructorConstructor constructorConstructor51 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy52 = null;
        com.google.gson.internal.Excluder excluder53 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory54 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor51, fieldNamingStrategy52, excluder53);
        com.google.gson.JsonElement jsonElement55 = typeAdapterFactoryTypeAdapter50.toJsonTree((com.google.gson.TypeAdapterFactory) excluder53);
        com.google.gson.internal.ConstructorConstructor constructorConstructor56 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy57 = null;
        com.google.gson.internal.Excluder excluder58 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory59 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor56, fieldNamingStrategy57, excluder58);
        com.google.gson.JsonElement jsonElement60 = typeAdapterFactoryTypeAdapter50.toJsonTree((com.google.gson.TypeAdapterFactory) excluder58);
        com.google.gson.TypeAdapterFactory typeAdapterFactory61 = null;
        com.google.gson.JsonElement jsonElement62 = typeAdapterFactoryTypeAdapter50.toJsonTree(typeAdapterFactory61);
        com.google.gson.TypeAdapterFactory typeAdapterFactory63 = typeAdapterFactoryTypeAdapter12.fromJsonTree(jsonElement62);
        com.google.gson.TypeAdapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryTypeAdapter64 = typeAdapterFactoryTypeAdapter12.nullSafe();
        com.google.gson.JsonElement jsonElement65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.TypeAdapterFactory typeAdapterFactory66 = typeAdapterFactoryTypeAdapter64.fromJsonTree(jsonElement65);
    }
}

