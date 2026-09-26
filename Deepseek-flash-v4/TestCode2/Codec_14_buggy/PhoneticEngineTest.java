package org.apache.commons.codec.language.bm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class PhoneticEngineTest {

    private PhoneticEngine engine;

    @Before
    public void setUp() {
        engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
    }

    @Test
    public void testConstructorWithDefaultMaxPhonemes() {
        PhoneticEngine e = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
        assertEquals(20, e.getMaxPhonemes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsRulesRuleType() {
        new PhoneticEngine(NameType.GENERIC, RuleType.RULES, true);
    }

    @Test(expected = NullPointerException.class)
    public void testApplyFinalRulesThrowsOnNull() {
        PhoneticEngine.PhonemeBuilder builder = PhoneticEngine.PhonemeBuilder.empty(Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en"))));
        engine.applyFinalRules(builder, null);
    }

    @Test
    public void testApplyFinalRulesWithEmptyMapReturnsSameBuilder() {
        PhoneticEngine.PhonemeBuilder builder = PhoneticEngine.PhonemeBuilder.empty(Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en"))));
        PhoneticEngine.PhonemeBuilder result = engine.applyFinalRules(builder, new java.util.HashMap<String, List<Rule>>());
        assertEquals(builder.getPhonemes(), result.getPhonemes());
    }

    @Test
    public void testGetLang() {
        assertNotNull(engine.getLang());
    }

    @Test
    public void testGetNameType() {
        assertEquals(NameType.GENERIC, engine.getNameType());
    }

    @Test
    public void testGetRuleType() {
        assertEquals(RuleType.APPROX, engine.getRuleType());
    }

    @Test
    public void testIsConcat() {
        assertTrue(engine.isConcat());
    }

    @Test
    public void testGetMaxPhonemes() {
        assertEquals(20, engine.getMaxPhonemes());
    }

    @Test
    public void testEncodeWithEmptyString() {
        String result = engine.encode("");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithNullInput() {
        try {
            engine.encode((String) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testEncodeWithDQuotePrefix() {
        PhoneticEngine genericEngine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        String result = genericEngine.encode("d'angelo");
        assertTrue(result.startsWith("("));
        assertTrue(result.contains(")-("));
    }

    @Test
    public void testEncodeWithGenericPrefix() {
        PhoneticEngine genericEngine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        String result = genericEngine.encode("van gogh");
        assertTrue(result.startsWith("("));
        assertTrue(result.contains(")-("));
    }

    @Test
    public void testEncodeWithSephardicNameType() {
        PhoneticEngine sephardicEngine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.APPROX, true);
        String result = sephardicEngine.encode("benitez");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithAshkenaziNameType() {
        PhoneticEngine ashkenaziEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true);
        String result = ashkenaziEngine.encode("goldstein");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithConcatMode() {
        PhoneticEngine concatEngine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
        String result = concatEngine.encode("john smith");
        assertNotNull(result);
        assertFalse(result.contains("-"));
    }

    @Test
    public void testEncodeWithNonConcatModeSingleWord() {
        PhoneticEngine nonConcatEngine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        String result = nonConcatEngine.encode("smith");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithNonConcatModeMultipleWords() {
        PhoneticEngine nonConcatEngine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        String result = nonConcatEngine.encode("john smith");
        assertNotNull(result);
        assertTrue(result.contains("-"));
        assertFalse(result.startsWith("-"));
    }

    @Test
    public void testPhonemeBuilderEmpty() {
        Languages.LanguageSet langs = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en")));
        PhoneticEngine.PhonemeBuilder builder = PhoneticEngine.PhonemeBuilder.empty(langs);
        assertNotNull(builder);
        assertEquals(1, builder.getPhonemes().size());
    }

    @Test
    public void testPhonemeBuilderAppend() {
        Languages.LanguageSet langs = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en")));
        PhoneticEngine.PhonemeBuilder builder = PhoneticEngine.PhonemeBuilder.empty(langs);
        builder.append("test");
        assertEquals("test", builder.makeString());
    }

    @Test
    public void testPhonemeBuilderMakeStringMultiplePhonemes() {
        Languages.LanguageSet langs = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en")));
        PhoneticEngine.PhonemeBuilder builder = PhoneticEngine.PhonemeBuilder.empty(langs);
        builder.append("a");
        builder.append("b");
        assertEquals("ab", builder.makeString());
    }

    @Test
    public void testRulesApplicationConstructorThrowsOnNullFinalRules() {
        try {
            new PhoneticEngine.RulesApplication(null, "test", PhoneticEngine.PhonemeBuilder.empty(
                Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en")))), 0, 10);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testJoinWithMultipleStrings() {
        String result = PhoneticEngine.join(Arrays.asList("a", "b", "c"), "-");
        assertEquals("a-b-c", result);
    }

    @Test
    public void testJoinWithSingleString() {
        String result = PhoneticEngine.join(Arrays.asList("only"), "-");
        assertEquals("only", result);
    }

    @Test
    public void testJoinWithEmptyList() {
        String result = PhoneticEngine.join(new java.util.ArrayList<String>(), "-");
        assertEquals("", result);
    }

    @Test
    public void testStaticInitializerForNamePrefixes() {
        Set<String> ashkenazi = PhoneticEngine.NAME_PREFIXES.get(NameType.ASHKENAZI);
        assertTrue(ashkenazi.contains("bar"));
        assertTrue(ashkenazi.contains("ben"));
        assertTrue(ashkenazi.contains("da"));
        assertTrue(ashkenazi.contains("de"));
        assertTrue(ashkenazi.contains("van"));
        assertTrue(ashkenazi.contains("von"));
    }
}