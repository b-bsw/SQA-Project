package org.apache.commons.jxpath.ri.model.jdom;

import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.jdom.Element;
import org.jdom.Namespace;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class JDOMAttributeIteratorTest {

    private Element element;
    private Element elementWithAttrs;
    private NodePointer parentPointer;

    @Before
    public void setUp() {
        element = new Element("root");
        elementWithAttrs = new Element("root");
        elementWithAttrs.setAttribute("id", "1");
        elementWithAttrs.setAttribute("name", "test", Namespace.getNamespace("ns", "http://example.com"));
        parentPointer = new NodePointer() {
            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object getNode() {
                return elementWithAttrs;
            }

            @Override
            public boolean isLeaf() {
                return false;
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public QName getName() {
                return null;
            }

            @Override
            public Object getImmediateNode() {
                return null;
            }

            @Override
            public NodePointer getImmediateValuePointer() {
                return null;
            }

            @Override
            public NodePointer getParent() {
                return null;
            }

            @Override
            public int getIndex() {
                return 0;
            }

            @Override
            public boolean isActual() {
                return false;
            }

            @Override
            public boolean isLanguage(String lang) {
                return false;
            }

            @Override
            public NodePointer createPath(JXPathContext context, Object value) {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name, int index) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name) {
                return null;
            }

            @Override
            public void setValue(Object value) {
            }

            @Override
            public int compareChildNodePointers(NodePointer p1, NodePointer p2) {
                return 0;
            }

            @Override
            public boolean isDynamicPropertyDeclarationSupported() {
                return false;
            }

            @Override
            public boolean isRoot() {
                return false;
            }

            @Override
            public boolean isAttribute() {
                return false;
            }

            @Override
            public boolean isNamespace() {
                return false;
            }

            @Override
            public boolean isPointer() {
                return false;
            }

            @Override
            public NodePointer asPath() {
                return null;
            }
        };
    }

    @After
    public void tearDown() {
        element = null;
        elementWithAttrs = null;
        parentPointer = null;
    }

    @Test
    public void testConstructorWithNullNode() {
        NodePointer nullParent = new NodePointer() {
            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object getNode() {
                return null;
            }

            @Override
            public boolean isLeaf() {
                return false;
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public QName getName() {
                return null;
            }

            @Override
            public Object getImmediateNode() {
                return null;
            }

            @Override
            public NodePointer getImmediateValuePointer() {
                return null;
            }

            @Override
            public NodePointer getParent() {
                return null;
            }

            @Override
            public int getIndex() {
                return 0;
            }

            @Override
            public boolean isActual() {
                return false;
            }

            @Override
            public boolean isLanguage(String lang) {
                return false;
            }

            @Override
            public NodePointer createPath(JXPathContext context, Object value) {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name, int index) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name) {
                return null;
            }

            @Override
            public void setValue(Object value) {
            }

            @Override
            public int compareChildNodePointers(NodePointer p1, NodePointer p2) {
                return 0;
            }

            @Override
            public boolean isDynamicPropertyDeclarationSupported() {
                return false;
            }

            @Override
            public boolean isRoot() {
                return false;
            }

            @Override
            public boolean isAttribute() {
                return false;
            }

            @Override
            public boolean isNamespace() {
                return false;
            }

            @Override
            public boolean isPointer() {
                return false;
            }

            @Override
            public NodePointer asPath() {
                return null;
            }
        };
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(nullParent, new QName("test"));
        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testConstructorWithNonElementNode() {
        NodePointer nonElementParent = new NodePointer() {
            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object getNode() {
                return "string";
            }

            @Override
            public boolean isLeaf() {
                return false;
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public QName getName() {
                return null;
            }

            @Override
            public Object getImmediateNode() {
                return null;
            }

            @Override
            public NodePointer getImmediateValuePointer() {
                return null;
            }

            @Override
            public NodePointer getParent() {
                return null;
            }

            @Override
            public int getIndex() {
                return 0;
            }

            @Override
            public boolean isActual() {
                return false;
            }

            @Override
            public boolean isLanguage(String lang) {
                return false;
            }

            @Override
            public NodePointer createPath(JXPathContext context, Object value) {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name, int index) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name) {
                return null;
            }

            @Override
            public void setValue(Object value) {
            }

            @Override
            public int compareChildNodePointers(NodePointer p1, NodePointer p2) {
                return 0;
            }

            @Override
            public boolean isDynamicPropertyDeclarationSupported() {
                return false;
            }

            @Override
            public boolean isRoot() {
                return false;
            }

            @Override
            public boolean isAttribute() {
                return false;
            }

            @Override
            public boolean isNamespace() {
                return false;
            }

            @Override
            public boolean isPointer() {
                return false;
            }

            @Override
            public NodePointer asPath() {
                return null;
            }
        };
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(nonElementParent, new QName("test"));
        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testGetDefaultNamespaceAttribute() {
        NodePointer parent = new NodePointer() {
            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object getNode() {
                return elementWithAttrs;
            }

            @Override
            public boolean isLeaf() {
                return false;
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public QName getName() {
                return null;
            }

            @Override
            public Object getImmediateNode() {
                return null;
            }

            @Override
            public NodePointer getImmediateValuePointer() {
                return null;
            }

            @Override
            public NodePointer getParent() {
                return null;
            }

            @Override
            public int getIndex() {
                return 0;
            }

            @Override
            public boolean isActual() {
                return false;
            }

            @Override
            public boolean isLanguage(String lang) {
                return false;
            }

            @Override
            public NodePointer createPath(JXPathContext context, Object value) {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name, int index) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name) {
                return null;
            }

            @Override
            public void setValue(Object value) {
            }

            @Override
            public int compareChildNodePointers(NodePointer p1, NodePointer p2) {
                return 0;
            }

            @Override
            public boolean isDynamicPropertyDeclarationSupported() {
                return false;
            }

            @Override
            public boolean isRoot() {
                return false;
            }

            @Override
            public boolean isAttribute() {
                return false;
            }

            @Override
            public boolean isNamespace() {
                return false;
            }

            @Override
            public boolean isPointer() {
                return false;
            }

            @Override
            public NodePointer asPath() {
                return null;
            }
        };
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("id"));
        assertTrue(iterator.setPosition(1));
        assertEquals(1, iterator.getPosition());
        assertNotNull(iterator.getNodePointer());
    }

    @Test
    public void testGetNamespaceAttribute() {
        NodePointer parent = new NodePointer() {
            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object getNode() {
                return elementWithAttrs;
            }

            @Override
            public boolean isLeaf() {
                return false;
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public QName getName() {
                return null;
            }

            @Override
            public Object getImmediateNode() {
                return null;
            }

            @Override
            public NodePointer getImmediateValuePointer() {
                return null;
            }

            @Override
            public NodePointer getParent() {
                return null;
            }

            @Override
            public int getIndex() {
                return 0;
            }

            @Override
            public boolean isActual() {
                return false;
            }

            @Override
            public boolean isLanguage(String lang) {
                return false;
            }

            @Override
            public NodePointer createPath(JXPathContext context, Object value) {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name, int index) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name) {
                return null;
            }

            @Override
            public void setValue(Object value) {
            }

            @Override
            public int compareChildNodePointers(NodePointer p1, NodePointer p2) {
                return 0;
            }

            @Override
            public boolean isDynamicPropertyDeclarationSupported() {
                return false;
            }

            @Override
            public boolean isRoot() {
                return false;
            }

            @Override
            public boolean isAttribute() {
                return false;
            }

            @Override
            public boolean isNamespace() {
                return false;
            }

            @Override
            public boolean isPointer() {
                return false;
            }

            @Override
            public NodePointer asPath() {
                return null;
            }
        };
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("ns", "name"));
        assertTrue(iterator.setPosition(1));
        assertEquals(1, iterator.getPosition());
        assertNotNull(iterator.getNodePointer());
    }

    @Test
    public void testWildcardNamespaceAttribute() {
        NodePointer parent = new NodePointer() {
            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object getNode() {
                return elementWithAttrs;
            }

            @Override
            public boolean isLeaf() {
                return false;
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public QName getName() {
                return null;
            }

            @Override
            public Object getImmediateNode() {
                return null;
            }

            @Override
            public NodePointer getImmediateValuePointer() {
                return null;
            }

            @Override
            public NodePointer getParent() {
                return null;
            }

            @Override
            public int getIndex() {
                return 0;
            }

            @Override
            public boolean isActual() {
                return false;
            }

            @Override
            public boolean isLanguage(String lang) {
                return false;
            }

            @Override
            public NodePointer createPath(JXPathContext context, Object value) {
                return null;
            }

            @Override
            public NodePointer createPath(JXPathContext context) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name, int index) {
                return null;
            }

            @Override
            public NodePointer createChild(JXPathContext context, QName name) {
                return null;
            }

            @Override
            public void setValue(Object value) {
            }

            @Override
            public int compareChildNodePointers(NodePointer p1, NodePointer p2) {
                return 0;
            }

            @Override
            public boolean isDynamicPropertyDeclarationSupported() {
                return false;
            }

            @Override
            public boolean isRoot() {
                return false;
            }

            @Override
            public boolean isAttribute() {
                return false;
            }

            @Override
            public boolean isNamespace() {
                return false;
            }

            @Override
            public boolean isPointer() {
                return false;
            }

            @Override
            public NodePointer asPath() {
                return null;
            }
        };
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("ns", "*"));
        assertTrue(iterator.setPosition(1));
        assertEquals(1, iterator.getPosition());
        assertNotNull(iterator.getNodePointer());
    }

    @Test
    public void testSetPositionOutOfRange() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName("id"));
        assertTrue(iterator.setPosition(1));
        assertFalse(iterator.setPosition(2));
        assertFalse(iterator.setPosition(0));
    }

    @Test
    public void testGetNodePointerBeforeSetPosition() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName("id"));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertEquals(1, iterator.getPosition());
    }

    @Test
    public void testGetNodePointerWithIndexLessThanZero() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName("id"));
        iterator.setPosition(1);
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
    }
}