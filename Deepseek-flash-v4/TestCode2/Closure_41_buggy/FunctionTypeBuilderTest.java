package com.google.javascript.jscomp;

import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FunctionTypeBuilderTest {

  private Compiler compiler;
  private JSTypeRegistry typeRegistry;
  private Node errorRoot;
  private Scope scope;

  @Before
  public void setUp() {
    compiler = new Compiler();
    typeRegistry = compiler.getTypeRegistry();
    errorRoot = IR.empty();
    scope = new Scope(errorRoot);
  }

  @After
  public void tearDown() {
    compiler = null;
    typeRegistry = null;
    errorRoot = null;
    scope = null;
  }

  private FunctionTypeBuilder createBuilder() {
    return new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
  }

  @Test
  public void testBuildBasicFunctionType() {
    JSType returnType = typeRegistry.getNativeType(OBJECT_TYPE);

    FunctionType functionType =
        createBuilder()
            .setReturnType(returnType)
            .setParametersNode(IR.paramList())
            .build();

    assertNotNull(functionType);
    assertEquals(returnType, functionType.getReturnType());
    assertFalse(functionType.isConstructor());
    assertFalse(functionType.isInterface());
    assertNotNull(functionType.getParametersNode());
    assertEquals(0, functionType.getParametersNode().getChildCount());
  }

  @Test
  public void testSetContentsNullIsIgnored() {
    FunctionTypeBuilder builder = createBuilder();
    builder.setContents(null);

    FunctionType functionType =
        builder
            .setReturnType(typeRegistry.getNativeType(OBJECT_TYPE))
            .setParametersNode(IR.paramList())
            .build();

    assertNotNull(functionType);
  }

  @Test
  public void testSetContentsAcceptsNullReturnContents() {
    FunctionTypeBuilder builder = createBuilder();

    builder.setContents(
        new FunctionTypeBuilder.FunctionContents() {
          @Override
          public Node getSourceNode() {
            return null;
          }

          @Override
          public boolean mayBeFromExterns() {
            return false;
          }

          @Override
          public boolean mayHaveNonEmptyReturns() {
            return false;
          }

          @Override
          public Iterable<String> getEscapedVarNames() {
            return com.google.common.collect.ImmutableList.of();
          }
        });

    FunctionType functionType =
        builder
            .setReturnType(typeRegistry.getNativeType(OBJECT_TYPE))
            .build();

    assertNotNull(functionType);
  }

  @Test
  public void testSettersAreFluent() {
    FunctionTypeBuilder builder = createBuilder();

    assertSame(
        builder,
        builder.setReturnType(typeRegistry.getNativeType(OBJECT_TYPE)));
    assertSame(builder, builder.setReturnTypeInferred(false));
    assertSame(builder, builder.setParametersNode(IR.paramList()));
    assertSame(builder, builder.setConstructor(false));
    assertSame(builder, builder.setInterface(false));
  }

  @Test
  public void testInferFromOverriddenFunctionWithNullOldType() {
    FunctionTypeBuilder builder = createBuilder();
    JSType returnType = typeRegistry.getNativeType(VOID_TYPE);

    assertSame(builder, builder.inferFromOverriddenFunction(null, null));
    builder.setReturnType(returnType);

    FunctionType functionType = builder.build();
    assertNotNull(functionType);
    assertEquals(returnType, functionType.getReturnType());
  }

  @Test
  public void testInferFromOverriddenFunctionCopiesReturnAndParams() {
    FunctionType oldType =
        new FunctionTypeBuilder("old", compiler, IR.empty(), "old.js", scope)
            .setReturnType(typeRegistry.getNativeType(VOID_TYPE))
            .setParametersNode(IR.paramList(IR.name("param")))
            .build();

    FunctionTypeBuilder builder = createBuilder();
    builder.inferFromOverriddenFunction(oldType, null);

    FunctionType newType = builder.build();
    assertNotNull(newType);
    assertEquals(oldType.getReturnType(), newType.getReturnType());
    assertNotNull(newType.getParametersNode());
  }

  @Test
  public void testBuildRetainsInferredReturnTypeFlag() {
    FunctionTypeBuilder builder = createBuilder();

    builder
        .setReturnType(typeRegistry.getNativeType(OBJECT_TYPE))
        .setReturnTypeInferred(true);

    FunctionType functionType = builder.build();
    assertTrue(functionType.isReturnTypeInferred());
  }

  @Test
  public void testBuildWithNonInferredReturnType() {
    FunctionTypeBuilder builder = createBuilder();

    builder
        .setReturnType(typeRegistry.getNativeType(OBJECT_TYPE))
        .setReturnTypeInferred(false);

    FunctionType functionType = builder.build();
    assertFalse(functionType.isReturnTypeInferred());
  }

  @Test
  public void testConstructorRejectsNullErrorRoot() {
    try {
      new FunctionTypeBuilder("testFn", compiler, null, "test.js", scope);
      fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
      // Expected.
    }
  }
}