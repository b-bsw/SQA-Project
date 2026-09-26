package com.google.javascript.jscomp.type;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.DefaultCodingConvention;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

public class ChainableReverseAbstractInterpreterTest {

  private JSTypeRegistry registry;
  private CodingConvention convention;
  private TestInterpreter interpreter;

  @Before
  public void setUp() {
    convention = new DefaultCodingConvention();
    registry = new JSTypeRegistry(convention);
    interpreter = new TestInterpreter(convention, registry);
  }

  @Test
  public void constructorInitializesFirstLinkToThis() {
    assertSame(interpreter, interpreter.getFirst());
  }

  @Test(expected = NullPointerException.class)
  public void constructorRejectsNullConvention() {
    new TestInterpreter(null, registry);
  }

  @Test
  public void appendReturnsAppendedLinkAndUpdatesFirstLink() {
    TestInterpreter second = new TestInterpreter(convention, registry);
    TestInterpreter third = new TestInterpreter(convention, registry);

    assertSame(second, interpreter.append(second));
    assertSame(interpreter, second.getFirst());

    interpreter.append(second).append(third);
    assertSame(interpreter, third.getFirst());
  }

  @Test
  public void restrictedTypeOfNullTypeUsesJavaScriptTypeOfMapping() {
    JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

    assertSame(number, interpreter.getRestrictedByTypeOfResult(null, "number", true));
    assertSame(unknown, interpreter.getRestrictedByTypeOfResult(null, "not-a-typeof", true));
  }

  @Test
  public void numberTypeIsRestrictedByTypeOfMatchAndMismatch() {
    JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    assertSame(number, interpreter.getRestrictedByTypeOfResult(number, "number", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(number, "number", false));

    assertSame(number, interpreter.getRestrictedByTypeOfResult(number, "string", false));
    assertNull(interpreter.getRestrictedByTypeOfResult(number, "string", true));
  }

  @Test
  public void stringTypeIsRestrictedByTypeOfMatchAndMismatch() {
    JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);

    assertSame(string, interpreter.getRestrictedByTypeOfResult(string, "string", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(string, "string", false));

    assertSame(string, interpreter.getRestrictedByTypeOfResult(string, "number", false));
    assertNull(interpreter.getRestrictedByTypeOfResult(string, "number", true));
  }

  @Test
  public void booleanTypeIsRestrictedByTypeOfMatchAndMismatch() {
    JSType bool = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);

    assertSame(bool, interpreter.getRestrictedByTypeOfResult(bool, "boolean", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(bool, "boolean", false));

    assertSame(bool, interpreter.getRestrictedByTypeOfResult(bool, "string", false));
    assertNull(interpreter.getRestrictedByTypeOfResult(bool, "string", true));
  }

  @Test
  public void undefinedTypeIsRestrictedByTypeOfMatchAndMismatch() {
    JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);

    assertSame(voidType, interpreter.getRestrictedByTypeOfResult(voidType, "undefined", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(voidType, "undefined", false));

    assertSame(voidType, interpreter.getRestrictedByTypeOfResult(voidType, "number", false));
    assertNull(interpreter.getRestrictedByTypeOfResult(voidType, "number", true));
  }

  @Test
  public void nullTypeIsRestrictedUsingObjectTypeOf() {
    JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);

    assertSame(nullType, interpreter.getRestrictedByTypeOfResult(nullType, "object", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(nullType, "object", false));
  }

  @Test
  public void unknownTypeRemainsUnknownRegardlessOfTypeOf() {
    JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

    assertSame(unknown, interpreter.getRestrictedByTypeOfResult(unknown, "number", true));
    assertSame(unknown, interpreter.getRestrictedByTypeOfResult(unknown, "number", false));
  }

  @Test
  public void unrecognizedTypeOfReturnsNullForKnownActualType() {
    JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    assertNull(interpreter.getRestrictedByTypeOfResult(number, "not-a-typeof", true));
    assertNotNull(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
  }

  private static class TestInterpreter extends ChainableReverseAbstractInterpreter {
    TestInterpreter(CodingConvention convention, JSTypeRegistry registry) {
      super(convention, registry);
    }
  }
}