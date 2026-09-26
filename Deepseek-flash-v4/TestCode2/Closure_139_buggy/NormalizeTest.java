package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfo.Flag;

public class NormalizeTest {

    private Compiler compiler;
    private Normalize normalize;

    @Before
    public void setUp() {
        compiler = new Compiler();
        normalize = new Normalize(compiler, false);
    }

    @Test
    public void testSplitVar() {
        Node block = new Node(Token.BLOCK);
        Node name1 = Node.newString(Token.NAME, "a");
        name1.addChildToFront(Node.newString(Token.NUMBER, "1"));
        Node name2 = Node.newString(Token.NAME, "b");
        name2.addChildToFront(Node.newString(Token.NUMBER, "2"));
        Node var = new Node(Token.VAR);
        var.addChildToBack(name1);
        var.addChildToBack(name2);
        block.addChildToBack(var);

        normalize.process(new Node(Token.EMPTY), block);

        assertEquals(2, block.getChildCount());
        assertEquals(Token.VAR, block.getFirstChild().getType());
        assertEquals(Token.VAR, block.getLastChild().getType());
        assertEquals("a", block.getFirstChild().getFirstChild().getString());
        assertEquals("b", block.getLastChild().getFirstChild().getString());
    }

    @Test
    public void testWhileToFor() {
        Node block = new Node(Token.BLOCK);
        Node cond = Node.newString(Token.TRUE, "true");
        Node body = new Node(Token.BLOCK);
        Node whileNode = new Node(Token.WHILE);
        whileNode.addChildToBack(cond);
        whileNode.addChildToBack(body);
        block.addChildToBack(whileNode);

        normalize.process(new Node(Token.EMPTY), block);

        Node forNode = block.getFirstChild();
        assertEquals(Token.FOR, forNode.getType());
        assertEquals(4, forNode.getChildCount());
        assertEquals(Token.EMPTY, forNode.getChildAtIndex(0).getType());
        assertEquals(Token.TRUE, forNode.getChildAtIndex(1).getType());
        assertEquals(Token.EMPTY, forNode.getChildAtIndex(2).getType());
        assertEquals(Token.BLOCK, forNode.getChildAtIndex(3).getType());
    }

    @Test
    public void testForInitializerExtraction() {
        Node block = new Node(Token.BLOCK);
        Node initVar = new Node(Token.VAR, Node.newString(Token.NAME, "i"));
        initVar.getFirstChild().addChildToFront(Node.newString(Token.NUMBER, "0"));
        Node cond = Node.newString(Token.NAME, "cond");
        Node inc = Node.newString(Token.NAME, "i");
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR);
        forNode.addChildToBack(initVar);
        forNode.addChildToBack(cond);
        forNode.addChildToBack(inc);
        forNode.addChildToBack(body);
        block.addChildToBack(forNode);

        normalize.process(new Node(Token.EMPTY), block);

        Node first = block.getFirstChild();
        assertEquals(Token.VAR, first.getType());
        Node varName = first.getFirstChild();
        assertEquals("i", varName.getString());
        assertEquals(Token.NUMBER, varName.getFirstChild().getType());

        Node forNode2 = block.getChildAtIndex(1);
        assertEquals(Token.FOR, forNode2.getType());
        assertEquals(Token.EMPTY, forNode2.getChildAtIndex(0).getType());
    }

    @Test
    public void testLabelNormalization() {
        Node block = new Node(Token.BLOCK);
        Node label = new Node(Token.LABEL);
        label.addChildToBack(Node.newString(Token.NAME, "myLabel"));
        label.addChildToBack(Node.newString(Token.STRING, "expr"));
        block.addChildToBack(label);

        normalize.process(new Node(Token.EMPTY), block);

        Node labelAfter = block.getFirstChild();
        assertEquals(Token.LABEL, labelAfter.getType());
        Node body = labelAfter.getLastChild();
        assertEquals(Token.BLOCK, body.getType());
        assertEquals(Token.STRING, body.getFirstChild().getType());
    }

    @Test
    public void testDuplicateVarRemoval() {
        Node block = new Node(Token.BLOCK);
        Node name1 = Node.newString(Token.NAME, "a");
        name1.addChildToFront(Node.newString(Token.NUMBER, "1"));
        Node var1 = new Node(Token.VAR, name1);
        block.addChildToBack(var1);
        Node name2 = Node.newString(Token.NAME, "a");
        name2.addChildToFront(Node.newString(Token.NUMBER, "2"));
        Node var2 = new Node(Token.VAR, name2);
        block.addChildToBack(var2);

        normalize.process(new Node(Token.EMPTY), block);

        Node first = block.getFirstChild();
        assertEquals(Token.EXPR_RESULT, first.getType());
        Node assign = first.getFirstChild();
        assertEquals(Token.ASSIGN, assign.getType());
        assertEquals(Token.NAME, assign.getFirstChild().getType());
        assertEquals("a", assign.getFirstChild().getString());
        assertEquals(Token.NUMBER, assign.getLastChild().getType());

        Node second = block.getLastChild();
        assertEquals(Token.VAR, second.getType());
    }

    @Test(expected = IllegalStateException.class)
    public void testAssertOnChangeThrows() {
        Normalize strictNormalize = new Normalize(compiler, true);
        Node block = new Node(Token.BLOCK);
        Node name1 = Node.newString(Token.NAME, "a");
        name1.addChildToFront(Node.newString(Token.NUMBER, "1"));
        Node name2 = Node.newString(Token.NAME, "b");
        name2.addChildToFront(Node.newString(Token.NUMBER, "2"));
        Node var = new Node(Token.VAR);
        var.addChildToBack(name1);
        var.addChildToBack(name2);
        block.addChildToBack(var);

        strictNormalize.process(new Node(Token.EMPTY), block);
    }

    @Test
    public void testConstantPropagation() {
        Node block = new Node(Token.BLOCK);
        Node name = Node.newString(Token.NAME, "MY_CONST");
        name.addChildToFront(Node.newString(Token.NUMBER, "42"));
        JSDocInfo info = new JSDocInfo();
        info.setFlag(Flag.CONST);
        name.setJSDocInfo(info);
        Node var = new Node(Token.VAR, name);
        block.addChildToBack(var);

        normalize.process(new Node(Token.EMPTY), block);

        Node nameAfter = var.getFirstChild();
        assertTrue(nameAfter.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testConstantPropagationAlreadySet() {
        Node block = new Node(Token.BLOCK);
        Node name = Node.newString(Token.NAME, "MY_CONST");
        name.addChildToFront(Node.newString(Token.NUMBER, "42"));
        name.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        JSDocInfo info = new JSDocInfo();
        info.setFlag(Flag.CONST);
        name.setJSDocInfo(info);
        Node var = new Node(Token.VAR, name);
        block.addChildToBack(var);

        normalize.process(new Node(Token.EMPTY), block);

        assertTrue(name.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test(expected = IllegalStateException.class)
    public void testAssertOnChangeForConstantPropagation() {
        Normalize strictNormalize = new Normalize(compiler, true);
        Node block = new Node(Token.BLOCK);
        Node name = Node.newString(Token.NAME, "MY_CONST");
        name.addChildToFront(Node.newString(Token.NUMBER, "42"));
        JSDocInfo info = new JSDocInfo();
        info.setFlag(Flag.CONST);
        name.setJSDocInfo(info);
        Node var = new Node(Token.VAR, name);
        block.addChildToBack(var);

        strictNormalize.process(new Node(Token.EMPTY), block);
    }
}