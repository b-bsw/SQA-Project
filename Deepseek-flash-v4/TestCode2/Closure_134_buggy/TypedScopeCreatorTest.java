package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

/**
 * JUnit 4 test suite for TypedScopeCreator.
 * Tests cover initial scope creation, global scope building, and local scope building.
 * Uses real components from the Closure Compiler (e.g., Compiler) to avoid heavy stubbing.
 */
public class TypedScopeCreatorTest {

  @Test
  public void testCreateInitialScope_containsNativeTypes() {
    Compiler compiler = new Compiler();
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Node root = new Node(Token.SCRIPT);
    Scope scope = creator.createInitialScope(root);

    assertNotNull("Array should be declared", scope.getVar("Array"));
    assertNotNull("undefined should be declared", scope.getVar("undefined"));
    assertNotNull("ActiveXObject should be declared", scope.getVar("ActiveXObject"));
    assertTrue("Initial scope must be global", scope.isGlobal());
    assertSame("Root node should be the passed root", root, scope.getRootNode());
  }

  @Test
  public void testCreateScope_parentNull_returnsGlobalScope() {
    Compiler compiler = new Compiler();
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Node root = new Node(Token.SCRIPT);
    Scope scope = creator.createScope(root, null);

    assertNotNull("Scope must not be null", scope);
    assertTrue("Scope created with null parent must be global", scope.isGlobal());
    assertNotNull("Array should be available in global scope", scope.getVar("Array"));
    assertSame("Root node should be the passed root", root, scope.getRootNode());
  }

  @Test
  public void testCreateScope_parentNotNull_returnsLocalScope() {
    Compiler compiler = new Compiler();
    TypedScopeCreator creator = new TypedScopeCreator(compiler);

    // Create a global parent scope
    Node globalRoot = new Node(Token.SCRIPT);
    Scope parent = creator.createScope(globalRoot, null);
    assertNotNull("Parent scope must be created", parent);

    // Create a function node to serve as root for local scope
    Node functionNode = new Node(Token.FUNCTION,
        new Node(Token.NAME, "testFn"),
        new Node(Token.LP),
        new Node(Token.BLOCK));
    NodeTraversal.traverse(compiler, functionNode,
        new NodeTraversal.AbstractShallowCallback() {
          @Override
          public void visit(NodeTraversal t, Node n, Node parent) {
            // no-op, just trigger scope creation
          }
        });

    Scope localScope = creator.createScope(functionNode, parent);

    assertNotNull("Local scope must not be null", localScope);
    assertFalse("Scope with non-null parent must be local", localScope.isGlobal());
    assertSame("Parent should match", parent, localScope.getParent());
  }
}