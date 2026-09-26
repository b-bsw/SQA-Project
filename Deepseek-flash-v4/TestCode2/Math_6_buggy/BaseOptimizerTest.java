package org.apache.commons.math3.optim;

import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.TooManyIterationsException;
import org.junit.Test;
import static org.junit.Assert.*;

public class BaseOptimizerTest {

    private static class TrueChecker implements ConvergenceChecker<Object> {
        @Override
        public boolean isConverged(int iteration, Object previous, Object current) {
            return true;
        }
    }

    private static class TestOptimizer extends BaseOptimizer<Object> {
        private boolean incEval;
        private boolean incIter;

        TestOptimizer(ConvergenceChecker<Object> checker) {
            super(checker);
        }

        void setIncEval(boolean incEval) {
            this.incEval = incEval;
        }

        void setIncIter(boolean incIter) {
            this.incIter = incIter;
        }

        void runParse(OptimizationData... data) {
            parseOptimizationData(data);
        }

        @Override
        protected Object doOptimize() {
            if (incEval) {
                incrementEvaluationCount();
                incrementEvaluationCount();
            }
            if (incIter) {
                incrementIterationCount();
                incrementIterationCount();
            }
            return new Object();
        }
    }

    private final TrueChecker checker = new TrueChecker();

    @Test
    public void testInitialCounters() {
        TestOptimizer opt = new TestOptimizer(checker);
        assertEquals(0, opt.getMaxEvaluations());
        assertEquals(0, opt.getMaxIterations());
        assertEquals(0, opt.getEvaluations());
        assertEquals(0, opt.getIterations());
    }

    @Test
    public void testGetConvergenceChecker() {
        TrueChecker c = new TrueChecker();
        TestOptimizer opt = new TestOptimizer(c);
        assertSame(c, opt.getConvergenceChecker());
    }

    @Test
    public void testParseOptimizationData() {
        TestOptimizer opt = new TestOptimizer(checker);
        opt.runParse(new MaxEval(3), new MaxIter(5));
        assertEquals(3, opt.getMaxEvaluations());
        assertEquals(5, opt.getMaxIterations());

        opt.runParse(new MaxEval(7));
        assertEquals(7, opt.getMaxEvaluations());
        assertEquals(5, opt.getMaxIterations());

        opt.runParse(new MaxIter(9));
        assertEquals(7, opt.getMaxEvaluations());
        assertEquals(9, opt.getMaxIterations());

        opt.runParse((OptimizationData) null);
        assertEquals(7, opt.getMaxEvaluations());
        assertEquals(9, opt.getMaxIterations());

        opt.runParse();
        assertEquals(7, opt.getMaxEvaluations());
        assertEquals(9, opt.getMaxIterations());
    }

    @Test
    public void testOptimizeReturnsResultAndUpdatesCounts() {
        TestOptimizer opt = new TestOptimizer(checker);
        opt.setIncEval(true);
        opt.setIncIter(true);

        Object result = opt.optimize(new MaxEval(2), new MaxIter(2));

        assertNotNull(result);
        assertEquals(2, opt.getEvaluations());
        assertEquals(2, opt.getIterations());
        assertEquals(2, opt.getMaxEvaluations());
        assertEquals(2, opt.getMaxIterations());
    }

    @Test
    public void testOptimizeResetsCountersAndAcceptsEmptyData() {
        TestOptimizer opt = new TestOptimizer(checker);
        opt.setIncEval(true);
        opt.setIncIter(true);
        opt.optimize(new MaxEval(2), new MaxIter(2));

        opt.setIncEval(false);
        opt.setIncIter(false);
        opt.optimize();

        assertEquals(0, opt.getEvaluations());
        assertEquals(0, opt.getIterations());
        assertEquals(2, opt.getMaxEvaluations());
        assertEquals(2, opt.getMaxIterations());
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimizeThrowsWhenEvaluationsExceeded() {
        TestOptimizer opt = new TestOptimizer(checker);
        opt.setIncEval(true);
        opt.optimize(new MaxEval(1), new MaxIter(2));
    }

    @Test(expected = TooManyIterationsException.class)
    public void testOptimizeThrowsWhenIterationsExceeded() {
        TestOptimizer opt = new TestOptimizer(checker);
        opt.setIncIter(true);
        opt.optimize(new MaxEval(2), new MaxIter(1));
    }
}