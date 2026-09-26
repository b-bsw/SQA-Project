package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

public class ClosureCodingConventionTest {

  private final ClosureCodingConvention convention = new ClosureCodingConvention();

  @Test
  public void testExportConstants() {
    assertEquals("goog.exportProperty", convention.getExportPropertyFunction());
    assertEquals("goog.exportSymbol", convention.getExportSymbolFunction());
    assertEquals("goog.global", convention.getGlobalObject());
    assertEquals("goog.abstractMethod", convention.getAbstractMethodName());
  }

  @Test
  public void testIsPropertyTestFunction() {
    assertTrue(convention.isPropertyTestFunction(call("goog.isArray", name("x"))));
    assertFalse(convention.isPropertyTestFunction(call("goog.isArray2", name("x"))));
  }

  @Test
  public void testIsPropertyTestFunctionRejectsNonCall() {
    try {
      convention.isPropertyTestFunction(name("notCall"));
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      // expected
    }
  }

  @Test
  public void testGetAssertionFunctions() {
    Collection<CodingConvention.AssertionFunctionSpec> functions =
        convention.getAssertionFunctions();
    assertNotNull(functions);
    assertEquals(7, functions.size());
  }

  @Test
  public void testExtractClassNameFromProvide() {
    Node call = call("goog.provide", string("foo.Bar"));
    Node expr = exprCall(call);

    assertEquals("foo.Bar", convention.extractClassNameIfProvide(call, expr));
  }

  @Test
  public void testExtractClassNameFromProvideWrongFunction() {
    Node call = call("goog.require", string("foo.Bar"));
    Node expr = exprCall(call);

    assertNull(convention.extractClassNameIfProvide(call, expr));
  }

  @Test
  public void testExtractClassNameFromProvideNoArg() {
    Node call = call("goog.provide");
    Node expr = exprCall(call);

    assertNull(convention.extractClassNameIfProvide(call, expr));
  }

  @Test
  public void testIdentifyTypeDeclarationCall() {
    Node path = string("deps.js");
    Node provides = array(string("a.b"), string("c.d"));
    Node call = call("goog.addDependency", path, provides);

    List<String> expected = Arrays.asList("a.b", "c.d");
    assertEquals(expected, convention.identifyTypeDeclarationCall(call));
  }

  @Test
  public void testIdentifyTypeDeclarationCallNoArray() {
    Node path = string("deps.js");
    Node callback = string("notAnArray");
    Node call = call("goog.addDependency", path, callback);

    assertNull(convention.identifyTypeDeclarationCall(call));
  }

  @Test
  public void testIdentifyTypeDeclarationCallTooFewArgs() {
    Node call = call("goog.addDependency", string("deps.js"));
    assertNull(convention.identifyTypeDeclarationCall(call));
  }

  @Test
  public void testIdentifyTypeDeclarationCallWrongFunction() {
    Node call = call("goog.provide", string("deps.js"), array(string("a")));
    assertNull(convention.identifyTypeDeclarationCall(call));
  }

  @Test
  public void testGetSingletonGetterClassName() {
    assertEquals(
        "Foo",
        convention.getSingletonGetterClassName(
            call("goog.addSingletonGetter", qualifiedName("Foo"))));

    assertEquals(
        "Foo",
        convention.getSingletonGetterClassName(
            call("goog$addSingletonGetter", qualifiedName("Foo"))));

    assertNull(
        convention.getSingletonGetterClassName(
            call("goog.addSingletonGetter")));

    assertNull(
        convention.getSingletonGetterClassName(
            call("foo.addSingletonGetter", qualifiedName("Foo"))));
  }

  @Test
  public void testGetClassesDefinedByCall_InheritsDeprecated() {
    Node call = call("SubClass.inherits", name("SuperClass"));

    CodingConvention.SubclassRelationship relationship =
        convention.getClassesDefinedByCall(call);

    assertNotNull(relationship);
    assertEquals(CodingConvention.SubclassType.INHERITS, relationship.getType());
    assertEquals("SubClass", relationship.getSubclass().getQualifiedName());
    assertEquals("SuperClass", relationship.getSuperclass().getQualifiedName());
  }

  @Test
  public void testGetClassesDefinedByCall_GoogInherits() {
    Node call = call("goog.inherits", name("SubClass"), name("SuperClass"));

    CodingConvention.SubclassRelationship relationship =
        convention.getClassesDefinedByCall(call);

    assertNotNull(relationship);
    assertEquals(CodingConvention.SubclassType.INHERITS, relationship.getType());
    assertEquals("SubClass", relationship.getSubclass().getQualifiedName());
    assertEquals("SuperClass", relationship.getSuperclass().getQualifiedName());
  }

  @Test
  public void testGetClassesDefinedByCall_GoogDollarInherits() {
    Node call = call("goog$inherits", name("SubClass"), name("SuperClass"));

    CodingConvention.SubclassRelationship relationship =
        convention.getClassesDefinedByCall(call);

    assertNotNull(relationship);
    assertEquals(CodingConvention.SubclassType.INHERITS, relationship.getType());
  }

  @Test
  public void testGetClassesDefinedByCall_MixinDeprecated() {
    Node call = call("SubClass.mixin", qualifiedName("SuperClass.prototype"));

    CodingConvention.SubclassRelationship relationship =
        convention.getClassesDefinedByCall(call);

    assertNotNull(relationship);
    assertEquals(CodingConvention.SubclassType.MIXIN, relationship.getType());
  }

  @Test
  public void testGetClassesDefinedByCall_GoogMixin() {
    Node call =
        call(
            "goog.mixin",
            qualifiedName("SubClass.prototype"),
            qualifiedName("SuperClass.prototype"));

    CodingConvention.SubclassRelationship relationship =
        convention.getClassesDefinedByCall(call);

    assertNotNull(relationship);
    assertEquals(CodingConvention.SubclassType.MIXIN, relationship.getType());
  }

  @Test
  public void testGetClassesDefinedByCall_Invalid() {
    assertNull(
        convention.getClassesDefinedByCall(
            call("goog.inherits", name("A"), name("B"), name("C"))));

    assertNull(
        convention.getClassesDefinedByCall(
            call("goog.foo", name("A"), name("B"))));

    assertNull(
        convention.getClassesDefinedByCall(
            call("goog.mixin", name("A"), name("B"))));
  }

  @Test
  public void testGetObjectLiteralCast() {
    Node objectLit = new Node(Token.OBJECTLIT);
    Node call =
        call("goog.reflect.object", qualifiedName("Foo"), objectLit);

    assertNotNull(convention.getObjectLiteralCast(null, call));
  }

  @Test
  public void testGetObjectLiteralCast_NoTypeName() {
    Node call =
        call("goog.reflect.object", string("notAType"), new Node(Token.OBJECTLIT));

    assertNull(convention.getObjectLiteralCast(null, call));
  }

  @Test
  public void testGetObjectLiteralCast_WrongFunction() {
    Node call =
        call("goog.notReflect", qualifiedName("Foo"), new Node(Token.OBJECTLIT));

    assertNull(convention.getObjectLiteralCast(null, call));
  }

  private static Node call(String qname, Node... args) {
    Node callee = qualifiedName(qname);
    Node call = new Node(Token.CALL);
    call.addChildToBack(callee);
    for (Node arg : args) {
      call.addChildToBack(arg);
    }
    return call;
  }

  private static Node qualifiedName(String name) {
    String[] parts = name.split("\\.");
    Node node = new Node(Token.NAME, parts[0]);
    for (int i = 1; i < parts.length; i++) {
      Node prop = new Node(Token.STRING, parts[i]);
      node = new Node(Token.GETPROP, node, prop);
    }
    return node;
  }

  private static Node name(String value) {
    return new Node(Token.NAME, value);
  }

  private static Node string(String value) {
    return new Node(Token.STRING, value);
  }

  private static Node exprCall(Node call) {
    Node expr = new Node(Token.EXPR_RESULT);
    expr.addChildToBack(call);
    return expr;
  }

  private static Node array(Node... children) {
    Node array = new Node(Token.ARRAYLIT);
    for (Node child : children) {
      array.addChildToBack(child);
    }
    return array;
  }
}