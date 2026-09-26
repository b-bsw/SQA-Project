package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;

public class StdSubtypeResolverTest {

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
    @JsonSubTypes({
        @JsonSubTypes.Type(value = SubA.class, name = "subA"),
        @JsonSubTypes.Type(value = SubB.class, name = "subB")
    })
    abstract static class BaseWithAnnotations {
    }

    static class SubA extends BaseWithAnnotations {
    }

    static class SubB extends BaseWithAnnotations {
    }

    abstract static class PlainBase {
    }

    static class PlainSubA extends PlainBase {
    }

    static class PlainSubB extends PlainBase {
    }

    static class ConcreteBase {
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
    @JsonSubTypes({
        @JsonSubTypes.Type(value = SubA2.class, name = "subA2"),
        @JsonSubTypes.Type(value = SubB2.class, name = "subB2")
    })
    abstract static class AbstractBase2 {
    }

    static class SubA2 extends AbstractBase2 {
    }

    static class SubB2 extends AbstractBase2 {
    }

    static class Wrapper {
        @JsonSubTypes({
            @JsonSubTypes.Type(value = SubA2.class, name = "subA2"),
            @JsonSubTypes.Type(value = SubB2.class, name = "subB2")
        })
        public AbstractBase2 value;
    }

    private ObjectMapper mapper;
    private StdSubtypeResolver resolver;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        resolver = new StdSubtypeResolver();
    }

    @Test
    public void testRegisterSubtypesWithNamedTypeVarargs() {
        resolver.registerSubtypes(
                new NamedType(PlainSubA.class, "plainA"),
                new NamedType(PlainSubB.class, "plainB"));

        assertNotNull(resolver._registeredSubtypes);
        assertEquals(2, resolver._registeredSubtypes.size());

        Iterator<NamedType> it = resolver._registeredSubtypes.iterator();
        NamedType a = it.next();
        assertEquals(PlainSubA.class, a.getType());
        assertEquals("plainA", a.getName());

        NamedType b = it.next();
        assertEquals(PlainSubB.class, b.getType());
        assertEquals("plainB", b.getName());
    }

    @Test
    public void testRegisterSubtypesWithClassVarargs() {
        resolver.registerSubtypes(PlainSubA.class, PlainSubB.class);

        assertNotNull(resolver._registeredSubtypes);
        assertEquals(2, resolver._registeredSubtypes.size());

        Iterator<NamedType> it = resolver._registeredSubtypes.iterator();
        assertEquals(PlainSubA.class, it.next().getType());
        assertEquals(PlainSubB.class, it.next().getType());
    }

    @Test
    public void testRegisterSubtypesWithEmptyVarargs() {
        resolver.registerSubtypes(new NamedType[0]);

        assertNotNull(resolver._registeredSubtypes);
        assertTrue(resolver._registeredSubtypes.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testRegisterSubtypesWithNullVarargsThrowsNpe() {
        resolver.registerSubtypes((NamedType[]) null);
    }

    @Test
    public void testCollectAndResolveSubtypesByClassFromAnnotatedBase() {
        MapperConfig<?> config = mapper.getSerializationConfig();
        AnnotatedClass base = config.introspectClassAnnotations(BaseWithAnnotations.class);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, base);

        assertNotNull(result);
        assertTrue(typesOf(result).contains(BaseWithAnnotations.class));
        assertTrue(typesOf(result).contains(SubA.class));
        assertTrue(typesOf(result).contains(SubB.class));

        Set<String> names = namesOf(result);
        assertTrue(names.contains("subA"));
        assertTrue(names.contains("subB"));
    }

    @Test
    public void testCollectAndResolveSubtypesByClassIncludesRegisteredSubtypes() {
        resolver.registerSubtypes(PlainSubA.class, PlainSubB.class);

        MapperConfig<?> config = mapper.getSerializationConfig();
        AnnotatedClass base = config.introspectClassAnnotations(PlainBase.class);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, base);

        assertNotNull(result);
        assertTrue(typesOf(result).contains(PlainBase.class));
        assertTrue(typesOf(result).contains(PlainSubA.class));
        assertTrue(typesOf(result).contains(PlainSubB.class));
    }

    @Test
    public void testCollectAndResolveSubtypesByClassFromPropertyWithNullBaseType() {
        MapperConfig<?> config = mapper.getSerializationConfig();
        AnnotatedClass wrapper = config.introspectClassAnnotations(Wrapper.class);
        AnnotatedMember property = wrapper.fields().get(0);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, property, null);

        assertNotNull(result);
        assertTrue(typesOf(result).contains(AbstractBase2.class));
        assertTrue(typesOf(result).contains(SubA2.class));
        assertTrue(typesOf(result).contains(SubB2.class));
    }

    @Test
    public void testCollectAndResolveSubtypesByClassFromPropertyWithBaseType() {
        MapperConfig<?> config = mapper.getSerializationConfig();
        AnnotatedClass wrapper = config.introspectClassAnnotations(Wrapper.class);
        AnnotatedMember property = wrapper.fields().get(0);
        JavaType baseType = mapper.getTypeFactory().constructType(AbstractBase2.class);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByClass(config, property, baseType);

        assertNotNull(result);
        assertTrue(typesOf(result).contains(AbstractBase2.class));
        assertTrue(typesOf(result).contains(SubA2.class));
        assertTrue(typesOf(result).contains(SubB2.class));
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeIdFromAnnotatedBase() {
        MapperConfig<?> config = mapper.getSerializationConfig();
        AnnotatedClass base = config.introspectClassAnnotations(BaseWithAnnotations.class);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(config, base);

        assertNotNull(result);
        assertEquals(2, result.size());

        Set<String> names = namesOf(result);
        assertEquals(new HashSet<>(Arrays.asList("subA", "subB")), names);
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeIdFromProperty() {
        MapperConfig<?> config = mapper.getSerializationConfig();
        AnnotatedClass wrapper = config.introspectClassAnnotations(Wrapper.class);
        AnnotatedMember property = wrapper.fields().get(0);
        JavaType baseType = mapper.getTypeFactory().constructType(AbstractBase2.class);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(config, property, baseType);

        assertNotNull(result);
        assertEquals(2, result.size());

        Set<String> names = namesOf(result);
        assertEquals(new HashSet<>(Arrays.asList("subA2", "subB2")), names);
    }

    @Test
    public void testCollectAndResolveSubtypesByTypeIdConcreteBaseIncludesUnnamedBase() {
        MapperConfig<?> config = mapper.getSerializationConfig();
        AnnotatedClass base = config.introspectClassAnnotations(ConcreteBase.class);

        Collection<NamedType> result = resolver.collectAndResolveSubtypesByTypeId(config, base);

        assertNotNull(result);
        assertEquals(1, result.size());

        NamedType only = result.iterator().next();
        assertEquals(ConcreteBase.class, only.getType());
        assertFalse(only.hasName());
    }

    private Set<Class<?>> typesOf(Collection<NamedType> types) {
        Set<Class<?>> result = new HashSet<>();
        for (NamedType type : types) {
            result.add(type.getType());
        }
        return result;
    }

    private Set<String> namesOf(Collection<NamedType> types) {
        Set<String> result = new HashSet<>();
        for (NamedType type : types) {
            if (type.hasName()) {
                result.add(type.getName());
            }
        }
        return result;
    }
}