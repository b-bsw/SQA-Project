package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class DOMNodePointerTest {
    private Document document;
    private Element rootElement;
    private Element childElement;
    private Text textNode;
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
        rootElement.appendChild(childElement);
        textNode = document.createTextNode("text content");
        childElement.appendChild(textNode);
        rootPointer = new DOMNodePointer(rootElement, null);
        childPointer = new DOMNodePointer(childElement, null);
        textPointer = new DOMNodePointer(textNode, null);
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
        assertTrue(pointer.asPath().contains("id('testId')"));
    }

    @Test
    public void testTestNodeWithNullTest() {
        assertTrue(DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testTestNodeWithNodeNameTestMatching() {
        NodeNameTest test = new NodeNameTest(new QName(null, "root"), "http://example.com/ns");
        assertTrue(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeNameTestNonMatching() {
        NodeNameTest test = new NodeNameTest(new QName(null, "nonexistent"), "http://example.com/ns");
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeNameTestNonElement() {
        NodeNameTest test = new NodeNameTest(new QName(null, "text"), null);
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
    public void testTestNodeWithUnsupportedTest() {
        NodeTest unsupported = new NodeTest() {};
        assertFalse(DOMNodePointer.testNode(rootElement, unsupported));
    }

    @Test
    public void testHashCode() {
        DOMNodePointer pointer1 = new DOMNodePointer(rootElement, null);
        DOMNodePointer pointer2 = new DOMNodePointer(rootElement, null);
        assertEquals(pointer1.hashCode(), pointer2.hashCode());
    }

    @Test
    public void testEquals() {
        DOMNodePointer pointer1 = new DOMNodePointer(rootElement, null);
        DOMNodePointer pointer2 = new DOMNodePointer(rootElement, null);
        assertEquals(pointer1, pointer2);
    }

    @Test
    public void testEqualsSameObject() {
        assertEquals(rootPointer, rootPointer);
    }

    @Test
    public void testEqualsDifferentObject() {
        assertNotEquals(rootPointer, new Object());
    }

    @Test
    public void testEqualsNull() {
        assertNotNull(rootPointer);
    }

    @Test
    public void testIsLanguageDefault() {
        assertTrue(rootPointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageExactMatch() {
        rootElement.setAttributeNS("http://www.w3.org/XML/1998/namespace", "xml:lang", "en");
        assertTrue(rootPointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageUpperCase() {
        rootElement.setAttributeNS("http://www.w3.org/XML/1998/namespace", "xml:lang", "EN");
        assertTrue(rootPointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageNull() {
        assertFalse(rootPointer.isLanguage("fr"));
    }

    @Test
    public void testGetValueTextNode() {
        assertEquals("text content", textPointer.getValue());
    }

    @Test
    public void testGetValueCommentNode() {
        Comment comment = document.createComment(" comment ");
        DOMNodePointer commentPointer = new DOMNodePointer(comment, null);
        assertEquals("comment", commentPointer.getValue());
    }

    @Test
    public void testGetValueCommentNodeNullData() {
        Comment comment = document.createComment("");
        DOMNodePointer commentPointer = new DOMNodePointer(comment, null);
        assertEquals("", commentPointer.getValue());
    }

    @Test
    public void testIsLeafTrue() {
        assertTrue(textPointer.isLeaf());
    }

    @Test
    public void testIsLeafFalse() {
        assertFalse(rootPointer.isLeaf());
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
    public void testGetBaseValue() {
        assertEquals(rootElement, rootPointer.getBaseValue());
    }

    @Test
    public void testGetImmediateNode() {
        assertEquals(rootElement, rootPointer.getImmediateNode());
    }

    @Test
    public void testAsPathWithId() {
        DOMNodePointer pointerWithId = new DOMNodePointer(textNode, null, "myId");
        assertTrue(pointerWithId.asPath().contains("id('myId')"));
    }

    @Test
    public void testAsPathElementNode() {
        String path = childPointer.asPath();
        assertTrue(path.contains("/child"));
        assertTrue(path.contains("[1]"));
    }

    @Test
    public void testAsPathTextNode() {
        String path = textPointer.asPath();
        assertTrue(path.contains("/text()"));
        assertTrue(path.contains("[1]"));
    }

    @Test
    public void testGetNamespaceURIWithNullPrefix() {
        String uri = rootPointer.getNamespaceURI(null);
        assertEquals("http://example.com/ns", uri);
    }

    @Test
    public void testGetNamespaceURIWithEmptyPrefix() {
        String uri = rootPointer.getNamespaceURI("");
        assertEquals("http://example.com/ns", uri);
    }

    @Test
    public void testGetNamespaceURIWithXmlPrefix() {
        String uri = rootPointer.getNamespaceURI("xml");
        assertEquals("http://www.w3.org/XML/1998/namespace", uri);
    }

    @Test
    public void testGetNamespaceURIWithXmlnsPrefix() {
        String uri = rootPointer.getNamespaceURI("xmlns");
        assertEquals("http://www.w3.org/2000/xmlns/", uri);
    }

    @Test
    public void testGetNamespaceURIUnknownPrefix() {
        String uri = rootPointer.getNamespaceURI("unknown");
        assertNull(uri);
    }

    @Test
    public void testGetDefaultNamespaceURIWithNoDefault() {
        assertNull(rootPointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURIWithDefault() {
        rootElement.setAttribute("xmlns", "http://default.com/ns");
        assertEquals("http://default.com/ns", rootPointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetLocalName() {
        assertEquals("root", DOMNodePointer.getLocalName(rootElement));
    }

    @Test
    public void testGetPrefixNull() {
        assertNull(DOMNodePointer.getPrefix(rootElement));
    }

    @Test
    public void testGetPrefixWithPrefix() {
        Element prefixed = document.createElementNS("http://example.com/ns", "pre:element");
        assertEquals("pre", DOMNodePointer.getPrefix(prefixed));
    }

    @Test
    public void testGetNamespaceURIFromNode() {
        String uri = DOMNodePointer.getNamespaceURI(rootElement);
        assertEquals("http://example.com/ns", uri);
    }

    @Test
    public void testGetNamespaceURIFromDocument() {
        String uri = DOMNodePointer.getNamespaceURI(document);
        assertEquals("http://example.com/ns", uri);
    }

    @Test
    public void testSetValueTextNodeReplacesContent() {
        textPointer.setValue("new text");
        assertEquals("new text", textNode.getNodeValue());
    }

    @Test
    public void testSetValueTextNodeRemovesNodeWhenEmpty() {
        Node parent = textNode.getParentNode();
        textPointer.setValue("");
        assertNull(textNode.getParentNode());
    }

    @Test
    public void testSetValueWithNode() {
        Element newChild = document.createElement("newChild");
        newChild.appendChild(document.createTextNode("inner"));
        childPointer.setValue(newChild);
        assertTrue(childElement.hasChildNodes());
    }

    @Test
    public void testSetValueNonTextNodeWithString() {
        childPointer.setValue("string value");
        assertEquals(1, childElement.getChildNodes().getLength());
        assertEquals("string value", childElement.getFirstChild().getNodeValue());
    }

    @Test(expected = JXPathException.class)
    public void testRemoveRootThrowsException() {
        DOMNodePointer docPointer = new DOMNodePointer(document, null);
        docPointer.remove();
    }

    @Test
    public void testCompareChildNodePointersSameNode() {
        assertEquals(0, rootPointer.compareChildNodePointers(childPointer, childPointer));
    }

    @Test
    public void testCompareChildNodePointersAttributeVsElement() {
        Element element = document.createElement("test");
        Attr attr = document.createAttribute("attr");
        element.setAttributeNode(attr);
        DOMNodePointer attrPointer = new DOMNodePointer(attr, null);
        DOMNodePointer elemPointer = new DOMNodePointer(element, null);
        assertTrue(rootPointer.compareChildNodePointers(attrPointer, elemPointer) < 0);
    }

    @Test
    public void testCompareChildNodePointersElementVsAttribute() {
        Element element = document.createElement("test");
        Attr attr = document.createAttribute("attr");
        element.setAttributeNode(attr);
        DOMNodePointer attrPointer = new DOMNodePointer(attr, null);
        DOMNodePointer elemPointer = new DOMNodePointer(element, null);
        assertTrue(rootPointer.compareChildNodePointers(elemPointer, attrPointer) > 0);
    }

    @Test
    public void testCompareChildNodePointersTwoAttributes() {
        Attr attr1 = document.createAttribute("attr1");
        Attr attr2 = document.createAttribute("attr2");
        rootElement.setAttributeNode(attr1);
        rootElement.setAttributeNode(attr2);
        DOMNodePointer attrPointer1 = new DOMNodePointer(attr1, null);
        DOMNodePointer attrPointer2 = new DOMNodePointer(attr2, null);
        assertTrue(rootPointer.compareChildNodePointers(attrPointer1, attrPointer2) < 0);
    }

    @Test
    public void testCompareChildNodePointersSiblings() {
        Element firstChild = document.createElement("first");
        Element secondChild = document.createElement("second");
        rootElement.appendChild(firstChild);
        rootElement.appendChild(secondChild);
        DOMNodePointer firstPointer = new DOMNodePointer(firstChild, null);
        DOMNodePointer secondPointer = new DOMNodePointer(secondChild, null);
        assertTrue(rootPointer.compareChildNodePointers(firstPointer, secondPointer) < 0);
    }

    @Test
    public void testTestNodeWithNodeNameTestWildcardAndPrefix() {
        NodeNameTest wildcardTest = new NodeNameTest(new QName("ex", "*"), "http://example.com/ns");
        assertTrue(DOMNodePointer.testNode(rootElement, wildcardTest));
    }

    @Test
    public void testTestNodeWithNodeTypeTestInvalidType() {
        NodeTypeTest test = new NodeTypeTest(999);
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testGetNameForProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        DOMNodePointer piPointer = new DOMNodePointer(pi, null);
        QName name = piPointer.getName();
        assertEquals("target", name.getName());
    }
}