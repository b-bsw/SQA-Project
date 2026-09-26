package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TypedScopeCreatorTest {

  private Compiler compiler;
  private TypedScopeCreator creator;

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    creator = new TypedScopeCreator(compiler);
  }

  @After
  public void tearDown() {
    compiler = null;
    creator = null;
  }

  @Test
  public void testCreateScopeWithNullParentCreatesGlobalScope() {
    Node script = new Node(Token.SCRIPT);

    Scope scope = creator.createScope(script, null);

    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    assertNull(scope.getParent());
    assertSame(script, scope.getRootNode());
  }

  @Test
  public void testCreateGlobalScopeDeclaresVariableAndFunction() {
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(varNode("x"));
    script.addChildToBack(varNodeWithValue("y", "hello"));
    script.addChildToBack(createFunction("f", "a", "b"));

    Scope scope = creator.createScope(script, null);

    assertTrue(scope.isDeclared("x", false));
    assertTrue(scope.isDeclared("y", false));
    assertTrue(scope.isDeclared("f", false));
    assertNotNull(scope.getVar("x"));
    assertNotNull(scope.getVar("y"));
    assertNotNull(scope.getVar("f"));
  }

  @Test
  public void testCreateLocalScopeForFunctionDeclaresParametersAndVars() {
    Node function = createFunction("f", "a", "b");
    function.getLastChild().addChildToBack(varNode("x"));

    Scope global = creator.createScope(new Node(Token.SCRIPT), null);
    assertTrue(global.isGlobal());

    Scope local = creator.createScope(function, global);

    assertNotNull(local);
    assertFalse(local.isGlobal());
    assertSame(function, local.getRootNode());
    assertSame(global, local.getParent());
    assertTrue(local.isDeclared("a", false));
    assertTrue(local.isDeclared("b", false));
    assertTrue(local.isDeclared("x", false));
  }

  private static Node varNode(String name) {
    Node var = new Node(Token.VAR);
    var.addChildToBack(Node.newString(Token.NAME, name));
    return var;
  }

  private static Node varNodeWithValue(String name, String value) {
    Node var = varNode(name);
    var.getFirstChild().addChildToBack(Node.newString(Token.STRING, value));
    return var;
  }

  private static Node createFunction(String name, String... params) {
    Node function = new Node(Token.FUNCTION);
    function.addChildToBack(Node.newString(Token.NAME, name));

    Node paramList = new Node(Token.PARAM_LIST);
    for (String param : params) {
      paramList.addChildToBack(Node.newString(Token.NAME, param));
    }
    function.addChildToBack(paramList);
    function.addChildToBack(new Node(Token.BLOCK));

    return function;
  }
}