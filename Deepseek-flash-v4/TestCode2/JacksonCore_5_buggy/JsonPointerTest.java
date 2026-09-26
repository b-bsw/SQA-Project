package com.fasterxml.jackson.core;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class JsonPointerTest {
    
    private JsonPointer emptyPointer;
    
    @Before
    public void setUp() {
        emptyPointer = JsonPointer.compile("");
    }
    
    @After
    public void tearDown() {
        emptyPointer = null;
    }
    
    @Test
    public void testCompileNullInput() {
        JsonPointer result = JsonPointer.compile(null);
        assertNotNull(result);
        assertTrue(result.matches());
        assertEquals("", result.toString());
    }
    
    @Test
    public void testCompileEmptyString() {
        JsonPointer result = JsonPointer.compile("");
        assertNotNull(result);
        assertTrue(result.matches());
        assertEquals("", result.toString());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCompileInvalidNoSlash() {
        JsonPointer.compile("abc");
    }
    
    @Test
    public void testCompileSingleSlash() {
        JsonPointer result = JsonPointer.compile("/");
        assertNotNull(result);
        assertFalse(result.matches());
        assertEquals("/", result.toString());
        assertEquals("", result.getMatchingProperty());
        assertEquals(-1, result.getMatchingIndex());
        assertNotNull(result.tail());
        assertTrue(result.tail().matches());
    }
    
    @Test
    public void testCompileSimpleProperty() {
        JsonPointer result = JsonPointer.compile("/foo");
        assertNotNull(result);
        assertFalse(result.matches());
        assertEquals("foo", result.getMatchingProperty());
        assertEquals(-1, result.getMatchingIndex());
        assertTrue(result.tail().matches());
    }
    
    @Test
    public void testCompileNestedProperties() {
        JsonPointer result = JsonPointer.compile("/foo/bar");
        assertNotNull(result);
        assertFalse(result.matches());
        assertEquals("foo", result.getMatchingProperty());
        assertEquals(-1, result.getMatchingIndex());
        JsonPointer tail = result.tail();
        assertNotNull(tail);
        assertEquals("bar", tail.getMatchingProperty());
        assertTrue(tail.tail().matches());
    }
    
    @Test
    public void testCompileArrayIndex() {
        JsonPointer result = JsonPointer.compile("/0");
        assertNotNull(result);
        assertEquals("0", result.getMatchingProperty());
        assertEquals(0, result.getMatchingIndex());
        assertTrue(result.tail().matches());
    }
    
    @Test
    public void testCompileLargeValidIndex() {
        JsonPointer result = JsonPointer.compile("/1234567890");
        assertEquals(1234567890, result.getMatchingIndex());
    }
    
    @Test
    public void testCompileOversizedIndex() {
        JsonPointer result = JsonPointer.compile("/12345678901");
        assertEquals(-1, result.getMatchingIndex());
    }
    
    @Test
    public void testCompileNonNumericIndex() {
        JsonPointer result = JsonPointer.compile("/abc");
        assertEquals(-1, result.getMatchingIndex());
    }
    
    @Test
    public void testMatchesTrueForEmpty() {
        assertTrue(emptyPointer.matches());
    }
    
    @Test
    public void testMatchesFalseForNonEmpty() {
        JsonPointer pointer = JsonPointer.compile("/test");
        assertFalse(pointer.matches());
    }
    
    @Test
    public void testGetMatchingPropertyForEmpty() {
        assertEquals("", emptyPointer.getMatchingProperty());
    }
    
    @Test
    public void testGetMatchingPropertyForNonEmpty() {
        JsonPointer pointer = JsonPointer.compile("/prop");
        assertEquals("prop", pointer.getMatchingProperty());
    }
    
    @Test
    public void testGetMatchingIndexForEmpty() {
        assertEquals(-1, emptyPointer.getMatchingIndex());
    }
    
    @Test
    public void testGetMatchingIndexForProperty() {
        JsonPointer pointer = JsonPointer.compile("/prop");
        assertEquals(-1, pointer.getMatchingIndex());
    }
    
    @Test
    public void testMayMatchPropertyTrue() {
        assertTrue(emptyPointer.mayMatchProperty());
    }
    
    @Test
    public void testMayMatchElementFalseForStringProperty() {
        JsonPointer pointer = JsonPointer.compile("/prop");
        assertFalse(pointer.mayMatchElement());
    }
    
    @Test
    public void testMayMatchElementTrueForIndex() {
        JsonPointer pointer = JsonPointer.compile("/0");
        assertTrue(pointer.mayMatchElement());
    }
    
    @Test
    public void testMatchPropertySuccess() {
        JsonPointer pointer = JsonPointer.compile("/foo/bar");
        JsonPointer match = pointer.matchProperty("foo");
        assertNotNull(match);
        assertEquals("bar", match.getMatchingProperty());
    }
    
    @Test
    public void testMatchPropertyFailWrongName() {
        JsonPointer pointer = JsonPointer.compile("/foo");
        assertNull(pointer.matchProperty("bar"));
    }
    
    @Test
    public void testMatchPropertyOnEmptyPointer() {
        assertNull(emptyPointer.matchProperty("any"));
    }
    
    @Test
    public void testMatchElementSuccess() {
        JsonPointer pointer = JsonPointer.compile("/0/1");
        JsonPointer match = pointer.matchElement(0);
        assertNotNull(match);
        assertEquals(1, match.getMatchingIndex());
    }
    
    @Test
    public void testMatchElementFailWrongIndex() {
        JsonPointer pointer = JsonPointer.compile("/0");
        assertNull(pointer.matchElement(1));
    }
    
    @Test
    public void testMatchElementNegativeIndex() {
        JsonPointer pointer = JsonPointer.compile("/0");
        assertNull(pointer.matchElement(-1));
    }
    
    @Test
    public void testTailOfEmptyPointer() {
        assertNull(emptyPointer.tail());
    }
    
    @Test
    public void testTailOfNonEmptyPointer() {
        JsonPointer pointer = JsonPointer.compile("/a/b");
        JsonPointer tail = pointer.tail();
        assertNotNull(tail);
        assertEquals("b", tail.getMatchingProperty());
        assertNotNull(tail.tail());
        assertTrue(tail.tail().matches());
    }
    
    @Test
    public void testValueOfDelegatesToCompile() {
        JsonPointer result = JsonPointer.valueOf("/test");
        assertNotNull(result);
        assertEquals("/test", result.toString());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testValueOfInvalid() {
        JsonPointer.valueOf("no-slash");
    }
    
    @Test
    public void testToString() {
        assertEquals("", emptyPointer.toString());
        JsonPointer pointer = JsonPointer.compile("/path");
        assertEquals("/path", pointer.toString());
    }
    
    @Test
    public void testHashCode() {
        JsonPointer p1 = JsonPointer.compile("/a");
        JsonPointer p2 = JsonPointer.compile("/a");
        assertEquals(p1.hashCode(), p2.hashCode());
    }
    
    @Test
    public void testEqualsSame() {
        JsonPointer p = JsonPointer.compile("/x");
        assertTrue(p.equals(p));
    }
    
    @Test
    public void testEqualsNull() {
        JsonPointer p = JsonPointer.compile("/x");
        assertFalse(p.equals(null));
    }
    
    @Test
    public void testEqualsDifferentClass() {
        JsonPointer p = JsonPointer.compile("/x");
        assertFalse(p.equals("string"));
    }
    
    @Test
    public void testEqualsDifferentValue() {
        JsonPointer p1 = JsonPointer.compile("/a");
        JsonPointer p2 = JsonPointer.compile("/b");
        assertFalse(p1.equals(p2));
    }
    
    @Test
    public void testEqualsSameValue() {
        JsonPointer p1 = JsonPointer.compile("/a");
        JsonPointer p2 = JsonPointer.compile("/a");
        assertTrue(p1.equals(p2));
    }
    
    @Test
    public void testTildeEscapeZero() {
        JsonPointer pointer = JsonPointer.compile("/~0");
        assertEquals("~", pointer.getMatchingProperty());
    }
    
    @Test
    public void testTildeEscapeOne() {
        JsonPointer pointer = JsonPointer.compile("/~1");
        assertEquals("/", pointer.getMatchingProperty());
    }
    
    @Test
    public void testTildeEscapeInvalid() {
        JsonPointer pointer = JsonPointer.compile("/~x");
        assertEquals("~x", pointer.getMatchingProperty());
    }
    
    @Test
    public void testMixedEscapes() {
        JsonPointer pointer = JsonPointer.compile("/~0~1/~00");
        assertEquals("~/", pointer.getMatchingProperty());
        assertEquals("~0", pointer.tail().getMatchingProperty());
    }
    
    @Test
    public void testLoopZeroIterations() {
        JsonPointer pointer = JsonPointer.compile("/");
        assertEquals("", pointer.getMatchingProperty());
        assertNotNull(pointer.tail());
        assertTrue(pointer.tail().matches());
    }
}