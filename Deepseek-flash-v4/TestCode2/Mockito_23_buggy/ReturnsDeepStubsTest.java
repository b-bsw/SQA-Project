package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class ReturnsDeepStubsTest {

    private static class FakeMockitoCore extends MockitoCore {
        private final boolean mockable;
        private final Object mockToReturn;

        FakeMockitoCore(boolean mockable, Object mockToReturn) {
            this.mockable = mockable;
            this.mockToReturn = mockToReturn;
        }

        @Override
        public boolean isTypeMockable(Class<?> type) {
            return mockable;
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T> T mock(Class<T> typeToMock, MockSettings mockSettings) {
            return (T) mockToReturn;
        }
    }

    private static class FakeReturnsEmptyValues extends ReturnsEmptyValues {
        private final Object value;
        FakeReturnsEmptyValues(Object value) { this.value = value; }

        @Override
        public Object returnValueFor(Class<?> type) { return value; }
    }

    private static class FakeInvocation implements InvocationOnMock {
        private final Object mock;
        private final Method method;

        FakeInvocation(Object mock, Method method) {
            this.mock = mock;
            this.method = method;
        }

        @Override public Object getMock() { return mock; }
        @Override public Method getMethod() { return method; }
        @Override public Object[] getArguments() { return new Object[0]; }
        @Override public Object callRealMethod() throws Throwable { return null; }
        @Override public Object proceed() throws Throwable { return null; }
    }

    private static class FakeInvocationContainer extends InvocationContainerImpl {
        private final List<StubbedInvocationMatcher> stubbed = new LinkedList<>();
        private final StubbedInvocationMatcher invocationForStubbing;

        FakeInvocationContainer(StubbedInvocationMatcher invocationForStubbing) {
            super(null);
            this.invocationForStubbing = invocationForStubbing;
        }

        @Override
        public List<StubbedInvocationMatcher> getStubbedInvocations() { return stubbed; }

        @Override
        public StubbedInvocationMatcher getInvocationForStubbing() { return invocationForStubbing; }

        @Override
        public void addAnswer(Answer<Object> answer, boolean isConsecutive) { }
    }

    private static class FakeGenericMetadata extends GenericMetadataSupport {
        private final Class<?> rawType;
        private final Class<?>[] extraInterfaces;

        FakeGenericMetadata(Class<?> rawType, Class<?>... extraInterfaces) {
            this.rawType = rawType;
            this.extraInterfaces = extraInterfaces;
        }

        @Override public Class<?> rawType() { return rawType; }
        @Override public Class<?>[] rawExtraInterfaces() { return extraInterfaces; }
        @Override public GenericMetadataSupport resolveGenericReturnType(Method method) { return this; }
    }

    private static class FakeInternalMockHandler implements InternalMockHandler<Object> {
        private final InvocationContainerImpl container;
        FakeInternalMockHandler(InvocationContainerImpl container) { this.container = container; }

        @Override public InvocationContainerImpl getInvocationContainer() { return container; }

        @Override public MockSettings getMockSettings() { return null; }
        @Override public void setAnswersForStubbing(List<Answer<?>> answers) { }
        @Override public <T> void answersForStubbing(InvocationOnMock invocation, Answer<T> answer) { }
        @Override public Object handle(InvocationOnMock invocation) throws Throwable { return null; }
        @Override public Object voidMethodOnMock(Object mock, Method method, Object... args) throws Throwable { return null; }
        @Override public Object answer(InvocationOnMock invocation) throws Throwable { return null; }
        @Override public void validateMockedType(Class<?> classToMock, Object spiedInstance) { }
        @Override public void validateType(Class<?> classToMock) { }
        @Override public void validateExtraInterfaces(Class<?>... extraInterfaces) { }
        @Override public void validateMockitoUsage() { }
        @Override public Object getMockSettingsAsObject() { return null; }
        @Override public void setInvocationContainer(InvocationContainerImpl container) { }
        @Override public Object getPlugin() { return null; }
        @Override public void setPlugin(Object plugin) { }
    }

    private static class FakeMockUtil extends MockUtil {
        private final InternalMockHandler<Object> handler;
        FakeMockUtil(InternalMockHandler<Object> handler) { this.handler = handler; }
        @Override public InternalMockHandler<Object> getMockHandler(Object mock) { return handler; }
    }

    private void setField(Object target, String fieldName, Object value) throws Exception {
        java.lang.reflect.Field f = ReturnsDeepStubs.class.getDeclaredField(fieldName);
        f.setAccessible(true);
        f.set(target, value);
    }

    @Test
    public void testAnswer_NonMockableRawType_ReturnsDelegateValue() throws Throwable {
        Class<?> rawType = int.class;
        Object expected = 42;
        FakeReturnsEmptyValues delegate = new FakeReturnsEmptyValues(expected);
        FakeMockitoCore core = new FakeMockitoCore(false, null);

        ReturnsDeepStubs stub = new ReturnsDeepStubs() {
            @Override
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return new FakeGenericMetadata(rawType);
            }
        };
        setField(stub, "delegate", delegate);
        setField(stub, "mockitoCore", core);

        Method method = Object.class.getMethod("toString");
        FakeInvocation invocation = new FakeInvocation(new Object(), method);

        Object result = stub.answer(invocation);
        assertEquals(expected, result);
    }

    @Test
    public void testAnswer_MockableRawType_WithStubbedMatch_ReturnsStubbedAnswer() throws Throwable {
        Class<?> rawType = String.class;
        Object expected = "stubbed_return";
        FakeReturnsEmptyValues delegate = new FakeReturnsEmptyValues("default");
        FakeMockitoCore core = new FakeMockitoCore(true, "someMock");

        StubbedInvocationMatcher matcher = new StubbedInvocationMatcher(null, null) {
            @Override
            public boolean matches(InvocationOnMock candidate) { return true; }
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable { return expected; }
            @Override
            public InvocationOnMock getInvocation() { return null; }
        };

        FakeInvocationContainer container = new FakeInvocationContainer(matcher);
        container.stubbed.add(matcher);

        FakeInternalMockHandler handler = new FakeInternalMockHandler(container);

        ReturnsDeepStubs stub = new ReturnsDeepStubs() {
            @Override
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return new FakeGenericMetadata(rawType);
            }
        };
        setField(stub, "delegate", delegate);
        setField(stub, "mockitoCore", core);

        Method method = Object.class.getMethod("toString");
        FakeInvocation invocation = new FakeInvocation(new Object(), method);

        Object result = stub.answer(invocation);
        assertEquals(expected, result);
    }

    @Test
    public void testAnswer_MockableRawType_NoStubbedMatch_ReturnsDeepStubMock() throws Throwable {
        Class<?> rawType = List.class;
        Object mockInstance = new Object();
        FakeReturnsEmptyValues delegate = new FakeReturnsEmptyValues("default");
        FakeMockitoCore core = new FakeMockitoCore(true, mockInstance);

        StubbedInvocationMatcher noMatchMatcher = new StubbedInvocationMatcher(null, null) {
            @Override
            public boolean matches(InvocationOnMock candidate) { return false; }
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable { return "should_not_be_called"; }
            @Override
            public InvocationOnMock getInvocation() { return null; }
        };
        FakeInvocationContainer container = new FakeInvocationContainer(noMatchMatcher);

        FakeInternalMockHandler handler = new FakeInternalMockHandler(container);

        ReturnsDeepStubs stub = new ReturnsDeepStubs() {
            @Override
            protected GenericMetadataSupport actualParameterizedType(Object mock) {
                return new FakeGenericMetadata(rawType);
            }
        };
        setField(stub, "delegate", delegate);
        setField(stub, "mockitoCore", core);

        Method method = Object.class.getMethod("toString");
        FakeInvocation invocation = new FakeInvocation(new Object(), method);

        Object result = stub.answer(invocation);
        assertSame(mockInstance, result);
    }
}