package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.linear.RealVector;
import java.util.*;

public class SimplexTableauTest {

    private LinearObjectiveFunction createFunction(double[] coeffs, double constant) {
        return new LinearObjectiveFunction(coeffs, constant);
    }

    private LinearConstraint createConstraint(double[] coeffs, Relationship rel, double value) {
        return new LinearConstraint(coeffs, rel, value);
    }

    @Test
    public void testConstructorMinimizeRestrictNonNegative() {
        LinearObjectiveFunction f = createFunction(new double[]{2.0, 3.0}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(createConstraint(new double[]{1.0, 1.0}, Relationship.LEQ, 5.0));
        constraints.add(createConstraint(new double[]{2.0, 1.0}, Relationship.GEQ, 4.0));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, 1e-6);
        assertEquals(2, tableau.getOriginalNumDecisionVariables());
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(2, tableau.getNumSlackVariables());
        assertEquals(1, tableau.getNumArtificialVariables());
        assertEquals(8, tableau.getWidth());
        assertEquals(4, tableau.getHeight());
        assertEquals("W", tableau.columnLabels.get(0));
        assertEquals("Z", tableau.columnLabels.get(1));
    }

    @Test
    public void testConstructorMaximizeNotRestricted() {
        LinearObjectiveFunction f = createFunction(new double[]{-1.0, 2.0}, 10);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(createConstraint(new double[]{1.0, 0.0}, Relationship.EQ, 2.0));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1e-6);
        assertEquals(2, tableau.getOriginalNumDecisionVariables());
        assertEquals(3, tableau.getNumDecisionVariables());
        assertEquals(0, tableau.getNumSlackVariables());
        assertEquals(1, tableau.getNumArtificialVariables());
        assertEquals(7, tableau.getWidth());
        assertEquals(3, tableau.getHeight());
        assertTrue(tableau.columnLabels.contains("x-"));
    }

    @Test
    public void testNormalizeConstraints() {
        LinearConstraint original = createConstraint(new double[]{1.0, -2.0}, Relationship.LEQ, -5.0);
        List<LinearConstraint> list = new ArrayList<LinearConstraint>();
        list.add(original);
        SimplexTableau tableau = new SimplexTableau(
            createFunction(new double[]{1.0}, 0),
            list, GoalType.MINIMIZE, true, 1e-6);
        LinearConstraint normalized = tableau.normalizeConstraints(list).get(0);
        assertEquals(5.0, normalized.getValue(), 1e-12);
        assertEquals(Relationship.GEQ, normalized.getRelationship());
        assertEquals(-1.0, normalized.getCoefficients().getEntry(0), 1e-12);
        assertEquals(2.0, normalized.getCoefficients().getEntry(1), 1e-12);
    }

    @Test
    public void testIsOptimalTrue() {
        LinearObjectiveFunction f = createFunction(new double[]{1.0, 0.0}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(createConstraint(new double[]{1.0, 0.0}, Relationship.LEQ, 2.0));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, 1e-6);
        assertTrue(tableau.isOptimal());
    }

    @Test
    public void testIsOptimalFalse() {
        LinearObjectiveFunction f = createFunction(new double[]{-1.0, 1.0}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(createConstraint(new double[]{1.0, 0.0}, Relationship.LEQ, 2.0));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertFalse(tableau.isOptimal());
    }

    @Test
    public void testGetBasicRow() {
        SimplexTableau tableau = createSimpleTableau();
        int slackOffset = tableau.getSlackVariableOffset();
        Integer row = tableau.getBasicRow(slackOffset);
        assertNotNull(row);
    }

    @Test
    public void testDivideRow() {
        SimplexTableau tableau = createSimpleTableau();
        double before = tableau.getEntry(1, 0);
        tableau.divideRow(1, 2.0);
        assertEquals(before / 2.0, tableau.getEntry(1, 0), 1e-12);
    }

    @Test
    public void testSubtractRow() {
        SimplexTableau tableau = createSimpleTableau();
        double before0 = tableau.getEntry(0, 0);
        double before1 = tableau.getEntry(1, 0);
        tableau.subtractRow(0, 1, 0.5);
        assertEquals(before0 - 0.5 * before1, tableau.getEntry(0, 0), 1e-12);
    }

    @Test
    public void testDropPhase1Objective() {
        LinearObjectiveFunction f = createFunction(new double[]{1.0, 1.0}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(createConstraint(new double[]{1.0, 0.0}, Relationship.GEQ, 2.0));
        constraints.add(createConstraint(new double[]{0.0, 1.0}, Relationship.EQ, 3.0));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, 1e-6);
        assertEquals(2, tableau.getNumObjectiveFunctions());
        assertEquals(2, tableau.getNumArtificialVariables());
        tableau.dropPhase1Objective();
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testGetSolution() {
        SimplexTableau tableau = createSimpleTableau();
        PointValuePair sol = tableau.getSolution();
        assertNotNull(sol);
        assertNotNull(sol.getPoint());
        assertEquals(2, sol.getPoint().length);
    }

    @Test
    public void testEqualsAndHashCode() {
        SimplexTableau t1 = createSimpleTableau();
        SimplexTableau t2 = createSimpleTableau();
        assertEquals(t1, t2);
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void testEmptyConstraints() {
        LinearObjectiveFunction f = createFunction(new double[]{1.0}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(0, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertEquals(3, tableau.getWidth());
        assertEquals(1, tableau.getHeight());
        assertTrue(tableau.isOptimal());
    }

    private SimplexTableau createSimpleTableau() {
        LinearObjectiveFunction f = createFunction(new double[]{1.0, 2.0}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(createConstraint(new double[]{3.0, 4.0}, Relationship.LEQ, 5.0));
        constraints.add(createConstraint(new double[]{6.0, 7.0}, Relationship.GEQ, 8.0));
        return new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, 1e-6, 10);
    }
}