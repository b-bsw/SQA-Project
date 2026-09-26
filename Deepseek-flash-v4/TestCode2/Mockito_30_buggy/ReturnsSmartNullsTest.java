package org.mockito.internal.stubbing.defaultanswers;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ReturnsSmartNullsTest {

    private ReturnsSmartNulls returnsSmartNulls;

    @Before
    public void setUp() {
        returnsSmartNulls = new ReturnsSmartNulls();
    }

    private void setDelegate(final Object delegateReturnValue) throws Exception {
        Field delegateField = ReturnsSmartNulls.class.getDeclaredField("delegate");
        delegateField.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(delegateField, delegateField.getModifiers() & ~Modifier.FINAL);

        delegateField.set(returnsSmartNulls, new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return delegateReturnValue;
            }
        });
    }

    private InvocationOnMock mockInvocation(final Method methodToStub, final Object... args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] invocationArgs) throws Throwable {
                if ("getMethod".equals(method.getName())) {
                    return methodToStub;
                }
                if ("getArguments".equals(method.getName())) {
                    return args;
                }
                if ("toString".equals(method.getName())) {
                    return "MockInvocation";
                }
                if ("hashCode".equals(method.getName())) {
                    return System.identityHashCode(proxy);
                }
                if ("equals".equals(method.getName())) {
                    return proxy == invocationArgs[0];
                }
                return null;
            }
        };
        return (InvocationOnMock) Proxy.newProxyInstance(
                InvocationOnMock.class.getClassLoader(),
                new Class<?>[] { InvocationOnMock.class },
                handler);
    }

    @Test
    public void answerReturnsDelegateNonNullValue() throws Throwable {
        setDelegate("hello");
        InvocationOnMock invocation = mockInvocation(String.class.getMethod("toString"));

        assertEquals("hello", returnsSmartNulls.answer(invocation));
    }

    @Test
    public void answerReturnsNullWhenReturnTypeNotMockable() throws Throwable {
        setDelegate(null);

        assertNull(returnsSmartNulls.answer(mockInvocation(String.class.getMethod("toString"))));
        assertNull(returnsSmartNulls.answer(mockInvocation(String.class.getMethod("length"))));
        assertNull(returnsSmartNulls.answer(mockInvocation(Runnable.class.getMethod("run"))));
    }

    @Test
    public void answerReturnsSmartNullWhenReturnTypeMockable() throws Throwable {
        setDelegate(null);
        InvocationOnMock invocation = mockInvocation(
                List.class.getMethod("subList", int.class, int.class), 0, 0);

        Object result = returnsSmartNulls.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof List);
    }

    @Test
    public void smartNullToStringUsesInvocationDetails() throws Throwable {
        setDelegate(null);
        InvocationOnMock invocation = mockInvocation(
                List.class.getMethod("subList", int.class, int.class), 1, 2);

        Object smartNull = returnsSmartNulls.answer(invocation);

        assertNotNull(smartNull);
        assertEquals("SmartNull returned by unstubbed subList(1, 2) method on mock",
                smartNull.toString());
    }

    @Test
    public void smartNullToStringWithEmptyArgs() throws Throwable {
        setDelegate(null);
        InvocationOnMock invocation = mockInvocation(List.class.getMethod("iterator"));

        Object smartNull = returnsSmartNulls.answer(invocation);

        assertNotNull(smartNull);
        assertEquals("SmartNull returned by unstubbed iterator() method on mock",
                smartNull.toString());
    }

    @Test
    public void smartNullNonToStringMethodThrowsRuntimeException() throws Throwable {
        setDelegate(null);
        InvocationOnMock invocation = mockInvocation(
                List.class.getMethod("subList", int.class, int.class), 0, 0);

        Object smartNull = returnsSmartNulls.answer(invocation);

        assertNotNull(smartNull);
        try {
            ((List) smartNull).size();
            fail("Expected RuntimeException from smart null method invocation");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void answerWithNullInvocationThrowsNullPointerException() throws Throwable {
        try {
            returnsSmartNulls.answer(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
}