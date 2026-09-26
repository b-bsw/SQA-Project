package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class EntitiesTest {

    private static final CharsetEncoder UTF8 = Charset.forName("UTF-8").newEncoder();
    private static final CharsetEncoder ASCII = Charset.forName("US-ASCII").newEncoder();

    @Test
    public void testEscapeEmptyString() {
        assertEquals("", Entities.escape("", UTF8, Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeBaseEscapesMappedCharacters() {
        assertEquals("&lt;&gt;&amp;", Entities.escape("<>&", UTF8, Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeExtendedEscapesExtendedEntityButBaseDoesNot() {
        String extendedChar = "\u0152";
        assertEquals("\u0152", Entities.escape(extendedChar, UTF8, Entities.EscapeMode.base));
        assertEquals("&oelig;", Entities.escape(extendedChar, UTF8, Entities.EscapeMode.extended));
    }

    @Test
    public void testEscapeUsesNumericReferenceWhenEncoderCannotEncode() {
        assertEquals("&#338;", Entities.escape("\u0152", ASCII, Entities.EscapeMode.base));
    }

    @Test(expected = NullPointerException.class)
    public void testEscapeNullInput() {
        Entities.escape(null, UTF8, Entities.EscapeMode.base);
    }

    @Test
    public void testUnescapeReturnsInputWhenNoAmpersand() {
        assertEquals("plain text", Entities.unescape("plain text"));
        assertEquals("", Entities.unescape(""));
    }

    @Test
    public void testUnescapeNamedEntity() {
        assertEquals("&", Entities.unescape("&amp;"));
        assertEquals("&", Entities.unescape("&Amp;"));
    }

    @Test
    public void testUnescapeNumericDecimalAndHex() {
        assertEquals("A", Entities.unescape("&#65;"));
        assertEquals("A", Entities.unescape("&#x41;"));
        assertEquals("A", Entities.unescape("&#X41;"));
    }

    @Test
    public void testUnescapeUnknownEntityIsPreserved() {
        assertEquals("&bogus;", Entities.unescape("&bogus;"));
    }

    @Test
    public void testUnescapeMultipleEntities() {
        assertEquals("<&>", Entities.unescape("&lt;&amp;&gt;"));
    }

    @Test
    public void testUnescapeInvalidNumericEntityIsPreserved() {
        String bad = "&#999999999999999999999999999;";
        assertEquals(bad, Entities.unescape(bad));
    }

    @Test
    public void testUnescapeAmpersandWithoutEntityIsPreserved() {
        assertEquals("&", Entities.unescape("&"));
    }

    @Test(expected = NullPointerException.class)
    public void testUnescapeNullInput() {
        Entities.unescape(null);
    }
}