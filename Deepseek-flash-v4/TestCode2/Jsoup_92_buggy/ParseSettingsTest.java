package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ParseSettingsTest {

    @Test
    public void testHtmlDefaultSettings() {
        ParseSettings settings = ParseSettings.htmlDefault;

        assertFalse(settings.preserveTagCase());
        assertEquals("div", settings.normalizeTag(" DIV "));
        assertEquals("id", settings.normalizeAttribute(" ID "));
    }

    @Test
    public void testPreserveCaseSettings() {
        ParseSettings settings = ParseSettings.preserveCase;

        assertTrue(settings.preserveTagCase());
        assertEquals("DIV", settings.normalizeTag("DIV"));
        assertEquals("ID", settings.normalizeAttribute("ID"));
    }

    @Test
    public void testConfiguredTagLowercaseAndAttributeLowercase() {
        ParseSettings settings = new ParseSettings(false, false);

        assertEquals("p", settings.normalizeTag("  P  "));
        assertEquals("span", settings.normalizeTag(" span\t"));
        assertEquals("class", settings.normalizeAttribute("  CLASS "));
    }

    @Test
    public void testConfiguredTagPreserveAndAttributePreserve() {
        ParseSettings settings = new ParseSettings(true, true);

        assertEquals("DiV", settings.normalizeTag("  DiV "));
        assertEquals("iD", settings.normalizeAttribute("  iD "));
    }

    @Test
    public void testMixedCaseSettings() {
        ParseSettings settings = new ParseSettings(true, false);

        assertEquals("P", settings.normalizeTag(" P "));
        assertEquals("id", settings.normalizeAttribute(" ID "));
    }

    @Test
    public void testEmptyAndWhitespaceInputs() {
        ParseSettings settings = new ParseSettings(false, false);

        assertEquals("", settings.normalizeTag(""));
        assertEquals("", settings.normalizeAttribute("   "));
    }

    @Test(expected = NullPointerException.class)
    public void testNormalizeTagNullThrows() {
        ParseSettings.htmlDefault.normalizeTag(null);
    }

    @Test(expected = NullPointerException.class)
    public void testNormalizeAttributeNullThrows() {
        ParseSettings.htmlDefault.normalizeAttribute(null);
    }

    @Test
    public void testNormalizeAttributesLowercasesKeysWhenNotPreservingAttributeCase() {
        ParseSettings settings = new ParseSettings(false, false);
        Attributes attrs = new Attributes();
        attrs.put("ID", "one");
        attrs.put("CLASS", "two");

        Attributes result = settings.normalizeAttributes(attrs);

        assertSame(attrs, result);
        assertTrue(result.html().contains("id=\"one\""));
        assertTrue(result.html().contains("class=\"two\""));
    }

    @Test
    public void testNormalizeAttributesPreservesKeysWhenPreservingAttributeCase() {
        ParseSettings settings = new ParseSettings(true, true);
        Attributes attrs = new Attributes();
        attrs.put("ID", "one");

        Attributes result = settings.normalizeAttributes(attrs);

        assertSame(attrs, result);
        assertTrue(result.html().contains("ID=\"one\""));
    }
}