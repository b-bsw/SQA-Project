package org.apache.commons.math.optimization.direct;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Test;

public class MultiDirectionalTest {

    private static final Comparator<RealPointValuePair> VALUE_COMPARATOR =
        new Comparator<RealPointValuePair>() {
            public int compare(RealPointValuePair o1, RealPointValuePair o2) {
                int c = Double.compare(o1.getValue(), o2.getValue());
                if (c != 0) {
                    return c;
                }
                return Double.compare(o1.getPointRef()[0], o2.getPointRef()[0]);
            }
        };

    private interface CostFunction {
        double value(double[] point);
    }

    private static final class TestMultiDirectional extends MultiDirectional {
        private final CostFunction function;
        private int iterationCap = Integer.MAX_VALUE;
        private int iterationCount = 0;

        private TestMultiDirectional(double khi, double gamma, CostFunction function) {
            super(khi, gamma);
            this.function = function;
        }

        @Override
        protected void incrementIterationsCounter() throws OptimizationException {
            if (++iterationCount > iterationCap) {
                throw new OptimizationException();
            }
        }

        @Override
        protected void evaluateSimplex(Comparator<RealPointValuePair> comparator)
                throws FunctionEvaluationException, OptimizationException {
            if (simplex == null) {
                throw new NullPointerException();
            }
            for (int i = 0; i < simplex.length; ++i) {
                RealPointValuePair p = simplex[i];
                double[] point = p.getPointRef();
                double value = function.value(point);
                simplex[i] = new RealPointValuePair(point, value, false);
            }
            Arrays.sort(simplex, comparator);
        }

        private void setSimplex(RealPointValuePair[] s) {
            this.simplex = s;
        }

        private RealPointValuePair[] getSimplex() {
            return simplex;
        }

        private void setIterationCap(int cap) {
            this.iterationCap = cap;
        }
    }

    private static double fieldDouble(Object obj, String name) throws Exception {
        Field field = MultiDirectional.class.getDeclaredField(name);
        field.setAccessible(true);
        return field.getDouble(obj);
    }

    private static RealPointValuePair point1(double x) {
        return new RealPointValuePair(new double[] { x }, 0.0, false);
    }

    private static RealPointValuePair point2(double x, double y) {
        return new RealPointValuePair(new double[] { x, y }, 0.0, false);
    }

    @Test
    public void testDefaultConstructorCoefficients() throws Exception {
        MultiDirectional md = new MultiDirectional();
        assertEquals(2.0, fieldDouble(md, "khi"), 0.0);
        assertEquals(0.5, fieldDouble(md, "gamma"), 0.0);
    }

    @Test
    public void testCustomConstructorCoefficients() throws Exception {
        MultiDirectional md = new MultiDirectional(3.5, 0.125);
        assertEquals(3.5, fieldDouble(md, "khi"), 0.0);
        assertEquals(0.125, fieldDouble(md, "gamma"), 0.0);
    }

    @Test
    public void testIterateAcceptReflectedWhenExpandedIsWorse() throws Exception {
        CostFunction f = new CostFunction() {
            public double value(double[] point) {
                double z = point[0] + 10.0;
                return z * z;
            }
        };
        TestMultiDirectional md = new TestMultiDirectional(2.0, 0.5, f);
        md.setSimplex(new RealPointValuePair[] { point1(0.0), point1(10.0) });
        md.iterateSimplex(VALUE_COMPARATOR);
        RealPointValuePair[] result = md.getSimplex();
        assertEquals(2, result.length);
        assertEquals(-10.0, result[0].getPointRef()[0], 0.0);
        assertEquals(0.0, result[0].getValue(), 0.0);
    }

    @Test
    public void testIterateAcceptExpandedWhenExpansionIsBetter() throws Exception {
        CostFunction f = new CostFunction() {
            public double value(double[] point) {
                double sum = 0.0;
                for (double d : point) {
                    double z = d + 20.0;
                    sum += z * z;
                }
                return sum;
            }
        };
        TestMultiDirectional md = new TestMultiDirectional(2.0, 0.5, f);
        md.setSimplex(new RealPointValuePair[] {
            point2(0.0, 0.0),
            point2(10.0, 0.0),
            point2(0.0, 10.0)
        });
        md.iterateSimplex(VALUE_COMPARATOR);
        RealPointValuePair[] result = md.getSimplex();
        assertEquals(3, result.length);
        assertEquals(-20.0, result[0].getPointRef()[0], 0.0);
        assertEquals(0.0, result[0].getPointRef()[1], 0.0);
        assertEquals(400.0, result[0].getValue(), 0.0);
    }

    @Test
    public void testIterateAcceptContractedWhenContractionImproves() throws Exception {
        CostFunction f = new CostFunction() {
            public double value(double[] point) {
                double z = point[0] + 4.0;
                return z * z;
            }
        };
        TestMultiDirectional md = new TestMultiDirectional(2.0, 0.5, f);
        md.setSimplex(new RealPointValuePair[] { point1(0.0), point1(10.0) });
        md.iterateSimplex(VALUE_COMPARATOR);
        RealPointValuePair[] result = md.getSimplex();
        assertEquals(-5.0, result[0].getPointRef()[0], 0.0);
        assertEquals(1.0, result[0].getValue(), 0.0);
    }

    @Test(expected = OptimizationException.class)
    public void testIterateLoopsWhenNeitherReflectionNorContractionImproves() throws Exception {
        CostFunction f = new CostFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        TestMultiDirectional md = new TestMultiDirectional(2.0, 0.5, f);
        md.setIterationCap(1);
        md.setSimplex(new RealPointValuePair[] { point1(0.0), point1(10.0) });
        md.iterateSimplex(VALUE_COMPARATOR);
    }

    @Test(expected = NullPointerException.class)
    public void testNullComparatorThrowsNullPointerException() throws Exception {
        CostFunction f = new CostFunction() {
            public double value(double[] point) {
                return point[0];
            }
        };
        TestMultiDirectional md = new TestMultiDirectional(2.0, 0.5, f);
        md.setSimplex(new RealPointValuePair[] { point1(0.0), point1(10.0) });
        md.iterateSimplex(null);
    }

    @Test(expected = NullPointerException.class)
    public void testNullSimplexThrowsNullPointerException() throws Exception {
        TestMultiDirectional md = new TestMultiDirectional(2.0, 0.5, null);
        md.setSimplex(null);
        md.iterateSimplex(VALUE_COMPARATOR);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testEmptySimplexThrowsArrayIndexOutOfBoundsException() throws Exception {
        TestMultiDirectional md = new TestMultiDirectional(2.0, 0.5, null);
        md.setSimplex(new RealPointValuePair[0]);
        md.iterateSimplex(VALUE_COMPARATOR);
    }
}