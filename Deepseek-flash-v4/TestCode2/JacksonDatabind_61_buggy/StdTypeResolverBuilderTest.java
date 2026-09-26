package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public class StdTypeResolverBuilderTest {

    private ObjectMapper mapper;
    private SerializationConfig serConfig;
    private DeserializationConfig deserConfig;
    private JavaType baseType;
    private Collection<NamedType> subtypes;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        serConfig = mapper.getSerializationConfig();
        deserConfig = mapper.getDeserializationConfig();
        baseType = mapper.getTypeFactory().constructType(String.class);
        subtypes = Collections.<NamedType>emptyList();
    }

    @Test
    public void testInitRejectsNullId() {
        try {
            new StdTypeResolverBuilder().init(null, null);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertEquals("idType can not be null", ex.getMessage());
        }
    }

    @Test
    public void testNoTypeInfoBuilderSkipsTypeProcessing() {
        StdTypeResolverBuilder builder = StdTypeResolverBuilder.noTypeInfoBuilder();
        assertNull(builder.buildTypeSerializer(null, null, null));
        assertNull(builder.buildTypeDeserializer(null, null, null));
    }

    @Test
    public void testInitSetsTypePropertyDefault() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        assertSame(builder, builder.init(JsonTypeInfo.Id.CLASS, null));
        assertEquals(JsonTypeInfo.Id.CLASS.getDefaultPropertyName(), builder.getTypeProperty());
    }

    @Test
    public void testInclusionRejectsNull() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        try {
            builder.inclusion(null);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertEquals("includeAs can not be null", ex.getMessage());
        }
    }

    @Test
    public void testTypePropertyNullAndEmptyRestoreDefault() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.CLASS, null);
        assertSame(builder, builder.typeProperty("typeId"));
        assertEquals("typeId", builder.getTypeProperty());
        builder.typeProperty(null);
        assertEquals(JsonTypeInfo.Id.CLASS.getDefaultPropertyName(), builder.getTypeProperty());
        builder.typeProperty("");
        assertEquals(JsonTypeInfo.Id.CLASS.getDefaultPropertyName(), builder.getTypeProperty());
    }

    @Test
    public void testDefaultImplAndTypeIdVisibility() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        assertNull(builder.getDefaultImpl());
        assertFalse(builder.isTypeIdVisible());
        assertSame(builder, builder.defaultImpl(String.class));
        assertSame(builder, builder.typeIdVisibility(true));
        assertSame(String.class, builder.getDefaultImpl());
        assertTrue(builder.isTypeIdVisible());
    }

    @Test
    public void testBuildTypeSerializerWithoutInitFails() {
        try {
            new StdTypeResolverBuilder()
                .buildTypeSerializer(serConfig, baseType, subtypes);
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException ex) {
            assertEquals("Can not build, 'init()' not yet called", ex.getMessage());
        }
    }

    @Test
    public void testBuildTypeDeserializerWithoutInitFails() {
        try {
            new StdTypeResolverBuilder()
                .buildTypeDeserializer(deserConfig, baseType, subtypes);
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException ex) {
            assertEquals("Can not build, 'init()' not yet called", ex.getMessage());
        }
    }

    @Test
    public void testBuildTypeSerializerInclusionVariants() {
        assertSerializerType(JsonTypeInfo.Id.CLASS, JsonTypeInfo.As.WRAPPER_ARRAY, AsArrayTypeSerializer.class);
        assertSerializerType(JsonTypeInfo.Id.CLASS, JsonTypeInfo.As.PROPERTY, AsPropertyTypeSerializer.class);
        assertSerializerType(JsonTypeInfo.Id.CLASS, JsonTypeInfo.As.WRAPPER_OBJECT, AsWrapperTypeSerializer.class);
        assertSerializerType(JsonTypeInfo.Id.CLASS, JsonTypeInfo.As.EXTERNAL_PROPERTY, AsExternalTypeSerializer.class);
        assertSerializerType(JsonTypeInfo.Id.CLASS, JsonTypeInfo.As.EXISTING_PROPERTY, AsExistingPropertyTypeSerializer.class);
    }

    @Test
    public void testBuildTypeDeserializerInclusionVariants() {
        assertDeserializerType(JsonTypeInfo.As.WRAPPER_ARRAY, AsArrayTypeDeserializer.class);
        assertDeserializerType(JsonTypeInfo.As.PROPERTY, AsPropertyTypeDeserializer.class);
        assertDeserializerType(JsonTypeInfo.As.EXISTING_PROPERTY, AsPropertyTypeDeserializer.class);
        assertDeserializerType(JsonTypeInfo.As.WRAPPER_OBJECT, AsWrapperTypeDeserializer.class);
        assertDeserializerType(JsonTypeInfo.As.EXTERNAL_PROPERTY, AsExternalTypeDeserializer.class);
    }

    @Test
    public void testBuildTypeSerializerWithAlternateIdTypes() {
        assertSerializerType(JsonTypeInfo.Id.MINIMAL_CLASS, JsonTypeInfo.As.PROPERTY, AsPropertyTypeSerializer.class);
        assertSerializerType(JsonTypeInfo.Id.NAME, JsonTypeInfo.As.PROPERTY, AsPropertyTypeSerializer.class);
    }

    @Test
    public void testBuildTypeSerializerWithCustomIdWithoutResolverFails() {
        try {
            buildSerializer(JsonTypeInfo.Id.CUSTOM, JsonTypeInfo.As.PROPERTY);
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException ex) {
            assertEquals("Do not know how to construct standard type id resolver for idType: CUSTOM", ex.getMessage());
        }
    }

    @Test
    public void testBuildTypeDeserializerWithDefaultImpl() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.CLASS, null)
                .inclusion(JsonTypeInfo.As.WRAPPER_ARRAY)
                .defaultImpl(Void.class);
        assertNotNull(builder.buildTypeDeserializer(deserConfig, baseType, subtypes));
        assertSame(Void.class, builder.getDefaultImpl());
    }

    @Test
    public void testBuildTypeDeserializerWithNoClassDefaultImpl() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.CLASS, null)
                .inclusion(JsonTypeInfo.As.WRAPPER_ARRAY)
                .defaultImpl(NoClass.class);
        assertNotNull(builder.buildTypeDeserializer(deserConfig, baseType, subtypes));
        assertSame(NoClass.class, builder.getDefaultImpl());
    }

    private TypeSerializer buildSerializer(JsonTypeInfo.Id idType, JsonTypeInfo.As includeAs) {
        return new StdTypeResolverBuilder()
                .init(idType, null)
                .inclusion(includeAs)
                .buildTypeSerializer(serConfig, baseType, subtypes);
    }

    private void assertSerializerType(JsonTypeInfo.Id idType, JsonTypeInfo.As includeAs, Class<?> expectedType) {
        TypeSerializer serializer = buildSerializer(idType, includeAs);
        assertNotNull("Serializer should not be null for " + idType + "/" + includeAs, serializer);
        assertTrue("Expected " + expectedType.getName() + " but got " + serializer.getClass().getName(),
                expectedType.isInstance(serializer));
    }

    private void assertDeserializerType(JsonTypeInfo.As includeAs, Class<?> expectedType) {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.CLASS, null)
                .inclusion(includeAs);
        TypeDeserializer deserializer = builder.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull("Deserializer should not be null for " + includeAs, deserializer);
        assertTrue("Expected " + expectedType.getName() + " but got " + deserializer.getClass().getName(),
                expectedType.isInstance(deserializer));
    }
}