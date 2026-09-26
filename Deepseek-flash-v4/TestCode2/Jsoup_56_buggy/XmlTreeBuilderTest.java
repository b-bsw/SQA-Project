package org.jsoup.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class XmlTreeBuilderTest {

    private XmlTreeBuilder builder;
    private String baseUri;

    @Before
    public void setUp() {
        builder = new XmlTreeBuilder();
        baseUri = "http://example.com/";
    }

    @After
    public void tearDown() {
        builder = null;
    }

    @Test
    public void defaultSettingsReturnsPreserveCase() {
        assertSame(ParseSettings.preserveCase, builder.defaultSettings());
    }

    @Test
    public void emptyInputProducesEmptyDocument() {
        Document doc = builder.parse("", baseUri);
        assertNotNull(doc);
        assertEquals(0, doc.childNodes().size());
        assertSame(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullInputThrows() {
        builder.parse(null, baseUri);
    }

    @Test
    public void parsesXmlPreservingCase() {
        Document doc = builder.parse("<Root><Child A='1'>text</Child></Root>", baseUri);
        Element root = doc.child(0);
        Element child = root.child(0);

        assertEquals("Root", root.tagName());
        assertEquals("Child", child.tagName());
        assertTrue(child.hasAttr("A"));
        assertFalse(child.hasAttr("a"));
        assertEquals("text", child.text());
        assertSame(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
    }

    @Test
    public void handlesTextAndComments() {
        Document doc = builder.parse("<root>before<!-- comment -->after</root>", baseUri);
        Element root = doc.child(0);
        List<Node> children = root.childNodes();

        assertEquals(3, children.size());
        assertEquals("before", ((TextNode) children.get(0)).text());
        assertEquals(" comment ", ((Comment) children.get(1)).getData());
        assertEquals("after", ((TextNode) children.get(2)).text());
    }

    @Test
    public void turnsBogusCommentIntoXmlDeclaration() {
        Document doc = builder.parse("<?xml version=\"1.0\"?><root/>", baseUri);
        List<Node> nodes = doc.childNodes();

        assertEquals(2, nodes.size());
        assertTrue(nodes.get(0) instanceof XmlDeclaration);
        assertEquals("root", nodes.get(1).nodeName());
    }

    @Test
    public void insertsDoctypeBeforeRoot() {
        Document doc = builder.parse("<!DOCTYPE root PUBLIC \"pub\" \"sys\"><root/>", baseUri);
        List<Node> nodes = doc.childNodes();

        assertEquals(2, nodes.size());
        assertTrue(nodes.get(0) instanceof DocumentType);
        assertEquals("root", nodes.get(1).nodeName());
    }

    @Test
    public void selfClosingUnknownTagIsRecognized() {
        Document doc = builder.parse("<root><custom/></root>", baseUri);
        Element custom = doc.child(0).child(0);

        assertEquals("custom", custom.tagName());
        assertTrue(custom.tag().isSelfClosing());
    }

    @Test
    public void unmatchedEndTagIsSkipped() {
        Document doc = builder.parse("<root></missing>", baseUri);
        Element root = doc.child(0);

        assertEquals("root", root.tagName());
        assertEquals(0, root.childNodes().size());
    }

    @Test
    public void parseFragmentReturnsDocumentChildren() {
        List<Node> nodes = builder.parseFragment(
                "<one>1</one><two>2</two>", baseUri,
                ParseErrorList.noTracking(), ParseSettings.preserveCase);

        assertEquals(2, nodes.size());
        assertEquals("one", nodes.get(0).nodeName());
        assertEquals("two", nodes.get(1).nodeName());
    }
}