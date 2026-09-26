package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.LinkedHashMap;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class FunctionToBlockMutatorTest {

  private static final String RESULT_NAME = "resultVar";
  private static final String FN_NAME = "testFn";
  private static final String LABEL_PREFIX = "JSCompiler_inline_label_";

  private AbstractCompiler compiler;
  private FunctionToBlockMutator mutator;
  private Supplier<String> safeNameIdSupplier;

  @Before
  public void setUp() {
    compiler = createMockCompiler();
    safeNameIdSupplier = new Supplier<String>() {
      private int counter = 0;
      @Override
      public String get() {
        return "id_" + counter++;
      }
    };
    mutator = new FunctionToBlockMutator(compiler, safeNameIdSupplier);
  }

  private AbstractCompiler createMockCompiler() {
    return new AbstractCompiler() {
      @Override
      public Supplier<String> getUniqueNameIdSupplier() {
        return new Supplier<String>() {
          private int counter = 0;
          @Override
          public String get() {
            return "unique_" + counter++;
          }
        };
      }

      @Override
      public CodingConvention getCodingConvention() {
        return new DefaultCodingConvention();
      }

      @Override
      public void report(JSError error) {}

      @Override
      public void reportCodeChange() {}

      @Override
      public Node parseSyntheticCode(String code) { return null; }

      @Override
      public Node parseCode(String code) { return null; }

      @Override
      public CheckLevel getErrorLevel(JSError error) { return null; }

      @Override
      public boolean hasHaltingErrors() { return false; }

      @Override
      public void setSourceName(Node node, String name) {}

      @Override
      public String getSourceName(Node node) { return null; }

      @Override
      public void reportCodeChange(boolean shouldReport) {}

      @Override
      public boolean areNodesEqual(Node a, Node b) { return false; }
    };
  }

  @Test
  public void testMutateSimpleReturn() {
    Node fnNode = createSimpleFunctionWithReturn();
    Node callNode = createCallNode("arg1", "arg2");

    Node result = mutator.mutate(FN_NAME, fnNode, callNode, RESULT_NAME, false, false);

    assertNotNull("Result should not be null", result);
    assertEquals("Should be a BLOCK", Token.BLOCK, result.getType());
  }

  @Test
  public void testMutateWithNeedsDefaultResult() {
    Node fnNode = createSimpleFunctionWithoutReturn();
    Node callNode = createCallNode("arg1");

    Node result = mutator.mutate(FN_NAME, fnNode, callNode, RESULT_NAME, true, false);

    assertNotNull("Result should not be null", result);
    assertEquals("Should be a BLOCK", Token.BLOCK, result.getType());
  }

  @Test
  public void testMutateWithIsCallInLoop() {
    Node fnNode = createFunctionWithVarDeclaration();
    Node callNode = createCallNode("arg");

    Node result = mutator.mutate(FN_NAME, fnNode, callNode, RESULT_NAME, false, true);

    assertNotNull("Result should not be null", result);
    assertEquals("Should be a BLOCK", Token.BLOCK, result.getType());
  }

  @Test
  public void testMutateNullResultName() {
    Node fnNode = createSimpleFunctionWithReturn();
    Node callNode = createCallNode("arg1");

    Node result = mutator.mutate(FN_NAME, fnNode, callNode, null, false, false);

    assertNotNull("Result should not be null", result);
    assertEquals("Should be a BLOCK", Token.BLOCK, result.getType());
  }

  @Test
  public void testMutateWithMultipleReturns() {
    Node fnNode = createFunctionWithMultipleReturns();
    Node callNode = createCallNode("arg1");

    Node result = mutator.mutate(FN_NAME, fnNode, callNode, RESULT_NAME, false, false);

    assertNotNull("Result should not be null", result);
    assertEquals("Should be a BLOCK", Token.BLOCK, result.getType());
  }

  @Test
  public void testLabelNameSupplierGet() {
    Supplier<String> idSupplier = new Supplier<String>() {
      @Override
      public String get() {
        return "testId";
      }
    };
    FunctionToBlockMutator.LabelNameSupplier labelSupplier = new FunctionToBlockMutator.LabelNameSupplier(idSupplier);

    String label = labelSupplier.get();

    assertEquals("JSCompiler_inline_label_testId", label);
  }

  @Test
  public void testGetLabelNameForFunctionWithNonNullName() {
    String label = mutator.getLabelNameForFunction("myFunction");
    assertNotNull(label);
    assertEquals(-1, label.indexOf("anon"));
  }

  @Test
  public void testGetLabelNameForFunctionWithNullName() {
    String label = mutator.getLabelNameForFunction(null);
    assertNotNull(label);
    assertEquals(-1, label.indexOf("anon"));
  }

  @Test
  public void testGetLabelNameForFunctionWithEmptyName() {
    String label = mutator.getLabelNameForFunction("");
    assertNotNull(label);
    assertEquals(-1, label.indexOf("anon"));
  }

  private Node createSimpleFunctionWithReturn() {
    Node script = new Node(Token.SCRIPT);
    Node fnNode = new Node(Token.FUNCTION);
    Node name = Node.newString(Token.NAME, "testFn");
    Node params = new Node(Token.PARAM_LIST);
    Node body = new Node(Token.BLOCK);
    Node returnNode = new Node(Token.RETURN);
    Node numberNode = Node.newNumber(1);
    returnNode.addChildToBack(numberNode);
    body.addChildToBack(returnNode);
    fnNode.addChildToFront(name);
    fnNode.addChildToBack(params);
    fnNode.addChildToBack(body);
    script.addChildToBack(fnNode);
    return fnNode;
  }

  private Node createSimpleFunctionWithoutReturn() {
    Node script = new Node(Token.SCRIPT);
    Node fnNode = new Node(Token.FUNCTION);
    Node name = Node.newString(Token.NAME, "testFn");
    Node params = new Node(Token.PARAM_LIST);
    Node body = new Node(Token.BLOCK);
    Node exprNode = new Node(Token.EXPR_RESULT);
    Node stringNode = Node.newString("hello");
    exprNode.addChildToBack(stringNode);
    body.addChildToBack(exprNode);
    fnNode.addChildToFront(name);
    fnNode.addChildToBack(params);
    fnNode.addChildToBack(body);
    script.addChildToBack(fnNode);
    return fnNode;
  }

  private Node createFunctionWithVarDeclaration() {
    Node script = new Node(Token.SCRIPT);
    Node fnNode = new Node(Token.FUNCTION);
    Node name = Node.newString(Token.NAME, "testFn");
    Node params = new Node(Token.PARAM_LIST);
    Node body = new Node(Token.BLOCK);
    Node varNode = new Node(Token.VAR);
    Node varName = Node.newString(Token.NAME, "x");
    varNode.addChildToFront(varName);
    body.addChildToBack(varNode);
    Node returnNode = new Node(Token.RETURN);
    returnNode.addChildToFront(Node.newNumber(5));
    body.addChildToBack(returnNode);
    fnNode.addChildToFront(name);
    fnNode.addChildToBack(params);
    fnNode.addChildToBack(body);
    script.addChildToBack(fnNode);
    return fnNode;
  }

  private Node createFunctionWithMultipleReturns() {
    Node script = new Node(Token.SCRIPT);
    Node fnNode = new Node(Token.FUNCTION);
    Node name = Node.newString(Token.NAME, "testFn");
    Node params = new Node(Token.PARAM_LIST);
    Node body = new Node(Token.BLOCK);
    Node ifNode = new Node(Token.IF);
    Node cond = Node.newNumber(1);
    Node ifBlock = new Node(Token.BLOCK);
    Node ret1 = new Node(Token.RETURN);
    ret1.addChildToFront(Node.newString("a"));
    ifBlock.addChildToBack(ret1);
    ifNode.addChildToFront(cond);
    ifNode.addChildToBack(ifBlock);
    body.addChildToBack(ifNode);
    Node ret2 = new Node(Token.RETURN);
    ret2.addChildToFront(Node.newString("b"));
    body.addChildToBack(ret2);
    fnNode.addChildToFront(name);
    fnNode.addChildToBack(params);
    fnNode.addChildToBack(body);
    script.addChildToBack(fnNode);
    return fnNode;
  }

  private Node createCallNode(String... argNames) {
    Node callNode = new Node(Token.CALL);
    Node targetName = Node.newString(Token.NAME, "testFn");
    callNode.addChildToBack(targetName);
    for (String argName : argNames) {
      Node argNameNode = Node.newString(Token.NAME, argName);
      callNode.addChildToBack(argNameNode);
    }
    return callNode;
  }
}