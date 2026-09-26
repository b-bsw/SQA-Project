package org.apache.commons.math.optimization.general;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.junit.Test;

public class LevenbergMarquardtOptimizerTest {

    @Test
    public void testConstructorDefaults() throws Exception {
        LevenbergMarquardtOptimizer opt = new LevenbergMarquardtOptimizer();
        assertEquals(100.0, getField(opt, "initialStepBoundFactor"), 0.0);
        assertEquals(1.0e-10, getField(opt, "costRelativeTolerance"), 0.0);
        assertEquals(1.0e-10, getField(opt, "parRelativeTolerance"), 0.0);
        assertEquals(1.0e-10, getField(opt, "orthoTolerance"), 0.0);
    }

    @Test
    public void testSetters() throws Exception {
        LevenbergMarquardtOptimizer opt = new LevenbergMarquardtOptimizer();
        opt.setInitialStepBoundFactor(0.0);
        opt.setCostRelativeTolerance(-1.5);
        opt.setParRelativeTolerance(1.0);
        opt.setOrthoTolerance(Double.POSITIVE_INFINITY);
        assertEquals(0.0, getField(opt, "initialStepBoundFactor"), 0.0);
        assertEquals(-1.5, getField(opt, "costRelativeTolerance"), 0.0);
        assertEquals(1.0, getField(opt, "parRelativeTolerance"), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, getField(opt, "orthoTolerance"), 0.0);
    }

    @Test
    public void testLinearlySolvesSimpleProblem() throws Exception {
        TestOptimizer opt = new TestOptimizer(new double[][]{{2.0}}, new double[]{4.0});
        opt.setPoint(new double[]{1.0});
        VectorialPointValuePair result = opt.doOptimize();
        assertNotNull(result);
        assertEquals(2.0, result.getPoint()[0], 1e-6);
    }

    @Test
    public void testPreSolvedStopsImmediately() throws Exception {
        TestOptimizer opt = new TestOptimizer(new double[][]{{2.0}}, new double[]{4.0});
        opt.setPoint(new double[]{2.0});
        VectorialPointValuePair result = opt.doOptimize();
        assertNotNull(result);
        assertEquals(2.0, result.getPoint()[0], 1e-12);
    }

    @Test
    public void testEmptyProblemReturnsImmediately() throws Exception {
        TestOptimizer opt = new TestOptimizer(new double[0][0], new double[0]);
        opt.setPoint(new double[0]);
        VectorialPointValuePair result = opt.doOptimize();
        assertNotNull(result);
        assertEquals(0, result.getPoint().length);
    }

    @Test
    public void testLinearlySolvesMultiParameterFromFarStart() throws Exception {
        TestOptimizer opt = new TestOptimizer(
                new double[][]{{1.0, 0.0}, {0.0, 1.0}},
                new double[]{3.0, 5.0});
        opt.setPoint(new double[]{10.0, 10.0});
        VectorialPointValuePair result = opt.doOptimize();
        assertNotNull(result);
        assertArrayEquals(new double[]{3.0, 5.0}, result.getPoint(), 1e-6);
    }

    @Test(expected = OptimizationException.class)
    public void testInfiniteJacobiNormThrows() throws Exception {
        TestOptimizer opt = new TestOptimizer(
                new double[][]{{Double.POSITIVE_INFINITY}},
                new double[]{0.0});
        opt.setPoint(new double[]{1.0});
        opt.doOptimize();
    }

    private static double getField(Object obj, String name) throws Exception {
        Class<?> c = obj.getClass();
        while (c != null) {
            try {
                Field f = c.getDeclaredField(name);
                f.setAccessible(true);
                return f.getDouble(obj);
            } catch (NoSuchFieldException e) {
                c = c.getSuperclass();
            }
        }
        throw new NoSuchFieldException(name);
    }

    private static class TestOptimizer extends LevenbergMarquardtOptimizer {
        private final double[][] a;
        private final double[] b;
        private final int m;
        private final int n;

        TestOptimizer(double[][] a, double[] b) {
            this.a = a;
            this.b = b;
            this.m = a.length;
            this.n = (m == 0) ? 0 : a[0].length;
            this.rows = m;
            this.cols = n;
            this.point = new double[n];
        }

        void setPoint(double[] x) {
            System.arraycopy(x, 0, point, 0, n);
        }

        @Override
        protected void updateJacobian() throws FunctionEvaluationException {
            jacobian = new double[m][n];
            for (int i = 0; i < m; ++i) {
                System.arraycopy(a[i], 0, jacobian[i], 0, n);
            }
        }

        @Override
        protected void updateResidualsAndCost() throws FunctionEvaluationException {
            residuals = new double[m];
            objective = new double[m];
            double[] ax = new double[m];
            for (int i = 0; i < m; ++i) {
                double sum = 0;
                for (int j = 0; j < n; ++j) {
                    sum += a[i][j] * point[j];
                }
                ax[i] = sum;
                residuals[i] = sum - b[i];
                objective[i] = sum;
            }
            cost = 0;
            for (double r : residuals) {
                cost += r * r;
            }
            cost = Math.sqrt(cost);
        }
    }
}