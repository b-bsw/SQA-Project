package org.apache.commons.math.ode;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.NumberIsTooSmallException;

public class AbstractIntegratorTest {

    private TestIntegrator integrator;

    @Before
    public void setUp() {
        integrator = new TestIntegrator("test");
    }

    static class TestIntegrator extends AbstractIntegrator {
        public TestIntegrator(String name) {
            super(name);
        }
        @Override
        public void integrate(ExpandableStatefulODE equations, double t) {
            // no-op
        }
    }

    static class DummyODE implements FirstOrderDifferentialEquations {
        private final int dimension;
        DummyODE(int dimension) {
            this.dimension = dimension;
        }
        @Override
        public int getDimension() {
            return dimension;
        }
        @Override
        public void computeDerivatives(double t, double[] y, double[] yDot) {
            // no-op
        }
    }

    static class StubExpandableStatefulODE extends ExpandableStatefulODE {
        private int computeCount = 0;
        public StubExpandableStatefulODE(FirstOrderDifferentialEquations primary) {
            super(primary);
        }
        @Override
        public void computeDerivatives(double t, double[] y, double[] yDot) {
            computeCount++;
        }
        public int getComputeCount() {
            return computeCount;
        }
    }

    @Test
    public void testConstructor() {
        assertEquals("test", integrator.getName());
        assertTrue(Double.isNaN(integrator.getCurrentStepStart()));
        assertTrue(Double.isNaN(integrator.getCurrentSignedStepsize()));
        assertTrue(integrator.getStepHandlers().isEmpty());
        assertTrue(integrator.getEventHandlers().isEmpty());
        assertEquals(0, integrator.getEvaluations());
        assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());
    }

    @Test
    public void testStepHandlers() {
        StepHandler handler1 = new StepHandler() {
            @Override
            public void handleStep(AbstractStepInterpolator interpolator, boolean isLast) {
            }
            @Override
            public boolean requiresDenseOutput() {
                return false;
            }
            @Override
            public void reset() {
            }
        };
        StepHandler handler2 = new StepHandler() {
            @Override
            public void handleStep(AbstractStepInterpolator interpolator, boolean isLast) {
            }
            @Override
            public boolean requiresDenseOutput() {
                return false;
            }
            @Override
            public void reset() {
            }
        };

        integrator.addStepHandler(handler1);
        assertEquals(1, integrator.getStepHandlers().size());

        integrator.addStepHandler(handler2);
        assertEquals(2, integrator.getStepHandlers().size());

        integrator.clearStepHandlers();
        assertTrue(integrator.getStepHandlers().isEmpty());
    }

    @Test
    public void testAddNullStepHandler() {
        integrator.addStepHandler(null);
        assertEquals(1, integrator.getStepHandlers().size());
    }

    @Test
    public void testEventHandlers() {
        EventHandler handler1 = new EventHandler() {
            @Override
            public double g(double t, double[] y) {
                return 0;
            }
            @Override
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.CONTINUE;
            }
            @Override
            public void resetState(double t, double[] y) {
            }
        };
        EventHandler handler2 = new EventHandler() {
            @Override
            public double g(double t, double[] y) {
                return 0;
            }
            @Override
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.CONTINUE;
            }
            @Override
            public void resetState(double t, double[] y) {
            }
        };

        assertTrue(integrator.getEventHandlers().isEmpty());

        integrator.addEventHandler(handler1, 1.0, 1.0e-6, 100);
        assertEquals(1, integrator.getEventHandlers().size());

        integrator.addEventHandler(handler2, 1.0, 1.0e-6, 100);
        assertEquals(2, integrator.getEventHandlers().size());

        integrator.clearEventHandlers();
        assertTrue(integrator.getEventHandlers().isEmpty());
    }

    @Test
    public void testAddNullEventHandler() {
        integrator.addEventHandler(null, 1.0, 1.0e-6, 100);
        assertEquals(1, integrator.getEventHandlers().size());
    }

    @Test
    public void testAddEventHandlerWithSolver() {
        EventHandler handler = new EventHandler() {
            @Override
            public double g(double t, double[] y) {
                return 0;
            }
            @Override
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.CONTINUE;
            }
            @Override
            public void resetState(double t, double[] y) {
            }
        };
        integrator.addEventHandler(handler, 1.0, 1.0e-6, 100,
                new BracketingNthOrderBrentSolver(1.0e-6, 5));
        assertEquals(1, integrator.getEventHandlers().size());
    }

    @Test
    public void testSetMaxEvaluations() {
        integrator.setMaxEvaluations(-1);
        assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());

        integrator.setMaxEvaluations(0);
        assertEquals(0, integrator.getMaxEvaluations());

        integrator.setMaxEvaluations(100);
        assertEquals(100, integrator.getMaxEvaluations());
    }

    @Test
    public void testEvaluations() {
        assertEquals(0, integrator.getEvaluations());

        DummyODE ode = new DummyODE(2);
        StubExpandableStatefulODE stub = new StubExpandableStatefulODE(ode);
        integrator.setEquations(stub);

        double[] y = new double[2];
        double[] yDot = new double[2];
        integrator.computeDerivatives(0.0, y, yDot);
        assertEquals(1, integrator.getEvaluations());

        integrator.resetEvaluations();
        assertEquals(0, integrator.getEvaluations());
    }

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrateDimensionMismatchY0() {
        DummyODE ode = new DummyODE(2);
        double[] y0 = new double[1];
        double[] y = new double[2];
        integrator.integrate(ode, 0.0, y0, 1.0, y);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrateDimensionMismatchY() {
        DummyODE ode = new DummyODE(2);
        double[] y0 = new double[2];
        double[] y = new double[1];
        integrator.integrate(ode, 0.0, y0, 1.0, y);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks() {
        DummyODE ode = new DummyODE(2);
        StubExpandableStatefulODE stub = new StubExpandableStatefulODE(ode);
        stub.setTime(0.0);
        integrator.sanityChecks(stub, 0.0);
    }

}