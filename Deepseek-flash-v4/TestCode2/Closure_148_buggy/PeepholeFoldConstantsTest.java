package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.List;

public class PeepholeFoldConstantsTest {
    private PeepholeFoldConstants optimizer;

    @Before
    public void setUp() {
        optimizer = new PeepholeFoldConstants();
    }

    private Node createParentWithChild(Node child) {
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(child);
        return parent;
    }

    private Node num(double val) {
        return Node.newNumber(val);
    }

    private Node str(String s) {
        return Node.newString(s);
    }

    @Test
    public void testFoldTypeofString() {
        Node typeofNode = new Node(Token.TYPEOF);
        typeofNode.addChildToFront(str("hello"));
        Node parent = createParentWithChild(typeofNode);
        Node result = optimizer.optimizeSubtree(typeofNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("string", result.getString());
    }

    @Test
    public void testFoldTypeofNumber() {
        Node typeofNode = new Node(Token.TYPEOF);
        typeofNode.addChildToFront(num(42));
        Node parent = createParentWithChild(typeofNode);
        Node result = optimizer.optimizeSubtree(typeofNode);
        assertEquals("number", result.getString());
    }

    @Test
    public void testFoldTypeofBoolean() {
        Node typeofNode = new Node(Token.TYPEOF);
        typeofNode.addChildToFront(new Node(Token.TRUE));
        Node parent = createParentWithChild(typeofNode);
        Node result = optimizer.optimizeSubtree(typeofNode);
        assertEquals("boolean", result.getString());
    }

    @Test
    public void testFoldTypeofNull() {
        Node typeofNode = new Node(Token.TYPEOF);
        typeofNode.addChildToFront(new Node(Token.NULL));
        Node parent = createParentWithChild(typeofNode);
        Node result = optimizer.optimizeSubtree(typeofNode);
        assertEquals("object", result.getString());
    }

    @Test
    public void testFoldTypeofUndefined() {
        Node typeofNode = new Node(Token.TYPEOF);
        Node name = Node.newString(Token.NAME, "undefined");
        typeofNode.addChildToFront(name);
        Node parent = createParentWithChild(typeofNode);
        Node result = optimizer.optimizeSubtree(typeofNode);
        assertEquals("undefined", result.getString());
    }

    @Test
    public void testFoldTypeofNonLiteral() {
        Node typeofNode = new Node(Token.TYPEOF);
        typeofNode.addChildToFront(Node.newString(Token.NAME, "x"));
        Node parent = createParentWithChild(typeofNode);
        Node result = optimizer.optimizeSubtree(typeofNode);
        assertSame(typeofNode, result);
    }

    @Test
    public void testFoldNotTrue() {
        Node notNode = new Node(Token.NOT);
        notNode.addChildToFront(new Node(Token.TRUE));
        Node parent = createParentWithChild(notNode);
        Node result = optimizer.optimizeSubtree(notNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldNotFalse() {
        Node notNode = new Node(Token.NOT);
        notNode.addChildToFront(new Node(Token.FALSE));
        Node parent = createParentWithChild(notNode);
        Node result = optimizer.optimizeSubtree(notNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldNegNumber() {
        Node negNode = new Node(Token.NEG);
        negNode.addChildToFront(num(5));
        Node parent = createParentWithChild(negNode);
        Node result = optimizer.optimizeSubtree(negNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-5.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldNegNaN() {
        Node negNode = new Node(Token.NEG);
        Node name = Node.newString(Token.NAME, "NaN");
        negNode.addChildToFront(name);
        Node parent = createParentWithChild(negNode);
        Node result = optimizer.optimizeSubtree(negNode);
        assertEquals(Token.NAME, result.getType());
        assertEquals("NaN", result.getString());
    }

    @Test
    public void testFoldNegInfinity() {
        Node negNode = new Node(Token.NEG);
        Node name = Node.newString(Token.NAME, "Infinity");
        negNode.addChildToFront(name);
        Node parent = createParentWithChild(negNode);
        Node result = optimizer.optimizeSubtree(negNode);
        assertSame(negNode, result);
    }

    @Test
    public void testFoldBitnot() {
        Node bitnotNode = new Node(Token.BITNOT);
        bitnotNode.addChildToFront(num(3));
        Node parent = createParentWithChild(bitnotNode);
        Node result = optimizer.optimizeSubtree(bitnotNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(~3, (int) result.getDouble(), 0);
    }

    @Test
    public void testFoldBitnotFractional() {
        Node bitnotNode = new Node(Token.BITNOT);
        bitnotNode.addChildToFront(num(3.5));
        Node parent = createParentWithChild(bitnotNode);
        Node result = optimizer.optimizeSubtree(bitnotNode);
        assertSame(bitnotNode, result);
    }

    @Test
    public void testFoldBitnotOutOfRange() {
        Node bitnotNode = new Node(Token.BITNOT);
        bitnotNode.addChildToFront(num(1L << 33));
        Node parent = createParentWithChild(bitnotNode);
        Node result = optimizer.optimizeSubtree(bitnotNode);
        assertSame(bitnotNode, result);
    }

    @Test
    public void testFoldAndFalseLeft() {
        Node andNode = new Node(Token.AND);
        andNode.addChildToFront(new Node(Token.FALSE));
        andNode.addChildToBack(new Node(Token.TRUE));
        Node parent = createParentWithChild(andNode);
        Node result = optimizer.optimizeSubtree(andNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldAndTrueLeft() {
        Node andNode = new Node(Token.AND);
        andNode.addChildToFront(new Node(Token.TRUE));
        Node right = str("abc");
        andNode.addChildToBack(right);
        Node parent = createParentWithChild(andNode);
        Node result = optimizer.optimizeSubtree(andNode);
        assertSame(right, result);
    }

    @Test
    public void testFoldOrTrueLeft() {
        Node orNode = new Node(Token.OR);
        orNode.addChildToFront(new Node(Token.TRUE));
        orNode.addChildToBack(new Node(Token.FALSE));
        Node parent = createParentWithChild(orNode);
        Node result = optimizer.optimizeSubtree(orNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldOrFalseLeft() {
        Node orNode = new Node(Token.OR);
        orNode.addChildToFront(new Node(Token.FALSE));
        Node right = str("xyz");
        orNode.addChildToBack(right);
        Node parent = createParentWithChild(orNode);
        Node result = optimizer.optimizeSubtree(orNode);
        assertSame(right, result);
    }

    @Test
    public void testFoldAddNumbers() {
        Node add = new Node(Token.ADD);
        add.addChildToFront(num(3));
        add.addChildToBack(num(4));
        Node parent = createParentWithChild(add);
        Node result = optimizer.optimizeSubtree(add);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(7.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldAddStrings() {
        Node add = new Node(Token.ADD);
        add.addChildToFront(str("Hello "));
        add.addChildToBack(str("World"));
        Node parent = createParentWithChild(add);
        Node result = optimizer.optimizeSubtree(add);
        assertEquals(Token.STRING, result.getType());
        assertEquals("Hello World", result.getString());
    }

    @Test
    public void testFoldAddStringAndNumber() {
        Node add = new Node(Token.ADD);
        add.addChildToFront(str("Value: "));
        add.addChildToBack(num(42));
        Node parent = createParentWithChild(add);
        Node result = optimizer.optimizeSubtree(add);
        assertEquals(Token.STRING, result.getType());
        assertEquals("Value: 42.0", result.getString());
    }

    @Test
    public void testFoldSubtract() {
        Node sub = new Node(Token.SUB);
        sub.addChildToFront(num(10));
        sub.addChildToBack(num(3));
        Node parent = createParentWithChild(sub);
        Node result = optimizer.optimizeSubtree(sub);
        assertEquals(7.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldMultiply() {
        Node mul = new Node(Token.MUL);
        mul.addChildToFront(num(6));
        mul.addChildToBack(num(7));
        Node parent = createParentWithChild(mul);
        Node result = optimizer.optimizeSubtree(mul);
        assertEquals(42.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldDivide() {
        Node div = new Node(Token.DIV);
        div.addChildToFront(num(10));
        div.addChildToBack(num(2));
        Node parent = createParentWithChild(div);
        Node result = optimizer.optimizeSubtree(div);
        assertEquals(5.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldDivideByZero() {
        Node div = new Node(Token.DIV);
        div.addChildToFront(num(10));
        div.addChildToBack(num(0));
        Node parent = createParentWithChild(div);
        Node result = optimizer.optimizeSubtree(div);
        assertSame(div, result);
    }

    @Test
    public void testFoldBitAnd() {
        Node b = new Node(Token.BITAND);
        b.addChildToFront(num(6));
        b.addChildToBack(num(5));
        Node parent = createParentWithChild(b);
        Node result = optimizer.optimizeSubtree(b);
        assertEquals(4.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldBitOr() {
        Node b = new Node(Token.BITOR);
        b.addChildToFront(num(2));
        b.addChildToBack(num(4));
        Node parent = createParentWithChild(b);
        Node result = optimizer.optimizeSubtree(b);
        assertEquals(6.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldBitAndNonInteger() {
        Node b = new Node(Token.BITAND);
        b.addChildToFront(num(3.5));
        b.addChildToBack(num(4));
        Node parent = createParentWithChild(b);
        Node result = optimizer.optimizeSubtree(b);
        assertSame(b, result);
    }

    @Test
    public void testFoldBitAndOutOfRange() {
        Node b = new Node(Token.BITAND);
        b.addChildToFront(num(1e20));
        b.addChildToBack(num(2));
        Node parent = createParentWithChild(b);
        Node result = optimizer.optimizeSubtree(b);
        assertSame(b, result);
    }

    @Test
    public void testFoldLsh() {
        Node lsh = new Node(Token.LSH);
        lsh.addChildToFront(num(1));
        lsh.addChildToBack(num(3));
        Node parent = createParentWithChild(lsh);
        Node result = optimizer.optimizeSubtree(lsh);
        assertEquals(8.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldRsh() {
        Node rsh = new Node(Token.RSH);
        rsh.addChildToFront(num(16));
        rsh.addChildToBack(num(2));
        Node parent = createParentWithChild(rsh);
        Node result = optimizer.optimizeSubtree(rsh);
        assertEquals(4.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldUrsh() {
        Node ursh = new Node(Token.URSH);
        ursh.addChildToFront(num(-1));
        ursh.addChildToBack(num(1));
        Node parent = createParentWithChild(ursh);
        Node result = optimizer.optimizeSubtree(ursh);
        assertEquals(2147483647.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldShiftAmountOutOfBounds() {
        Node lsh = new Node(Token.LSH);
        lsh.addChildToFront(num(1));
        lsh.addChildToBack(num(32));
        Node parent = createParentWithChild(lsh);
        Node result = optimizer.optimizeSubtree(lsh);
        assertSame(lsh, result);
    }

    @Test
    public void testFoldShiftOperandOutOfRange() {
        Node lsh = new Node(Token.LSH);
        lsh.addChildToFront(num(1e20));
        lsh.addChildToBack(num(1));
        Node parent = createParentWithChild(lsh);
        Node result = optimizer.optimizeSubtree(lsh);
        assertSame(lsh, result);
    }

    @Test
    public void testFoldStringJoinEmptyArray() {
        Node call = new Node(Token.CALL);
        Node gp = new Node(Token.GETPROP);
        Node array = new Node(Token.ARRAYLIT);
        gp.addChildToFront(array);
        gp.addChildToBack(Node.newString("join"));
        call.addChildToFront(gp);
        call.addChildToBack(str(""));
        Node parent = createParentWithChild(call);
        Node result = optimizer.optimizeSubtree(call);
        assertEquals(Token.STRING, result.getType());
        assertEquals("", result.getString());
    }

    @Test
    public void testFoldStringJoinSingleString() {
        Node call = new Node(Token.CALL);
        Node gp = new Node(Token.GETPROP);
        Node array = new Node(Token.ARRAYLIT);
        array.addChildToBack(str("hello"));
        gp.addChildToFront(array);
        gp.addChildToBack(Node.newString("join"));
        call.addChildToFront(gp);
        call.addChildToBack(str(","));
        Node parent = createParentWithChild(call);
        Node result = optimizer.optimizeSubtree(call);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello", result.getString());
    }

    @Test
    public void testFoldStringJoinMultiple() {
        Node call = new Node(Token.CALL);
        Node gp = new Node(Token.GETPROP);
        Node array = new Node(Token.ARRAYLIT);
        array.addChildToBack(str("a"));
        array.addChildToBack(str("b"));
        array.addChildToBack(str("c"));
        gp.addChildToFront(array);
        gp.addChildToBack(Node.newString("join"));
        call.addChildToFront(gp);
        call.addChildToBack(str("-"));
        Node parent = createParentWithChild(call);
        Node result = optimizer.optimizeSubtree(call);
        assertEquals(Token.STRING, result.getType());
        assertEquals("a-b-c", result.getString());
    }

    @Test
    public void testFoldIndexOf() {
        Node call = new Node(Token.CALL);
        Node gp = new Node(Token.GETPROP);
        gp.addChildToFront(str("hello world"));
        gp.addChildToBack(Node.newString("indexOf"));
        call.addChildToFront(gp);
        call.addChildToBack(str("world"));
        Node parent = createParentWithChild(call);
        Node result = optimizer.optimizeSubtree(call);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(6.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldLastIndexOf() {
        Node call = new Node(Token.CALL);
        Node gp = new Node(Token.GETPROP);
        gp.addChildToFront(str("hello world, world"));
        gp.addChildToBack(Node.newString("lastIndexOf"));
        call.addChildToFront(gp);
        call.addChildToBack(str("world"));
        Node parent = createParentWithChild(call);
        Node result = optimizer.optimizeSubtree(call);
        assertEquals(13.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldIndexOfWithFromIndex() {
        Node call = new Node(Token.CALL);
        Node gp = new Node(Token.GETPROP);
        gp.addChildToFront(str("hello world"));
        gp.addChildToBack(Node.newString("indexOf"));
        call.addChildToFront(gp);
        call.addChildToBack(str("o"));
        call.addChildToBack(num(5));
        Node parent = createParentWithChild(call);
        Node result = optimizer.optimizeSubtree(call);
        assertEquals(7.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldStringJoinNonJoinMethod() {
        Node call = new Node(Token.CALL);
        Node gp = new Node(Token.GETPROP);
        Node array = new Node(Token.ARRAYLIT);
        gp.addChildToFront(array);
        gp.addChildToBack(Node.newString("toString"));
        call.addChildToFront(gp);
        call.addChildToBack(str(""));
        Node parent = createParentWithChild(call);
        Node result = optimizer.optimizeSubtree(call);
        assertSame(call, result);
    }

    @Test
    public void testFoldGetPropArrayLength() {
        Node gp = new Node(Token.GETPROP);
        Node array = new Node(Token.ARRAYLIT);
        array.addChildToBack(str("a"));
        array.addChildToBack(str("b"));
        gp.addChildToFront(array);
        gp.addChildToBack(Node.newString("length"));
        Node parent = createParentWithChild(gp);
        Node result = optimizer.optimizeSubtree(gp);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(2.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldGetPropStringLength() {
        Node gp = new Node(Token.GETPROP);
        gp.addChildToFront(str("abc"));
        gp.addChildToBack(Node.newString("length"));
        Node parent = createParentWithChild(gp);
        Node result = optimizer.optimizeSubtree(gp);
        assertEquals(3.0, result.getDouble(), 0);
    }

    @Test
    public void testFoldGetPropNonLength() {
        Node gp = new Node(Token.GETPROP);
        gp.addChildToFront(str("abc"));
        gp.addChildToBack(Node.newString("charAt"));
        Node parent = createParentWithChild(gp);
        Node result = optimizer.optimizeSubtree(gp);
        assertSame(gp, result);
    }

    @Test
    public void testFoldGetElemValid() {
        Node ge = new Node(Token.GETELEM);
        Node array = new Node(Token.ARRAYLIT);
        array.addChildToBack(str("first"));
        array.addChildToBack(str("second"));
        ge.addChildToFront(array);
        ge.addChildToBack(num(1));
        Node parent = createParentWithChild(ge);
        Node result = optimizer.optimizeSubtree(ge);
        assertEquals(Token.STRING, result.getType());
        assertEquals("second", result.getString());
    }

    @Test
    public void testFoldGetElemOutOfBounds() {
        Node ge = new Node(Token.GETELEM);
        Node array = new Node(Token.ARRAYLIT);
        array.addChildToBack(str("only"));
        ge.addChildToFront(array);
        ge.addChildToBack(num(5));
        Node parent = createParentWithChild(ge);
        Node result = optimizer.optimizeSubtree(ge);
        assertSame(ge, result);
    }

    @Test
    public void testFoldGetElemNonInteger() {
        Node ge = new Node(Token.GETELEM);
        Node array = new Node(Token.ARRAYLIT);
        array.addChildToBack(str("x"));
        ge.addChildToFront(array);
        ge.addChildToBack(num(1.5));
        Node parent = createParentWithChild(ge);
        Node result = optimizer.optimizeSubtree(ge);
        assertSame(ge, result);
    }

    @Test
    public void testFoldInstanceofLiteralAgainstObject() {
        Node in = new Node(Token.INSTANCEOF);
        in.addChildToFront(num(5));
        in.addChildToBack(Node.newString(Token.NAME, "Object"));
        Node parent = createParentWithChild(in);
        Node result = optimizer.optimizeSubtree(in);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldInstanceofImmutableLeft() {
        Node in = new Node(Token.INSTANCEOF);
        in.addChildToFront(str("abc"));
        in.addChildToBack(new Node(Token.NAME, "Foo"));
        Node parent = createParentWithChild(in);
        Node result = optimizer.optimizeSubtree(in);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldInstanceofNoFold() {
        Node in = new Node(Token.INSTANCEOF);
        Node left = Node.newString(Token.NAME, "x");
        Node right = Node.newString(Token.NAME, "Foo");
        in.addChildToFront(left);
        in.addChildToBack(right);
        Node parent = createParentWithChild(in);
        Node result = optimizer.optimizeSubtree(in);
        assertSame(in, result);
    }

    @Test
    public void testFoldComparisonEqNumber() {
        Node eq = new Node(Token.EQ);
        eq.addChildToFront(num(3));
        eq.addChildToBack(num(3));
        Node parent = createParentWithChild(eq);
        Node result = optimizer.optimizeSubtree(eq);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonNeNumber() {
        Node ne = new Node(Token.NE);
        ne.addChildToFront(num(3));
        ne.addChildToBack(num(4));
        Node parent = createParentWithChild(ne);
        Node result = optimizer.optimizeSubtree(ne);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonLt() {
        Node lt = new Node(Token.LT);
        lt.addChildToFront(num(2));
        lt.addChildToBack(num(3));
        Node parent = createParentWithChild(lt);
        Node result = optimizer.optimizeSubtree(lt);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonEqString() {
        Node eq = new Node(Token.EQ);
        eq.addChildToFront(str("a"));
        eq.addChildToBack(str("a"));
        Node parent = createParentWithChild(eq);
        Node result = optimizer.optimizeSubtree(eq);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonStringEq() {
        Node eq = new Node(Token.EQ);
        eq.addChildToFront(str("a"));
        eq.addChildToBack(str("b"));
        Node parent = createParentWithChild(eq);
        Node result = optimizer.optimizeSubtree(eq);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldComparisonVoidNullEq() {
        Node v = new Node(Token.VOID);
        v.addChildToFront(num(0));
        Node eq = new Node(Token.EQ);
        eq.addChildToFront(v);
        eq.addChildToBack(new Node(Token.NULL));
        Node parent = createParentWithChild(eq);
        Node result = optimizer.optimizeSubtree(eq);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonNullUndefinedEq() {
        Node eq = new Node(Token.EQ);
        eq.addChildToFront(new Node(Token.NULL));
        Node right = new Node(Token.NAME, "undefined");
        eq.addChildToBack(right);
        Node parent = createParentWithChild(eq);
        Node result = optimizer.optimizeSubtree(eq);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonSheqNumber() {
        Node sh = new Node(Token.SHEQ);
        sh.addChildToFront(num(1));
        sh.addChildToBack(num(1));
        Node parent = createParentWithChild(sh);
        Node result = optimizer.optimizeSubtree(sh);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonThisAndNumber() {
        Node eq = new Node(Token.EQ);
        eq.addChildToFront(new Node(Token.THIS));
        eq.addChildToBack(num(5));
        Node parent = createParentWithChild(eq);
        Node result = optimizer.optimizeSubtree(eq);
        assertSame(eq, result);
    }

    @Test
    public void testFoldComparisonNameEqualLtFalse() {
        Node lt = new Node(Token.LT);
        lt.addChildToFront(Node.newString(Token.NAME, "x"));
        lt.addChildToBack(Node.newString(Token.NAME, "x"));
        Node parent = createParentWithChild(lt);
        Node result = optimizer.optimizeSubtree(lt);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldAssignAdd() {
        Node ass = new Node(Token.ASSIGN);
        Node left = Node.newString(Token.NAME, "x");
        Node add = new Node(Token.ADD);
        add.addChildToBack(Node.newString(Token.NAME, "x"));
        add.addChildToBack(num(1));
        ass.addChildToFront(left);
        ass.addChildToBack(add);
        Node parent = createParentWithChild(ass);
        Node result = optimizer.optimizeSubtree(ass);
        assertEquals(Token.ASSIGN_ADD, result.getType());
        assertEquals(2, result.getChildCount());
    }

    @Test
    public void testFoldAssignNoFold() {
        Node ass = new Node(Token.ASSIGN);
        Node left = Node.newString(Token.NAME, "x");
        Node add = new Node(Token.ADD);
        add.addChildToBack(Node.newString(Token.NAME, "y"));
        add.addChildToBack(num(1));
        ass.addChildToFront(left);
        ass.addChildToBack(add);
        Node parent = createParentWithChild(ass);
        Node result = optimizer.optimizeSubtree(ass);
        assertSame(ass, result);
    }

    @Test
    public void testFoldLeftChildAdd() {
        Node outer = new Node(Token.ADD);
        Node inner = new Node(Token.ADD);
        inner.addChildToBack(Node.newString(Token.NAME, "a"));
        inner.addChildToBack(str("b"));
        outer.addChildToBack(inner);
        outer.addChildToBack(str("c"));
        Node parent = createParentWithChild(outer);
        Node result = optimizer.optimizeSubtree(outer);
        assertEquals(Token.ADD, result.getType());
        Node left = result.getFirstChild();
        Node right = left.getNext();
        assertEquals(Token.NAME, left.getType());
        assertEquals("a", left.getString());
        assertEquals(Token.STRING, right.getType());
        assertEquals("bc", right.getString());
    }

    @Test
    public void testTryFoldBinaryNullLeft() {
        Node b = new Node(Token.ADD);
        Node parent = createParentWithChild(b);
        Node result = optimizer.optimizeSubtree(b);
        assertSame(b, result);
    }

    @Test
    public void testTryFoldBinaryOnlyLeft() {
        Node b = new Node(Token.ADD);
        b.addChildToFront(num(3));
        Node parent = createParentWithChild(b);
        Node result = optimizer.optimizeSubtree(b);
        assertSame(b, result);
    }

    @Test
    public void testFoldNotExpressionParent() {
        Node not = new Node(Token.NOT);
        Node child = num(5);
        not.addChildToFront(child);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(not);
        Node result = optimizer.optimizeSubtree(not);
        assertNull(result);
        assertSame(child, parent.getFirstChild());
    }

    @Test
    public void testFoldNegNonNumber() {
        Node neg = new Node(Token.NEG);
        neg.addChildToFront(Node.newString(Token.NAME, "x"));
        Node parent = createParentWithChild(neg);
        Node result = optimizer.optimizeSubtree(neg);
        assertSame(neg, result);
    }

    @Test
    public void testFoldBitnotNonNumber() {
        Node bn = new Node(Token.BITNOT);
        bn.addChildToFront(Node.newString(Token.NAME, "x"));
        Node parent = createParentWithChild(bn);
        Node result = optimizer.optimizeSubtree(bn);
        assertSame(bn, result);
    }

    @Test
    public void testFoldAndOrInIfCondition() {
        Node and = new Node(Token.AND);
        Node left = Node.newString(Token.NAME, "x");
        Node right = new Node(Token.TRUE);
        and.addChildToFront(left);
        and.addChildToBack(right);
        Node ifNode = new Node(Token.IF);
        ifNode.addChildToFront(and);
        Node result = optimizer.optimizeSubtree(and);
        assertSame(left, result);
        assertSame(left, ifNode.getFirstChild());
    }

    @Test
    public void testFoldStringJoinMixed() {
        Node call = new Node(Token.CALL);
        Node gp = new Node(Token.GETPROP);
        Node array = new Node(Token.ARRAYLIT);
        array.addChildToBack(str("a"));
        Node nonLit = Node.newString(Token.NAME, "b");
        array.addChildToBack(nonLit);
        array.addChildToBack(str("c"));
        gp.addChildToFront(array);
        gp.addChildToBack(Node.newString("join"));
        call.addChildToFront(gp);
        call.addChildToBack(str("-"));
        Node parent = createParentWithChild(call);
        Node result = optimizer.optimizeSubtree(call);
        assertSame(call, result);
    }

    @Test
    public void testFoldArithmeticOverflow() {
        Node mul = new Node(Token.MUL);
        mul.addChildToFront(num(1e30));
        mul.addChildToBack(num(1e30));
        Node parent = createParentWithChild(mul);
        Node result = optimizer.optimizeSubtree(mul);
        assertSame(mul, result);
    }

    @Test
    public void testOptimizeSubtreeUnknownToken() {
        Node n = new Node(Token.BREAK);
        Node parent = createParentWithChild(n);
        Node result = optimizer.optimizeSubtree(n);
        assertSame(n, result);
    }
}