package org.mockito.internal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.progress.IOngoingStubbing;
import org.mockito.internal.stubbing.StubberImpl;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.internal.verification.api.VerificationMode;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.DeprecatedOngoingStubbing;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.VoidMethodStubbable;

import static org.junit.Assert.*;

public class MockitoCoreTest {

    private MockitoCore mockitoCore;

    @Before
    public void setUp() {
        mockitoCore = new MockitoCore();
    }

    private <T> T createMock(Class<T> classToMock) {
        return mockitoCore.mock(classToMock, new MockSettingsImpl());
    }

    private VerificationMode mockMode() {
        return new VerificationMode() {
            @Override
            public void verify(VerificationData data) {
            }

            @Override
            public VerificationMode description(String description) {
                return this;
            }
        };
    }

    @Test(expected = RuntimeException.class)
    public void testStub_WithoutOngoingStubbing_ThrowsException() {
        mockitoCore.stub();
    }

    @Test
    public void testStub_WithOngoingStubbing_ReturnsNonNull() {
        Object mock = createMock(Object.class);
        mock.toString();
        IOngoingStubbing stubbing = mockitoCore.stub();
        assertNotNull(stubbing);
    }

    @Test(expected = RuntimeException.class)
    public void testWhen_WithoutPreviousInvocation_ThrowsException() {
        mockitoCore.when("anything");
    }

    @Test
    public void testWhen_WithOngoingStubbing_ReturnsOngoingStubbing() {
        Object mock = createMock(Object.class);
        mock.toString();
        OngoingStubbing<?> ongoing = mockitoCore.when(mock.toString());
        assertNotNull(ongoing);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testStub_Deprecated_WithInvocation_ReturnsDeprecatedOngoingStubbing() {
        Object mock = createMock(Object.class);
        DeprecatedOngoingStubbing stubbing = mockitoCore.stub(mock.toString());
        assertNotNull(stubbing);
    }

    @Test(expected = RuntimeException.class)
    public void testVerify_NullMock_ThrowsException() {
        mockitoCore.verify(null, mockMode());
    }

    @Test(expected = NotAMockException.class)
    public void testVerify_NonMock_ThrowsNotAMockException() {
        mockitoCore.verify("not a mock", mockMode());
    }

    @Test
    public void testVerify_ValidMock_ReturnsMock() {
        Object mock = createMock(Object.class);
        Object result = mockitoCore.verify(mock, mockMode());
        assertSame(mock, result);
    }

    @Test
    public void testReset_EmptyArray_NoException() {
        mockitoCore.reset();
    }

    @Test
    public void testReset_OneMock_Success() {
        Object mock = createMock(Object.class);
        mockitoCore.reset(mock);
    }

    @Test
    public void testReset_MultipleMocks_Success() {
        Object mock1 = createMock(Object.class);
        Object mock2 = createMock(Object.class);
        mockitoCore.reset(mock1, mock2);
    }

    @Test(expected = RuntimeException.class)
    public void testVerifyNoMoreInteractions_NullArray_ThrowsException() {
        mockitoCore.verifyNoMoreInteractions((Object[]) null);
    }

    @Test(expected = RuntimeException.class)
    public void testVerifyNoMoreInteractions_EmptyArray_ThrowsException() {
        mockitoCore.verifyNoMoreInteractions();
    }

    @Test(expected = RuntimeException.class)
    public void testVerifyNoMoreInteractions_NullElement_ThrowsException() {
        Object mock = createMock(Object.class);
        mockitoCore.verifyNoMoreInteractions(mock, null);
    }

    @Test(expected = NotAMockException.class)
    public void testVerifyNoMoreInteractions_NonMockElement_ThrowsNotAMockException() {
        mockitoCore.verifyNoMoreInteractions("not mock");
    }

    @Test
    public void testVerifyNoMoreInteractions_ValidMocks_Passes() {
        Object mock1 = createMock(Object.class);
        Object mock2 = createMock(Object.class);
        mockitoCore.verifyNoMoreInteractions(mock1, mock2);
    }

    @Test(expected = RuntimeException.class)
    public void testInOrder_NullArray_ThrowsException() {
        mockitoCore.inOrder((Object[]) null);
    }

    @Test(expected = RuntimeException.class)
    public void testInOrder_EmptyArray_ThrowsException() {
        mockitoCore.inOrder();
    }

    @Test(expected = RuntimeException.class)
    public void testInOrder_NullElement_ThrowsException() {
        Object mock = createMock(Object.class);
        mockitoCore.inOrder(mock, null);
    }

    @Test(expected = NotAMockException.class)
    public void testInOrder_NonMockElement_ThrowsNotAMockException() {
        mockitoCore.inOrder("not mock");
    }

    @Test
    public void testInOrder_ValidMocks_ReturnsInOrder() {
        Object mock1 = createMock(Object.class);
        Object mock2 = createMock(Object.class);
        InOrder inOrder = mockitoCore.inOrder(mock1, mock2);
        assertNotNull(inOrder);
    }

    @Test
    public void testDoAnswer_ReturnsStubber() {
        Answer<?> answer = invocation -> null;
        StubberImpl stubber = (StubberImpl) mockitoCore.doAnswer(answer);
        assertNotNull(stubber);
    }

    @Test
    public void testStubVoid_WithMock_ReturnsVoidMethodStubbable() {
        Object mock = createMock(Object.class);
        VoidMethodStubbable stubbable = mockitoCore.stubVoid(mock);
        assertNotNull(stubbable);
    }

    @Test
    public void testValidateMockitoUsage_NoException() {
        mockitoCore.validateMockitoUsage();
    }

    @Test(expected = NullPointerException.class)
    public void testGetLastInvocation_AfterStubConsumed_ThrowsNPE() {
        Object mock = createMock(Object.class);
        mock.toString();
        IOngoingStubbing stubbing = mockitoCore.stub();
        mockitoCore.getLastInvocation();
    }
}