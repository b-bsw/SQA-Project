package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.Locale;

public class DOMNodePointerTest {

    private Document document;
    private Element rootElement;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.newDocument();
        rootElement = document.createElement("root");
        document.appendChild(rootElement);
    }

    @Test
    public void testConstructorWithNodeAndLocale() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertNotNull(pointer);
        assertEquals(rootElement, pointer.getImmediateNode());
    }

    @Test
    public void testConstructorWithNodeLocaleAndId() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US, "myId");
        assertNotNull(pointer);
        assertEquals(rootElement, pointer.getImmediateNode());
    }

    @Test
    public void testGetBaseValueReturnsNode() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertSame(rootElement, pointer.getBaseValue());
    }

    @Test
    public void testIsActualReturnsTrue() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertTrue(pointer.isActual());
    }

    @Test
    public void testIsCollectionReturnsFalse() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testGetLengthReturnsOne() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertEquals(1, pointer.getLength());
    }

    @Test
    public void testIsLeafWithNoChildren() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testIsLeafWithChild() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertFalse(pointer.isLeaf());
    }

    @Test
    public void testTestNodeWithNullTest() {
        assertTrue(DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testTestNodeWithNonElementAndNodeNameTest() {
        org.w3c.dom.Text textNode = document.createTextNode("text");
        NodeNameTest test = new NodeNameTest(new QName(null, "text"), null);
        assertFalse(DOMNodePointer.testNode(textNode, test));
    }

    @Test
    public void testTestNodeWithWildcardAndNoPrefix() {
        NodeNameTest test = new NodeNameTest(new QName(null, "*"), null);
        assertTrue(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithMatchingNameAndNamespace() {
        Element child = document.createElementNS("http://example.com/ns", "prefix:child");
        rootElement.appendChild(child);
        NodeNameTest test = new NodeNameTest(new QName("http://example.com/ns", "child"), "http://example.com/ns");
        assertTrue(DOMNodePointer.testNode(child, test));
    }

    @Test
    public void testTestNodeWithNonMatchingName() {
        NodeNameTest test = new NodeNameTest(new QName(null, "other"), null);
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestNode() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestTextOnTextNode() {
        org.w3c.dom.Text textNode = document.createTextNode("text");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(DOMNodePointer.testNode(textNode, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestTextOnElement() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertFalse(DOMNodePointer.testNode(rootElement, test));
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
        NodeTypeTest test = new NodeTypeTest(999);
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTestMatching() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTestNonMatching() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        ProcessingInstructionTest test = new ProcessingInstructionTest("other");
        assertFalse(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testTestNodeWithNonNodeNameNonNodeTypeNonPITest() {
        NodeTest test = new NodeTest() {};
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testGetNameForElement() {
        Element child = document.createElementNS("http://example.com/ns", "prefix:child");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.US);
        QName name = pointer.getName();
        assertEquals("child", name.getName());
        assertEquals("prefix", name.getPrefix());
    }

    @Test
    public void testGetNameForProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        QName name = pointer.getName();
        assertNull(name.getPrefix());
        assertEquals("target", name.getName());
    }

    @Test
    public void testNodeHashCode() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertEquals(rootElement.hashCode(), pointer.hashCode());
    }

    @Test
    public void testNodeEqualsSameObject() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertTrue(pointer.equals(pointer));
    }

    @Test
    public void testNodeEqualsDifferentObjectSameNode() {
        DOMNodePointer pointer1 = new DOMNodePointer(rootElement, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(rootElement, Locale.US);
        assertTrue(pointer1.equals(pointer2));
    }

    @Test
    public void testNodeEqualsDifferentNode() {
        Element other = document.createElement("other");
        DOMNodePointer pointer1 = new DOMNodePointer(rootElement, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(other, Locale.US);
        assertFalse(pointer1.equals(pointer2));
    }

    @Test
    public void testNodeEqualsNull() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertFalse(pointer.equals(null));
    }

    @Test
    public void testGetPrefixWithPrefix() {
        Element child = document.createElementNS("http://example.com/ns", "prefix:child");
        assertEquals("prefix", DOMNodePointer.getPrefix(child));
    }

    @Test
    public void testGetPrefixWithoutPrefix() {
        assertNull(DOMNodePointer.getPrefix(rootElement));
    }

    @Test
    public void testGetPrefixWithColonInName() {
        Element child = document.createElementNS("http://example.com/ns", "prefix:child");
        assertEquals("prefix", DOMNodePointer.getPrefix(child));
    }

    @Test
    public void testGetLocalNameWithLocalName() {
        Element child = document.createElementNS("http://example.com/ns", "prefix:child");
        assertEquals("child", DOMNodePointer.getLocalName(child));
    }

    @Test
    public void testGetLocalNameWithoutLocalName() {
        assertEquals("root", DOMNodePointer.getLocalName(rootElement));
    }

    @Test
    public void testGetLocalNameWithColonInName() {
        Element child = document.createElement("prefix:child");
        assertEquals("child", DOMNodePointer.getLocalName(child));
    }

    @Test
    public void testGetNamespaceURINullForElement() {
        assertNull(DOMNodePointer.getNamespaceURI(rootElement));
    }

    @Test
    public void testGetNamespaceURIWithNamespace() {
        Element child = document.createElementNS("http://example.com/ns", "prefix:child");
        assertEquals("http://example.com/ns", DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void testRemoveRootNodeThrowsException() {
        DOMNodePointer pointer = new DOMNodePointer(document, Locale.US);
        try {
            pointer.remove();
            fail("Expected JXPathException");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // expected
        }
    }

    @Test
    public void testRemoveNonRootNode() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.US);
        pointer.remove();
        assertFalse(rootElement.hasChildNodes());
    }

    @Test
    public void testSetValueOnTextNode() {
        org.w3c.dom.Text textNode = document.createTextNode("old");
        rootElement.appendChild(textNode);
        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        pointer.setValue("new");
        assertEquals("new", textNode.getNodeValue());
    }

    @Test
    public void testSetValueOnTextNodeWithNullRemovesNode() {
        org.w3c.dom.Text textNode = document.createTextNode("old");
        rootElement.appendChild(textNode);
        DOMNodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        pointer.setValue("");
        assertNull(textNode.getParentNode());
    }

    @Test
    public void testSetValueOnElementWithNodeValue() {
        Element child = document.createElement("child");
        DocumentFragment fragment = document.createDocumentFragment();
        org.w3c.dom.Text text = document.createTextNode("value");
        fragment.appendChild(text);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.US);
        pointer.setValue(fragment);
        assertEquals("value", child.getTextContent());
    }

    @Test
    public void testSetValueOnElementWithString() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.US);
        pointer.setValue("stringValue");
        assertEquals("stringValue", child.getTextContent());
    }

    @Test
    public void testSetValueOnElementWithNonNullNode() {
        Element child = document.createElement("child");
        child.setAttribute("attr", "val");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.US);
        pointer.setValue("newValue");
        assertEquals("newValue", child.getTextContent());
        assertNull(child.getAttributes().getNamedItem("attr"));
    }

    @Test
    public void testGetValueForCommentNode() {
        Comment comment = document.createComment(" comment data ");
        DOMNodePointer pointer = new DOMNodePointer(comment, Locale.US);
        assertEquals("comment data", pointer.getValue());
    }

    @Test
    public void testGetValueForNullCommentNode() {
        Comment comment = document.createComment(null);
        DOMNodePointer pointer = new DOMNodePointer(comment, Locale.US);
        assertEquals("", pointer.getValue());
    }

    @Test
    public void testGetDefaultNamespaceURINoAttribute() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertNull(pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURIWithAttribute() {
        rootElement.setAttribute("xmlns", "http://example.com/default");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertEquals("http://example.com/default", pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIForNullPrefix() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertNull(pointer.getNamespaceURI((String) null));
    }

    @Test
    public void testGetNamespaceURIForEmptyPrefix() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertNull(pointer.getNamespaceURI(""));
    }

    @Test
    public void testGetNamespaceURIForXmlPrefix() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertEquals("http://www.w3.org/XML/1998/namespace", pointer.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURIForXmlnsPrefix() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertEquals("http://www.w3.org/2000/xmlns/", pointer.getNamespaceURI("xmlns"));
    }

    @Test
    public void testGetNamespaceURIForUnknownPrefix() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertNull(pointer.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURIForDefinedPrefix() {
        rootElement.setAttribute("xmlns:ns1", "http://example.com/ns1");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertEquals("http://example.com/ns1", pointer.getNamespaceURI("ns1"));
    }

    @Test
    public void testIsLanguageWithExactMatch() {
        rootElement.setAttribute("xml:lang", "en");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageWithPartialMatch() {
        rootElement.setAttribute("xml:lang", "en-US");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageWithNonMatch() {
        rootElement.setAttribute("xml:lang", "fr");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertFalse(pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageWithNullLanguage() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertFalse(pointer.isLanguage("en"));
    }

    @Test
    public void testGetLanguageWithNoAttribute() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US);
        assertNull(pointer.getLanguage());
    }

    @Test
    public void testFindEnclosingAttributeFound() {
        rootElement.setAttribute("xml:lang", "de");
        assertEquals("de", DOMNodePointer.findEnclosingAttribute(rootElement, "xml:lang"));
    }

    @Test
    public void testFindEnclosingAttributeNotFound() {
        assertNull(DOMNodePointer.findEnclosingAttribute(rootElement, "xml:lang"));
    }

    @Test
    public void testAsPathWithId() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.US, "myId");
        assertEquals("id('myId')", pointer.asPath());
    }

    @Test
    public void testAsPathForDocumentNode() {
        DOMNodePointer pointer = new DOMNodePointer(document, Locale.US);
        assertEquals("", pointer.asPath());
    }
}