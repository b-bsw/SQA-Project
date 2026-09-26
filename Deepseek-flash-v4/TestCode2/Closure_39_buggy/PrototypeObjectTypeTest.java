package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class PrototypeObjectTypeTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new TestErrorReporter());
  }

  private static class TestErrorReporter implements ErrorReporter {
    @Override
    public void warning(String message, String sourceName, int line, int lineOffset) {
    }

    @Override
    public void error(String message, String sourceName, int line, int lineOffset) {
    }
  }

  private PrototypeObjectType createType(
      String className, ObjectType implicitPrototype, boolean nativeType) {
    return new PrototypeObjectType(registry, className, implicitPrototype, nativeType);
  }

  private JSType numberType() {
    return registry.getNativeType(JSTypeNative.NUMBER_TYPE);
  }

  @Test
  public void testGetSlotUsesPrototypeChain() {
    PrototypeObjectType parent = createType("Parent", null, true);
    PrototypeObjectType child = createType("Child", parent, false);
    JSType numberType = numberType();

    assertTrue(parent.defineProperty("x", numberType, false, null));
    assertTrue(child.defineProperty("y", numberType, false, null));

    assertNotNull(parent.getSlot("x"));
    assertNotNull(child.getSlot("x"));
    assertNotNull(child.getSlot("y"));
    assertNull(child.getSlot("missing"));
  }

  @Test
  public void testGetPropertiesCountIncludesInherited() {
    PrototypeObjectType parent = createType("Parent", null, true);
    PrototypeObjectType child = createType("Child", parent, false);
    JSType numberType = numberType();

    assertTrue(parent.defineProperty("x", numberType, false, null));
    assertTrue(child.defineProperty("y", numberType, false, null));

    assertEquals(1, parent.getPropertiesCount());
    assertEquals(2, child.getPropertiesCount());
  }

  @Test
  public void testHasPropertyUsesPrototypeChain() {
    PrototypeObjectType parent = createType("Parent", null, true);
    PrototypeObjectType child = createType("Child", parent, false);
    JSType numberType = numberType();

    assertTrue(parent.defineProperty("x", numberType, false, null));
    assertTrue(child.defineProperty("y", numberType, false, null));

    assertTrue(parent.hasProperty("x"));
    assertTrue(child.hasProperty("x"));
    assertTrue(child.hasProperty("y"));
    assertFalse(child.hasProperty("missing"));
  }

  @Test
  public void testHasOwnPropertyDoesNotUsePrototypeChain() {
    PrototypeObjectType parent = createType("Parent", null, true);
    PrototypeObjectType child = createType("Child", parent, false);
    JSType numberType = numberType();

    assertTrue(parent.defineProperty("x", numberType, false, null));
    assertTrue(child.defineProperty("y", numberType, false, null));

    assertTrue(parent.hasOwnProperty("x"));
    assertFalse(child.hasOwnProperty("x"));
    assertTrue(child.hasOwnProperty("y"));
  }

  @Test
  public void testGetOwnPropertyNames() {
    PrototypeObjectType parent = createType("Parent", null, true);
    PrototypeObjectType child = createType("Child", parent, false);
    JSType numberType = numberType();

    assertTrue(parent.defineProperty("x", numberType, false, null));
    assertTrue(child.defineProperty("y", numberType, false, null));

    assertTrue(parent.getOwnPropertyNames().contains("x"));
    assertFalse(parent.getOwnPropertyNames().contains("y"));
    assertTrue(child.getOwnPropertyNames().contains("y"));
    assertFalse(child.getOwnPropertyNames().contains("x"));
  }

  @Test
  public void testIsPropertyTypeDeclared() {
    PrototypeObjectType parent = createType("Parent", null, true);
    JSType numberType = numberType();

    assertTrue(parent.defineProperty("declared", numberType, false, null));
    assertTrue(parent.defineProperty("inferred", numberType, true, null));

    assertTrue(parent.isPropertyTypeDeclared("declared"));
    assertFalse(parent.isPropertyTypeDeclared("inferred"));
    assertFalse(parent.isPropertyTypeDeclared("missing"));
  }

  @Test
  public void testCollectPropertyNamesIncludesPrototype() {
    PrototypeObjectType parent = createType("Parent", null, true);
    PrototypeObjectType child = createType("Child", parent, false);
    JSType numberType = numberType();

    assertTrue(parent.defineProperty("x", numberType, false, null));
    assertTrue(child.defineProperty("y", numberType, false, null));

    Set<String> names = new HashSet<String>();
    child.collectPropertyNames(names);

    assertTrue(names.contains("x"));
    assertTrue(names.contains("y"));
  }

  @Test
  public void testGetPropertyTypeForExistingProperty() {
    PrototypeObjectType parent = createType("Parent", null, true);
    JSType numberType = numberType();

    assertTrue(parent.defineProperty("x", numberType, false, null));

    assertSame(numberType, parent.getPropertyType("x"));
    assertNotNull(parent.getPropertyType("missing"));
  }

  @Test
  public void testRemoveProperty() {
    PrototypeObjectType parent = createType("Parent", null, true);
    JSType numberType = numberType();

    assertTrue(parent.defineProperty("x", numberType, false, null));
    assertTrue(parent.removeProperty("x"));
    assertNull(parent.getSlot("x"));
    assertFalse(parent.removeProperty("x"));
  }

  @Test
  public void testGetPropertyNodeUsesPrototypeChain() {
    PrototypeObjectType parent = createType("Parent", null, true);
    PrototypeObjectType child = createType("Child", parent, false);
    JSType numberType = numberType();
    Node node = new Node(Token.NAME);

    assertTrue(parent.defineProperty("x", numberType, false, node));

    assertSame(node, parent.getPropertyNode("x"));
    assertSame(node, child.getPropertyNode("x"));
    assertNull(parent.getPropertyNode("missing"));
  }

  @Test
  public void testIsPropertyInExterns() {
    PrototypeObjectType parent = createType("Parent", null, true);
    PrototypeObjectType child = createType("Child", parent, false);
    JSType numberType = numberType();

    assertTrue(parent.defineProperty("x", numberType, false, null));
    assertTrue(child.defineProperty("y", numberType, false, null));

    assertFalse(parent.isPropertyInExterns("x"));
    assertFalse(child.isPropertyInExterns("x"));
    assertFalse(child.isPropertyInExterns("missing"));
  }

  @Test
  public void testSetPropertyJSDocInfoOnExistingAndMissing() {
    PrototypeObjectType parent = createType("Parent", null, true);
    JSType numberType = numberType();
    assertTrue(parent.defineProperty("x", numberType, false, null));

    JSDocInfo info = new JSDocInfo();
    parent.setPropertyJSDocInfo("x", info);
    assertSame(info, parent.getOwnPropertyJSDocInfo("x"));

    parent.setPropertyJSDocInfo("missing", info);
    assertTrue(parent.hasOwnProperty("missing"));
    assertSame(info, parent.getOwnPropertyJSDocInfo("missing"));
  }

  @Test
  public void testMatchesNumberAndStringContext() {
    PrototypeObjectType plain = createType("Plain", null, true);
    assertFalse(plain.matchesNumberContext());
    assertFalse(plain.matchesStringContext());

    PrototypeObjectType numberObject =
        new PrototypeObjectType(registry, "NumberObject", null, true) {
          @Override
          public boolean isNumberObjectType() {
            return true;
          }
        };
    assertTrue(numberObject.matchesNumberContext());

    PrototypeObjectType stringObject =
        new PrototypeObjectType(registry, "StringObject", null, true) {
          @Override
          public boolean isStringObjectType() {
            return true;
          }
        };
    assertTrue(stringObject.matchesStringContext());
  }

  @Test
  public void testCanBeCalledForRegexp() {
    PrototypeObjectType regexp =
        new PrototypeObjectType(registry, "Regexp", null, true) {
          @Override
          public boolean isRegexpType() {
            return true;
          }
        };
    assertTrue(regexp.canBeCalled());

    PrototypeObjectType nonRegexp = createType("NonRegexp", null, true);
    assertFalse(nonRegexp.canBeCalled());
  }

  @Test
  public void testIsNativeObjectType() {
    PrototypeObjectType parent = createType("Parent", null, true);
    PrototypeObjectType child = createType("Child", parent, false);

    assertTrue(parent.isNativeObjectType());
    assertFalse(child.isNativeObjectType());
  }

  @Test
  public void testGetImplicitPrototype() {
    PrototypeObjectType parent = createType("Parent", null, true);
    PrototypeObjectType child = createType("Child", parent, false);

    assertNull(parent.getImplicitPrototype());
    assertSame(parent, child.getImplicitPrototype());
  }

  @Test
  public void testToStringHelper() {
    PrototypeObjectType plain = createType(null, null, true);
    assertEquals("{...}", plain.toStringHelper(false));

    PrototypeObjectType named = createType("Named", null, true);
    assertEquals("Named", named.toStringHelper(false));
  }
}