package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;

public class HtmlTreeBuilderStateTest {

    private HtmlTreeBuilder newTreeBuilder() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("", "http://example.com", new ParseErrorList(16, 0), ParseSettings.preserveCase);
        return tb;
    }

    private HtmlTreeBuilder inBodyBuilder() {
        HtmlTreeBuilder tb = newTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        HtmlTreeBuilderState.BeforeHtml.process(startTag("html"), tb);
        HtmlTreeBuilderState.BeforeHead.process(startTag("head"), tb);
        HtmlTreeBuilderState.InHead.process(endTag("head"), tb);
        HtmlTreeBuilderState.AfterHead.process(startTag("body"), tb);
        return tb;
    }

    private HtmlTreeBuilder inTableBuilder() {
        HtmlTreeBuilder tb = inBodyBuilder();
        HtmlTreeBuilderState.InBody.process(startTag("table"), tb);
        return tb;
    }

    private Token.StartTag startTag(String name) {
        Token.StartTag start = new Token.StartTag();
        start.name(name);
        return start;
    }

    private Token.EndTag endTag(String name) {
        Token.EndTag end = new Token.EndTag();
        end.name(name);
        return end;
    }

    private Token.Character character(String data) {
        return new Token.Character().data(data);
    }

    private Token.Comment comment(String data) {
        Token.Comment comment = new Token.Comment();
        comment.data.append(data);
        return comment;
    }

    private Token.Doctype doctype(String name, String publicId, String systemId, boolean forceQuirks) {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append(name);
        doctype.publicIdentifier.append(publicId);
        doctype.systemIdentifier.append(systemId);
        doctype.forceQuirks = forceQuirks;
        return doctype;
    }

    @Test
    public void initialStateWhitespaceIsAccepted() {
        HtmlTreeBuilder tb = newTreeBuilder();
        assertTrue(HtmlTreeBuilderState.Initial.process(character(" \n\t"), tb));
        assertEquals(HtmlTreeBuilderState.Initial, tb.state());
        assertEquals(0, tb.getDocument().childNodeSize());
    }

    @Test
    public void initialStateCommentInsertsComment() {
        HtmlTreeBuilder tb = newTreeBuilder();
        assertTrue(HtmlTreeBuilderState.Initial.process(comment("a comment"), tb));
        assertEquals(1, tb.getDocument().childNodeSize());
        assertTrue(tb.getDocument().childNode(0) instanceof Comment);
    }

    @Test
    public void initialStateDoctypeInsertsDocumentTypeAndTransitions() {
        HtmlTreeBuilder tb = newTreeBuilder();
        Token.Doctype doctype = doctype("html", "-//W3C//DTD HTML 4.01//EN", "http://www.w3.org/TR/html4/strict.dtd", false);
        assertTrue(HtmlTreeBuilderState.Initial.process(doctype, tb));
        assertEquals(1, tb.getDocument().childNodeSize());
        assertTrue(tb.getDocument().childNode(0) instanceof DocumentType);
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void initialStateQuirksDoctypeSetsQuirksMode() {
        HtmlTreeBuilder tb = newTreeBuilder();
        assertTrue(HtmlTreeBuilderState.Initial.process(doctype("html", "", "", true), tb));
        assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void initialStateStartTagForwardsAndCreatesBodyContent() {
        HtmlTreeBuilder tb = newTreeBuilder();
        assertTrue(HtmlTreeBuilderState.Initial.process(startTag("div"), tb));
        assertTrue(tb.getDocument().toString().contains("<div></div>"));
    }

    @Test
    public void beforeHtmlRejectsInvalidDoctypeAndEndTag() {
        HtmlTreeBuilder tb = newTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(doctype("html", "", "", false), tb));

        tb = newTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(endTag("div"), tb));
    }

    @Test
    public void beforeHtmlAcceptsWhitespaceAndComment() {
        HtmlTreeBuilder tb = newTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(character(" \n"), tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(comment("x"), tb));
        assertEquals(1, tb.getDocument().childNodeSize());
    }

    @Test
    public void beforeHeadStartTagHeadSetsHeadElement() {
        HtmlTreeBuilder tb = newTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(startTag("head"), tb));
        assertNotNull(tb.getHeadElement());
        assertEquals("head", tb.getHeadElement().tagName());
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void beforeHeadEndTagHeadBuildsAndClosesHead() {
        HtmlTreeBuilder tb = newTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(endTag("head"), tb));
        assertNotNull(tb.getHeadElement());
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void inHeadTitleTransitionsToText() {
        HtmlTreeBuilder tb = newTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);
        assertTrue(HtmlTreeBuilderState.InHead.process(startTag("title"), tb));
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
    }

    @Test
    public void inHeadEndTagHeadTransitionsToAfterHead() {
        HtmlTreeBuilder tb = newTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        HtmlTreeBuilderState.BeforeHead.process(startTag("head"), tb);
        assertTrue(HtmlTreeBuilderState.InHead.process(endTag("head"), tb));
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void inBodyEndTagPWithoutOpenPInsertsEmptyP() {
        HtmlTreeBuilder tb = inBodyBuilder();
        assertTrue(HtmlTreeBuilderState.InBody.process(endTag("p"), tb));
        assertEquals("body", tb.currentElement().tagName());
        assertTrue(tb.getDocument().toString().contains("<p></p>"));
    }

    @Test
    public void inBodyStartTagPClosesPreviousParagraph() {
        HtmlTreeBuilder tb = inBodyBuilder();
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag("p"), tb));
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag("p"), tb));
        assertEquals("p", tb.currentElement().tagName());
    }

    @Test
    public void inBodyStartTagLiInsertsListItem() {
        HtmlTreeBuilder tb = inBodyBuilder();
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag("li"), tb));
        assertEquals("li", tb.currentElement().tagName());
    }

    @Test
    public void inBodyStartTagLiClosesPreviousLi() {
        HtmlTreeBuilder tb = inBodyBuilder();
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag("li"), tb));
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag("li"), tb));
        assertEquals("li", tb.currentElement().tagName());
    }

    @Test
    public void inBodyStartTagTableTransitionsToInTable() {
        HtmlTreeBuilder tb = inBodyBuilder();
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag("table"), tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void inBodyEndTagBrReturnsFalseAndInsertsBr() {
        HtmlTreeBuilder tb = inBodyBuilder();
        assertFalse(HtmlTreeBuilderState.InBody.process(endTag("br"), tb));
        assertTrue(tb.getDocument().toString().contains("<br>"));
    }

    @Test
    public void inTableStartTagTrBuildsRow() {
        HtmlTreeBuilder tb = inTableBuilder();
        assertTrue(HtmlTreeBuilderState.InTable.process(startTag("tr"), tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
        assertEquals("tr", tb.currentElement().tagName());
    }

    @Test
    public void inTableEndTagTableClosesToBody() {
        HtmlTreeBuilder tb = inTableBuilder();
        assertTrue(HtmlTreeBuilderState.InTable.process(endTag("table"), tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void inSelectOptionAndSelectBranches() {
        HtmlTreeBuilder tb = inBodyBuilder();
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag("select"), tb));
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());

        assertTrue(HtmlTreeBuilderState.InSelect.process(startTag("option"), tb));
        assertEquals("option", tb.currentElement().tagName());

        assertTrue(HtmlTreeBuilderState.InSelect.process(endTag("option"), tb));
        assertEquals("select", tb.currentElement().tagName());

        assertTrue(HtmlTreeBuilderState.InSelect.process(endTag("select"), tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void parseEmptyAndWhitespaceBuildsSkeleton() {
        Document empty = Jsoup.parse("");
        assertNotNull(empty);
        assertNotNull(empty.body());
        assertEquals("", empty.body().text());

        Document whitespace = Jsoup.parse(" \n\t");
        assertEquals("", whitespace.body().text());
    }

    @Test
    public void parseNullThrowsIllegalArgumentException() {
        try {
            Jsoup.parse(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }
}