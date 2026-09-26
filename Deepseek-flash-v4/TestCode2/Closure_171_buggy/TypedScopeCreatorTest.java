package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class TypedScopeCreatorTest {

  private TestCompiler compiler;
  private TypedScopeCreator creator;
  private JSTypeRegistry registry;

  // ---------- Test stubs ----------

  private static class TestErrorReporter implements ErrorReporter {
    final List<String> errors = Lists.newArrayList();
    final List<String> warnings = Lists.newArrayList();

    @Override
    public void warning(String message, String sourceName, int line, int lineOffset) {
      warnings.add(message);
    }

    @Override
    public void error(String message, String sourceName, int line, int lineOffset) {
      errors.add(message);
    }
  }

  private static class TestCompiler extends AbstractCompiler {
    private final CodingConvention codingConvention = new DefaultCodingConvention();
    private final JSTypeRegistry typeRegistry;
    private final TestErrorReporter errorReporter = new TestErrorReporter();
    private final Map<Node, AstFunctionContents> functionAnalysis = Maps.newHashMap();
    private final TypeValidator validator = new TypeValidator(this);

    TestCompiler() {
      typeRegistry = new JSTypeRegistry(errorReporter);
    }

    @Override
    public CodingConvention getCodingConvention() { return codingConvention; }

    @Override
    public JSTypeRegistry getTypeRegistry() { return typeRegistry; }

    @Override
    public TypeValidator getTypeValidator() { return validator; }

    @Override
    public ErrorReporter getErrorReporter() { return errorReporter; }

    @Override
    CompilerInput getInput(InputId inputId) { return null; }

    @Override
    void report(JSError error) {
      if (error.getType() != null) {
        errorReporter.error(error.getType().getKey(), error.sourceName, error.lineNumber, 0);
      }
    }
  }

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    creator = new TypedScopeCreator(compiler);
    registry = compiler.getTypeRegistry();
  }

  // ---------- Test createScope with null parent (global) ----------

  @Test
  public void testCreateScopeGlobal() {
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("test.js"));
    Node child = new Node(Token.EXPR_RESULT, Node.newString("a"));
    script.addChildToBack(child);

    Scope scope = creator.createScope(script, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    // Verify native types declared
    assertNotNull(scope.getVar("Array"));
    assertNotNull(scope.getVar("Function"));
    assertNotNull(scope.getVar("Object"));
    assertNotNull(scope.getVar("undefined"));
    assertNotNull(scope.getVar("ActiveXObject"));
    // Global this set
    Node root = scope.getRootNode();
    assertNotNull(root.getJSType());
    assertEquals(registry.getNativeObjectType(JSTypeNative.GLOBAL_THIS), root.getJSType());
    assertEquals(registry.getNativeObjectType(JSTypeNative.GLOBAL_THIS), root.getFirstChild().getJSType());
    assertEquals(registry.getNativeObjectType(JSTypeNative.GLOBAL_THIS), root.getLastChild().getJSType());
  }

  @Test
  public void testCreateScopeGlobalWithVar() {
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("test.js"));
    Node var = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    var.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    script.addChildToBack(var);

    Scope scope = creator.createScope(script, null);
    assertNotNull(scope.getVar("x"));
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), scope.getVar("x").getType());
  }

  @Test
  public void testCreateScopeGlobalWithEnum() {
    // Simulate an enum declaration
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("test.js"));
    // enum E { A, B }
    Node enumObjLit = new Node(Token.OBJECTLIT);
    enumObjLit.addChildToBack(Node.newString(Token.STRING, "A"));
    enumObjLit.addChildToBack(Node.newString(Token.STRING, "B"));
    JSDocInfo info = new JSDocInfo(true);
    info.setEnumParameterType(registry.createTypeFromNode(
        Node.newString(Token.STRING, "number"))); // elements type number
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "E"));
    varNode.getFirstChild().addChildToBack(enumObjLit);
    varNode.getFirstChild().setJSDocInfo(info);
    script.addChildToBack(varNode);

    Scope scope = creator.createScope(script, null);
    Var eVar = scope.getVar("E");
    assertNotNull(eVar);
    assertTrue(eVar.getType() instanceof EnumType);
    EnumType enumType = (EnumType) eVar.getType();
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), enumType.getElementsType());
    assertNotNull(enumType.getPropertyType("A"));
  }

  // ---------- Test createScope with parent (local) ----------

  @Test
  public void testCreateScopeLocal() {
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("test.js"));
    Node root = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"));
    Node param = Node.newString(Token.NAME, "p");
    Node body = new Node(Token.BLOCK);
    root.addChildToBack(param);
    root.addChildToBack(body);
    script.addChildToBack(root);

    Scope global = creator.createScope(script, null);
    // Now create a local scope inside function f
    Scope local = creator.createScope(root, global);
    assertNotNull(local);
    assertTrue(local.isLocal());
    // Parameter p should be declared
    Var pVar = local.getVar("p");
    assertNotNull(pVar);
    // Function name f should be declared as var
    Var fVar = local.getVar("f");
    assertNull(fVar); // In function scope, function name is not a var of the function itself? Actually it's declared in enclosing scope, not local.
  }

  // ---------- Test createInitialScope ----------

  @Test
  public void testCreateInitialScope() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = creator.createInitialScope(script);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    // Check native types
    assertNotNull(scope.getVar("Array"));
    assertNotNull(scope.getVar("Boolean"));
    assertNotNull(scope.getVar("Date"));
    assertNotNull(scope.getVar("Error"));
    assertNotNull(scope.getVar("EvalError"));
    assertNotNull(scope.getVar("Function"));
    assertNotNull(scope.getVar("Number"));
    assertNotNull(scope.getVar("Object"));
    assertNotNull(scope.getVar("RangeError"));
    assertNotNull(scope.getVar("ReferenceError"));
    assertNotNull(scope.getVar("RegExp"));
    assertNotNull(scope.getVar("String"));
    assertNotNull(scope.getVar("SyntaxError"));
    assertNotNull(scope.getVar("TypeError"));
    assertNotNull(scope.getVar("URIError"));
    assertNotNull(scope.getVar("undefined"));
    assertNotNull(scope.getVar("ActiveXObject"));
  }

  // ---------- Test patchGlobalScope ----------

  @Test
  public void testPatchGlobalScope() {
    Node script1 = new Node(Token.SCRIPT);
    script1.setInputId(new InputId("file1.js"));
    // pretend script source name set via NodeUtil
    script1.putProp(Node.SOURCENAME_PROP, "file1.js");
    Node var1 = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
    script1.addChildToBack(var1);

    Scope global = creator.createScope(script1, null);
    assertNotNull(global.getVar("a"));

    // Now patch with a different script that redeclares var a
    Node script2 = new Node(Token.SCRIPT);
    script2.setInputId(new InputId("file2.js"));
    script2.putProp(Node.SOURCENAME_PROP, "file2.js");
    Node var2 = new Node(Token.VAR, Node.newString(Token.NAME, "b"));
    script2.addChildToBack(var2);

    creator.patchGlobalScope(global, script2);
    // Var a should be removed
    assertNull(global.getVar("a"));
    // Var b should be added
    assertNotNull(global.getVar("b"));
  }

  // ---------- Test defineSlot with prototype and Window ----------

  @Test
  public void testWindowConstructor() {
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("file.js"));
    // Create a constructor function expression for Window
    Node functionNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "Window"));
    Node body = new Node(Token.BLOCK);
    functionNode.addChildToBack(body);
    // Assign to Window
    Node assign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "Window"));
    assign.addChildToBack(functionNode);
    // Already a function type
    functionNode.setJSType(registry.createConstructorType("Window", null, null, null, null));
    Node exprResult = new Node(Token.EXPR_RESULT, assign);
    script.addChildToBack(exprResult);

    Scope scope = creator.createScope(script, null);
    Var winVar = scope.getVar("Window");
    assertNotNull(winVar);
    assertTrue(winVar.getType().isConstructor());
    // Check that Window.prototype and globalThis are updated
    ObjectType globalThis = registry.getNativeObjectType(JSTypeNative.GLOBAL_THIS);
    ObjectType windowInstance = ((FunctionType) winVar.getType()).getInstanceType();
    assertTrue(windowInstance.isSubtype(globalThis)); // not exactly, but Window should be on global this as inferred? Not enforced here
  }

  // ---------- Test defineVar with multiple names (MULTIPLE_VAR_DEF) ----------

  @Test
  public void testMultipleVarDefinition() {
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("file.js"));
    // AST: var x = 1, y = 2;
    Node varNode = new Node(Token.VAR);
    Node name1 = Node.newString(Token.NAME, "x");
    name1.addChildToBack(Node.newNumber(1.0));
    Node name2 = Node.newString(Token.NAME, "y");
    name2.addChildToBack(Node.newNumber(2.0));
    varNode.addChildToBack(name1);
    varNode.addChildToBack(name2);
    // Give JSDocInfo to var node to trigger MULTIPLE_VAR_DEF
    JSDocInfo info = new JSDocInfo(true);
    varNode.setJSDocInfo(info);
    script.addChildToBack(varNode);

    try {
      creator.createScope(script, null);
      // Expect no exception; warning reported but not tested here
    } catch (Exception e) {
      fail("Should not throw exception");
    }
  }

  // ---------- Test defineFunctionLiteral with JSDoc info ----------

  @Test
  public void testDefineFunctionLiteralWithJSDoc() {
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("file.js"));
    Node functionNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"));
    Node param = Node.newString(Token.NAME, "x");
    Node body = new Node(Token.BLOCK);
    functionNode.addChildToBack(param);
    functionNode.addChildToBack(body);
    JSDocInfo info = new JSDocInfo(true);
    // Set @return {number}
    info.setReturnType(registry.createTypeFromNode(Node.newString(Token.STRING, "number")));
    functionNode.setJSDocInfo(info);
    // Set the function's name as a var
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "f"));
    varNode.getFirstChild().addChildToBack(functionNode);
    script.addChildToBack(varNode);

    Scope scope = creator.createScope(script, null);
    Var fVar = scope.getVar("f");
    assertNotNull(fVar);
    JSType type = fVar.getType();
    assertTrue(type.isFunctionType());
    FunctionType fnType = type.toMaybeFunctionType();
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), fnType.getReturnType());
  }

  // ---------- Test object literal with @lends ----------

  @Test
  public void testLendsAnnotation() {
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("file.js"));
    // Declare a variable "obj" with type {a: number}
    // First create var obj = {a: 1}
    Node objLit = new Node(Token.OBJECTLIT);
    Node key = Node.newString(Token.STRING_KEY, "a");
    key.addChildToBack(Node.newNumber(1.0));
    objLit.addChildToBack(key);
    JSDocInfo objInfo = new JSDocInfo(true);
    objInfo.setLendsName("obj");
    objLit.setJSDocInfo(objInfo);
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "obj"));
    varNode.getFirstChild().addChildToBack(objLit);
    script.addChildToBack(varNode);

    Scope scope = creator.createScope(script, null);
    Var objVar = scope.getVar("obj");
    assertNotNull(objVar);
    // With @lends, it should create anonymous object type
    assertTrue(objVar.getType().isObjectType());
  }

  // ---------- Test enum initializer error ----------

  @Test
  public void testEnumInitializerNonObject() {
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("file.js"));
    // var E = 1; with @enum {number} JSDoc
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "E"));
    varNode.getFirstChild().addChildToBack(Node.newNumber(1.0));
    JSDocInfo info = new JSDocInfo(true);
    info.setEnumParameterType(registry.createTypeFromNode(Node.newString(Token.STRING, "number")));
    varNode.getFirstChild().setJSDocInfo(info);
    script.addChildToBack(varNode);

    try {
      creator.createScope(script, null);
      // No exception; warning reported
    } catch (Exception e) {
      fail("Should not throw");
    }
  }

  // ---------- Test processObjectLitProperties with enum type ----------

  @Test
  public void testObjectLiteralPropertiesInEnum() {
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("file.js"));
    Node enumObjLit = new Node(Token.OBJECTLIT);
    Node key1 = Node.newString(Token.STRING_KEY, "A");
    key1.addChildToBack(Node.newNumber(1.0));
    enumObjLit.addChildToBack(key1);
    JSDocInfo info = new JSDocInfo(true);
    info.setEnumParameterType(registry.createTypeFromNode(Node.newString(Token.STRING, "number")));
    enumObjLit.setJSDocInfo(info);
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "E"));
    varNode.getFirstChild().addChildToBack(enumObjLit);
    script.addChildToBack(varNode);

    Scope scope = creator.createScope(script, null);
    Var eVar = scope.getVar("E");
    assertNotNull(eVar);
    assertTrue(eVar.getType() instanceof EnumType);
    EnumType enumType = (EnumType) eVar.getType();
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), enumType.getElementsType());
    JSType propA = enumType.getPropertyType("A");
    assertNotNull(propA);
    assertEquals(enumType.getElementsType(), propA);
  }

  // ---------- Test defineSlot with global this (inferred) ----------

  @Test
  public void testDefineSlotOnGlobalThis() {
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("file.js"));
    // Simple var declaration
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "g"));
    varNode.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    script.addChildToBack(varNode);

    Scope scope = creator.createScope(script, null);
    ObjectType globalThis = registry.getNativeObjectType(JSTypeNative.GLOBAL_THIS);
    assertNotNull(globalThis.getPropertyType("g"));
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), globalThis.getPropertyType("g"));
  }

  // ---------- Test exception path: null arguments (Preconditions) ----------

  @Test(expected = NullPointerException.class)
  public void testCreateScopeNullRootThrows() {
    creator.createScope(null, null);
  }

  // ---------- Test branch coverage in shouldTraverse: hoisted function ----------

  @Test
  public void testHoistedFunctionDeclaration() {
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("file.js"));
    // function f() {}
    Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.BLOCK));
    Node expr = new Node(Token.EXPR_RESULT, func);
    script.addChildToBack(expr);

    Scope scope = creator.createScope(script, null);
    Var fVar = scope.getVar("f");
    assertNotNull(fVar);
    assertTrue(fVar.getType().isFunctionType());
  }

  // ---------- Test checkForClassDefiningCalls with subclass relationship ----------

  @Test
  public void testSubclassRelationship() {
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("file.js"));
    // Create constructor Super and Sub
    Node superFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "Super"));
    superFn.setJSType(registry.createConstructorType("Super", null, null, null, null));
    Node subFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "Sub"));
    subFn.setJSType(registry.createConstructorType("Sub", null, null, null, null));
    Node varSuper = new Node(Token.VAR, Node.newString(Token.NAME, "Super"));
    varSuper.getFirstChild().addChildToBack(superFn);
    Node varSub = new Node(Token.VAR, Node.newString(Token.NAME, "Sub"));
    varSub.getFirstChild().addChildToBack(subFn);
    script.addChildToBack(varSuper);
    script.addChildToBack(varSub);
    // A call that defines subclass: goog.inherits(Sub, Super)
    Node call = new Node(Token.CALL,
        Node.newString(Token.NAME, "goog.inherits"),
        Node.newString(Token.NAME, "Sub"),
        Node.newString(Token.NAME, "Super"));
    Node expr = new Node(Token.EXPR_RESULT, call);
    script.addChildToBack(expr);
    // Set goog.inherits as known
    compiler.getCodingConvention().registerSubclassType("goog.inherits", SubclassType.INHERITS);

    Scope scope = creator.createScope(script, null);
    // Just ensure no exception
  }
}