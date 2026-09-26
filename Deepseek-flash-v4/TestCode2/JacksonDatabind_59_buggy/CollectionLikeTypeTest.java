package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

@SuppressWarnings("deprecation")
public class CollectionLikeTypeTest {

    private TypeFactory typeFactory;
    private JavaType stringType;
    private JavaType intType;
    private CollectionLikeType collectionLikeType;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        stringType = typeFactory.constructType(String.class);
        intType = typeFactory.constructType(Integer.class);
        collectionLikeType = CollectionLikeType.construct(List.class, stringType);
    }

    @After
    public void tearDown() {
        typeFactory = null;
        stringType = null;
        intType = null;
        collectionLikeType = null;
    }

    @Test
    public void testBasicTypeProperties() {
        assertTrue(collectionLikeType.isContainerType());
        assertTrue(collectionLikeType.isCollectionLikeType());
        assertTrue(collectionLikeType.isTrueCollectionType());
        assertEquals(List.class, collectionLikeType.getRawClass());
        assertEquals(stringType, collectionLikeType.getContentType());
    }

    @Test
    public void testNonCollectionLike() {
        CollectionLikeType notCollection = CollectionLikeType.construct(String.class, stringType);
        assertFalse(notCollection.isTrueCollectionType());
    }

    @Test
    public void testConstructAndUpgradeFrom() {
        CollectionLikeType constructed = CollectionLikeType.construct(ArrayList.class, stringType);
        assertEquals(ArrayList.class, constructed.getRawClass());
        assertEquals(stringType, constructed.getContentType());

        JavaType base = typeFactory.constructType(List.class);
        CollectionLikeType upgraded = CollectionLikeType.upgradeFrom(base, stringType);
        assertEquals(List.class, upgraded.getRawClass());
        assertEquals(stringType, upgraded.getContentType());
    }

    @Test
    public void testEquals() {
        assertTrue(collectionLikeType.equals(collectionLikeType));
        assertFalse(collectionLikeType.equals(null));
        assertFalse(collectionLikeType.equals("dummy"));

        CollectionLikeType same = CollectionLikeType.construct(List.class, stringType);
        assertEquals(collectionLikeType, same);

        CollectionLikeType differentElement = CollectionLikeType.construct(List.class, intType);
        assertFalse(collectionLikeType.equals(differentElement));

        CollectionLikeType differentClass = CollectionLikeType.construct(ArrayList.class, stringType);
        assertFalse(collectionLikeType.equals(differentClass));
    }

    @Test
    public void testWithContentType() {
        assertSame(collectionLikeType, collectionLikeType.withContentType(stringType));

        JavaType changed = collectionLikeType.withContentType(intType);
        assertEquals(intType, changed.getContentType());
        assertNotSame(collectionLikeType, changed);
    }

    @Test
    public void testWithStaticTyping() {
        CollectionLikeType staticallyTyped = collectionLikeType.withStaticTyping();
        assertNotSame(collectionLikeType, staticallyTyped);
        assertSame(staticallyTyped, staticallyTyped.withStaticTyping());
    }

    @Test
    public void testHandlers() {
        assertNull(collectionLikeType.getContentValueHandler());
        assertNull(collectionLikeType.getContentTypeHandler());
        assertFalse(collectionLikeType.hasHandlers());

        CollectionLikeType contentValue = collectionLikeType.withContentValueHandler("valueHandler");
        assertEquals("valueHandler", contentValue.getContentValueHandler());
        assertTrue(contentValue.hasHandlers());

        CollectionLikeType contentType = collectionLikeType.withContentTypeHandler("typeHandler");
        assertEquals("typeHandler", contentType.getContentTypeHandler());
        assertTrue(contentType.hasHandlers());
    }

    @Test
    public void testTypeAndValueHandlers() {
        CollectionLikeType valueHandlerType = collectionLikeType.withValueHandler("valueHandler");
        assertEquals("valueHandler", valueHandlerType.getValueHandler());
        assertEquals(stringType, valueHandlerType.getContentType());

        CollectionLikeType typeHandlerType = collectionLikeType.withTypeHandler("typeHandler");
        assertEquals("typeHandler", typeHandlerType.getTypeHandler());
        assertEquals(stringType, typeHandlerType.getContentType());
    }

    @Test
    public void testCanonicalNameAndSignatures() {
        assertEquals("java.util.List<java.lang.String>", collectionLikeType.toCanonical());
        assertEquals("Ljava/util/List;",
                collectionLikeType.getErasedSignature(new StringBuilder()).toString());
        assertEquals("Ljava/util/List<Ljava/lang/String;>;",
                collectionLikeType.getGenericSignature(new StringBuilder()).toString());
    }

    @Test
    public void testRefine() {
        JavaType refined = collectionLikeType.refine(ArrayList.class,
                collectionLikeType._bindings,
                collectionLikeType._superClass,
                collectionLikeType._superInterfaces);

        assertEquals(ArrayList.class, refined.getRawClass());
        assertEquals(stringType, refined.getContentType());
        assertTrue(refined instanceof CollectionLikeType);
    }

    @Test
    public void testToString() {
        String string = collectionLikeType.toString();
        assertTrue(string.contains("collection-like type"));
        assertTrue(string.contains("java.util.List"));
    }
}