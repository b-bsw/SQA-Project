package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.ObjectMethodsGuru;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.mock.MockName;
import org.mockito.mock.MockSettings;

public class ReturnsEmptyValuesTest {

    private ReturnsEmptyValues answer;
    private StubObjectMethodsGuru stubMethodsGuru;
    private StubMockUtil stubMockUtil;

    @Before
    public void setUp() {
        answer = new ReturnsEmptyValues();
        stubMethodsGuru = new StubObjectMethodsGuru();
        stubMockUtil = new StubMockUtil();
        answer.methodsGuru = stubMethodsGuru;
        answer.mockUtil = stubMockUtil;
    }

    // --- toString tests ---

    @Test
    public void testToStringDefaultName() throws Exception {
        Method toStringMethod = Object.class.getMethod("toString");
        stubMethodsGuru.toStringMethod = toStringMethod;

        Object mock = new Object();
        StubMockName mockName = new StubMockName();
        mockName.isDefault = true;
        stubMockUtil.mockNameToReturn = mockName;
        stubMockUtil.mockSettingsToReturn = new StubMockSettings(Object.class);

        InvocationStub invocation = new InvocationStub(toStringMethod, mock, new Object[0]);
        Object result = answer.answer(invocation);

        String expected = "Mock for Object, hashCode: " + System.identityHashCode(mock);
        assertEquals(expected, result);
    }

    @Test
    public void testToStringCustomName() throws Exception {
        Method toStringMethod = Object.class.getMethod("toString");
        stubMethodsGuru.toStringMethod = toStringMethod;

        Object mock = new Object();
        StubMockName mockName = new StubMockName();
        mockName.isDefault = false;
        mockName.name = "MyCustomName";
        stubMockUtil.mockNameToReturn = mockName;
        stubMockUtil.mockSettingsToReturn = new StubMockSettings(Object.class);

        InvocationStub invocation = new InvocationStub(toStringMethod, mock, new Object[0]);
        Object result = answer.answer(invocation);

        assertEquals("MyCustomName", result);
    }

    // --- compareTo tests ---

    @Test
    public void testCompareToSameReference() throws Exception {
        Method compareToMethod = Comparable.class.getMethod("compareTo", Object.class);
        stubMethodsGuru.compareToMethod = compareToMethod;

        Object mock = new Object();

        InvocationStub invocation = new InvocationStub(compareToMethod, mock, new Object[] { mock });
        Object result = answer.answer(invocation);

        assertEquals(0, result);
    }

    @Test
    public void testCompareToDifferentReference() throws Exception {
        Method compareToMethod = Comparable.class.getMethod("compareTo", Object.class);
        stubMethodsGuru.compareToMethod = compareToMethod;

        Object mock = new Object();
        Object other = new Object();

        InvocationStub invocation = new InvocationStub(compareToMethod, mock, new Object[] { other });
        Object result = answer.answer(invocation);

        assertEquals(1, result);
    }

    // --- returnValueFor tests (via answer) ---

    @Test
    public void testPrimitiveIntReturn() throws Exception {
        Method method = getMethodForReturnType(int.class);
        InvocationStub invocation = new InvocationStub(method, new Object(), new Object[0]);
        Object result = answer.answer(invocation);

        assertEquals(0, result);
        assertTrue(result instanceof Integer);
    }

    @Test
    public void testPrimitiveLongReturn() throws Exception {
        Method method = getMethodForReturnType(long.class);
        InvocationStub invocation = new InvocationStub(method, new Object(), new Object[0]);
        Object result = answer.answer(invocation);

        assertEquals(0L, result);
        assertTrue(result instanceof Long);
    }

    @Test
    public void testWrapperIntegerReturn() throws Exception {
        Method method = getMethodForReturnType(Integer.class);
        InvocationStub invocation = new InvocationStub(method, new Object(), new Object[0]);
        Object result = answer.answer(invocation);

        assertEquals(0, result);
        assertTrue(result instanceof Integer);
    }

    @Test
    public void testCollectionReturn() throws Exception {
        Method method = getMethodForReturnType(Collection.class);
        InvocationStub invocation = new InvocationStub(method, new Object(), new Object[0]);
        Object result = answer.answer(invocation);

        assertTrue(result instanceof LinkedList);
    }

    @Test
    public void testSetReturn() throws Exception {
        Method method = getMethodForReturnType(Set.class);
        InvocationStub invocation = new InvocationStub(method, new Object(), new Object[0]);
        Object result = answer.answer(invocation);

        assertTrue(result instanceof HashSet);
    }

    @Test
    public void testListReturn() throws Exception {
        Method method = getMethodForReturnType(List.class);
        InvocationStub invocation = new InvocationStub(method, new Object(), new Object[0]);
        Object result = answer.answer(invocation);

        assertTrue(result instanceof LinkedList);
    }

    @Test
    public void testMapReturn() throws Exception {
        Method method = getMethodForReturnType(Map.class);
        InvocationStub invocation = new InvocationStub(method, new Object(), new Object[0]);
        Object result = answer.answer(invocation);

        assertTrue(result instanceof HashMap);
    }

    @Test
    public void testHashSetExactReturn() throws Exception {
        Method method = getMethodForReturnType(HashSet.class);
        InvocationStub invocation = new InvocationStub(method, new Object(), new Object[0]);
        Object result = answer.answer(invocation);

        assertTrue(result instanceof HashSet);
    }

    @Test
    public void testArrayListExactReturn() throws Exception {
        Method method = getMethodForReturnType(ArrayList.class);
        InvocationStub invocation = new InvocationStub(method, new Object(), new Object[0]);
        Object result = answer.answer(invocation);

        assertTrue(result instanceof ArrayList);
    }

    @Test
    public void testSortedSetReturn() throws Exception {
        Method method = getMethodForReturnType(SortedSet.class);
        InvocationStub invocation = new InvocationStub(method, new Object(), new Object[0]);
        Object result = answer.answer(invocation);

        assertTrue(result instanceof TreeSet);
    }

    @Test
    public void testSortedMapReturn() throws Exception {
        Method method = getMethodForReturnType(SortedMap.class);
        InvocationStub invocation = new InvocationStub(method, new Object(), new Object[0]);
        Object result = answer.answer(invocation);

        assertTrue(result instanceof TreeMap);
    }

    @Test
    public void testLinkedHashSetReturn() throws Exception {
        Method method = getMethodForReturnType(LinkedHashSet.class);
        InvocationStub invocation = new InvocationStub(method, new Object(), new Object[0]);
        Object result = answer.answer(invocation);

        assertTrue(result instanceof LinkedHashSet);
    }

    @Test
    public void testLinkedHashMapReturn() throws Exception {
        Method method = getMethodForReturnType(LinkedHashMap.class);
        InvocationStub invocation = new InvocationStub(method, new Object(), new Object[0]);
        Object result = answer.answer(invocation);

        assertTrue(result instanceof LinkedHashMap);
    }

    @Test
    public void testNullReturnForUnknowntype() throws Exception {
        Method method = getMethodForReturnType(String.class);
        InvocationStub invocation = new InvocationStub(method, new Object(), new Object[0]);
        Object result = answer.answer(invocation);

        assertNull(result);
    }

    // --- inner stubs ---

    private Method getMethodForReturnType(Class<?> returnType) throws Exception {
        // Create a dummy interface with a method returning given type
        return ReturnTypeInterface.class.getMethod("method", (Class<?>[]) null);
    }

    interface ReturnTypeInterface {
        int method();
    }

    static class InvocationStub implements InvocationOnMock {
        private final Method method;
        private final Object mock;
        private final Object[] arguments;

        InvocationStub(Method method, Object mock, Object[] arguments) {
            this.method = method;
            this.mock = mock;
            this.arguments = arguments;
        }

        @Override
        public Method getMethod() {
            return method;
        }

        @Override
        public Object getMock() {
            return mock;
        }

        @Override
        public Object[] getArguments() {
            return arguments;
        }

        // not used; provide minimal implementation
        @Override
        public Object callRealMethod() throws Throwable {
            return null;
        }

        @Override
        public Object getArgument(int index) {
            return arguments[index];
        }

        @Override
        public Object proceed() throws Throwable {
            return null;
        }

        @Override
        public Object getRawArgument(int index) {
            return arguments[index];
        }

        @Override
        public Class<?> getRawReturnType() {
            return method.getReturnType();
        }

        @Override
        public <T> T getArgumentMatcher(int index) {
            return null;
        }

        @Override
        public int getArgumentsCount() {
            return arguments.length;
        }

        @Override
        public boolean hasSameMethod(InvocationOnMock invocation) {
            return false;
        }

        @Override
        public boolean isVerified() {
            return false;
        }

        @Override
        public boolean isIgnoredForVerification() {
            return false;
        }

        @Override
        public Object[] getRawArguments() {
            return arguments;
        }

        @Override
        public long getSequenceNumber() {
            return 0;
        }

        @Override
        public void ignoreForVerification() {}

        @Override
        public Class<?> getJavaClass() {
            return method.getDeclaringClass();
        }

        @Override
        public Object[][] getRawArgumentsForMatchers() {
            return new Object[0][];
        }

        @Override
        public void setVerified() {}
    }

    static class StubObjectMethodsGuru extends ObjectMethodsGuru {
        Method toStringMethod;
        Method compareToMethod;

        @Override
        public boolean isToString(Method method) {
            return method.equals(toStringMethod);
        }

        @Override
        public boolean isCompareToMethod(Method method) {
            return method.equals(compareToMethod);
        }
    }

    static class StubMockUtil extends MockUtil {
        MockName mockNameToReturn;
        MockSettings mockSettingsToReturn;

        @Override
        public MockName getMockName(Object mock) {
            return mockNameToReturn;
        }

        @Override
        public MockSettings getMockSettings(Object mock) {
            return mockSettingsToReturn;
        }
    }

    static class StubMockName implements MockName {
        boolean isDefault;
        String name;

        @Override
        public boolean isDefault() {
            return isDefault;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    static class StubMockSettings implements MockSettings {
        private final Class<?> typeToMock;

        StubMockSettings(Class<?> typeToMock) {
            this.typeToMock = typeToMock;
        }

        @Override
        public Class<?> getTypeToMock() {
            return typeToMock;
        }

        // other methods not needed
        @Override
        public boolean isSerializable() { return false; }
        @Override
        public boolean isStubOnly() { return false; }
        @Override
        public boolean isUsingConstructor() { return false; }
        @Override
        public String getExtraInterfaces() { return null; }
        @Override
        public Object getInvocationListeners() { return null; }
        @Override
        public Object getStubOnly() { return null; }
        @Override
        public boolean isLengthy() { return false; }
        @Override
        public boolean isLenient() { return false; }
        @Override
        public boolean isSerializableMode() { return false; }
        @Override
        public boolean isThrowingException() { return false; }
        @Override
        public boolean isSpy() { return false; }
        @Override
        public boolean isDefaultAnswer() { return false; }
        @Override
        public boolean isMockCreation() { return false; }
        @Override
        public boolean isUseConstructor() { return false; }
        @Override
        public Object getOuterClassInstance() { return null; }
        @Override
        public Object getSpiedInstance() { return null; }
        @Override
        public Object getDefaultAnswer() { return null; }
        @Override
        public Object getSerializableMode() { return null; }
        @Override
        public Object getUseConstructor() { return null; }
        @Override
        public Object getStubOnly1() { return null; }
        @Override
        public Object getLengthy() { return null; }
        @Override
        public Object getLenient() { return null; }
        @Override
        public Object getThrowingException() { return null; }
        @Override
        public Object getSpy() { return null; }
        @Override
        public Object getDefaultAnswer1() { return null; }
        @Override
        public Object getMockCreation() { return null; }
        @Override
        public Object getUseConstructor1() { return null; }
        @Override
        public Object getOuterClassInstance1() { return null; }
        @Override
        public Object getSpiedInstance1() { return null; }
        @Override
        public Object getExtraInterfaces1() { return null; }
        @Override
        public Object getInvocationListeners1() { return null; }
        @Override
        public Object getStubOnly2() { return null; }
        @Override
        public Object getLengthy2() { return null; }
        @Override
        public Object getLenient2() { return null; }
        @Override
        public Object getThrowingException2() { return null; }
        @Override
        public Object getSpy2() { return null; }
        @Override
        public Object getDefaultAnswer2() { return null; }
        @Override
        public Object getMockCreation2() { return null; }
        @Override
        public Object getUseConstructor2() { return null; }
        @Override
        public Object getOuterClassInstance2() { return null; }
        @Override
        public Object getSpiedInstance2() { return null; }
        @Override
        public Object getExtraInterfaces2() { return null; }
        @Override
        public Object getInvocationListeners2() { return null; }
        @Override
        public String getExtraInterfacesString() { return null; }
        @Override
        public boolean isUsingConstructor1() { return false; }
        @Override
        public String getInvocationListenersString() { return null; }
        @Override
        public String getSpiedInstanceString() { return null; }
        @Override
        public String getOuterClassInstanceString() { return null; }
        @Override
        public String getDefaultAnswerString() { return null; }
        @Override
        public String getSerializableModeString() { return null; }
        @Override
        public String getUseConstructorString() { return null; }
        @Override
        public String getStubOnlyString() { return null; }
        @Override
        public String getLengthyString() { return null; }
        @Override
        public String getLenientString() { return null; }
        @Override
        public String getThrowingExceptionString() { return null; }
        @Override
        public String getSpyString() { return null; }
        @Override
        public String getMockCreationString() { return null; }
    }
}