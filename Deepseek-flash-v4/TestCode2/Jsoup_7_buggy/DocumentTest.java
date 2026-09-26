package org.jsoup.nodes;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class DocumentTest {

    @Test
    public void constructorCreatesDocumentWithBaseUriAndSettings() {
        Document doc = new Document("http://example.com");
        assertEquals("http://example.com", doc.baseUri());
        assertEquals("#document", doc.nodeName());
        assertNotNull(doc.outputSettings());
    }

    @Test
    public void createShellBuildsDocumentStructure() {
        Document doc = Document.createShell("http://example.com");
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("html", doc.getElementsByTag("html").first().nodeName());
        assertEquals("head", doc.head().nodeName());
        assertEquals("body", doc.body().nodeName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void createShellRejectsNullBaseUri() {
        Document.createShell(null);
    }

    @Test
    public void headAndBodyAreNullWhenAbsent() {
        Document doc = new Document("http://example.com");
        assertNull(doc.head());
        assertNull(doc.body());
    }

    @Test
    public void titleReturnsEmptyWhenNoTitleElement() {
        Document doc = Document.createShell("http://example.com");
        assertEquals("", doc.title());
    }

    @Test
    public void titleAddsElementWhenMissing() {
        Document doc = Document.createShell("http://example.com");
        doc.title("First");
        assertEquals("First", doc.title());
        assertEquals(1, doc.getElementsByTag("title").size());
    }

    @Test
    public void titleUpdatesExistingElement() {
        Document doc = Document.createShell("http://example.com");
        doc.title("One");
        doc.title("Two");
        assertEquals("Two", doc.title());
        assertEquals(1, doc.getElementsByTag("title").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void titleRejectsNull() {
        Document.createShell("http://example.com").title(null);
    }

    @Test
    public void createElementUsesDocumentBaseUriAndIsNotAttached() {
        Document doc = new Document("http://example.com/base");
        Element div = doc.createElement("div");
        assertEquals("div", div.nodeName());
        assertEquals("http://example.com/base", div.baseUri());
        assertNull(div.parent());
    }

    @Test
    public void normaliseAddsMissingHtmlHeadAndBody() {
        Document doc = new Document("http://example.com");
        doc.normalise();
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("html", doc.getElementsByTag("html").first().nodeName());
    }

    @Test
    public void normaliseKeepsExistingHtmlAndAddsMissingHeadAndBody() {
        Document doc = new Document("http://example.com");
        Element html = doc.appendElement("html");
        doc.normalise();
        assertSame(html, doc.getElementsByTag("html").first());
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void normaliseDoesNotDuplicateExistingStructure() {
        Document doc = Document.createShell("http://example.com");
        Element head = doc.head();
        Element body = doc.body();
        doc.normalise();
        assertSame(head, doc.head());
        assertSame(body, doc.body());
        assertEquals(1, doc.getElementsByTag("html").size());
    }

    @Test
    public void normaliseMovesRootTextIntoBody() {
        Document doc = new Document("http://example.com");
        doc.appendChild(new TextNode("hello", "http://example.com"));
        doc.normalise();
        assertEquals("hello", doc.body().text());
    }

    @Test
    public void normaliseMovesMultipleTextNodesIntoBodyInOrder() {
        Document doc = new Document("http://example.com");
        doc.appendChild(new TextNode("one", "http://example.com"));
        doc.appendChild(new TextNode("two", "http://example.com"));
        doc.normalise();
        List<Node> bodyNodes = doc.body().childNodes();
        assertEquals(4, bodyNodes.size());
        assertEquals("one", ((TextNode) bodyNodes.get(0)).text());
        assertEquals("two", ((TextNode) bodyNodes.get(2)).text());
    }

    @Test
    public void normaliseIgnoresBlankTextNodes() {
        Document doc = new Document("http://example.com");
        doc.appendChild(new TextNode("   ", "http://example.com"));
        doc.normalise();
        assertEquals("", doc.body().text());
    }

    @Test
    public void textSetsBodyTextAndReturnsThis() {
        Document doc = Document.createShell("http://example.com");
        Element result = doc.text("Hello body");
        assertSame(doc, result);
        assertEquals("Hello body", doc.body().text());
    }

    @Test
    public void outerHtmlReturnsInnerHtml() {
        Document doc = Document.createShell("http://example.com");
        assertEquals(doc.html(), doc.outerHtml());
    }

    @Test
    public void outputSettingsHaveSensibleDefaults() {
        Document.OutputSettings settings = new Document("http://example.com").outputSettings();
        assertEquals(Entities.EscapeMode.base, settings.escapeMode());
        assertEquals(Charset.forName("UTF-8"), settings.charset());
        assertTrue(settings.prettyPrint());
        assertEquals(1, settings.indentAmount());
    }

    @Test
    public void outputSettingsSettersChainAndUpdateState() {
        Document.OutputSettings settings = new Document("http://example.com").outputSettings();
        Charset latin1 = Charset.forName("ISO-8859-1");
        assertSame(settings, settings.escapeMode(Entities.EscapeMode.extended));
        assertSame(settings, settings.charset(latin1));
        assertSame(settings, settings.charset("ISO-8859-1"));
        assertSame(settings, settings.prettyPrint(false));
        assertSame(settings, settings.indentAmount(0));
        assertEquals(Entities.EscapeMode.extended, settings.escapeMode());
        assertEquals(latin1, settings.charset());
        assertFalse(settings.prettyPrint());
        assertEquals(0, settings.indentAmount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void indentAmountRejectsNegative() {
        new Document("http://example.com").outputSettings().indentAmount(-1);
    }
}