package org.apache.commons.lang;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;

public class EntitiesTest {
    private Entities entities;

    @Before
    public void setUp() {
        entities = new Entities();
    }

    @Test
    public void testXMLStatic() {
        assertEquals("quot", Entities.XML.entityName(34));
        assertEquals("amp", Entities.XML.entityName(38));
        assertEquals("lt", Entities.XML.entityName(60));
        assertEquals("gt", Entities.XML.entityName(62));
        assertEquals(34, Entities.XML.entityValue("quot"));
        assertEquals(38, Entities.XML.entityValue("amp"));
        assertEquals(60, Entities.XML.entityValue("lt"));
        assertEquals(62, Entities.XML.entityValue("gt"));
        assertNull(Entities.XML.entityName(160));
        assertEquals(-1, Entities.XML.entityValue("nbsp"));
    }

    @Test
    public void testHTML32Static() {
        assertEquals(160, Entities.HTML32.entityValue("nbsp"));
        assertNotNull(Entities.HTML32.entityName(160));
        assertEquals(34, Entities.HTML32.entityValue("quot"));
        assertEquals(255, Entities.HTML32.entityValue("yuml"));
    }

    @Test
    public void testHTML40Static() {
        assertEquals(402, Entities.HTML40.entityValue("fnof"));
        assertNotNull(Entities.HTML40.entityName(8364));
    }

    @Test
    public void testAddEntity() {
        entities.addEntity("test", 9999);
        assertEquals("test", entities.entityName(9999));
        assertEquals(9999, entities.entityValue("test"));
        assertEquals(-1, entities.entityValue("nonexistent"));
        assertNull(entities.entityName(0));
    }

    @Test
    public void testAddEntitiesZero() {
        entities.addEntities(new String[0][0]);
        assertNull(entities.entityName(1));
        assertEquals(-1, entities.entityValue("any"));
    }

    @Test
    public void testAddEntitiesOne() {
        entities.addEntities(new String[][] {{"alpha", "945"}});
        assertEquals(945, entities.entityValue("alpha"));
        assertEquals("alpha", entities.entityName(945));
    }

    @Test
    public void testAddEntitiesMultiple() {
        entities.addEntities(new String[][] {{"alpha", "945"}, {"beta", "946"}});
        assertEquals(945, entities.entityValue("alpha"));
        assertEquals(946, entities.entityValue("beta"));
    }

    @Test
    public void testEscapeNoSpecial() {
        assertEquals("hello", entities.escape("hello"));
    }

    @Test
    public void testEscapeWithEntities() {
        entities.addEntity("quot", 34);
        entities.addEntity("amp", 38);
        entities.addEntity("lt", 60);
        entities.addEntity("gt", 62);
        assertEquals("&lt;test&gt;", entities.escape("<test>"));
        assertEquals("a&amp;b", entities.escape("a&b"));
    }

    @Test
    public void testEscapeNonAscii() {
        char ch = (char) 200;
        assertEquals("&#200;", entities.escape(String.valueOf(ch)));
    }

    @Test
    public void testEscapeNullInput() {
        try {
            entities.escape(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void testEscapeEmptyString() {
        assertEquals("", entities.escape(""));
    }

    @Test
    public void testEscapeWriter() throws IOException {
        entities.addEntity("amp", 38);
        StringWriter writer = new StringWriter();
        entities.escape(writer, "a&b");
        assertEquals("a&amp;b", writer.toString());
    }

    @Test
    public void testEscapeWriterNonAscii() throws IOException {
        StringWriter writer = new StringWriter();
        entities.escape(writer, "\u00E9");
        assertEquals("&#233;", writer.toString());
    }

    @Test
    public void testEscapeWriterNullInput() throws IOException {
        StringWriter writer = new StringWriter();
        try {
            entities.escape(writer, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void testUnescapeNoAmpersand() {
        assertEquals("hello", entities.unescape("hello"));
    }

    @Test
    public void testUnescapeEntityName() {
        entities.addEntity("nbsp", 160);
        assertEquals("\u00A0", entities.unescape("&nbsp;"));
    }

    @Test
    public void testUnescapeNumericDecimal() {
        assertEquals("A", entities.unescape("&#65;"));
    }

    @Test
    public void testUnescapeNumericHex() {
        assertEquals("Z", entities.unescape("&#x5a;"));
        assertEquals("Z", entities.unescape("&#X5a;"));
    }

    @Test
    public void testUnescapeNestedAmpersand() {
        assertEquals("&lt;", entities.unescape("&amp;lt;"));
    }

    @Test
    public void testUnescapeNoSemicolon() {
        assertEquals("&foo", entities.unescape("&foo"));
    }

    @Test
    public void testUnescapeEmptyEntity() {
        assertEquals("&;", entities.unescape("&;"));
    }

    @Test
    public void testUnescapeInvalidNumeric() {
        assertEquals("&#ABC;", entities.unescape("&#ABC;"));
    }

    @Test
    public void testUnescapeNullInput() {
        try {
            entities.unescape(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void testUnescapeEmptyString() {
        assertEquals("", entities.unescape(""));
    }

    @Test
    public void testUnescapeWriter() throws IOException {
        entities.addEntity("amp", 38);
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&amp;");
        assertEquals("&", writer.toString());
    }

    @Test
    public void testUnescapeWriterNumeric() throws IOException {
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&#65;");
        assertEquals("A", writer.toString());
    }

    @Test
    public void testEntityValueNull() {
        assertEquals(-1, entities.entityValue(null));
    }

    @Test
    public void testEntityNameBoundary() {
        assertNull(entities.entityName(0));
        assertNull(entities.entityName(127));
        assertNull(entities.entityName(128));
        assertNull(entities.entityName(255));
        assertNull(entities.entityName(256));
    }

    @Test(expected = NullPointerException.class)
    public void testAddEntitiesNull() {
        entities.addEntities(null);
    }

    @Test
    public void testEntityValueEmpty() {
        assertEquals(-1, entities.entityValue(""));
    }

    @Test
    public void testEntityNameLookupTable() {
        entities.addEntity("A", 65);
        assertEquals("A", entities.entityName(65));
    }

    @Test
    public void testEntityNameAboveLookupTable() {
        entities.addEntity("custom", 1000);
        assertEquals("custom", entities.entityName(1000));
    }

    @Test
    public void testEscapePlainAscii() {
        assertEquals("a", entities.escape("a"));
    }
}