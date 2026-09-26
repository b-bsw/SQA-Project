package org.apache.commons.math3.ode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Collection;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.junit.Before;
import org.junit.Test;

public class AbstractIntegratorTest {

    private TestIntegrator integrator;

    @Before
    public void setUp() {
        integrator = new TestIntegrator("test");
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("test", integrator.getName());
        assertTrue(integrator.getStepHandlers().isEmpty());
        assertTrue(integrator.getEventHandlers().isEmpty());
        assertTrue(Double.isNaN(integrator.getCurrentStepStart()));
        assertTrue(Double.isNaN(integrator.getCurrentSignedStepsize()));
        assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());
        assertEquals(0, integrator.getEvaluations());
    }

    @Test
    public void testNullNameConstructor() {
        TestIntegrator anon = new TestIntegrator();
        assertNull(anon.getName());
    }

    @Test
    public void testStepHandlersManagement() {
        DummyStepHandler h1 = new DummyStepHandler();
        DummyStepHandler h2 = new DummyStepHandler();
        integrator.addStepHandler(h1);
        integrator.addStepHandler(h2);
        Collection<StepHandler> handlers = integrator.getStepHandlers();
        assertEquals(2, handlers.size());
        assertTrue(handlers.contains(h1));
        assertTrue(handlers.contains(h2));
        try {
            handlers.add(h1);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        integrator.clearStepHandlers();
        assertTrue(integrator.getStepHandlers().isEmpty());
    }

    @Test
    public void testEventHandlersManagement() {
        DummyEventHandler h1 = new DummyEventHandler();
        DummyEventHandler h2 = new DummyEventHandler();
        integrator.addEventHandler(h1, 10.0, 1.0e-6, 100);
        integrator.addEventHandler(h2, 10.0, 1.0e-6, 100);
        Collection<EventHandler> handlers = integrator.getEventHandlers();
        assertEquals(2, handlers.size());
        assertTrue(handlers.contains(h1));
        assertTrue(handlers.contains(h2));
        try {
            handlers.add(h1);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        integrator.clearEventHandlers();
        assertTrue(integrator.getEventHandlers().isEmpty());
    }

    @Test
    public void testMaxEvaluationsBoundary() {
        integrator.setMaxEvaluations(-1);
        assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());
        integrator.setMaxEvaluations(0);
        assertEquals(0, integrator.getMaxEvaluations());
        integrator.setMaxEvaluations(100);
        assertEquals(100, integrator.getMaxEvaluations());
    }

    @Test
    public void testComputeDerivativesAndEvaluationCount() throws Exception {
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new SimpleODE(2, 2.0));
        integrator.setEquations(ode);
        double[] y = new double[] {1.0, 2.0};
        double[] yDot = new double[2];
        integrator.computeDerivatives(0.0, y, yDot);
        assertArrayEquals(new double[] {2.0, 4.0}, yDot, 0.0);
        assertEquals(1, integrator.getEvaluations());
        integrator.computeDerivatives(1.0, y, yDot);
        assertEquals(2, integrator.getEvaluations());
    }

    @Test(expected = MaxCountExceededException.class)
    public void testComputeDerivativesExceedMaxEvaluations() throws Exception {
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new SimpleODE(1, 1.0));
        integrator.setEquations(ode);
        integrator.setMaxEvaluations(1);
        double[] y = new double[] {1.0};
        double[] yDot = new double[1];
        integrator.computeDerivatives(0.0, y, yDot);
        integrator.computeDerivatives(0.0, y, yDot);
    }

    @Test
    public void testIntegrateCallsAbstractMethodAndCopiesState() throws Exception {
        FirstOrderDifferentialEquations eq = new SimpleODE(2, 1.0);
        double[] y0 = new double[] {10.0, 20.0};
        double[] y = new double[] {0.0, 0.0};
        integrator.returnedTime = 5.0;
        double result = integrator.integrate(eq, 1.0, y0, 5.0, y);
        assertEquals(5.0, result, 0.0);
        assertNotNull(integrator.lastEquations);
        assertEquals(1.0, integrator.initialTime, 0.0);
        assertArrayEquals(new double[] {10.0, 20.0}, integrator.initialState, 0.0);
        assertArrayEquals(new double[] {30.0, 40.0}, y, 0.0);
    }

    @Test
    public void testIntegrateDimensionMismatch() {
        FirstOrderDifferentialEquations eq = new SimpleODE(2, 1.0);
        try {
            integrator.integrate(eq, 0.0, new double[1], 1.0, new double[2]);
            fail("expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            // expected
        }
        try {
            integrator.integrate(eq, 0.0, new double[2], 1.0, new double[1]);
            fail("expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            // expected
        }
    }

    @Test
    public void testSanityChecksSuccess() throws Exception {
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new SimpleODE(1, 1.0));
        ode.setTime(0.0);
        integrator.sanityChecks(ode, 1.0);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecksTooSmallInterval() throws Exception {
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new SimpleODE(1, 1.0));
        ode.setTime(0.0);
        integrator.sanityChecks(ode, 0.0);
    }

    @Test
    public void testInitIntegrationResetsCountAndCallsHandlers() throws Exception {
        DummyStepHandler step = new DummyStepHandler();
        DummyEventHandler event = new DummyEventHandler();
        integrator.addStepHandler(step);
        integrator.addEventHandler(event, 10.0, 1.0e-6, 100);
        integrator.setMaxEvaluations(100);
        integrator.setEquations(new ExpandableStatefulODE(new SimpleODE(1, 1.0)));
        double[] y = new double[] {1.0};
        double[] yDot = new double[1];
        integrator.computeDerivatives(0.0, y, yDot);
        assertEquals(1, integrator.getEvaluations());

        integrator.initIntegration(0.0, new double[] {1.0}, 1.0);

        assertEquals(0, integrator.getEvaluations());
        assertTrue(step.initCalled);
        assertTrue(event.initCalled);
        assertEquals(0.0, step.initT0, 0.0);
        assertEquals(1.0, step.initT, 0.0);
    }

    private static class TestIntegrator extends AbstractIntegrator {
        ExpandableStatefulODE lastEquations;
        double lastT;
        double initialTime;
        double[] initialState;
        double returnedTime = Double.NaN;

        TestIntegrator(String name) {
            super(name);
        }

        TestIntegrator() {
            super();
        }

        @Override
        public void integrate(ExpandableStatefulODE equations, double t) {
            this.lastEquations = equations;
            this.lastT = t;
            this.initialTime = equations.getTime();
            this.initialState = equations.getPrimaryState().clone();
            equations.setPrimaryState(new double[] {30.0, 40.0});
            equations.setTime(returnedTime);
        }
    }

    private static class SimpleODE implements FirstOrderDifferentialEquations {
        private final int dimension;
        private final double factor;

        SimpleODE(int dimension, double factor) {
            this.dimension = dimension;
            this.factor = factor;
        }

        SimpleODE(int dimension) {
            this(dimension, 2.0);
        }

        public int getDimension() {
            return dimension;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) {
            for (int i = 0; i < dimension; i++) {
                yDot[i] = factor * y[i];
            }
        }
    }

    private static class DummyStepHandler implements StepHandler {
        boolean initCalled;
        double initT0;
        double initT;
        boolean handleStepCalled;

        public void init(double t0, double[] y0, double t) {
            initCalled = true;
            initT0 = t0;
            initT = t;
        }

        public void handleStep(StepInterpolator interpolator, boolean isLast) {
            handleStepCalled = true;
        }
    }

    private static class DummyEventHandler implements EventHandler {
        boolean initCalled;

        public void init(double t0, double[] y0, double t) {
            initCalled = true;
        }

        public double g(double t, double[] y) {
            return 0.0;
        }

        public EventHandler.Action eventOccurred(double t, double[] y, boolean increasing) {
            return EventHandler.Action.CONTINUE;
        }

        public void resetState(double t, double[] y) {
        }
    }
}