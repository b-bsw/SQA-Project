package org.apache.commons.jxpath.ri.model.jdom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Locale;

import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.ProcessingInstruction;
import org.jdom.Text;
import org.junit.Before;
import org.junit.Test;

public class JDOMNodePointerTest {

    private Element element;
    private JDOMNodePointer pointer;

    @Before
    public void setUp() {
        element = new Element("root");
        element.setText("Hello");
        pointer = new JDOMNodePointer(element, Locale.ENGLISH);
    }

    @Test
    public void testConstructorWithNodeAndLocale() {
        JDOMNodePointer p = new JDOMNodePointer(element, Locale.US);
        assertNotNull(p);
        assertEquals(element, p.getImmediateNode());
    }

    @Test
    public void testConstructorWithNodeLocaleAndId() {
        JDOMNodePointer p = new JDOMNodePointer(element, Locale.US, "myId");
        assertNotNull(p);
        assertEquals("id('myId')", p.asPath());
    }

    @Test
    public void testConstructorWithParentAndNode() {
        JDOMNodePointer parent = new JDOMNodePointer(element, Locale.ENGLISH);
        Element child = new Element("child");
        JDOMNodePointer p = new JDOMNodePointer(parent, child);
        assertNotNull(p);
        assertEquals(child, p.getImmediateNode());
    }

    @Test
    public void testGetBaseValue() {
        assertEquals(element, pointer.getBaseValue());
    }

    @Test
    public void testIsCollectionReturnsFalse() {
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testGetLengthReturnsOne() {
        assertEquals(1, pointer.getLength());
    }

    @Test
    public void testIsLeafElementWithNoContent() {
        Element empty = new Element("empty");
        JDOMNodePointer p = new JDOMNodePointer(empty, Locale.ENGLISH);
        assertTrue(p.isLeaf());
    }

    @Test
    public void testIsLeafElementWithContent() {
        assertFalse(pointer.isLeaf());
    }

    @Test
    public void testIsLeafDocumentWithNoContent() {
        Document doc = new Document();
        JDOMNodePointer p = new JDOMNodePointer(doc, Locale.ENGLISH);
        assertTrue(p.isLeaf());
    }

    @Test
    public void testIsLeafTextNode() {
        Text text = new Text("test");
        JDOMNodePointer p = new JDOMNodePointer(text, Locale.ENGLISH);
        assertTrue(p.isLeaf());
    }

    @Test
    public void testIsLeafCDATA() {
        CDATA cdata = new CDATA("test");
        JDOMNodePointer p = new JDOMNodePointer(cdata, Locale.ENGLISH);
        assertTrue(p.isLeaf());
    }

    @Test
    public void testGetNameElementWithNoNamespace() {
        QName name = pointer.getName();
        assertEquals("root", name.getName());
        assertNull(name.getPrefix());
    }

    @Test
    public void testGetNameElementWithNamespace() {
        Element nsElement = new Element("child", "http://example.com");
        nsElement.setNamespace(Namespace.getNamespace("pre", "http://example.com"));
        JDOMNodePointer p = new JDOMNodePointer(nsElement, Locale.ENGLISH);
        QName name = p.getName();
        assertEquals("child", name.getName());
        assertEquals("pre", name.getPrefix());
    }

    @Test
    public void testGetNameProcessingInstruction() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer p = new JDOMNodePointer(pi, Locale.ENGLISH);
        QName name = p.getName();
        assertEquals("target", name.getName());
        assertNull(name.getPrefix());
    }

    @Test
    public void testGetValueElement() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        child.addContent(new Text("text"));
        parent.addContent(child);
        JDOMNodePointer p = new JDOMNodePointer(parent, Locale.ENGLISH);
        assertEquals("text", p.getValue());
    }

    @Test
    public void testGetValueComment() {
        Comment comment = new Comment(" comment ");
        JDOMNodePointer p = new JDOMNodePointer(comment, Locale.ENGLISH);
        assertEquals("comment", p.getValue());
    }

    @Test
    public void testGetValueText() {
        Text text = new Text("  hello  ");
        JDOMNodePointer p = new JDOMNodePointer(text, Locale.ENGLISH);
        assertEquals("hello", p.getValue());
    }

    @Test
    public void testGetValueTextPreserveSpace() {
        Element parent = new Element("parent");
        parent.setAttribute("space", "preserve", Namespace.XML_NAMESPACE);
        Text text = new Text("  hello  ");
        parent.addContent(text);
        JDOMNodePointer p = new JDOMNodePointer(text, Locale.ENGLISH);
        assertEquals("  hello  ", p.getValue());
    }

    @Test
    public void testGetValueProcessingInstruction() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "  data  ");
        JDOMNodePointer p = new JDOMNodePointer(pi, Locale.ENGLISH);
        assertEquals("  data  ", p.getValue());
    }

    @Test
    public void testSetValueOnTextNode() {
        Text text = new Text("old");
        Element parent = new Element("parent");
        parent.addContent(text);
        JDOMNodePointer p = new JDOMNodePointer(text, Locale.ENGLISH);
        p.setValue("new");
        assertEquals("new", text.getText());
    }

    @Test
    public void testSetValueOnTextNodeEmptyRemoves() {
        Text text = new Text("old");
        Element parent = new Element("parent");
        parent.addContent(text);
        JDOMNodePointer p = new JDOMNodePointer(text, Locale.ENGLISH);
        p.setValue("");
        assertFalse(parent.getContent().contains(text));
    }

    @Test
    public void testSetValueOnElement() {
        Element e = new Element("e");
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.ENGLISH);
        p.setValue("test");
        assertEquals("test", e.getText());
    }

    @Test
    public void testSetValueOnElementWithElement() {
        Element e = new Element("e");
        Element child = new Element("child");
        child.addContent(new Text("data"));
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.ENGLISH);
        p.setValue(child);
        assertEquals(1, e.getContent().size());
        assertTrue(e.getContent().get(0) instanceof Element);
    }

    @Test
    public void testSetValueOnElementWithText() {
        Element e = new Element("e");
        Text text = new Text("hello");
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.ENGLISH);
        p.setValue(text);
        assertEquals(1, e.getContent().size());
        assertEquals("hello", ((Text) e.getContent().get(0)).getText());
    }

    @Test
    public void testSetValueOnElementWithCDATA() {
        Element e = new Element("e");
        CDATA cdata = new CDATA("cdata");
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.ENGLISH);
        p.setValue(cdata);
        assertEquals(1, e.getContent().size());
        assertTrue(e.getContent().get(0) instanceof Text);
        assertEquals("cdata", ((Text) e.getContent().get(0)).getText());
    }

    @Test
    public void testSetValueOnElementWithProcessingInstruction() {
        Element e = new Element("e");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.ENGLISH);
        p.setValue(pi);
        assertEquals(1, e.getContent().size());
        assertTrue(e.getContent().get(0) instanceof ProcessingInstruction);
    }

    @Test
    public void testSetValueOnElementWithComment() {
        Element e = new Element("e");
        Comment comment = new Comment("comment");
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.ENGLISH);
        p.setValue(comment);
        assertEquals(1, e.getContent().size());
        assertTrue(e.getContent().get(0) instanceof Comment);
    }

    @Test
    public void testTestNodeWithNullTest() {
        assertTrue(JDOMNodePointer.testNode(null, element, null));
    }

    @Test
    public void testTestNodeNodeNameTestNotElement() {
        NodeNameTest test = new NodeNameTest(new QName("test"));
        Text text = new Text("test");
        assertFalse(JDOMNodePointer.testNode(null, text, test));
    }

    @Test
    public void testTestNodeNodeNameTestWildcardNoPrefix() {
        NodeNameTest test = new NodeNameTest(new QName(null, "*"));
        assertTrue(JDOMNodePointer.testNode(null, element, test));
    }

    @Test
    public void testTestNodeNodeNameTestWildcardWithPrefix() {
        NodeNameTest test = new NodeNameTest(new QName("pre", "*"));
        assertFalse(JDOMNodePointer.testNode(null, element, test));
    }

    @Test
    public void testTestNodeNodeNameTestExactMatch() {
        NodeNameTest test = new NodeNameTest(new QName(null, "root"));
        assertTrue(JDOMNodePointer.testNode(null, element, test));
    }

    @Test
    public void testTestNodeNodeNameTestNoMatch() {
        NodeNameTest test = new NodeNameTest(new QName(null, "wrong"));
        assertFalse(JDOMNodePointer.testNode(null, element, test));
    }

    @Test
    public void testTestNodeNodeTypeTestNode() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(JDOMNodePointer.testNode(null, element, test));
    }

    @Test
    public void testTestNodeNodeTypeTestTextWithText() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Text text = new Text("test");
        assertTrue(JDOMNodePointer.testNode(null, text, test));
    }

    @Test
    public void testTestNodeNodeTypeTestTextWithCDATA() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        CDATA cdata = new CDATA("test");
        assertTrue(JDOMNodePointer.testNode(null, cdata, test));
    }

    @Test
    public void testTestNodeNodeTypeTestTextWithElement() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertFalse(JDOMNodePointer.testNode(null, element, test));
    }

    @Test
    public void testTestNodeNodeTypeTestComment() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Comment comment = new Comment("test");
        assertTrue(JDOMNodePointer.testNode(null, comment, test));
    }

    @Test
    public void testTestNodeNodeTypeTestCommentWithElement() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertFalse(JDOMNodePointer.testNode(null, element, test));
    }

    @Test
    public void testTestNodeNodeTypeTestPI() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        assertTrue(JDOMNodePointer.testNode(null, pi, test));
    }

    @Test
    public void testTestNodeNodeTypeTestPIWithElement() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertFalse(JDOMNodePointer.testNode(null, element, test));
    }

    @Test
    public void testTestNodeProcessingInstructionTestMatch() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        assertTrue(JDOMNodePointer.testNode(null, pi, test));
    }

    @Test
    public void testTestNodeProcessingInstructionTestNoMatch() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("other");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        assertFalse(JDOMNodePointer.testNode(null, pi, test));
    }

    @Test
    public void testTestNodeProcessingInstructionTestNotPI() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertFalse(JDOMNodePointer.testNode(null, element, test));
    }

    @Test
    public void testGetLocalNameElement() {
        assertEquals("root", JDOMNodePointer.getLocalName(element));
    }

    @Test
    public void testGetLocalNameAttribute() {
        Attribute attr = new Attribute("attr", "val");
        assertEquals("attr", JDOMNodePointer.getLocalName(attr));
    }

    @Test
    public void testGetLocalNameOther() {
        assertNull(JDOMNodePointer.getLocalName(new Text("test")));
    }

    @Test
    public void testGetPrefixElementWithPrefix() {
        Element nsElement = new Element("child", "http://example.com");
        nsElement.setNamespace(Namespace.getNamespace("pre", "http://example.com"));
        assertEquals("pre", JDOMNodePointer.getPrefix(nsElement));
    }

    @Test
    public void testGetPrefixElementNoPrefix() {
        assertNull(JDOMNodePointer.getPrefix(element));
    }

    @Test
    public void testGetPrefixAttributeWithPrefix() {
        Namespace ns = Namespace.getNamespace("pre", "http://example.com");
        Attribute attr = new Attribute("attr", "val", ns);
        assertEquals("pre", JDOMNodePointer.getPrefix(attr));
    }

    @Test
    public void testGetPrefixAttributeNoPrefix() {
        Attribute attr = new Attribute("attr", "val");
        assertNull(JDOMNodePointer.getPrefix(attr));
    }

    @Test
    public void testGetPrefixOther() {
        assertNull(JDOMNodePointer.getPrefix(new Text("test")));
    }

    @Test
    public void testEqualStringsBothNull() {
        assertTrue(JDOMNodePointer.testNode(null, element, null));
    }

    @Test
    public void testAsPathWithId() {
        JDOMNodePointer p = new JDOMNodePointer(element, Locale.ENGLISH, "myId");
        assertEquals("id('myId')", p.asPath());
    }

    @Test
    public void testAsPathElement() {
        Element root = new Element("root");
        Document doc = new Document(root);
        JDOMNodePointer p = new JDOMNodePointer(root, Locale.ENGLISH);
        assertEquals("root[1]", p.asPath());
    }

    @Test
    public void testAsPathNestedElement() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer parentPointer = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer childPointer = new JDOMNodePointer(parentPointer, child);
        String path = childPointer.asPath();
        assertTrue(path.contains("child[1]"));
    }

    @Test
    public void testHashCode() {
        assertEquals(element.hashCode(), pointer.hashCode());
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(pointer.equals(pointer));
    }

    @Test
    public void testEqualsDifferentType() {
        assertFalse(pointer.equals("string"));
    }

    @Test
    public void testEqualsSameNode() {
        JDOMNodePointer other = new JDOMNodePointer(element, Locale.ENGLISH);
        assertTrue(pointer.equals(other));
    }

    @Test
    public void testEqualsDifferentNode() {
        Element otherElement = new Element("other");
        JDOMNodePointer other = new JDOMNodePointer(otherElement, Locale.ENGLISH);
        assertFalse(pointer.equals(other));
    }

    @Test
    public void testIsLanguageExactMatch() {
        element.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageStartsWith() {
        element.setAttribute("lang", "en-US", Namespace.XML_NAMESPACE);
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testRemove() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.addContent(child);
        JDOMNodePointer p = new JDOMNodePointer(child, Locale.ENGLISH);
        p.remove();
        assertTrue(parent.getContent().isEmpty());
    }

    @Test(expected = JXPathException.class)
    public void testRemoveRootThrowsException() {
        pointer.remove();
    }

    @Test
    public void testGetNamespaceURIElementWithEmptyNamespace() {
        Element e = new Element("root");
        assertNull(JDOMNodePointer.getNamespaceURI(e));
    }

    @Test
    public void testGetNamespaceURIElementWithNamespace() {
        Element e = new Element("root", "http://example.com");
        assertEquals("http://example.com", JDOMNodePointer.getNamespaceURI(e));
    }

    @Test
    public void testGetNamespaceURINonElement() {
        assertNull(JDOMNodePointer.getNamespaceURI(new Text("test")));
    }

    @Test
    public void testGetNamespaceURIWithXmlPrefix() {
        assertEquals(Namespace.XML_NAMESPACE.getURI(), pointer.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURIWithNullElement() {
        JDOMNodePointer p = new JDOMNodePointer(new Text("test"), Locale.ENGLISH);
        assertNull(p.getNamespaceURI("pre"));
    }

    @Test
    public void testGetNamespaceURIWithElementAndPrefix() {
        Namespace ns = Namespace.getNamespace("pre", "http://example.com");
        Element e = new Element("root");
        e.addNamespaceDeclaration(ns);
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.ENGLISH);
        assertEquals("http://example.com", p.getNamespaceURI("pre"));
    }

    @Test
    public void testGetNamespaceURIWithDocument() {
        Namespace ns = Namespace.getNamespace("pre", "http://example.com");
        Element root = new Element("root");
        root.addNamespaceDeclaration(ns);
        Document doc = new Document(root);
        JDOMNodePointer p = new JDOMNodePointer(doc, Locale.ENGLISH);
        assertEquals("http://example.com", p.getNamespaceURI("pre"));
    }

    @Test
    public void testCompareChildNodePointersSameNode() {
        NodePointer p1 = new JDOMNodePointer(element, Locale.ENGLISH);
        NodePointer p2 = new JDOMNodePointer(element, Locale.ENGLISH);
        assertEquals(0, pointer.compareChildNodePointers(p1, p2));
    }

    @Test
    public void testCompareChildNodePointersAttributeVsNonAttribute() {
        Element parent = new Element("parent");
        Attribute attr = new Attribute("attr", "val");
        parent.setAttribute(attr);
        Element child = new Element("child");
        parent.addContent(child);
        JDOMNodePointer parentPointer = new JDOMNodePointer(parent, Locale.ENGLISH);
        NodePointer attrPointer = new JDOMNodePointer(attr, Locale.ENGLISH);
        NodePointer childPointer = new JDOMNodePointer(child, Locale.ENGLISH);
        assertEquals(-1, parentPointer.compareChildNodePointers(attrPointer, childPointer));
        assertEquals(1, parentPointer.compareChildNodePointers(childPointer, attrPointer));
    }

    @Test(expected = RuntimeException.class)
    public void testCompareChildNodePointersNonElementNode() {
        Text text = new Text("test");
        JDOMNodePointer p = new JDOMNodePointer(text, Locale.ENGLISH);
        NodePointer p1 = new JDOMNodePointer(new Element("a"), Locale.ENGLISH);
        NodePointer p2 = new JDOMNodePointer(new Element("b"), Locale.ENGLISH);
        p.compareChildNodePointers(p1, p2);
    }

    @Test
    public void testFindEnclosingAttributeFound() {
        element.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        assertEquals("en", JDOMNodePointer.findEnclosingAttribute(element, "lang", Namespace.XML_NAMESPACE));
    }

    @Test
    public void testFindEnclosingAttributeNotFound() {
        assertNull(JDOMNodePointer.findEnclosingAttribute(element, "nonexistent", Namespace.XML_NAMESPACE));
    }

    @Test
    public void testFindEnclosingAttributeNullNode() {
        assertNull(JDOMNodePointer.findEnclosingAttribute(null, "lang", Namespace.XML_NAMESPACE));
    }

    @Test
    public void testGetNamespaceResolverInitializes() {
        assertNotNull(pointer.getNamespaceResolver());
    }

    @Test
    public void testGetNamespaceResolverReturnsSameInstance() {
        NamespaceResolver r1 = pointer.getNamespaceResolver();
        NamespaceResolver r2 = pointer.getNamespaceResolver();
        assertEquals(r1, r2);
    }
}