package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.*;

public class DOMNodePointerTest {

    private Document document;
    private Element rootElement;
    private Element childElement;
    private Text textNode;
    private Comment commentNode;
    private ProcessingInstruction piNode;
    private Attr attrNode;
    private DOMNodePointer rootPointer;
    private DOMNodePointer childPointer;
    private DOMNodePointer textPointer;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.newDocument();

        rootElement = document.createElementNS("http://example.com/ns", "root");
        document.appendChild(rootElement);

        childElement = document.createElementNS("http://example.com/ns", "child");
        childElement.setTextContent("text content");
        rootElement.appendChild(childElement);

        textNode = document.createTextNode("some text");
        childElement.appendChild(textNode);

        commentNode = document.createComment("a comment");
        childElement.appendChild(commentNode);

        piNode = document.createProcessingInstruction("target", "data");
        childElement.appendChild(piNode);

        attrNode = document.createAttributeNS("http://example.com/ns", "attr");
        attrNode.setValue("attrValue");
        rootElement.setAttributeNode(attrNode);

        rootPointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        childPointer = new DOMNodePointer(rootPointer, childElement);
        textPointer = new DOMNodePointer(childPointer, textNode);
    }

    @Test
    public void testTestNodeNullTest() {
        assertTrue("null test should return true", DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testTestNodeNodeNameTestWildcardNoPrefix() {
        QName wildcardName = new QName(null, "*");
        NodeNameTest test = new NodeNameTest(wildcardName, null, true, null);
        assertTrue("wildcard no prefix should match element", DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeNodeNameTestWildcardWithPrefixMatch() {
        QName wildcardName = new QName("prefix", "*");
        NodeNameTest test = new NodeNameTest(wildcardName, "http://example.com/ns", true, null);
        assertTrue("wildcard with matching namespace should match element", DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeNodeNameTestExactMatch() {
        QName exactName = new QName(null, "child");
        NodeNameTest test = new NodeNameTest(exactName, "http://example.com/ns", false, null);
        assertTrue("exact name and namespace should match", DOMNodePointer.testNode(childElement, test));
    }

    @Test
    public void testTestNodeNodeNameTestNonElementReturnsFalse() {
        QName name = new QName(null, "child");
        NodeNameTest test = new NodeNameTest(name, "http://example.com/ns", false, null);
        assertFalse("text node should not match NodeNameTest", DOMNodePointer.testNode(textNode, test));
    }

    @Test
    public void testTestNodeNodeTypeTestNodeElement() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue("element should match NODE_TYPE_NODE", DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeNodeTypeTestNodeDocument() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue("document should match NODE_TYPE_NODE", DOMNodePointer.testNode(document, test));
    }

    @Test
    public void testTestNodeNodeTypeTestTextText() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue("text node should match NODE_TYPE_TEXT", DOMNodePointer.testNode(textNode, test));
    }

    @Test
    public void testTestNodeNodeTypeTestTextCdata() {
        CDATASection cdata = document.createCDATASection("cdata");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue("CDATA should match NODE_TYPE_TEXT", DOMNodePointer.testNode(cdata, test));
    }

    @Test
    public void testTestNodeNodeTypeTestComment() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue("comment should match NODE_TYPE_COMMENT", DOMNodePointer.testNode(commentNode, test));
    }

    @Test
    public void testTestNodeProcessingInstructionTestMatch() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue("PI with matching target should match", DOMNodePointer.testNode(piNode, test));
    }

    @Test
    public void testTestNodeProcessingInstructionTestMismatch() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("other");
        assertFalse("PI with wrong target should not match", DOMNodePointer.testNode(piNode, test));
    }

    @Test
    public void testGetNamespaceURINullPrefix() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        String ns = pointer.getNamespaceURI(null);
        assertEquals("null prefix should return default namespace", "http://example.com/ns", ns);
    }

    @Test
    public void testGetNamespaceURIPrefixFound() {
        rootElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:pre", "http://custom/ns");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        String ns = pointer.getNamespaceURI("pre");
        assertEquals("custom prefix namespace should be resolved", "http://custom/ns", ns);
    }

    @Test
    public void testGetNamespaceURIPrefixUnknown() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        String ns = pointer.getNamespaceURI("unknown");
        assertNull("unknown prefix should return null", ns);
    }

    @Test
    public void testGetDefaultNamespaceURIWithXmlns() {
        rootElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://default/ns");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        String defaultNs = pointer.getDefaultNamespaceURI();
        assertEquals("default namespace should be resolved", "http://default/ns", defaultNs);
    }

    @Test
    public void testGetDefaultNamespaceURINoXmlns() {
        DOMNodePointer pointer = new DOMNodePointer(document, Locale.ENGLISH);
        String defaultNs = pointer.getDefaultNamespaceURI();
        assertNull("no xmlns attribute should return null", defaultNs);
    }

    @Test
    public void testIsLanguageWithXmlLang() {
        rootElement.setAttributeNS("http://www.w3.org/XML/1998/namespace", "xml:lang", "en");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertTrue("isLanguage should return true for 'en'", pointer.isLanguage("en"));
        assertTrue("isLanguage should be case-insensitive", pointer.isLanguage("EN"));
    }

    @Test
    public void testIsLanguageWithoutXmlLang() {
        DOMNodePointer pointer = new DOMNodePointer(childElement, Locale.ENGLISH);
        assertFalse("isLanguage should return false when no xml:lang", pointer.isLanguage("en"));
    }

    @Test
    public void testSetValueOnTextNode() {
        DOMNodePointer textPtr = new DOMNodePointer(null, textNode);
        textPtr.setValue("new text");
        assertEquals("text node value should be replaced", "new text", textNode.getNodeValue());
    }

    @Test
    public void testSetValueOnElementWithElement() {
        Element newChild = document.createElement("newChild");
        newChild.setTextContent("inner");
        DOMNodePointer elementPtr = new DOMNodePointer(null, childElement);
        elementPtr.setValue(newChild);
        assertEquals("element children should be replaced", 1, childElement.getChildNodes().getLength());
        assertEquals("new child should be appended", "inner", childElement.getTextContent().trim());
    }

    @Test
    public void testSetValueOnTextNodeWithNullRemovesNode() {
        Node parent = textNode.getParentNode();
        DOMNodePointer textPtr = new DOMNodePointer(null, textNode);
        textPtr.setValue("");
        assertNull("empty string should remove text node", textNode.getParentNode());
    }

    @Test
    public void testAsPathWithId() {
        DOMNodePointer idPointer = new DOMNodePointer(rootElement, Locale.ENGLISH, "myId");
        String path = idPointer.asPath();
        assertEquals("id path should be id('myId')", "id('myId')", path);
    }

    @Test
    public void testAsPathDocumentNode() {
        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.ENGLISH);
        String path = docPointer.asPath();
        assertEquals("document path should be empty", "", path);
    }

    @Test
    public void testEqualsSameNode() {
        DOMNodePointer p1 = new DOMNodePointer(rootElement, Locale.ENGLISH);
        DOMNodePointer p2 = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertEquals("pointers to same node should be equal", p1, p2);
    }

    @Test
    public void testEqualsDifferentNode() {
        DOMNodePointer p1 = new DOMNodePointer(rootElement, Locale.ENGLISH);
        DOMNodePointer p2 = new DOMNodePointer(childElement, Locale.ENGLISH);
        assertNotEquals("pointers to different nodes should not be equal", p1, p2);
    }

    @Test
    public void testHashCodeConsistent() {
        DOMNodePointer p = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertEquals("hashCode should be consistent", p.hashCode(), p.hashCode());
    }

    @Test
    public void testGetValueOnElement() {
        DOMNodePointer ptr = new DOMNodePointer(null, childElement);
        String val = (String) ptr.getValue();
        assertEquals("getValue should return concatenated text", "some texta comment", val.trim());
    }

    @Test
    public void testGetValueOnComment() {
        DOMNodePointer ptr = new DOMNodePointer(null, commentNode);
        String val = (String) ptr.getValue();
        assertEquals("getValue on comment should return data", "a comment", val);
    }

    @Test
    public void testGetValueOnProcessingInstruction() {
        DOMNodePointer ptr = new DOMNodePointer(null, piNode);
        String val = (String) ptr.getValue();
        assertEquals("getValue on PI should return data", "data", val);
    }

    @Test
    public void testGetLocalNameWithPrefix() {
        Element prefixed = document.createElementNS("http://example.com/ns", "pre:local");
        assertEquals("getLocalName should strip prefix", "local", DOMNodePointer.getLocalName(prefixed));
    }

    @Test
    public void testGetLocalNameWithoutPrefix() {
        assertEquals("getLocalName on element with no prefix", "root", DOMNodePointer.getLocalName(rootElement));
    }

    @Test
    public void testGetPrefixPresent() {
        Element prefixed = document.createElementNS("http://example.com/ns", "pre:local");
        assertEquals("getPrefix should return the prefix", "pre", DOMNodePointer.getPrefix(prefixed));
    }

    @Test
    public void testGetPrefixAbsent() {
        assertNull("getPrefix should return null when no prefix", DOMNodePointer.getPrefix(rootElement));
    }

    @Test
    public void testRemoveRootNodeThrowsException() {
        DOMNodePointer rootPtr = new DOMNodePointer(document.getDocumentElement(), Locale.ENGLISH);
        try {
            rootPtr.remove();
            fail("Expected JXPathException when removing root node");
        } catch (Exception e) {
            assertTrue("Expected JXPathException", e instanceof org.apache.commons.jxpath.JXPathException);
        }
    }

    @Test
    public void testRemoveChildNode() {
        Node parent = childElement.getParentNode();
        assertNotNull("parent should not be null", parent);
        childPointer.remove();
        assertNull("child should be removed", childElement.getParentNode());
    }
}