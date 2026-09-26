package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

public class PeepholeFoldConstantsTest {

    private PeepholeFoldConstants optimizer;

    @Before
    public void setUp() {
        optimizer = new PeepholeFoldConstants();
    }

    @Test
    public void testOptimizeSubtree_Call() {
        Node callNode = new Node(Token.CALL);
        Node result = optimizer.optimizeSubtree(callNode);
        assertSame(callNode, result);
    }

    @Test
    public void testOptimizeSubtree_New() {
        Node newNode = new Node(Token.NEW);
        Node result = optimizer.optimizeSubtree(newNode);
        assertSame(newNode, result);
    }

    @Test
    public void testOptimizeSubtree_Typeof_LiteralString() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node typeofNode = new Node(Token.TYPEOF);
        Node stringNode = Node.newString("hello");
        typeofNode.addChildToBack(stringNode);
        parent.addChildToBack(typeofNode);
        Node result = optimizer.optimizeSubtree(typeofNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("string", result.getString());
    }

    @Test
    public void testOptimizeSubtree_Typeof_LiteralNumber() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node typeofNode = new Node(Token.TYPEOF);
        Node numberNode = Node.newNumber(42);
        typeofNode.addChildToBack(numberNode);
        parent.addChildToBack(typeofNode);
        Node result = optimizer.optimizeSubtree(typeofNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("number", result.getString());
    }

    @Test
    public void testOptimizeSubtree_Typeof_UndefinedName() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node typeofNode = new Node(Token.TYPEOF);
        Node nameNode = Node.newString(Token.NAME, "undefined");
        typeofNode.addChildToBack(nameNode);
        parent.addChildToBack(typeofNode);
        Node result = optimizer.optimizeSubtree(typeofNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("undefined", result.getString());
    }

    @Test
    public void testOptimizeSubtree_Not_TrueLiteral() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node notNode = new Node(Token.NOT);
        Node trueNode = new Node(Token.TRUE);
        notNode.addChildToBack(trueNode);
        parent.addChildToBack(notNode);
        Node result = optimizer.optimizeSubtree(notNode);
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testOptimizeSubtree_Not_FalseLiteral() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node notNode = new Node(Token.NOT);
        Node falseNode = new Node(Token.FALSE);
        notNode.addChildToBack(falseNode);
        parent.addChildToBack(notNode);
        Node result = optimizer.optimizeSubtree(notNode);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testOptimizeSubtree_Neg_Number() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node negNode = new Node(Token.NEG);
        Node numberNode = Node.newNumber(5.0);
        negNode.addChildToBack(numberNode);
        parent.addChildToBack(negNode);
        Node result = optimizer.optimizeSubtree(negNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-5.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_Neg_NaN() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node negNode = new Node(Token.NEG);
        Node nanNode = Node.newString(Token.NAME, "NaN");
        negNode.addChildToBack(nanNode);
        parent.addChildToBack(negNode);
        Node result = optimizer.optimizeSubtree(negNode);
        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
        assertEquals("NaN", result.getString());
    }

    @Test
    public void testOptimizeSubtree_Neg_Infinity() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node negNode = new Node(Token.NEG);
        Node infNode = Node.newString(Token.NAME, "Infinity");
        negNode.addChildToBack(infNode);
        parent.addChildToBack(negNode);
        Node result = optimizer.optimizeSubtree(negNode);
        assertSame(negNode, result);
    }

    @Test
    public void testOptimizeSubtree_Bitnot_InRange() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node bitnotNode = new Node(Token.BITNOT);
        Node numberNode = Node.newNumber(5.0);
        bitnotNode.addChildToBack(numberNode);
        parent.addChildToBack(bitnotNode);
        Node result = optimizer.optimizeSubtree(bitnotNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-6.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_Bitnot_Fractional() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node bitnotNode = new Node(Token.BITNOT);
        Node numberNode = Node.newNumber(5.5);
        bitnotNode.addChildToBack(numberNode);
        parent.addChildToBack(bitnotNode);
        Node result = optimizer.optimizeSubtree(bitnotNode);
        assertSame(bitnotNode, result);
    }

    @Test
    public void testOptimizeSubtree_Bitnot_OutOfRange() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node bitnotNode = new Node(Token.BITNOT);
        Node numberNode = Node.newNumber(1e12);
        bitnotNode.addChildToBack(numberNode);
        parent.addChildToBack(bitnotNode);
        Node result = optimizer.optimizeSubtree(bitnotNode);
        assertSame(bitnotNode, result);
    }

    @Test
    public void testOptimizeSubtree_Pos_NumericResult() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node posNode = new Node(Token.POS);
        Node numberNode = Node.newNumber(10.0);
        posNode.addChildToBack(numberNode);
        parent.addChildToBack(posNode);
        Node result = optimizer.optimizeSubtree(posNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(10.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_Void_WithZero() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node voidNode = new Node(Token.VOID);
        Node zeroNode = Node.newNumber(0);
        voidNode.addChildToBack(zeroNode);
        parent.addChildToBack(voidNode);
        Node result = optimizer.optimizeSubtree(voidNode);
        assertSame(voidNode, result);
    }

    @Test
    public void testOptimizeSubtree_Void_WithoutSideEffects() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node voidNode = new Node(Token.VOID);
        Node stringNode = Node.newString("hello");
        voidNode.addChildToBack(stringNode);
        parent.addChildToBack(voidNode);
        Node result = optimizer.optimizeSubtree(voidNode);
        assertSame(voidNode, result);
    }

    @Test
    public void testOptimizeSubtree_Add_TwoNumbers() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node addNode = new Node(Token.ADD);
        Node left = Node.newNumber(3.0);
        Node right = Node.newNumber(4.0);
        addNode.addChildToBack(left);
        addNode.addChildToBack(right);
        parent.addChildToBack(addNode);
        Node result = optimizer.optimizeSubtree(addNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(7.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_Add_TwoStrings() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node addNode = new Node(Token.ADD);
        Node left = Node.newString("hello ");
        Node right = Node.newString("world");
        addNode.addChildToBack(left);
        addNode.addChildToBack(right);
        parent.addChildToBack(addNode);
        Node result = optimizer.optimizeSubtree(addNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello world", result.getString());
    }

    @Test
    public void testOptimizeSubtree_Sub_TwoNumbers() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node subNode = new Node(Token.SUB);
        Node left = Node.newNumber(10.0);
        Node right = Node.newNumber(3.0);
        subNode.addChildToBack(left);
        subNode.addChildToBack(right);
        parent.addChildToBack(subNode);
        Node result = optimizer.optimizeSubtree(subNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(7.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_Mul_TwoNumbers() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node mulNode = new Node(Token.MUL);
        Node left = Node.newNumber(6.0);
        Node right = Node.newNumber(7.0);
        mulNode.addChildToBack(left);
        mulNode.addChildToBack(right);
        parent.addChildToBack(mulNode);
        Node result = optimizer.optimizeSubtree(mulNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(42.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_Div_TwoNumbers() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node divNode = new Node(Token.DIV);
        Node left = Node.newNumber(10.0);
        Node right = Node.newNumber(2.0);
        divNode.addChildToBack(left);
        divNode.addChildToBack(right);
        parent.addChildToBack(divNode);
        Node result = optimizer.optimizeSubtree(divNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_Div_ByZero() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node divNode = new Node(Token.DIV);
        Node left = Node.newNumber(10.0);
        Node right = Node.newNumber(0.0);
        divNode.addChildToBack(left);
        divNode.addChildToBack(right);
        parent.addChildToBack(divNode);
        Node result = optimizer.optimizeSubtree(divNode);
        assertSame(divNode, result);
    }

    @Test
    public void testOptimizeSubtree_Mod_TwoNumbers() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node modNode = new Node(Token.MOD);
        Node left = Node.newNumber(10.0);
        Node right = Node.newNumber(3.0);
        modNode.addChildToBack(left);
        modNode.addChildToBack(right);
        parent.addChildToBack(modNode);
        Node result = optimizer.optimizeSubtree(modNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_Mod_ByZero() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node modNode = new Node(Token.MOD);
        Node left = Node.newNumber(10.0);
        Node right = Node.newNumber(0.0);
        modNode.addChildToBack(left);
        modNode.addChildToBack(right);
        parent.addChildToBack(modNode);
        Node result = optimizer.optimizeSubtree(modNode);
        assertSame(modNode, result);
    }

    @Test
    public void testOptimizeSubtree_BitAnd_TwoNumbers() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node bitAndNode = new Node(Token.BITAND);
        Node left = Node.newNumber(5.0);
        Node right = Node.newNumber(3.0);
        bitAndNode.addChildToBack(left);
        bitAndNode.addChildToBack(right);
        parent.addChildToBack(bitAndNode);
        Node result = optimizer.optimizeSubtree(bitAndNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_BitOr_TwoNumbers() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node bitOrNode = new Node(Token.BITOR);
        Node left = Node.newNumber(5.0);
        Node right = Node.newNumber(3.0);
        bitOrNode.addChildToBack(left);
        bitOrNode.addChildToBack(right);
        parent.addChildToBack(bitOrNode);
        Node result = optimizer.optimizeSubtree(bitOrNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(7.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_BitXor_TwoNumbers() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node bitXorNode = new Node(Token.BITXOR);
        Node left = Node.newNumber(5.0);
        Node right = Node.newNumber(3.0);
        bitXorNode.addChildToBack(left);
        bitXorNode.addChildToBack(right);
        parent.addChildToBack(bitXorNode);
        Node result = optimizer.optimizeSubtree(bitXorNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(6.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_Lsh_Numbers() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node lshNode = new Node(Token.LSH);
        Node left = Node.newNumber(2.0);
        Node right = Node.newNumber(3.0);
        lshNode.addChildToBack(left);
        lshNode.addChildToBack(right);
        parent.addChildToBack(lshNode);
        Node result = optimizer.optimizeSubtree(lshNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(16.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_Rsh_Numbers() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node rshNode = new Node(Token.RSH);
        Node left = Node.newNumber(16.0);
        Node right = Node.newNumber(2.0);
        rshNode.addChildToBack(left);
        rshNode.addChildToBack(right);
        parent.addChildToBack(rshNode);
        Node result = optimizer.optimizeSubtree(rshNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(4.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_Ursh_Numbers() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node urshNode = new Node(Token.URSH);
        Node left = Node.newNumber(-1.0);
        Node right = Node.newNumber(1.0);
        urshNode.addChildToBack(left);
        urshNode.addChildToBack(right);
        parent.addChildToBack(urshNode);
        Node result = optimizer.optimizeSubtree(urshNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(2147483647.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_Comparison_Lt() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node ltNode = new Node(Token.LT);
        Node left = Node.newNumber(2.0);
        Node right = Node.newNumber(3.0);
        ltNode.addChildToBack(left);
        ltNode.addChildToBack(right);
        parent.addChildToBack(ltNode);
        Node result = optimizer.optimizeSubtree(ltNode);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testOptimizeSubtree_Comparison_Gt() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node gtNode = new Node(Token.GT);
        Node left = Node.newNumber(5.0);
        Node right = Node.newNumber(3.0);
        gtNode.addChildToBack(left);
        gtNode.addChildToBack(right);
        parent.addChildToBack(gtNode);
        Node result = optimizer.optimizeSubtree(gtNode);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testOptimizeSubtree_Comparison_Eq() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node eqNode = new Node(Token.EQ);
        Node left = Node.newNumber(3.0);
        Node right = Node.newNumber(3.0);
        eqNode.addChildToBack(left);
        eqNode.addChildToBack(right);
        parent.addChildToBack(eqNode);
        Node result = optimizer.optimizeSubtree(eqNode);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testOptimizeSubtree_Comparison_Ne() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node neNode = new Node(Token.NE);
        Node left = Node.newNumber(3.0);
        Node right = Node.newNumber(4.0);
        neNode.addChildToBack(left);
        neNode.addChildToBack(right);
        parent.addChildToBack(neNode);
        Node result = optimizer.optimizeSubtree(neNode);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testOptimizeSubtree_Comparison_Sheq() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node sheqNode = new Node(Token.SHEQ);
        Node left = Node.newNumber(3.0);
        Node right = Node.newNumber(3.0);
        sheqNode.addChildToBack(left);
        sheqNode.addChildToBack(right);
        parent.addChildToBack(sheqNode);
        Node result = optimizer.optimizeSubtree(sheqNode);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testOptimizeSubtree_Comparison_Shne() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node shneNode = new Node(Token.SHNE);
        Node left = Node.newNumber(3.0);
        Node right = Node.newNumber(4.0);
        shneNode.addChildToBack(left);
        shneNode.addChildToBack(right);
        parent.addChildToBack(shneNode);
        Node result = optimizer.optimizeSubtree(shneNode);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testOptimizeSubtree_And_TrueLeft() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node andNode = new Node(Token.AND);
        Node left = new Node(Token.TRUE);
        Node right = Node.newNumber(42.0);
        andNode.addChildToBack(left);
        andNode.addChildToBack(right);
        parent.addChildToBack(andNode);
        Node result = optimizer.optimizeSubtree(andNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(42.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_And_FalseLeft() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node andNode = new Node(Token.AND);
        Node left = new Node(Token.FALSE);
        Node right = Node.newNumber(42.0);
        andNode.addChildToBack(left);
        andNode.addChildToBack(right);
        parent.addChildToBack(andNode);
        Node result = optimizer.optimizeSubtree(andNode);
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testOptimizeSubtree_Or_TrueLeft() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node orNode = new Node(Token.OR);
        Node left = new Node(Token.TRUE);
        Node right = Node.newNumber(42.0);
        orNode.addChildToBack(left);
        orNode.addChildToBack(right);
        parent.addChildToBack(orNode);
        Node result = optimizer.optimizeSubtree(orNode);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testOptimizeSubtree_Or_FalseLeft() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node orNode = new Node(Token.OR);
        Node left = new Node(Token.FALSE);
        Node right = Node.newNumber(42.0);
        orNode.addChildToBack(left);
        orNode.addChildToBack(right);
        parent.addChildToBack(orNode);
        Node result = optimizer.optimizeSubtree(orNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(42.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_Instanceof_LiteralLeft() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node instanceofNode = new Node(Token.INSTANCEOF);
        Node left = Node.newNumber(5.0);
        Node right = Node.newString(Token.NAME, "Object");
        instanceofNode.addChildToBack(left);
        instanceofNode.addChildToBack(right);
        parent.addChildToBack(instanceofNode);
        Node result = optimizer.optimizeSubtree(instanceofNode);
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testOptimizeSubtree_GetProp_ArrayLength() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node getPropNode = new Node(Token.GETPROP);
        Node arrayLit = new Node(Token.ARRAYLIT);
        Node elem1 = Node.newNumber(1.0);
        Node elem2 = Node.newNumber(2.0);
        arrayLit.addChildToBack(elem1);
        arrayLit.addChildToBack(elem2);
        Node lengthProp = Node.newString("length");
        getPropNode.addChildToBack(arrayLit);
        getPropNode.addChildToBack(lengthProp);
        parent.addChildToBack(getPropNode);
        Node result = optimizer.optimizeSubtree(getPropNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(2.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_GetProp_StringLength() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node getPropNode = new Node(Token.GETPROP);
        Node stringNode = Node.newString("hello");
        Node lengthProp = Node.newString("length");
        getPropNode.addChildToBack(stringNode);
        getPropNode.addChildToBack(lengthProp);
        parent.addChildToBack(getPropNode);
        Node result = optimizer.optimizeSubtree(getPropNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_GetElem_ArrayLitValidIndex() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node getElemNode = new Node(Token.GETELEM);
        Node arrayLit = new Node(Token.ARRAYLIT);
        Node elem1 = Node.newNumber(10.0);
        Node elem2 = Node.newNumber(20.0);
        arrayLit.addChildToBack(elem1);
        arrayLit.addChildToBack(elem2);
        Node index = Node.newNumber(1.0);
        getElemNode.addChildToBack(arrayLit);
        getElemNode.addChildToBack(index);
        parent.addChildToBack(getElemNode);
        Node result = optimizer.optimizeSubtree(getElemNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(20.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_GetElem_ArrayLitNegativeIndex() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node getElemNode = new Node(Token.GETELEM);
        Node arrayLit = new Node(Token.ARRAYLIT);
        Node elem1 = Node.newNumber(10.0);
        arrayLit.addChildToBack(elem1);
        Node index = Node.newNumber(-1.0);
        getElemNode.addChildToBack(arrayLit);
        getElemNode.addChildToBack(index);
        parent.addChildToBack(getElemNode);
        Node result = optimizer.optimizeSubtree(getElemNode);
        assertSame(getElemNode, result);
    }

    @Test
    public void testOptimizeSubtree_GetElem_ArrayLitNonIntegerIndex() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node getElemNode = new Node(Token.GETELEM);
        Node arrayLit = new Node(Token.ARRAYLIT);
        Node elem1 = Node.newNumber(10.0);
        arrayLit.addChildToBack(elem1);
        Node index = Node.newNumber(1.5);
        getElemNode.addChildToBack(arrayLit);
        getElemNode.addChildToBack(index);
        parent.addChildToBack(getElemNode);
        Node result = optimizer.optimizeSubtree(getElemNode);
        assertSame(getElemNode, result);
    }

    @Test
    public void testOptimizeSubtree_GetElem_ArrayLitOutOfBounds() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node getElemNode = new Node(Token.GETELEM);
        Node arrayLit = new Node(Token.ARRAYLIT);
        Node elem1 = Node.newNumber(10.0);
        arrayLit.addChildToBack(elem1);
        Node index = Node.newNumber(5.0);
        getElemNode.addChildToBack(arrayLit);
        getElemNode.addChildToBack(index);
        parent.addChildToBack(getElemNode);
        Node result = optimizer.optimizeSubtree(getElemNode);
        assertSame(getElemNode, result);
    }

    @Test
    public void testOptimizeSubtree_GetElem_ArrayLitEmptyElement() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node getElemNode = new Node(Token.GETELEM);
        Node arrayLit = new Node(Token.ARRAYLIT);
        Node empty = new Node(Token.EMPTY);
        arrayLit.addChildToBack(empty);
        Node index = Node.newNumber(0.0);
        getElemNode.addChildToBack(arrayLit);
        getElemNode.addChildToBack(index);
        parent.addChildToBack(getElemNode);
        Node result = optimizer.optimizeSubtree(getElemNode);
        assertNotNull(result);
        assertEquals(Token.VOID, result.getType());
    }

    @Test
    public void testOptimizeSubtree_Default_ReturnsSubtree() {
        Node blockNode = new Node(Token.BLOCK);
        Node result = optimizer.optimizeSubtree(blockNode);
        assertSame(blockNode, result);
    }

    @Test
    public void testOptimizeSubtree_TryFoldKnownMethods_ArrayJoin() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node callNode = new Node(Token.CALL);
        Node getPropNode = new Node(Token.GETPROP);
        Node arrayLit = new Node(Token.ARRAYLIT);
        Node elem1 = Node.newNumber(1.0);
        Node elem2 = Node.newNumber(2.0);
        arrayLit.addChildToBack(elem1);
        arrayLit.addChildToBack(elem2);
        Node joinProp = Node.newString("join");
        getPropNode.addChildToBack(arrayLit);
        getPropNode.addChildToBack(joinProp);
        callNode.addChildToBack(getPropNode);
        parent.addChildToBack(callNode);
        Node result = optimizer.optimizeSubtree(callNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("1,2", result.getString());
    }

    @Test
    public void testOptimizeSubtree_TryFoldKnownMethods_StringToLowerCase() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node callNode = new Node(Token.CALL);
        Node getPropNode = new Node(Token.GETPROP);
        Node stringNode = Node.newString("HELLO");
        Node toLowerCaseProp = Node.newString("toLowerCase");
        getPropNode.addChildToBack(stringNode);
        getPropNode.addChildToBack(toLowerCaseProp);
        callNode.addChildToBack(getPropNode);
        parent.addChildToBack(callNode);
        Node result = optimizer.optimizeSubtree(callNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello", result.getString());
    }

    @Test
    public void testOptimizeSubtree_TryFoldKnownMethods_StringToUpperCase() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node callNode = new Node(Token.CALL);
        Node getPropNode = new Node(Token.GETPROP);
        Node stringNode = Node.newString("hello");
        Node toUpperCaseProp = Node.newString("toUpperCase");
        getPropNode.addChildToBack(stringNode);
        getPropNode.addChildToBack(toUpperCaseProp);
        callNode.addChildToBack(getPropNode);
        parent.addChildToBack(callNode);
        Node result = optimizer.optimizeSubtree(callNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("HELLO", result.getString());
    }

    @Test
    public void testOptimizeSubtree_TryFoldKnownMethods_StringIndexOf() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node callNode = new Node(Token.CALL);
        Node getPropNode = new Node(Token.GETPROP);
        Node stringNode = Node.newString("hello world");
        Node indexOfProp = Node.newString("indexOf");
        getPropNode.addChildToBack(stringNode);
        getPropNode.addChildToBack(indexOfProp);
        callNode.addChildToBack(getPropNode);
        Node arg = Node.newString("world");
        callNode.addChildToBack(arg);
        parent.addChildToBack(callNode);
        Node result = optimizer.optimizeSubtree(callNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(6.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_TryFoldKnownMethods_StringLastIndexOf() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node callNode = new Node(Token.CALL);
        Node getPropNode = new Node(Token.GETPROP);
        Node stringNode = Node.newString("hello world hello");
        Node lastIndexOfProp = Node.newString("lastIndexOf");
        getPropNode.addChildToBack(stringNode);
        getPropNode.addChildToBack(lastIndexOfProp);
        callNode.addChildToBack(getPropNode);
        Node arg = Node.newString("hello");
        callNode.addChildToBack(arg);
        parent.addChildToBack(callNode);
        Node result = optimizer.optimizeSubtree(callNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(12.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_TryFoldKnownMethods_StringSubstr() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node callNode = new Node(Token.CALL);
        Node getPropNode = new Node(Token.GETPROP);
        Node stringNode = Node.newString("hello world");
        Node substrProp = Node.newString("substr");
        getPropNode.addChildToBack(stringNode);
        getPropNode.addChildToBack(substrProp);
        callNode.addChildToBack(getPropNode);
        Node arg1 = Node.newNumber(6.0);
        Node arg2 = Node.newNumber(5.0);
        callNode.addChildToBack(arg1);
        callNode.addChildToBack(arg2);
        parent.addChildToBack(callNode);
        Node result = optimizer.optimizeSubtree(callNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("world", result.getString());
    }

    @Test
    public void testOptimizeSubtree_TryFoldKnownMethods_StringSubstring() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node callNode = new Node(Token.CALL);
        Node getPropNode = new Node(Token.GETPROP);
        Node stringNode = Node.newString("hello world");
        Node substringProp = Node.newString("substring");
        getPropNode.addChildToBack(stringNode);
        getPropNode.addChildToBack(substringProp);
        callNode.addChildToBack(getPropNode);
        Node arg1 = Node.newNumber(6.0);
        Node arg2 = Node.newNumber(11.0);
        callNode.addChildToBack(arg1);
        callNode.addChildToBack(arg2);
        parent.addChildToBack(callNode);
        Node result = optimizer.optimizeSubtree(callNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("world", result.getString());
    }

    @Test
    public void testOptimizeSubtree_TryFoldAssign_Simple() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node assignNode = new Node(Token.ASSIGN);
        Node left = Node.newString(Token.NAME, "a");
        Node right = new Node(Token.ADD);
        Node rightLeft = Node.newString(Token.NAME, "a");
        Node rightRight = Node.newNumber(1.0);
        right.addChildToBack(rightLeft);
        right.addChildToBack(rightRight);
        assignNode.addChildToBack(left);
        assignNode.addChildToBack(right);
        parent.addChildToBack(assignNode);
        Node result = optimizer.optimizeSubtree(assignNode);
        assertNotNull(result);
        assertEquals(Token.ASSIGN_ADD, result.getType());
    }

    @Test
    public void testOptimizeSubtree_TryFoldObjectPropAccess_Simple() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node getPropNode = new Node(Token.GETPROP);
        Node objectLit = new Node(Token.OBJECTLIT);
        Node keyNode = Node.newString(Token.STRING, "x");
        Node valueNode = Node.newNumber(42.0);
        keyNode.addChildToBack(valueNode);
        objectLit.addChildToBack(keyNode);
        Node propName = Node.newString("x");
        getPropNode.addChildToBack(objectLit);
        getPropNode.addChildToBack(propName);
        parent.addChildToBack(getPropNode);
        Node result = optimizer.optimizeSubtree(getPropNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(42.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtree_TryFoldCtorCall_StringInForcedStringContext() {
        Node parent = new Node(Token.GETELEM);
        Node newStringNode = new Node(Token.NEW);
        Node nameNode = Node.newString(Token.NAME, "String");
        Node valueNode = Node.newString("hello");
        newStringNode.addChildToBack(nameNode);
        newStringNode.addChildToBack(valueNode);
        parent.addChildToBack(newStringNode);
        Node result = optimizer.optimizeSubtree(newStringNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello", result.getString());
    }

    @Test
    public void testOptimizeSubtree_TryFoldCtorCall_StringNoArg() {
        Node parent = new Node(Token.GETELEM);
        Node newStringNode = new Node(Token.NEW);
        Node nameNode = Node.newString(Token.NAME, "String");
        newStringNode.addChildToBack(nameNode);
        parent.addChildToBack(newStringNode);
        Node result = optimizer.optimizeSubtree(newStringNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("", result.getString());
    }

    @Test
    public void testOptimizeSubtree_TryFoldComparison_NullAndUndefined() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node eqNode = new Node(Token.EQ);
        Node left = new Node(Token.NULL);
        Node right = new Node(Token.VOID);
        Node voidChild = Node.newNumber(0.0);
        right.addChildToBack(voidChild);
        eqNode.addChildToBack(left);
        eqNode.addChildToBack(right);
        parent.addChildToBack(eqNode);
        Node result = optimizer.optimizeSubtree(eqNode);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testOptimizeSubtree_TryFoldComparison_ThisAndThis() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node sheqNode = new Node(Token.SHEQ);
        Node left = new Node(Token.THIS);
        Node right = new Node(Token.THIS);
        sheqNode.addChildToBack(left);
        sheqNode.addChildToBack(right);
        parent.addChildToBack(sheqNode);
        Node result = optimizer.optimizeSubtree(sheqNode);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
}