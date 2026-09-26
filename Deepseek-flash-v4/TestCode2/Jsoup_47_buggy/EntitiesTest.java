package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class EntitiesTest {

    private Document.OutputSettings settings(final Entities.EscapeMode mode) {
        return new Document.OutputSettings() {
            @Override
            public Entities.EscapeMode escapeMode() {
                return mode;
            }
        };
    }

    private Document.OutputSettings settings(final Entities.EscapeMode mode, final String charset) {
        return new Document.OutputSettings() {
            @Override
            public Entities.EscapeMode escapeMode() {
                return mode;
            }

            @Override
            public CharsetEncoder encoder() {
                return Charset.forName(charset).newEncoder();
            }
        };
    }

    @Test
    public void isNamedEntityKnownAndUnknown() {
        assertTrue(Entities.isNamedEntity("amp"));
        assertTrue(Entities.isNamedEntity("lt"));
        assertFalse(Entities.isNamedEntity("notAnEntity"));
        assertFalse(Entities.isNamedEntity(""));
        assertFalse(Entities.isNamedEntity(null));
    }

    @Test
    public void isBaseNamedEntityBehavior() {
        assertTrue(Entities.isBaseNamedEntity("amp"));
        assertFalse(Entities.isBaseNamedEntity("notAnEntity"));
        assertFalse(Entities.isBaseNamedEntity(""));
        assertFalse(Entities.isBaseNamedEntity(null));
    }

    @Test
    public void getCharacterByNameReturnsKnownOrNull() {
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
        assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
        assertNull(Entities.getCharacterByName("unknown"));
        assertNull(Entities.getCharacterByName(""));
        assertNull(Entities.getCharacterByName(null));
    }

    @Test
    public void escapeModeMaps() {
        assertEquals(4, Entities.EscapeMode.xhtml.getMap().size());
        assertEquals("amp", Entities.EscapeMode.xhtml.getMap().get('&'));
        assertEquals("amp", Entities.EscapeMode.base.getMap().get('&'));
        assertEquals("amp", Entities.EscapeMode.extended.getMap().get('&'));
    }

    @Test
    public void escapeEmptyAndSimple() {
        Document.OutputSettings out = settings(Entities.EscapeMode.base);
        assertEquals("", Entities.escape("", out));
        assertEquals("&amp;", Entities.escape("&", out));
        assertEquals("a&amp;b", Entities.escape("a&b", out));
    }

    @Test
    public void escapeSpecialCharsOutsideAttribute() {
        Document.OutputSettings out = settings(Entities.EscapeMode.base);
        assertEquals("\"&lt;&gt;", Entities.escape("\"<>", out));
    }

    @Test
    public void escapeSpecialCharsInsideAttribute() {
        Document.OutputSettings out = settings(Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\"<>", out, true, false, false);
        assertEquals("&quot;<>", sb.toString());
    }

    @Test
    public void escapeNormalisesAndStripsLeadingWhite() {
        Document.OutputSettings out = settings(Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();

        Entities.escape(sb, " a\n  b", out, false, true, false);
        assertEquals(" a b", sb.toString());

        sb.setLength(0);
        Entities.escape(sb, "  a", out, false, true, true);
        assertEquals("a", sb.toString());

        sb.setLength(0);
        Entities.escape(sb, "  \n", out, false, true, true);
        assertEquals("", sb.toString());
    }

    @Test
    public void escapeUsesNamedOrNumericReferencesWhenNotEncodable() {
        Document.OutputSettings asciiXhtml = settings(Entities.EscapeMode.xhtml, "US-ASCII");
        assertEquals("a", Entities.escape("a", asciiXhtml));
        assertEquals("&#x3c3;", Entities.escape("\u03c3", asciiXhtml));
        assertEquals("&#x1f600;", Entities.escape(new String(Character.toChars(0x1f600)), asciiXhtml));

        Document.OutputSettings asciiExtended = settings(Entities.EscapeMode.extended, "US-ASCII");
        assertEquals("&eacute;", Entities.escape("\u00e9", asciiExtended));
    }

    @Test
    public void escapeNbspDiffersForXhtmlAndBase() {
        Document.OutputSettings xhtml = settings(Entities.EscapeMode.xhtml);
        assertEquals("&#xa0;", Entities.escape("\u00a0", xhtml));

        Document.OutputSettings base = settings(Entities.EscapeMode.base);
        assertEquals("&nbsp;", Entities.escape("\u00a0", base));
    }

    @Test
    public void escapeCharsEncodableBySeveralCharsetsArePreserved() {
        Document.OutputSettings utf = settings(Entities.EscapeMode.base, "UTF-8");
        assertEquals("caf\u00e9", Entities.escape("caf\u00e9", utf));

        Document.OutputSettings latin = settings(Entities.EscapeMode.xhtml, "ISO-8859-1");
        assertEquals("caf\u00e9", Entities.escape("caf\u00e9", latin));
    }

    @Test(expected = NullPointerException.class)
    public void escapeNullInputThrowsNpe() {
        Entities.escape(null, settings(Entities.EscapeMode.base));
    }

    @Test
    public void unescapeHandlesNamedAndNumericEntities() {
        assertEquals("<", Entities.unescape("&lt;"));
        assertEquals("&", Entities.unescape("&amp;"));
        assertEquals("<", Entities.unescape("&#x3C;"));
        assertEquals("<", Entities.unescape("&lt;", true));
        assertEquals("", Entities.unescape(""));
    }
}