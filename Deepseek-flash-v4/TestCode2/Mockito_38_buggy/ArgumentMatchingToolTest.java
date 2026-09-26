package org.mockito.internal.verification.argumentmatching;

import static org.junit.Assert.assertArrayEquals;

import java.util.LinkedList;
import java.util.List;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.mockito.internal.matchers.ContainsExtraTypeInformation;

public class ArgumentMatchingToolTest {

    private final ArgumentMatchingTool tool = new ArgumentMatchingTool();

    @Test
    public void returnsEmptyArrayWhenMatcherAndArgumentCountsDiffer() {
        List<Matcher> matchers = matchers(new ExtraMatcher(true, true, "x"));

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, new Object[0]);

        assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void returnsEmptyArrayWhenBothListsAreEmpty() {
        List<Matcher> matchers = new LinkedList<Matcher>();

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, new Object[0]);

        assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void returnsEmptyArrayWhenArgumentMatches() {
        List<Matcher> matchers = matchers(new ExtraMatcher(true, true, "x"));

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, new Object[] {"x"});

        assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void returnsEmptyArrayWhenExtraTypeMatches() {
        List<Matcher> matchers = matchers(new ExtraMatcher(false, true, "x"));

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, new Object[] {"x"});

        assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void returnsEmptyArrayWhenStringDescriptionsDiffer() {
        List<Matcher> matchers = matchers(new ExtraMatcher(false, false, "other"));

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, new Object[] {"x"});

        assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void returnsEmptyArrayWhenMatcherHasNoExtraTypeInformation() {
        List<Matcher> matchers = matchers(new PlainMatcher(false, "x"));

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, new Object[] {"x"});

        assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void returnsIndexWhenDescriptionMatchesButTypeDoesNot() {
        List<Matcher> matchers = matchers(new ExtraMatcher(false, false, "x"));

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, new Object[] {"x"});

        assertArrayEquals(new Integer[] {0}, result);
    }

    @Test
    public void returnsAllSuspiciousIndexesInOrder() {
        List<Matcher> matchers = matchers(
                new ExtraMatcher(false, false, "a"),
                new ExtraMatcher(true, true, "b"),
                new ExtraMatcher(false, false, "c"));

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, new Object[] {"a", "b", "c"});

        assertArrayEquals(new Integer[] {0, 2}, result);
    }

    @Test
    public void treatsMatcherExceptionAsNotMatching() {
        ExtraMatcher matcher = new ExtraMatcher(true, false, "x");
        matcher.throwOnMatches = true;

        List<Matcher> matchers = matchers(matcher);
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, new Object[] {"x"});

        assertArrayEquals(new Integer[] {0}, result);
    }

    @Test(expected = NullPointerException.class)
    public void nullMatchersThrowsNullPointerException() {
        tool.getSuspiciouslyNotMatchingArgsIndexes(null, new Object[0]);
    }

    @Test(expected = NullPointerException.class)
    public void nullArgumentsThrowsNullPointerException() {
        tool.getSuspiciouslyNotMatchingArgsIndexes(new LinkedList<Matcher>(), null);
    }

    @SuppressWarnings("unchecked")
    private static List<Matcher> matchers(Matcher<?>... matcherArray) {
        List<Matcher> result = new LinkedList<Matcher>();
        for (Matcher<?> matcher : matcherArray) {
            result.add((Matcher) matcher);
        }
        return result;
    }

    private static class ExtraMatcher extends BaseMatcher<Object> implements ContainsExtraTypeInformation {
        private final boolean matchResult;
        private final boolean typeMatchResult;
        private final String description;
        private boolean throwOnMatches;

        ExtraMatcher(boolean matchResult, boolean typeMatchResult, String description) {
            this.matchResult = matchResult;
            this.typeMatchResult = typeMatchResult;
            this.description = description;
        }

        @Override
        public boolean matches(Object item) {
            if (throwOnMatches) {
                throw new RuntimeException("boom");
            }
            return matchResult;
        }

        @Override
        public boolean typeMatches(Object item) {
            return typeMatchResult;
        }

        @Override
        public void describeTo(Description desc) {
            desc.appendText(description);
        }
    }

    private static class PlainMatcher extends BaseMatcher<Object> {
        private final boolean matchResult;
        private final String description;

        PlainMatcher(boolean matchResult, String description) {
            this.matchResult = matchResult;
            this.description = description;
        }

        @Override
        public boolean matches(Object item) {
            return matchResult;
        }

        @Override
        public void describeTo(Description desc) {
            desc.appendText(description);
        }
    }
}