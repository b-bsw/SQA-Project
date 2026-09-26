package org.apache.commons.jxpath.ri.model.jdom;

import static org.junit.Assert.*;

import java.util.Locale;

import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Before;
import org.junit.Test;
import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.ProcessingInstruction;
import org.jdom.Text;

public class JDOMNodePointerTest {

    private Locale locale;
    private Element element;
    private Element childElement;
    private Attribute attribute;
    private Text text;
    private CDATA cdata;
    private Comment comment;
    private ProcessingInstruction pi;
    private Document document;
    private JDOMNodePointer elementPointer;
    private JDOMNodePointer childPointer;
    private JDOMNodePointer attributePointer;
    private JDOMNodePointer textPointer;
    private JDOMNodePointer cdataPointer;
    private JDOMNodePointer commentPointer;
    private JDOMNodePointer piPointer;
    private JDOMNodePointer documentPointer;

    @Before
    public void setUp() {
        locale = Locale.US;
        element = new Element("root", "http://example.com/ns");
        childElement = new Element("child", "http://example.com/ns");
        element.addContent(childElement);
        attribute = new Attribute("attr", "value");
        element.setAttribute(attribute);
        text = new Text("some text");
        element.addContent(text);
        cdata = new CDATA("cdata text");
        element.addContent(cdata);
        comment = new Comment("comment text");
        element.addContent(comment);
        pi = new ProcessingInstruction("target", "data");
        element.addContent(pi);
        document = new Document(element);
        elementPointer = new JDOMNodePointer(element, locale);
        childPointer = new JDOMNodePointer(elementPointer, childElement);
        attributePointer = new JDOMNodePointer(element, locale, "id123");
        textPointer = new JDOMNodePointer(elementPointer, text);
        cdataPointer = new JDOMNodePointer(elementPointer, cdata);
        commentPointer = new JDOMNodePointer(elementPointer, comment);
        piPointer = new JDOMNodePointer(elementPointer, pi);
        documentPointer = new JDOMNodePointer(document, locale);
    }

    @Test
    public void testGetNamespaceURI_Element() {
        assertEquals("http://example.com/ns", elementPointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_NonElement() {
        assertNull(textPointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_WithPrefix_Document() {
        Element root = new Element("root");
        root.addNamespaceDeclaration(Namespace.getNamespace("pre", "http://uri"));
        Document doc = new Document(root);
        JDOMNodePointer docPointer = new JDOMNodePointer(doc, locale);
        assertEquals("http://uri", docPointer.getNamespaceURI("pre"));
    }

    @Test
    public void testGetNamespaceURI_WithPrefix_Element() {
        element.addNamespaceDeclaration(Namespace.getNamespace("pre", "http://uri"));
        assertEquals("http://uri", elementPointer.getNamespaceURI("pre"));
    }

    @Test
    public void testGetNamespaceURI_WithPrefix_Null() {
        assertNull(elementPointer.getNamespaceURI("nonexistent"));
    }

    @Test
    public void testCompareChildNodePointers_Identical() {
        assertEquals(0, elementPointer.compareChildNodePointers(childPointer, childPointer));
    }

    @Test
    public void testCompareChildNodePointers_AttributeVsElement() {
        NodePointer attrPtr = new JDOMNodePointer(elementPointer, attribute);
        assertEquals(-1, elementPointer.compareChildNodePointers(attrPtr, childPointer));
        assertEquals(1, elementPointer.compareChildNodePointers(childPointer, attrPtr));
    }

    @Test
    public void testCompareChildNodePointers_TwoAttributes() {
        Element elem = new Element("test");
        Attribute a1 = new Attribute("a1", "v1");
        Attribute a2 = new Attribute("a2", "v2");
        elem.setAttribute(a1);
        elem.setAttribute(a2);
        JDOMNodePointer elemPtr = new JDOMNodePointer(elem, locale);
        NodePointer p1 = new JDOMNodePointer(elemPtr, a1);
        NodePointer p2 = new JDOMNodePointer(elemPtr, a2);
        assertTrue(elemPtr.compareChildNodePointers(p1, p2) < 0);
        assertTrue(elemPtr.compareChildNodePointers(p2, p1) > 0);
    }

    @Test(expected = RuntimeException.class)
    public void testCompareChildNodePointers_NonElementNode() {
        textPointer.compareChildNodePointers(childPointer, childPointer);
    }

    @Test
    public void testIsLeaf_ElementWithContent() {
        assertFalse(elementPointer.isLeaf());
    }

    @Test
    public void testIsLeaf_EmptyElement() {
        Element empty = new Element("empty");
        JDOMNodePointer emptyPtr = new JDOMNodePointer(empty, locale);
        assertTrue(emptyPtr.isLeaf());
    }

    @Test
    public void testIsLeaf_DocumentWithContent() {
        assertFalse(documentPointer.isLeaf());
    }

    @Test
    public void testIsLeaf_DocumentEmpty() {
        Document d = new Document(new Element("r"));
        JDOMNodePointer dp = new JDOMNodePointer(d, locale);
        assertFalse(dp.isLeaf());
    }

    @Test
    public void testIsLeaf_Text() {
        assertTrue(textPointer.isLeaf());
    }

    @Test
    public void testGetValue_Element() {
        element.setText("  trimmed  ");
        assertEquals("trimmed", elementPointer.getValue());
    }

    @Test
    public void testGetValue_Comment() {
        assertEquals("comment text", commentPointer.getValue());
    }

    @Test
    public void testGetValue_CommentWithSpaces() {
        Comment c = new Comment("  spaced  ");
        JDOMNodePointer cp = new JDOMNodePointer(elementPointer, c);
        assertEquals("spaced", cp.getValue());
    }

    @Test
    public void testGetValue_Text() {
        assertEquals("some text", textPointer.getValue());
    }

    @Test
    public void testGetValue_CDATA() {
        assertEquals("cdata text", cdataPointer.getValue());
    }

    @Test
    public void testGetValue_ProcessingInstruction() {
        assertEquals("data", piPointer.getValue());
    }

    @Test
    public void testGetValue_NullForOther() {
        JDOMNodePointer attrPtr = new JDOMNodePointer(elementPointer, attribute);
        assertNull(attrPtr.getValue());
    }

    @Test
    public void testSetValue_TextNode() {
        Text t = new Text("old");
        Element parent = new Element("p");
        parent.addContent(t);
        JDOMNodePointer ptr = new JDOMNodePointer(new JDOMNodePointer(parent, locale), t);
        ptr.setValue("new");
        assertEquals("new", t.getText());
    }

    @Test
    public void testSetValue_TextNodeRemoveIfEmpty() {
        Text t = new Text("old");
        Element parent = new Element("p");
        parent.addContent(t);
        JDOMNodePointer ptr = new JDOMNodePointer(new JDOMNodePointer(parent, locale), t);
        ptr.setValue("");
        assertFalse(parent.getContent().contains(t));
    }

    @Test
    public void testSetValue_ElementReplaceWithString() {
        element.getContent().clear();
        elementPointer.setValue("newText");
        assertEquals("newText", element.getText());
    }

    @Test
    public void testSetValue_ElementReplaceWithElement() {
        Element newChild = new Element("newChild");
        elementPointer.setValue(newChild);
        assertEquals(1, element.getContent().size());
        assertTrue(element.getContent().get(0) instanceof Element);
    }

    @Test
    public void testSetValue_ElementReplaceWithDocument() {
        Element docRoot = new Element("docRoot");
        Document doc = new Document(docRoot);
        elementPointer.setValue(doc);
        assertTrue(element.getContent().get(0) instanceof Element);
    }

    @Test
    public void testSetValue_ElementReplaceWithText() {
        Text t = new Text("hello");
        elementPointer.setValue(t);
        assertTrue(element.getContent().get(0) instanceof Text);
    }

    @Test
    public void testSetValue_ElementReplaceWithCDATA() {
        CDATA cd = new CDATA("cdata");
        elementPointer.setValue(cd);
        assertTrue(element.getContent().get(0) instanceof Text);
    }

    @Test
    public void testSetValue_ElementReplaceWithPI() {
        ProcessingInstruction newPi = new ProcessingInstruction("newTarget", "newData");
        elementPointer.setValue(newPi);
        assertTrue(element.getContent().get(0) instanceof ProcessingInstruction);
    }

    @Test
    public void testSetValue_ElementReplaceWithComment() {
        Comment newComment = new Comment("newComment");
        elementPointer.setValue(newComment);
        assertTrue(element.getContent().get(0) instanceof Comment);
    }

    @Test
    public void testSetValue_EmptyStringOnElement() {
        element.getContent().clear();
        elementPointer.setValue("");
        assertTrue(element.getContent().isEmpty());
    }

    @Test
    public void testTestNode_NullTest() {
        assertTrue(elementPointer.testNode(null));
    }

    @Test
    public void testTestNode_NodeNameTestWildcardNoPrefix() {
        NodeNameTest test = new NodeNameTest(new QName(null, "*"), null, true);
        assertTrue(elementPointer.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTestWildcardWithPrefix() {
        NodeNameTest test = new NodeNameTest(new QName("p", "*"), "http://example.com/ns", true);
        JDOMNodePointer ptr = new JDOMNodePointer(element, locale);
        assertTrue(ptr.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTestExactMatch() {
        NodeNameTest test = new NodeNameTest(new QName(null, "root"), "http://example.com/ns", false);
        assertTrue(elementPointer.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTestNoMatch() {
        NodeNameTest test = new NodeNameTest(new QName(null, "other"), "http://example.com/ns", false);
        assertFalse(elementPointer.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTestNullNamespace() {
        Element noNs = new Element("noNs");
        JDOMNodePointer ptr = new JDOMNodePointer(noNs, locale);
        NodeNameTest test = new NodeNameTest(new QName(null, "noNs"), null, false);
        assertTrue(ptr.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTestElement() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(elementPointer.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTestTextForText() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(textPointer.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTestTextForCDATA() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(cdataPointer.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTestComment() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(commentPointer.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTestPI() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(piPointer.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTestNoMatch() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertFalse(elementPointer.testNode(test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(piPointer.testNode(test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTestNoMatch() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("other");
        assertFalse(piPointer.testNode(test));
    }

    @Test
    public void testEqualStrings_BothNull() {
        assertTrue(JDOMNodePointer.testNode(null, null, new NodeNameTest(new QName(null, "test"), null, true)));
    }

    @Test
    public void testGetPrefix_Element() {
        Element e = new Element("prefixed", "pre", "http://uri");
        assertEquals("pre", JDOMNodePointer.getPrefix(e));
    }

    @Test
    public void testGetPrefix_ElementNoPrefix() {
        Element e = new Element("noprefix");
        assertNull(JDOMNodePointer.getPrefix(e));
    }

    @Test
    public void testGetPrefix_Attribute() {
        Attribute a = new Attribute("attr", "val", Namespace.getNamespace("pre", "http://uri"));
        assertEquals("pre", JDOMNodePointer.getPrefix(a));
    }

    @Test
    public void testGetPrefix_AttributeNoPrefix() {
        Attribute a = new Attribute("attr", "val");
        assertNull(JDOMNodePointer.getPrefix(a));
    }

    @Test
    public void testGetLocalName_Element() {
        assertEquals("root", JDOMNodePointer.getLocalName(element));
    }

    @Test
    public void testGetLocalName_Attribute() {
        assertEquals("attr", JDOMNodePointer.getLocalName(attribute));
    }

    @Test
    public void testGetLocalName_Null() {
        assertNull(JDOMNodePointer.getLocalName("string"));
    }

    @Test
    public void testIsLanguage_Found() {
        element.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        assertTrue(elementPointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguage_CaseInsensitive() {
        element.setAttribute("lang", "EN-US", Namespace.XML_NAMESPACE);
        assertTrue(elementPointer.isLanguage("en-us"));
    }

    @Test
    public void testIsLanguage_NotSet() {
        assertFalse(elementPointer.isLanguage("fr"));
    }

    @Test
    public void testIsLanguage_EmptyAttr() {
        element.setAttribute("lang", "", Namespace.XML_NAMESPACE);
        assertFalse(elementPointer.isLanguage("fr"));
    }

    @Test
    public void testRemove_NonRoot() {
        Element parent = new Element("parent");
        parent.addContent(childElement);
        JDOMNodePointer ptr = new JDOMNodePointer(new JDOMNodePointer(parent, locale), childElement);
        ptr.remove();
        assertFalse(parent.getContent().contains(childElement));
    }

    @Test(expected = JXPathException.class)
    public void testRemove_Root() {
        elementPointer.remove();
    }

    @Test
    public void testAsPath_WithId() {
        assertEquals("id('id123')", attributePointer.asPath());
    }

    @Test
    public void testHashCode() {
        int expected = System.identityHashCode(element);
        assertEquals(expected, elementPointer.hashCode());
    }

    @Test
    public void testEquals_SameObject() {
        assertTrue(elementPointer.equals(elementPointer));
    }

    @Test
    public void testEquals_DifferentType() {
        assertFalse(elementPointer.equals("string"));
    }

    @Test
    public void testEquals_SameNode() {
        JDOMNodePointer other = new JDOMNodePointer(element, locale);
        assertTrue(elementPointer.equals(other));
    }

    @Test
    public void testEquals_DifferentNode() {
        Element other = new Element("other");
        JDOMNodePointer otherPtr = new JDOMNodePointer(other, locale);
        assertFalse(elementPointer.equals(otherPtr));
    }

    @Test
    public void testGetName_Element() {
        QName name = elementPointer.getName();
        assertEquals("root", name.getName());
        assertNull(name.getPrefix());
    }

    @Test
    public void testGetName_ElementWithPrefix() {
        Element e = new Element("pref", "pre", "http://uri");
        JDOMNodePointer ptr = new JDOMNodePointer(e, locale);
        QName name = ptr.getName();
        assertEquals("pref", name.getName());
        assertEquals("pre", name.getPrefix());
    }

    @Test
    public void testGetName_ProcessingInstruction() {
        QName name = piPointer.getName();
        assertEquals("target", name.getName());
        assertNull(name.getPrefix());
    }

    @Test
    public void testGetName_Text() {
        assertNull(textPointer.getName());
    }

    @Test
    public void testGetImmediateNode() {
        assertSame(element, elementPointer.getImmediateNode());
    }

    @Test
    public void testGetBaseValue() {
        assertSame(element, elementPointer.getBaseValue());
    }

    @Test
    public void testIsCollection() {
        assertFalse(elementPointer.isCollection());
    }

    @Test
    public void testGetLength() {
        assertEquals(1, elementPointer.getLength());
    }
}