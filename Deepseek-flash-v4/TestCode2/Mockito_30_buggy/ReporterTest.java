package org.mockito.exceptions;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.exceptions.misusing.NullInsteadOfMockException;
import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import org.mockito.exceptions.misusing.UnfinishedVerificationException;
import org.mockito.exceptions.misusing.WrongTypeOfReturnValue;
import org.mockito.exceptions.verification.NeverWantedButInvoked;
import org.mockito.exceptions.verification.NoInteractionsWanted;
import org.mockito.exceptions.verification.SmartNullPointerException;
import org.mockito.exceptions.verification.TooLittleActualInvocations;
import org.mockito.exceptions.verification.TooManyActualInvocations;
import org.mockito.exceptions.verification.VerificationInOrderFailure;
import org.mockito.exceptions.verification.WantedButNotInvoked;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.exceptions.VerificationAwareInvocation;
import org.mockito.internal.invocation.Invocation;

public class ReporterTest {

    private final Reporter reporter = new Reporter();

    @Test
    public void testMockitoExceptions() {
        assertAllThrow(MockitoException.class,
                () -> reporter.checkedExceptionInvalid(new RuntimeException("boom")),
                () -> reporter.checkedExceptionInvalid(null),
                () -> reporter.cannotStubWithNullThrowable(),
                () -> reporter.mocksHaveToBePassedToVerifyNoMoreInteractions(),
                () -> reporter.mocksHaveToBePassedWhenCreatingInOrder(),
                () -> reporter.inOrderRequiresFamiliarMock(),
                () -> reporter.cannotMockFinalClass(String.class),
                () -> reporter.cannotStubVoidMethodWithAReturnValue("doSomething"),
                () -> reporter.onlyVoidMethodsCanBeSetToDoNothing(),
                () -> reporter.noArgumentValueWasCaptured(),
                () -> reporter.extraInterfacesDoesNotAcceptNullParameters(),
                () -> reporter.extraInterfacesAcceptsOnlyInterfaces(String.class),
                () -> reporter.extraInterfacesCannotContainMockedType(String.class),
                () -> reporter.extraInterfacesRequiresAtLeastOneInterface(),
                () -> reporter.mockedTypeIsInconsistentWithSpiedInstanceType(String.class, "spied"),
                () -> reporter.cannotCallRealMethodOnInterface(),
                () -> reporter.cannotVerifyToString(),
                () -> reporter.moreThanOneAnnotationNotAllowed("field"),
                () -> reporter.unsupportedCombinationOfAnnotations("Mock", "Spy"),
                () -> reporter.cannotInitializeForSpyAnnotation("field", new Exception("boom")),
                () -> reporter.cannotInitializeForInjectMocksAnnotation("field", new Exception("boom")));
    }

    @Test
    public void testMisusingExceptions() {
        assertAllThrow(UnfinishedStubbingException.class,
                () -> reporter.unfinishedStubbing(new Location()));
        assertAllThrow(MissingMethodInvocationException.class,
                () -> reporter.missingMethodInvocation());
        assertAllThrow(UnfinishedVerificationException.class,
                () -> reporter.unfinishedVerificationException(new Location()));
        assertAllThrow(NotAMockException.class,
                () -> reporter.notAMockPassedToVerify(String.class),
                () -> reporter.notAMockPassedToWhenMethod(),
                () -> reporter.notAMockPassedToVerifyNoMoreInteractions(),
                () -> reporter.notAMockPassedWhenCreatingInOrder());
        assertAllThrow(NullInsteadOfMockException.class,
                () -> reporter.nullPassedToVerify(),
                () -> reporter.nullPassedToWhenMethod(),
                () -> reporter.nullPassedToVerifyNoMoreInteractions(),
                () -> reporter.nullPassedWhenCreatingInOrder());
        assertAllThrow(InvalidUseOfMatchersException.class,
                () -> reporter.invalidUseOfMatchers(1, 0),
                () -> reporter.misplacedArgumentMatcher(new Location()));
        assertThrows(WrongTypeOfReturnValue.class,
                () -> reporter.wrongTypeOfReturnValue("String", "Integer", "foo"));
    }

    @Test
    public void testVerificationFailures() {
        assertAllThrow(WantedButNotInvoked.class,
                () -> reporter.wantedButNotInvoked(printable("wanted")));
        assertAllThrow(TooManyActualInvocations.class,
                () -> reporter.tooManyActualInvocations(1, 2, printable("wanted"), new Location()));
        assertAllThrow(NeverWantedButInvoked.class,
                () -> reporter.neverWantedButInvoked(printable("wanted"), new Location()));
        assertAllThrow(TooLittleActualInvocations.class,
                () -> reporter.tooLittleActualInvocations(discrepancy(), printable("wanted"), new Location()),
                () -> reporter.tooLittleActualInvocations(discrepancy(), printable("wanted"), null));
        assertAllThrow(NoInteractionsWanted.class,
                () -> reporter.noMoreInteractionsWanted(invocation(), Collections.<VerificationAwareInvocation>emptyList()));
        assertAllThrow(VerificationInOrderFailure.class,
                () -> reporter.wantedButNotInvokedInOrder(printable("wanted"), printable("previous")),
                () -> reporter.tooManyActualInvocationsInOrder(1, 2, printable("wanted"), new Location()),
                () -> reporter.tooLittleActualInvocationsInOrder(discrepancy(), printable("wanted"), new Location()),
                () -> reporter.noMoreInteractionsWantedInOrder(invocation()));
        assertThrows(MockitoAssertionError.class,
                () -> reporter.wantedAtMostX(0, 1));
        assertThrows(SmartNullPointerException.class,
                () -> reporter.smartNullPointerException(new Location()));
    }

    @Test
    public void testWantedButNotInvokedWithInvocations() {
        assertThrows(WantedButNotInvoked.class,
                () -> reporter.wantedButNotInvoked(printable("wanted"), Collections.<PrintableInvocation>emptyList()));
        assertThrows(WantedButNotInvoked.class,
                () -> reporter.wantedButNotInvoked(printable("wanted"),
                        Arrays.asList(printable("a"), printable("b"))));
    }

    @Test
    public void testArgumentsAreDifferent() {
        assertThrows(AssertionError.class,
                () -> reporter.argumentsAreDifferent("wanted", "actual", new Location()));
    }

    private void assertThrows(Class<? extends Throwable> expected, Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable t) {
            assertTrue("Expected " + expected.getName() + " but got " + t.getClass().getName(),
                    expected.isInstance(t));
            return;
        }
        fail("Expected " + expected.getName() + " but nothing was thrown");
    }

    private void assertAllThrow(Class<? extends Throwable> expected, Runnable... runnables) {
        for (Runnable runnable : runnables) {
            assertThrows(expected, runnable);
        }
    }

    private <T> T proxy(Class<T> type, InvocationHandler handler) {
        return type.cast(Proxy.newProxyInstance(type.getClassLoader(), new Class<?>[]{type}, handler));
    }

    private PrintableInvocation printable(final String text) {
        return proxy(PrintableInvocation.class, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();
                if ((name.equals("toString") || name.equals("getLocation")) && (args == null || args.length == 0)) {
                    if (name.equals("toString")) {
                        return text;
                    }
                    return new Location();
                }
                return defaultValue(method.getReturnType());
            }
        });
    }

    private Invocation invocation() {
        return proxy(Invocation.class, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("getLocation") && (args == null || args.length == 0)) {
                    return new Location();
                }
                return defaultValue(method.getReturnType());
            }
        });
    }

    private Discrepancy discrepancy() {
        return proxy(Discrepancy.class, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();
                if (name.equals("getPluralizedWantedCount")) {
                    return "1";
                }
                if (name.equals("getPluralizedActualCount")) {
                    return "0";
                }
                return defaultValue(method.getReturnType());
            }
        });
    }

    private Object defaultValue(Class<?> type) {
        if (type == boolean.class) {
            return false;
        }
        if (type == int.class) {
            return 0;
        }
        if (type == long.class) {
            return 0L;
        }
        if (type == double.class) {
            return 0.0d;
        }
        if (type == float.class) {
            return 0.0f;
        }
        if (type == byte.class) {
            return (byte) 0;
        }
        if (type == short.class) {
            return (short) 0;
        }
        if (type == char.class) {
            return '\0';
        }
        return null;
    }
}