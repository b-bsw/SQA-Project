package org.jsoup.parser;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TokenTest {
    private Token.Doctype doctype;
    private Token.StartTag startTag;
    private Token.EndTag endTag;
    private Token.Comment comment;
    private Token.Character character;
    private Token.EOF eof;

    @Before
    public void setUp() {
        doctype = new Token.Doctype();
        startTag = new Token.StartTag();
        endTag = new Token.EndTag();
        comment = new Token.Comment();
        character = new Token.Character();
        eof = new Token.EOF();
    }

    // --- Doctype tests ---
    @Test
    public void testDoctypeReset() {
        doctype.name.append("html");
        doctype.publicIdentifier.append("PUB");
        doctype.systemIdentifier.append("SYS");
        doctype.forceQuirks = true;
        doctype.reset();
        assertEquals("", doctype.getName());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
    }

    @Test
    public void testDoctypeGetters() {
        doctype.name.append("html");
        doctype.publicIdentifier.append("PUB");
        doctype.systemIdentifier.append("SYS");
        assertEquals("html", doctype.getName());
        assertEquals("PUB", doctype.getPublicIdentifier());
        assertEquals("SYS", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
    }

    @Test
    public void testDoctypeForceQuirks() {
        assertFalse(doctype.isForceQuirks());
        doctype.forceQuirks = true;
        assertTrue(doctype.isForceQuirks());
    }

    @Test
    public void testDoctypeEmptyName() {
        assertEquals("", doctype.getName());
    }

    // --- StartTag tests ---
    @Test
    public void testStartTagName() {
        startTag.name("div");
        assertEquals("div", startTag.name());
        assertEquals("div", startTag.normalName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStartTagNameUnset() {
        startTag.name(); // tagName is null
    }

    @Test
    public void testStartTagNameAttr() {
        Attributes attrs = new Attributes();
        attrs.put("class", "test");
        Token.StartTag tag = new Token.StartTag().nameAttr("span", attrs);
        assertEquals("span", tag.name());
        assertSame(attrs, tag.getAttributes());
    }

    @Test
    public void testStartTagReset() {
        startTag.name("div");
        startTag.selfClosing = true;
        startTag.newAttribute(); // sets pending stuff
        startTag.reset();
        assertNull(startTag.getAttributes()); // reset sets attributes = new Attributes() but then super.reset() sets attributes = null, then StartTag.reset() sets attributes = new Attributes() again
        // Actually StartTag.reset() calls super.reset() (Tag.reset()) which sets attributes = null, then assigns attributes = new Attributes()
        assertNotNull(startTag.getAttributes());
        assertFalse(startTag.isSelfClosing());
    }

    @Test
    public void testStartTagToString() {
        startTag.name("img");
        startTag.getAttributes().put("src", "a.png");
        assertEquals("<img src=\"a.png\">", startTag.toString());
    }

    @Test
    public void testStartTagToStringNoAttrs() {
        startTag.name("br");
        assertEquals("<br>", startTag.toString());
    }

    // --- EndTag tests ---
    @Test
    public void testEndTagName() {
        endTag.name("p");
        assertEquals("p", endTag.name());
        assertEquals("p", endTag.normalName());
    }

    @Test
    public void testEndTagReset() {
        endTag.name("div");
        endTag.selfClosing = true;
        endTag.newAttribute();
        endTag.reset();
        assertNull(endTag.getAttributes());
        assertFalse(endTag.isSelfClosing());
    }

    @Test
    public void testEndTagToString() {
        endTag.name("div");
        assertEquals("</div>", endTag.toString());
    }

    // --- Tag common (via StartTag) ---
    @Test
    public void testTagNewAttributeBoolean() {
        startTag.name("input");
        startTag.appendAttributeName("disabled");
        // no value set, so should become BooleanAttribute
        startTag.newAttribute();
        assertEquals(1, startTag.getAttributes().size());
        assertTrue(startTag.getAttributes().get("disabled") instanceof BooleanAttribute);
    }

    @Test
    public void testTagNewAttributeWithValue() {
        startTag.name("a");
        startTag.appendAttributeName("href");
        startTag.appendAttributeValue("http://example.com");
        startTag.newAttribute();
        assertEquals("http://example.com", startTag.getAttributes().get("href"));
    }

    @Test
    public void testTagNewAttributeEmptyValue() {
        startTag.name("div");
        startTag.appendAttributeName("hidden");
        startTag.setEmptyAttributeValue();
        startTag.newAttribute();
        assertEquals("", startTag.getAttributes().get("hidden"));
    }

    @Test
    public void testTagFinaliseTagClearsPending() {
        startTag.name("div");
        startTag.appendAttributeName("id");
        startTag.appendAttributeValue("main");
        startTag.finaliseTag();
        assertEquals("main", startTag.getAttributes().get("id"));
        // after finalise, pending cleared
    }

    @Test
    public void testTagFinaliseTagNoPending() {
        startTag.name("div");
        startTag.finaliseTag();
        assertNull(startTag.getAttributes());
    }

    @Test
    public void testTagAppendAttributeName() {
        startTag.appendAttributeName("data");
        startTag.appendAttributeName("-value");
        startTag.newAttribute();
        assertEquals("data-value", startTag.getAttributes().get("data-value"));
    }

    @Test
    public void testTagAppendAttributeValueInitial() {
        startTag.appendAttributeName("class");
        startTag.appendAttributeValue("foo");
        // first call uses pendingAttributeValueS
        startTag.appendAttributeValue("bar");
        // second call goes to builder
        startTag.newAttribute();
        assertEquals("foobar", startTag.getAttributes().get("class"));
    }

    @Test
    public void testTagAppendAttributeValueChar() {
        startTag.appendAttributeName("id");
        startTag.appendAttributeValue('x');
        startTag.newAttribute();
        assertEquals("x", startTag.getAttributes().get("id"));
    }

    @Test
    public void testTagSetEmptyAttributeValue() {
        startTag.appendAttributeName("disabled");
        startTag.setEmptyAttributeValue();
        startTag.newAttribute();
        assertEquals("", startTag.getAttributes().get("disabled"));
    }

    @Test
    public void testTagIsSelfClosing() {
        assertFalse(startTag.isSelfClosing());
        startTag.selfClosing = true;
        assertTrue(startTag.isSelfClosing());
    }

    @Test
    public void testTagAppendTagName() {
        startTag.appendTagName("di");
        startTag.appendTagName("v");
        assertEquals("div", startTag.name());
        assertEquals("div", startTag.normalName());
    }

    @Test
    public void testTagAppendTagNameChar() {
        startTag.appendTagName('b');
        assertEquals("b", startTag.name());
    }

    // --- Character tests ---
    @Test
    public void testCharacterData() {
        character.data("text");
        assertEquals("text", character.getData());
    }

    @Test
    public void testCharacterReset() {
        character.data("temp");
        character.reset();
        assertNull(character.getData());
    }

    @Test
    public void testCharacterToString() {
        character.data("hello");
        assertEquals("hello", character.toString());
    }

    // --- Comment tests ---
    @Test
    public void testCommentData() {
        comment.data.append("note");
        assertEquals("note", comment.getData());
    }

    @Test
    public void testCommentReset() {
        comment.data.append("temp");
        comment.bogus = true;
        comment.reset();
        assertEquals("", comment.getData());
        assertFalse(comment.bogus);
    }

    @Test
    public void testCommentBogus() {
        assertFalse(comment.bogus);
        comment.bogus = true;
        assertTrue(comment.bogus);
    }

    @Test
    public void testCommentToString() {
        comment.data.append("hello");
        assertEquals("<!--hello-->", comment.toString());
    }

    // --- EOF tests ---
    @Test
    public void testEOFReset() {
        assertSame(eof, eof.reset());
    }

    @Test
    public void testEOFType() {
        assertEquals(Token.TokenType.EOF, eof.type);
    }

    // --- Token type checks ---
    @Test
    public void testTokenTypeDoctype() {
        assertTrue(doctype.isDoctype());
        assertFalse(doctype.isStartTag());
        assertFalse(doctype.isEndTag());
        assertFalse(doctype.isComment());
        assertFalse(doctype.isCharacter());
        assertFalse(doctype.isEOF());
    }

    @Test
    public void testTokenTypeStartTag() {
        assertTrue(startTag.isStartTag());
        assertFalse(startTag.isDoctype());
    }

    @Test
    public void testTokenTypeEndTag() {
        assertTrue(endTag.isEndTag());
    }

    @Test
    public void testTokenTypeComment() {
        assertTrue(comment.isComment());
    }

    @Test
    public void testTokenTypeCharacter() {
        assertTrue(character.isCharacter());
    }

    @Test
    public void testTokenTypeEOF() {
        assertTrue(eof.isEOF());
    }

    @Test
    public void testAsDoctype() {
        assertSame(doctype, doctype.asDoctype());
    }

    @Test
    public void testAsStartTag() {
        assertSame(startTag, startTag.asStartTag());
    }

    @Test
    public void testAsEndTag() {
        assertSame(endTag, endTag.asEndTag());
    }

    @Test
    public void testAsComment() {
        assertSame(comment, comment.asComment());
    }

    @Test
    public void testAsCharacter() {
        assertSame(character, character.asCharacter());
    }

    @Test
    public void testTokenType() {
        assertEquals("Doctype", doctype.tokenType());
        assertEquals("StartTag", startTag.tokenType());
        assertEquals("EndTag", endTag.tokenType());
        assertEquals("Comment", comment.tokenType());
        assertEquals("Character", character.tokenType());
        assertEquals("EOF", eof.tokenType());
    }

    @Test
    public void testTagGetAttributesNull() {
        assertNull(endTag.getAttributes());
    }

    @Test
    public void testTagAppendAttributeValueIntArray() {
        startTag.appendAttributeName("data");
        startTag.appendAttributeValue(new int[]{65, 66}); // 'A', 'B'
        startTag.newAttribute();
        assertEquals("AB", startTag.getAttributes().get("data"));
    }

    @Test
    public void testTagAppendAttributeValueCharArray() {
        startTag.appendAttributeName("data");
        startTag.appendAttributeValue(new char[]{'x', 'y'});
        startTag.newAttribute();
        assertEquals("xy", startTag.getAttributes().get("data"));
    }

    @Test
    public void testTagMultipleNewAttributes() {
        startTag.name("div");
        startTag.appendAttributeName("class");
        startTag.appendAttributeValue("main");
        startTag.newAttribute();
        startTag.appendAttributeName("id");
        startTag.appendAttributeValue("content");
        startTag.newAttribute();
        assertEquals(2, startTag.getAttributes().size());
        assertEquals("main", startTag.getAttributes().get("class"));
        assertEquals("content", startTag.getAttributes().get("id"));
    }
}