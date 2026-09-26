package org.jsoup.parser;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Token;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.ParseSettings;
import java.util.ArrayList;
import java.util.List;

public class HtmlTreeBuilderStateTest {
    private HtmlTreeBuilder tb;
    private Document doc;

    @Before
    public void setUp() {
        doc = new Document("");
        tb = new HtmlTreeBuilder(doc);
    }

    @Test
    public void testInitialWhitespace() {
        Token.Character whitespace = new Token.Character();
        whitespace.data("   ");
        assertTrue(tb.process(whitespace));
        assertSame(HtmlTreeBuilderState.Initial, tb.state());
    }

    @Test
    public void testInitialComment() {
        Token.Comment comment = new Token.Comment();
        comment.data("test");
        assertTrue(tb.process(comment));
        assertEquals(1, doc.childNodeSize());
        assertSame(HtmlTreeBuilderState.Initial, tb.state());
    }

    @Test
    public void testInitialDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.setName("html");
        doctype.setPubSysKey(null);
        assertTrue(tb.process(doctype));
        assertEquals(1, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof DocumentType);
        assertSame(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testInitialDoctypeForceQuirks() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.setName("html");
        doctype.setForceQuirks(true);
        assertTrue(tb.process(doctype));
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

    @Test
    public void testInitialOtherToken() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        assertTrue(tb.process(startTag));
        assertSame(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testBeforeHtmlDoctype() {
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.Doctype doctype = new Token.Doctype();
        doctype.setName("html");
        assertFalse(tb.process(doctype));
    }

    @Test
    public void testBeforeHtmlComment() {
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.Comment comment = new Token.Comment();
        comment.data("test");
        assertTrue(tb.process(comment));
        assertEquals(1, doc.childNodeSize());
    }

    @Test
    public void testBeforeHtmlWhitespace() {
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.Character whitespace = new Token.Character();
        whitespace.data(" ");
        assertTrue(tb.process(whitespace));
        assertSame(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testBeforeHtmlStartTagHtml() {
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("html");
        assertTrue(tb.process(startTag));
        Element html = doc.children().get(0);
        assertEquals("html", html.nodeName());
        assertSame(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void testBeforeHtmlEndTagHeadBodyHtmlBr() {
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("head");
        assertTrue(tb.process(endTag));
        // should insert html and process endtag in head
        assertSame(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void testBeforeHtmlOtherEndTag() {
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("span");
        assertFalse(tb.process(endTag));
    }

    @Test
    public void testBeforeHeadDoctypeError() {
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.Doctype doctype = new Token.Doctype();
        doctype.setName("html");
        assertFalse(tb.process(doctype));
    }

    @Test
    public void testBeforeHeadStartTagHead() {
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("head");
        assertTrue(tb.process(startTag));
        assertNotNull(tb.getHeadElement());
        assertSame(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testBeforeHeadEndTagHeadBodyHtml() {
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("head");
        assertTrue(tb.process(endTag));
        // should process start head and then process the endtag
        assertSame(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testInHeadStartTagMeta() {
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("meta");
        assertTrue(tb.process(startTag));
        // meta inserted as empty element
        assertEquals(1, doc.head().children().size());
    }

    @Test
    public void testInHeadEndTagHead() {
        tb.transition(HtmlTreeBuilderState.InHead);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("head");
        assertTrue(tb.process(endTag));
        assertSame(HtmlTreeBuilderState.AfterHead, tb.state());
    }

    @Test
    public void testInBodyStartTagAnchor() {
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("a");
        startTag.attributes.put("href", "http://example.com");
        assertTrue(tb.process(startTag));
        // a element should be active formatting element
        assertNotNull(tb.getActiveFormattingElement("a"));
    }

    @Test
    public void testInBodyStartTagParagraph() {
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("p");
        assertTrue(tb.process(startTag));
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyEndTagParagraph() {
        tb.transition(HtmlTreeBuilderState.InBody);
        // first insert a p
        Token.StartTag startP = new Token.StartTag();
        startP.name("p");
        tb.process(startP);
        Token.EndTag endP = new Token.EndTag();
        endP.name("p");
        assertTrue(tb.process(endP));
        // p should be closed
        assertNotEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyStartTagForm() {
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("form");
        assertTrue(tb.process(startTag));
        assertNotNull(tb.getFormElement());
    }

    @Test
    public void testInBodyEndTagBody() {
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("body");
        assertTrue(tb.process(endTag));
        assertSame(HtmlTreeBuilderState.AfterBody, tb.state());
    }

    @Test
    public void testInBodyEndTagHtml() {
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("html");
        assertTrue(tb.process(endTag));
        // should process end body first then end html
        assertSame(HtmlTreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void testInBodyStartTagLi() {
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("li");
        assertTrue(tb.process(startTag));
        assertEquals("li", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyStartTagTable() {
        tb.transition(HtmlTreeBuilderState.InBody);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("table");
        assertTrue(tb.process(startTag));
        assertSame(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInTableInputHidden() {
        tb.transition(HtmlTreeBuilderState.InTable);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("input");
        startTag.attributes.put("type", "hidden");
        assertTrue(tb.process(startTag));
        // input should be inserted in table
        assertEquals(1, doc.body().children().size());
    }

    @Test
    public void testInSelectOption() {
        tb.transition(HtmlTreeBuilderState.InSelect);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("option");
        assertTrue(tb.process(startTag));
        assertEquals("option", tb.currentElement().nodeName());
    }

    @Test
    public void testInSelectEndTagSelect() {
        tb.transition(HtmlTreeBuilderState.InSelect);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("select");
        assertTrue(tb.process(endTag));
        assertNotSame(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testInSelectCharacterNull() {
        tb.transition(HtmlTreeBuilderState.InSelect);
        Token.Character c = new Token.Character();
        c.data("\u0000");
        assertFalse(tb.process(c));
    }

    @Test
    public void testAfterBodyWhitespace() {
        tb.transition(HtmlTreeBuilderState.AfterBody);
        Token.Character whitespace = new Token.Character();
        whitespace.data(" ");
        assertTrue(tb.process(whitespace));
    }

    @Test
    public void testInitialCharacterNull() {
        Token.Character c = new Token.Character();
        c.data("\u0000");
        assertTrue(tb.process(c)); // initial state handles null? Actually InBody handles nullString, but not Initial; so just returns true
    }

    @Test
    public void testInTableEndTagTable() {
        tb.transition(HtmlTreeBuilderState.InTable);
        // need a table in scope
        Token.StartTag startTable = new Token.StartTag();
        startTable.name("table");
        tb.process(startTable);
        Token.EndTag endTable = new Token.EndTag();
        endTable.name("table");
        assertTrue(tb.process(endTable));
        assertNotSame(HtmlTreeBuilderState.InTable, tb.state());
    }
}