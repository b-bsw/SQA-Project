package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Test;

public class SimplexTableauTest {

    private SimplexTableau createTableau(double[] fCoeff, double fConst,
                                         LinearConstraint[] constraints,
                                         GoalType goalType, boolean restrictToNonNegative,
                                         double epsilon) {
        return new SimplexTableau(new LinearObjectiveFunction(fCoeff, fConst),
                                  Arrays.asList(constraints),
                                  goalType, restrictToNonNegative, epsilon);
    }

    @Test
    public void testConstructorAndDimensionsForLeqConstraint() {
        SimplexTableau tableau = createTableau(
                new double[]{3, 4}, 6,
                new LinearConstraint[]{new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 10)},
                GoalType.MAXIMIZE, true, 1.0e-6);

        assertEquals(2, tableau.getNumVariables());
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(1, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertEquals(5, tableau.getWidth());
        assertEquals(2, tableau.getHeight());
        assertEquals(3, tableau.getSlackVariableOffset());
        assertEquals(4, tableau.getRhsOffset());

        double[][] data = tableau.getData();
        assertEquals(2, data.length);
        assertEquals(5, data[0].length);
        assertArrayEquals(new double[]{1, -3, -4, 0, 6}, data[0], 1.0e-9);
        assertArrayEquals(new double[]{0, 1, 0, 1, 10}, data[1], 1.0e-9);
    }

    @Test
    public void testMinimizeObjectiveRowSigns() {
        SimplexTableau tableau = createTableau(
                new double[]{3, 4}, 6,
                new LinearConstraint[]{new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 10)},
                GoalType.MINIMIZE, true, 1.0e-6);

        assertArrayEquals(new double[]{-1, 3, 4, 0, -6}, tableau.getData()[0], 1.0e-9);
    }

    @Test
    public void testArtificialVariablesCreatePhaseOneTableau() {
        SimplexTableau tableau = createTableau(
                new double[]{1}, 0,
                new LinearConstraint[]{new LinearConstraint(new double[]{2}, Relationship.GEQ, 4)},
                GoalType.MAXIMIZE, true, 1.0e-6);

        assertEquals(1, tableau.getNumDecisionVariables());
        assertEquals(1, tableau.getNumSlackVariables());
        assertEquals(1, tableau.getNumArtificialVariables());
        assertEquals(2, tableau.getNumObjectiveFunctions());
        assertEquals(6, tableau.getWidth());
        assertEquals(3, tableau.getHeight());
        assertEquals(3, tableau.getSlackVariableOffset());
        assertEquals(4, tableau.getArtificialVariableOffset());
        assertEquals(5, tableau.getRhsOffset());

        double[][] data = tableau.getData();
        assertArrayEquals(new double[]{-1, 0, -2, 1, 0, -4}, data[0], 1.0e-9);
        assertArrayEquals(new double[]{0, 1, -1, 0, 0, 0}, data[1], 1.0e-9);
        assertArrayEquals(new double[]{0, 0, 2, -1, 1, 4}, data[2], 1.0e-9);
    }

    @Test
    public void testGetNormalizedConstraintsFlipsNegativeRhs() {
        SimplexTableau tableau = createTableau(
                new double[]{1, 1}, 0,
                new LinearConstraint[]{
                        new LinearConstraint(new double[]{1, -2}, Relationship.LEQ, -5),
                        new LinearConstraint(new double[]{3, 4}, Relationship.GEQ, 5)
                },
                GoalType.MINIMIZE, true, 1.0e-6);

        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(2, normalized.size());

        LinearConstraint first = normalized.get(0);
        assertEquals(Relationship.GEQ, first.getRelationship());
        assertEquals(5.0, first.getValue(), 1.0e-9);
        assertArrayEquals(new double[]{-1, 2}, first.getCoefficients().getData(), 1.0e-9);

        LinearConstraint second = normalized.get(1);
        assertEquals(Relationship.GEQ, second.getRelationship());
        assertEquals(5.0, second.getValue(), 1.0e-9);
        assertArrayEquals(new double[]{3, 4}, second.getCoefficients().getData(), 1.0e-9);
    }

    @Test
    public void testEmptyConstraints() {
        SimplexTableau tableau = createTableau(
                new double[]{1, 1}, 0,
                new LinearConstraint[0],
                GoalType.MAXIMIZE, true, 1.0e-6);

        assertEquals(0, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertEquals(4, tableau.getWidth());
        assertEquals(1, tableau.getHeight());
        assertEquals(0, tableau.getNormalizedConstraints().size());
    }

    @Test
    public void testGetSolutionReturnsInitialBasicFeasibleSolution() {
        SimplexTableau tableau = createTableau(
                new double[]{1, 2}, 3,
                new LinearConstraint[]{
                        new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 4),
                        new LinearConstraint(new double[]{1, -1}, Relationship.LEQ, 2)
                },
                GoalType.MINIMIZE, true, 1.0e-6);

        RealPointValuePair solution = tableau.getSolution();
        assertArrayEquals(new double[]{0, 0}, solution.getPoint(), 1.0e-9);
        assertEquals(3.0, solution.getValue(), 1.0e-9);
    }

    @Test
    public void testGetSolutionBreaksTiesForDuplicateBasicRows() {
        SimplexTableau tableau = createTableau(
                new double[]{1, 2}, 3,
                new LinearConstraint[]{new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 4)},
                GoalType.MINIMIZE, true, 1.0e-6);

        RealPointValuePair solution = tableau.getSolution();
        assertArrayEquals(new double[]{4, 0}, solution.getPoint(), 1.0e-9);
        assertEquals(7.0, solution.getValue(), 1.0e-9);
    }

    @Test
    public void testRestrictToNonNegativeFalseEnablesNegativeValues() {
        SimplexTableau tableau = createTableau(
                new double[]{1}, 0,
                new LinearConstraint[]{new LinearConstraint(new double[]{-1}, Relationship.LEQ, 4)},
                GoalType.MINIMIZE, false, 1.0e-6);

        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(1, tableau.getOriginalNumDecisionVariables());
        assertEquals(2, tableau.getNegativeDecisionVariableOffset());
        assertEquals(3, tableau.getSlackVariableOffset());

        double[][] data = tableau.getData();
        assertEquals(-1.0, data[0][2], 1.0e-9);
        assertEquals(1.0, data[1][2], 1.0e-9);

        RealPointValuePair solution = tableau.getSolution();
        assertArrayEquals(new double[]{-4}, solution.getPoint(), 1.0e-9);
        assertEquals(-4.0, solution.getValue(), 1.0e-9);
    }

    @Test
    public void testDivideRowSubtractRowAndSetEntry() {
        SimplexTableau tableau = createTableau(
                new double[]{3, 4}, 6,
                new LinearConstraint[]{new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 10)},
                GoalType.MAXIMIZE, true, 1.0e-6);

        tableau.divideRow(1, 2);
        assertEquals(0.5, tableau.getEntry(1, 1), 1.0e-9);
        assertEquals(5.0, tableau.getEntry(1, 4), 1.0e-9);

        tableau.setEntry(0, 0, 99.0);
        assertEquals(99.0, tableau.getEntry(0, 0), 1.0e-9);

        double[] row0BeforeSubtract = tableau.getData()[0].clone();
        tableau.subtractRow(0, 1, 2);
        double[] row0 = tableau.getData()[0];
        double[] row1 = tableau.getData()[1];
        for (int j = 0; j < tableau.getWidth(); j++) {
            assertEquals(row0BeforeSubtract[j] - 2.0 * row1[j], row0[j], 1.0e-9);
        }
    }

    @Test
    public void testDiscardArtificialVariables() {
        SimplexTableau artificial = createTableau(
                new double[]{1}, 0,
                new LinearConstraint[]{new LinearConstraint(new double[]{2}, Relationship.GEQ, 4)},
                GoalType.MAXIMIZE, true, 1.0e-6);

        assertEquals(2, artificial.getNumObjectiveFunctions());
        artificial.discardArtificialVariables();
        assertEquals(0, artificial.getNumArtificialVariables());
        assertEquals(1, artificial.getNumObjectiveFunctions());
        assertEquals(2, artificial.getHeight());
        assertEquals(4, artificial.getWidth());

        SimplexTableau noArtificial = createTableau(
                new double[]{3, 4}, 6,
                new LinearConstraint[]{new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 10)},
                GoalType.MAXIMIZE, true, 1.0e-6);

        int oldWidth = noArtificial.getWidth();
        int oldHeight = noArtificial.getHeight();
        noArtificial.discardArtificialVariables();
        assertEquals(oldWidth, noArtificial.getWidth());
        assertEquals(oldHeight, noArtificial.getHeight());
    }

    @Test
    public void testEqualsAndHashCode() {
        LinearConstraint constraint = new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 10);

        SimplexTableau t1 = createTableau(new double[]{3, 4}, 6,
                new LinearConstraint[]{constraint}, GoalType.MAXIMIZE, true, 1.0e-6);
        SimplexTableau t2 = createTableau(new double[]{3, 4}, 6,
                new LinearConstraint[]{constraint}, GoalType.MAXIMIZE, true, 1.0e-6);
        SimplexTableau t3 = createTableau(new double[]{3, 4}, 6,
                new LinearConstraint[]{new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 11)},
                GoalType.MAXIMIZE, true, 1.0e-6);

        assertEquals(t1, t1);
        assertEquals(t1, t2);
        assertEquals(t1.hashCode(), t2.hashCode());
        assertFalse(t1.equals(null));
        assertFalse(t1.equals("not a tableau"));
        assertFalse(t1.equals(t3));
    }
}