package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.JSTypeNative;

@RunWith(JUnit4.class)
public class FunctionTypeBuilderTest {

  private AbstractCompiler compiler;
  private JSTypeRegistry typeRegistry;
  private CodingConvention codingConvention;
  private Node errorRoot;
  private Scope scope;
  private FunctionTypeBuilder builder;
  private JSDocInfo.Builder docInfoBuilder;
  private String sourceName;

  @Before
  public void setUp() {
    compiler = new AbstractCompiler() {
      @Override
      public CodingConvention getCodingConvention() {
        return codingConvention;
      }
      @Override
      public JSTypeRegistry getTypeRegistry() {
        return typeRegistry;
      }
      @Override
      public SourceFile getInput(String name) {
        return null;
      }
      @Override
      public void report(JSError error) {
      }
    };
    codingConvention = new CodingConvention() {
      @Override
      public boolean isOptionalParameter(Node param) {
        return false;
      }
      @Override
      public boolean isVarArgsParameter(Node param) {
        return false;
      }
    };
    typeRegistry = new JSTypeRegistry(compiler);
    errorRoot = new Node(Token.SCRIPT, 0, 0);
    errorRoot.setLineno(1);
    errorRoot.setCharno(1);
    sourceName = "test.js";
    scope = new Scope(null, null);
    docInfoBuilder = JSDocInfo.builder();
    builder = new FunctionTypeBuilder("testFunc", compiler, errorRoot, sourceName, scope);
  }

  @Test
  public void testBuildAndRegister_noReturnType_usesUnknown() {
    FunctionType fnType = builder.buildAndRegister();
    assertNotNull(fnType);
    assertEquals(typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE), fnType.getReturnType());
  }

  @Test(expected = IllegalStateException.class)
  public void testBuildAndRegister_noParameters_throws() {
    builder.buildAndRegister();
  }

  @Test
  public void testBuildAndRegister_constructorWithExistingType() {
    JSDocInfo info = docInfoBuilder.recordConstructor().build();
    builder.inferInheritance(info);
    builder.inferParameterTypes(null, info);
    FunctionType fnType = builder.buildAndRegister();
    assertNotNull(fnType);
    assertTrue(fnType.isConstructor());
  }

  @Test
  public void testBuildAndRegister_interface() {
    JSDocInfo info = docInfoBuilder.recordInterface().build();
    builder.inferInheritance(info);
    builder.inferParameterTypes(null, info);
    FunctionType fnType = builder.buildAndRegister();
    assertNotNull(fnType);
    assertTrue(fnType.isInterface());
  }

  @Test
  public void testInferFromOverriddenFunction_nullOldType() {
    builder.inferFromOverriddenFunction(null, null);
    assertNull(builder.returnType);
  }

  @Test
  public void testInferFromOverriddenFunction_withParamsParent() {
    FunctionType oldType = typeRegistry.createFunctionType(
        typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE),
        new FunctionParamBuilder(typeRegistry).build());
    Node paramsParent = new Node(Token.LP);
    builder.inferFromOverriddenFunction(oldType, paramsParent);
    assertNotNull(builder.parametersNode);
  }

  @Test
  public void testInferReturnType_withReturnType() {
    JSDocInfo info = docInfoBuilder.recordReturnType(
        new JSTypeExpression(new Node(Token.NUMBER), "test.js")).build();
    builder.inferReturnType(info);
    assertNotNull(builder.returnType);
    assertFalse(builder.returnTypeInferred);
  }

  @Test
  public void testInferReturnType_nullInfo() {
    builder.inferReturnType(null);
    assertNull(builder.returnType);
  }

  @Test
  public void testInferReturnStatementsAsLastResort_nullBlock() {
    builder.inferReturnStatementsAsLastResort(null);
    assertNull(builder.returnType);
  }

  @Test
  public void testInferReturnStatementsAsLastResort_noReturn() {
    Node block = new Node(Token.BLOCK);
    builder.inferReturnStatementsAsLastResort(block);
    assertNotNull(builder.returnType);
    assertEquals(typeRegistry.getNativeType(JSTypeNative.VOID_TYPE), builder.returnType);
    assertTrue(builder.returnTypeInferred);
  }

  @Test
  public void testInferInheritance_nullInfo() {
    builder.inferInheritance(null);
    assertNull(builder.baseType);
    assertNull(builder.implementedInterfaces);
  }

  @Test
  public void testInferInheritance_constructorWithBaseType() {
    JSDocInfo info = docInfoBuilder
        .recordConstructor()
        .recordBaseType(new JSTypeExpression(new Node(Token.OBJECT), "test.js"))
        .build();
    builder.inferInheritance(info);
    assertNotNull(builder.baseType);
  }

  @Test
  public void testInferInheritance_constructorWithImplements() {
    JSDocInfo info = docInfoBuilder
        .recordConstructor()
        .recordImplementedInterface(new JSTypeExpression(new Node(Token.OBJECT), "test.js"))
        .build();
    builder.inferInheritance(info);
    assertNotNull(builder.implementedInterfaces);
    assertEquals(1, builder.implementedInterfaces.size());
  }

  @Test
  public void testInferInheritance_extendsWithoutConstructor() {
    JSDocInfo info = docInfoBuilder
        .recordBaseType(new JSTypeExpression(new Node(Token.OBJECT), "test.js"))
        .build();
    builder.inferInheritance(info);
    assertNull(builder.baseType);
  }

  @Test
  public void testInferThisType_withInfoAndThisType() {
    JSDocInfo info = docInfoBuilder
        .recordThisType(new JSTypeExpression(new Node(Token.OBJECT), "test.js"))
        .build();
    builder.inferThisType(info, (Node) null);
    assertNotNull(builder.thisType);
  }

  @Test
  public void testInferThisType_nullInfoWithOwner() {
    Node owner = new Node(Token.NAME, 0, 0);
    owner.setString("ownerType");
    builder.inferThisType(null, owner);
  }

  @Test
  public void testInferParameterTypes_withArgsParentAndInfo() {
    Node argsParent = new Node(Token.LP);
    argsParent.addChildToBack(Node.newString(Token.NAME, "param1"));
    JSDocInfo info = docInfoBuilder
        .recordParameter("param1", new JSTypeExpression(new Node(Token.NUMBER), "test.js"))
        .build();
    builder.inferParameterTypes(argsParent, info);
    assertNotNull(builder.parametersNode);
  }

  @Test
  public void testInferParameterTypes_nullArgsParentWithInfo() {
    JSDocInfo info = docInfoBuilder
        .recordParameter("param1", new JSTypeExpression(new Node(Token.NUMBER), "test.js"))
        .build();
    builder.inferParameterTypes((Node) null, info);
    assertNotNull(builder.parametersNode);
  }

  @Test
  public void testInferParameterTypes_nullArgsParentNullInfo() {
    builder.inferParameterTypes((Node) null, (JSDocInfo) null);
    assertNull(builder.parametersNode);
  }

  @Test
  public void testInferParameterTypes_withInexistentParamWarning() {
    Node argsParent = new Node(Token.LP);
    argsParent.addChildToBack(Node.newString(Token.NAME, "param1"));
    JSDocInfo info = docInfoBuilder
        .recordParameter("inexistent", new JSTypeExpression(new Node(Token.NUMBER), "test.js"))
        .build();
    builder.inferParameterTypes(argsParent, info);
    assertNotNull(builder.parametersNode);
  }

  @Test
  public void testInferTemplateTypeName_withInfo() {
    JSDocInfo info = docInfoBuilder.recordTemplateTypeName("T").build();
    builder.inferTemplateTypeName(info);
    assertEquals("T", builder.templateTypeName);
  }

  @Test
  public void testInferTemplateTypeName_nullInfo() {
    builder.inferTemplateTypeName(null);
    assertNull(builder.templateTypeName);
  }

  @Test
  public void testSetSourceNode() {
    Node sourceNode = new Node(Token.FUNCTION);
    builder.setSourceNode(sourceNode);
    assertEquals(sourceNode, builder.sourceNode);
  }

  @Test
  public void testIsFunctionTypeDeclaration_true() {
    JSDocInfo info = docInfoBuilder.recordConstructor().build();
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_false() {
    JSDocInfo info = docInfoBuilder.build();
    assertFalse(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testSetValidatorOnExtendedType() {
    JSType type = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
    FunctionTypeBuilder.ExtendedTypeValidator validator = builder.new ExtendedTypeValidator();
    assertTrue(validator.apply(type));
  }

  @Test
  public void testSetValidatorOnExtendedType_null() {
    FunctionTypeBuilder.ExtendedTypeValidator validator = builder.new ExtendedTypeValidator();
    assertFalse(validator.apply(null));
  }

  @Test
  public void testSetValidatorOnImplementedType() {
    JSType type = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
    FunctionTypeBuilder.ImplementedTypeValidator validator = builder.new ImplementedTypeValidator();
    assertTrue(validator.apply(type));
  }

  @Test
  public void testSetValidatorOnImplementedType_null() {
    FunctionTypeBuilder.ImplementedTypeValidator validator = builder.new ImplementedTypeValidator();
    assertFalse(validator.apply(null));
  }

  @Test
  public void testSetValidatorOnThisType() {
    JSType type = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
    FunctionTypeBuilder.ThisTypeValidator validator = builder.new ThisTypeValidator();
    assertTrue(validator.apply(type));
  }

  @Test
  public void testSetValidatorOnThisType_nonObject() {
    JSType type = typeRegistry.getNativeType(JSTypeNative.VOID_TYPE);
    FunctionTypeBuilder.ThisTypeValidator validator = builder.new ThisTypeValidator();
    assertFalse(validator.apply(type));
  }
}