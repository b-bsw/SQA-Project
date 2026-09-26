package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class TokeniserStateTest {

    static class TestCharacterReader {
        private String input;
        private int pos;
        static final char EOF = (char) -1;

        TestCharacterReader(String input) { this.input = input; this.pos = 0; }

        char current() { return pos < input.length() ? input.charAt(pos) : EOF; }

        char consume() { return pos < input.length() ? input.charAt(pos++) : EOF; }

        String consumeToAny(char... targets) {
            int start = pos;
            while (pos < input.length()) {
                char c = input.charAt(pos);
                boolean found = false;
                for (char t : targets) {
                    if (c == t) { found = true; break; }
                }
                if (found) break;
                pos++;
            }
            return input.substring(start, pos);
        }

        String consumeTo(String s) {
            int idx = input.indexOf(s, pos);
            if (idx == -1) {
                String result = input.substring(pos);
                pos = input.length();
                return result;
            }
            String result = input.substring(pos, idx);
            pos = idx;
            return result;
        }

        boolean isEmpty() { return pos >= input.length(); }

        boolean matchesLetter() { return pos < input.length() && Character.isLetter(input.charAt(pos)); }

        boolean matches(char c) { return pos < input.length() && input.charAt(pos) == c; }

        boolean matchConsume(String s) {
            if (input.regionMatches(pos, s, 0, s.length())) {
                pos += s.length();
                return true;
            }
            return false;
        }

        boolean matchConsumeIgnoreCase(String s) {
            if (input.regionMatches(true, pos, s, 0, s.length())) {
                pos += s.length();
                return true;
            }
            return false;
        }

        void unconsume() { if (pos > 0) pos--; }

        void advance() { pos++; }

        String consumeLetterSequence() {
            int start = pos;
            while (pos < input.length() && Character.isLetter(input.charAt(pos))) pos++;
            return input.substring(start, pos);
        }

        boolean containsIgnoreCase(String s) {
            return input.toLowerCase().contains(s.toLowerCase());
        }
    }

    static class TestTagPending {
        boolean isStart;
        StringBuilder tagName = new StringBuilder();
        boolean newAttributeCalled;
        StringBuilder attributeName = new StringBuilder();
        StringBuilder attributeValue = new StringBuilder();
        boolean selfClosing;

        void appendTagName(String s) { tagName.append(s); }

        void newAttribute() { newAttributeCalled = true; }

        void appendAttributeName(char c) { attributeName.append(c); }

        void appendAttributeName(String s) { attributeName.append(s); }

        void appendAttributeValue(char c) { attributeValue.append(c); }

        void appendAttributeValue(String s) { attributeValue.append(s); }
    }

    static class TestCommentPending {
        StringBuilder data = new StringBuilder();
    }

    static class TestDoctypePending {
        StringBuilder name = new StringBuilder();
        StringBuilder publicIdentifier = new StringBuilder();
        StringBuilder systemIdentifier = new StringBuilder();
        boolean forceQuirks;
    }

    static class TestTokeniser {
        TokeniserState state;
        boolean errorFlagged;
        List<Object> emitted = new ArrayList<>();
        TestTagPending tagPending;
        TestCommentPending commentPending;
        TestDoctypePending doctypePending;
        StringBuilder dataBuffer = new StringBuilder();
        boolean tempBufferCreated;
        Character consumeCharacterReferenceResult;
        boolean isAppropriateEndTagTokenResult;
        String appropriateEndTagName;

        void advanceTransition(TokeniserState s) { state = s; }

        void transition(TokeniserState s) { state = s; }

        void error(TokeniserState s) { errorFlagged = true; }

        void emit(Object o) { emitted.add(o); }

        void createTagPending(boolean isStart) {
            tagPending = new TestTagPending();
            tagPending.isStart = isStart;
        }

        void createCommentPending() { commentPending = new TestCommentPending(); }

        void createDoctypePending() { doctypePending = new TestDoctypePending(); }

        void emitTagPending() { emit(tagPending); }

        void emitCommentPending() { emit(commentPending); }

        void emitDoctypePending() { emit(doctypePending); }

        void createTempBuffer() { tempBufferCreated = true; }

        boolean isAppropriateEndTagToken() { return isAppropriateEndTagTokenResult; }

        String appropriateEndTagName() { return appropriateEndTagName; }

        Character consumeCharacterReference(Character c, boolean b) { return consumeCharacterReferenceResult; }

        void eofError(TokeniserState s) { error(s); }
    }

    private TestTokeniser t;

    @Before
    public void setUp() {
        t = new TestTokeniser();
        t.state = TokeniserState.Data;
    }

    private TestCharacterReader r(String s) { return new TestCharacterReader(s); }

    @Test
    public void testDataNormal() {
        TokeniserState.Data.read(t, r("hello"));
        assertEquals(1, t.emitted.size());
        assertEquals("hello", t.emitted.get(0));
        assertEquals(TokeniserState.Data, t.state);
    }

    @Test
    public void testDataAmpersand() {
        TokeniserState.Data.read(t, r("&"));
        assertEquals(TokeniserState.CharacterReferenceInData, t.state);
        assertTrue(t.emitted.isEmpty());
    }

    @Test
    public void testDataLessThan() {
        TokeniserState.Data.read(t, r("<"));
        assertEquals(TokeniserState.TagOpen, t.state);
    }

    @Test
    public void testDataNullChar() {
        TestCharacterReader reader = r("\u0000");
        TokeniserState.Data.read(t, reader);
        assertTrue(t.errorFlagged);
        assertEquals(1, t.emitted.size());
        assertEquals('\u0000', ((Character) t.emitted.get(0)).charValue());
        assertTrue(reader.isEmpty());
        assertEquals(TokeniserState.Data, t.state);
    }

    @Test
    public void testDataEOF() {
        TokeniserState.Data.read(t, r(""));
        assertEquals(1, t.emitted.size());
        assertTrue(t.emitted.get(0) instanceof Token.EOF);
        assertEquals(TokeniserState.Data, t.state);
    }

    @Test
    public void testTagOpenExclamation() {
        TokeniserState.TagOpen.read(t, r("!"));
        assertEquals(TokeniserState.MarkupDeclarationOpen, t.state);
    }

    @Test
    public void testTagOpenSlash() {
        TokeniserState.TagOpen.read(t, r("/"));
        assertEquals(TokeniserState.EndTagOpen, t.state);
    }

    @Test
    public void testTagOpenQuestion() {
        TokeniserState.TagOpen.read(t, r("?"));
        assertEquals(TokeniserState.BogusComment, t.state);
    }

    @Test
    public void testTagOpenLetter() {
        TokeniserState.TagOpen.read(t, r("a"));
        assertNotNull(t.tagPending);
        assertTrue(t.tagPending.isStart);
        assertEquals(TokeniserState.TagName, t.state);
    }

    @Test
    public void testTagOpenOther() {
        TokeniserState.TagOpen.read(t, r("1"));
        assertTrue(t.errorFlagged);
        assertEquals(1, t.emitted.size());
        assertEquals('<', ((Character) t.emitted.get(0)).charValue());
        assertEquals(TokeniserState.Data, t.state);
    }

    @Test
    public void testEndTagOpenEmpty() {
        t.state = TokeniserState.EndTagOpen;
        TokeniserState.EndTagOpen.read(t, r(""));
        assertTrue(t.errorFlagged);
        assertEquals(1, t.emitted.size());
        assertEquals("</", t.emitted.get(0));
        assertEquals(TokeniserState.Data, t.state);
    }

    @Test
    public void testEndTagOpenLetter() {
        t.state = TokeniserState.EndTagOpen;
        TokeniserState.EndTagOpen.read(t, r("a"));
        assertNotNull(t.tagPending);
        assertFalse(t.tagPending.isStart);
        assertEquals(TokeniserState.TagName, t.state);
    }

    @Test
    public void testEndTagOpenGt() {
        t.state = TokeniserState.EndTagOpen;
        TokeniserState.EndTagOpen.read(t, r(">"));
        assertTrue(t.errorFlagged);
        assertEquals(TokeniserState.Data, t.state);
    }

    @Test
    public void testEndTagOpenOther() {
        t.state = TokeniserState.EndTagOpen;
        TokeniserState.EndTagOpen.read(t, r("!"));
        assertTrue(t.errorFlagged);
        assertEquals(TokeniserState.BogusComment, t.state);
    }

    @Test
    public void testTagNameNormal() {
        t.state = TokeniserState.TagName;
        t.createTagPending(true);
        TestCharacterReader reader = r("div>");
        TokeniserState.TagName.read(t, reader);
        assertEquals("div", t.tagPending.tagName.toString());
        assertEquals(1, t.emitted.size());
        assertTrue(t.emitted.get(0) instanceof TestTagPending);
        assertEquals(TokeniserState.Data, t.state);
    }

    @Test
    public void testTagNameSpace() {
        t.state = TokeniserState.TagName;
        t.createTagPending(true);
        TestCharacterReader reader = r("div ");
        TokeniserState.TagName.read(t, reader);
        assertEquals("div", t.tagPending.tagName.toString());
        assertEquals(TokeniserState.BeforeAttributeName, t.state);
    }

    @Test
    public void testTagNameSlash() {
        t.state = TokeniserState.TagName;
        t.createTagPending(true);
        TestCharacterReader reader = r("div/");
        TokeniserState.TagName.read(t, reader);
        assertEquals("div", t.tagPending.tagName.toString());
        assertEquals(TokeniserState.SelfClosingStartTag, t.state);
    }

    @Test
    public void testTagNameNull() {
        t.state = TokeniserState.TagName;
        t.createTagPending(true);
        TestCharacterReader reader = r("div\u0000");
        TokeniserState.TagName.read(t, reader);
        assertEquals("div" + String.valueOf(Tokeniser.replacementChar), t.tagPending.tagName.toString());
        assertEquals(TokeniserState.TagName, t.state);
    }

    @Test
    public void testTagNameEOF() {
        t.state = TokeniserState.TagName;
        t.createTagPending(true);
        TestCharacterReader reader = r("div");
        TokeniserState.TagName.read(t, reader);
        assertEquals("div", t.tagPending.tagName.toString());
        assertTrue(t.errorFlagged);
        assertEquals(TokeniserState.Data, t.state);
    }

    @Test
    public void testBeforeAttributeNameSpace() {
        t.state = TokeniserState.BeforeAttributeName;
        t.tagPending = new TestTagPending();
        TestCharacterReader reader = r(" ");
        TokeniserState.BeforeAttributeName.read(t, reader);
        assertEquals(TokeniserState.BeforeAttributeName, t.state);
        assertNull(t.tagPending.attributeName);
    }

    @Test
    public void testBeforeAttributeNameSlash() {
        t.state = TokeniserState.BeforeAttributeName;
        t.tagPending = new TestTagPending();
        TestCharacterReader reader = r("/");
        TokeniserState.BeforeAttributeName.read(t, reader);
        assertEquals(TokeniserState.SelfClosingStartTag, t.state);
    }

    @Test
    public void testBeforeAttributeNameGt() {
        t.state = TokeniserState.BeforeAttributeName;
        t.createTagPending(true);
        TestCharacterReader reader = r(">");
        TokeniserState.BeforeAttributeName.read(t, reader);
        assertEquals(1, t.emitted.size());
        assertEquals(TokeniserState.Data, t.state);
    }

    @Test
    public void testBeforeAttributeNameNull() {
        t.state = TokeniserState.BeforeAttributeName;
        t.tagPending = new TestTagPending();
        TestCharacterReader reader = r("\u0000");
        TokeniserState.BeforeAttributeName.read(t, reader);
        assertTrue(t.errorFlagged);
        assertTrue(t.tagPending.newAttributeCalled);
        assertEquals(TokeniserState.AttributeName, t.state);
    }

    @Test
    public void testBeforeAttributeNameSpecial() {
        t.state = TokeniserState.BeforeAttributeName;
        t.tagPending = new TestTagPending();
        TestCharacterReader reader = r("\"");
        TokeniserState.BeforeAttributeName.read(t, reader);
        assertTrue(t.errorFlagged);
        assertEquals(TokeniserState.AttributeName, t.state);
        assertEquals('"', t.tagPending.attributeName.charAt(0));
    }

    @Test
    public void testAttributeNameNormal() {
        t.state = TokeniserState.AttributeName;
        t.tagPending = new TestTagPending();
        TestCharacterReader reader = r("class= ");
        TokeniserState.AttributeName.read(t, reader);
        assertEquals("class", t.tagPending.attributeName.toString());
        assertEquals(TokeniserState.BeforeAttributeValue, t.state);
    }

    @Test
    public void testAttributeNameSpace() {
        t.state = TokeniserState.AttributeName;
        t.tagPending = new TestTagPending();
        TestCharacterReader reader = r("class ");
        TokeniserState.AttributeName.read(t, reader);
        assertEquals("class", t.tagPending.attributeName.toString());
        assertEquals(TokeniserState.AfterAttributeName, t.state);
    }

    @Test
    public void testAttributeNameSlash() {
        t.state = TokeniserState.AttributeName;
        t.tagPending = new TestTagPending();
        TestCharacterReader reader = r("class/");
        TokeniserState.AttributeName.read(t, reader);
        assertEquals("class", t.tagPending.attributeName.toString());
        assertEquals(TokeniserState.SelfClosingStartTag, t.state);
    }

    @Test
    public void testAttributeNameGt() {
        t.state = TokeniserState.AttributeName;
        t.createTagPending(true);
        TestCharacterReader reader = r("class>");
        TokeniserState.AttributeName.read(t, reader);
        assertEquals("class", t.tagPending.attributeName.toString());
        assertEquals(1, t.emitted.size());
        assertEquals(TokeniserState.Data, t.state);
    }

    @Test
    public void testAttributeNameNull() {
        t.state = TokeniserState.AttributeName;
        t.tagPending = new TestTagPending();
        TestCharacterReader reader = r("class\u0000");
        TokeniserState.AttributeName.read(t, reader);
        assertEquals("class", t.tagPending.attributeName.toString());
        assertTrue(t.errorFlagged);
        // after null, replacementChar appended? not needed as we already consumed null
        assertEquals(TokeniserState.AttributeName, t.state);
    }

    @Test
    public void testAttributeValueDoubleQuotedSimple() {
        t.state = TokeniserState.AttributeValue_doubleQuoted;
        t.tagPending = new TestTagPending();
        TestCharacterReader reader = r("value\"");
        TokeniserState.AttributeValue_doubleQuoted.read(t, reader);
        assertEquals("value", t.tagPending.attributeValue.toString());
        assertEquals(TokeniserState.AfterAttributeValue_quoted, t.state);
    }

    @Test
    public void testAttributeValueDoubleQuotedAmp() {
        t.state = TokeniserState.AttributeValue_doubleQuoted;
        t.tagPending = new TestTagPending();
        t.consumeCharacterReferenceResult = 'a';
        TestCharacterReader reader = r("val&ue\"");
        TokeniserState.AttributeValue_doubleQuoted.read(t, reader);
        assertEquals("val", t.tagPending.attributeValue.toString());
        // after processing &, attributeValue should have 'a' appended
        assertEquals("vala", t.tagPending.attributeValue.toString());
        assertEquals(TokeniserState.AttributeValue_doubleQuoted, t.state);
    }

    @Test
    public void testAttributeValueDoubleQuotedNull() {
        t.state = TokeniserState.AttributeValue_doubleQuoted;
        t.tagPending = new TestTagPending();
        TestCharacterReader reader = r("val\u0000\"");
        TokeniserState.AttributeValue_doubleQuoted.read(t, reader);
        assertTrue(t.errorFlagged);
        // replacementChar appended after null
        assertTrue(t.tagPending.attributeValue.toString().contains(String.valueOf(Tokeniser.replacementChar)));
        assertEquals(TokeniserState.AttributeValue_doubleQuoted, t.state);
    }

    @Test
    public void testCommentStartNormal() {
        t.state = TokeniserState.CommentStart;
        t.createCommentPending();
        TestCharacterReader reader = r("a");
        TokeniserState.CommentStart.read(t, reader);
        assertEquals("a", t.commentPending.data.toString());
        assertEquals(TokeniserState.Comment, t.state);
    }

    @Test
    public void testCommentStartDash() {
        t.state = TokeniserState.CommentStart;
        t.createCommentPending();
        TestCharacterReader reader = r("-");
        TokeniserState.CommentStart.read(t, reader);
        assertEquals(TokeniserState.CommentStartDash, t.state);
    }

    @Test
    public void testCommentStartNull() {
        t.state = TokeniserState.CommentStart;
        t.createCommentPending();
        TestCharacterReader reader = r("\u0000");
        TokeniserState.CommentStart.read(t, reader);
        assertTrue(t.errorFlagged);
        assertTrue(t.commentPending.data.toString().contains(String.valueOf(Tokeniser.replacementChar)));
        assertEquals(TokeniserState.Comment, t.state);
    }

    @Test
    public void testCommentStartGt() {
        t.state = TokeniserState.CommentStart;
        t.createCommentPending();
        TestCharacterReader reader = r(">");
        TokeniserState.CommentStart.read(t, reader);
        assertTrue(t.errorFlagged);
        assertEquals(1, t.emitted.size());
        assertTrue(t.emitted.get(0) instanceof TestCommentPending);
        assertEquals(TokeniserState.Data, t.state);
    }

    @Test
    public void testCommentStartEOF() {
        t.state = TokeniserState.CommentStart;
        t.createCommentPending();
        TestCharacterReader reader = r("");
        TokeniserState.CommentStart.read(t, reader);
        assertTrue(t.errorFlagged);
        assertEquals(1, t.emitted.size());
        assertEquals(TokeniserState.Data, t.state);
    }

    @Test
    public void testDoctypeSpace() {
        t.state = TokeniserState.Doctype;
        TestCharacterReader reader = r(" ");
        TokeniserState.Doctype.read(t, reader);
        assertEquals(TokeniserState.BeforeDoctypeName, t.state);
    }

    @Test
    public void testDoctypeEOF() {
        t.state = TokeniserState.Doctype;
        TestCharacterReader reader = r("");
        TokeniserState.Doctype.read(t, reader);
        assertTrue(t.errorFlagged);
        assertNotNull(t.doctypePending);
        assertTrue(t.doctypePending.forceQuirks);
        assertEquals(1, t.emitted.size());
        assertEquals(TokeniserState.Data, t.state);
    }
}