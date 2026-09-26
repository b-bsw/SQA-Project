package org.apache.commons.math.ode.nonstiff;

import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.events.CombinedEventsManager;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RungeKuttaIntegratorTest {

    private static class ConstantDerivativeEquation implements FirstOrderDifferentialEquations {
        private final int dimension;

        ConstantDerivativeEquation(int dimension) {
            this.dimension = dimension;
        }

        public int getDimension() {
            return dimension;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) {
            if (dimension > 0) {
                yDot[0] = 1.0;
            }
        }
    }

    private static class CountingStepHandler implements StepHandler {
        int resetCount;
        int handleCount;
        boolean lastIsLast;

        public boolean requiresDenseOutput() {
            return false;
        }

        public void reset() {
            resetCount++;
        }

        public void handleStep(StepInterpolator interpolator, boolean isLast) {
            handleCount++;
            lastIsLast = isLast;
        }
    }

    private static class DenseOutputStepHandler implements StepHandler {
        int handleCount;

        public boolean requiresDenseOutput() {
            return true;
        }

        public void reset() {
        }

        public void handleStep(StepInterpolator interpolator, boolean isLast) {
            handleCount++;
        }
    }

    private static class FakeEventsManager extends CombinedEventsManager {
        private final double eventTime;
        private int evaluateCount;
        private int stepAcceptedCount;

        FakeEventsManager(double eventTime) {
            this.eventTime = eventTime;
        }

        @Override
        public boolean evaluateStep(StepInterpolator interpolator) {
            return ++evaluateCount == 1;
        }

        @Override
        public double getEventTime() {
            return eventTime;
        }

        @Override
        public void stepAccepted(double t, double[] y) {
            stepAcceptedCount++;
        }

        @Override
        public boolean stop() {
            return stepAcceptedCount >= 1;
        }

        @Override
        public boolean reset(double t, double[] y) {
            return false;
        }
    }

    private static class ExposedEulerIntegrator extends EulerIntegrator {
        private CombinedEventsManager forcedManager;

        ExposedEulerIntegrator(double step) {
            super(step);
        }

        void setEventsManager(CombinedEventsManager manager) {
            forcedManager = manager;
        }

        @Override
        public CombinedEventsManager addEndTimeChecker(double t0, double t,
                                                       CombinedEventsManager manager) {
            if (forcedManager != null) {
                return forcedManager;
            }
            return super.addEndTimeChecker(t0, t, manager);
        }
    }

    @Test
    public void testForwardIntegrationCopiesToOutput() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.25);
        double[] y0 = {0.0};
        double[] y = {123.0};

        double stopTime = integrator.integrate(
            new ConstantDerivativeEquation(1), 0.0, y0, 1.0, y);

        assertEquals(1.0, stopTime, 1.0e-12);
        assertEquals(1.0, y[0], 1.0e-12);
        assertEquals(0.0, y0[0], 0.0);
    }

    @Test
    public void testBackwardIntegration() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.25);
        double[] y0 = {0.0};
        double[] y = {123.0};

        double stopTime = integrator.integrate(
            new ConstantDerivativeEquation(1), 0.0, y0, -1.0, y);

        assertEquals(-1.0, stopTime, 1.0e-12);
        assertEquals(-1.0, y[0], 1.0e-12);
    }

    @Test
    public void testIntegrationInPlaceUsesSameArray() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.5);
        double[] y = {0.0};

        double stopTime = integrator.integrate(
            new ConstantDerivativeEquation(1), 0.0, y, 1.0, y);

        assertEquals(1.0, stopTime, 1.0e-12);
        assertEquals(1.0, y[0], 1.0e-12);
    }

    @Test
    public void testEmptyStateVector() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.25);
        double[] y0 = {};
        double[] y = {};

        double stopTime = integrator.integrate(
            new ConstantDerivativeEquation(0), 0.0, y0, 1.0, y);

        assertEquals(1.0, stopTime, 1.0e-12);
    }

    @Test
    public void testStepHandlerReceivesResetAndHandle() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.25);
        CountingStepHandler handler = new CountingStepHandler();
        integrator.addStepHandler(handler);
        double[] y = {0.0};

        integrator.integrate(
            new ConstantDerivativeEquation(1), 0.0, new double[]{0.0}, 1.0, y);

        assertEquals(1, handler.resetCount);
        assertEquals(4, handler.handleCount);
        assertTrue(handler.lastIsLast);
    }

    @Test
    public void testDenseOutputUsesRungeKuttaInterpolator() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.5);
        DenseOutputStepHandler handler = new DenseOutputStepHandler();
        integrator.addStepHandler(handler);
        double[] y = {0.0};

        double stopTime = integrator.integrate(
            new ConstantDerivativeEquation(1), 0.0, new double[]{0.0}, 1.0, y);

        assertEquals(1.0, stopTime, 1.0e-12);
        assertEquals(1.0, y[0], 1.0e-12);
        assertEquals(2, handler.handleCount);
    }

    @Test
    public void testEventAtStepStartUsesZeroSizeStepBranch() throws Exception {
        ExposedEulerIntegrator integrator = new ExposedEulerIntegrator(0.25);
        integrator.setEventsManager(new FakeEventsManager(0.0));
        double[] y = {0.0};

        double stopTime = integrator.integrate(
            new ConstantDerivativeEquation(1), 0.0, new double[]{0.0}, 1.0, y);

        assertEquals(0.25, stopTime, 1.0e-12);
        assertEquals(0.25, y[0], 1.0e-12);
    }

    @Test
    public void testEventStepRejectedToMatchSwitchTime() throws Exception {
        ExposedEulerIntegrator integrator = new ExposedEulerIntegrator(0.25);
        integrator.setEventsManager(new FakeEventsManager(0.125));
        double[] y = {0.0};

        double stopTime = integrator.integrate(
            new ConstantDerivativeEquation(1), 0.0, new double[]{0.0}, 1.0, y);

        assertEquals(0.125, stopTime, 1.0e-12);
        assertEquals(0.125, y[0], 1.0e-12);
    }

    @Test(expected = IntegratorException.class)
    public void testDimensionMismatchThrowsIntegratorException() throws Exception {
        EulerIntegrator integrator = new EulerIntegrator(0.25);
        integrator.integrate(
            new ConstantDerivativeEquation(2), 0.0, new double[]{0.0}, 1.0, new double[]{0.0});
    }
}