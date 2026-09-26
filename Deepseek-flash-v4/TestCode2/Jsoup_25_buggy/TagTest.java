package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TagTest {
    @Test
    public void testValueOfKnownTag() {
        Tag p = Tag.valueOf("p");
        assertEquals("p", p.getName());
        assertTrue(p.isBlock());
        assertFalse(p.formatAsBlock());
        assertTrue(p.canContainBlock());
        assertFalse(p.isEmpty());
        assertFalse(p.isSelfClosing());
        assertTrue(p.isKnownTag());
        assertFalse(p.preserveWhitespace());
    }

    @Test
    public void testValueOfUnknownTag() {
        Tag custom = Tag.valueOf("custom");
        assertEquals("custom", custom.getName());
        assertFalse(custom.isBlock());
        assertTrue(custom.canContainBlock());
        assertTrue(custom.isInline());
        assertFalse(custom.isEmpty());
        assertFalse(custom.isSelfClosing());
        assertFalse(custom.isKnownTag());
        assertFalse(custom.preserveWhitespace());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfNullThrows() {
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfEmptyThrows() {
        Tag.valueOf("   ");
    }

    @Test
    public void testValueOfTrimLowerCase() {
        Tag div = Tag.valueOf("  DIV ");
        assertEquals("div", div.getName());
        assertTrue(div.isBlock());
        assertTrue(div.formatAsBlock());
    }

    @Test
    public void testIsKnownTagStatic() {
        assertTrue(Tag.isKnownTag("p"));
        assertFalse(Tag.isKnownTag("unknown"));
    }

    @Test
    public void testEmptyAndSelfClosing() {
        Tag br = Tag.valueOf("br");
        assertTrue(br.isEmpty());
        assertTrue(br.isSelfClosing());
        assertFalse(br.canContainBlock());
        assertFalse(br.canContainInline());
        assertTrue(br.isInline());
    }

    @Test
    public void testSetSelfClosing() {
        Tag div = Tag.valueOf("div");
        assertFalse(div.isSelfClosing());
        Tag same = div.setSelfClosing();
        assertTrue(div.isSelfClosing());
        assertSame(div, same);
    }

    @Test
    public void testPreserveWhitespace() {
        Tag pre = Tag.valueOf("pre");
        assertTrue(pre.preserveWhitespace());
        Tag p = Tag.valueOf("p");
        assertFalse(p.preserveWhitespace());
    }

    @Test
    public void testEqualsAndHashCode() {
        Tag t1 = Tag.valueOf("custom1");
        Tag t2 = Tag.valueOf("custom1");
        assertNotSame(t1, t2);
        assertEquals(t1, t2);
        assertEquals(t1.hashCode(), t2.hashCode());

        Tag known1 = Tag.valueOf("div");
        Tag known2 = Tag.valueOf("div");
        assertSame(known1, known2);
        assertEquals(known1, known2);
        assertEquals(known1.hashCode(), known2.hashCode());
    }

    @Test
    public void testToString() {
        assertEquals("div", Tag.valueOf("div").toString());
        assertEquals("custom", Tag.valueOf("custom").toString());
    }

    @Test
    public void testBlockInlineProperties() {
        Tag span = Tag.valueOf("span");
        assertFalse(span.isBlock());
        assertTrue(span.isInline());
        assertFalse(span.canContainBlock());
        assertFalse(span.formatAsBlock());

        Tag div = Tag.valueOf("div");
        assertTrue(div.isBlock());
        assertFalse(div.isInline());
        assertTrue(div.canContainBlock());
        assertTrue(div.formatAsBlock());
    }

    @Test
    public void testIsData() {
        Tag br = Tag.valueOf("br");
        assertFalse(br.isData());
        Tag div = Tag.valueOf("div");
        assertFalse(div.isData());
    }
}