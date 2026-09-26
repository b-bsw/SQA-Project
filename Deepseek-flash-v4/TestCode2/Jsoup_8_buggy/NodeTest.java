package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class NodeTest {
    private TestNode node;
    private Attributes attrs;
    private Document doc;

    static class TestNode extends Node {
        private final String name;
        private final Document ownerDoc;

        TestNode(String baseUri, Attributes attributes, String nodeName, Document doc) {
            super(baseUri, attributes);
            this.name = nodeName;
            this.ownerDoc = doc;
        }

        TestNode(String baseUri, String nodeName, Document doc) {
            this(baseUri, new Attributes(), nodeName, doc);
        }

        @Override
        public String nodeName() { return name; }

        @Override
        void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("<").append(name).append(">");
        }

        @Override
        void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("</").append(name).append(">");
        }

        @Override
        public Document ownerDocument() {
            return ownerDoc;
        }
    }

    @Before
    public void setUp() throws Exception {
        doc = new Document("http://example.com");
        attrs = new Attributes();
        attrs.put("href", "http://example.com/page");
        attrs.put("id", "main");
        node = new TestNode("http://base.com", attrs, "a", doc);
    }

    // --- constructor, attributes ---
    @Test
    public void testConstructorInitializesFields() {
        assertEquals("http://base.com", node.baseUri());
        assertNotNull(node.attributes());
        assertTrue(node.childNodes().isEmpty());
        assertNull(node.parent());
        assertEquals(Integer.valueOf(0), node.siblingIndex()); // default 0
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullBaseUri() {
        new TestNode(null, "x", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullAttributes() {
        new TestNode("http://a", (Attributes)null, "x", doc);
    }

    // --- attr(String) ---
    @Test
    public void testAttrGetExisting() {
        assertEquals("http://example.com/page", node.attr("href"));
    }

    @Test
    public void testAttrGetMissing() {
        assertEquals("", node.attr("nonexistent"));
    }

    @Test
    public void testAttrGetAbsPrefix() {
        // "abs:" prefix should delegate to absUrl
        node.attr("href", "relative");
        String result = node.attr("abs:href");
        assertTrue(result.startsWith("http://base.com/"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttrGetNullKey() {
        node.attr((String)null);
    }

    // --- attr(String, String) ---
    @Test
    public void testAttrSetAndOverride() {
        node.attr("newkey", "value1");
        assertEquals("value1", node.attr("newkey"));
        node.attr("newkey", "value2");
        assertEquals("value2", node.attr("newkey"));
    }

    // --- hasAttr ---
    @Test
    public void testHasAttrTrue() {
        assertTrue(node.hasAttr("id"));
    }

    @Test
    public void testHasAttrFalse() {
        assertFalse(node.hasAttr("missing"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttrNullKey() {
        node.hasAttr(null);
    }

    // --- removeAttr ---
    @Test
    public void testRemoveAttr() {
        node.removeAttr("id");
        assertFalse(node.hasAttr("id"));
    }

    // --- baseUri ---
    @Test
    public void testSetBaseUri() {
        node.setBaseUri("http://newbase.com");
        assertEquals("http://newbase.com", node.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseUriNull() {
        node.setBaseUri(null);
    }

    // --- absUrl ---
    @Test
    public void testAbsUrlWithRelativeUrl() {
        node.attr("img", "pic.jpg");
        String abs = node.absUrl("img");
        assertEquals("http://base.com/pic.jpg", abs);
    }

    @Test
    public void testAbsUrlWithAbsoluteUrl() {
        node.attr("img", "http://other.com/pic.jpg");
        String abs = node.absUrl("img");
        assertEquals("http://other.com/pic.jpg", abs);
    }

    @Test
    public void testAbsUrlMissingAttribute() {
        assertEquals("", node.absUrl("missing"));
    }

    @Test
    public void testAbsUrlInvalidBaseIsUsedAsIs() {
        TestNode badNode = new TestNode("not a valid url", "a", doc);
        badNode.attr("href", "http://valid.com/path");
        assertEquals("http://valid.com/path", badNode.absUrl("href"));
    }

    @Test
    public void testAbsUrlBothInvalidReturnsEmpty() {
        TestNode badNode = new TestNode("not a valid url", "a", doc);
        badNode.attr("href", "also invalid");
        assertEquals("", badNode.absUrl("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrlEmptyKeyThrows() {
        node.absUrl("");
    }

    // --- childNode, childNodes ---
    @Test
    public void testChildNodeAccess() {
        TestNode child = new TestNode("http://child", "span", doc);
        node.addChildren(child);
        assertSame(child, node.childNode(0));
        assertEquals(1, node.childNodes().size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNodeInvalidIndex() {
        node.childNode(0); // empty list
    }

    // --- parent ---
    @Test
    public void testParent() {
        TestNode child = new TestNode("http://child", "span", doc);
        node.addChildren(child);
        assertSame(node, child.parent());
    }

    // --- ownerDocument ---
    @Test
    public void testOwnerDocumentReturnsDoc() {
        assertSame(doc, node.ownerDocument());
    }

    @Test
    public void testOwnerDocumentOnOrphan() {
        TestNode orphan = new TestNode("http://orphan", "x", null);
        assertNull(orphan.ownerDocument());
    }

    @Test
    public void testOwnerDocumentViaParent() {
        TestNode child = new TestNode("http://child", "span", null);
        node.addChildren(child);
        // child has no ownerDoc but parent node.doc is set
        assertSame(doc, child.ownerDocument());
    }

    // --- siblingNodes, nextSibling, previousSibling ---
    @Test
    public void testSiblingRelationships() {
        TestNode parent = new TestNode("http://p", "div", doc);
        TestNode sib1 = new TestNode("http://sib1", "a", doc);
        TestNode sib2 = new TestNode("http://sib2", "b", doc);
        parent.addChildren(sib1, sib2);
        List<Node> siblings = parent.childNodes();
        assertTrue(sib1.siblingNodes().contains(sib1));
        assertTrue(sib1.siblingNodes().contains(sib2));
        assertSame(sib2, sib1.nextSibling());
        assertNull(sib2.nextSibling());
        assertNull(sib1.previousSibling());
        assertSame(sib1, sib2.previousSibling());
    }

    // --- remove ---
    @Test
    public void testRemoveChildFromParent() {
        TestNode parent = new TestNode("http://p", "div", doc);
        TestNode child = new TestNode("http://c", "span", doc);
        parent.addChildren(child);
        assertTrue(parent.childNodes().contains(child));
        child.remove();
        assertFalse(parent.childNodes().contains(child));
        assertNull(child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveNodeWithNoParent() {
        node.remove();
    }

    // --- replaceWith ---
    @Test
    public void testReplaceWith() {
        TestNode parent = new TestNode("http://p", "div", doc);
        TestNode old = new TestNode("http://old", "a", doc);
        TestNode replacement = new TestNode("http://new", "b", doc);
        parent.addChildren(old);
        old.replaceWith(replacement);
        assertSame(replacement, parent.childNode(0));
        assertNull(old.parent());
        assertSame(parent, replacement.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWithNull() {
        node.replaceWith(null);
    }

    // --- protected replaceChild, removeChild ---
    @Test
    public void testReplaceChild() {
        TestNode parent = new TestNode("http://p", "div", doc);
        TestNode old = new TestNode("http://old", "a", doc);
        TestNode replacement = new TestNode("http://new", "b", doc);
        parent.addChildren(old);
        parent.replaceChild(old, replacement);
        assertSame(replacement, parent.childNode(0));
        assertNull(old.parent());
        assertSame(parent, replacement.parent());
    }

    @Test
    public void testRemoveChild() {
        TestNode parent = new TestNode("http://p", "div", doc);
        TestNode child = new TestNode("http://c", "span", doc);
        parent.addChildren(child);
        parent.removeChild(child);
        assertTrue(parent.childNodes().isEmpty());
        assertNull(child.parent());
    }

    // --- addChildren (varargs) ---
    @Test
    public void testAddChildren() {
        TestNode child1 = new TestNode("http://c1", "span", doc);
        TestNode child2 = new TestNode("http://c2", "div", doc);
        node.addChildren(child1, child2);
        assertEquals(2, node.childNodes().size());
        assertSame(child1, node.childNode(0));
        assertSame(child2, node.childNode(1));
        assertSame(node, child1.parent());
        assertSame(node, child2.parent());
    }

    @Test
    public void testAddChildrenAtIndex() {
        TestNode child1 = new TestNode("http://c1", "span", doc);
        TestNode child2 = new TestNode("http://c2", "div", doc);
        TestNode child3 = new TestNode("http://c3", "p", doc);
        node.addChildren(child1, child2);
        node.addChildren(1, child3);
        assertSame(child1, node.childNode(0));
        assertSame(child3, node.childNode(1));
        assertSame(child2, node.childNode(2));
    }

    // --- setParentNode ---
    @Test
    public void testSetParentNodeRemovesFromOldParent() {
        TestNode parent1 = new TestNode("http://p1", "div", doc);
        TestNode parent2 = new TestNode("http://p2", "div", doc);
        TestNode child = new TestNode("http://c", "span", doc);
        parent1.addChildren(child);
        child.setParentNode(parent2);
        assertTrue(parent1.childNodes().isEmpty());
        assertSame(parent2, child.parent());
    }

    // --- outerHtml ---
    @Test
    public void testOuterHtml() {
        node.setBaseUri("http://test");
        node.attr("class", "myclass");
        String html = node.outerHtml();
        assertTrue(html.startsWith("<a>"));
        assertTrue(html.endsWith("</a>"));
    }

    // --- equals/hashCode ---
    @Test
    public void testEqualsSameObject() {
        assertTrue(node.equals(node));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(node.equals(null));
    }

    @Test
    public void testEqualsDifferentObject() {
        TestNode other = new TestNode("http://other", "a", doc);
        assertFalse(node.equals(other));
    }

    @Test
    public void testHashCode() {
        // hash code based on parentNode and attributes
        assertNotNull(Integer.valueOf(node.hashCode()));
    }
}