package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.linear.RealVectorImpl;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Test;

public class SimplexTableauTest {

    private static final double EPS = 1e-6;

    private RealVector vector(double... values) {
        return new RealVectorImpl(values);
    }

    private LinearObjectiveFunction objective() {
        return new LinearObjectiveFunction(vector(3.0, 5.0), 0.0);
    }

    private SimplexTableau createMixedTableau(boolean restrict, GoalType goalType) {
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(vector(1.0, 0.0), Relationship.LEQ, 4.0));
        constraints.add(new LinearConstraint(vector(0.0, 1.0), Relationship.GEQ, 2.0));
        constraints.add(new LinearConstraint(vector(1.0, 1.0), Relationship.EQ, 5.0));
        return new SimplexTableau(objective(), constraints, goalType, restrict, EPS);
    }

    private SimplexTableau createLeqTableau() {
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(vector(1.0, 0.0), Relationship.LEQ, 4.0));
        constraints.add(new LinearConstraint(vector(0.0, 1.0), Relationship.LEQ, 6.0));
        return new SimplexTableau(objective(), constraints, GoalType.MAXIMIZE, true, EPS);
    }

    @Test
    public void testConstructorCountsWithArtificialVariables() {
        SimplexTableau tableau = createMixedTableau(true, GoalType.MAXIMIZE);
        assertEquals(2, tableau.getNumVariables());
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(2, tableau.getNumSlackVariables());
        assertEquals(2, tableau.getNumArtificialVariables());
        assertEquals(2, tableau.getNumObjectiveFunctions());
        assertEquals(9, tableau.getWidth());
        assertEquals(5, tableau.getHeight());
        assertEquals(4, tableau.getSlackVariableOffset());
        assertEquals(6, tableau.getArtificialVariableOffset());
        assertEquals(8, tableau.getRhsOffset());
    }

    @Test
    public void testConstructorWithoutNonNegativeRestriction() {
        SimplexTableau tableau = createMixedTableau(false, GoalType.MINIMIZE);
        assertEquals(2, tableau.getNumVariables());
        assertEquals(3, tableau.getNumDecisionVariables());
        assertEquals(2, tableau.getOriginalNumDecisionVariables());
        assertEquals(2, tableau.getNumSlackVariables());
        assertEquals(2, tableau.getNumArtificialVariables());
        assertEquals(2, tableau.getNumObjectiveFunctions());
        assertEquals(10, tableau.getWidth());
        assertEquals(5, tableau.getHeight());
        assertEquals(5, tableau.getSlackVariableOffset());
        assertEquals(7, tableau.getArtificialVariableOffset());
        assertEquals(9, tableau.getRhsOffset());
    }

    @Test
    public void testEmptyConstraintsTableau() {
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        SimplexTableau tableau = new SimplexTableau(
                new LinearObjectiveFunction(vector(1.0), 2.0),
                constraints, GoalType.MAXIMIZE, true, EPS);
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertEquals(0, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(1, tableau.getWidth());
        assertEquals(1, tableau.getHeight());
    }

    @Test
    public void testGetNumObjectiveFunctionsWithNoArtificialVariables() {
        SimplexTableau tableau = createLeqTableau();
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertEquals(2, tableau.getNumSlackVariables());
        assertEquals(6, tableau.getWidth());
        assertEquals(3, tableau.getHeight());
    }

    @Test
    public void testNormalizedConstraintsWithNegativeRhs() {
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(vector(1.0, 2.0), Relationship.GEQ, -3.0));
        SimplexTableau tableau = new SimplexTableau(
                new LinearObjectiveFunction(vector(1.0, 1.0), 0.0),
                constraints, GoalType.MAXIMIZE, true, EPS);
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(1, normalized.size());
        LinearConstraint constraint = normalized.get(0);
        assertEquals(-1.0, constraint.getCoefficients().getEntry(0), EPS);
        assertEquals(-2.0, constraint.getCoefficients().getEntry(1), EPS);
        assertEquals(Relationship.LEQ, constraint.getRelationship());
        assertEquals(3.0, constraint.getValue(), EPS);
    }

    @Test
    public void testCreateTableauMaximize() {
        SimplexTableau tableau = createMixedTableau(true, GoalType.MAXIMIZE);
        double[][] data = tableau.getData();
        assertEquals(5, data.length);
        assertEquals(9, data[0].length);
        assertEquals(-1.0, tableau.getEntry(0, 0), EPS);
        assertEquals(1.0, tableau.getEntry(1, 1), EPS);
        assertEquals(-3.0, tableau.getEntry(1, 2), EPS);
        assertEquals(-5.0, tableau.getEntry(1, 3), EPS);
        assertEquals(0.0, tableau.getEntry(1, tableau.getRhsOffset()), EPS);
    }

    @Test
    public void testCreateTableauMinimize() {
        SimplexTableau tableau = createMixedTableau(true, GoalType.MINIMIZE);
        assertEquals(-1.0, tableau.getEntry(1, 1), EPS);
        assertEquals(3.0, tableau.getEntry(1, 2), EPS);
        assertEquals(5.0, tableau.getEntry(1, 3), EPS);
        assertEquals(0.0, tableau.getEntry(1, tableau.getRhsOffset()), EPS);
    }

    @Test
    public void testGetSolutionWithoutArtificialVariables() {
        SimplexTableau tableau = createLeqTableau();
        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution);
        assertEquals(2, solution.getPoint().length);
        assertEquals(42.0, solution.getValue(), EPS);
    }

    @Test
    public void testGetSolutionWithoutNonNegativeRestriction() {
        SimplexTableau tableau = createMixedTableau(false, GoalType.MAXIMIZE);
        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution);
        assertEquals(2, solution.getPoint().length);
    }

    @Test
    public void testDivideRow() {
        SimplexTableau tableau = createMixedTableau(true, GoalType.MAXIMIZE);
        double original = tableau.getEntry(2, 1);
        tableau.divideRow(2, 2.0);
        assertEquals(original / 2.0, tableau.getEntry(2, 1), EPS);
    }

    @Test
    public void testSubtractRow() {
        SimplexTableau tableau = createMixedTableau(true, GoalType.MAXIMIZE);
        double before = tableau.getEntry(2, 0);
        double subtrahend = tableau.getEntry(0, 0);
        tableau.subtractRow(2, 0, 1.0);
        assertEquals(before - subtrahend, tableau.getEntry(2, 0), EPS);
    }

    @Test
    public void testDiscardArtificialVariables() {
        SimplexTableau tableau = createMixedTableau(true, GoalType.MAXIMIZE);
        int oldWidth = tableau.getWidth();
        int oldHeight = tableau.getHeight();
        int oldArtificial = tableau.getNumArtificialVariables();
        tableau.discardArtificialVariables();
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(oldWidth - oldArtificial - 1, tableau.getWidth());
        assertEquals(oldHeight - 1, tableau.getHeight());
    }

    @Test
    public void testDiscardArtificialVariablesWhenNonePresent() {
        SimplexTableau tableau = createLeqTableau();
        int width = tableau.getWidth();
        int height = tableau.getHeight();
        tableau.discardArtificialVariables();
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(width, tableau.getWidth());
        assertEquals(height, tableau.getHeight());
    }

    @Test
    public void testEqualsAndHashCode() {
        SimplexTableau t1 = createMixedTableau(true, GoalType.MAXIMIZE);
        SimplexTableau t2 = createMixedTableau(true, GoalType.MAXIMIZE);
        assertTrue(t1.equals(t2));
        assertEquals(t1.hashCode(), t2.hashCode());
        assertTrue(t1.equals(t1));
        assertFalse(t1.equals(null));
        assertFalse(t1.equals("not a tableau"));
        assertFalse(t1.equals(createMixedTableau(true, GoalType.MINIMIZE)));
    }

    @Test
    public void testSerialization() {
        SimplexTableau original = createMixedTableau(true, GoalType.MAXIMIZE);
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(original);
            oos.close();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            SimplexTableau copy = (SimplexTableau) ois.readObject();
            ois.close();

            assertEquals(original, copy);
            assertEquals(original.getWidth(), copy.getWidth());
            assertEquals(original.getHeight(), copy.getHeight());
        } catch (IOException ex) {
            fail("IOException: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            fail("ClassNotFoundException: " + ex.getMessage());
        }
    }

    @Test
    public void testNullConstraintsThrowsNullPointerException() {
        try {
            new SimplexTableau(objective(), null, GoalType.MAXIMIZE, true, EPS);
            fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
            // expected
        }
    }
}