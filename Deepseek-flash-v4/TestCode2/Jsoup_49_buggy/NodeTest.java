package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {
    private Document doc;
    private TestNode node;
    private Attributes attrs;

    @Before
    public void setUp() {
        attrs = new Attributes();
        attrs.put("href", "http://example.com");
        attrs.put("id", "test");
        doc = new Document("http://base.com");
        node = new TestNode("http://base.com", attrs);
    }

    static class TestNode extends Node {
        TestNode(String baseUri, Attributes attributes) {
            super(baseUri, attributes);
        }

        @Override
        public String nodeName() {
            return "test";
        }

        @Override
        void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("<test>");
        }

        @Override
        void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("</test>");
        }

        public void addChild(Node child) {
            addChildren(child);
        }

        public void addChildAt(int index, Node... children) {
            addChildren(index, children);
        }
    }

    @Test
    public void testConstructorWithNullBaseUriThrows() {
        try {
            new TestNode(null, new Attributes());
            fail();
        } catch (IllegalArgumentException e) { }
    }

    @Test
    public void testConstructorWithNullAttributesThrows() {
        try {
            new TestNode("http://base", null);
            fail();
        } catch (IllegalArgumentException e) { }
    }

    @Test
    public void testAttrRetrievesExisting() {
        assertEquals("http://example.com", node.attr("href"));
    }

    @Test
    public void testAttrReturnsEmptyForMissing() {
        assertEquals("", node.attr("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttrNullKeyThrows() {
        node.attr(null);
    }

    @Test
    public void testAttrAbsUrlResolvesRelative() {
        node.attr("href", "/path");
        String result = node.attr("abs:href");
        assertTrue(result.startsWith("http://base.com") && result.contains("/path"));
    }

    @Test
    public void testAttrAbsUrlReturnsEmptyWhenMissing() {
        assertEquals("", node.attr("abs:missing"));
    }

    @Test
    public void testHasAttrTrue() {
        assertTrue(node.hasAttr("href"));
    }

    @Test
    public void testHasAttrFalse() {
        assertFalse(node.hasAttr("missing"));
    }

    @Test
    public void testHasAttrAbsPrefixWhenResolvable() {
        node.attr("href", "/path");
        assertTrue(node.hasAttr("abs:href"));
    }

    @Test
    public void testHasAttrAbsPrefixWhenNotResolvable() {
        node.removeAttr("href");
        assertFalse(node.hasAttr("abs:href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttrNullKeyThrows() {
        node.hasAttr(null);
    }

    @Test
    public void testRemoveAttrReturnsThisAndRemoves() {
        Node result = node.removeAttr("id");
        assertSame(node, result);
        assertFalse(node.hasAttr("id"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttrNullKeyThrows() {
        node.removeAttr(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrlEmptyKeyThrows() {
        node.absUrl("");
    }

    @Test
    public void testAbsUrlMissingAttributeReturnsEmpty() {
        assertEquals("", node.absUrl("nonexistent"));
    }

    @Test
    public void testAbsUrlResolvesRelative() {
        node.attr("href", "/path");
        assertEquals("http://base.com/path", node.absUrl("href"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNodeOutOfBoundsThrows() {
        node.childNode(0);
    }

    @Test
    public void testChildNodesUnmodifiable() {
        try {
            node.childNodes().add(new TestNode("", new Attributes()));
            fail();
        } catch (UnsupportedOperationException e) { }
    }

    @Test
    public void testChildNodesCopyDeepCopy() {
        TestNode child = new TestNode("child", new Attributes());
        node.addChild(child);
        List<Node> copy = node.childNodesCopy();
        assertEquals(1, copy.size());
        assertNotSame(child, copy.get(0));
    }

    @Test
    public void testChildNodeSize() {
        assertEquals(0, node.childNodeSize());
        node.addChild(new TestNode("c", new Attributes()));
        assertEquals(1, node.childNodeSize());
    }

    @Test
    public void testParentAndParentNodeInitiallyNull() {
        assertNull(node.parent());
        assertNull(node.parentNode());
    }

    @Test
    public void testOwnerDocumentWithParent() {
        node.setParentNode(doc);
        assertSame(doc, node.ownerDocument());
    }

    @Test
    public void testOwnerDocumentNullWithoutParent() {
        assertNull(node.ownerDocument());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveThrowsWhenNoParent() {
        node.remove();
    }

    @Test
    public void testRemoveRemovesFromParent() {
        doc.appendChild(node);
        assertNotNull(node.parentNode());
        node.remove();
        assertNull(node.parentNode());
        assertFalse(doc.childNodes().contains(node));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeNodeNullThrows() {
        node.before((Node) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeNodeNoParentThrows() {
        node.before(new TestNode("x", new Attributes()));
    }

    @Test
    public void testBeforeNodeInsertsSibling() {
        doc.appendChild(node);
        TestNode sib = new TestNode("sib", new Attributes());
        node.before(sib);
        assertEquals(2, doc.childNodes().size());
        assertSame(sib, doc.childNode(0));
        assertSame(node, doc.childNode(1));
    }

    @Test
    public void testAfterNodeInsertsSibling() {
        doc.appendChild(node);
        TestNode sib = new TestNode("sib", new Attributes());
        node.after(sib);
        assertEquals(2, doc.childNodes().size());
        assertSame(node, doc.childNode(0));
        assertSame(sib, doc.childNode(1));
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testBeforeHtmlParsesAndInserts() {
        doc.appendChild(node);
        node.before("<p>before</p>");
        assertEquals(2, doc.childNodes().size());
        Node first = doc.childNode(0);
        assertTrue(first instanceof Element);
        assertEquals("before", ((Element) first).text());
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testAfterHtmlParsesAndInserts() {
        doc.appendChild(node);
        node.after("<p>after</p>");
        assertEquals(2, doc.childNodes().size());
        Node last = doc.childNode(1);
        assertTrue(last instanceof Element);
        assertTrue(last.outerHtml().contains("after"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrapNullThrows() {
        node.wrap(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrapEmptyThrows() {
        node.wrap("");
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testWrapWithValidHtmlWrapsAndMovesRemainder() {
        doc.appendChild(node);
        node.wrap("<div class='wrapper'></div><p>extra</p>");
        assertEquals(1, doc.childNodes().size());
        Element wrapper = (Element) doc.childNode(0);
        assertEquals("div", wrapper.tagName());
        assertEquals(2, wrapper.childNodes().size());
        assertSame(node, wrapper.childNode(0));
        Node second = wrapper.childNode(1);
        assertTrue(second instanceof Element);
        assertEquals("p", ((Element) second).tagName());
    }

    @Test
    public void testWrapWithNoElementReturnsNull() {
        doc.appendChild(node);
        assertNull(node.wrap("just text"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnwrapThrowsWhenNoParent() {
        node.unwrap();
    }

    @Test
    public void testUnwrapMovesChildrenUpAndRemoves() {
        doc.appendChild(node);
        TestNode child = new TestNode("child", new Attributes());
        node.addChild(child);
        Node first = node.unwrap();
        assertSame(child, first);
        assertNull(node.parentNode());
        assertTrue(doc.childNodes().contains(child));
    }

    @Test
    public void testUnwrapWithNoChildrenReturnsNull() {
        doc.appendChild(node);
        assertNull(node.unwrap());
        assertFalse(doc.childNodes().contains(node));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWithNullThrows() {
        node.replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWithNoParentThrows() {
        node.replaceWith(new TestNode("r", new Attributes()));
    }

    @Test
    public void testReplaceWithReplacesNode() {
        doc.appendChild(node);
        TestNode replacement = new TestNode("rep", new Attributes());
        node.replaceWith(replacement);
        assertNull(node.parentNode());
        assertSame(replacement, doc.childNode(0));
    }

    @Test
    public void testSetBaseUriUpdatesSelfAndChildren() {
        TestNode child = new TestNode("child", new Attributes());
        node.addChild(child);
        node.setBaseUri("http://newbase.com");
        assertEquals("http://newbase.com", node.baseUri());
        assertEquals("http://newbase.com", child.baseUri());
    }

    @Test
    public void testSiblingNodesReturnsSiblingsWithoutSelf() {
        doc.appendChild(node);
        TestNode a = new TestNode("a", new Attributes());
        TestNode b = new TestNode("b", new Attributes());
        doc.appendChild(a);
        doc.appendChild(b);
        List<Node> siblings = node.siblingNodes();
        assertEquals(2, siblings.size());
        assertFalse(siblings.contains(node));
        assertTrue(siblings.contains(a));
        assertTrue(siblings.contains(b));
    }

    @Test
    public void testSiblingNodesEmptyWhenNoParent() {
        assertTrue(node.siblingNodes().isEmpty());
    }

    @Test
    public void testNextSibling() {
        doc.appendChild(node);
        TestNode after = new TestNode("after", new Attributes());
        doc.appendChild(after);
        assertSame(after, node.nextSibling());
    }

    @Test
    public void testNextSiblingNullWhenLast() {
        doc.appendChild(node);
        assertNull(node.nextSibling());
    }

    @Test
    public void testPreviousSibling() {
        TestNode before = new TestNode("before", new Attributes());
        doc.appendChild(before);
        doc.appendChild(node);
        assertSame(before, node.previousSibling());
    }

    @Test
    public void testPreviousSiblingNullWhenFirst() {
        doc.appendChild(node);
        assertNull(node.previousSibling());
    }

    @Test
    public void testSiblingIndex() {
        doc.appendChild(node);
        assertEquals(0, node.siblingIndex());
        node.before(new TestNode("x", new Attributes()));
        assertEquals(1, node.siblingIndex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTraverseNullThrows() {
        node.traverse(null);
    }

    @Test
    public void testTraverseReturnsThis() {
        assertSame(node, node.traverse(new NodeVisitor() {
            public void head(Node node, int depth) { }
            public void tail(Node node, int depth) { }
        }));
    }

    @Test
    public void testOuterHtml() {
        String html = node.outerHtml();
        assertTrue(html.startsWith("<test>"));
        assertTrue(html.endsWith("</test>"));
    }

    @Test
    public void testEquals() {
        TestNode node2 = new TestNode(node.baseUri(), (Attributes) node.attributes().clone());
        assertEquals(node, node2);
        assertEquals(node.hashCode(), node2.hashCode());
    }

    @Test
    public void testNotEquals() {
        TestNode node2 = new TestNode(node.baseUri(), new Attributes());
        assertNotEquals(node, node2);
    }

    @Test
    public void testCloneDeepCopy() {
        doc.appendChild(node);
        TestNode child = new TestNode("child", new Attributes());
        node.addChild(child);
        Node cloned = node.clone();
        assertNotSame(node, cloned);
        assertNotSame(node.childNodes().get(0), cloned.childNodes().get(0));
        assertNull(cloned.parentNode());
    }

    @Test
    public void testClonePreservesAttributes() {
        Node cloned = node.clone();
        assertEquals(node.attributes(), cloned.attributes());
    }
}