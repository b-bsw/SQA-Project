package org.mockito.exceptions;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.notAMockPassedToVerifyNoMoreInteractions();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Examples of correct verifications:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation1 = null;
        org.mockito.exceptions.PrintableInvocation printableInvocation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wantedButNotInvokedInOrder(printableInvocation1, printableInvocation2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls returnsSmartNulls0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls();
        org.mockito.invocation.InvocationOnMock invocationOnMock1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = returnsSmartNulls0.answer(invocationOnMock1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotStubVoidMethodWithAReturnValue("hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?'hi!' is a *void method* and it *cannot* be stubbed with a *return value*!?Voids are usually stubbed with Throwables:?    doThrow(exception).when(mock).someVoidMethod();?If the method you are trying to stub is *overloaded* then make sure you are calling the right overloaded version.?This exception might also occur when somewhere in your test you are stubbing *final methods*.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.mocksHaveToBePassedWhenCreatingInOrder();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((-1), 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.invocation.Invocation invocation1 = null;
        org.mockito.internal.exceptions.VerificationAwareInvocation[] verificationAwareInvocationArray2 = new org.mockito.internal.exceptions.VerificationAwareInvocation[] {};
        java.util.ArrayList<org.mockito.internal.exceptions.VerificationAwareInvocation> verificationAwareInvocationList3 = new java.util.ArrayList<org.mockito.internal.exceptions.VerificationAwareInvocation>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.mockito.internal.exceptions.VerificationAwareInvocation>) verificationAwareInvocationList3, verificationAwareInvocationArray2);
        // The following exception was thrown during execution in test generation
        try {
            reporter0.noMoreInteractionsWanted(invocation1, (java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) verificationAwareInvocationList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationAwareInvocationArray2);
        org.junit.Assert.assertArrayEquals(verificationAwareInvocationArray2, new org.mockito.internal.exceptions.VerificationAwareInvocation[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.unfinishedVerificationException(location1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.nullPassedToVerifyNoMoreInteractions();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument(s) passed is null!?Examples of correct verifications:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.noArgumentValueWasCaptured();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?No argument value was captured!?You might have forgotten to use argument.capture() in verify()...?...or you used capture() in stubbing but stubbed method was not called.?Be aware that it is recommended to use capture() only with verify()??Examples of correct argument capturing:?    ArgumentCaptor<Person> argument = ArgumentCaptor.forClass(Person.class);?    verify(mock).doSomething(argument.capture());?    assertEquals(\"John\", argument.getValue().getName());?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.misplacedArgumentMatcher(location1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation1 = null;
        org.mockito.internal.debugging.Location location2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.neverWantedButInvoked(printableInvocation1, location2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.Class class1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.notAMockPassedToVerify(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.argumentsAreDifferent("hi!", "", location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.nullPassedWhenCreatingInOrder();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument(s) passed is null!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.Exception exception2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInitializeForSpyAnnotation("hi!", exception2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Discrepancy discrepancy1 = null;
        org.mockito.exceptions.PrintableInvocation printableInvocation2 = null;
        org.mockito.internal.debugging.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooLittleActualInvocationsInOrder(discrepancy1, printableInvocation2, location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.nullPassedToWhenMethod();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to when() is null!?Example of correct stubbing:?    doThrow(new RuntimeException()).when(mock).someMethod();?Also, if you use @Mock annotation don't miss initMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.mocksHaveToBePassedToVerifyNoMoreInteractions();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.inOrderRequiresFamiliarMock();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?InOrder can only verify mocks that were passed in during creation of InOrder.?For example:?    InOrder inOrder = inOrder(mockOne);?    inOrder.verify(mockOne).doStuff();");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotStubWithNullThrowable();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Cannot stub with null throwable!");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.nullPassedToVerify();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to verify() should be a mock but is null!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();?Also, if you use @Mock annotation don't miss initMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 97 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.missingMethodInvocation();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be 'a method call on a mock'.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because:?1. you stub either of: final/private/equals()/hashCode() methods.?   Those methods *cannot* be stubbed/verified.?2. inside when() you don't call method on mock but on some other object.");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.extraInterfacesRequiresAtLeastOneInterface();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?extraInterfaces() requires at least one interface.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.notAMockPassedWhenCreatingInOrder();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.Throwable throwable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.checkedExceptionInvalid(throwable1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Checked exception is invalid for this method!?Invalid: null");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Reporter reporter1 = new org.mockito.exceptions.Reporter();
        java.lang.Class<?> wildcardClass2 = reporter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.notAMockPassedToVerify((java.lang.Class) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Reporter and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.unsupportedCombinationOfAnnotations("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: This combination of annotations is not permitted on a single field:?@hi! and @");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.Exception exception2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInitializeForInjectMocksAnnotation("", exception2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 1, (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ?hi! cannot be returned by hi!()?hi!() should return hi!?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotCallRealMethodOnInterface();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Cannot call real method on java interface. Interface does not have any implementation!?Calling real methods is only possible when mocking concrete classes.?  //correct example:?  when(mockOfConcreteClass.doStuff()).thenCallRealMethod();");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("", "", "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ? cannot be returned by ()?() should return ?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 0, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 97 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.smartNullPointerException(location1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.onlyVoidMethodsCanBeSetToDoNothing();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Only void methods can doNothing()!?Example of correct use of doNothing():?    doNothing().?    doThrow(new RuntimeException())?    .when(mock).someVoidMethod();?Above means:?someVoidMethod() does nothing the 1st time but throws an exception the 2nd time is called");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ?hi! cannot be returned by hi!()?hi!() should return ?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 100, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotStubVoidMethodWithAReturnValue("");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?'' is a *void method* and it *cannot* be stubbed with a *return value*!?Voids are usually stubbed with Throwables:?    doThrow(exception).when(mock).someVoidMethod();?If the method you are trying to stub is *overloaded* then make sure you are calling the right overloaded version.?This exception might also occur when somewhere in your test you are stubbing *final methods*.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.moreThanOneAnnotationNotAllowed("hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: You cannot have more than one Mockito annotation on a field!?The field 'hi!' has multiple Mockito annotations.?For info how to use annotations see examples in javadoc for MockitoAnnotations class.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.unsupportedCombinationOfAnnotations("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: This combination of annotations is not permitted on a single field:?@ and @hi!");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.notAMockPassedToWhenMethod();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to when() is not a mock!?Example of correct stubbing:?    doThrow(new RuntimeException()).when(mock).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Discrepancy discrepancy1 = null;
        org.mockito.exceptions.PrintableInvocation printableInvocation2 = null;
        org.mockito.internal.debugging.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooLittleActualInvocations(discrepancy1, printableInvocation2, location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.invocation.Invocation invocation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.noMoreInteractionsWantedInOrder(invocation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 10, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls returnsSmartNulls1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls();
        java.lang.Class<?> wildcardClass2 = returnsSmartNulls1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.notAMockPassedToVerify((java.lang.Class) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type ReturnsSmartNulls and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(100, (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.unsupportedCombinationOfAnnotations("", "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: This combination of annotations is not permitted on a single field:?@ and @");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.moreThanOneAnnotationNotAllowed("");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: You cannot have more than one Mockito annotation on a field!?The field '' has multiple Mockito annotations.?For info how to use annotations see examples in javadoc for MockitoAnnotations class.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 100, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.argumentsAreDifferent("hi!", "hi!", location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.unfinishedStubbing(location1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 100, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wantedButNotInvoked(printableInvocation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.argumentsAreDifferent("", "hi!", location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 10, (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotVerifyToString();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Mockito cannot verify toString()?toString() is too often used behind of scenes  (i.e. during String concatenation, in IDE debugging views). Verifying it may give inconsistent or hard to understand results. Not to mention that verifying toString() most likely hints awkward design (hard to explain in a short exception message. Trust me...)?However, it is possible to stub toString(). Stubbing toString() smells a bit funny but there are rare, legitimate use cases.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.extraInterfacesDoesNotAcceptNullParameters();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?extraInterfaces() does not accept null parameters.");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 1, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 100, (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ?hi! cannot be returned by ()?() should return hi!?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.Exception exception2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInitializeForInjectMocksAnnotation("hi!", exception2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.unsupportedCombinationOfAnnotations("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: This combination of annotations is not permitted on a single field:?@hi! and @hi!");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ? cannot be returned by ()?() should return hi!?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?35 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) ' ', (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(1, (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(10, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(0, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 1, 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 0, (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ? cannot be returned by hi!()?hi!() should return hi!?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.notAMockPassedToVerify((java.lang.Class) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Object and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 10, 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) 'a', (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ?hi! cannot be returned by ()?() should return ?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 100, (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) ' ', (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        java.lang.Exception exception2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.cannotInitializeForSpyAnnotation("", exception2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) 'a', 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.Location location3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.argumentsAreDifferent("", "", location3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 35 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 10, (int) 'a', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 10, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) -1, (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(1, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.invocation.Invocation invocation1 = null;
        java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation> verificationAwareInvocationList2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.noMoreInteractionsWanted(invocation1, verificationAwareInvocationList2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 0, (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?97 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(1, (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.wrongTypeOfReturnValue("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.WrongTypeOfReturnValue; message: ? cannot be returned by hi!()?hi!() should return ?***?This exception *might* occur in wrongly written multi-threaded tests.?Please refer to Mockito FAQ on limitations of concurrency testing.?");
        } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(100, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(1, (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 0, 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 100, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(10, 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '4', (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((-1), (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 1, (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 52 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) -1, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((-1), (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) 'a', (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(100, (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) ' ', (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 97 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 0, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 100, (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 1, (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?97 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 1, (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 1, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '4', 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) ' ', 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) -1, (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(100, 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?32 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '#', (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?97 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(1, (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(1, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 1, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) -1, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 32 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(100, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 100, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(0, 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 1, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 100, (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((-1), 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?35 matchers expected, 52 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) ' ', 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) -1, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?52 matchers expected, 52 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 10, (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 100, (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 1, (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(10, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) ' ', 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 1, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 100, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) -1, (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '#', 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) -1, (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(10, (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?97 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '#', (int) 'a', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?32 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 1, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 10, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) -1, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 100, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(10, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) -1, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 100, (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) -1, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 0, (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 0, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 10, (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '#', (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(100, (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 0, (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(10, (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '4', (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 0, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) -1, (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(100, (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 100, (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 0, 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 97 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(1, (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?97 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 0, 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 100, (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(0, 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 0, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '#', (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) ' ', 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((-1), (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(10, 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(10, 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 100, 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '4', (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(0, 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) 'a', (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(0, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '#', 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?35 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(0, 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '#', (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 97 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 0, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 32 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '#', (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(0, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((-1), (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '4', (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) -1, (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) -1, (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 0, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 1, (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 1, (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 35 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?97 matchers expected, 32 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) -1, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 10, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(10, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 35 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) ' ', (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?32 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '#', 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 100, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 100, 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '#', (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 100, (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?52 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) -1, 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 0, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 100, (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) -1, (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) ' ', (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) -1, (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) 'a', (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(100, 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 1, 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((-1), (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 10, (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?97 matchers expected, 52 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) 'a', 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 10, (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(100, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) -1, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 1, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 10, (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 1, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(10, (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) -1, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 35 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) -1, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 0, (int) 'a', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?32 matchers expected, 97 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 35 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 1, 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((-1), 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(10, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 35 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 0, (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 0, (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 1, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(100, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) -1, 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) ' ', (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?97 matchers expected, 97 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?52 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 1, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?35 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(1, 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((-1), (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) 'a', (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 100, (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '4', 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?52 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) ' ', (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 35 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) -1, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) -1, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 1, (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 52 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?97 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(1, 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) 'a', 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 52 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) ' ', 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '#', 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 100, (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(10, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) ' ', (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) -1, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((-1), (int) 'a', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) -1, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 97 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 1, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 10, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((-1), 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '4', (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '4', (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 100, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(1, (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) ' ', (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((-1), (int) 'a', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 10, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(10, (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) -1, (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) ' ', 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(10, 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) 'a', (int) 'a', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 10, (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 32 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 0, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) ' ', (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 10, (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?97 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) 'a', (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 1, (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 10, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 100, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 0, (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 32 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 1, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?32 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?35 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?52 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(10, 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) 'a', (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '#', (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 0, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 100, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '4', 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 1, (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(1, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((-1), (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((-1), (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?97 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) ' ', (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 100, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 0, (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) 'a', (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(1, (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 10, (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 0, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 100, (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 10, (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(0, (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(10, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 52 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((-1), (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(10, 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '4', 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 1, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) -1, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?52 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 0, (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '#', (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 100, 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) ' ', (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?35 matchers expected, 32 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?97 matchers expected, 35 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 100, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?32 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(1, (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(0, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(10, (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(0, (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 1, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(1, 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 1, (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 10, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '4', (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(1, 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '4', (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 0, (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 0, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 1, (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '4', 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 10, (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 52 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) ' ', (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) -1, (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(100, (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 1, (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 100, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 100, (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(10, (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(0, (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 0, (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 1, (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 10, 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 100, (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 1, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?35 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 0, 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(0, (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 100, (int) 'a', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 0, (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 100, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 100, (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 100, (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 0, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(10, (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 32 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 100, (int) 'a', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '4', (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

