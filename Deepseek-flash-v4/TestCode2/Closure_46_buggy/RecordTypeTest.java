package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.ErrorReporter;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class RecordTypeTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {
      }

      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {
      }
    });
  }

  private JSType numberType() {
    return registry.getNativeType(JSTypeNative.NUMBER_TYPE);
  }

  private JSType stringType() {
    return registry.getNativeType(JSTypeNative.STRING_TYPE);
  }

  private RecordType record(String prop, JSType type) {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty(prop, type, null);
    return (RecordType) builder.build();
  }

  private RecordType record(String prop1, JSType type1, String prop2, JSType type2) {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty(prop1, type1, null);
    builder.addProperty(prop2, type2, null);
    return (RecordType) builder.build();
  }

  @Test
  public void testConstructorRejectsNullRecordProperty() {
    Map<String, RecordTypeBuilder.RecordProperty> props = new HashMap<>();
    props.put("x", null);

    try {
      new RecordType(registry, props);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      assertEquals(
          "RecordProperty associated with a property should not be null!",
          e.getMessage());
    }
  }

  @Test
  public void testIsEquivalentToSameInstance() {
    RecordType type = record("x", numberType());
    assertTrue(type.isEquivalentTo(type));
  }

  @Test
  public void testIsEquivalentToEquivalentRecord() {
    RecordType a = record("x", numberType());
    RecordType b = record("x", numberType());
    assertTrue(a.isEquivalentTo(b));
    assertTrue(b.isEquivalentTo(a));
  }

  @Test
  public void testIsEquivalentToNonRecord() {
    RecordType a = record("x", numberType());
    assertFalse(a.isEquivalentTo(numberType()));
  }

  @Test
  public void testIsEquivalentToDifferentPropertyNames() {
    RecordType a = record("x", numberType());
    RecordType b = record("y", numberType());
    assertFalse(a.isEquivalentTo(b));
  }

  @Test
  public void testIsEquivalentToDifferentPropertyTypes() {
    RecordType a = record("x", numberType());
    RecordType b = record("x", stringType());
    assertFalse(a.isEquivalentTo(b));
  }

  @Test
  public void testGetImplicitPrototypeIsNativeObjectType() {
    RecordType recordType = record("x", numberType());
    assertSame(
        registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE),
        recordType.getImplicitPrototype());
  }

  @Test
  public void testDefinePropertyAfterConstructionIsRejected() {
    RecordType recordType = record("x", numberType());
    assertFalse(recordType.defineProperty("y", stringType(), false, null));
    assertFalse(recordType.hasProperty("y"));
  }

  @Test
  public void testGetLeastSupertypeWithSharedProperty() {
    RecordType a = record("x", numberType());
    RecordType b = record("x", numberType());

    JSType result = a.getLeastSupertype(b);

    assertTrue(result.isRecordType());
    RecordType resultRecord = result.toMaybeRecordType();
    assertTrue(resultRecord.hasProperty("x"));
  }

  @Test
  public void testGetLeastSupertypeWithNoSharedProperty() {
    RecordType a = record("x", numberType());
    RecordType b = record("y", stringType());

    JSType result = a.getLeastSupertype(b);

    assertTrue(result.isRecordType());
    RecordType resultRecord = result.toMaybeRecordType();
    assertFalse(resultRecord.hasProperty("x"));
    assertFalse(resultRecord.hasProperty("y"));
  }

  @Test
  public void testGetGreatestSubtypeHelperWithConflictingPropertyType() {
    RecordType a = record("x", numberType());
    RecordType b = record("x", stringType());

    JSType result = a.getGreatestSubtypeHelper(b);

    assertSame(registry.getNativeObjectType(JSTypeNative.NO_TYPE), result);
  }

  @Test
  public void testGetGreatestSubtypeHelperWithDisjointProperties() {
    RecordType a = record("x", numberType());
    RecordType b = record("y", stringType());

    JSType result = a.getGreatestSubtypeHelper(b);

    assertTrue(result.isRecordType());
    RecordType resultRecord = result.toMaybeRecordType();
    assertTrue(resultRecord.hasProperty("x"));
    assertTrue(resultRecord.hasProperty("y"));
  }

  @Test
  public void testIsSubtypeWithSupersetOfProperties() {
    RecordType sub = record("x", numberType(), "y", stringType());
    RecordType sup = record("x", numberType());

    assertTrue(sub.isSubtype(sup));
  }

  @Test
  public void testIsSubtypeWhenPropertyMissing() {
    RecordType sub = record("x", numberType());
    RecordType sup = record("y", numberType());

    assertFalse(sub.isSubtype(sup));
  }

  @Test
  public void testIsSubtypeWhenPropertyTypeMismatches() {
    RecordType sub = record("x", stringType());
    RecordType sup = record("x", numberType());

    assertFalse(sub.isSubtype(sup));
  }

  @Test
  public void testIsSubtypeOfNativeObjectType() {
    RecordType recordType = record("x", numberType());
    JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);

    assertTrue(recordType.isSubtype(objectType));
  }

  @Test
  public void testStaticIsSubtypeStructurally() {
    RecordType sub = record("x", numberType(), "y", stringType());
    RecordType sup = record("x", numberType());

    assertTrue(RecordType.isSubtype(sub, sup));
  }

  @Test
  public void testStaticIsSubtypeWithMissingProperty() {
    RecordType sub = record("x", numberType());
    RecordType sup = record("y", numberType());

    assertFalse(RecordType.isSubtype(sub, sup));
  }
}