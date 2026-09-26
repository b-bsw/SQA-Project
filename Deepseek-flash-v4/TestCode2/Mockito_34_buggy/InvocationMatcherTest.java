package org.mockito.internal.invocation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.CapturesArguments;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;

public class InvocationMatcherTest {

    private Invocation mockInvocation;
    private InvocationMatcher matcher;
    private Method someMethod;

    @Before
    public void setUp() throws Exception {
        mockInvocation = new MockInvocation(new Object(), "toString", new Object[]{});
        someMethod = Object.class.getMethod("toString");
        matcher = new InvocationMatcher(mockInvocation);
    }

    @Test
    public void testConstructorWithEmptyMatchersUsesInvocationMatchers() {
        Invocation inv = new MockInvocation(new Object(), "toString", new Object[]{});
        InvocationMatcher im = new InvocationMatcher(inv);
        assertEquals(0, im.getMatchers().size());
    }

    @Test
    public void testConstructorWithNonEmptyMatchersUsesProvidedMatchers() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new MockMatcher());
        Invocation inv = new MockInvocation(new Object(), "toString", new Object[]{});
        InvocationMatcher im = new InvocationMatcher(inv, matchers);
        assertSame(matchers, im.getMatchers());
    }

    @Test
    public void testGetMethod() {
        assertEquals(someMethod, matcher.getMethod());
    }

    @Test
    public void testGetInvocation() {
        assertSame(mockInvocation, matcher.getInvocation());
    }

    @Test
    public void testGetMatchersDefaultEmpty() {
        assertNotNull(matcher.getMatchers());
        assertTrue(matcher.getMatchers().isEmpty());
    }

    @Test
    public void testMatchesSameMockAndMethodAndArguments() {
        Invocation actual = new MockInvocation(matcher.getInvocation().getMock(), "toString", new Object[]{});
        assertTrue(matcher.matches(actual));
    }

    @Test
    public void testMatchesDifferentMockReturnsFalse() {
        Invocation actual = new MockInvocation(new Object(), "toString", new Object[]{});
        assertFalse(matcher.matches(actual));
    }

    @Test
    public void testMatchesDifferentMethodReturnsFalse() {
        Invocation actual = new MockInvocation(matcher.getInvocation().getMock(), "hashCode", new Object[]{});
        assertFalse(matcher.matches(actual));
    }

    @Test
    public void testHasSimilarMethodSameMethodNameSameMockUnverified() {
        Invocation candidate = new MockInvocation(matcher.getInvocation().getMock(), "toString", new Object[]{});
        assertTrue(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethodDifferentMethodNameReturnsFalse() {
        Invocation candidate = new MockInvocation(matcher.getInvocation().getMock(), "hashCode", new Object[]{});
        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethodVerifiedCandidateReturnsFalse() {
        Invocation candidate = new MockInvocation(matcher.getInvocation().getMock(), "toString", new Object[]{}, true);
        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethodDifferentMockReturnsFalse() {
        Invocation candidate = new MockInvocation(new Object(), "toString", new Object[]{});
        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSameMethodSameMethod() {
        Invocation candidate = new MockInvocation(new Object(), "toString", new Object[]{});
        assertFalse(matcher.hasSameMethod(candidate));
    }

    @Test
    public void testHasSameMethodDifferentMethod() {
        Invocation candidate = new MockInvocation(new Object(), "hashCode", new Object[]{});
        assertFalse(matcher.hasSameMethod(candidate));
    }

    @Test
    public void testToString() {
        assertNotNull(matcher.toString());
    }

    @Test
    public void testCaptureArgumentsFrom() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        CapturesArgumentsMatcher cam = new CapturesArgumentsMatcher();
        matchers.add(cam);
        Invocation testInvocation = new MockInvocation(new Object(), "toString", new Object[]{"arg1"});
        InvocationMatcher im = new InvocationMatcher(testInvocation, matchers);
        im.captureArgumentsFrom(testInvocation);
        assertTrue(cam.captured);
    }

    @Test
    public void testCaptureArgumentsFromNonCapturingMatcher() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        MockMatcher mm = new MockMatcher();
        matchers.add(mm);
        Invocation testInvocation = new MockInvocation(new Object(), "toString", new Object[]{"arg1"});
        InvocationMatcher im = new InvocationMatcher(testInvocation, matchers);
        im.captureArgumentsFrom(testInvocation);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testCaptureArgumentsFromIndexOutOfBounds() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        CapturesArgumentsMatcher cam = new CapturesArgumentsMatcher();
        matchers.add(cam);
        Invocation testInvocation = new MockInvocation(new Object(), "toString", new Object[]{});
        InvocationMatcher im = new InvocationMatcher(testInvocation, matchers);
        im.captureArgumentsFrom(testInvocation);
    }

    @Test
    public void testGetLocation() {
        assertNotNull(matcher.getLocation());
    }

    @Test
    public void testMatchWithSameMethodButDifferentArguments() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new MockMatcher());
        Invocation inv = new MockInvocation(new Object(), "toString", new Object[]{1});
        InvocationMatcher im = new InvocationMatcher(inv, matchers);
        Invocation actual = new MockInvocation(inv.getMock(), "toString", new Object[]{2});
        assertFalse(im.matches(actual));
    }

    @Test
    public void testMatchWithNullArguments() {
        Invocation inv = new MockInvocation(new Object(), "toString", new Object[]{null});
        InvocationMatcher im = new InvocationMatcher(inv);
        Invocation actual = new MockInvocation(inv.getMock(), "toString", new Object[]{null});
        assertTrue(im.matches(actual));
    }

    @Test
    public void testMatchesWhenArgumentsComparatorThrowsException() {
        Invocation inv = new MockInvocation(new Object(), "toString", new Object[]{1});
        InvocationMatcher im = new InvocationMatcher(inv);
        Invocation actual = new MockInvocation(inv.getMock(), "toString", new Object[]{2});
        assertFalse(im.matches(actual));
    }

    static class MockInvocation extends Invocation {
        private final Object mock;
        private final String methodName;
        private final Object[] arguments;
        private final boolean verified;
        private final Location location = new Location();

        public MockInvocation(Object mock, String methodName, Object[] arguments) {
            this(mock, methodName, arguments, false);
        }

        public MockInvocation(Object mock, String methodName, Object[] arguments, boolean verified) {
            this.mock = mock;
            this.methodName = methodName;
            this.arguments = arguments;
            this.verified = verified;
        }

        @Override
        public Object getMock() { return mock; }

        @Override
        public Method getMethod() {
            try {
                return mock.getClass().getMethod(methodName);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public Object[] getArguments() { return arguments; }

        @Override
        public boolean isVerified() { return verified; }

        @Override
        public Location getLocation() { return location; }

        @Override
        public List<Matcher> argumentsToMatchers() {
            return Collections.emptyList();
        }

        @Override
        public String toString(List<Matcher> matchers, PrintSettings printSettings) {
            return "invocation";
        }
    }

    static class MockMatcher implements Matcher {
        @Override
        public boolean matches(Object item) {
            return true;
        }

        @Override
        public void describeTo(org.hamcrest.Description description) {
        }

        @Override
        public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {
        }
    }

    static class CapturesArgumentsMatcher implements Matcher, CapturesArguments {
        boolean captured = false;

        @Override
        public boolean matches(Object item) {
            return true;
        }

        @Override
        public void describeTo(org.hamcrest.Description description) {
        }

        @Override
        public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {
        }

        @Override
        public void captureFrom(Object argument) {
            captured = true;
        }
    }
}