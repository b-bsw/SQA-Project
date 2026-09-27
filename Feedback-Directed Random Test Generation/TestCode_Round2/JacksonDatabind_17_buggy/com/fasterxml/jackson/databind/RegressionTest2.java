package com.fasterxml.jackson.databind;

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
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping2 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper1.enableDefaultTypingAsProperty(defaultTyping2, "null");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder5 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping2);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping6 = defaultTypeResolverBuilder5._appliesFor;
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = defaultTypeResolverBuilder5.typeIdVisibility(true);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder10 = stdTypeResolverBuilder8.typeProperty("hi!");
        org.junit.Assert.assertTrue("'" + defaultTyping2 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping2.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + defaultTyping6 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping6.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder10);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        java.lang.Class<?> wildcardClass1 = stdTypeResolverBuilder0.getDefaultImpl();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = stdTypeResolverBuilder0.typeProperty("null");
        java.lang.Class<?> wildcardClass4 = stdTypeResolverBuilder3.getDefaultImpl();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNull(wildcardClass4);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = objectMapper1._deserializationConfig;
        com.fasterxml.jackson.databind.util.RootNameLookup rootNameLookup3 = objectMapper1._rootNames;
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper1.setInjectableValues(injectableValues4);
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory6);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker8 = objectMapper7.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader9 = objectMapper7.reader();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig10 = objectMapper7._serializationConfig;
        java.text.DateFormat dateFormat11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper7.setDateFormat(dateFormat11);
        com.fasterxml.jackson.core.Base64Variant base64Variant13 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter14 = objectMapper7.writer(base64Variant13);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = objectMapper7.enableDefaultTyping();
        com.fasterxml.jackson.databind.MapperFeature[] mapperFeatureArray16 = new com.fasterxml.jackson.databind.MapperFeature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = objectMapper15.disable(mapperFeatureArray16);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper1.enable(mapperFeatureArray16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory19);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker21 = objectMapper20.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader22 = objectMapper20.reader();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig23 = objectMapper20._serializationConfig;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider24 = objectMapper20._serializerProvider;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper26 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory25);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker27 = objectMapper26.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator28 = null;
        java.lang.Object obj29 = objectMapper26.setHandlerInstantiator(handlerInstantiator28);
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory30);
        java.lang.String str32 = objectMapper26.writeValueAsString((java.lang.Object) jsonFactory30);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping33 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper34 = objectMapper26.enableDefaultTyping(defaultTyping33);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping35 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper36 = objectMapper26.enableDefaultTyping(defaultTyping35);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory37 = objectMapper36.getNodeFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper38 = objectMapper20.setNodeFactory(jsonNodeFactory37);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper39 = objectMapper1.setNodeFactory(jsonNodeFactory37);
        com.fasterxml.jackson.databind.InjectableValues injectableValues40 = null;
        objectMapper1._injectableValues = injectableValues40;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = objectMapper1.copy();
        com.fasterxml.jackson.core.Base64Variant base64Variant43 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper44 = objectMapper42.setBase64Variant(base64Variant43);
        com.fasterxml.jackson.databind.MapperFeature mapperFeature45 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = objectMapper44.isEnabled(mapperFeature45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deserializationConfig2);
        org.junit.Assert.assertNotNull(rootNameLookup3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker8);
        org.junit.Assert.assertNotNull(objectReader9);
        org.junit.Assert.assertNotNull(serializationConfig10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectWriter14);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(mapperFeatureArray16);
        org.junit.Assert.assertArrayEquals(mapperFeatureArray16, new com.fasterxml.jackson.databind.MapperFeature[] {});
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker21);
        org.junit.Assert.assertNotNull(objectReader22);
        org.junit.Assert.assertNotNull(serializationConfig23);
        org.junit.Assert.assertNotNull(defaultSerializerProvider24);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertTrue("'" + defaultTyping33 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping33.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper34);
        org.junit.Assert.assertTrue("'" + defaultTyping35 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping35.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper36);
        org.junit.Assert.assertNotNull(jsonNodeFactory37);
        org.junit.Assert.assertNotNull(objectMapper38);
        org.junit.Assert.assertNotNull(objectMapper39);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertNotNull(objectMapper44);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker2 = objectMapper1.getVisibilityChecker();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper1._jsonFactory;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory3);
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper4.setInjectableValues(injectableValues5);
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory7);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker9 = objectMapper8.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator10 = null;
        java.lang.Object obj11 = objectMapper8.setHandlerInstantiator(handlerInstantiator10);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory12);
        java.lang.String str14 = objectMapper8.writeValueAsString((java.lang.Object) jsonFactory12);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping15 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = objectMapper8.enableDefaultTyping(defaultTyping15);
        java.util.Locale locale17 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper8.setLocale(locale17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory19);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker21 = objectMapper20.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator22 = null;
        java.lang.Object obj23 = objectMapper20.setHandlerInstantiator(handlerInstantiator22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory24);
        java.lang.String str26 = objectMapper20.writeValueAsString((java.lang.Object) jsonFactory24);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping27 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper28 = objectMapper20.enableDefaultTyping(defaultTyping27);
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap29 = objectMapper20._rootDeserializers;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory30);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker32 = objectMapper31.getVisibilityChecker();
        byte[] byteArray33 = objectMapper20.writeValueAsBytes((java.lang.Object) wildcardVisibilityChecker32);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider34 = objectMapper20._serializerProvider;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper36 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory35);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker37 = objectMapper36.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator38 = null;
        java.lang.Object obj39 = objectMapper36.setHandlerInstantiator(handlerInstantiator38);
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper41 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory40);
        java.lang.String str42 = objectMapper36.writeValueAsString((java.lang.Object) jsonFactory40);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping43 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper44 = objectMapper36.enableDefaultTyping(defaultTyping43);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping45 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper46 = objectMapper36.enableDefaultTyping(defaultTyping45);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory47 = objectMapper46.getNodeFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader48 = objectMapper20.reader(jsonNodeFactory47);
        com.fasterxml.jackson.core.JsonFactory jsonFactory49 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper50 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory49);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig51 = objectMapper50._deserializationConfig;
        com.fasterxml.jackson.core.FormatSchema formatSchema52 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader53 = objectMapper50.reader(formatSchema52);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper54 = objectMapper50.copy();
        java.util.HashMap<com.fasterxml.jackson.databind.type.ClassKey, java.lang.Class<?>> classKeyMap55 = objectMapper50._mixInAnnotations;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory56 = objectMapper50.getNodeFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper57 = objectMapper20.setNodeFactory(jsonNodeFactory56);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper58 = objectMapper18.setNodeFactory(jsonNodeFactory56);
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper60 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory59);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker61 = objectMapper60.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator62 = null;
        java.lang.Object obj63 = objectMapper60.setHandlerInstantiator(handlerInstantiator62);
        com.fasterxml.jackson.core.JsonFactory jsonFactory64 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper65 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory64);
        java.lang.String str66 = objectMapper60.writeValueAsString((java.lang.Object) jsonFactory64);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping67 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper68 = objectMapper60.enableDefaultTyping(defaultTyping67);
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap69 = objectMapper60._rootDeserializers;
        com.fasterxml.jackson.core.JsonFactory jsonFactory70 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper71 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory70);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker72 = objectMapper71.getVisibilityChecker();
        byte[] byteArray73 = objectMapper60.writeValueAsBytes((java.lang.Object) wildcardVisibilityChecker72);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider74 = objectMapper60._serializerProvider;
        objectMapper18._serializerProvider = defaultSerializerProvider74;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper76 = objectMapper4.setSerializerProvider(defaultSerializerProvider74);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory77 = objectMapper4.getNodeFactory();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig78 = objectMapper4._serializationConfig;
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertTrue("'" + defaultTyping15 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping15.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertTrue("'" + defaultTyping27 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping27.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper28);
        org.junit.Assert.assertNotNull(javaTypeMap29);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 123, (byte) 125 });
        org.junit.Assert.assertNotNull(defaultSerializerProvider34);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker37);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "null" + "'", str42, "null");
        org.junit.Assert.assertTrue("'" + defaultTyping43 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping43.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertTrue("'" + defaultTyping45 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping45.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper46);
        org.junit.Assert.assertNotNull(jsonNodeFactory47);
        org.junit.Assert.assertNotNull(objectReader48);
        org.junit.Assert.assertNotNull(deserializationConfig51);
        org.junit.Assert.assertNotNull(objectReader53);
        org.junit.Assert.assertNotNull(objectMapper54);
        org.junit.Assert.assertNotNull(classKeyMap55);
        org.junit.Assert.assertNotNull(jsonNodeFactory56);
        org.junit.Assert.assertNotNull(objectMapper57);
        org.junit.Assert.assertNotNull(objectMapper58);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker61);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "null" + "'", str66, "null");
        org.junit.Assert.assertTrue("'" + defaultTyping67 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping67.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper68);
        org.junit.Assert.assertNotNull(javaTypeMap69);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker72);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 123, (byte) 125 });
        org.junit.Assert.assertNotNull(defaultSerializerProvider74);
        org.junit.Assert.assertNotNull(objectMapper76);
        org.junit.Assert.assertNotNull(jsonNodeFactory77);
        org.junit.Assert.assertNotNull(serializationConfig78);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeIdVisibility(false);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder2.typeProperty("true");
        java.lang.String str5 = stdTypeResolverBuilder2.getTypeProperty();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "true" + "'", str5, "true");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker2 = objectMapper1.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator3 = null;
        java.lang.Object obj4 = objectMapper1.setHandlerInstantiator(handlerInstantiator3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        java.lang.String str7 = objectMapper1.writeValueAsString((java.lang.Object) jsonFactory5);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping8 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = objectMapper1.enableDefaultTyping(defaultTyping8);
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = objectMapper1._rootDeserializers;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory11);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker13 = objectMapper12.getVisibilityChecker();
        byte[] byteArray14 = objectMapper1.writeValueAsBytes((java.lang.Object) wildcardVisibilityChecker13);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider15 = objectMapper1._serializerProvider;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory16);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker18 = objectMapper17.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator19 = null;
        java.lang.Object obj20 = objectMapper17.setHandlerInstantiator(handlerInstantiator19);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory21);
        java.lang.String str23 = objectMapper17.writeValueAsString((java.lang.Object) jsonFactory21);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping24 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = objectMapper17.enableDefaultTyping(defaultTyping24);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping26 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = objectMapper17.enableDefaultTyping(defaultTyping26);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = objectMapper27.getNodeFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader29 = objectMapper1.reader(jsonNodeFactory28);
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory30);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker32 = objectMapper31.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator33 = null;
        java.lang.Object obj34 = objectMapper31.setHandlerInstantiator(handlerInstantiator33);
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper36 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory35);
        java.lang.String str37 = objectMapper31.writeValueAsString((java.lang.Object) jsonFactory35);
        java.lang.String str38 = objectMapper1.writeValueAsString((java.lang.Object) jsonFactory35);
        com.fasterxml.jackson.databind.JavaType javaType39 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader40 = objectMapper1.reader(javaType39);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper41 = new com.fasterxml.jackson.databind.ObjectMapper(objectMapper1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper43 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory42);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker44 = objectMapper43.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator45 = null;
        java.lang.Object obj46 = objectMapper43.setHandlerInstantiator(handlerInstantiator45);
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper48 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory47);
        java.lang.String str49 = objectMapper43.writeValueAsString((java.lang.Object) jsonFactory47);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping50 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper51 = objectMapper43.enableDefaultTyping(defaultTyping50);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping52 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper53 = objectMapper43.enableDefaultTyping(defaultTyping52);
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory54 = objectMapper43._serializerFactory;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory55 = objectMapper43.getNodeFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader56 = objectMapper1.reader(jsonNodeFactory55);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertTrue("'" + defaultTyping8 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping8.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 123, (byte) 125 });
        org.junit.Assert.assertNotNull(defaultSerializerProvider15);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertTrue("'" + defaultTyping24 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping24.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertTrue("'" + defaultTyping26 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping26.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(jsonNodeFactory28);
        org.junit.Assert.assertNotNull(objectReader29);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "null" + "'", str37, "null");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null" + "'", str38, "null");
        org.junit.Assert.assertNotNull(objectReader40);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker44);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "null" + "'", str49, "null");
        org.junit.Assert.assertTrue("'" + defaultTyping50 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping50.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper51);
        org.junit.Assert.assertTrue("'" + defaultTyping52 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping52.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper53);
        org.junit.Assert.assertNotNull(serializerFactory54);
        org.junit.Assert.assertNotNull(jsonNodeFactory55);
        org.junit.Assert.assertNotNull(objectReader56);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = objectMapper1._deserializationConfig;
        com.fasterxml.jackson.core.FormatSchema formatSchema3 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader4 = objectMapper1.reader(formatSchema3);
        com.fasterxml.jackson.core.Base64Variant base64Variant5 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader6 = objectMapper1.reader(base64Variant5);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper1.enableDefaultTyping();
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = objectMapper7.setBase64Variant(base64Variant8);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider10 = objectMapper9._serializerProvider;
        org.junit.Assert.assertNotNull(deserializationConfig2);
        org.junit.Assert.assertNotNull(objectReader4);
        org.junit.Assert.assertNotNull(objectReader6);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(defaultSerializerProvider10);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker2 = objectMapper1.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator3 = null;
        java.lang.Object obj4 = objectMapper1.setHandlerInstantiator(handlerInstantiator3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        java.lang.String str7 = objectMapper1.writeValueAsString((java.lang.Object) jsonFactory5);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping8 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = objectMapper1.enableDefaultTyping(defaultTyping8);
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = objectMapper1._rootDeserializers;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory11);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker13 = objectMapper12.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader14 = objectMapper12.reader();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = objectMapper12.getTypeFactory();
        objectMapper1._typeFactory = typeFactory15;
        com.fasterxml.jackson.databind.jsontype.SubtypeResolver subtypeResolver17 = objectMapper1.getSubtypeResolver();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig18 = objectMapper1.getDeserializationConfig();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = objectMapper1.enableDefaultTyping();
        com.fasterxml.jackson.core.Base64Variant base64Variant20 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = objectMapper19.setBase64Variant(base64Variant20);
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes22 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter23 = objectMapper21.writer(contextAttributes22);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertTrue("'" + defaultTyping8 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping8.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker13);
        org.junit.Assert.assertNotNull(objectReader14);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(subtypeResolver17);
        org.junit.Assert.assertNotNull(deserializationConfig18);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(objectWriter23);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker2 = objectMapper1.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader3 = objectMapper1.reader();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = objectMapper1._serializationConfig;
        java.text.DateFormat dateFormat5 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper1.setDateFormat(dateFormat5);
        com.fasterxml.jackson.core.Base64Variant base64Variant7 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter8 = objectMapper1.writer(base64Variant7);
        com.fasterxml.jackson.core.Base64Variant base64Variant9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = objectMapper1.writer(base64Variant9);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder11 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder13 = stdTypeResolverBuilder11.typeIdVisibility(false);
        java.lang.Class<?> wildcardClass14 = stdTypeResolverBuilder13.getDefaultImpl();
        java.lang.Class<?> wildcardClass15 = stdTypeResolverBuilder13.getDefaultImpl();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder17 = stdTypeResolverBuilder13.typeIdVisibility(false);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper1.setDefaultTyping((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder<com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder>) stdTypeResolverBuilder17);
        com.fasterxml.jackson.databind.InjectableValues injectableValues19 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader20 = objectMapper1.reader(injectableValues19);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker2);
        org.junit.Assert.assertNotNull(objectReader3);
        org.junit.Assert.assertNotNull(serializationConfig4);
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(objectWriter8);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder11);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder13);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder17);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(objectReader20);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker2 = objectMapper1.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader3 = objectMapper1.reader();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = new com.fasterxml.jackson.databind.ObjectMapper(objectMapper1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = objectMapper1.getDeserializationConfig();
        com.fasterxml.jackson.core.Base64Variant base64Variant6 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper1.reader(base64Variant6);
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory8 = objectMapper1._serializerFactory;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory9);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker11 = objectMapper10.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator12 = null;
        java.lang.Object obj13 = objectMapper10.setHandlerInstantiator(handlerInstantiator12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory14);
        java.lang.String str16 = objectMapper10.writeValueAsString((java.lang.Object) jsonFactory14);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping17 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper10.enableDefaultTyping(defaultTyping17);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping19 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = objectMapper10.enableDefaultTyping(defaultTyping19);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig21 = objectMapper10.getDeserializationConfig();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = objectMapper1.setConfig(deserializationConfig21);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = new com.fasterxml.jackson.databind.ObjectMapper(objectMapper1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode24 = objectMapper23.createArrayNode();
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker2);
        org.junit.Assert.assertNotNull(objectReader3);
        org.junit.Assert.assertNotNull(deserializationConfig5);
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(serializerFactory8);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertTrue("'" + defaultTyping17 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping17.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertTrue("'" + defaultTyping19 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping19.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(deserializationConfig21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(arrayNode24);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = objectMapper1._deserializationConfig;
        com.fasterxml.jackson.databind.util.RootNameLookup rootNameLookup3 = objectMapper1._rootNames;
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper1.setInjectableValues(injectableValues4);
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory6);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker8 = objectMapper7.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader9 = objectMapper7.reader();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig10 = objectMapper7._serializationConfig;
        java.text.DateFormat dateFormat11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper7.setDateFormat(dateFormat11);
        com.fasterxml.jackson.core.Base64Variant base64Variant13 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter14 = objectMapper7.writer(base64Variant13);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = objectMapper7.enableDefaultTyping();
        com.fasterxml.jackson.databind.MapperFeature[] mapperFeatureArray16 = new com.fasterxml.jackson.databind.MapperFeature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = objectMapper15.disable(mapperFeatureArray16);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper1.enable(mapperFeatureArray16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory19);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker21 = objectMapper20.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader22 = objectMapper20.reader();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig23 = objectMapper20._serializationConfig;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider24 = objectMapper20._serializerProvider;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper26 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory25);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker27 = objectMapper26.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator28 = null;
        java.lang.Object obj29 = objectMapper26.setHandlerInstantiator(handlerInstantiator28);
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory30);
        java.lang.String str32 = objectMapper26.writeValueAsString((java.lang.Object) jsonFactory30);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping33 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper34 = objectMapper26.enableDefaultTyping(defaultTyping33);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping35 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper36 = objectMapper26.enableDefaultTyping(defaultTyping35);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory37 = objectMapper36.getNodeFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper38 = objectMapper20.setNodeFactory(jsonNodeFactory37);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper39 = objectMapper1.setNodeFactory(jsonNodeFactory37);
        com.fasterxml.jackson.databind.InjectableValues injectableValues40 = null;
        objectMapper1._injectableValues = injectableValues40;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = objectMapper1.copy();
        com.fasterxml.jackson.core.Base64Variant base64Variant43 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper44 = objectMapper42.setBase64Variant(base64Variant43);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext45 = objectMapper42.getDeserializationContext();
        org.junit.Assert.assertNotNull(deserializationConfig2);
        org.junit.Assert.assertNotNull(rootNameLookup3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker8);
        org.junit.Assert.assertNotNull(objectReader9);
        org.junit.Assert.assertNotNull(serializationConfig10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectWriter14);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(mapperFeatureArray16);
        org.junit.Assert.assertArrayEquals(mapperFeatureArray16, new com.fasterxml.jackson.databind.MapperFeature[] {});
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker21);
        org.junit.Assert.assertNotNull(objectReader22);
        org.junit.Assert.assertNotNull(serializationConfig23);
        org.junit.Assert.assertNotNull(defaultSerializerProvider24);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertTrue("'" + defaultTyping33 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping33.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper34);
        org.junit.Assert.assertTrue("'" + defaultTyping35 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping35.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper36);
        org.junit.Assert.assertNotNull(jsonNodeFactory37);
        org.junit.Assert.assertNotNull(objectMapper38);
        org.junit.Assert.assertNotNull(objectMapper39);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertNotNull(deserializationContext45);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker2 = objectMapper1.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader3 = objectMapper1.reader();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = objectMapper1._serializationConfig;
        java.text.DateFormat dateFormat5 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper1.setDateFormat(dateFormat5);
        com.fasterxml.jackson.core.Base64Variant base64Variant7 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter8 = objectMapper1.writer(base64Variant7);
        com.fasterxml.jackson.core.Base64Variant base64Variant9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = objectMapper1.writer(base64Variant9);
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory11);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker13 = objectMapper12.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader14 = objectMapper12.reader();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig15 = objectMapper12._serializationConfig;
        java.text.DateFormat dateFormat16 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = objectMapper12.setDateFormat(dateFormat16);
        com.fasterxml.jackson.core.Base64Variant base64Variant18 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter19 = objectMapper12.writer(base64Variant18);
        com.fasterxml.jackson.core.Base64Variant base64Variant20 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter21 = objectMapper12.writer(base64Variant20);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider22 = null;
        objectMapper12._serializerProvider = defaultSerializerProvider22;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory24);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker26 = objectMapper25.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader27 = objectMapper25.reader();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig28 = objectMapper25._serializationConfig;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider29 = objectMapper25._serializerProvider;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectMapper25.createObjectNode();
        com.fasterxml.jackson.core.JsonParser jsonParser31 = objectMapper12.treeAsTokens((com.fasterxml.jackson.core.TreeNode) objectNode30);
        com.fasterxml.jackson.core.JsonParser jsonParser32 = objectMapper1.treeAsTokens((com.fasterxml.jackson.core.TreeNode) objectNode30);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes33 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter34 = objectMapper1.writer(characterEscapes33);
        com.fasterxml.jackson.databind.InjectableValues injectableValues35 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper36 = objectMapper1.setInjectableValues(injectableValues35);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker2);
        org.junit.Assert.assertNotNull(objectReader3);
        org.junit.Assert.assertNotNull(serializationConfig4);
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(objectWriter8);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker13);
        org.junit.Assert.assertNotNull(objectReader14);
        org.junit.Assert.assertNotNull(serializationConfig15);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(objectWriter19);
        org.junit.Assert.assertNotNull(objectWriter21);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker26);
        org.junit.Assert.assertNotNull(objectReader27);
        org.junit.Assert.assertNotNull(serializationConfig28);
        org.junit.Assert.assertNotNull(defaultSerializerProvider29);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertNotNull(objectWriter34);
        org.junit.Assert.assertNotNull(objectMapper36);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = objectMapper0._jsonFactory;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory2);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker4 = objectMapper3.getVisibilityChecker();
        java.text.DateFormat dateFormat5 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper3.setDateFormat(dateFormat5);
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = objectMapper8._deserializationConfig;
        com.fasterxml.jackson.databind.util.RootNameLookup rootNameLookup10 = objectMapper8._rootNames;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = objectMapper8.getDeserializationConfig();
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory12);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = objectMapper13._deserializationConfig;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectMapper13.createObjectNode();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = objectMapper8.treeAsTokens((com.fasterxml.jackson.core.TreeNode) objectNode15);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory17);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker19 = objectMapper18.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader20 = objectMapper18.reader();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = new com.fasterxml.jackson.databind.ObjectMapper(objectMapper18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory22);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker24 = objectMapper23.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader25 = objectMapper23.reader();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig26 = objectMapper23._serializationConfig;
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory27 = objectMapper23._serializerFactory;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory28);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig30 = objectMapper29._deserializationConfig;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectMapper29.createObjectNode();
        com.fasterxml.jackson.core.JsonParser jsonParser32 = objectMapper23.treeAsTokens((com.fasterxml.jackson.core.TreeNode) objectNode31);
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper34 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory33);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig35 = objectMapper34._deserializationConfig;
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext36 = objectMapper21.createDeserializationContext(jsonParser32, deserializationConfig35);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext37 = objectMapper6.createDeserializationContext(jsonParser16, deserializationConfig35);
        com.fasterxml.jackson.core.JsonToken jsonToken38 = objectMapper0._initForReading(jsonParser16);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper41 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory40);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker42 = objectMapper41.getVisibilityChecker();
        java.text.DateFormat dateFormat43 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper44 = objectMapper41.setDateFormat(dateFormat43);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper46 = objectMapper41.setTypeFactory(typeFactory45);
        java.util.HashMap<com.fasterxml.jackson.databind.type.ClassKey, java.lang.Class<?>> classKeyMap47 = objectMapper41._mixInAnnotations;
        // The following exception was thrown during execution in test generation
        try {
            objectMapper0._configAndWriteValue(jsonGenerator39, (java.lang.Object) classKeyMap47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory1);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker4);
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(deserializationConfig9);
        org.junit.Assert.assertNotNull(rootNameLookup10);
        org.junit.Assert.assertNotNull(deserializationConfig11);
        org.junit.Assert.assertNotNull(deserializationConfig14);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker19);
        org.junit.Assert.assertNotNull(objectReader20);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker24);
        org.junit.Assert.assertNotNull(objectReader25);
        org.junit.Assert.assertNotNull(serializationConfig26);
        org.junit.Assert.assertNotNull(serializerFactory27);
        org.junit.Assert.assertNotNull(deserializationConfig30);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertNotNull(deserializationConfig35);
        org.junit.Assert.assertNotNull(defaultDeserializationContext36);
        org.junit.Assert.assertNotNull(defaultDeserializationContext37);
        org.junit.Assert.assertTrue("'" + jsonToken38 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken38.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker42);
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertNotNull(objectMapper46);
        org.junit.Assert.assertNotNull(classKeyMap47);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker2 = objectMapper1.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator3 = null;
        java.lang.Object obj4 = objectMapper1.setHandlerInstantiator(handlerInstantiator3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        java.lang.String str7 = objectMapper1.writeValueAsString((java.lang.Object) jsonFactory5);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping8 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = objectMapper1.enableDefaultTyping(defaultTyping8);
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = objectMapper1._rootDeserializers;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory11);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker13 = objectMapper12.getVisibilityChecker();
        byte[] byteArray14 = objectMapper1.writeValueAsBytes((java.lang.Object) wildcardVisibilityChecker13);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig15 = objectMapper1._serializationConfig;
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertTrue("'" + defaultTyping8 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping8.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 123, (byte) 125 });
        org.junit.Assert.assertNotNull(serializationConfig15);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker2 = objectMapper1.getVisibilityChecker();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper1._jsonFactory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = objectMapper1.getTypeFactory();
        java.lang.ClassLoader classLoader5 = null;
        java.util.List<com.fasterxml.jackson.databind.Module> moduleList6 = com.fasterxml.jackson.databind.ObjectMapper.findModules(classLoader5);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper1.registerModules((java.lang.Iterable<com.fasterxml.jackson.databind.Module>) moduleList6);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter8 = objectMapper1.writer();
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(moduleList6);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(objectWriter8);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker2 = objectMapper1.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader3 = objectMapper1.reader();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = objectMapper1._serializationConfig;
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory5 = objectMapper1._serializerFactory;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = objectMapper7._deserializationConfig;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectMapper7.createObjectNode();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = objectMapper1.treeAsTokens((com.fasterxml.jackson.core.TreeNode) objectNode9);
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = objectMapper1.writer(formatSchema11);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker13 = objectMapper1.getVisibilityChecker();
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory14);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker16 = objectMapper15.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader17 = objectMapper15.reader();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig18 = objectMapper15._serializationConfig;
        java.text.DateFormat dateFormat19 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = objectMapper15.setDateFormat(dateFormat19);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = objectMapper20.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory22);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker24 = objectMapper23.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader25 = objectMapper23.reader();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig26 = objectMapper23._serializationConfig;
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory27 = objectMapper23._serializerFactory;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper28 = objectMapper20.setSerializerFactory(serializerFactory27);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = objectMapper1.setSerializerFactory(serializerFactory27);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper32 = objectMapper29.configure(serializationFeature30, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker2);
        org.junit.Assert.assertNotNull(objectReader3);
        org.junit.Assert.assertNotNull(serializationConfig4);
        org.junit.Assert.assertNotNull(serializerFactory5);
        org.junit.Assert.assertNotNull(deserializationConfig8);
        org.junit.Assert.assertNotNull(objectNode9);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(objectWriter12);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker13);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker16);
        org.junit.Assert.assertNotNull(objectReader17);
        org.junit.Assert.assertNotNull(serializationConfig18);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker24);
        org.junit.Assert.assertNotNull(objectReader25);
        org.junit.Assert.assertNotNull(serializationConfig26);
        org.junit.Assert.assertNotNull(serializerFactory27);
        org.junit.Assert.assertNotNull(objectMapper28);
        org.junit.Assert.assertNotNull(objectMapper29);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker2 = objectMapper1.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator3 = null;
        java.lang.Object obj4 = objectMapper1.setHandlerInstantiator(handlerInstantiator3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        java.lang.String str7 = objectMapper1.writeValueAsString((java.lang.Object) jsonFactory5);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping8 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = objectMapper1.enableDefaultTyping(defaultTyping8);
        java.util.Locale locale10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper1.setLocale(locale10);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory12);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker14 = objectMapper13.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator15 = null;
        java.lang.Object obj16 = objectMapper13.setHandlerInstantiator(handlerInstantiator15);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory17);
        java.lang.String str19 = objectMapper13.writeValueAsString((java.lang.Object) jsonFactory17);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping20 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = objectMapper13.enableDefaultTyping(defaultTyping20);
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap22 = objectMapper13._rootDeserializers;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper24 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory23);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker25 = objectMapper24.getVisibilityChecker();
        byte[] byteArray26 = objectMapper13.writeValueAsBytes((java.lang.Object) wildcardVisibilityChecker25);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider27 = objectMapper13._serializerProvider;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory28);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker30 = objectMapper29.getVisibilityChecker();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator31 = null;
        java.lang.Object obj32 = objectMapper29.setHandlerInstantiator(handlerInstantiator31);
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper34 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory33);
        java.lang.String str35 = objectMapper29.writeValueAsString((java.lang.Object) jsonFactory33);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping36 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper37 = objectMapper29.enableDefaultTyping(defaultTyping36);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping38 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper39 = objectMapper29.enableDefaultTyping(defaultTyping38);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory40 = objectMapper39.getNodeFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader41 = objectMapper13.reader(jsonNodeFactory40);
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper43 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory42);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig44 = objectMapper43._deserializationConfig;
        com.fasterxml.jackson.core.FormatSchema formatSchema45 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader46 = objectMapper43.reader(formatSchema45);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper47 = objectMapper43.copy();
        java.util.HashMap<com.fasterxml.jackson.databind.type.ClassKey, java.lang.Class<?>> classKeyMap48 = objectMapper43._mixInAnnotations;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory49 = objectMapper43.getNodeFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper50 = objectMapper13.setNodeFactory(jsonNodeFactory49);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper51 = objectMapper11.setNodeFactory(jsonNodeFactory49);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper52 = objectMapper11.clearProblemHandlers();
        java.io.File file53 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum<com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping> defaultTypingEnum55 = objectMapper52.readValue(file53, typeReference54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertTrue("'" + defaultTyping8 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping8.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null" + "'", str19, "null");
        org.junit.Assert.assertTrue("'" + defaultTyping20 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping20.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(javaTypeMap22);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 123, (byte) 125 });
        org.junit.Assert.assertNotNull(defaultSerializerProvider27);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker30);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "null" + "'", str35, "null");
        org.junit.Assert.assertTrue("'" + defaultTyping36 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping36.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper37);
        org.junit.Assert.assertTrue("'" + defaultTyping38 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping38.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper39);
        org.junit.Assert.assertNotNull(jsonNodeFactory40);
        org.junit.Assert.assertNotNull(objectReader41);
        org.junit.Assert.assertNotNull(deserializationConfig44);
        org.junit.Assert.assertNotNull(objectReader46);
        org.junit.Assert.assertNotNull(objectMapper47);
        org.junit.Assert.assertNotNull(classKeyMap48);
        org.junit.Assert.assertNotNull(jsonNodeFactory49);
        org.junit.Assert.assertNotNull(objectMapper50);
        org.junit.Assert.assertNotNull(objectMapper51);
        org.junit.Assert.assertNotNull(objectMapper52);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker2 = objectMapper1.getVisibilityChecker();
        com.fasterxml.jackson.databind.ObjectReader objectReader3 = objectMapper1.reader();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = objectMapper1._serializationConfig;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider5 = objectMapper1._serializerProvider;
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker6 = objectMapper1.getVisibilityChecker();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader8 = objectMapper1.reader(javaType7);
        int int9 = objectMapper1.mixInCount();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper1.copy();
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes11 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = objectMapper1.writer(contextAttributes11);
        com.fasterxml.jackson.core.JsonParser.Feature feature13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = objectMapper1.isEnabled(feature13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker2);
        org.junit.Assert.assertNotNull(objectReader3);
        org.junit.Assert.assertNotNull(serializationConfig4);
        org.junit.Assert.assertNotNull(defaultSerializerProvider5);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker6);
        org.junit.Assert.assertNotNull(objectReader8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectWriter12);
    }
}

