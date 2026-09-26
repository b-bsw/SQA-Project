package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class MinimizeExitPointsTest {
    private MinimizeExitPoints minimizer;
    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        minimizer = new MinimizeExitPoints(compiler);
    }

    @Test
    public void testReturnWithoutValueRemoved() {
        Node block = IR.block();
        block.addChildToBack(IR.returnNode());
        Node body = IR.block(block);
        int before = compiler.getChangeCount();
        minimizer.tryMinimizeExits(body, Token.RETURN, null);
        assertTrue(compiler.getChangeCount() > before);
        assertFalse(block.hasChildren());
    }

    @Test
    public void testReturnWithValueNotRemoved() {
        Node returnNode = IR.returnNode(IR.number(0));
        Node block = IR.block(returnNode);
        Node body = IR.block(block);
        int before = compiler.getChangeCount();
        minimizer.tryMinimizeExits(body, Token.RETURN, null);
        assertEquals(before, compiler.getChangeCount());
        assertTrue(block.hasChildren());
        assertSame(returnNode, block.getFirstChild());
    }

    @Test
    public void testIfTrueBlockHasReturnMovesSiblingsToFalseBlock() {
        Node body = IR.block();
        Node cond = IR.trueNode();
        Node trueBlock = IR.block(IR.returnNode());
        Node ifNode = IR.ifNode(cond, trueBlock);
        body.addChildToBack(ifNode);
        Node stmtFoo = IR.var(IR.name("foo"), IR.number(0));
        body.addChildToBack(stmtFoo);

        int before = compiler.getChangeCount();
        minimizer.tryMinimizeExits(body, Token.RETURN, null);
        assertTrue(compiler.getChangeCount() > before);

        Node falseBlock = ifNode.getLastChild();
        assertNotNull(falseBlock);
        assertTrue(falseBlock.isBlock());
        assertTrue(falseBlock.hasChildren());
        assertSame(stmtFoo, falseBlock.getLastChild());
        assertNull(stmtFoo.getParent());
    }

    @Test
    public void testIfFalseBlockHasReturnMovesSiblingsToTrueBlock() {
        Node body = IR.block();
        Node cond = IR.trueNode();
        Node trueBlock = IR.block();
        Node falseBlock = IR.block(IR.returnNode());
        Node ifNode = IR.ifNode(cond, trueBlock);
        ifNode.addChildToBack(falseBlock);
        body.addChildToBack(ifNode);
        Node stmtFoo = IR.var(IR.name("foo"), IR.number(0));
        body.addChildToBack(stmtFoo);

        int before = compiler.getChangeCount();
        minimizer.tryMinimizeExits(body, Token.RETURN, null);
        assertTrue(compiler.getChangeCount() > before);

        Node newTrueBlock = ifNode.getFirstChild().getNext();
        assertNotNull(newTrueBlock);
        assertTrue(newTrueBlock.isBlock());
        assertTrue(newTrueBlock.hasChildren());
        assertSame(stmtFoo, newTrueBlock.getLastChild());
        assertNull(stmtFoo.getParent());
    }

    @Test
    public void testIfOnlyExitNoSiblingRemovesReturn() {
        Node body = IR.block();
        Node cond = IR.trueNode();
        Node trueBlock = IR.block(IR.returnNode());
        Node ifNode = IR.ifNode(cond, trueBlock);
        body.addChildToBack(ifNode);

        int before = compiler.getChangeCount();
        minimizer.tryMinimizeExits(body, Token.RETURN, null);
        assertTrue(compiler.getChangeCount() > before);
        assertTrue(!trueBlock.hasChildren() || trueBlock.getFirstChild().getType() != Token.RETURN);
        assertSame(ifNode, body.getFirstChild());
    }

    @Test
    public void testLabelRemovesExit() {
        Node body = IR.block();
        Node innerBlock = IR.block();
        innerBlock.addChildToBack(IR.returnNode());
        Node label = IR.labelNode("L", innerBlock);
        body.addChildToBack(label);
        Node stmtFoo = IR.var(IR.name("foo"), IR.number(0));
        body.addChildToBack(stmtFoo);

        int before = compiler.getChangeCount();
        minimizer.tryMinimizeExits(body, Token.RETURN, null);
        assertTrue(compiler.getChangeCount() > before);
        assertTrue(innerBlock.getLastChild() == null || innerBlock.getLastChild().getType() != Token.RETURN);
    }

    @Test
    public void testBlockLastChildExitRemoved() {
        Node body = IR.block();
        Node stmt1 = IR.var(IR.name("a"), IR.number(1));
        body.addChildToBack(stmt1);
        body.addChildToBack(IR.returnNode());

        int before = compiler.getChangeCount();
        minimizer.tryMinimizeExits(body, Token.RETURN, null);
        assertTrue(compiler.getChangeCount() > before);
        Node last = body.getLastChild();
        assertNotNull(last);
        assertNotEquals(Token.RETURN, last.getType());
        assertSame(stmt1, last);
    }

    @Test
    public void testTryCatchFinally() {
        Node tryBlock = IR.block(IR.returnNode());
        Node catchBlock = IR.block(IR.returnNode());
        Node finallyBlock = IR.block(IR.returnNode());
        Node tryNode = IR.tryNode(tryBlock, catchBlock, finallyBlock);
        Node body = IR.block(tryNode);

        int before = compiler.getChangeCount();
        minimizer.tryMinimizeExits(body, Token.RETURN, null);
        assertTrue(compiler.getChangeCount() > before);
        assertTrue(!tryBlock.hasChildren() || tryBlock.getFirstChild().getType() != Token.RETURN);
        assertTrue(!catchBlock.hasChildren() || catchBlock.getFirstChild().getType() != Token.RETURN);
        assertTrue(finallyBlock.hasChildren() && finallyBlock.getFirstChild().getType() == Token.RETURN);
    }
}