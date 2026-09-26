package org.apache.commons.jxpath.ri.model.jdom;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.jdom.Element;
import org.jdom.Namespace;
import java.util.List;

public class JDOMAttributeIteratorTest {

    private Element element;
    private NodePointer parentPointer;

    @Before
    public void setUp() {
        element = new Element("root", "uri", "prefix");
        element.setAttribute("attr1", "value1");
        element.setAttribute(new Attribute("attr2", "value2", Namespace.getNamespace("ns", "http://ns")));
        element.setAttribute(new Attribute("xmlAttr", "xmlValue", Namespace.XML_NAMESPACE));
        parentPointer = new NodePointer() {
            public Object getNode() { return element; }
            public Object getValue() { return null; }
            public int getLength() { return 0; }
            public boolean isLeaf() { return false; }
            public boolean isCollection() { return false; }
            public NodePointer getImmediateValuePointer() { return null; }
            public QName getName() { return null; }
            public NodePointer getParent() { return null; }
        };
    }

    @After
    public void tearDown() {
        element = null;
        parentPointer = null;
    }

    @Test
    public void testConstructorWithNullPrefixAndSpecificName() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName(null, "attr1"));
        assertTrue(iterator.setPosition(1));
        assertEquals("attr1", iterator.getNodePointer().getName().getName());
        assertEquals(1, iterator.getPosition());
    }

    @Test
    public void testConstructorWithPrefixAndSpecificName() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName("ns", "attr2"));
        assertTrue(iterator.setPosition(1));
        assertEquals("attr2", iterator.getNodePointer().getName().getName());
    }

    @Test
    public void testConstructorWithNonExistentNamespacePrefix() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName("nonexistent", "attr1"));
        assertFalse(iterator.setPosition(1));
        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testConstructorWithXmlPrefix() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName("xml", "xmlAttr"));
        assertTrue(iterator.setPosition(1));
        assertEquals("xmlAttr", iterator.getNodePointer().getName().getName());
    }

    @Test
    public void testConstructorWithWildcardNameAndNoNamespace() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName(null, "*"));
        assertTrue(iterator.setPosition(1));
        assertEquals(2, iterator.getPosition());
        assertTrue(iterator.setPosition(2));
        assertEquals(2, iterator.getPosition());
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testConstructorWithWildcardNameAndSpecificNamespace() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName("ns", "*"));
        assertTrue(iterator.setPosition(1));
        assertEquals("attr2", iterator.getNodePointer().getName().getName());
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testConstructorWithNonElementNode() {
        NodePointer nonElementPointer = new NodePointer() {
            public Object getNode() { return "not an element"; }
            public Object getValue() { return null; }
            public int getLength() { return 0; }
            public boolean isLeaf() { return false; }
            public boolean isCollection() { return false; }
            public NodePointer getImmediateValuePointer() { return null; }
            public QName getName() { return null; }
            public NodePointer getParent() { return null; }
        };
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(nonElementPointer, new QName(null, "test"));
        assertFalse(iterator.setPosition(1));
        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testGetNodePointerBeforeSetPosition() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName(null, "attr1"));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertEquals("attr1", pointer.getName().getName());
        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testSetPositionOutOfBounds() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName(null, "attr1"));
        assertFalse(iterator.setPosition(0));
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testSetPositionZeroThenOne() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName(null, "attr1"));
        assertFalse(iterator.setPosition(0));
        assertTrue(iterator.setPosition(1));
        assertEquals(1, iterator.getPosition());
    }

    @Test
    public void testEmptyAttributesWhenPrefixNotFound() {
        Element emptyElement = new Element("root", "uri", "prefix");
        NodePointer emptyPointer = new NodePointer() {
            public Object getNode() { return emptyElement; }
            public Object getValue() { return null; }
            public int getLength() { return 0; }
            public boolean isLeaf() { return false; }
            public boolean isCollection() { return false; }
            public NodePointer getImmediateValuePointer() { return null; }
            public QName getName() { return null; }
            public NodePointer getParent() { return null; }
        };
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(emptyPointer, new QName("nonexistent", "attr1"));
        assertFalse(iterator.setPosition(1));
        assertEquals(0, iterator.getPosition());
    }
}