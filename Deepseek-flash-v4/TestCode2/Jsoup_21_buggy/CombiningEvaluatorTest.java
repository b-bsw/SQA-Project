package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombiningEvaluatorTest {
    static class StubEval extends Evaluator {
        private final boolean result;
        private final String str;
        StubEval(boolean result, String str) {
            this.result = result;
            this.str = str;
        }
        @Override
        public boolean matches(Element root, Element node) {
            return result;
        }
        @Override
        public String toString() {
            return str;
        }
    }

    private final Element root = null;
    private final Element node = null;

    // And tests
    @Test
    public void testAndEmpty() {
        CombiningEvaluator.And and = new CombiningEvaluator.And(new ArrayList<Evaluator>());
        assertTrue(and.matches(root, node));
    }

    @Test
    public void testAndSingleTrue() {
        CombiningEvaluator.And and = new CombiningEvaluator.And(new StubEval(true, "true"));
        assertTrue(and.matches(root, node));
    }

    @Test
    public void testAndSingleFalse() {
        CombiningEvaluator.And and = new CombiningEvaluator.And(new StubEval(false, "false"));
        assertFalse(and.matches(root, node));
    }

    @Test
    public void testAndMultipleAllTrue() {
        CombiningEvaluator.And and = new CombiningEvaluator.And(
            new StubEval(true, "a"),
            new StubEval(true, "b")
        );
        assertTrue(and.matches(root, node));
    }

    @Test
    public void testAndMultipleOneFalse() {
        CombiningEvaluator.And and = new CombiningEvaluator.And(
            new StubEval(true, "a"),
            new StubEval(false, "b")
        );
        assertFalse(and.matches(root, node));
    }

    @Test(expected = NullPointerException.class)
    public void testAndNullEvaluatorInList() {
        List<Evaluator> list = new ArrayList<Evaluator>();
        list.add(new StubEval(true, "x"));
        list.add(null);
        CombiningEvaluator.And and = new CombiningEvaluator.And(list);
        and.matches(root, node);
    }

    @Test
    public void testAndToString() {
        CombiningEvaluator.And and = new CombiningEvaluator.And(
            new StubEval(true, "tag"),
            new StubEval(false, "class")
        );
        assertEquals("tag class", and.toString());
    }

    // Or tests
    @Test
    public void testOrEmpty() {
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(new ArrayList<Evaluator>());
        assertFalse(or.matches(root, node));
    }

    @Test
    public void testOrSingleTrue() {
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(
            Arrays.<Evaluator>asList(new StubEval(true, "true"))
        );
        assertTrue(or.matches(root, node));
    }

    @Test
    public void testOrSingleFalse() {
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(
            Arrays.<Evaluator>asList(new StubEval(false, "false"))
        );
        assertFalse(or.matches(root, node));
    }

    @Test
    public void testOrMultipleAllFalse() {
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(
            Arrays.<Evaluator>asList(
                new StubEval(false, "a"),
                new StubEval(false, "b")
            )
        );
        assertFalse(or.matches(root, node));
    }

    @Test
    public void testOrMultipleWithAddTrue() {
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(
            Arrays.<Evaluator>asList(new StubEval(true, "true"))
        );
        or.add(new StubEval(false, "false"));
        assertTrue(or.matches(root, node));
    }

    @Test
    public void testOrMultipleAllFalseWithAdd() {
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(
            Arrays.<Evaluator>asList(new StubEval(false, "f1"))
        );
        or.add(new StubEval(false, "f2"));
        assertFalse(or.matches(root, node));
    }

    @Test(expected = NullPointerException.class)
    public void testOrNullEvaluatorInList() {
        List<Evaluator> list = new ArrayList<Evaluator>();
        list.add(new StubEval(true, "x"));
        list.add(null);
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(list);
        or.matches(root, node);
    }

    @Test
    public void testOrToString() {
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(
            Arrays.<Evaluator>asList(new StubEval(true, "a"))
        );
        or.add(new StubEval(false, "b"));
        assertEquals(":or[a, b]", or.toString());
    }
}