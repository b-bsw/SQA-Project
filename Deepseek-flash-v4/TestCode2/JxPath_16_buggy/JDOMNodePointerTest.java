package org.apache.commons.jxpath.ri.model.jdom;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.jdom.*;
import org.jdom.Namespace;
import java.util.List;
import java.util.ArrayList;

public class JDOMNodePointerTest {
    private Element element;
    private Document document;
    private JDOMNodePointer elementPointer;
    private JDOMNodePointer documentPointer;
    private Text textNode;
    private JDOMNodePointer textPointer;
    private Comment comment;
    private JDOMNodePointer commentPointer;
    private ProcessingInstruction pi;
    private JDOMNodePointer piPointer;
    private Attribute attr;

    @Before
    public void setUp() {
        Namespace ns = Namespace.getNamespace("pre", "http://example.com");
        element = new Element("root", ns);
        element.setAttribute("id", "123");
        Element child = new Element("child", ns);
        child.setText("childText");
        element.addContent(child);
        textNode = new Text("  some text  ");
        element.addContent(textNode);
        comment = new Comment("  comment  ");
        element.addContent(comment);
        pi = new ProcessingInstruction("target", "data");
        element.addContent(pi);
        attr = element.getAttribute("id");

        document = new Document(new Element("docRoot"));
        documentPointer = new JDOMNodePointer(document, null);
        elementPointer = new JDOMNodePointer(element, null);
        textPointer = new JDOMNodePointer(textNode, null);
        commentPointer = new JDOMNodePointer(comment, null);
        piPointer = new JDOMNodePointer(pi, null);
    }

    @Test
    public void testConstructorWithId() {
        JDOMNodePointer ptr = new JDOMNodePointer(element, null, "myId");
        assertEquals("id('myId')", ptr.asPath());
    }

    @Test
    public void testGetNamespaceURIElement() {
        assertEquals("http://example.com", elementPointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceUIDocument() {
        assertNull(documentPointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIWithPrefixXml() {
        assertEquals("http://www.w3.org/XML/1998/namespace", elementPointer.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURIWithPrefixPresent() {
        assertEquals("http://example.com", elementPointer.getNamespaceURI("pre"));
    }

    @Test
    public void testGetNamespaceURIWithPrefixAbsent() {
        assertNull(elementPointer.getNamespaceURI("nonexistent"));
    }

    @Test
    public void testGetNamespaceURIWithPrefixDocument() {
        assertNull(documentPointer.getNamespaceURI("pre"));
    }

    @Test
    public void testIsLeafElementWithContent() {
        assertFalse(elementPointer.isLeaf());
    }

    @Test
    public void testIsLeafElementWithoutContent() {
        Element empty = new Element("empty");
        JDOMNodePointer ptr = new JDOMNodePointer(empty, null);
        assertTrue(ptr.isLeaf());
    }

    @Test
    public void testIsLeafDocumentWithContent() {
        assertFalse(documentPointer.isLeaf());
    }

    @Test
    public void testIsLeafDocumentWithoutContent() {
        Document emptyDoc = new Document();
        JDOMNodePointer ptr = new JDOMNodePointer(emptyDoc, null);
        assertTrue(ptr.isLeaf());
    }

    @Test
    public void testIsLeafText() {
        assertTrue(textPointer.isLeaf());
    }

    @Test
    public void testGetNameElement() {
        QName name = elementPointer.getName();
        assertEquals("pre", name.getPrefix());
        assertEquals("root", name.getName());
    }

    @Test
    public void testGetNameProcessingInstruction() {
        QName name = piPointer.getName();
        assertNull(name.getPrefix());
        assertEquals("target", name.getName());
    }

    @Test
    public void testGetValueElement() {
        String val = elementPointer.getValue();
        assertEquals("childText  some text  ", val);
    }

    @Test
    public void testGetValueComment() {
        String val = commentPointer.getValue();
        assertEquals("comment", val);
    }

    @Test
    public void testGetValueTextUntrimmed() {
        Text t = new Text("  hello  ");
        JDOMNodePointer ptr = new JDOMNodePointer(t, null);
        assertEquals("  hello  ", ptr.getValue());
    }

    @Test
    public void testGetValueProcessingInstruction() {
        String val = piPointer.getValue();
        assertEquals("data", val);
    }

    @Test
    public void testSetValueTextNonNullNonEmpty() {
        Text t = new Text("original");
        JDOMNodePointer ptr = new JDOMNodePointer(t, null);
        ptr.setValue("newValue");
        assertEquals("newValue", t.getText());
    }

    @Test
    public void testSetValueTextNull() {
        Text t = new Text("original");
        JDOMNodePointer ptr = new JDOMNodePointer(t, null);
        ptr.setValue("");
        Element parent = new Element("parent");
        parent.addContent(t);
        ptr.setValue("");
        assertFalse(parent.getContent().contains(t));
    }

    @Test
    public void testSetValueElementWithText() {
        Element e = new Element("e");
        JDOMNodePointer ptr = new JDOMNodePointer(e, null);
        ptr.setValue("textVal");
        List content = e.getContent();
        assertEquals(1, content.size());
        assertTrue(content.get(0) instanceof Text);
        assertEquals("textVal", ((Text)content.get(0)).getText());
    }

    @Test
    public void testSetValueElementWithEmptyString() {
        Element e = new Element("e");
        JDOMNodePointer ptr = new JDOMNodePointer(e, null);
        ptr.setValue("");
        assertTrue(e.getContent().isEmpty());
    }

    @Test
    public void testTestNodeNullTest() {
        assertTrue(JDOMNodePointer.testNode(null, element, null));
    }

    @Test
    public void testTestNodeNameTestNonElement() {
        NodeNameTest test = new NodeNameTest(new QName("test"), null);
        assertFalse(JDOMNodePointer.testNode(elementPointer, textNode, test));
    }

    @Test
    public void testTestNodeNameTestWildcardNoPrefix() {
        NodeNameTest test = new NodeNameTest(new QName(null, "*"), null);
        test.setWildcard(true);
        assertTrue(JDOMNodePointer.testNode(elementPointer, element, test));
    }

    @Test
    public void testTestNodeNameTestExactMatch() {
        NodeNameTest test = new NodeNameTest(new QName("root"), "http://example.com");
        assertTrue(JDOMNodePointer.testNode(elementPointer, element, test));
    }

    @Test
    public void testTestNodeNameTestMismatchNamespace() {
        NodeNameTest test = new NodeNameTest(new QName("root"), "http://other.com");
        assertFalse(JDOMNodePointer.testNode(elementPointer, element, test));
    }

    @Test
    public void testTestNodeTypeNode() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(JDOMNodePointer.testNode(elementPointer, element, test));
        assertFalse(JDOMNodePointer.testNode(elementPointer, textNode, test));
    }

    @Test
    public void testTestNodeTypeTextWithText() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(JDOMNodePointer.testNode(elementPointer, new Text("a"), test));
        assertFalse(JDOMNodePointer.testNode(elementPointer, element, test));
    }

    @Test
    public void testTestNodeTypeTextWithCDATA() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(JDOMNodePointer.testNode(elementPointer, new CDATA("a"), test));
    }

    @Test
    public void testTestNodeTypeComment() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(JDOMNodePointer.testNode(elementPointer, new Comment("c"), test));
    }

    @Test
    public void testTestNodeTypePI() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(JDOMNodePointer.testNode(elementPointer, new ProcessingInstruction("t", "d"), test));
    }

    @Test
    public void testTestNodeProcessingInstructionTestMatch() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(JDOMNodePointer.testNode(elementPointer, new ProcessingInstruction("target", "d"), test));
    }

    @Test
    public void testTestNodeProcessingInstructionTestMismatch() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("other");
        assertFalse(JDOMNodePointer.testNode(elementPointer, new ProcessingInstruction("target", "d"), test));
    }

    @Test
    public void testCompareChildNodePointersSameNode() {
        assertEquals(0, elementPointer.compareChildNodePointers(elementPointer, elementPointer));
    }

    @Test
    public void testCompareChildNodePointersAttributeVsElement() {
        Attribute a = new Attribute("a", "v");
        Element e = new Element("e");
        JDOMNodePointer attrPtr = new JDOMNodePointer(a, null);
        JDOMNodePointer elemPtr = new JDOMNodePointer(e, null);
        assertEquals(-1, elementPointer.compareChildNodePointers(attrPtr, elemPtr));
        assertEquals(1, elementPointer.compareChildNodePointers(elemPtr, attrPtr));
    }

    @Test
    public void testCompareChildNodePointersBothAttributes() {
        Element parent = new Element("p");
        Attribute a1 = new Attribute("a1", "v1");
        Attribute a2 = new Attribute("a2", "v2");
        parent.setAttribute(a1);
        parent.setAttribute(a2);
        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, null);
        JDOMNodePointer p1 = new JDOMNodePointer(a1, null);
        JDOMNodePointer p2 = new JDOMNodePointer(a2, null);
        assertEquals(-1, parentPtr.compareChildNodePointers(p1, p2));
        assertEquals(1, parentPtr.compareChildNodePointers(p2, p1));
    }

    @Test(expected = RuntimeException.class)
    public void testCompareChildNodePointersInternalError() {
        Text t = new Text("x");
        JDOMNodePointer textPtr = new JDOMNodePointer(t, null);
        textPtr.compareChildNodePointers(elementPointer, elementPointer);
    }

    @Test
    public void testCompareChildNodePointersElements() {
        Element parent = new Element("p");
        Element c1 = new Element("c1");
        Element c2 = new Element("c2");
        parent.addContent(c1);
        parent.addContent(c2);
        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, null);
        JDOMNodePointer p1 = new JDOMNodePointer(c1, null);
        JDOMNodePointer p2 = new JDOMNodePointer(c2, null);
        assertEquals(-1, parentPtr.compareChildNodePointers(p1, p2));
        assertEquals(1, parentPtr.compareChildNodePointers(p2, p1));
    }

    @Test
    public void testAsPathWithId() {
        JDOMNodePointer ptr = new JDOMNodePointer(element, null, "myId");
        assertEquals("id('myId')", ptr.asPath());
    }

    @Test
    public void testAsPathElementWithNamespace() {
        String path = elementPointer.asPath();
        assertTrue(path.contains("/"));
        assertTrue(path.contains("root"));
    }

    @Test
    public void testAsPathTextNode() {
        String path = textPointer.asPath();
        assertTrue(path.contains("text()"));
    }

    @Test
    public void testAsPathProcessingInstruction() {
        String path = piPointer.asPath();
        assertTrue(path.contains("processing-instruction"));
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(elementPointer.equals(elementPointer));
    }

    @Test
    public void testEqualsDifferentObject() {
        JDOMNodePointer other = new JDOMNodePointer(element, null);
        assertTrue(elementPointer.equals(other));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(elementPointer.equals(null));
    }

    @Test
    public void testEqualsDifferentType() {
        assertFalse(elementPointer.equals("string"));
    }

    @Test
    public void testHashCode() {
        assertEquals(System.identityHashCode(element), elementPointer.hashCode());
    }

    @Test
    public void testIsCollection() {
        assertFalse(elementPointer.isCollection());
    }

    @Test
    public void testGetLength() {
        assertEquals(1, elementPointer.getLength());
    }

    @Test
    public void testGetBaseValue() {
        assertSame(element, elementPointer.getBaseValue());
    }

    @Test
    public void testGetImmediateNode() {
        assertSame(element, elementPointer.getImmediateNode());
    }

    @Test
    public void testGetLanguageFound() {
        Element e = new Element("e");
        e.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        JDOMNodePointer ptr = new JDOMNodePointer(e, null);
        assertEquals("en", ptr.getLanguage());
    }

    @Test
    public void testGetLanguageNotFound() {
        assertNull(elementPointer.getLanguage());
    }

    @Test
    public void testIsLanguageExactMatch() {
        Element e = new Element("e");
        e.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        JDOMNodePointer ptr = new JDOMNodePointer(e, null);
        assertTrue(ptr.isLanguage("en"));
    }

    @Test
    public void testIsLanguageCaseInsensitive() {
        Element e = new Element("e");
        e.setAttribute("lang", "EN-US", Namespace.XML_NAMESPACE);
        JDOMNodePointer ptr = new JDOMNodePointer(e, null);
        assertTrue(ptr.isLanguage("en-us"));
    }

    @Test
    public void testIsLanguageNullCurrent() {
        assertFalse(elementPointer.isLanguage("en"));
    }

    @Test
    public void testEscapeApostrophe() {
        JDOMNodePointer ptr = new JDOMNodePointer(element, null, "it's");
        String path = ptr.asPath();
        assertEquals("id('it&apos;s')", path);
    }

    @Test
    public void testEscapeQuote() {
        JDOMNodePointer ptr = new JDOMNodePointer(element, null, "quote\"here");
        String path = ptr.asPath();
        assertEquals("id('quote&quot;here')", path);
    }

    @Test
    public void testGetRelativePositionByNameFirstChild() {
        Element parent = new Element("p");
        Element c1 = new Element("c", Namespace.getNamespace("p", "uri"));
        parent.addContent(c1);
        JDOMNodePointer childPtr = new JDOMNodePointer(c1, null);
        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, null);
        assertEquals(1, childPtr.getRelativePositionByName());
    }

    @Test
    public void testGetRelativePositionOfElement() {
        Element parent = new Element("p");
        Element c1 = new Element("c1");
        Element c2 = new Element("c2");
        parent.addContent(c1);
        parent.addContent(c2);
        JDOMNodePointer ptr1 = new JDOMNodePointer(c2, null);
        assertEquals(2, ptr1.getRelativePositionOfElement());
    }

    @Test
    public void testGetRelativePositionOfTextNode() {
        Element parent = new Element("p");
        Text t1 = new Text("a");
        Text t2 = new Text("b");
        parent.addContent(t1);
        parent.addContent(t2);
        JDOMNodePointer ptr2 = new JDOMNodePointer(t2, null);
        assertEquals(2, ptr2.getRelativePositionOfTextNode());
    }

    @Test
    public void testRemoveNode() {
        Element parent = new Element("p");
        Element child = new Element("c");
        parent.addContent(child);
        JDOMNodePointer childPtr = new JDOMNodePointer(child, null);
        childPtr.remove();
        assertFalse(parent.getContent().contains(child));
    }

    @Test(expected = JXPathException.class)
    public void testRemoveRootNode() {
        JDOMNodePointer rootPtr = new JDOMNodePointer(element, null);
        rootPtr.remove();
    }

    @Test
    public void testNamespaceIterator() {
        assertNotNull(elementPointer.namespaceIterator());
    }

    @Test
    public void testNamespacePointer() {
        assertNotNull(elementPointer.namespacePointer("pre"));
    }

    @Test
    public void testGetNamespaceResolver() {
        assertNotNull(elementPointer.getNamespaceResolver());
    }
}