package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class ControlFlowAnalysisTest {

    @Test
    public void testComputeFallThrough_Do() {
        Node doNode = new Node(Token.DO);
        Node body = new Node(Token.BLOCK);
        doNode.addChildToBack(body);
        assertSame(body, ControlFlowAnalysis.computeFallThrough(doNode));
    }

    @Test
    public void testComputeFallThrough_ForIn() {
        Node forNode = new Node(Token.FOR);
        Node init = new Node(Token.EMPTY);
        Node collection = new Node(Token.NAME);
        Node body = new Node(Token.BLOCK);
        forNode.addChildToBack(init);
        forNode.addChildToBack(collection);
        forNode.addChildToBack(body);
        assertSame(collection, ControlFlowAnalysis.computeFallThrough(forNode));
    }

    @Test
    public void testComputeFallThrough_ForNormal() {
        Node forNode = new Node(Token.FOR);
        Node init = new Node(Token.EMPTY);
        Node cond = new Node(Token.EMPTY);
        Node iter = new Node(Token.EMPTY);
        Node body = new Node(Token.BLOCK);
        forNode.addChildToBack(init);
        forNode.addChildToBack(cond);
        forNode.addChildToBack(iter);
        forNode.addChildToBack(body);
        assertSame(init, ControlFlowAnalysis.computeFallThrough(forNode));
    }

    @Test
    public void testComputeFallThrough_Label() {
        Node labelNode = new Node(Token.LABEL);
        Node name = new Node(Token.NAME, "lbl");
        Node stmt = new Node(Token.EXPR_RESULT);
        labelNode.addChildToBack(name);
        labelNode.addChildToBack(stmt);
        assertSame(stmt, ControlFlowAnalysis.computeFallThrough(labelNode));
    }

    @Test
    public void testComputeFallThrough_Default() {
        Node script = new Node(Token.SCRIPT);
        assertSame(script, ControlFlowAnalysis.computeFallThrough(script));
    }

    @Test
    public void testComputeFollowNode_ParentNull() {
        Node node = new Node(Token.EXPR_RESULT);
        assertNull(ControlFlowAnalysis.computeFollowNode(node));
    }

    @Test
    public void testComputeFollowNode_ParentIsFunction() {
        Node func = new Node(Token.FUNCTION);
        Node node = new Node(Token.EXPR_RESULT);
        func.addChildToBack(node);
        assertNull(ControlFlowAnalysis.computeFollowNode(node));
    }

    @Test
    public void testComputeFollowNode_If() {
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.EMPTY);
        Node thenBlock = new Node(Token.BLOCK);
        ifNode.addChildToBack(cond);
        ifNode.addChildToBack(thenBlock);
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(ifNode);
        assertNull(ControlFlowAnalysis.computeFollowNode(thenBlock));
    }

    @Test
    public void testComputeFollowNode_For() {
        Node forNode = new Node(Token.FOR);
        Node init = new Node(Token.EMPTY);
        Node cond = new Node(Token.EMPTY);
        Node iter = new Node(Token.EMPTY);
        Node body = new Node(Token.BLOCK);
        forNode.addChildToBack(init);
        forNode.addChildToBack(cond);
        forNode.addChildToBack(iter);
        forNode.addChildToBack(body);
        assertSame(iter, ControlFlowAnalysis.computeFollowNode(body));
    }

    @Test
    public void testComputeFollowNode_While() {
        Node whileNode = new Node(Token.WHILE);
        Node cond = new Node(Token.EMPTY);
        Node body = new Node(Token.BLOCK);
        whileNode.addChildToBack(cond);
        whileNode.addChildToBack(body);
        assertSame(whileNode, ControlFlowAnalysis.computeFollowNode(body));
    }

    @Test
    public void testComputeFollowNode_Do() {
        Node doNode = new Node(Token.DO);
        Node body = new Node(Token.BLOCK);
        Node cond = new Node(Token.EMPTY);
        doNode.addChildToBack(body);
        doNode.addChildToBack(cond);
        assertSame(doNode, ControlFlowAnalysis.computeFollowNode(body));
    }

    @Test
    public void testComputeFollowNode_TryBlockWithFinally() {
        Node tryNode = new Node(Token.TRY);
        Node tryBlock = new Node(Token.BLOCK);
        Node finallyBlock = new Node(Token.FINALLY);
        tryNode.addChildToBack(tryBlock);
        tryNode.addChildToBack(finallyBlock);
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(tryNode);
        assertSame(finallyBlock, ControlFlowAnalysis.computeFollowNode(tryBlock));
    }

    @Test
    public void testComputeFollowNode_TryBlockWithoutFinally() {
        Node tryNode = new Node(Token.TRY);
        Node tryBlock = new Node(Token.BLOCK);
        Node catchBlock = new Node(Token.CATCH);
        catchBlock.addChildToBack(new Node(Token.NAME));
        catchBlock.addChildToBack(new Node(Token.BLOCK));
        tryNode.addChildToBack(tryBlock);
        tryNode.addChildToBack(catchBlock);
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(tryNode);
        assertNull(ControlFlowAnalysis.computeFollowNode(tryBlock));
    }

    @Test
    public void testComputeFollowNode_SiblingSkipsFunction() {
        Node script = new Node(Token.SCRIPT);
        Node stmt1 = new Node(Token.EXPR_RESULT);
        Node func = new Node(Token.FUNCTION);
        Node stmt2 = new Node(Token.EXPR_RESULT);
        script.addChildToBack(stmt1);
        script.addChildToBack(func);
        script.addChildToBack(stmt2);
        assertSame(stmt2, ControlFlowAnalysis.computeFollowNode(stmt1));
    }

    @Test
    public void testMayThrowException_Call() {
        assertTrue(ControlFlowAnalysis.mayThrowException(new Node(Token.CALL)));
    }

    @Test
    public void testMayThrowException_Function() {
        assertFalse(ControlFlowAnalysis.mayThrowException(new Node(Token.FUNCTION)));
    }

    @Test
    public void testMayThrowException_RecursiveChild() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.CALL));
        assertTrue(ControlFlowAnalysis.mayThrowException(block));
    }

    @Test
    public void testMayThrowException_NoThrow() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.NUMBER));
        assertFalse(ControlFlowAnalysis.mayThrowException(block));
    }

    @Test
    public void testIsBreakStructure_UnlabeledBlock() {
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.BLOCK), false));
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.BLOCK), true));
    }

    @Test
    public void testIsBreakStructure_For() {
        assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.FOR), false));
    }

    @Test
    public void testIsBreakStructure_Other() {
        assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.EXPR_RESULT), false));
    }

    @Test
    public void testIsContinueStructure_For() {
        assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.FOR)));
    }

    @Test
    public void testIsContinueStructure_Do() {
        assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.DO)));
    }

    @Test
    public void testIsContinueStructure_While() {
        assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.WHILE)));
    }

    @Test
    public void testIsContinueStructure_Other() {
        assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.EXPR_RESULT)));
    }

    @Test
    public void testGetCatchHandlerForBlock_NoCatch() {
        Node tryNode = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        tryNode.addChildToBack(block);
        assertNull(ControlFlowAnalysis.getCatchHandlerForBlock(block));
    }

    @Test
    public void testGetCatchHandlerForBlock_WithCatch() {
        Node tryNode = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        Node catchNode = new Node(Token.CATCH);
        catchNode.addChildToBack(new Node(Token.NAME));
        Node catchBody = new Node(Token.BLOCK);
        catchNode.addChildToBack(catchBody);
        tryNode.addChildToBack(block);
        tryNode.addChildToBack(catchNode);
        assertSame(catchNode.getFirstChild(), ControlFlowAnalysis.getCatchHandlerForBlock(block));
    }

    @Test
    public void testGetExceptionHandler_InsideTry() {
        Node script = new Node(Token.SCRIPT);
        Node tryNode = new Node(Token.TRY);
        Node tryBlock = new Node(Token.BLOCK);
        Node expr = new Node(Token.EXPR_RESULT);
        Node catchNode = new Node(Token.CATCH);
        catchNode.addChildToBack(new Node(Token.NAME));
        Node catchBody = new Node(Token.BLOCK);
        catchNode.addChildToBack(catchBody);
        tryNode.addChildToBack(tryBlock);
        tryNode.addChildToBack(catchNode);
        script.addChildToBack(tryNode);
        tryBlock.addChildToBack(expr);
        assertSame(catchNode.getFirstChild(), ControlFlowAnalysis.getExceptionHandler(expr));
    }

    @Test
    public void testGetExceptionHandler_NoTry() {
        Node script = new Node(Token.SCRIPT);
        Node expr = new Node(Token.EXPR_RESULT);
        script.addChildToBack(expr);
        assertNull(ControlFlowAnalysis.getExceptionHandler(expr));
    }

    @Test
    public void testIsBreakTarget_NoLabel() {
        Node forNode = new Node(Token.FOR);
        assertTrue(ControlFlowAnalysis.isBreakTarget(forNode, null));
    }

    @Test
    public void testIsBreakTarget_LabelMatch() {
        Node labelNode = new Node(Token.LABEL);
        Node name = new Node(Token.NAME, "mylabel");
        Node forNode = new Node(Token.FOR);
        labelNode.addChildToBack(name);
        labelNode.addChildToBack(forNode);
        assertTrue(ControlFlowAnalysis.isBreakTarget(forNode, "mylabel"));
    }

    @Test
    public void testIsBreakTarget_LabelNoMatch() {
        Node labelNode = new Node(Token.LABEL);
        Node name = new Node(Token.NAME, "mylabel");
        Node forNode = new Node(Token.FOR);
        labelNode.addChildToBack(name);
        labelNode.addChildToBack(forNode);
        assertFalse(ControlFlowAnalysis.isBreakTarget(forNode, "other"));
    }
}