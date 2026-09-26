package org.mockito.internal.matchers;

import org.junit.Test;
import org.junit.Before;
import org.mockito.ArgumentMatcher;
import org.hamcrest.Description;
import static org.junit.Assert.*;

public class SameTest {
    private Same sameMatcher;
    private Object wantedObject;
    private String wantedString;
    private Character wantedChar;
    private Description description;

    @Before
    public void setUp() {
        wantedObject = new Object();
        wantedString = "test";
        wantedChar = 'a';
        description = new Description() {
            private StringBuilder text = new StringBuilder();
            public void appendText(String s) { text.append(s); }
            public void appendDescriptionOf(org.hamcrest.SelfDescribing selfDescribing) {}
            public String toString() { return text.toString(); }
        };
    }

    @Test
    public void testMatchesWithSameReference() {
        sameMatcher = new Same(wantedObject);
        assertTrue(sameMatcher.matches(wantedObject));
    }

    @Test
    public void testMatchesWithDifferentObject() {
        sameMatcher = new Same(wantedObject);
        assertFalse(sameMatcher.matches(new Object()));
    }

    @Test
    public void testMatchesWithNullActual() {
        sameMatcher = new Same(wantedObject);
        assertFalse(sameMatcher.matches(null));
    }

    @Test
    public void testMatchesWithNullWanted() {
        sameMatcher = new Same(null);
        assertTrue(sameMatcher.matches(null));
    }

    @Test
    public void testMatchesWithNullWantedAndNonNullActual() {
        sameMatcher = new Same(null);
        assertFalse(sameMatcher.matches(wantedObject));
    }

    @Test
    public void testDescribeToString() {
        sameMatcher = new Same(wantedString);
        sameMatcher.describeTo(description);
        assertEquals("same(\"test\")", description.toString());
    }

    @Test
    public void testDescribeToChar() {
        sameMatcher = new Same(wantedChar);
        sameMatcher.describeTo(description);
        assertEquals("same('a')", description.toString());
    }

    @Test
    public void testDescribeToObject() {
        sameMatcher = new Same(wantedObject);
        sameMatcher.describeTo(description);
        assertEquals("same(" + wantedObject.toString() + ")", description.toString());
    }

    @Test
    public void testDescribeToNull() {
        sameMatcher = new Same(null);
        sameMatcher.describeTo(description);
        assertEquals("same(null)", description.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testDescribeToNullWantedToString() {
        sameMatcher = new Same(null);
        sameMatcher.describeTo(description);
    }

    @Test
    public void testMatchesWithSameStringReference() {
        String s = "hello";
        sameMatcher = new Same(s);
        assertTrue(sameMatcher.matches(s));
    }
}