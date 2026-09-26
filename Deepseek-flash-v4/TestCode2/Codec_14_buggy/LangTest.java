package org.apache.commons.codec.language.bm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LangTest {

    @Test
    public void testGuessLanguageSingleton() {
        Lang lang = Lang.instance(NameType.GENERIC);
        String result = lang.guessLanguage("hello");
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testGuessLanguageAny() {
        Lang lang = Lang.instance(NameType.GENERIC);
        String result = lang.guessLanguage("xyzzy");
        assertEquals(Languages.ANY, result);
    }

    @Test
    public void testGuessLanguagesSingleton() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet result = lang.guessLanguages("hello");
        assertNotNull(result);
        assertTrue(result.isSingleton());
    }

    @Test
    public void testGuessLanguagesAny() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet result = lang.guessLanguages("xyzzy");
        assertEquals(Languages.ANY_LANGUAGE, result);
    }

    @Test(expected = NullPointerException.class)
    public void testGuessLanguageNullInput() {
        Lang lang = Lang.instance(NameType.GENERIC);
        lang.guessLanguage(null);
    }

    @Test(expected = NullPointerException.class)
    public void testGuessLanguagesNullInput() {
        Lang lang = Lang.instance(NameType.GENERIC);
        lang.guessLanguages(null);
    }

    @Test
    public void testGuessLanguageEmptyInput() {
        Lang lang = Lang.instance(NameType.GENERIC);
        String result = lang.guessLanguage("");
        assertEquals(Languages.ANY, result);
    }

    @Test
    public void testGuessLanguagesEmptyInput() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet result = lang.guessLanguages("");
        assertEquals(Languages.ANY_LANGUAGE, result);
    }

    @Test
    public void testInstanceNotNull() {
        for (NameType nt : NameType.values()) {
            assertNotNull(Lang.instance(nt));
        }
    }

    @Test
    public void testLoadFromResourceInvalidResource() {
        try {
            Lang.loadFromResource("nonexistent.txt", Languages.getInstance(NameType.GENERIC));
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testGuessLanguageDifferentNameTypes() {
        for (NameType nt : NameType.values()) {
            Lang lang = Lang.instance(nt);
            String result = lang.guessLanguage("test");
            assertNotNull(result);
        }
    }
}