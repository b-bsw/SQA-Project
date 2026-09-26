package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

public class TypeValidatorTest {

  private TypeValidator validator;
  private JSTypeRegistry registry;
  private JSType number;
  private JSType string;
  private JSType bool;
  private JSType object;
  private JSType array;
  private JSType voidType;

  @Before
  public void setUp() {
    Compiler compiler = new Compiler();
    registry = compiler.getTypeRegistry();
    validator = new TypeValidator(compiler);
    validator.setShouldReport(false);

    number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    string = registry.getNativeType(JSTypeNative.STRING_TYPE);
    bool = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    object = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    array = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
    voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
  }

  private int mismatchCount() {
    int count = 0;
    for (Object unused : validator.getMismatches()) {
      count++;
    }
    return count;
  }

  @Test
  public void expectObjectAcceptsObjectTypes() {
    assertTrue(validator.expectObject(null, null, object, "object"));
    assertTrue(validator.expectObject(null, null, array, "array"));
    assertEquals(0, mismatchCount());
  }

  @Test
  public void expectObjectRejectsNonObjectType() {
    assertFalse(validator.expectObject(null, null, voidType, "void"));
    assertEquals(1, mismatchCount());
  }

  @Test
  public void expectActualObjectAcceptsObjectType() {
    validator.expectActualObject(null, null, object, "object");
    assertEquals(0, mismatchCount());
  }

  @Test
  public void expectActualObjectRejectsNonObjectType() {
    validator.expectActualObject(null, null, voidType, "void");
    assertEquals(1, mismatchCount());
  }

  @Test
  public void expectAnyObjectAcceptsObjectType() {
    validator.expectAnyObject(null, null, object, "object");
    assertEquals(0, mismatchCount());
  }

  @Test
  public void expectAnyObjectRejectsNonObjectType() {
    validator.expectAnyObject(null, null, voidType, "void");
    assertEquals(1, mismatchCount());
  }

  @Test
  public void mismatchesAreAccumulatedAcrossCalls() {
    validator.expectObject(null, null, voidType, "first");
    validator.expectActualObject(null, null, voidType, "second");
    validator.expectAnyObject(null, null, voidType, "third");

    assertEquals(3, mismatchCount());
  }

  @Test
  public void typeMismatchEqualityIgnoresFieldOrder() {
    TypeValidator.TypeMismatch a = new TypeValidator.TypeMismatch(number, string);
    TypeValidator.TypeMismatch b = new TypeValidator.TypeMismatch(string, number);

    assertEquals(a, b);
    assertEquals(b, a);
    assertEquals(a.hashCode(), b.hashCode());
  }

  @Test
  public void typeMismatchEqualityRejectsDifferentTypes() {
    TypeValidator.TypeMismatch a = new TypeValidator.TypeMismatch(number, string);
    TypeValidator.TypeMismatch b = new TypeValidator.TypeMismatch(number, bool);

    assertFalse(a.equals(b));
    assertFalse(b.equals(a));
  }

  @Test
  public void typeMismatchEqualityRejectsNullAndNonMismatch() {
    TypeValidator.TypeMismatch a = new TypeValidator.TypeMismatch(number, string);

    assertFalse(a.equals(null));
    assertFalse(a.equals(new Object()));
  }

  @Test
  public void typeMismatchToStringIncludesBothTypes() {
    TypeValidator.TypeMismatch a = new TypeValidator.TypeMismatch(number, string);

    assertNotNull(a.toString());
    assertEquals("(" + number + ", " + string + ")", a.toString());
  }

  @Test(expected = NullPointerException.class)
  public void expectObjectRejectsNullType() {
    validator.expectObject(null, null, null, "null");
  }
}