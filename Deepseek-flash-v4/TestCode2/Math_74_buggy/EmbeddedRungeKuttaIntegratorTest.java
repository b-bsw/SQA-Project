package org.apache.commons.math.ode.nonstiff;

import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmbeddedRungeKuttaIntegratorTest {

    private static final double[] C = new double[] { 0.5, 0.5, 1.0 };
    private static final double[][] A = new double[][] {
        { 0.5 },
        { 0.0, 0.5 },
        { 0.0, 0.0, 1.0 }
    };
    private static final double[] B = new double[] { 1.0 / 6.0, 1.0 / 3.0, 1.0 / 3.0, 1.0 / 6.0 };

    private static final double MIN_STEP = 1.0e-8;
    private static final double MAX_STEP = 0.5;
    private static final double ABS_TOL = 1.0e-12;
    private static final double REL_TOL = 1.0e-12;

    private interface ErrorGenerator {
        double error(double h);
    }

    private static final ErrorGenerator ZERO_ERROR = new ErrorGenerator() {
        public double error(double h) {
            return 0.0;
        }
    };

    private static class RejectFirstError implements ErrorGenerator {
        private int calls = 0;

        public double error(double h) {
            return calls++ == 0 ? 10.0 : 0.0;
        }
    }

    private static class ExpEquation implements FirstOrderDifferentialEquations {
        public int getDimension() {
            return 1;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) {
            yDot[0] = y[0];
        }
    }

    private static class TwoDimEquation implements FirstOrderDifferentialEquations {
        public int getDimension() {
            return 2;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) {
            yDot[0] = y[0];
            yDot[1] = -y[1];
        }
    }

    private static class TestIntegrator extends EmbeddedRungeKuttaIntegrator {
        private final ErrorGenerator errorGenerator;

        TestIntegrator(boolean fsal, double minStep, double maxStep,
                       double absTol, double relTol, ErrorGenerator errorGenerator) {
            super("test", fsal, C, A, B, null, minStep, maxStep, absTol, relTol);
            this.errorGenerator = errorGenerator;
        }

        TestIntegrator(boolean fsal, double minStep, double maxStep,
                       double[] absTol, double[] relTol, ErrorGenerator errorGenerator) {
            super("test", fsal, C, A, B, null, minStep, maxStep, absTol, relTol);
            this.errorGenerator = errorGenerator;
        }

        public int getOrder() {
            return 4;
        }

        protected double estimateError(double[][] yDotK, double[] y0, double[] y1, double h) {
            return errorGenerator.error(h);
        }
    }

    private static TestIntegrator createIntegrator(boolean fsal, ErrorGenerator error) {
        return new TestIntegrator(fsal, MIN_STEP, MAX_STEP, ABS_TOL, REL_TOL, error);
    }

    private static TestIntegrator createVectorIntegrator() {
        return new TestIntegrator(false, MIN_STEP, MAX_STEP,
                                  new double[] { ABS_TOL, ABS_TOL },
                                  new double[] { REL_TOL, REL_TOL },
                                  ZERO_ERROR);
    }

    @Test
    public void testDefaultsAndSetters() {
        TestIntegrator integrator = createIntegrator(false, ZERO_ERROR);

        assertEquals(4, integrator.getOrder());
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
    public void testScalarToleranceForwardIntegration() throws DerivativeException, IntegratorException {
        TestIntegrator integrator = createIntegrator(false, ZERO_ERROR);
        double[] y0 = new double[] { 1.0 };
        double[] y = new double[1];

        double stop = integrator.integrate(new ExpEquation(), 0.0, y0, 1.0, y);

        assertEquals(1.0, stop, 1.0e-9);
        assertEquals(Math.E, y[0], 1.0e-2);
    }

    @Test
    public void testVectorToleranceBackwardIntegration() throws DerivativeException, IntegratorException {
        TestIntegrator integrator = createVectorIntegrator();
        TwoDimEquation equations = new TwoDimEquation();
        double[] y0 = new double[] { Math.E, 2.0 / Math.E };
        double[] y = new double[2];

        double stop = integrator.integrate(equations, 1.0, y0, 0.0, y);

        assertEquals(0.0, stop, 1.0e-9);
        assertEquals(1.0, y[0], 1.0e-2);
        assertEquals(2.0, y[1], 1.0e-2);
    }

    @Test
    public void testFsalIntegration() throws DerivativeException, IntegratorException {
        TestIntegrator integrator = createIntegrator(true, ZERO_ERROR);
        double[] y0 = new double[] { 1.0 };
        double[] y = new double[1];

        double stop = integrator.integrate(new ExpEquation(), 0.0, y0, 1.0, y);

        assertEquals(1.0, stop, 1.0e-9);
        assertEquals(Math.E, y[0], 1.0e-2);
    }

    @Test
    public void testIntegrationInSameArray() throws DerivativeException, IntegratorException {
        TestIntegrator integrator = createIntegrator(false, ZERO_ERROR);
        double[] state = new double[] { 1.0 };

        double stop = integrator.integrate(new ExpEquation(), 0.0, state, 1.0, state);

        assertEquals(1.0, stop, 1.0e-9);
        assertEquals(Math.E, state[0], 1.0e-2);
    }

    @Test
    public void testRejectedStepIsRetried() throws DerivativeException, IntegratorException {
        TestIntegrator integrator = createIntegrator(false, new RejectFirstError());
        double[] y = new double[1];

        double stop = integrator.integrate(new ExpEquation(), 0.0, new double[] { 1.0 }, 1.0, y);

        assertEquals(1.0, stop, 1.0e-9);
        assertEquals(Math.E, y[0], 1.0e-2);
    }

    @Test(expected = RuntimeException.class)
    public void testNullEquationsThrows() throws DerivativeException, IntegratorException {
        createIntegrator(false, ZERO_ERROR)
            .integrate(null, 0.0, new double[] { 1.0 }, 1.0, new double[1]);
    }

    @Test(expected = IntegratorException.class)
    public void testDimensionMismatchThrowsIntegratorException() throws DerivativeException, IntegratorException {
        createIntegrator(false, ZERO_ERROR)
            .integrate(new ExpEquation(), 0.0, new double[2], 1.0, new double[2]);
    }
}