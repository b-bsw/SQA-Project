package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Test;

public class SimplexSolverTest {

    @Test
    public void testOptimizeMaximizeSimple() throws Exception {
        SimplexSolver solver = new SimplexSolver(1.0e-9);
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 1.0 }, 0.0);
        Collection<LinearConstraint> constraints = Arrays.asList(
                new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 1.0),
                new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.LEQ, 1.0));

        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertNotNull(solution);
        assertEquals(2.0, solution.getValue(), 1.0e-6);
        assertEquals(1.0, solution.getPoint()[0], 1.0e-6);
        assertEquals(1.0, solution.getPoint()[1], 1.0e-6);
    }

    @Test
    public void testOptimizeEqualityConstraint() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 0.0);
        Collection<LinearConstraint> constraints = Arrays.asList(
                new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.EQ, 3.0));

        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertEquals(6.0, solution.getValue(), 1.0e-6);
        assertEquals(0.0, solution.getPoint()[0], 1.0e-6);
        assertEquals(3.0, solution.getPoint()[1], 1.0e-6);
    }

    @Test
    public void testIsOptimalLifecycle() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 1.0 }, 0.0);
        Collection<LinearConstraint> constraints = Arrays.asList(
                new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 1.0),
                new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.LEQ, 1.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0e-6);

        assertFalse(solver.isOptimal(tableau));

        solver.solvePhase1(tableau);
        tableau.discardArtificialVariables();

        while (!solver.isOptimal(tableau)) {
            solver.doIteration(tableau);
        }

        assertTrue(solver.isOptimal(tableau));

        RealPointValuePair solution = tableau.getSolution();
        assertEquals(2.0, solution.getValue(), 1.0e-6);
        assertEquals(1.0, solution.getPoint()[0], 1.0e-6);
        assertEquals(1.0, solution.getPoint()[1], 1.0e-6);
    }

    @Test(expected = NoFeasibleSolutionException.class)
    public void testNoFeasibleSolution() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0 }, 0.0);
        Collection<LinearConstraint> constraints = Arrays.asList(
                new LinearConstraint(new double[] { 1.0 }, Relationship.LEQ, 0.0),
                new LinearConstraint(new double[] { 1.0 }, Relationship.GEQ, 1.0));

        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    @Test(expected = UnboundedSolutionException.class)
    public void testUnboundedSolution() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0 }, 0.0);

        solver.optimize(f, Collections.<LinearConstraint>emptyList(), GoalType.MAXIMIZE, true);
    }

}