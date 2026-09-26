package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TagTest {

    @Test
    public void testValueOfPredefinedTagIsNormalizedAndCached() {
        Tag p = Tag.valueOf("P ");
        assertEquals("p", p.getName());
        assertSame(p, Tag.valueOf("p"));
        assertEquals("p", p.toString());
    }

    @Test
    public void testValueOfUnknownTagReturnsEqualNewGenericTag() {
        Tag custom = Tag.valueOf("MyTag ");
        assertEquals("mytag", custom.getName());
        assertFalse(custom.isBlock());
        assertTrue(custom.isInline());
        assertTrue(custom.canContainBlock());
        assertFalse(custom.isEmpty());
        assertFalse(custom.isData());
        assertFalse(custom.preserveWhitespace());
        assertEquals(custom, Tag.valueOf("mytag"));
        assertFalse(custom == Tag.valueOf("mytag"));
    }

    @Test(expected = NullPointerException.class)
    public void testValueOfNullThrowsNullPointerException() {
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfBlankThrowsIllegalArgumentException() {
        Tag.valueOf("   ");
    }

    @Test(expected = NullPointerException.class)
    public void testCanContainNullChildThrowsNullPointerException() {
        Tag.valueOf("div").canContain(null);
    }

    @Test
    public void testTagFlags() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.isBlock());
        assertFalse(div.isInline());
        assertTrue(div.canContainBlock());

        Tag p = Tag.valueOf("p");
        assertTrue(p.isBlock());
        assertFalse(p.canContainBlock());

        Tag span = Tag.valueOf("span");
        assertFalse(span.isBlock());
        assertTrue(span.isInline());
        assertFalse(span.canContainBlock());

        Tag br = Tag.valueOf("br");
        assertTrue(br.isEmpty());
        assertFalse(br.isData());

        Tag script = Tag.valueOf("script");
        assertTrue(script.isData());
        assertTrue(script.preserveWhitespace());

        Tag pre = Tag.valueOf("pre");
        assertTrue(pre.preserveWhitespace());
    }

    @Test
    public void testCanContainBasicRules() {
        Tag p = Tag.valueOf("p");
        Tag div = Tag.valueOf("div");
        assertFalse(p.canContain(div));

        Tag script = Tag.valueOf("script");
        Tag span = Tag.valueOf("span");
        assertFalse(script.canContain(span));

        Tag a = Tag.valueOf("a");
        assertFalse(a.canContain(a));

        Tag custom = Tag.valueOf("custom");
        assertTrue(custom.canContain(div));
        assertTrue(custom.canContain(span));
    }

    @Test
    public void testCanContainHeadAndDefinitionSpecialCases() {
        Tag head = Tag.valueOf("head");
        Tag title = Tag.valueOf("title");
        Tag div = Tag.valueOf("div");

        assertTrue(head.canContain(title));
        assertFalse(head.canContain(div));

        Tag dt = Tag.valueOf("dt");
        Tag dd = Tag.valueOf("dd");

        assertFalse(dt.canContain(dd));
        assertFalse(dd.canContain(dt));
    }

    @Test
    public void testGetImplicitParent() {
        assertNull(Tag.valueOf("html").getImplicitParent());
        assertEquals("html", Tag.valueOf("body").getImplicitParent().getName());
    }

    @Test
    public void testIsValidParent() {
        Tag ul = Tag.valueOf("ul");
        Tag li = Tag.valueOf("li");
        Tag div = Tag.valueOf("div");

        assertTrue(ul.isValidParent(li));
        assertFalse(div.isValidParent(li));
        assertTrue(div.isValidParent(Tag.valueOf("html")));
    }

    @Test
    public void testEqualsHashCode() {
        Tag div = Tag.valueOf("div");
        assertTrue(div.equals(Tag.valueOf("div")));
        assertFalse(div.equals(null));
        assertFalse(div.equals("div"));
        assertFalse(div.equals(Tag.valueOf("span")));

        Tag custom1 = Tag.valueOf("custom");
        Tag custom2 = Tag.valueOf("custom");
        assertEquals(custom1, custom2);
        assertEquals(custom1.hashCode(), custom2.hashCode());
    }
}