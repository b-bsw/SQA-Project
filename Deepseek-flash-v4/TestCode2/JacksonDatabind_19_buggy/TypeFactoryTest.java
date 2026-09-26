package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.reflect.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.HierarchicType;
import com.fasterxml.jackson.databind.type.ClassKey;

public class TypeFactoryTest {
    private TypeFactory factory;

    @Before
    public void setUp() {
        factory = TypeFactory.defaultInstance();
        factory.clearCache();
    }

    @Test
    public void testDefaultInstanceNotNull() {
        assertNotNull(factory);
    }

    @Test
    public void testClearCache() {
        JavaType first = factory.constructType(Object.class);
        JavaType second = factory.constructType(Object.class);
        assertSame("Cache hit should return same object", first, second);
        factory.clearCache();
        JavaType third = factory.constructType(Object.class);
        assertNotSame("After clear, should create new instance", first, third);
    }

    @Test
    public void testConstructTypeString() {
        JavaType type = factory.constructType(String.class);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructTypeInteger() {
        JavaType type = factory.constructType(Integer.class);
        assertEquals(Integer.class, type.getRawClass());
    }

    @Test
    public void testConstructTypeBoolean() {
        JavaType type = factory.constructType(Boolean.TYPE);
        assertEquals(Boolean.TYPE, type.getRawClass());
    }

    @Test
    public void testConstructTypeLong() {
        JavaType type = factory.constructType(Long.TYPE);
        assertEquals(Long.TYPE, type.getRawClass());
    }

    @Test
    public void testConstructTypeObject() {
        JavaType type = factory.constructType(Object.class);
        assertEquals(Object.class, type.getRawClass());
    }

    @Test
    public void testConstructTypeArrayOfInt() {
        JavaType type = factory.constructType(int[].class);
        assertTrue(type.isArrayType());
        assertEquals(Integer.TYPE, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructTypeHashMap() {
        JavaType type = factory.constructType(HashMap.class);
        assertTrue(type.isMapType());
    }

    @Test
    public void testConstructTypeArrayList() {
        JavaType type = factory.constructType(ArrayList.class);
        assertTrue(type.isCollectionType());
    }

    @Test
    public void testConstructTypeEnum() {
        JavaType type = factory.constructType(Thread.State.class);
        assertTrue(type.isEnumType());
    }

    @Test
    public void testConstructTypeParameterizedMap() {
        Type mapType = new TypeReference<Map<String, Integer>>() {}.getType();
        JavaType type = factory.constructType(mapType);
        assertTrue(type.isMapType());
        MapType mt = (MapType) type;
        assertEquals(String.class, mt.getKeyType().getRawClass());
        assertEquals(Integer.class, mt.getContentType().getRawClass());
    }

    @Test
    public void testConstructTypeParameterizedList() {
        Type listType = new TypeReference<List<String>>() {}.getType();
        JavaType type = factory.constructType(listType);
        assertTrue(type.isCollectionType());
        CollectionType ct = (CollectionType) type;
        assertEquals(String.class, ct.getContentType().getRawClass());
    }

    @Test
    public void testConstructTypeAtomicReference() {
        Type refType = new TypeReference<AtomicReference<Long>>() {}.getType();
        JavaType type = factory.constructType(refType);
        assertTrue(type.isReferenceType());
        assertEquals(Long.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructTypeMapEntry() {
        Type entryType = new TypeReference<Map.Entry<String, Integer>>() {}.getType();
        JavaType type = factory.constructType(entryType);
        assertFalse(type.isContainerType());
        assertNotNull(type.containedType(0));
        assertEquals(String.class, type.containedType(0).getRawClass());
        assertEquals(Integer.class, type.containedType(1).getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructTypeNullType() {
        factory.constructType((Type) null);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructTypeNullTypeReference() {
        factory.constructType((TypeReference<?>) null);
    }

    @Test
    public void testConstructTypeWithTypeBindings() {
        TypeBindings bindings = new TypeBindings(factory, (Class<?>) null);
        JavaType type = factory.constructType(String.class, bindings);
        assertNotNull(type);
    }

    @Test
    public void testConstructTypeWithClassContext() {
        JavaType type = factory.constructType(String.class, (Class<?>) null);
        assertNotNull(type);
    }

    @Test
    public void testConstructTypeWithJavaTypeContext() {
        JavaType context = factory.constructType(HashMap.class);
        JavaType type = factory.constructType(String.class, context);
        assertNotNull(type);
    }

    @Test
    public void testConstructSpecializedTypeSameClass() {
        JavaType base = factory.constructType(Number.class);
        JavaType specialized = factory.constructSpecializedType(base, Number.class);
        assertSame("If subclass same as raw class, return base", base, specialized);
    }

    @Test
    public void testConstructSpecializedTypeSubtype() {
        JavaType base = factory.constructType(Number.class);
        JavaType specialized = factory.constructSpecializedType(base, Integer.class);
        assertEquals(Integer.class, specialized.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedTypeNotSubtype() {
        JavaType type = factory.constructType(String.class);
        factory.constructSpecializedType(type, StringBuilder.class);
    }

    @Test
    public void testConstructFromCanonical() {
        JavaType type = factory.constructFromCanonical("java.lang.String");
        assertEquals(String.class, type.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonicalInvalid() {
        factory.constructFromCanonical("not.a.type");
    }

    @Test(expected = NullPointerException.class)
    public void testConstructFromCanonicalNull() {
        factory.constructFromCanonical(null);
    }

    @Test
    public void testFindTypeParametersForHashMap() {
        JavaType type = factory.constructType(HashMap.class);
        JavaType[] params = factory.findTypeParameters(type, Map.class);
        assertNotNull(params);
        assertEquals(2, params.length);
        assertEquals(Object.class, params[0].getRawClass());
        assertEquals(Object.class, params[1].getRawClass());
    }

    @Test
    public void testFindTypeParametersForArrayList() {
        JavaType type = factory.constructType(ArrayList.class);
        JavaType[] params = factory.findTypeParameters(type, Collection.class);
        assertNotNull(params);
        assertEquals(1, params.length);
        assertEquals(Object.class, params[0].getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTypeParametersNotSubtype() {
        factory.findTypeParameters(String.class, Map.class);
    }

    @Test
    public void testMoreSpecificTypeBothNull() {
        assertNull(factory.moreSpecificType(null, null));
    }

    @Test
    public void testMoreSpecificTypeFirstNull() {
        JavaType type = factory.constructType(String.class);
        assertSame(type, factory.moreSpecificType(null, type));
    }

    @Test
    public void testMoreSpecificTypeSecondNull() {
        JavaType type = factory.constructType(String.class);
        assertSame(type, factory.moreSpecificType(type, null));
    }

    @Test
    public void testMoreSpecificTypeSameRaw() {
        JavaType t1 = factory.constructType(Number.class);
        JavaType t2 = factory.constructType(Number.class);
        assertSame("When raw classes equal, return first", t1, factory.moreSpecificType(t1, t2));
    }

    @Test
    public void testMoreSpecificTypeAssignable() {
        JavaType t1 = factory.constructType(Number.class);
        JavaType t2 = factory.constructType(Integer.class);
        assertSame(t2, factory.moreSpecificType(t1, t2));
    }

    @Test
    public void testMoreSpecificTypeNotAssignable() {
        JavaType t1 = factory.constructType(String.class);
        JavaType t2 = factory.constructType(Integer.class);
        assertSame(t1, factory.moreSpecificType(t1, t2));
    }

    @Test
    public void testWithModifierNull() {
        TypeFactory newFactory = factory.withModifier(null);
        assertNotNull(newFactory);
        assertNotSame(factory, newFactory);
    }

    @Test
    public void testWithModifierNonNull() {
        TypeModifier mod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                return type;
            }
        };
        TypeFactory newFactory = factory.withModifier(mod);
        assertNotNull(newFactory);
        assertNotSame(factory, newFactory);
    }

    @Test
    public void testConstructArrayTypeClass() {
        ArrayType at = factory.constructArrayType(String.class);
        assertNotNull(at);
        assertEquals(String.class, at.getContentType().getRawClass());
    }

    @Test
    public void testConstructArrayTypeJavaType() {
        JavaType elementType = factory.constructType(Integer.class);
        ArrayType at = factory.constructArrayType(elementType);
        assertNotNull(at);
        assertEquals(Integer.class, at.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionTypeClass() {
        CollectionType ct = factory.constructCollectionType(ArrayList.class, String.class);
        assertNotNull(ct);
        assertEquals(String.class, ct.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapTypeClass() {
        MapType mt = factory.constructMapType(HashMap.class, String.class, Integer.class);
        assertNotNull(mt);
        assertEquals(String.class, mt.getKeyType().getRawClass());
        assertEquals(Integer.class, mt.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSimpleTypeMismatch() {
        factory.constructSimpleType(HashMap.class, HashMap.class, new JavaType[0]);
    }

    @Test
    public void testConstructSimpleTypeSuccess() {
        JavaType[] params = new JavaType[] { factory.constructType(String.class) };
        JavaType result = factory.constructSimpleType(java.lang.Comparable.class, java.lang.Comparable.class, params);
        assertEquals(java.lang.Comparable.class, result.getRawClass());
        assertNotNull(result.containedType(0));
        assertEquals(String.class, result.containedType(0).getRawClass());
    }

    @Test
    public void testConstructParametrizedTypeArray() {
        JavaType result = factory.constructParametrizedType(int[].class, int[].class, String.class);
        assertTrue(result.isArrayType());
        assertEquals(String.class, result.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedTypeArrayWrongParamCount() {
        factory.constructParametrizedType(int[].class, int[].class, String.class, Integer.class);
    }

    @Test
    public void testConstructParametrizedTypeMap() {
        JavaType result = factory.constructParametrizedType(HashMap.class, HashMap.class, String.class, Integer.class);
        assertTrue(result.isMapType());
        MapType mt = (MapType) result;
        assertEquals(String.class, mt.getKeyType().getRawClass());
        assertEquals(Integer.class, mt.getContentType().getRawClass());
    }

    @Test
    public void testConstructParametrizedTypeCollection() {
        JavaType result = factory.constructParametrizedType(ArrayList.class, ArrayList.class, String.class);
        assertTrue(result.isCollectionType());
        assertEquals(String.class, result.getContentType().getRawClass());
    }

    @Test
    public void testConstructParametrizedTypeSimple() {
        JavaType result = factory.constructParametrizedType(java.util.Comparator.class, java.util.Comparator.class, String.class);
        assertFalse(result.isContainerType());
        assertNotNull(result.containedType(0));
        assertEquals(String.class, result.containedType(0).getRawClass());
    }

    @Test
    public void testConstructRawCollectionType() {
        CollectionLikeType clt = factory.constructRawCollectionType(ArrayList.class);
        assertNotNull(clt);
        assertEquals(Object.class, clt.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawMapType() {
        MapLikeType mlt = factory.constructRawMapType(HashMap.class);
        assertNotNull(mlt);
        assertEquals(Object.class, mlt.getKeyType().getRawClass());
        assertEquals(Object.class, mlt.getContentType().getRawClass());
    }

    @Test
    public void testConstructReferenceType() {
        JavaType refType = factory.constructReferenceType(AtomicReference.class, factory.constructType(String.class));
        assertTrue(refType.isReferenceType());
        assertEquals(String.class, refType.getContentType().getRawClass());
    }

    @Test
    public void testUnknownType() {
        JavaType unknown = TypeFactory.unknownType();
        assertEquals(Object.class, unknown.getRawClass());
    }

    @Test
    public void testRawClassForClass() {
        assertEquals(String.class, TypeFactory.rawClass(String.class));
    }

    @Test
    public void testRawClassForParameterizedType() {
        Type t = new TypeReference<List<String>>() {}.getType();
        assertEquals(List.class, TypeFactory.rawClass(t));
    }

    @Test
    public void testUncheckedSimpleType() {
        JavaType type = factory.uncheckedSimpleType(String.class);
        assertEquals(String.class, type.getRawClass());
        assertTrue(type.isSimple());
    }
}