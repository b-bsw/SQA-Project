package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokeniserStateTest {
    private static final char REPLACEMENT_CHAR = '\uFFFD';
    
    private static class FakeCharacterReader {
        private String input;
        private int pos = 0;
        private int mark = 0;
        
        FakeCharacterReader(String input) { this.input = input; }
        
        char current() { return pos < input.length() ? input.charAt(pos) : CharacterReader.EOF; }
        boolean isEmpty() { return pos >= input.length(); }
        boolean matchesLetter() { return pos < input.length() && Character.isLetter(input.charAt(pos)); }
        boolean matches(char c) { return pos < input.length() && input.charAt(pos) == c; }
        boolean matchConsume(String s) {
            if (input.substring(pos).startsWith(s)) {
                pos += s.length();
                return true;
            }
            return false;
        }
        boolean matchConsumeIgnoreCase(String s) {
            String sub = input.substring(pos);
            if (sub.regionMatches(true, 0, s, 0, s.length())) {
                pos += s.length();
                return true;
            }
            return false;
        }
        char consume() { return pos < input.length() ? input.charAt(pos++) : CharacterReader.EOF; }
        String consumeToAny(char... chars) {
            int start = pos;
            while (pos < input.length()) {
                char c = input.charAt(pos);
                for (char cc : chars) if (c == cc) break;
                if (c == chars[0]) {
                    // simplified: check all
                    boolean found = false;
                    for (char cc : chars) if (c == cc) { found = true; break; }
                    if (found) break;
                }
                pos++;
            }
            return input.substring(start, pos);
        }
        String consumeLetterSequence() {
            int start = pos;
            while (pos < input.length() && Character.isLetter(input.charAt(pos))) pos++;
            return input.substring(start, pos);
        }
        void advance() { if (pos < input.length()) pos++; }
        void unconsume() { if (pos > 0) pos--; }
        String consumeTo(String s) {
            int idx = input.indexOf(s, pos);
            if (idx == -1) idx = input.length();
            String result = input.substring(pos, idx);
            pos = idx;
            return result;
        }
        void setInput(String input) { this.input = input; this.pos = 0; }
    }
    
    private static class FakeTokenTag {
        StringBuilder tagName = new StringBuilder();
        StringBuilder attribName = new StringBuilder();
        StringBuilder attribValue = new StringBuilder();
        boolean selfClosing = false;
        boolean newAttributeCalled = false;
        void appendTagName(String s) { tagName.append(s); }
        void appendAttributeName(String s) { attribName.append(s); }
        void appendAttributeName(char c) { attribName.append(c); }
        void appendAttributeValue(String s) { attribValue.append(s); }
        void appendAttributeValue(char c) { attribValue.append(c); }
        void newAttribute() { newAttributeCalled = true; }
    }
    
    private static class FakeTokenComment {
        StringBuilder data = new StringBuilder();
    }
    
    private static class FakeTokenDoctype {
        StringBuilder name = new StringBuilder();
        StringBuilder publicIdentifier = new StringBuilder();
        StringBuilder systemIdentifier = new StringBuilder();
        boolean forceQuirks = false;
    }
    
    private static class FakeTokeniser {
        TokeniserState state;
        FakeTokenTag tagPending;
        FakeTokenComment commentPending;
        FakeTokenDoctype doctypePending;
        StringBuilder dataBuffer = new StringBuilder();
        StringBuilder emitted = new StringBuilder();
        boolean errorCalled = false;
        boolean eofErrorCalled = false;
        boolean tokenPending = false;
        int transitionCount = 0;
        
        void advanceTransition(TokeniserState s) { state = s; transitionCount++; }
        void transition(TokeniserState s) { state = s; transitionCount++; }
        void error(TokeniserState s) { errorCalled = true; }
        void eofError(TokeniserState s) { eofErrorCalled = true; }
        void emit(String s) { emitted.append(s); }
        void emit(char c) { emitted.append(c); }
        void emit(Token t) { 
            if (t instanceof Token.EOF) emitted.append("EOF");
            else if (t instanceof Token.Comment) emitted.append("Comment:"+((Token.Comment)t).data);
        }
        void createTagPending(boolean start) { tagPending = new FakeTokenTag(); tokenPending = true; }
        void createTempBuffer() { dataBuffer = new StringBuilder(); }
        void createCommentPending() { commentPending = new FakeTokenComment(); }
        void createDoctypePending() { doctypePending = new FakeTokenDoctype(); }
        boolean isAppropriateEndTagToken() { return true; } // simplify
        void emitTagPending() { emitted.append("TAG:"+tagPending.tagName); tokenPending = false; }
        void emitCommentPending() { emitted.append("COMMENT:"+commentPending.data); }
        void emitDoctypePending() { emitted.append("DOCTYPE:"+doctypePending.name); }
        Character consumeCharacterReference(Character c, boolean b) { return null; } // simplify
    }
    
    private FakeTokeniser tokeniser;
    private FakeCharacterReader reader;
    
    @Test
    public void testDataStateNormalCase() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.Data;
        reader = new FakeCharacterReader("hello");
        TokeniserState.Data.read(tokeniser, reader);
        assertEquals("hello", tokeniser.emitted.toString());
        assertEquals(TokeniserState.Data, tokeniser.state);
    }
    
    @Test
    public void testDataStateAmpersand() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.Data;
        reader = new FakeCharacterReader("&");
        TokeniserState.Data.read(tokeniser, reader);
        assertEquals(TokeniserState.CharacterReferenceInData, tokeniser.state);
    }
    
    @Test
    public void testDataStateLt() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.Data;
        reader = new FakeCharacterReader("<");
        TokeniserState.Data.read(tokeniser, reader);
        assertEquals(TokeniserState.TagOpen, tokeniser.state);
    }
    
    @Test
    public void testDataStateNullChar() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.Data;
        reader = new FakeCharacterReader("\u0000");
        TokeniserState.Data.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertEquals(REPLACEMENT_CHAR, tokeniser.emitted.charAt(0));
    }
    
    @Test
    public void testDataStateEof() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.Data;
        reader = new FakeCharacterReader("");
        TokeniserState.Data.read(tokeniser, reader);
        assertEquals("EOF", tokeniser.emitted.toString());
    }
    
    @Test
    public void testTagOpenWithLetter() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.TagOpen;
        reader = new FakeCharacterReader("div");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.TagName, tokeniser.state);
        assertNotNull(tokeniser.tagPending);
        assertTrue(tokeniser.tagPending.tagName.toString().isEmpty());
    }
    
    @Test
    public void testTagOpenWithExclamation() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.TagOpen;
        reader = new FakeCharacterReader("!");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.MarkupDeclarationOpen, tokeniser.state);
    }
    
    @Test
    public void testTagOpenWithSlash() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.TagOpen;
        reader = new FakeCharacterReader("/");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.EndTagOpen, tokeniser.state);
    }
    
    @Test
    public void testTagOpenWithQuestion() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.TagOpen;
        reader = new FakeCharacterReader("?");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals(TokeniserState.BogusComment, tokeniser.state);
    }
    
    @Test
    public void testTagOpenNonLetter() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.TagOpen;
        reader = new FakeCharacterReader("5");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertEquals("<", tokeniser.emitted.toString());
        assertEquals(TokeniserState.Data, tokeniser.state);
    }
    
    @Test
    public void testTagNameWhitespace() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.TagName;
        reader = new FakeCharacterReader("div ");
        TokeniserState.TagName.read(tokeniser, reader);
        assertEquals("div", tokeniser.tagPending.tagName.toString());
        assertEquals(TokeniserState.BeforeAttributeName, tokeniser.state);
    }
    
    @Test
    public void testTagNameSlash() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.TagName;
        reader = new FakeCharacterReader("br/");
        TokeniserState.TagName.read(tokeniser, reader);
        assertEquals("br", tokeniser.tagPending.tagName.toString());
        assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.state);
    }
    
    @Test
    public void testTagNameGt() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.TagName;
        reader = new FakeCharacterReader("p>");
        TokeniserState.TagName.read(tokeniser, reader);
        assertEquals("p", tokeniser.tagPending.tagName.toString());
        assertEquals("TAG:p", tokeniser.emitted.toString());
        assertEquals(TokeniserState.Data, tokeniser.state);
    }
    
    @Test
    public void testTagNameNull() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.TagName;
        reader = new FakeCharacterReader("a\u0000");
        TokeniserState.TagName.read(tokeniser, reader);
        assertTrue(tokeniser.tagPending.tagName.toString().contains("\uFFFD"));
    }
    
    @Test
    public void testTagNameEof() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.TagName;
        reader = new FakeCharacterReader("img");
        // simulate eof after consumeToAny
        // consumeToAny returns "img", then consume returns eof
        reader.setInput("img");
        TokeniserState.TagName.read(tokeniser, reader);
        assertTrue(tokeniser.eofErrorCalled);
        assertEquals(TokeniserState.Data, tokeniser.state);
    }
    
    @Test
    public void testBeforeAttributeNameSlash() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.BeforeAttributeName;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader("/");
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.state);
    }
    
    @Test
    public void testBeforeAttributeNameGt() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.BeforeAttributeName;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader(">");
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        assertEquals("TAG:", tokeniser.emitted.toString());
        assertEquals(TokeniserState.Data, tokeniser.state);
    }
    
    @Test
    public void testBeforeAttributeNameWhitespace() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.BeforeAttributeName;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader(" ");
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        // whitespace, stay same state
        assertEquals(TokeniserState.BeforeAttributeName, tokeniser.state);
    }
    
    @Test
    public void testBeforeAttributeNameNull() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.BeforeAttributeName;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader("\u0000");
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertTrue(tokeniser.tagPending.newAttributeCalled);
        assertEquals(TokeniserState.AttributeName, tokeniser.state);
    }
    
    @Test
    public void testBeforeAttributeNameSpecialChars() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.BeforeAttributeName;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader("\"");
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertTrue(tokeniser.tagPending.newAttributeCalled);
        assertEquals('\"', tokeniser.tagPending.attribName.charAt(0));
        assertEquals(TokeniserState.AttributeName, tokeniser.state);
    }
    
    @Test
    public void testBeforeAttributeNameDefault() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.BeforeAttributeName;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader("x");
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        assertTrue(tokeniser.tagPending.newAttributeCalled);
        assertEquals(TokeniserState.AttributeName, tokeniser.state);
    }
    
    @Test
    public void testAttributeNameEndWhitespace() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.AttributeName;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader("class ");
        TokeniserState.AttributeName.read(tokeniser, reader);
        assertEquals("class", tokeniser.tagPending.attribName.toString());
        assertEquals(TokeniserState.AfterAttributeName, tokeniser.state);
    }
    
    @Test
    public void testAttributeNameEndSlash() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.AttributeName;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader("id/");
        TokeniserState.AttributeName.read(tokeniser, reader);
        assertEquals("id", tokeniser.tagPending.attribName.toString());
        assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.state);
    }
    
    @Test
    public void testAttributeNameEndEquals() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.AttributeName;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader("hidden=");
        TokeniserState.AttributeName.read(tokeniser, reader);
        assertEquals("hidden", tokeniser.tagPending.attribName.toString());
        assertEquals(TokeniserState.BeforeAttributeValue, tokeniser.state);
    }
    
    @Test
    public void testAttributeNameEndGt() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.AttributeName;
        tokeniser.tagPending = new FakeTokenTag();
        tokeniser.tagPending.appendTagName("div");
        reader = new FakeCharacterReader("a>");
        TokeniserState.AttributeName.read(tokeniser, reader);
        assertEquals("a", tokeniser.tagPending.attribName.toString());
        assertEquals("TAG:div", tokeniser.emitted.toString());
        assertEquals(TokeniserState.Data, tokeniser.state);
    }
    
    @Test
    public void testAttributeNameNull() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.AttributeName;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader("a\u0000");
        TokeniserState.AttributeName.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertTrue(tokeniser.tagPending.attribName.toString().endsWith("\uFFFD"));
    }
    
    @Test
    public void testBeforeAttributeValueDoubleQuote() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.BeforeAttributeValue;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader("\"");
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        assertEquals(TokeniserState.AttributeValue_doubleQuoted, tokeniser.state);
    }
    
    @Test
    public void testBeforeAttributeValueSingleQuote() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.BeforeAttributeValue;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader("'");
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        assertEquals(TokeniserState.AttributeValue_singleQuoted, tokeniser.state);
    }
    
    @Test
    public void testBeforeAttributeValueUnquoted() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.BeforeAttributeValue;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader("x");
        TokeniserState.BeforeAttributeValue.read(tokeniser, reader);
        assertEquals(TokeniserState.AttributeValue_unquoted, tokeniser.state);
    }
    
    @Test
    public void testAttributeValueDoubleQuotedNormal() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.AttributeValue_doubleQuoted;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader("value\"");
        TokeniserState.AttributeValue_doubleQuoted.read(tokeniser, reader);
        assertEquals("value", tokeniser.tagPending.attribValue.toString());
        assertEquals(TokeniserState.AfterAttributeValue_quoted, tokeniser.state);
    }
    
    @Test
    public void testAttributeValueDoubleQuotedAmpersand() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.AttributeValue_doubleQuoted;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader("&amp;\"");
        TokeniserState.AttributeValue_doubleQuoted.read(tokeniser, reader);
        // consumeCharacterReference returns null, so emit '&'
        assertTrue(tokeniser.tagPending.attribValue.toString().contains("&"));
    }
    
    @Test
    public void testBeforeDoctypeNameLetter() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.BeforeDoctypeName;
        reader = new FakeCharacterReader("h");
        TokeniserState.BeforeDoctypeName.read(tokeniser, reader);
        assertEquals(TokeniserState.DoctypeName, tokeniser.state);
        assertNotNull(tokeniser.doctypePending);
    }
    
    @Test
    public void testDoctypeNameGt() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.DoctypeName;
        tokeniser.doctypePending = new FakeTokenDoctype();
        reader = new FakeCharacterReader("html>");
        TokeniserState.DoctypeName.read(tokeniser, reader);
        assertEquals("html", tokeniser.doctypePending.name.toString());
        assertEquals("DOCTYPE:html", tokeniser.emitted.toString());
        assertEquals(TokeniserState.Data, tokeniser.state);
    }
    
    @Test
    public void testDoctypeNameWhitespace() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.DoctypeName;
        tokeniser.doctypePending = new FakeTokenDoctype();
        reader = new FakeCharacterReader("html ");
        TokeniserState.DoctypeName.read(tokeniser, reader);
        assertEquals("html", tokeniser.doctypePending.name.toString());
        assertEquals(TokeniserState.AfterDoctypeName, tokeniser.state);
    }
    
    @Test
    public void testCommentStartDash() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.CommentStart;
        tokeniser.commentPending = new FakeTokenComment();
        reader = new FakeCharacterReader("-");
        TokeniserState.CommentStart.read(tokeniser, reader);
        assertEquals(TokeniserState.CommentStartDash, tokeniser.state);
    }
    
    @Test
    public void testCommentStartNull() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.CommentStart;
        tokeniser.commentPending = new FakeTokenComment();
        reader = new FakeCharacterReader("\u0000");
        TokeniserState.CommentStart.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertEquals(TokeniserState.Comment, tokeniser.state);
        assertEquals('\uFFFD', (char)tokeniser.commentPending.data.charAt(0));
    }
    
    @Test
    public void testCommentStartGt() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.CommentStart;
        tokeniser.commentPending = new FakeTokenComment();
        reader = new FakeCharacterReader(">");
        TokeniserState.CommentStart.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertEquals("COMMENT:", tokeniser.emitted.toString());
        assertEquals(TokeniserState.Data, tokeniser.state);
    }
    
    @Test
    public void testCommentStartEof() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.CommentStart;
        tokeniser.commentPending = new FakeTokenComment();
        reader = new FakeCharacterReader("");
        TokeniserState.CommentStart.read(tokeniser, reader);
        assertTrue(tokeniser.eofErrorCalled);
        assertEquals("COMMENT:", tokeniser.emitted.toString());
        assertEquals(TokeniserState.Data, tokeniser.state);
    }
    
    @Test
    public void testCommentStartDefault() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.CommentStart;
        tokeniser.commentPending = new FakeTokenComment();
        reader = new FakeCharacterReader("a");
        TokeniserState.CommentStart.read(tokeniser, reader);
        assertEquals('a', (char)tokeniser.commentPending.data.charAt(0));
        assertEquals(TokeniserState.Comment, tokeniser.state);
    }
    
    @Test
    public void testCommentEndGt() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.CommentEnd;
        tokeniser.commentPending = new FakeTokenComment();
        tokeniser.commentPending.data.append("x");
        reader = new FakeCharacterReader(">");
        TokeniserState.CommentEnd.read(tokeniser, reader);
        assertEquals("COMMENT:x", tokeniser.emitted.toString());
        assertEquals(TokeniserState.Data, tokeniser.state);
    }
    
    @Test
    public void testCommentEndNull() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.CommentEnd;
        tokeniser.commentPending = new FakeTokenComment();
        tokeniser.commentPending.data.append("x");
        reader = new FakeCharacterReader("\u0000");
        TokeniserState.CommentEnd.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertTrue(tokeniser.commentPending.data.toString().contains("--\uFFFD"));
        assertEquals(TokeniserState.Comment, tokeniser.state);
    }
    
    @Test
    public void testCommentEndBang() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.CommentEnd;
        tokeniser.commentPending = new FakeTokenComment();
        reader = new FakeCharacterReader("!");
        TokeniserState.CommentEnd.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertEquals(TokeniserState.CommentEndBang, tokeniser.state);
    }
    
    @Test
    public void testCommentEndExtraDash() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.CommentEnd;
        tokeniser.commentPending = new FakeTokenComment();
        reader = new FakeCharacterReader("-");
        TokeniserState.CommentEnd.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertEquals('-', (char)tokeniser.commentPending.data.charAt(0));
    }
    
    @Test
    public void testCommentEndDefault() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.CommentEnd;
        tokeniser.commentPending = new FakeTokenComment();
        reader = new FakeCharacterReader("x");
        TokeniserState.CommentEnd.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertTrue(tokeniser.commentPending.data.toString().contains("--x"));
        assertEquals(TokeniserState.Comment, tokeniser.state);
    }
    
    @Test
    public void testSelfClosingStartTagGt() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.SelfClosingStartTag;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader(">");
        TokeniserState.SelfClosingStartTag.read(tokeniser, reader);
        assertTrue(tokeniser.tagPending.selfClosing);
        assertEquals("TAG:", tokeniser.emitted.toString());
        assertEquals(TokeniserState.Data, tokeniser.state);
    }
    
    @Test
    public void testSelfClosingStartTagEof() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.SelfClosingStartTag;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader("");
        TokeniserState.SelfClosingStartTag.read(tokeniser, reader);
        assertTrue(tokeniser.eofErrorCalled);
        assertEquals(TokeniserState.Data, tokeniser.state);
    }
    
    @Test
    public void testSelfClosingStartTagDefault() {
        tokeniser = new FakeTokeniser();
        tokeniser.state = TokeniserState.SelfClosingStartTag;
        tokeniser.tagPending = new FakeTokenTag();
        reader = new FakeCharacterReader("x");
        TokeniserState.SelfClosingStartTag.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertEquals(TokeniserState.BeforeAttributeName, tokeniser.state);
    }
}