package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ElementsTest {

    private Elements empty;
    private Elements one;
    private Elements many;
    private FakeElement el1;
    private FakeElement el2;
    private FakeElement el3;

    @Before
    public void setUp() {
        el1 = new FakeElement("a");
        el1.text = "One";
        el1.innerHtml = "h1";
        el1.outerHtml = "<a>One</a>";

        el2 = new FakeElement("b");
        el2.text = "Two";
        el2.innerHtml = "h2";
        el2.outerHtml = "<b>Two</b>";

        el3 = new FakeElement("c");
        el3.text = "Three";
        el3.innerHtml = "h3";
        el3.outerHtml = "<c>Three</c>";

        empty = new Elements();
        one = new Elements(el1);
        many = new Elements(el1, el2, el3);
    }

    @Test
    public void constructorsAndBasics() {
        assertEquals(0, empty.size());
        assertTrue(empty.isEmpty());

        List<Element> list = new ArrayList<Element>();
        list.add(el1);
        list.add(el2);
        Elements fromList = new Elements(list);
        assertEquals(2, fromList.size());

        fromList.add(el3);
        assertEquals(3, fromList.size());

        Collection<Element> coll = Arrays.<Element>asList(el1, el2);
        Elements fromColl = new Elements(coll);
        assertEquals(2, fromColl.size());

        Elements varargs = new Elements(el1, el2);
        assertEquals(2, varargs.size());
    }

    @Test
    public void attrReadsFirstValue() {
        assertEquals("", empty.attr("id"));
        assertEquals("", one.attr("id"));

        el1.attributes.put("id", "one");
        assertEquals("one", one.attr("id"));

        el1.attributes.clear();
        el2.attributes.put("id", "two");
        assertEquals("two", many.attr("id"));
    }

    @Test
    public void hasAttr() {
        assertFalse(empty.hasAttr("id"));
        assertFalse(one.hasAttr("id"));

        el2.attributes.put("id", "two");
        assertTrue(many.hasAttr("id"));

        assertFalse(new Elements(el1, el3).hasAttr("id"));
    }

    @Test
    public void setAndRemoveAttrOnAll() {
        assertSame(many, many.attr("class", "x"));
        assertEquals("x", el1.attributes.get("class"));
        assertEquals("x", el3.attributes.get("class"));

        el1.attributes.put("id", "1");
        el3.attributes.put("id", "3");

        many.removeAttr("id");
        assertFalse(el1.hasAttr("id"));
        assertFalse(el3.hasAttr("id"));
    }

    @Test
    public void classOperations() {
        assertFalse(empty.hasClass("x"));

        many.addClass("foo");
        assertTrue(el1.hasClass("foo"));
        assertTrue(many.hasClass("foo"));

        many.removeClass("foo");
        assertFalse(el1.hasClass("foo"));

        many.toggleClass("bar");
        assertTrue(el2.hasClass("bar"));

        many.toggleClass("bar");
        assertFalse(el2.hasClass("bar"));
    }

    @Test
    public void val() {
        assertEquals("", empty.val());

        el1.val = "v1";
        assertEquals("v1", one.val());

        many.val("updated");
        assertEquals("updated", el2.val);
        assertEquals("updated", el3.val);
    }

    @Test
    public void text() {
        assertEquals("", empty.text());
        assertEquals("One", one.text());
        assertEquals("One Two Three", many.text());
    }

    @Test
    public void hasText() {
        FakeElement noText = new FakeElement("p");
        noText.text = "";

        assertFalse(empty.hasText());
        assertFalse(new Elements(noText).hasText());
        assertTrue(one.hasText());
    }

    @Test
    public void html() {
        assertEquals("", empty.html());
        assertEquals("h1", one.html());
        assertEquals("h1\nh2\nh3", many.html());

        many.html("<div>replaced</div>");
        assertEquals("<div>replaced</div>", el1.innerHtml);
        assertEquals("<div>replaced</div>", el2.innerHtml);
    }

    @Test
    public void outerHtmlAndToString() {
        assertEquals("", empty.outerHtml());
        assertEquals("<a>One</a>", one.outerHtml());
        assertEquals("<a>One</a>\n<b>Two</b>\n<c>Three</c>", many.outerHtml());
        assertEquals(many.outerHtml(), many.toString());
    }

    @Test
    public void tagNameSetsOnAll() {
        many.tagName("span");
        assertEquals("span", el1.tag);
        assertEquals("span", el2.tag);
    }

    @Test
    public void prependAppendBeforeAfter() {
        many.prepend("p");
        assertTrue(el1.prependCalled);

        many.append("a");
        assertTrue(el2.appendCalled);

        many.before("b");
        assertTrue(el3.beforeCalled);

        many.after("x");
        assertTrue(el1.afterCalled);
    }

    @Test
    public void wrapAndEmpty() {
        assertSame(many, many.wrap("<div></div>"));
        assertTrue(el1.wrapCalled);

        many.unwrap();

        many.empty();
        assertTrue(el1.emptyCalled);
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrapRejectsNull() {
        one.wrap(null);
    }

    @Test
    public void listBasicOperations() {
        assertFalse(empty.contains(el1));
        assertTrue(many.contains(el1));

        Object[] array = many.toArray();
        assertEquals(3, array.length);
        assertSame(el1, array[0]);

        Element[] typed = new Element[3];
        Element[] returned = many.toArray(typed);
        assertSame(typed, returned);
        assertSame(el2, typed[1]);
    }

    @Test
    public void listModifiers() {
        FakeElement extra = new FakeElement("x");
        assertTrue(empty.add(extra));
        assertEquals(1, empty.size());

        assertTrue(many.remove(el2));
        assertEquals(2, many.size());
        assertFalse(many.contains(el2));

        Elements sample = new Elements(el1, el2, el3);
        List<Element> toRemove = Arrays.<Element>asList(el1, el3);
        assertTrue(sample.removeAll(toRemove));
        assertEquals(1, sample.size());
        assertSame(el2, sample.get(0));

        Elements retain = new Elements(el1, el2, el3);
        List<Element> keep = Arrays.<Element>asList(el1, el3);
        retain.retainAll(keep);
        assertEquals(2, retain.size());
        assertSame(el1, retain.get(0));
        assertSame(el3, retain.get(1));
    }

    @Test
    public void addAllIndexedAndClear() {
        FakeElement a = new FakeElement("a");
        FakeElement b = new FakeElement("b");
        List<Element> extras = Arrays.<Element>asList(a, b);

        assertTrue(empty.addAll(extras));
        assertEquals(2, empty.size());

        assertTrue(many.addAll(1, extras));
        assertEquals(5, many.size());
        assertSame(el1, many.get(0));
        assertSame(a, many.get(1));
        assertSame(b, many.get(2));
        assertSame(el2, many.get(3));

        many.clear();
        assertEquals(0, many.size());
        assertTrue(many.isEmpty());
    }

    @Test
    public void indexedOperations() {
        FakeElement extra = new FakeElement("x");

        many.add(1, extra);
        assertSame(extra, many.get(1));
        assertSame(extra, many.remove(1));

        assertEquals(0, many.indexOf(el1));

        many.add(el1);
        assertEquals(3, many.lastIndexOf(el1));

        ListIterator<Element> it = many.listIterator();
        assertTrue(it.hasNext());
        assertSame(el1, it.next());

        ListIterator<Element> it2 = many.listIterator(1);
        assertSame(el2, it2.next());

        List<Element> sub = many.subList(1, 3);
        assertEquals(2, sub.size());
        assertSame(el2, sub.get(0));
        assertSame(el3, sub.get(1));
    }

    @Test
    public void set() {
        FakeElement extra = new FakeElement("x");
        assertSame(el1, many.set(0, extra));
        assertSame(extra, many.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getOutOfBounds() {
        one.get(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeIndexOutOfBounds() {
        one.remove(1);
    }

    private static class FakeElement extends Element {

        private final String tag;
        private final Map<String, String> attributes = new HashMap<String, String>();
        private final Set<String> classNames = new HashSet<String>();

        private String text = "";
        private String innerHtml = "";
        private String val = "";

        private boolean prependCalled;
        private boolean appendCalled;
        private boolean beforeCalled;
        private boolean afterCalled;
        private boolean wrapCalled;
        private boolean emptyCalled;

        FakeElement(String tag) {
            super(Tag.valueOf(tag), "");
            this.tag = tag;
        }

        @Override
        public String attr(String key) {
            return attributes.get(key);
        }

        @Override
        public Element attr(String key, String value) {
            attributes.put(key, value);
            return this;
        }

        @Override
        public boolean hasAttr(String key) {
            return attributes.containsKey(key);
        }

        @Override
        public Element removeAttr(String key) {
            attributes.remove(key);
            return this;
        }

        @Override
        public Element addClass(String className) {
            classNames.add(className);
            return this;
        }

        @Override
        public Element removeClass(String className) {
            classNames.remove(className);
            return this;
        }

        @Override
        public Element toggleClass(String className) {
            if (classNames.contains(className)) {
                classNames.remove(className);
            } else {
                classNames.add(className);
            }
            return this;
        }

        @Override
        public boolean hasClass(String className) {
            return classNames.contains(className);
        }

        @Override
        public String val() {
            return val;
        }

        @Override
        public Element val(String value) {
            this.val = value;
            return this;
        }

        @Override
        public String text() {
            return text;
        }

        @Override
        public boolean hasText() {
            return !text.isEmpty();
        }

        @Override
        public String html() {
            return innerHtml;
        }

        @Override
        public Element html(String html) {
            this.innerHtml = html;
            return this;
        }

        @Override
        public String outerHtml() {
            return outerHtml;
        }

        @Override
        public Element tagName(String tagName) {
            this.tag = tagName;
            return this;
        }

        @Override
        public Element prepend(String html) {
            this.prependCalled = true;
            return this;
        }

        @Override
        public Element append(String html) {
            this.appendCalled = true;
            return this;
        }

        @Override
        public Element before(String html) {
            this.beforeCalled = true;
            return this;
        }

        @Override
        public Element after(String html) {
            this.afterCalled = true;
            return this;
        }

        @Override
        public Element wrap(String html) {
            this.wrapCalled = true;
            return this;
        }

        @Override
        public Element empty() {
            this.emptyCalled = true;
            return this;
        }
    }
}