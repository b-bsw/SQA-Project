package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

public class InlineCostEstimatorTest {

  @Test
  public void testGetCostNameNode() {
    Node name = new Node(Token.NAME, "x");
    assertEquals(2, InlineCostEstimator.getCost(name));
  }

  @Test
  public void testGetCostDefaultUsesMaxValueThreshold() {
    Node add = new Node(Token.ADD,
        new Node(Token.NAME, "a"),
        new Node(Token.NAME, "b"));
    assertEquals(
        InlineCostEstimator.getCost(add, Integer.MAX_VALUE),
        InlineCostEstimator.getCost(add));
  }

  @Test
  public void testGetCostThresholdStopsProcessingEarly() {
    Node add = new Node(Token.ADD,
        new Node(Token.NAME, "a"),
        new Node(Token.NAME, "b"));
    int fullCost = InlineCostEstimator.getCost(add);
    int limitedCost = InlineCostEstimator.getCost(add, 2);
    assertTrue(fullCost > 2);
    assertTrue(limitedCost > 0);
    assertTrue(limitedCost < fullCost);
  }

  @Test
  public void testGetCostThresholdEqualsCost() {
    Node name = new Node(Token.NAME, "x");
    assertEquals(2, InlineCostEstimator.getCost(name, 2));
  }

  @Test(expected = NullPointerException.class)
  public void testGetCostNullRoot() {
    InlineCostEstimator.getCost(null);
  }
}