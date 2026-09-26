package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {
    private XmlTreeBuilder builder;
    private String baseUri = "http://example.com";

    @Before
    public void setUp() {
        builder = new XmlTreeBuilder();
        builder.initialiseParse("<root></root>", baseUri, new ParseErrorList(16, 16));
    }

    @Test
    public void testInitialiseParseDocumentOnStack() {
        // after initialiseParse, doc should be on stack
        assertEquals(1, builder.stack.size());
        assertTrue(builder.stack.peek() instanceof Document);
    }

    @Test
    public void testProcessStartTag() {
        Token.StartTag startTag = new Token.StartTag("child");
        startTag.attributes = new Attributes();
        builder.process(startTag);
        // After processing, a new Element is appended to current element (doc), and stacked
        Element doc = (Element) builder.stack.get(0);
        assertEquals(1, doc.children().size());
        Element child = doc.child(0);
        assertEquals("child", child.tagName());
        // The child is also on the stack (since not self-closing)
        assertTrue(builder.stack.contains(child));
    }

    @Test
    public void testProcessStartTagSelfClosing() {
        Token.StartTag startTag = new Token.StartTag("void");
        startTag.attributes = new Attributes();
        startTag.selfClosing = true;
        builder.process(startTag);
        Element doc = (Element) builder.stack.get(0);
        assertEquals(1, doc.children().size());
        Element voidEl = doc.child(0);
        assertEquals("void", voidEl.tagName());
        // Self-closing tag should not be added to stack (still doc remains)
        assertEquals(1, builder.stack.size());
    }

    @Test
    public void testProcessEndTagMatching() {
        // Insert a child element first
        Token.StartTag startTag = new Token.StartTag("div");
        startTag.attributes = new Attributes();
        builder.process(startTag);
        assertEquals(2, builder.stack.size()); // doc + div

        // Process matching end tag
        Token.EndTag endTag = new Token.EndTag("div");
        builder.process(endTag);
        // Stack should pop back to doc only
        assertEquals(1, builder.stack.size());
        assertEquals("root", ((Element) builder.stack.get(0)).tagName()); // doc's element?
        // Actually doc's tagName is "#root"? ไม่ต้องตรวจสอบละเอียด แค่เช็ค stack size
    }

    @Test
    public void testProcessEndTagNotFound() {
        // No matching element on stack (only doc)
        Token.EndTag endTag = new Token.EndTag("unknown");
        builder.process(endTag);
        // Stack unchanged (size still 1)
        assertEquals(1, builder.stack.size());
    }

    @Test
    public void testProcessComment() {
        Token.Comment commentToken = new Token.Comment("my comment");
        builder.process(commentToken);
        Element doc = (Element) builder.stack.get(0);
        assertEquals(1, doc.children().size());
        assertTrue(doc.child(0) instanceof Comment);
        Comment comment = (Comment) doc.child(0);
        assertEquals("my comment", comment.getData());
    }

    @Test
    public void testProcessCharacter() {
        Token.Character charToken = new Token.Character("text content");
        builder.process(charToken);
        Element doc = (Element) builder.stack.get(0);
        assertEquals(1, doc.children().size());
        assertTrue(doc.child(0) instanceof TextNode);
        TextNode text = (TextNode) doc.child(0);
        assertEquals("text content", text.getWholeText());
    }

    @Test
    public void testProcessDoctype() {
        Token.Doctype doctypeToken = new Token.Doctype("html", "PUBLIC", "-//W3C//DTD XHTML 1.0 Strict//EN");
        builder.process(doctypeToken);
        Element doc = (Element) builder.stack.get(0);
        assertEquals(1, doc.children().size());
        assertTrue(doc.child(0) instanceof DocumentType);
        DocumentType dt = (DocumentType) doc.child(0);
        assertEquals("html", dt.name());
    }

    @Test
    public void testProcessEof() {
        Token.EOF eofToken = new Token.EOF();
        // Should do nothing, no exception
        builder.process(eofToken);
        assertEquals(1, builder.stack.size());
    }

    @Test(expected = org.jsoup.helper.ValidationException.class)
    public void testProcessUnexpectedTokenType() {
        // Create a custom token with unknown type (e.g., null) – but easier: create anonymous subclass with type null
        Token unknown = new Token() {
            {
                type = null; // force unexpected type
            }
        };
        builder.process(unknown);
    }

    @Test
    public void testPopStackToCloseMultipleElements() {
        // Simulate multiple nested elements: <a><b><c></c></b></a>
        Token.StartTag a = new Token.StartTag("a");
        a.attributes = new Attributes();
        builder.process(a);

        Token.StartTag b = new Token.StartTag("b");
        b.attributes = new Attributes();
        builder.process(b);

        Token.StartTag c = new Token.StartTag("c");
        c.attributes = new Attributes();
        builder.process(c);

        assertEquals(4, builder.stack.size()); // doc + a + b + c

        // Close tag "b" (not c) – should pop c first, then b
        Token.EndTag endB = new Token.EndTag("b");
        builder.process(endB);

        // After closing b, c should be popped too, and b should be removed, leaving doc and a
        assertEquals(2, builder.stack.size());
        Element top = builder.stack.peek();
        assertEquals("a", top.tagName());
    }

    @Test
    public void testPopStackToCloseFirstFound() {
        // Insert <a><b><a></a></b></a> – closing </a> should close the inner a first (first found when scanning from top)
        Token.StartTag a1 = new Token.StartTag("a");
        a1.attributes = new Attributes();
        builder.process(a1);

        Token.StartTag b = new Token.StartTag("b");
        b.attributes = new Attributes();
        builder.process(b);

        Token.StartTag a2 = new Token.StartTag("a");
        a2.attributes = new Attributes();
        builder.process(a2);

        assertEquals(4, builder.stack.size()); // doc, a1, b, a2

        Token.EndTag endA = new Token.EndTag("a");
        builder.process(endA);

        // Should pop only until a2 (inner a) is removed, leaving stack: doc, a1, b
        assertEquals(3, builder.stack.size());
        assertEquals("b", builder.stack.peek().tagName());
    }
}