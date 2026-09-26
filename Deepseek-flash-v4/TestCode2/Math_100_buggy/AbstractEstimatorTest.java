package org.apache.commons.math.estimation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AbstractEstimatorTest {

    private static class TestEstimator extends AbstractEstimator {
        @Override
        public void estimate(EstimationProblem problem) throws EstimationException {
            // no-op for unit tests
        }
    }

    private static class SimpleMeasurement extends WeightedMeasurement {
        private final double partial1;
        private final double partial2;

        SimpleMeasurement(double weight, double measuredValue, double partial1, double partial2) {
            super(weight, measuredValue);
            this.partial1 = partial1;
            this.partial2 = partial2;
        }

        @Override
        public double getTheoretical() {
            return 0.0;
        }

        @Override
        public double getPartial(EstimatedParameter parameter) {
            if ("p1".equals(parameter.getName())) {
                return partial1;
            }
            if ("p2".equals(parameter.getName())) {
                return partial2;
            }
            return 0.0;
        }
    }

    private static class TestProblem implements EstimationProblem {
        private final WeightedMeasurement[] measurements;
        private final EstimatedParameter[] allParameters;
        private final EstimatedParameter[] unboundParameters;

        TestProblem(WeightedMeasurement[] measurements, EstimatedParameter[] allParameters,
                    EstimatedParameter[] unboundParameters) {
            this.measurements = measurements;
            this.allParameters = allParameters;
            this.unboundParameters = unboundParameters;
        }

        @Override
        public WeightedMeasurement[] getMeasurements() {
            return measurements;
        }

        @Override
        public EstimatedParameter[] getAllParameters() {
            return allParameters;
        }

        @Override
        public EstimatedParameter[] getUnboundParameters() {
            return unboundParameters;
        }
    }

    @Test
    public void testInitialCounters() {
        TestEstimator estimator = new TestEstimator();
        assertEquals(0, estimator.getCostEvaluations());
        assertEquals(0, estimator.getJacobianEvaluations());
        estimator.setMaxCostEval(5);
    }

    @Test
    public void testInitializeEstimate() {
        TestEstimator estimator = new TestEstimator();
        estimator.setMaxCostEval(10);

        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter p2 = new EstimatedParameter("p2", 2.0);
        WeightedMeasurement m1 = new SimpleMeasurement(1.0, 1.0, 1.0, 0.0);
        WeightedMeasurement m2 = new SimpleMeasurement(1.0, 1.0, 0.0, 1.0);
        TestProblem problem = new TestProblem(
                new WeightedMeasurement[] {m1, m2},
                new EstimatedParameter[] {p1, p2},
                new EstimatedParameter[] {p1, p2});

        estimator.initializeEstimate(problem);

        assertSame(problem.getMeasurements(), estimator.measurements);
        assertSame(problem.getUnboundParameters(), estimator.parameters);
        assertEquals(2, estimator.rows);
        assertEquals(2, estimator.cols);
        assertEquals(4, estimator.jacobian.length);
        assertEquals(2, estimator.residuals.length);
        assertEquals(Double.POSITIVE_INFINITY, estimator.cost, 0.0);
        assertEquals(0, estimator.getCostEvaluations());
        assertEquals(0, estimator.getJacobianEvaluations());
    }

    @Test
    public void testUpdateJacobian() {
        TestEstimator estimator = new TestEstimator();
        estimator.setMaxCostEval(10);

        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter p2 = new EstimatedParameter("p2", 2.0);
        WeightedMeasurement m1 = new SimpleMeasurement(4.0, 0.0, 1.0, 2.0);
        WeightedMeasurement m2 = new SimpleMeasurement(9.0, 0.0, 3.0, 4.0);
        TestProblem problem = new TestProblem(
                new WeightedMeasurement[] {m1, m2},
                new EstimatedParameter[] {p1, p2},
                new EstimatedParameter[] {p1, p2});

        estimator.initializeEstimate(problem);
        estimator.updateJacobian();

        assertEquals(-2.0, estimator.jacobian[0], 1e-12);
        assertEquals(-4.0, estimator.jacobian[1], 1e-12);
        assertEquals(-9.0, estimator.jacobian[2], 1e-12);
        assertEquals(-12.0, estimator.jacobian[3], 1e-12);
        assertEquals(1, estimator.getJacobianEvaluations());
    }

    @Test
    public void testUpdateResidualsAndCost() throws Exception {
        TestEstimator estimator = new TestEstimator();
        estimator.setMaxCostEval(1);

        WeightedMeasurement m1 = new SimpleMeasurement(4.0, 1.0, 0.0, 0.0);
        WeightedMeasurement m2 = new SimpleMeasurement(1.0, 2.0, 0.0, 0.0);
        TestProblem problem = new TestProblem(
                new WeightedMeasurement[] {m1, m2},
                new EstimatedParameter[0],
                new EstimatedParameter[0]);

        estimator.initializeEstimate(problem);
        estimator.updateResidualsAndCost();

        assertEquals(1, estimator.getCostEvaluations());
        assertEquals(2.0, estimator.residuals[0], 1e-12);
        assertEquals(2.0, estimator.residuals[1], 1e-12);
        assertEquals(Math.sqrt(8.0), estimator.cost, 1e-12);
    }

    @Test
    public void testUpdateResidualsAndCostExceedsMax() throws Exception {
        TestEstimator estimator = new TestEstimator();
        estimator.setMaxCostEval(1);

        TestProblem empty = new TestProblem(
                new WeightedMeasurement[0],
                new EstimatedParameter[0],
                new EstimatedParameter[0]);

        estimator.initializeEstimate(empty);
        estimator.updateResidualsAndCost();

        try {
            estimator.updateResidualsAndCost();
            fail("Expected EstimationException");
        } catch (EstimationException ex) {
            assertNotNull(ex.getMessage());
        }
    }

    @Test
    public void testEmptyProblem() throws Exception {
        TestEstimator estimator = new TestEstimator();
        estimator.setMaxCostEval(1);

        TestProblem empty = new TestProblem(
                new WeightedMeasurement[0],
                new EstimatedParameter[0],
                new EstimatedParameter[0]);

        estimator.initializeEstimate(empty);
        estimator.updateJacobian();

        assertEquals(0, estimator.jacobian.length);
        assertEquals(1, estimator.getJacobianEvaluations());

        estimator.updateResidualsAndCost();
        assertEquals(0.0, estimator.cost, 0.0);
        assertEquals(1, estimator.getCostEvaluations());
    }

    @Test
    public void testGetRMS() {
        TestEstimator estimator = new TestEstimator();

        WeightedMeasurement m1 = new SimpleMeasurement(4.0, 1.0, 0.0, 0.0);
        WeightedMeasurement m2 = new SimpleMeasurement(9.0, 2.0, 0.0, 0.0);
        TestProblem problem = new TestProblem(
                new WeightedMeasurement[] {m1, m2},
                new EstimatedParameter[0],
                new EstimatedParameter[0]);

        assertEquals(Math.sqrt(20.0), estimator.getRMS(problem), 1e-12);
    }

    @Test
    public void testGetRMSEmpty() {
        TestProblem empty = new TestProblem(
                new WeightedMeasurement[0],
                new EstimatedParameter[0],
                new EstimatedParameter[0]);

        assertTrue(Double.isNaN(new TestEstimator().getRMS(empty)));
    }

    @Test
    public void testGetChiSquare() {
        TestEstimator estimator = new TestEstimator();

        WeightedMeasurement m1 = new SimpleMeasurement(4.0, 1.0, 0.0, 0.0);
        WeightedMeasurement m2 = new SimpleMeasurement(9.0, 2.0, 0.0, 0.0);
        TestProblem problem = new TestProblem(
                new WeightedMeasurement[] {m1, m2},
                new EstimatedParameter[0],
                new EstimatedParameter[0]);

        assertEquals(0.25 + 4.0 / 9.0, estimator.getChiSquare(problem), 1e-12);
    }

    @Test
    public void testGetChiSquareEmpty() {
        TestProblem empty = new TestProblem(
                new WeightedMeasurement[0],
                new EstimatedParameter[0],
                new EstimatedParameter[0]);

        assertEquals(0.0, new TestEstimator().getChiSquare(empty), 0.0);
    }

    @Test
    public void testGetCovariances() throws Exception {
        TestEstimator estimator = new TestEstimator();
        estimator.setMaxCostEval(10);

        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter p2 = new EstimatedParameter("p2", 2.0);
        WeightedMeasurement m1 = new SimpleMeasurement(1.0, 0.0, 1.0, 0.0);
        WeightedMeasurement m2 = new SimpleMeasurement(1.0, 0.0, 0.0, 2.0);
        TestProblem problem = new TestProblem(
                new WeightedMeasurement[] {m1, m2},
                new EstimatedParameter[] {p1, p2},
                new EstimatedParameter[] {p1, p2});

        estimator.initializeEstimate(problem);
        double[][] cov = estimator.getCovariances(problem);

        assertEquals(1.0, cov[0][0], 1e-12);
        assertEquals(0.0, cov[0][1], 1e-12);
        assertEquals(0.0, cov[1][0], 1e-12);
        assertEquals(0.25, cov[1][1], 1e-12);
    }

    @Test
    public void testGetCovariancesSingular() throws Exception {
        TestEstimator estimator = new TestEstimator();
        estimator.setMaxCostEval(10);

        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter p2 = new EstimatedParameter("p2", 2.0);
        WeightedMeasurement m1 = new SimpleMeasurement(1.0, 0.0, 0.0, 0.0);
        WeightedMeasurement m2 = new SimpleMeasurement(1.0, 0.0, 0.0, 0.0);
        TestProblem problem = new TestProblem(
                new WeightedMeasurement[] {m1, m2},
                new EstimatedParameter[] {p1, p2},
                new EstimatedParameter[] {p1, p2});

        estimator.initializeEstimate(problem);

        try {
            estimator.getCovariances(problem);
            fail("Expected EstimationException");
        } catch (EstimationException ex) {
            assertNotNull(ex.getMessage());
        }
    }

    @Test
    public void testGuessParametersErrors() throws Exception {
        TestEstimator estimator = new TestEstimator();
        estimator.setMaxCostEval(10);

        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter p2 = new EstimatedParameter("p2", 2.0);
        WeightedMeasurement m1 = new SimpleMeasurement(1.0, 3.0, 1.0, 0.0);
        WeightedMeasurement m2 = new SimpleMeasurement(1.0, 4.0, 0.0, 2.0);
        WeightedMeasurement m3 = new SimpleMeasurement(1.0, 5.0, 1.0, 1.0);
        TestProblem problem = new TestProblem(
                new WeightedMeasurement[] {m1, m2, m3},
                new EstimatedParameter[] {p1, p2},
                new EstimatedParameter[] {p1, p2});

        estimator.initializeEstimate(problem);
        double[] errors = estimator.guessParametersErrors(problem);

        assertEquals(2, errors.length);
        assertEquals(Math.sqrt(250.0 / 9.0), errors[0], 1e-12);
        assertEquals(10.0 / 3.0, errors[1], 1e-12);
    }

    @Test
    public void testGuessParametersErrorsNoDegreesOfFreedom() throws Exception {
        TestEstimator estimator = new TestEstimator();
        estimator.setMaxCostEval(10);

        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter p2 = new EstimatedParameter("p2", 2.0);
        EstimatedParameter p3 = new EstimatedParameter("p3", 3.0);
        WeightedMeasurement m1 = new SimpleMeasurement(1.0, 1.0, 1.0, 0.0);
        WeightedMeasurement m2 = new SimpleMeasurement(1.0, 1.0, 0.0, 1.0);
        TestProblem problem = new TestProblem(
                new WeightedMeasurement[] {m1, m2},
                new EstimatedParameter[] {p1, p2, p3},
                new EstimatedParameter[] {p1, p2, p3});

        estimator.initializeEstimate(problem);

        try {
            estimator.guessParametersErrors(problem);
            fail("Expected EstimationException");
        } catch (EstimationException ex) {
            assertNotNull(ex.getMessage());
        }
    }
}