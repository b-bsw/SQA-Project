package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.google.javascript.jscomp.Scope.Var;
import java.util.List;
import java.util.ArrayList;

public class FlowSensitiveInlineVariablesTest {

  private static final int MAX_VARS = LiveVariablesAnalysis.MAX_VARIABLES_TO_ANALYZE;

  // Stub compiler that records code changes and provides a simple coding convention.
  private static class StubCompiler extends AbstractCompiler {
    private int codeChangeCount = 0;
    private CodingConvention convention = new CodingConvention();
    
    @Override
    public void reportCodeChange() {
      codeChangeCount++;
    }
    
    public int getCodeChangeCount() {
      return codeChangeCount;
    }
    
    @Override
    public CodingConvention getCodingConvention() {
      return convention;
    }
    
    // Other abstract methods: minimal stubs
    @Override
    public SourceExcerptProvider getSource() { return null; }
    @Override
    public void setSourceMap(SourceMap sourceMap) {}
    @Override
    public SourceMap getSourceMap() { return null; }
    @Override
    public void setErrorLevel(CheckLevel level, String type) {}
    @Override
    public ErrorManager getErrorManager() { return null; }
    @Override
    public void setErrorManager(ErrorManager manager) {}
    @Override
    public boolean hasHaltingErrors() { return false; }
    @Override
    public void process(SourceFile[] externs, SourceFile[] inputs) {}
    @Override
    public JSType getTypeRegistry() { return null; }
    @Override
    public Scope getTopScope() { return null; }
  }

  private StubCompiler compiler;
  private FlowSensitiveInlineVariables pass;

  @Before
  public void setUp() {
    compiler = new StubCompiler();
    pass = new FlowSensitiveInlineVariables(compiler);
  }

  // Helper to create a simple name node.
  private Node nameNode(String name) {
    return Node.newString(Token.NAME, name);
  }

  // Helper to create a simple number node.
  private Node numberNode(double value) {
    return Node.newNumber(value);
  }

  // Helper to create a simple VAR declaration with assignment.
  // Returns the VAR node. Child: NAME with child (value).
  private Node varDeclaration(String varName, Node value) {
    Node name = nameNode(varName);
    name.addChildToFront(value);
    Node var = new Node(Token.VAR, name);
    return var;
  }

  // Helper to create an ASSIGN expression (expr result parent).
  private Node assignExpr(String varName, Node value) {
    Node name = nameNode(varName);
    Node assign = new Node(Token.ASSIGN, name, value);
    Node exprResult = new Node(Token.EXPR_RESULT, assign);
    return exprResult;
  }

  // Helper to create a simple block.
  private Node block(Node... stmts) {
    Node block = new Node(Token.BLOCK);
    for (Node stmt : stmts) {
      block.addChildToBack(stmt);
    }
    return block;
  }

  // Helper to create a function node with given body.
  // Returns the FUNCTION node.
  private Node functionNode(Node body) {
    // Function node structure: FUNCTION -> NAME (optional), PARAM_LIST, BLOCK
    Node paramList = new Node(Token.PARAM_LIST);
    Node function = new Node(Token.FUNCTION, nameNode("f"), paramList, body);
    return function;
  }

  @Test
  public void testGlobalScopeIgnored() {
    // Create a simple script body with a var declaration.
    Node body = block(
        varDeclaration("x", numberNode(1))
    );
    // The root should be a script node with function? Actually process expects externs and root.
    // We'll create a dummy function scope but set the traversal to global.
    // Alternative: test by calling process with externs=null and root=body.
    // However, enterScope checks t.inGlobalScope() which is true if scope is global.
    // Since we are not providing a scope, we can simulate via a NodeTraversal that reports global.
    // To simplify, we create a function and later call process; the traversal will find the function.
    // But we can also just test that when scope is global, no candidates are created.
    // We'll create a minimal mock NodeTraversal that returns global scope.
    // Because we cannot directly instantiate NodeTraversal, we rely on process.
    // The process method traverses externs and root. If root contains a function, it will call enterScope.
    // We'll create a script root that contains a function with global scope? Actually the traversal
    // uses NodeTraversal to visit nodes; if the root is a script, it will call enterScope for each function.
    // Let's create a script node that is the root.
    Node script = new Node(Token.SCRIPT, body);
    pass.process(null, script);
    // No code change because global scope is skipped.
    assertEquals(0, compiler.getCodeChangeCount());
  }

  @Test
  public void testTooManyVariables() {
    // Create a function with many variables (exceed MAX_VARS).
    // We'll create a function body with many var declarations.
    // But the check is t.getScope().getVarCount() > MAX_VARS.
    // We need to supply a scope that has many vars. Since we don't have a real scope,
    // we can mock by extending Scope? Alternatively, we can rely on the fact that in the test environment,
    // the scope will be created from the function node. The number of vars is counted from the declared names.
    // To simplify, we can create a function with more than MAX_VARS variable declarations.
    // The traversal will create a scope and count the vars.
    Node body = new Node(Token.BLOCK);
    for (int i = 0; i < MAX_VARS + 1; i++) {
      body.addChildToBack(varDeclaration("x" + i, numberNode(i)));
    }
    Node func = functionNode(body);
    Node script = new Node(Token.SCRIPT, func);
    pass.process(null, script);
    // No code change because too many variables.
    assertEquals(0, compiler.getCodeChangeCount());
  }

  @Test
  public void testSimpleInline() {
    // Create a function with one variable defined and used exactly once.
    // x = 5; print(x);
    // Simulate: var x = 5; (var x = 5) and later use in expression: print(x) where print is a simple call.
    // We need a proper AST: VAR node, then a CALL node that uses x.
    // The inlining will happen if x is used exactly once.
    // We'll create a simple function body:
    // Block: VAR x = 5; EXPR_RESULT(CALL(NAME: print, NAME: x))
    // "print" is a function call; but we need to ensure it's not considered side-effect.
    // For simplicity, we can use a simple NAME node as a statement (like a reference).
    // However, NodeTraversal will treat NAME as read only if it's not in assignment etc.
    // Let's create:
    // var x = new Node(Token.VAR, new Node(Token.NAME, "x", child=5));
    // then an expression statement: expr result with a name node x (which is a read).
    // But that would be a simple name expression which is valid.
    Node five = numberNode(5);
    Node varDecl = varDeclaration("x", five);
    Node useNode = nameNode("x");
    Node exprResult = new Node(Token.EXPR_RESULT, useNode);
    Node body = block(varDecl, exprResult);
    Node func = functionNode(body);
    Node script = new Node(Token.SCRIPT, func);
    pass.process(null, script);
    // Expect inlining: the var x = 5 is inlined into the use, so code change count > 0.
    assertTrue(compiler.getCodeChangeCount() > 0);
  }

  @Test
  public void testCannotInlineBecauseMultipleUses() {
    // x = 1; print(x); print(x);
    Node five = numberNode(1);
    Node varDecl = varDeclaration("x", five);
    Node use1 = nameNode("x");
    Node expr1 = new Node(Token.EXPR_RESULT, use1);
    Node use2 = nameNode("x");
    Node expr2 = new Node(Token.EXPR_RESULT, use2);
    Node body = block(varDecl, expr1, expr2);
    Node func = functionNode(body);
    Node script = new Node(Token.SCRIPT, func);
    pass.process(null, script);
    // No inlining because multiple uses.
    assertEquals(0, compiler.getCodeChangeCount());
  }

  @Test
  public void testCannotInlineParameter() {
    // Parameter cannot be inlined. We need a function with a parameter.
    // Node: FUNCTION -> NAME (param?), PARAM_LIST (contains NAME x), BLOCK (use of x)
    Node paramX = nameNode("x");
    Node paramList = new Node(Token.PARAM_LIST, paramX);
    Node useX = nameNode("x");
    Node exprResult = new Node(Token.EXPR_RESULT, useX);
    Node body = block(exprResult);
    Node func = new Node(Token.FUNCTION, nameNode("f"), paramList, body);
    Node script = new Node(Token.SCRIPT, func);
    pass.process(null, script);
    // No inlining because parameter.
    assertEquals(0, compiler.getCodeChangeCount());
  }

  @Test
  public void testCannotInlineBecauseDefInLoop() {
    // Create a loop that contains variable definition and use inside loop.
    // The canInline method checks NodeUtil.isWithinLoop(use). So if the use is inside a loop, cannot inline.
    // We'll create a FOR loop with var inside and use inside.
    // Simplified: while loop: BLOCK with VAR x = 1; EXPR_RESULT(x)
    Node body = block(
        varDeclaration("x", numberNode(1)),
        new Node(Token.EXPR_RESULT, nameNode("x"))
    );
    // While loop: WHILE(COND, BLOCK)
    Node cond = numberNode(1);
    Node whileNode = new Node(Token.WHILE, cond, body);
    Node functionBody = block(whileNode);
    Node func = functionNode(functionBody);
    Node script = new Node(Token.SCRIPT, func);
    pass.process(null, script);
    // No inlining because use is within loop.
    assertEquals(0, compiler.getCodeChangeCount());
  }

  @Test
  public void testCannotInlineBecauseSideEffectOnRight() {
    // x = foo(); then use. foo() has side effects? We'll simulate a call that has side effects.
    // We need to create a CALL node with function name that has side effects.
    // NodeUtil.functionCallHasSideEffects checks if the call is to a known side-effect function.
    // Since we don't have a real coding convention, we'll assume any call is not side-effect free.
    // But SIDE_EFFECT_PREDICATE checks n.isCall() && NodeUtil.functionCallHasSideEffects(n).
    // For our stub, NodeUtil will check compiler.getCodingConvention(). 
    // Our StubCompiler has a default CodingConvention which may return false for some.
    // To guarantee side effect, we can set the coding convention to a custom one that returns true for any call.
    // But we can also rely on the fact that calls to unknown functions are considered side-effect by default?
    // Actually, NodeUtil.functionCallHasSideEffects uses the coding convention's isPrivate, etc.
    // Simpler: use a side-effect-like expression such as an assignment that modifies global.
    // The predicate also checks n.isNew(), etc. We'll create a NEW node which has side effects.
    // For example: new Foo(); but we need to create a NEW token node.
    Node newFoo = new Node(Token.NEW, nameNode("Foo"));
    Node newExpr = new Node(Token.EXPR_RESULT, newFoo);
    Node varX = varDeclaration("x", newFoo); // var x = new Foo();
    Node useX = new Node(Token.EXPR_RESULT, nameNode("x"));
    Node body = block(varX, useX);
    Node func = functionNode(body);
    Node script = new Node(Token.SCRIPT, func);
    pass.process(null, script);
    // The definition has a NEW node as right child, which has side effects, so cannot inline.
    assertEquals(0, compiler.getCodeChangeCount());
  }

  @Test
  public void testCannotInlineBecauseDefIsRValue() {
    // When assignment is not an EXPR_RESULT, but used as R-Value.
    // Example: y = x = 1; Here x = 1 is used as RHS of an assignment.
    // The check: def.isAssign() && !NodeUtil.isExprAssign(def.getParent())
    // So we create: ASSIGN(y, ASSIGN(x, 1))
    Node innerAssign = new Node(Token.ASSIGN, nameNode("x"), numberNode(1));
    Node outerAssign = new Node(Token.ASSIGN, nameNode("y"), innerAssign);
    Node exprResult = new Node(Token.EXPR_RESULT, outerAssign);
    Node useX = new Node(Token.EXPR_RESULT, nameNode("x"));
    Node body = block(exprResult, useX);
    Node func = functionNode(body);
    Node script = new Node(Token.SCRIPT, func);
    pass.process(null, script);
    // No inlining because assignment is R-Value.
    assertEquals(0, compiler.getCodeChangeCount());
  }

  @Test
  public void testCannotInlineBecauseDefLastChildHasGetProp() {
    // var x = a.b; use x. Here def last child is GETPROP, so cannot inline.
    Node getprop = new Node(Token.GETPROP, nameNode("a"), nameNode("b"));
    Node varX = varDeclaration("x", getprop);
    Node useX = new Node(Token.EXPR_RESULT, nameNode("x"));
    Node body = block(varX, useX);
    Node func = functionNode(body);
    Node script = new Node(Token.SCRIPT, func);
    pass.process(null, script);
    assertEquals(0, compiler.getCodeChangeCount());
  }

  @Test
  public void testCannotInlineBecausePathsHaveSideEffects() {
    // Need a case where def and use are not adjacent and there is a side-effect node between them.
    // Example: x = 1; foo(); print(x); where foo() has side effects.
    Node defStmt = varDeclaration("x", numberNode(1));
    Node fooCall = new Node(Token.CALL, nameNode("foo"));
    Node callStmt = new Node(Token.EXPR_RESULT, fooCall);
    Node useStmt = new Node(Token.EXPR_RESULT, nameNode("x"));
    Node body = block(defStmt, callStmt, useStmt);
    Node func = functionNode(body);
    Node script = new Node(Token.SCRIPT, func);
    pass.process(null, script);
    // The path check will find that the call has side effects and prevent inlining.
    assertEquals(0, compiler.getCodeChangeCount());
  }

  @Test
  public void testInlineWithVarDefinition() {
    // Successful inlining with var definition.
    // var x = 1; print(x);
    Node varDecl = varDeclaration("x", numberNode(1));
    Node use = new Node(Token.EXPR_RESULT, nameNode("x"));
    Node body = block(varDecl, use);
    Node func = functionNode(body);
    Node script = new Node(Token.SCRIPT, func);
    pass.process(null, script);
    assertTrue(compiler.getCodeChangeCount() == 1);
  }
}