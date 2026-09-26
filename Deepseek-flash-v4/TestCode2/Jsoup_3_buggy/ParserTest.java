package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import java.util.List;
import static org.junit.Assert.*;

public class ParserTest {
    private Document doc;

    @Before
    public void setUp() {
        doc = null;
    }

    @After
    public void tearDown() {
        doc = null;
    }

    @Test
    public void testParseSimpleHtml() {
        doc = Parser.parse("<html><head><title>Test</title></head><body><p>Hello</p></body></html>", "http://example.com");
        assertNotNull(doc);
        assertEquals("Test", doc.title());
        Element body = doc.body();
        assertNotNull(body);
        assertEquals("Hello", body.text());
    }

    @Test
    public void testParseEmptyString() {
        doc = Parser.parse("", "http://example.com");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    @Test
    public void testParseNullHtmlThrowsException() {
        try {
            Parser.parse(null, "http://example.com");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testParseNullBaseUriThrowsException() {
        try {
            Parser.parse("<html></html>", null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testParseBodyFragment() {
        doc = Parser.parseBodyFragment("<p>Fragment</p>", "http://example.com");
        assertNotNull(doc);
        Element body = doc.body();
        assertNotNull(body);
        assertEquals("Fragment", body.text());
        assertEquals(1, body.children().size());
    }

    @Test
    public void testParseBodyFragmentEmpty() {
        doc = Parser.parseBodyFragment("", "http://example.com");
        assertNotNull(doc);
        assertNotNull(doc.body());
        assertEquals(0, doc.body().children().size());
    }

    @Test
    public void testParseBodyFragmentNullThrowsException() {
        try {
            Parser.parseBodyFragment(null, "http://example.com");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testParseComment() {
        doc = Parser.parse("<html><body><!-- comment --><p>Text</p></body></html>", "http://example.com");
        assertNotNull(doc);
        List<Node> nodes = doc.body().childNodes();
        assertTrue(nodes.size() >= 2);
        boolean foundComment = false;
        for (Node node : nodes) {
            if (node instanceof Comment) {
                Comment comment = (Comment) node;
                assertEquals(" comment ", comment.getData());
                foundComment = true;
                break;
            }
        }
        assertTrue(foundComment);
    }

    @Test
    public void testParseCommentWithDashEnding() {
        doc = Parser.parse("<html><body><!-- dash- --><p>Text</p></body></html>", "http://example.com");
        assertNotNull(doc);
        List<Node> nodes = doc.body().childNodes();
        boolean foundComment = false;
        for (Node node : nodes) {
            if (node instanceof Comment) {
                Comment comment = (Comment) node;
                assertEquals(" dash-", comment.getData());
                foundComment = true;
                break;
            }
        }
        assertTrue(foundComment);
    }

    @Test
    public void testParseCdata() {
        doc = Parser.parse("<html><body><![CDATA[<raw>]]><p>After</p></body></html>", "http://example.com");
        assertNotNull(doc);
        List<Node> nodes = doc.body().childNodes();
        boolean foundText = false;
        for (Node node : nodes) {
            if (node instanceof TextNode) {
                TextNode text = (TextNode) node;
                if ("<raw>".equals(text.text())) {
                    foundText = true;
                    break;
                }
            }
        }
        assertTrue(foundText);
    }

    @Test
    public void testParseXmlDeclaration() {
        doc = Parser.parse("<html><body><?xml version=\"1.0\"?><p>Text</p></body></html>", "http://example.com");
        assertNotNull(doc);
        List<Node> nodes = doc.body().childNodes();
        boolean foundDecl = false;
        for (Node node : nodes) {
            if (node instanceof XmlDeclaration) {
                XmlDeclaration decl = (XmlDeclaration) node;
                assertEquals("xml version=\"1.0\"", decl.getData());
                assertFalse(decl.isProcessingInstruction());
                foundDecl = true;
                break;
            }
        }
        assertTrue(foundDecl);
    }

    @Test
    public void testParseHtmlWithDoctype() {
        doc = Parser.parse("<!DOCTYPE html><html><body><p>Doc</p></body></html>", "http://example.com");
        assertNotNull(doc);
        assertEquals("Doc", doc.body().text());
    }

    @Test
    public void testParseEndTagOnly() {
        doc = Parser.parse("<html><body>Text</body></html>", "http://example.com");
        assertNotNull(doc);
        assertEquals("Text", doc.body().text());
    }

    @Test
    public void testParseUnclosedTag() {
        doc = Parser.parse("<html><body><p>Unclosed", "http://example.com");
        assertNotNull(doc);
        assertNotNull(doc.body());
        assertEquals("Unclosed", doc.body().text());
    }

    @Test
    public void testParseSelfClosingTag() {
        doc = Parser.parse("<html><body><br/><p>After</p></body></html>", "http://example.com");
        assertNotNull(doc);
        Element body = doc.body();
        assertEquals("After", body.text());
        List<Element> children = body.children();
        assertEquals(2, children.size());
        assertEquals("br", children.get(0).tagName());
    }

    @Test
    public void testParseVoidElements() {
        doc = Parser.parse("<html><body><img src=\"test.png\"><p>Text</p></body></html>", "http://example.com");
        assertNotNull(doc);
        Element body = doc.body();
        List<Element> children = body.children();
        assertEquals(2, children.size());
        assertEquals("img", children.get(0).tagName());
        assertEquals("p", children.get(1).tagName());
    }

    @Test
    public void testParseTextAreaData() {
        doc = Parser.parse("<html><body><textarea>raw <b>text</b></textarea></body></html>", "http://example.com");
        assertNotNull(doc);
        Element textarea = doc.body().getElementsByTag("textarea").first();
        assertNotNull(textarea);
        assertEquals("raw <b>text</b>", textarea.text());
    }

    @Test
    public void testParseScriptData() {
        doc = Parser.parse("<html><body><script>if (a < b) { c++; }</script></body></html>", "http://example.com");
        assertNotNull(doc);
        Element script = doc.body().getElementsByTag("script").first();
        assertNotNull(script);
        // script content is DataNode, text method may return raw
        assertEquals("if (a < b) { c++; }", script.data());
    }

    @Test
    public void testParseBaseHrefUpdate() {
        String baseUri = "http://original.com";
        doc = Parser.parse("<html><head><base href=\"http://new.com/\"></head><body><p>Text</p></body></html>", baseUri);
        assertNotNull(doc);
        // after parsing, baseUri in document should be updated
        // note: can't easily access internal baseUri, but document's baseUri should change
        // verify via absUrl behavior
        Element link = doc.body().appendElement("a").attr("href", "page.html");
        assertEquals("http://new.com/page.html", link.absUrl("href"));
    }

    @Test
    public void testParseBaseHrefEmptyNoUpdate() {
        String baseUri = "http://original.com";
        doc = Parser.parse("<html><head><base target=\"_blank\"></head><body><p>Text</p></body></html>", baseUri);
        assertNotNull(doc);
        Element link = doc.body().appendElement("a").attr("href", "page.html");
        assertEquals("http://original.com/page.html", link.absUrl("href"));
    }

    @Test
    public void testParseImplicitParentForInvalidNesting() {
        doc = Parser.parse("<html><body><td>Cell</td></body></html>", "http://example.com");
        assertNotNull(doc);
        // td should be wrapped in tr, and tr in table or similar
        Element body = doc.body();
        List<Element> children = body.children();
        // might be tr or table, depending on implementation
        assertFalse(children.isEmpty());
        String tagName = children.get(0).tagName();
        assertTrue("tr".equals(tagName) || "table".equals(tagName));
    }

    @Test
    public void testParseTableImplcitTbody() {
        doc = Parser.parse("<html><body><table><tr><td>Cell</td></tr></table></body></html>", "http://example.com");
        assertNotNull(doc);
        Element table = doc.body().getElementsByTag("table").first();
        assertNotNull(table);
        List<Element> tableChildren = table.children();
        // may contain tbody
        assertEquals(1, tableChildren.size());
        String tagName = tableChildren.get(0).tagName();
        assertTrue("tbody".equals(tagName) || "tr".equals(tagName));
    }

    @Test
    public void testParseMultipleRootNodes() {
        doc = Parser.parse("<p>First</p><p>Second</p>", "http://example.com");
        assertNotNull(doc);
        Element body = doc.body();
        List<Element> children = body.children();
        assertEquals(2, children.size());
        assertEquals("First", children.get(0).text());
        assertEquals("Second", children.get(1).text());
    }

    @Test
    public void testParseNestedSameTags() {
        doc = Parser.parse("<html><body><div><div>Inner</div></div></body></html>", "http://example.com");
        assertNotNull(doc);
        Element body = doc.body();
        assertEquals("Inner", body.text());
        List<Element> divs = body.getElementsByTag("div");
        assertEquals(2, divs.size());
    }

    @Test
    public void testParseAttributeHandling() {
        doc = Parser.parse("<html><body><p class=\"foo\" id='bar' data-x=val>Text</p></body></html>", "http://example.com");
        assertNotNull(doc);
        Element p = doc.body().getElementsByTag("p").first();
        assertNotNull(p);
        assertEquals("foo", p.attr("class"));
        assertEquals("bar", p.attr("id"));
        assertEquals("val", p.attr("data-x"));
    }

    @Test
    public void testParseAttributeEmpty() {
        doc = Parser.parse("<html><body><p class>Text</p></body></html>", "http://example.com");
        assertNotNull(doc);
        Element p = doc.body().getElementsByTag("p").first();
        assertNotNull(p);
        assertEquals("", p.attr("class"));
    }

    @Test
    public void testParseMalformedTagAsText() {
        doc = Parser.parse("<html><body><p>before <tag> after</p></body></html>", "http://example.com");
        assertNotNull(doc);
        Element p = doc.body().getElementsByTag("p").first();
        assertNotNull(p);
        // if tag isn't recognized as a start tag due to invalid name, it should be text
        // but "<tag>" is a valid tag name, so it would be treated as element
        // test with invalid char like "<1>"
    }

    @Test
    public void testParseInvalidStartTagAsText() {
        doc = Parser.parse("<html><body><p>before <1> after</p></body></html>", "http://example.com");
        assertNotNull(doc);
        Element p = doc.body().getElementsByTag("p").first();
        assertNotNull(p);
        assertTrue(p.text().contains("<1>"));
    }

    @Test
    public void testParseDataTagWithEncodedContent() {
        doc = Parser.parse("<html><body><title>A &amp; B</title></body></html>", "http://example.com");
        assertNotNull(doc);
        assertEquals("A & B", doc.title());
    }

    @Test
    public void testParseTitleAsTextNode() {
        doc = Parser.parse("<html><head><title>Title Content</title></head><body></body></html>", "http://example.com");
        assertNotNull(doc);
        assertEquals("Title Content", doc.title());
    }

    @Test
    public void testParseEmptyAttributeKey() {
        doc = Parser.parse("<html><body><p =\"val\">Text</p></body></html>", "http://example.com");
        assertNotNull(doc);
        // should not throw, probably ignore
    }

    @Test
    public void testParseTextWithSpecialChars() {
        doc = Parser.parse("<html><body><p>5 &lt; 6 &amp; 7 &gt; 4</p></body></html>", "http://example.com");
        assertNotNull(doc);
        Element p = doc.body().getElementsByTag("p").first();
        assertNotNull(p);
        assertEquals("5 < 6 & 7 > 4", p.text());
    }

    @Test
    public void testParsePopStackToClose() {
        doc = Parser.parse("<html><body><div><p>Text</div><span>After</span></body></html>", "http://example.com");
        assertNotNull(doc);
        Element body = doc.body();
        // The div should be closed when </div> is seen; p is inside div
        List<Element> divs = body.getElementsByTag("div");
        assertEquals(1, divs.size());
        Element div = divs.get(0);
        assertEquals(1, div.children().size());
        assertEquals("p", div.child(0).tagName());
    }

    @Test
    public void testParsePopStackNoMatch() {
        doc = Parser.parse("<html><body><div><p>Text</section><span>After</span></body></html>", "http://example.com");
        assertNotNull(doc);
        // </section> doesn't match, should be ignored, but still parse correctly
        Element body = doc.body();
        List<Element> spans = body.getElementsByTag("span");
        assertEquals(1, spans.size());
    }

    @Test
    public void testParseNestedListInPops() {
        doc = Parser.parse("<html><body><ul><li>Item 1</li><li>Item 2</li></ul></body></html>", "http://example.com");
        assertNotNull(doc);
        Element ul = doc.body().getElementsByTag("ul").first();
        assertNotNull(ul);
        List<Element> lis = ul.children();
        assertEquals(2, lis.size());
        assertEquals("Item 1", lis.get(0).text());
        assertEquals("Item 2", lis.get(1).text());
    }

    @Test
    public void testParseMixedTextAndElements() {
        doc = Parser.parse("<html><body>Start <b>bold</b> middle <i>italic</i> end</body></html>", "http://example.com");
        assertNotNull(doc);
        Element body = doc.body();
        assertEquals("Start bold middle italic end", body.text());
        List<Element> bold = body.getElementsByTag("b");
        assertEquals(1, bold.size());
        List<Element> italic = body.getElementsByTag("i");
        assertEquals(1, italic.size());
    }

    @Test
    public void testParseNestedFormattingTags() {
        doc = Parser.parse("<html><body><p><b><i>Both</i></b></p></body></html>", "http://example.com");
        assertNotNull(doc);
        Element p = doc.body().getElementsByTag("p").first();
        assertNotNull(p);
        Element b = p.child(0);
        assertEquals("b", b.tagName());
        Element i = b.child(0);
        assertEquals("i", i.tagName());
        assertEquals("Both", i.text());
    }

    @Test
    public void testParseMisplacedElementWraps() {
        doc = Parser.parse("<html><body><dt>Term</dt><dd>Definition</dd></body></html>", "http://example.com");
        assertNotNull(doc);
        // dt and dd should be inside dl
        Element body = doc.body();
        List<Element> dts = body.getElementsByTag("dt");
        assertEquals(1, dts.size());
        Element dt = dts.get(0);
        Element parent = dt.parent();
        assertEquals("dl", parent.tagName());
    }

    @Test
    public void testParseNestedTableStructure() {
        doc = Parser.parse("<html><body><table><thead><tr><th>H</th></tr></thead><tbody><tr><td>B</td></tr></tbody></table></body></html>", "http://example.com");
        assertNotNull(doc);
        Element table = doc.body().getElementsByTag("table").first();
        assertNotNull(table);
        List<Element> children = table.children();
        assertEquals(2, children.size());
        assertEquals("thead", children.get(0).tagName());
        assertEquals("tbody", children.get(1).tagName());
    }

    @Test
    public void testParseWhitespaceHandling() {
        doc = Parser.parse("<html>\n  <body>\n    <p>Text</p>\n  </body>\n</html>", "http://example.com");
        assertNotNull(doc);
        Element p = doc.body().getElementsByTag("p").first();
        assertNotNull(p);
        assertEquals("Text", p.text());
    }

    @Test
    public void testParseAttributesWithBooleans() {
        doc = Parser.parse("<html><body><input type=\"checkbox\" checked></body></html>", "http://example.com");
        assertNotNull(doc);
        Element input = doc.body().getElementsByTag("input").first();
        assertNotNull(input);
        assertTrue(input.hasAttr("checked"));
        assertEquals("", input.attr("checked"));
        assertEquals("checkbox", input.attr("type"));
    }

    @Test
    public void testParseEmptyElementInsideBody() {
        doc = Parser.parse("<html><body><p></p></body></html>", "http://example.com");
        assertNotNull(doc);
        Element p = doc.body().getElementsByTag("p").first();
        assertNotNull(p);
        assertEquals(0, p.children().size());
        assertEquals("", p.text());
    }

    @Test
    public void testParseMultipleComments() {
        doc = Parser.parse("<!-- first --><html><body><!-- second --><p>Text</p><!-- third --></body></html>", "http://example.com");
        assertNotNull(doc);
        List<Node> bodyNodes = doc.body().childNodes();
        int commentCount = 0;
        for (Node node : bodyNodes) {
            if (node instanceof Comment) {
                commentCount++;
            }
        }
        assertEquals(2, commentCount); // second and third, first is outside html
    }

    @Test
    public void testParseNestedImplicitParents() {
        doc = Parser.parse("<html><body><tbody><tr><td>Cell</td></tr></tbody></body></html>", "http://example.com");
        assertNotNull(doc);
        Element body = doc.body();
        // tbody should be wrapped in table
        Element tbody = body.getElementsByTag("tbody").first();
        assertNotNull(tbody);
        Element parent = tbody.parent();
        assertEquals("table", parent.tagName());
    }

    @Test
    public void testParseTextNodeAfterCdata() {
        doc = Parser.parse("<html><body><![CDATA[raw]]>text<p>P</p></body></html>", "http://example.com");
        assertNotNull(doc);
        Element body = doc.body();
        List<Node> nodes = body.childNodes();
        assertTrue(nodes.size() >= 2);
        boolean foundCdata = false;
        boolean foundText = false;
        for (Node node : nodes) {
            if (node instanceof TextNode) {
                TextNode text = (TextNode) node;
                if ("raw".equals(text.text())) {
                    foundCdata = true;
                } else if ("text".equals(text.text())) {
                    foundText = true;
                }
            }
        }
        assertTrue(foundCdata);
        assertTrue(foundText);
    }

    @Test
    public void testParseWithEntitiesInAttributes() {
        doc = Parser.parse("<html><body><p title=\"&lt;hello&gt;\">Text</p></body></html>", "http://example.com");
        assertNotNull(doc);
        Element p = doc.body().getElementsByTag("p").first();
        assertNotNull(p);
        assertEquals("<hello>", p.attr("title"));
    }

    @Test
    public void testParseMultipleSelfClosing() {
        doc = Parser.parse("<html><body><br/><hr/><img src=\"x\"></body></html>", "http://example.com");
        assertNotNull(doc);
        Element body = doc.body();
        List<Element> children = body.children();
        assertEquals(3, children.size());
    }

    @Test
    public void testParseScriptContainsClosingTagInString() {
        doc = Parser.parse("<html><body><script>var s = \"</div>\";</script></body></html>", "http://example.com");
        assertNotNull(doc);
        Element script = doc.body().getElementsByTag("script").first();
        assertNotNull(script);
        assertTrue(script.data().contains("</div>"));
    }

    @Test
    public void testParseBaseHrefResolvesRelative() {
        doc = Parser.parse("<html><head><base href=\"http://example.com/dir/\"></head><body><a href=\"page.html\">link</a></body></html>", "http://placeholder.com");
        assertNotNull(doc);
        Element a = doc.body().getElementsByTag("a").first();
        assertNotNull(a);
        assertEquals("http://example.com/dir/page.html", a.absUrl("href"));
    }
}