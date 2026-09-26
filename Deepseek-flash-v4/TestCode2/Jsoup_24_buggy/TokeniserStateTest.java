package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TokeniserStateTest {

    private StubTokeniser tokeniser;
    private StubCharacterReader reader;

    @Before
    public void setUp() {
        tokeniser = new StubTokeniser();
        reader = new StubCharacterReader();
        tokeniser.reader = reader;
    }

    // ----- Stub classes -----

    static class StubTokeniser {
        TokeniserState state;
        StubCharacterReader reader;
        StringBuilder emitted = new StringBuilder();
        StringBuilder tagPendingName = new StringBuilder();
        StringBuilder dataBuffer = new StringBuilder();
        StringBuilder commentPending = new StringBuilder();
        boolean errorCalled = false;
        boolean eofErrorCalled = false;
        boolean createdTagPending = false;
        boolean emittedTag = false;
        int transitionCount = 0;
        int advanceTransitionCount = 0;

        void advanceTransition(TokeniserState s) {
            advanceTransitionCount++;
            state = s;
        }

        void error(TokeniserState s) {
            errorCalled = true;
        }

        void eofError(TokeniserState s) {
            eofErrorCalled = true;
        }

        void emit(char c) {
            emitted.append(c);
        }

        void emit(String s) {
            emitted.append(s);
        }

        void emit(Token t) {
            if (t instanceof Token.EOF) emitted.append("EOF");
            else if (t instanceof Token.Comment) emitted.append("Comment:").append(t.data);
            else emitted.append(t.toString());
        }

        void transition(TokeniserState s) {
            transitionCount++;
            state = s;
        }

        void createTagPending(boolean start) {
            createdTagPending = true;
            tagPendingName = new StringBuilder();
        }

        void emitTagPending() {
            emittedTag = true;
            emitted.append("<tag:").append(tagPendingName.toString()).append(">");
        }

        void appendTagName(String name) {
            tagPendingName.append(name);
        }

        void appendAttributeName(char c) {
            // stub
        }

        void appendAttributeName(String s) {
            // stub
        }

        void appendAttributeValue(char c) {}
        void appendAttributeValue(String s) {}

        void newAttribute() {}

        Character consumeCharacterReference(Character additionalAllowed, boolean inAttribute) {
            // simplified: consume '&' from reader?
            if (reader.current() == 'a') {
                reader.consume();
                return 'a';
            }
            return null;
        }

        void createTempBuffer() {
            dataBuffer = new StringBuilder();
        }

        String appropriateEndTagName() {
            return "div";
        }

        boolean isAppropriateEndTagToken() {
            return tagPendingName.toString().equals(appropriateEndTagName());
        }

        void createCommentPending() {
            commentPending = new StringBuilder();
        }

        void emitCommentPending() {
            emitted.append("<!--").append(commentPending.toString()).append("-->");
        }

        void createDoctypePending() {}
        void emitDoctypePending() {}
    }

    static class StubCharacterReader {
        private String data;
        private int pos = 0;
        private boolean isEmptyFlag = false;

        void setData(String data) {
            this.data = data;
            this.pos = 0;
            this.isEmptyFlag = data.isEmpty();
        }

        char current() {
            if (pos >= data.length()) return CharacterReader.EOF;
            char c = data.charAt(pos);
            if (c == '\u0000') return TokeniserState.nullChar; // map nullChar
            return c;
        }

        char consume() {
            if (pos >= data.length()) return CharacterReader.EOF;
            return data.charAt(pos++);
        }

        void advance() {
            pos++;
        }

        String consumeToAny(char... chars) {
            StringBuilder sb = new StringBuilder();
            while (pos < data.length()) {
                char c = data.charAt(pos);
                for (char ch : chars) {
                    if (c == ch) {
                        return sb.toString();
                    }
                }
                if (c == TokeniserState.nullChar) break; // nullChar is included as delimiter
                sb.append(c);
                pos++;
            }
            return sb.toString();
        }

        String consumeTo(char c) {
            StringBuilder sb = new StringBuilder();
            while (pos < data.length()) {
                if (data.charAt(pos) == c) break;
                sb.append(data.charAt(pos++));
            }
            return sb.toString();
        }

        boolean matchesLetter() {
            if (pos >= data.length()) return false;
            char c = data.charAt(pos);
            return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
        }

        boolean matches(char c) {
            return current() == c;
        }

        boolean matchesAny(char... chars) {
            char cur = current();
            for (char c : chars) {
                if (cur == c) return true;
            }
            return false;
        }

        boolean matchConsume(String s) {
            if (data.substring(pos).startsWith(s)) {
                pos += s.length();
                return true;
            }
            return false;
        }

        boolean matchConsumeIgnoreCase(String s) {
            String sub = data.substring(pos);
            if (sub.length() >= s.length() && sub.substring(0, s.length()).equalsIgnoreCase(s)) {
                pos += s.length();
                return true;
            }
            return false;
        }

        String consumeLetterSequence() {
            StringBuilder sb = new StringBuilder();
            while (matchesLetter()) {
                sb.append(consume());
            }
            return sb.toString();
        }

        boolean isEmpty() {
            return pos >= data.length();
        }

        void unconsume() {
            if (pos > 0) pos--;
        }

        boolean containsIgnoreCase(String s) {
            // simplified
            return data.substring(pos).toLowerCase().contains(s.toLowerCase());
        }
    }

    // dummy Token classes needed by emit
    static class Token {
        public StringBuilder data = new StringBuilder();
        boolean selfClosing;
        static class EOF extends Token {}
        static class Comment extends Token {}
        static class EndTag extends Token {
            String name;
            EndTag(String name) { this.name = name; }
        }
    }

    // ----- Tests -----

    @Test
    public void testDataState() {
        // Normal character (default)
        reader.setData("hello&<");
        tokeniser.state = TokeniserState.Data;
        tokeniser.state.read(tokeniser, reader);
        assertEquals("hello", tokeniser.emitted.toString());
        // After reading default, we stay in Data? Actually default emits and stays (no transition)
        // But transition is not called; the state continues. After emit, the read method finishes.
        // We can check that reader.pos advanced past "hello"

        // Test '&' branch
        reader.setData("&");
        tokeniser.state = TokeniserState.Data;
        tokeniser.emitted = new StringBuilder();
        tokeniser.state.read(tokeniser, reader);
        assertEquals("", tokeniser.emitted.toString()); // transition to CharacterReferenceInData, no emit yet
        assertEquals(TokeniserState.CharacterReferenceInData, tokeniser.state);

        // Test '<' branch
        reader.setData("<");
        tokeniser.state = TokeniserState.Data;
        tokeniser.emitted = new StringBuilder();
        tokeniser.state.read(tokeniser, reader);
        assertEquals(TokeniserState.TagOpen, tokeniser.state);

        // Test nullChar branch
        reader.setData("\u0000");
        tokeniser.state = TokeniserState.Data;
        tokeniser.emitted = new StringBuilder();
        tokeniser.errorCalled = false;
        tokeniser.state.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertEquals("\u0000", tokeniser.emitted.toString()); // emits the null char

        // Test eof branch
        reader.setData("");
        tokeniser.state = TokeniserState.Data;
        tokeniser.emitted = new StringBuilder();
        tokeniser.state.read(tokeniser, reader);
        assertEquals("EOF", tokeniser.emitted.toString());
    }

    @Test
    public void testTagOpen() {
        // matches '!'
        reader.setData("!DOCTYPE");
        tokeniser.state = TokeniserState.Data;
        tokeniser.advanceTransitionCount = 0;
        tokeniser.state = TokeniserState.TagOpen;
        tokeniser.state.read(tokeniser, reader);
        assertEquals(TokeniserState.MarkupDeclarationOpen, tokeniser.state);
        assertEquals(1, tokeniser.advanceTransitionCount);

        // matches '/'
        reader.setData("/");
        tokeniser.state = TokeniserState.TagOpen;
        tokeniser.advanceTransitionCount = 0;
        tokeniser.state.read(tokeniser, reader);
        assertEquals(TokeniserState.EndTagOpen, tokeniser.state);

        // matches '?'
        reader.setData("?");
        tokeniser.state = TokeniserState.TagOpen;
        tokeniser.state.read(tokeniser, reader);
        assertEquals(TokeniserState.BogusComment, tokeniser.state);

        // matches letter -> tag name
        reader.setData("div>");
        tokeniser.state = TokeniserState.TagOpen;
        tokeniser.createdTagPending = false;
        tokeniser.state.read(tokeniser, reader);
        assertTrue(tokeniser.createdTagPending);
        assertEquals(TokeniserState.TagName, tokeniser.state);

        // default (not letter, not special) -> emit '<' and go to Data
        reader.setData("5");
        tokeniser.state = TokeniserState.TagOpen;
        tokeniser.emitted = new StringBuilder();
        tokeniser.errorCalled = false;
        tokeniser.state.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertEquals("<", tokeniser.emitted.toString());
        assertEquals(TokeniserState.Data, tokeniser.state);
    }

    @Test
    public void testEndTagOpen() {
        // isEmpty
        reader.setData("");
        tokeniser.state = TokeniserState.EndTagOpen;
        tokeniser.emitted = new StringBuilder();
        tokeniser.eofErrorCalled = false;
        tokeniser.state.read(tokeniser, reader);
        assertTrue(tokeniser.eofErrorCalled);
        assertEquals("</", tokeniser.emitted.toString());
        assertEquals(TokeniserState.Data, tokeniser.state);

        // matchesLetter
        reader.setData("div");
        tokeniser.state = TokeniserState.EndTagOpen;
        tokeniser.createdTagPending = false;
        tokeniser.state.read(tokeniser, reader);
        assertTrue(tokeniser.createdTagPending);
        assertEquals(TokeniserState.TagName, tokeniser.state);

        // matches '>'
        reader.setData(">");
        tokeniser.state = TokeniserState.EndTagOpen;
        tokeniser.errorCalled = false;
        tokeniser.state.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertEquals(TokeniserState.Data, tokeniser.state);

        // other
        reader.setData("$");
        tokeniser.state = TokeniserState.EndTagOpen;
        tokeniser.errorCalled = false;
        tokeniser.state.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertEquals(TokeniserState.BogusComment, tokeniser.state);
    }

    @Test
    public void testTagName() {
        // consumeToAny finds whitespace -> transition to BeforeAttributeName
        reader.setData("div class");
        tokeniser.state = TokeniserState.TagName;
        tokeniser.tagPendingName = new StringBuilder();
        tokeniser.state.read(tokeniser, reader);
        assertEquals("div", tokeniser.tagPendingName.toString());
        assertEquals(TokeniserState.BeforeAttributeName, tokeniser.state);

        // '/' branch
        reader.setData("br/");
        tokeniser.state = TokeniserState.TagName;
        tokeniser.tagPendingName = new StringBuilder();
        tokeniser.state.read(tokeniser, reader);
        assertEquals("br", tokeniser.tagPendingName.toString());
        assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.state);

        // '>' branch
        reader.setData("span>");
        tokeniser.state = TokeniserState.TagName;
        tokeniser.tagPendingName = new StringBuilder();
        tokeniser.emittedTag = false;
        tokeniser.state.read(tokeniser, reader);
        assertEquals("span", tokeniser.tagPendingName.toString());
        assertTrue(tokeniser.emittedTag);
        assertEquals(TokeniserState.Data, tokeniser.state);

        // nullChar branch
        reader.setData("ta\u0000");
        tokeniser.state = TokeniserState.TagName;
        tokeniser.tagPendingName = new StringBuilder();
        tokeniser.state.read(tokeniser, reader);
        assertEquals("ta" + Tokeniser.replacementChar, tokeniser.tagPendingName.toString());
        // after nullChar, the switch continues; next char? we consumed nullChar, but we need to see what happens
        // Actually the method does: tagName from consumeToAny (stops at nullChar), then consume() gets nullChar, then switch case nullChar: append replacementStr. No transition.
        // Since reader.pos is now at char after nullChar? We consumed one char (nullChar), so pos is at end.
        // But next iteration? Not needed.

        // eof branch
        reader.setData("img");
        tokeniser.state = TokeniserState.TagName;
        tokeniser.tagPendingName = new StringBuilder();
        tokeniser.eofErrorCalled = false;
        // We need to simulate that after consumeToAny, the next consume returns EOF.
        // Our StubCharacterReader.consume() returns EOF when at end. So:
        reader.setData("img");
        tokeniser.state.read(tokeniser, reader);
        assertTrue(tokeniser.eofErrorCalled);
        assertEquals(TokeniserState.Data, tokeniser.state);
    }

    @Test
    public void testBeforeAttributeName() {
        // Whitespace
        reader.setData("   ");
        tokeniser.state = TokeniserState.BeforeAttributeName;
        tokeniser.state.read(tokeniser, reader);
        // After consuming all whitespace, next char is EOF? Actually we consume whitespace one by one; the switch case for whitespace does nothing and returns.
        // The method loops because of implicit loop? No, each call to read processes one character. But whitespace case just returns (no transition). So state remains the same.
        assertEquals(TokeniserState.BeforeAttributeName, tokeniser.state);

        // '/' branch
        reader.setData("/");
        tokeniser.state = TokeniserState.BeforeAttributeName;
        tokeniser.state.read(tokeniser, reader);
        assertEquals(TokeniserState.SelfClosingStartTag, tokeniser.state);

        // '>' branch
        reader.setData(">");
        tokeniser.state = TokeniserState.BeforeAttributeName;
        tokeniser.emittedTag = false;
        tokeniser.state.read(tokeniser, reader);
        assertTrue(tokeniser.emittedTag);
        assertEquals(TokeniserState.Data, tokeniser.state);

        // nullChar
        reader.setData("\u0000");
        tokeniser.state = TokeniserState.BeforeAttributeName;
        tokeniser.errorCalled = false;
        tokeniser.state.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        // After nullChar, unconsume and transition to AttributeName
        assertEquals(TokeniserState.AttributeName, tokeniser.state);

        // eof
        reader.setData("");
        tokeniser.state = TokeniserState.BeforeAttributeName;
        tokeniser.eofErrorCalled = false;
        tokeniser.state.read(tokeniser, reader);
        assertTrue(tokeniser.eofErrorCalled);
        assertEquals(TokeniserState.Data, tokeniser.state);

        // Special chars (",',<,=)
        reader.setData("=");
        tokeniser.state = TokeniserState.BeforeAttributeName;
        tokeniser.errorCalled = false;
        tokeniser.state.read(tokeniser, reader);
        assertTrue(tokeniser.errorCalled);
        assertEquals(TokeniserState.AttributeName, tokeniser.state);
    }
}