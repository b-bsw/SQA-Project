package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class ParserTest {
    private Parser parser;

    @Before
    public void setUp() {
        parser = new Parser(new HtmlTreeBuilder());
    }

    @After
    public void tearDown() {
        parser = null;
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(parser.getTreeBuilder());
        assertTrue(parser.getTreeBuilder() instanceof HtmlTreeBuilder);
    }

    @Test
    public void testGetTreeBuilder() {
        assertSame(parser.getTreeBuilder(), parser.getTreeBuilder());
    }

    @Test
    public void testSetTreeBuilder() {
        XmlTreeBuilder xmlBuilder = new XmlTreeBuilder();
        Parser returned = parser.setTreeBuilder(xmlBuilder);
        assertSame(returned, parser);
        assertSame(xmlBuilder, parser.getTreeBuilder());
    }

    @Test
    public void testIsTrackErrorsDefault() {
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testIsTrackErrorsAfterSet() {
        parser.setTrackErrors(5);
        assertTrue(parser.isTrackErrors());
        parser.setTrackErrors(0);
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testSetTrackErrorsReturnsThis() {
        Parser returned = parser.setTrackErrors(3);
        assertSame(returned, parser);
    }

    @Test
    public void testGetErrorsBeforeParse() {
        // errors field is null until parseInput is called
        assertNull(parser.getErrors());
    }

    @Test
    public void testParseInputSimple() {
        Document doc = parser.parseInput("<html><head><title>Test</title></head><body><p>Hello</p></body></html>", "http://example.com");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
        Element body = doc.body();
        assertNotNull(body);
        assertEquals(1, body.children().size());
        assertEquals("p", body.child(0).tagName());
    }

    @Test
    public void testParseInputEmptyHtml() {
        Document doc = parser.parseInput("", "http://example.com");
        assertNotNull(doc);
        assertNotNull(doc.body());
        assertEquals(0, doc.body().children().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseInputNullHtml() {
        parser.parseInput(null, "http://example.com");
    }

    @Test
    public void testParseInputWithErrorTracking() {
        parser.setTrackErrors(10);
        assertTrue(parser.isTrackErrors());
        // Parse invalid HTML to generate errors
        Document doc = parser.parseInput("<p>Unclosed", "http://example.com");
        assertNotNull(doc);
        List<ParseError> errors = parser.getErrors();
        assertNotNull(errors);
        assertTrue(errors.size() > 0);
        // Verify error message
        ParseError first = errors.get(0);
        assertNotNull(first);
    }

    @Test
    public void testParseInputWithoutErrorTracking() {
        parser.setTrackErrors(0);
        assertFalse(parser.isTrackErrors());
        Document doc = parser.parseInput("<p>Unclosed", "http://example.com");
        assertNotNull(doc);
        List<ParseError> errors = parser.getErrors();
        assertNotNull(errors);
        assertEquals(0, errors.size()); // no tracking
    }

    @Test
    public void testStaticParse() {
        Document doc = Parser.parse("<html><body><div>Content</div></body></html>", "http://example.com");
        assertNotNull(doc);
        assertEquals("Content", doc.body().child(0).text());
    }

    @Test
    public void testStaticParseFragmentWithContext() {
        Document shell = Document.createShell("http://example.com");
        Element context = shell.body();
        List<Node> nodes = Parser.parseFragment("<br><b>bold</b>", context, "http://example.com");
        assertNotNull(nodes);
        assertEquals(2, nodes.size());
        assertEquals("br", ((Element)nodes.get(0)).tagName());
        assertEquals("b", ((Element)nodes.get(1)).tagName());
    }

    @Test
    public void testParseBodyFragment() {
        Document doc = Parser.parseBodyFragment("<p>Para</p>", "http://example.com");
        assertNotNull(doc);
        Element body = doc.body();
        assertNotNull(body);
        assertEquals(1, body.children().size());
        assertEquals("p", body.child(0).tagName());
        assertEquals("Para", body.child(0).text());
    }

    @Test
    public void testParseBodyFragmentRelaxed() {
        Document doc1 = Parser.parseBodyFragmentRelaxed("<span>relaxed</span>", "http://example.com");
        Document doc2 = Parser.parse("<span>relaxed</span>", "http://example.com");
        assertEquals(doc1.body().html(), doc2.body().html());
    }

    @Test
    public void testHtmlParser() {
        Parser htmlParser = Parser.htmlParser();
        assertNotNull(htmlParser);
        assertTrue(htmlParser.getTreeBuilder() instanceof HtmlTreeBuilder);
    }

    @Test
    public void testXmlParser() {
        Parser xmlParser = Parser.xmlParser();
        assertNotNull(xmlParser);
        assertTrue(xmlParser.getTreeBuilder() instanceof XmlTreeBuilder);
    }

    @Test
    public void testChainingSetTreeBuilderAndSetTrackErrors() {
        XmlTreeBuilder xmlBuilder = new XmlTreeBuilder();
        Parser result = parser.setTreeBuilder(xmlBuilder).setTrackErrors(2);
        assertSame(parser, result);
        assertSame(xmlBuilder, parser.getTreeBuilder());
        assertTrue(parser.isTrackErrors());
    }
}