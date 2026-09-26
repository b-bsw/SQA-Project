package com.fasterxml.jackson.databind.module;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SimpleAbstractTypeResolverTest {

    private SimpleAbstractTypeResolver resolver;
    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        resolver = new SimpleAbstractTypeResolver();
        typeFactory = TypeFactory.defaultInstance();
    }

    @Test
    public void testAddMappingIsChainable() {
        assertSame(resolver, resolver.addMapping(Collection.class, LinkedList.class));
        assertSame(resolver, resolver.addMapping(List.class, LinkedList.class));
    }

    @Test
    public void testFindTypeMappingForRegisteredExactRawType() {
        resolver.addMapping(List.class, LinkedList.class);

        JavaType result = resolver.findTypeMapping(null, typeFactory.constructType(List.class));

        assertNotNull(result);
        assertEquals(LinkedList.class, result.getRawClass());
    }

    @Test
    public void testFindTypeMappingReturnsNullWhenNoMappingExists() {
        assertNull(resolver.findTypeMapping(null, typeFactory.constructType(Set.class)));
    }

    @Test
    public void testResolveAbstractTypeReturnsNull() {
        assertNull(resolver.resolveAbstractType(null, typeFactory.constructType(List.class)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMappingRejectsIdenticalTypes() {
        resolver.addMapping(String.class, String.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMappingRejectsNonSubtype() {
        resolver.addMapping(String.class, Integer.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMappingRejectsConcreteSupertype() {
        resolver.addMapping(Object.class, String.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMappingRejectsNullSuperTypeAndSubType() {
        resolver.addMapping(null, null);
    }
}