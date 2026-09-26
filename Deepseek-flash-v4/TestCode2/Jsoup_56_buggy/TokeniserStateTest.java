package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class TokeniserStateTest {
    private TokeniserStub tokeniser;
    private CharacterReaderStub reader;

    @Before
    public void setUp() {
        tokeniser = new TokeniserStub();
        reader = new CharacterReaderStub("");
    }

    // ----- Stub classes -----
    static class TokeniserStub {
        TokeniserState currentState;
        List<String> emitted = new ArrayList<String>();
        StringBuilder tagPendingName = new StringBuilder();
        boolean tagPendingSelfClosing;
        StringBuilder doctypeName = new StringBuilder();
        StringBuilder publicIdentifier = new StringBuilder();
        StringBuilder systemIdentifier = new StringBuilder();
        boolean forceQuirks;
        StringBuilder commentPendingData = new StringBuilder();
        boolean bogusComment;
        StringBuilder dataBuffer = new StringBuilder();
        boolean createTempBufferCalled;
        List<String> errors = new ArrayList<String>();
        boolean createCommentPendingCalled;
        boolean createDoctypePendingCalled;
        Token.Tag pendingTag;
        Token.Comment pendingComment;
        Token.Doctype pendingDoctype;

        void advanceTransition(TokeniserState state) {
            currentState = state;
        }

        void transition(TokeniserState state) {
            currentState = state;
        }

        void error(TokeniserState state) {
            errors.add("error from " + state);
        }

        void eofError(TokeniserState state) {
            errors.add("eofError from " + state);
        }

        void emit(String data) {
            emitted.add(data);
        }

        void emit(char c) {
            emitted.add(String.valueOf(c));
        }

        void emit(int[] codepoints) {
            if (codepoints != null) {
                StringBuilder sb = new StringBuilder();
                for (int cp : codepoints) {
                    sb.append((char) cp);
                }
                emitted.add(sb.toString());
            }
        }

        void emit(Token token) {
            if (token instanceof Token.EOF) {
                emitted.add("EOF");
            } else if (token instanceof Token.Comment) {
                Token.Comment c = (Token.Comment) token;
                commentPendingData = c.data;
                bogusComment = c.bogus;
            }
        }

        void createTagPending(boolean start) {
            pendingTag = new Token.Tag();
            pendingTag.isStartTag = start;
            pendingTag.name = new StringBuilder();
        }

        void createCommentPending() {
            pendingComment = new Token.Comment();
            pendingComment.data = new StringBuilder();
            createCommentPendingCalled = true;
        }

        void createDoctypePending() {
            pendingDoctype = new Token.Doctype();
            pendingDoctype.name = new StringBuilder();
            pendingDoctype.publicIdentifier = new StringBuilder();
            pendingDoctype.systemIdentifier = new StringBuilder();
            createDoctypePendingCalled = true;
        }

        void emitCommentPending() {
            if (pendingComment != null) {
                emitted.add("comment:" + pendingComment.data.toString());
                pendingComment = null;
            }
        }

        void emitDoctypePending() {
            if (pendingDoctype != null) {
                emitted.add("doctype:" + pendingDoctype.name.toString() + " pub:" + pendingDoctype.publicIdentifier.toString() + " sys:" + pendingDoctype.systemIdentifier.toString() + " forceQuirks:" + forceQuirks);
                pendingDoctype = null;
            }
        }

        void emitTagPending() {
            if (pendingTag != null) {
                String tagStr = (pendingTag.isStartTag ? "<" : "</") + pendingTag.name.toString() + (pendingTag.selfClosing ? "/" : "") + ">";
                emitted.add(tagStr);
                pendingTag = null;
            }
        }

        boolean isAppropriateEndTagToken() {
            return false; // simplified; for tests requiring true use specific stubs
        }

        String appropriateEndTagName() {
            return null;
        }

        int[] consumeCharacterReference(Character additionalAllowed, boolean inAttribute) {
            return null; // simplified
        }

        void createTempBuffer() {
            createTempBufferCalled = true;
        }

        static class Token {
            static class EOF extends Token {}
            static class Tag {
                boolean isStartTag;
                StringBuilder name = new StringBuilder();
                boolean selfClosing;
                void appendTagName(String name) { this.name.append(name); }
                void newAttribute() {}
                void appendAttributeName(char c) {}
                void appendAttributeName(String s) {}
                void setEmptyAttributeValue() {}
                void appendAttributeValue(String s) {}
                void appendAttributeValue(int[] codepoints) {}
            }
            static class Comment {
                StringBuilder data = new StringBuilder();
                boolean bogus;
            }
            static class Doctype {
                StringBuilder name = new StringBuilder();
                StringBuilder publicIdentifier = new StringBuilder();
                StringBuilder systemIdentifier = new StringBuilder();
                boolean forceQuirks;
            }
            static class EOF extends Token {}
        }
    }

    static class CharacterReaderStub {
        private String input;
        int pos;
        CharacterReaderStub(String input) { this.input = input; }
        char current() { return pos < input.length() ? input.charAt(pos) : EOF; }
        char consume() { return pos < input.length() ? input.charAt(pos++) : EOF; }
        boolean isEmpty() { return pos >= input.length(); }
        boolean matchesLetter() {
            if (pos >= input.length()) return false;
            char c = input.charAt(pos);
            return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
        }
        void advance() { if (pos < input.length()) pos++; }
        void unconsume() { if (pos > 0) pos--; }
        boolean matches(char c) { return pos < input.length() && input.charAt(pos) == c; }
        boolean matchesAny(char... chars) {
            if (pos >= input.length()) return false;
            for (char ch : chars) if (input.charAt(pos) == ch) return true;
            return false;
        }
        boolean matchConsume(String seq) {
            if (input.substring(pos).startsWith(seq)) {
                pos += seq.length();
                return true;
            }
            return false;
        }
        String consumeData() {
            int start = pos;
            while (pos < input.length() && input.charAt(pos) != '<' && input.charAt(pos) != '\u0000') {
                pos++;
            }
            return input.substring(start, pos);
        }
        String consumeToAny(char... chars) {
            int start = pos;
            while (pos < input.length()) {
                char c = input.charAt(pos);
                boolean found = false;
                for (char ch : chars) if (c == ch) { found = true; break; }
                if (found) break;
                pos++;
            }
            return input.substring(start, pos);
        }
        String consumeToAnySorted(char[] chars) { return consumeToAny(chars); }
        String consumeTagName() {
            int start = pos;
            while (pos < input.length() && (Character.isLetterOrDigit(input.charAt(pos)) || input.charAt(pos) == '-' || input.charAt(pos) == '_')) {
                pos++;
            }
            return input.substring(start, pos);
        }
        String consumeLetterSequence() {
            int start = pos;
            while (pos < input.length() && Character.isLetter(input.charAt(pos))) {
                pos++;
            }
            return input.substring(start, pos);
        }
        String consumeTo(String seq) {
            int idx = input.indexOf(seq, pos);
            if (idx == -1) {
                String result = input.substring(pos);
                pos = input.length();
                return result;
            } else {
                String result = input.substring(pos, idx);
                pos = idx;
                return result;
            }
        }
        boolean matchConsumeIgnoreCase(String seq) {
            if (input.substring(pos).toUpperCase().startsWith(seq.toUpperCase())) {
                pos += seq.length();
                return true;
            }
            return false;
        }
        static final char EOF = '\uFFFF';
    }

    // ----- Tests -----

    @Test
    public void testDataNormalCharacter() {
        reader = new CharacterReaderStub("hello");
        TokeniserState.Data.read(tokeniser, reader);
        assertEquals("Data", tokeniser.currentState.name()); // no transition on default
        assertTrue(tokeniser.emitted.contains("hello"));
        assertTrue(tokeniser.errors.isEmpty());
    }

    @Test
    public void testDataAmpersand() {
        reader = new CharacterReaderStub("&");
        TokeniserState.Data.read(tokeniser, reader);
        assertEquals("CharacterReferenceInData", tokeniser.currentState.name());
    }

    @Test
    public void testDataLessThan() {
        reader = new CharacterReaderStub("<");
        TokeniserState.Data.read(tokeniser, reader);
        assertEquals("TagOpen", tokeniser.currentState.name());
    }

    @Test
    public void testDataNullChar() {
        reader = new CharacterReaderStub("\u0000");
        TokeniserState.Data.read(tokeniser, reader);
        assertTrue(tokeniser.errors.size() > 0);
        assertTrue(tokeniser.emitted.contains("\u0000"));
        assertEquals(1, reader.pos); // consumed
        // stays in Data? no, char consumed but no transition; default: error + emit, stays Data
        assertEquals("Data", tokeniser.currentState.name());
    }

    @Test
    public void testDataEOF() {
        reader = new CharacterReaderStub("");
        reader.pos = 0;
        TokeniserState.Data.read(tokeniser, reader);
        assertTrue(tokeniser.emitted.contains("EOF"));
    }

    @Test
    public void testTagOpenLetter() {
        reader = new CharacterReaderStub("div>");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals("TagName", tokeniser.currentState.name());
        assertNotNull(tokeniser.pendingTag);
        assertTrue(tokeniser.pendingTag.isStartTag);
    }

    @Test
    public void testTagOpenExclamation() {
        reader = new CharacterReaderStub("!--");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals("MarkupDeclarationOpen", tokeniser.currentState.name());
    }

    @Test
    public void testTagOpenSlash() {
        reader = new CharacterReaderStub("/div");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals("EndTagOpen", tokeniser.currentState.name());
    }

    @Test
    public void testTagOpenBogus() {
        reader = new CharacterReaderStub("?");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals("BogusComment", tokeniser.currentState.name());
    }

    @Test
    public void testTagOpenNotLetter() {
        reader = new CharacterReaderStub("1");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals("Data", tokeniser.currentState.name());
        assertTrue(tokeniser.emitted.contains("<"));
        assertTrue(tokeniser.errors.size() > 0);
    }

    @Test
    public void testTagNameWhitespace() {
        tokeniser.createTagPending(true);
        reader = new CharacterReaderStub("div class");
        TokeniserState.TagName.read(tokeniser, reader);
        assertEquals("div", tokeniser.pendingTag.name.toString());
        assertEquals("BeforeAttributeName", tokeniser.currentState.name());
    }

    @Test
    public void testTagNameSelfClosing() {
        tokeniser.createTagPending(true);
        reader = new CharacterReaderStub("br/");
        TokeniserState.TagName.read(tokeniser, reader);
        assertEquals("br", tokeniser.pendingTag.name.toString());
        assertEquals("SelfClosingStartTag", tokeniser.currentState.name());
    }

    @Test
    public void testTagNameClose() {
        tokeniser.createTagPending(true);
        reader = new CharacterReaderStub("div>");
        TokeniserState.TagName.read(tokeniser, reader);
        assertEquals("div", tokeniser.pendingTag.name.toString());
        assertEquals("Data", tokeniser.currentState.name());
        assertTrue(tokeniser.emitted.contains("<div>"));
    }

    @Test
    public void testTagNameNullChar() {
        tokeniser.createTagPending(true);
        reader = new CharacterReaderStub("div\u0000");
        TokeniserState.TagName.read(tokeniser, reader);
        // nullChar appends replacementStr, stays in TagName
        assertTrue(tokeniser.pendingTag.name.toString().contains("\uFFFD"));
        assertEquals("TagName", tokeniser.currentState.name());
    }

    @Test
    public void testTagNameEOF() {
        tokeniser.createTagPending(true);
        reader = new CharacterReaderStub("div");
        reader.pos = 3; // simulate EOF after reading tag name
        TokeniserState.TagName.read(tokeniser, reader);
        assertEquals("Data", tokeniser.currentState.name());
        assertTrue(tokeniser.errors.size() > 0);
    }

    @Test
    public void testCommentSimple() {
        reader = new CharacterReaderStub("-- hello -->");
        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);
        // after "!--" we go to CommentStart
        assertEquals("CommentStart", tokeniser.currentState.name());
        // but we need to simulate the whole comment. For brevity test CommentStart directly:
    }

    @Test
    public void testDoctypeNormal() {
        reader = new CharacterReaderStub("DOCTYPE html>");
        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);
        // matchConsumeIgnoreCase "DOCTYPE" goes to Doctype
        assertEquals("Doctype", tokeniser.currentState.name());
    }

    @Test
    public void testDoctypeComplete() {
        tokeniser.createDoctypePending();
        reader = new CharacterReaderStub("html>");
        TokeniserState.BeforeDoctypeName.read(tokeniser, reader);
        // letter 'h' leads to DoctypeName
        assertEquals("DoctypeName", tokeniser.currentState.name());
        assertEquals("h", tokeniser.pendingDoctype.name.toString());
    }

    @Test
    public void testCdataSection() {
        reader = new CharacterReaderStub("[CDATA[content]]>");
        TokeniserState.MarkupDeclarationOpen.read(tokeniser, reader);
        assertEquals("CdataSection", tokeniser.currentState.name());
    }

    // Additional branch tests for completeness
    @Test
    public void testDataDefaultBranchConsumeData() {
        reader = new CharacterReaderStub("normal text<");
        TokeniserState.Data.read(tokeniser, reader);
        assertTrue(tokeniser.emitted.contains("normal text"));
    }

    @Test
    public void testTagOpenBogusQuestionMark() {
        reader = new CharacterReaderStub("?");
        TokeniserState.TagOpen.read(tokeniser, reader);
        assertEquals("BogusComment", tokeniser.currentState.name());
    }

    @Test
    public void testBeforeAttributeNameMultipleSpaces() {
        tokeniser.createTagPending(true);
        reader = new CharacterReaderStub("   >");
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
        assertEquals("Data", tokeniser.currentState.name());
        assertTrue(tokeniser.emitted.contains("< >"));
    }

    @Test
    public void testSelfClosingStartTag() {
        tokeniser.createTagPending(true);
        reader = new CharacterReaderStub(">");
        TokeniserState.SelfClosingStartTag.read(tokeniser, reader);
        assertTrue(tokeniser.pendingTag.selfClosing);
        assertEquals("Data", tokeniser.currentState.name());
        assertTrue(tokeniser.emitted.contains("< />"));
    }

    @Test
    public void testBogusComment() {
        reader = new CharacterReaderStub("some comment>");
        TokeniserState.BogusComment.read(tokeniser, reader);
        assertTrue(tokeniser.bogusComment);
        assertEquals("some comment", tokeniser.commentPendingData.toString());
        assertEquals("Data", tokeniser.currentState.name());
        assertTrue(tokeniser.emitted.contains("comment:some comment"));
    }

    @Test
    public void testPLAINTEXTNull() {
        reader = new CharacterReaderStub("\u0000");
        TokeniserState.PLAINTEXT.read(tokeniser, reader);
        assertTrue(tokeniser.errors.size() > 0);
        assertTrue(tokeniser.emitted.contains("\uFFFD"));
    }

    @Test
    public void testPLAINTEXTEof() {
        reader = new CharacterReaderStub("");
        TokeniserState.PLAINTEXT.read(tokeniser, reader);
        assertTrue(tokeniser.emitted.contains("EOF"));
    }

    @Test
    public void testPLAINTEXTDefault() {
        reader = new CharacterReaderStub("abc");
        TokeniserState.PLAINTEXT.read(tokeniser, reader);
        assertTrue(tokeniser.emitted.contains("abc"));
    }

    @Test
    public void testRawtextLessThan() {
        reader = new CharacterReaderStub("<");
        TokeniserState.Rawtext.read(tokeniser, reader);
        assertEquals("RawtextLessthanSign", tokeniser.currentState.name());
    }

    @Test
    public void testScriptDataLessThanSlash() {
        reader = new CharacterReaderStub("/");
        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);
        assertEquals("ScriptDataEndTagOpen", tokeniser.currentState.name());
    }

    @Test
    public void testEndTagOpenLetter() {
        reader = new CharacterReaderStub("div>");
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        assertEquals("TagName", tokeniser.currentState.name());
        assertNotNull(tokeniser.pendingTag);
        assertFalse(tokeniser.pendingTag.isStartTag);
    }

    @Test
    public void testEndTagOpenGreaterThan() {
        reader = new CharacterReaderStub(">");
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        assertEquals("Data", tokeniser.currentState.name());
        assertTrue(tokeniser.errors.size() > 0);
    }

    @Test
    public void testEndTagOpenBogus() {
        reader = new CharacterReaderStub("x");
        TokeniserState.EndTagOpen.read(tokeniser, reader);
        assertEquals("BogusComment", tokeniser.currentState.name());
    }

    @Test
    public void testAttributeNameEquals() {
        tokeniser.createTagPending(true);
        reader = new CharacterReaderStub("class=test>");
        TokeniserState.AttributeName.read(tokeniser, reader);
        assertEquals("class", tokeniser.pendingTag.name.toString());
        assertEquals("BeforeAttributeValue", tokeniser.currentState.name());
    }
}