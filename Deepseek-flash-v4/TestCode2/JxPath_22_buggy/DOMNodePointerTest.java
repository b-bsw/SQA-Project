package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.Compiler;
import java.util.Locale;

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
        rootElement = document.createElementNS("http://example.com/ns", "ns:root");
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
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US, "testId");
        assertNotNull(pointer);
        assertEquals("testId", pointer.asPath().substring(4, 10));
    }

    @Test
    public void testConstructorWithParentAndNode() {
        DOMNodePointer parent = new DOMNodePointer(rootElement, Locale.ENGLISH);
        Element childElement = document.createElementNS("http://example.com/ns", "child");
        rootElement.appendChild(childElement);
        DOMNodePointer childPointer = new DOMNodePointer(parent, childElement);
        assertNotNull(childPointer);
        assertEquals(childElement, childPointer.getImmediateNode());
    }

    @Test
    public void testTestNodeWithNullTest() {
        assertTrue(DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testTestNodeWithNodeNameTestNonElement() {
        Text textNode = document.createTextNode("text");
        NodeNameTest test = new NodeNameTest(new QName(null, "text"));
        assertFalse(DOMNodePointer.testNode(textNode, test));
    }

    @Test
    public void testTestNodeWithNodeNameTestWildcardNoPrefix() {
        NodeNameTest test = new NodeNameTest(new QName(null, "*"), null, true);
        assertTrue(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeNameTestMatchingNameAndNamespace() {
        NodeNameTest test = new NodeNameTest(new QName("ns", "root"), "http://example.com/ns");
        assertTrue(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestNode() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestText() {
        Text textNode = document.createTextNode("text");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(DOMNodePointer.testNode(textNode, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestComment() {
        Comment comment = document.createComment("comment");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(DOMNodePointer.testNode(comment, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestPI() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestDefault() {
        Attr attr = document.createAttribute("attr");
        NodeTypeTest test = new NodeTypeTest(999);
        assertFalse(DOMNodePointer.testNode(attr, test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTest() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTestNonPI() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertFalse(DOMNodePointer.testNode(document.createTextNode("text"), new ProcessingInstructionTest("target")));
    }

    @Test
    public void testGetNameForElement() {
        QName name = rootPointer.getName();
        assertEquals("ns", name.getPrefix());
        assertEquals("root", name.getName());
    }

    @Test
    public void testGetNameForProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        DOMNodePointer piPointer = new DOMNodePointer(pi, Locale.ENGLISH);
        QName name = piPointer.getName();
        assertNull(name.getPrefix());
        assertEquals("target", name.getName());
    }

    @Test
    public void testGetNamespaceURINoNamespace() {
        Element noNsElement = document.createElement("plain");
        DOMNodePointer pointer = new DOMNodePointer(noNsElement, Locale.ENGLISH);
        assertNull(pointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIForElement() {
        assertEquals("http://example.com/ns", rootPointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIWithNullPrefix() {
        assertNotNull(rootPointer.getNamespaceURI(null));
    }

    @Test
    public void testGetNamespaceURIWithEmptyPrefix() {
        assertNotNull(rootPointer.getNamespaceURI(""));
    }

    @Test
    public void testGetNamespaceURIWithXmlPrefix() {
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, rootPointer.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURIWithXmlnsPrefix() {
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, rootPointer.getNamespaceURI("xmlns"));
    }

    @Test
    public void testGetNamespaceURIWithUnknownPrefix() {
        assertNull(rootPointer.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURIWithDefinedPrefix() {
        Element child = document.createElementNS("http://child.example.com", "child");
        child.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:pre", "http://child.example.com");
        rootElement.appendChild(child);
        DOMNodePointer childPointer = new DOMNodePointer(child, Locale.ENGLISH);
        assertEquals("http://child.example.com", childPointer.getNamespaceURI("pre"));
    }

    @Test
    public void testGetDefaultNamespaceURIWithNoDefault() {
        assertNull(rootPointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURIWithDefault() {
        rootElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://default.example.com");
        assertEquals("http://default.example.com", rootPointer.getDefaultNamespaceURI());
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
    public void testIsActual() {
        assertTrue(rootPointer.isActual());
    }

    @Test
    public void testIsCollection() {
        assertFalse(rootPointer.isCollection());
    }

    @Test
    public void testGetLength() {
        assertEquals(1, rootPointer.getLength());
    }

    @Test
    public void testIsLeafWithChild() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        assertFalse(rootPointer.isLeaf());
    }

    @Test
    public void testIsLeafWithoutChild() {
        assertTrue(rootPointer.isLeaf());
    }

    @Test
    public void testIsLanguage() {
        rootElement.setAttribute("xml:lang", "en-US");
        assertTrue(rootPointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageNoLangAttribute() {
        assertFalse(rootPointer.isLanguage("en"));
    }

    @Test
    public void testFindEnclosingAttribute() {
        rootElement.setAttribute("xml:lang", "en");
        assertEquals("en", DOMNodePointer.findEnclosingAttribute(rootElement, "xml:lang"));
    }

    @Test
    public void testFindEnclosingAttributeNotFound() {
        assertNull(DOMNodePointer.findEnclosingAttribute(rootElement, "xml:lang"));
    }

    @Test
    public void testGetLanguage() {
        rootElement.setAttribute("xml:lang", "fr");
        assertEquals("fr", rootPointer.getLanguage());
    }

    @Test
    public void testGetLanguageNoAttribute() {
        assertNull(rootPointer.getLanguage());
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
    public void testSetValueOnTextNodeWithEmptyString() {
        Text textNode = document.createTextNode("old");
        rootElement.appendChild(textNode);
        DOMNodePointer textPointer = new DOMNodePointer(textNode, Locale.ENGLISH);
        textPointer.setValue("");
        assertNull(textNode.getParentNode());
    }

    @Test
    public void testSetValueOnElementWithNode() {
        Element newChild = document.createElement("newChild");
        rootPointer.setValue(newChild);
        assertEquals(1, rootElement.getChildNodes().getLength());
    }

    @Test
    public void testSetValueOnElementWithString() {
        rootPointer.setValue("stringValue");
        assertEquals(1, rootElement.getChildNodes().getLength());
        assertEquals("stringValue", rootElement.getTextContent());
    }

    @Test
    public void testRemove() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer childPointer = new DOMNodePointer(child, Locale.ENGLISH);
        childPointer.remove();
        assertNull(child.getParentNode());
    }

    @Test
    public void testRemoveRootThrowsException() {
        try {
            rootPointer.remove();
            fail("Expected JXPathException");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            assertEquals("Cannot remove root DOM node", e.getMessage());
        }
    }

    @Test
    public void testAsPathWithId() {
        DOMNodePointer pointerWithId = new DOMNodePointer(rootElement, Locale.ENGLISH, "myId");
        assertTrue(pointerWithId.asPath().contains("id('myId')"));
    }

    @Test
    public void testAsPathForElementWithNamespace() {
        Element child = document.createElementNS("http://child.example.com", "ns:child");
        child.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns", "http://child.example.com");
        rootElement.appendChild(child);
        DOMNodePointer childPointer = new DOMNodePointer(rootPointer, child);
        String path = childPointer.asPath();
        assertTrue(path.contains("child["));
    }

    @Test
    public void testAsPathForTextNode() {
        Text textNode = document.createTextNode("text");
        rootElement.appendChild(textNode);
        DOMNodePointer textPointer = new DOMNodePointer(rootPointer, textNode);
        String path = textPointer.asPath();
        assertTrue(path.contains("/text()["));
    }

    @Test
    public void testAsPathForProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        rootElement.appendChild(pi);
        DOMNodePointer piPointer = new DOMNodePointer(rootPointer, pi);
        String path = piPointer.asPath();
        assertTrue(path.contains("processing-instruction('target')"));
    }

    @Test
    public void testHashCode() {
        int hash1 = rootPointer.hashCode();
        int hash2 = new DOMNodePointer(rootElement, Locale.ENGLISH).hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(rootPointer.equals(rootPointer));
    }

    @Test
    public void testEqualsDifferentObjectSameNode() {
        DOMNodePointer another = new DOMNodePointer(rootElement, Locale.US);
        assertTrue(rootPointer.equals(another));
    }

    @Test
    public void testEqualsDifferentNode() {
        Element otherElement = document.createElement("other");
        DOMNodePointer otherPointer = new DOMNodePointer(otherElement, Locale.ENGLISH);
        assertFalse(rootPointer.equals(otherPointer));
    }

    @Test
    public void testGetPrefixWithPrefix() {
        assertEquals("ns", DOMNodePointer.getPrefix(rootElement));
    }

    @Test
    public void testGetPrefixWithoutPrefix() {
        Element noPrefixElement = document.createElement("noprefix");
        assertNull(DOMNodePointer.getPrefix(noPrefixElement));
    }

    @Test
    public void testGetLocalNameWithLocalName() {
        assertEquals("root", DOMNodePointer.getLocalName(rootElement));
    }

    @Test
    public void testGetLocalNameWithoutPrefix() {
        Element noPrefixElement = document.createElement("noprefix");
        assertEquals("noprefix", DOMNodePointer.getLocalName(noPrefixElement));
    }

    @Test
    public void testGetNamespaceURIForDocument() {
        Document doc = document;
        DOMNodePointer docPointer = new DOMNodePointer(doc, Locale.ENGLISH);
        assertEquals("http://example.com/ns", docPointer.getNamespaceURI());
    }

    @Test
    public void testGetValueForCommentNode() {
        Comment comment = document.createComment(" comment ");
        DOMNodePointer commentPointer = new DOMNodePointer(comment, Locale.ENGLISH);
        assertEquals("comment", commentPointer.getValue());
    }

    @Test
    public void testGetValueForTextNode() {
        Text text = document.createTextNode(" text ");
        DOMNodePointer textPointer = new DOMNodePointer(text, Locale.ENGLISH);
        assertEquals("text", textPointer.getValue());
    }

    @Test
    public void testGetValueForProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", " data ");
        DOMNodePointer piPointer = new DOMNodePointer(pi, Locale.ENGLISH);
        assertEquals("data", piPointer.getValue());
    }

    @Test
    public void testGetValueForElementWithChildren() {
        Element child = document.createElement("child");
        child.setTextContent("childText");
        rootElement.appendChild(child);
        DOMNodePointer elementPointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertEquals("childText", elementPointer.getValue());
    }

    @Test
    public void testCompareChildNodePointersBothAttributes() {
        Attr attr1 = document.createAttribute("attr1");
        Attr attr2 = document.createAttribute("attr2");
        rootElement.setAttributeNode(attr1);
        rootElement.setAttributeNode(attr2);
        DOMNodePointer attr1Pointer = new DOMNodePointer(attr1, Locale.ENGLISH);
        DOMNodePointer attr2Pointer = new DOMNodePointer(attr2, Locale.ENGLISH);
        int result = rootPointer.compareChildNodePointers(attr1Pointer, attr2Pointer);
        assertEquals(-1, result);
    }

    @Test
    public void testCompareChildNodePointersSameNode() {
        Text text = document.createTextNode("text");
        rootElement.appendChild(text);
        DOMNodePointer textPointer = new DOMNodePointer(text, Locale.ENGLISH);
        int result = rootPointer.compareChildNodePointers(textPointer, textPointer);
        assertEquals(0, result);
    }

    @Test
    public void testCompareChildNodePointersAttributeVsElement() {
        Attr attr = document.createAttribute("attr");
        rootElement.setAttributeNode(attr);
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer attrPointer = new DOMNodePointer(attr, Locale.ENGLISH);
        DOMNodePointer childPointer = new DOMNodePointer(child, Locale.ENGLISH);
        int result = rootPointer.compareChildNodePointers(attrPointer, childPointer);
        assertEquals(-1, result);
    }

    @Test
    public void testCompareChildNodePointersElementVsAttribute() {
        Attr attr = document.createAttribute("attr");
        rootElement.setAttributeNode(attr);
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer attrPointer = new DOMNodePointer(attr, Locale.ENGLISH);
        DOMNodePointer childPointer = new DOMNodePointer(child, Locale.ENGLISH);
        int result = rootPointer.compareChildNodePointers(childPointer, attrPointer);
        assertEquals(1, result);
    }
}