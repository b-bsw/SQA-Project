package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;

public class PrototypeObjectTypeTest {

  private JSTypeRegistry registry;
  private TestObjectType stubPrototype;
  private ErrorReporter testReporter;

  private static class TestErrorReporter implements ErrorReporter {
    @Override
    public void warning(String message, String sourceName, int line, int lineOffset) {}
    @Override
    public void error(String message, String sourceName, int line, int lineOffset) {}
  }

  // Minimal ObjectType stub for testing
  private static class TestObjectType extends ObjectType {
    private final Map<String, Property> props = new TreeMap<>();
    private ObjectType implicitPrototype;
    private final boolean nativeType;

    TestObjectType(JSTypeRegistry registry, boolean nativeType) {
      super(registry);
      this.nativeType = nativeType;
    }

    void setImplicitPrototype(ObjectType p) { this.implicitPrototype = p; }
    void addProperty(String name, Property prop) { props.put(name, prop); }

    @Override public Property getSlot(String name) { return props.get(name); }
    @Override public boolean hasProperty(String name) { return props.containsKey(name); }
    @Override public boolean hasOwnProperty(String name) { return props.containsKey(name); }
    @Override public Set<String> getOwnPropertyNames() { return props.keySet(); }
    @Override public int getPropertiesCount() { return props.size(); }
    @Override public ObjectType getImplicitPrototype() { return implicitPrototype; }
    @Override public boolean isNativeObjectType() { return nativeType; }
    @Override public boolean isFunctionType() { return false; }
    @Override public boolean isTheObjectType() { return false; }
    @Override public boolean isStringObjectType() { return false; }
    @Override public boolean isBooleanObjectType() { return false; }
    @Override public boolean isNumberObjectType() { return false; }
    @Override public boolean isDateType() { return false; }
    @Override public boolean isRegexpType() { return false; }
    @Override public boolean isArrayType() { return false; }
    @Override public boolean isRecordType() { return false; }
    @Override public boolean isUnionType() { return false; }
    @Override public RecordType toMaybeRecordType() { return null; }
    @Override public ObjectType toObjectType() { return this; }
    @Override public boolean isUnknownType() { return false; }
    @Override public JSType getPropertyType(String property) { return null; }
    @Override public boolean isPropertyInExterns(String propertyName) { return false; }
    @Override public Node getPropertyNode(String propertyName) { return null; }
    @Override public JSDocInfo getOwnPropertyJSDocInfo(String propertyName) { return null; }
    @Override public FunctionType getConstructor() { return null; }
    @Override public String getReferenceName() { return null; }
    @Override public boolean hasReferenceName() { return false; }
    @Override public boolean isSubtype(JSType that) { return false; }
    @Override void collectPropertyNames(Set<String> props) { props.addAll(this.props.keySet()); }
    @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
    @Override public boolean hasCachedValues() { return false; }
  }

  @Before
  public void setUp() {
    testReporter = new TestErrorReporter();
    registry = new JSTypeRegistry(testReporter);
    stubPrototype = new TestObjectType(registry, false);
  }

  @Test
  public void testConstructorWithExplicitPrototype() {
    TestObjectType proto = new TestObjectType(registry, false);
    PrototypeObjectType obj = new PrototypeObjectType(registry, "TestClass", proto);
    assertEquals("TestClass", obj.getReferenceName());
    assertSame(proto, obj.getImplicitPrototype());
    assertFalse(obj.isNativeObjectType());
    assertTrue(obj.hasReferenceName());
  }

  @Test
  public void testConstructorWithNullImplicitPrototype() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, null);
    assertNull(obj.getReferenceName());
    assertNull(obj.getClassName());
    assertNotNull(obj.getImplicitPrototype()); // default set
    assertFalse(obj.hasReferenceName());
  }

  @Test
  public void testConstructorNativeType() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Native", null, true);
    assertTrue(obj.isNativeObjectType());
  }

  @Test
  public void testDefinePropertyAndGetSlot() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    Node node = new Node(1); // dummy
    JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    boolean defined = obj.defineProperty("x", type, false, node);
    assertTrue(defined);

    Property slot = obj.getSlot("x");
    assertNotNull(slot);
    assertEquals("x", slot.getName());
    assertEquals(type, slot.getType());

    // duplicate returns false
    boolean dup = obj.defineProperty("x", type, false, node);
    assertFalse(dup);
  }

  @Test
  public void testHasPropertyAndHasOwnProperty() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    assertFalse(obj.hasProperty("x"));
    assertFalse(obj.hasOwnProperty("x"));

    obj.defineProperty("x", registry.getNativeType(JSTypeNative.VOID_TYPE), true, null);
    assertTrue(obj.hasProperty("x"));
    assertTrue(obj.hasOwnProperty("x"));
  }

  @Test
  public void testHasPropertyDelegatesToImplicitPrototype() {
    TestObjectType implicit = new TestObjectType(registry, false);
    implicit.addProperty("y", new Property("y", null, true, null));
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, implicit);
    // obj has own property "x"
    obj.defineProperty("x", null, true, null);
    assertTrue(obj.hasProperty("x"));
    assertTrue(obj.hasProperty("y"));
    assertFalse(obj.hasOwnProperty("y"));
  }

  @Test
  public void testRemoveProperty() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    obj.defineProperty("a", null, true, null);
    assertTrue(obj.removeProperty("a"));
    assertFalse(obj.hasProperty("a"));
    assertFalse(obj.removeProperty("nonexistent"));
  }

  @Test
  public void testGetPropertiesCountWithoutImplicitPrototype() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, null);
    obj.defineProperty("a", null, true, null);
    obj.defineProperty("b", null, true, null);
    assertEquals(2, obj.getPropertiesCount());
  }

  @Test
  public void testGetPropertiesCountWithImplicitPrototypeAndOverlap() {
    TestObjectType implicit = new TestObjectType(registry, false);
    implicit.addProperty("a", new Property("a", null, true, null));
    implicit.addProperty("b", new Property("b", null, true, null));
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, implicit);
    obj.defineProperty("a", null, true, null); // duplicate, should not be local count
    obj.defineProperty("c", null, true, null);
    // implicit has 2, local unique: only "c" (since "a" overlaps)
    assertEquals(3, obj.getPropertiesCount());
  }

  @Test
  public void testGetReferenceName() {
    PrototypeObjectType withClass = new PrototypeObjectType(registry, "MyClass", stubPrototype);
    assertEquals("MyClass", withClass.getReferenceName());

    PrototypeObjectType without = new PrototypeObjectType(registry, null, stubPrototype);
    assertNull(without.getReferenceName());

    // test with ownerFunction
    PrototypeObjectType funcProto = new PrototypeObjectType(registry, null, stubPrototype);
    FunctionType owner = registry.createFunctionType(null, null, null, null, null);
    funcProto.setOwnerFunction(owner);
    // owner.getReferenceName() may be null, so reference will be null.prototype
    assertTrue(funcProto.hasReferenceName());
    assertNotNull(funcProto.getReferenceName());
    assertTrue(funcProto.getReferenceName().endsWith(".prototype"));
  }

  @Test
  public void testHasReferenceName() {
    PrototypeObjectType withClass = new PrototypeObjectType(registry, "X", stubPrototype);
    assertTrue(withClass.hasReferenceName());

    PrototypeObjectType without = new PrototypeObjectType(registry, null, stubPrototype);
    assertFalse(without.hasReferenceName());
  }

  @Test
  public void testToStringHelperWithoutReferenceNameAndNotPretty() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    assertEquals("{...}", obj.toStringHelper(false));
    assertEquals("?", obj.toStringHelper(true));
  }

  @Test
  public void testToStringHelperWithReferenceName() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "RefClass", stubPrototype);
    assertEquals("RefClass", obj.toStringHelper(false));
    assertEquals("RefClass", obj.toStringHelper(true));
  }

  @Test
  public void testToStringHelperPrettyPrint() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    obj.setPrettyPrint(true);
    // At this point it should show empty properties
    assertEquals("{}", obj.toStringHelper(false));
    // add some properties
    obj.defineProperty("p1", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    obj.defineProperty("p2", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    String result = obj.toStringHelper(false);
    assertTrue(result.startsWith("{"));
    assertTrue(result.endsWith("}"));
    assertTrue(result.contains("p1"));
    assertTrue(result.contains("p2"));
  }

  @Test
  public void testSetAndIsPrettyPrint() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    assertFalse(obj.isPrettyPrint());
    obj.setPrettyPrint(true);
    assertTrue(obj.isPrettyPrint());
  }

  @Test
  public void testSetImplicitPrototype() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    TestObjectType newProto = new TestObjectType(registry, false);
    obj.setImplicitPrototype(newProto);
    assertSame(newProto, obj.getImplicitPrototype());
  }

  @Test
  public void testGetConstructorReturnsNull() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    assertNull(obj.getConstructor());
  }

  @Test
  public void testGetOwnerFunction() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    assertNull(obj.getOwnerFunction());
    FunctionType fn = registry.createFunctionType(null, null, null, null, null);
    obj.setOwnerFunction(fn);
    assertSame(fn, obj.getOwnerFunction());
  }

  @Test
  public void testIsNativeObjectType() {
    PrototypeObjectType notNative = new PrototypeObjectType(registry, null, stubPrototype, false);
    assertFalse(notNative.isNativeObjectType());
    PrototypeObjectType nativeType = new PrototypeObjectType(registry, null, stubPrototype, true);
    assertTrue(nativeType.isNativeObjectType());
  }

  @Test
  public void testMatchesNumberContext() {
    // Without overridden valueOf, a normal object does not match
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    assertFalse(obj.matchesNumberContext());
    // Test with date type (but we need a date type; we can use registry)
    ObjectType dateType = registry.getNativeObjectType(JSTypeNative.DATE_TYPE);
    // We cannot easily make obj be a date type, but we can test branch coverage
  }

  @Test
  public void testMatchesStringContext() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    assertFalse(obj.matchesStringContext());
  }

  @Test
  public void testMatchesObjectContext() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    assertTrue(obj.matchesObjectContext());
  }

  @Test
  public void testCanBeCalledReturnsFalseForNonRegexp() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    assertFalse(obj.canBeCalled());
  }

  @Test
  public void testGetOwnPropertyNames() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    assertEquals(0, obj.getOwnPropertyNames().size());
    obj.defineProperty("a", null, true, null);
    obj.defineProperty("b", null, true, null);
    Set<String> names = obj.getOwnPropertyNames();
    assertEquals(2, names.size());
    assertTrue(names.contains("a"));
    assertTrue(names.contains("b"));
  }

  @Test
  public void testIsPropertyTypeDeclared() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    obj.defineProperty("dec", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    obj.defineProperty("inf", null, true, null);
    assertTrue(obj.isPropertyTypeDeclared("dec"));
    assertFalse(obj.isPropertyTypeDeclared("inf"));
    assertFalse(obj.isPropertyTypeDeclared("nonexistent"));
  }

  @Test
  public void testIsPropertyTypeInferred() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    obj.defineProperty("dec", null, false, null);
    obj.defineProperty("inf", null, true, null);
    assertFalse(obj.isPropertyTypeInferred("dec"));
    assertTrue(obj.isPropertyTypeInferred("inf"));
    assertFalse(obj.isPropertyTypeInferred("nonexistent"));
  }

  @Test
  public void testGetPropertyType() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    obj.defineProperty("num", type, false, null);
    assertEquals(type, obj.getPropertyType("num"));
    // non-existent property returns UNKNOWN_TYPE
    JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    assertEquals(unknown, obj.getPropertyType("missing"));
  }

  @Test
  public void testCollectPropertyNames() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    obj.defineProperty("a", null, true, null);
    Set<String> props = Sets.newTreeSet();
    obj.collectPropertyNames(props);
    assertTrue(props.contains("a"));
  }

  @Test
  public void testIsPropertyInExterns() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    assertFalse(obj.isPropertyInExterns("any"));
    // We cannot easily create a Property with fromExterns flag, but we can trust delegation
  }

  @Test
  public void testGetPropertyNode() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    assertNull(obj.getPropertyNode("x"));
  }

  @Test
  public void testGetOwnPropertyJSDocInfo() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    obj.defineProperty("p", null, true, null);
    assertNull(obj.getOwnPropertyJSDocInfo("p"));
  }

  @Test
  public void testUnboxesTo() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, stubPrototype);
    assertNull(obj.unboxesTo()); // not a wrapper type
  }
}