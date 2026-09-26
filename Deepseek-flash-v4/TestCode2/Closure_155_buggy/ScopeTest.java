package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Test;

public class ScopeTest {

    private static Node nameNode(String name) {
        return Node.newString(Token.NAME, name);
    }

    private static Scope newGlobal() {
        return new Scope(new Node(Token.SCRIPT), (ObjectType) null);
    }

    private static Scope newChild(Scope parent) {
        return new Scope(parent, new Node(Token.SCRIPT));
    }

    @Test
    public void testScopes() {
        Node root = new Node(Token.SCRIPT);
        Scope global = new Scope(root, (ObjectType) null);

        assertSame(root, global.getRootNode());
        assertNull(global.getParent());
        assertNull(global.getTypeOfThis());
        assertEquals(0, global.getDepth());
        assertTrue(global.isGlobal());
        assertFalse(global.isLocal());
        assertTrue(global.isBottom());

        Scope child = newChild(global);

        assertFalse(child.isGlobal());
        assertTrue(child.isLocal());
        assertFalse(child.isBottom());
        assertEquals(1, child.getDepth());
        assertSame(global, child.getParent());
        assertSame(global, child.getParentScope());
        assertSame(global, child.getGlobalScope());

        Scope grandChild = newChild(child);
        assertSame(global, grandChild.getGlobalScope());
    }

    @Test
    public void testDeclareAndUndeclare() {
        Scope scope = newGlobal();
        Node name = nameNode("x");

        Scope.Var var = scope.declare("x", name, null, null);

        assertEquals(1, scope.getVarCount());
        assertSame(var, scope.getVar("x"));
        assertSame(var, scope.getOwnSlot("x"));
        assertSame(var, scope.getSlot("x"));
        assertTrue(scope.isDeclared("x", false));
        assertSame(var, scope.getVars().next());
        assertNull(scope.getVar("y"));

        scope.undeclare(var);

        assertEquals(0, scope.getVarCount());
        assertNull(scope.getVar("x"));
        assertNull(scope.getOwnSlot("x"));
        assertFalse(scope.isDeclared("x", false));
        assertFalse(scope.getVars().hasNext());
    }

    @Test
    public void testVarLookupWalksUpScope() {
        Scope global = newGlobal();
        Scope child = newChild(global);
        Scope grandChild = newChild(child);

        Scope.Var globalVar = global.declare("x", nameNode("x"), null, null);

        assertFalse(child.isDeclared("x", false));
        assertFalse(grandChild.isDeclared("x", false));
        assertTrue(child.isDeclared("x", true));
        assertTrue(grandChild.isDeclared("x", true));

        assertSame(globalVar, child.getVar("x"));
        assertSame(globalVar, grandChild.getSlot("x"));
        assertNull(child.getOwnSlot("x"));
    }

    @Test
    public void testVarBasics() {
        Scope scope = newGlobal();
        Node name = nameNode("x");

        Scope.Var var = scope.declare("x", name, null, null);

        assertEquals("x", var.getName());
        assertSame(name, var.getNameNode());
        assertNull(var.getParentNode());
        assertNull(var.getType());
        assertNull(var.getJSDocInfo());
        assertTrue(var.isTypeInferred());
        assertTrue(var.isGlobal());
        assertFalse(var.isLocal());
        assertTrue(var.isExtern());
        assertFalse(var.isConst());
        assertFalse(var.isDefine());
        assertFalse(var.isNoShadow());
        assertEquals("<non-file>", var.getInputName());
        assertEquals("Scope.Var x", var.toString());
    }

    @Test
    public void testVarEqualityAndHashCode() {
        Scope scope1 = newGlobal();
        Scope scope2 = newGlobal();

        Node sharedName = nameNode("x");
        Scope.Var var1 = scope1.declare("x", sharedName, null, null);
        Scope.Var var2 = scope2.declare("x", sharedName, null, null);

        assertTrue(var1.equals(var1));
        assertTrue(var1.equals(var2));
        assertEquals(var1.hashCode(), var2.hashCode());

        assertFalse(var1.equals(null));
        assertFalse(var1.equals("x"));

        Scope.Var other = scope2.declare("y", nameNode("y"), null, null);
        assertFalse(var1.equals(other));
    }

    @Test
    public void testVarGetInitialValueVarBranch() {
        Scope scope = newGlobal();
        Node name = nameNode("x");
        Node init = Node.newNumber(1);
        Node varNode = new Node(Token.VAR);
        varNode.addChildToBack(name);
        name.addChildToBack(init);

        Scope.Var var = scope.declare("x", name, null, null);

        assertSame(varNode, var.getParentNode());
        assertSame(init, var.getInitialValue());
    }

    @Test
    public void testVarGetInitialValueAssignBranch() {
        Scope scope = newGlobal();
        Node name = nameNode("x");
        Node value = Node.newNumber(2);
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(name);
        assign.addChildToBack(value);

        Scope.Var var = scope.declare("x", name, null, null);

        assertSame(assign, var.getParentNode());
        assertSame(value, var.getInitialValue());
    }

    @Test
    public void testVarGetInitialValueFunctionBranch() {
        Scope scope = newGlobal();
        Node name = nameNode("f");
        Node function = new Node(Token.FUNCTION);
        function.addChildToBack(name);

        Scope.Var var = scope.declare("f", name, null, null);

        assertSame(function, var.getParentNode());
        assertSame(function, var.getInitialValue());
    }

    @Test
    public void testVarGetInitialValueDefaultBranch() {
        Scope scope = newGlobal();
        Node name = nameNode("x");
        Node expr = new Node(Token.EXPR_RESULT);
        expr.addChildToBack(name);

        Scope.Var var = scope.declare("x", name, null, null);

        assertSame(expr, var.getParentNode());
        assertNull(var.getInitialValue());
    }

    @Test
    public void testSetTypeRequiresInferred() {
        Scope scope = newGlobal();
        Scope.Var var = scope.declare("x", nameNode("x"), null, null, false);

        assertFalse(var.isTypeInferred());

        try {
            var.setType(null);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void testDuplicateDeclarationRejected() {
        Scope scope = newGlobal();
        scope.declare("x", nameNode("x"), null, null);
        scope.declare("x", nameNode("x2"), null, null);
    }

    @Test
    public void testUndeclareRejectsForeignVar() {
        Scope scope1 = newGlobal();
        Scope scope2 = newGlobal();

        Scope.Var var = scope1.declare("x", nameNode("x"), null, null);

        try {
            scope2.undeclare(var);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChildConstructorRejectsSameRoot() {
        Scope parent = newGlobal();
        new Scope(parent, parent.getRootNode());
    }
}