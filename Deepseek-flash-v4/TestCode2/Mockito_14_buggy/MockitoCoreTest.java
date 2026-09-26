package org.mockito.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.internal.verification.api.InOrderContext;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.Stubber;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.verification.VerificationMode;

@SuppressWarnings({"deprecation", "unchecked", "rawtypes"})
public class MockitoCoreTest {

    private MockitoCore core;
    private Foo foo;

    interface Foo {
        String bar();
        void doSomething();
    }

    @Before
    public void setUp() {
        core = new MockitoCore();
        foo = core.mock(Foo.class, new MockSettingsImpl());
    }

    @After
    public void tearDown() {
        core.validateMockitoUsage();
    }

    @Test
    public void testMockCreatesMock() {
        assertNotNull(foo);
        assertTrue(foo instanceof Foo);
    }

    @Test
    public void testStubWithoutOngoingStubbingThrows() {
        try {
            core.stub();
            fail("Expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testDeprecatedStubWithoutMethodCallThrows() {
        try {
            core.stub("not a stubbing");
            fail("Expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testWhenReturnsOngoingStubbingAndStubs() {
        OngoingStubbing<String> stubbing = core.when(foo.bar());
        stubbing.thenReturn("stubbed");
        assertEquals("stubbed", foo.bar());
    }

    @Test
    public void testVerifyNullThrows() {
        try {
            core.verify((Object) null, VerificationModeFactory.times(1));
            fail("Expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testVerifyNonMockThrows() {
        try {
            core.verify("notMock", VerificationModeFactory.times(1));
            fail("Expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testVerifyWithMock() {
        foo.bar();
        Foo verified = core.verify(foo, VerificationModeFactory.times(1));
        assertSame(foo, verified);
        verified.bar();
    }

    @Test
    public void testReset() {
        core.reset(foo);
        core.reset();
        assertNotNull(foo);
    }

    @Test
    public void testVerifyNoMoreInteractionsNullArrayThrows() {
        try {
            core.verifyNoMoreInteractions((Object[]) null);
            fail("Expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsEmptyThrows() {
        try {
            core.verifyNoMoreInteractions(new Object[0]);
            fail("Expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsWithMock() {
        core.verifyNoMoreInteractions(foo);
    }

    @Test
    public void testVerifyNoMoreInteractionsNullElementThrows() {
        try {
            core.verifyNoMoreInteractions(new Object[] { null });
            fail("Expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsNotAMockThrows() {
        try {
            core.verifyNoMoreInteractions("notMock");
            fail("Expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsInOrder() {
        InOrderContext context = (InOrderContext) core.inOrder(foo);
        core.verifyNoMoreInteractionsInOrder(Arrays.<Object>asList(foo), context);
    }

    @Test
    public void testInOrderNullArrayThrows() {
        try {
            core.inOrder((Object[]) null);
            fail("Expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testInOrderEmptyThrows() {
        try {
            core.inOrder();
            fail("Expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testInOrderNullElementThrows() {
        try {
            core.inOrder(new Object[] { null });
            fail("Expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testInOrderNotAMockThrows() {
        try {
            core.inOrder("notMock");
            fail("Expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testInOrderReturnsInOrder() {
        InOrder inOrder = core.inOrder(foo);
        assertNotNull(inOrder);
    }

    @Test
    public void testDoAnswer() {
        Answer<String> answer = new Answer<String>() {
            public String answer(InvocationOnMock invocation) {
                return "stubbed";
            }
        };
        Stubber stubber = core.doAnswer(answer);
        stubber.when(foo).bar();
        assertEquals("stubbed", foo.bar());
    }

    @Test
    public void testStubVoid() {
        VoidMethodStubbable<Foo> stubbable = core.stubVoid(foo);
        stubbable.toThrow(new RuntimeException("boom")).on().doSomething();
        try {
            foo.doSomething();
            fail("Expected exception");
        } catch (RuntimeException expected) {
            assertEquals("boom", expected.getMessage());
        }
    }

    @Test
    public void testValidateMockitoUsage() {
        core.validateMockitoUsage();
    }

    @Test
    public void testGetLastInvocation() {
        foo.bar();
        Invocation invocation = core.getLastInvocation();
        assertNotNull(invocation);
        assertEquals("bar", invocation.getMethod().getName());
    }
}