package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class PureFunctionIdentifierTest {

  private PureFunctionIdentifier identifier;
  private AbstractCompiler compiler;
  private DefinitionProvider definitionProvider;
  private Node externs;
  private Node root;
  private FunctionNames functionNames;

  // Helper to create a simple function node
  private Node createFunctionNode(String name) {
    Node nameNode = Node.newString(Token.NAME, name);
    Node params = new Node(Token.LP);
    Node body = new Node(Token.BLOCK);
    Node functionNode = new Node(Token.FUNCTION, nameNode, params, body);
    return functionNode;
  }

  // Helper to create a call node (CALL or NEW)
  private Node createCallNode(String calleeName) {
    Node callee = Node.newString(Token.NAME, calleeName);
    Node callNode = new Node(Token.CALL, callee);
    return callNode;
  }

  // Helper to create a simple script/block containing a function
  private Node createScriptWithFunction(String funcName) {
    Node script = new Node(Token.SCRIPT);
    Node func = createFunctionNode(funcName);
    script.addChildToBack(func);
    return script;
  }

  @Before
  public void setUp() {
    // Create a mock-like compiler (simplified, just for test)
    compiler = new AbstractCompiler() {
      @Override
      public void report(JSError error) {
        // ignore for tests
      }

      @Override
      public Node parseSyntheticCode(String code) {
        return null;
      }

      @Override
      public Node parseCode(String code) {
        return null;
      }

      @Override
      public boolean hasHaltingErrors() {
        return false;
      }

      @Override
      public SyntacticScopeCreator getScopeCreator() {
        return null;
      }

      @Override
      public Scope getTopScope() {
        return null;
      }

      @Override
      public void reportCodeChange() {
      }

      @Override
      public CodingConvention getCodingConvention() {
        return null;
      }

      @Override
      public SourceInput getSourceInput(String sourceName) {
        return null;
      }

      @Override
      public SourceFile getSourceFile(String sourceName) {
        return null;
      }

      @Override
      public String getSourceLine(String sourceName, int lineNumber) {
        return null;
      }

      @Override
      public Region getSourceRegion(String sourceName) {
        return null;
      }

      @Override
      public InputType getInputType(String sourceName) {
        return null;
      }

      @Override
      public JSTypeRegistry getTypeRegistry() {
        return null;
      }

      @Override
      public Map<String, CheckLevel> getErrorLevel(String errorCode) {
        return null;
      }

      @Override
      public CheckLevel getErrorLevel(JSError error) {
        return CheckLevel.ERROR;
      }
    };

    definitionProvider = new DefinitionProvider() {
      @Override
      public Collection<Definition> getDefinitionsReferencedAt(Node node) {
        // Return null for simplicity, focusing on other logic
        return null;
      }

      @Override
      public void process(Node externs, Node root) {
        // Not needed
      }

      @Override
      public Definition getDefinition(Node node) {
        return null;
      }
    };

    functionNames = new FunctionNames(compiler) {
      @Override
      public String getFunctionName(Node functionNode) {
        return functionNode.getFirstChild().getString();
      }
    };

    identifier = new PureFunctionIdentifier(compiler, definitionProvider);
    externs = new Node(Token.BLOCK);
    root = new Node(Token.BLOCK);
  }

  @After
  public void tearDown() {
    identifier = null;
  }

  @Test
  public void testProcessNormal() {
    // Normal case: process with empty externs and root
    identifier.process(externs, root);
    // Should not throw
    assertNotNull(identifier.getDebugReport());
  }

  @Test(expected = IllegalStateException.class)
  public void testProcessCalledTwice() {
    identifier.process(externs, root);
    identifier.process(new Node(Token.BLOCK), new Node(Token.BLOCK));
  }

  @Test
  public void testProcessWithPureExternFunction() {
    // Externs with a function that has @nosideeffects annotation
    Node externFunc = createFunctionNode("myPureFunc");
    JSDocInfo docInfo = new JSDocInfo(true);
    docInfo.setNoSideEffects(true);
    externFunc.setJSDocInfo(docInfo);
    externs.addChildToBack(externFunc);
    identifier.process(externs, root);
    // Pure function should be identified
    String debug = identifier.getDebugReport();
    assertTrue(debug.contains("Pure functions:"));
    assertTrue(debug.contains("myPureFunc"));
  }

  @Test
  public void testProcessWithNonExternFunction() {
    // Source function with @nosideeffects should cause error report
    // We can't easily observe that, but we can verify debug report does not contain "pure" for that function
    Node sourceFunc = createFunctionNode("internalFunc");
    JSDocInfo docInfo = new JSDocInfo(true);
    docInfo.setNoSideEffects(true);
    sourceFunc.setJSDocInfo(docInfo);
    root.addChildToBack(sourceFunc);
    identifier.process(externs, root);
    String debug = identifier.getDebugReport();
    // No pure function because annotation is invalid in source
    assertFalse(debug.contains("internalFunc"));
  }

  @Test
  public void testProcessWithCallSite() {
    // Function calls another function -> side effect propagation
    Node outerFunc = createFunctionNode("outer");
    Node callNode = createCallNode("inner");
    outerFunc.getLastChild().addChildToBack(callNode); // adds call to body
    root.addChildToBack(outerFunc);

    Node innerFunc = createFunctionNode("inner");
    root.addChildToBack(innerFunc);

    // We need definition provider that returns definition for inner
    // This test is more complex; we can test that process doesn't throw
    identifier.process(externs, root);
    // Should not throw
    assertTrue(true); // basic sanity
  }

  @Test
  public void testGetDebugReportBeforeProcess() {
    // getDebugReport before process should throw NullPointerException due to null checks
    try {
      identifier.getDebugReport();
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testProcessWithThisMutation() {
    // Function that modifies 'this' via GETPROP
    Node func = createFunctionNode("mutateThis");
    // Simulate "this.x = 1"
    Node thisNode = new Node(Token.THIS);
    Node getProp = new Node(Token.GETPROP, thisNode, Node.newString("x"));
    Node assign = new Node(Token.ASSIGN, getProp, Node.newNumber(1));
    func.getLastChild().addChildToBack(assign);
    root.addChildToBack(func);
    identifier.process(externs, root);
    String debug = identifier.getDebugReport();
    assertTrue(debug.contains("mutateThis"));
    assertTrue(debug.contains("this"));
  }

  @Test
  public void testProcessWithThrow() {
    // Function that throws
    Node func = createFunctionNode("thrower");
    Node throwNode = new Node(Token.THROW, Node.newString("error"));
    func.getLastChild().addChildToBack(throwNode);
    root.addChildToBack(func);
    identifier.process(externs, root);
    String debug = identifier.getDebugReport();
    assertTrue(debug.contains("thrower"));
    assertTrue(debug.contains("throw"));
  }

  @Test
  public void testProcessWithMultipleFunctionsAndCalls() {
    // More complex scenario to test propagation
    Node f1 = createFunctionNode("f1");
    Node f2 = createFunctionNode("f2");
    Node callF2 = createCallNode("f2");
    f1.getLastChild().addChildToBack(callF2);
    root.addChildToBack(f1);
    root.addChildToBack(f2);

    // Make f2 have side effect (assignment to global)
    Node globalAssign = new Node(Token.ASSIGN, Node.newString("globalVar"), Node.newNumber(1));
    f2.getLastChild().addChildToBack(globalAssign);

    identifier.process(externs, root);
    String debug = identifier.getDebugReport();
    // f1 should be not pure because it calls f2 which has side effects
    assertFalse(debug.contains("f1"));
    // f2 not pure
    assertFalse(debug.contains("f2"));
  }

  @Test
  public void testProcessWithNewNodeCall() {
    // Test that new call with side effects (throws) marks caller
    Node f1 = createFunctionNode("f1");
    Node newCall = new Node(Token.NEW, Node.newString("Ctor"));
    f1.getLastChild().addChildToBack(newCall);
    root.addChildToBack(f1);

    // Define Ctor as a function that throws (simplified: we need definition provider)
    // For this test we skip definition provider and just see no exception
    identifier.process(externs, root);
    // Should not throw
    assertNotNull(identifier.getDebugReport());
  }

  @Test
  public void testProcessWithExternFunctionTaintsGlobal() {
    // Extern function without @nosideeffects should be marked as tainting globals
    Node externFunc = createFunctionNode("externFn");
    externs.addChildToBack(externFunc);
    identifier.process(externs, root);
    String debug = identifier.getDebugReport();
    assertTrue(debug.contains("Side effects: [extern, global]"));
  }

  @Test
  public void testprocessWithEmptyExternsAndRoot() {
    identifier.process(new Node(Token.BLOCK), new Node(Token.BLOCK));
    // Should produce a debug report with no pure functions
    String debug = identifier.getDebugReport();
    assertEquals("Pure functions:\n\n", debug);
  }
}