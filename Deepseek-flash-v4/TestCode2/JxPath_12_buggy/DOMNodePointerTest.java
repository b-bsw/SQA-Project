package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;

public class DOMNodePointerTest {

    private Document document;
    private Element rootElement;
    private Element childElement;
    private Text textNode;
    private DOMNodePointer rootPointer;
    private DOMNodePointer childPointer;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.newDocument();
        rootElement = document.createElementNS("http://example.com/ns", "root");
        document.appendChild(rootElement);
        childElement = document.createElementNS("http://example.com/ns", "child");
        rootElement.appendChild(childElement);
        textNode = document.createTextNode("text content");
        childElement.appendChild(textNode);
        rootPointer = new DOMNodePointer(rootElement, Locale.US);
        childPointer = new DOMNodePointer(rootElement, Locale.US);
    }

    @Test
    public void testTestNodeWithNullTest() {
        assertTrue(DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testTestNodeWithNodeNameTestMatching() {
        NodeTest test = new NodeNameTest(new QName("child"));
        assertTrue(DOMNodePointer.testNode(childElement, test));
    }

    @Test
    public void testTestNodeWithNodeNameTestNonMatching() {
        NodeTest test = new NodeNameTest(new QName("nonexistent"));
        assertFalse(DOMNodePointer.testNode(childElement, test));
    }

    @Test
    public void testTestNodeWithTextNodeForNodeNameTest() {
        NodeTest test = new NodeNameTest(new QName("child"));
        assertFalse(DOMNodePointer.testNode(textNode, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestNode() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(rootElement, test));
        assertFalse(DOMNodePointer.testNode(textNode, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestText() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(DOMNodePointer.testNode(textNode, test));
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestComment() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Comment comment = document.createComment("comment");
        assertTrue(DOMNodePointer.testNode(comment, test));
        assertFalse(DOMNodePointer.testNode(textNode, test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTest() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(DOMNodePointer.testNode(pi, test));
        ProcessingInstructionTest nonMatch = new ProcessingInstructionTest("other");
        assertFalse(DOMNodePointer.testNode(pi, nonMatch));
    }

    @Test
    public void testGetNameForElement() {
        QName name = rootPointer.getName();
        assertEquals("root", name.getName());
        assertNull(name.getPrefix());
    }

    @Test
    public void testGetNameForProcessingInstruction() throws Exception {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        DOMNodePointer piPointer = new DOMNodePointer(pi, Locale.US);
        QName name = piPointer.getName();
        assertEquals("target", name.getName());
    }

    @Test
    public void testGetNamespaceURIForNullPrefix() {
        rootElement.setAttribute("xmlns", "http://default-ns.com");
        String ns = rootPointer.getNamespaceURI(null);
        assertNull(ns);
    }

    @Test
    public void testGetNamespaceURIForXmlPrefix() {
        String ns = rootPointer.getNamespaceURI("xml");
        assertEquals("http://www.w3.org/XML/1998/namespace", ns);
    }

    @Test
    public void testGetNamespaceURIForXmlnsPrefix() {
        String ns = rootPointer.getNamespaceURI("xmlns");
        assertEquals("http://www.w3.org/2000/xmlns/", ns);
    }

    @Test
    public void testGetNamespaceURIKnownPrefix() {
        rootElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:prefix1", "http://myns.com");
        String ns = rootPointer.getNamespaceURI("prefix1");
        assertEquals("http://myns.com", ns);
    }

    @Test
    public void testGetDefaultNamespaceURIWhenSet() {
        rootElement.setAttribute("xmlns", "http://default.com");
        String ns = rootPointer.getDefaultNamespaceURI();
        assertEquals("http://default.com", ns);
    }

    @Test
    public void testGetDefaultNamespaceURIWhenNotSet() {
        String ns = rootPointer.getDefaultNamespaceURI();
        assertNull(ns);
    }

    @Test
    public void testIsLeafWithChildren() {
        assertFalse(rootPointer.isLeaf());
    }

    @Test
    public void testIsLeafWithoutChildren() {
        Element leaf = document.createElement("leaf");
        DOMNodePointer leafPointer = new DOMNodePointer(leaf, Locale.US);
        assertTrue(leafPointer.isLeaf());
    }

    @Test
    public void testIsLanguageMatch() {
        rootElement.setAttribute("xml:lang", "en-US");
        assertTrue(rootPointer.isLanguage("en"));
        assertFalse(rootPointer.isLanguage("fr"));
    }

    @Test
    public void testIsLanguageNull() {
        DOMNodePointer noLangPointer = new DOMNodePointer(childElement, Locale.US);
        assertTrue(noLangPointer.isLanguage("en"));
    }

    @Test
    public void testSetValueOnTextNode() {
        DOMNodePointer textPointer = new DOMNodePointer(textNode, Locale.US);
        textPointer.setValue("new text");
        assertEquals("new text", textNode.getNodeValue());
    }

    @Test
    public void testSetValueOnTextNodeWithEmptyString() {
        DOMNodePointer textPointer = new DOMNodePointer(textNode, Locale.US);
        textPointer.setValue("");
        assertNull(textNode.getParentNode());
    }

    @Test
    public void testSetValueOnElementWithNode() throws Exception {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document newDoc = builder.newDocument();
        Element newElement = newDoc.createElement("newChild");
        childPointer.setValue(newElement);
        assertEquals(1, childElement.getChildNodes().getLength());
    }

    @Test
    public void testSetValueOnElementWithString() {
        childPointer.setValue("string value");
        assertEquals(1, childElement.getChildNodes().getLength());
        assertEquals("string value", childElement.getTextContent());
    }

    @Test
    public void testAsPathWithId() {
        DOMNodePointer idPointer = new DOMNodePointer(rootElement, Locale.US, "myId");
        assertTrue(idPointer.asPath().contains("id('myId')"));
    }

    @Test
    public void testHashCodeAndEquals() {
        DOMNodePointer samePointer = new DOMNodePointer(rootElement, Locale.US);
        assertEquals(rootPointer.hashCode(), samePointer.hashCode());
        assertTrue(rootPointer.equals(samePointer));
        assertFalse(rootPointer.equals(childPointer));
    }

    @Test
    public void testGetPrefixFromNodeWithExplicitPrefix() {
        Element prefixed = document.createElementNS("http://ns.com", "p:name");
        assertEquals("p", DOMNodePointer.getPrefix(prefixed));
    }

    @Test
    public void testGetPrefixFromNodeWithoutPrefix() {
        assertNull(DOMNodePointer.getPrefix(rootElement));
    }

    @Test
    public void testGetLocalNameFromNodeWithExplicitLocalName() {
        Element prefixed = document.createElementNS("http://ns.com", "p:name");
        assertEquals("name", DOMNodePointer.getLocalName(prefixed));
    }

    @Test
    public void testGetLocalNameFromNodeWithoutPrefix() {
        assertEquals("root", DOMNodePointer.getLocalName(rootElement));
    }

    @Test
    public void testGetNamespaceURIFromElementWithURI() {
        String uri = DOMNodePointer.getNamespaceURI(childElement);
        assertEquals("http://example.com/ns", uri);
    }

    @Test
    public void testGetValueForCommentNode() {
        Comment comment = document.createComment(" comment data ");
        DOMNodePointer commentPointer = new DOMNodePointer(comment, Locale.US);
        assertEquals("comment data", commentPointer.getValue());
    }

    @Test
    public void testGetPointerByIDFound() {
        rootElement.setAttribute("id", "myid");
        Document ownerDoc = document;
        Pointer ptr = rootPointer.getPointerByID(null, "myid");
        assertTrue(ptr instanceof DOMNodePointer);
    }

    @Test
    public void testGetPointerByIDNotFound() {
        Pointer ptr = rootPointer.getPointerByID(null, "nonexistent");
        assertTrue(ptr instanceof NullPointer);
    }

    @Test(expected = JXPathException.class)
    public void testRemoveRootNode() {
        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.US);
        docPointer.remove();
    }

    @Test
    public void testCreateAttributeOnNonElement() {
        DOMNodePointer textPtr = new DOMNodePointer(textNode, Locale.US);
        NodePointer attrPtr = textPtr.createAttribute(null, new QName("attr"));
        assertTrue(attrPtr instanceof NodePointer);
    }

    @Test
    public void testCompareChildNodePointers() {
        NodePointer p1 = new DOMNodePointer(childElement, Locale.US);
        NodePointer p2 = new DOMNodePointer(textNode, Locale.US);
        int cmp1 = rootPointer.compareChildNodePointers(p1, p2);
        assertTrue(cmp1 < 0);
        int cmp2 = rootPointer.compareChildNodePointers(p2, p1);
        assertTrue(cmp2 > 0);
        int cmp3 = rootPointer.compareChildNodePointers(p1, p1);
        assertTrue(cmp3 == 0);
    }
}