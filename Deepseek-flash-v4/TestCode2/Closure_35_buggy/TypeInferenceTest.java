package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Before;
import org.junit.Test;

public class TypeInferenceTest {

    private TypeInference inference;

    @Before
    public void setUp() throws Exception {
        Compiler compiler = new Compiler();
        Constructor<?> constructor = TypeInference.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);

        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] args = new Object[parameterTypes.length];
        Object registry = compiler.getTypeRegistry();

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isInstance(compiler)) {
                args[i] = compiler;
            } else if (parameterTypes[i].isInstance(registry)) {
                args[i] = registry;
            } else {
                args[i] = null;
            }
        }

        inference = (TypeInference) constructor.newInstance(args);

        Field bottomScope = TypeInference.class.getDeclaredField("bottomScope");
        bottomScope.setAccessible(true);
        bottomScope.set(inference, null);
    }

    @Test
    public void testFlowThroughWithNullInput() {
        assertNull(inference.flowThrough(null, null));
    }

    @Test
    public void testFlowThroughIgnoresNodeForBottomScope() {
        assertNull(inference.flowThrough(new Node(Token.EMPTY), null));
    }

    @Test
    public void testFlowThroughWithNonNullInputCreatesChildScope() {
        FlowScope input = createFlowScope();

        FlowScope result = inference.flowThrough(new Node(Token.EMPTY), input);

        assertNotNull(result);
        assertNotSame("A new flow scope should be created", input, result);
    }

    @Test(expected = NullPointerException.class)
    public void testFlowThroughWithNullNodeThrowsNpe() {
        inference.flowThrough(null, createFlowScope());
    }

    @Test(expected = NullPointerException.class)
    public void testBranchedFlowThroughWithNonNullInputThrowsNpe() {
        inference.branchedFlowThrough(new Node(Token.EMPTY), createFlowScope());
    }

    @Test(expected = NullPointerException.class)
    public void testBranchedFlowThroughWithNullInputThrowsNpe() {
        inference.branchedFlowThrough(new Node(Token.EMPTY), null);
    }

    private FlowScope createFlowScope() {
        return (FlowScope) Proxy.newProxyInstance(
                FlowScope.class.getClassLoader(),
                new Class<?>[]{FlowScope.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) {
                        String name = method.getName();

                        if ("createChildFlowScope".equals(name)) {
                            return createFlowScope();
                        }

                        if ("equals".equals(name)) {
                            return proxy == args[0];
                        }

                        if ("hashCode".equals(name)) {
                            return System.identityHashCode(proxy);
                        }

                        if ("toString".equals(name)) {
                            return "FlowScope";
                        }

                        Class<?> returnType = method.getReturnType();

                        if (returnType == boolean.class) {
                            return false;
                        }

                        if (returnType == int.class) {
                            return 0;
                        }

                        if (returnType == long.class) {
                            return 0L;
                        }

                        if (returnType == double.class) {
                            return 0.0d;
                        }

                        if (returnType == float.class) {
                            return 0.0f;
                        }

                        if (returnType == short.class) {
                            return (short) 0;
                        }

                        if (returnType == byte.class) {
                            return (byte) 0;
                        }

                        if (returnType == char.class) {
                            return (char) 0;
                        }

                        return null;
                    }
                });
    }
}