package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayDeque;
import java.util.Deque;
import org.junit.Before;
import org.junit.Test;

public class RenameLabelsTest {

  private AbstractCompiler compiler;
  private RenameLabels renameLabels;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    renameLabels = new RenameLabels(compiler);
  }

  @Test
  public void testProcessWithNoLabels() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.SCRIPT);
    renameLabels.process(externs, root);
    assertEquals(Token.SCRIPT, root.getType());
    assertTrue(root.hasChildNodes() == false);
  }

  @Test
  public void testProcessWithSingleLabelReferenced() {
    Node root = new Node(Token.SCRIPT);
    Node label = new Node(Token.LABEL);
    Node name = Node.newString(Token.NAME, "myLabel");
    Node block = new Node(Token.BLOCK);
    Node breakNode = new Node(Token.BREAK);
    Node breakName = Node.newString(Token.NAME, "myLabel");
    breakNode.addChildToFront(breakName);
    block.addChildToFront(breakNode);
    label.addChildToFront(name);
    label.addChildToFront(block);
    root.addChildToFront(label);

    Node externs = new Node(Token.SCRIPT);
    renameLabels.process(externs, root);

    Node processedLabel = root.getFirstChild();
    assertEquals(Token.LABEL, processedLabel.getType());
    Node processedName = processedLabel.getFirstChild();
    assertEquals(Token.NAME, processedName.getType());
    String newName = processedName.getString();
    assertEquals("a", newName);
    Node processedBlock = processedLabel.getLastChild();
    Node processedBreak = processedBlock.getFirstChild();
    assertEquals(Token.BREAK, processedBreak.getType());
    Node processedBreakName = processedBreak.getFirstChild();
    assertEquals(newName, processedBreakName.getString());
  }

  @Test
  public void testProcessWithSingleLabelUnreferencedAndRemoveUnusedTrue() {
    Node root = new Node(Token.SCRIPT);
    Node label = new Node(Token.LABEL);
    Node name = Node.newString(Token.NAME, "myLabel");
    Node block = new Node(Token.BLOCK);
    Node childNode = new Node(Token.EMPTY);
    block.addChildToFront(childNode);
    label.addChildToFront(name);
    label.addChildToFront(block);
    root.addChildToFront(label);

    Node externs = new Node(Token.SCRIPT);
    RenameLabels rl = new RenameLabels(compiler, new RenameLabels.DefaultNameSupplier(), true);
    rl.process(externs, root);

    // Should have removed the label, block should be direct child of script
    assertEquals(1, root.getChildCount());
    Node remaining = root.getFirstChild();
    assertEquals(Token.BLOCK, remaining.getType());
    assertEquals(1, remaining.getChildCount());
    assertEquals(Token.EMPTY, remaining.getFirstChild().getType());
  }

  @Test
  public void testProcessWithSingleLabelUnreferencedAndRemoveUnusedFalse() {
    Node root = new Node(Token.SCRIPT);
    Node label = new Node(Token.LABEL);
    Node name = Node.newString(Token.NAME, "myLabel");
    Node block = new Node(Token.BLOCK);
    label.addChildToFront(name);
    label.addChildToFront(block);
    root.addChildToFront(label);

    Node externs = new Node(Token.SCRIPT);
    RenameLabels rl = new RenameLabels(compiler, new RenameLabels.DefaultNameSupplier(), false);
    rl.process(externs, root);

    // Should keep the label (even if unreferenced) but rename it
    assertEquals(1, root.getChildCount());
    Node processedLabel = root.getFirstChild();
    assertEquals(Token.LABEL, processedLabel.getType());
    Node processedName = processedLabel.getFirstChild();
    assertEquals("a", processedName.getString());
  }

  @Test
  public void testProcessWithNestedLabels() {
    Node root = new Node(Token.SCRIPT);
    // Outer label
    Node outerLabel = new Node(Token.LABEL);
    Node outerName = Node.newString(Token.NAME, "outer");
    Node outerBlock = new Node(Token.BLOCK);
    // Inner label
    Node innerLabel = new Node(Token.LABEL);
    Node innerName = Node.newString(Token.NAME, "inner");
    Node innerBlock = new Node(Token.BLOCK);
    // Break to inner
    Node breakToInner = new Node(Token.BREAK);
    Node breakToInnerName = Node.newString(Token.NAME, "inner");
    breakToInner.addChildToFront(breakToInnerName);
    innerBlock.addChildToFront(breakToInner);
    innerLabel.addChildToFront(innerName);
    innerLabel.addChildToFront(innerBlock);
    outerBlock.addChildToFront(innerLabel);
    outerLabel.addChildToFront(outerName);
    outerLabel.addChildToFront(outerBlock);
    root.addChildToFront(outerLabel);

    Node externs = new Node(Token.SCRIPT);
    renameLabels.process(externs, root);

    Node processedOuter = root.getFirstChild();
    assertEquals(Token.LABEL, processedOuter.getType());
    Node processedOuterName = processedOuter.getFirstChild();
    assertEquals("a", processedOuterName.getString());

    Node processedOuterBlock = processedOuter.getLastChild();
    Node processedInner = processedOuterBlock.getFirstChild();
    assertEquals(Token.LABEL, processedInner.getType());
    Node processedInnerName = processedInner.getFirstChild();
    assertEquals("b", processedInnerName.getString());

    Node processedInnerBlock = processedInner.getLastChild();
    Node processedBreak = processedInnerBlock.getFirstChild();
    assertEquals(Token.BREAK, processedBreak.getType());
    Node processedBreakName = processedBreak.getFirstChild();
    assertEquals("b", processedBreakName.getString());
  }

  @Test
  public void testProcessWithBreakWithoutLabel() {
    Node root = new Node(Token.SCRIPT);
    Node loop = new Node(Token.WHILE);
    Node condition = new Node(Token.TRUE);
    Node body = new Node(Token.BLOCK);
    Node breakNode = new Node(Token.BREAK);
    body.addChildToFront(breakNode);
    loop.addChildToFront(condition);
    loop.addChildToFront(body);
    root.addChildToFront(loop);

    Node externs = new Node(Token.SCRIPT);
    renameLabels.process(externs, root);

    // Should not crash; break without label should be left as is
    Node processedLoop = root.getFirstChild();
    assertEquals(Token.WHILE, processedLoop.getType());
    Node processedBody = processedLoop.getLastChild();
    Node processedBreak = processedBody.getFirstChild();
    assertEquals(Token.BREAK, processedBreak.getType());
    assertNull(processedBreak.getFirstChild());
  }

  @Test
  public void testProcessWithContinueWithLabel() {
    Node root = new Node(Token.SCRIPT);
    Node label = new Node(Token.LABEL);
    Node name = Node.newString(Token.NAME, "myLabel");
    Node whileNode = new Node(Token.WHILE);
    Node condition = new Node(Token.TRUE);
    Node body = new Node(Token.BLOCK);
    Node continueNode = new Node(Token.CONTINUE);
    Node continueName = Node.newString(Token.NAME, "myLabel");
    continueNode.addChildToFront(continueName);
    body.addChildToFront(continueNode);
    whileNode.addChildToFront(condition);
    whileNode.addChildToFront(body);
    label.addChildToFront(name);
    label.addChildToFront(whileNode);
    root.addChildToFront(label);

    Node externs = new Node(Token.SCRIPT);
    renameLabels.process(externs, root);

    Node processedLabel = root.getFirstChild();
    assertEquals(Token.LABEL, processedLabel.getType());
    Node processedName = processedLabel.getFirstChild();
    assertEquals("a", processedName.getString());
    Node processedWhile = processedLabel.getLastChild();
    Node processedBody = processedWhile.getLastChild();
    Node processedContinue = processedBody.getFirstChild();
    assertEquals(Token.CONTINUE, processedContinue.getType());
    Node processedContinueName = processedContinue.getFirstChild();
    assertEquals("a", processedContinueName.getString());
  }

  @Test
  public void testDefaultNameSupplierGet() {
    RenameLabels.DefaultNameSupplier supplier = new RenameLabels.DefaultNameSupplier();
    String first = supplier.get();
    String second = supplier.get();
    String third = supplier.get();
    assertEquals("a", first);
    assertEquals("b", second);
    assertEquals("c", third);
  }

  private static class TestCompiler extends AbstractCompiler {
    private boolean changed = false;

    @Override
    public void reportCodeChange() {
      changed = true;
    }

    @Override
    public boolean hasChanged() {
      return changed;
    }

    @Override
    public void addToDebugLog(String message) {
      // No-op for tests
    }

    // Minimal implementations for abstract methods
    @Override
    public void process(CompilerPass pass) {
      pass.process(null, null);
    }
  }
}