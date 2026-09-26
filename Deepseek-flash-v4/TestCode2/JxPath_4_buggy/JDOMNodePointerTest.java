package org.apache.commons.jxpath.ri.model.jdom;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.jdom.*;

public class JDOMNodePointerTest {

    private Element rootElement;
    private JDOMNodePointer rootPointer;

    @Before
    public void setUp() {
        rootElement = new Element("root");
        rootPointer = new JDOMNodePointer(rootElement, Locale.US);
    }

    @Test
    public void testGetNamespaceURI_ElementWithEmptyNamespace() {
        Element element = new Element("child", "");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        assertNull(pointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_ElementWithNamespace() {
        Element element = new Element("child", "http://example.com");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        assertEquals("http://example.com", pointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_NonElementReturnsNull() {
        Text text = new Text("test");
        JDOMNodePointer pointer = new JDOMNodePointer(text, Locale.US);
        assertNull(pointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_PrefixDocument() {
        Document doc = new Document(new Element("root"));
        doc.getRootElement().addNamespaceDeclaration(Namespace.getNamespace("pre", "http://pre.com"));
        JDOMNodePointer pointer = new JDOMNodePointer(doc, Locale.US);
        assertEquals("http://pre.com", pointer.getNamespaceURI("pre"));
    }

    @Test
    public void testGetNamespaceURI_PrefixElement() {
        Element element = new Element("child", Namespace.getNamespace("pre", "http://pre.com"));
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        assertEquals("http://pre.com", pointer.getNamespaceURI("pre"));
    }

    @Test
    public void testGetNamespaceURI_PrefixNotFoundReturnsNull() {
        Element element = new Element("child");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        assertNull(pointer.getNamespaceURI("nonexistent"));
    }

    @Test
    public void testCompareChildNodePointers_SameNode() {
        JDOMNodePointer p1 = new JDOMNodePointer(rootElement, Locale.US);
        assertEquals(0, rootPointer.compareChildNodePointers(p1, p1));
    }

    @Test
    public void testCompareChildNodePointers_AttributeBeforeElement() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        Attribute attr = new Attribute("id", "1");
        parent.addContent(child);
        parent.setAttribute(attr);
        JDOMNodePointer pAttr = new JDOMNodePointer(attr, Locale.US);
        JDOMNodePointer pChild = new JDOMNodePointer(child, Locale.US);
        assertTrue(rootPointer.compareChildNodePointers(pAttr, pChild) < 0);
        assertTrue(rootPointer.compareChildNodePointers(pChild, pAttr) > 0);
    }

    @Test
    public void testCompareChildNodePointers_AttributeOrder() {
        Element parent = new Element("parent");
        Attribute attr1 = new Attribute("a", "1");
        Attribute attr2 = new Attribute("b", "2");
        parent.setAttribute(attr1);
        parent.setAttribute(attr2);
        JDOMNodePointer p1 = new JDOMNodePointer(attr1, Locale.US);
        JDOMNodePointer p2 = new JDOMNodePointer(attr2, Locale.US);
        assertTrue(rootPointer.compareChildNodePointers(p1, p2) < 0);
        assertTrue(rootPointer.compareChildNodePointers(p2, p1) > 0);
    }

    @Test
    public void testCompareChildNodePointers_ElementOrder() {
        Element parent = new Element("parent");
        Element child1 = new Element("child1");
        Element child2 = new Element("child2");
        parent.addContent(child1);
        parent.addContent(child2);
        JDOMNodePointer pParent = new JDOMNodePointer(parent, Locale.US);
        JDOMNodePointer p1 = new JDOMNodePointer(child1, Locale.US);
        JDOMNodePointer p2 = new JDOMNodePointer(child2, Locale.US);
        assertTrue(pParent.compareChildNodePointers(p1, p2) < 0);
        assertTrue(pParent.compareChildNodePointers(p2, p1) > 0);
    }

    @Test(expected = RuntimeException.class)
    public void testCompareChildNodePointers_NonElementNodeThrows() {
        Text text = new Text("test");
        JDOMNodePointer pointer = new JDOMNodePointer(text, Locale.US);
        pointer.compareChildNodePointers(
            new JDOMNodePointer(new Element("a"), Locale.US),
            new JDOMNodePointer(new Element("b"), Locale.US));
    }

    @Test
    public void testIsLeaf_ElementWithContent() {
        Element element = new Element("parent");
        element.addContent(new Element("child"));
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        assertFalse(pointer.isLeaf());
    }

    @Test
    public void testIsLeaf_ElementWithoutContent() {
        Element element = new Element("empty");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testIsLeaf_DocumentWithContent() {
        Document doc = new Document(new Element("root"));
        JDOMNodePointer pointer = new JDOMNodePointer(doc, Locale.US);
        assertFalse(pointer.isLeaf());
    }

    @Test
    public void testIsLeaf_DocumentWithoutContent() {
        Document doc = new Document();
        JDOMNodePointer pointer = new JDOMNodePointer(doc, Locale.US);
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testIsLeaf_NonElementNonDocument() {
        Text text = new Text("test");
        JDOMNodePointer pointer = new JDOMNodePointer(text, Locale.US);
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testGetName_ElementWithPrefix() {
        Element element = new Element("child", Namespace.getNamespace("pre", "http://pre.com"));
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        QName name = pointer.getName();
        assertEquals("pre", name.getPrefix());
        assertEquals("child", name.getName());
    }

    @Test
    public void testGetName_ElementWithoutPrefix() {
        Element element = new Element("child");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        QName name = pointer.getName();
        assertNull(name.getPrefix());
        assertEquals("child", name.getName());
    }

    @Test
    public void testGetName_ProcessingInstruction() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer pointer = new JDOMNodePointer(pi, Locale.US);
        QName name = pointer.getName();
        assertNull(name.getPrefix());
        assertEquals("target", name.getName());
    }

    @Test
    public void testGetName_OtherNodeReturnsNull() {
        Text text = new Text("test");
        JDOMNodePointer pointer = new JDOMNodePointer(text, Locale.US);
        QName name = pointer.getName();
        assertNull(name.getPrefix());
        assertNull(name.getName());
    }

    @Test
    public void testGetValue_Element() {
        Element element = new Element("test");
        element.setText("  hello  ");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        assertEquals("hello", pointer.getValue());
    }

    @Test
    public void testGetValue_Comment() {
        Comment comment = new Comment("  comment text  ");
        JDOMNodePointer pointer = new JDOMNodePointer(comment, Locale.US);
        assertEquals("comment text", pointer.getValue());
    }

    @Test
    public void testGetValue_CommentNullText() {
        Comment comment = new Comment(null);
        JDOMNodePointer pointer = new JDOMNodePointer(comment, Locale.US);
        assertNull(pointer.getValue());
    }

    @Test
    public void testGetValue_Text() {
        Text text = new Text("  text value  ");
        JDOMNodePointer pointer = new JDOMNodePointer(text, Locale.US);
        assertEquals("text value", pointer.getValue());
    }

    @Test
    public void testGetValue_CDATA() {
        CDATA cdata = new CDATA("  cdata value  ");
        JDOMNodePointer pointer = new JDOMNodePointer(cdata, Locale.US);
        assertEquals("cdata value", pointer.getValue());
    }

    @Test
    public void testGetValue_ProcessingInstruction() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "  pi data  ");
        JDOMNodePointer pointer = new JDOMNodePointer(pi, Locale.US);
        assertEquals("pi data", pointer.getValue());
    }

    @Test
    public void testGetValue_ProcessingInstructionNullData() {
        ProcessingInstruction pi = new ProcessingInstruction("target", (String) null);
        JDOMNodePointer pointer = new JDOMNodePointer(pi, Locale.US);
        assertNull(pointer.getValue());
    }

    @Test
    public void testGetValue_OtherNodeReturnsNull() {
        Attribute attr = new Attribute("name", "value");
        JDOMNodePointer pointer = new JDOMNodePointer(attr, Locale.US);
        assertNull(pointer.getValue());
    }

    @Test
    public void testSetValue_TextNodeWithNonEmptyString() {
        Element parent = new Element("parent");
        Text text = new Text("old");
        parent.addContent(text);
        JDOMNodePointer pointer = new JDOMNodePointer(text, Locale.US);
        pointer.setValue("new");
        assertEquals("new", text.getText());
    }

    @Test
    public void testSetValue_TextNodeWithEmptyStringRemoves() {
        Element parent = new Element("parent");
        Text text = new Text("old");
        parent.addContent(text);
        JDOMNodePointer pointer = new JDOMNodePointer(text, Locale.US);
        pointer.setValue("");
        assertTrue(parent.getContent().isEmpty());
    }

    @Test
    public void testSetValue_TextNodeWithNullRemoves() {
        Element parent = new Element("parent");
        Text text = new Text("old");
        parent.addContent(text);
        JDOMNodePointer pointer = new JDOMNodePointer(text, Locale.US);
        pointer.setValue(null);
        assertTrue(parent.getContent().isEmpty());
    }

    @Test
    public void testSetValue_ElementWithStringValue() {
        Element element = new Element("test");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        pointer.setValue("hello");
        assertEquals("hello", element.getTextTrim());
    }

    @Test
    public void testSetValue_ElementWithEmptyString() {
        Element element = new Element("test");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        pointer.setValue("");
        assertTrue(element.getContent().isEmpty());
    }

    @Test
    public void testSetValue_ElementWithElementValue() {
        Element element = new Element("test");
        Element valueElement = new Element("inner");
        valueElement.setText("value");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        pointer.setValue(valueElement);
        List content = element.getContent();
        assertEquals(1, content.size());
        assertTrue(content.get(0) instanceof Element);
        assertEquals("inner", ((Element) content.get(0)).getName());
    }

    @Test
    public void testSetValue_ElementWithTextValue() {
        Element element = new Element("test");
        Text value = new Text("text");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        pointer.setValue(value);
        List content = element.getContent();
        assertEquals(1, content.size());
        assertTrue(content.get(0) instanceof Text);
        assertEquals("text", ((Text) content.get(0)).getText());
    }

    @Test
    public void testSetValue_ElementWithCDATAValue() {
        Element element = new Element("test");
        CDATA value = new CDATA("cdata text");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        pointer.setValue(value);
        List content = element.getContent();
        assertEquals(1, content.size());
        assertTrue(content.get(0) instanceof Text);
        assertEquals("cdata text", ((Text) content.get(0)).getText());
    }

    @Test
    public void testSetValue_ElementWithProcessingInstructionValue() {
        Element element = new Element("test");
        ProcessingInstruction value = new ProcessingInstruction("target", "data");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        pointer.setValue(value);
        List content = element.getContent();
        assertEquals(1, content.size());
        assertTrue(content.get(0) instanceof ProcessingInstruction);
        assertEquals("target", ((ProcessingInstruction) content.get(0)).getTarget());
    }

    @Test
    public void testSetValue_ElementWithCommentValue() {
        Element element = new Element("test");
        Comment value = new Comment("comment");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        pointer.setValue(value);
        List content = element.getContent();
        assertEquals(1, content.size());
        assertTrue(content.get(0) instanceof Comment);
        assertEquals("comment", ((Comment) content.get(0)).getText());
    }

    @Test
    public void testTestNode_NullTest() {
        assertTrue(JDOMNodePointer.testNode(null, rootElement, null));
    }

    @Test
    public void testTestNode_NodeNameTestNonElement() {
        Text text = new Text("test");
        NodeNameTest test = new NodeNameTest(new QName("test"));
        assertFalse(JDOMNodePointer.testNode(rootPointer, text, test));
    }

    @Test
    public void testTestNode_NodeNameTestWildcardNoPrefix() {
        NodeNameTest test = new NodeNameTest(new QName(null, "*"), true, null);
        assertTrue(JDOMNodePointer.testNode(rootPointer, rootElement, test));
    }

    @Test
    public void testTestNode_NodeNameTestWildcardWithPrefix() {
        NodeNameTest test = new NodeNameTest(new QName("pre", "*"), true, "http://pre.com");
        assertTrue(JDOMNodePointer.testNode(rootPointer, rootElement, test));
    }

    @Test
    public void testTestNode_NodeNameTestExactMatch() {
        NodeNameTest test = new NodeNameTest(new QName("root"), "http://www.w3.org/XML/1998/namespace");
        assertFalse(JDOMNodePointer.testNode(rootPointer, rootElement, test));
    }

    @Test
    public void testTestNode_NodeTypeTestNode() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(JDOMNodePointer.testNode(rootPointer, rootElement, test));
        assertTrue(JDOMNodePointer.testNode(rootPointer, new Document(), test));
        assertFalse(JDOMNodePointer.testNode(rootPointer, new Text("test"), test));
    }

    @Test
    public void testTestNode_NodeTypeTestText() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(JDOMNodePointer.testNode(rootPointer, new Text("test"), test));
        assertTrue(JDOMNodePointer.testNode(rootPointer, new CDATA("test"), test));
        assertFalse(JDOMNodePointer.testNode(rootPointer, rootElement, test));
    }

    @Test
    public void testTestNode_NodeTypeTestComment() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(JDOMNodePointer.testNode(rootPointer, new Comment("test"), test));
        assertFalse(JDOMNodePointer.testNode(rootPointer, rootElement, test));
    }

    @Test
    public void testTestNode_NodeTypeTestPI() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(JDOMNodePointer.testNode(rootPointer, new ProcessingInstruction("target", "data"), test));
        assertFalse(JDOMNodePointer.testNode(rootPointer, rootElement, test));
    }

    @Test
    public void testTestNode_NodeTypeTestUnknownType() {
        NodeTypeTest test = new NodeTypeTest(999);
        assertFalse(JDOMNodePointer.testNode(rootPointer, rootElement, test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTestMatch() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(JDOMNodePointer.testNode(rootPointer, pi, test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTestNoMatch() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        ProcessingInstructionTest test = new ProcessingInstructionTest("other");
        assertFalse(JDOMNodePointer.testNode(rootPointer, pi, test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTestNonPI() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertFalse(JDOMNodePointer.testNode(rootPointer, rootElement, test));
    }

    @Test
    public void testEqualStrings_BothNull() {
        assertTrue(JDOMNodePointer.testNode(rootPointer, rootElement, null));
    }

    @Test
    public void testGetPrefix_Element() {
        Element element = new Element("child", Namespace.getNamespace("pre", "http://pre.com"));
        assertEquals("pre", JDOMNodePointer.getPrefix(element));
    }

    @Test
    public void testGetPrefix_ElementNoPrefix() {
        Element element = new Element("child");
        assertNull(JDOMNodePointer.getPrefix(element));
    }

    @Test
    public void testGetPrefix_Attribute() {
        Attribute attr = new Attribute("name", "value", Namespace.getNamespace("pre", "http://pre.com"));
        assertEquals("pre", JDOMNodePointer.getPrefix(attr));
    }

    @Test
    public void testGetPrefix_AttributeNoPrefix() {
        Attribute attr = new Attribute("name", "value");
        assertNull(JDOMNodePointer.getPrefix(attr));
    }

    @Test
    public void testGetPrefix_NonElementNonAttribute() {
        Text text = new Text("test");
        assertNull(JDOMNodePointer.getPrefix(text));
    }

    @Test
    public void testGetLocalName_Element() {
        Element element = new Element("child");
        assertEquals("child", JDOMNodePointer.getLocalName(element));
    }

    @Test
    public void testGetLocalName_Attribute() {
        Attribute attr = new Attribute("name", "value");
        assertEquals("name", JDOMNodePointer.getLocalName(attr));
    }

    @Test
    public void testGetLocalName_NonElementNonAttribute() {
        Text text = new Text("test");
        assertNull(JDOMNodePointer.getLocalName(text));
    }

    @Test
    public void testIsLanguage_Match() {
        Element element = new Element("test");
        element.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguage_NoMatch() {
        Element element = new Element("test");
        element.setAttribute("lang", "fr", Namespace.XML_NAMESPACE);
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        assertFalse(pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguage_NoLanguageAttrFallsBack() {
        Element element = new Element("test");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        assertFalse(pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguage_CaseInsensitive() {
        Element element = new Element("test");
        element.setAttribute("lang", "EN-US", Namespace.XML_NAMESPACE);
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testRemove_RemovesFromParent() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.addContent(child);
        JDOMNodePointer pointer = new JDOMNodePointer(child, Locale.US);
        pointer.remove();
        assertTrue(parent.getContent().isEmpty());
    }

    @Test(expected = JXPathException.class)
    public void testRemove_RootNodeThrows() {
        JDOMNodePointer pointer = new JDOMNodePointer(rootElement, Locale.US);
        pointer.remove();
    }

    @Test
    public void testAsPath_WithId() {
        JDOMNodePointer pointer = new JDOMNodePointer(rootElement, Locale.US, "myId");
        String path = pointer.asPath();
        assertTrue(path.startsWith("id('"));
        assertTrue(path.endsWith("')"));
    }

    @Test
    public void testAsPath_ElementNoParent() {
        JDOMNodePointer pointer = new JDOMNodePointer(rootElement, Locale.US);
        assertEquals("/root[1]", pointer.asPath());
    }

    @Test
    public void testHashCode() {
        int hc = rootPointer.hashCode();
        assertEquals(System.identityHashCode(rootElement), hc);
    }

    @Test
    public void testEquals_SameObject() {
        assertTrue(rootPointer.equals(rootPointer));
    }

    @Test
    public void testEquals_DifferentType() {
        assertFalse(rootPointer.equals("string"));
    }

    @Test
    public void testEquals_DifferentNode() {
        JDOMNodePointer other = new JDOMNodePointer(new Element("other"), Locale.US);
        assertFalse(rootPointer.equals(other));
    }

    @Test
    public void testEquals_SameNode() {
        JDOMNodePointer other = new JDOMNodePointer(rootElement, Locale.US);
        assertTrue(rootPointer.equals(other));
    }

    @Test
    public void testGetBaseValue() {
        assertSame(rootElement, rootPointer.getBaseValue());
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
    public void testGetImmediateNode() {
        assertSame(rootElement, rootPointer.getImmediateNode());
    }

    @Test
    public void testConstructorWithParent() {
        JDOMNodePointer parent = new JDOMNodePointer(new Element("parent"), Locale.US);
        JDOMNodePointer child = new JDOMNodePointer(parent, rootElement);
        assertSame(parent, child.getParent());
    }

    @Test
    public void testConstructorWithId() {
        JDOMNodePointer pointer = new JDOMNodePointer(rootElement, Locale.US, "testId");
        assertNotNull(pointer);
    }
}