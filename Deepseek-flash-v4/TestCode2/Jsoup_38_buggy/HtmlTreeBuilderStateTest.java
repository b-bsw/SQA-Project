package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {

    private HtmlTreeBuilder newBuilder() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse("", "http://example.com", ParseErrorList.noTracking());
        tb.transition(HtmlTreeBuilderState.Initial);
        return tb;
    }

    private HtmlTreeBuilder bodyBuilder() {
        HtmlTreeBuilder tb = newBuilder();
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("body"));
        return tb;
    }

    private HtmlTreeBuilder tableBuilder() {
        HtmlTreeBuilder tb = bodyBuilder();
        tb.process(new Token.StartTag("table"));
        return tb;
    }

    @Test
    public void testEnumValues() {
        HtmlTreeBuilderState[] states = HtmlTreeBuilderState.values();
        assertEquals(23, states.length);
        assertEquals(HtmlTreeBuilderState.Initial, HtmlTreeBuilderState.valueOf("Initial"));
        assertEquals(HtmlTreeBuilderState.ForeignContent, HtmlTreeBuilderState.valueOf("ForeignContent"));
    }

    @Test
    public void testInitial() {
        HtmlTreeBuilder tb = newBuilder();
        assertTrue(HtmlTreeBuilderState.Initial.process(new Token.Character(" \n\t"), tb));
        assertEquals(0, tb.getDocument().childNodes().size());
        assertEquals(HtmlTreeBuilderState.Initial, tb.state());

        tb = newBuilder();
        assertTrue(HtmlTreeBuilderState.Initial.process(new Token.Comment("c"), tb));
        assertEquals(1, tb.getDocument().childNodes().size());
        assertEquals("#comment", tb.getDocument().childNode(0).nodeName());

        tb = newBuilder();
        assertFalse(HtmlTreeBuilderState.Initial.process(new Token.EndTag("unknown"), tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
    }

    @Test
    public void testInitialDoctypeViaParser() {
        org.jsoup.nodes.Document doc = org.jsoup.Jsoup.parse("<!DOCTYPE html><html><head></head><body></body></html>");
        assertEquals("#doctype", doc.childNode(0).nodeName());
    }

    @Test
    public void testBeforeHtml() {
        HtmlTreeBuilder tb = newBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(new Token.Character(" "), tb));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());

        tb = newBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(new Token.Comment("x"), tb));
        assertEquals("#comment", tb.getDocument().childNode(0).nodeName());

        tb = newBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(new Token.Doctype(), tb));

        tb = newBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHtml);
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(new Token.StartTag("html"), tb));
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
        assertEquals("html", tb.getStack().getFirst().nodeName());
    }

    @Test
    public void testBeforeHead() {
        HtmlTreeBuilder tb = newBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(new Token.StartTag("head"), tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
        assertEquals("head", tb.getStack().getLast().nodeName());
        assertNotNull(tb.getHeadElement());

        tb = newBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(new Token.EndTag("body"), tb));
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());
        assertEquals("body", tb.getStack().getLast().nodeName());
    }

    @Test
    public void testInHead() {
        HtmlTreeBuilder tb = newBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);
        assertFalse(HtmlTreeBuilderState.InHead.process(new Token.Doctype(), tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());

        tb = newBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);
        assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("title"), tb));
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
        assertEquals("title", tb.getStack().getLast().nodeName());

        tb = newBuilder();
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("head"));
        assertTrue(HtmlTreeBuilderState.InHead.process(new Token.EndTag("head"), tb));
        assertEquals(HtmlTreeBuilderState.AfterHead, tb.state());
        assertEquals("html", tb.getStack().getLast().nodeName());

        tb = newBuilder();
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("head"));
        assertTrue(HtmlTreeBuilderState.InHead.process(new Token.StartTag("noscript"), tb));
        assertEquals(HtmlTreeBuilderState.InHeadNoscript, tb.state());
    }

    @Test
    public void testInHeadNoscript() {
        HtmlTreeBuilder tb = newBuilder();
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("head"));
        tb.process(new Token.StartTag("noscript"));
        assertEquals(HtmlTreeBuilderState.InHeadNoscript, tb.state());
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(new Token.EndTag("noscript"), tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
        assertEquals("head", tb.getStack().getLast().nodeName());
    }

    @Test
    public void testAfterHead() {
        HtmlTreeBuilder tb = newBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);
        assertTrue(HtmlTreeBuilderState.AfterHead.process(new Token.StartTag("body"), tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("body", tb.getStack().getLast().nodeName());
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testInBody() {
        HtmlTreeBuilder tb = bodyBuilder();
        assertTrue(HtmlTreeBuilderState.InBody.process(new Token.Character("x"), tb));
        assertEquals("x", tb.getStack().getLast().text());
        assertFalse(tb.framesetOk());

        tb = bodyBuilder();
        assertTrue(HtmlTreeBuilderState.InBody.process(new Token.EndTag("body"), tb));
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());

        tb = bodyBuilder();
        assertFalse(HtmlTreeBuilderState.InBody.process(new Token.EndTag("br"), tb));
        assertEquals(1, tb.getDocument().select("br").size());

        tb = bodyBuilder();
        assertTrue(HtmlTreeBuilderState.InBody.process(new Token.StartTag("table"), tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());

        tb = bodyBuilder();
        tb.process(new Token.StartTag("form"));
        assertFalse(HtmlTreeBuilderState.InBody.process(new Token.StartTag("form"), tb));

        tb = bodyBuilder();
        assertTrue(HtmlTreeBuilderState.InBody.process(new Token.StartTag("span"), tb));
        assertEquals("span", tb.getStack().getLast().nodeName());
    }

    @Test
    public void testText() {
        HtmlTreeBuilder tb = bodyBuilder();
        tb.process(new Token.StartTag("script"));
        assertEquals(HtmlTreeBuilderState.Text, tb.state());
        assertTrue(HtmlTreeBuilderState.Text.process(new Token.EndTag("script"), tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testInTable() {
        HtmlTreeBuilder tb = tableBuilder();
        assertTrue(HtmlTreeBuilderState.InTable.process(new Token.EndTag("table"), tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("body", tb.getStack().getLast().nodeName());

        tb = tableBuilder();
        assertTrue(HtmlTreeBuilderState.InTable.process(new Token.StartTag("caption"), tb));
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
        assertEquals("caption", tb.getStack().getLast().nodeName());
    }

    @Test
    public void testInTableText() {
        HtmlTreeBuilder tb = tableBuilder();
        tb.markInsertionMode();
        tb.transition(HtmlTreeBuilderState.InTableText);
        assertTrue(HtmlTreeBuilderState.InTableText.process(new Token.Character("ab"), tb));
        assertEquals(1, tb.getPendingTableCharacters().size());

        tb = tableBuilder();
        tb.markInsertionMode();
        tb.transition(HtmlTreeBuilderState.InTableText);
        assertTrue(HtmlTreeBuilderState.InTableText.process(new Token.Character("x"), tb));
        assertTrue(HtmlTreeBuilderState.InTableText.process(new Token.EndTag("table"), tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testInCaption() {
        HtmlTreeBuilder tb = tableBuilder();
        tb.process(new Token.StartTag("caption"));
        assertTrue(HtmlTreeBuilderState.InCaption.process(new Token.EndTag("caption"), tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInColumnGroup() {
        HtmlTreeBuilder tb = tableBuilder();
        tb.process(new Token.StartTag("colgroup"));
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.StartTag("col"), tb));
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(new Token.EndTag("colgroup"), tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInTableBody() {
        HtmlTreeBuilder tb = tableBuilder();
        tb.process(new Token.StartTag("tbody"));
        assertTrue(HtmlTreeBuilderState.InTableBody.process(new Token.StartTag("tr"), tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());

        tb = tableBuilder();
        tb.process(new Token.StartTag("tbody"));
        assertTrue(HtmlTreeBuilderState.InTableBody.process(new Token.EndTag("tbody"), tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInRow() {
        HtmlTreeBuilder tb = tableBuilder();
        tb.process(new Token.StartTag("tbody"));
        tb.process(new Token.StartTag("tr"));
        assertTrue(HtmlTreeBuilderState.InRow.process(new Token.StartTag("td"), tb));
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());

        tb = tableBuilder();
        tb.process(new Token.StartTag("tbody"));
        tb.process(new Token.StartTag("tr"));
        assertTrue(HtmlTreeBuilderState.InRow.process(new Token.EndTag("tr"), tb));
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testInCell() {
        HtmlTreeBuilder tb = tableBuilder();
        tb.process(new Token.StartTag("tbody"));
        tb.process(new Token.StartTag("tr"));
        tb.process(new Token.StartTag("td"));
        assertTrue(HtmlTreeBuilderState.InCell.process(new Token.EndTag("td"), tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInSelect() {
        HtmlTreeBuilder tb = bodyBuilder();
        tb.process(new Token.StartTag("select"));
        assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.StartTag("option"), tb));
        assertEquals("option", tb.getStack().getLast().nodeName());

        tb = bodyBuilder();
        tb.process(new Token.StartTag("select"));
        assertTrue(HtmlTreeBuilderState.InSelect.process(new Token.EndTag("select"), tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("body", tb.getStack().getLast().nodeName());
    }

    @Test
    public void testInSelectInTable() {
        HtmlTreeBuilder tb = bodyBuilder();
        tb.process(new Token.StartTag("select"));
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(new Token.StartTag("table"), tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testAfterBody() {
        HtmlTreeBuilder tb = bodyBuilder();
        assertTrue(HtmlTreeBuilderState.InBody.process(new Token.EndTag("body"), tb));
        assertTrue(HtmlTreeBuilderState.AfterBody.process(new Token.EndTag("html"), tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void testInFrameset() {
        HtmlTreeBuilder tb = newBuilder();
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("head"));
        tb.process(new Token.EndTag("head"));
        tb.process(new Token.StartTag("frameset"));
        assertTrue(HtmlTreeBuilderState.InFrameset.process(new Token.EndTag("frameset"), tb));
        assertEquals(HtmlTreeBuilderState.AfterFrameset, tb.state());
    }

    @Test
    public void testAfterFrameset() {
        HtmlTreeBuilder tb = newBuilder();
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("head"));
        tb.process(new Token.EndTag("head"));
        tb.process(new Token.StartTag("frameset"));
        tb.process(new Token.EndTag("frameset"));
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(new Token.EndTag("html"), tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb.state());
    }

    @Test
    public void testAfterAfterBody() {
        HtmlTreeBuilder tb = bodyBuilder();
        tb.process(new Token.EndTag("body"));
        tb.process(new Token.EndTag("html"));
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.Comment("tail"), tb));
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(new Token.Character(" "), tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void testAfterAfterFrameset() {
        HtmlTreeBuilder tb = newBuilder();
        tb.process(new Token.StartTag("html"));
        tb.process(new Token.StartTag("head"));
        tb.process(new Token.EndTag("head"));
        tb.process(new Token.StartTag("frameset"));
        tb.process(new Token.EndTag("frameset"));
        tb.process(new Token.EndTag("html"));
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(new Token.Character(" "), tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb.state());
    }

    @Test
    public void testForeignContent() {
        assertTrue(HtmlTreeBuilderState.ForeignContent.process(new Token.Character("x"), newBuilder()));
    }
}