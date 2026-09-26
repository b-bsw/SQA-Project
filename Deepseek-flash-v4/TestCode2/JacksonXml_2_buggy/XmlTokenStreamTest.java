package com.fasterxml.jackson.dataformat.xml.deser;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import org.codehaus.stax2.XMLStreamReader2;
import org.codehaus.stax2.ri.Stax2ReaderAdapter;
import java.io.IOException;

public class XmlTokenStreamTest {
    private Stax2ReaderAdapter readerAdapter;
    private XmlTokenStream tokenStream;

    private static XMLStreamReader2 createMockReader(int eventType, String localName, String nsURI, int attrCount) {
        return new Stax2ReaderAdapter(new XMLStreamReader() {
            private int eventType = eventType;
            private int nextEventType = eventType;
            private int attrIndex = 0;
            private String text = null;
            private boolean hasNextCalled = false;

            @Override public int next() throws XMLStreamException {
                if (!hasNextCalled && eventType == XMLStreamConstants.START_ELEMENT) {
                    hasNextCalled = true;
                    return eventType;
                }
                if (eventType == XMLStreamConstants.START_ELEMENT && attrIndex < attrCount) {
                    attrIndex++;
                    return XMLStreamConstants.ATTRIBUTE;
                }
                return XMLStreamConstants.END_DOCUMENT;
            }

            @Override public int getEventType() { return nextEventType; }

            @Override public String getLocalName() { return localName; }

            @Override public String getNamespaceURI() { return nsURI; }

            @Override public int getAttributeCount() { return attrCount; }

            @Override public String getAttributeLocalName(int index) { return "attr" + index; }

            @Override public String getAttributeNamespace(int index) { return ""; }

            @Override public String getAttributeValue(int index) { return "value" + index; }

            @Override public boolean hasNext() { return !hasNextCalled; }

            @Override public void close() throws XMLStreamException {}

            @Override public Object getProperty(String name) { return null; }

            @Override public void require(int type, String namespaceURI, String localName) {}

            @Override public String getElementText() throws XMLStreamException { return null; }

            @Override public int nextTag() throws XMLStreamException { return 0; }

            @Override public boolean hasName() { return localName != null; }

            @Override public boolean hasText() { return text != null; }

            @Override public String getPrefix() { return null; }

            @Override public String getText() { return text; }

            @Override public char[] getTextCharacters() { return new char[0]; }

            @Override public int getTextCharacters(int sourceStart, char[] target, int targetStart, int length) { return 0; }

            @Override public int getTextStart() { return 0; }

            @Override public int getTextLength() { return 0; }

            @Override public String getEncoding() { return null; }

            @Override public boolean isCharacters() { return false; }

            @Override public boolean isWhiteSpace() { return false; }

            @Override public String getAttributeValue(String namespaceURI, String localName) { return null; }

            @Override public int getAttributeNameCount() { return attrCount; }

            @Override public javax.xml.namespace.QName getAttributeName(int index) { return null; }

            @Override public String getAttributePrefix(int index) { return null; }

            @Override public String getAttributeType(int index) { return null; }

            @Override public boolean isAttributeSpecified(int index) { return false; }

            @Override public int getNamespaceCount() { return 0; }

            @Override public String getNamespacePrefix(int index) { return null; }

            @Override public String getNamespaceURI(int index) { return null; }

            @Override public javax.xml.namespace.QName getName() { return null; }

            @Override public String getPIData() { return null; }

            @Override public String getPITarget() { return null; }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNonStartElement() {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.END_ELEMENT, "root", "", 0);
        new XmlTokenStream(Stax2ReaderAdapter.wrapIfNecessary(reader), null);
    }

    @Test
    public void testConstructorWithStartElement() {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "ns", 0);
        tokenStream = new XmlTokenStream(reader, null);
        assertEquals(XmlTokenStream.XML_START_ELEMENT, tokenStream.getCurrentToken());
        assertEquals("root", tokenStream.getLocalName());
        assertEquals("ns", tokenStream.getNamespaceURI());
        assertFalse(tokenStream.hasAttributes());
    }

    @Test
    public void testHasAttributesWithAttributes() {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 2);
        tokenStream = new XmlTokenStream(reader, null);
        assertTrue(tokenStream.hasAttributes());
    }

    @Test
    public void testHasAttributesWithoutAttributes() {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 0);
        tokenStream = new XmlTokenStream(reader, null);
        assertFalse(tokenStream.hasAttributes());
    }

    @Test
    public void testGetXmlReader() {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 0);
        tokenStream = new XmlTokenStream(reader, null);
        assertNotNull(tokenStream.getXmlReader());
    }

    @Test
    public void testCloseCompletely() throws IOException {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 0);
        tokenStream = new XmlTokenStream(reader, null);
        tokenStream.closeCompletely();
    }

    @Test
    public void testClose() throws IOException {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 0);
        tokenStream = new XmlTokenStream(reader, null);
        tokenStream.close();
    }

    @Test
    public void testGetCurrentLocation() {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 0);
        tokenStream = new XmlTokenStream(reader, null);
        assertNotNull(tokenStream.getCurrentLocation());
    }

    @Test
    public void testGetTokenLocation() {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 0);
        tokenStream = new XmlTokenStream(reader, null);
        assertNotNull(tokenStream.getTokenLocation());
    }

    @Test
    public void testRepeatStartElementThrowsOnWrongState() {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 0);
        tokenStream = new XmlTokenStream(reader, null);
        tokenStream._currentState = XmlTokenStream.XML_END_ELEMENT;
        try {
            tokenStream.repeatStartElement();
            fail("Should have thrown IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Current state not XML_START_ELEMENT (1) but 2", e.getMessage());
        }
    }

    @Test
    public void testSkipAttributesOnAttributeName() {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 0);
        tokenStream = new XmlTokenStream(reader, null);
        tokenStream._currentState = XmlTokenStream.XML_ATTRIBUTE_NAME;
        tokenStream.skipAttributes();
        assertEquals(XmlTokenStream.XML_START_ELEMENT, tokenStream.getCurrentToken());
    }

    @Test(expected = IllegalStateException.class)
    public void testSkipAttributesThrowsOnWrongState() {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 0);
        tokenStream = new XmlTokenStream(reader, null);
        tokenStream._currentState = XmlTokenStream.XML_END;
        tokenStream.skipAttributes();
    }

    @Test
    public void testConvertToStringWithWrongState() throws IOException {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 0);
        tokenStream = new XmlTokenStream(reader, null);
        tokenStream._currentState = XmlTokenStream.XML_START_ELEMENT;
        assertNull(tokenStream.convertToString());
    }

    @Test
    public void testGetTextAndGetLocalNameMethods() {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 0);
        tokenStream = new XmlTokenStream(reader, null);
        tokenStream._textValue = "testText";
        assertEquals("testText", tokenStream.getText());
        assertEquals("root", tokenStream.getLocalName());
        assertEquals("", tokenStream.getNamespaceURI());
    }

    @Test
    public void testHandleRepeatElementReplayStartDup() throws IOException {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 0);
        tokenStream = new XmlTokenStream(reader, null);
        tokenStream._repeatElement = 1;
        tokenStream._currentWrapper = ElementWrapper.matchingWrapper(null, "root", "");
        int result = tokenStream.next();
        assertEquals(XmlTokenStream.XML_START_ELEMENT, result);
    }

    @Test
    public void testHandleRepeatElementUnrecognizedType() throws IOException {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 0);
        tokenStream = new XmlTokenStream(reader, null);
        tokenStream._repeatElement = 99;
        try {
            tokenStream._handleRepeatElement();
            fail("Should have thrown IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Unrecognized type to repeat: 99", e.getMessage());
        }
    }

    @Test
    public void testConvertToStringReturnsNullWhenNotAttributeName() throws IOException {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 0);
        tokenStream = new XmlTokenStream(reader, null);
        tokenStream._currentState = XmlTokenStream.XML_START_ELEMENT;
        String result = tokenStream.convertToString();
        assertNull(result);
    }

    @Test
    public void testToStringMethod() {
        XMLStreamReader2 reader = createMockReader(XMLStreamConstants.START_ELEMENT, "root", "", 0);
        tokenStream = new XmlTokenStream(reader, null);
        String result = tokenStream.toString();
        assertNotNull(result);
        assertTrue(result.contains("Token stream"));
        assertTrue(result.contains("state="));
        assertTrue(result.contains("name=root"));
    }

    private static class ElementWrapper {
        private String wrapperLocalName;
        private String wrapperNamespace;
        private ElementWrapper parent;
        private boolean matching;

        public static ElementWrapper matchingWrapper(ElementWrapper parent, String localName, String ns) {
            ElementWrapper w = new ElementWrapper();
            w.wrapperLocalName = localName;
            w.wrapperNamespace = ns;
            w.parent = parent;
            w.matching = true;
            return w;
        }

        public String getWrapperLocalName() { return wrapperLocalName; }
        public String getWrapperNamespace() { return wrapperNamespace; }
        public ElementWrapper getParent() { return parent; }
        public boolean isMatching() { return matching; }
        public boolean matchesWrapper(String localName, String ns) {
            return wrapperLocalName.equals(localName) && wrapperNamespace.equals(ns);
        }
        public ElementWrapper intermediateWrapper() {
            ElementWrapper w = new ElementWrapper();
            w.wrapperLocalName = wrapperLocalName;
            w.wrapperNamespace = wrapperNamespace;
            w.parent = parent;
            w.matching = false;
            return w;
        }
    }
}