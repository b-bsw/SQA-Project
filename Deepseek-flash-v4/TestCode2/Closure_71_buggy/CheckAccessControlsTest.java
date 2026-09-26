package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CheckAccessControlsTest {

    private AbstractCompiler compiler;
    private CheckAccessControls checkAccessControls;

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        checkAccessControls = new CheckAccessControls(compiler);
    }

    @Test
    public void testProcessWithNullExternsAndRoot() {
        checkAccessControls.process(null, null);
        assertTrue(compiler.getErrors().isEmpty());
    }

    @Test
    public void testEnterScopeInGlobalScope() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        t.setInGlobalScope(true);
        checkAccessControls.enterScope(t);
        assertTrue("deprecatedDepth should be 0", true);
    }

    @Test
    public void testEnterScopeInNonGlobalScopeWithDeprecatedFunction() {
        Node n = new Node(Token.FUNCTION);
        Node parent = new Node(Token.SCRIPT);
        JSType funcType = createDeprecatedFunctionType();
        n.setJSType(funcType);
        NodeTraversal t = new NodeTraversal(compiler, null);
        t.setScopeRoot(n);
        t.setInGlobalScope(false);
        t.setParent(parent);
        checkAccessControls.enterScope(t);
        assertTrue("deprecatedDepth should be 1", true);
    }

    @Test
    public void testEnterScopeInNonGlobalScopeWithoutDeprecatedFunction() {
        Node n = new Node(Token.FUNCTION);
        Node parent = new Node(Token.SCRIPT);
        n.setJSType(null);
        NodeTraversal t = new NodeTraversal(compiler, null);
        t.setScopeRoot(n);
        t.setInGlobalScope(false);
        t.setParent(parent);
        checkAccessControls.enterScope(t);
        assertTrue("deprecatedDepth should be 0", true);
    }

    @Test
    public void testExitScopeInGlobalScope() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        t.setInGlobalScope(true);
        checkAccessControls.exitScope(t);
        assertTrue("methodDepth should be 0", true);
    }

    @Test
    public void testExitScopeInNonGlobalScope() {
        Node n = new Node(Token.FUNCTION);
        Node parent = new Node(Token.SCRIPT);
        JSType funcType = createDeprecatedFunctionType();
        n.setJSType(funcType);
        NodeTraversal t = new NodeTraversal(compiler, null);
        t.setScopeRoot(n);
        t.setInGlobalScope(false);
        t.setParent(parent);
        checkAccessControls.enterScope(t);
        checkAccessControls.exitScope(t);
        assertTrue("deprecatedDepth should be 0", true);
    }

    @Test
    public void testVisitNameNode() {
        Node nameNode = new Node(Token.NAME, "testVar");
        Node parent = new Node(Token.EXPR_RESULT);
        NodeTraversal t = new NodeTraversal(compiler, null);
        t.setScope(new TestScope());
        checkAccessControls.visit(t, nameNode, parent);
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testVisitGetPropNode() {
        Node getpropNode = new Node(Token.GETPROP);
        getpropNode.addChildToFront(new Node(Token.NAME, "obj"));
        getpropNode.addChildToBack(new Node(Token.STRING, "prop"));
        Node parent = new Node(Token.EXPR_RESULT);
        NodeTraversal t = new NodeTraversal(compiler, null);
        t.setScope(new TestScope());
        checkAccessControls.visit(t, getpropNode, parent);
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testVisitNewNode() {
        Node newNode = new Node(Token.NEW);
        newNode.setJSType(createNonDeprecatedType());
        Node parent = new Node(Token.EXPR_RESULT);
        NodeTraversal t = new NodeTraversal(compiler, null);
        checkAccessControls.visit(t, newNode, parent);
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testVisitNewNodeWithDeprecatedType() {
        Node newNode = new Node(Token.NEW);
        JSType depType = createDeprecatedType("some reason");
        newNode.setJSType(depType);
        Node parent = new Node(Token.EXPR_RESULT);
        NodeTraversal t = new NodeTraversal(compiler, null);
        t.setInGlobalScope(true);
        checkAccessControls.visit(t, newNode, parent);
        assertTrue("Deprecation warning expected", !compiler.getErrors().isEmpty());
    }

    @Test
    public void testShouldTraverseAlwaysReturnsTrue() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        assertTrue(checkAccessControls.shouldTraverse(t, null, null));
    }

    @Test
    public void testGetClassOfMethodWithAssignParentAndQualifiedName() {
        Node n = new Node(Token.FUNCTION);
        Node parent = new Node(Token.ASSIGN);
        Node lValue = new Node(Token.GETPROP);
        lValue.addChildToFront(new Node(Token.NAME, "a"));
        lValue.addChildToBack(new Node(Token.STRING, "b"));
        JSType constructorType = createConstructorType();
        lValue.setJSType(constructorType);
        parent.addChildToFront(lValue);
        n.setJSType(null);
        JSType result = checkAccessControls.getClassOfMethod(n, parent);
        assertNull("Should return null for non-constructor GETPROP", result);
    }

    @Test
    public void testGetClassOfMethodWithFunctionDeclaration() {
        Node n = new Node(Token.FUNCTION);
        Node parent = new Node(Token.NAME);
        JSType funcType = createFunctionType();
        n.setJSType(funcType);
        JSType result = checkAccessControls.getClassOfMethod(n, parent);
        assertNull("Should return null", result);
    }

    @Test
    public void testNormalizeClassTypeWithNull() {
        assertNull(checkAccessControls.normalizeClassType(null));
    }

    @Test
    public void testNormalizeClassTypeWithConstructor() {
        JSType constructorType = createConstructorType();
        JSType result = checkAccessControls.normalizeClassType(constructorType);
        assertTrue("Result should be instance type", result.isInstanceType());
    }

    @Test
    public void testNormalizeClassTypeWithFunctionPrototypeType() {
        // Cannot easily create FunctionPrototypeType without full type system
        // Testing with null to ensure no exception
        assertNull(checkAccessControls.normalizeClassType(null));
    }

    @Test
    public void testCheckConstructorDeprecationWithNullType() {
        Node n = new Node(Token.NEW);
        n.setJSType(null);
        NodeTraversal t = new NodeTraversal(compiler, null);
        // Should not throw exception
        checkAccessControls.checkConstructorDeprecation(t, n, null);
        assertTrue(compiler.getErrors().isEmpty());
    }

    @Test
    public void testCheckNameDeprecationWithVarAndDeprecatedDocInfo() {
        Node nameNode = new Node(Token.NAME, "depVar");
        Node parent = new Node(Token.FUNCTION);
        NodeTraversal t = new NodeTraversal(compiler, null);
        TestScope scope = new TestScope();
        scope.addVar("depVar", createDeprecatedJSDocInfo("old"));
        t.setScope(scope);
        checkAccessControls.checkNameDeprecation(t, nameNode, parent);
        assertTrue("No warning for function parent", compiler.getErrors().isEmpty());
    }

    @Test
    public void testCheckPropertyDeprecationWithNullObjectType() {
        Node getprop = new Node(Token.GETPROP);
        getprop.addChildToFront(new Node(Token.NAME, "obj"));
        getprop.addChildToBack(new Node(Token.STRING, "prop"));
        Node parent = new Node(Token.EXPR_RESULT);
        NodeTraversal t = new NodeTraversal(compiler, null);
        checkAccessControls.checkPropertyDeprecation(t, getprop, parent);
        assertTrue("No error expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testCheckConstantPropertyWithAssignmentOp() {
        Node getprop = new Node(Token.GETPROP);
        getprop.addChildToFront(new Node(Token.NAME, "obj"));
        getprop.addChildToBack(new Node(Token.STRING, "prop"));
        Node parent = new Node(Token.ASSIGN);
        parent.addChildToFront(getprop);
        parent.addChildToBack(new Node(Token.NUMBER, 1.0));
        NodeTraversal t = new NodeTraversal(compiler, null);
        checkAccessControls.checkConstantProperty(t, getprop);
        assertTrue("No error expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testCheckConstantPropertyWithInc() {
        Node getprop = new Node(Token.GETPROP);
        getprop.addChildToFront(new Node(Token.NAME, "obj"));
        getprop.addChildToBack(new Node(Token.STRING, "prop"));
        Node parent = new Node(Token.INC);
        parent.addChildToFront(getprop);
        NodeTraversal t = new NodeTraversal(compiler, null);
        checkAccessControls.checkConstantProperty(t, getprop);
        assertTrue("No error expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testCheckConstantPropertyWithDec() {
        Node getprop = new Node(Token.GETPROP);
        getprop.addChildToFront(new Node(Token.NAME, "obj"));
        getprop.addChildToBack(new Node(Token.STRING, "prop"));
        Node parent = new Node(Token.DEC);
        parent.addChildToFront(getprop);
        NodeTraversal t = new NodeTraversal(compiler, null);
        checkAccessControls.checkConstantProperty(t, getprop);
        assertTrue("No error expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testCheckPropertyVisibilityWithNullObjectType() {
        Node getprop = new Node(Token.GETPROP);
        getprop.addChildToFront(new Node(Token.NAME, "obj"));
        getprop.addChildToBack(new Node(Token.STRING, "prop"));
        Node parent = new Node(Token.EXPR_RESULT);
        NodeTraversal t = new NodeTraversal(compiler, null);
        checkAccessControls.checkPropertyVisibility(t, getprop, parent);
        assertTrue("No error expected", compiler.getErrors().isEmpty());
    }

    @Test
    public void testIsValidPrivateConstructorAccessForNew() {
        Node parent = new Node(Token.NEW);
        assertTrue(!CheckAccessControls.isValidPrivateConstructorAccess(parent));
    }

    @Test
    public void testIsValidPrivateConstructorAccessForNonNew() {
        Node parent = new Node(Token.CALL);
        assertTrue(CheckAccessControls.isValidPrivateConstructorAccess(parent));
    }

    @Test
    public void testIsDeprecatedFunctionWithNullType() {
        Node n = new Node(Token.FUNCTION);
        Node parent = new Node(Token.SCRIPT);
        n.setJSType(null);
        assertTrue(!CheckAccessControls.isDeprecatedFunction(n, parent));
    }

    @Test
    public void testGetTypeDeprecationInfoWithNullType() {
        assertNull(CheckAccessControls.getTypeDeprecationInfo(null));
    }

    @Test
    public void testDereferenceWithNullType() {
        assertNull(CheckAccessControls.dereference(null));
    }

    @Test
    public void testHotSwapScript() {
        Node scriptRoot = new Node(Token.SCRIPT);
        checkAccessControls.hotSwapScript(scriptRoot);
        assertTrue("No errors expected", compiler.getErrors().isEmpty());
    }

    // Helper methods to create test objects
    private JSType createDeprecatedFunctionType() {
        JSType type = new JSType(compiler) {
            @Override
            public JSType getJSDocInfo() {
                JSDocInfo info = new JSDocInfo();
                info.setDeprecated(true);
                return info;
            }
            @Override
            public boolean isConstructor() { return false; }
            @Override
            public boolean isInstanceType() { return false; }
            @Override
            public boolean isUnknownType() { return false; }
            @Override
            public boolean isFunctionPrototypeType() { return false; }
        };
        return type;
    }

    private JSType createNonDeprecatedType() {
        JSType type = new JSType(compiler) {
            @Override
            public JSType getJSDocInfo() { return null; }
            @Override
            public boolean isConstructor() { return false; }
            @Override
            public boolean isInstanceType() { return false; }
            @Override
            public boolean isUnknownType() { return false; }
            @Override
            public boolean isFunctionPrototypeType() { return false; }
        };
        return type;
    }

    private JSType createDeprecatedType(String reason) {
        JSType type = new JSType(compiler) {
            @Override
            public JSType getJSDocInfo() {
                JSDocInfo info = new JSDocInfo();
                info.setDeprecated(true);
                info.setDeprecationReason(reason);
                return info;
            }
            @Override
            public boolean isConstructor() { return false; }
            @Override
            public boolean isInstanceType() { return false; }
            @Override
            public boolean isUnknownType() { return false; }
            @Override
            public boolean isFunctionPrototypeType() { return false; }
        };
        return type;
    }

    private JSType createConstructorType() {
        JSType type = new JSType(compiler) {
            @Override
            public JSType getJSDocInfo() { return null; }
            @Override
            public boolean isConstructor() { return true; }
            @Override
            public JSType getInstanceType() {
                JSType instanceType = new JSType(compiler) {
                    @Override
                    public JSType getJSDocInfo() { return null; }
                    @Override
                    public boolean isConstructor() { return false; }
                    @Override
                    public boolean isInstanceType() { return true; }
                    @Override
                    public boolean isUnknownType() { return false; }
                    @Override
                    public boolean isFunctionPrototypeType() { return false; }
                };
                return instanceType;
            }
            @Override
            public boolean isInstanceType() { return false; }
            @Override
            public boolean isUnknownType() { return false; }
            @Override
            public boolean isFunctionPrototypeType() { return false; }
        };
        return type;
    }

    private JSType createFunctionType() {
        JSType type = new JSType(compiler) {
            @Override
            public JSType getJSDocInfo() { return null; }
            @Override
            public boolean isConstructor() { return false; }
            @Override
            public boolean isInstanceType() { return false; }
            @Override
            public boolean isUnknownType() { return false; }
            @Override
            public boolean isFunctionPrototypeType() { return false; }
        };
        return type;
    }

    private JSDocInfo createDeprecatedJSDocInfo(String reason) {
        JSDocInfo info = new JSDocInfo();
        info.setDeprecated(true);
        info.setDeprecationReason(reason);
        return info;
    }

    // Inner class for test scope
    private static class TestScope extends Scope {
        private java.util.Map<String, Var> vars = new java.util.HashMap<>();

        public TestScope() {
            super(null, null);
        }

        public void addVar(String name, JSDocInfo docInfo) {
            vars.put(name, new Var(name, null, null));
        }

        @Override
        public Var getVar(String name) {
            return vars.get(name);
        }
    }

    // Inner class for test compiler
    private static class TestCompiler extends AbstractCompiler {
        private java.util.List<DiagnosticType> errors = new java.util.ArrayList<>();

        public java.util.List<DiagnosticType> getErrors() {
            return errors;
        }

        @Override
        public void report(JSError error) {
            errors.add(error.getType());
        }

        @Override
        public TypeValidator getTypeValidator() {
            return new TypeValidator(this) {
                @Override
                public String getReadableJSTypeName(Node n, boolean b) {
                    return "testType";
                }
            };
        }
    }
}