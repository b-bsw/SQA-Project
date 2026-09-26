package org.mockito.internal;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.invocation.MatchersBinder;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.*;
import org.mockito.internal.verification.MockAwareVerificationMode;
import org.mockito.internal.verification.VerificationDataImpl;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.verification.VerificationMode;

public class MockHandlerTest {

    private Object mockObject;
    private Method mockMethod;

    @Before
    public void setUp() throws Exception {
        mockObject = new Object();
        mockMethod = Object.class.getMethod("toString");
    }

    private Invocation createInvocation(final Object mock, final Method method, final Object... args) {
        return new Invocation() {
            @Override
            public Object getMock() {
                return mock;
            }
            @Override
            public Object[] getArguments() {
                return args;
            }
            @Override
            public Method getMethod() {
                return method;
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
            public Object callRealMethod() throws Throwable {
                return null;
            }
            @Override
            public boolean isStubInfoAvailable() {
                return false;
            }
            @Override
            public Object getRawArguments() {
                return args;
            }
        };
    }

    private MockSettingsImpl createSettingsWithDefaultAnswer(final Answer<?> defaultAnswer) {
        return new MockSettingsImpl() {
            @Override
            public Answer<?> getDefaultAnswer() {
                return defaultAnswer;
            }
        };
    }

    @Test
    public void testConstructorNoArg() {
        MockHandler<Object> handler = new MockHandler<Object>();
        assertNotNull(handler.getMockSettings());
        assertNotNull(handler.getInvocationContainer());
    }

    @Test
    public void testConstructorWithSettings() {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<Object> handler = new MockHandler<Object>(settings);
        assertSame(settings, handler.getMockSettings());
    }

    @Test
    public void testConstructorCopy() {
        final MockSettingsImpl originalSettings = new MockSettingsImpl();
        MockHandlerInterface<Object> oldHandler = new MockHandlerInterface<Object>() {
            private static final long serialVersionUID = 1L;
            @Override
            public MockSettingsImpl getMockSettings() {
                return originalSettings;
            }
            @Override
            public Object handle(Invocation invocation) throws Throwable {
                return null;
            }
            @Override
            public VoidMethodStubbable<Object> voidMethodStubbable(Object mock) {
                return null;
            }
            @Override
            public void setAnswersForStubbing(List<Answer> answers) {
            }
            @Override
            public InvocationContainer getInvocationContainer() {
                return null;
            }
        };
        MockHandler<Object> handler = new MockHandler<Object>(oldHandler);
        assertSame(originalSettings, handler.getMockSettings());
    }

    @Test
    public void testHandleVoidStubbing() throws Throwable {
        MockHandler<Object> handler = new MockHandler<Object>();
        handler.setAnswersForStubbing(Arrays.<Answer>asList(new Answer<Object>() {
            @Override
            public Object answer(Invocation invocation) {
                return null;
            }
        }));
        Invocation invocation = createInvocation(mockObject, mockMethod);
        Object result = handler.handle(invocation);
        assertNull(result);
    }

    @Test
    public void testHandleVerificationCorrectMock() throws Throwable {
        final boolean[] verifyCalled = { false };
        VerificationMode mode = new MockAwareVerificationMode() {
            @Override
            public void verify(VerificationData data) {
                verifyCalled[0] = true;
            }
            @Override
            public Object getMock() {
                return mockObject;
            }
        };
        MockingProgress mp = new ThreadSafeMockingProgress() {
            @Override
            public VerificationMode pullVerificationMode() {
                return mode;
            }
        };
        MockHandler<Object> handler = new MockHandler<Object>();
        handler.mockingProgress = mp;
        Invocation invocation = createInvocation(mockObject, mockMethod);
        Object result = handler.handle(invocation);
        assertNull(result);
        assertTrue(verifyCalled[0]);
    }

    @Test
    public void testHandleVerificationWrongMock() throws Throwable {
        final boolean[] verifyCalled = { false };
        final Object otherMock = new Object();
        VerificationMode mode = new MockAwareVerificationMode() {
            @Override
            public void verify(VerificationData data) {
                verifyCalled[0] = true;
            }
            @Override
            public Object getMock() {
                return otherMock;
            }
        };
        MockingProgress mp = new ThreadSafeMockingProgress() {
            @Override
            public VerificationMode pullVerificationMode() {
                return mode;
            }
        };
        final Answer<?> defaultAnswer = new Answer<Object>() {
            @Override
            public Object answer(Invocation invocation) {
                return "default";
            }
        };
        MockSettingsImpl settings = createSettingsWithDefaultAnswer(defaultAnswer);
        MockHandler<Object> handler = new MockHandler<Object>(settings);
        handler.mockingProgress = mp;
        Invocation invocation = createInvocation(mockObject, mockMethod);
        Object result = handler.handle(invocation);
        assertFalse(verifyCalled[0]);
        assertEquals("default", result);
    }

    @Test
    public void testHandleStubbedAnswerFound() throws Throwable {
        final StubbedInvocationMatcher stubbed = new StubbedInvocationMatcher(
                new InvocationMatcher(createInvocation(mockObject, mockMethod)),
                new Answer<Object>() {
                    @Override
                    public Object answer(Invocation invocation) {
                        return "stubbedResult";
                    }
                }
        );
        InvocationContainerImpl container = new InvocationContainerImpl(new ThreadSafeMockingProgress()) {
            @Override
            public StubbedInvocationMatcher findAnswerFor(Invocation invocation) {
                return stubbed;
            }
        };
        MockHandler<Object> handler = new MockHandler<Object>();
        handler.invocationContainerImpl = container;
        Invocation invocation = createInvocation(mockObject, mockMethod);
        Object result = handler.handle(invocation);
        assertEquals("stubbedResult", result);
    }

    @Test(expected = RuntimeException.class)
    public void testHandleStubbedAnswerThrowsException() throws Throwable {
        final StubbedInvocationMatcher stubbed = new StubbedInvocationMatcher(
                new InvocationMatcher(createInvocation(mockObject, mockMethod)),
                new Answer<Object>() {
                    @Override
                    public Object answer(Invocation invocation) {
                        throw new RuntimeException("expected exception");
                    }
                }
        );
        InvocationContainerImpl container = new InvocationContainerImpl(new ThreadSafeMockingProgress()) {
            @Override
            public StubbedInvocationMatcher findAnswerFor(Invocation invocation) {
                return stubbed;
            }
        };
        MockHandler<Object> handler = new MockHandler<Object>();
        handler.invocationContainerImpl = container;
        Invocation invocation = createInvocation(mockObject, mockMethod);
        handler.handle(invocation);
    }

    @Test
    public void testHandleNoStubDefaultAnswer() throws Throwable {
        final Answer<?> defaultAnswer = new Answer<Object>() {
            @Override
            public Object answer(Invocation invocation) {
                return "defaultResult";
            }
        };
        MockSettingsImpl settings = createSettingsWithDefaultAnswer(defaultAnswer);
        MockHandler<Object> handler = new MockHandler<Object>(settings);
        Invocation invocation = createInvocation(mockObject, mockMethod);
        Object result = handler.handle(invocation);
        assertEquals("defaultResult", result);
    }

    @Test
    public void testVoidMethodStubbable() {
        MockHandler<Object> handler = new MockHandler<Object>();
        VoidMethodStubbable<Object> stubbable = handler.voidMethodStubbable(mockObject);
        assertNotNull(stubbable);
        assertTrue(stubbable instanceof VoidMethodStubbableImpl);
    }

    @Test
    public void testGetMockSettings() {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<Object> handler = new MockHandler<Object>(settings);
        assertSame(settings, handler.getMockSettings());
    }

    @Test
    public void testSetAnswersForStubbing() {
        final List<Answer> answers = Arrays.<Answer>asList(
            new Answer<Object>() {
                @Override
                public Object answer(Invocation invocation) {
                    return null;
                }
            }
        );
        MockHandler<Object> handler = new MockHandler<Object>();
        handler.setAnswersForStubbing(answers);
        // No direct assertion, but ensures no exception
    }

    @Test
    public void testGetInvocationContainer() {
        MockHandler<Object> handler = new MockHandler<Object>();
        assertNotNull(handler.getInvocationContainer());
    }
}