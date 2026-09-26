package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import java.util.List;

public class TypedScopeCreatorTest {

    private AbstractCompiler compiler;
    private JSTypeRegistry typeRegistry;
    private CodingConvention codingConvention;
    private TypedScopeCreator creator;

    @Before
    public void setUp() {
        ErrorReporter errorReporter = new ErrorReporter() {
            @Override public void warning(String message, String sourceName, int line, int lineOffset) {}
            @Override public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        typeRegistry = new JSTypeRegistry(errorReporter);
        codingConvention = new CodingConvention() {
            @Override public String identifyTypeDefAssign(Node n) { return null; }
            @Override public SubclassRelationship getClassesDefinedByCall(Node n) { return null; }
            @Override public String getSingletonGetterClassName(Node n) { return null; }
            @Override public DelegateRelationship getDelegateRelationship(Node n) { return null; }
            @Override public ObjectLiteralCast getObjectLiteralCast(NodeTraversal t, Node n) { return null; }
            @Override public void applyDelegateRelationship(ObjectType delegateSuperObject, ObjectType delegateBaseObject, ObjectType delegatorObject, FunctionType delegateProxy, FunctionType findDelegate) {}
            @Override public void applySubclassRelationship(FunctionType superCtor, FunctionType subCtor, SubclassType type) {}
            @Override public void applySingletonGetter(FunctionType functionType, FunctionType getterType, ObjectType objectType) {}
            @Override public String getDelegateSuperclassName() { return null; }
            @Override public boolean isValidEnumKey(String key) { return true; }
            @Override public void defineDelegateProxyPrototypeProperties(JSTypeRegistry registry, Scope scope, List<ObjectType> delegateProxyPrototypes) {}
        };
        compiler = new AbstractCompiler() {
            @Override public JSTypeRegistry getTypeRegistry() { return typeRegistry; }
            @Override public TypeValidator getTypeValidator() { return new TypeValidator(this, typeRegistry); }
            @Override public CodingConvention getCodingConvention() { return codingConvention; }
            @Override public CompilerInput getInput(String sourceName) { return null; }
        };
        creator = new TypedScopeCreator(compiler);
    }

    @Test
    public void testCreateInitialScope_containsNativeTypes() {
        Node root = new Node(Token.SCRIPT);
        Scope scope = creator.createInitialScope(root);
        assertNotNull(scope);
        assertNotNull("Array", scope.getVar("Array"));
        assertNotNull("Object", scope.getVar("Object"));
        assertNotNull("Function", scope.getVar("Function"));
        assertNotNull("Boolean", scope.getVar("Boolean"));
        assertNotNull("undefined", scope.getVar("undefined"));
        assertNotNull("ActiveXObject", scope.getVar("ActiveXObject"));
    }

    @Test
    public void testCreateScope_global() {
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "x");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.isGlobal());
        assertNotNull(scope.getVar("x"));
    }

    @Test
    public void testCreateScope_local() {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope parent = new Scope(globalRoot, compiler);
        parent.declare("a", null, typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), null, false);

        Node functionNode = new Node(Token.FUNCTION);
        Node fnName = Node.newString(Token.NAME, "f");
        functionNode.addChildToFront(fnName);
        Node lp = new Node(Token.LP);
        functionNode.addChildAfter(lp, fnName);
        Node block = new Node(Token.BLOCK);
        functionNode.addChildAfter(block, lp);
        Node varNode = new Node(Token.VAR);
        Node localVar = Node.newString(Token.NAME, "b");
        varNode.addChildToBack(localVar);
        block.addChildToBack(varNode);

        Scope scope = creator.createScope(functionNode, parent);
        assertNotNull(scope);
        assertFalse(scope.isGlobal());
        assertNotNull(scope.getVar("b"));
        assertNotNull(scope.getVar("a"));
        assertNotNull(scope.getVar("f"));
    }

    @Test
    public void testAttachLiteralTypes() {
        Node root = new Node(Token.SCRIPT);
        Node nullNode = new Node(Token.NULL);
        root.addChildToBack(nullNode);
        Node numNode = new Node(Token.NUMBER, 42.0);
        root.addChildToBack(numNode);
        Node strNode = Node.newString(Token.STRING, "hello");
        root.addChildToBack(strNode);
        Node trueNode = new Node(Token.TRUE);
        root.addChildToBack(trueNode);
        Node falseNode = new Node(Token.FALSE);
        root.addChildToBack(falseNode);
        Node regexpNode = new Node(Token.REGEXP);
        root.addChildToBack(regexpNode);
        Node refSpecialNode = new Node(Token.REF_SPECIAL);
        root.addChildToBack(refSpecialNode);
        Node objectLitNode = new Node(Token.OBJECTLIT);
        root.addChildToBack(objectLitNode);

        creator.createScope(root, null);

        assertEquals(typeRegistry.getNativeType(JSTypeNative.NULL_TYPE), nullNode.getJSType());
        assertEquals(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), numNode.getJSType());
        assertEquals(typeRegistry.getNativeType(JSTypeNative.STRING_TYPE), strNode.getJSType());
        assertEquals(typeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE), trueNode.getJSType());
        assertEquals(typeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE), falseNode.getJSType());
        assertEquals(typeRegistry.getNativeType(JSTypeNative.REGEXP_TYPE), regexpNode.getJSType());
        assertEquals(typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE), refSpecialNode.getJSType());
        assertNotNull(objectLitNode.getJSType());
    }
}