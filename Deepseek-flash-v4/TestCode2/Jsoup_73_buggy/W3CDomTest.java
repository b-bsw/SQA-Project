package org.jsoup.helper;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.DOMImplementation;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class W3CDomTest {

    private W3CDom w3cDom;

    @Before
    public void setUp() {
        w3cDom = new W3CDom();
    }

    // ------------------- fromJsoup tests -------------------

    @Test(expected = IllegalArgumentException.class)
    public void fromJsoupNullInput() {
        w3cDom.fromJsoup(null);
    }

    @Test
    public void fromJsoupSimpleDocument() {
        Document jsoupDoc = new Document("http://example.com");
        Element root = jsoupDoc.createElement("root");
        jsoupDoc.appendChild(root);

        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDoc);
        assertEquals("http://example.com", w3cDoc.getDocumentURI());
        org.w3c.dom.Element w3cRoot = w3cDoc.getDocumentElement();
        assertEquals("root", w3cRoot.getTagName());
    }

    // ------------------- convert tests -------------------

    @Test
    public void convertSetsDocumentURI() {
        Document jsoupDoc = new Document("http://example.org");
        Element root = jsoupDoc.createElement("root");
        jsoupDoc.appendChild(root);

        DocumentBuilder builder;
        try {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        org.w3c.dom.Document w3cDoc = builder.newDocument();

        w3cDom.convert(jsoupDoc, w3cDoc);
        assertEquals("http://example.org", w3cDoc.getDocumentURI());
    }

    @Test
    public void convertWithTextNode() {
        Document jsoupDoc = new Document("");
        Element root = jsoupDoc.createElement("p");
        root.appendChild(new TextNode("Hello", ""));
        jsoupDoc.appendChild(root);

        DocumentBuilder builder;
        try {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        org.w3c.dom.Document w3cDoc = builder.newDocument();
        w3cDom.convert(jsoupDoc, w3cDoc);

        org.w3c.dom.Element w3cRoot = w3cDoc.getDocumentElement();
        assertEquals("p", w3cRoot.getTagName());
        assertEquals("Hello", w3cRoot.getTextContent());
    }

    @Test
    public void convertWithComment() {
        Document jsoupDoc = new Document("");
        Element root = jsoupDoc.createElement("div");
        root.appendChild(new Comment("my comment", ""));
        jsoupDoc.appendChild(root);

        DocumentBuilder builder;
        try {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        org.w3c.dom.Document w3cDoc = builder.newDocument();
        w3cDom.convert(jsoupDoc, w3cDoc);

        org.w3c.dom.Element w3cRoot = w3cDoc.getDocumentElement();
        org.w3c.dom.Node child = w3cRoot.getFirstChild();
        assertTrue(child instanceof org.w3c.dom.Comment);
        assertEquals("my comment", child.getNodeValue());
    }

    @Test
    public void convertWithDataNode() {
        Document jsoupDoc = new Document("");
        Element root = jsoupDoc.createElement("style");
        root.appendChild(new DataNode("body {}", ""));
        jsoupDoc.appendChild(root);

        DocumentBuilder builder;
        try {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        org.w3c.dom.Document w3cDoc = builder.newDocument();
        w3cDom.convert(jsoupDoc, w3cDoc);

        org.w3c.dom.Element w3cRoot = w3cDoc.getDocumentElement();
        assertEquals("style", w3cRoot.getTagName());
        assertEquals("body {}", w3cRoot.getTextContent());
    }

    @Test
    public void convertWithNamespaceDeclaration() {
        Document jsoupDoc = new Document("");
        Element root = jsoupDoc.createElement("ns:root");
        root.attr("xmlns:ns", "http://example.com/ns");
        jsoupDoc.appendChild(root);

        DocumentBuilder builder;
        try {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        org.w3c.dom.Document w3cDoc = builder.newDocument();
        w3cDom.convert(jsoupDoc, w3cDoc);

        org.w3c.dom.Element w3cRoot = w3cDoc.getDocumentElement();
        assertEquals("ns", w3cRoot.getPrefix());
        assertEquals("root", w3cRoot.getLocalName());
        assertEquals("http://example.com/ns", w3cRoot.getNamespaceURI());
    }

    @Test
    public void convertWithDefaultNamespace() {
        Document jsoupDoc = new Document("");
        Element root = jsoupDoc.createElement("root");
        root.attr("xmlns", "http://example.com/default");
        jsoupDoc.appendChild(root);

        DocumentBuilder builder;
        try {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        org.w3c.dom.Document w3cDoc = builder.newDocument();
        w3cDom.convert(jsoupDoc, w3cDoc);

        org.w3c.dom.Element w3cRoot = w3cDoc.getDocumentElement();
        assertNull(w3cRoot.getPrefix());
        assertEquals("http://example.com/default", w3cRoot.getNamespaceURI());
    }

    @Test
    public void convertWithInvalidAttributeName() {
        Document jsoupDoc = new Document("");
        Element root = jsoupDoc.createElement("div");
        root.attr("bad@attr", "val");  // invalid XML: '@' not allowed
        jsoupDoc.appendChild(root);

        DocumentBuilder builder;
        try {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        org.w3c.dom.Document w3cDoc = builder.newDocument();
        w3cDom.convert(jsoupDoc, w3cDoc);

        org.w3c.dom.Element w3cRoot = w3cDoc.getDocumentElement();
        // attribute should be skipped (invalid name)
        assertFalse(w3cRoot.hasAttribute("bad@attr"));
    }

    @Test
    public void convertWithValidAttributeName() {
        Document jsoupDoc = new Document("");
        Element root = jsoupDoc.createElement("a");
        root.attr("href", "http://example.com");
        jsoupDoc.appendChild(root);

        DocumentBuilder builder;
        try {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        org.w3c.dom.Document w3cDoc = builder.newDocument();
        w3cDom.convert(jsoupDoc, w3cDoc);

        org.w3c.dom.Element w3cRoot = w3cDoc.getDocumentElement();
        assertEquals("http://example.com", w3cRoot.getAttribute("href"));
    }

    // ------------------- asString tests -------------------

    @Test
    public void asStringReturnsNonEmpty() {
        Document jsoupDoc = new Document("");
        Element root = jsoupDoc.createElement("root");
        root.appendChild(new TextNode("content", ""));
        jsoupDoc.appendChild(root);

        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        String result = w3cDom.asString(w3cDoc);
        assertNotNull(result);
        assertTrue(result.contains("<root>"));
        assertTrue(result.contains("content"));
        assertTrue(result.contains("</root>"));
    }

    @Test
    public void asStringWithXmlDeclaration() {
        Document jsoupDoc = new Document("");
        Element root = jsoupDoc.createElement("root");
        jsoupDoc.appendChild(root);

        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        String result = w3cDom.asString(w3cDoc);
        assertTrue(result.contains("<?xml version"));
    }

    // edge case: empty document (only root)
    @Test
    public void convertEmptyElement() {
        Document jsoupDoc = new Document("");
        Element root = jsoupDoc.createElement("empty");
        jsoupDoc.appendChild(root);

        DocumentBuilder builder;
        try {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        org.w3c.dom.Document w3cDoc = builder.newDocument();
        w3cDom.convert(jsoupDoc, w3cDoc);

        org.w3c.dom.Element w3cRoot = w3cDoc.getDocumentElement();
        assertEquals("empty", w3cRoot.getTagName());
        assertFalse(w3cRoot.hasChildNodes());
    }
}