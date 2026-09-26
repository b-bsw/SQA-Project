package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;

public class FunctionBuilderTest {

    private JSTypeRegistry registry;
    private Node sourceNode;
    private Node paramsNode;
    private JSType returnType;
    private ObjectType typeOfThis;

    static class MockErrorReporter implements ErrorReporter {
        @Override
        public void warning(String message, String sourceName, int line, int lineOffset) {}
        @Override
        public void error(String message, String sourceName, int line, int lineOffset) {}
    }

    static class MockJSTypeRegistry extends JSTypeRegistry {
        public MockJSTypeRegistry() {
            super(new MockErrorReporter());
        }
    }

    static class MockJSType extends JSType {
        public MockJSType(JSTypeRegistry registry) {
            super(registry);
        }
    }

    static class MockObjectType extends ObjectType {
        public MockObjectType(JSTypeRegistry registry) {
            super(registry);
        }
    }

    @Before
    public void setUp() {
        registry = new MockJSTypeRegistry();
        sourceNode = new Node(0);
        paramsNode = new Node(1);
        returnType = new MockJSType(registry);
        typeOfThis = new MockObjectType(registry);
    }

    @Test
    public void testDefaultBuild() {
        FunctionType result = new FunctionBuilder(registry).build();
        assertNotNull(result);
        assertNull(result.getParametersNode());
        assertNull(result.getReturnType());
        assertFalse(result.isConstructor());
        assertFalse(result.isNativeObjectType());
    }

    @Test
    public void testWithNullName() {
        FunctionType result = new FunctionBuilder(registry).withName(null).build();
        assertNull(result.getReferenceName());
    }

    @Test
    public void testWithEmptyName() {
        FunctionType result = new FunctionBuilder(registry).withName("").build();
        assertEquals("", result.getReferenceName());
    }

    @Test
    public void testWithName() {
        FunctionType result = new FunctionBuilder(registry).withName("testName").build();
        assertEquals("testName", result.getReferenceName());
    }

    @Test
    public void testWithNullSourceNode() {
        FunctionType result = new FunctionBuilder(registry).withSourceNode(null).build();
        assertNull(result.getSource());
    }

    @Test
    public void testWithSourceNode() {
        FunctionType result = new FunctionBuilder(registry).withSourceNode(sourceNode).build();
        assertSame(sourceNode, result.getSource());
    }

    @Test
    public void testWithNullParamsNode() {
        FunctionType result = new FunctionBuilder(registry).withParamsNode(null).build();
        assertNull(result.getParametersNode());
    }

    @Test
    public void testWithParamsNode() {
        FunctionType result = new FunctionBuilder(registry).withParamsNode(paramsNode).build();
        assertSame(paramsNode, result.getParametersNode());
    }

    @Test
    public void testWithNullReturnType() {
        FunctionType result = new FunctionBuilder(registry).withReturnType(null).build();
        assertNull(result.getReturnType());
    }

    @Test
    public void testWithReturnType() {
        FunctionType result = new FunctionBuilder(registry).withReturnType(returnType).build();
        assertSame(returnType, result.getReturnType());
    }

    @Test
    public void testWithInferredReturnType() {
        FunctionType result = new FunctionBuilder(registry).withInferredReturnType(returnType).build();
        assertSame(returnType, result.getReturnType());
        // inferred return type flag cannot be verified directly via public API
    }

    @Test
    public void testWithNullTypeOfThis() {
        FunctionType result = new FunctionBuilder(registry).withTypeOfThis(null).build();
        assertNull(result.getTypeOfThis());
    }

    @Test
    public void testWithTypeOfThis() {
        FunctionType result = new FunctionBuilder(registry).withTypeOfThis(typeOfThis).build();
        assertSame(typeOfThis, result.getTypeOfThis());
    }

    @Test
    public void testWithNullTemplateName() {
        FunctionType result = new FunctionBuilder(registry).withTemplateName(null).build();
        assertNull(result.getTemplateTypeName());
    }

    @Test
    public void testWithEmptyTemplateName() {
        FunctionType result = new FunctionBuilder(registry).withTemplateName("").build();
        assertEquals("", result.getTemplateTypeName());
    }

    @Test
    public void testWithTemplateName() {
        FunctionType result = new FunctionBuilder(registry).withTemplateName("T").build();
        assertEquals("T", result.getTemplateTypeName());
    }

    @Test
    public void testForConstructor() {
        FunctionType result = new FunctionBuilder(registry).forConstructor().build();
        assertTrue(result.isConstructor());
    }

    @Test
    public void testForNativeType() {
        FunctionType result = new FunctionBuilder(registry).forNativeType().build();
        assertTrue(result.isNativeObjectType());
    }

    @Test
    public void testCopyFromOtherFunction() {
        FunctionType original = new FunctionBuilder(registry)
                .withName("original")
                .withSourceNode(sourceNode)
                .withParamsNode(paramsNode)
                .withReturnType(returnType)
                .withTypeOfThis(typeOfThis)
                .withTemplateName("T")
                .forConstructor()
                .build();

        FunctionType copy = new FunctionBuilder(registry)
                .copyFromOtherFunction(original)
                .withName("copy")
                .build();

        assertEquals("copy", copy.getReferenceName());
        assertSame(original.getParametersNode(), copy.getParametersNode());
        assertSame(original.getReturnType(), copy.getReturnType());
        assertSame(original.getTypeOfThis(), copy.getTypeOfThis());
        assertEquals(original.getTemplateTypeName(), copy.getTemplateTypeName());
        assertEquals(original.isConstructor(), copy.isConstructor());
        assertEquals(original.isNativeObjectType(), copy.isNativeObjectType());
    }

    @Test(expected = NullPointerException.class)
    public void testBuildWithNullRegistry() {
        new FunctionBuilder(null).build();
    }
}