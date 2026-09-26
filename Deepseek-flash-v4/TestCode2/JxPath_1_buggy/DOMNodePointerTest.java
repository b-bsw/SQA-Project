package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Locale;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class DOMNodePointerTest {

    private Document document;
    private Element rootElement;
    private DOMNodePointer rootPointer;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.newDocument();
        rootElement = document.createElementNS("http://example.com/ns", "root");
        document.appendChild(rootElement);
        rootPointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
    }

    @Test
    public void testConstructorWithNodeAndLocale() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertNotNull(pointer);
        assertEquals(rootElement, pointer.getImmediateNode());
    }

    @Test
    public void testConstructorWithNodeLocaleAndId() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US, "myid");
        assertNotNull(pointer);
        assertEquals("myid", pointer.asPath().substring(4, 9));
    }

    @Test
    public void testConstructorWithParentAndNode() {
        DOMNodePointer childPointer = new DOMNodePointer(rootPointer, rootElement);
        assertNotNull(childPointer);
        assertEquals(rootElement, childPointer.getImmediateNode());
    }

    @Test
    public void testTestNodeWithNullTest() {
        assertTrue(DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testTestNodeWithNodeNameTestNonElement() {
        Text textNode = document.createTextNode("text");
        NodeNameTest nameTest = new NodeNameTest(new QName(null, "test"));
        assertFalse(DOMNodePointer.testNode(textNode, nameTest));
    }

    @Test
    public void testTestNodeWithNodeNameTestWildcardNoPrefix() {
        Element child = document.createElementNS(null, "child");
        rootElement.appendChild(child);
        NodeNameTest wildcardTest = new NodeNameTest(new QName(null, "*"), null, true);
        assertTrue(DOMNodePointer.testNode(child, wildcardTest));
    }

    @Test
    public void testTestNodeWithNodeNameTestExactMatch() {
        Element child = document.createElementNS("http://example.com/ns", "child");
        rootElement.appendChild(child);
        NodeNameTest exactTest = new NodeNameTest(new QName(null, "child"), "http://example.com/ns");
        assertTrue(DOMNodePointer.testNode(child, exactTest));
    }

    @Test
    public void testTestNodeWithNodeTypeTestNode() {
        NodeTypeTest typeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(rootElement, typeTest));
        Text textNode = document.createTextNode("text");
        assertFalse(DOMNodePointer.testNode(textNode, typeTest));
    }

    @Test
    public void testTestNodeWithNodeTypeTestText() {
        NodeTypeTest typeTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Text textNode = document.createTextNode("text");
        assertTrue(DOMNodePointer.testNode(textNode, typeTest));
        assertFalse(DOMNodePointer.testNode(rootElement, typeTest));
    }

    @Test
    public void testTestNodeWithNodeTypeTestComment() {
        NodeTypeTest typeTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        org.w3c.dom.Comment comment = document.createComment("comment");
        assertTrue(DOMNodePointer.testNode(comment, typeTest));
        assertFalse(DOMNodePointer.testNode(rootElement, typeTest));
    }

    @Test
    public void testTestNodeWithNodeTypeTestPI() {
        NodeTypeTest typeTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        org.w3c.dom.ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        assertTrue(DOMNodePointer.testNode(pi, typeTest));
        assertFalse(DOMNodePointer.testNode(rootElement, typeTest));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTest() {
        org.w3c.dom.ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        ProcessingInstructionTest piTest = new ProcessingInstructionTest("target");
        assertTrue(DOMNodePointer.testNode(pi, piTest));
        ProcessingInstructionTest wrongPiTest = new ProcessingInstructionTest("wrong");
        assertFalse(DOMNodePointer.testNode(pi, wrongPiTest));
    }

    @Test
    public void testTestNodeWithUnknownTestType() {
        NodeTest unknownTest = new NodeTest() {};
        assertFalse(DOMNodePointer.testNode(rootElement, unknownTest));
    }

    @Test
    public void testGetNameForElement() {
        Element child = document.createElementNS("http://example.com/ns", "prefix:child");
        rootElement.appendChild(child);
        DOMNodePointer childPointer = new DOMNodePointer(child, Locale.ENGLISH);
        QName name = childPointer.getName();
        assertEquals("child", name.getName());
        assertEquals("prefix", name.getPrefix());
    }

    @Test
    public void testGetNameForProcessingInstruction() {
        org.w3c.dom.ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        DOMNodePointer piPointer = new DOMNodePointer(pi, Locale.ENGLISH);
        QName name = piPointer.getName();
        assertEquals("target", name.getName());
        assertNull(name.getPrefix());
    }

    @Test
    public void testGetNamespaceURINullPrefix() {
        Element child = document.createElementNS("http://example.com/ns", "child");
        rootElement.appendChild(child);
        DOMNodePointer childPointer = new DOMNodePointer(child, Locale.ENGLISH);
        String ns = childPointer.getNamespaceURI(null);
        assertNull(ns);
    }

    @Test
    public void testGetNamespaceURIEmptyPrefix() {
        Element child = document.createElementNS("http://example.com/ns", "child");
        rootElement.appendChild(child);
        DOMNodePointer childPointer = new DOMNodePointer(child, Locale.ENGLISH);
        String ns = childPointer.getNamespaceURI("");
        assertNull(ns);
    }

    @Test
    public void testGetNamespaceURIXmlPrefix() {
        String ns = rootPointer.getNamespaceURI("xml");
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, ns);
    }

    @Test
    public void testGetNamespaceURIXmlnsPrefix() {
        String ns = rootPointer.getNamespaceURI("xmlns");
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, ns);
    }

    @Test
    public void testGetNamespaceURIUnknownPrefix() {
        String ns = rootPointer.getNamespaceURI("unknown");
        assertNull(ns);
    }

    @Test
    public void testGetDefaultNamespaceURIWithXmlns() {
        rootElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://default.com/ns");
        String defaultNs = rootPointer.getDefaultNamespaceURI();
        assertEquals("http://default.com/ns", defaultNs);
    }

    @Test
    public void testGetDefaultNamespaceURIWithoutXmlns() {
        String defaultNs = rootPointer.getDefaultNamespaceURI();
        assertNull(defaultNs);
    }

    @Test
    public void testIsLanguageWithXmlLang() {
        rootElement.setAttributeNS("http://www.w3.org/XML/1998/namespace", "xml:lang", "en");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertTrue(pointer.isLanguage("en"));
        assertFalse(pointer.isLanguage("fr"));
    }

    @Test
    public void testIsLanguageWithoutXmlLang() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertFalse(pointer.isLanguage("en"));
    }

    @Test
    public void testSetValueOnTextNode() {
        Text textNode = document.createTextNode("old");
        rootElement.appendChild(textNode);
        DOMNodePointer textPointer = new DOMNodePointer(textNode, Locale.ENGLISH);
        textPointer.setValue("new");
        assertEquals("new", textNode.getNodeValue());
    }

    @Test
    public void testSetValueOnTextNodeWithEmptyStringRemovesNode() {
        Text textNode = document.createTextNode("old");
        rootElement.appendChild(textNode);
        DOMNodePointer textPointer = new DOMNodePointer(textNode, Locale.ENGLISH);
        textPointer.setValue("");
        assertNull(textNode.getParentNode());
    }

    @Test
    public void testSetValueOnElementWithString() {
        DOMNodePointer elPointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        elPointer.setValue("newText");
        assertEquals("newText", rootElement.getTextContent());
    }

    @Test
    public void testSetValueOnElementWithNode() {
        Element child = document.createElement("child");
        DOMNodePointer elPointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        elPointer.setValue(child);
        assertEquals(1, rootElement.getChildNodes().getLength());
        Node addedNode = rootElement.getChildNodes().item(0);
        assertEquals("child", addedNode.getNodeName());
        assertTrue(addedNode instanceof Element);
    }

    @Test
    public void testRemoveRootNodeThrowsException() {
        DOMNodePointer rootPtr = new DOMNodePointer(document.getDocumentElement(), Locale.ENGLISH);
        try {
            rootPtr.remove();
            fail("Should have thrown JXPathException");
        } catch (JXPathException e) {
            // expected
        }
    }

    @Test
    public void testRemoveNonRootNode() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.ENGLISH);
        childPtr.remove();
        assertEquals(0, rootElement.getChildNodes().getLength());
    }

    @Test
    public void testAsPathForElementWithDefaultNamespace() {
        Element child = document.createElementNS("http://example.com/ns", "child");
        rootElement.appendChild(child);
        DOMNodePointer childPtr = new DOMNodePointer(rootPointer, child);
        String path = childPtr.asPath();
        assertTrue(path.contains("child[1]"));
    }

    @Test
    public void testAsPathWithId() {
        Element child = document.createElement("child");
        child.setAttribute("id", "testId");
        rootElement.appendChild(child);
        DOMNodePointer idPointer = new DOMNodePointer(child, Locale.ENGLISH, "testId");
        String path = idPointer.asPath();
        assertEquals("id('testId')", path);
    }

    @Test
    public void testHashCode() {
        int hc1 = rootPointer.hashCode();
        DOMNodePointer samePtr = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertEquals(hc1, samePtr.hashCode());
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(rootPointer.equals(rootPointer));
    }

    @Test
    public void testEqualsDifferentType() {
        assertFalse(rootPointer.equals("string"));
    }

    @Test
    public void testEqualsSameNode() {
        DOMNodePointer other = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertTrue(rootPointer.equals(other));
    }

    @Test
    public void testEqualsDifferentNode() {
        Element otherElement = document.createElement("other");
        DOMNodePointer other = new DOMNodePointer(otherElement, Locale.ENGLISH);
        assertFalse(rootPointer.equals(other));
    }

    @Test
    public void testGetPrefixWithNullPrefix() {
        Element el = document.createElement("ns:test");
        assertEquals("ns", DOMNodePointer.getPrefix(el));
    }

    @Test
    public void testGetPrefixWithExplicitPrefix() {
        Element el = document.createElementNS("http://ns.com", "p:test");
        assertEquals("p", DOMNodePointer.getPrefix(el));
    }

    @Test
    public void testGetPrefixNoPrefix() {
        Element el = document.createElement("test");
        assertNull(DOMNodePointer.getPrefix(el));
    }

    @Test
    public void testGetLocalNameWithExplicitLocalName() {
        Element el = document.createElementNS("http://ns.com", "p:test");
        assertEquals("test", DOMNodePointer.getLocalName(el));
    }

    @Test
    public void testGetLocalNameNoPrefix() {
        Element el = document.createElement("test");
        assertEquals("test", DOMNodePointer.getLocalName(el));
    }

    @Test
    public void testGetNamespaceURIForElementWithNS() {
        Element el = document.createElementNS("http://ns.com", "test");
        assertEquals("http://ns.com", DOMNodePointer.getNamespaceURI(el));
    }

    @Test
    public void testGetNamespaceURIForElementWithoutNS() {
        Element el = document.createElement("test");
        assertNull(DOMNodePointer.getNamespaceURI(el));
    }

    @Test
    public void testGetValueForTextNode() {
        Text textNode = document.createTextNode("  text  ");
        DOMNodePointer ptr = new DOMNodePointer(textNode, Locale.ENGLISH);
        assertEquals("text", ptr.getValue());
    }

    @Test
    public void testGetValueForElementWithText() {
        Element el = document.createElement("el");
        el.appendChild(document.createTextNode("value"));
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.ENGLISH);
        assertEquals("value", ptr.getValue());
    }

    @Test
    public void testGetPointerByIDNotFound() {
        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(document);
        org.apache.commons.jxpath.Pointer ptr = docPointer.getPointerByID(context, "nonexistent");
        assertNotNull(ptr);
    }

    @Test
    public void testCompareChildNodePointersSameNode() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer childPtr1 = new DOMNodePointer(child, Locale.ENGLISH);
        DOMNodePointer childPtr2 = new DOMNodePointer(child, Locale.ENGLISH);
        assertEquals(0, rootPointer.compareChildNodePointers(childPtr1, childPtr2));
    }

    @Test
    public void testCompareChildNodePointersAttributeVsAttribute() {
        rootElement.setAttribute("attr1", "val1");
        rootElement.setAttribute("attr2", "val2");

        Node attr1 = rootElement.getAttributeNode("attr1");
        Node attr2 = rootElement.getAttributeNode("attr2");

        DOMNodePointer ptr1 = new DOMNodePointer(attr1, Locale.ENGLISH);
        DOMNodePointer ptr2 = new DOMNodePointer(attr2, Locale.ENGLISH);

        int result = rootPointer.compareChildNodePointers(ptr1, ptr2);
        assertTrue(result == -1 || result == 1);
    }

    @Test
    public void testGetLengthReturnsOne() {
        assertEquals(1, rootPointer.getLength());
    }

    @Test
    public void testIsCollectionReturnsFalse() {
        assertFalse(rootPointer.isCollection());
    }

    @Test
    public void testIsActualReturnsTrue() {
        assertTrue(rootPointer.isActual());
    }

    @Test
    public void testIsLeafReturnsFalseForElementWithChildren() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        assertFalse(rootPointer.isLeaf());
    }

    @Test
    public void testIsLeafReturnsTrueForElementWithoutChildren() {
        assertTrue(rootPointer.isLeaf());
    }

    @Test
    public void testChildIterator() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        org.apache.commons.jxpath.ri.model.NodeIterator it = rootPointer.childIterator(null, false, null);
        assertNotNull(it);
        assertTrue(it.setPosition(1));
    }

    @Test
    public void testAttributeIterator() {
        rootElement.setAttribute("attr", "val");
        org.apache.commons.jxpath.ri.model.NodeIterator it = rootPointer.attributeIterator(new QName(null, "attr"));
        assertNotNull(it);
        assertTrue(it.setPosition(1));
    }

    @Test
    public void testNamespaceIterator() {
        rootElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns1", "http://ns1.com");
        org.apache.commons.jxpath.ri.model.NodeIterator it = rootPointer.namespaceIterator();
        assertNotNull(it);
    }

    @Test
    public void testNamespacePointer() {
        org.apache.commons.jxpath.ri.model.NodePointer nsPtr = rootPointer.namespacePointer("xml");
        assertNotNull(nsPtr);
    }

    @Test
    public void testGetBaseValue() {
        assertEquals(rootElement, rootPointer.getBaseValue());
    }

    @Test
    public void testGetImmediateNode() {
        assertEquals(rootElement, rootPointer.getImmediateNode());
    }

    @Test
    public void testCreateAttributeOnElement() {
        JXPathContext context = JXPathContext.newContext(document);
        org.apache.commons.jxpath.ri.model.NodePointer attrPtr = rootPointer.createAttribute(context, new QName(null, "newAttr"));
        assertNotNull(attrPtr);
        assertTrue(rootElement.hasAttribute("newAttr"));
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttributeWithUnknownPrefix() {
        JXPathContext context = JXPathContext.newContext(document);
        rootPointer.createAttribute(context, new QName("unknown", "attr"));
    }
}