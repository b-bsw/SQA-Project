package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.w3c.dom.*;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import javax.xml.parsers.DocumentBuilderFactory;

public class DOMAttributeIteratorTest {
    private Document document;
    private Element element;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        document = factory.newDocumentBuilder().newDocument();
        element = document.createElementNS("http://example.com/ns", "test:element");
        element.setAttribute("attr1", "value1");
        element.setAttributeNS("http://example.com/ns", "test:attr2", "value2");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:test", "http://example.com/ns");
        document.appendChild(element);
    }

    @Test
    public void testNullNodePointer() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("test", "attr2"));
        assertFalse(iterator.setPosition(1));
    }

    @Test
    public void testGetAttributeByName() {
        DOMNodePointer parent = new DOMNodePointer(null, null, element);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName(null, "attr1"));
        assertTrue(iterator.setPosition(1));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        Node node = (Node) pointer.getNode();
        assertEquals("attr1", node.getNodeName());
        assertEquals("value1", node.getNodeValue());
    }

    @Test
    public void testGetAttributeByNamespaceAndName() {
        DOMNodePointer parent = new DOMNodePointer(null, null, element);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("test", "attr2"));
        assertTrue(iterator.setPosition(1));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        Node node = (Node) pointer.getNode();
        assertEquals("test:attr2", node.getNodeName());
        assertEquals("value2", node.getNodeValue());
    }

    @Test
    public void testWildcardMatch() {
        DOMNodePointer parent = new DOMNodePointer(null, null, element);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName(null, "*"));
        assertTrue(iterator.setPosition(1));
        assertTrue(iterator.setPosition(2));
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testNamespaceDeclarationExcluded() {
        DOMNodePointer parent = new DOMNodePointer(null, null, element);
        // Query with prefix "*" to match all, but xmlns should be excluded
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName(null, "*"));
        int count = 0;
        while (iterator.setPosition(count + 1)) {
            count++;
        }
        assertEquals(2, count); // only attr1 and attr2, not xmlns
    }

    @Test
    public void testGetAttributeWhenNodeTypeNotElement() {
        Text textNode = document.createTextNode("some text");
        DOMNodePointer parent = new DOMNodePointer(null, null, textNode);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName(null, "attr1"));
        assertFalse(iterator.setPosition(1));
    }

    @Test
    public void testGetAttributeWithPrefixMismatch() {
        Element otherElement = document.createElementNS("http://other.com/ns", "other:element");
        otherElement.setAttributeNS("http://other.com/ns", "other:attr", "otherValue");
        document.appendChild(otherElement);
        DOMNodePointer parent = new DOMNodePointer(null, null, otherElement);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("test", "attr"));
        assertFalse(iterator.setPosition(1));
    }

    @Test(expected = NullPointerException.class)
    public void testGetAttributeWithNullParent() {
        // This should throw NPE because we call parent.getNode() without null check in constructor
        new DOMAttributeIterator(null, new QName("test", "attr"));
        fail("Should have thrown NullPointerException");
    }

    @Test
    public void testGetAttributeWithNullName() {
        // name field is used in condition; if null, getName() will NPE
        // but we avoid that by creating QName with null prefix and null localName
        DOMNodePointer parent = new DOMNodePointer(null, null, element);
        try {
            new DOMAttributeIterator(parent, new QName(null, null));
            fail("Should have thrown NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testGetNodePointerBeforeSetPosition() {
        DOMNodePointer parent = new DOMNodePointer(null, null, element);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName(null, "attr1"));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        Node node = (Node) pointer.getNode();
        assertEquals("attr1", node.getNodeName());
    }

    @Test
    public void testGetNodePointerWithInvalidPosition() {
        DOMNodePointer parent = new DOMNodePointer(null, null, element);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName(null, "attr1"));
        iterator.setPosition(0); // invalid
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
    }

    @Test
    public void testGetPosition() {
        DOMNodePointer parent = new DOMNodePointer(null, null, element);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName(null, "attr1"));
        assertEquals(0, iterator.getPosition());
        iterator.setPosition(1);
        assertEquals(1, iterator.getPosition());
    }

    @Test
    public void testSetPositionToZero() {
        DOMNodePointer parent = new DOMNodePointer(null, null, element);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName(null, "attr1"));
        assertFalse(iterator.setPosition(0));
    }

    @Test
    public void testSetPositionBeyondAttributesSize() {
        DOMNodePointer parent = new DOMNodePointer(null, null, element);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName(null, "attr1"));
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testGetAttributeWithElementWithoutAttributes() {
        Element emptyElement = document.createElement("empty");
        document.appendChild(emptyElement);
        DOMNodePointer parent = new DOMNodePointer(null, null, emptyElement);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName(null, "*"));
        assertFalse(iterator.setPosition(1));
    }

    @Test
    public void testGetAttributeWithEmptyStringLocalName() {
        DOMNodePointer parent = new DOMNodePointer(null, null, element);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName(null, ""));
        assertFalse(iterator.setPosition(1));
    }

    @Test
    public void testGetAttributeWithDifferentNamespace() {
        Element nsElement = document.createElementNS("http://test.com/ns2", "ns2:element");
        nsElement.setAttributeNS("http://test.com/ns2", "ns2:at", "val");
        document.appendChild(nsElement);
        DOMNodePointer parent = new DOMNodePointer(null, null, nsElement);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("ns2", "at"));
        assertTrue(iterator.setPosition(1));
    }

    @Test
    public void testGetAttributeWithPrefixMismatchNsMatch() {
        // Simulate scenario where prefix differs but namespace matches
        // This tests the namespace resolution in testAttr
        Element nsElement = document.createElementNS("http://test.com/ns3", "p1:element");
        nsElement.setAttributeNS("http://test.com/ns3", "p1:myattr", "myval");
        document.appendChild(nsElement);
        DOMNodePointer parent = new DOMNodePointer(null, null, nsElement);
        // Query with different prefix, same namespace
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("p2", "myattr"));
        // Since namespace matches and local name matches, should be found
        assertTrue(iterator.setPosition(1));
    }

    @Test
    public void testGetAttributeWithDifferentLocalName() {
        DOMNodePointer parent = new DOMNodePointer(null, null, element);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName(null, "nonexistent"));
        assertFalse(iterator.setPosition(1));
    }
}