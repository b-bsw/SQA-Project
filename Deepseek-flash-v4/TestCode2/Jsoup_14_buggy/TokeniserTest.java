package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Entities;
import java.util.List;

public class TokeniserTest {

    static class FakeCharacterReader extends CharacterReader {
        private String input;
        private int pos;
        private int markPos;

        public FakeCharacterReader(String input) {
            super("");
            this.input = input;
            this.pos = 0;
        }

        @Override
        public boolean isEmpty() {
            return pos >= input.length();
        }

        @Override
        public char current() {
            return isEmpty() ? 0 : input.charAt(pos);
        }

        @Override
        public boolean matchesAny(char... chars) {
            if (isEmpty()) return false;
            char c = current();
            for (char ch : chars) if (c == ch) return true;
            return false;
        }

        @Override
        public boolean matchConsume(String seq) {
            if (input.substring(pos).startsWith(seq)) {
                pos += seq.length();
                return true;
            }
            return false;
        }

        @Override
        public boolean matchConsumeIgnoreCase(String seq) {
            String sub = input.substring(pos);
            if (sub.regionMatches(true, 0, seq, 0, seq.length())) {
                pos += seq.length();
                return true;
            }
            return false;
        }

        @Override
        public String consumeHexSequence() {
            StringBuilder sb = new StringBuilder();
            while (pos < input.length() && isHexDigit(input.charAt(pos))) {
                sb.append(input.charAt(pos));
                pos++;
            }
            return sb.toString();
        }

        @Override
        public String consumeDigitSequence() {
            StringBuilder sb = new StringBuilder();
            while (pos < input.length() && Character.isDigit(input.charAt(pos))) {
                sb.append(input.charAt(pos));
                pos++;
            }
            return sb.toString();
        }

        @Override
        public String consumeLetterSequence() {
            StringBuilder sb = new StringBuilder();
            while (pos < input.length() && Character.isLetter(input.charAt(pos))) {
                sb.append(input.charAt(pos));
                pos++;
            }
            return sb.toString();
        }

        @Override
        public boolean matchesLetter() {
            return !isEmpty() && Character.isLetter(current());
        }

        @Override
        public boolean matchesDigit() {
            return !isEmpty() && Character.isDigit(current());
        }

        @Override
        public void mark() {
            markPos = pos;
        }

        @Override
        public void rewindToMark() {
            pos = markPos;
        }

        @Override
        public void advance() {
            if (pos < input.length()) pos++;
        }

        @Override
        public int pos() {
            return pos;
        }

        @Override
        public boolean matches(char c) {
            return !isEmpty() && current() == c;
        }

        public void unconsume() {
            if (pos > 0) pos--;
        }

        private boolean isHexDigit(char c) {
            return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
        }
    }

    private Tokeniser tokeniser;
    private FakeCharacterReader reader;

    @Before
    public void setUp() {
        reader = new FakeCharacterReader("");
        tokeniser = new Tokeniser(reader);
    }

    @Test
    public void testConstructor() {
        assertNotNull(tokeniser);
        assertEquals(TokeniserState.Data, tokeniser.getState());
        assertTrue(tokeniser.isTrackErrors());
    }

    @Test
    public void testReadSelfClosingFlagNotAcknowledgedError() {
        tokeniser.selfClosingFlagAcknowledged = false;
        tokeniser.emitPending = new Token.Character("x");
        tokeniser.isEmitPending = true;
        tokeniser.charBuffer.setLength(0);
        tokeniser.read();
        assertEquals(1, tokeniser.errors.size());
        assertTrue(tokeniser.errors.get(0).toString().contains("Self closing flag not acknowledged"));
    }

    @Test
    public void testReadReturnsCharacterTokenWhenCharBufferNotEmpty() {
        tokeniser.charBuffer.append("hello");
        tokeniser.emitPending = new Token.Character("dummy");
        tokeniser.isEmitPending = true;
        Token result = tokeniser.read();
        assertEquals(Token.TokenType.Character, result.type);
        assertEquals("hello", ((Token.Character) result).data);
        assertTrue(tokeniser.charBuffer.length() == 0);
    }

    @Test
    public void testReadReturnsEmitPendingWhenCharBufferEmpty() {
        tokeniser.emitPending = new Token.EndTag();
        ((Token.EndTag) tokeniser.emitPending).tagName = "div";
        tokeniser.isEmitPending = true;
        tokeniser.charBuffer.setLength(0);
        Token result = tokeniser.read();
        assertNotNull(result);
        assertEquals(Token.TokenType.EndTag, result.type);
        assertFalse(tokeniser.isEmitPending);
    }

    @Test(expected = IllegalStateException.class)
    public void testEmitTokenWhenAlreadyPending() {
        tokeniser.isEmitPending = true;
        tokeniser.emit(new Token.Character("x"));
    }

    @Test
    public void testEmitStartTag() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "a";
        startTag.selfClosing = false;
        tokeniser.emit(startTag);
        assertTrue(tokeniser.isEmitPending);
        assertNotNull(tokeniser.lastStartTag);
        assertEquals("a", tokeniser.lastStartTag.tagName);
        assertTrue(tokeniser.selfClosingFlagAcknowledged);
    }

    @Test
    public void testEmitSelfClosingStartTag() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "br";
        startTag.selfClosing = true;
        tokeniser.emit(startTag);
        assertFalse(tokeniser.selfClosingFlagAcknowledged);
    }

    @Test
    public void testEmitEndTagWithAttributes() {
        Token.EndTag endTag = new Token.EndTag();
        endTag.attributes = new Attributes() {
            @Override
            public int size() {
                return 1;
            }
        };
        tokeniser.emit(endTag);
        assertTrue(tokeniser.errors.size() > 0);
    }

    @Test
    public void testEmitStringAppendsToCharBuffer() {
        tokeniser.emit("test");
        assertEquals("test", tokeniser.charBuffer.toString());
        assertFalse(tokeniser.isEmitPending);
    }

    @Test
    public void testEmitCharAppendsToCharBuffer() {
        tokeniser.emit('a');
        assertEquals("a", tokeniser.charBuffer.toString());
    }

    @Test
    public void testTransition() {
        tokeniser.transition(TokeniserState.Rawtext);
        assertEquals(TokeniserState.Rawtext, tokeniser.getState());
    }

    @Test
    public void testAdvanceTransition() {
        reader = new FakeCharacterReader("a");
        tokeniser = new Tokeniser(reader);
        tokeniser.advanceTransition(TokeniserState.Rcdata);
        assertEquals(TokeniserState.Rcdata, tokeniser.getState());
        assertEquals(1, reader.pos());
    }

    @Test
    public void testAcknowledgeSelfClosingFlag() {
        tokeniser.selfClosingFlagAcknowledged = false;
        tokeniser.acknowledgeSelfClosingFlag();
        assertTrue(tokeniser.selfClosingFlagAcknowledged);
    }

    @Test
    public void testConsumeCharacterReferenceEmptyReader() {
        reader = new FakeCharacterReader("");
        tokeniser = new Tokeniser(reader);
        assertNull(tokeniser.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReferenceAdditionalMatchesCurrent() {
        reader = new FakeCharacterReader("A");
        tokeniser = new Tokeniser(reader);
        assertNull(tokeniser.consumeCharacterReference('A', false));
    }

    @Test
    public void testConsumeCharacterReferenceMatchesSpecialChars() {
        reader = new FakeCharacterReader("\t");
        tokeniser = new Tokeniser(reader);
        assertNull(tokeniser.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReferenceNumberedHex() {
        reader = new FakeCharacterReader("#x41;");
        tokeniser = new Tokeniser(reader);
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(result);
        assertEquals('A', result.charValue());
    }

    @Test
    public void testConsumeCharacterReferenceNumberedDecimal() {
        reader = new FakeCharacterReader("#65;");
        tokeniser = new Tokeniser(reader);
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals('A', result.charValue());
    }

    @Test
    public void testConsumeCharacterReferenceNumberedInvalidRange() {
        reader = new FakeCharacterReader("#55296;");
        tokeniser = new Tokeniser(reader);
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Tokeniser.replacementChar, result.charValue());
    }

    @Test
    public void testConsumeCharacterReferenceNumberedTooLarge() {
        reader = new FakeCharacterReader("#1114112;");
        tokeniser = new Tokeniser(reader);
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Tokeniser.replacementChar, result.charValue());
    }

    @Test
    public void testConsumeCharacterReferenceNumberedNoDigits() {
        reader = new FakeCharacterReader("#;");
        tokeniser = new Tokeniser(reader);
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        assertTrue(tokeniser.errors.size() > 0);
    }

    @Test
    public void testConsumeCharacterReferenceNamedFoundWithSemicolon() {
        reader = new FakeCharacterReader("amp;");
        tokeniser = new Tokeniser(reader);
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals('&', result.charValue());
    }

    @Test
    public void testConsumeCharacterReferenceNamedNoSemicolonFound() {
        reader = new FakeCharacterReader("amp");
        tokeniser = new Tokeniser(reader);
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals('&', result.charValue());
        assertTrue(tokeniser.errors.size() > 0);
    }

    @Test
    public void testConsumeCharacterReferenceNamedNotFoundLooksLegit() {
        reader = new FakeCharacterReader("xxx;");
        tokeniser = new Tokeniser(reader);
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        assertTrue(tokeniser.errors.size() > 0);
    }

    @Test
    public void testConsumeCharacterReferenceNamedNotFoundNoSemicolon() {
        reader = new FakeCharacterReader("xxx");
        tokeniser = new Tokeniser(reader);
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        assertTrue(tokeniser.errors.size() == 0);
    }

    @Test
    public void testConsumeCharacterReferenceNamedInAttributeWithFollowingLetter() {
        reader = new FakeCharacterReader("ampx");
        tokeniser = new Tokeniser(reader);
        Character result = tokeniser.consumeCharacterReference(null, true);
        assertNull(result);
        assertEquals(0, reader.pos());
    }

    @Test
    public void testConsumeCharacterReferenceNamedInAttributeWithFollowingDigit() {
        reader = new FakeCharacterReader("amp1");
        tokeniser = new Tokeniser(reader);
        Character result = tokeniser.consumeCharacterReference(null, true);
        assertNull(result);
        assertEquals(0, reader.pos());
    }

    @Test
    public void testConsumeCharacterReferenceNamedInAttributeWithFollowingEquals() {
        reader = new FakeCharacterReader("amp=");
        tokeniser = new Tokeniser(reader);
        Character result = tokeniser.consumeCharacterReference(null, true);
        assertNull(result);
        assertEquals(0, reader.pos());
    }

    @Test
    public void testCreateTagPendingStart() {
        Token.Tag tag = tokeniser.createTagPending(true);
        assertNotNull(tag);
        assertTrue(tag instanceof Token.StartTag);
        assertEquals(tag, tokeniser.tagPending);
    }

    @Test
    public void testCreateTagPendingEnd() {
        Token.Tag tag = tokeniser.createTagPending(false);
        assertTrue(tag instanceof Token.EndTag);
    }

    @Test
    public void testEmitTagPending() {
        Token.Tag tag = tokeniser.createTagPending(true);
        tag.tagName = "p";
        tokeniser.emitTagPending();
        assertTrue(tokeniser.isEmitPending);
        assertEquals(tag, tokeniser.emitPending);
    }

    @Test
    public void testCreateCommentPending() {
        tokeniser.createCommentPending();
        assertNotNull(tokeniser.commentPending);
    }

    @Test
    public void testEmitCommentPending() {
        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();
        assertTrue(tokeniser.isEmitPending);
    }

    @Test
    public void testCreateDoctypePending() {
        tokeniser.createDoctypePending();
        assertNotNull(tokeniser.doctypePending);
    }

    @Test
    public void testEmitDoctypePending() {
        tokeniser.createDoctypePending();
        tokeniser.emitDoctypePending();
        assertTrue(tokeniser.isEmitPending);
    }

    @Test
    public void testCreateTempBuffer() {
        tokeniser.createTempBuffer();
        assertNotNull(tokeniser.dataBuffer);
        assertTrue(tokeniser.dataBuffer.length() == 0);
    }

    @Test
    public void testIsAppropriateEndTagToken() {
        tokeniser.lastStartTag = new Token.StartTag();
        tokeniser.lastStartTag.tagName = "div";
        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName = "div";
        tokeniser.tagPending = endTag;
        assertTrue(tokeniser.isAppropriateEndTagToken());
        endTag.tagName = "span";
        assertFalse(tokeniser.isAppropriateEndTagToken());
    }

    @Test
    public void testIsTrackErrorsDefaultTrue() {
        assertTrue(tokeniser.isTrackErrors());
    }

    @Test
    public void testSetTrackErrorsFalse() {
        tokeniser.setTrackErrors(false);
        assertFalse(tokeniser.isTrackErrors());
    }

    @Test
    public void testTrackErrorsFalseNoErrorsRecorded() {
        tokeniser.setTrackErrors(false);
        tokeniser.error(TokeniserState.Data);
        tokeniser.eofError(TokeniserState.Data);
        assertEquals(0, tokeniser.errors.size());
    }

    @Test
    public void testErrorState() {
        tokeniser.error(TokeniserState.Data);
        assertEquals(1, tokeniser.errors.size());
    }

    @Test
    public void testEofErrorState() {
        tokeniser.eofError(TokeniserState.Data);
        assertEquals(1, tokeniser.errors.size());
    }

    @Test
    public void testCurrentNodeInHtmlNS() {
        assertTrue(tokeniser.currentNodeInHtmlNS());
    }
}