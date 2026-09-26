package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;
import java.util.Set;
import java.util.HashSet;

public class VarCheckTest {

  private AbstractCompiler compiler;
  private VarCheck varCheck;
  private Node externs;
  private Node root;

  @Before
  public void setUp() {
    compiler = Compiler.getInstance();
    externs = new Node(Token.BLOCK);
    root = new Node(Token.BLOCK);
    varCheck = new VarCheck(compiler, false);
  }

  @Test
  public void testProcessNoExternsCheck() {
    varCheck = new VarCheck(compiler, true);
    varCheck.process(externs, root);
    // No exceptions expected
  }

  @Test
  public void testVisitNonNameNode() {
    Node n = new Node(Token.STRING);
    Node parent = new Node(Token.EXPR_RESULT, n);
    varCheck.visit(new NodeTraversal(compiler, new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
        return true;
      }

      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        // empty
      }
    }), n, parent);
    // Nothing should happen
  }

  @Test
  public void testVisitEmptyVarName() {
    Node n = Node.newString(Token.NAME, "");
    Node parent = new Node(Token.FUNCTION, n);
    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
        return true;
      }

      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        // empty
      }
    });
    varCheck.visit(t, n, parent);
    // Expect INVALID_FUNCTION_DECL error if parent is not function expression
    // For function expression case, no error
  }

  @Test
  public void testVisitEmptyVarNameFunctionExpression() {
    Node n = Node.newString(Token.NAME, "");
    Node parent = new Node(Token.FUNCTION, n);
    parent.putBooleanProp(Node.IS_FUNCTION_EXPRESSION, true);
    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
        return true;
      }

      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        // empty
      }
    });
    varCheck.visit(t, n, parent);
    // No error expected
  }

  @Test
  public void testVisitDefinedVarSameFile() {
    Node n = Node.newString(Token.NAME, "a");
    Node parent = new Node(Token.EXPR_RESULT, n);
    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
        return true;
      }

      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        // empty
      }
    });
    Scope scope = t.getScope();
    scope.declare("a", n, null, compiler.getInputForNode(n));
    varCheck.visit(t, n, parent);
    // No error expected
  }

  @Test
  public void testVisitUndefinedVarInExtern() {
    Node n = Node.newString(Token.NAME, "undefinedVar");
    Node parent = new Node(Token.EXPR_RESULT, n);
    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
        return true;
      }

      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        // empty
      }
    });
    // Simulate extern input
    CompilerInput externInput = compiler.newExternInput("testExtern");
    n.setSourceFile(externInput);
    parent.setSourceFile(externInput);
    varCheck.visit(t, n, parent);
    // UNDEFINED_VAR_ERROR not reported in extern if strictExternCheck is false
    // But var is still undefined, so synthesized extern should be created
    assertNotNull(compiler.getSynthesizedExternsRoot());
  }

  @Test
  public void testVisitUndefinedVarStrictExternCheck() {
    Compiler strictCompiler = Compiler.getInstance();
    strictCompiler.setErrorLevel(CheckLevel.ERROR);
    VarCheck strictVarCheck = new VarCheck(strictCompiler, false);
    Node n = Node.newString(Token.NAME, "undefinedVar");
    Node parent = new Node(Token.EXPR_RESULT, n);
    NodeTraversal t = new NodeTraversal(strictCompiler, new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
        return true;
      }

      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        // empty
      }
    });
    CompilerInput externInput = strictCompiler.newExternInput("testExtern");
    n.setSourceFile(externInput);
    strictVarCheck.visit(t, n, parent);
    // UNDEFINED_EXTERN_VAR_ERROR or UNDEFINED_VAR_ERROR
  }

  @Test
  public void testVisitModuleDependencyViolation() {
    // Create two modules
    JSModule currModule = new JSModule("curr");
    JSModule varModule = new JSModule("var");
    JSModuleGraph moduleGraph = new JSModuleGraph(new JSModule[]{currModule, varModule});
    compiler.setModuleGraph(moduleGraph);

    CompilerInput currInput = compiler.newExternInput("currFile");
    currInput.setModule(currModule);
    CompilerInput varInput = compiler.newExternInput("varFile");
    varInput.setModule(varModule);

    Node n = Node.newString(Token.NAME, "x");
    Node parent = new Node(Token.EXPR_RESULT, n);
    n.setSourceFile(currInput);
    parent.setSourceFile(currInput);

    Scope scope = new Scope();
    scope.declare("x", n, varInput, varInput);
    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
        return true;
      }

      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        // empty
      }
    });
    t.setScope(scope);
    varCheck.visit(t, n, parent);
    // Expect VIOLATED_MODULE_DEP_ERROR or MISSING_MODULE_DEP_ERROR
  }

  @Test
  public void testVisitModuleDependencyValid() {
    JSModule currModule = new JSModule("curr");
    JSModule varModule = new JSModule("var");
    JSModuleGraph moduleGraph = new JSModuleGraph(new JSModule[]{currModule, varModule});
    moduleGraph.addDependency(currModule, varModule);
    compiler.setModuleGraph(moduleGraph);

    CompilerInput currInput = compiler.newExternInput("currFile");
    currInput.setModule(currModule);
    CompilerInput varInput = compiler.newExternInput("varFile");
    varInput.setModule(varModule);

    Node n = Node.newString(Token.NAME, "x");
    Node parent = new Node(Token.EXPR_RESULT, n);
    n.setSourceFile(currInput);
    parent.setSourceFile(currInput);

    Scope scope = new Scope();
    scope.declare("x", n, varInput, varInput);
    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
        return true;
      }

      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        // empty
      }
    });
    t.setScope(scope);
    varCheck.visit(t, n, parent);
    // No error expected
  }

  @Test
  public void testVisitVarInExternsCheck() {
    Node n = Node.newString(Token.NAME, "x");
    Node varNode = new Node(Token.VAR, n);
    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
        return true;
      }

      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        // empty
      }
    });
    CompilerInput externInput = compiler.newExternInput("extern");
    n.setSourceFile(externInput);
    varCheck.visit(t, varNode, t.getScope().getRootNode());
    // No error for VAR in externs
  }
}