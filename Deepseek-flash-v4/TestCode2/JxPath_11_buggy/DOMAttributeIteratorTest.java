package org.apache.commons.jxpath.ri.model.dom;

import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import static org.junit.Assert.*;

public class DOMAttributeIteratorTest {
    private Document document;
    private Element rootElement;
    private NodePointer nodePointer;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.newDocument();
        rootElement = document.createElement("root");
        document.appendChild(rootElement);
        nodePointer = new DOMNodePointer(null, rootElement);
    }

    @After
    public void tearDown() {
        document = null;
        rootElement = null;
        nodePointer = null;
    }

    @Test
    public void testConstructorWithNonElementNode() throws Exception {
        NodePointer nonElementPointer = new DOMNodePointer(null, document);
        DOMAttributeIterator iterator = new DOMAttributeIterator(nonElementPointer, new QName("test"));
        assertFalse(iterator.setPosition(1));
    }

    @Test
    public void testConstructorWithElementNodeAndSpecificName() throws Exception {
        rootElement.setAttribute("id", "123");
        DOMAttributeIterator iterator = new DOMAttributeIterator(nodePointer, new QName("id"));
        assertTrue(iterator.setPosition(1));
    }

    @Test
    public void testConstructorWithElementNodeAndNonExistentName() throws Exception {
        DOMAttributeIterator iterator = new DOMAttributeIterator(nodePointer, new QName("nonexistent"));
        assertFalse(iterator.setPosition(1));
    }

    @Test
    public void testConstructorWithWildcardName() throws Exception {
        rootElement.setAttribute("a", "1");
        rootElement.setAttribute("b", "2");
        DOMAttributeIterator iterator = new DOMAttributeIterator(nodePointer, new QName("*"));
        assertEquals(2, iterator.setPosition(1) ? 1 : 0 + (iterator.setPosition(2) ? 1 : 0));
        assertTrue(iterator.setPosition(1));
        assertTrue(iterator.setPosition(2));
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testConstructorWithWildcardAndXmlnsFiltering() throws Exception {
        rootElement.setAttribute("xmlns", "http://example.com");
        rootElement.setAttribute("xmlns:prefix", "http://example.com/prefix");
        rootElement.setAttribute("regular", "value");
        DOMAttributeIterator iterator = new DOMAttributeIterator(nodePointer, new QName("*"));
        assertTrue(iterator.setPosition(1));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        Attr attr = (Attr) pointer.getNode();
        assertEquals("regular", attr.getName());
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testSetPositionWithValidPositions() throws Exception {
        rootElement.setAttribute("attr1", "val1");
        rootElement.setAttribute("attr2", "val2");
        DOMAttributeIterator iterator = new DOMAttributeIterator(nodePointer, new QName("*"));
        assertTrue(iterator.setPosition(1));
        assertEquals(1, iterator.getPosition());
        assertTrue(iterator.setPosition(2));
        assertEquals(2, iterator.getPosition());
    }

    @Test
    public void testSetPositionWithInvalidPositions() throws Exception {
        rootElement.setAttribute("attr", "val");
        DOMAttributeIterator iterator = new DOMAttributeIterator(nodePointer, new QName("attr"));
        assertFalse(iterator.setPosition(0));
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testGetNodePointerAfterSetPosition() throws Exception {
        rootElement.setAttribute("key", "value");
        DOMAttributeIterator iterator = new DOMAttributeIterator(nodePointer, new QName("key"));
        assertTrue(iterator.setPosition(1));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        Attr attr = (Attr) pointer.getNode();
        assertEquals("key", attr.getName());
        assertEquals("value", attr.getValue());
    }

    @Test
    public void testGetNodePointerWhenPositionIsZero() throws Exception {
        rootElement.setAttribute("zero", "test");
        DOMAttributeIterator iterator = new DOMAttributeIterator(nodePointer, new QName("zero"));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertEquals(1, iterator.getPosition());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullParent() throws Exception {
        new DOMAttributeIterator(null, new QName("test"));
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullName() throws Exception {
        new DOMAttributeIterator(nodePointer, null);
    }

    @Test
    public void testEmptyAttributesWithWildcard() throws Exception {
        DOMAttributeIterator iterator = new DOMAttributeIterator(nodePointer, new QName("*"));
        assertFalse(iterator.setPosition(1));
    }

    @Test
    public void testMultipleAttributesWithSpecificName() throws Exception {
        rootElement.setAttribute("dup", "first");
        rootElement.setAttribute("dup", "second");
        DOMAttributeIterator iterator = new DOMAttributeIterator(nodePointer, new QName("dup"));
        assertTrue(iterator.setPosition(1));
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testNamespaceAwareAttributeMatching() throws Exception {
        Element nsElement = document.createElementNS("http://ns1.com", "prefix:local");
        rootElement.appendChild(nsElement);
        Attr nsAttr = document.createAttributeNS("http://ns1.com", "ns1:attr");
        nsAttr.setValue("nsval");
        nsElement.setAttributeNodeNS(nsAttr);
        NodePointer nsPointer = new DOMNodePointer(null, nsElement);
        DOMAttributeIterator iterator = new DOMAttributeIterator(nsPointer, new QName("ns1", "attr"));
        assertTrue(iterator.setPosition(1));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
    }
}