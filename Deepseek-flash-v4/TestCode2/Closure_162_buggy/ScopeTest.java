package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Iterator;

@RunWith(JUnit4.class)
public class ScopeTest {

  private static final String SOURCE_FILE = "test.js";

  private Node rootNode;
  private Node functionNode;
  private Scope globalScope;
  private Scope functionScope;

  private static class MockCompiler extends AbstractCompiler {
    @Override
    public void report(CheckLevel level, JSError error) {
    }

    @Override
    public void reportCodeChange() {
    }

    @Override
    public TypeRegistry getTypeRegistry() {
      return new TypeRegistry(new MockErrorReporter());
    }
  }

  private static class MockErrorReporter implements ErrorReporter {
    @Override
    public void warning(String message, String sourceName, int line, int lineOffset) {
    }

    @Override
    public void error(String message, String sourceName, int line, int lineOffset) {
    }
  }

  @Before
  public void setUp() {
    rootNode = new Node(Token.BLOCK, 0, 0);
    rootNode.setStaticSourceFile(new MockStaticSourceFile(SOURCE_FILE));
    functionNode = new Node(Token.FUNCTION, 0, 0);
    functionNode.setStaticSourceFile(new MockStaticSourceFile(SOURCE_FILE));
    globalScope = new Scope(rootNode, new MockCompiler());
    functionScope = new Scope(globalScope, functionNode);
  }

  private static class MockStaticSourceFile implements StaticSourceFile {
    private final String name;

    MockStaticSourceFile(String name) {
      this.name = name;
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public boolean isExtern() {
      return false;
    }

    @Override
    public int getLineOffset(int lineNumber) {
      return 0;
    }

    @Override
    public int getColumnOfOffset(int offset) {
      return 0;
    }

    @Override
    public int getLineOfOffset(int offset) {
      return 0;
    }
  }

  @Test
  public void testGlobalScopeProperties() {
    assertTrue(globalScope.isGlobal());
    assertFalse(globalScope.isLocal());
    assertNull(globalScope.getParent());
    assertSame(rootNode, globalScope.getRootNode());
    assertNotNull(globalScope.getTypeOfThis());
    assertEquals(0, globalScope.getDepth());
    assertFalse(globalScope.isBottom());
    assertSame(globalScope, globalScope.getGlobalScope());
  }

  @Test
  public void testFunctionScopeProperties() {
    assertFalse(functionScope.isGlobal());
    assertTrue(functionScope.isLocal());
    assertSame(globalScope, functionScope.getParent());
    assertSame(functionNode, functionScope.getRootNode());
    assertSame(globalScope.getTypeOfThis(), functionScope.getTypeOfThis());
    assertEquals(1, functionScope.getDepth());
    assertFalse(functionScope.isBottom());
    assertSame(globalScope, functionScope.getGlobalScope());
  }

  @Test
  public void testDeclareAndGetVar() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("x");
    JSType type = null; // inferred type
    CompilerInput input = null; // non-extern

    Var var = globalScope.declare("x", nameNode, type, input);
    assertNotNull(var);
    assertEquals("x", var.getName());
    assertSame(nameNode, var.getNameNode());
    assertNull(var.getType());
    assertTrue(var.isTypeInferred());
    assertSame(globalScope, var.getScope());
    assertSame(globalScope, globalScope.getVar("x"));
    assertSame(globalScope, globalScope.getSlot("x"));
    assertSame(globalScope, globalScope.getOwnSlot("x"));
    assertEquals(1, globalScope.getVarCount());
  }

  @Test
  public void testDeclareWithExplicitType() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("y");
    JSType type = null;
    CompilerInput input = null;

    Var var = globalScope.declare("y", nameNode, type, input, false);
    assertFalse(var.isTypeInferred());
    assertNull(var.getType());
  }

  @Test
  public void testDeclareDuplicateThrows() {
    Node nameNode1 = new Node(Token.NAME, 0, 0);
    nameNode1.setString("dup");
    Node nameNode2 = new Node(Token.NAME, 0, 0);
    nameNode2.setString("dup");

    globalScope.declare("dup", nameNode1, null, null);
    try {
      globalScope.declare("dup", nameNode2, null, null);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // Expected
    }
  }

  @Test
  public void testDeclareEmptyNameThrows() {
    try {
      globalScope.declare("", new Node(Token.NAME), null, null);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // Expected
    }
  }

  @Test
  public void testGetVarFromParentScope() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("parentVar");
    globalScope.declare("parentVar", nameNode, null, null);

    Var var = functionScope.getVar("parentVar");
    assertNotNull(var);
    assertEquals("parentVar", var.getName());
    assertSame(globalScope, var.getScope());
  }

  @Test
  public void testGetVarNotFound() {
    assertNull(functionScope.getVar("nonexistent"));
    assertNull(functionScope.getSlot("nonexistent"));
    assertNull(functionScope.getOwnSlot("nonexistent"));
  }

  @Test
  public void testUndeclare() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("temp");
    Var var = globalScope.declare("temp", nameNode, null, null);
    globalScope.undeclare(var);
    assertNull(globalScope.getVar("temp"));
    assertNull(globalScope.getOwnSlot("temp"));
    assertEquals(0, globalScope.getVarCount());
  }

  @Test
  public void testUndeclareWrongScopeThrows() {
    Var var = globalScope.declare("z", new Node(Token.NAME), null, null);
    try {
      functionScope.undeclare(var);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // Expected
    }
  }

  @Test
  public void testIsDeclared() {
    globalScope.declare("localOnly", new Node(Token.NAME), null, null);
    globalScope.declare("both", new Node(Token.NAME), null, null);
    functionScope.declare("both", new Node(Token.NAME), null, null);

    assertTrue(globalScope.isDeclared("localOnly", true));
    assertTrue(globalScope.isDeclared("both", true));
    assertTrue(functionScope.isDeclared("both", true));
    assertTrue(functionScope.isDeclared("localOnly", true));
    assertFalse(functionScope.isDeclared("localOnly", false));
    assertTrue(functionScope.isDeclared("both", false));
    assertFalse(globalScope.isDeclared("nonexistent", true));
    assertFalse(globalScope.isDeclared("nonexistent", false));
  }

  @Test
  public void testGetVarsIteration() {
    globalScope.declare("a", new Node(Token.NAME), null, null);
    globalScope.declare("b", new Node(Token.NAME), null, null);
    globalScope.declare("c", new Node(Token.NAME), null, null);

    Iterator<Var> it = globalScope.getVars();
    assertEquals("a", it.next().getName());
    assertEquals("b", it.next().getName());
    assertEquals("c", it.next().getName());
    assertFalse(it.hasNext());
  }

  @Test
  public void testGetVarsEmpty() {
    Iterator<Var> it = globalScope.getVars();
    assertFalse(it.hasNext());
  }

  @Test
  public void testGetAllSymbols() {
    globalScope.declare("x", new Node(Token.NAME), null, null);
    functionScope.declare("y", new Node(Token.NAME), null, null);

    assertEquals(1, globalScope.getVarCount());
    assertEquals(1, functionScope.getVarCount());
    assertEquals(1, countIterable(globalScope.getAllSymbols()));
    assertEquals(1, countIterable(functionScope.getAllSymbols()));
  }

  private int countIterable(Iterable<?> iterable) {
    int count = 0;
    for (Object o : iterable) {
      count++;
    }
    return count;
  }

  @Test
  public void testGetReferences() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("ref");
    Var var = globalScope.declare("ref", nameNode, null, null);
    Iterable<Scope.Var> refs = globalScope.getReferences(var);
    assertEquals(1, countIterable(refs));
    assertSame(var, refs.iterator().next());
  }

  @Test
  public void testGetScopeForVar() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("v");
    Var globalVar = globalScope.declare("v", nameNode, null, null);
    assertSame(globalScope, globalScope.getScope(globalVar));

    Node functionNameNode = new Node(Token.NAME, 0, 0);
    functionNameNode.setString("fv");
    Var functionVar = functionScope.declare("fv", functionNameNode, null, null);
    assertSame(functionScope, functionScope.getScope(functionVar));
  }

  @Test
  public void testArgumentsVar() {
    Var args = functionScope.getArgumentsVar();
    assertNotNull(args);
    assertEquals("arguments", args.getName());
    assertTrue(args instanceof Scope.Arguments);
    assertNull(args.getNameNode());
    assertNull(args.getType());
    assertFalse(args.isTypeInferred());
    assertSame(functionScope, args.getScope());
    assertEquals(-1, args.index);
    assertSame(args, functionScope.getArgumentsVar());
  }

  @Test
  public void testArgumentsEquals() {
    Var args1 = functionScope.getArgumentsVar();
    Var args2 = new Scope.Arguments(globalScope);
    assertFalse(args1.equals(args2));

    Var args3 = functionScope.getArgumentsVar();
    assertTrue(args1.equals(args3));
    assertTrue(args3.equals(args1));
    assertEquals(args1.hashCode(), args3.hashCode());
  }

  @Test
  public void testVarEquals() {
    Node nameNode1 = new Node(Token.NAME, 0, 0);
    nameNode1.setString("eq");
    Node nameNode2 = new Node(Token.NAME, 0, 0);
    nameNode2.setString("eq2");

    Var var1 = globalScope.declare("eq", nameNode1, null, null);
    Var var2 = globalScope.declare("eq2", nameNode2, null, null);
    Var var3 = new Scope.Var(true, "eq3", nameNode1, null, globalScope, 2, null, false, null);

    assertTrue(var1.equals(var3));
    assertTrue(var3.equals(var1));
    assertFalse(var1.equals(var2));
    assertFalse(var1.equals(null));
    assertFalse(var1.equals("not a var"));
    assertEquals(var1.hashCode(), var3.hashCode());
  }

  @Test
  public void testVarProperties() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("prop");
    Node parent = new Node(Token.VAR);
    parent.addChildToBack(nameNode);
    globalScope.declare("prop", nameNode, null, null);

    Var var = globalScope.getVar("prop");
    assertSame(parent, var.getParentNode());
    assertFalse(var.isBleedingFunction());
    assertFalse(var.isGlobal());
    assertTrue(var.isLocal());
    assertFalse(var.isExtern());
    assertFalse(var.isConst());
    assertFalse(var.isDefine());
    assertNull(var.getInitialValue());
    assertNull(var.getJSDocInfo());
    assertEquals("Scope.Var prop{null}", var.toString());
    assertEquals("<non-file>", var.getInputName());
    assertFalse(var.isNoShadow());
  }

  @Test
  public void testVarIsConst() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("CONST_NAME");
    globalScope.declare("CONST_NAME", nameNode, null, null);
    Var var = globalScope.getVar("CONST_NAME");
    assertTrue(var.isConst());
  }

  @Test
  public void testVarIsExtern() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("ext");
    CompilerInput externInput = new CompilerInput() {
      @Override
      public boolean isExtern() {
        return true;
      }
    };
    globalScope.declare("ext", nameNode, null, externInput);
    Var var = globalScope.getVar("ext");
    assertTrue(var.isExtern());
  }

  @Test
  public void testGetInitialValueWithAssign() {
    Node assignNode = new Node(Token.ASSIGN);
    Node nameNode = new Node(Token.NAME);
    nameNode.setString("assigned");
    Node valueNode = new Node(Token.NUMBER, 5, 0);
    assignNode.addChildToBack(nameNode);
    assignNode.addChildToBack(valueNode);
    globalScope.declare("assigned", nameNode, null, null);
    Var var = globalScope.getVar("assigned");
    assertSame(valueNode, var.getInitialValue());
  }

  @Test
  public void testGetInitialValueWithFunction() {
    Node functionNode = new Node(Token.FUNCTION);
    Node nameNode = new Node(Token.NAME);
    nameNode.setString("fn");
    functionNode.addChildToBack(nameNode);
    globalScope.declare("fn", nameNode, null, null);
    Var var = globalScope.getVar("fn");
    assertSame(functionNode, var.getInitialValue());
  }

  @Test
  public void testGetInitialValueWithVar() {
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME);
    nameNode.setString("v");
    Node initNode = new Node(Token.NUMBER, 3, 0);
    nameNode.addChildToBack(initNode);
    varNode.addChildToBack(nameNode);
    globalScope.declare("v", nameNode, null, null);
    Var var = globalScope.getVar("v");
    assertSame(initNode, var.getInitialValue());
  }

  @Test
  public void testVarGetNodeAndSymbol() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("sample");
    globalScope.declare("sample", nameNode, null, null);
    Var var = globalScope.getVar("sample");
    assertSame(nameNode, var.getNode());
    assertSame(var, var.getSymbol());
    assertSame(var, var.getDeclaration());
  }

  @Test
  public void testVarGetSourceFile() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setStaticSourceFile(new MockStaticSourceFile("other.js"));
    globalScope.declare("src", nameNode, null, null);
    Var var = globalScope.getVar("src");
    assertEquals("other.js", var.getSourceFile().getName());
  }

  @Test
  public void testVarGetDeclaration() {
    Var var = globalScope.declare("decl", new Node(Token.NAME), null, null);
    assertNotNull(var.getDeclaration());
    assertSame(var, var.getDeclaration());
  }

  @Test
  public void testVarSetTypeThrowsWhenNotInferred() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("nonInferred");
    Var var = globalScope.declare("nonInferred", nameNode, null, null, false);
    try {
      var.setType(null);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // Expected
    }
  }

  @Test
  public void testVarSetTypeWorksWhenInferred() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("inferred");
    Var var = globalScope.declare("inferred", nameNode, null, null);
    JSType type = null;
    try {
      var.setType(type);
    } catch (IllegalStateException e) {
      fail("Should not throw");
    }
    assertNull(var.getType());
  }

  @Test
  public void testVarResolveType() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("resolveMe");
    Var var = globalScope.declare("resolveMe", nameNode, null, null);
    var.resolveType(new MockErrorReporter());
    assertNull(var.getType());
  }

  @Test
  public void testVarIsDefine() {
    JSDocInfo.Builder builder = new JSDocInfo.Builder(true);
    builder.recordDefineType(null);
    JSDocInfo info = builder.build();
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("defined");
    nameNode.setJSDocInfo(info);
    globalScope.declare("defined", nameNode, null, null);
    Var var = globalScope.getVar("defined");
    assertTrue(var.isDefine());
  }

  @Test
  public void testVarIsNoShadow() {
    JSDocInfo.Builder builder = new JSDocInfo.Builder(true);
    builder.recordNoShadow();
    JSDocInfo info = builder.build();
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("noShadow");
    nameNode.setJSDocInfo(info);
    globalScope.declare("noShadow", nameNode, null, null);
    Var var = globalScope.getVar("noShadow");
    assertTrue(var.isNoShadow());
  }

  @Test
  public void testVarToString() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("strVar");
    globalScope.declare("strVar", nameNode, null, null);
    Var var = globalScope.getVar("strVar");
    assertEquals("Scope.Var strVar{null}", var.toString());
  }

  @Test
  public void testGetInputNameForNullInput() {
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("nullInput");
    globalScope.declare("nullInput", nameNode, null, null);
    Var var = globalScope.getVar("nullInput");
    assertEquals("<non-file>", var.getInputName());
  }

  @Test
  public void testGetInputNameForNonNullInput() {
    CompilerInput input = new CompilerInput() {
      @Override
      public String getName() {
        return "test-input.js";
      }
    };
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("nonNullInput");
    globalScope.declare("nonNullInput", nameNode, null, input);
    Var var = globalScope.getVar("nonNullInput");
    assertEquals("test-input.js", var.getInputName());
  }

  @Test
  public void testVarGetJSDocInfo() {
    JSDocInfo.Builder builder = new JSDocInfo.Builder(true);
    JSDocInfo info = builder.build();
    Node nameNode = new Node(Token.NAME, 0, 0);
    nameNode.setString("withDoc");
    nameNode.setJSDocInfo(info);
    globalScope.declare("withDoc", nameNode, null, null);
    Var var = globalScope.getVar("withDoc");
    assertSame(info, var.getJSDocInfo());
  }

  @Test
  public void testVarIsBleedingFunction() {
    Node functionExpr = new Node(Token.FUNCTION);
    Node nameNode = new Node(Token.NAME);
    nameNode.setString("bleed");
    functionExpr.addChildToBack(nameNode);
    globalScope.declare("bleed", nameNode, null, null);
    Var var = globalScope.getVar("bleed");
    assertTrue(var.isBleedingFunction());
  }

  @Test
  public void testVarIsNotBleedingFunction() {
    Node nameNode = new Node(Token.NAME);
    nameNode.setString("notBleed");
    Node varNode = new Node(Token.VAR);
    varNode.addChildToBack(nameNode);
    globalScope.declare("notBleed", nameNode, null, null);
    Var var = globalScope.getVar("notBleed");
    assertFalse(var.isBleedingFunction());
  }

  @Test
  public void testDeclareMultipleVars() {
    globalScope.declare("a", new Node(Token.NAME), null, null);
    globalScope.declare("b", new Node(Token.NAME), null, null);
    assertEquals(2, globalScope.getVarCount());
    assertNotNull(globalScope.getVar("a"));
    assertNotNull(globalScope.getVar("b"));
  }

  @Test
  public void testGetVarsIndexOrder() {
    globalScope.declare("first", new Node(Token.NAME), null, null);
    globalScope.declare("second", new Node(Token.NAME), null, null);
    globalScope.declare("third", new Node(Token.NAME), null, null);

    Iterator<Var> it = globalScope.getVars();
    Var first = it.next();
    assertEquals("first", first.getName());
    assertEquals(0, first.index);
    Var second = it.next();
    assertEquals("second", second.getName());
    assertEquals(1, second.index);
    Var third = it.next();
    assertEquals("third", third.getName());
    assertEquals(2, third.index);
  }

  @Test
  public void testGetArgumentsVarType() {
    Var args = functionScope.getArgumentsVar();
    assertFalse(args.isTypeInferred());
    assertNull(args.getType());
  }

  @Test
  public void testArgumentsVarIsLocal() {
    Var args = functionScope.getArgumentsVar();
    assertTrue(args.isLocal());
    assertFalse(args.isGlobal());
  }

  @Test
  public void testArgumentsVarIsNotDefine() {
    Var args = functionScope.getArgumentsVar();
    assertFalse(args.isDefine());
  }

  @Test
  public void testArgumentsVarGetInputName() {
    Var args = functionScope.getArgumentsVar();
    assertEquals("<non-file>", args.getInputName());
  }

  @Test
  public void testArgumentsVarNotExtern() {
    Var args = functionScope.getArgumentsVar();
    assertFalse(args.isExtern());
  }

  @Test
  public void testArgumentsVarGetDeclaration() {
    Var args = functionScope.getArgumentsVar();
    assertNull(args.getDeclaration());
  }

  @Test
  public void testArgumentsVarGetNode() {
    Var args = functionScope.getArgumentsVar();
    assertNull(args.getNode());
  }

  @Test
  public void testArgumentsVarGetParentNode() {
    Var args = functionScope.getArgumentsVar();
    assertNull(args.getParentNode());
  }

  @Test
  public void testArgumentsVarHashCode() {
    Var args1 = functionScope.getArgumentsVar();
    Var args2 = new Scope.Arguments(functionScope);
    assertEquals(args1.hashCode(), args2.hashCode());
  }
}