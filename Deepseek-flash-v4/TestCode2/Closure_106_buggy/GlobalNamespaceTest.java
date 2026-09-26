package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import java.util.*;

public class GlobalNamespaceTest {
    private AbstractCompiler compiler;
    private Node root;
    
    @Before
    public void setUp() {
        compiler = new Compiler();
    }

    @Test
    public void testEmptyRoot() {
        root = new Node(Token.BLOCK);
        GlobalNamespace gn = new GlobalNamespace(compiler, root);
        List<GlobalNamespace.Name> forest = gn.getNameForest();
        assertTrue(forest.isEmpty());
        Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
        assertTrue(index.isEmpty());
    }

    @Test
    public void testSimpleGlobalVar() {
        Node script = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "a");
        Node numberNode = Node.newNumber(1);
        nameNode.addChildToFront(numberNode);
        varNode.addChildToFront(nameNode);
        script.addChildToFront(varNode);
        GlobalNamespace gn = new GlobalNamespace(compiler, script);
        gn.getNameForest();
        Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
        assertTrue(index.containsKey("a"));
        GlobalNamespace.Name nameObj = index.get("a");
        assertNotNull(nameObj);
        assertEquals("a", nameObj.name);
        assertEquals(1, nameObj.globalSets);
        assertEquals(0, nameObj.localSets);
    }

    @Test
    public void testSimpleGlobalFunction() {
        Node script = new Node(Token.SCRIPT);
        Node funcNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, "f");
        Node paramList = new Node(Token.PARAM_LIST);
        Node block = new Node(Token.BLOCK);
        funcNode.addChildToFront(nameNode);
        funcNode.addChildToFront(paramList);
        funcNode.addChildToFront(block);
        script.addChildToFront(funcNode);
        GlobalNamespace gn = new GlobalNamespace(compiler, script);
        gn.getNameForest();
        Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
        assertTrue(index.containsKey("f"));
        GlobalNamespace.Name nameObj = index.get("f");
        assertEquals(1, nameObj.globalSets);
        assertEquals(GlobalNamespace.Name.Type.FUNCTION, nameObj.type);
    }

    @Test
    public void testGlobalVarWithGet() {
        Node script = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "x");
        Node numberNode = Node.newNumber(5);
        nameNode.addChildToFront(numberNode);
        varNode.addChildToFront(nameNode);
        script.addChildToFront(varNode);
        Node assignNode = new Node(Token.ASSIGN);
        Node getNode = Node.newString(Token.NAME, "x");
        Node assignValue = Node.newNumber(10);
        assignNode.addChildToFront(getNode);
        assignNode.addChildToFront(assignValue);
        script.addChildToFront(new Node(Token.EXPR_RESULT, assignNode));
        GlobalNamespace gn = new GlobalNamespace(compiler, script);
        gn.getNameForest();
        Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
        assertTrue(index.containsKey("x"));
        GlobalNamespace.Name nameObj = index.get("x");
        assertEquals(2, nameObj.globalSets);
    }

    @Test
    public void testGlobalVarWithMultipleGets() {
        Node script = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "y");
        Node numberNode = Node.newNumber(100);
        nameNode.addChildToFront(numberNode);
        varNode.addChildToFront(nameNode);
        script.addChildToFront(varNode);
        Node getNode = new Node(Token.GETPROP);
        Node nameRef = Node.newString(Token.NAME, "y");
        Node propString = Node.newString("z");
        getNode.addChildToFront(nameRef);
        getNode.addChildToFront(propString);
        script.addChildToFront(new Node(Token.EXPR_RESULT, getNode));
        GlobalNamespace gn = new GlobalNamespace(compiler, script);
        gn.getNameForest();
        Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
        assertTrue(index.containsKey("y"));
        GlobalNamespace.Name nameObj = index.get("y");
        assertEquals(1, nameObj.globalSets);
        assertTrue(nameObj.totalGets >= 0);
    }

    @Test
    public void testNullRoot() {
        try {
            GlobalNamespace gn = new GlobalNamespace(compiler, (Node) null);
            gn.getNameForest();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testGlobalVarWithLocalSet() {
        Node script = new Node(Token.SCRIPT);
        Node funcNode = new Node(Token.FUNCTION);
        Node funcName = Node.newString(Token.NAME, "myFunc");
        Node paramList = new Node(Token.PARAM_LIST);
        Node block = new Node(Token.BLOCK);
        Node localAssign = new Node(Token.ASSIGN);
        Node localName = Node.newString(Token.NAME, "a");
        Node localValue = Node.newNumber(42);
        localAssign.addChildToFront(localName);
        localAssign.addChildToFront(localValue);
        block.addChildToFront(new Node(Token.EXPR_RESULT, localAssign));
        funcNode.addChildToFront(funcName);
        funcNode.addChildToFront(paramList);
        funcNode.addChildToFront(block);
        script.addChildToFront(funcNode);
        GlobalNamespace gn = new GlobalNamespace(compiler, script);
        gn.getNameForest();
        Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
        assertFalse(index.containsKey("a"));
    }

    @Test
    public void testObjectLiteralDeclaration() {
        Node script = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "obj");
        Node objectLit = new Node(Token.OBJECTLIT);
        Node keyNode = Node.newString(Token.STRING, "prop");
        Node valueNode = Node.newNumber(1);
        objectLit.addChildToFront(keyNode);
        objectLit.addChildToFront(valueNode);
        nameNode.addChildToFront(objectLit);
        varNode.addChildToFront(nameNode);
        script.addChildToFront(varNode);
        GlobalNamespace gn = new GlobalNamespace(compiler, script);
        gn.getNameForest();
        Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
        assertTrue(index.containsKey("obj"));
        GlobalNamespace.Name nameObj = index.get("obj");
        assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, nameObj.type);
    }

    @Test
    public void testChainedGetProp() {
        Node script = new Node(Token.SCRIPT);
        Node assignNode = new Node(Token.ASSIGN);
        Node getProp1 = new Node(Token.GETPROP);
        Node getProp2 = new Node(Token.GETPROP);
        Node nameNode = Node.newString(Token.NAME, "a");
        Node prop1 = Node.newString("b");
        Node prop2 = Node.newString("c");
        Node value = Node.newNumber(1);
        getProp2.addChildToFront(getProp1);
        getProp2.addChildToFront(prop2);
        getProp1.addChildToFront(nameNode);
        getProp1.addChildToFront(prop1);
        assignNode.addChildToFront(getProp2);
        assignNode.addChildToFront(value);
        script.addChildToFront(new Node(Token.EXPR_RESULT, assignNode));
        GlobalNamespace gn = new GlobalNamespace(compiler, script);
        gn.getNameForest();
        Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
        assertTrue(index.containsKey("a"));
        assertTrue(index.containsKey("a.b"));
        assertTrue(index.containsKey("a.b.c"));
    }

    @Test
    public void testPrototypeAssignment() {
        Node script = new Node(Token.SCRIPT);
        Node assignNode = new Node(Token.ASSIGN);
        Node getPropNode = new Node(Token.GETPROP);
        Node getProp2 = new Node(Token.GETPROP);
        Node nameNode = Node.newString(Token.NAME, "Foo");
        Node prototypeProp = Node.newString("prototype");
        Node methodProp = Node.newString("method");
        Node funcNode = new Node(Token.FUNCTION);
        Node funcName = Node.newString(Token.NAME, "");
        Node paramList = new Node(Token.PARAM_LIST);
        Node block = new Node(Token.BLOCK);
        funcNode.addChildToFront(funcName);
        funcNode.addChildToFront(paramList);
        funcNode.addChildToFront(block);
        getProp2.addChildToFront(getPropNode);
        getProp2.addChildToFront(methodProp);
        getPropNode.addChildToFront(nameNode);
        getPropNode.addChildToFront(prototypeProp);
        assignNode.addChildToFront(getProp2);
        assignNode.addChildToFront(funcNode);
        script.addChildToFront(new Node(Token.EXPR_RESULT, assignNode));
        GlobalNamespace gn = new GlobalNamespace(compiler, script);
        gn.getNameForest();
        Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
        assertTrue(index.containsKey("Foo"));
        assertTrue(index.containsKey("Foo.prototype"));
        assertTrue(index.containsKey("Foo.prototype.method"));
    }

    @Test
    public void testCanCollapseWithGets() {
        Node script = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "x");
        Node numNode = Node.newNumber(0);
        nameNode.addChildToFront(numNode);
        varNode.addChildToFront(nameNode);
        script.addChildToFront(varNode);
        Node getNode = Node.newString(Token.NAME, "x");
        script.addChildToFront(new Node(Token.EXPR_RESULT, getNode));
        GlobalNamespace gn = new GlobalNamespace(compiler, script);
        gn.getNameForest();
        Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
        GlobalNamespace.Name nameObj = index.get("x");
        assertEquals(1, nameObj.globalSets);
        assertTrue(nameObj.totalGets > 0);
        assertFalse(nameObj.canEliminate());
    }

    @Test
    public void testCanCollapseWithProps() {
        Node script = new Node(Token.SCRIPT);
        Node assignNode = new Node(Token.ASSIGN);
        Node getProp1 = new Node(Token.GETPROP);
        Node nameNode = Node.newString(Token.NAME, "a");
        Node prop1 = Node.newString("b");
        Node value = Node.newNumber(1);
        getProp1.addChildToFront(nameNode);
        getProp1.addChildToFront(prop1);
        assignNode.addChildToFront(getProp1);
        assignNode.addChildToFront(value);
        script.addChildToFront(new Node(Token.EXPR_RESULT, assignNode));
        GlobalNamespace gn = new GlobalNamespace(compiler, script);
        gn.getNameForest();
        Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
        GlobalNamespace.Name nameObjA = index.get("a");
        assertNotNull(nameObjA);
        GlobalNamespace.Name nameObjB = index.get("a.b");
        assertNotNull(nameObjB);
        assertFalse(nameObjA.canCollapse());
    }

    @Test
    public void testNeedsToBeStubbed() {
        Node script = new Node(Token.SCRIPT);
        Node funcNode = new Node(Token.FUNCTION);
        Node funcName = Node.newString(Token.NAME, "f");
        Node paramList = new Node(Token.PARAM_LIST);
        Node block = new Node(Token.BLOCK);
        Node localAssign = new Node(Token.ASSIGN);
        Node localName = Node.newString(Token.NAME, "g");
        Node localValue = Node.newNumber(1);
        localAssign.addChildToFront(localName);
        localAssign.addChildToFront(localValue);
        block.addChildToFront(new Node(Token.EXPR_RESULT, localAssign));
        funcNode.addChildToFront(funcName);
        funcNode.addChildToFront(paramList);
        funcNode.addChildToFront(block);
        script.addChildToFront(funcNode);
        GlobalNamespace gn = new GlobalNamespace(compiler, script);
        gn.getNameForest();
        Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
        GlobalNamespace.Name nameObj = index.get("f");
        assertNotNull(nameObj);
        assertEquals(1, nameObj.globalSets);
        assertEquals(0, nameObj.localSets);
        assertFalse(nameObj.needsToBeStubbed());
    }

    @Test
    public void testSetIsClassOrEnum() {
        Node script = new Node(Token.SCRIPT);
        Node assignNode = new Node(Token.ASSIGN);
        Node nameNode = Node.newString(Token.NAME, "MyClass");
        Node funcNode = new Node(Token.FUNCTION);
        Node funcName = Node.newString(Token.NAME, "");
        Node paramList = new Node(Token.PARAM_LIST);
        Node block = new Node(Token.BLOCK);
        funcNode.addChildToFront(funcName);
        funcNode.addChildToFront(paramList);
        funcNode.addChildToFront(block);
        assignNode.addChildToFront(nameNode);
        assignNode.addChildToFront(funcNode);
        script.addChildToFront(new Node(Token.EXPR_RESULT, assignNode));
        GlobalNamespace gn = new GlobalNamespace(compiler, script);
        gn.getNameForest();
        Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
        GlobalNamespace.Name nameObj = index.get("MyClass");
        assertNotNull(nameObj);
        assertFalse(nameObj.isClassOrEnum);
    }
}