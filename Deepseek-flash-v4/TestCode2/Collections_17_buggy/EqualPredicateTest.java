package org.apache.commons.collections.functors;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.functors.EqualPredicate;
import org.apache.commons.collections.functors.NullPredicate;

public class EqualPredicateTest {

    private static final String TEST_STRING = "test";
    private static final String DIFFERENT_STRING = "different";

    @Test
    public void testEqualPredicateFactoryNonNull() {
        Predicate<String> pred = EqualPredicate.equalPredicate(TEST_STRING);
        assertNotNull("Predicate should not be null", pred);
        assertTrue("Predicate should be instance of EqualPredicate", pred instanceof EqualPredicate);
    }

    @Test
    public void testEqualPredicateFactoryNull() {
        Predicate<String> pred = EqualPredicate.equalPredicate(null);
        assertNotNull("Predicate should not be null", pred);
        assertTrue("Predicate should be instance of NullPredicate", pred instanceof NullPredicate);
    }

    @Test
    public void testEqualPredicateFactoryWithEquatorNonNull() {
        Equator<String> equator = new DefaultEquator<String>();
        Predicate<String> pred = EqualPredicate.equalPredicate(TEST_STRING, equator);
        assertNotNull("Predicate should not be null", pred);
        assertTrue("Predicate should be instance of EqualPredicate", pred instanceof EqualPredicate);
    }

    @Test
    public void testEqualPredicateFactoryWithEquatorNull() {
        Equator<String> equator = new DefaultEquator<String>();
        Predicate<String> pred = EqualPredicate.equalPredicate(null, equator);
        assertNotNull("Predicate should not be null", pred);
        assertTrue("Predicate should be instance of NullPredicate", pred instanceof NullPredicate);
    }

    @Test
    public void testEvaluateEqualObjects() {
        EqualPredicate<String> pred = new EqualPredicate<String>(TEST_STRING);
        assertTrue("evaluate should return true for equal objects", pred.evaluate(TEST_STRING));
    }

    @Test
    public void testEvaluateDifferentObjects() {
        EqualPredicate<String> pred = new EqualPredicate<String>(TEST_STRING);
        assertFalse("evaluate should return false for different objects", pred.evaluate(DIFFERENT_STRING));
    }

    @Test
    public void testEvaluateNullInput() {
        EqualPredicate<String> pred = new EqualPredicate<String>(TEST_STRING);
        assertFalse("evaluate should return false for null input", pred.evaluate(null));
    }

    @Test
    public void testEvaluateWithEquatorEqualObjects() {
        Equator<String> equator = new DefaultEquator<String>();
        EqualPredicate<String> pred = new EqualPredicate<String>(TEST_STRING, equator);
        assertTrue("evaluate should return true for equal objects with equator", pred.evaluate(TEST_STRING));
    }

    @Test
    public void testEvaluateWithEquatorDifferentObjects() {
        Equator<String> equator = new DefaultEquator<String>();
        EqualPredicate<String> pred = new EqualPredicate<String>(TEST_STRING, equator);
        assertFalse("evaluate should return false for different objects with equator", pred.evaluate(DIFFERENT_STRING));
    }

    @Test
    public void testEvaluateWithEquatorNullInput() {
        Equator<String> equator = new DefaultEquator<String>();
        EqualPredicate<String> pred = new EqualPredicate<String>(TEST_STRING, equator);
        assertFalse("evaluate should return false for null input with equator", pred.evaluate(null));
    }

    @Test
    public void testGetValue() {
        EqualPredicate<String> pred = new EqualPredicate<String>(TEST_STRING);
        assertEquals("getValue should return the stored value", TEST_STRING, pred.getValue());
    }

    @Test
    public void testGetValueWithEquator() {
        Equator<String> equator = new DefaultEquator<String>();
        EqualPredicate<String> pred = new EqualPredicate<String>(TEST_STRING, equator);
        assertEquals("getValue should return the stored value with equator", TEST_STRING, pred.getValue());
    }

    @Test
    public void testEvaluateWithCustomEquatorReturnsTrue() {
        Equator<String> alwaysTrueEquator = new Equator<String>() {
            @Override
            public boolean equate(String o1, String o2) {
                return true;
            }
        };
        EqualPredicate<String> pred = new EqualPredicate<String>(TEST_STRING, alwaysTrueEquator);
        assertTrue("evaluate should return true based on custom equator", pred.evaluate(DIFFERENT_STRING));
    }

    @Test
    public void testEvaluateWithCustomEquatorReturnsFalse() {
        Equator<String> alwaysFalseEquator = new Equator<String>() {
            @Override
            public boolean equate(String o1, String o2) {
                return false;
            }
        };
        EqualPredicate<String> pred = new EqualPredicate<String>(TEST_STRING, alwaysFalseEquator);
        assertFalse("evaluate should return false based on custom equator", pred.evaluate(TEST_STRING));
    }

    @Test
    public void testEqualPredicateFactoryWithNullAndEquatorReturnsNullPredicate() {
        Predicate<String> pred = EqualPredicate.equalPredicate(null, new DefaultEquator<String>());
        assertNotNull("Predicate should not be null", pred);
        assertTrue("Predicate should be NullPredicate", pred instanceof NullPredicate);
    }

    @Test
    public void testConstructorUsingDefaultEquator() {
        EqualPredicate<String> pred = new EqualPredicate<String>(TEST_STRING);
        assertTrue("evaluate should work with default equator", pred.evaluate(TEST_STRING));
    }

    @Test
    public void testEvaluateSameReference() {
        String sameRef = TEST_STRING;
        EqualPredicate<String> pred = new EqualPredicate<String>(TEST_STRING);
        assertTrue("evaluate should return true for same reference", pred.evaluate(sameRef));
    }

    @Test
    public void testEvaluateIntegerObjects() {
        EqualPredicate<Integer> pred = new EqualPredicate<Integer>(5);
        assertTrue("evaluate should return true for equal integers", pred.evaluate(5));
        assertFalse("evaluate should return false for different integers", pred.evaluate(10));
    }

    @Test(expected = NullPointerException.class)
    public void testEvaluateWithNullEquator() {
        EqualPredicate<String> pred = new EqualPredicate<String>(TEST_STRING, null);
        pred.evaluate(TEST_STRING);
    }

    @Test
    public void testGetValueForIntegerPredicate() {
        EqualPredicate<Integer> pred = new EqualPredicate<Integer>(42);
        assertEquals("getValue should return 42", Integer.valueOf(42), pred.getValue());
    }
}