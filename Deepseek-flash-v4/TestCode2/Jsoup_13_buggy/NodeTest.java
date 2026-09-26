ต้องเป็น Java code only

เราจะส่ง output ตามนี้package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.util.List;

public class NodeTest {

    static class TestNode extends Node {
        public TestNode(String baseUri, Attributes attributes) {
            super(baseUri, attributes);
        }
        public TestNode(String baseUri) {
            super(baseUri);
        }
        public TestNode() {
            super();
        }
        @Override
        public String nodeName() { return "test"; }
        @Override
        public void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) {}
        @Override
        public void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) {}
    }

    private Attributes attrs;
    private TestNode node;
    private TestNode parent;

    @Before
    public void setUp() {
        attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("href", "http://example.com");
        node = new TestNode("http://base.com/", attrs);
        parent = new TestNode("http://parent.com/");
        parent.addChildren(node);
    }

    @Test
    public void testAttrNullKeyThrows() {
        try {
            node.attr((String) null);
            fail();
        } catch (IllegalArgumentException e) { /* expected */ }
    }

    @Test
    public void testAttrExistingKey() {
        assertEquals("value1", node.attr("key1"));
    }

    @Test
    public void testAttrNonExistingKeyReturnsEmpty() {
        assertEquals("", node.attr("nonexist"));
    }

    @Test
    public void testAttrAbsPrefixDelegatesToAbsUrl() {
        assertEquals("http://example.com", node.attr("abs:href"));
    }

    @Test
    public void testAttrSetAttributeReturnsThisAndUpdates() {
        Node result = node.attr("newKey", "newValue");
        assertSame(node, result);
        assertEquals("newValue", node.attr("newKey"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttrNullKeyThrows() {
        node.hasAttr(null);
    }

    @Test
    public void testHasAttrExisting() {
        assertTrue(node.hasAttr("key1"));
    }

    @Test
    public void testHasAttrNonExisting() {
        assertFalse(node.hasAttr("nonexist"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttrNullKeyThrows() {
        node.removeAttr(null);
    }

    @Test
    public void testRemoveAttrRemovesAttribute() {
        node.removeAttr("key1");
        assertFalse(node.hasAttr("key1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseUriNullThrows() {
        node.setBaseUri(null);
    }

    @Test
    public void testBaseUriGetAndSet() {
        assertEquals("http://base.com/", node.baseUri());
        node.setBaseUri("http://new.com/");
        assertEquals("http://new.com/", node.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrlNullKeyThrows() {
        node.absUrl(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrlEmptyKeyThrows() {
        node.absUrl("");
    }

    @Test
    public void testAbsUrlNonExistingAttrReturnsEmpty() {
        TestNode n = new TestNode("http://base.com/", new Attributes());
        assertEquals("", n.absUrl("missing"));
    }

    @Test
    public void testAbsUrlBaseMalformedRelUrlAbsoluteReturnsAbs() {
        TestNode n = new TestNode("invalid base", new Attributes());
        n.attr("href", "http://absolute.com/path");
        assertEquals("http://absolute.com/path", n.absUrl("href"));
    }

    @Test
    public void testAbsUrlBaseMalformedRelUrlMalformedReturnsEmpty() {
        TestNode n = new TestNode("invalid base", new Attributes());
        n.attr("href", "invalid relative");
        assertEquals("", n.absUrl("href"));
    }

    @Test
    public void testAbsUrlRelUrlStartsWithQuestionPrependsBasePath() {
        TestNode n = new TestNode("http://example.com/dir/page.html", new Attributes());
        n.attr("href", "?query=value");
        assertEquals("http://example.com/dir/page.html?query=value", n.absUrl("href"));
    }

    @Test
    public void testAbsUrlNormal() {
        TestNode n = new TestNode("http://example.com/dir/", new Attributes());
        n.attr("href", "page.html");
        assertEquals("http://example.com/dir/page.html", n.absUrl("href"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNodeIndexOutOfBounds() {
        node.childNode(0);
    }

    @Test
    public void testChildNodeNormal() {
        TestNode child = new TestNode("http://child.com/");
        node.addChildren(child);
        assertSame(child, node.childNode(0));
    }

    @Test
    public void testChildNodesEmpty() {
        assertTrue(node.childNodes().isEmpty());
    }

    @Test
    public void testChildNodesWithChildren() {
        TestNode child = new TestNode("http://child.com/");
        node.addChildren(child);
        List<Node> children = node.childNodes();
        assertEquals(1, children.size());
        assertSame(child, children.get(0));
        try {
            children.add(new TestNode());
            fail();
        } catch (UnsupportedOperationException e) { /* expected */ }
    }

    @Test
    public void testParentRootNull() {
        TestNode root = new TestNode("http://root.com/");
        assertNull(root.parent());
    }

    @Test
    public void testParentSet() {
        assertSame(parent, node.parent());
    }

    @Test
    public void testOwnerDocumentWhenThisIsDocument() {
        Document doc = new Document("http://doc.com/");
        assertSame(doc, doc.ownerDocument());
    }

    @Test
    public void testOwnerDocumentNoParent() {
        TestNode orphan = new TestNode("http://orphan.com/");
        assertNull(orphan.ownerDocument());
    }

    @Test
    public void testOwnerDocumentThroughParent() {
        Document doc = new Document("http://doc.com/");
        TestNode child = new TestNode("http://child.com/");
        doc.addChildren(child);
        assertSame(doc, child.ownerDocument());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveNoParentThrows() {
        TestNode orphan = new TestNode();
        orphan.remove();
    }

    @Test
    public void testRemoveFromParent() {
        TestNode child = new TestNode("http://child.com/");
        parent.addChildren(child);
        child.remove();
        assertNull(child.parent());
        assertFalse(parent.childNodes().contains(child));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeNullHtmlThrows() {
        node.before((String) null);
    }

    @Test
    public void testBeforeHtml() {
        int origSize = parent.childNodes().size();
        node.before("<p>beforetext</p>");
        assertTrue(parent.childNodes().size() > origSize);
        assertNotNull(parent.childNode(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeNullNodeThrows() {
        node.before((Node) null);
    }

    @Test
    public void testBeforeNode() {
        TestNode newNode = new TestNode("http://new.com/");
        node.before(newNode);
        assertEquals(node.siblingIndex() - 1, newNode.siblingIndex());
        assertSame(parent, newNode.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAfterNullHtmlThrows() {
        node.after((String) null);
    }

    @Test
    public void testAfterHtml() {
        int origSize = parent.childNodes().size();
        node.after("<p>aftertext</p>");
        assertTrue(parent.childNodes().size() > origSize);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAfterNullNodeThrows() {
        node.after((Node) null);
    }

    @Test
    public void testAfterNode() {
        TestNode newNode = new TestNode("http://after.com/");
        node.after(newNode);
        assertEquals(node.siblingIndex() + 1, newNode.siblingIndex());
        assertSame(parent, newNode.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrapEmptyHtmlThrows() {
        node.wrap("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrapNullHtmlThrows() {
        node.wrap(null);
    }

    @Test
    public void testWrapNoWrapNodeReturnsNull() {
        Node result = node.wrap("some text");
        assertNull(result);
    }

    @Test
    public void testWrapNormal() {
        Node result = node.wrap("<div></div>");
        assertSame(node, result);
        assertFalse(parent.childNodes().contains(node));
        Element div = (Element) parent.childNode(0);
        assertEquals("div", div.nodeName());
        assertSame(node, div.childNode(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWithNullThrows() {
        node.replaceWith(null);
    }

    @Test
    public void testReplaceWithNormal() {
        TestNode replacement = new TestNode("http://replacement.com/");
        node.replaceWith(replacement);
        assertSame(parent, replacement.parent());
        assertTrue(parent.childNodes().contains(replacement));
        assertFalse(parent.childNodes().contains(node));
        assertNull(node.parent());
    }

    @Test
    public void testCloneDeepCopy() {
        TestNode child = new TestNode("http://child.com/");
        child.attr("class", "test");
        node.addChildren(child);
        Node clone = node.clone();
        assertNotSame(node, clone);
        assertNull(clone.parent());
        assertNotNull(clone.attributes());
        assertNotSame(node.attributes(), clone.attributes());
        assertEquals(1, clone.childNodes().size());
        Node clonedChild = clone.childNode(0);
        assertNotSame(child, clonedChild);
        assertSame(clone, clonedChild.parent());
        assertEquals("test", clonedChild.attr("class"));
    }

    @Test
    public void testCloneWithNullAttributes() {
        TestNode n = new TestNode();
        Node clone = n.clone();
        assertNull(clone.attributes());
    }

    @Test
    public void testEqualsSameRefTrue() {
        assertTrue(node.equals(node));
    }

    @Test
    public void testEqualsDifferentRefFalse() {
        assertFalse(node.equals(new TestNode()));
    }

    @Test
    public void testSiblingIndex() {
        TestNode a = new TestNode();
        TestNode b = new TestNode();
        TestNode c = new TestNode();
        parent.addChildren(a, b, c);
        assertEquals(0, a.siblingIndex());
        assertEquals(1, b.siblingIndex());
        assertEquals(2, c.siblingIndex());
    }

    @Test
    public void testNextSiblingLastReturnsNull() {
        TestNode a = new TestNode();
        TestNode b = new TestNode();
        parent.addChildren(a, b);
        assertNull(b.nextSibling());
    }

    @Test
    public void testNextSiblingNormal() {
        TestNode a = new TestNode();
        TestNode b = new TestNode();
        parent.addChildren(a, b);
        assertSame(b, a.nextSibling());
    }

    @Test
    public void testPreviousSiblingFirstReturnsNull() {
        TestNode a = new TestNode();
        parent.addChildren(a);
        assertNull(a.previousSibling());
    }

    @Test
    public void testPreviousSiblingNormal() {
        TestNode a = new TestNode();
        TestNode b = new TestNode();
        parent.addChildren(a, b);
        assertSame(a, b.previousSibling());
    }

    @Test
    public void testNextSiblingNoParentReturnsNull() {
        TestNode orphan = new TestNode();
        assertNull(orphan.nextSibling());
    }

    @Test
    public void testPreviousSiblingNoParentReturnsNull() {
        TestNode orphan = new TestNode();
        assertNull(orphan.previousSibling());
    }

    @Test
    public void testSiblingNodes() {
        TestNode a = new TestNode();
        TestNode b = new TestNode();
        parent.addChildren(a, b);
        List<Node> siblings = a.siblingNodes();
        assertTrue(siblings.contains(a));
        assertTrue(siblings.contains(b));
    }

    @Test
    public void testAddChildrenWithIndexEmptyArray() {
        int sizeBefore = parent.childNodes().size();
        parent.addChildren(0);
        assertEquals(sizeBefore, parent.childNodes().size());
    }

    @Test
    public void testReparentChildWhenAlreadyHasParent() {
        TestNode child = new TestNode();
        TestNode firstParent = new TestNode();
        firstParent.addChildren(child);
        assertSame(firstParent, child.parent());
        parent.addChildren(child);
        assertSame(parent, child.parent());
        assertFalse(firstParent.childNodes().contains(child));
    }
}