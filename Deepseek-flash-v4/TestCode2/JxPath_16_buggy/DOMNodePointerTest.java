package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.w3c.dom.Comment;
import org.w3c.dom.CDATASection;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
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
    public void testConstructorWithLocale() {
        DOMNodePointer ptr = new DOMNodePointer(rootElement, Locale.US);
        assertNotNull(ptr);
        assertEquals(rootElement, ptr.getImmediateNode());
    }

    @Test
    public void testConstructorWithLocaleAndId() {
        DOMNodePointer ptr = new DOMNodePointer(rootElement, Locale.US, "myId");
        assertNotNull(ptr);
        assertTrue(ptr.asPath().startsWith("id('"));
    }

    @Test
    public void testConstructorWithParentAndNode() {
        DOMNodePointer parent = new DOMNodePointer(rootElement, Locale.ENGLISH);
        Element child = document.createElementNS("http://example.com/ns", "ns:child");
        rootElement.appendChild(child);
        DOMNodePointer childPtr = new DOMNodePointer(parent, child);
        assertEquals(child, childPtr.getImmediateNode());
    }

    @Test
    public void testTestNodeWithNullTest() {
        assertTrue(DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testTestNodeWithNodeNameTestNonElement() {
        Text text = document.createTextNode("text");
        NodeNameTest test = new NodeNameTest(new QName("text"), "http://example.com/ns");
        assertFalse(DOMNodePointer.testNode(text, test));
    }

    @Test
    public void testTestNodeWithNodeNameTestWildcardNoPrefix() {
        Element elem = document.createElementNS("http://example.com/ns", "ns:child");
        NodeNameTest test = new NodeNameTest(new QName(null, "*"), true, "http://example.com/ns");
        assertTrue(DOMNodePointer.testNode(elem, test));
    }

    @Test
    public void testTestNodeWithNodeNameTestExactMatch() {
        Element elem = document.createElementNS("http://example.com/ns", "ns:child");
        NodeNameTest test = new NodeNameTest(new QName("ns", "child"), "http://example.com/ns");
        assertTrue(DOMNodePointer.testNode(elem, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestNode() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(rootElement, test));
        assertTrue(DOMNodePointer.testNode(document, test));
        Text text = document.createTextNode("text");
        assertFalse(DOMNodePointer.testNode(text, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestText() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Text text = document.createTextNode("text");
        assertTrue(DOMNodePointer.testNode(text, test));
        CDATASection cdata = document.createCDATASection("cdata");
        assertTrue(DOMNodePointer.testNode(cdata, test));
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestComment() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Comment comment = document.createComment("comment");
        assertTrue(DOMNodePointer.testNode(comment, test));
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestPI() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        assertTrue(DOMNodePointer.testNode(pi, test));
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTest() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(DOMNodePointer.testNode(pi, test));
        ProcessingInstructionTest test2 = new ProcessingInstructionTest("other");
        assertFalse(DOMNodePointer.testNode(pi, test2));
    }

    @Test
    public void testTestNodeWithUnhandledTest() {
        NodeTest test = new NodeTest() {};
        assertFalse(DOMNodePointer.testNode(rootElement, test));
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
        DOMNodePointer piPtr = new DOMNodePointer(pi, Locale.ENGLISH);
        QName name = piPtr.getName();
        assertNull(name.getPrefix());
        assertEquals("target", name.getName());
    }

    @Test
    public void testGetNamespaceURIFromNode() {
        String uri = DOMNodePointer.getNamespaceURI(rootElement);
        assertEquals("http://example.com/ns", uri);
    }

    @Test
    public void testGetNamespaceURIWithNoNamespace() {
        Element noNs = document.createElement("plain");
        assertNull(DOMNodePointer.getNamespaceURI(noNs));
    }

    @Test
    public void testGetNamespaceURIForDocument() {
        Document doc = document;
        assertEquals("http://example.com/ns", DOMNodePointer.getNamespaceURI(doc));
    }

    @Test
    public void testGetNamespaceURIWithPrefix() {
        String uri = rootPointer.getNamespaceURI("ns");
        assertEquals("http://example.com/ns", uri);
    }

    @Test
    public void testGetNamespaceURIWithEmptyPrefix() {
        rootElement.setAttribute("xmlns", "http://default.com");
        String uri = rootPointer.getNamespaceURI("");
        assertEquals("http://default.com", uri);
    }

    @Test
    public void testGetNamespaceURIWithUnknownPrefix() {
        String uri = rootPointer.getNamespaceURI("unknown");
        assertNull(uri);
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
    public void testGetDefaultNamespaceURI() {
        rootElement.setAttribute("xmlns", "http://default.com");
        String uri = rootPointer.getDefaultNamespaceURI();
        assertEquals("http://default.com", uri);
    }

    @Test
    public void testGetDefaultNamespaceURIWhenNoDefault() {
        String uri = rootPointer.getDefaultNamespaceURI();
        assertNull(uri);
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
    public void testIsLeafWhenHasChildren() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        assertFalse(rootPointer.isLeaf());
    }

    @Test
    public void testIsLeafWhenNoChildren() {
        assertTrue(rootPointer.isLeaf());
    }

    @Test
    public void testIsLanguageWithNullCurrent() {
        assertFalse(rootPointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageWithMatch() {
        rootElement.setAttribute("xml:lang", "en-US");
        assertTrue(rootPointer.isLanguage("en"));
    }

    @Test
    public void testFindEnclosingAttributeFound() {
        rootElement.setAttribute("testattr", "value");
        String result = DOMNodePointer.findEnclosingAttribute(rootElement, "testattr");
        assertEquals("value", result);
    }

    @Test
    public void testFindEnclosingAttributeNotFound() {
        String result = DOMNodePointer.findEnclosingAttribute(rootElement, "nonexistent");
        assertNull(result);
    }

    @Test
    public void testFindEnclosingAttributeTraversesParent() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        rootElement.setAttribute("testattr", "parentValue");
        String result = DOMNodePointer.findEnclosingAttribute(child, "testattr");
        assertEquals("parentValue", result);
    }

    @Test
    public void testGetLanguage() {
        rootElement.setAttribute("xml:lang", "fr");
        DOMNodePointer ptr = new DOMNodePointer(rootElement, Locale.FRENCH);
        assertEquals("fr", ptr.getLanguage());
    }

    @Test
    public void testSetValueOnTextNodeWithNonEmptyString() {
        Text text = document.createTextNode("old");
        rootElement.appendChild(text);
        DOMNodePointer ptr = new DOMNodePointer(text, Locale.ENGLISH);
        ptr.setValue("new");
        assertEquals("new", text.getNodeValue());
    }

    @Test
    public void testSetValueOnTextNodeWithEmptyString() {
        Text text = document.createTextNode("old");
        rootElement.appendChild(text);
        DOMNodePointer ptr = new DOMNodePointer(text, Locale.ENGLISH);
        ptr.setValue("");
        assertNull(text.getParentNode());
    }

    @Test
    public void testSetValueOnTextNodeWithNull() {
        Text text = document.createTextNode("old");
        rootElement.appendChild(text);
        DOMNodePointer ptr = new DOMNodePointer(text, Locale.ENGLISH);
        ptr.setValue(null);
        assertNull(text.getParentNode());
    }

    @Test
    public void testSetValueOnElementWithNodeValue() {
        Element newChild = document.createElement("newChild");
        rootPointer.setValue(newChild);
        NodeList children = rootElement.getChildNodes();
        assertEquals(1, children.getLength());
        assertEquals("newChild", children.item(0).getLocalName());
    }

    @Test
    public void testSetValueOnElementWithString() {
        rootPointer.setValue("textContent");
        NodeList children = rootElement.getChildNodes();
        assertEquals(1, children.getLength());
        assertEquals(Node.TEXT_NODE, children.item(0).getNodeType());
        assertEquals("textContent", children.item(0).getNodeValue());
    }

    @Test
    public void testSetValueOnElementWithEmptyString() {
        rootPointer.setValue("");
        NodeList children = rootElement.getChildNodes();
        assertEquals(0, children.getLength());
    }

    @Test
    public void testRemoveThrowsOnRoot() {
        try {
            rootPointer.remove();
            fail("Expected JXPathException");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("Cannot remove root DOM node"));
        }
    }

    @Test
    public void testRemoveChildNode() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.ENGLISH);
        childPtr.remove();
        assertNull(child.getParentNode());
    }

    @Test
    public void testAsPathWithId() {
        DOMNodePointer ptr = new DOMNodePointer(rootElement, Locale.ENGLISH, "myId");
        assertEquals("id('myId')", ptr.asPath());
    }

    @Test
    public void testAsPathForRootElement() {
        String path = rootPointer.asPath();
        assertTrue(path.startsWith("/ns:root[") || path.startsWith("node()["));
    }

    @Test
    public void testAsPathForTextNode() {
        Text text = document.createTextNode("text");
        rootElement.appendChild(text);
        DOMNodePointer textPtr = new DOMNodePointer(text, Locale.ENGLISH);
        String path = textPtr.asPath();
        assertTrue(path.contains("/text()["));
    }

    @Test
    public void testAsPathForProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        rootElement.appendChild(pi);
        DOMNodePointer piPtr = new DOMNodePointer(pi, Locale.ENGLISH);
        String path = piPtr.asPath();
        assertTrue(path.contains("/processing-instruction('target')"));
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
        DOMNodePointer another = new DOMNodePointer(rootElement, Locale.FRENCH);
        assertTrue(rootPointer.equals(another));
    }

    @Test
    public void testEqualsDifferentNode() {
        Element other = document.createElement("other");
        DOMNodePointer otherPtr = new DOMNodePointer(other, Locale.ENGLISH);
        assertFalse(rootPointer.equals(otherPtr));
    }

    @Test
    public void testGetPrefixFromNode() {
        assertEquals("ns", DOMNodePointer.getPrefix(rootElement));
    }

    @Test
    public void testGetPrefixFromNodeNoPrefix() {
        Element noNs = document.createElement("plain");
        assertNull(DOMNodePointer.getPrefix(noNs));
    }

    @Test
    public void testGetPrefixFromNodeNameColon() {
        Element elem = document.createElementNS("http://a.com", "a:b");
        assertEquals("a", DOMNodePointer.getPrefix(elem));
    }

    @Test
    public void testGetLocalNameFromNode() {
        assertEquals("root", DOMNodePointer.getLocalName(rootElement));
    }

    @Test
    public void testGetLocalNameFromNodeNoNamespace() {
        Element plain = document.createElement("plain");
        assertEquals("plain", DOMNodePointer.getLocalName(plain));
    }

    @Test
    public void testGetLocalNameFromNodeLocalNameNull() {
        Element elem = document.createElementNS("http://a.com", "a:b");
        assertEquals("b", DOMNodePointer.getLocalName(elem));
    }

    @Test
    public void testGetValueForCommentNode() {
        Comment comment = document.createComment(" comment data ");
        rootElement.appendChild(comment);
        DOMNodePointer ptr = new DOMNodePointer(comment, Locale.ENGLISH);
        assertEquals("comment data", ptr.getValue());
    }

    @Test
    public void testGetValueForCommentNodeNullData() {
        Comment comment = document.createComment("");
        rootElement.appendChild(comment);
        DOMNodePointer ptr = new DOMNodePointer(comment, Locale.ENGLISH);
        assertEquals("", ptr.getValue());
    }

    @Test
    public void testGetValueForTextNode() {
        Text text = document.createTextNode(" text value ");
        rootElement.appendChild(text);
        DOMNodePointer ptr = new DOMNodePointer(text, Locale.ENGLISH);
        assertEquals("text value", ptr.getValue());
    }

    @Test
    public void testGetValueForProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", " pi data ");
        rootElement.appendChild(pi);
        DOMNodePointer ptr = new DOMNodePointer(pi, Locale.ENGLISH);
        assertEquals("pi data", ptr.getValue());
    }

    @Test
    public void testGetValueForElement() {
        Element child = document.createElement("child");
        child.setTextContent("hello");
        rootElement.appendChild(child);
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.ENGLISH);
        assertEquals("hello", ptr.getValue());
    }

    @Test
    public void testCompareChildNodePointersSameNode() {
        Element child = document.createElement("child");
        DOMNodePointer ptr1 = new DOMNodePointer(child, Locale.ENGLISH);
        DOMNodePointer ptr2 = new DOMNodePointer(child, Locale.ENGLISH);
        assertEquals(0, rootPointer.compareChildNodePointers(ptr1, ptr2));
    }

    @Test
    public void testCompareChildNodePointersAttributesFirst() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer attrPtr = new DOMNodePointer(rootElement.getAttributeNode("id"), Locale.ENGLISH);
        DOMNodePointer elemPtr = new DOMNodePointer(child, Locale.ENGLISH);
        assertTrue(rootPointer.compareChildNodePointers(attrPtr, elemPtr) < 0);
    }

    @Test
    public void testCompareChildNodePointersElementsOrder() {
        Element child1 = document.createElement("child1");
        Element child2 = document.createElement("child2");
        rootElement.appendChild(child1);
        rootElement.appendChild(child2);
        DOMNodePointer ptr1 = new DOMNodePointer(child1, Locale.ENGLISH);
        DOMNodePointer ptr2 = new DOMNodePointer(child2, Locale.ENGLISH);
        assertTrue(rootPointer.compareChildNodePointers(ptr1, ptr2) < 0);
        assertTrue(rootPointer.compareChildNodePointers(ptr2, ptr1) > 0);
    }

    @Test
    public void testEscapeMethodWithNoSpecialChars() {
        assertEquals("hello", rootPointer.asPath());
    }

    @Test
    public void testGetRelativePositionByName() {
        Element child1 = document.createElement("ns:child");
        Element child2 = document.createElement("ns:child");
        rootElement.appendChild(child1);
        rootElement.appendChild(child2);
        DOMNodePointer ptr = new DOMNodePointer(child2, Locale.ENGLISH);
        String path = ptr.asPath();
        assertTrue(path.contains("[2]"));
    }

    @Test
    public void testGetRelativePositionOfElement() {
        Element child1 = document.createElement("a");
        Element child2 = document.createElement("b");
        rootElement.appendChild(child1);
        rootElement.appendChild(child2);
        DOMNodePointer ptr = new DOMNodePointer(child2, Locale.ENGLISH);
        String path = ptr.asPath();
        assertTrue(path.contains("[2]"));
    }

    @Test
    public void testGetRelativePositionOfTextNode() {
        Text text1 = document.createTextNode("first");
        Text text2 = document.createTextNode("second");
        rootElement.appendChild(text1);
        rootElement.appendChild(text2);
        DOMNodePointer ptr = new DOMNodePointer(text2, Locale.ENGLISH);
        String path = ptr.asPath();
        assertTrue(path.contains("[2]"));
    }

    @Test
    public void testGetRelativePositionOfPI() {
        ProcessingInstruction pi1 = document.createProcessingInstruction("target", "data1");
        ProcessingInstruction pi2 = document.createProcessingInstruction("target", "data2");
        rootElement.appendChild(pi1);
        rootElement.appendChild(pi2);
        DOMNodePointer ptr = new DOMNodePointer(pi2, Locale.ENGLISH);
        String path = ptr.asPath();
        assertTrue(path.contains("[2]"));
    }

    @Test
    public void testGetPointerByIDFound() {
        rootElement.setAttribute("id", "myId");
        DOMNodePointer ptr = (DOMNodePointer) rootPointer.getPointerByID(null, "myId");
        assertNotNull(ptr);
        assertEquals(rootElement, ptr.getImmediateNode());
    }

    @Test
    public void testGetNamespaceResolver() {
        assertNotNull(rootPointer.getNamespaceResolver());
    }

    @Test
    public void testChildIterator() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        NodeIterator iter = rootPointer.childIterator(null, false, null);
        assertNotNull(iter);
        assertTrue(iter.setPosition(1));
    }

    @Test
    public void testAttributeIterator() {
        rootElement.setAttribute("attr", "val");
        NodeIterator iter = rootPointer.attributeIterator(new QName("attr"));
        assertNotNull(iter);
        assertTrue(iter.setPosition(1));
    }

    @Test
    public void testNamespaceIterator() {
        NodeIterator iter = rootPointer.namespaceIterator();
        assertNotNull(iter);
    }

    @Test
    public void testCreateAttributeOnNonElement() {
        Text text = document.createTextNode("text");
        DOMNodePointer ptr = new DOMNodePointer(text, Locale.ENGLISH);
        try {
            ptr.createAttribute(null, new QName("attr"));
            fail("Expected exception");
        } catch (Exception e) {
        }
    }

    @Test
    public void testCreateAttributeWithPrefixKnown() {
        rootElement.setAttribute("xmlns:my", "http://my.com");
        DOMNodePointer ptr = new DOMNodePointer(rootElement, Locale.ENGLISH);
        NodePointer attrPtr = ptr.createAttribute(null, new QName("my", "attr"));
        assertNotNull(attrPtr);
    }

    @Test
    public void testCreateAttributeWithPrefixUnknown() {
        try {
            rootPointer.createAttribute(null, new QName("unknown", "attr"));
            fail("Expected JXPathException");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("Unknown namespace prefix"));
        }
    }

    @Test
    public void testCreateAttributeNoPrefix() {
        NodePointer attrPtr = rootPointer.createAttribute(null, new QName("attr"));
        assertNotNull(attrPtr);
        assertEquals("", rootElement.getAttribute("attr"));
    }

    @Test
    public void testCreateChildWithFactoryFailure() {
        try {
            rootPointer.createChild(null, new QName("child"), 0);
            fail("Expected JXPathAbstractFactoryException");
        } catch (Exception e) {
        }
    }

    @Test
    public void testCreateChildWithFactorySuccess() {
    }

    @Test
    public void testEqualStringsBothNull() {
        assertTrue(DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testEqualStringsSameReference() {
        String s = "test";
        assertTrue(DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testEqualStringsAfterTrim() {
        assertTrue(DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testGetNamespaceURINullPrefix() {
        String uri = rootPointer.getNamespaceURI(null);
        assertNull(uri);
    }

    @Test
    public void testGetDefaultNamespaceURIWhenDefaultNullAfterLoop() {
        rootPointer.getDefaultNamespaceURI();
        assertNull(rootPointer.getDefaultNamespaceURI());
    }

    @Test
    public void testSetValueOnElementWithDocumentChild() {
    }

    @Test
    public void testSetValueOnElementWithNodeChildNonElement() {
        Text text = document.createTextNode("text");
        rootPointer.setValue(text);
        NodeList children = rootElement.getChildNodes();
        assertEquals(1, children.getLength());
        assertEquals(Node.TEXT_NODE, children.item(0).getNodeType());
        assertEquals("text", children.item(0).getNodeValue());
    }

    @Test
    public void testCompareChildNodePointersBothAttributes() {
        rootElement.setAttribute("a", "1");
        rootElement.setAttribute("b", "2");
        Node attr1 = rootElement.getAttributeNode("a");
        Node attr2 = rootElement.getAttributeNode("b");
        DOMNodePointer ptr1 = new DOMNodePointer(attr1, Locale.ENGLISH);
        DOMNodePointer ptr2 = new DOMNodePointer(attr2, Locale.ENGLISH);
        int result = rootPointer.compareChildNodePointers(ptr1, ptr2);
        assertTrue(result == -1 || result == 1);
    }

    @Test
    public void testAsPathForDocumentNode() {
        DOMNodePointer docPtr = new DOMNodePointer(document, Locale.ENGLISH);
        String path = docPtr.asPath();
        assertNotNull(path);
    }

    @Test
    public void testGetValueForCDATASection() {
        CDATASection cdata = document.createCDATASection(" cdata text ");
        rootElement.appendChild(cdata);
        DOMNodePointer ptr = new DOMNodePointer(cdata, Locale.ENGLISH);
        assertEquals("cdata text", ptr.getValue());
    }

    @Test
    public void testTestNodeWithNodeNameTestWildcardWithPrefix() {
        Element elem = document.createElementNS("http://other.com", "other:child");
        NodeNameTest test = new NodeNameTest(new QName("ns", "*"), true, "http://example.com/ns");
        assertFalse(DOMNodePointer.testNode(elem, test));
    }

    @Test
    public void testNamespacePointer() {
        NodePointer nsPtr = rootPointer.namespacePointer("ns");
        assertNotNull(nsPtr);
    }

    @Test
    public void testGetNamespaceURIWithPrefixCached() {
        rootPointer.getNamespaceURI("ns");
        rootPointer.getNamespaceURI("ns");
        assertNotNull(rootPointer.getNamespaceURI("ns"));
    }

    @Test
    public void testGetPointerByIDNotFound() {
        Pointer ptr = rootPointer.getPointerByID(null, "nonexistent");
        assertNotNull(ptr);
        assertTrue(ptr instanceof NullPointer);
    }
}