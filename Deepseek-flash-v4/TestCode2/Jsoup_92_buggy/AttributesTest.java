package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AttributesTest {

    @Test
    public void emptyAttributesHaveDefaults() {
        Attributes attrs = new Attributes();
        assertEquals(0, attrs.size());
        assertEquals("", attrs.get("missing"));
        assertEquals("", attrs.get(""));
        assertEquals("", attrs.getIgnoreCase("missing"));
        assertFalse(attrs.hasKey("missing"));
        assertFalse(attrs.hasKeyIgnoreCase("missing"));
        assertFalse(attrs.iterator().hasNext());
        assertEquals(0, attrs.asList().size());
        assertEquals("", attrs.html());
        assertEquals("", attrs.toString());
    }

    @Test
    public void putAndGetWithReplace() {
        Attributes attrs = new Attributes();
        assertSame(attrs, attrs.put("key", "value"));
        assertSame(attrs, attrs.put("key", "newValue"));
        assertEquals(1, attrs.size());
        assertEquals("newValue", attrs.get("key"));
        assertEquals("newValue", attrs.getIgnoreCase("KEY"));
        assertTrue(attrs.hasKey("key"));
        assertFalse(attrs.hasKey("KEY"));
        assertTrue(attrs.hasKeyIgnoreCase("KEY"));
    }

    @Test
    public void putBooleanAttributeStoresNullValue() {
        Attributes attrs = new Attributes();
        attrs.put("checked", true);
        assertTrue(attrs.hasKey("checked"));
        assertEquals("", attrs.get("checked"));
        assertEquals("", attrs.getIgnoreCase("CHECKED"));

        attrs.put("CHECKED", true);
        assertTrue(attrs.hasKey("CHECKED"));
        assertEquals("", attrs.getIgnoreCase("checked"));
    }

    @Test
    public void putFalseRemovesBooleanAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("selected", true);
        attrs.put("selected", false);
        assertFalse(attrs.hasKey("selected"));
    }

    @Test
    public void removeAttributeShiftsAndRemovesIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.put("b", "2");
        attrs.put("c", "3");

        attrs.remove("b");
        assertEquals(2, attrs.size());
        assertTrue(attrs.hasKey("a"));
        assertTrue(attrs.hasKey("c"));
        assertFalse(attrs.hasKey("b"));
        assertEquals("1", attrs.get("a"));
        assertEquals("3", attrs.get("c"));

        attrs.removeIgnoreCase("C");
        assertFalse(attrs.hasKey("c"));
        assertEquals(1, attrs.size());

        attrs.remove("missing");
        attrs.removeIgnoreCase("missing");
        assertEquals(1, attrs.size());
    }

    @Test
    public void removeLastAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("only", "1");
        attrs.remove("only");
        assertEquals(0, attrs.size());
    }

    @Test
    public void addAllAppendsAndExpands() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");

        Attributes incoming = new Attributes();
        incoming.put("b", "2");
        incoming.put("c", "3");
        attrs.addAll(incoming);

        assertEquals(3, attrs.size());
        assertEquals("2", attrs.get("b"));
        assertEquals("3", attrs.get("c"));

        Attributes empty = new Attributes();
        attrs.addAll(empty);
        assertEquals(3, attrs.size());
    }

    @Test
    public void addAllGrowsToExactCapacity() {
        Attributes attrs = new Attributes();
        for (int i = 0; i < 4; i++) {
            attrs.put("k" + i, "v" + i);
        }

        Attributes incoming = new Attributes();
        for (int i = 0; i < 5; i++) {
            incoming.put("x" + i, "y" + i);
        }

        attrs.addAll(incoming);
        assertEquals(9, attrs.size());
    }

    @Test
    public void iteratorCanRemove() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.put("b", "2");

        Iterator<Attribute> it = attrs.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next().getKey());
        it.remove();

        assertEquals(1, attrs.size());
        assertFalse(attrs.hasKey("a"));
        assertTrue(attrs.hasKey("b"));
    }

    @Test
    public void asListIsUnmodifiableAndUsesBooleanAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("href", "http://example.com");
        attrs.put("disabled", true);

        List<Attribute> list = attrs.asList();
        assertEquals(2, list.size());
        assertEquals("href", list.get(0).getKey());
        assertEquals("http://example.com", list.get(0).getValue());
        assertTrue(list.get(1).getClass().getSimpleName().equals("BooleanAttribute"));

        try {
            list.add(new Attribute("new", "value"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // ok
        }
    }

    @Test
    public void datasetFiltersAndMapsDataAttributes() {
        Attributes attrs = new Attributes();
        attrs.put("id", "x");
        attrs.put("data-name", "jsoup");
        attrs.put("data-version", "1");

        Map<String, String> data = attrs.dataset();
        assertEquals(2, data.size());
        assertEquals("jsoup", data.get("name"));
        assertEquals("1", data.get("version"));
        assertNull(data.get("id"));

        assertEquals("jsoup", data.put("name", "jsoup2"));
        assertEquals("jsoup2", attrs.get("data-name"));

        assertNull(data.put("role", "main"));
        assertEquals("main", data.get("role"));
        assertTrue(attrs.hasKey("data-role"));
    }

    @Test
    public void datasetIteratorSkipsNonDataAttributesAndRemoves() {
        Attributes attrs = new Attributes();
        attrs.put("id", "x");
        attrs.put("data-item", "42");

        Iterator<Map.Entry<String, String>> it = attrs.dataset().entrySet().iterator();
        assertTrue(it.hasNext());
        Map.Entry<String, String> entry = it.next();
        assertEquals("item", entry.getKey());
        assertEquals("42", entry.getValue());

        it.remove();
        assertFalse(attrs.hasKey("data-item"));
        assertTrue(attrs.hasKey("id"));
    }

    @Test
    public void htmlAndToStringProduceAttributeMarkup() {
        Attributes attrs = new Attributes();
        attrs.put("href", "http://example.com");
        attrs.put("disabled", true);

        assertEquals(" href=\"http://example.com\" disabled", attrs.html());
        assertEquals(attrs.html(), attrs.toString());
    }

    @Test
    public void equalsAndHashCode() {
        Attributes a = new Attributes();
        a.put("k", "v");

        Attributes b = new Attributes();
        b.put("k", "v");

        assertTrue(a.equals(a));
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
        assertFalse(a.equals(null));
        assertFalse(a.equals("other"));

        Attributes c = new Attributes();
        c.put("k", "v");
        c.put("extra", "x");
        assertFalse(a.equals(c));

        b.put("k", "v2");
        assertFalse(a.equals(b));
    }

    @Test
    public void cloneIsIndependent() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");

        Attributes clone = attrs.clone();
        assertFalse(attrs == clone);
        assertEquals("1", clone.get("a"));

        clone.put("b", "2");
        attrs.put("c", "3");

        assertFalse(attrs.hasKey("b"));
        assertFalse(clone.hasKey("c"));
        assertEquals("1", attrs.get("a"));
        assertEquals("1", clone.get("a"));
    }

    @Test
    public void cloneEqualsOriginal() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");

        Attributes clone = attrs.clone();
        assertEquals(attrs, clone);
        assertEquals(attrs.hashCode(), clone.hashCode());
    }

    @Test
    public void normalizeLowercasesKeys() {
        Attributes attrs = new Attributes();
        attrs.put("Foo", "1");
        attrs.put("Bar", "2");

        attrs.normalize();

        assertTrue(attrs.hasKey("foo"));
        assertTrue(attrs.hasKey("bar"));
        assertFalse(attrs.hasKey("Foo"));
        assertFalse(attrs.hasKey("Bar"));
    }

    @Test
    public void putAttributeSetsParent() {
        Attributes attrs = new Attributes();
        Attribute attribute = new Attribute("key", "value");

        assertSame(attrs, attrs.put(attribute));
        assertEquals("value", attrs.get("key"));
        assertSame(attrs, attribute.parent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getNullKeyThrows() {
        new Attributes().get(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void putNullAttributeThrows() {
        new Attributes().put((Attribute) null);
    }
}