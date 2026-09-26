package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokenTest {

    @Test
    public void testTokenTypeDoctype() {
        Token t = new Token.Doctype();
        assertEquals("Doctype", t.tokenType());
    }

    @Test
    public void testTokenTypeStartTag() {
        Token t = new Token.StartTag();
        assertEquals("StartTag", t.tokenType());
    }

    @Test
    public void testTokenTypeEndTag() {
        Token t = new Token.EndTag();
        assertEquals("EndTag", t.tokenType());
    }

    @Test
    public void testTokenTypeComment() {
        Token t = new Token.Comment();
        assertEquals("Comment", t.tokenType());
    }

    @Test
    public void testTokenTypeCharacter() {
        Token t = new Token.Character("x");
        assertEquals("Character", t.tokenType());
    }

    @Test
    public void testTokenTypeEOF() {
        Token t = new Token.EOF();
        assertEquals("EOF", t.tokenType());
    }

    @Test
    public void testDoctypeGettersDefault() {
        Token.Doctype d = new Token.Doctype();
        assertEquals("", d.getName());
        assertEquals("", d.getPublicIdentifier());
        assertEquals("", d.getSystemIdentifier());
        assertFalse(d.isForceQuirks());
    }

    @Test
    public void testDoctypeSetValues() {
        Token.Doctype d = new Token.Doctype();
        d.name.append("html");
        d.publicIdentifier.append("-//W3C//DTD XHTML 1.0//EN");
        d.systemIdentifier.append("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd");
        d.forceQuirks = true;
        assertEquals("html", d.getName());
        assertEquals("-//W3C//DTD XHTML 1.0//EN", d.getPublicIdentifier());
        assertEquals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", d.getSystemIdentifier());
        assertTrue(d.isForceQuirks());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameThrowsOnEmpty() {
        Token.StartTag tag = new Token.StartTag();
        tag.name();
    }

    @Test
    public void testTagNameSetter() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        assertEquals("div", tag.name());
    }

    @Test
    public void testTagSelfClosingDefaultFalse() {
        Token.StartTag tag = new Token.StartTag("img");
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void testTagSelfClosingTrue() {
        Token.StartTag tag = new Token.StartTag("img");
        tag.selfClosing = true;
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void testTagAttributesNullForEndTag() {
        Token.EndTag tag = new Token.EndTag();
        assertNull(tag.getAttributes());
    }

    @Test
    public void testTagNewAttributeNoNameCreatesEmptyAttributes() {
        Token.StartTag tag = new Token.StartTag("a");
        tag.newAttribute();
        assertNotNull(tag.getAttributes());
        assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void testTagNewAttributeWithNameNoValue() {
        Token.StartTag tag = new Token.StartTag("a");
        tag.appendAttributeName("href");
        tag.newAttribute();
        assertEquals(1, tag.getAttributes().size());
        assertEquals("", tag.getAttributes().get("href"));
    }

    @Test
    public void testTagNewAttributeWithNameAndValue() {
        Token.StartTag tag = new Token.StartTag("a");
        tag.appendAttributeName("href");
        tag.appendAttributeValue("http://example.com");
        tag.newAttribute();
        assertEquals(1, tag.getAttributes().size());
        assertEquals("http://example.com", tag.getAttributes().get("href"));
    }

    @Test
    public void testTagNewAttributeMultipleAttributes() {
        Token.StartTag tag = new Token.StartTag("a");
        tag.appendAttributeName("href");
        tag.appendAttributeValue("http://example.com");
        tag.newAttribute();
        tag.appendAttributeName("class");
        tag.appendAttributeValue("link");
        tag.newAttribute();
        assertEquals(2, tag.getAttributes().size());
        assertEquals("http://example.com", tag.getAttributes().get("href"));
        assertEquals("link", tag.getAttributes().get("class"));
    }

    @Test
    public void testTagFinaliseTagCallsNewAttributeWhenPending() {
        Token.StartTag tag = new Token.StartTag("a");
        tag.appendAttributeName("id");
        tag.finaliseTag();
        assertEquals(1, tag.getAttributes().size());
        assertEquals("", tag.getAttributes().get("id"));
    }

    @Test
    public void testTagFinaliseTagNoPendingAttribute() {
        Token.StartTag tag = new Token.StartTag("a");
        tag.finaliseTag();
        assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void testTagAppendTagNameNullBecomesValue() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName("div");
        assertEquals("div", tag.name());
    }

    @Test
    public void testTagAppendTagNameExisting() {
        Token.StartTag tag = new Token.StartTag("di");
        tag.appendTagName("v");
        assertEquals("div", tag.name());
    }

    @Test
    public void testTagAppendTagNameChar() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName('d');
        tag.appendTagName('i');
        tag.appendTagName('v');
        assertEquals("div", tag.name());
    }

    @Test
    public void testTagAppendAttributeNameNullBecomesValue() {
        Token.StartTag tag = new Token.StartTag("a");
        tag.appendAttributeName("class");
        tag.newAttribute();
        assertEquals("", tag.getAttributes().get("class"));
    }

    @Test
    public void testTagAppendAttributeNameExisting() {
        Token.StartTag tag = new Token.StartTag("a");
        tag.appendAttributeName("cl");
        tag.appendAttributeName("ass");
        tag.newAttribute();
        assertEquals("", tag.getAttributes().get("class"));
    }

    @Test
    public void testTagAppendAttributeNameChar() {
        Token.StartTag tag = new Token.StartTag("a");
        tag.appendAttributeName('h');
        tag.appendAttributeName('r');
        tag.appendAttributeName('e');
        tag.appendAttributeName('f');
        tag.newAttribute();
        assertEquals("", tag.getAttributes().get("href"));
    }

    @Test
    public void testTagAppendAttributeValueNullBecomesValue() {
        Token.StartTag tag = new Token.StartTag("a");
        tag.appendAttributeName("href");
        tag.appendAttributeValue("http://ex");
        tag.appendAttributeValue("ample.com");
        tag.newAttribute();
        assertEquals("http://example.com", tag.getAttributes().get("href"));
    }

    @Test
    public void testTagAppendAttributeValueChar() {
        Token.StartTag tag = new Token.StartTag("a");
        tag.appendAttributeName("href");
        tag.appendAttributeValue('x');
        tag.appendAttributeValue('y');
        tag.newAttribute();
        assertEquals("xy", tag.getAttributes().get("href"));
    }

    @Test
    public void testStartTagToStringNoAttributes() {
        Token.StartTag tag = new Token.StartTag("div");
        assertEquals("<div>", tag.toString());
    }

    @Test
    public void testStartTagToStringWithAttributes() {
        org.jsoup.nodes.Attributes attrs = new org.jsoup.nodes.Attributes();
        attrs.put("id", "main");
        Token.StartTag tag = new Token.StartTag("div", attrs);
        String expected = "<div " + attrs.toString() + ">";
        assertEquals(expected, tag.toString());
    }

    @Test
    public void testEndTagToString() {
        Token.EndTag tag = new Token.EndTag("div");
        assertEquals("</div>", tag.toString());
    }

    @Test
    public void testComment() {
        Token.Comment c = new Token.Comment();
        c.data.append("hello");
        assertEquals("hello", c.getData());
        assertEquals("<!--hello-->", c.toString());
    }

    @Test
    public void testCharacter() {
        Token.Character c = new Token.Character("abc");
        assertEquals("abc", c.getData());
        assertEquals("abc", c.toString());
    }

    @Test
    public void testTypeCheckMethods() {
        Token.Doctype doctype = new Token.Doctype();
        assertTrue(doctype.isDoctype());
        assertFalse(doctype.isStartTag());
        assertFalse(doctype.isEndTag());
        assertFalse(doctype.isComment());
        assertFalse(doctype.isCharacter());
        assertFalse(doctype.isEOF());

        Token.StartTag start = new Token.StartTag();
        assertFalse(start.isDoctype());
        assertTrue(start.isStartTag());
        assertFalse(start.isEndTag());
        assertFalse(start.isComment());
        assertFalse(start.isCharacter());
        assertFalse(start.isEOF());

        Token.EndTag end = new Token.EndTag();
        assertFalse(end.isDoctype());
        assertFalse(end.isStartTag());
        assertTrue(end.isEndTag());
        assertFalse(end.isComment());
        assertFalse(end.isCharacter());
        assertFalse(end.isEOF());

        Token.Comment comment = new Token.Comment();
        assertFalse(comment.isDoctype());
        assertFalse(comment.isStartTag());
        assertFalse(comment.isEndTag());
        assertTrue(comment.isComment());
        assertFalse(comment.isCharacter());
        assertFalse(comment.isEOF());

        Token.Character character = new Token.Character("x");
        assertFalse(character.isDoctype());
        assertFalse(character.isStartTag());
        assertFalse(character.isEndTag());
        assertFalse(character.isComment());
        assertTrue(character.isCharacter());
        assertFalse(character.isEOF());

        Token.EOF eof = new Token.EOF();
        assertFalse(eof.isDoctype());
        assertFalse(eof.isStartTag());
        assertFalse(eof.isEndTag());
        assertFalse(eof.isComment());
        assertFalse(eof.isCharacter());
        assertTrue(eof.isEOF());
    }

    @Test
    public void testAsMethods() {
        Token.Doctype d = new Token.Doctype();
        assertSame(d, d.asDoctype());
        Token.StartTag s = new Token.StartTag();
        assertSame(s, s.asStartTag());
        Token.EndTag e = new Token.EndTag();
        assertSame(e, e.asEndTag());
        Token.Comment c = new Token.Comment();
        assertSame(c, c.asComment());
        Token.Character ch = new Token.Character("x");
        assertSame(ch, ch.asCharacter());
    }

    @Test
    public void testStartTagConstructorWithAttributes() {
        org.jsoup.nodes.Attributes attrs = new org.jsoup.nodes.Attributes();
        attrs.put("class", "btn");
        Token.StartTag tag = new Token.StartTag("button", attrs);
        assertEquals("button", tag.name());
        assertNotNull(tag.getAttributes());
        assertEquals("btn", tag.getAttributes().get("class"));
    }
}