package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Map;
import java.util.HashMap;

public class NormalizeTest {

  private static class StubCompiler extends AbstractCompiler {
    private Node syntheticCodeNode;
    private Node testCodeNode;
    private boolean codeChangeReported;
    private boolean normalizedSet;
    private CodingConvention codingConvention = new CodingConvention() {
      @Override
      public boolean isConstant(String name) { return false; }
      @Override
      public boolean isConstantByConvention(Node n, Node parent) {
        return false;
      }
      // other methods default (stub)
    };
    private JSError reportedError;

    StubCompiler(boolean assertOnChange) {
      // intentionally empty
    }

    @Override
    Node parseSyntheticCode(String code) {
      return syntheticCodeNode;
    }

    @Override
    Node parseTestCode(String code) {
      return testCodeNode;
    }

    @Override
    void reportCodeChange() {
      codeChangeReported = true;
    }

    @Override
    UniqueNameIdSupplier getUniqueNameIdSupplier() {
      return new UniqueNameIdSupplier() {
        @Override
        public int get() { return 0; }
      };
    }

    @Override
    CodingConvention getCodingConvention() {
      return codingConvention;
    }

    @Override
    void setNormalized() {
      normalizedSet = true;
    }

    @Override
    void report(JSError error) {
      reportedError = error;
    }

    // other abstract methods stubbed
    @Override
    protected SourceAst getSourceAst() { return null; }
    @Override
    protected void ensureModuleSource() {}
    @Override
    protected void ensureSource() {}
    @Override
    protected Node externsAndJsRootNode() { return null; }
    @Override
    protected Node validateSymbols() { return null; }
    @Override
    protected Node parseInputs() { return null; }
    @Override
    protected Node computeDependency() { return null; }
    @Override
    protected void computeInputSourceMap() {}
    @Override
    protected void setSourceMap(String sourceMap) {}
    @Override
    protected void initOptions(CompilerOptions options) {}
    @Override
    protected void addDefaultExterns() {}
    @Override
    protected void initCompilerOptions(CompilerOptions options) {}
    @Override
    abstract protected boolean hasErrors(); // already abstract
    @Override
    protected boolean hasChanged() { return false; }
  }

  private static class StubScope extends Scope {
    private Map<String, Var> vars = new HashMap<>();

    StubScope(Scope parent, Node rootNode) {
      super(parent, rootNode);
    }

    void addVar(String name, Var var) {
      vars.put(name, var);
    }

    @Override
    Var getVar(String name) {
      return vars.get(name);
    }
  }

  private static class StubVar extends Var {
    private final JSDocInfo jsDocInfo;

    StubVar(String name, Node nameNode, Node parentNode, JSDocInfo info) {
      super(name, nameNode, parentNode, null, false, null, null);
      this.jsDocInfo = info;
    }

    @Override
    JSDocInfo getJSDocInfo() {
      return jsDocInfo;
    }
  }

  private static class StubJSDocInfo extends JSDocInfo {
    private boolean constant;

    StubJSDocInfo(boolean constant) {
      this.constant = constant;
    }

    @Override
    public boolean isConstant() {
      return constant;
    }
  }

  @Test
  public void testProcessWithoutAssertOnChange() {
    StubCompiler compiler = new StubCompiler(false);
    Normalize normalize = new Normalize(compiler, false);
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    normalize.process(externs, root);
    assertTrue("normalized should be set", compiler.normalizedSet);
    // Since no nodes to change, codeChangeReported may still be false
  }

  @Test(expected = IllegalStateException.class)
  public void testProcessWithAssertOnChangeAndChanges() {
    StubCompiler compiler = new StubCompiler(true);
    Normalize normalize = new Normalize(compiler, true);
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    Node whileNode = new Node(Token.WHILE);
    root.addChildToBack(whileNode);
    normalize.process(externs, root);
  }

  @Test
  public void testParseAndNormalizeSyntheticCode() {
    StubCompiler compiler = new StubCompiler(false);
    Node js = new Node(Token.SCRIPT);
    compiler.syntheticCodeNode = js;
    Node result = Normalize.parseAndNormalizeSyntheticCode(compiler, "code", "prefix");
    assertSame(js, result);
  }

  @Test
  public void testNormalizeStatementsWhileToFor() {
    StubCompiler compiler = new StubCompiler(false);
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    Node whileNode = new Node(Token.WHILE);
    Node cond = new Node(Token.TRUE);
    whileNode.addChildToFront(cond);
    assertTrue(ns.shouldTraverse(null, whileNode, null));
    ns.visit(null, whileNode, null);
    assertEquals("WHILE should become FOR", Token.FOR, whileNode.getType());
    assertNotNull(whileNode.getFirstChild());
    assertNotNull(whileNode.getLastChild());
    assertEquals(Token.EMPTY, whileNode.getFirstChild().getType());
    assertEquals(Token.EMPTY, whileNode.getLastChild().getType());
  }

  @Test
  public void testNormalizeStatementsFunctionRewriting() {
    StubCompiler compiler = new StubCompiler(false);
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    // Create a function declaration in a block (not expression, not hoisted)
    Node func = new Node(Token.FUNCTION);
    Node name = Node.newString(Token.NAME, "f");
    func.addChildToFront(name);
    Node body = new Node(Token.BLOCK);
    func.addChildToBack(body);
    Node parentBlock = new Node(Token.BLOCK);
    parentBlock.addChildToBack(func);
    assertTrue(ns.shouldTraverse(null, func, parentBlock));
    ns.visit(null, func, parentBlock);
    // After rewrite, parent block's first child should be VAR, not FUNCTION
    Node varNode = parentBlock.getFirstChild();
    assertNotNull("VAR node expected", varNode);
    assertEquals(Token.VAR, varNode.getType());
    // The original func should be first child of VAR
    Node varName = varNode.getFirstChild();
    assertNotNull(varName);
    assertEquals(Token.NAME, varName.getType());
    assertEquals("f", varName.getString());
    // Confirm that the function is now inside varName
    Node innerFunc = varName.getFirstChild();
    assertNotNull(innerFunc);
    assertEquals(Token.FUNCTION, innerFunc.getType());
  }

  @Test
  public void testSplitVarDeclarationsMultipleChildren() {
    StubCompiler compiler = new StubCompiler(false);
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    Node varNode = new Node(Token.VAR);
    Node name1 = Node.newString(Token.NAME, "a");
    Node name2 = Node.newString(Token.NAME, "b");
    varNode.addChildToBack(name1);
    varNode.addChildToBack(name2);
    Node parentBlock = new Node(Token.BLOCK);
    parentBlock.addChildToBack(varNode);
    assertTrue(ns.shouldTraverse(null, parentBlock, null));
    // shouldTraverse triggers doStatementNormalizations -> splitVarDeclarations
    // After splitting, parentBlock should have two VAR nodes
    Node firstVar = parentBlock.getFirstChild();
    Node secondVar = firstVar.getNext();
    assertNotNull("First VAR", firstVar);
    assertNotNull("Second VAR", secondVar);
    assertEquals(Token.VAR, firstVar.getType());
    assertEquals(Token.VAR, secondVar.getType());
    assertTrue(firstVar.hasOneChild());
    assertTrue(secondVar.hasOneChild());
    assertEquals("a", firstVar.getFirstChild().getString());
    assertEquals("b", secondVar.getFirstChild().getString());
  }

  @Test(expected = IllegalStateException.class)
  public void testSplitVarDeclarationsEmptyVarWithAssert() {
    StubCompiler compiler = new StubCompiler(true);
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, true);
    Node emptyVar = new Node(Token.VAR);
    Node parentBlock = new Node(Token.BLOCK);
    parentBlock.addChildToBack(emptyVar);
    ns.shouldTraverse(null, parentBlock, null);
  }

  @Test
  public void testPropagateConstantAnnotationsOverVarsNormal() {
    StubCompiler compiler = new StubCompiler(false);
    // Override coding convention to return true for constant
    compiler.codingConvention = new CodingConvention() {
      @Override
      public boolean isConstantByConvention(Node n, Node parent) {
        return true; // always constant
      }
    };
    Normalize.PropagateConstantAnnotationsOverVars pass =
        new Normalize.PropagateConstantAnnotationsOverVars(compiler, false);
    Node nameNode = Node.newString(Token.NAME, "x");
    Node parent = new Node(Token.EXPR_RESULT, nameNode);
    // Provide a scope that returns null for var (so no JSDocInfo)
    StubScope scope = new StubScope(null, new Node(Token.BLOCK));
    NodeTraversal t = new NodeTraversal(compiler, pass);
    // We'll create a stub NodeTraversal that returns our scope
    // But it's easier: we can call visit directly by creating a mock NodeTraversal
    // However NodeTraversal has a public constructor with compiler and callback.
    // We can set the scope manually via reflection or create a subclass?
    // Since we can modify scope using a custom traversal, we'll just call pass.visit directly
    // with a NodeTraversal that we construct.
    // We'll create a simple NodeTraversal that returns our scope.
    // NodeTraversal constructor: NodeTraversal(AbstractCompiler compiler, Callback callback)
    // It does not have a setScope method. We'll use a package-private trick:
    // NodeTraversal has a setScope method? Actually, in the real compiler, NodeTraversal is part of the traversal,
    // we cannot easily set scope. Instead, we can create a stub Scope that is returned by t.getScope().
    // NodeTraversal has a field scope, but it's private. We can use reflection if allowed.
    // Since no Mockito, we can create a test double of NodeTraversal that extends NodeTraversal and overrides getScope().
    // NodeTraversal is not final? In the compiler source, NodeTraversal is public but not final.
    // We can extend it and override getScope (which is public).
    class StubTraversal extends NodeTraversal {
      private final Scope scope;
      StubTraversal(AbstractCompiler compiler, Callback callback, Scope scope) {
        super(compiler, callback);
        this.scope = scope;
      }
      @Override
      public Scope getScope() {
        return scope;
      }
    }
    StubTraversal t2 = new StubTraversal(compiler, pass, scope);
    pass.visit(t2, nameNode, parent);
    assertTrue("Name should be marked constant", nameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  @Test(expected = IllegalStateException.class)
  public void testPropagateConstantAnnotationsOverVarsAssertOnChange() {
    StubCompiler compiler = new StubCompiler(true);
    compiler.codingConvention = new CodingConvention() {
      @Override
      public boolean isConstantByConvention(Node n, Node parent) {
        return true;
      }
    };
    Normalize.PropagateConstantAnnotationsOverVars pass =
        new Normalize.PropagateConstantAnnotationsOverVars(compiler, true);
    Node nameNode = Node.newString(Token.NAME, "x");
    Node parent = new Node(Token.EXPR_RESULT, nameNode);
    StubScope scope = new StubScope(null, new Node(Token.BLOCK));
    class StubTraversal extends NodeTraversal {
      private final Scope scope;
      StubTraversal(AbstractCompiler compiler, Callback callback, Scope scope) {
        super(compiler, callback);
        this.scope = scope;
      }
      @Override
      public Scope getScope() {
        return scope;
      }
    }
    StubTraversal t = new StubTraversal(compiler, pass, scope);
    pass.visit(t, nameNode, parent);
  }

  @Test
  public void testVerifyConstantsConsistent() {
    StubCompiler compiler = new StubCompiler(false);
    Normalize.VerifyConstants vc = new Normalize.VerifyConstants(compiler, true);
    Node nameNode1 = Node.newString(Token.NAME, "x");
    Node nameNode2 = Node.newString(Token.NAME, "x");
    nameNode1.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    nameNode2.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    Node parent = new Node(Token.EXPR_RESULT);
    // We need NodeTraversal with scope that has Var with JSDocInfo constant?
    // For checkUserDeclarations=true, it will look at convention and JSDocInfo.
    // Let's have convention return false, and JSDocInfo constant=true.
    StubScope scope = new StubScope(null, new Node(Token.BLOCK));
    StubJSDocInfo info = new StubJSDocInfo(true);
    StubVar var = new StubVar("x", nameNode1, parent, info);
    scope.addVar("x", var);
    class StubTraversal extends NodeTraversal {
      private final Scope scope;
      StubTraversal(AbstractCompiler compiler, Callback callback, Scope scope) {
        super(compiler, callback);
        this.scope = scope;
      }
      @Override
      public Scope getScope() {
        return scope;
      }
    }
    StubTraversal t = new StubTraversal(compiler, vc, scope);
    // Visit first time - should pass
    vc.visit(t, nameNode1, parent);
    // Visit second time with same constant value - should pass
    vc.visit(t, nameNode2, parent);
    // No exception thrown => test passes
  }

  @Test
  public void testVerifyConstantsInconsistent() {
    StubCompiler compiler = new StubCompiler(false);
    Normalize.VerifyConstants vc = new Normalize.VerifyConstants(compiler, false);
    Node nameNode1 = Node.newString(Token.NAME, "x");
    Node nameNode2 = Node.newString(Token.NAME, "x");
    nameNode1.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    nameNode2.putBooleanProp(Node.IS_CONSTANT_NAME, false);
    Node parent = new Node(Token.EXPR_RESULT);
    StubScope scope = new StubScope(null, new Node(Token.BLOCK));
    class StubTraversal extends NodeTraversal {
      private final Scope scope;
      StubTraversal(AbstractCompiler compiler, Callback callback, Scope scope) {
        super(compiler, callback);
        this.scope = scope;
      }
      @Override
      public Scope getScope() {
        return scope;
      }
    }
    StubTraversal t = new StubTraversal(compiler, vc, scope);
    vc.visit(t, nameNode1, parent);
    try {
      vc.visit(t, nameNode2, parent);
      fail("Expected exception for inconsistent constant annotation");
    } catch (IllegalStateException e) {
      assertTrue(e.getMessage().contains("not consistently annotated"));
    }
  }
}