package org.mockito.internal;

import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.invocation.MatchersBinder;
import org.mockito.internal.progress.ArgumentMatcherStorage;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.stubbing.OngoingStubbingImpl;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import org.mockito.internal.stubbing.VoidMethodStubbableImpl;
import org.mockito.internal.verification.VerificationDataImpl;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.verification.VerificationData;
import org.mockito.verification.VerificationMode;

public class MockHandlerTest {

    private MockHandler<Object> handler;
    private InvocationContainerStub containerStub;
    private MatchersBinderStub matchersBinderStub;
    private MockingProgressStub mockingProgressStub;
    private MockSettingsImplStub mockSettingsStub;
    private SimpleVerificationMode verificationMode;
    private SimpleAnswer defaultAnswer;

    @Before
    public void setUp() throws Exception {
        containerStub = new InvocationContainerStub();
        matchersBinderStub = new MatchersBinderStub();
        mockingProgressStub = new MockingProgressStub();
        mockSettingsStub = new MockSettingsImplStub();
        verificationMode = new SimpleVerificationMode();
        defaultAnswer = new SimpleAnswer("default");

        mockSettingsStub.setDefaultAnswer(defaultAnswer);

        handler = new MockHandler(mockSettingsStub);
        handler.invocationContainerImpl = containerStub;
        handler.matchersBinder = matchersBinderStub;
        handler.mockingProgress = mockingProgressStub;
    }

    @Test
    public void testHandleReturnsNullWhenHasAnswersForStubbing() throws Throwable {
        containerStub.setHasAnswersForStubbing(true);
        Invocation invocation = createSimpleInvocation();
        Object result = handler.handle(invocation);
        assertNull(result);
    }

    @Test
    public void testHandleReturnsNullAndVerifiesWhenVerificationModePresent() throws Throwable {
        mockingProgressStub.setVerificationMode(verificationMode);
        Invocation invocation = createSimpleInvocation();
        Object result = handler.handle(invocation);
        assertNull(result);
        assertTrue(verificationMode.isVerifyCalled());
    }

    @Test
    public void testHandleReturnsStubbedAnswerWhenStubbedInvocationFound() throws Throwable {
        Invocation invocation = createSimpleInvocation();
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        SimpleAnswer stubbedAnswer = new SimpleAnswer("stubbed");
        StubbedInvocationMatcher stubbed = new StubbedInvocationMatcher(invocationMatcher, stubbedAnswer);
        containerStub.setStubbedInvocation(stubbed);

        Object result = handler.handle(invocation);
        assertEquals("stubbed", result);
    }

    @Test
    public void testHandleReturnsDefaultAnswerWhenNoStubbing() throws Throwable {
        containerStub.setStubbedInvocation(null);
        Invocation invocation = createSimpleInvocation();
        Object result = handler.handle(invocation);
        assertEquals("default", result);
    }

    @Test(expected = NullPointerException.class)
    public void testHandleWithNullInvocationThrowsNullPointerException() throws Throwable {
        handler.handle(null);
    }

    @Test
    public void testVoidMethodStubbableReturnsNonNull() {
        Object mock = new Object();
        VoidMethodStubbable<Object> stubbable = handler.voidMethodStubbable(mock);
        assertNotNull(stubbable);
    }

    @Test
    public void testGetMockSettingsReturnsProvidedSettings() {
        assertSame(mockSettingsStub, handler.getMockSettings());
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testSetAnswersForStubbingDelegatesToContainer() {
        List<Answer> answers = new ArrayList<Answer>();
        handler.setAnswersForStubbing(answers);
        assertSame(answers, containerStub.answersForStubbing);
    }

    @Test
    public void testGetInvocationContainerReturnsSameContainer() {
        assertSame(containerStub, handler.getInvocationContainer());
    }

    // ---- Helper methods ----

    private Invocation createSimpleInvocation() {
        return new SimpleInvocation(new Object(), getDummyMethod(), new Object[0]);
    }

    private static Method getDummyMethod() {
        try {
            return Object.class.getMethod("toString");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    // ---- Static inner stub classes ----

    static class MockSettingsImplStub extends MockSettingsImpl {
        private Answer defaultAnswer;
        void setDefaultAnswer(Answer answer) { this.defaultAnswer = answer; }
        @Override
        public Answer getDefaultAnswer() { return defaultAnswer; }
    }

    static class InvocationContainerStub extends InvocationContainerImpl {
        private boolean hasAnswersForStubbing;
        private InvocationMatcher methodForStubbing;
        private List<Invocation> invocations = new ArrayList<Invocation>();
        private StubbedInvocationMatcher stubbedInvocation;
        List<Answer> answersForStubbing;

        InvocationContainerStub() {
            super(new ThreadSafeMockingProgress());
        }

        @Override
        public boolean hasAnswersForStubbing() { return hasAnswersForStubbing; }
        void setHasAnswersForStubbing(boolean b) { this.hasAnswersForStubbing = b; }

        @Override
        public void setMethodForStubbing(InvocationMatcher invocationMatcher) {
            this.methodForStubbing = invocationMatcher;
        }

        @Override
        public List<Invocation> getInvocations() { return invocations; }

        @Override
        public void setInvocationForPotentialStubbing(InvocationMatcher invocationMatcher) {}

        @Override
        public StubbedInvocationMatcher findAnswerFor(Invocation invocation) {
            return stubbedInvocation;
        }
        void setStubbedInvocation(StubbedInvocationMatcher s) { this.stubbedInvocation = s; }

        @Override
        public void resetInvocationForPotentialStubbing(InvocationMatcher invocationMatcher) {}

        @Override
        public void setAnswersForStubbing(List<Answer> answers) {
            this.answersForStubbing = answers;
        }
    }

    static class MatchersBinderStub extends MatchersBinder {
        @Override
        public InvocationMatcher bindMatchers(ArgumentMatcherStorage storage, Invocation invocation) {
            return new InvocationMatcher(invocation);
        }
    }

    static class MockingProgressStub extends ThreadSafeMockingProgress {
        private VerificationMode verificationMode;
        @Override
        public VerificationMode pullVerificationMode() {
            VerificationMode v = verificationMode;
            verificationMode = null;
            return v;
        }
        void setVerificationMode(VerificationMode mode) { this.verificationMode = mode; }
        @Override
        public void validateState() {}
        @Override
        public void reportOngoingStubbing(OngoingStubbingImpl<?> ongoingStubbing) {}
    }

    static class SimpleAnswer implements Answer {
        private final Object value;
        SimpleAnswer(Object value) { this.value = value; }
        @Override
        public Object answer(Invocation invocation) { return value; }
    }

    static class SimpleVerificationMode implements VerificationMode {
        private boolean verifyCalled;
        @Override
        public void verify(VerificationData data) { this.verifyCalled = true; }
        boolean isVerifyCalled() { return verifyCalled; }
    }

    static class SimpleInvocation implements Invocation {
        private final Object mock;
        private final Method method;
        private final Object[] arguments;
        private boolean verified;

        SimpleInvocation(Object mock, Method method, Object[] arguments) {
            this.mock = mock;
            this.method = method;
            this.arguments = arguments;
        }

        @Override
        public Object getMock() { return mock; }
        @Override
        public Method getMethod() { return method; }
        @Override
        public Object[] getArguments() { return arguments; }
        @Override
        public boolean isVerified() { return verified; }
        @Override
        public void verify() { verified = true; }

        // Unused methods – minimal implementation
        @Override public int sequenceNumber() { return 0; }
        @Override public Location getLocation() { return null; }
        @Override public boolean matches(Invocation other) { return false; }
        @Override public void markVerified() {}
        @Override public void markStubbed() {}
        @Override public boolean isIgnoredForVerification() { return false; }
        @Override public boolean isVerifiedInOrder() { return false; }
        @Override public void markVerifiedInOrder() {}
    }
}