package org.apache.commons.math.ode.events;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.junit.Test;

public class EventStateTest {

    private static class TestEventHandler implements EventHandler {
        private double constant;
        private double linearZero = Double.NaN;
        private int action = EventHandler.CONTINUE;
        private boolean resetCalled = false;
        private int eventOccurredCalls = 0;
        private boolean lastIncreasing = false;

        TestEventHandler(double constant) {
            this.constant = constant;
        }

        TestEventHandler(double linearZero, int action) {
            this.linearZero = linearZero;
            this.action = action;
        }

        public double g(double t, double[] y) {
            if (!Double.isNaN(linearZero)) {
                return t - linearZero;
            }
            return constant;
        }

        public int eventOccurred(double t, double[] y, boolean increasing) {
            eventOccurredCalls++;
            lastIncreasing = increasing;
            return action;
        }

        public void resetState(double t, double[] y) {
            resetCalled = true;
        }
    }

    private static class TestStepInterpolator implements StepInterpolator {
        private double currentTime;
        private boolean forward = true;
        private double[] state = new double[0];

        public void setInterpolatedTime(double time) {
            this.currentTime = time;
        }

        public double getInterpolatedTime() {
            return currentTime;
        }

        public double getCurrentTime() {
            return currentTime;
        }

        public double getPreviousTime() {
            return currentTime - 1.0;
        }

        public boolean isForward() {
            return forward;
        }

        public double[] getInterpolatedState() {
            return state;
        }

        public double[] getInterpolatedDerivatives() {
            return new double[0];
        }

        public void setCurrentTime(double currentTime) {
            this.currentTime = currentTime;
        }

        public void setForward(boolean forward) {
            this.forward = forward;
        }
    }

    private static TestStepInterpolator interpolator(double t, boolean forward) {
        TestStepInterpolator i = new TestStepInterpolator();
        i.setCurrentTime(t);
        i.setForward(forward);
        return i;
    }

    @Test
    public void testConstructorAndGetters() throws Exception {
        TestEventHandler h = new TestEventHandler(1.0);
        EventState state = new EventState(h, 10.0, -0.5, 100);
        assertSame(h, state.getEventHandler());
        assertEquals(10.0, state.getMaxCheckInterval(), 0.0);
        assertEquals(0.5, state.getConvergence(), 0.0);
        assertEquals(100, state.getMaxIterationCount());
        assertTrue(Double.isNaN(state.getEventTime()));
        assertFalse(state.stop());
        assertFalse(state.reset(0.0, new double[] { 0.0 }));
    }

    @Test
    public void testReinitializeBeginAndEvaluateStepNoEvent() throws Exception {
        TestEventHandler h = new TestEventHandler(-1.0);
        EventState state = new EventState(h, 10.0, 0.1, 100);
        state.reinitializeBegin(0.0, new double[0]);
        assertFalse(state.evaluateStep(interpolator(10.0, true)));
        assertTrue(Double.isNaN(state.getEventTime()));
    }

    @Test
    public void testEvaluateStepDetectsEvent() throws Exception {
        EventState state = new EventState(
                new TestEventHandler(1.0, EventHandler.CONTINUE), 10.0, 0.1, 100);
        state.reinitializeBegin(0.0, new double[0]);
        assertTrue(state.evaluateStep(interpolator(2.0, true)));
        assertEquals(1.0, state.getEventTime(), 0.2);
    }

    @Test
    public void testEvaluateStepMultipleSubsteps() throws Exception {
        EventState state = new EventState(
                new TestEventHandler(1.0, EventHandler.CONTINUE), 0.5, 0.1, 100);
        state.reinitializeBegin(0.0, new double[0]);
        assertTrue(state.evaluateStep(interpolator(2.2, true)));
        assertEquals(1.0, state.getEventTime(), 0.2);
    }

    @Test
    public void testEvaluateStepAcceptsAlreadyPendingEvent() throws Exception {
        EventState state = new EventState(
                new TestEventHandler(1.0, EventHandler.CONTINUE), 10.0, 0.1, 100);
        state.reinitializeBegin(0.0, new double[0]);
        assertTrue(state.evaluateStep(interpolator(2.0, true)));
        double eventTime = state.getEventTime();
        assertFalse(state.evaluateStep(interpolator(eventTime, true)));
    }

    @Test
    public void testEvaluateStepIgnoresPastEvent() throws Exception {
        EventState state = new EventState(
                new TestEventHandler(1.0, EventHandler.CONTINUE), 10.0, 0.1, 100);
        state.reinitializeBegin(0.0, new double[0]);
        assertTrue(state.evaluateStep(interpolator(2.0, true)));
        state.stepAccepted(1.0, new double[0]);
        assertFalse(state.evaluateStep(interpolator(0.0, false)));
        assertTrue(Double.isNaN(state.getEventTime()));
    }

    @Test
    public void testStepAcceptedNoPendingEvent() throws Exception {
        TestEventHandler h = new TestEventHandler(1.0);
        EventState state = new EventState(h, 10.0, 0.1, 100);
        state.reinitializeBegin(0.0, new double[0]);
        state.stepAccepted(2.0, new double[0]);
        assertFalse(state.stop());
    }

    @Test
    public void testStepAcceptedPendingEventStop() throws Exception {
        TestEventHandler h = new TestEventHandler(1.0, EventHandler.STOP);
        EventState state = new EventState(h, 10.0, 0.1, 100);
        state.reinitializeBegin(0.0, new double[0]);
        assertTrue(state.evaluateStep(interpolator(2.0, true)));
        state.stepAccepted(1.0, new double[0]);
        assertTrue(state.stop());
        assertEquals(1, h.eventOccurredCalls);
        assertTrue(h.lastIncreasing);
    }

    @Test
    public void testResetState() throws Exception {
        TestEventHandler h = new TestEventHandler(1.0, EventHandler.RESET_STATE);
        EventState state = new EventState(h, 10.0, 0.1, 100);
        state.reinitializeBegin(0.0, new double[0]);
        assertTrue(state.evaluateStep(interpolator(2.0, true)));
        state.stepAccepted(1.0, new double[0]);
        assertTrue(state.reset(0.0, new double[] { 1.0 }));
        assertTrue(h.resetCalled);
        assertTrue(Double.isNaN(state.getEventTime()));
    }

    @Test(expected = EventException.class)
    public void testReinitializeBeginPropagatesEventException() throws Exception {
        EventState state = new EventState(new EventHandler() {
            public double g(double t, double[] y) throws EventException {
                throw new EventException(new RuntimeException("boom"));
            }

            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.CONTINUE;
            }

            public void resetState(double t, double[] y) {
            }
        }, 10.0, 0.1, 100);
        state.reinitializeBegin(0.0, new double[0]);
    }

    @Test(expected = EventException.class)
    public void testEvaluateStepPropagatesEventException() throws Exception {
        EventState state = new EventState(new EventHandler() {
            public double g(double t, double[] y) throws EventException {
                if (t > 0.5) {
                    throw new EventException(new RuntimeException("boom"));
                }
                return -1.0;
            }

            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.CONTINUE;
            }

            public void resetState(double t, double[] y) {
            }
        }, 10.0, 0.1, 100);
        state.reinitializeBegin(0.0, new double[0]);
        state.evaluateStep(interpolator(2.0, true));
    }
}