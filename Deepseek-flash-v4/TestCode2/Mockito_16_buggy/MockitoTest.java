package org.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.stubbing.answers.*;
import org.mockito.internal.verification.api.VerificationMode;
import org.mockito.stubbing.*;

import java.util.List;

import static org.junit.Assert.*;

public class MockitoTest {

    private List<?> mockList;

    @Before
    public void setUp() {
        mockList = Mockito.mock(List.class);
    }

    @Test
    public void testMockClass() {
        assertNotNull(mockList);
        assertTrue(mockList instanceof List);
    }

    @Test
    public void testMockClassWithName() {
        List<?> namedMock = Mockito.mock(List.class, "myList");
        assertNotNull(namedMock);
    }

    @Test
    public void testMockClassWithAnswer() {
        List<?> answerMock = Mockito.mock(List.class, Mockito.RETURNS_DEFAULTS);
        assertNotNull(answerMock);
    }

    @Test(expected = NullPointerException.class)
    public void testMockNullClass() {
        Mockito.mock((Class<?>) null);
    }

    @Test(expected = NullPointerException.class)
    public void testMockNullName() {
        Mockito.mock(List.class, (String) null);
    }

    @Test(expected = NullPointerException.class)
    public void testMockNullAnswer() {
        Mockito.mock(List.class, (Answer) null);
    }

    @Test(expected = NullPointerException.class)
    public void testMockNullSettings() {
        Mockito.mock(List.class, (MockSettings) null);
    }

    @Test
    public void testSpy() {
        Object spied = Mockito.spy(new Object());
        assertNotNull(spied);
    }

    @Test(expected = NullPointerException.class)
    public void testSpyNull() {
        Mockito.spy(null);
    }

    @Test
    public void testStub() {
        DeprecatedOngoingStubbing<?> stubbing = Mockito.stub(mockList.size());
        assertNotNull(stubbing);
    }

    @Test
    public void testWhen() {
        OngoingStubbing<?> stubbing = Mockito.when(mockList.size());
        assertNotNull(stubbing);
    }

    @Test
    public void testVerify() {
        mockList.toString();
        Mockito.verify(mockList);
    }

    @Test
    public void testVerifyWithMode() {
        mockList.toString();
        Mockito.verify(mockList, Mockito.times(1));
    }

    @Test
    public void testVerifyFailure() {
        mockList.toString();
        try {
            Mockito.verify(mockList, Mockito.times(2));
            fail("Should have thrown exception");
        } catch (RuntimeException e) {
        }
    }

    @Test
    public void testReset() {
        mockList.toString();
        Mockito.reset(mockList);
        Mockito.verifyZeroInteractions(mockList);
    }

    @Test
    public void testResetEmpty() {
        Mockito.reset();
    }

    @Test
    public void testVerifyNoMoreInteractionsNone() {
        Mockito.verifyNoMoreInteractions(mockList);
    }

    @Test
    public void testVerifyZeroInteractions() {
        Mockito.verifyZeroInteractions(mockList);
    }

    @Test
    public void testStubVoid() {
        VoidMethodStubbable<?> stubbable = Mockito.stubVoid(mockList);
        assertNotNull(stubbable);
    }

    @Test
    public void testDoThrow() {
        Stubber stubber = Mockito.doThrow(new RuntimeException());
        assertNotNull(stubber);
    }

    @Test
    public void testDoCallRealMethod() {
        Stubber stubber = Mockito.doCallRealMethod();
        assertNotNull(stubber);
    }

    @Test
    public void testDoAnswer() {
        Stubber stubber = Mockito.doAnswer(new Returns("value"));
        assertNotNull(stubber);
    }

    @Test
    public void testDoNothing() {
        Stubber stubber = Mockito.doNothing();
        assertNotNull(stubber);
    }

    @Test
    public void testDoReturn() {
        Stubber stubber = Mockito.doReturn("value");
        assertNotNull(stubber);
    }

    @Test
    public void testInOrder() {
        InOrder order = Mockito.inOrder(mockList);
        assertNotNull(order);
    }

    @Test
    public void testInOrderEmpty() {
        InOrder order = Mockito.inOrder();
        assertNotNull(order);
    }

    @Test
    public void testVerificationModes() {
        assertNotNull(Mockito.times(0));
        assertNotNull(Mockito.times(1));
        assertNotNull(Mockito.times(2));
        assertNotNull(Mockito.never());
        assertNotNull(Mockito.atLeastOnce());
        assertNotNull(Mockito.atLeast(1));
        assertNotNull(Mockito.atLeast(0));
        assertNotNull(Mockito.atMost(1));
        assertNotNull(Mockito.atMost(0));
        assertNotNull(Mockito.only());
    }

    @Test
    public void testValidateMockitoUsage() {
        Mockito.validateMockitoUsage();
    }

    @Test
    public void testWithSettings() {
        MockSettings settings = Mockito.withSettings();
        assertNotNull(settings);
    }

    @Test
    public void testDebug() {
        MockitoDebugger debugger = Mockito.debug();
        assertNotNull(debugger);
    }
}