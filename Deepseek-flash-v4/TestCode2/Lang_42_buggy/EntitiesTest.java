package org.apache.commons.lang;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EntitiesTest {

    private Entities xmlEntities;
    private Entities html32Entities;
    private Entities html40Entities;

    @Before
    public void setUp() {
        xmlEntities = Entities.XML;
        html32Entities = Entities.HTML32;
        html40Entities = Entities.HTML40;
    }

    // --- Entity name/value tests ---
    @Test
    public void testEntityNameValueBasic() {
        assertEquals("quot", xmlEntities.entityName(34));
        assertEquals(34, xmlEntities.entityValue("quot"));
        assertEquals("amp", xmlEntities.entityName(38));
        assertEquals(38, xmlEntities.entityValue("amp"));
        assertEquals("lt", xmlEntities.entityName(60));
        assertEquals(60, xmlEntities.entityValue("lt"));
        assertEquals("gt", xmlEntities.entityName(62));
        assertEquals(62, xmlEntities.entityValue("gt"));
        assertEquals("apos", xmlEntities.entityName(39));
        assertEquals(39, xmlEntities.entityValue("apos"));
    }

    @Test
    public void testEntityNameNotFound() {
        assertNull(xmlEntities.entityName(0));
        assertNull(xmlEntities.entityName(9999));
        assertEquals(-1, xmlEntities.entityValue("nonexistent"));
    }

    @Test(expected = NullPointerException.class)
    public void testEntityValueNull() {
        xmlEntities.entityValue(null);
    }

    // --- Escape tests ---
    @Test
    public void testEscapeNoSpecial() {
        assertEquals("hello world", xmlEntities.escape("hello world"));
    }

    @Test
    public void testEscapeSpecialChars() {
        assertEquals("a&lt;b", xmlEntities.escape("a<b"));
        assertEquals("a&gt;b", xmlEntities.escape("a>b"));
        assertEquals("a&amp;b", xmlEntities.escape("a&b"));
        assertEquals("a&quot;b", xmlEntities.escape("a\"b"));
        assertEquals("a&apos;b", xmlEntities.escape("a\'b"));
    }

    @Test
    public void testEscapeHighCharNumeric() {
        assertEquals("&#233;", xmlEntities.escape("\u00E9"));
    }

    @Test
    public void testEscapeMix() {
        assertEquals("a&lt;b&gt;c&amp;d", xmlEntities.escape("a<b>c&d"));
    }

    @Test(expected = NullPointerException.class)
    public void testEscapeNullString() {
        xmlEntities.escape((String) null);
    }

    @Test
    public void testEscapeWriter() throws Exception {
        java.io.StringWriter sw = new java.io.StringWriter();
        xmlEntities.escape(sw, "a<b");
        assertEquals("a&lt;b", sw.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testEscapeNullWriter() throws Exception {
        xmlEntities.escape((java.io.Writer) null, "test");
    }

    // --- Unescape tests ---
    @Test
    public void testUnescapeNoEntity() {
        assertEquals("hello world", xmlEntities.unescape("hello world"));
    }

    @Test
    public void testUnescapeXmlEntities() {
        assertEquals("a<b", xmlEntities.unescape("a&lt;b"));
        assertEquals("a>b", xmlEntities.unescape("a&gt;b"));
        assertEquals("a&b", xmlEntities.unescape("a&amp;b"));
        assertEquals("a\"b", xmlEntities.unescape("a&quot;b"));
        assertEquals("a'b", xmlEntities.unescape("a&apos;b"));
    }

    @Test
    public void testUnescapeNumericDecimal() {
        assertEquals("aéb", xmlEntities.unescape("a&#233;b"));
    }

    @Test
    public void testUnescapeNumericHex() {
        assertEquals("aéb", xmlEntities.unescape("a&#xE9;b"));
        assertEquals("aéb", xmlEntities.unescape("a&#Xe9;b"));
    }

    @Test
    public void testUnescapeUnknownEntity() {
        assertEquals("&unknown;", xmlEntities.unescape("&unknown;"));
    }

    @Test
    public void testUnescapeIncompleteEntity() {
        assertEquals("&", xmlEntities.unescape("&"));
        assertEquals("&#", xmlEntities.unescape("&#"));
        assertEquals("&#x", xmlEntities.unescape("&#x"));
    }

    @Test
    public void testUnescapeNullString() {
        try {
            xmlEntities.unescape((String) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    // --- addEntities / addEntity tests ---
    @Test
    public void testAddCustomEntity() {
        Entities custom = new Entities();
        custom.addEntity("custom", 123);
        assertEquals("custom", custom.entityName(123));
        assertEquals(123, custom.entityValue("custom"));
        assertEquals(-1, custom.entityValue("nonexistent"));
    }

    @Test
    public void testAddEntitiesFromArray() {
        Entities custom = new Entities();
        custom.addEntities(new String[][]{{"foo", "1"}, {"bar", "2"}});
        assertEquals("foo", custom.entityName(1));
        assertEquals("bar", custom.entityName(2));
        assertEquals(2, custom.entityValue("bar"));
    }

    // --- Static instances tests ---
    @Test
    public void testXMLInstanceHasBasic() {
        assertNotNull(xmlEntities.entityName(34));
        assertNotNull(xmlEntities.entityName(39));
        assertNull(xmlEntities.entityName(160));
    }

    @Test
    public void testHTML32Instance() {
        assertNotNull(html32Entities.entityName(160));
        assertNotNull(html32Entities.entityName(34));
        assertNull(html32Entities.entityName(913));
    }

    @Test
    public void testHTML40Instance() {
        assertNotNull(html40Entities.entityName(913));
        assertNotNull(html40Entities.entityName(160));
        assertNotNull(html40Entities.entityName(34));
    }

    // --- Writer overload for unescape ---
    @Test
    public void testUnescapeWriter() throws Exception {
        java.io.StringWriter sw = new java.io.StringWriter();
        xmlEntities.unescape(sw, "a&lt;b");
        assertEquals("a<b", sw.toString());
    }

    @Test
    public void testUnescapeWriterNoEntity() throws Exception {
        java.io.StringWriter sw = new java.io.StringWriter();
        xmlEntities.unescape(sw, "hello");
        assertEquals("hello", sw.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testUnescapeWriterNullStr() throws Exception {
        xmlEntities.unescape((java.io.Writer) null, "test");
    }

    // --- Roundtrip ---
    @Test
    public void testEscapeAndUnescapeRoundtrip() {
        String original = "a<b>c&d\"e'f\u00E9g";
        String escaped = xmlEntities.escape(original);
        String unescaped = xmlEntities.unescape(escaped);
        assertEquals(original, unescaped);
    }

    // --- High char with named entity in HTML40 ---
    @Test
    public void testEscapeHighCharNamedInHTML40() {
        assertEquals("&Alpha;", html40Entities.escape(String.valueOf((char) 913)));
    }

    @Test
    public void testEscapeHighCharNoEntity() {
        assertEquals("&#200;", xmlEntities.escape(String.valueOf((char) 200)));
    }

    // --- Multiple consecutive entities ---
    @Test
    public void testUnescapeMultipleAmpersands() {
        assertEquals("a&&b", xmlEntities.unescape("a&amp;&amp;b"));
    }

    @Test
    public void testUnescapeConsecutiveEntities() {
        assertEquals("a<b>", xmlEntities.unescape("a&lt;b&gt;"));
    }
}