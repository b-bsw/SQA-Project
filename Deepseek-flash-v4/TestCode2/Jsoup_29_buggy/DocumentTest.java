package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.List;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class DocumentTest {
    private Document shellDoc;
    private Document emptyDoc;

    @Before
    public void setUp() {
        shellDoc = Document.createShell("http://example.com");
        emptyDoc = new Document("http://example.com");
    }

    // --- createShell ---
    @Test(expected = IllegalArgumentException.class)
    public void createShellNullBaseUri() {
        Document.createShell(null);
    }

    @Test
    public void createShellNormal() {
        assertNotNull(shellDoc);
        assertNotNull(shellDoc.head());
        assertNotNull(shellDoc.body());
        assertEquals("html", shellDoc.child(0).tagName());
    }

    // --- head / body ---
    @Test
    public void headOnShell() {
        assertEquals("head", shellDoc.head().tagName());
    }

    @Test
    public void bodyOnShell() {
        assertEquals("body", shellDoc.body().tagName());
    }

    @Test
    public void headOnEmptyDoc() {
        assertNull(emptyDoc.head());
    }

    @Test
    public void bodyOnEmptyDoc() {
        assertNull(emptyDoc.body());
    }

    // --- title ---
    @Test
    public void titleDefaultEmpty() {
        assertEquals("", shellDoc.title());
    }

    @Test
    public void titleSetterAddsElementWhenMissing() {
        emptyDoc.title("Hello");
        assertEquals("Hello", emptyDoc.title());
        assertNotNull(emptyDoc.head().getElementsByTag("title").first());
    }

    @Test
    public void titleSetterUpdatesExisting() {
        shellDoc.title("Old");
        shellDoc.title("New");
        assertEquals("New", shellDoc.title());
    }

    @Test(expected = IllegalArgumentException.class)
    public void titleSetterNull() {
        shellDoc.title(null);
    }

    // --- createElement ---
    @Test
    public void createElementValidTag() {
        Element el = emptyDoc.createElement("div");
        assertEquals("div", el.tagName());
        assertEquals("http://example.com", el.baseUri());
    }

    // --- normalise ---
    @Test
    public void normaliseEmptyDocAddsHtmlHeadBody() {
        assertNull(emptyDoc.head());
        assertNull(emptyDoc.body());
        emptyDoc.normalise();
        assertNotNull(emptyDoc.head());
        assertNotNull(emptyDoc.body());
        assertEquals(1, emptyDoc.getElementsByTag("html").size());
    }

    @Test
    public void normaliseMovesTextNodesToBody() {
        // Add a text node directly under document
        emptyDoc.appendChild(new TextNode("hello", "http://example.com"));
        assertEquals(0, emptyDoc.body().childNodes.size()); // body not yet present
        // normalise should move text to body
        emptyDoc.normalise();
        Element body = emptyDoc.body();
        assertTrue(body.childNodes.size() > 0);
        // check the content
        boolean foundText = false;
        for (Node child : body.childNodes) {
            if (child instanceof TextNode && ((TextNode) child).text().equals("hello")) {
                foundText = true;
                break;
            }
        }
        assertTrue(foundText);
    }

    @Test
    public void normaliseMergesDuplicateHead() {
        // create shell then add another head element
        Element html = shellDoc.child(0);
        html.appendChild(new Element(Tag.valueOf("head"), ""));
        assertEquals(2, shellDoc.getElementsByTag("head").size());
        shellDoc.normalise();
        assertEquals(1, shellDoc.getElementsByTag("head").size());
        // the first head should remain, children merged
    }

    @Test
    public void normaliseMergesDuplicateBody() {
        Element html = shellDoc.child(0);
        html.appendChild(new Element(Tag.valueOf("body"), ""));
        assertEquals(2, shellDoc.getElementsByTag("body").size());
        shellDoc.normalise();
        assertEquals(1, shellDoc.getElementsByTag("body").size());
    }

    @Test
    public void normaliseEnsuresHeadBodyOwnedByHtml() {
        // Move head to document directly
        Element head = shellDoc.head();
        head.remove();
        emptyDoc.appendChild(head);
        assertNull(emptyDoc.head()); // findFirstElementByTagName might still find it if in root?
        emptyDoc.normalise();
        Element htmlEl = emptyDoc.getElementsByTag("html").first();
        assertNotNull(htmlEl);
        assertTrue(htmlEl.children().contains(emptyDoc.head()) || emptyDoc.head().parent().equals(htmlEl));
    }

    // --- outerHtml ---
    @Test
    public void outerHtmlReturnsInnerHtml() {
        // shell doc outer html is the html() of document (which includes <html>? Actually document.html() returns content of document which is the html element and its children?)
        String outer = shellDoc.outerHtml();
        assertTrue(outer.contains("<html>"));
        assertTrue(outer.contains("</html>"));
    }

    // --- text(String) ---
    @Test
    public void textSetsBodyContent() {
        shellDoc.text("Hello World");
        assertEquals("Hello World", shellDoc.body().text());
    }

    @Test
    public void textClearsExistingBody() {
        shellDoc.body().appendElement("p").text("old");
        shellDoc.text("new");
        assertEquals("new", shellDoc.body().text());
        // ensure no extra elements remain
    }

    // --- nodeName ---
    @Test
    public void nodeNameIsDocument() {
        assertEquals("#document", emptyDoc.nodeName());
    }

    // --- clone ---
    @Test
    public void cloneProducesEqualButNotSame() {
        Document clone = shellDoc.clone();
        assertNotSame(shellDoc, clone);
        assertEquals(shellDoc.title(), clone.title());
        assertEquals(shellDoc.baseUri(), clone.baseUri());
        // output settings cloned independently
        assertNotSame(shellDoc.outputSettings(), clone.outputSettings());
    }

    @Test
    public void cloneOutputSettingsAreDeepCopied() {
        Document doc = shellDoc.clone();
        doc.outputSettings().charset(Charset.forName("ISO-8859-1"));
        assertNotEquals(shellDoc.outputSettings().charset(), doc.outputSettings().charset());
    }

    // --- outputSettings ---
    @Test
    public void outputSettingsGetterReturnsDefault() {
        OutputSettings settings = emptyDoc.outputSettings();
        assertEquals(Charset.forName("UTF-8"), settings.charset());
        assertTrue(settings.prettyPrint());
        assertEquals(1, settings.indentAmount());
    }

    @Test
    public void outputSettingsSetterNullThrows() {
        try {
            emptyDoc.outputSettings(null);
            fail("Should have thrown exception");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void outputSettingsRoundtrip() {
        OutputSettings custom = new Document.OutputSettings();
        custom.charset("ISO-8859-1").prettyPrint(false).indentAmount(4);
        emptyDoc.outputSettings(custom);
        assertSame(custom, emptyDoc.outputSettings());
    }

    // --- quirksMode ---
    @Test
    public void quirksModeDefaultNoQuirks() {
        assertEquals(Document.QuirksMode.noQuirks, emptyDoc.quirksMode());
    }

    @Test
    public void quirksModeSetter() {
        emptyDoc.quirksMode(Document.QuirksMode.quirks);
        assertEquals(Document.QuirksMode.quirks, emptyDoc.quirksMode());
    }

    // --- OutputSettings inner class ---
    @Test
    public void outputSettingsCharsetByName() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset("UTF-16");
        assertEquals(Charset.forName("UTF-16"), settings.charset());
    }

    @Test
    public void outputSettingsEscapeModeRoundtrip() {
        Document.OutputSettings settings = new Document.OutputSettings();
        assertEquals(Entities.EscapeMode.base, settings.escapeMode());
        settings.escapeMode(Entities.EscapeMode.extended);
        assertEquals(Entities.EscapeMode.extended, settings.escapeMode());
    }

    @Test
    public void outputSettingsPrettyPrint() {
        Document.OutputSettings settings = new Document.OutputSettings();
        assertTrue(settings.prettyPrint());
        settings.prettyPrint(false);
        assertFalse(settings.prettyPrint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void outputSettingsIndentAmountNegative() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.indentAmount(-1);
    }

    @Test
    public void outputSettingsIndentAmountBoundary() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.indentAmount(0);
        assertEquals(0, settings.indentAmount());
        settings.indentAmount(10);
        assertEquals(10, settings.indentAmount());
    }

    @Test
    public void outputSettingsClone() {
        Document.OutputSettings original = new Document.OutputSettings();
        original.charset("UTF-16").prettyPrint(false).indentAmount(3);
        Document.OutputSettings clone = original.clone();
        assertNotSame(original, clone);
        assertEquals(original.charset(), clone.charset());
        assertEquals(original.escapeMode(), clone.escapeMode());
        assertEquals(original.prettyPrint(), clone.prettyPrint());
        assertEquals(original.indentAmount(), clone.indentAmount());
        // verify deep copy of encoder
        assertNotSame(original.encoder(), clone.encoder());
    }

    // --- Edge Cases ---
    @Test
    public void documentWithNoHeadNorBodyNormaliseCorrectly() {
        // Create document with only <html> containing only <a>, no head/body
        Document doc = new Document("uri");
        Element html = doc.appendChild(new Element(Tag.valueOf("html"), "uri"));
        html.appendChild(new Element(Tag.valueOf("a"), "uri"));
        doc.normalise();
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals(1, doc.getElementsByTag("html").size());
    }

    @Test
    public void textNodeOutsideBodyGetsMoved() {
        Document doc = Document.createShell("uri");
        Element head = doc.head();
        // Add a non-blank text node to head
        head.appendChild(new TextNode("head text", "uri"));
        assertEquals(1, head.childNodes.size());
        doc.normalise();
        // text node should now be in body
        Element body = doc.body();
        boolean found = false;
        for (Node n : body.childNodes) {
            if (n instanceof TextNode && ((TextNode)n).text().equals("head text")) {
                found = true;
                break;
            }
        }
        assertTrue(found);
    }

    @Test
    public void blankTextNodesAreNotMoved() {
        Document doc = new Document("uri");
        Element html = doc.appendChild(new Element(Tag.valueOf("html"), "uri"));
        // Add a blank text node to root
        doc.appendChild(new TextNode("   ", "uri"));
        // Also a non-blank under html
        html.appendChild(new TextNode("content", "uri"));
        doc.normalise();
        Element body = doc.body();
        // Blank text should not have been moved, only non-blank
        boolean blankFound = false;
        for (Node n : body.childNodes) {
            if (n instanceof TextNode && ((TextNode)n).isBlank()) {
                blankFound = true;
                break;
            }
        }
        assertFalse(blankFound);
    }

    @Test
    public void existingTitleIsUpdatedByTitleSetter() {
        shellDoc.title("Original");
        assertEquals("Original", shellDoc.title());
        shellDoc.title("Updated");
        assertEquals("Updated", shellDoc.title());
        // ensure only one title element
        assertEquals(1, shellDoc.getElementsByTag("title").size());
    }
}