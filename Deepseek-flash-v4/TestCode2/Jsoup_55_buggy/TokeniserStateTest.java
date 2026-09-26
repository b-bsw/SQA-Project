package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TokeniserStateTest {

    @Test
    public void dataStateEmitsCharacterForPlainText() {
        assertTrue(new Tokeniser(new CharacterReader("hello")).read().isCharacter());
    }

    @Test
    public void emptyInputEmitsEof() {
        assertTrue(new Tokeniser(new CharacterReader("")).read().isEOF());
    }

    @Test
    public void characterReferenceInDataEmitsCharacter() {
        assertTrue(new Tokeniser(new CharacterReader("&amp;")).read().isCharacter());
    }

    @Test
    public void tagOpenAndTagNameEmitStartTag() {
        assertTrue(new Tokeniser(new CharacterReader("<div>")).read().isStartTag());
    }

    @Test
    public void endTagOpenEmitsEndTag() {
        assertTrue(new Tokeniser(new CharacterReader("</div>")).read().isEndTag());
    }

    @Test
    public void selfClosingTagEmitsStartTag() {
        assertTrue(new Tokeniser(new CharacterReader("<br/>")).read().isStartTag());
    }

    @Test
    public void attributeStatesProcessStartTagWithoutError() {
        assertTrue(new Tokeniser(new CharacterReader("<div id=\"a\" class='b' disabled>")).read().isStartTag());
    }

    @Test
    public void markupDeclarationOpenEmitsComment() {
        assertTrue(new Tokeniser(new CharacterReader("<!-- comment -->")).read().isComment());
    }

    @Test
    public void markupDeclarationOpenEmitsDoctype() {
        assertTrue(new Tokeniser(new CharacterReader("<!DOCTYPE html>")).read().isDoctype());
    }

    @Test
    public void unknownMarkupDeclarationEmitsBogusComment() {
        assertTrue(new Tokeniser(new CharacterReader("<!foo>")).read().isComment());
    }

    @Test
    public void tokeniserEmitsTokensInOrder() {
        Tokeniser tokeniser = new Tokeniser(new CharacterReader("<div>text</div>"));
        assertTrue(tokeniser.read().isStartTag());
        assertTrue(tokeniser.read().isCharacter());
        assertTrue(tokeniser.read().isEndTag());
        assertTrue(tokeniser.read().isEOF());
    }

    @Test
    public void nullCharacterInDataIsEmittedAsCharacter() {
        Tokeniser tokeniser = new Tokeniser(new CharacterReader("a\u0000b"));
        assertTrue(tokeniser.read().isCharacter());
        assertTrue(tokeniser.read().isCharacter());
        assertTrue(tokeniser.read().isCharacter());
        assertTrue(tokeniser.read().isEOF());
    }

    @Test
    public void parserUsesRcdataForTextarea() {
        Document doc = Jsoup.parse("<textarea>a &amp; b < c</textarea>");
        Element textarea = doc.select("textarea").first();
        assertNotNull(textarea);
        assertTrue(textarea.text().contains("a & b < c"));
    }

    @Test
    public void parserUsesScriptDataAsRawText() {
        Document doc = Jsoup.parse("<script>if (a < b) { x = '&'; }</script>");
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertTrue(script.html().contains("if (a < b) { x = '&'; }"));
    }

    @Test(expected = RuntimeException.class)
    public void nullHtmlIsRejected() {
        Jsoup.parse(null);
    }
}