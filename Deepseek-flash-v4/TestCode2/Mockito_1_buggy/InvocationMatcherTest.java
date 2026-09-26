package org.mockito.internal.invocation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.mockito.internal.matchers.CapturesArguments;

@SuppressWarnings({"rawtypes", "unchecked"})
public class InvocationMatcherTest {

    public static class SampleClass {
        public void noop() {
        }

        public void sample(String arg) {
        }

        public void sample(Integer arg) {
        }

        public void sample(CharSequence arg) {
        }

        public void sample(String arg, Integer other) {
        }

        public void other(String arg) {
        }

        public void varargs(String... args) {
        }
    }

    private static class AnyMatcher implements Matcher<Object> {
        private final boolean result;

        AnyMatcher(boolean result) {
            this.result = result;
        }

        @Override
        public boolean matches(Object item) {
            return result;
        }

        @Override
        public void describeMismatch(Object item, Description description) {
        }

        @Override
        public void describeTo(Description description) {
        }
    }

    private static class CapturingMatcher implements Matcher<Object>, CapturesArguments {
        private final List<Object> captured = new ArrayList<Object>();

        @Override
        public void captureFrom(Object argument) {
            captured.add(argument);
        }

        @Override
        public boolean matches(Object item) {
            return true;
        }

        @Override
        public void describeMismatch(Object item, Description description) {
        }

        @Override
        public void describeTo(Description description) {
        }
    }

    @Test
    public void testConstructorUsesProvidedMatchers() throws Exception {
        Method method = method("noop");
        Invocation invocation = newInvocation(method, new Object(), new Object[0], false);

        List<Matcher> matchers = matcherList(new AnyMatcher(true));
        InvocationMatcher matcher = new InvocationMatcher(invocation, matchers);

        assertSame(matchers, matcher.getMatchers());
    }

    @Test
    public void testConstructorConvertsEmptyMatchers() throws Exception {
        Method method = method("noop");
        Invocation invocation = newInvocation(method, new Object(), new Object[0], false);

        InvocationMatcher matcher = new InvocationMatcher(invocation);

        assertNotNull(matcher.getMatchers());
        assertEquals(0, matcher.getMatchers().size());
    }

    @Test
    public void testGetters() throws Exception {
        Method method = method("noop");
        Object mock = new Object();
        Invocation invocation = newInvocation(method, mock, new Object[0], false);

        InvocationMatcher matcher = new InvocationMatcher(invocation);

        assertSame(method, matcher.getMethod());
        assertSame(invocation, matcher.getInvocation());
        assertNotNull(matcher.getMatchers());
    }

    @Test
    public void testMatchesTrueForNoArgMethod() throws Exception {
        Method method = method("noop");
        Object mock = new Object();
        InvocationMatcher matcher = new InvocationMatcher(
                newInvocation(method, mock, new Object[0], false)
        );

        Invocation same = newInvocation(method, mock, new Object[0], false);

        assertTrue(matcher.matches(same));
    }

    @Test
    public void testMatchesFalseWhenMockDiffers() throws Exception {
        Method method = method("noop");
        InvocationMatcher matcher = new InvocationMatcher(
                newInvocation(method, new Object(), new Object[0], false)
        );

        Invocation differentMock = newInvocation(method, new Object(), new Object[0], false);

        assertFalse(matcher.matches(differentMock));
    }

    @Test
    public void testMatchesFalseWhenMethodDiffers() throws Exception {
        Method sample = method("sample", String.class);
        Method other = method("other", String.class);
        Object mock = new Object();

        InvocationMatcher matcher = new InvocationMatcher(
                newInvocation(sample, mock, new Object[]{"x"}, false)
        );

        Invocation differentMethod = newInvocation(other, mock, new Object[]{"x"}, false);

        assertFalse(matcher.matches(differentMethod));
    }

    @Test
    public void testMatchesFalseWhenMatcherDoesNotMatch() throws Exception {
        Method method = method("sample", String.class);
        Object mock = new Object();

        InvocationMatcher matcher = new InvocationMatcher(
                newInvocation(method, mock, new Object[]{"x"}, false),
                matcherList(new AnyMatcher(false))
        );

        Invocation actual = newInvocation(method, mock, new Object[]{"y"}, false);

        assertFalse(matcher.matches(actual));
    }

    @Test(expected = NullPointerException.class)
    public void testMatchesNull() throws Exception {
        Method method = method("noop");
        InvocationMatcher matcher = new InvocationMatcher(
                newInvocation(method, new Object(), new Object[0], false)
        );

        matcher.matches(null);
    }

    @Test
    public void testHasSameMethodTrueForSameMethod() throws Exception {
        Method method = method("sample", String.class);
        Object mock = new Object();

        InvocationMatcher matcher = new InvocationMatcher(
                newInvocation(method, mock, new Object[]{"x"}, false)
        );

        Invocation sameMethod = newInvocation(method, mock, new Object[]{"y"}, false);

        assertTrue(matcher.hasSameMethod(sameMethod));
    }

    @Test
    public void testHasSameMethodFalseForDifferentMethodName() throws Exception {
        Method sample = method("sample", String.class);
        Method other = method("other", String.class);
        Object mock = new Object();

        InvocationMatcher matcher = new InvocationMatcher(
                newInvocation(sample, mock, new Object[]{"x"}, false)
        );

        Invocation differentName = newInvocation(other, mock, new Object[]{"x"}, false);

        assertFalse(matcher.hasSameMethod(differentName));
    }

    @Test
    public void testHasSimilarMethodTrueForSameMethod() throws Exception {
        Method method = method("sample", String.class);
        Object mock = new Object();

        InvocationMatcher matcher = new InvocationMatcher(
                newInvocation(method, mock, new Object[]{"x"}, false)
        );

        Invocation sameMethod = newInvocation(method, mock, new Object[]{"y"}, false);

        assertTrue(matcher.hasSimilarMethod(sameMethod));
    }

    @Test
    public void testHasSimilarMethodFalseForDifferentName() throws Exception {
        Method sample = method("sample", String.class);
        Method other = method("other", String.class);
        Object mock = new Object();

        InvocationMatcher matcher = new InvocationMatcher(
                newInvocation(sample, mock, new Object[]{"x"}, false)
        );

        Invocation differentName = newInvocation(other, mock, new Object[]{"x"}, false);

        assertFalse(matcher.hasSimilarMethod(differentName));
    }

    @Test
    public void testCaptureArgumentsFromNonVarArgs() throws Exception {
        Method method = method("sample", String.class);
        Object mock = new Object();
        Invocation invocation = newInvocation(method, mock, new Object[]{"value"}, false);

        CapturingMatcher capturingMatcher = new CapturingMatcher();
        InvocationMatcher matcher = new InvocationMatcher(
                invocation,
                matcherList(capturingMatcher)
        );

        matcher.captureArgumentsFrom(invocation);

        assertEquals(1, capturingMatcher.captured.size());
        assertEquals("value", capturingMatcher.captured.get(0));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCaptureArgumentsFromVarArgsThrows() throws Exception {
        Method method = method("varargs", String[].class);
        Object mock = new Object();
        Object[] rawArgs = new Object[]{new Object[]{"a", "b"}};
        Invocation invocation = newInvocation(method, mock, rawArgs, rawArgs, false);

        InvocationMatcher matcher = new InvocationMatcher(invocation, matcherList(new AnyMatcher(true)));

        matcher.captureArgumentsFrom(invocation);
    }

    @Test
    public void testCreateFromEmptyList() {
        List<InvocationMatcher> matchers = InvocationMatcher.createFrom(
                Collections.<Invocation>emptyList()
        );

        assertNotNull(matchers);
        assertTrue(matchers.isEmpty());
    }

    @Test
    public void testCreateFromList() throws Exception {
        Method firstMethod = method("noop");
        Method secondMethod = method("sample", String.class);
        Object mock = new Object();

        Invocation first = newInvocation(firstMethod, mock, new Object[0], false);
        Invocation second = newInvocation(secondMethod, mock, new Object[]{"x"}, false);

        List<InvocationMatcher> matchers = InvocationMatcher.createFrom(
                Arrays.asList(first, second)
        );

        assertEquals(2, matchers.size());
        assertSame(first, matchers.get(0).getInvocation());
        assertSame(second, matchers.get(1).getInvocation());
    }

    @Test
    public void testToStringDoesNotThrow() throws Exception {
        Method method = method("noop");
        InvocationMatcher matcher = new InvocationMatcher(
                newInvocation(method, new Object(), new Object[0], false)
        );

        assertNotNull(matcher.toString());
    }

    private static Method method(String name, Class<?>... parameterTypes) throws Exception {
        return SampleClass.class.getMethod(name, parameterTypes);
    }

    private static List<Matcher> matcherList(Matcher... matchers) {
        List<Matcher> result = new ArrayList<Matcher>();
        Collections.addAll(result, matchers);
        return result;
    }

    private static Invocation newInvocation(
            final Method method,
            final Object mock,
            final Object[] arguments,
            final boolean verified) {
        return newInvocation(method, mock, arguments, arguments, verified);
    }

    private static Invocation newInvocation(
            final Method method,
            final Object mock,
            final Object[] arguments,
            final Object[] rawArguments,
            final boolean verified) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method m, Object[] args) {
                String name = m.getName();

                if ("getMethod".equals(name)) {
                    return method;
                }
                if ("getMock".equals(name)) {
                    return mock;
                }
                if ("getArguments".equals(name)) {
                    return arguments;
                }
                if ("getRawArguments".equals(name)) {
                    return rawArguments;
                }
                if ("isVerified".equals(name)) {
                    return verified;
                }
                if ("getArgumentAt".equals(name)) {
                    return rawArguments[((Integer) args[0]).intValue()];
                }
                if ("toString".equals(name)) {
                    return "InvocationMatcherTest.Invocation";
                }
                return null;
            }
        };

        return (Invocation) Proxy.newProxyInstance(
                InvocationMatcherTest.class.getClassLoader(),
                new Class<?>[]{Invocation.class},
                handler
        );
    }
}