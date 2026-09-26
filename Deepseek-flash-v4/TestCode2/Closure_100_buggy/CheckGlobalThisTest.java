package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class CheckGlobalThisTest {

  private TestCompiler compiler;
  private CheckGlobalThis check;
  private NodeTraversal traversal;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    traversal = new NodeTraversal(compiler, check);
  }

  @Test
  public void shouldTraverse_returnsFalseForConstructorFunctions() {
    Node fn = new Node(Token.FUNCTION);
    fn.setJSDocInfo(jsDoc(true, false));

    assertFalse(check.shouldTraverse(traversal, fn, null));
  }

  @Test
  public void shouldTraverse_returnsFalseForThisTypeFunctions() {
    Node fn = new Node(Token.FUNCTION);
    fn.setJSDocInfo(jsDoc(false, true));

    assertFalse(check.shouldTraverse(traversal, fn, null));
  }

  @Test
  public void shouldTraverse_returnsFalseForPrototypeAssignedFunctions() {
    Node fn = new Node(Token.FUNCTION);

    Node name = new Node(Token.NAME, "Foo");
    Node proto = new Node(Token.STRING, "prototype");
    Node lhs = new Node(Token.GETPROP, name, proto);
    Node assign = new Node(Token.ASSIGN, lhs, fn);

    assertFalse(check.shouldTraverse(traversal, fn, assign));
  }

  @Test
  public void shouldTraverse_returnsTrueForNormalFunctions() {
    Node fn = new Node(Token.FUNCTION);
    Node name = new Node(Token.NAME, "f");
    Node var = new Node(Token.VAR, name);
    name.addChildToBack(fn);

    assertTrue(check.shouldTraverse(traversal, fn, name));
  }

  @Test
  public void reportsGlobalThisInSimpleAssignment() {
    Node thisNode = new Node(Token.THIS);
    Node prop = new Node(Token.STRING, "x");
    Node getProp = new Node(Token.GETPROP, thisNode, prop);
    Node assign = new Node(Token.ASSIGN, getProp, new Node(Token.NUMBER));

    traversal.traverse(assign);

    assertEquals("expected one reported diagnostic", 1, compiler.reported.size());
  }

  private static JSDocInfo jsDoc(boolean isConstructor, boolean hasThisType) {
    JSDocInfo info = new JSDocInfo();
    setBooleanField(info, "isConstructor", isConstructor, new String[] {"isConstructor", "constructor"});
    setBooleanField(info, "hasThisType", hasThisType, new String[] {"hasThisType", "thisType"});
    return info;
  }

  private static void setBooleanField(
      Object target, String primaryName, boolean value, String[] alternateNames) {
    Field field = findField(target.getClass(), primaryName);
    if (field == null) {
      for (String name : alternateNames) {
        field = findField(target.getClass(), name);
        if (field != null) {
          break;
        }
      }
    }

    if (field == null) {
      throw new IllegalStateException("Unable to find JSDocInfo boolean field for " + primaryName);
    }

    try {
      field.setAccessible(true);
      field.setBoolean(target, value);
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }

  private static Field findField(Class<?> clazz, String name) {
    while (clazz != null) {
      try {
        return clazz.getDeclaredField(name);
      } catch (NoSuchFieldException e) {
        clazz = clazz.getSuperclass();
      }
    }
    return null;
  }

  private static class TestCompiler extends Compiler {
    private final List<JSError> reported = new ArrayList<>();

    @Override
    public void report(JSError error) {
      reported.add(error);
    }
  }
}