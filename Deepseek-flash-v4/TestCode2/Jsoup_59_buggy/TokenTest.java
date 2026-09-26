package org.jsoup.parser;

import static org.junit.Assert.*;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class TokenTest {

    @Test
    public void staticResetClearsBuilderOrIgnoresNull() {
        Token.reset(null);
        StringBuilder sb = new StringBuilder("abc");
        Token.reset(sb);
        assertEquals(0, sb.length());
    }

    @Test
    public void tokenTypeReturnsSimpleClassName() {
        assertEquals("Doctype", new Token.Doctype().tokenType());
        assertEquals("StartTag", new Token.StartTag().tokenType());
        assertEquals("EndTag", new Token.EndTag().tokenType());
        assertEquals("Comment", new Token.Comment().tokenType());
        assertEquals("Character", new Token.Character().tokenType());
        assertEquals("EOF", new Token.EOF().tokenType());
    }

    @Test
    public void typePredicatesAndCasts() {
        Token.Doctype doctype = new Token.Doctype();
        assertTrue(doctype.isDoctype());
        assertSame(doctype, doctype.asDoctype());

        Token.StartTag start = new Token.StartTag();
        assertTrue(start.isStartTag());
        assertSame(start, start.asStartTag());
        assertFalse(start.isDoctype());
        assertFalse(start.isEndTag());
        assertFalse(start.isComment());
        assertFalse(start.isCharacter());
        assertFalse(start.isEOF());

        Token.EndTag end = new Token.EndTag();
        assertTrue(end.isEndTag());
        assertSame(end, end.asEndTag());

        Token.Comment comment = new Token.Comment();
        assertTrue(comment.isComment());
        assertSame(comment, comment.asComment());

        Token.Character character = new Token.Character();
        assertTrue(character.isCharacter());
        assertSame(character, character.asCharacter());

        Token.EOF eof = new Token.EOF();
        assertTrue(eof.isEOF());
    }

    @Test
    public void doctypeGettersAndReset() {
        Token.Doctype d = new Token.Doctype();
        assertEquals("", d.getName());
        assertNull(d.getPubSysKey());
        assertEquals("", d.getPublicIdentifier());
        assertEquals("", d.getSystemIdentifier());
        assertFalse(d.isForceQuirks());

        d.name.append("html");
        d.pubSysKey = "PUBLIC";
        d.publicIdentifier.append("-//W3C//DTD HTML 4.01//EN");
        d.systemIdentifier.append("http://www.w3.org/TR/html4/strict.dtd");
        d.forceQuirks = true;

        assertEquals("html", d.getName());
        assertEquals("PUBLIC", d.getPubSysKey());
        assertEquals("-//W3C//DTD HTML 4.01//EN", d.getPublicIdentifier());
        assertEquals("http://www.w3.org/TR/html4/strict.dtd", d.getSystemIdentifier());
        assertTrue(d.isForceQuirks());

        assertSame(d, d.reset());
        assertEquals(0, d.name.length());
        assertNull(d.pubSysKey);
        assertEquals(0, d.publicIdentifier.length());
        assertEquals(0, d.systemIdentifier.length());
        assertFalse(d.isForceQuirks());
    }

    @Test
    public void startTagResetClearsTagAndPendingAttribute() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.selfClosing = true;
        tag.appendAttributeName("id");
        tag.appendAttributeValue("x");
        tag.newAttribute();

        assertEquals(1, tag.getAttributes().size());
        assertTrue(tag.isSelfClosing());

        Token reset = tag.reset();
        assertSame(tag, reset);
        assertNull(tag.normalName());
        assertFalse(tag.isSelfClosing());
        assertNotNull(tag.getAttributes());
        assertEquals(0, tag.getAttributes().size());

        tag.finaliseTag();
        assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void endTagResetAndCanCreateAttributes() {
        Token.EndTag end = new Token.EndTag();
        end.name("div");
        assertEquals("</div>", end.toString());

        Token reset = end.reset();
        assertSame(end, reset);
        assertNull(end.normalName());
        assertFalse(end.isSelfClosing());
        assertNull(end.getAttributes());

        Token.EndTag withAttr = new Token.EndTag();
        withAttr.name("div");
        withAttr.appendAttributeName("class");
        withAttr.appendAttributeValue("x");
        withAttr.newAttribute();

        assertNotNull(withAttr.getAttributes());
        assertEquals(1, withAttr.getAttributes().size());
    }

    @Test
    public void nameSetsTagAndNormalNameAndValidates() {
        Token.StartTag tag = new Token.StartTag();
        Token result = tag.name("DiV");
        assertSame(tag, result);
        assertEquals("DiV", tag.name());
        assertEquals("div", tag.normalName());

        try {
            new Token.StartTag().name();
            fail("Expected IllegalArgumentException for missing tag name");
        } catch (IllegalArgumentException expected) {
        }

        Token.StartTag empty = new Token.StartTag();
        empty.name("");
        try {
            empty.name();
            fail("Expected IllegalArgumentException for empty tag name");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void appendTagNameAppendsAndLowercases() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName("DIV");
        assertEquals("DIV", tag.name());
        assertEquals("div", tag.normalName());

        tag.appendTagName('S');
        assertEquals("DIVS", tag.name());
        assertEquals("divs", tag.normalName());
    }

    @Test
    public void appendAttributeNameAndTrim() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("x");
        tag.appendAttributeName('d');
        tag.appendAttributeName("ata");
        tag.setEmptyAttributeValue();
        tag.finaliseTag();

        assertEquals(1, tag.getAttributes().size());
        assertTrue(tag.toString().contains("data=\"\""));

        Token.StartTag trimmed = new Token.StartTag();
        trimmed.name("x");
        trimmed.appendAttributeName(" value ");
        trimmed.appendAttributeValue("v");
        trimmed.newAttribute();

        assertEquals(1, trimmed.getAttributes().size());
        assertTrue(trimmed.toString().contains("value=\"v\""));
    }

    @Test
    public void newAttributeModes() {
        Token.StartTag bool = new Token.StartTag();
        bool.name("input");
        bool.appendAttributeName("disabled");
        bool.finaliseTag();

        assertEquals(1, bool.getAttributes().size());
        assertTrue(bool.toString().contains("disabled"));

        Token.StartTag empty = new Token.StartTag();
        empty.name("input");
        empty.appendAttributeName("value");
        empty.setEmptyAttributeValue();
        empty.newAttribute();

        assertEquals(1, empty.getAttributes().size());
        assertTrue(empty.toString().contains("value=\"\""));

        Token.StartTag normal = new Token.StartTag();
        normal.name("a");
        normal.appendAttributeName("href");
        normal.appendAttributeValue("http://example.com");
        normal.newAttribute();

        assertEquals(1, normal.getAttributes().size());
        assertTrue(normal.toString().contains("href=\"http://example.com\""));

        Token.StartTag noPending = new Token.StartTag();
        noPending.name("x");
        noPending.newAttribute();
        assertEquals(0, noPending.getAttributes().size());
    }

    @Test
    public void appendAttributeValueCombinesAllForms() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("x");
        tag.appendAttributeName("a");
        tag.appendAttributeValue("h");
        tag.appendAttributeValue('i');
        tag.appendAttributeValue(" j".toCharArray());
        tag.appendAttributeValue(new int[]{107, 108});
        tag.newAttribute();

        assertEquals(1, tag.getAttributes().size());
        assertTrue(tag.toString().contains("a=\"hi jkl\""));
    }

    @Test
    public void finaliseTagCopiesPendingAttributeAndNoPendingNoops() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("img");
        tag.appendAttributeName("alt");
        tag.appendAttributeValue("A");
        tag.finaliseTag();

        assertEquals(1, tag.getAttributes().size());
        assertTrue(tag.toString().contains("alt=\"A\""));

        Token.StartTag none = new Token.StartTag();
        none.name("img");
        none.finaliseTag();

        assertEquals(0, none.getAttributes().size());
        assertEquals("<img>", none.toString());
    }

    @Test
    public void nameAttrParsesNameAndAttributes() {
        Attributes attrs = new Attributes();
        attrs.put(new Attribute("href", "http://example.com"));

        Token.StartTag tag = new Token.StartTag();
        assertSame(tag, tag.nameAttr("a", attrs));
        assertEquals("a", tag.name());
        assertEquals("a", tag.normalName());
        assertTrue(tag.toString().contains("href=\"http://example.com\""));
    }

    @Test
    public void commentLifecycleAndReset() {
        Token.Comment comment = new Token.Comment();
        assertEquals("", comment.getData());

        comment.data.append("test");
        comment.bogus = true;
        assertEquals("<!--test-->", comment.toString());

        assertSame(comment, comment.reset());
        assertEquals("", comment.getData());
        assertFalse(comment.bogus);
    }

    @Test
    public void characterLifecycleAndReset() {
        Token.Character character = new Token.Character();
        assertNull(character.getData());

        assertSame(character, character.data("x"));
        assertEquals("x", character.getData());
        assertEquals("x", character.toString());

        assertSame(character, character.reset());
        assertNull(character.getData());
    }

    @Test
    public void eofResetReturnsSelf() {
        Token.EOF eof = new Token.EOF();
        assertSame(eof, eof.reset());
    }
}