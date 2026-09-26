package org.apache.commons.math.optimization.univariate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.random.RandomGenerator;
import org.junit.Before;
import org.junit.Test;

public class MultiStartUnivariateRealOptimizerTest {

    private static final double EPS = 1e-14;

    private static final UnivariateRealFunction IDENTITY = new UnivariateRealFunction() {
        public double value(double x) {
            return x;
        }
    };

    private StubOptimizer<UnivariateRealFunction> stub;
    private MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer;
    private RandomGenerator random;

    @Before
    public void setUp() {
        stub = new StubOptimizer<UnivariateRealFunction>(1.0, 3.0, 2.0);
        random = new FixedRandomGenerator();
        optimizer = new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 3, random);
        optimizer.setMaxEvaluations(10);
    }

    @Test
    public void testConfigurationDelegation() {
        assertEquals(10, optimizer.getMaxEvaluations());
        assertEquals(10, stub.getMaxEvaluations());
        assertEquals(0, optimizer.getEvaluations());

        optimizer.setMaxEvaluations(6);
        assertEquals(6, optimizer.getMaxEvaluations());
        assertEquals(6, stub.getMaxEvaluations());

        optimizer.setConvergenceChecker(null);
        assertNull(optimizer.getConvergenceChecker());
        assertNull(stub.getConvergenceChecker());
    }

    @Test
    public void testGetOptimaBeforeOptimizeThrows() {
        try {
            optimizer.getOptima();
            fail("Expected MathIllegalStateException");
        } catch (MathIllegalStateException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testMinimizeReturnsBestAndStoresSortedOptima() throws Exception {
        UnivariateRealPointValuePair result =
            optimizer.optimize(IDENTITY, GoalType.MINIMIZE, 0.0, 1.0);

        assertEquals(1.0, result.getValue(), EPS);
        assertEquals(3, optimizer.getEvaluations());

        UnivariateRealPointValuePair[] optima = optimizer.getOptima();
        assertEquals(3, optima.length);
        assertEquals(1.0, optima[0].getValue(), EPS);
        assertEquals(2.0, optima[1].getValue(), EPS);
        assertEquals(3.0, optima[2].getValue(), EPS);

        optima[0] = null;
        assertNotNull(optimizer.getOptima()[0]);
    }

    @Test
    public void testMaximizeSortsInReverseOrder() throws Exception {
        optimizer.optimize(IDENTITY, GoalType.MAXIMIZE, 0.0, 1.0);

        UnivariateRealPointValuePair[] optima = optimizer.getOptima();
        assertEquals(3.0, optima[0].getValue(), EPS);
        assertEquals(2.0, optima[1].getValue(), EPS);
        assertEquals(1.0, optima[2].getValue(), EPS);
    }

    @Test
    public void testStartValueOverload() throws Exception {
        UnivariateRealPointValuePair result =
            optimizer.optimize(IDENTITY, GoalType.MINIMIZE, 0.0, 1.0, 100.0);

        assertEquals(1.0, result.getValue(), EPS);
        assertEquals(3, optimizer.getEvaluations());
    }

    @Test
    public void testPartialFailuresAreSortedAfterGoodOptima() throws Exception {
        stub = new StubOptimizer<UnivariateRealFunction>(2.0, 1.0);
        stub.setFunctionEvaluationFailure(2);
        optimizer = new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(
            stub, 4, new FixedRandomGenerator());
        optimizer.setMaxEvaluations(10);

        UnivariateRealPointValuePair result =
            optimizer.optimize(IDENTITY, GoalType.MINIMIZE, 0.0, 1.0);

        assertEquals(1.0, result.getValue(), EPS);
        assertEquals(4, optimizer.getEvaluations());

        UnivariateRealPointValuePair[] optima = optimizer.getOptima();
        assertEquals(1.0, optima[0].getValue(), EPS);
        assertEquals(2.0, optima[1].getValue(), EPS);
        assertNull(optima[2]);
        assertNull(optima[3]);
    }

    @Test
    public void testAllFailuresThrowConvergenceException() throws Exception {
        stub = new StubOptimizer<UnivariateRealFunction>(0.0);
        stub.setConvergenceFailure(0);
        optimizer = new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(
            stub, 2, new FixedRandomGenerator());
        optimizer.setMaxEvaluations(10);

        try {
            optimizer.optimize(IDENTITY, GoalType.MINIMIZE, 0.0, 1.0);
            fail("Expected ConvergenceException");
        } catch (ConvergenceException e) {
            assertNotNull(e.getMessage());
        }

        assertEquals(2, optimizer.getEvaluations());
    }

    @Test
    public void testSingleStartUsesOriginalInterval() throws Exception {
        StubOptimizer<UnivariateRealFunction> singleStub =
            new StubOptimizer<UnivariateRealFunction>(42.0);
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> single =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(
                singleStub, 1, new FixedRandomGenerator());
        single.setMaxEvaluations(10);

        UnivariateRealPointValuePair result =
            single.optimize(IDENTITY, GoalType.MINIMIZE, -5.0, 5.0);

        assertEquals(42.0, result.getValue(), EPS);
        assertEquals(-5.0, singleStub.lastMin, EPS);
        assertEquals(5.0, singleStub.lastMax, EPS);
    }

    private static class StubOptimizer<FUNC extends UnivariateRealFunction>
        implements BaseUnivariateRealOptimizer<FUNC> {

        private final double[] values;
        private int maxEvaluations;
        private int evaluations;
        private int calls;
        private int failFromCall = -1;
        private boolean failWithFunctionEvaluation;
        private boolean failWithConvergence;
        private ConvergenceChecker<UnivariateRealPointValuePair> checker;
        private double lastMin;
        private double lastMax;

        StubOptimizer(double... values) {
            this.values = values.clone();
            this.maxEvaluations = values.length;
        }

        public void setConvergenceChecker(ConvergenceChecker<UnivariateRealPointValuePair> checker) {
            this.checker = checker;
        }

        public ConvergenceChecker<UnivariateRealPointValuePair> getConvergenceChecker() {
            return checker;
        }

        public int getMaxEvaluations() {
            return maxEvaluations;
        }

        public void setMaxEvaluations(int maxEvaluations) {
            this.maxEvaluations = maxEvaluations;
        }

        public int getEvaluations() {
            return evaluations;
        }

        public UnivariateRealPointValuePair optimize(FUNC f, GoalType goalType,
                                                     double min, double max)
            throws FunctionEvaluationException {
            return optimize(f, goalType, min, max, min);
        }

        public UnivariateRealPointValuePair optimize(FUNC f, GoalType goalType,
                                                     double min, double max,
                                                     double startValue)
            throws FunctionEvaluationException {
            lastMin = min;
            lastMax = max;

            int current = calls++;
            evaluations = 1;

            if (failFromCall >= 0 && current >= failFromCall) {
                if (failWithConvergence) {
                    throw new ConvergenceException(
                        LocalizedFormats.NO_CONVERGENCE_WITH_ANY_START_POINT, 1);
                }
                if (failWithFunctionEvaluation) {
                    throw new FunctionEvaluationException(current);
                }
            }

            double value = values[current % values.length];
            return new UnivariateRealPointValuePair(current, value);
        }

        void setFunctionEvaluationFailure(int fromCall) {
            failFromCall = fromCall;
            failWithFunctionEvaluation = true;
        }

        void setConvergenceFailure(int fromCall) {
            failFromCall = fromCall;
            failWithConvergence = true;
        }
    }

    private static class FixedRandomGenerator implements RandomGenerator {
        private final java.util.Random delegate = new java.util.Random(123456789L);

        public void setSeed(int seed) {
            delegate.setSeed(seed);
        }

        public void setSeed(int[] seed) {
            long s = 0;
            for (int value : seed) {
                s = s * 31 + value;
            }
            delegate.setSeed(s);
        }

        public void setSeed(long seed) {
            delegate.setSeed(seed);
        }

        public void nextBytes(byte[] bytes) {
            delegate.nextBytes(bytes);
        }

        public int nextInt() {
            return delegate.nextInt();
        }

        public int nextInt(int n) {
            return delegate.nextInt(n);
        }

        public long nextLong() {
            return delegate.nextLong();
        }

        public boolean nextBoolean() {
            return delegate.nextBoolean();
        }

        public float nextFloat() {
            return delegate.nextFloat();
        }

        public double nextDouble() {
            return delegate.nextDouble();
        }

        public double nextGaussian() {
            return delegate.nextGaussian();
        }
    }
}