package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.Jsoup;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class W3CDomTest {
    private W3CDom w3cDom;

    @Before
    public void setUp() {
        w3cDom = new W3CDom();
    }

    @Test
    public void fromJsoupCreatesW3CDocumentFromHtml() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(
            "<html><body><p id=\"x\">Hello</p></body></html>",
            "http://example.com/");
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        assertNotNull(w3cDoc);
        assertEquals("http://example.com/", w3cDoc.getDocumentURI());
        assertEquals("html", w3cDoc.getDocumentElement().getNodeName());

        Element p = (Element) w3cDoc.getElementsByTagName("p").item(0);
        assertNotNull(p);
        assertEquals("x", p.getAttribute("id"));
        assertEquals("Hello", p.getFirstChild().getNodeValue());
    }

    @Test
    public void fromJsoupBlankLocationDoesNotSetDocumentUri() {
        Document w3cDoc = w3cDom.fromJsoup(Jsoup.parse("<html></html>"));
        assertNull(w3cDoc.getDocumentURI());
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromJsoupRejectsNullInput() {
        w3cDom.fromJsoup(null);
    }

    @Test
    public void fromJsoupEmptyInputProducesHtmlRoot() {
        Document w3cDoc = w3cDom.fromJsoup(Jsoup.parse(""));
        assertEquals("html", w3cDoc.getDocumentElement().getNodeName());
    }

    @Test
    public void fromJsoupPreservesNamespaces() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(
            "<html xmlns=\"http://www.w3.org/1999/xhtml\"><body>" +
            "<svg xmlns=\"http://www.w3.org/2000/svg\"></svg></body></html>");
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        assertEquals("http://www.w3.org/1999/xhtml",
            w3cDoc.getDocumentElement().getNamespaceURI());

        NodeList svgNodes = w3cDoc.getElementsByTagNameNS(
            "http://www.w3.org/2000/svg", "svg");
        assertEquals(1, svgNodes.getLength());
    }

    @Test
    public void fromJsoupHandlesCommentsAndDataNodes() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(
            "<html><head><!-- note --><script>if (a < b) {}</script></head>" +
            "<body></body></html>");
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        Element head = (Element) w3cDoc.getElementsByTagName("head").item(0);
        Node comment = null;
        NodeList headChildren = head.getChildNodes();
        for (int i = 0; i < headChildren.getLength(); i++) {
            if (headChildren.item(i).getNodeType() == Node.COMMENT_NODE) {
                comment = headChildren.item(i);
                break;
            }
        }

        assertNotNull(comment);
        assertEquals(" note ", comment.getNodeValue());

        Node scriptContent = w3cDoc.getElementsByTagName("script").item(0).getFirstChild();
        assertNotNull(scriptContent);
        assertEquals("if (a < b) {}", scriptContent.getNodeValue());
    }

    @Test
    public void convertCopiesNestedElementsAndSanitizesAttributeNames() throws Exception {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(
            "<html><body><div><span>hi</span></div></body></html>");
        org.jsoup.nodes.Element div = jsoupDoc.select("div").first();
        div.attr("bad key", "x");
        div.attr("good", "y");
        div.attr("123", "skip");

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        Document w3cDoc = dbf.newDocumentBuilder().newDocument();

        w3cDom.convert(jsoupDoc, w3cDoc);

        Element html = w3cDoc.getDocumentElement();
        Element body = (Element) html.getElementsByTagName("body").item(0);
        Element divOut = (Element) body.getFirstChild();

        assertEquals("div", divOut.getTagName());
        assertEquals("x", divOut.getAttribute("badkey"));
        assertEquals("y", divOut.getAttribute("good"));
        assertFalse(divOut.hasAttribute("123"));

        Element spanOut = (Element) divOut.getFirstChild();
        assertEquals("span", spanOut.getTagName());
        assertEquals("hi", spanOut.getFirstChild().getNodeValue());
    }

    @Test
    public void asStringSerializesDocument() {
        Document w3cDoc = w3cDom.fromJsoup(Jsoup.parse("<html><body>Hello</body></html>"));
        String xml = w3cDom.asString(w3cDoc);

        assertNotNull(xml);
        assertTrue(xml.contains("<html"));
        assertTrue(xml.contains("Hello"));
    }
}