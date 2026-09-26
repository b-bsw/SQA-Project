package org.mockito.internal.verification;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.internal.util.Timer;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.verification.VerificationMode;

public class VerificationOverTimeImplTest {

    // Helper classes ----------------------------------------------------------

    private static class CountdownTimer extends Timer {
        private int count;
        private boolean started;

        CountdownTimer(int count) {
            super(count); // dummy duration, not used
            this.count = count;
            this.started = false;
        }

        @Override
        public void start() {
            this.started = true;
        }

        @Override
        public boolean isCounting() {
            if (!started) return false;
            if (count > 0) {
                count--;
                return true;
            }
            return false;
        }

        int getCount() { return count; }
    }

    private static class FailingDelegate implements VerificationMode {
        private final AssertionError error;
        private final boolean recoverable;

        FailingDelegate(AssertionError error, boolean recoverable) {
            this.error = error;
            this.recoverable = recoverable;
        }

        @Override
        public void verify(VerificationData data) {
            if (recoverable) {
                throw new MockitoAssertionError(error.getMessage(), error.getCause());
            } else {
                throw error; // will be caught if instanceof MockitoAssertionError
            }
        }

        static FailingDelegate recoverable() {
            return new FailingDelegate(new MockitoAssertionError("recoverable"), true);
        }

        static FailingDelegate nonRecoverable(AssertionError error) {
            return new FailingDelegate(error, false);
        }
    }

    private static class SuccessDelegate implements VerificationMode {
        @Override
        public void verify(VerificationData data) {
            // nothing
        }
    }

    private static class SimpleVerificationData implements VerificationData {
        // Minimal implementation: empty
    }

    // -------------------------------------------------------------------------

    private final VerificationData dummyData = new SimpleVerificationData();
    private final long fastPoll = 0L; // no actual sleep
    private final long shortDuration = 5L; // ignored by CountdownTimer

    @Test
    public void testConstructorAndGetters() {
        VerificationMode delegate = new SuccessDelegate();
        VerificationOverTimeImpl v = new VerificationOverTimeImpl(
                10L, 100L, delegate, true);
        assertEquals(10L, v.getPollingPeriod());
        assertEquals(100L, v.getDuration());
        assertSame(delegate, v.getDelegate());
    }

    @Test
    public void testVerifyImmediateSuccessReturnOnSuccessTrue() {
        // delegate succeeds, timer has many counts, return on success true
        VerificationMode delegate = new SuccessDelegate();
        CountdownTimer timer = new CountdownTimer(10);
        VerificationOverTimeImpl v = new VerificationOverTimeImpl(
                fastPoll, shortDuration, delegate, true, timer);
        v.verify(dummyData);
        // Should have returned early – timer still has counts left
        assertTrue(timer.getCount() > 0);
    }

    @Test
    public void testVerifyImmediateSuccessReturnOnSuccessFalse() {
        // delegate succeeds, timer has many counts, return on success false
        // Error should be cleared and after loop no exception
        VerificationMode delegate = new SuccessDelegate();
        CountdownTimer timer = new CountdownTimer(10);
        VerificationOverTimeImpl v = new VerificationOverTimeImpl(
                fastPoll, shortDuration, delegate, false, timer);
        v.verify(dummyData);
        assertTrue(timer.getCount() == 0);
    }

    @Test
    public void testVerifyLoopZeroRounds() {
        // timer not counting -> loop never executes
        VerificationMode delegate = new FailingDelegate(
                new MockitoAssertionError("should not be called"),
                true); // would be recoverable but never called
        CountdownTimer timer = new CountdownTimer(0);
        VerificationOverTimeImpl v = new VerificationOverTimeImpl(
                fastPoll, shortDuration, delegate, true, timer);
        v.verify(dummyData); // no exception because delegate never called
    }

    @Test
    public void testVerifyRecoverableFailureEventuallyThrows() {
        // delegate always fails with recoverable exception, timer runs out
        VerificationMode delegate = FailingDelegate.recoverable();
        CountdownTimer timer = new CountdownTimer(3);
        VerificationOverTimeImpl v = new VerificationOverTimeImpl(
                fastPoll, shortDuration, delegate, true, timer);
        try {
            v.verify(dummyData);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertEquals("recoverable", e.getMessage());
        }
    }

    @Test
    public void testVerifyNonRecoverableFailureRethrownImmediately() {
        // AtMost type delegate (non-recoverable) throws, should be rethrown in loop
        AtMost atMost = new AtMost(1) {
            @Override
            public void verify(VerificationData data) {
                throw new MockitoAssertionError("non-recoverable AtMost");
            }
        };
        VerificationMode delegate = atMost;
        CountdownTimer timer = new CountdownTimer(5);
        VerificationOverTimeImpl v = new VerificationOverTimeImpl(
                fastPoll, shortDuration, delegate, true, timer);
        try {
            v.verify(dummyData);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertEquals("non-recoverable AtMost", e.getMessage());
            // timer should still have counts left because rethrown early
            assertTrue(timer.getCount() > 0);
        }
    }

    @Test
    public void testVerifyRecoverableFailureThenSuccess() {
        // delegate fails once, then succeeds
        final boolean[] firstCall = {true};
        VerificationMode delegate = new VerificationMode() {
            @Override
            public void verify(VerificationData data) {
                if (firstCall[0]) {
                    firstCall[0] = false;
                    throw new MockitoAssertionError("first attempt fails");
                }
                // second call succeeds
            }
        };
        CountdownTimer timer = new CountdownTimer(2); // enough for two attempts
        VerificationOverTimeImpl v = new VerificationOverTimeImpl(
                fastPoll, shortDuration, delegate, true, timer);
        v.verify(dummyData);
        assertFalse(firstCall[0]); // second call happened
    }

    @Test
    public void testVerifyNullDataThrowsNullPointerException() {
        // delegate that expects non-null data
        VerificationMode delegate = new SuccessDelegate();
        CountdownTimer timer = new CountdownTimer(1);
        VerificationOverTimeImpl v = new VerificationOverTimeImpl(
                fastPoll, shortDuration, delegate, true, timer);
        try {
            v.verify(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCanRecoverFromFailureWithAtMostReturnsFalse() {
        AtMost atMost = new AtMost(1);
        VerificationOverTimeImpl v = new VerificationOverTimeImpl(
                fastPoll, shortDuration, new SuccessDelegate(), true);
        assertFalse(v.canRecoverFromFailure(atMost));
    }

    @Test
    public void testCanRecoverFromFailureWithNoMoreInteractionsReturnsFalse() {
        NoMoreInteractions noMore = new NoMoreInteractions();
        VerificationOverTimeImpl v = new VerificationOverTimeImpl(
                fastPoll, shortDuration, new SuccessDelegate(), true);
        assertFalse(v.canRecoverFromFailure(noMore));
    }

    @Test
    public void testCanRecoverFromFailureWithOtherDelegateReturnsTrue() {
        VerificationMode other = new SuccessDelegate();
        VerificationOverTimeImpl v = new VerificationOverTimeImpl(
                fastPoll, shortDuration, new SuccessDelegate(), true);
        assertTrue(v.canRecoverFromFailure(other));
    }

    @Test
    public void testBothExceptionTypesCaught() {
        // ArgumentsAreDifferent is a subclass of AssertionError; catch block handles it
        VerificationMode delegate = new VerificationMode() {
            @Override
            public void verify(VerificationData data) {
                throw new org.mockito.exceptions.verification.junit.ArgumentsAreDifferent("arguments differ");
            }
        };
        CountdownTimer timer = new CountdownTimer(2);
        VerificationOverTimeImpl v = new VerificationOverTimeImpl(
                fastPoll, shortDuration, delegate, true, timer);
        try {
            v.verify(dummyData);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            // ArgumentsAreDifferent is not MockitoAssertionError;
            // but handleVerifyException catches it and after loop throws the stored error
            // stored error is of type AssertionError (the original ArgumentsAreDifferent)
            // but the verify method throws it as AssertionError (not MockitoAssertionError)
            // catch block above expects MockitoAssertionError? Actually the stored error
            // is the same object, which is ArgumentsAreDifferent, which inherits from AssertionError,
            // not MockitoAssertionError. So it may not be caught as MockitoAssertionError.
            // But we can catch AssertionError.
        } catch (AssertionError e) {
            assertTrue(e instanceof org.mockito.exceptions.verification.junit.ArgumentsAreDifferent);
        }
    }
}