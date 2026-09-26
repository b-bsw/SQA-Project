package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;

import static org.junit.Assert.*;

public class TokeniserTest {
    private ParseErrorList errors;
    private Tokeniser tokeniser;

    @Before
    public void setUp() {
        errors = newErrorList(10);
        tokeniser = new Tokeniser(new CharacterReader(""), errors);
    }

    private ParseErrorList newErrorList(int maxSize) {
        try {
            Constructor<ParseErrorList> c = ParseErrorList.class.getDeclaredConstructor(int.class, int.class);
            c.setAccessible(true);
            return c.newInstance(16, maxSize);
        } catch (NoSuchMethodException e) {
            try {
                Constructor<ParseErrorList> c = ParseErrorList.class.getDeclaredConstructor(int.class);
                c.setAccessible(true);
                return c.newInstance(maxSize);
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Tokeniser newTokeniser(String input) {
        return new Tokeniser(new CharacterReader(input), errors);
    }

    @Test
    public void testInitialStateIsData() {
        assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void testReadReturnsEmittedTokenAndClearsPending() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tokeniser.emit(tag);
        Token result = tokeniser.read();
        assertSame(tag, result);
        tokeniser.emit(new Token.StartTag());
    }

    @Test
    public void testReadAcknowledgesSelfClosingFlag() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("br");
        tag.selfClosing = true;
        tokeniser.emit(tag);
        int before = errors.size();
        tokeniser.read();
        assertEquals(before + 1, errors.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmitWhenPendingThrows() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tokeniser.emit(tag);
        tokeniser.emit(tag);
    }

    @Test
    public void testEmitEndTagWithAttributesErrors() {
        Token.EndTag tag = new Token.EndTag();
        tag.name("div");
        tag.attributes = new Attributes();
        tokeniser.emit(tag);
        assertTrue(errors.size() > 0);
    }

    @Test
    public void testEmitStringBuffers() {
        tokeniser.emit("foo");
        tokeniser.emit("bar");
        Token result = tokeniser.read();
        assertEquals(Token.TokenType.Character, result.type);
        assertEquals("foobar", ((Token.Character) result).data());
    }

    @Test
    public void testEmitCharArrayAndCodepoints() {
        Tokeniser t1 = newTokeniser("");
        t1.emit(new char[]{'a', 'b'});
        assertEquals("ab", ((Token.Character) t1.read()).data());

        Tokeniser t2 = newTokeniser("");
        t2.emit(new int[]{'c', 'd'});
        assertEquals("cd", ((Token.Character) t2.read()).data());
    }

    @Test
    public void testTransitionAndAdvanceTransition() {
        tokeniser.transition(TokeniserState.Rawtext);
        assertEquals(TokeniserState.Rawtext, tokeniser.getState());

        Tokeniser t = newTokeniser("a");
        t.advanceTransition(TokeniserState.Data);
        assertEquals(TokeniserState.Data, t.getState());
        assertNull(t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReferenceEmptyReaderReturnsNull() {
        Tokeniser t = newTokeniser("");
        assertNull(t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReferenceAdditionalAllowedCharacterMatchesReturnsNull() {
        Tokeniser t = newTokeniser("a");
        assertNull(t.consumeCharacterReference('a', false));
    }

    @Test
    public void testConsumeCharacterReferenceRejectsNotCharRefStart() {
        Tokeniser t = newTokeniser("&");
        assertNull(t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReferenceNumericDecimal() {
        Tokeniser t = newTokeniser("#65;");
        int[] ref = t.consumeCharacterReference(null, false);
        assertNotNull(ref);
        assertEquals(1, ref.length);
        assertEquals(65, ref[0]);
    }

    @Test
    public void testConsumeCharacterReferenceNumericHex() {
        Tokeniser t = newTokeniser("#x41;");
        int[] ref = t.consumeCharacterReference(null, false);
        assertNotNull(ref);
        assertEquals(65, ref[0]);
    }

    @Test
    public void testConsumeCharacterReferenceNumericInvalidRange() {
        Tokeniser t = newTokeniser("#xD800;");
        int[] ref = t.consumeCharacterReference(null, false);
        assertNotNull(ref);
        assertEquals(Tokeniser.replacementChar, ref[0]);
    }

    @Test
    public void testConsumeCharacterReferenceNumericOutsideRange() {
        Tokeniser t = newTokeniser("#110000;");
        int[] ref = t.consumeCharacterReference(null, false);
        assertNotNull(ref);
        assertEquals(Tokeniser.replacementChar, ref[0]);
    }

    @Test
    public void testConsumeCharacterReferenceNumericNoSemicolon() {
        Tokeniser t = newTokeniser("#65");
        int[] ref = t.consumeCharacterReference(null, false);
        assertNotNull(ref);
        assertEquals(65, ref[0]);
        assertTrue(errors.size() > 0);
    }

    @Test
    public void testConsumeCharacterReferenceNumericNoNumerals() {
        Tokeniser t = newTokeniser("#;");
        assertNull(t.consumeCharacterReference(null, false));
        assertTrue(errors.size() > 0);
    }

    @Test
    public void testConsumeCharacterReferenceNamed() {
        Tokeniser t = newTokeniser("amp;");
        int[] ref = t.consumeCharacterReference(null, false);
        assertNotNull(ref);
        assertEquals(1, ref.length);
        assertEquals('&', ref[0]);
    }

    @Test
    public void testConsumeCharacterReferenceNamedNoSemicolon() {
        Tokeniser t = newTokeniser("amp");
        int[] ref = t.consumeCharacterReference(null, false);
        assertNotNull(ref);
        assertEquals('&', ref[0]);
        assertTrue(errors.size() > 0);
    }

    @Test
    public void testConsumeCharacterReferenceInvalidNamed() {
        Tokeniser t = newTokeniser("nosuch;");
        assertNull(t.consumeCharacterReference(null, false));
        assertTrue(errors.size() > 0);
    }

    @Test
    public void testConsumeCharacterReferenceNamedInAttributeWithTrailingChar() {
        Tokeniser t = newTokeniser("amp=;");
        assertNull(t.consumeCharacterReference(null, true));
    }

    @Test
    public void testCreateTagPendingReturnsStartAndEnd() {
        assertSame(tokeniser.startPending, tokeniser.createTagPending(true));
        assertSame(tokeniser.endPending, tokeniser.createTagPending(false));
    }

    @Test
    public void testEmitTagPending() {
        Token.Tag tag = tokeniser.createTagPending(true);
        tag.name("p");
        tokeniser.emitTagPending();
        Token token = tokeniser.read();
        assertEquals(Token.TokenType.StartTag, token.type);
    }

    @Test
    public void testCreateAndEmitCommentPending() {
        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();
        Token token = tokeniser.read();
        assertEquals(Token.TokenType.Comment, token.type);
    }

    @Test
    public void testCreateAndEmitDoctypePending() {
        tokeniser.createDoctypePending();
        tokeniser.emitDoctypePending();
        Token token = tokeniser.read();
        assertEquals(Token.TokenType.Doctype, token.type);
    }

    @Test
    public void testCreateTempBufferClearsDataBuffer() {
        tokeniser.dataBuffer.append("abc");
        tokeniser.createTempBuffer();
        assertEquals(0, tokeniser.dataBuffer.length());
    }

    @Test
    public void testIsAppropriateEndTagToken() {
        Token.StartTag start = new Token.StartTag();
        start.name("div");
        tokeniser.emit(start);
        tokeniser.createTagPending(false);
        tokeniser.tagPending.name("DIV");
        assertTrue(tokeniser.isAppropriateEndTagToken());

        Tokeniser t = newTokeniser("");
        Token.StartTag start2 = new Token.StartTag();
        start2.name("div");
        t.emit(start2);
        t.createTagPending(false);
        t.tagPending.name("span");
        assertFalse(t.isAppropriateEndTagToken());
    }

    @Test
    public void testAppropriateEndTagName() {
        assertNull(tokeniser.appropriateEndTagName());
        Token.StartTag start = new Token.StartTag();
        start.name("p");
        tokeniser.emit(start);
        assertEquals("p", tokeniser.appropriateEndTagName());
    }

    @Test
    public void testErrorMethods() {
        tokeniser.error(TokeniserState.Data);
        tokeniser.eofError(TokeniserState.Data);
        tokeniser.error("custom");
        assertEquals(3, errors.size());
    }

    @Test
    public void testCurrentNodeInHtmlNS() {
        assertTrue(tokeniser.currentNodeInHtmlNS());
    }

    @Test
    public void testUnescapeEntities() {
        Tokeniser t1 = newTokeniser("a&amp;b");
        assertEquals("a&b", t1.unescapeEntities(false));

        Tokeniser t2 = newTokeniser("abc");
        assertEquals("abc", t2.unescapeEntities(false));

        Tokeniser t3 = newTokeniser("a&b");
        assertEquals("a&b", t3.unescapeEntities(false));
    }
}