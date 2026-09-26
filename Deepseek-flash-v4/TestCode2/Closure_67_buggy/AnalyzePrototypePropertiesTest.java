package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;

public class AnalyzePrototypePropertiesTest {

  private AnalyzePrototypeProperties analyzer;
  private AbstractCompiler compiler;
  private JSModuleGraph moduleGraph;
  private JSModule module1;

  @Before
  public void setUp() throws Exception {
    compiler = new Compiler();
    moduleGraph = null;
    analyzer = new AnalyzePrototypeProperties(compiler, moduleGraph, false, false);
  }

  @Test
  public void testConstructorNoModuleGraph() {
    assertNotNull(analyzer);
  }

  @Test
  public void testProcessNullExternRoot() {
    Node externRoot = null;
    Node root = new Node(Token.SCRIPT);
    try {
      analyzer.process(externRoot, root);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testProcessNullRoot() {
    Node externRoot = new Node(Token.SCRIPT);
    Node root = null;
    try {
      analyzer.process(externRoot, root);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testGetAllNameInfoInitiallyEmpty() {
    assertTrue(analyzer.getAllNameInfo().isEmpty());
  }

  @Test
  public void testProcessSimplePrototypeProperty() {
    Node externRoot = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);
    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = Node.newString("Foo");
    Node body = new Node(Token.BLOCK);
    fnNode.addChildToFront(nameNode);
    fnNode.addChildToBack(body);
    Node assign = new Node(Token.ASSIGN);
    Node getprop = new Node(Token.GETPROP);
    Node object = new Node(Token.NAME, Node.newString("Foo"));
    Node prototypeString = Node.newString("prototype");
    Node barString = Node.newString("bar");
    getprop.addChildToFront(object);
    getprop.addChildToBack(prototypeString);
    Node getprop2 = new Node(Token.GETPROP);
    getprop2.addChildToFront(getprop);
    getprop2.addChildToBack(barString);
    Node fnValue = new Node(Token.FUNCTION);
    assign.addChildToFront(getprop2);
    assign.addChildToBack(fnValue);
    Node expr = new Node(Token.EXPR_RESULT, assign);
    Node script = new Node(Token.SCRIPT);
    script.addChildToFront(expr);
    root.addChildToFront(script);
    analyzer.process(externRoot, root);
    assertFalse(analyzer.getAllNameInfo().isEmpty());
    NameInfo info = analyzer.getNameInfoForName("bar", analyzer.PROPERTY);
    assertEquals("bar", info.toString());
    assertFalse(info.isReferenced());
  }

  @Test
  public void testProcessGlobalFunctionDeclaration() {
    Node externRoot = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node name = Node.newString("testFunc");
    Node fn = new Node(Token.FUNCTION);
    name.addChildToBack(fn);
    varNode.addChildToFront(name);
    root.addChildToFront(varNode);
    analyzer.process(externRoot, root);
    assertFalse(analyzer.getAllNameInfo().isEmpty());
    NameInfo info = analyzer.getNameInfoForName("testFunc", analyzer.VAR);
    assertEquals("testFunc", info.toString());
    assertTrue(info.getDeclarations().size() == 0);
  }

  @Test
  public void testProcessImplicitlyUsedProperties() {
    Node externRoot = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);
    analyzer.process(externRoot, root);
    NameInfo lengthInfo = analyzer.getNameInfoForName("length", analyzer.PROPERTY);
    assertTrue(lengthInfo.isReferenced());
    NameInfo toStringInfo = analyzer.getNameInfoForName("toString", analyzer.PROPERTY);
    assertTrue(toStringInfo.isReferenced());
    NameInfo valueOfInfo = analyzer.getNameInfoForName("valueOf", analyzer.PROPERTY);
    assertTrue(valueOfInfo.isReferenced());
  }

  @Test
  public void testProcessExternPropertiesWhenCannotModify() {
    analyzer = new AnalyzePrototypeProperties(compiler, moduleGraph, false, false);
    Node externRoot = new Node(Token.SCRIPT);
    Node getprop = new Node(Token.GETPROP);
    Node object = new Node(Token.NAME, Node.newString("x"));
    Node prop = Node.newString("externalProp");
    getprop.addChildToFront(object);
    getprop.addChildToBack(prop);
    externRoot.addChildToFront(getprop);
    Node root = new Node(Token.SCRIPT);
    analyzer.process(externRoot, root);
    NameInfo info = analyzer.getNameInfoForName("externalProp", analyzer.PROPERTY);
    assertNotNull(info);
  }

  @Test
  public void testNameInfoInitiallyZeroDeclarations() {
    NameInfo info = analyzer.getNameInfoForName("test", analyzer.PROPERTY);
    assertTrue(info.getDeclarations().isEmpty());
  }

  @Test
  public void testNameInfoMarkReferenceChangesState() {
    NameInfo info = analyzer.getNameInfoForName("test", analyzer.PROPERTY);
    assertFalse(info.isReferenced());
    info.markReference(null);
    assertTrue(info.isReferenced());
  }

  @Test
  public void testNameInfoDeepestCommonModuleRefInitiallyNull() {
    NameInfo info = analyzer.getNameInfoForName("test", analyzer.PROPERTY);
    assertNull(info.getDeepestCommonModuleRef());
  }

  @Test
  public void testNameInfoToString() {
    NameInfo info = analyzer.getNameInfoForName("myProp", analyzer.PROPERTY);
    assertEquals("myProp", info.toString());
  }

  @Test
  public void testNameInfoReadsClosureInitiallyFalse() {
    NameInfo info = analyzer.getNameInfoForName("test", analyzer.PROPERTY);
    assertFalse(info.readsClosureVariables());
  }

  @Test
  public void testSymbolGraphContainsExternNode() {
    assertEquals(2, analyzer.symbolGraph.getNodes().size()); // extern and global
  }

  @Test
  public void testProcessNullExternRootWithModule() {
    JSModule module = new JSModule("mod1");
    moduleGraph = new JSModuleGraph(new JSModule[]{module});
    analyzer = new AnalyzePrototypeProperties(compiler, moduleGraph, false, false);
    Node root = new Node(Token.SCRIPT);
    try {
      analyzer.process(null, root);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testGlobalFunctionReadsClosureVariablesFalse() {
    Node externRoot = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node name = Node.newString("funcName");
    Node fn = new Node(Token.FUNCTION);
    name.addChildToBack(fn);
    varNode.addChildToFront(name);
    root.addChildToFront(varNode);
    analyzer.process(externRoot, root);
    NameInfo info = analyzer.getNameInfoForName("funcName", analyzer.VAR);
    assertFalse(info.readsClosureVariables());
  }
}