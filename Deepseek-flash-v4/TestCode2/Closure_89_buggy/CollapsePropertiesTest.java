package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.GlobalNamespace.Name;
import com.google.javascript.jscomp.GlobalNamespace.Ref;
import com.google.javascript.jscomp.GlobalNamespace.Ref.Type;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CollapsePropertiesTest {

  private AbstractCompiler compiler;
  private CollapseProperties collapseProperties;

  @Before
  public void setUp() {
    compiler = Compiler.createCompiler();
    collapseProperties = new CollapseProperties(compiler, false, false);
  }

  @Test
  public void testProcessWithExternsAndRoot() {
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);
    collapseProperties.process(externs, root);
    assertNotNull(collapseProperties.nameMap);
    assertNotNull(collapseProperties.globalNames);
  }

  @Test
  public void testProcessWithNullExterns() {
    Node root = new Node(Token.SCRIPT);
    collapseProperties = new CollapseProperties(compiler, false, false);
    collapseProperties.process(null, root);
    assertNotNull(collapseProperties.nameMap);
  }

  @Test
  public void testProcessWithNullRoot() {
    Node externs = new Node(Token.SCRIPT);
    try {
      collapseProperties.process(externs, null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testInlineAliasesWithEmptyNamespace() {
    GlobalNamespace namespace = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
    collapseProperties.inlineAliases(namespace);
    assertTrue(namespace.getNameForest().isEmpty());
  }

  @Test
  public void testInlineAliasesWithSingleName() {
    Node root = new Node(Token.SCRIPT);
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    collapseProperties.inlineAliases(namespace);
    assertTrue(namespace.getNameForest().isEmpty());
  }

  @Test
  public void testCheckNamespacesWithEmptyNameMap() {
    collapseProperties.nameMap = new java.util.HashMap<>();
    collapseProperties.checkNamespaces();
    assertTrue(collapseProperties.nameMap.isEmpty());
  }

  @Test
  public void testCheckNamespacesWithNamespaceName() {
    Name name = new Name("test", null, false);
    name.globalSets = 1;
    name.localSets = 1;
    name.aliasingGets = 0;
    collapseProperties.nameMap = new java.util.HashMap<>();
    collapseProperties.nameMap.put("test", name);
    collapseProperties.checkNamespaces();
  }

  @Test
  public void testFlattenReferencesToCollapsibleDescendantNamesWithNoProps() {
    Name n = new Name("test", null, false);
    n.props = null;
    collapseProperties.flattenReferencesToCollapsibleDescendantNames(n, "alias");
    assertNull(n.props);
  }

  @Test
  public void testFlattenReferencesToCollapsibleDescendantNamesWithProps() {
    Name n = new Name("test", null, false);
    Name p = new Name("prop", null, false);
    n.props = java.util.Collections.singletonList(p);
    collapseProperties.flattenReferencesToCollapsibleDescendantNames(n, "alias");
    assertNotNull(n.props);
  }

  @Test
  public void testFlattenReferencesToWithNoRefsAndNoProps() {
    Name n = new Name("test", null, false);
    n.refs = null;
    n.props = null;
    collapseProperties.flattenReferencesTo(n, "alias");
    assertNull(n.refs);
  }

  @Test
  public void testFlattenReferencesToWithRefs() {
    Name n = new Name("test", null, false);
    Node node = new Node(Token.NAME, "x");
    Node parent = new Node(Token.GETPROP, node, new Node(Token.STRING, "y"));
    Ref ref = new Ref(node, Type.SET_FROM_GLOBAL, null, null, null);
    n.refs = java.util.Collections.singletonList(ref);
    collapseProperties.flattenReferencesTo(n, "alias");
  }

  @Test
  public void testFlattenNameRef() {
    Node n = new Node(Token.NAME, "x");
    Node parent = new Node(Token.GETPROP, n, new Node(Token.STRING, "y"));
    collapseProperties.flattenNameRef("alias", n, parent, "originalName");
    assertEquals(Token.NAME, n.getType());
  }

  @Test
  public void testFlattenNameRefAtDepthWithQName() {
    Node n = new Node(Token.GETPROP, new Node(Token.NAME, "x"), new Node(Token.STRING, "y"));
    collapseProperties.flattenNameRefAtDepth("alias", n, 1, "original");
    assertNotNull(n.getFirstChild());
  }

  @Test
  public void testFlattenNameRefAtDepthWithObjKey() {
    Node n = new Node(Token.STRING, "key");
    collapseProperties.flattenNameRefAtDepth("alias", n, 1, "original");
    assertEquals(Token.STRING, n.getType());
  }

  @Test
  public void testCollapseDeclarationOfNameAndDescendantsWithNoProps() {
    Name n = new Name("test", null, false);
    n.props = null;
    collapseProperties.collapseDeclarationOfNameAndDescendants(n, "alias");
  }

  @Test
  public void testCollapseDeclarationOfNameAndDescendantsWithProps() {
    Name n = new Name("test", null, false);
    Name p = new Name("prop", null, false);
    n.props = java.util.Collections.singletonList(p);
    collapseProperties.collapseDeclarationOfNameAndDescendants(n, "alias");
  }

  @Test
  public void testUpdateSimpleDeclarationWithExprResult() {
    Node node = new Node(Token.NAME, "x");
    Ref ref = new Ref(node, Type.SET_FROM_GLOBAL, null, null, null);
    Node rvalue = new Node(Token.NUMBER, 1);
    Node parent = new Node(Token.ASSIGN, node, rvalue);
    Node gramps = new Node(Token.EXPR_RESULT, parent);
    Node greatGramps = new Node(Token.SCRIPT, gramps);
    ref.node = node;
    collapseProperties.updateSimpleDeclaration("alias", new Name("test", null, false), ref);
  }

  @Test
  public void testUpdateSimpleDeclarationWithTwinRef() {
    Node node = new Node(Token.NAME, "x");
    Ref ref = new Ref(node, Type.SET_FROM_GLOBAL, null, null, null);
    Ref twin = new Ref(node, Type.SET_FROM_GLOBAL, null, null, null);
    ref.setTwin(twin);
    Node rvalue = new Node(Token.NUMBER, 1);
    Node parent = new Node(Token.ASSIGN, node, rvalue);
    Node gramps = new Node(Token.BLOCK, parent);
    Node greatGramps = new Node(Token.SCRIPT, gramps);
    ref.node = node;
    collapseProperties.updateSimpleDeclaration("alias", new Name("test", null, false), ref);
  }

  @Test
  public void testUpdateObjLitOrFunctionDeclarationWithAssign() {
    Node node = new Node(Token.NAME, "x");
    Ref ref = new Ref(node, Type.SET_FROM_GLOBAL, null, null, null);
    Node rvalue = new Node(Token.OBJECTLIT);
    Node assign = new Node(Token.ASSIGN, node, rvalue);
    Node exprResult = new Node(Token.EXPR_RESULT, assign);
    Node script = new Node(Token.SCRIPT, exprResult);
    ref.node = node;
    Name n = new Name("test", null, false);
    n.declaration = ref;
    n.declaration.node = node;
    n.declaration.node.getParent().addChildToFront(rvalue);
    collapseProperties.updateObjLitOrFunctionDeclaration(n, "alias");
  }

  @Test
  public void testUpdateObjLitOrFunctionDeclarationWithVar() {
    Node nameNode = new Node(Token.NAME, "x");
    Node rvalue = new Node(Token.NUMBER, 1);
    nameNode.addChildToFront(rvalue);
    Node varNode = new Node(Token.VAR, nameNode);
    Node script = new Node(Token.SCRIPT, varNode);
    Ref ref = new Ref(nameNode, Type.SET_FROM_GLOBAL, null, null, null);
    ref.node = nameNode;
    Name n = new Name("test", null, false);
    n.declaration = ref;
    n.declaration.node = nameNode;
    collapseProperties.updateObjLitOrFunctionDeclaration(n, "alias");
  }

  @Test
  public void testUpdateObjLitOrFunctionDeclarationWithFunction() {
    Node functionNode = new Node(Token.FUNCTION, new Node(Token.NAME, "f"));
    Node script = new Node(Token.SCRIPT, functionNode);
    Ref ref = new Ref(functionNode, Type.SET_FROM_GLOBAL, null, null, null);
    ref.node = functionNode;
    Name n = new Name("test", null, false);
    n.declaration = ref;
    n.declaration.node = functionNode;
    collapseProperties.updateObjLitOrFunctionDeclaration(n, "alias");
  }

  @Test
  public void testCheckForHosedThisReferences() {
    Node function = new Node(Token.FUNCTION, new Node(Token.NAME, "f"));
    Node body = new Node(Token.BLOCK);
    function.addChildToBack(body);
    Name name = new Name("test", null, false);
    Ref ref = new Ref(new Node(Token.NAME, "test"), Type.SET_FROM_GLOBAL, null, null, null);
    ref.sourceName = "testSource";
    name.declaration = ref;
    collapseProperties.checkForHosedThisReferences(function, null, name);
  }

  @Test
  public void testUpdateObjLitOrFunctionDeclarationAtVarNode() {
    Node nameNode = new Node(Token.NAME, "x");
    Node rvalue = new Node(Token.OBJECTLIT);
    nameNode.addChildToFront(rvalue);
    Node varNode = new Node(Token.VAR, nameNode);
    Node script = new Node(Token.SCRIPT, varNode);
    Ref ref = new Ref(nameNode, Type.SET_FROM_GLOBAL, null, null, null);
    ref.node = nameNode;
    Name n = new Name("test", null, false);
    n.declaration = ref;
    n.declaration.node = nameNode;
    collapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(n);
  }

  @Test
  public void testUpdateFunctionDeclarationAtFunctionNode() {
    Node functionNode = new Node(Token.FUNCTION, new Node(Token.NAME, "f"));
    Node body = new Node(Token.BLOCK);
    functionNode.addChildToBack(body);
    Node script = new Node(Token.SCRIPT, functionNode);
    Ref ref = new Ref(functionNode, Type.SET_FROM_GLOBAL, null, null, null);
    ref.node = functionNode;
    Name n = new Name("test", null, false);
    n.declaration = ref;
    n.declaration.node = functionNode;
    collapseProperties.updateFunctionDeclarationAtFunctionNode(n);
  }

  @Test
  public void testDeclareVarsForObjLitValues() {
    Name n = new Name("test", null, false);
    Node objlit = new Node(Token.OBJECTLIT);
    Node key = new Node(Token.STRING, "prop");
    Node value = new Node(Token.NUMBER, 1);
    key.addChildToFront(value);
    objlit.addChildToFront(key);
    Node varNode = new Node(Token.VAR);
    Node script = new Node(Token.SCRIPT, varNode);
    int result = collapseProperties.declareVarsForObjLitValues(n, "alias", objlit, varNode, varNode, script);
    assertTrue(result > 0);
  }

  @Test
  public void testAddStubsForUndeclaredProperties() {
    Name n = new Name("test", null, false);
    Name p = new Name("prop", null, false);
    p.needsToBeStubbed = true;
    n.props = java.util.Collections.singletonList(p);
    Node script = new Node(Token.SCRIPT);
    Node addAfter = new Node(Token.BLOCK);
    script.addChildToBack(addAfter);
    int result = collapseProperties.addStubsForUndeclaredProperties(n, "alias", script, addAfter);
    assertTrue(result > 0);
  }

  @Test
  public void testAppendPropForAlias() {
    String result = CollapseProperties.appendPropForAlias("root", "prop");
    assertEquals("root$prop", result);
  }

  @Test
  public void testAppendPropForAliasWithDollar() {
    String result = CollapseProperties.appendPropForAlias("root", "prop$");
    assertEquals("root$prop$0", result);
  }

  @Test
  public void testProcessWithCollapseOnExternTypesTrue() {
    collapseProperties = new CollapseProperties(compiler, true, false);
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);
    collapseProperties.process(externs, root);
    assertNotNull(collapseProperties.nameMap);
  }

  @Test
  public void testProcessWithInlineAliasesTrue() {
    collapseProperties = new CollapseProperties(compiler, false, true);
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);
    collapseProperties.process(externs, root);
    assertNotNull(collapseProperties.nameMap);
  }

  @Test
  public void testInlineAliasIfPossibleWithNoAliasParent() {
    Node aliasNode = new Node(Token.GETPROP);
    Ref alias = new Ref(aliasNode, Type.ALIASING_GET, null, null, null);
    GlobalNamespace namespace = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
    boolean result = collapseProperties.inlineAliasIfPossible(alias, namespace);
    assertTrue(!result);
  }
}