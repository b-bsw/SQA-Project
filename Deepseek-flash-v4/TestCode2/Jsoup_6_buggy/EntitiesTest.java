package org.jsoup.nodes;
import org.junit.Test;
import org.junit.Assert;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class EntitiesTest {
    private static final CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
    private static final CharsetEncoder utf8Encoder = Charset.forName("UTF-8").newEncoder();

    @Test
    public void testEscapeEmpty() {
        Assert.assertEquals("", Entities.escape("", asciiEncoder, Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeNoSpecial() {
        Assert.assertEquals("abc", Entities.escape("abc", utf8Encoder, Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeBaseEntity() {
        Assert.assertEquals("&lt;", Entities.escape("<", asciiEncoder, Entities.EscapeMode.base));
        Assert.assertEquals("&gt;", Entities.escape(">", asciiEncoder, Entities.EscapeMode.base));
        Assert.assertEquals("&amp;", Entities.escape("&", asciiEncoder, Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeExtendedEntity() {
        Assert.assertEquals("α", Entities.escape("α", utf8Encoder, Entities.EscapeMode.base));
        Assert.assertEquals("&alpha;", Entities.escape("α", asciiEncoder, Entities.EscapeMode.extended));
    }

    @Test
    public void testEscapeNumericFallback() {
        char c = 0x1000;
        String input = String.valueOf(c);
        String expected = "&#" + (int)c + ";";
        Assert.assertEquals(expected, Entities.escape(input, asciiEncoder, Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeBaseModeWithFullEntity() {
        char euro = '\u20AC';
        String input = String.valueOf(euro);
        Assert.assertEquals("&#8364;", Entities.escape(input, asciiEncoder, Entities.EscapeMode.base));
        Assert.assertEquals("&euro;", Entities.escape(input, asciiEncoder, Entities.EscapeMode.extended));
    }

    @Test
    public void testUnescapeNoAmpersand() {
        Assert.assertEquals("hello", Entities.unescape("hello"));
    }

    @Test
    public void testUnescapeNamedEntity() {
        Assert.assertEquals("&", Entities.unescape("&amp;"));
        Assert.assertEquals("<", Entities.unescape("&lt;"));
    }

    @Test
    public void testUnescapeNumericDecimal() {
        Assert.assertEquals("&", Entities.unescape("&#38;"));
    }

    @Test
    public void testUnescapeNumericHex() {
        Assert.assertEquals("&", Entities.unescape("&#x26;"));
        Assert.assertEquals("&", Entities.unescape("&#X26;"));
    }

    @Test
    public void testUnescapeUnknownEntity() {
        Assert.assertEquals("&unknown;", Entities.unescape("&unknown;"));
    }

    @Test
    public void testUnescapeNoSemicolon() {
        Assert.assertEquals("&", Entities.unescape("&amp"));
    }

    @Test
    public void testUnescapeMultiple() {
        Assert.assertEquals("a&b<c", Entities.unescape("a&amp;b&lt;c"));
    }

    @Test
    public void testUnescapeInvalidNumeric() {
        Assert.assertEquals("&#xZZ;", Entities.unescape("&#xZZ;"));
    }

    @Test
    public void testUnescapeBoundaryCharAboveFFFF() {
        String result = Entities.unescape("&#x10000;");
        Assert.assertEquals(1, result.length());
    }

    @Test
    public void testEscapeLoopMultipleChars() {
        Assert.assertEquals("&lt;&amp;&gt;", Entities.escape("<&>", asciiEncoder, Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeLoopSingleChar() {
        Assert.assertEquals("&lt;", Entities.escape("<", asciiEncoder, Entities.EscapeMode.base));
    }

    @Test(expected = NullPointerException.class)
    public void testEscapeNull() {
        Entities.escape(null, asciiEncoder, Entities.EscapeMode.base);
    }

    @Test(expected = NullPointerException.class)
    public void testUnescapeNull() {
        Entities.unescape(null);
    }
}