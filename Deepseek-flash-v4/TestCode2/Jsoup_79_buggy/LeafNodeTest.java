import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LeafNodeTest {

    private TestLeafNode leaf;

    @Before
    public void setUp() {
        leaf = new TestLeafNode();
    }

    // A minimal concrete LeafNode for testing
    private static class TestLeafNode extends LeafNode {
        @Override
        public String nodeName() {
            return "test";
        }
    }

    // A minimal Node used as a parent for baseUri/absUrl tests
    private static class ParentNodeStub extends Node {
        private final String base;

        ParentNodeStub(String base) {
            this.base = base;
        }

        @Override
        public String nodeName() {
            return "parent";
        }

        @Override
        public String attr(String attributeKey) {
            return "";
        }

        @Override
        public Attributes attributes() {
            return new Attributes();
        }

        @Override
        public Node attr(String attributeKey, String attributeValue) {
            return this;
        }

        @Override
        public boolean hasAttr(String attributeKey) {
            return false;
        }

        @Override
        public Node removeAttr(String attributeKey) {
            return this;
        }

        @Override
        public String absUrl(String attributeKey) {
            return "";
        }

        @Override
        public String baseUri() {
            return base;
        }

        @Override
        public void setBaseUri(String baseUri) {
            // no-op
        }

        @Override
        protected void doSetBaseUri(String baseUri) {
            // no-op
        }

        @Override
        protected List<Node> ensureChildNodes() {
            return new ArrayList<Node>();
        }

        @Override
        public int childNodeSize() {
            return 0;
        }
    }

    @Test
    public void missingAttributeReturnsEmptyString() {
        assertEquals("", leaf.attr("missing"));
        assertFalse(leaf.hasAttr("missing"));
    }

    @Test
    public void emptyStringValueIsDistinctFromMissingAttribute() {
        leaf.attr("key", "");

        assertTrue(leaf.hasAttr("key"));
        assertEquals("", leaf.attr("key"));

        assertFalse(leaf.hasAttr("missing"));
        assertEquals("", leaf.attr("missing"));
    }

    @Test
    public void setGetAndHasAttr() {
        leaf.attr("key", "value");

        assertTrue(leaf.hasAttr("key"));
        assertEquals("value", leaf.attr("key"));
    }

    @Test
    public void removeAttrRemovesAttribute() {
        leaf.attr("key", "value");

        assertSame(leaf, leaf.removeAttr("key"));
        assertFalse(leaf.hasAttr("key"));
        assertEquals("", leaf.attr("key"));
    }

    @Test
    public void attributesReturnsSameInstance() {
        Attributes first = leaf.attributes();
        Attributes second = leaf.attributes();

        assertNotNull(first);
        assertSame(first, second);
    }

    @Test(expected = RuntimeException.class)
    public void attrRejectsNullKey() {
        leaf.attr(null);
    }

    @Test(expected = RuntimeException.class)
    public void attrRejectsNullKeyWhenSettingValue() {
        leaf.attr(null, "value");
    }

    @Test(expected = RuntimeException.class)
    public void attrRejectsNullValue() {
        leaf.attr("key", null);
    }

    @Test
    public void absUrlReturnsEmptyForMissingAttribute() {
        assertEquals("", leaf.absUrl("missing"));
    }

    @Test
    public void absUrlResolvesFromParentBase() throws Exception {
        leaf.attr("href", "/path");
        setField(leaf, "parentNode", new ParentNodeStub("http://example.com"));

        assertEquals("http://example.com/path", leaf.absUrl("href"));
    }

    @Test
    public void baseUriIsEmptyWithoutParent() {
        assertEquals("", leaf.baseUri());
    }

    @Test
    public void baseUriDelegatesToParent() throws Exception {
        setField(leaf, "parentNode", new ParentNodeStub("http://example.com"));

        assertEquals("http://example.com", leaf.baseUri());
    }

    @Test
    public void setBaseUriDoesNothingForLeaf() {
        leaf.setBaseUri("http://example.com");
        assertEquals("", leaf.baseUri());
    }

    @Test
    public void leafNodeHasNoChildren() {
        assertEquals(0, leaf.childNodeSize());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void ensureChildNodesThrows() {
        leaf.ensureChildNodes();
    }

    private static void setField(Object target, String fieldName, Object value) throws Exception {
        Field field = Node.class.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(target, value);
    }
}