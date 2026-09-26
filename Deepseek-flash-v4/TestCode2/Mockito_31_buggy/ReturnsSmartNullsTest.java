package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ReturnsSmartNullsTest {

    public interface Child {
        String getName();
    }

    public static final class FinalType {
    }

    public interface ReturnTypes {
        int primitiveValue();
        FinalType finalTypeValue();
        Child childValue();
    }

    private final ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();

    @Test
    public void answerReturnsDefaultValueForPrimitive() throws Throwable {
        Object result = returnsSmartNulls.answer(
                invocationForMethod(ReturnTypes.class.getMethod("primitiveValue")));

        assertNotNull(result);
        assertEquals(0, result);
    }

    @Test
    public void answerReturnsNullForFinalReturnType() throws Throwable {
        Object result = returnsSmartNulls.answer(
                invocationForMethod(ReturnTypes.class.getMethod("finalTypeValue")));

        assertNull(result);
    }

    @Test
    public void answerReturnsSmartNullForMockableReturnType() throws Throwable {
        Object result = returnsSmartNulls.answer(
                invocationForMethod(ReturnTypes.class.getMethod("childValue")));

        assertNotNull(result);
        assertTrue(result instanceof Child);
    }

    @Test
    public void smartNullToStringMentionsUnstubbedMethod() throws Throwable {
        Object result = returnsSmartNulls.answer(
                invocationForMethod(ReturnTypes.class.getMethod("childValue")));

        assertTrue(result.toString().contains("childValue"));
    }

    @Test(expected = RuntimeException.class)
    public void smartNullThrowsOnNonToStringCall() throws Throwable {
        Object result = returnsSmartNulls.answer(
                invocationForMethod(ReturnTypes.class.getMethod("childValue")));

        ((Child) result).getName();
    }

    private InvocationOnMock invocationForMethod(final Method method) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method m, Object[] args) {
                if (m.getName().equals("getMethod") && m.getParameterTypes().length == 0) {
                    return method;
                }
                if (m.getName().equals("getArguments") && m.getParameterTypes().length == 0) {
                    return new Object[0];
                }
                if (m.getName().equals("isVoid") && m.getParameterTypes().length == 0) {
                    return method.getReturnType() == Void.TYPE;
                }
                if (m.getName().equals("getMock") && m.getParameterTypes().length == 0) {
                    return null;
                }
                if (m.getName().equals("toString") && m.getParameterTypes().length == 0) {
                    return "InvocationStub";
                }
                if (m.getName().equals("hashCode") && m.getParameterTypes().length == 0) {
                    return System.identityHashCode(proxy);
                }
                if (m.getName().equals("equals") && m.getParameterTypes().length == 1) {
                    return proxy == args[0];
                }

                Class<?> returnType = m.getReturnType();
                if (!returnType.isPrimitive()) {
                    return null;
                }
                if (returnType == boolean.class) {
                    return false;
                }
                if (returnType == char.class) {
                    return '\0';
                }
                if (returnType == byte.class) {
                    return (byte) 0;
                }
                if (returnType == short.class) {
                    return (short) 0;
                }
                if (returnType == int.class) {
                    return 0;
                }
                if (returnType == long.class) {
                    return 0L;
                }
                if (returnType == float.class) {
                    return 0.0f;
                }
                if (returnType == double.class) {
                    return 0.0d;
                }
                return null;
            }
        };

        return (InvocationOnMock) Proxy.newProxyInstance(
                InvocationOnMock.class.getClassLoader(),
                new Class<?>[]{InvocationOnMock.class},
                handler);
    }
}