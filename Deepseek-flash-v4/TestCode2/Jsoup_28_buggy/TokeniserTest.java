package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class TokeniserTest {

    // Stub for ParseErrorList
    static class ParseErrorListStub extends ParseErrorList {
        boolean canAdd;
        List<ParseError> errors = new ArrayList<>();

        ParseErrorListStub(boolean canAdd) {
            super(0, 0);
            this.canAdd = canAdd;
        }

        @Override
        public boolean canAddError() {
            return canAdd;
        }

        @Override
        public boolean add(ParseError e) {
            if (canAdd) {
                errors.add(e);
                return true;
            }
            return false;
        }

        int errorCount() {
            return errors.size();
        }
    }

    // Fake state that emits a Character token immediately
    static class FakeState extends TokeniserState {
        @Override
        public void read(Tokeniser t, CharacterReader r) {
            t.emit(new Token.Character("fake"));
        }
    }

    private Tokeniser tokeniser;
    private CharacterReader reader;
    private ParseErrorListStub errors;

    @Before
    public void setUp() {
        reader = new CharacterReader("");
        errors = new ParseErrorListStub(true);
        tokeniser = new Tokeniser(reader, errors);
    }

    // --- Constructor and initial state ---
    @Test
    public void testInitialState() {
        assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    // --- Emit(Token) and read() ---
    @Test
    public void testEmitStartTagSetsLastStartTag() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "div";
        startTag.selfClosing = true;
        tokeniser.emit(startTag);
        tokeniser.transition(new FakeState());
        Token result = tokeniser.read();
        assertSame(startTag, result);
        tokeniser.read();
        assertTrue(errors.errorCount() > 0);
    }

    @Test
    public void testEmitStringAndReadReturnsCharacterToken() {
        tokeniser.emit("hello");
        Token result = tokeniser.read();
        assertTrue(result instanceof Token.Character);
        assertEquals("hello", ((Token.Character) result).data);
    }

    @Test
    public void testEmitCharacterAppendsToBuffer() {
        tokeniser.emit('a');
        tokeniser.emit('b');
        Token result = tokeniser.read();
        assertTrue(result instanceof Token.Character);
        assertEquals("ab", ((Token.Character) result).data);
    }

    @Test
    public void testReadReturnsEmitPendingWhenCharBufferEmpty() {
        Token.StartTag tag = new Token.StartTag();
        tag.tagName = "p";
        tokeniser.emit(tag);
        Token result = tokeniser.read();
        assertSame(tag, result);
    }

    // --- isAppropriateEndTagToken ---
    @Test
    public void testIsAppropriateEndTagTokenNoLastStartTag() {
        assertFalse(tokeniser.isAppropriateEndTagToken());
    }

    @Test
    public void testIsAppropriateEndTagTokenMatching() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "div";
        tokeniser.emit(startTag);
        tokeniser.createTagPending(false);
        tokeniser.tagPending.tagName = "div";
        assertTrue(tokeniser.isAppropriateEndTagToken());
    }

    @Test
    public void testIsAppropriateEndTagTokenNotMatching() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "div";
        tokeniser.emit(startTag);
        tokeniser.createTagPending(false);
        tokeniser.tagPending.tagName = "span";
        assertFalse(tokeniser.isAppropriateEndTagToken());
    }

    @Test
    public void testAppropriateEndTagNameReturnsLastStartTagName() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "a";
        tokeniser.emit(startTag);
        assertEquals("a", tokeniser.appropriateEndTagName());
    }

    // --- consumeCharacterReference ---
    @Test
    public void testConsumeCharRefEmptyReaderReturnsNull() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader, errors);
        assertNull(tokeniser.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharRefAdditionalAllowedMatchReturnsNull() {
        reader = new CharacterReader("a");
        tokeniser = new Tokeniser(reader, errors);
        assertNull(tokeniser.consumeCharacterReference('a', false));
    }

    @Test
    public void testConsumeCharRefWhiteSpaceReturnsNull() {
        reader = new CharacterReader("\t");
        tokeniser = new Tokeniser(reader, errors);
        assertNull(tokeniser.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharRefNumericDec() {
        reader = new CharacterReader("&#65;");
        tokeniser = new Tokeniser(reader, errors);
        Character ch = tokeniser.consumeCharacterReference(null, false);
        assertEquals('A', (char) ch);
    }

    @Test
    public void testConsumeCharRefNumericHex() {
        reader = new CharacterReader("&#x41;");
        tokeniser = new Tokeniser(reader, errors);
        Character ch = tokeniser.consumeCharacterReference(null, false);
        assertEquals('A', (char) ch);
    }

    @Test
    public void testConsumeCharRefNumericMissingSemi() {
        reader = new CharacterReader("&#65");
        tokeniser = new Tokeniser(reader, errors);
        assertNull(tokeniser.consumeCharacterReference(null, false));
        assertTrue(errors.errorCount() > 0);
    }

    @Test
    public void testConsumeCharRefNumericMissingSemiNoError() {
        errors = new ParseErrorListStub(false);
        reader = new CharacterReader("&#65");
        tokeniser = new Tokeniser(reader, errors);
        assertNull(tokeniser.consumeCharacterReference(null, false));
        assertEquals(0, errors.errorCount());
    }

    @Test
    public void testConsumeCharRefNumericOutOfRange() {
        reader = new CharacterReader("&#xD800;");
        tokeniser = new Tokeniser(reader, errors);
        Character ch = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Tokeniser.replacementChar, (char) ch);
    }

    @Test
    public void testConsumeCharRefNumericNoNumerals() {
        reader = new CharacterReader("&#;");
        tokeniser = new Tokeniser(reader, errors);
        assertNull(tokeniser.consumeCharacterReference(null, false));
        assertTrue(errors.errorCount() > 0);
    }

    @Test
    public void testConsumeCharRefNumericHexNoNumerals() {
        reader = new CharacterReader("&#x;");
        tokeniser = new Tokeniser(reader, errors);
        assertNull(tokeniser.consumeCharacterReference(null, false));
        assertTrue(errors.errorCount() > 0);
    }

    @Test
    public void testConsumeCharRefNamed() {
        reader = new CharacterReader("&amp;");
        tokeniser = new Tokeniser(reader, errors);
        Character ch = tokeniser.consumeCharacterReference(null, false);
        assertEquals('&', (char) ch);
    }

    @Test
    public void testConsumeCharRefNamedMissingSemi() {
        reader = new CharacterReader("&amp");
        tokeniser = new Tokeniser(reader, errors);
        Character ch = tokeniser.consumeCharacterReference(null, false);
        assertNotNull(ch);
        assertEquals('&', (char) ch);
        assertTrue(errors.errorCount() > 0);
    }

    @Test
    public void testConsumeCharRefNamedInvalid() {
        reader = new CharacterReader("&xyz;");
        tokeniser = new Tokeniser(reader, errors);
        assertNull(tokeniser.consumeCharacterReference(null, false));
        assertTrue(errors.errorCount() > 0);
    }

    @Test
    public void testConsumeCharRefNamedInAttributeWithFollowingLetter() {
        reader = new CharacterReader("&amptest");
        tokeniser = new Tokeniser(reader, errors);
        assertNull(tokeniser.consumeCharacterReference(null, true));
        assertEquals(0, errors.errorCount());
    }

    @Test
    public void testConsumeCharRefNamedInAttributeWithEquals() {
        reader = new CharacterReader("&amp=test");
        tokeniser = new Tokeniser(reader, errors);
        assertNull(tokeniser.consumeCharacterReference(null, true));
        assertEquals(0, errors.errorCount());
    }

    // --- emitTagPending ---
    @Test
    public void testEmitTagPending() {
        tokeniser.createTagPending(true);
        tokeniser.tagPending.tagName = "p";
        tokeniser.emitTagPending();
        Token token = tokeniser.read();
        assertTrue(token instanceof Token.StartTag);
        assertEquals("p", ((Token.StartTag) token).tagName);
    }

    // --- Comment pending ---
    @Test
    public void testEmitCommentPending() {
        tokeniser.createCommentPending();
        tokeniser.commentPending.data = "comment";
        tokeniser.emitCommentPending();
        Token token = tokeniser.read();
        assertTrue(token instanceof Token.Comment);
    }

    // --- Doctype pending ---
    @Test
    public void testEmitDoctypePending() {
        tokeniser.createDoctypePending();
        tokeniser.doctypePending.name = "html";
        tokeniser.emitDoctypePending();
        Token token = tokeniser.read();
        assertTrue(token instanceof Token.Doctype);
    }

    // --- createTempBuffer ---
    @Test
    public void testCreateTempBuffer() {
        tokeniser.createTempBuffer();
        assertNotNull(tokeniser.dataBuffer);
    }

    // --- transition ---
    @Test
    public void testTransition() {
        tokeniser.transition(TokeniserState.Rawtext);
        assertEquals(TokeniserState.Rawtext, tokeniser.getState());
    }

    // --- advanceTransition ---
    @Test
    public void testAdvanceTransitionAdvancesReader() {
        reader = new CharacterReader("a");
        tokeniser = new Tokeniser(reader, errors);
        tokeniser.advanceTransition(TokeniserState.Rawtext);
        assertEquals(TokeniserState.Rawtext, tokeniser.getState());
        assertTrue(reader.isEmpty());
    }

    // --- acknowledgeSelfClosingFlag ---
    @Test
    public void testAcknowledgeSelfClosingFlagPreventsError() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.selfClosing = true;
        tokeniser.emit(startTag);
        tokeniser.acknowledgeSelfClosingFlag();
        tokeniser.transition(new FakeState());
        tokeniser.read();
        tokeniser.read();
        assertEquals(0, errors.errorCount());
    }

    // --- error(TokeniserState) ---
    @Test
    public void testErrorWhenCanAddTrue() {
        tokeniser.error(TokeniserState.Data);
        assertEquals(1, errors.errorCount());
    }

    @Test
    public void testErrorWhenCanAddFalse() {
        errors = new ParseErrorListStub(false);
        tokeniser = new Tokeniser(reader, errors);
        tokeniser.error(TokeniserState.Data);
        assertEquals(0, errors.errorCount());
    }

    // --- eofError ---
    @Test
    public void testEofError() {
        tokeniser.eofError(TokeniserState.Data);
        assertEquals(1, errors.errorCount());
    }

    // --- currentNodeInHtmlNS ---
    @Test
    public void testCurrentNodeInHtmlNS() {
        assertTrue(tokeniser.currentNodeInHtmlNS());
    }
}