package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TagTest {

    // Mock ParseSettings for testing valueOf(String, ParseSettings)
    private static class ParseSettings {
        static final ParseSettings preserveCase = new ParseSettings(true);
        static final ParseSettings htmlDefault = new ParseSettings(false);

        private final boolean preserveCase;
        private ParseSettings(boolean preserveCase) {
            this.preserveCase = preserveCase;
        }
        String normalizeTag(String name) {
            return preserveCase ? name : name.toLowerCase();
        }
    }

    @Test
    public void testValueOfNullNameThrows() {
        try {
            Tag.valueOf(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testValueOfEmptyNameThrows() {
        try {
            Tag.valueOf("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testValueOfKnownTag() {
        Tag tag = Tag.valueOf("div");
        assertNotNull(tag);
        assertTrue(tag.isKnownTag());
        assertEquals("div", tag.getName());
    }

    @Test
    public void testValueOfUnknownTagCreatesGeneric() {
        Tag tag = Tag.valueOf("unknown123");
        assertNotNull(tag);
        assertFalse(tag.isKnownTag());
        assertEquals("unknown123", tag.getName());
        assertFalse(tag.isBlock());
        assertTrue(tag.formatAsBlock());
        assertTrue(tag.canContainInline());
        assertFalse(tag.isEmpty());
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void testValueOfCaseSensitivePreserveCase() {
        // "P" is not stored in tags map (only "p"), so with preserveCase it becomes unknown
        Tag tag = Tag.valueOf("P");
        assertFalse(tag.isKnownTag());
        assertEquals("P", tag.getName());
    }

    @Test
    public void testValueOfCaseInsensitiveNormalize() {
        Tag tag = Tag.valueOf("P", ParseSettings.htmlDefault);
        assertTrue(tag.isKnownTag());
        assertEquals("p", tag.getName());
    }

    @Test
    public void testGetName() {
        Tag tag = Tag.valueOf("span");
        assertEquals("span", tag.getName());
    }

    @Test
    public void testIsBlockForBlockTag() {
        assertTrue(Tag.valueOf("div").isBlock());
        assertFalse(Tag.valueOf("div").isInline());
    }

    @Test
    public void testIsInlineForInlineTag() {
        Tag span = Tag.valueOf("span");
        assertFalse(span.isBlock());
        assertTrue(span.isInline());
    }

    @Test
    public void testFormatAsBlock() {
        // div is block and not in formatAsInlineTags => true
        assertTrue(Tag.valueOf("div").formatAsBlock());
        // p is block but in formatAsInlineTags => false
        assertFalse(Tag.valueOf("p").formatAsBlock());
        // span is inline, not in formatAsInlineTags => false (inline init sets formatAsBlock=false)
        assertFalse(Tag.valueOf("span").formatAsBlock());
    }

    @Test
    public void testCanContainBlock() {
        assertTrue(Tag.valueOf("div").canContainBlock());
        assertFalse(Tag.valueOf("span").canContainBlock());
    }

    @Test
    public void testIsDataForKnownTags() {
        // img: empty, canContainInline=false => !false && !true => false
        assertFalse(Tag.valueOf("img").isData());
        // div: canContainInline=true => false
        assertFalse(Tag.valueOf("div").isData());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(Tag.valueOf("img").isEmpty());
        assertFalse(Tag.valueOf("div").isEmpty());
    }

    @Test
    public void testIsSelfClosing() {
        // empty tag
        assertTrue(Tag.valueOf("img").isSelfClosing());
        // non-empty, non-self-closing
        assertFalse(Tag.valueOf("div").isSelfClosing());
    }

    @Test
    public void testSetSelfClosing() {
        Tag tag = Tag.valueOf("unknown");
        assertFalse(tag.isSelfClosing());
        tag.setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void testIsKnownTagInstance() {
        assertTrue(Tag.valueOf("div").isKnownTag());
        assertFalse(Tag.valueOf("xyz").isKnownTag());
    }

    @Test
    public void testStaticIsKnownTag() {
        assertTrue(Tag.isKnownTag("div"));
        assertFalse(Tag.isKnownTag("xyz"));
    }

    @Test
    public void testPreserveWhitespace() {
        assertTrue(Tag.valueOf("pre").preserveWhitespace());
        assertFalse(Tag.valueOf("div").preserveWhitespace());
    }

    @Test
    public void testIsFormListed() {
        assertTrue(Tag.valueOf("input").isFormListed());
        assertFalse(Tag.valueOf("div").isFormListed());
    }

    @Test
    public void testIsFormSubmittable() {
        assertTrue(Tag.valueOf("input").isFormSubmittable());
        assertFalse(Tag.valueOf("div").isFormSubmittable());
    }

    @Test
    public void testToString() {
        Tag tag = Tag.valueOf("img");
        assertEquals("img", tag.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        // same known tag should be == because same instance from map
        assertSame(tag1, tag2);
        assertEquals(tag1, tag2);
        assertEquals(tag1.hashCode(), tag2.hashCode());

        // unknown tags are not cached, so different instances but same properties
        Tag unknown1 = Tag.valueOf("custom");
        Tag unknown2 = Tag.valueOf("custom");
        assertNotSame(unknown1, unknown2);
        assertEquals(unknown1, unknown2);
        assertEquals(unknown1.hashCode(), unknown2.hashCode());

        // different tags not equal
        assertFalse(unknown1.equals(Tag.valueOf("div")));
    }
}