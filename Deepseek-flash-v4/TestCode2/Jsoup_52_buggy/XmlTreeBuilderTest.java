package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.jsoup.nodes.*;
import java.util.List;

public class XmlTreeBuilderTest {
    private XmlTreeBuilder builder;
    private String baseUri = "http://example.com";
    private ParseErrorList errors;

    // --- Token stubs (inner classes to avoid external dependency on real Token) ---
    public abstract static class Token {
        public enum TokenType { StartTag, EndTag, Comment, Character, Doctype, EOF, Unknown }
        TokenType type;
        public TokenType type() { return type; }
        public StartTag asStartTag() { return (StartTag) this; }
        public EndTag asEndTag() { return (EndTag) this; }
        public Comment asComment() { return (Comment) this; }
        public Character asCharacter() { return (Character) this; }
        public Doctype asDoctype() { return (Doctype) this; }
        public EOF asEOF() { return (EOF) this; }

        public static class StartTag extends Token {
            private String name;
            private boolean selfClosing;
            private Attributes attributes = new Attributes();
            public StartTag() { type = TokenType.StartTag; }
            public String name() { return name; }
            public void name(String n) { this.name = n; }
            public boolean isSelfClosing() { return selfClosing; }
            public void isSelfClosing(boolean s) { selfClosing = s; }
            public Attributes attributes() { return attributes; }
        }
        public static class EndTag extends Token {
            private String name;
            public EndTag() { type = TokenType.EndTag; }
            public String name() { return name; }
            public void name(String n) { this.name = n; }
        }
        public static class Comment extends Token {
            private String data;
            public boolean bogus;
            public Comment() { type = TokenType.Comment; }
            public String getData() { return data; }
            public void data(String d) { this.data = d; }
        }
        public static class Character extends Token {
            private String data;
            public Character() { type = TokenType.Character; }
            public String getData() { return data; }
            public void data(String d) { this.data = d; }
        }
        public static class Doctype extends Token {
            private String name, publicIdentifier, systemIdentifier;
            public Doctype() { type = TokenType.Doctype; }
            public String getName() { return name; }
            public void name(String n) { this.name = n; }
            public String getPublicIdentifier() { return publicIdentifier; }
            public void publicIdentifier(String p) { this.publicIdentifier = p; }
            public String getSystemIdentifier() { return systemIdentifier; }
            public void systemIdentifier(String s) { this.systemIdentifier = s; }
        }
        public static class EOF extends Token {
            public EOF() { type = TokenType.EOF; }
        }
    }

    // Stub for ParseErrorList (needs concrete implementation)
    static class StubParseErrorList extends ParseErrorList {
        public StubParseErrorList() {
            super(1, 1);
        }
    }

    @Before
    public void setUp() {
        builder = new XmlTreeBuilder();
        errors = new StubParseErrorList();
    }

    // --- Test methods for process() ---
    @Test
    public void testProcessStartTag() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.isSelfClosing(false);
        assertTrue(builder.process(tag));
    }

    @Test
    public void testProcessEndTag() {
        Token.StartTag start = new Token.StartTag();
        start.name("div");
        start.isSelfClosing(false);
        builder.process(start);
        Token.EndTag end = new Token.EndTag();
        end.name("div");
        assertTrue(builder.process(end));
    }

    @Test
    public void testProcessComment() {
        Token.Comment comment = new Token.Comment();
        comment.data("test");
        comment.bogus(false);
        assertTrue(builder.process(comment));
    }

    @Test
    public void testProcessCharacter() {
        Token.Character charTok = new Token.Character();
        charTok.data("text");
        assertTrue(builder.process(charTok));
    }

    @Test
    public void testProcessDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name("html");
        assertTrue(builder.process(doctype));
    }

    @Test
    public void testProcessEof() {
        Token.EOF eof = new Token.EOF();
        assertTrue(builder.process(eof));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProcessUnknownTokenType() {
        Token unknown = new Token() {{ type = TokenType.Unknown; }};
        builder.process(unknown);
    }

    // --- Test methods for insert() (package-private) ---
    @Test
    public void testInsertStartTag() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("root");
        tag.isSelfClosing(false);
        Element el = builder.insert(tag);
        assertNotNull(el);
        assertEquals("root", el.tagName());
    }

    @Test
    public void testInsertStartTagSelfClosing() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("br");
        tag.isSelfClosing(true);
        Element el = builder.insert(tag);
        assertNotNull(el);
        assertEquals("br", el.tagName());
    }

    @Test
    public void testInsertCommentNotBogus() {
        Token.Comment comment = new Token.Comment();
        comment.data("simple comment");
        comment.bogus(false);
        builder.insert(comment);
        // no exception, node added to current element
    }

    @Test
    public void testInsertCommentBogusDeclaration() {
        Token.Comment comment = new Token.Comment();
        comment.data("?xml version=\"1.0\"?");
        comment.bogus(true);
        builder.insert(comment);
        // should create XmlDeclaration
    }

    @Test
    public void testInsertCharacter() {
        Token.Character charTok = new Token.Character();
        charTok.data("text node");
        builder.insert(charTok);
    }

    @Test
    public void testInsertDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name("html");
        doctype.publicIdentifier(null);
        doctype.systemIdentifier(null);
        builder.insert(doctype);
    }

    // --- Test parseFragment (public) ---
    @Test
    public void testParseFragmentEmpty() {
        List<Node> nodes = builder.parseFragment("", baseUri, errors);
        assertNotNull(nodes);
        assertTrue(nodes.isEmpty());
    }

    @Test
    public void testParseFragmentSingleElement() {
        List<Node> nodes = builder.parseFragment("<root/>", baseUri, errors);
        assertEquals(1, nodes.size());
        Element root = (Element) nodes.get(0);
        assertEquals("root", root.nodeName());
    }

    @Test
    public void testParseFragmentNested() {
        List<Node> nodes = builder.parseFragment("<parent><child>text</child></parent>", baseUri, errors);
        assertEquals(1, nodes.size());
        Element parent = (Element) nodes.get(0);
        assertEquals("parent", parent.nodeName());
        assertEquals(1, parent.children().size());
        Element child = parent.child(0);
        assertEquals("child", child.nodeName());
        assertEquals("text", child.text());
    }

    @Test
    public void testParseFragmentMultipleRoots() {
        List<Node> nodes = builder.parseFragment("<a></a><b></b>", baseUri, errors);
        assertEquals(2, nodes.size());
        assertEquals("a", ((Element)nodes.get(0)).nodeName());
        assertEquals("b", ((Element)nodes.get(1)).nodeName());
    }

    // --- popStackToClose indirectly tested through end tag processing ---
    @Test
    public void testEndTagNotFound() {
        // stack only has doc; closing unknown tag should not throw
        Token.EndTag end = new Token.EndTag();
        end.name("unknown");
        assertTrue(builder.process(end));
    }

    @Test
    public void testEndTagFound() {
        Token.StartTag start = new Token.StartTag();
        start.name("div");
        start.isSelfClosing(false);
        builder.process(start);
        Token.EndTag end = new Token.EndTag();
        end.name("div");
        builder.process(end);
        // after closing, further inserts should be children of doc, not div
        // verify by inserting a character and then checking doc children count
    }
}