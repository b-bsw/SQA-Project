package org.apache.commons.math.ode.nonstiff;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.commons.math.ode.ExpandableStatefulODE;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.junit.Test;

public class EmbeddedRungeKuttaIntegratorTest {

    private static final double MIN_STEP = 1e-12;
    private static final double MAX_STEP = 0.25;

    @Test
    public void testDefaultControlParameters() {
        TestIntegrator integrator =
            new TestIntegrator(false, false, MIN_STEP, MAX_STEP, 1e-10, 1e-10);
        assertEquals(0.9, integrator.getSafety(), 1e-15);
        assertEquals(0.2, integrator.getMinReduction(), 1e-15);
        assertEquals(10.0, integrator.getMaxGrowth(), 1e-15);
        assertEquals(2, integrator.getOrder());
    }

    @Test
    public void testControlParameterBoundaries() {
        TestIntegrator integrator =
            new TestIntegrator(false, false, MIN_STEP, MAX_STEP, 1e-10, 1e-10);

        integrator.setSafety(0.0);
        assertEquals(0.0, integrator.getSafety(), 0.0);

        integrator.setSafety(-2.5);
        assertEquals(-2.5, integrator.getSafety(), 1e-15);

        integrator.setSafety(Double.NaN);
        assertTrue(Double.isNaN(integrator.getSafety()));

        integrator.setMinReduction(1.0);
        assertEquals(1.0, integrator.getMinReduction(), 0.0);

        integrator.setMinReduction(Double.MIN_VALUE);
        assertEquals(Double.MIN_VALUE, integrator.getMinReduction(), 0.0);

        integrator.setMaxGrowth(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, integrator.getMaxGrowth(), 0.0);
    }

    @Test
    public void testVectorToleranceConstructor() {
        TestIntegrator integrator =
            new TestIntegrator(false, false, MIN_STEP, MAX_STEP,
                               new double[] {1e-10}, new double[] {1e-10});
        assertEquals(0.9, integrator.getSafety(), 1e-15);
        assertEquals(2, integrator.getOrder());
    }

    @Test
    public void testIntegrateNonFsalAcceptedStep() throws Exception {
        TestIntegrator integrator =
            new TestIntegrator(false, false, MIN_STEP, MAX_STEP, 1e-10, 1e-10);
        ExpandableStatefulODE equations = createODE();
        integrator.integrate(equations, 1.0);

        assertEquals(1.0, equations.getTime(), 1e-9);
        assertTrue(equations.getPrimaryState()[0] > 0.0);
    }

    @Test
    public void testIntegrateNonFsalRejectedStep() throws Exception {
        TestIntegrator integrator =
            new TestIntegrator(false, true, MIN_STEP, MAX_STEP, 1e-10, 1e-10);
        ExpandableStatefulODE equations = createODE();
        integrator.integrate(equations, 1.0);

        assertTrue(integrator.rejected);
        assertEquals(1.0, equations.getTime(), 1e-9);
        assertTrue(equations.getPrimaryState()[0] > 0.0);
    }

    @Test
    public void testIntegrateFsal() throws Exception {
        TestIntegrator integrator =
            new TestIntegrator(true, true, MIN_STEP, MAX_STEP, 1e-10, 1e-10);
        ExpandableStatefulODE equations = createODE();
        integrator.integrate(equations, 1.0);

        assertTrue(integrator.rejected);
        assertEquals(1.0, equations.getTime(), 1e-9);
        assertTrue(equations.getPrimaryState()[0] > 0.0);
    }

    @Test
    public void testIntegrateWithVectorTolerances() throws Exception {
        TestIntegrator integrator =
            new TestIntegrator(false, false, MIN_STEP, MAX_STEP,
                               new double[] {1e-10}, new double[] {1e-10});
        ExpandableStatefulODE equations = createODE();
        integrator.integrate(equations, 1.0);

        assertEquals(1.0, equations.getTime(), 1e-9);
        assertTrue(equations.getPrimaryState()[0] > 0.0);
    }

    @Test
    public void testIntegrateBackward() throws Exception {
        TestIntegrator integrator =
            new TestIntegrator(false, false, MIN_STEP, MAX_STEP, 1e-10, 1e-10);
        ExpandableStatefulODE equations = createODE();
        equations.setTime(1.0);
        equations.setPrimaryState(new double[] {1.0});
        integrator.integrate(equations, 0.0);

        assertEquals(0.0, equations.getTime(), 1e-9);
        assertTrue(equations.getPrimaryState()[0] > 0.0);
    }

    private ExpandableStatefulODE createODE() {
        ExpandableStatefulODE equations =
            new ExpandableStatefulODE(new FirstOrderDifferentialEquations() {
                public int getDimension() {
                    return 1;
                }

                public void computeDerivatives(double t, double[] y, double[] yDot) {
                    yDot[0] = y[0];
                }
            });
        equations.setTime(0.0);
        equations.setPrimaryState(new double[] {1.0});
        return equations;
    }

    private static class TestStepInterpolator extends RungeKuttaStepInterpolator {
        @Override
        public RungeKuttaStepInterpolator doCopy() {
            return new TestStepInterpolator();
        }

        @Override
        protected void computeInterpolatedStateAndDerivatives(double theta, double oneMinusThetaH) {
            // No dense output is requested for these integration tests.
        }
    }

    private static class TestIntegrator extends EmbeddedRungeKuttaIntegrator {
        final boolean rejectNext;
        boolean rejected;

        TestIntegrator(boolean fsal, boolean rejectNext,
                       double minStep, double maxStep,
                       double scalAbsTol, double scalRelTol) {
            super("test", fsal,
                  fsal ? new double[] {1.0} : new double[] {0.5},
                  fsal ? new double[][] {{1.0}} : new double[][] {{0.5}},
                  fsal ? new double[] {1.0, 0.0} : new double[] {0.0, 1.0},
                  new TestStepInterpolator(),
                  minStep, maxStep, scalAbsTol, scalRelTol);
            this.rejectNext = rejectNext;
        }

        TestIntegrator(boolean fsal, boolean rejectNext,
                       double minStep, double maxStep,
                       double[] vecAbsTol, double[] vecRelTol) {
            super("test", fsal,
                  fsal ? new double[] {1.0} : new double[] {0.5},
                  fsal ? new double[][] {{1.0}} : new double[][] {{0.5}},
                  fsal ? new double[] {1.0, 0.0} : new double[] {0.0, 1.0},
                  new TestStepInterpolator(),
                  minStep, maxStep, vecAbsTol, vecRelTol);
            this.rejectNext = rejectNext;
        }

        @Override
        public int getOrder() {
            return 2;
        }

        @Override
        protected double estimateError(double[][] yDotK, double[] y0, double[] y1, double h) {
            if (rejectNext && !rejected) {
                rejected = true;
                return 10.0;
            }
            return 0.0;
        }
    }
}