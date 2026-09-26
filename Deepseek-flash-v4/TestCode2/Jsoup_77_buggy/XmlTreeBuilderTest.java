package org.jsoup.parser;

import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    private XmlTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new XmlTreeBuilder();
    }

    @Test
    public void defaultSettingsPreserveCase() {
        assertSame(ParseSettings.preserveCase, builder.defaultSettings());
    }

    @Test
    public void parseReaderSetsXmlSyntaxAndBaseUri() {
        Document doc = builder.parse(
                new StringReader("<root/>"),
                "http://example.com/base"
        );

        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        assertEquals("http://example.com/base", doc.baseUri());
        assertEquals("root", doc.child(0).tagName());
    }

    @Test
    public void parseStringPreservesCaseAndAttributes() {
        Document doc = builder.parse(
                "<ROOT A=\"1\"><Child>text</Child></ROOT>",
                ""
        );

        Element root = doc.child(0);
        assertEquals("ROOT", root.tagName());
        assertEquals("1", root.attr("A"));
        assertEquals("Child", root.child(0).tagName());
        assertEquals("text", root.child(0).text());
    }

    @Test
    public void selfClosingUnknownTagIsPreserved() {
        Document doc = builder.parse("<root><custom /></root>", "");

        String html = doc.child(0).child(0).outerHtml();

        assertTrue(html.contains("/"));
        assertFalse(html.contains("</custom>"));
    }

    @Test
    public void unmatchedEndTagIsIgnored() {
        Document doc = builder.parse("<root></missing></root>", "");

        assertEquals(1, doc.childNodes().size());
        assertEquals("root", doc.child(0).tagName());
    }

    @Test
    public void endTagClosesOpenElementsUntilMatch() {
        Document doc = builder.parse("<a><b><c></a>", "");

        Element a = doc.child(0);
        assertEquals("a", a.tagName());
        assertEquals("b", a.child(0).tagName());
        assertEquals("c", a.child(0).child(0).tagName());
    }

    @Test
    public void commentIsInserted() {
        Document doc = builder.parse(
                "<!-- before --><root><!-- inside --></root>",
                ""
        );

        assertEquals(2, doc.childNodes().size());
        assertEquals(" before ", ((Comment) doc.childNode(0)).getData());
        assertEquals(" inside ", ((Comment) doc.child(0).childNode(0)).getData());
    }

    @Test
    public void bogusCommentXmlDeclarationBecomesXmlDeclarationNode() {
        Document doc = builder.parse(
                "<?xml version=\"1.0\"?><root/>",
                ""
        );

        assertTrue(doc.childNode(0) instanceof XmlDeclaration);
        assertTrue(doc.childNode(0).outerHtml().contains("xml version=\"1.0\""));
    }

    @Test
    public void doctypeIsInserted() {
        Document doc = builder.parse(
                "<!DOCTYPE note SYSTEM \"Note.dtd\"><note/>",
                ""
        );

        assertEquals(2, doc.childNodes().size());
        assertTrue(doc.childNode(0) instanceof DocumentType);
    }

    @Test
    public void cdataIsInsertedAsCDataNode() {
        Document doc = builder.parse(
                "<root><![CDATA[<b>raw</b>]]></root>",
                ""
        );

        Node node = doc.child(0).childNode(0);
        assertTrue(node instanceof CDataNode);
        assertTrue(node.outerHtml().contains("<![CDATA[<b>raw</b>]]>"));
    }

    @Test
    public void parseFragmentReturnsChildNodes() {
        List<Node> nodes = builder.parseFragment(
                "<a/><b/>",
                "http://example.com",
                ParseErrorList.noTracking(),
                ParseSettings.preserveCase
        );

        assertEquals(2, nodes.size());
        assertEquals("a", nodes.get(0).nodeName());
        assertEquals("b", nodes.get(1).nodeName());
    }

    @Test
    public void parseFragmentEmptyReturnsEmptyList() {
        List<Node> nodes = builder.parseFragment(
                "",
                "http://example.com",
                ParseErrorList.noTracking(),
                ParseSettings.preserveCase
        );

        assertNotNull(nodes);
        assertEquals(0, nodes.size());
    }

    @Test
    public void emptyDocumentHasNoChildren() {
        Document doc = builder.parse("", "http://example.com");

        assertEquals(0, doc.childNodes().size());
    }

    @Test(expected = NullPointerException.class)
    public void parseNullStringThrows() {
        builder.parse((String) null, "http://example.com");
    }
}