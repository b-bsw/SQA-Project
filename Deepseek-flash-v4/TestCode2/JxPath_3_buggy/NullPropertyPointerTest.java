package org.apache.commons.jxpath.ri.model.beans;

import static org.junit.Assert.*;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Before;
import org.junit.Test;

public class NullPropertyPointerTest {

    private NullPointer parent;
    private NullPropertyPointer pointer;
    private JXPathContext context;

    @Before
    public void setUp() {
        parent = new NullPointer(null, new QName("root"));
        pointer = new NullPropertyPointer(parent);
        context = JXPathContext.newContext(new Object());
    }

    @Test
    public void testDefaults() {
        assertEquals("*", pointer.getPropertyName());
        assertEquals("*", pointer.getName().toString());
        assertEquals(0, pointer.getLength());
        assertEquals(0, pointer.getPropertyCount());
        assertNull(pointer.getBaseValue());
        assertNull(pointer.getImmediateNode());
        assertTrue(pointer.isLeaf());
        assertTrue(pointer.isContainer());
        assertFalse(pointer.isActual());
        assertFalse(pointer.isActualProperty());
        assertFalse(pointer.isCollection());
        assertArrayEquals(new String[0], pointer.getPropertyNames());
    }

    @Test
    public void testSetPropertyName() {
        pointer.setPropertyName("foo");

        assertEquals("foo", pointer.getPropertyName());
        assertEquals("foo", pointer.getName().toString());
    }

    @Test
    public void testSetPropertyIndexIsNoOpForDefaults() {
        pointer.setPropertyIndex(3);

        assertEquals(0, pointer.getLength());
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testGetValuePointerUsesCurrentPropertyName() {
        pointer.setPropertyName("foo");

        NodePointer valuePointer = pointer.getValuePointer();

        assertNotNull(valuePointer);
        assertEquals("foo", valuePointer.getName().toString());
    }

    @Test
    public void testSetNameAttributeValueEmpty() {
        pointer.setNameAttributeValue("");

        assertEquals("", pointer.getPropertyName());
        assertTrue(pointer.asPath().contains("[@name='']"));
    }

    @Test
    public void testSetNameAttributeValueEscapesQuotes() {
        pointer.setNameAttributeValue("it's \"x\"");

        String path = pointer.asPath();
        assertTrue("Expected escaping in path but was: " + path,
                path.contains("it&apos;s &quot;x&quot;"));
        assertFalse("Raw quote was not escaped: " + path, path.contains("it's"));
    }

    @Test
    public void testDefaultAsPathUsesSuper() {
        pointer.setPropertyName("bar");

        String path = pointer.asPath();

        assertNotNull(path);
        assertTrue("Expected property name at end of path but was: " + path,
                path.endsWith("bar"));
        assertFalse(path.contains("[@name="));
    }

    @Test(expected = JXPathInvalidAccessException.class)
    public void testSetValueThrowsWhenParentCannotAutoCreate() {
        pointer.setValue("value");
    }

    @Test(expected = JXPathInvalidAccessException.class)
    public void testSetValueWithNullParentThrows() {
        new NullPropertyPointer(null).setValue("value");
    }

    @Test
    public void testCreatePathDelegatesToParent() {
        pointer.setPropertyName("foo");

        NodePointer created = pointer.createPath(context);

        assertNotNull(created);
        assertNotNull(created.getName());
        assertEquals("foo", created.getName().toString());
    }
}