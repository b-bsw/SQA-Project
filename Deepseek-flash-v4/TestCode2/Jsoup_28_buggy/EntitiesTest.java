package org.jsoup.nodes;

import static org.junit.Assert.*;
import org.junit.Test;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class EntitiesTest {
    
    private static final CharsetEncoder UTF8 = Charset.forName("UTF-8").newEncoder();
    private static final CharsetEncoder ASCII = Charset.forName("US-ASCII").newEncoder();
    
    @Test
    public void testEscapeEmptyString() {
        assertEquals("", Entities.escape("", UTF8, Entities.EscapeMode.xhtml));
    }
    
    @Test
    public void testEscapeCharacterInMap() {
        assertEquals("&amp;", Entities.escape("&", UTF8, Entities.EscapeMode.xhtml));
    }
    
    @Test
    public void testEscapeCharacterNotInMapEncoderCanEncode() {
        assertEquals("a", Entities.escape("a", ASCII, Entities.EscapeMode.xhtml));
    }
    
    @Test
    public void testEscapeCharacterNotInMapEncoderCannotEncode() {
        assertEquals("&#252;", Entities.escape("ü", ASCII, Entities.EscapeMode.xhtml));
    }
    
    @Test(expected = NullPointerException.class)
    public void testEscapeNullString() {
        Entities.escape(null, UTF8, Entities.EscapeMode.xhtml);
    }
    
    @Test
    public void testEscapeMultipleLoop() {
        assertEquals("a&amp;b", Entities.escape("a&b", UTF8, Entities.EscapeMode.xhtml));
    }
    
    @Test
    public void testUnescapeNoAmpersand() {
        assertEquals("hello", Entities.unescape("hello"));
    }
    
    @Test
    public void testUnescapeNumericDecimal() {
        assertEquals("A", Entities.unescape("&#65;"));
    }
    
    @Test
    public void testUnescapeNumericHex() {
        assertEquals("A", Entities.unescape("&#x41;"));
    }
    
    @Test
    public void testUnescapeNamedEntity() {
        assertEquals("&", Entities.unescape("&amp;"));
    }
    
    @Test
    public void testUnescapeStrictMode() {
        assertEquals("&amp", Entities.unescape("&amp", true));
        assertEquals("&", Entities.unescape("&amp", false));
    }
    
    @Test
    public void testUnescapeUnknownEntity() {
        assertEquals("&unknown;", Entities.unescape("&unknown;"));
    }
    
    @Test(expected = NullPointerException.class)
    public void testUnescapeNullString() {
        Entities.unescape(null);
    }
    
    @Test
    public void testUnescapeMultipleMatches() {
        assertEquals("AB", Entities.unescape("&#65;&#66;"));
    }
    
    @Test
    public void testIsNamedEntityKnown() {
        assertTrue(Entities.isNamedEntity("amp"));
    }
    
    @Test
    public void testIsNamedEntityUnknown() {
        assertFalse(Entities.isNamedEntity("unknown"));
    }
    
    @Test(expected = NullPointerException.class)
    public void testIsNamedEntityNull() {
        Entities.isNamedEntity(null);
    }
    
    @Test
    public void testGetCharacterByNameKnown() {
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
    }
    
    @Test
    public void testGetCharacterByNameUnknown() {
        assertNull(Entities.getCharacterByName("unknown"));
    }
    
    @Test(expected = NullPointerException.class)
    public void testGetCharacterByNameNull() {
        Entities.getCharacterByName(null);
    }
}