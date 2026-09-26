package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import org.jsoup.parser.Token;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {
    private HtmlTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
    }

    // --- Token helpers ---
    private Token.Character whitespaceChar() {
        return new Token.Character().data(" ");
    }

    private Token.Character nonWhitespaceChar() {
        return new Token.Character().data("a");
    }

    private Token.Character nullChar() {
        return new Token.Character().data("\u0000");
    }

    private Token.Comment commentToken() {
        return new Token.Comment().data("test");
    }

    private Token.Doctype doctypeToken(String name, boolean forceQuirks) {
        Token.Doctype d = new Token.Doctype().name(name);
        if (forceQuirks) d.setForceQuirks();
        return d;
    }

    private Token.StartTag startTag(String name) {
        return new Token.StartTag().name(name);
    }

    private Token.EndTag endTag(String name) {
        return new Token.EndTag().name(name);
    }

    // --- Initial state ---
    @Test
    public void testInitialWhitespace() {
        assertTrue(HtmlTreeBuilderState.Initial.process(whitespaceChar(), builder));
        assertEquals(HtmlTreeBuilderState.Initial, builder.state());
    }

    @Test
    public void testInitialComment() {
        assertTrue(HtmlTreeBuilderState.Initial.process(commentToken(), builder));
        assertEquals(1, builder.getDocument().childNodeSize());
    }

    @Test
    public void testInitialDoctype() {
        assertTrue(HtmlTreeBuilderState.Initial.process(doctypeToken("html", false), builder));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, builder.state());
        assertTrue(builder.getDocument().childNode(0) instanceof DocumentType);
    }

    @Test
    public void testInitialDoctypeForceQuirks() {
        assertTrue(HtmlTreeBuilderState.Initial.process(doctypeToken("html", true), builder));
        assertEquals(Document.QuirksMode.quirks, builder.getDocument().quirksMode());
    }

    @Test
    public void testInitialOther() {
        assertTrue(HtmlTreeBuilderState.Initial.process(nonWhitespaceChar(), builder));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, builder.state());
    }

    // --- BeforeHtml state ---
    @Test
    public void testBeforeHtmlDoctype() {
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(doctypeToken("html", false), builder));
    }

    @Test
    public void testBeforeHtmlComment() {
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(commentToken(), builder));
    }

    @Test
    public void testBeforeHtmlWhitespace() {
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(whitespaceChar(), builder));
    }

    @Test
    public void testBeforeHtmlStartTagHtml() {
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(startTag("html"), builder));
        assertEquals(HtmlTreeBuilderState.BeforeHead, builder.state());
    }

    @Test
    public void testBeforeHtmlEndTagInSet() {
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(endTag("head"), builder));
        assertEquals(HtmlTreeBuilderState.BeforeHead, builder.state());
    }

    @Test
    public void testBeforeHtmlEndTagNotInSet() {
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(endTag("div"), builder));
    }

    @Test
    public void testBeforeHtmlOther() {
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(nonWhitespaceChar(), builder));
        assertEquals(HtmlTreeBuilderState.BeforeHead, builder.state());
    }

    // --- BeforeHead state ---
    @Test
    public void testBeforeHeadWhitespace() {
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(whitespaceChar(), builder));
    }

    @Test
    public void testBeforeHeadStartTagHtml() {
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(startTag("html"), builder));
    }

    @Test
    public void testBeforeHeadStartTagHead() {
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(startTag("head"), builder));
        assertEquals(HtmlTreeBuilderState.InHead, builder.state());
        assertNotNull(builder.getHeadElement());
    }

    @Test
    public void testBeforeHeadEndTagAllowed() {
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(endTag("body"), builder));
    }

    @Test
    public void testBeforeHeadEndTagNotAllowed() {
        assertFalse(HtmlTreeBuilderState.BeforeHead.process(endTag("div"), builder));
    }

    @Test
    public void testBeforeHeadDoctype() {
        assertFalse(HtmlTreeBuilderState.BeforeHead.process(doctypeToken("html", false), builder));
    }

    @Test
    public void testBeforeHeadOther() {
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(nonWhitespaceChar(), builder));
    }

    // --- InHead state ---
    @Test
    public void testInHeadWhitespace() {
        assertTrue(HtmlTreeBuilderState.InHead.process(whitespaceChar(), builder));
    }

    @Test
    public void testInHeadStartTagBase() {
        Token.StartTag base = startTag("base");
        base.attributes.put("href", "http://example.com");
        assertTrue(HtmlTreeBuilderState.InHead.process(base, builder));
    }

    @Test
    public void testInHeadStartTagMeta() {
        assertTrue(HtmlTreeBuilderState.InHead.process(startTag("meta"), builder));
    }

    @Test
    public void testInHeadStartTagTitle() {
        assertTrue(HtmlTreeBuilderState.InHead.process(startTag("title"), builder));
        assertEquals(HtmlTreeBuilderState.Text, builder.state());
    }

    @Test
    public void testInHeadStartTagScript() {
        assertTrue(HtmlTreeBuilderState.InHead.process(startTag("script"), builder));
        assertEquals(HtmlTreeBuilderState.Text, builder.state());
    }

    @Test
    public void testInHeadEndTagHead() {
        // need head on stack
        builder.push(new Element(Tag.valueOf("head"), ""));
        assertTrue(HtmlTreeBuilderState.InHead.process(endTag("head"), builder));
        assertEquals(HtmlTreeBuilderState.AfterHead, builder.state());
    }

    @Test
    public void testInHeadEndTagBody() {
        assertTrue(HtmlTreeBuilderState.InHead.process(endTag("body"), builder));
    }

    @Test
    public void testInHeadEndTagUnknown() {
        assertFalse(HtmlTreeBuilderState.InHead.process(endTag("div"), builder));
    }

    // --- InBody state (selected branches) ---
    private void setupInBody() {
        builder.transition(HtmlTreeBuilderState.InBody);
        // ensure body element exists on stack (as second element after html)
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        builder.push(html);
        builder.push(body);
    }

    @Test
    public void testInBodyWhitespace() {
        setupInBody();
        assertTrue(HtmlTreeBuilderState.InBody.process(whitespaceChar(), builder));
    }

    @Test
    public void testInBodyNonWhitespace() {
        setupInBody();
        assertTrue(HtmlTreeBuilderState.InBody.process(nonWhitespaceChar(), builder));
    }

    @Test
    public void testInBodyNullString() {
        setupInBody();
        assertFalse(HtmlTreeBuilderState.InBody.process(nullChar(), builder));
    }

    @Test
    public void testInBodyStartTagA() {
        setupInBody();
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag("a"), builder));
        assertNotNull(builder.getActiveFormattingElement("a"));
    }

    @Test
    public void testInBodyStartTagLi() {
        setupInBody();
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag("li"), builder));
    }

    @Test
    public void testInBodyStartTagHtml() {
        setupInBody();
        // html tag when html already on stack – should copy attributes
        Token.StartTag html = startTag("html");
        html.attributes.put("lang", "en");
        assertTrue(HtmlTreeBuilderState.InBody.process(html, builder));
        Element root = builder.getStack().get(0);
        assertTrue(root.hasAttr("lang"));
    }

    @Test
    public void testInBodyStartTagBody() {
        setupInBody();
        Token.StartTag body = startTag("body");
        body.attributes.put("class", "main");
        assertTrue(HtmlTreeBuilderState.InBody.process(body, builder));
        Element bodyEl = builder.getStack().get(1);
        assertTrue(bodyEl.hasAttr("class"));
    }

    @Test
    public void testInBodyStartTagForm() {
        setupInBody();
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag("form"), builder));
        assertNotNull(builder.getFormElement());
    }

    @Test
    public void testInBodyStartTagTable() {
        setupInBody();
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag("table"), builder));
        assertEquals(HtmlTreeBuilderState.InTable, builder.state());
    }

    @Test
    public void testInBodyStartTagButton() {
        setupInBody();
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag("button"), builder));
    }

    @Test
    public void testInBodyEndTagPNotInScope() {
        setupInBody();
        // no p on stack -> should generate implied end tags and then process start tag p, then process end tag again
        assertTrue(HtmlTreeBuilderState.InBody.process(endTag("p"), builder));
        // now p should be on stack
        assertTrue(builder.inScope("p"));
    }

    @Test
    public void testInBodyEndTagPInScope() {
        setupInBody();
        builder.processStartTag("p"); // insert p
        assertTrue(HtmlTreeBuilderState.InBody.process(endTag("p"), builder));
        assertFalse(builder.inScope("p"));
    }

    @Test
    public void testInBodyEndTagBody() {
        setupInBody();
        assertTrue(HtmlTreeBuilderState.InBody.process(endTag("body"), builder));
        assertEquals(HtmlTreeBuilderState.AfterBody, builder.state());
    }

    @Test
    public void testInBodyEndTagHtml() {
        setupInBody();
        // should process end tag body first, then html
        assertTrue(HtmlTreeBuilderState.InBody.process(endTag("html"), builder));
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, builder.state());
    }

    @Test
    public void testInBodyEndTagForm() {
        setupInBody();
        builder.processStartTag("form");
        Element form = builder.getFormElement();
        assertNotNull(form);
        assertTrue(HtmlTreeBuilderState.InBody.process(endTag("form"), builder));
        assertNull(builder.getFormElement());
    }

    @Test
    public void testInBodyEndTagLiInScope() {
        setupInBody();
        builder.processStartTag("li");
        assertTrue(HtmlTreeBuilderState.InBody.process(endTag("li"), builder));
        assertFalse(builder.inListItemScope("li"));
    }

    @Test
    public void testInBodyEndTagHeading() {
        setupInBody();
        builder.processStartTag("h1");
        assertTrue(HtmlTreeBuilderState.InBody.process(endTag("h1"), builder));
    }

    @Test
    public void testInBodyEndTagBr() {
        setupInBody();
        // br end tag triggers start tag br and returns false
        assertFalse(HtmlTreeBuilderState.InBody.process(endTag("br"), builder));
    }

    @Test
    public void testInBodyAnyOtherEndTagFound() {
        setupInBody();
        builder.processStartTag("span");
        assertTrue(HtmlTreeBuilderState.InBody.process(endTag("span"), builder));
    }

    @Test
    public void testInBodyAnyOtherEndTagNotFound() {
        setupInBody();
        assertFalse(HtmlTreeBuilderState.InBody.process(endTag("unknown"), builder));
    }

    // --- InTable state (selected) ---
    @Test
    public void testInTableStartTagCaption() {
        builder.transition(HtmlTreeBuilderState.InTable);
        // need table on stack
        Element table = new Element(Tag.valueOf("table"), "");
        builder.push(table);
        assertTrue(HtmlTreeBuilderState.InTable.process(startTag("caption"), builder));
        assertEquals(HtmlTreeBuilderState.InCaption, builder.state());
    }

    @Test
    public void testInTableEndTagTableInScope() {
        builder.transition(HtmlTreeBuilderState.InTable);
        Element table = new Element(Tag.valueOf("table"), "");
        builder.push(table);
        builder.push(new Element(Tag.valueOf("tbody"), ""));
        assertTrue(HtmlTreeBuilderState.InTable.process(endTag("table"), builder));
        // after popping to close table, state should be whatever follows
        assertNotEquals(HtmlTreeBuilderState.InTable, builder.state());
    }

    @Test
    public void testInTableEndTagTableNotInScope() {
        builder.transition(HtmlTreeBuilderState.InTable);
        assertFalse(HtmlTreeBuilderState.InTable.process(endTag("table"), builder));
    }

    // --- InSelect state (selected) ---
    @Test
    public void testInSelectStartTagOption() {
        builder.transition(HtmlTreeBuilderState.InSelect);
        Element select = new Element(Tag.valueOf("select"), "");
        builder.push(select);
        assertTrue(HtmlTreeBuilderState.InSelect.process(startTag("option"), builder));
    }

    @Test
    public void testInSelectEndTagSelectInScope() {
        builder.transition(HtmlTreeBuilderState.InSelect);
        Element select = new Element(Tag.valueOf("select"), "");
        builder.push(select);
        assertTrue(HtmlTreeBuilderState.InSelect.process(endTag("select"), builder));
        assertFalse(builder.inSelectScope("select"));
    }

    @Test
    public void testInSelectEndTagSelectNotInScope() {
        builder.transition(HtmlTreeBuilderState.InSelect);
        assertFalse(HtmlTreeBuilderState.InSelect.process(endTag("select"), builder));
    }

    // --- Text state ---
    @Test
    public void testTextCharacter() {
        builder.transition(HtmlTreeBuilderState.Text);
        builder.markInsertionMode(); // needed for transition
        assertTrue(HtmlTreeBuilderState.Text.process(nonWhitespaceChar(), builder));
    }

    @Test
    public void testTextEndTag() {
        builder.transition(HtmlTreeBuilderState.Text);
        builder.markInsertionMode();
        // setup stack so that pop works
        builder.push(new Element(Tag.valueOf("div"), ""));
        assertTrue(HtmlTreeBuilderState.Text.process(endTag("div"), builder));
        assertEquals(HtmlTreeBuilderState.InBody, builder.state()); // original state after initial? assume
    }

    @Test
    public void testTextEOF() {
        builder.transition(HtmlTreeBuilderState.Text);
        builder.markInsertionMode();
        builder.push(new Element(Tag.valueOf("div"), ""));
        Token eof = new Token.EOF();
        assertTrue(HtmlTreeBuilderState.Text.process(eof, builder));
    }

    // --- AfterBody state ---
    @Test
    public void testAfterBodyWhitespace() {
        builder.transition(HtmlTreeBuilderState.AfterBody);
        assertTrue(HtmlTreeBuilderState.AfterBody.process(whitespaceChar(), builder));
    }

    @Test
    public void testAfterBodyComment() {
        builder.transition(HtmlTreeBuilderState.AfterBody);
        assertTrue(HtmlTreeBuilderState.AfterBody.process(commentToken(), builder));
    }

    @Test
    public void testAfterBodyStartTagHtml() {
        builder.transition(HtmlTreeBuilderState.AfterBody);
        assertTrue(HtmlTreeBuilderState.AfterBody.process(startTag("html"), builder));
    }

    @Test
    public void testAfterBodyEndTagHtml() {
        builder.transition(HtmlTreeBuilderState.AfterBody);
        assertTrue(HtmlTreeBuilderState.AfterBody.process(endTag("html"), builder));
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, builder.state());
    }

    @Test
    public void testAfterBodyOther() {
        builder.transition(HtmlTreeBuilderState.AfterBody);
        assertTrue(HtmlTreeBuilderState.AfterBody.process(nonWhitespaceChar(), builder));
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());
    }

    // --- InFrameset state (basic) ---
    @Test
    public void testInFramesetStartTagFrameset() {
        builder.transition(HtmlTreeBuilderState.InFrameset);
        Element frameset = new Element(Tag.valueOf("frameset"), "");
        builder.push(frameset);
        assertTrue(HtmlTreeBuilderState.InFrameset.process(startTag("frameset"), builder));
    }

    @Test
    public void testInFramesetEndTagFrameset() {
        builder.transition(HtmlTreeBuilderState.InFrameset);
        Element frameset = new Element(Tag.valueOf("frameset"), "");
        builder.push(frameset);
        assertTrue(HtmlTreeBuilderState.InFrameset.process(endTag("frameset"), builder));
        assertEquals(HtmlTreeBuilderState.AfterFrameset, builder.state());
    }

    // --- AfterFrameset state ---
    @Test
    public void testAfterFramesetWhitespace() {
        builder.transition(HtmlTreeBuilderState.AfterFrameset);
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(whitespaceChar(), builder));
    }

    @Test
    public void testAfterFramesetEndTagHtml() {
        builder.transition(HtmlTreeBuilderState.AfterFrameset);
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(endTag("html"), builder));
        assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, builder.state());
    }

    // --- AfterAfterBody state ---
    @Test
    public void testAfterAfterBodyComment() {
        builder.transition(HtmlTreeBuilderState.AfterAfterBody);
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(commentToken(), builder));
    }

    @Test
    public void testAfterAfterBodyOther() {
        builder.transition(HtmlTreeBuilderState.AfterAfterBody);
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(nonWhitespaceChar(), builder));
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());
    }
}