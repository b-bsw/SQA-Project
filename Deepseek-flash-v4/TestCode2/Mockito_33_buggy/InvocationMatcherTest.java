package org.mockito.internal.invocation;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.hamcrest.Matcher;
import static org.hamcrest.CoreMatchers.*;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.internal.reporting.PrintSettings;
import java.lang.reflect.Method;
import java.util.*;

public class InvocationMatcherTest {

    private Object mockObject;
    private Method testMethod;
    private Method otherMethod;
    private Location location;

    @Before
    public void setUp() throws Exception {
        mockObject = "mMock";
        testMethod = String.class.getMethod("toString");
        otherMethod = String.class.getMethod("length");
        location = new Location();
    }

    private Invocation createInvocation(final Object mock, final Method method,
                                        final Object[] args, final boolean verified) {
        return new Invocation() {
            @Override
            public Object getMock() { return mock; }
            @Override
            public Method getMethod() { return method; }
            @Override
            public Object[] getArguments() { return args; }
            @Override
            public boolean isVerified() { return verified; }
            @Override
            public Location getLocation() { return location; }
            @Override
            public String toString(List<Matcher> matchers, PrintSettings settings) {
                return "stubInvocationString";
            }
            @Override
            public List<Matcher> argumentsToMatchers() {
                return new ArrayList<Matcher>();
            }
        };
    }

    private InvocationMatcher createMatcher(Invocation inv, List<Matcher> mats) {
        return new InvocationMatcher(inv, mats);
    }

    // Constructor tests
    @Test
    public void testConstructorWithEmptyMatchersShouldCallArgumentsToMatchers() {
        List<Matcher> expected = new ArrayList<Matcher>();
        expected.add(equalTo("x"));
        Invocation inv = new Invocation() {
            @Override public Object getMock() { return mockObject; }
            @Override public Method getMethod() { return testMethod; }
            @Override public Object[] getArguments() { return new Object[]{"x"}; }
            @Override public boolean isVerified() { return false; }
            @Override public Location getLocation() { return location; }
            @Override public String toString(List<Matcher> m, PrintSettings s) { return ""; }
            @Override public List<Matcher> argumentsToMatchers() { return expected; }
        };
        InvocationMatcher matcher = new InvocationMatcher(inv, Collections.<Matcher>emptyList());
        assertSame(expected, matcher.getMatchers());
    }

    @Test
    public void testConstructorWithMatchersShouldUseProvidedMatchers() {
        Invocation inv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        List<Matcher> provided = Arrays.asList(equalTo("a"), equalTo("b"));
        InvocationMatcher matcher = new InvocationMatcher(inv, provided);
        assertSame(provided, matcher.getMatchers());
    }

    @Test
    public void testConstructorWithSingleInvocation() {
        Invocation inv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        InvocationMatcher matcher = new InvocationMatcher(inv);
        assertSame(inv, matcher.getInvocation());
        assertTrue(matcher.getMatchers().isEmpty());
    }

    // Getter tests
    @Test
    public void testGetMethod() {
        Invocation inv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        InvocationMatcher matcher = new InvocationMatcher(inv);
        assertEquals(testMethod, matcher.getMethod());
    }

    @Test
    public void testGetInvocation() {
        Invocation inv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        InvocationMatcher matcher = new InvocationMatcher(inv);
        assertSame(inv, matcher.getInvocation());
    }

    @Test
    public void testGetMatchers() {
        List<Matcher> mats = Arrays.asList(equalTo("a"));
        Invocation inv = createInvocation(mockObject, testMethod, new Object[]{"a"}, false);
        InvocationMatcher matcher = new InvocationMatcher(inv, mats);
        assertSame(mats, matcher.getMatchers());
    }

    // toString tests
    @Test
    public void testToString() {
        Invocation inv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        InvocationMatcher matcher = new InvocationMatcher(inv);
        assertEquals("stubInvocationString", matcher.toString());
    }

    @Test
    public void testToStringWithPrintSettings() {
        Invocation inv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        InvocationMatcher matcher = new InvocationMatcher(inv);
        PrintSettings settings = new PrintSettings();
        assertEquals("stubInvocationString", matcher.toString(settings));
    }

    // matches tests
    @Test
    public void testMatchesShouldReturnTrueWhenAllMatch() {
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{"x"}, false);
        List<Matcher> mats = new ArrayList<Matcher>();
        mats.add(equalTo("x"));
        InvocationMatcher matcher = createMatcher(baseInv, mats);
        Invocation actual = createInvocation(mockObject, testMethod, new Object[]{"x"}, false);
        assertTrue(matcher.matches(actual));
    }

    @Test
    public void testMatchesShouldReturnFalseWhenMockNotEqual() {
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{"x"}, false);
        List<Matcher> mats = new ArrayList<Matcher>();
        mats.add(equalTo("x"));
        InvocationMatcher matcher = createMatcher(baseInv, mats);
        Invocation actual = createInvocation(new Object(), testMethod, new Object[]{"x"}, false);
        assertFalse(matcher.matches(actual));
    }

    @Test
    public void testMatchesShouldReturnFalseWhenMethodNotEqual() {
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{"x"}, false);
        List<Matcher> mats = new ArrayList<Matcher>();
        mats.add(equalTo("x"));
        InvocationMatcher matcher = createMatcher(baseInv, mats);
        Invocation actual = createInvocation(mockObject, otherMethod, new Object[]{"x"}, false);
        assertFalse(matcher.matches(actual));
    }

    @Test
    public void testMatchesShouldReturnFalseWhenArgumentsNotMatch() {
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{"x"}, false);
        List<Matcher> mats = new ArrayList<Matcher>();
        mats.add(equalTo("y"));
        InvocationMatcher matcher = createMatcher(baseInv, mats);
        Invocation actual = createInvocation(mockObject, testMethod, new Object[]{"x"}, false);
        assertFalse(matcher.matches(actual));
    }

    // hasSimilarMethod tests
    @Test
    public void testHasSimilarMethodAllConditionsTrue() {
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{"x"}, false);
        List<Matcher> mats = new ArrayList<Matcher>();
        mats.add(equalTo("x"));
        InvocationMatcher matcher = createMatcher(baseInv, mats);
        Invocation candidate = createInvocation(mockObject, testMethod, new Object[]{"x"}, false);
        assertTrue(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethodMethodNameNotEquals() {
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        InvocationMatcher matcher = new InvocationMatcher(baseInv);
        Invocation candidate = createInvocation(mockObject, otherMethod, new Object[]{}, false);
        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethodIsVerified() {
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        InvocationMatcher matcher = new InvocationMatcher(baseInv);
        Invocation candidate = createInvocation(mockObject, testMethod, new Object[]{}, true);
        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethodMockNotSame() {
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        InvocationMatcher matcher = new InvocationMatcher(baseInv);
        Invocation candidate = createInvocation(new Object(), testMethod, new Object[]{}, false);
        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethodOverloadedButSameArgs() {
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{"x"}, false);
        List<Matcher> mats = new ArrayList<Matcher>();
        mats.add(equalTo("x"));
        InvocationMatcher matcher = createMatcher(baseInv, mats);
        Invocation candidate = createInvocation(mockObject, otherMethod, new Object[]{"x"}, false);
        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethodOverloadedButArgsNotMatch() {
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{"x"}, false);
        List<Matcher> mats = new ArrayList<Matcher>();
        mats.add(equalTo("y"));
        InvocationMatcher matcher = createMatcher(baseInv, mats);
        Invocation candidate = createInvocation(mockObject, otherMethod, new Object[]{"x"}, false);
        assertTrue(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethodOverloadedArgsThrowException() {
        // candidate arguments null causes NPE, safelyArgumentsMatch catches and returns false
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        InvocationMatcher matcher = new InvocationMatcher(baseInv);
        Invocation candidate = createInvocation(mockObject, otherMethod, null, false);
        assertTrue(matcher.hasSimilarMethod(candidate));
    }

    // hasSameMethod tests
    @Test
    public void testHasSameMethodWhenMethodsEqual() {
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        InvocationMatcher matcher = new InvocationMatcher(baseInv);
        Invocation candidate = createInvocation(mockObject, testMethod, new Object[]{}, false);
        assertTrue(matcher.hasSameMethod(candidate));
    }

    @Test
    public void testHasSameMethodWhenMethodsNotEqual() {
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        InvocationMatcher matcher = new InvocationMatcher(baseInv);
        Invocation candidate = createInvocation(mockObject, otherMethod, new Object[]{}, false);
        assertFalse(matcher.hasSameMethod(candidate));
    }

    // captureArgumentsFrom tests
    @Test
    public void testCaptureArgumentsFromWithCapturesMatcher() {
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        List<Matcher> mats = new ArrayList<Matcher>();
        final List<Object> captured = new ArrayList<Object>();
        Matcher capturer = new Matcher() {
            @Override
            public boolean matches(Object item) { return false; }
            @Override
            public void describeTo(org.hamcrest.Description d) { d.appendText("captures"); }
            @Override
            public void describeMismatch(Object item, org.hamcrest.Description d) { d.appendText("mismatch"); }
            @Override @Deprecated
            public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {}
        };
        // Cast to CapturesArguments (must implement both)
        CapturesArguments captures = new CapturesArguments() {
            @Override
            public void captureFrom(Object argument) { captured.add(argument); }
        };
        mats.add(new Matcher() {
            @Override public boolean matches(Object o) { return false; }
            @Override public void describeTo(org.hamcrest.Description d) { d.appendText("captures"); }
            @Override public void describeMismatch(Object o, org.hamcrest.Description d) { d.appendText("mismatch"); }
            @Override @Deprecated public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {}
            // anonymous also needs to implement CapturesArguments; we use a combined approach
        });
        // Actually need a proper CapturesMatcher, so use inner class:
        InvocationMatcherTest.CapturesMatcher cm = new CapturesMatcher();
        mats.add(cm);
        mats.add(anything());
        InvocationMatcher matcher = createMatcher(baseInv, mats);
        Invocation actual = createInvocation(mockObject, testMethod, new Object[]{"arg1", "arg2"}, false);
        matcher.captureArgumentsFrom(actual);
        assertEquals(1, cm.captured.size());
        assertEquals("arg1", cm.captured.get(0));
    }

    @Test
    public void testCaptureArgumentsFromShouldNotCaptureWhenIndexOutOfBounds() {
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        List<Matcher> mats = new ArrayList<Matcher>();
        CapturesMatcher cm = new CapturesMatcher();
        mats.add(cm);
        InvocationMatcher matcher = createMatcher(baseInv, mats);
        Invocation actual = createInvocation(mockObject, testMethod, new Object[]{}, false);
        matcher.captureArgumentsFrom(actual);
        assertTrue(cm.captured.isEmpty());
    }

    @Test
    public void testCaptureArgumentsFromShouldNotCaptureForNonCapturesMatcher() {
        Invocation baseInv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        List<Matcher> mats = new ArrayList<Matcher>();
        mats.add(anything());
        InvocationMatcher matcher = createMatcher(baseInv, mats);
        Invocation actual = createInvocation(mockObject, testMethod, new Object[]{"x"}, false);
        matcher.captureArgumentsFrom(actual);
        // no exception, nothing to assert
    }

    // createFrom tests
    @Test
    public void testCreateFromEmptyList() {
        List<Invocation> list = Collections.emptyList();
        List<InvocationMatcher> result = InvocationMatcher.createFrom(list);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testCreateFromMultipleInvocations() {
        Invocation inv1 = createInvocation(mockObject, testMethod, new Object[]{"a"}, false);
        Invocation inv2 = createInvocation(mockObject, testMethod, new Object[]{"b"}, false);
        List<Invocation> list = new LinkedList<Invocation>();
        list.add(inv1);
        list.add(inv2);
        List<InvocationMatcher> result = InvocationMatcher.createFrom(list);
        assertEquals(2, result.size());
        assertSame(inv1, result.get(0).getInvocation());
        assertSame(inv2, result.get(1).getInvocation());
    }

    // getLocation test
    @Test
    public void testGetLocation() {
        Invocation inv = createInvocation(mockObject, testMethod, new Object[]{}, false);
        InvocationMatcher matcher = new InvocationMatcher(inv);
        assertSame(location, matcher.getLocation());
    }

    // Inner helper class for CapturesMatcher
    private static class CapturesMatcher implements Matcher, CapturesArguments {
        final List<Object> captured = new ArrayList<Object>();

        @Override
        public boolean matches(Object item) { return false; }
        @Override
        public void describeTo(org.hamcrest.Description description) {
            description.appendText("CapturesMatcher");
        }
        @Override
        public void describeMismatch(Object item, org.hamcrest.Description mismatchDescription) {
            mismatchDescription.appendText("was ").appendValue(item);
        }
        @Override @Deprecated
        public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {}

        @Override
        public void captureFrom(Object argument) {
            captured.add(argument);
        }
    }
}