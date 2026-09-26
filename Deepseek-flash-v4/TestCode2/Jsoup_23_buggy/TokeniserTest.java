package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TokeniserTest {

    private Tokeniser tokeniser;
    private ParseErrorList errors;

    @Before
    public void setUp() {
        errors = new ParseErrorList(10);
    }

    private Tokeniser tokeniser(String input) {
        return new Tokeniser(new CharacterReader(input), errors);
    }

    private Tokeniser tokeniser(CharacterReader reader) {
        return new Tokeniser(reader, errors);
    }

    private CharacterReader referenceReader(String afterAmpersand) {
        CharacterReader reader = new CharacterReader("&" + afterAmpersand);
        reader.advance();
        return reader;
    }

    @Test
    public void readReturnsTextTokenThenEof() {
        tokeniser = tokeniser("abc");

        Token token = tokeniser.read();
        assertTrue(token instanceof Token.Character);
        assertEquals("abc", ((Token.Character) token).getData());

        Token eof = tokeniser.read();
        assertTrue(eof instanceof Token.EOF);
    }

    @Test
    public void readReturnsPendingStartTag() {
        tokeniser = tokeniser("");

        Token.Tag tag = tokeniser.createTagPending(true);
        tag.tagName = "p";
        tokeniser.emitTagPending();

        Token token = tokeniser.read();
        assertTrue(token instanceof Token.StartTag);
    }

    @Test
    public void readReturnsPendingComment() {
        tokeniser = tokeniser("");

        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();

        Token token = tokeniser.read();
        assertTrue(token instanceof Token.Comment);
    }

    @Test
    public void readReturnsPendingDoctype() {
        tokeniser = tokeniser("");

        tokeniser.createDoctypePending();
        tokeniser.emitDoctypePending();

        Token token = tokeniser.read();
        assertTrue(token instanceof Token.Doctype);
    }

    @Test
    public void emitStartTagAllowsMatchingEndTag() {
        tokeniser = tokeniser("");

        Token.Tag start = tokeniser.createTagPending(true);
        start.tagName = "div";
        tokeniser.emitTagPending();

        Token.Tag end = tokeniser.createTagPending(false);
        end.tagName = "div";
        assertTrue(tokeniser.isAppropriateEndTagToken());
        assertEquals("div", tokeniser.appropriateEndTagName());
    }

    @Test
    public void differentEndTagIsNotAppropriate() {
        tokeniser = tokeniser("");

        Token.Tag start = tokeniser.createTagPending(true);
        start.tagName = "div";
        tokeniser.emitTagPending();

        Token.Tag end = tokeniser.createTagPending(false);
        end.tagName = "p";
        assertFalse(tokeniser.isAppropriateEndTagToken());
    }

    @Test
    public void selfClosingStartTagNeedsAcknowledgement() {
        tokeniser = tokeniser("");

        Token.Tag tag = tokeniser.createTagPending(true);
        tag.tagName = "br";
        tag.selfClosing = true;
        tokeniser.emitTagPending();

        tokeniser.read();
        assertEquals(1, errors.size());
    }

    @Test
    public void acknowledgedSelfClosingTagDoesNotReportError() {
        tokeniser = tokeniser("");

        Token.Tag tag = tokeniser.createTagPending(true);
        tag.tagName = "br";
        tag.selfClosing = true;
        tokeniser.emitTagPending();

        tokeniser.acknowledgeSelfClosingFlag();
        tokeniser.read();
        assertEquals(0, errors.size());
    }

    @Test
    public void endTagWithAttributesReportsError() {
        tokeniser = tokeniser("");

        Token.Tag tag = tokeniser.createTagPending(false);
        tag.tagName = "div";
        tag.attributes.put("class", "x");
        tokeniser.emitTagPending();

        assertEquals(1, errors.size());
    }

    @Test
    public void stateCanBeTransitionedAndAdvanced() {
        tokeniser = tokeniser("div");

        assertEquals(TokeniserState.Data, tokeniser.getState());

        tokeniser.transition(TokeniserState.TagName);
        assertEquals(TokeniserState.TagName, tokeniser.getState());

        tokeniser.advanceTransition(TokeniserState.Data);
        assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void numericCharacterReferenceDecoded() {
        tokeniser = tokeniser(referenceReader("#65;"));
        Character result = tokeniser.consumeCharacterReference(null, false);

        assertNotNull(result);
        assertEquals('A', result.charValue());
    }

    @Test
    public void hexCharacterReferenceDecoded() {
        tokeniser = tokeniser(referenceReader("#x41;"));
        Character result = tokeniser.consumeCharacterReference(null, false);

        assertNotNull(result);
        assertEquals('A', result.charValue());
    }

    @Test
    public void namedCharacterReferenceDecoded() {
        tokeniser = tokeniser(referenceReader("amp;"));
        Character result = tokeniser.consumeCharacterReference(null, false);

        assertNotNull(result);
        assertEquals('&', result.charValue());
    }

    @Test
    public void invalidCharacterReferenceReturnsNull() {
        tokeniser = tokeniser(referenceReader("nosuch;"));
        Character result = tokeniser.consumeCharacterReference(null, false);

        assertNull(result);
    }

    @Test
    public void emptyCharacterReferenceReturnsNull() {
        tokeniser = tokeniser("");
        assertNull(tokeniser.consumeCharacterReference(null, false));
    }
}