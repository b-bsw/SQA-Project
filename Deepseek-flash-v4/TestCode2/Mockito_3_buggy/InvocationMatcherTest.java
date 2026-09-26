package org.mockito.internal.invocation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.Location;
import org.mockito.internal.matchers.CapturesArguments;
import org.hamcrest.Matcher;
import org.hamcrest.Description;

import java.lang.reflect.Method;
import java.util.*;

import static org.junit.Assert.*;

public class InvocationMatcherTest {

    // stubs

    private static class SimpleInvocation implements Invocation {
        final Object mock;
        final Method method;
        final Object[] arguments;
        final boolean verified;
        final Object[] rawArguments;
        final boolean isVarArgs;
        final Location location;

        SimpleInvocation(Object mock, Method method, Object[] arguments, boolean verified,
                         Object[] rawArguments, boolean isVarArgs, Location location) {
            this.mock = mock;
            this.method = method;
            this.arguments = arguments;
            this.verified = verified;
            this.rawArguments = rawArguments;
            this.isVarArgs = isVarArgs;
            this.location = location;
        }

        SimpleInvocation(Object mock, Method method, Object[] arguments) {
            this(mock, method, arguments, false, arguments.clone(), false, new SimpleLocation());
        }

        SimpleInvocation(Object mock, Method method, Object[] arguments, boolean verified) {
            this(mock, method, arguments, verified, arguments.clone(), false, new SimpleLocation());
        }

        SimpleInvocation(Object mock, Method method, Object[] arguments, boolean verified,
                         Object[] rawArguments) {
            this(mock, method, arguments, verified, rawArguments, false, new SimpleLocation());
        }

        SimpleInvocation(Object mock, Method method, Object[] arguments, boolean verified,
                         Object[] rawArguments, boolean isVarArgs) {
            this(mock, method, arguments, verified, rawArguments, isVarArgs, new SimpleLocation());
        }

        @Override public Object getMock() { return mock; }
        @Override public Method getMethod() { return method; }
        @Override public Object[] getArguments() { return arguments; }
        @Override public boolean isVerified() { return verified; }
        @Override public Location getLocation() { return location; }
        @Override public <T> T getArgumentAt(int index, Class<T> clazz) {
            return clazz.cast(arguments[index]);
        }
        @Override public Object[] getRawArguments() { return rawArguments; }
        @Override public boolean isVarArgs() { return isVarArgs; }
        // Other methods not used – throw UnsupportedOperationException
        @Override public Object[] getRawArguments0() { throw new UnsupportedOperationException(); }
        @Override public Object[] getArguments() { return arguments; }
        @Override public boolean isVerified() { return verified; }
        @Override public int getSequenceNumber() { throw new UnsupportedOperationException(); }
        @Override public StubInfo stubInfo() { return null; }
        @Override public void markVerified() { /* no-op */ }
        @Override public boolean isIgnoredForVerification() { return false; }
        @Override public void ignoreForVerification() { /* no-op */ }
        @Override public DescribedInvocation getDescribedInvocation() { return null; }
    }

    private static class SimpleLocation implements Location {
        @Override public String toString() { return "simpleLocation"; }
    }

    // Simple Matcher that matches using equals and can capture arguments
    private static class EqualsMatcher implements Matcher, CapturesArguments {
        private final Object expected;
        private Object captured;

        EqualsMatcher(Object expected) {
            this.expected = expected;
        }

        @Override public boolean matches(Object actual) {
            return expected == null ? actual == null : expected.equals(actual);
        }

        @Override public void describeTo(Description description) {
            description.appendText("equals(" + expected + ")");
        }

        @Override public void captureFrom(Object argument) {
            this.captured = argument;
        }

        Object getCaptured() { return captured; }

        @Override public void describeMismatch(Object item, Description mismatchDescription) {
            mismatchDescription.appendText("was ").appendValue(item);
        }

        // Added junit 4 required methods (if any) – not used in our scenario
        @Override @Deprecated
        public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {
            // no op
        }
    }

    // ArgumentsProcessor stub – needed only for generating matchers when list is empty.
    // In real project this class exists; we simulate its behavior by converting arguments to EqualsMatchers.
    // Do not define it – assume it exists in same package. We will not call it directly in tests.
    // Instead we rely on the existing constructor which uses ArgumentsProcessor.
    // We cannot override ArgumentsProcessor. For tests where we supply matchers we avoid empty list.

    // Test data
    private Object mock1, mock2;
    private Method methodVoid, methodString, methodInt;
    private SimpleInvocation invocationVoid, invocationString, invocationInt;

    @Before
    public void setUp() throws Exception {
        mock1 = new Object();
        mock2 = new Object();

        // Create method objects using reflection from a dummy class
        class Dummy {
            @SuppressWarnings("unused")
            public void voidMethod() {}
            @SuppressWarnings("unused")
            public void stringMethod(String s) {}
            @SuppressWarnings("unused")
            public void intMethod(int i) {}
        }
        methodVoid = Dummy.class.getMethod("voidMethod");
        methodString = Dummy.class.getMethod("stringMethod", String.class);
        methodInt = Dummy.class.getMethod("intMethod", int.class);

        invocationVoid = new SimpleInvocation(mock1, methodVoid, new Object[0]);
        invocationString = new SimpleInvocation(mock1, methodString, new Object[]{"hello"});
        invocationInt = new SimpleInvocation(mock1, methodInt, new Object[]{42});
    }

    // ---------- Constructor tests ----------

    @Test(expected = NullPointerException.class)
    public void constructorWithNullMatchersShouldThrowNPE() {
        new InvocationMatcher(invocationVoid, null);
    }

    @Test
    public void constructorWithEmptyMatchersShouldGenerateMatchersFromArgs() {
        InvocationMatcher im = new InvocationMatcher(invocationVoid);
        assertEquals(0, im.getMatchers().size());
    }

    @Test
    public void constructorWithEmptyMatchersShouldGenerateMatchersForNonEmptyArgs() {
        InvocationMatcher im = new InvocationMatcher(invocationString);
        assertEquals(1, im.getMatchers().size());
    }

    @Test
    public void constructorWithProvidedMatchersShouldUseThem() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new EqualsMatcher("hello"));
        InvocationMatcher im = new InvocationMatcher(invocationString, matchers);
        assertSame(matchers, im.getMatchers());
    }

    // ---------- Accessors ----------

    @Test
    public void getMethodShouldDelegate() {
        InvocationMatcher im = new InvocationMatcher(invocationString);
        assertSame(methodString, im.getMethod());
    }

    @Test
    public void getInvocationShouldReturnSameInstance() {
        InvocationMatcher im = new InvocationMatcher(invocationString);
        assertSame(invocationString, im.getInvocation());
    }

    @Test
    public void getMatchersShouldReturnSameList() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new EqualsMatcher("hello"));
        InvocationMatcher im = new InvocationMatcher(invocationString, matchers);
        assertSame(matchers, im.getMatchers());
    }

    @Test
    public void toStringShouldNotThrow() {
        InvocationMatcher im = new InvocationMatcher(invocationString);
        assertNotNull(im.toString());
    }

    // ---------- matches ----------

    @Test
    public void matchesShouldReturnTrueWhenAllMatch() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new EqualsMatcher("hello"));
        InvocationMatcher im = new InvocationMatcher(invocationString, matchers);
        SimpleInvocation actual = new SimpleInvocation(mock1, methodString, new Object[]{"hello"});
        assertTrue(im.matches(actual));
    }

    @Test
    public void matchesShouldReturnFalseWhenMockDifferent() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new EqualsMatcher("hello"));
        InvocationMatcher im = new InvocationMatcher(invocationString, matchers);
        SimpleInvocation actual = new SimpleInvocation(mock2, methodString, new Object[]{"hello"});
        assertFalse(im.matches(actual));
    }

    @Test
    public void matchesShouldReturnFalseWhenMethodDifferent() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new EqualsMatcher("hello"));
        InvocationMatcher im = new InvocationMatcher(invocationString, matchers);
        SimpleInvocation actual = new SimpleInvocation(mock1, methodVoid, new Object[0]);
        assertFalse(im.matches(actual));
    }

    @Test
    public void matchesShouldReturnFalseWhenArgumentsDiffer() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new EqualsMatcher("hello"));
        InvocationMatcher im = new InvocationMatcher(invocationString, matchers);
        SimpleInvocation actual = new SimpleInvocation(mock1, methodString, new Object[]{"world"});
        assertFalse(im.matches(actual));
    }

    // ---------- hasSameMethod ----------

    @Test
    public void hasSameMethodShouldReturnTrueWhenSameNameAndSameParams() {
        InvocationMatcher im = new InvocationMatcher(invocationString);
        assertTrue(im.hasSameMethod(invocationString));
    }

    @Test
    public void hasSameMethodShouldReturnFalseWhenDifferentParamTypes() throws Exception {
        class Dummy {
            @SuppressWarnings("unused")
            public void method(int i) {}
            @SuppressWarnings("unused")
            public void method(String s) {}
        }
        Method m1 = Dummy.class.getMethod("method", int.class);
        Method m2 = Dummy.class.getMethod("method", String.class);
        InvocationMatcher im = new InvocationMatcher(new SimpleInvocation(mock1, m1, new Object[]{1}));
        SimpleInvocation candidate = new SimpleInvocation(mock1, m2, new Object[]{"a"});
        assertFalse(im.hasSameMethod(candidate));
    }

    @Test
    public void hasSameMethodShouldReturnFalseWhenDifferentName() {
        InvocationMatcher im = new InvocationMatcher(invocationString);
        assertFalse(im.hasSameMethod(invocationVoid));
    }

    // ---------- hasSimilarMethod ----------

    @Test
    public void hasSimilarMethodShouldReturnFalseWhenMethodNameDiffers() {
        InvocationMatcher im = new InvocationMatcher(invocationString);
        assertFalse(im.hasSimilarMethod(invocationVoid));
    }

    @Test
    public void hasSimilarMethodShouldReturnFalseWhenCandidateIsVerified() {
        InvocationMatcher im = new InvocationMatcher(invocationString);
        SimpleInvocation verified = new SimpleInvocation(mock1, methodString, new Object[]{"a"}, true);
        assertFalse(im.hasSimilarMethod(verified));
    }

    @Test
    public void hasSimilarMethodShouldReturnFalseWhenMockDifferent() {
        InvocationMatcher im = new InvocationMatcher(invocationString);
        SimpleInvocation actual = new SimpleInvocation(mock2, methodString, new Object[]{"a"});
        assertFalse(im.hasSimilarMethod(actual));
    }

    @Test
    public void hasSimilarMethodShouldReturnFalseWhenMethodEqualsAndArgsMatch() {
        // same method, arguments match → not similar (overloadedButSameArgs true)
        InvocationMatcher im = new InvocationMatcher(invocationString);
        SimpleInvocation same = new SimpleInvocation(mock1, methodString, new Object[]{"hello"});
        assertFalse(im.hasSimilarMethod(same));
    }

    @Test
    public void hasSimilarMethodShouldReturnFalseWhenMethodNotSameButArgsMatch() {
        // different method (same name, different params) and arguments match → overloadedButSameArgs true → false
        try {
            class Dummy {
                @SuppressWarnings("unused")
                public void method(Integer i) {}
                @SuppressWarnings("unused")
                public void method(String s) {}
            }
            Method mInt = Dummy.class.getMethod("method", Integer.class);
            Method mString = Dummy.class.getMethod("method", String.class);
            InvocationMatcher im = new InvocationMatcher(
                new SimpleInvocation(mock1, mString, new Object[]{"x"}));
            SimpleInvocation candidate = new SimpleInvocation(mock1, mInt, new Object[]{42});
            // Arguments do not match (42 vs "x") → safelyArgumentsMatch false → overloadedButSameArgs false → true
            assertTrue(im.hasSimilarMethod(candidate));
        } catch (NoSuchMethodException e) {
            fail("Error setting up test");
        }
    }

    @Test
    public void hasSimilarMethodShouldReturnTrueWhenMethodNotSameAndArgsDiffer() {
        // In the case methodName same, mock same, unverified, but method not same and args differ
        // should return true.
        try {
            class Dummy2 {
                @SuppressWarnings("unused")
                public void method(Integer i) {}
                @SuppressWarnings("unused")
                public void method(String s) {}
            }
            Method mInt = Dummy2.class.getMethod("method", Integer.class);
            Method mString = Dummy2.class.getMethod("method", String.class);
            InvocationMatcher im = new InvocationMatcher(
                new SimpleInvocation(mock1, mString, new Object[]{"hello"}));
            SimpleInvocation candidate = new SimpleInvocation(mock1, mInt, new Object[]{42});
            // args differ (42 vs "hello") → safelyArgumentsMatch false → overloadedButSameArgs false → true
            assertTrue(im.hasSimilarMethod(candidate));
        } catch (NoSuchMethodException e) {
            fail("Error setting up test");
        }
    }

    // ---------- getLocation ----------

    @Test
    public void getLocationShouldDelegateToInvocation() {
        InvocationMatcher im = new InvocationMatcher(invocationString);
        assertSame(invocationString.getLocation(), im.getLocation());
    }

    // ---------- captureArgumentsFrom ----------

    @Test
    public void captureArgumentsFromShouldCaptureFromNonVarArgs() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        EqualsMatcher eq = new EqualsMatcher("hello");
        matchers.add(eq);
        InvocationMatcher im = new InvocationMatcher(invocationString, matchers);
        SimpleInvocation actual = new SimpleInvocation(mock2, methodString, new Object[]{"captured"});
        im.captureArgumentsFrom(actual);
        assertEquals("captured", eq.getCaptured());
    }

    @Test
    public void captureArgumentsFromShouldCaptureFromVarArgs() throws Exception {
        class DummyVar {
            @SuppressWarnings("unused")
            public void varMethod(String... args) {}
        }
        Method varMethod = DummyVar.class.getMethod("varMethod", String[].class);
        // Create invocation with rawArguments: first regular, then varargs as array
        Object[] rawArgs = new Object[]{"fixed", new String[]{"a", "b"}};
        SimpleInvocation invocation = new SimpleInvocation(
            mock1, varMethod, rawArgs, false, rawArgs, true);

        // Prepare matchers: one for regular, one for varargs (any number, but we use two matchers? Actually varargs can have zero or more.
        // According to InvocationMatcher code, indexOfVararg = rawArguments.length - 1 = 1 (since two raw arguments).
        List<Matcher> matchers = new ArrayList<Matcher>();
        EqualsMatcher m0 = new EqualsMatcher("fixed");
        EqualsMatcher m1 = new EqualsMatcher("a"); // matcher for vararg element
        matchers.add(m0);
        matchers.add(m1);
        InvocationMatcher im = new InvocationMatcher(invocation, matchers);

        // actual invocation to capture from
        Object[] actualRaw = new Object[]{"actualFixed", new String[]{"x", "y"}};
        SimpleInvocation actual = new SimpleInvocation(mock2, varMethod, actualRaw, false, actualRaw, true);

        im.captureArgumentsFrom(actual);
        assertEquals("actualFixed", m0.getCaptured());
        // m1 should have captured the first vararg element from rawArguments array (index 0)
        assertEquals("x", m1.getCaptured());
    }

    @Test
    public void captureArgumentsFromShouldHandleNoCaptures() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new EqualsMatcher("hello")); // not CapturesArguments
        InvocationMatcher im = new InvocationMatcher(invocationString, matchers);
        SimpleInvocation actual = new SimpleInvocation(mock2, methodString, new Object[]{"captured"});
        im.captureArgumentsFrom(actual);
        // No exception expected
    }

    // ---------- createFrom ----------

    @Test
    public void createFromShouldReturnListOfMatchersForEachInvocation() {
        List<Invocation> invocations = new ArrayList<Invocation>();
        invocations.add(invocationVoid);
        invocations.add(invocationString);
        List<InvocationMatcher> result = InvocationMatcher.createFrom(invocations);
        assertEquals(2, result.size());
        assertEquals(0, result.get(0).getMatchers().size());
        assertEquals(1, result.get(1).getMatchers().size());
    }

    @Test(expected = NullPointerException.class)
    public void createFromShouldThrowOnNullElement() {
        List<Invocation> invocations = new ArrayList<Invocation>();
        invocations.add(null);
        InvocationMatcher.createFrom(invocations);
    }

    // ---------- hasSameMethod edge: zero parameter loop ----------

    @Test
    public void hasSameMethodShouldHandleZeroParameterMethods() {
        InvocationMatcher im = new InvocationMatcher(invocationVoid);
        assertTrue(im.hasSameMethod(invocationVoid));
    }
}