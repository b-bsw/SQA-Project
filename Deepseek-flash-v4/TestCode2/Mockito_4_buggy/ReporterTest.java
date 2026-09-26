package org.mockito.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.*;
import org.mockito.exceptions.verification.*;
import org.mockito.internal.debugging.LocationImpl;
import org.mockito.internal.exceptions.VerificationAwareInvocation;
import org.mockito.internal.matchers.LocalizedMatcher;
import org.mockito.internal.reporting.Discrepancy;
import org.mockito.invocation.DescribedInvocation;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.invocation.Location;
import org.mockito.listeners.InvocationListener;
import org.mockito.mock.SerializableMode;

public class ReporterTest {

    private final Reporter reporter = new Reporter();

    private static class TestFields {
        private String sampleField;
    }

    private Field sampleField() throws Exception {
        return TestFields.class.getDeclaredField("sampleField");
    }

    private Location location() {
        return new LocationImpl();
    }

    private DescribedInvocation describedInvocation() {
        return (DescribedInvocation) Proxy.newProxyInstance(
                DescribedInvocation.class.getClassLoader(),
                new Class<?>[]{DescribedInvocation.class},
                (proxy, method, args) -> {
                    if ("toString".equals(method.getName())) return "wanted";
                    if ("getLocation".equals(method.getName())) return location();
                    return null;
                });
    }

    private List<DescribedInvocation> describedInvocations(int count) {
        List<DescribedInvocation> list = new ArrayList<DescribedInvocation>();
        for (int i = 0; i < count; i++) list.add(describedInvocation());
        return list;
    }

    private Invocation invocation() {
        return (Invocation) Proxy.newProxyInstance(
                Invocation.class.getClassLoader(),
                new Class<?>[]{Invocation.class},
                (proxy, method, args) -> {
                    if ("toString".equals(method.getName())) return "interaction";
                    if ("getLocation".equals(method.getName())) return location();
                    if ("getMock".equals(method.getName())) return "mock";
                    return null;
                });
    }

    private VerificationAwareInvocation verificationAwareInvocation() {
        return (VerificationAwareInvocation) Proxy.newProxyInstance(
                VerificationAwareInvocation.class.getClassLoader(),
                new Class<?>[]{VerificationAwareInvocation.class},
                (proxy, method, args) -> {
                    if ("toString".equals(method.getName())) return "interaction";
                    if ("getLocation".equals(method.getName())) return location();
                    if ("getMock".equals(method.getName())) return "mock";
                    return null;
                });
    }

    private InvocationOnMock invocationOnMock() throws Exception {
        return invocationOnMock(Object.class.getMethod("toString"));
    }

    private InvocationOnMock invocationOnMock(final Method method) {
        return (InvocationOnMock) Proxy.newProxyInstance(
                InvocationOnMock.class.getClassLoader(),
                new Class<?>[]{InvocationOnMock.class},
                (proxy, m, args) -> {
                    if ("getMock".equals(m.getName())) return "mock";
                    if ("getMethod".equals(m.getName())) return method;
                    if ("getArguments".equals(m.getName())) return new Object[0];
                    return null;
                });
    }

    private InvocationListener invocationListener() {
        return new InvocationListener() {
            @Override
            public void reportInvocation(InvocationOnMock invocation) {
            }
        };
    }

    @Test(expected = MockitoException.class)
    public void testCheckedExceptionInvalid() {
        reporter.checkedExceptionInvalid(new Exception());
    }

    @Test(expected = MockitoException.class)
    public void testCannotStubWithNullThrowable() {
        reporter.cannotStubWithNullThrowable();
    }

    @Test(expected = UnfinishedStubbingException.class)
    public void testUnfinishedStubbing() {
        reporter.unfinishedStubbing(location());
    }

    @Test(expected = MockitoException.class)
    public void testIncorrectUseOfApi() {
        reporter.incorrectUseOfApi();
    }

    @Test(expected = MissingMethodInvocationException.class)
    public void testMissingMethodInvocation() {
        reporter.missingMethodInvocation();
    }

    @Test(expected = UnfinishedVerificationException.class)
    public void testUnfinishedVerificationException() {
        reporter.unfinishedVerificationException(location());
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedToVerify() {
        reporter.notAMockPassedToVerify(String.class);
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToVerify() {
        reporter.nullPassedToVerify();
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedToWhenMethod() {
        reporter.notAMockPassedToWhenMethod();
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToWhenMethod() {
        reporter.nullPassedToWhenMethod();
    }

    @Test(expected = MockitoException.class)
    public void testMocksHaveToBePassedToVerifyNoMoreInteractions() {
        reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedToVerifyNoMoreInteractions() {
        reporter.notAMockPassedToVerifyNoMoreInteractions();
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToVerifyNoMoreInteractions() {
        reporter.nullPassedToVerifyNoMoreInteractions();
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedWhenCreatingInOrder() {
        reporter.notAMockPassedWhenCreatingInOrder();
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedWhenCreatingInOrder() {
        reporter.nullPassedWhenCreatingInOrder();
    }

    @Test(expected = MockitoException.class)
    public void testMocksHaveToBePassedWhenCreatingInOrder() {
        reporter.mocksHaveToBePassedWhenCreatingInOrder();
    }

    @Test(expected = MockitoException.class)
    public void testInOrderRequiresFamiliarMock() {
        reporter.inOrderRequiresFamiliarMock();
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void testInvalidUseOfMatchers() {
        reporter.invalidUseOfMatchers(1, new ArrayList<LocalizedMatcher>());
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void testIncorrectUseOfAdditionalMatchers() {
        reporter.incorrectUseOfAdditionalMatchers("and", 1, new ArrayList<LocalizedMatcher>());
    }

    @Test(expected = CannotVerifyStubOnlyMock.class)
    public void testStubPassedToVerify() {
        reporter.stubPassedToVerify();
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void testReportNoSubMatchersFound() {
        reporter.reportNoSubMatchersFound("and");
    }

    @Test(expected = AssertionError.class)
    public void testArgumentsAreDifferent() {
        reporter.argumentsAreDifferent("wanted", "actual", location());
    }

    @Test(expected = WantedButNotInvoked.class)
    public void testWantedButNotInvokedSingle() {
        reporter.wantedButNotInvoked(describedInvocation());
    }

    @Test(expected = WantedButNotInvoked.class)
    public void testWantedButNotInvokedNoInteractions() {
        reporter.wantedButNotInvoked(describedInvocation(), Collections.<DescribedInvocation>emptyList());
    }

    @Test(expected = WantedButNotInvoked.class)
    public void testWantedButNotInvokedOneInteraction() {
        reporter.wantedButNotInvoked(describedInvocation(), describedInvocations(1));
    }

    @Test(expected = WantedButNotInvoked.class)
    public void testWantedButNotInvokedMultipleInteractions() {
        reporter.wantedButNotInvoked(describedInvocation(), describedInvocations(2));
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testWantedButNotInvokedInOrder() {
        reporter.wantedButNotInvokedInOrder(describedInvocation(), describedInvocation());
    }

    @Test(expected = TooManyActualInvocations.class)
    public void testTooManyActualInvocations() {
        reporter.tooManyActualInvocations(1, 2, describedInvocation(), location());
    }

    @Test(expected = NeverWantedButInvoked.class)
    public void testNeverWantedButInvoked() {
        reporter.neverWantedButInvoked(describedInvocation(), location());
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testTooManyActualInvocationsInOrder() {
        reporter.tooManyActualInvocationsInOrder(1, 2, describedInvocation(), location());
    }

    @Test(expected = TooLittleActualInvocations.class)
    public void testTooLittleActualInvocations() {
        reporter.tooLittleActualInvocations(new Discrepancy(1, 0), describedInvocation(), location());
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testTooLittleActualInvocationsInOrder() {
        reporter.tooLittleActualInvocationsInOrder(new Discrepancy(1, 0), describedInvocation(), location());
    }

    @Test(expected = NoInteractionsWanted.class)
    public void testNoMoreInteractionsWantedEmpty() {
        reporter.noMoreInteractionsWanted(invocation(), Collections.<VerificationAwareInvocation>emptyList());
    }

    @Test(expected = NoInteractionsWanted.class)
    public void testNoMoreInteractionsWantedWithInvocations() {
        reporter.noMoreInteractionsWanted(invocation(),
                Collections.singletonList(verificationAwareInvocation()));
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testNoMoreInteractionsWantedInOrder() {
        reporter.noMoreInteractionsWantedInOrder(invocation());
    }

    @Test(expected = MockitoException.class)
    public void testCannotMockFinalClass() {
        reporter.cannotMockFinalClass(String.class);
    }

    @Test(expected = CannotStubVoidMethodWithReturnValue.class)
    public void testCannotStubVoidMethodWithAReturnValue() {
        reporter.cannotStubVoidMethodWithAReturnValue("doSomething");
    }

    @Test(expected = MockitoException.class)
    public void testOnlyVoidMethodsCanBeSetToDoNothing() {
        reporter.onlyVoidMethodsCanBeSetToDoNothing();
    }

    @Test(expected = WrongTypeOfReturnValue.class)
    public void testWrongTypeOfReturnValue() {
        reporter.wrongTypeOfReturnValue("String", "int", "someMethod");
    }

    @Test(expected = MockitoAssertionError.class)
    public void testWantedAtMostX() {
        reporter.wantedAtMostX(2, 3);
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void testMisplacedArgumentMatcher() {
        reporter.misplacedArgumentMatcher(new ArrayList<LocalizedMatcher>());
    }

    @Test(expected = SmartNullPointerException.class)
    public void testSmartNullPointerException() {
        reporter.smartNullPointerException("foo()", location());
    }

    @Test(expected = MockitoException.class)
    public void testNoArgumentValueWasCaptured() {
        reporter.noArgumentValueWasCaptured();
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfacesDoesNotAcceptNullParameters() {
        reporter.extraInterfacesDoesNotAcceptNullParameters();
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfacesAcceptsOnlyInterfaces() {
        reporter.extraInterfacesAcceptsOnlyInterfaces(String.class);
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfacesCannotContainMockedType() {
        reporter.extraInterfacesCannotContainMockedType(Runnable.class);
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfacesRequiresAtLeastOneInterface() {
        reporter.extraInterfacesRequiresAtLeastOneInterface();
    }

    @Test(expected = MockitoException.class)
    public void testMockedTypeIsInconsistentWithSpiedInstanceType() {
        reporter.mockedTypeIsInconsistentWithSpiedInstanceType(String.class, new Object());
    }

    @Test(expected = MockitoException.class)
    public void testCannotCallAbstractRealMethod() {
        reporter.cannotCallAbstractRealMethod();
    }

    @Test(expected = MockitoException.class)
    public void testCannotVerifyToString() {
        reporter.cannotVerifyToString();
    }

    @Test(expected = MockitoException.class)
    public void testMoreThanOneAnnotationNotAllowed() {
        reporter.moreThanOneAnnotationNotAllowed("field");
    }

    @Test(expected = MockitoException.class)
    public void testUnsupportedCombinationOfAnnotations() {
        reporter.unsupportedCombinationOfAnnotations("Mock", "Spy");
    }

    @Test(expected = MockitoException.class)
    public void testCannotInitializeForSpyAnnotation() {
        reporter.cannotInitializeForSpyAnnotation("field", new Exception("failed"));
    }

    @Test(expected = MockitoException.class)
    public void testCannotInitializeForInjectMocksAnnotation() {
        reporter.cannotInitializeForInjectMocksAnnotation("field", new Exception("failed"));
    }

    @Test(expected = FriendlyReminderException.class)
    public void testAtMostAndNeverShouldNotBeUsedWithTimeout() {
        reporter.atMostAndNeverShouldNotBeUsedWithTimeout();
    }

    @Test(expected = MockitoException.class)
    public void testFieldInitialisationThrewException() throws Exception {
        reporter.fieldInitialisationThrewException(sampleField(), new RuntimeException("init failed"));
    }

    @Test(expected = MockitoException.class)
    public void testInvocationListenerDoesNotAcceptNullParameters() {
        reporter.invocationListenerDoesNotAcceptNullParameters();
    }

    @Test(expected = MockitoException.class)
    public void testInvocationListenersRequiresAtLeastOneListener() {
        reporter.invocationListenersRequiresAtLeastOneListener();
    }

    @Test(expected = MockitoException.class)
    public void testInvocationListenerThrewException() {
        reporter.invocationListenerThrewException(invocationListener(), new RuntimeException("listener failed"));
    }

    @Test(expected = MockitoException.class)
    public void testCannotInjectDependency() throws Exception {
        reporter.cannotInjectDependency(sampleField(), "mock", new Exception("inject failed"));
    }

    @Test(expected = MockitoException.class)
    public void testMockedTypeIsInconsistentWithDelegatedInstanceType() {
        reporter.mockedTypeIsInconsistentWithDelegatedInstanceType(String.class, new Object());
    }

    @Test(expected = MockitoException.class)
    public void testSpyAndDelegateAreMutuallyExclusive() {
        reporter.spyAndDelegateAreMutuallyExclusive();
    }

    @Test(expected = MockitoException.class)
    public void testInvalidArgumentRangeAtIdentityAnswerCreationTime() {
        reporter.invalidArgumentRangeAtIdentityAnswerCreationTime();
    }

    @Test(expected = MockitoException.class)
    public void testInvalidArgumentPositionRangeAtInvocationTimeNoParamsFalse() throws Exception {
        reporter.invalidArgumentPositionRangeAtInvocationTime(invocationOnMock(), false, 0);
    }

    @Test(expected = MockitoException.class)
    public void testInvalidArgumentPositionRangeAtInvocationTimeOneParamTrue() throws Exception {
        Method method = String.class.getMethod("contains", CharSequence.class);
        reporter.invalidArgumentPositionRangeAtInvocationTime(invocationOnMock(method), true, 0);
    }

    @Test(expected = MockitoException.class)
    public void testInvalidArgumentPositionRangeAtInvocationTimeTwoParamsFalse() throws Exception {
        Method method = String.class.getMethod("substring", int.class, int.class);
        reporter.invalidArgumentPositionRangeAtInvocationTime(invocationOnMock(method), false, 0);
    }

    @Test(expected = WrongTypeOfReturnValue.class)
    public void testWrongTypeOfArgumentToReturn() throws Exception {
        reporter.wrongTypeOfArgumentToReturn(invocationOnMock(), "String", Integer.class, 0);
    }

    @Test(expected = MockitoException.class)
    public void testDefaultAnswerDoesNotAcceptNullParameter() {
        reporter.defaultAnswerDoesNotAcceptNullParameter();
    }

    @Test(expected = MockitoException.class)
    public void testSerializableWontWorkForObjectsThatDontImplementSerializable() {
        reporter.serializableWontWorkForObjectsThatDontImplementSerializable(Object.class);
    }

    @Test(expected = MockitoException.class)
    public void testDelegatedMethodHasWrongReturnType() throws Exception {
        Method mockMethod = String.class.getMethod("toString");
        Method delegateMethod = String.class.getMethod("hashCode");
        reporter.delegatedMethodHasWrongReturnType(mockMethod, delegateMethod, "mock", new Object());
    }

    @Test(expected = MockitoException.class)
    public void testDelegatedMethodDoesNotExistOnDelegate() throws Exception {
        reporter.delegatedMethodDoesNotExistOnDelegate(Object.class.getMethod("toString"), "mock", new Object());
    }

    @Test(expected = MockitoException.class)
    public void testUsingConstructorWithFancySerializable() {
        reporter.usingConstructorWithFancySerializable(SerializableMode.ACROSS_CLASSLOADERS);
    }
}