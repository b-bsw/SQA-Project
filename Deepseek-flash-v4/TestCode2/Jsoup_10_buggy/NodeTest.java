package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.List;

public class NodeTest {

    static class TestNode extends Node {
        TestNode(String baseUri, Attributes attributes) { super(baseUri, attributes); }
        TestNode(String baseUri) { super(baseUri); }
        TestNode() { super(); }
        @Override public String nodeName() { return "test"; }
        @Override void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) { }
        @Override void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) { }
    }

    private TestNode node;
    private Attributes attrs;

    @Before
    public void setUp() {
        attrs = new Attributes();
        attrs.put("key1", "val1");
        node = new TestNode("http://example.com", attrs);
    }

    @Test
    public void testConstructorNormal() {
        assertEquals("http://example.com", node.baseUri());
        assertSame(attrs, node.attributes());
        assertTrue(node.childNodes().isEmpty());
    }

    @Test
    public void testConstructorSingleArg() {
        TestNode n = new TestNode("http://base/");
        assertEquals("http://base/", n.baseUri());
        assertNotNull(n.attributes());
        assertTrue(n.childNodes().isEmpty());
    }

    @Test
    public void testDefaultConstructor() {
        TestNode n = new TestNode();
        assertNull(n.attributes());
        assertTrue(n.childNodes().isEmpty());
    }

    @Test
    public void testAttrExisting() {
        assertEquals("val1", node.attr("key1"));
    }

    @Test
    public void testAttrNotExisting() {
        assertEquals("", node.attr("nokey"));
    }

    @Test
    public void testAttrAbsPrefix() {
        assertEquals("", node.attr("abs:href"));
        node.attr("href", "/path");
        assertEquals("http://example.com/path", node.attr("abs:href"));
    }

    @Test(expected = NullPointerException.class)
    public void testAttrNullKey() {
        node.attr((String) null);
    }

    @Test
    public void testHasAttrTrue() {
        assertTrue(node.hasAttr("key1"));
    }

    @Test
    public void testHasAttrFalse() {
        assertFalse(node.hasAttr("missing"));
    }

    @Test(expected = NullPointerException.class)
    public void testHasAttrNull() {
        node.hasAttr(null);
    }

    @Test
    public void testRemoveAttr() {
        assertSame(node, node.removeAttr("key1"));
        assertFalse(node.hasAttr("key1"));
    }

    @Test
    public void testSetBaseUri() {
        node.setBaseUri("http://newbase/");
        assertEquals("http://newbase/", node.baseUri());
    }

    @Test(expected = NullPointerException.class)
    public void testSetBaseUriNull() {
        node.setBaseUri(null);
    }

    @Test
    public void testAbsUrlMissingAttr() {
        assertEquals("", node.absUrl("missing"));
    }

    @Test
    public void testAbsUrlRelative() {
        node.attr("href", "/path");
        assertEquals("http://example.com/path", node.absUrl("href"));
    }

    @Test
    public void testAbsUrlAbsoluteAttr() {
        node.attr("href", "http://other.com/page");
        assertEquals("http://other.com/page", node.absUrl("href"));
    }

    @Test
    public void testAbsUrlMalformedBaseRelative() {
        node.setBaseUri("invalid url");
        node.attr("href", "/path");
        assertEquals("", node.absUrl("href"));
    }

    @Test
    public void testAbsUrlMalformedBaseAbsoluteAttr() {
        node.setBaseUri("invalid");
        node.attr("href", "http://valid.com/");
        assertEquals("http://valid.com/", node.absUrl("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrlEmptyKey() {
        node.absUrl("");
    }

    @Test
    public void testChildren() {
        assertTrue(node.childNodes().isEmpty());
        TestNode child1 = new TestNode("child1");
        TestNode child2 = new TestNode("child2");
        node.addChildren(child1, child2);
        assertEquals(2, node.childNodes().size());
        assertSame(child1, node.childNode(0));
        assertSame(child2, node.childNode(1));
        assertEquals(0, child1.siblingIndex().intValue());
        assertEquals(1, child2.siblingIndex().intValue());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNodeOutOfBounds() {
        node.childNode(0);
    }

    @Test
    public void testChildNodesArray() {
        TestNode child = new TestNode("child");
        node.addChildren(child);
        Node[] arr = node.childNodesAsArray();
        assertEquals(1, arr.length);
        assertSame(child, arr[0]);
    }

    @Test
    public void testParentInitiallyNull() {
        assertNull(node.parent());
    }

    @Test
    public void testParentAfterAddChild() {
        TestNode parent = new TestNode("parent");
        parent.addChildren(node);
        assertSame(parent, node.parent());
    }

    @Test
    public void testOwnerDocumentSelfIfDocument() {
        Document doc = new Document("http://base");
        assertSame(doc, doc.ownerDocument());
    }

    @Test
    public void testOwnerDocumentNullWhenNoParent() {
        assertNull(node.ownerDocument());
    }

    @Test
    public void testOwnerDocumentThroughParent() {
        Document doc = new Document("http://base");
        doc.addChildren(node);
        assertSame(doc, node.ownerDocument());
    }

    @Test
    public void testRemove() {
        TestNode parent = new TestNode("parent");
        parent.addChildren(node);
        assertEquals(1, parent.childNodes().size());
        node.remove();
        assertNull(node.parent());
        assertTrue(parent.childNodes().isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveNoParent() {
        node.remove();
    }

    @Test
    public void testReplaceWith() {
        TestNode parent = new TestNode("parent");
        parent.addChildren(node);
        TestNode replacement = new TestNode("replacement");
        node.replaceWith(replacement);
        assertSame(replacement, parent.childNode(0));
        assertNull(node.parent());
        assertSame(parent, replacement.parent());
    }

    @Test(expected = NullPointerException.class)
    public void testReplaceWithNullIn() {
        node.replaceWith(null);
    }

    @Test
    public void testSiblingNodesWhenRoot() {
        try {
            node.siblingNodes();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testSiblingNodes() {
        TestNode parent = new TestNode("parent");
        TestNode child1 = new TestNode("c1");
        TestNode child2 = new TestNode("c2");
        parent.addChildren(child1, child2);
        List<Node> sibs = child1.siblingNodes();
        assertEquals(2, sibs.size());
        assertSame(child1, sibs.get(0));
        assertSame(child2, sibs.get(1));
    }

    @Test
    public void testNextSibling() {
        TestNode parent = new TestNode("parent");
        TestNode c0 = new TestNode("c0");
        TestNode c1 = new TestNode("c1");
        parent.addChildren(c0, c1);
        assertSame(c1, c0.nextSibling());
        assertNull(c1.nextSibling());
    }

    @Test
    public void testPreviousSibling() {
        TestNode parent = new TestNode("parent");
        TestNode c0 = new TestNode("c0");
        TestNode c1 = new TestNode("c1");
        parent.addChildren(c0, c1);
        assertNull(c0.previousSibling());
        assertSame(c0, c1.previousSibling());
    }

    @Test
    public void testNextSiblingNoParent() {
        assertNull(node.nextSibling());
    }

    @Test
    public void testPreviousSiblingNoParent() {
        assertNull(node.previousSibling());
    }

    @Test
    public void testSiblingIndex() {
        TestNode parent = new TestNode("parent");
        parent.addChildren(new TestNode("c0"), new TestNode("c1"));
        assertEquals(0, parent.childNode(0).siblingIndex().intValue());
        assertEquals(1, parent.childNode(1).siblingIndex().intValue());
    }

    @Test
    public void testOuterHtmlNoContent() {
        assertEquals("", node.outerHtml());
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(node.equals(node));
    }

    @Test
    public void testEqualsDifferent() {
        TestNode n2 = new TestNode("http://other", new Attributes());
        assertFalse(node.equals(n2));
    }

    @Test
    public void testCloneDeep() {
        TestNode child = new TestNode("child");
        node.addChildren(child);
        Node clone = node.clone();
        assertNotSame(node, clone);
        assertNotSame(node.childNode(0), clone.childNode(0));
        assertEquals(node.baseUri(), clone.baseUri());
        assertNotSame(node.attributes(), clone.attributes());
        assertNull(clone.parent());
        assertEquals(0, clone.siblingIndex());
        clone.attr("newattr", "val");
        assertFalse(node.hasAttr("newattr"));
    }

    @Test
    public void testAddChildrenAtIndex() {
        TestNode parent = new TestNode("p");
        TestNode c1 = new TestNode("c1");
        TestNode c2 = new TestNode("c2");
        parent.addChildren(c1, c2);
        TestNode c0 = new TestNode("c0");
        parent.addChildren(0, c0);
        assertEquals(3, parent.childNodes().size());
        assertSame(c0, parent.childNode(0));
        assertSame(c1, parent.childNode(1));
        assertSame(c2, parent.childNode(2));
        assertEquals(0, c0.siblingIndex().intValue());
        assertEquals(1, c1.siblingIndex().intValue());
        assertEquals(2, c2.siblingIndex().intValue());
    }

    @Test
    public void testReindexChildrenEmpty() {
        TestNode parent = new TestNode("p");
        parent.addChildren(new TestNode("c1"));
        parent.removeChild(parent.childNode(0));
        assertTrue(parent.childNodes().isEmpty());
        parent.addChildren(new TestNode("c2"));
        assertEquals(0, parent.childNode(0).siblingIndex().intValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceChildInvalidOut() {
        TestNode parent = new TestNode("p");
        TestNode out = new TestNode("out");
        parent.replaceChild(out, new TestNode("in"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveChildInvalidOut() {
        TestNode parent = new TestNode("p");
        TestNode out = new TestNode("out");
        parent.removeChild(out);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddChildrenWithNullElement() {
        node.addChildren(0, (Node) null);
    }
}