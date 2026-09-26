package org.apache.commons.codec.language.bm;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class RuleTest {

    @Test
    public void testPhonemeConstructorAndGetters() {
        Languages.LanguageSet langs = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en", "fr")));
        Rule.Phoneme phoneme = new Rule.Phoneme("test", langs);
        assertEquals("test", phoneme.getPhonemeText().toString());
        assertEquals(langs, phoneme.getLanguages());
        assertEquals(Collections.singleton(phoneme), phoneme.getPhonemes());
    }

    @Test
    public void testPhonemeAppend() {
        Languages.LanguageSet langs = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en")));
        Rule.Phoneme phoneme = new Rule.Phoneme("a", langs);
        phoneme.append("bc");
        assertEquals("abc", phoneme.getPhonemeText().toString());
    }

    @Test
    public void testPhonemeJoin() {
        Languages.LanguageSet langs1 = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en")));
        Languages.LanguageSet langs2 = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("fr")));
        Rule.Phoneme left = new Rule.Phoneme("a", langs1);
        Rule.Phoneme right = new Rule.Phoneme("b", langs2);
        Rule.Phoneme joined = left.join(right);
        assertEquals("ab", joined.getPhonemeText().toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParsePhonemeMissingClosingBracket() {
        Rule.parsePhoneme("test[");
    }

    @Test
    public void testParsePhonemeNoBracket() {
        Rule.Phoneme result = Rule.parsePhoneme("hello");
        assertEquals("hello", result.getPhonemeText().toString());
        assertEquals(Languages.ANY_LANGUAGE, result.getLanguages());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParsePhonemeExprMissingClosingParen() {
        Rule.parsePhonemeExpr("(test");
    }

    @Test
    public void testParsePhonemeExprSimple() {
        Rule.PhonemeExpr expr = Rule.parsePhonemeExpr("single");
        assertTrue(expr instanceof Rule.Phoneme);
        assertEquals("single", ((Rule.Phoneme) expr).getPhonemeText().toString());
    }

    @Test
    public void testParsePhonemeExprList() {
        Rule.PhonemeExpr expr = Rule.parsePhonemeExpr("(a|b)");
        assertTrue(expr instanceof Rule.PhonemeList);
    }

    @Test
    public void testPatternAndContextMatchesNegativeIndex() {
        Rule rule = new Rule("a", "", "", Rule.parsePhoneme("x"));
        try {
            rule.patternAndContextMatches("input", -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testPatternAndContextMatchesPatternTooLong() {
        Rule rule = new Rule("abc", "", "", Rule.parsePhoneme("x"));
        assertFalse(rule.patternAndContextMatches("ab", 0));
    }

    @Test
    public void testPatternAndContextMatchesPatternMismatch() {
        Rule rule = new Rule("abc", "", "", Rule.parsePhoneme("x"));
        assertFalse(rule.patternAndContextMatches("abd", 0));
    }

    @Test
    public void testPatternAndContextMatchesRightContextFails() {
        Rule rule = new Rule("a", "", "b", Rule.parsePhoneme("x"));
        assertFalse(rule.patternAndContextMatches("ac", 0));
    }

    @Test
    public void testPatternAndContextMatchesLeftContextFails() {
        Rule rule = new Rule("b", "a", "", Rule.parsePhoneme("x"));
        assertFalse(rule.patternAndContextMatches("xb", 0));
    }

    @Test
    public void testPatternAndContextMatchesAllMatch() {
        Rule rule = new Rule("a", "", "", Rule.parsePhoneme("x"));
        assertTrue(rule.patternAndContextMatches("a", 0));
    }

    @Test
    public void testContainsTrue() {
        assertTrue(Rule.contains("hello", 'e'));
    }

    @Test
    public void testContainsFalse() {
        assertFalse(Rule.contains("hello", 'a'));
    }

    @Test
    public void testContainsEmpty() {
        assertFalse(Rule.contains("", 'x'));
    }

    @Test
    public void testStartsWithTrue() {
        assertTrue(Rule.startsWith("hello", "he"));
    }

    @Test
    public void testStartsWithFalse() {
        assertFalse(Rule.startsWith("hello", "hi"));
    }

    @Test
    public void testStartsWithPrefixLonger() {
        assertFalse(Rule.startsWith("hello", "hello!"));
    }

    @Test
    public void testEndsWithTrue() {
        assertTrue(Rule.endsWith("hello", "lo"));
    }

    @Test
    public void testEndsWithFalse() {
        assertFalse(Rule.endsWith("hello", "la"));
    }

    @Test
    public void testEndsWithSuffixLonger() {
        assertFalse(Rule.endsWith("hello", "hello!"));
    }

    @Test
    public void testStripQuotesBoth() {
        assertEquals("hello", Rule.stripQuotes("\"hello\""));
    }

    @Test
    public void testStripQuotesStartOnly() {
        assertEquals("hello\"", Rule.stripQuotes("\"hello\""));
    }

    @Test
    public void testStripQuotesEndOnly() {
        assertEquals("\"hello", Rule.stripQuotes("\"hello"));
    }

    @Test
    public void testStripQuotesNone() {
        assertEquals("hello", Rule.stripQuotes("hello"));
    }

    @Test
    public void testPhonemeListGetPhonemes() {
        Languages.LanguageSet langs = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en")));
        Rule.Phoneme p1 = new Rule.Phoneme("a", langs);
        Rule.Phoneme p2 = new Rule.Phoneme("b", langs);
        List<Rule.Phoneme> list = new ArrayList<Rule.Phoneme>(Arrays.asList(p1, p2));
        Rule.PhonemeList phList = new Rule.PhonemeList(list);
        assertEquals(list, phList.getPhonemes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstanceMapInvalidLang() {
        Rule.getInstanceMap(NameType.GENERIC, RuleType.RULES, "nonexistent");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateScannerInvalidResource() {
        Rule.createScanner("nonexistent");
    }

    @Test
    public void testPatternAllStrings() {
        Rule.RPattern rp = Rule.ALL_STRINGS_RMATCHER;
        assertTrue(rp.isMatch("anything"));
        assertTrue(rp.isMatch(""));
    }

    @Test
    public void testPatternWithBoxNoAnchors() {
        Rule.RPattern rp = Rule.pattern("[ab]");
        assertTrue(rp.isMatch("a"));
        assertFalse(rp.isMatch("c"));
    }

    @Test
    public void testPatternExactMatch() {
        Rule.RPattern rp = Rule.pattern("^abc$");
        assertTrue(rp.isMatch("abc"));
        assertFalse(rp.isMatch("abcd"));
    }

    @Test
    public void testPatternStartsWith() {
        Rule.RPattern rp = Rule.pattern("^hello");
        assertTrue(rp.isMatch("hello world"));
        assertFalse(rp.isMatch("world hello"));
    }

    @Test
    public void testPatternEndsWith() {
        Rule.RPattern rp = Rule.pattern("world$");
        assertTrue(rp.isMatch("hello world"));
        assertFalse(rp.isMatch("world hello"));
    }

    @Test
    public void testPatternEmptyExact() {
        Rule.RPattern rp = Rule.pattern("^$");
        assertTrue(rp.isMatch(""));
        assertFalse(rp.isMatch("a"));
    }

    @Test
    public void testPatternBoxWithAnchors() {
        Rule.RPattern rp = Rule.pattern("^[ae]$");
        assertTrue(rp.isMatch("a"));
        assertFalse(rp.isMatch("aa"));
    }

    @Test
    public void testPatternNegatedBox() {
        Rule.RPattern rp = Rule.pattern("^[^a]$");
        assertTrue(rp.isMatch("b"));
        assertFalse(rp.isMatch("a"));
    }

    @Test
    public void testPatternComplexRegexFallback() {
        Rule.RPattern rp = Rule.pattern("a+b+");
        assertTrue(rp.isMatch("ab"));
        assertTrue(rp.isMatch("aaabbb"));
        assertFalse(rp.isMatch("c"));
    }

    @Test
    public void testRuleConstructorAndGetters() {
        Rule.PhonemeExpr phoneme = Rule.parsePhoneme("x");
        Rule rule = new Rule("a", "b", "c", phoneme);
        assertEquals("a", rule.getPattern());
        assertEquals(phoneme, rule.getPhoneme());
        assertNotNull(rule.getLContext());
        assertNotNull(rule.getRContext());
    }

    @Test
    public void testPhonemeComparator() {
        Languages.LanguageSet langs = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en")));
        Rule.Phoneme p1 = new Rule.Phoneme("a", langs);
        Rule.Phoneme p2 = new Rule.Phoneme("b", langs);
        Rule.Phoneme p3 = new Rule.Phoneme("ab", langs);
        assertTrue(Rule.Phoneme.COMPARATOR.compare(p1, p2) < 0);
        assertTrue(Rule.Phoneme.COMPARATOR.compare(p2, p1) > 0);
        assertTrue(Rule.Phoneme.COMPARATOR.compare(p1, p1) == 0);
        assertTrue(Rule.Phoneme.COMPARATOR.compare(p1, p3) < 0);
        assertTrue(Rule.Phoneme.COMPARATOR.compare(p3, p1) > 0);
    }

    @Test
    public void testPhonemeToString() {
        Languages.LanguageSet langs = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en")));
        Rule.Phoneme phoneme = new Rule.Phoneme("test", langs);
        assertTrue(phoneme.toString().contains("test"));
        assertTrue(phoneme.toString().contains("en"));
    }

    @Test
    public void testPhonemeConcatenationConstructor() {
        Languages.LanguageSet langs = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en")));
        Rule.Phoneme left = new Rule.Phoneme("a", langs);
        Rule.Phoneme right = new Rule.Phoneme("b", langs);
        Rule.Phoneme combined = new Rule.Phoneme(left, right);
        assertEquals("ab", combined.getPhonemeText().toString());
        assertEquals(langs, combined.getLanguages());
    }

    @Test
    public void testPhonemeConcatenationConstructorWithLanguages() {
        Languages.LanguageSet langs1 = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en")));
        Languages.LanguageSet langs2 = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("fr")));
        Rule.Phoneme left = new Rule.Phoneme("a", langs1);
        Rule.Phoneme right = new Rule.Phoneme("b", langs2);
        Languages.LanguageSet union = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en", "fr")));
        Rule.Phoneme combined = new Rule.Phoneme(left, right, union);
        assertEquals("ab", combined.getPhonemeText().toString());
        assertEquals(union, combined.getLanguages());
    }

    @Test
    public void testPhonemeJoinLanguagesRestricted() {
        Languages.LanguageSet langs1 = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en", "fr")));
        Languages.LanguageSet langs2 = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("fr", "de")));
        Rule.Phoneme left = new Rule.Phoneme("a", langs1);
        Rule.Phoneme right = new Rule.Phoneme("b", langs2);
        Rule.Phoneme joined = left.join(right);
        assertEquals("ab", joined.getPhonemeText().toString());
        Languages.LanguageSet expected = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("fr")));
        assertEquals(expected, joined.getLanguages());
    }
}