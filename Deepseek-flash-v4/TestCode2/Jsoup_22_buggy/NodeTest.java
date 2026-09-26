package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeVisitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    private Document doc;
    private Element parent;
    private Element span;

    @Before
    public void setUp() {
        doc = Jsoup.parse(
            "<div id=\"parent\">One <span id=\"s\">Two <b>Three</b></span> Four</div>",
            "http://example.com/path/index.html");
        parent = doc.select("#parent").first();
        span = doc.select("#s").first();
    }

    @Test
    public void attrReadsExistingAndMissing() {
        assertEquals("s", span.attr("id"));
        assertEquals("", span.attr("missing"));

        try {
            span.attr(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void attrSetsAndRemoves() {
        assertSame(span, span.attr("data-test", "value"));
        assertEquals("value", span.attr("data-test"));

        span.removeAttr("data-test");
        assertEquals("", span.attr("data-test"));
    }

    @Test
    public void hasAttrSupportsAbsPrefix() {
        assertTrue(span.hasAttr("id"));
        assertFalse(span.hasAttr("no"));

        span.attr("href", "/foo");
        assertTrue(span.hasAttr("abs:href"));
        assertFalse(span.hasAttr("abs:no"));
    }

    @Test
    public void absUrlResolvesAndReturnsEmptyForMissing() {
        span.attr("href", "/foo");
        assertEquals("http://example.com/foo", span.absUrl("href"));
        assertEquals("http://example.com/foo", span.attr("abs:href"));

        assertEquals("", span.absUrl("missing"));

        span.attr("href", "?qa=1");
        assertEquals("http://example.com/path/index.html?qa=1", span.absUrl("href"));

        try {
            span.absUrl("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void absUrlFallsBackToAbsoluteOnBadBase() {
        doc.setBaseUri("not a url");
        span.attr("href", "http://example.com/abs");
        assertEquals("http://example.com/abs", span.absUrl("href"));
    }

    @Test
    public void childNodesAreExposedAndUnmodifiable() {
        assertEquals(3, parent.childNodes().size());
        assertSame(span, parent.childNode(1));

        try {
            parent.childNode(99);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }

        try {
            parent.childNodes().add(new TextNode("x", ""));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void parentAndOwnerDocument() {
        assertSame(doc, span.ownerDocument());
        assertSame(doc, doc.ownerDocument());
        assertSame(parent, span.parent());
    }

    @Test
    public void removeDetachesFromParent() {
        span.remove();
        assertNull(span.parent());
        assertFalse(parent.childNodes().contains(span));

        try {
            doc.remove();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void beforeInsertsHtmlAndNode() {
        span.before("<em>before</em>");
        assertEquals("em", span.previousSibling().nodeName());
        assertEquals("em", parent.childNode(1).nodeName());

        Element em = new Element(Tag.valueOf("em"), "");
        span.before(em);
        assertSame(em, span.previousSibling());
        assertSame(parent, em.parent());
    }

    @Test
    public void afterInsertsHtmlAndNode() {
        span.after("<em>after</em>");
        assertEquals("em", span.nextSibling().nodeName());
        assertEquals("em", parent.childNode(2).nodeName());

        Element em = new Element(Tag.valueOf("em"), "");
        span.after(em);
        assertSame(em, span.nextSibling());
        assertSame(parent, em.parent());
    }

    @Test
    public void wrapMovesNodeInsideNewElement() {
        span.wrap("<div id=\"wrap\"></div>");

        Node wrapper = span.parent();
        assertEquals("wrap", ((Element) wrapper).id());
        assertSame(parent, wrapper.parent());
        assertSame(span, wrapper.childNode(0));
    }

    @Test
    public void unwrapMovesChildrenToParent() {
        Node first = span.unwrap();

        assertEquals("#text", first.nodeName());
        assertNull(span.parent());
        assertTrue(parent.childNodes().contains(first));
        assertFalse(parent.childNodes().contains(span));
    }

    @Test
    public void replaceWithSwapsNodeInParent() {
        Element em = new Element(Tag.valueOf("em"), "");
        span.replaceWith(em);

        assertNull(span.parent());
        assertSame(parent, em.parent());
        assertFalse(parent.childNodes().contains(span));
        assertTrue(parent.childNodes().contains(em));
    }

    @Test
    public void siblingNavigationWorks() {
        assertEquals("#text", span.previousSibling().nodeName());
        assertEquals("#text", span.nextSibling().nodeName());

        assertNull(parent.childNode(0).previousSibling());

        Node last = parent.childNodes().get(parent.childNodes().size() - 1);
        assertNull(last.nextSibling());

        Element detached = new Element(Tag.valueOf("div"), "");
        assertEquals(0, detached.siblingNodes().size());
        assertNull(detached.nextSibling());
        assertNull(detached.previousSibling());
    }

    @Test
    public void traverseVisitsSubtreeAndValidatesVisitor() {
        final int[] heads = {0};
        final int[] tails = {0};

        NodeVisitor visitor = new NodeVisitor() {
            public void head(Node node, int depth) {
                heads[0]++;
            }

            public void tail(Node node, int depth) {
                tails[0]++;
            }
        };

        assertSame(span, span.traverse(visitor));
        assertTrue(heads[0] > 0);
        assertEquals(heads[0], tails[0]);

        try {
            span.traverse(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void outerHtmlAndToStringMatch() {
        String expected = "<span id=\"s\">Two <b>Three</b></span>";
        assertEquals(expected, span.outerHtml());
        assertEquals(expected, span.toString());
    }

    @Test
    public void equalsTreatsThisAsEqual() {
        assertTrue(span.equals(span));
        assertFalse(span.equals(parent));
        assertFalse(span.equals(null));
        assertEquals(span.hashCode(), span.hashCode());
    }

    @Test
    public void cloneCreatesDeepCopyWithNoParent() {
        Element clone = span.clone();

        assertNotSame(span, clone);
        assertNull(clone.parent());
        assertEquals(span.childNodes().size(), clone.childNodes().size());
        assertNotSame(span.childNode(0), clone.childNode(0));
        assertFalse(clone.hasAttr("data-x"));

        clone.attr("data-x", "y");
        assertFalse(span.hasAttr("data-x"));
        assertEquals("y", clone.attr("data-x"));
    }
}