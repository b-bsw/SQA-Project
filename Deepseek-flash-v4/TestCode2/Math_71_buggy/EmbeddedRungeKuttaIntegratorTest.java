package org.apache.commons.math.ode.nonstiff;

import static org.junit.Assert.assertEquals;

import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.junit.Test;

public class EmbeddedRungeKuttaIntegratorTest {

    private static class TestIntegrator extends EmbeddedRungeKuttaIntegrator {
        TestIntegrator(boolean fsal, double minStep, double maxStep,
                       double scalAbsTol, double scalRelTol) {
            super("test", fsal, new double[]{1.0}, new double[][]{{1.0}},
                  new double[]{1.0, 0.0}, null, minStep, maxStep,
                  scalAbsTol, scalRelTol);
        }

        TestIntegrator(boolean fsal, double minStep, double maxStep,
                       double[] vecAbsTol, double[] vecRelTol) {
            super("test", fsal, new double[]{1.0}, new double[][]{{1.0}},
                  new double[]{1.0, 0.0}, null, minStep, maxStep,
                  vecAbsTol, vecRelTol);
        }

        public int getOrder() {
            return 1;
        }

        protected double estimateError(double[][] yDotK, double[] y0,
                                       double[] y1, double h) {
            return 0.0;
        }
    }

    private static class RejectingIntegrator extends TestIntegrator {
        private boolean firstAttempt = true;

        RejectingIntegrator() {
            super(false, 1.0e-10, 1.0, 1.0, 1.0);
        }

        @Override
        protected double estimateError(double[][] yDotK, double[] y0,
                                       double[] y1, double h) {
            if (firstAttempt) {
                firstAttempt = false;
                return 2.0;
            }
            return 0.0;
        }
    }

    private static class Ode implements FirstOrderDifferentialEquations {
        public int getDimension() {
            return 1;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) {
            yDot[0] = 1.0;
        }
    }

    @Test
    public void testControlParameters() {
        TestIntegrator integrator =
            new TestIntegrator(false, 1.0e-6, 1.0, 1.0, 1.0);

        assertEquals(1, integrator.getOrder());
        assertEquals(0.9, integrator.getSafety(), 1.0e-12);
        assertEquals(0.2, integrator.getMinReduction(), 1.0e-12);
        assertEquals(10.0, integrator.getMaxGrowth(), 1.0e-12);

        integrator.setSafety(0.5);
        integrator.setMinReduction(0.1);
        integrator.setMaxGrowth(5.0);

        assertEquals(0.5, integrator.getSafety(), 1.0e-12);
        assertEquals(0.1, integrator.getMinReduction(), 1.0e-12);
        assertEquals(5.0, integrator.getMaxGrowth(), 1.0e-12);
    }

    @Test
    public void testIntegrateForwardScalarTolerance()
        throws DerivativeException, IntegratorException {
        TestIntegrator integrator =
            new TestIntegrator(false, 1.0e-6, 0.5, 1.0, 1.0);
        double[] y0 = new double[] { 0.0 };
        double[] y = new double[1];

        double stopTime = integrator.integrate(new Ode(), 0.0, y0, 1.0, y);

        assertEquals(1.0, stopTime, 1.0e-12);
        assertEquals(1.0, y[0], 1.0e-12);
    }

    @Test
    public void testIntegrateInPlace()
        throws DerivativeException, IntegratorException {
        TestIntegrator integrator =
            new TestIntegrator(false, 1.0e-6, 1.0, 1.0, 1.0);
        double[] y0 = new double[] { 0.0 };

        double stopTime = integrator.integrate(new Ode(), 0.0, y0, 1.0, y0);

        assertEquals(1.0, stopTime, 1.0e-12);
        assertEquals(1.0, y0[0], 1.0e-12);
    }

    @Test
    public void testIntegrateForwardVectorToleranceWithFsal()
        throws DerivativeException, IntegratorException {
        TestIntegrator integrator = new TestIntegrator(
            true, 1.0e-6, 0.5, new double[] { 1.0 }, new double[] { 1.0 });
        double[] y0 = new double[] { 0.0 };
        double[] y = new double[1];

        double stopTime = integrator.integrate(new Ode(), 0.0, y0, 1.0, y);

        assertEquals(1.0, stopTime, 1.0e-12);
        assertEquals(1.0, y[0], 1.0e-12);
    }

    @Test
    public void testIntegrateBackward()
        throws DerivativeException, IntegratorException {
        TestIntegrator integrator =
            new TestIntegrator(false, 1.0e-6, 0.5, 1.0, 1.0);
        double[] y0 = new double[] { 1.0 };
        double[] y = new double[1];

        double stopTime = integrator.integrate(new Ode(), 1.0, y0, 0.0, y);

        assertEquals(0.0, stopTime, 1.0e-12);
        assertEquals(0.0, y[0], 1.0e-12);
    }

    @Test
    public void testIntegrateWithStepRejection()
        throws DerivativeException, IntegratorException {
        RejectingIntegrator integrator = new RejectingIntegrator();
        double[] y0 = new double[] { 0.0 };
        double[] y = new double[1];

        double stopTime = integrator.integrate(new Ode(), 0.0, y0, 0.45, y);

        assertEquals(0.45, stopTime, 1.0e-12);
        assertEquals(0.45, y[0], 1.0e-12);
    }

    @Test(expected = IntegratorException.class)
    public void testIntegrateRejectsDimensionMismatch()
        throws DerivativeException, IntegratorException {
        TestIntegrator integrator =
            new TestIntegrator(false, 1.0e-6, 1.0, 1.0, 1.0);

        integrator.integrate(new Ode(), 0.0, new double[0], 1.0, new double[1]);
    }
}