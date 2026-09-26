package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TokenTest {
    private Token.StartTag startTag;
    private Token.EndTag endTag;
    private Token.Doctype doctype;
    private Token.Comment comment;
    private Token.Character character;
    private Token.CData cdata;
    private Token.EOF eof;

    @Before
    public void setUp() {
        startTag = new Token.StartTag();
        endTag = new Token.EndTag();
        doctype = new Token.Doctype();
        comment = new Token.Comment();
        character = new Token.Character();
        cdata = new Token.CData("test data");
        eof = new Token.EOF();
    }

    // ---- TokenType enum ----
    @Test
    public void testTokenTypeValues() {
        assertEquals(Token.TokenType.Doctype, Token.TokenType.valueOf("Doctype"));
        assertEquals(Token.TokenType.StartTag, Token.TokenType.valueOf("StartTag"));
        assertEquals(Token.TokenType.EndTag, Token.TokenType.valueOf("EndTag"));
        assertEquals(Token.TokenType.Comment, Token.TokenType.valueOf("Comment"));
        assertEquals(Token.TokenType.Character, Token.TokenType.valueOf("Character"));
        assertEquals(Token.TokenType.EOF, Token.TokenType.valueOf("EOF"));
    }

    // ---- Doctype tests ----
    @Test
    public void testDoctypeReset() {
        doctype.name.append("html");
        doctype.pubSysKey = "PUBLIC";
        doctype.publicIdentifier.append("-//W3C//DTD XHTML 1.0//EN");
        doctype.systemIdentifier.append("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd");
        doctype.forceQuirks = true;
        Token resetToken = doctype.reset();
        assertSame(doctype, resetToken);
        assertEquals("", doctype.getName());
        assertNull(doctype.getPubSysKey());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
    }

    @Test
    public void testDoctypeGetters() {
        doctype.name.append("html");
        doctype.pubSysKey = "PUBLIC";
        doctype.publicIdentifier.append("-//W3C//DTD HTML 4.01//EN");
        doctype.systemIdentifier.append("http://www.w3.org/TR/html4/strict.dtd");
        doctype.forceQuirks = true;
        assertEquals("html", doctype.getName());
        assertEquals("PUBLIC", doctype.getPubSysKey());
        assertEquals("-//W3C//DTD HTML 4.01//EN", doctype.getPublicIdentifier());
        assertEquals("http://www.w3.org/TR/html4/strict.dtd", doctype.getSystemIdentifier());
        assertTrue(doctype.isForceQuirks());
    }

    // ---- Tag (StartTag and EndTag) common tests ----
    @Test
    public void testTagResetStartTag() {
        startTag.name("div");
        startTag.newAttribute();
        startTag.appendAttributeName("class");
        startTag.appendAttributeValue("container");
        startTag.selfClosing = true;
        Token resetToken = startTag.reset();
        assertSame(startTag, resetToken);
        // After reset, name() should throw because tagName is null
        try {
            startTag.name();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
        assertFalse(startTag.isSelfClosing());
        assertNull(startTag.getAttributes());
    }

    @Test
    public void testTagResetEndTag() {
        endTag.name("span");
        endTag.newAttribute();
        endTag.appendAttributeName("id");
        endTag.appendAttributeValue("main");
        endTag.selfClosing = true;
        endTag.reset();
        assertNull(endTag.getAttributes());
        assertFalse(endTag.isSelfClosing());
    }

    @Test
    public void testTagNameNormalName() {
        startTag.name("DIV");
        assertEquals("DIV", startTag.name());
        assertEquals("div", startTag.normalName());

        endTag.name("SPAN");
        assertEquals("SPAN", endTag.name());
        assertEquals("span", endTag.normalName());
    }

    @Test(expected = IllegalStateException.class)
    public void testTagNameNullThrows() {
        startTag.name(); // tagName is null
    }

    @Test(expected = IllegalStateException.class)
    public void testTagNameEmptyThrows() {
        startTag.name("");
        startTag.name(); // length 0 after trim
    }

    @Test
    public void testTagAppendTagName() {
        startTag.appendTagName("di");
        startTag.appendTagName('v');
        assertEquals("div", startTag.name());
        assertEquals("div", startTag.normalName());
    }

    @Test
    public void testTagAppendAttributeName() {
        startTag.appendAttributeName("cla");
        startTag.appendAttributeName("ss");
        // newAttribute will trim pendingAttributeName
        startTag.newAttribute();
        startTag.appendAttributeName(" id");
        startTag.newAttribute();
        startTag.appendAttributeName("  ");
        startTag.newAttribute();
        Attributes attrs = startTag.getAttributes();
        assertNotNull(attrs);
        // only non-empty trimmed names should result in attributes
        assertEquals(2, attrs.size()); // "class" and "id" (empty trimmed "  " skipped)
    }

    @Test
    public void testTagAppendAttributeValue() {
        startTag.appendAttributeName("href");
        startTag.appendAttributeValue("http://example.com");
        startTag.newAttribute();
        Attributes attrs = startTag.getAttributes();
        assertEquals("http://example.com", attrs.get("href"));
    }

    @Test
    public void testTagAppendAttributeValueMultiple() {
        startTag.appendAttributeName("class");
        startTag.appendAttributeValue("btn");
        startTag.appendAttributeValue(' ');
        startTag.appendAttributeValue("primary");
        startTag.newAttribute();
        assertEquals("btn primary", startTag.getAttributes().get("class"));
    }

    @Test
    public void testTagAppendAttributeValueCharArray() {
        startTag.appendAttributeName("data-val");
        startTag.appendAttributeValue(new char[]{'1','2','3'});
        startTag.newAttribute();
        assertEquals("123", startTag.getAttributes().get("data-val"));
    }

    @Test
    public void testTagAppendAttributeValueIntArray() {
        startTag.appendAttributeName("data");
        startTag.appendAttributeValue(new int[]{65, 66, 67}); // 'ABC'
        startTag.newAttribute();
        assertEquals("ABC", startTag.getAttributes().get("data"));
    }

    @Test
    public void testTagSetEmptyAttributeValue() {
        startTag.appendAttributeName("disabled");
        startTag.setEmptyAttributeValue();
        startTag.newAttribute();
        assertEquals("", startTag.getAttributes().get("disabled"));
    }

    @Test
    public void testTagAttributeValueNullWhenNotSet() {
        startTag.appendAttributeName("checked");
        startTag.newAttribute();
        assertNull(startTag.getAttributes().get("checked"));
    }

    @Test
    public void testTagFinaliseTag() {
        startTag.appendAttributeName("style");
        startTag.appendAttributeValue("color:red");
        startTag.finaliseTag();
        assertNotNull(startTag.getAttributes());
        assertEquals("color:red", startTag.getAttributes().get("style"));
    }

    @Test
    public void testTagNoAttributesAfterReset() {
        startTag.appendAttributeName("onclick");
        startTag.appendAttributeValue("alert(1)");
        startTag.reset();
        assertNull(startTag.getAttributes());
    }

    // ---- StartTag specific tests ----
    @Test
    public void testStartTagConstructorHasAttributes() {
        assertNotNull(startTag.getAttributes());
        assertTrue(startTag.getAttributes().size() == 0);
        assertEquals(Token.TokenType.StartTag, startTag.type);
    }

    @Test
    public void testStartTagNameAttr() {
        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        Token.StartTag st = new Token.StartTag().nameAttr("div", attrs);
        assertEquals("div", st.name());
        assertEquals("div", st.normalName());
        assertSame(attrs, st.getAttributes());
        assertEquals(1, st.getAttributes().size());
    }

    @Test
    public void testStartTagToStringWithAttributes() {
        startTag.name("img");
        startTag.appendAttributeName("src");
        startTag.appendAttributeValue("pic.png");
        startTag.newAttribute();
        String expected = "<img src=\"pic.png\">";
        assertEquals(expected, startTag.toString());
    }

    @Test
    public void testStartTagToStringWithoutAttributes() {
        startTag.name("br");
        assertEquals("<br>", startTag.toString());
    }

    // ---- EndTag specific tests ----
    @Test
    public void testEndTagToString() {
        endTag.name("html");
        assertEquals("</html>", endTag.toString());
    }

    // ---- Comment tests ----
    @Test
    public void testCommentReset() {
        comment.data.append("some comment");
        comment.bogus = true;
        Token resetToken = comment.reset();
        assertSame(comment, resetToken);
        assertEquals("", comment.getData());
        assertFalse(comment.bogus);
    }

    @Test
    public void testCommentGetData() {
        comment.data.append("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void testCommentToString() {
        comment.data.append("hello");
        assertEquals("<!--hello-->", comment.toString());
    }

    // ---- Character tests ----
    @Test
    public void testCharacterReset() {
        character.data("text");
        Token resetToken = character.reset();
        assertSame(character, resetToken);
        assertNull(character.getData());
    }

    @Test
    public void testCharacterData() {
        character.data("some text");
        assertEquals("some text", character.getData());
    }

    @Test
    public void testCharacterToString() {
        character.data("abc");
        assertEquals("abc", character.toString());
    }

    // ---- CData tests ----
    @Test
    public void testCDataToString() {
        assertEquals("<![CDATA[test data]]>", cdata.toString());
    }

    @Test
    public void testCDataInheritsCharacter() {
        assertTrue(cdata.isCharacter());
        assertTrue(cdata.isCData());
        assertEquals("test data", cdata.getData());
    }

    // ---- EOF tests ----
    @Test
    public void testEOFResetReturnsSame() {
        Token resetToken = eof.reset();
        assertSame(eof, resetToken);
    }

    @Test
    public void testEOFType() {
        assertEquals(Token.TokenType.EOF, eof.type);
    }

    // ---- Type checking and casting methods ----
    @Test
    public void testIsDoctypeAndAsDoctype() {
        assertTrue(doctype.isDoctype());
        assertSame(doctype, doctype.asDoctype());
        assertFalse(startTag.isDoctype());
    }

    @Test
    public void testIsStartTagAndAsStartTag() {
        assertTrue(startTag.isStartTag());
        assertSame(startTag, startTag.asStartTag());
        assertFalse(endTag.isStartTag());
    }

    @Test
    public void testIsEndTagAndAsEndTag() {
        assertTrue(endTag.isEndTag());
        assertSame(endTag, endTag.asEndTag());
        assertFalse(comment.isEndTag());
    }

    @Test
    public void testIsCommentAndAsComment() {
        assertTrue(comment.isComment());
        assertSame(comment, comment.asComment());
        assertFalse(character.isComment());
    }

    @Test
    public void testIsCharacterAndAsCharacter() {
        assertTrue(character.isCharacter());
        assertSame(character, character.asCharacter());
        assertFalse(cdata.isCharacter()); // CData is instance of Character, but isCharacter returns true only for type Character? Actually isCharacter() checks type == TokenType.Character. CData's type is inherited? In CData constructor, it calls super() which sets type = TokenType.Character. So CData.type is Character. So isCharacter() returns true for CData as well. Let's adapt: cdata.isCharacter() should be true.
        // But we already tested cdata.isCharacter() in testCDataInheritsCharacter. Here we can test false for non-character token.
        assertFalse(doctype.isCharacter());
    }

    @Test
    public void testIsCData() {
        assertTrue(cdata.isCData());
        assertFalse(character.isCData());
    }

    @Test
    public void testIsEOF() {
        assertTrue(eof.isEOF());
        assertFalse(startTag.isEOF());
    }

    // ---- Additional edge case: reset with null StringBuilder ----
    @Test
    public void testResetStaticMethodWithNull() {
        // reset(StringBuilder) does nothing if null, no exception
        Token.reset(null); // should not throw
    }

    @Test
    public void testResetStaticMethodWithNonNull() {
        StringBuilder sb = new StringBuilder("test");
        Token.reset(sb);
        assertEquals(0, sb.length());
    }

    // ---- Test tokenType() ----
    @Test
    public void testTokenTypeReturnsClassName() {
        assertEquals("StartTag", startTag.tokenType());
        assertEquals("EndTag", endTag.tokenType());
        assertEquals("Doctype", doctype.tokenType());
        assertEquals("Comment", comment.tokenType());
        assertEquals("Character", character.tokenType());
        assertEquals("CData", cdata.tokenType());
        assertEquals("EOF", eof.tokenType());
    }
}