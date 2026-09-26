package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;

public class SimplexOptimizerTest {

    private SimplexOptimizer optimizer;

    @Before
    public void setUp() {
        optimizer = new SimplexOptimizer(1e-10, 1e-10);
    }

    @After
    public void tearDown() {
        optimizer = null;
    }

    @Test
    public void testConstructorWithChecker() {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-5, 1e-5);
        SimplexOptimizer opt = new SimplexOptimizer(checker);
        assertNotNull(opt);
    }

    @Test
    public void testConstructorWithThresholds() {
        SimplexOptimizer opt = new SimplexOptimizer(1e-6, 1e-6);
        assertNotNull(opt);
    }

    @Test
    public void testOptimizeWithoutSimplexThrowsNullArgumentException() {
        try {
            optimizer.optimize(new MaxEval(100),
                              new ObjectiveFunction(new MultivariateFunction() {
                                  public double value(double[] point) {
                                      return point[0] * point[0];
                                  }
                              }),
                              GoalType.MINIMIZE,
                              new InitialGuess(new double[] { 1.0 }));
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testOptimizeWithBoundsThrowsMathUnsupportedOperationException() {
        try {
            optimizer.optimize(new MaxEval(100),
                              new ObjectiveFunction(new MultivariateFunction() {
                                  public double value(double[] point) {
                                      return point[0] * point[0];
                                  }
                              }),
                              GoalType.MINIMIZE,
                              new InitialGuess(new double[] { 1.0 }),
                              new AbstractSimplex(2) {
                                  @Override
                                  public void iterate(MultivariateFunction evalFunc, Comparator<PointValuePair> comparator) {
                                      // dummy
                                  }
                              },
                              new org.apache.commons.math3.optim.nonlinear.scalar.Bounds(new double[] {0}, new double[] {1}));
            fail("Expected MathUnsupportedOperationException");
        } catch (MathUnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testOptimizeSimpleQuadraticMinimize() {
        SimplexOptimizer opt = new SimplexOptimizer(1e-8, 1e-8);
        PointValuePair result = opt.optimize(new MaxEval(1000),
                                            new ObjectiveFunction(new MultivariateFunction() {
                                                public double value(double[] point) {
                                                    return point[0] * point[0] + point[1] * point[1];
                                                }
                                            }),
                                            GoalType.MINIMIZE,
                                            new InitialGuess(new double[] { 1.0, 2.0 }),
                                            new NelderMeadSimplex(2));
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-6);
        assertEquals(0.0, result.getPoint()[0], 1e-6);
        assertEquals(0.0, result.getPoint()[1], 1e-6);
    }

    @Test
    public void testOptimizeSimpleQuadraticMaximize() {
        SimplexOptimizer opt = new SimplexOptimizer(1e-8, 1e-8);
        PointValuePair result = opt.optimize(new MaxEval(1000),
                                            new ObjectiveFunction(new MultivariateFunction() {
                                                public double value(double[] point) {
                                                    return -point[0] * point[0] - point[1] * point[1];
                                                }
                                            }),
                                            GoalType.MAXIMIZE,
                                            new InitialGuess(new double[] { 1.0, 2.0 }),
                                            new NelderMeadSimplex(2));
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-6);
        assertEquals(0.0, result.getPoint()[0], 1e-6);
        assertEquals(0.0, result.getPoint()[1], 1e-6);
    }

    @Test
    public void testOptimizeWithOneIterationConvergence() {
        SimplexOptimizer opt = new SimplexOptimizer(1e-2, 1e-2);
        PointValuePair result = opt.optimize(new MaxEval(100),
                                            new ObjectiveFunction(new MultivariateFunction() {
                                                public double value(double[] point) {
                                                    return point[0] * point[0];
                                                }
                                            }),
                                            GoalType.MINIMIZE,
                                            new InitialGuess(new double[] { 0.001 }),
                                            new NelderMeadSimplex(1));
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-2);
    }

    @Test
    public void testCheckParametersWithBothBounds() {
        SimplexOptimizer opt = new SimplexOptimizer(1e-8, 1e-8);
        try {
            opt.optimize(new MaxEval(100),
                        new ObjectiveFunction(new MultivariateFunction() {
                            public double value(double[] point) {
                                return point[0];
                            }
                        }),
                        GoalType.MINIMIZE,
                        new InitialGuess(new double[] { 0.0 }),
                        new NelderMeadSimplex(1),
                        new org.apache.commons.math3.optim.nonlinear.scalar.Bounds(new double[] {0}, new double[] {1}));
            fail("Expected MathUnsupportedOperationException");
        } catch (MathUnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testOptimizeMultipleRounds() {
        SimplexOptimizer opt = new SimplexOptimizer(1e-10, 1e-10);
        PointValuePair result = opt.optimize(new MaxEval(10000),
                                            new ObjectiveFunction(new MultivariateFunction() {
                                                public double value(double[] point) {
                                                    return point[0] * point[0] + point[1] * point[1] + point[2] * point[2];
                                                }
                                            }),
                                            GoalType.MINIMIZE,
                                            new InitialGuess(new double[] { 3.0, 4.0, 5.0 }),
                                            new NelderMeadSimplex(3));
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-6);
        assertEquals(0.0, result.getPoint()[0], 1e-6);
        assertEquals(0.0, result.getPoint()[1], 1e-6);
        assertEquals(0.0, result.getPoint()[2], 1e-6);
    }

    @Test
    public void testOptimizeWithNullGoalType() {
        try {
            optimizer.optimize(new MaxEval(100),
                              new ObjectiveFunction(new MultivariateFunction() {
                                  public double value(double[] point) {
                                      return point[0];
                                  }
                              }),
                              null,
                              new InitialGuess(new double[] { 0.0 }),
                              new NelderMeadSimplex(1));
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }
}