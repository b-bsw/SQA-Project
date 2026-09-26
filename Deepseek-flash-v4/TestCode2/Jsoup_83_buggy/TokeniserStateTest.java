package org.jsoup.parser;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TokeniserStateTest {

    private static class CapturingTokeniser extends Tokeniser {
        final List<TokeniserState> transitions = new ArrayList<>();
        final List<TokeniserState> errors = new ArrayList<>();
        final StringBuilder emitted = new StringBuilder();
        final List<Token> emittedTokens = new ArrayList<>();

        CapturingTokeniser(CharacterReader reader) {
            super(reader);
        }

        @Override
        public void transition(TokeniserState state) {
            transitions.add(state);
            super.transition(state);
        }

        @Override
        public void advanceTransition(TokeniserState state) {
            transitions.add(state);
            super.advanceTransition(state);
        }

        @Override
        public void error(TokeniserState state) {
            errors.add(state);
        }

        @Override
        public void emit(String str) {
            emitted.append(str);
        }

        @Override
        public void emit(char c) {
            emitted.append(c);
        }

        @Override
        public void emit(Token token) {
            emittedTokens.add(token);
        }
    }

    private static TokeniserState lastState(CapturingTokeniser t) {
        assertFalse("Expected at least one transition", t.transitions.isEmpty());
        return t.transitions.get(t.transitions.size() - 1);
    }

    private static CapturingTokeniser newTokeniser(String input) {
        return new CapturingTokeniser(new CharacterReader(input));
    }

    @Test
    public void dataStateReadsTextUntilSpecialChar() {
        CapturingTokeniser t = newTokeniser("hello");
        TokeniserState.Data.read(t, new CharacterReader("hello"));

        assertEquals("hello", t.emitted.toString());
    }

    @Test
    public void dataStateAmpersandAdvancesToCharacterReference() {
        CapturingTokeniser t = newTokeniser("&");
        TokeniserState.Data.read(t, new CharacterReader("&"));

        assertEquals(TokeniserState.CharacterReferenceInData, lastState(t));
    }

    @Test
    public void dataStateLessThanAdvancesToTagOpen() {
        CapturingTokeniser t = newTokeniser("<");
        TokeniserState.Data.read(t, new CharacterReader("<"));

        assertEquals(TokeniserState.TagOpen, lastState(t));
    }

    @Test
    public void dataStateEmitsEofOnEmptyInput() {
        CapturingTokeniser t = newTokeniser("");
        TokeniserState.Data.read(t, new CharacterReader(""));

        assertEquals(1, t.emittedTokens.size());
        assertTrue(t.emittedTokens.get(0) instanceof Token.EOF);
    }

    @Test
    public void tagOpenLetterTransitionsToTagName() {
        CapturingTokeniser t = newTokeniser("div");
        TokeniserState.TagOpen.read(t, new CharacterReader("div"));

        assertEquals(TokeniserState.TagName, lastState(t));
    }

    @Test
    public void tagOpenBangTransitionsToMarkupDeclaration() {
        CapturingTokeniser t = newTokeniser("!");
        TokeniserState.TagOpen.read(t, new CharacterReader("!"));

        assertEquals(TokeniserState.MarkupDeclarationOpen, lastState(t));
    }

    @Test
    public void tagOpenSlashTransitionsToEndTagOpen() {
        CapturingTokeniser t = newTokeniser("/");
        TokeniserState.TagOpen.read(t, new CharacterReader("/"));

        assertEquals(TokeniserState.EndTagOpen, lastState(t));
    }

    @Test
    public void tagOpenQuestionTransitionsToBogusComment() {
        CapturingTokeniser t = newTokeniser("?");
        TokeniserState.TagOpen.read(t, new CharacterReader("?"));

        assertEquals(TokeniserState.BogusComment, lastState(t));
    }

    @Test
    public void tagOpenInvalidEmitsLessThanAndReturnsToData() {
        CapturingTokeniser t = newTokeniser(">");
        TokeniserState.TagOpen.read(t, new CharacterReader(">"));

        assertTrue(t.errors.contains(TokeniserState.TagOpen));
        assertEquals("<", t.emitted.toString());
        assertEquals(TokeniserState.Data, lastState(t));
    }

    @Test
    public void tagNameConsumesTagAndEmitsToken() {
        CharacterReader r = new CharacterReader("div>");
        CapturingTokeniser t = newTokeniser("div>");

        TokeniserState.TagOpen.read(t, r);
        t.transitions.clear();
        t.emittedTokens.clear();

        TokeniserState.TagName.read(t, r);

        assertFalse("Expected a tag token to be emitted", t.emittedTokens.isEmpty());
    }
}