package org.jsoup.parser;
import org.junit.Before;
import org.junit.Test;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import java.util.List;
import static org.junit.Assert.*;

public class TreeBuilderStateTest {
    private HtmlTreeBuilder tb;
    private Parser parser;
    
    @Before
    public void setUp() {
        tb = new HtmlTreeBuilder();
        parser = new Parser(tb);
        tb.initialiseParse("", "http://example.com", parser);
    }
    
    private Token.Character whitespaceChar() {
        return new Token.Character(" ");
    }
    
    private Token.Character nullChar() {
        return new Token.Character("\u0000");
    }
    
    private Token.Comment commentToken(String data) {
        return new Token.Comment(data);
    }
    
    private Token.Doctype doctypeToken(String name, String pub, String sys) {
        Token.Doctype dt = new Token.Doctype();
        dt.setName(name);
        dt.setPublicIdentifier(pub);
        dt.setSystemIdentifier(sys);
        dt.setForceQuirks(false);
        return dt;
    }
    
    private Token.Doctype doctypeTokenForceQuirks() {
        Token.Doctype dt = new Token.Doctype();
        dt.setName("html");
        dt.setPublicIdentifier("");
        dt.setSystemIdentifier("");
        dt.setForceQuirks(true);
        return dt;
    }
    
    private Token.StartTag startTag(String name) {
        return new Token.StartTag(name);
    }
    
    private Token.EndTag endTag(String name) {
        return new Token.EndTag(name);
    }
    
    @Test
    public void testInitialWhitespace() {
        assertTrue(tb.process(whitespaceChar()));
        assertEquals(TreeBuilderState.Initial, tb.state());
    }
    
    @Test
    public void testInitialComment() {
        assertTrue(tb.process(commentToken("test")));
        List<Node> children = tb.getDocument().childNodes();
        assertTrue(children.size() > 0);
        assertTrue(children.get(0) instanceof Comment);
    }
    
    @Test
    public void testInitialDoctype() {
        assertTrue(tb.process(doctypeToken("html", "", "")));
        assertEquals(TreeBuilderState.BeforeHtml, tb.state());
        List<Node> children = tb.getDocument().childNodes();
        assertTrue(children.size() > 0);
        assertTrue(children.get(0) instanceof DocumentType);
    }
    
    @Test
    public void testInitialStartTag() {
        tb.process(startTag("html"));
        assertEquals(TreeBuilderState.BeforeHead, tb.state());
    }
    
    @Test
    public void testBeforeHtmlDoctype() {
        tb.transition(TreeBuilderState.BeforeHtml);
        assertFalse(tb.process(doctypeToken("html", "", "")));
        assertEquals(TreeBuilderState.BeforeHtml, tb.state());
    }
    
    @Test
    public void testBeforeHtmlComment() {
        tb.transition(TreeBuilderState.BeforeHtml);
        assertTrue(tb.process(commentToken("test")));
        List<Node> children = tb.getDocument().childNodes();
        Node last = children.get(children.size() - 1);
        assertTrue(last instanceof Comment);
    }
    
    @Test
    public void testBeforeHtmlStartTagHtml() {
        tb.transition(TreeBuilderState.BeforeHtml);
        assertTrue(tb.process(startTag("html")));
        assertEquals(TreeBuilderState.BeforeHead, tb.state());
    }
    
    @Test
    public void testBeforeHtmlEndTagBody() {
        tb.transition(TreeBuilderState.BeforeHtml);
        assertTrue(tb.process(endTag("body")));
        assertEquals(TreeBuilderState.InHead, tb.state());
    }
}