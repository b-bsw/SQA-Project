package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Method;
import java.util.*;
import org.mockito.mock.MockName;
import org.mockito.mock.MockSettings;
import org.mockito.internal.util.MockUtil;
import org.mockito.invocation.InvocationOnMock;

import static org.junit.Assert.*;

public class ReturnsEmptyValuesTest {

    private ReturnsEmptyValues answer;

    @Before
    public void setUp() {
        answer = new ReturnsEmptyValues();
    }

    // --- Helper inner classes ---

    static class SimpleInvocation implements InvocationOnMock {
        private final Object mock;
        private final Method method;
        private final Object[] arguments;

        SimpleInvocation(Object mock, Method method, Object... args) {
            this.mock = mock;
            this.method = method;
            this.arguments = args;
        }

        @Override
        public Object getMock() { return mock; }

        @Override
        public Method getMethod() { return method; }

        @Override
        public Object[] getArguments() { return arguments; }
    }

    static class StubMockName implements MockName {
        private final boolean defaultName;
        private final String name;

        StubMockName(boolean defaultName, String name) {
            this.defaultName = defaultName;
            this.name = name;
        }

        @Override
        public boolean isDefault() { return defaultName; }

        @Override
        public String toString() { return name; }
    }

    static class StubMockSettings implements MockSettings {
        private final Class<?> typeToMock;

        StubMockSettings(Class<?> typeToMock) {
            this.typeToMock = typeToMock;
        }

        @Override
        public Class<?> getTypeToMock() { return typeToMock; }

        @Override public MockSettings defaultAnswer(org.mockito.stubbing.Answer answer) { return this; }
        @Override public MockSettings extraInterfaces(Class<?>... interfaces) { return this; }
        @Override public MockSettings name(String name) { return this; }
        @Override public MockSettings serializable() { return this; }
        @Override public MockSettings stubOnly() { return this; }
        @Override public MockSettings verboseLogging() { return this; }
        @Override public MockSettings useConstructor() { return this; }
    }

    static class StubMockUtil extends MockUtil {
        private final MockName name;
        private final MockSettings settings;

        StubMockUtil(MockName name, MockSettings settings) {
            this.name = name;
            this.settings = settings;
        }

        @Override
        public MockName getMockName(Object mock) {
            return name;
        }

        @Override
        public MockSettings getMockSettings(Object mock) {
            return settings;
        }
    }

    // Helper to inject custom mockUtil
    private void setMockUtil(MockUtil mockUtil) {
        answer.mockUtil = mockUtil;
    }

    // --- Dummy methods for testing ---
    public int dummyIntMethod() { return 0; }
    public boolean dummyBooleanMethod() { return false; }
    public String dummyStringMethod() { return null; }

    static class MethodsHolder {
        public Collection collectionMethod() { return null; }
        public Set setMethod() { return null; }
        public Map mapMethod() { return null; }
    }

    // ========== Tests for returnValueFor ==========

    @Test
    public void returnValueFor_primitiveOrWrapper_returnsDefaultValue() {
        assertEquals(0, answer.returnValueFor(int.class));
        assertEquals(0, answer.returnValueFor(Integer.class));
        assertEquals(false, answer.returnValueFor(boolean.class));
        assertEquals(false, answer.returnValueFor(Boolean.class));
        assertEquals(0.0, answer.returnValueFor(double.class));
        assertEquals(0.0, answer.returnValueFor(Double.class));
    }

    @Test
    public void returnValueFor_collectionTypes_returnsEmptyCollection() {
        assertTrue(answer.returnValueFor(Collection.class) instanceof LinkedList);
        assertTrue(answer.returnValueFor(Set.class) instanceof HashSet);
        assertTrue(answer.returnValueFor(HashSet.class) instanceof HashSet);
        assertTrue(answer.returnValueFor(SortedSet.class) instanceof TreeSet);
        assertTrue(answer.returnValueFor(TreeSet.class) instanceof TreeSet);
        assertTrue(answer.returnValueFor(LinkedHashSet.class) instanceof LinkedHashSet);
        assertTrue(answer.returnValueFor(List.class) instanceof LinkedList);
        assertTrue(answer.returnValueFor(LinkedList.class) instanceof LinkedList);
        assertTrue(answer.returnValueFor(ArrayList.class) instanceof ArrayList);
    }

    @Test
    public void returnValueFor_mapTypes_returnsEmptyMap() {
        assertTrue(answer.returnValueFor(Map.class) instanceof HashMap);
        assertTrue(answer.returnValueFor(HashMap.class) instanceof HashMap);
        assertTrue(answer.returnValueFor(SortedMap.class) instanceof TreeMap);
        assertTrue(answer.returnValueFor(TreeMap.class) instanceof TreeMap);
        assertTrue(answer.returnValueFor(LinkedHashMap.class) instanceof LinkedHashMap);
    }

    @Test
    public void returnValueFor_unknownType_returnsNull() {
        assertNull(answer.returnValueFor(String.class));
        assertNull(answer.returnValueFor(Object.class));
        assertNull(answer.returnValueFor(Random.class));
    }

    // ========== Tests for answer ==========

    @Test
    public void answer_toStringMethod_withDefaultName_returnsMockDescription() throws Exception {
        Method toStringMethod = Object.class.getMethod("toString");
        Object mock = new Object();
        MockName mockName = new StubMockName(true, null);
        MockSettings mockSettings = new StubMockSettings(Object.class);
        MockUtil mockUtil = new StubMockUtil(mockName, mockSettings);
        setMockUtil(mockUtil);
        SimpleInvocation invocation = new SimpleInvocation(mock, toStringMethod);
        String result = (String) answer.answer(invocation);
        String expected = "Mock for Object, hashCode: " + mock.hashCode();
        assertEquals(expected, result);
    }

    @Test
    public void answer_toStringMethod_withCustomName_returnsName() throws Exception {
        Method toStringMethod = Object.class.getMethod("toString");
        Object mock = new Object();
        MockName mockName = new StubMockName(false, "myMock");
        MockSettings mockSettings = new StubMockSettings(null);
        MockUtil mockUtil = new StubMockUtil(mockName, mockSettings);
        setMockUtil(mockUtil);
        SimpleInvocation invocation = new SimpleInvocation(mock, toStringMethod);
        String result = (String) answer.answer(invocation);
        assertEquals("myMock", result);
    }

    @Test
    public void answer_compareToMethod_returnsOne() throws Exception {
        Method compareToMethod = Comparable.class.getMethod("compareTo", Object.class);
        Object mock = new Object();
        SimpleInvocation invocation = new SimpleInvocation(mock, compareToMethod, "other");
        Object result = answer.answer(invocation);
        assertEquals(1, result);
    }

    @Test
    public void answer_otherMethod_withPrimitiveReturnType_returnsDefault() throws Exception {
        Method intMethod = getClass().getMethod("dummyIntMethod");
        Object mock = new Object();
        SimpleInvocation invocation = new SimpleInvocation(mock, intMethod);
        Object result = answer.answer(invocation);
        assertEquals(0, result);
    }

    @Test
    public void answer_otherMethod_withCollectionReturnType_returnsLinkedList() throws Exception {
        Method method = MethodsHolder.class.getMethod("collectionMethod");
        Object mock = new Object();
        SimpleInvocation invocation = new SimpleInvocation(mock, method);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof LinkedList);
    }

    @Test
    public void answer_otherMethod_withSetReturnType_returnsHashSet() throws Exception {
        Method method = MethodsHolder.class.getMethod("setMethod");
        Object mock = new Object();
        SimpleInvocation invocation = new SimpleInvocation(mock, method);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof HashSet);
    }

    @Test
    public void answer_otherMethod_withMapReturnType_returnsHashMap() throws Exception {
        Method method = MethodsHolder.class.getMethod("mapMethod");
        Object mock = new Object();
        SimpleInvocation invocation = new SimpleInvocation(mock, method);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof HashMap);
    }

    @Test
    public void answer_otherMethod_withUnknownReturnType_returnsNull() throws Exception {
        Method stringMethod = getClass().getMethod("dummyStringMethod");
        Object mock = new Object();
        SimpleInvocation invocation = new SimpleInvocation(mock, stringMethod);
        Object result = answer.answer(invocation);
        assertNull(result);
    }
}