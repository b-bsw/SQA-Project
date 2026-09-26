package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MethodCompilerPassTest {

  private static class TestSignatureStore implements MethodCompilerPass.SignatureStore {
    final Set<String> added = Sets.newHashSet();
    final Set<String> removed = Sets.newHashSet();

    @Override
    public void reset() {
      added.clear();
      removed.clear();
    }

    @Override
    public void addSignature(String functionName, Node functionNode, String sourceFile) {
      added.add(functionName);
    }

    @Override
    public void removeSignature(String functionName) {
      removed.add(functionName);
    }
  }

  private static class NoOpCallback implements Callback {
    @Override
    public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
      return true;
    }

    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      // no-op
    }
  }

  private static class TestCompiler extends AbstractCompiler {
    private boolean ideMode;

    TestCompiler(boolean ideMode) {
      this.ideMode = ideMode;
    }

    @Override
    public boolean isIdeMode() {
      return ideMode;
    }

    // Other abstract methods needed? We only need isIdeMode for now.
    // If more are required, provide stubs.
    @Override
    public CompilerOptions getOptions() { return null; }
    @Override
    public void report(JSError error) {}
    @Override
    public CodeChangeHandler getCodeChangeHandler() { return null; }
    @Override
    public void addChangeHandler(CodeChangeHandler handler) {}
    @Override
    public void removeChangeHandler(CodeChangeHandler handler) {}
    @Override
    public void process(JSError error) {}
    @Override
    public SourceFile getSourceFile(String name) { return null; }
    @Override
    public Node getRoot() { return null; }
  }

  private TestSignatureStore signatureStore;
  private TestCompiler compiler;
  private MethodCompilerPass pass;

  @Before
  public void setUp() {
    signatureStore = new TestSignatureStore();
    compiler = new TestCompiler(false); // default not IDE mode
    pass = new MethodCompilerPass(compiler) {
      @Override
      Callback getActingCallback() {
        return new NoOpCallback();
      }

      @Override
      SignatureStore getSignatureStore() {
        return signatureStore;
      }
    };
  }

  private Node createStringNode(String str) {
    Node n = new Node(Token.STRING);
    n.setString(str);
    return n;
  }

  private Node createNameNode(String name) {
    Node n = new Node(Token.NAME);
    n.setString(name);
    return n;
  }

  private Node createFunctionNode() {
    return new Node(Token.FUNCTION);
  }

  private Node createGetProp(Node obj, String prop) {
    Node getprop = new Node(Token.GETPROP);
    getprop.addChildToFront(obj);
    getprop.addChildToBack(createStringNode(prop));
    return getprop;
  }

  private Node createGetElem(Node obj, String prop) {
    Node getelem = new Node(Token.GETELEM);
    getelem.addChildToFront(obj);
    getelem.addChildToBack(createStringNode(prop));
    return getelem;
  }

  private Node createAssign(Node target, Node value) {
    Node assign = new Node(Token.ASSIGN);
    assign.addChildToFront(target);
    assign.addChildToBack(value);
    return assign;
  }

  private Node createObjectLit(Node... keysAndValues) {
    Node obj = new Node(Token.OBJECTLIT);
    for (int i = 0; i < keysAndValues.length; i += 2) {
      obj.addChildToBack(keysAndValues[i]);   // key (STRING)
      obj.addChildToBack(keysAndValues[i+1]); // value
    }
    return obj;
  }

  @Test
  public void testProcessWithNullExterns() {
    Node root = createAssign(
        createGetProp(createNameNode("Foo"), "bar"),
        createFunctionNode());
    pass.process(null, root);
    assertTrue(pass.externMethods.isEmpty());
    assertTrue(pass.externMethodsWithoutSignatures.isEmpty());
    assertTrue(signatureStore.added.size() > 0);
    assertTrue(pass.methodDefinitions.size() > 0);
  }

  @Test
  public void testProcessWithExternMethodSignature() {
    Node externs = createAssign(
        createGetProp(createNameNode("methods"), "setTimeout"),
        createFunctionNode());
    Node root = new Node(Token.SCRIPT);
    pass.process(externs, root);
    assertTrue(pass.externMethods.contains("setTimeout"));
    assertTrue(pass.externMethodsWithoutSignatures.isEmpty());
    assertTrue(signatureStore.added.contains("setTimeout"));
    assertTrue(pass.methodDefinitions.containsKey("setTimeout"));
  }

  @Test
  public void testProcessWithExternMethodWithoutSignature() {
    // assign without function: e.g., methods.setTimeout = 5
    Node externs = createAssign(
        createGetProp(createNameNode("methods"), "setTimeout"),
        new Node(Token.NUMBER));
    Node root = new Node(Token.SCRIPT);
    pass.process(externs, root);
    assertTrue(pass.externMethods.contains("setTimeout"));
    assertTrue(pass.externMethodsWithoutSignatures.contains("setTimeout"));
    assertTrue(signatureStore.removed.contains("setTimeout"));
    assertFalse(signatureStore.added.contains("setTimeout"));
  }

  @Test
  public void testProcessWithExternObjectLitWithFunction() {
    // object literal with a method
    Node externs = createObjectLit(
        createStringNode("foo"), createFunctionNode(),
        createStringNode("bar"), createStringNode("baz"));
    Node root = new Node(Token.SCRIPT);
    pass.process(externs, root);
    assertTrue(pass.externMethods.contains("foo"));
    assertTrue(pass.externMethods.contains("bar"));
    assertTrue(pass.externMethodsWithoutSignatures.contains("bar"));
    assertFalse(pass.externMethodsWithoutSignatures.contains("foo"));
    assertTrue(signatureStore.added.contains("foo"));
    assertTrue(signatureStore.removed.contains("bar"));
  }

  @Test
  public void testProcessWithRootStaticMethod() {
    Node root = createAssign(
        createGetProp(createNameNode("Foo"), "bar"),
        createFunctionNode());
    pass.process(null, root);
    assertTrue(pass.externMethods.isEmpty());
    assertTrue(pass.nonMethodProperties.isEmpty());
    assertTrue(signatureStore.added.contains("bar"));
    assertTrue(pass.methodDefinitions.containsKey("bar"));
  }

  @Test
  public void testProcessWithRootNonMethodProperty() {
    // assignment value not a function or name
    Node root = createAssign(
        createGetProp(createNameNode("Foo"), "bar"),
        new Node(Token.NUMBER));
    pass.process(null, root);
    assertTrue(pass.nonMethodProperties.contains("bar"));
    assertFalse(signatureStore.added.contains("bar"));
  }

  @Test
  public void testProcessWithRootPrototypeMethod() {
    // Foo.prototype.bar = function() {}
    Node obj = createGetProp(createNameNode("Foo"), "prototype");
    Node getprop = createGetProp(obj, "bar");
    Node assign = createAssign(getprop, createFunctionNode());
    Node root = assign;
    pass.process(null, root);
    assertTrue(signatureStore.added.contains("bar"));
    assertTrue(pass.methodDefinitions.containsKey("bar"));
  }

  @Test
  public void testProcessWithRootObjectLitWithFunction() {
    Node root = createObjectLit(
        createStringNode("foo"), createFunctionNode(),
        createStringNode("bar"), new Node(Token.NUMBER));
    pass.process(null, root);
    assertTrue(signatureStore.added.contains("foo"));
    assertTrue(pass.nonMethodProperties.contains("bar"));
  }

  @Test
  public void testProcessWithRootObjectLitAllNonFunctions() {
    Node root = createObjectLit(
        createStringNode("x"), new Node(Token.STRING),
        createStringNode("y"), new Node(Token.NUMBER));
    pass.process(null, root);
    assertTrue(pass.nonMethodProperties.contains("x"));
    assertTrue(pass.nonMethodProperties.contains("y"));
    assertFalse(signatureStore.added.contains("x"));
    assertFalse(signatureStore.added.contains("y"));
  }

  @Test
  public void testProcessWithExternGetElem() {
    Node externs = createAssign(
        createGetElem(createNameNode("methods"), "set"),
        createFunctionNode());
    Node root = new Node(Token.SCRIPT);
    pass.process(externs, root);
    assertTrue(pass.externMethods.contains("set"));
    assertTrue(signatureStore.added.contains("set"));
  }

  @Test
  public void testProcessWithExternGetElemWithoutSignature() {
    Node externs = createAssign(
        createGetElem(createNameNode("methods"), "get"),
        new Node(Token.STRING));
    Node root = new Node(Token.SCRIPT);
    pass.process(externs, root);
    assertTrue(pass.externMethods.contains("get"));
    assertTrue(pass.externMethodsWithoutSignatures.contains("get"));
    assertTrue(signatureStore.removed.contains("get"));
  }

  @Test
  public void testProcessWithNonStringDestReturnsEarly() {
    // dest node is not STRING -> should return early without effect
    Node dest = new Node(Token.NUMBER);
    Node getprop = new Node(Token.GETPROP);
    getprop.addChildToFront(createNameNode("a"));
    getprop.addChildToBack(dest);
    Node assign = createAssign(getprop, createFunctionNode());
    Node root = assign;
    pass.process(null, root);
    // No signature added because dest is not STRING, so addPossibleSignature not called
    assertTrue(signatureStore.added.isEmpty());
    assertTrue(pass.nonMethodProperties.isEmpty());
  }

  @Test
  public void testProcessWithExternObjectLitNonStringKey() {
    // key not STRING, should skip
    Node key = new Node(Token.NUMBER);
    Node value = createFunctionNode();
    Node externs = createObjectLit(key, value);
    Node root = new Node(Token.SCRIPT);
    pass.process(externs, root);
    assertTrue(pass.externMethods.isEmpty());
    assertTrue(pass.externMethodsWithoutSignatures.isEmpty());
  }

  @Test
  public void testGetExternMethodsSkipWhenParentNotAssign() {
    // parent is not ASSIGN (e.g., EXPR_RESULT), so it should call removeSignature and add without signature
    Node getprop = createGetProp(createNameNode("methods"), "foo");
    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToFront(getprop);
    // We need to traverse as part of externs; use a root that contains this as a child
    Node externs = new Node(Token.BLOCK);
    externs.addChildToFront(exprResult);
    Node root = new Node(Token.SCRIPT);
    pass.process(externs, root);
    assertTrue(pass.externMethods.contains("foo"));
    assertTrue(pass.externMethodsWithoutSignatures.contains("foo"));
    assertTrue(signatureStore.removed.contains("foo"));
  }

  @Test
  public void testGetExternMethodsSkipWhenParentAssignButNotFirstChild() {
    // parent is ASSIGN but n is not first child (i.e., right side)
    Node getprop = createGetProp(createNameNode("methods"), "foo");
    Node assign = createAssign(new Node(Token.NAME), getprop); // value side
    Node externs = assign;
    Node root = new Node(Token.SCRIPT);
    pass.process(externs, root);
    assertTrue(pass.externMethods.contains("foo"));
    assertTrue(pass.externMethodsWithoutSignatures.contains("foo"));
    assertTrue(signatureStore.removed.contains("foo"));
  }

  @Test
  public void testGatherSignaturesWithPrototypeParentNotAssign() {
    // prototype parent is not ASSIGN (e.g., EXPR_RESULT) -> no action
    Node protoGetprop = createGetProp(createNameNode("Foo"), "prototype");
    Node getprop = createGetProp(protoGetprop, "bar");
    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToFront(getprop);
    Node root = exprResult;
    pass.process(null, root);
    assertTrue(signatureStore.added.isEmpty());
  }

  @Test
  public void testProcessWithIdeModeAndUndefinedFunction() {
    // In IDE mode, when NAME var is null, no exception
    compiler = new TestCompiler(true);
    pass = new MethodCompilerPass(compiler) {
      @Override
      Callback getActingCallback() { return new NoOpCallback(); }
      @Override
      SignatureStore getSignatureStore() { return signatureStore; }
    };
    Node root = createAssign(
        createGetProp(createNameNode("Foo"), "bar"),
        createNameNode("undefinedFunc"));
    pass.process(null, root);
    // No exception thrown, and nonMethodProperties should contain "bar"
    // because the name resolution failed and IDE mode returns without adding
    assertTrue(pass.nonMethodProperties.contains("bar"));
  }
}