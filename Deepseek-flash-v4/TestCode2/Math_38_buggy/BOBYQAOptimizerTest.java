package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import org.junit.Assert;

import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;

public class BOBYQAOptimizerTest {

    private static class TestFunction implements MultivariateFunction {
        @Override
        public double value(double[] point) {
            double sum = 0;
            for (double x : point) {
                sum += x * x;
            }
            return sum;
        }
    }

    private static class TestOptimizer extends BOBYQAOptimizer {
        private final double[] lower;
        private final double[] upper;
        private final double[] start;
        private final MultivariateFunction function;
        private final GoalType goalType;
        private int evaluations;

        TestOptimizer(int n, double[] lower, double[] upper, double[] start,
                      MultivariateFunction f, GoalType goal) {
            super(n);
            this.lower = lower;
            this.upper = upper;
            this.start = start;
            this.function = f;
            this.goalType = goal;
            this.evaluations = 0;
        }

        @Override
        protected double[] getLowerBound() {
            return lower;
        }

        @Override
        protected double[] getUpperBound() {
            return upper;
        }

        @Override
        protected double[] getStartPoint() {
            return start;
        }

        @Override
        protected double computeObjectiveValue(double[] point) {
            evaluations++;
            double val = function.value(point);
            return (goalType == GoalType.MINIMIZE) ? val : -val;
        }

        @Override
        protected int getEvaluations() {
            return evaluations;
        }

        @Override
        protected GoalType getGoalType() {
            return goalType;
        }
    }

    @Test
    public void testConstructorValid() {
        BOBYQAOptimizer opt = new BOBYQAOptimizer(4);
        Assert.assertNotNull(opt);
    }

    @Test(timeout = 10000)
    public void testDoOptimizeSimpleMinimize() {
        double[] lower = {0.0, 0.0};
        double[] upper = {10.0, 10.0};
        double[] start = {5.0, 5.0};
        MultivariateFunction f = new TestFunction();
        TestOptimizer opt = new TestOptimizer(4, lower, upper, start, f, GoalType.MINIMIZE);
        RealPointValuePair result = opt.doOptimize();
        Assert.assertNotNull(result);
        double objVal = result.getValue();
        // Expect optimum near 0.0
        Assert.assertTrue("Objective value too large: " + objVal, objVal < 1e-5);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testDoOptimizeDimensionLessThan2() {
        double[] lower = {0.0};
        double[] upper = {10.0};
        double[] start = {5.0};
        MultivariateFunction f = new TestFunction();
        // numberOfInterpolationPoints must be >= dimension+2 = 3; choose 3
        TestOptimizer opt = new TestOptimizer(3, lower, upper, start, f, GoalType.MINIMIZE);
        opt.doOptimize();
    }

    @Test(expected = OutOfRangeException.class)
    public void testDoOptimizeInvalidInterpolationPointsLow() {
        double[] lower = {0.0, 0.0};
        double[] upper = {10.0, 10.0};
        double[] start = {5.0, 5.0};
        MultivariateFunction f = new TestFunction();
        // n = 3 is below lower bound (dimension+2 = 4)
        TestOptimizer opt = new TestOptimizer(3, lower, upper, start, f, GoalType.MINIMIZE);
        opt.doOptimize();
    }

    @Test(expected = OutOfRangeException.class)
    public void testDoOptimizeInvalidInterpolationPointsHigh() {
        double[] lower = {0.0, 0.0};
        double[] upper = {10.0, 10.0};
        double[] start = {5.0, 5.0};
        MultivariateFunction f = new TestFunction();
        // n = 7 is above upper bound ((dimension+2)*(dimension+1)/2 = 6)
        TestOptimizer opt = new TestOptimizer(7, lower, upper, start, f, GoalType.MINIMIZE);
        opt.doOptimize();
    }

    @Test(timeout = 10000)
    public void testDoOptimizeBoundDifferenceSmallAdjustsRadius() {
        // Bounds very close: minDiff = 0.1, required min diff = 2*10=20
        // initialTrustRegionRadius should be reduced to minDiff/3.0
        double[] lower = {0.0, 0.0};
        double[] upper = {0.1, 0.1};
        double[] start = {0.05, 0.05};
        MultivariateFunction f = new TestFunction();
        TestOptimizer opt = new TestOptimizer(4, lower, upper, start, f, GoalType.MINIMIZE);
        RealPointValuePair result = opt.doOptimize();
        Assert.assertNotNull(result);
        // Should converge close to 0,0
        double objVal = result.getValue();
        Assert.assertTrue("Objective value too large: " + objVal, objVal < 1e-5);
    }
}