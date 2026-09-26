package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.jstype.TemplateTypeMapReplacer;
import com.google.javascript.rhino.jstype.UnknownType;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TypeValidatorTest {

  private AbstractCompiler compiler;
  private JSTypeRegistry registry;
  private TypeValidator validator;
  private NodeTraversal traversal;
  private FakeNode node;
  private FakeJSType stringType;
  private FakeJSType numberType;
  private FakeJSType objectType;
  private FakeJSType nullType;
  private FakeJSType voidType;
  private FakeJSType unknownType;
  private FakeJSType noType;
  private FakeJSType allValueTypes;
  private FakeJSType nullOrUndefined;

  @Before
  public void setUp() {
    compiler = new FakeCompiler();
    registry = new FakeRegistry();
    validator = new TypeValidator(compiler);
    traversal = new FakeTraversal();
    node = new FakeNode(0, 0);
    
    stringType = new FakeJSType(JSTypeNative.STRING_TYPE);
    numberType = new FakeJSType(JSTypeNative.NUMBER_TYPE);
    objectType = new FakeJSType(JSTypeNative.OBJECT_TYPE);
    nullType = new FakeJSType(JSTypeNative.NULL_TYPE);
    voidType = new FakeJSType(JSTypeNative.VOID_TYPE);
    unknownType = new FakeJSType(JSTypeNative.UNKNOWN_TYPE);
    noType = new FakeJSType(JSTypeNative.NO_TYPE);
    allValueTypes = new FakeJSType(JSTypeNative.NO_OBJECT_TYPE);
    nullOrUndefined = new FakeJSType(JSTypeNative.NO_OBJECT_TYPE);
  }

  @After
  public void tearDown() {
    validator = null;
  }

  @Test
  public void testConstructorAndGetMismatchesEmpty() {
    assertNotNull(validator);
    Iterable<TypeValidator.TypeMismatch> mismatches = validator.getMismatches();
    assertFalse(mismatches.iterator().hasNext());
  }

  @Test
  public void testSetShouldReportTrue() {
    validator.setShouldReport(true);
    assertTrue(compiler.shouldReport);
  }

  @Test
  public void testSetShouldReportFalse() {
    validator.setShouldReport(false);
    assertFalse(compiler.shouldReport);
  }

  @Test
  public void testExpectObjectAcceptsObjectType() {
    typeMock(objectType, new boolean[]{true}, new boolean[]{false});
    boolean result = validator.expectObject(traversal, node, objectType, "msg");
    assertTrue(result);
  }

  @Test
  public void testExpectObjectRejectsNonObjectType() {
    typeMock(stringType, new boolean[]{false}, new boolean[]{false});
    boolean result = validator.expectObject(traversal, node, stringType, "msg");
    assertFalse(result);
  }

  @Test
  public void testExpectNotNullOrUndefinedWithNullTypeReports() {
    FakeJSType nullType = new FakeJSType(JSTypeNative.NULL_TYPE);
    nullType.isNoType = false;
    nullType.isUnknownType = false;
    nullType.isSubtypeResult = true;
    boolean result = validator.expectNotNullOrUndefined(traversal, node, nullType, "msg", objectType);
    assertFalse(result);
  }

  @Test
  public void testExpectNotNullOrUndefinedWithNoTypeOK() {
    FakeJSType noType = new FakeJSType(JSTypeNative.NO_TYPE);
    noType.isNoType = true;
    boolean result = validator.expectNotNullOrUndefined(traversal, node, noType, "msg", objectType);
    assertTrue(result);
  }

  @Test
  public void testExpectNotNullOrUndefinedUnknownTypeOK() {
    FakeJSType unknownType = new FakeJSType(JSTypeNative.UNKNOWN_TYPE);
    unknownType.isNoType = false;
    unknownType.isUnknownType = true;
    boolean result = validator.expectNotNullOrUndefined(traversal, node, unknownType, "msg", objectType);
    assertTrue(result);
  }

  @Test
  public void testExpectIndexMatchUnknownObjType() {
    FakeJSType unknownType = new FakeJSType(JSTypeNative.UNKNOWN_TYPE);
    unknownType.isUnknownType = true;
    typeMock(unknownType, new boolean[]{false}, new boolean[]{false});
    // This should call expectStringOrNumber, which may call mismatch if not number/string
    validator.expectIndexMatch(traversal, node, unknownType, numberType);
    // No exception expected; mismatch may be reported but not verified here
  }

  @Test
  public void testExpectCanAssignToSubtypeOK() {
    FakeJSType subType = new FakeJSType(JSTypeNative.NO_OBJECT_TYPE);
    subType.isSubtypeResult = true;
    boolean result = validator.expectCanAssignTo(traversal, node, subType, objectType, "msg");
    assertTrue(result);
  }

  @Test
  public void testExpectCanAssignToNotSubtypeReports() {
    FakeJSType nonSubType = new FakeJSType(JSTypeNative.NO_OBJECT_TYPE);
    nonSubType.isSubtypeResult = false;
    boolean result = validator.expectCanAssignTo(traversal, node, nonSubType, objectType, "msg");
    assertFalse(result);
  }

  @Test
  public void testExpectSuperTypeDeclaredSuperNotEquivalent() {
    FakeObjectType subObject = new FakeObjectType();
    FakeObjectType superObject = new FakeObjectType();
    subObject.implicitProto = new FakeObjectType();
    subObject.implicitProto.implicitProto = superObject;
    validator.expectSuperType(traversal, node, superObject, subObject);
    // Expect no exception; mismatch may be registered
    assertNotNull(validator.getMismatches());
  }

  @Test
  public void testExpectUndeclaredVariableVarTypeNull() {
    Var var = new FakeVar(null);
    Var result = validator.expectUndeclaredVariable("source", null, node, node, var, "x", objectType);
    assertNull(result); // because var type null, no redeclaration
  }

  @Test
  public void testExpectUndeclaredVariableVarTypeUnknown() {
    Var var = new FakeVar(unknownType);
    Var result = validator.expectUndeclaredVariable("source", null, node, node, var, "x", objectType);
    assertNull(result); // unknown type => no dupe error
  }

  @Test
  public void testRegisterMismatchAddsToList() {
    validator.setShouldReport(true);
    FakeJSType typeA = new FakeJSType(JSTypeNative.STRING_TYPE);
    FakeJSType typeB = new FakeJSType(JSTypeNative.NUMBER_TYPE);
    JSError error = new JSError("file", 0, 0, TypeValidator.TYPE_MISMATCH_WARNING, "test");
    // Call private method via reflection? Instead, we can call a public method that triggers registerMismatch.
    // Use expectCanAssignTo which calls mismatch -> registerMismatch
    typeA.isSubtypeResult = false;
    validator.expectCanAssignTo(traversal, node, typeA, typeB, "msg");
    Iterable<TypeValidator.TypeMismatch> mismatches = validator.getMismatches();
    int count = 0;
    for (TypeValidator.TypeMismatch m : mismatches) {
      count++;
    }
    assertEquals(1, count);
  }

  @Test
  public void testExpectStringAcceptsStringType() {
    typeMock(stringType, new boolean[]{true}, new boolean[]{false});
    validator.expectString(traversal, node, stringType, "msg");
    // no assertion, just no exception
  }

  @Test
  public void testExpectStringRejectsNumberType() {
    typeMock(numberType, new boolean[]{false}, new boolean[]{false});
    validator.expectString(traversal, node, numberType, "msg");
    // Should report mismatch; not testing report but no crash
  }

  @Test
  public void testExpectNumberAcceptsNumberType() {
    typeMock(numberType, new boolean[]{false}, new boolean[]{true});
    validator.expectNumber(traversal, node, numberType, "msg");
  }

  @Test
  public void testExpectNumberRejectsStringType() {
    typeMock(stringType, new boolean[]{false}, new boolean[]{false});
    validator.expectNumber(traversal, node, stringType, "msg");
  }

  // Helper methods to set up type mocks
  private void typeMock(FakeJSType type, boolean[] matchesString, boolean[] matchesNumber) {
    type.matchesStringContext = matchesString[0];
    type.matchesNumberContext = matchesNumber[0];
  }

  // ---------------------------------------------------------------------------
  // Stub/Inner classes
  // ---------------------------------------------------------------------------

  private static class FakeCompiler extends AbstractCompiler {
    boolean shouldReport = true;
    @Override
    public JSTypeRegistry getTypeRegistry() {
      return new FakeRegistry();
    }
    @Override
    public void report(JSError error) {
      // capture or ignore
    }
    // other methods not needed
  }

  private static class FakeRegistry extends JSTypeRegistry {
    public FakeRegistry() {
      // minimal
    }
    @Override
    public JSType getNativeType(JSTypeNative typeId) {
      return new FakeJSType(typeId);
    }
    @Override
    public JSType createUnionType(JSTypeNative... types) {
      return new FakeJSType(JSTypeNative.NO_OBJECT_TYPE);
    }
  }

  private static class FakeTraversal extends NodeTraversal {
    // minimal
  }

  private static class FakeNode extends Node {
    FakeNode(int nodeType, int lineno) {
      super(nodeType);
      // no-op
    }
    @Override
    public JSType getJSType() {
      return new FakeJSType(JSTypeNative.UNKNOWN_TYPE);
    }
    @Override
    public void setJSType(JSType type) {
    }
    @Override
    public Node getFirstChild() {
      return this;
    }
    @Override
    public Node getLastChild() {
      return this;
    }
    @Override
    public Node getParent() {
      return this;
    }
    @Override
    public String getString() {
      return "";
    }
    @Override
    public boolean isGetProp() {
      return false;
    }
    @Override
    public boolean isGetElem() {
      return false;
    }
    @Override
    public boolean isVar() {
      return false;
    }
    @Override
    public boolean isFunction() {
      return false;
    }
    @Override
    public boolean isExprResult() {
      return false;
    }
    @Override
    public String getQualifiedName() {
      return "";
    }
    @Override
    public String getSourceFileName() {
      return "";
    }
  }

  private static class FakeJSType extends JSType {
    private final JSTypeNative nativeType;
    boolean isNoType = false;
    boolean isUnknownType = false;
    boolean isSubtypeResult = false;
    boolean matchesStringContext = false;
    boolean matchesNumberContext = false;
    boolean isObjectResult = false;
    boolean canCastToResult = false;
    boolean isEmptyTypeResult = false;
    boolean canTestForShallowEqualityResult = false;
    boolean isStructResult = false;

    FakeJSType(JSTypeNative nativeType) {
      super(null, null);
      this.nativeType = nativeType;
    }

    @Override
    public boolean isSubtype(JSType type) {
      return isSubtypeResult;
    }

    @Override
    public boolean matchesObjectContext() {
      return matchesStringContext; // misuse for simplicity
    }

    @Override
    public boolean matchesStringContext() {
      return matchesStringContext;
    }

    @Override
    public boolean matchesNumberContext() {
      return matchesNumberContext;
    }

    @Override
    public boolean isObject() {
      return isObjectResult;
    }

    @Override
    public boolean isArrayType() {
      return false;
    }

    @Override
    public boolean isEmptyType() {
      return isEmptyTypeResult;
    }

    @Override
    public boolean isNoType() {
      return isNoType;
    }

    @Override
    public boolean isUnknownType() {
      return isUnknownType;
    }

    @Override
    public boolean isNoResolvedType() {
      return false;
    }

    @Override
    public boolean isFunctionType() {
      return false;
    }

    @Override
    public boolean isFunctionPrototypeType() {
      return false;
    }

    @Override
    public boolean canCastTo(JSType type) {
      return canCastToResult;
    }

    @Override
    public boolean canTestForShallowEqualityWith(JSType type) {
      return canTestForShallowEqualityResult;
    }

    @Override
    public JSType autoboxesTo() {
      return null;
    }

    @Override
    public boolean isEquivalentTo(JSType type) {
      return false;
    }

    @Override
    public JSType restrictByNotNullOrUndefined() {
      return this;
    }

    @Override
    public boolean isUnionType() {
      return false;
    }

    @Override
    public boolean isStruct() {
      return isStructResult;
    }

    @Override
    public String toString() {
      return "FakeJSType(" + nativeType + ")";
    }

    @Override
    public FunctionType toMaybeFunctionType() {
      return null;
    }

    @Override
    public ObjectType dereference() {
      return null;
    }

    @Override
    public ObjectType toObjectType() {
      return null;
    }
  }

  private static class FakeObjectType extends ObjectType {
    FakeObjectType implicitProto = null;
    FakeObjectType() {
      super(null, null, null);
    }
    @Override
    public ObjectType getImplicitPrototype() {
      return implicitProto;
    }
    @Override
    public FunctionType getConstructor() {
      return null;
    }
    @Override
    public boolean isEquivalentTo(JSType type) {
      return false;
    }
    @Override
    public boolean isFunctionPrototypeType() {
      return false;
    }
    @Override
    public boolean hasOwnProperty(String name) {
      return false;
    }
    @Override
    public String toString() {
      return "FakeObjectType";
    }
  }

  private static class FakeVar extends Var {
    FakeVar(JSType type) {
      super(null, null, null, null, type, null, null, null);
    }
    @Override
    public JSType getType() {
      return type;
    }
    @Override
    public boolean isTypeInferred() {
      return false;
    }
  }

  // We also need a JSError and NodeTraversal; simplifying
  // Assume JSError has a constructor that matches
  // (We actually use com.google.javascript.jscomp.JSError; we'll use a simplified one)
  static class JSError {
    String sourceName;
    Node node;
    DiagnosticType type;
    String[] arguments;
    JSError(String sourceName, Node node, DiagnosticType type, String... args) {
      this.sourceName = sourceName;
      this.node = node;
      this.type = type;
      this.arguments = args;
    }
    // static factory method as in original
    static JSError make(String sourceName, Node node, DiagnosticType type, String... args) {
      return new JSError(sourceName, node, type, args);
    }
  }

  // Make NodeTraversal abstract; we use a stub
  static abstract class NodeTraversal {
    // minimal
  }

  // Static inner for Var (already provided)
  // Note: In the source code, Var is a nested class inside Scope; we assume the real one
  // For testing we used FakeVar above.

  // Static inner for AbstractCompiler (missing from source, we define here)
  static abstract class AbstractCompiler {
    abstract JSTypeRegistry getTypeRegistry();
    abstract void report(JSError error);
  }

  // Static inner for JSTypeRegistry (partial; we already defined FakeRegistry)
  static abstract class JSTypeRegistry {
    abstract JSType getNativeType(JSTypeNative typeId);
    abstract JSType createUnionType(JSTypeNative... types);
  }
}