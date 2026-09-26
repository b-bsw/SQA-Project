package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class NodeUtilTest {

    private Node node;

    @Before
    public void setUp() {
        node = null;
    }

    @Test
    public void testGetImpureBooleanValue_Assign() {
        Node assign = new Node(Token.ASSIGN);
        Node stringNode = Node.newString("hello");
        assign.addChildToBack(new Node(Token.NAME, "x"));
        assign.addChildToBack(stringNode);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(assign));
    }

    @Test
    public void testGetImpureBooleanValue_Comma() {
        Node comma = new Node(Token.COMMA);
        Node num = Node.newNumber(0);
        comma.addChildToBack(new Node(Token.NAME, "a"));
        comma.addChildToBack(num);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(comma));
    }

    @Test
    public void testGetImpureBooleanValue_Not() {
        Node not = new Node(Token.NOT);
        Node trueNode = new Node(Token.TRUE);
        not.addChildToBack(trueNode);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(not));
    }

    @Test
    public void testGetImpureBooleanValue_And() {
        Node and = new Node(Token.AND);
        Node trueNode = new Node(Token.TRUE);
        Node falseNode = new Node(Token.FALSE);
        and.addChildToBack(trueNode);
        and.addChildToBack(falseNode);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(and));
    }

    @Test
    public void testGetImpureBooleanValue_Or() {
        Node or = new Node(Token.OR);
        Node falseNode = new Node(Token.FALSE);
        Node trueNode = new Node(Token.TRUE);
        or.addChildToBack(falseNode);
        or.addChildToBack(trueNode);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(or));
    }

    @Test
    public void testGetImpureBooleanValue_Hook_Same() {
        Node hook = new Node(Token.HOOK);
        Node cond = new Node(Token.TRUE);
        Node trueVal = new Node(Token.STRING, "a");
        Node falseVal = new Node(Token.STRING, "b");
        hook.addChildToBack(cond);
        hook.addChildToBack(trueVal);
        hook.addChildToBack(falseVal);
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(hook));
    }

    @Test
    public void testGetImpureBooleanValue_Hook_Different() {
        Node hook = new Node(Token.HOOK);
        Node cond = new Node(Token.TRUE);
        Node trueVal = new Node(Token.STRING, "a");
        Node falseVal = new Node(Token.STRING, "a");
        hook.addChildToBack(cond);
        hook.addChildToBack(trueVal);
        hook.addChildToBack(falseVal);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(hook));
    }

    @Test
    public void testGetImpureBooleanValue_ArrayLit() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(arrayLit));
    }

    @Test
    public void testGetImpureBooleanValue_ObjectLit() {
        Node objLit = new Node(Token.OBJECTLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(objLit));
    }

    @Test
    public void testGetImpureBooleanValue_Default() {
        Node nameNode = Node.newString(Token.NAME, "undefined");
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(nameNode));
    }

    @Test
    public void testGetPureBooleanValue_String_NonEmpty() {
        Node strNode = Node.newString("test");
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(strNode));
    }

    @Test
    public void testGetPureBooleanValue_String_Empty() {
        Node strNode = Node.newString("");
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(strNode));
    }

    @Test
    public void testGetPureBooleanValue_Number_NonZero() {
        Node numNode = Node.newNumber(1.5);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(numNode));
    }

    @Test
    public void testGetPureBooleanValue_Number_Zero() {
        Node numNode = Node.newNumber(0.0);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(numNode));
    }

    @Test
    public void testGetPureBooleanValue_Not() {
        Node not = new Node(Token.NOT);
        Node falseNode = new Node(Token.FALSE);
        not.addChildToBack(falseNode);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(not));
    }

    @Test
    public void testGetPureBooleanValue_Null() {
        Node nullNode = new Node(Token.NULL);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(nullNode));
    }

    @Test
    public void testGetPureBooleanValue_False() {
        Node falseNode = new Node(Token.FALSE);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(falseNode));
    }

    @Test
    public void testGetPureBooleanValue_Void() {
        Node voidNode = new Node(Token.VOID);
        voidNode.addChildToBack(Node.newNumber(0));
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(voidNode));
    }

    @Test
    public void testGetPureBooleanValue_Name_Undefined() {
        Node nameNode = Node.newString(Token.NAME, "undefined");
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(nameNode));
    }

    @Test
    public void testGetPureBooleanValue_Name_NaN() {
        Node nameNode = Node.newString(Token.NAME, "NaN");
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(nameNode));
    }

    @Test
    public void testGetPureBooleanValue_Name_Infinity() {
        Node nameNode = Node.newString(Token.NAME, "Infinity");
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(nameNode));
    }

    @Test
    public void testGetPureBooleanValue_Name_Other() {
        Node nameNode = Node.newString(Token.NAME, "x");
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(nameNode));
    }

    @Test
    public void testGetPureBooleanValue_True() {
        Node trueNode = new Node(Token.TRUE);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(trueNode));
    }

    @Test
    public void testGetPureBooleanValue_RegExp() {
        Node regexp = new Node(Token.REGEXP);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(regexp));
    }

    @Test
    public void testGetPureBooleanValue_ArrayLit_NoSideEffects() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(arrayLit));
    }

    @Test
    public void testGetPureBooleanValue_ObjectLit_NoSideEffects() {
        Node objLit = new Node(Token.OBJECTLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(objLit));
    }

    @Test
    public void testGetStringValue_String() {
        Node strNode = Node.newString("hello");
        assertEquals("hello", NodeUtil.getStringValue(strNode));
    }

    @Test
    public void testGetStringValue_Name_Undefined() {
        Node nameNode = Node.newString(Token.NAME, "undefined");
        assertEquals("undefined", NodeUtil.getStringValue(nameNode));
    }

    @Test
    public void testGetStringValue_Name_Infinity() {
        Node nameNode = Node.newString(Token.NAME, "Infinity");
        assertEquals("Infinity", NodeUtil.getStringValue(nameNode));
    }

    @Test
    public void testGetStringValue_Name_NaN() {
        Node nameNode = Node.newString(Token.NAME, "NaN");
        assertEquals("NaN", NodeUtil.getStringValue(nameNode));
    }

    @Test
    public void testGetStringValue_Name_Other() {
        Node nameNode = Node.newString(Token.NAME, "x");
        assertNull(NodeUtil.getStringValue(nameNode));
    }

    @Test
    public void testGetStringValue_Number_Integer() {
        Node numNode = Node.newNumber(42.0);
        assertEquals("42", NodeUtil.getStringValue(numNode));
    }

    @Test
    public void testGetStringValue_Number_Double() {
        Node numNode = Node.newNumber(3.14);
        assertEquals("3.14", NodeUtil.getStringValue(numNode));
    }

    @Test
    public void testGetStringValue_False() {
        Node falseNode = new Node(Token.FALSE);
        assertEquals("false", NodeUtil.getStringValue(falseNode));
    }

    @Test
    public void testGetStringValue_True() {
        Node trueNode = new Node(Token.TRUE);
        assertEquals("true", NodeUtil.getStringValue(trueNode));
    }

    @Test
    public void testGetStringValue_Null() {
        Node nullNode = new Node(Token.NULL);
        assertEquals("null", NodeUtil.getStringValue(nullNode));
    }

    @Test
    public void testGetStringValue_Void() {
        Node voidNode = new Node(Token.VOID);
        voidNode.addChildToBack(Node.newNumber(0));
        assertEquals("undefined", NodeUtil.getStringValue(voidNode));
    }

    @Test
    public void testGetStringValue_Not_PureFalse() {
        Node not = new Node(Token.NOT);
        Node trueNode = new Node(Token.TRUE);
        not.addChildToBack(trueNode);
        assertEquals("false", NodeUtil.getStringValue(not));
    }

    @Test
    public void testGetStringValue_Not_PureTrue() {
        Node not = new Node(Token.NOT);
        Node falseNode = new Node(Token.FALSE);
        not.addChildToBack(falseNode);
        assertEquals("true", NodeUtil.getStringValue(not));
    }

    @Test
    public void testGetStringValue_Not_Unknown() {
        Node not = new Node(Token.NOT);
        Node nameNode = Node.newString(Token.NAME, "x");
        not.addChildToBack(nameNode);
        assertNull(NodeUtil.getStringValue(not));
    }

    @Test
    public void testGetStringValue_ArrayLit() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        Node str1 = Node.newString("a");
        Node str2 = Node.newString("b");
        arrayLit.addChildToBack(str1);
        arrayLit.addChildToBack(str2);
        assertEquals("a,b", NodeUtil.getStringValue(arrayLit));
    }

    @Test
    public void testGetStringValue_ArrayLit_NullElement() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        Node nullNode = new Node(Token.NULL);
        arrayLit.addChildToBack(nullNode);
        assertEquals("null", NodeUtil.getStringValue(arrayLit));
    }

    @Test
    public void testGetStringValue_ObjectLit() {
        Node objLit = new Node(Token.OBJECTLIT);
        assertEquals("[object Object]", NodeUtil.getStringValue(objLit));
    }

    @Test
    public void testGetArrayElementStringValue_Null() {
        Node nullNode = new Node(Token.NULL);
        assertEquals("null", NodeUtil.getArrayElementStringValue(nullNode));
    }

    @Test
    public void testGetArrayElementStringValue_Undefined() {
        Node voidNode = new Node(Token.VOID);
        voidNode.addChildToBack(Node.newNumber(0));
        assertEquals("undefined", NodeUtil.getArrayElementStringValue(voidNode));
    }

    @Test
    public void testGetArrayElementStringValue_Empty() {
        Node emptyNode = new Node(Token.EMPTY);
        assertEquals("", NodeUtil.getArrayElementStringValue(emptyNode));
    }

    @Test
    public void testGetArrayElementStringValue_String() {
        Node strNode = Node.newString("test");
        assertEquals("test", NodeUtil.getArrayElementStringValue(strNode));
    }

    @Test
    public void testArrayToString_Empty() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        assertEquals("", NodeUtil.arrayToString(arrayLit));
    }

    @Test
    public void testArrayToString_OneElement() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.addChildToBack(Node.newString("a"));
        assertEquals("a", NodeUtil.arrayToString(arrayLit));
    }

    @Test
    public void testArrayToString_Multiple() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.addChildToBack(Node.newString("a"));
        arrayLit.addChildToBack(Node.newString("b"));
        arrayLit.addChildToBack(Node.newString("c"));
        assertEquals("a,b,c", NodeUtil.arrayToString(arrayLit));
    }

    @Test
    public void testArrayToString_NullChild() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.addChildToBack(new Node(Token.NULL));
        assertNull(NodeUtil.arrayToString(arrayLit));
    }

    @Test
    public void testGetNumberValue_True() {
        Node trueNode = new Node(Token.TRUE);
        assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(trueNode));
    }

    @Test
    public void testGetNumberValue_False() {
        Node falseNode = new Node(Token.FALSE);
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(falseNode));
    }

    @Test
    public void testGetNumberValue_Null() {
        Node nullNode = new Node(Token.NULL);
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(nullNode));
    }

    @Test
    public void testGetNumberValue_Number() {
        Node numNode = Node.newNumber(3.14);
        assertEquals(Double.valueOf(3.14), NodeUtil.getNumberValue(numNode));
    }

    @Test
    public void testGetNumberValue_Void_NoSideEffects() {
        Node voidNode = new Node(Token.VOID);
        voidNode.addChildToBack(Node.newNumber(0));
        assertEquals(Double.NaN, NodeUtil.getNumberValue(voidNode), 0.0);
    }

    @Test
    public void testGetNumberValue_Void_WithSideEffects() {
        Node voidNode = new Node(Token.VOID);
        Node callNode = new Node(Token.CALL);
        callNode.addChildToBack(Node.newString(Token.NAME, "foo"));
        voidNode.addChildToBack(callNode);
        assertNull(NodeUtil.getNumberValue(voidNode));
    }

    @Test
    public void testGetNumberValue_Name_Undefined() {
        Node nameNode = Node.newString(Token.NAME, "undefined");
        assertEquals(Double.NaN, NodeUtil.getNumberValue(nameNode), 0.0);
    }

    @Test
    public void testGetNumberValue_Name_NaN() {
        Node nameNode = Node.newString(Token.NAME, "NaN");
        assertEquals(Double.NaN, NodeUtil.getNumberValue(nameNode), 0.0);
    }

    @Test
    public void testGetNumberValue_Name_Infinity() {
        Node nameNode = Node.newString(Token.NAME, "Infinity");
        assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(nameNode), 0.0);
    }

    @Test
    public void testGetNumberValue_Name_Other() {
        Node nameNode = Node.newString(Token.NAME, "x");
        assertNull(NodeUtil.getNumberValue(nameNode));
    }

    @Test
    public void testGetNumberValue_Neg_Infinity() {
        Node neg = new Node(Token.NEG);
        Node infNode = Node.newString(Token.NAME, "Infinity");
        neg.addChildToBack(infNode);
        assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(neg), 0.0);
    }

    @Test
    public void testGetNumberValue_Neg_Other() {
        Node neg = new Node(Token.NEG);
        neg.addChildToBack(Node.newNumber(5));
        assertNull(NodeUtil.getNumberValue(neg));
    }

    @Test
    public void testGetNumberValue_Not_PureTrue() {
        Node not = new Node(Token.NOT);
        Node falseNode = new Node(Token.FALSE);
        not.addChildToBack(falseNode);
        assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(not));
    }

    @Test
    public void testGetNumberValue_Not_PureFalse() {
        Node not = new Node(Token.NOT);
        Node trueNode = new Node(Token.TRUE);
        not.addChildToBack(trueNode);
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(not));
    }

    @Test
    public void testGetNumberValue_Not_Unknown() {
        Node not = new Node(Token.NOT);
        Node nameNode = Node.newString(Token.NAME, "x");
        not.addChildToBack(nameNode);
        assertNull(NodeUtil.getNumberValue(not));
    }

    @Test
    public void testGetNumberValue_String_Valid() {
        Node strNode = Node.newString("42");
        assertEquals(Double.valueOf(42.0), NodeUtil.getNumberValue(strNode));
    }

    @Test
    public void testGetNumberValue_String_Invalid() {
        Node strNode = Node.newString("abc");
        assertEquals(Double.NaN, NodeUtil.getNumberValue(strNode), 0.0);
    }

    @Test
    public void testGetNumberValue_ArrayLit() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(arrayLit));
    }

    @Test
    public void testGetNumberValue_ObjectLit() {
        Node objLit = new Node(Token.OBJECTLIT);
        assertEquals(Double.NaN, NodeUtil.getNumberValue(objLit), 0.0);
    }

    @Test
    public void testGetStringNumberValue_Empty() {
        assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue(""));
    }

    @Test
    public void testGetStringNumberValue_Hex() {
        assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xFF"));
    }

    @Test
    public void testGetStringNumberValue_HexInvalid() {
        assertEquals(Double.NaN, NodeUtil.getStringNumberValue("0xGG"), 0.0);
    }

    @Test
    public void testGetStringNumberValue_SignedHex() {
        assertNull(NodeUtil.getStringNumberValue("-0x1"));
    }

    @Test
    public void testGetStringNumberValue_InfinityString() {
        assertNull(NodeUtil.getStringNumberValue("infinity"));
    }

    @Test
    public void testGetStringNumberValue_ValidNumber() {
        assertEquals(Double.valueOf(3.14), NodeUtil.getStringNumberValue("3.14"));
    }

    @Test
    public void testGetStringNumberValue_Invalid() {
        assertEquals(Double.NaN, NodeUtil.getStringNumberValue("notanumber"), 0.0);
    }

    @Test
    public void testTrimJsWhiteSpace_NoTrim() {
        assertEquals("hello", NodeUtil.trimJsWhiteSpace("hello"));
    }

    @Test
    public void testTrimJsWhiteSpace_Leading() {
        assertEquals("hello", NodeUtil.trimJsWhiteSpace("   hello"));
    }

    @Test
    public void testTrimJsWhiteSpace_Trailing() {
        assertEquals("hello", NodeUtil.trimJsWhiteSpace("hello   "));
    }

    @Test
    public void testTrimJsWhiteSpace_Both() {
        assertEquals("hello", NodeUtil.trimJsWhiteSpace("  hello  "));
    }

    @Test
    public void testTrimJsWhiteSpace_AllWhite() {
        assertEquals("", NodeUtil.trimJsWhiteSpace("   "));
    }

    @Test
    public void testIsStrWhiteSpaceChar_Space() {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar((int) ' '));
    }

    @Test
    public void testIsStrWhiteSpaceChar_Newline() {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar((int) '\n'));
    }

    @Test
    public void testIsStrWhiteSpaceChar_Tab() {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar((int) '\t'));
    }

    @Test
    public void testIsStrWhiteSpaceChar_NonSpace() {
        assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar((int) 'a'));
    }

    @Test
    public void testIsStrWhiteSpaceChar_SpaceSeparator() {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(0x2000));
    }

    @Test
    public void testIsStrWhiteSpaceChar_NonSpaceSeparator() {
        assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar(0x200B));
    }

    @Test
    public void testGetFunctionName_NoParent() {
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(Node.newString(Token.NAME, "myFunc"));
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(fnNode);
        assertEquals("myFunc", NodeUtil.getFunctionName(fnNode));
    }

    @Test
    public void testGetFunctionName_Assign() {
        Node assign = new Node(Token.ASSIGN);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString(Token.NAME, "obj"));
        getProp.addChildToBack(Node.newString(Token.STRING, "method"));
        assign.addChildToBack(getProp);
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(Node.newString(Token.NAME, ""));
        assign.addChildToBack(fnNode);
        assertEquals("obj.method", NodeUtil.getFunctionName(fnNode));
    }

    @Test
    public void testGetFunctionName_NameParent() {
        Node nameNode = Node.newString(Token.NAME, "foo");
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(Node.newString(Token.NAME, ""));
        nameNode.addChildToBack(fnNode);
        assertEquals("foo", NodeUtil.getFunctionName(fnNode));
    }

    @Test
    public void testGetFunctionName_NullName() {
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(Node.newString(Token.NAME, ""));
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(fnNode);
        assertNull(NodeUtil.getFunctionName(fnNode));
    }

    @Test
    public void testGetNearestFunctionName_GetFunctionName() {
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(Node.newString(Token.NAME, "myFunc"));
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(fnNode);
        assertEquals("myFunc", NodeUtil.getNearestFunctionName(fnNode));
    }

    @Test
    public void testGetNearestFunctionName_Set() {
        Node setNode = new Node(Token.SET);
        setNode.addChildToBack(Node.newString(Token.STRING, "prop"));
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(Node.newString(Token.NAME, ""));
        setNode.addChildToBack(fnNode);
        assertEquals("prop", NodeUtil.getNearestFunctionName(fnNode));
    }

    @Test
    public void testGetNearestFunctionName_Get() {
        Node getNode = new Node(Token.GET);
        getNode.addChildToBack(Node.newString(Token.STRING, "prop"));
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(Node.newString(Token.NAME, ""));
        getNode.addChildToBack(fnNode);
        assertEquals("prop", NodeUtil.getNearestFunctionName(fnNode));
    }

    @Test
    public void testGetNearestFunctionName_StringParent() {
        Node stringNode = Node.newString(Token.STRING, "prop");
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(Node.newString(Token.NAME, ""));
        stringNode.addChildToBack(fnNode);
        assertEquals("prop", NodeUtil.getNearestFunctionName(fnNode));
    }

    @Test
    public void testGetNearestFunctionName_NumberParent() {
        Node numNode = Node.newNumber(0);
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(Node.newString(Token.NAME, ""));
        numNode.addChildToBack(fnNode);
        assertEquals("0", NodeUtil.getNearestFunctionName(fnNode));
    }

    @Test
    public void testGetNearestFunctionName_Null() {
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(Node.newString(Token.NAME, ""));
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(fnNode);
        assertNull(NodeUtil.getNearestFunctionName(fnNode));
    }

    @Test
    public void testIsImmutableValue_String() {
        assertTrue(NodeUtil.isImmutableValue(Node.newString("a")));
    }

    @Test
    public void testIsImmutableValue_Number() {
        assertTrue(NodeUtil.isImmutableValue(Node.newNumber(1)));
    }

    @Test
    public void testIsImmutableValue_Null() {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    }

    @Test
    public void testIsImmutableValue_True() {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    }

    @Test
    public void testIsImmutableValue_False() {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
    }

    @Test
    public void testIsImmutableValue_Not() {
        Node not = new Node(Token.NOT);
        not.addChildToBack(Node.newString("a"));
        assertTrue(NodeUtil.isImmutableValue(not));
    }

    @Test
    public void testIsImmutableValue_Void() {
        Node voidNode = new Node(Token.VOID);
        voidNode.addChildToBack(Node.newString("a"));
        assertTrue(NodeUtil.isImmutableValue(voidNode));
    }

    @Test
    public void testIsImmutableValue_Neg() {
        Node neg = new Node(Token.NEG);
        neg.addChildToBack(Node.newNumber(1));
        assertTrue(NodeUtil.isImmutableValue(neg));
    }

    @Test
    public void testIsImmutableValue_Name_Undefined() {
        assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "undefined")));
    }

    @Test
    public void testIsImmutableValue_Name_Infinity() {
        assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "Infinity")));
    }

    @Test
    public void testIsImmutableValue_Name_NaN() {
        assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "NaN")));
    }

    @Test
    public void testIsImmutableValue_Name_Other() {
        assertFalse(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "x")));
    }

    @Test
    public void testIsImmutableValue_ArrayLit() {
        assertFalse(NodeUtil.isImmutableValue(new Node(Token.ARRAYLIT)));
    }

    @Test
    public void testIsLiteralValue_ArrayLit_Empty() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        assertTrue(NodeUtil.isLiteralValue(arrayLit, true));
    }

    @Test
    public void testIsLiteralValue_ArrayLit_WithNonLiteral() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.addChildToBack(Node.newString(Token.NAME, "x"));
        assertFalse(NodeUtil.isLiteralValue(arrayLit, true));
    }

    @Test
    public void testIsLiteralValue_ArrayLit_WithLiteral() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.addChildToBack(Node.newString("a"));
        assertTrue(NodeUtil.isLiteralValue(arrayLit, true));
    }

    @Test
    public void testIsLiteralValue_RegExp_Empty() {
        Node regexp = new Node(Token.REGEXP);
        assertTrue(NodeUtil.isLiteralValue(regexp, true));
    }

    @Test
    public void testIsLiteralValue_RegExp_WithNonLiteral() {
        Node regexp = new Node(Token.REGEXP);
        regexp.addChildToBack(Node.newString(Token.NAME, "x"));
        assertFalse(NodeUtil.isLiteralValue(regexp, true));
    }

    @Test
    public void testIsLiteralValue_ObjectLit_Empty() {
        Node objLit = new Node(Token.OBJECTLIT);
        assertTrue(NodeUtil.isLiteralValue(objLit, true));
    }

    @Test
    public void testIsLiteralValue_ObjectLit_WithNonLiteral() {
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString("key");
        key.addChildToBack(Node.newString(Token.NAME, "x"));
        objLit.addChildToBack(key);
        assertFalse(NodeUtil.isLiteralValue(objLit, true));
    }

    @Test
    public void testIsLiteralValue_Function_Include() {
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(Node.newString(Token.NAME, ""));
        fnNode.addChildToBack(new Node(Token.LP));
        fnNode.addChildToBack(new Node(Token.BLOCK));
        assertTrue(NodeUtil.isLiteralValue(fnNode, true));
    }

    @Test
    public void testIsLiteralValue_Function_Exclude() {
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(Node.newString(Token.NAME, ""));
        fnNode.addChildToBack(new Node(Token.LP));
        fnNode.addChildToBack(new Node(Token.BLOCK));
        assertFalse(NodeUtil.isLiteralValue(fnNode, false));
    }

    @Test
    public void testIsLiteralValue_Immutable() {
        assertTrue(NodeUtil.isLiteralValue(Node.newString("a"), true));
    }

    @Test
    public void testIsValidDefineValue_String() {
        Set<String> defines = new HashSet<>();
        Node val = Node.newString("a");
        assertTrue(NodeUtil.isValidDefineValue(val, defines));
    }

    @Test
    public void testIsValidDefineValue_Number() {
        Set<String> defines = new HashSet<>();
        Node val = Node.newNumber(1);
        assertTrue(NodeUtil.isValidDefineValue(val, defines));
    }

    @Test
    public void testIsValidDefineValue_True() {
        Set<String> defines = new HashSet<>();
        Node val = new Node(Token.TRUE);
        assertTrue(NodeUtil.isValidDefineValue(val, defines));
    }

    @Test
    public void testIsValidDefineValue_False() {
        Set<String> defines = new HashSet<>();
        Node val = new Node(Token.FALSE);
        assertTrue(NodeUtil.isValidDefineValue(val, defines));
    }

    @Test
    public void testIsValidDefineValue_Add_Valid() {
        Set<String> defines = new HashSet<>();
        Node add = new Node(Token.ADD);
        add.addChildToBack(Node.newNumber(1));
        add.addChildToBack(Node.newNumber(2));
        assertTrue(NodeUtil.isValidDefineValue(add, defines));
    }

    @Test
    public void testIsValidDefineValue_Add_Invalid() {
        Set<String> defines = new HashSet<>();
        Node add = new Node(Token.ADD);
        add.addChildToBack(Node.newString("a"));
        add.addChildToBack(Node.newString(Token.NAME, "x"));
        assertFalse(NodeUtil.isValidDefineValue(add, defines));
    }

    @Test
    public void testIsValidDefineValue_Not_Valid() {
        Set<String> defines = new HashSet<>();
        Node not = new Node(Token.NOT);
        not.addChildToBack(Node.newNumber(0));
        assertTrue(NodeUtil.isValidDefineValue(not, defines));
    }

    @Test
    public void testIsValidDefineValue_Neg_Valid() {
        Set<String> defines = new HashSet<>();
        Node neg = new Node(Token.NEG);
        neg.addChildToBack(Node.newNumber(1));
        assertTrue(NodeUtil.isValidDefineValue(neg, defines));
    }

    @Test
    public void testIsValidDefineValue_Name_InDefines() {
        Set<String> defines = new HashSet<>();
        defines.add("x");
        Node name = Node.newString(Token.NAME, "x");
        assertTrue(NodeUtil.isValidDefineValue(name, defines));
    }

    @Test
    public void testIsValidDefineValue_Name_NotInDefines() {
        Set<String> defines = new HashSet<>();
        Node name = Node.newString(Token.NAME, "x");
        assertFalse(NodeUtil.isValidDefineValue(name, defines));
    }

    @Test
    public void testIsValidDefineValue_GetProp_InDefines() {
        Set<String> defines = new HashSet<>();
        defines.add("a.b");
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString(Token.NAME, "a"));
        getProp.addChildToBack(Node.newString(Token.STRING, "b"));
        assertTrue(NodeUtil.isValidDefineValue(getProp, defines));
    }

    @Test
    public void testIsValidDefineValue_GetProp_NotInDefines() {
        Set<String> defines = new HashSet<>();
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString(Token.NAME, "a"));
        getProp.addChildToBack(Node.newString(Token.STRING, "b"));
        assertFalse(NodeUtil.isValidDefineValue(getProp, defines));
    }

    @Test
    public void testIsValidDefineValue_Other() {
        Set<String> defines = new HashSet<>();
        Node call = new Node(Token.CALL);
        assertFalse(NodeUtil.isValidDefineValue(call, defines));
    }

    @Test
    public void testIsEmptyBlock_NotBlock() {
        Node notBlock = new Node(Token.SCRIPT);
        assertFalse(NodeUtil.isEmptyBlock(notBlock));
    }

    @Test
    public void testIsEmptyBlock_Empty() {
        Node block = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_WithEmptyChildren() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.EMPTY));
        assertTrue(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_WithNonEmpty() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(Node.newString("a"));
        assertFalse(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsSimpleOperator_True() {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.ADD)));
    }

    @Test
    public void testIsSimpleOperator_False() {
        assertFalse(NodeUtil.isSimpleOperator(new Node(Token.FUNCTION)));
    }

    @Test
    public void testIsSimpleOperatorType_True() {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
    }

    @Test
    public void testIsSimpleOperatorType_False() {
        assertFalse(NodeUtil.isSimpleOperatorType(Token.FUNCTION));
    }

    @Test
    public void testNewExpr() {
        Node child = Node.newString("a");
        Node expr = NodeUtil.newExpr(child);
        assertEquals(Token.EXPR_RESULT, expr.getType());
        assertSame(child, expr.getFirstChild());
    }

    @Test
    public void testMayEffectMutableState_Throw() {
        Node throwNode = new Node(Token.THROW);
        throwNode.addChildToBack(Node.newString("a"));
        assertTrue(NodeUtil.mayEffectMutableState(throwNode));
    }

    @Test
    public void testMayEffectMutableState_ObjectLit_Check() {
        Node objLit = new Node(Token.OBJECTLIT);
        assertTrue(NodeUtil.mayEffectMutableState(objLit));
    }

    @Test(expected = IllegalStateException.class)
    public void testConstructorCallHasSideEffects_WrongType() {
        Node callNode = new Node(Token.CALL);
        NodeUtil.constructorCallHasSideEffects(callNode);
    }

    @Test
    public void testConstructorCallHasSideEffects_NoSideEffects() {
        Node newnode = new Node(Token.NEW);
        newnode.addChildToBack(Node.newString(Token.NAME, "Array"));
        assertFalse(NodeUtil.constructorCallHasSideEffects(newnode));
    }

    @Test
    public void testConstructorCallHasSideEffects_WithSideEffects() {
        Node newnode = new Node(Token.NEW);
        newnode.addChildToBack(Node.newString(Token.NAME, "MyClass"));
        assertTrue(NodeUtil.constructorCallHasSideEffects(newnode));
    }

    @Test(expected = IllegalStateException.class)
    public void testFunctionCallHasSideEffects_WrongType() {
        Node callNode = new Node(Token.NEW);
        NodeUtil.functionCallHasSideEffects(callNode);
    }

    @Test
    public void testFunctionCallHasSideEffects_NoSideEffects() {
        Node callNode = new Node(Token.CALL);
        callNode.addChildToBack(Node.newString(Token.NAME, "Object"));
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testFunctionCallHasSideEffects_WithSideEffects() {
        Node callNode = new Node(Token.CALL);
        callNode.addChildToBack(Node.newString(Token.NAME, "foo"));
        assertTrue(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testCallHasLocalResult_True() {
        Node callNode = new Node(Token.CALL);
        callNode.putIntProp(Node.SIDE_EFFECT_FLAGS, Node.FLAG_LOCAL_RESULTS);
        assertTrue(NodeUtil.callHasLocalResult(callNode));
    }

    @Test(expected = IllegalStateException.class)
    public void testCallHasLocalResult_WrongType() {
        NodeUtil.callHasLocalResult(new Node(Token.NEW));
    }

    @Test
    public void testNewHasLocalResult_True() {
        Node newNode = new Node(Token.NEW);
        newNode.putBooleanProp(Node.ONLY_MODIFIES_THIS_CALL, true);
        assertTrue(NodeUtil.newHasLocalResult(newNode));
    }

    @Test(expected = IllegalStateException.class)
    public void testNewHasLocalResult_WrongType() {
        NodeUtil.newHasLocalResult(new Node(Token.CALL));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_Assignment() {
        Node assign = new Node(Token.ASSIGN);
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(assign));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_Delete() {
        Node del = new Node(Token.DELPROP);
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(del));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_Call() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(Node.newString(Token.NAME, "foo"));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(call));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_New() {
        Node newnode = new Node(Token.NEW);
        newnode.addChildToBack(Node.newString(Token.NAME, "MyClass"));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(newnode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_Name_NoChildren() {
        Node name = Node.newString(Token.NAME, "x");
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(name));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_Name_HasChildren() {
        Node name = Node.newString(Token.NAME, "x");
        name.addChildToBack(Node.newNumber(1));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(name));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_Other() {
        Node str = Node.newString("a");
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(str));
    }

    @Test
    public void testCanBeSideEffected_Call() {
        Node call = new Node(Token.CALL);
        assertTrue(NodeUtil.canBeSideEffected(call));
    }

    @Test
    public void testCanBeSideEffected_New() {
        Node newNode = new Node(Token.NEW);
        assertTrue(NodeUtil.canBeSideEffected(newNode));
    }

    @Test
    public void testCanBeSideEffected_Name_NotConstant() {
        Node name = Node.newString(Token.NAME, "x");
        assertTrue(NodeUtil.canBeSideEffected(name));
    }

    @Test
    public void testCanBeSideEffected_Name_Constant() {
        Node name = Node.newString(Token.NAME, "x");
        name.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertFalse(NodeUtil.canBeSideEffected(name));
    }

    @Test
    public void testCanBeSideEffected_GetProp() {
        Node getProp = new Node(Token.GETPROP);
        assertTrue(NodeUtil.canBeSideEffected(getProp));
    }

    @Test
    public void testCanBeSideEffected_Function() {
        Node fn = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.canBeSideEffected(fn));
    }

    @Test
    public void testPrecedence_Comma() {
        assertEquals(0, NodeUtil.precedence(Token.COMMA));
    }

    @Test
    public void testPrecedence_Assign() {
        assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    }

    @Test
    public void testPrecedence_Hook() {
        assertEquals(2, NodeUtil.precedence(Token.HOOK));
    }

    @Test
    public void testPrecedence_Or() {
        assertEquals(3, NodeUtil.precedence(Token.OR));
    }

    @Test
    public void testPrecedence_And() {
        assertEquals(4, NodeUtil.precedence(Token.AND));
    }

    @Test
    public void testPrecedence_BitOr() {
        assertEquals(5, NodeUtil.precedence(Token.BITOR));
    }

    @Test
    public void testPrecedence_BitXor() {
        assertEquals(6, NodeUtil.precedence(Token.BITXOR));
    }

    @Test
    public void testPrecedence_BitAnd() {
        assertEquals(7, NodeUtil.precedence(Token.BITAND));
    }

    @Test
    public void testPrecedence_Equality() {
        assertEquals(8, NodeUtil.precedence(Token.EQ));
    }

    @Test
    public void testPrecedence_Relational() {
        assertEquals(9, NodeUtil.precedence(Token.LT));
    }

    @Test
    public void testPrecedence_Shift() {
        assertEquals(10, NodeUtil.precedence(Token.LSH));
    }

    @Test
    public void testPrecedence_Additive() {
        assertEquals(11, NodeUtil.precedence(Token.ADD));
    }

    @Test
    public void testPrecedence_Multiplicative() {
        assertEquals(12, NodeUtil.precedence(Token.MUL));
    }

    @Test
    public void testPrecedence_Unary() {
        assertEquals(13, NodeUtil.precedence(Token.NOT));
    }

    @Test
    public void testPrecedence_Primary() {
        assertEquals(15, NodeUtil.precedence(Token.NAME));
    }

    @Test(expected = Error.class)
    public void testPrecedence_Unknown() {
        NodeUtil.precedence(Token.BREAK);
    }

    @Test
    public void testValueCheck_Assign() {
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(Node.newNumber(1));
        assign.addChildToBack(Node.newString("a"));
        assertTrue(NodeUtil.valueCheck(assign, new NodeUtil.MatchNodeType(Token.STRING)));
    }

    @Test
    public void testValueCheck_And() {
        Node and = new Node(Token.AND);
        and.addChildToBack(Node.newString("a"));
        and.addChildToBack(Node.newString("b"));
        assertTrue(NodeUtil.valueCheck(and, new NodeUtil.MatchNodeType(Token.STRING)));
    }

    @Test
    public void testValueCheck_Or() {
        Node or = new Node(Token.OR);
        or.addChildToBack(Node.newString("a"));
        or.addChildToBack(Node.newString("b"));
        assertTrue(NodeUtil.valueCheck(or, new NodeUtil.MatchNodeType(Token.STRING)));
    }

    @Test
    public void testValueCheck_Hook() {
        Node hook = new Node(Token.HOOK);
        hook.addChildToBack(new Node(Token.TRUE));
        hook.addChildToBack(Node.newString("a"));
        hook.addChildToBack(Node.newString("b"));
        assertTrue(NodeUtil.valueCheck(hook, new NodeUtil.MatchNodeType(Token.STRING)));
    }

    @Test
    public void testValueCheck_Default() {
        Node str = Node.newString("a");
        assertTrue(NodeUtil.valueCheck(str, new NodeUtil.MatchNodeType(Token.STRING)));
    }

    @Test
    public void testIsNumericResult_Add() {
        Node add = new Node(Token.ADD);
        add.addChildToBack(Node.newNumber(1));
        add.addChildToBack(Node.newNumber(2));
        assertTrue(NodeUtil.isNumericResult(add));
    }

    @Test
    public void testIsNumericResult_StringAdd() {
        Node add = new Node(Token.ADD);
        add.addChildToBack(Node.newString("a"));
        add.addChildToBack(Node.newNumber(1));
        assertFalse(NodeUtil.isNumericResult(add));
    }

    @Test
    public void testIsNumericResult_Number() {
        assertTrue(NodeUtil.isNumericResult(Node.newNumber(1)));
    }

    @Test
    public void testIsNumericResult_Name_NaN() {
        Node name = Node.newString(Token.NAME, "NaN");
        assertTrue(NodeUtil.isNumericResult(name));
    }

    @Test
    public void testIsNumericResult_Name_Infinity() {
        Node name = Node.newString(Token.NAME, "Infinity");
        assertTrue(NodeUtil.isNumericResult(name));
    }

    @Test
    public void testIsNumericResult_Name_Other() {
        Node name = Node.newString(Token.NAME, "x");
        assertFalse(NodeUtil.isNumericResult(name));
    }

    @Test
    public void testIsBooleanResult_True() {
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.TRUE)));
    }

    @Test
    public void testIsBooleanResult_Not() {
        Node not = new Node(Token.NOT);
        not.addChildToBack(new Node(Token.TRUE));
        assertTrue(NodeUtil.isBooleanResult(not));
    }

    @Test
    public void testIsBooleanResult_String() {
        assertFalse(NodeUtil.isBooleanResult(Node.newString("a")));
    }

    @Test
    public void testIsUndefined_Void() {
        Node voidNode = new Node(Token.VOID);
        voidNode.addChildToBack(Node.newNumber(0));
        assertTrue(NodeUtil.isUndefined(voidNode));
    }

    @Test
    public void testIsUndefined_Name_Undefined() {
        Node name = Node.newString(Token.NAME, "undefined");
        assertTrue(NodeUtil.isUndefined(name));
    }

    @Test
    public void testIsUndefined_False() {
        assertFalse(NodeUtil.isUndefined(Node.newString("a")));
    }

    @Test
    public void testIsNull_Null() {
        assertTrue(NodeUtil.isNull(new Node(Token.NULL)));
    }

    @Test
    public void testIsNull_False() {
        assertFalse(NodeUtil.isNull(new Node(Token.TRUE)));
    }

    @Test
    public void testIsNullOrUndefined_Null() {
        assertTrue(NodeUtil.isNullOrUndefined(new Node(Token.NULL)));
    }

    @Test
    public void testIsNullOrUndefined_Undefined() {
        Node voidNode = new Node(Token.VOID);
        voidNode.addChildToBack(Node.newNumber(0));
        assertTrue(NodeUtil.isNullOrUndefined(voidNode));
    }

    @Test
    public void testIsNullOrUndefined_False() {
        assertFalse(NodeUtil.isNullOrUndefined(new Node(Token.TRUE)));
    }

    @Test
    public void testMayBeString_Recurse_True() {
        Node add = new Node(Token.ADD);
        add.addChildToBack(Node.newString("a"));
        add.addChildToBack(Node.newNumber(1));
        assertTrue(NodeUtil.mayBeString(add, true));
    }

    @Test
    public void testMayBeString_Recurse_False() {
        Node add = new Node(Token.ADD);
        add.addChildToBack(Node.newNumber(1));
        add.addChildToBack(Node.newNumber(2));
        assertFalse(NodeUtil.mayBeString(add, true));
    }

    @Test
    public void testMayBeString_NonRecurse_String() {
        assertTrue(NodeUtil.mayBeString(Node.newString("a"), false));
    }

    @Test
    public void testMayBeString_NonRecurse_Number() {
        assertFalse(NodeUtil.mayBeString(Node.newNumber(1), false));
    }

    @Test
    public void testIsAssociative_True() {
        assertTrue(NodeUtil.isAssociative(Token.MUL));
    }

    @Test
    public void testIsAssociative_False() {
        assertFalse(NodeUtil.isAssociative(Token.ADD));
    }

    @Test
    public void testIsCommutative_True() {
        assertTrue(NodeUtil.isCommutative(Token.MUL));
    }

    @Test
    public void testIsCommutative_False() {
        assertFalse(NodeUtil.isCommutative(Token.ADD));
    }

    @Test
    public void testIsAssignmentOp_True() {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
    }

    @Test
    public void testIsAssignmentOp_False() {
        assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetOpFromAssignmentOp_Invalid() {
        NodeUtil.getOpFromAssignmentOp(new Node(Token.ADD));
    }

    @Test
    public void testGetOpFromAssignmentOp_Add() {
        assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_ADD)));
    }

    @Test
    public void testIsExpressionNode_True() {
        assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT)));
    }

    @Test
    public void testIsExpressionNode_False() {
        assertFalse(NodeUtil.isExpressionNode(new Node(Token.SCRIPT)));
    }

    @Test
    public void testContainsFunction_True() {
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(new Node(Token.FUNCTION));
        assertTrue(NodeUtil.containsFunction(script));
    }

    @Test
    public void testContainsFunction_False() {
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(Node.newString("a"));
        assertFalse(NodeUtil.containsFunction(script));
    }

    @Test
    public void testReferencesThis_True() {
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(new Node(Token.THIS));
        assertTrue(NodeUtil.referencesThis(script));
    }

    @Test
    public void testReferencesThis_InFunction() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        fn.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.THIS));
        fn.addChildToBack(body);
        assertFalse(NodeUtil.referencesThis(fn));
    }

    @Test
    public void testIsGet_GetProp() {
        assertTrue(NodeUtil.isGet(new Node(Token.GETPROP)));
    }

    @Test
    public void testIsGet_GetElem() {
        assertTrue(NodeUtil.isGet(new Node(Token.GETELEM)));
    }

    @Test
    public void testIsGet_False() {
        assertFalse(NodeUtil.isGet(new Node(Token.NAME)));
    }

    @Test
    public void testIsGetProp_True() {
        assertTrue(NodeUtil.isGetProp(new Node(Token.GETPROP)));
    }

    @Test
    public void testIsGetProp_False() {
        assertFalse(NodeUtil.isGetProp(new Node(Token.GETELEM)));
    }

    @Test
    public void testIsName_True() {
        assertTrue(NodeUtil.isName(new Node(Token.NAME)));
    }

    @Test
    public void testIsName_False() {
        assertFalse(NodeUtil.isName(new Node(Token.STRING)));
    }

    @Test
    public void testIsNew_True() {
        assertTrue(NodeUtil.isNew(new Node(Token.NEW)));
    }

    @Test
    public void testIsNew_False() {
        assertFalse(NodeUtil.isNew(new Node(Token.CALL)));
    }

    @Test
    public void testIsVar_True() {
        assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
    }

    @Test
    public void testIsVar_False() {
        assertFalse(NodeUtil.isVar(new Node(Token.NAME)));
    }

    @Test
    public void testIsVarDeclaration_True() {
        Node name = Node.newString(Token.NAME, "x");
        Node var = new Node(Token.VAR);
        var.addChildToBack(name);
        assertTrue(NodeUtil.isVarDeclaration(name));
    }

    @Test
    public void testIsVarDeclaration_False() {
        assertFalse(NodeUtil.isVarDeclaration(new Node(Token.NAME)));
    }

    @Test
    public void testGetAssignedValue_Var() {
        Node name = Node.newString(Token.NAME, "x");
        Node value = Node.newNumber(1);
        name.addChildToBack(value);
        Node var = new Node(Token.VAR);
        var.addChildToBack(name);
        assertEquals(value, NodeUtil.getAssignedValue(name));
    }

    @Test
    public void testGetAssignedValue_Assign() {
        Node assign = new Node(Token.ASSIGN);
        Node name = Node.newString(Token.NAME, "x");
        Node value = Node.newNumber(1);
        assign.addChildToBack(name);
        assign.addChildToBack(value);
        assertEquals(value, NodeUtil.getAssignedValue(name));
    }

    @Test
    public void testGetAssignedValue_None() {
        Node name = Node.newString(Token.NAME, "x");
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(name);
        assertNull(NodeUtil.getAssignedValue(name));
    }

    @Test
    public void testIsString_True() {
        assertTrue(NodeUtil.isString(new Node(Token.STRING)));
    }

    @Test
    public void testIsString_False() {
        assertFalse(NodeUtil.isString(new Node(Token.NAME)));
    }

    @Test
    public void testIsExprAssign_True() {
        Node expr = new Node(Token.EXPR_RESULT);
        expr.addChildToBack(new Node(Token.ASSIGN));
        assertTrue(NodeUtil.isExprAssign(expr));
    }

    @Test
    public void testIsExprAssign_False() {
        Node expr = new Node(Token.EXPR_RESULT);
        expr.addChildToBack(new Node(Token.CALL));
        assertFalse(NodeUtil.isExprAssign(expr));
    }

    @Test
    public void testIsAssign_True() {
        assertTrue(NodeUtil.isAssign(new Node(Token.ASSIGN)));
    }

    @Test
    public void testIsAssign_False() {
        assertFalse(NodeUtil.isAssign(new Node(Token.ADD)));
    }

    @Test
    public void testIsExprCall_True() {
        Node expr = new Node(Token.EXPR_RESULT);
        expr.addChildToBack(new Node(Token.CALL));
        assertTrue(NodeUtil.isExprCall(expr));
    }

    @Test
    public void testIsExprCall_False() {
        Node expr = new Node(Token.EXPR_RESULT);
        expr.addChildToBack(new Node(Token.ASSIGN));
        assertFalse(NodeUtil.isExprCall(expr));
    }

    @Test
    public void testIsForIn_True() {
        Node forNode = new Node(Token.FOR);
        forNode.addChildToBack(Node.newString(Token.NAME, "x"));
        forNode.addChildToBack(Node.newString("a"));
        forNode.addChildToBack(new Node(Token.BLOCK));
        assertTrue(NodeUtil.isForIn(forNode));
    }

    @Test
    public void testIsForIn_False() {
        Node forNode = new Node(Token.FOR);
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.BLOCK));
        assertFalse(NodeUtil.isForIn(forNode));
    }

    @Test
    public void testIsLoopStructure_For() {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.FOR)));
    }

    @Test
    public void testIsLoopStructure_Do() {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.DO)));
    }

    @Test
    public void testIsLoopStructure_While() {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.WHILE)));
    }

    @Test
    public void testIsLoopStructure_False() {
        assertFalse(NodeUtil.isLoopStructure(new Node(Token.IF)));
    }

    @Test
    public void testGetLoopCodeBlock_For() {
        Node forNode = new Node(Token.FOR);
        Node block = new Node(Token.BLOCK);
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(block);
        assertEquals(block, NodeUtil.getLoopCodeBlock(forNode));
    }

    @Test
    public void testGetLoopCodeBlock_While() {
        Node whileNode = new Node(Token.WHILE);
        Node block = new Node(Token.BLOCK);
        whileNode.addChildToBack(new Node(Token.EMPTY));
        whileNode.addChildToBack(block);
        assertEquals(block, NodeUtil.getLoopCodeBlock(whileNode));
    }

    @Test
    public void testGetLoopCodeBlock_Do() {
        Node doNode = new Node(Token.DO);
        Node block = new Node(Token.BLOCK);
        doNode.addChildToBack(block);
        doNode.addChildToBack(new Node(Token.EMPTY));
        assertEquals(block, NodeUtil.getLoopCodeBlock(doNode));
    }

    @Test
    public void testGetLoopCodeBlock_Other() {
        assertNull(NodeUtil.getLoopCodeBlock(new Node(Token.IF)));
    }

    @Test
    public void testIsWithinLoop_True() {
        Node forNode = new Node(Token.FOR);
        Node block = new Node(Token.BLOCK);
        Node name = Node.newString(Token.NAME, "x");
        block.addChildToBack(name);
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(block);
        assertTrue(NodeUtil.isWithinLoop(name));
    }

    @Test
    public void testIsWithinLoop_False() {
        Node script = new Node(Token.SCRIPT);
        Node name = Node.newString(Token.NAME, "x");
        script.addChildToBack(name);
        assertFalse(NodeUtil.isWithinLoop(name));
    }

    @Test
    public void testIsControlStructure_For() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.FOR)));
    }

    @Test
    public void testIsControlStructure_If() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.IF)));
    }

    @Test
    public void testIsControlStructure_False() {
        assertFalse(NodeUtil.isControlStructure(new Node(Token.NAME)));
    }

    @Test
    public void testIsControlStructureCodeBlock_For() {
        Node forNode = new Node(Token.FOR);
        Node block = new Node(Token.BLOCK);
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(block);
        assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, block));
    }

    @Test
    public void testIsControlStructureCodeBlock_If() {
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.TRUE);
        Node block = new Node(Token.BLOCK);
        ifNode.addChildToBack(cond);
        ifNode.addChildToBack(block);
        assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, block));
    }

    @Test
    public void testGetConditionExpression_If() {
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.TRUE);
        ifNode.addChildToBack(cond);
        assertEquals(cond, NodeUtil.getConditionExpression(ifNode));
    }

    @Test
    public void testGetConditionExpression_While() {
        Node whileNode = new Node(Token.WHILE);
        Node cond = new Node(Token.TRUE);
        whileNode.addChildToBack(cond);
        assertEquals(cond, NodeUtil.getConditionExpression(whileNode));
    }

    @Test
    public void testGetConditionExpression_Do() {
        Node doNode = new Node(Token.DO);
        Node cond = new Node(Token.TRUE);
        doNode.addChildToBack(new Node(Token.BLOCK));
        doNode.addChildToBack(cond);
        assertEquals(cond, NodeUtil.getConditionExpression(doNode));
    }

    @Test
    public void testGetConditionExpression_For() {
        Node forNode = new Node(Token.FOR);
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.BLOCK));
        assertNull(NodeUtil.getConditionExpression(forNode));
    }

    @Test
    public void testGetConditionExpression_ForInit() {
        Node forNode = new Node(Token.FOR);
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.BLOCK));
        forNode.addChildToBack(new Node(Token.EMPTY));
        assertEquals(forNode.getFirstChild().getNext(), NodeUtil.getConditionExpression(forNode));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetConditionExpression_Case() {
        Node caseNode = new Node(Token.CASE);
        NodeUtil.getConditionExpression(caseNode);
    }

    @Test
    public void testIsStatementBlock_SCRIPT() {
        assertTrue(NodeUtil.isStatementBlock(new Node(Token.SCRIPT)));
    }

    @Test
    public void testIsStatementBlock_BLOCK() {
        assertTrue(NodeUtil.isStatementBlock(new Node(Token.BLOCK)));
    }

    @Test
    public void testIsStatementBlock_False() {
        assertFalse(NodeUtil.isStatementBlock(new Node(Token.IF)));
    }

    @Test
    public void testIsStatement_True() {
        Node script = new Node(Token.SCRIPT);
        Node name = Node.newString(Token.NAME, "x");
        script.addChildToBack(name);
        assertTrue(NodeUtil.isStatement(name));
    }

    @Test
    public void testIsStatement_False() {
        Node add = new Node(Token.ADD);
        add.addChildToBack(Node.newNumber(1));
        add.addChildToBack(Node.newNumber(2));
        assertFalse(NodeUtil.isStatement(add.getFirstChild()));
    }

    @Test
    public void testIsReferenceName_True() {
        assertTrue(NodeUtil.isReferenceName(Node.newString(Token.NAME, "x")));
    }

    @Test
    public void testIsReferenceName_False() {
        assertFalse(NodeUtil.isReferenceName(Node.newString(Token.NAME, "")));
    }

    @Test
    public void testIsLabelName_True() {
        assertTrue(NodeUtil.isLabelName(new Node(Token.LABEL_NAME)));
    }

    @Test
    public void testIsLabelName_Null() {
        assertFalse(NodeUtil.isLabelName(null));
    }

    @Test
    public void testIsTryFinallyNode_True() {
        Node tryNode = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        Node catchBlock = new Node(Token.BLOCK);
        Node finallyBlock = new Node(Token.BLOCK);
        tryNode.addChildToBack(block);
        tryNode.addChildToBack(catchBlock);
        tryNode.addChildToBack(finallyBlock);
        assertTrue(NodeUtil.isTryFinallyNode(tryNode, finallyBlock));
    }

    @Test
    public void testIsTryFinallyNode_False() {
        Node tryNode = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        Node catchBlock = new Node(Token.BLOCK);
        tryNode.addChildToBack(block);
        tryNode.addChildToBack(catchBlock);
        assertFalse(NodeUtil.isTryFinallyNode(tryNode, catchBlock));
    }

    @Test
    public void testIsTryCatchNodeContainer_True() {
        Node tryNode = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        Node catchBlock = new Node(Token.BLOCK);
        tryNode.addChildToBack(block);
        tryNode.addChildToBack(catchBlock);
        assertTrue(NodeUtil.isTryCatchNodeContainer(catchBlock));
    }

    @Test
    public void testIsTryCatchNodeContainer_False() {
        Node tryNode = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        tryNode.addChildToBack(block);
        assertFalse(NodeUtil.isTryCatchNodeContainer(block));
    }

    @Test
    public void testMaybeAddFinally_AlreadyHas() {
        Node tryNode = new Node(Token.TRY);
        tryNode.addChildToBack(new Node(Token.BLOCK));
        tryNode.addChildToBack(new Node(Token.BLOCK));
        tryNode.addChildToBack(new Node(Token.BLOCK));
        NodeUtil.maybeAddFinally(tryNode);
        assertEquals(3, tryNode.getChildCount());
    }

    @Test
    public void testMaybeAddFinally_Add() {
        Node tryNode = new Node(Token.TRY);
        tryNode.addChildToBack(new Node(Token.BLOCK));
        tryNode.addChildToBack(new Node(Token.BLOCK));
        NodeUtil.maybeAddFinally(tryNode);
        assertEquals(3, tryNode.getChildCount());
    }

    @Test
    public void testIsCall_True() {
        assertTrue(NodeUtil.isCall(new Node(Token.CALL)));
    }

    @Test
    public void testIsCall_False() {
        assertFalse(NodeUtil.isCall(new Node(Token.NEW)));
    }

    @Test
    public void testIsCallOrNew_Call() {
        assertTrue(NodeUtil.isCallOrNew(new Node(Token.CALL)));
    }

    @Test
    public void testIsCallOrNew_New() {
        assertTrue(NodeUtil.isCallOrNew(new Node(Token.NEW)));
    }

    @Test
    public void testIsCallOrNew_False() {
        assertFalse(NodeUtil.isCallOrNew(new Node(Token.NAME)));
    }

    @Test
    public void testIsFunction_True() {
        assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
    }

    @Test
    public void testIsFunction_False() {
        assertFalse(NodeUtil.isFunction(new Node(Token.NAME)));
    }

    @Test
    public void testGetFunctionBody() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        fn.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        fn.addChildToBack(body);
        assertEquals(body, NodeUtil.getFunctionBody(fn));
    }

    @Test
    public void testIsThis_True() {
        assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
    }

    @Test
    public void testIsThis_False() {
        assertFalse(NodeUtil.isThis(new Node(Token.NAME)));
    }

    @Test
    public void testIsArrayLiteral_True() {
        assertTrue(NodeUtil.isArrayLiteral(new Node(Token.ARRAYLIT)));
    }

    @Test
    public void testIsArrayLiteral_False() {
        assertFalse(NodeUtil.isArrayLiteral(new Node(Token.OBJECTLIT)));
    }

    @Test
    public void testContainsCall_True() {
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(new Node(Token.CALL));
        assertTrue(NodeUtil.containsCall(script));
    }

    @Test
    public void testContainsCall_False() {
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(Node.newString("a"));
        assertFalse(NodeUtil.containsCall(script));
    }

    @Test
    public void testIsFunctionDeclaration_True() {
        Node script = new Node(Token.SCRIPT);
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        fn.addChildToBack(new Node(Token.LP));
        fn.addChildToBack(new Node(Token.BLOCK));
        script.addChildToBack(fn);
        assertTrue(NodeUtil.isFunctionDeclaration(fn));
    }

    @Test
    public void testIsFunctionDeclaration_False() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        fn.addChildToBack(new Node(Token.LP));
        fn.addChildToBack(new Node(Token.BLOCK));
        assertFalse(NodeUtil.isFunctionDeclaration(fn));
    }

    @Test
    public void testIsHoistedFunctionDeclaration_True() {
        Node script = new Node(Token.SCRIPT);
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        fn.addChildToBack(new Node(Token.LP));
        fn.addChildToBack(new Node(Token.BLOCK));
        script.addChildToBack(fn);
        assertTrue(NodeUtil.isHoistedFunctionDeclaration(fn));
    }

    @Test
    public void testIsHoistedFunctionDeclaration_False() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        fn.addChildToBack(new Node(Token.LP));
        fn.addChildToBack(new Node(Token.BLOCK));
        assertFalse(NodeUtil.isHoistedFunctionDeclaration(fn));
    }

    @Test
    public void testIsFunctionExpression_True() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        fn.addChildToBack(new Node(Token.LP));
        fn.addChildToBack(new Node(Token.BLOCK));
        assertTrue(NodeUtil.isFunctionExpression(fn));
    }

    @Test
    public void testIsFunctionExpression_False() {
        Node script = new Node(Token.SCRIPT);
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        fn.addChildToBack(new Node(Token.LP));
        fn.addChildToBack(new Node(Token.BLOCK));
        script.addChildToBack(fn);
        assertFalse(NodeUtil.isFunctionExpression(fn));
    }

    @Test
    public void testIsEmptyFunctionExpression_True() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        fn.addChildToBack(new Node(Token.LP));
        fn.addChildToBack(new Node(Token.BLOCK));
        assertTrue(NodeUtil.isEmptyFunctionExpression(fn));
    }

    @Test
    public void testIsEmptyFunctionExpression_False() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        fn.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(Node.newString("a"));
        fn.addChildToBack(body);
        assertFalse(NodeUtil.isEmptyFunctionExpression(fn));
    }

    @Test
    public void testIsVarArgsFunction_True() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        fn.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        Node name = Node.newString(Token.NAME, "arguments");
        body.addChildToBack(name);
        fn.addChildToBack(body);
        assertTrue(NodeUtil.isVarArgsFunction(fn));
    }

    @Test
    public void testIsVarArgsFunction_False() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        fn.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(Node.newString("x"));
        fn.addChildToBack(body);
        assertFalse(NodeUtil.isVarArgsFunction(fn));
    }

    @Test
    public void testIsObjectCallMethod_True() {
        Node callNode = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(new Node(Token.NAME));
        getProp.addChildToBack(Node.newString("toString"));
        callNode.addChildToBack(getProp);
        assertTrue(NodeUtil.isObjectCallMethod(callNode, "toString"));
    }

    @Test
    public void testIsObjectCallMethod_False() {
        Node callNode = new Node(Token.CALL);
        callNode.addChildToBack(Node.newString(Token.NAME, "foo"));
        assertFalse(NodeUtil.isObjectCallMethod(callNode, "toString"));
    }

    @Test
    public void testIsFunctionObjectCall_True() {
        Node callNode = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(new Node(Token.NAME));
        getProp.addChildToBack(Node.newString("call"));
        callNode.addChildToBack(getProp);
        assertTrue(NodeUtil.isFunctionObjectCall(callNode));
    }

    @Test
    public void testIsFunctionObjectCall_False() {
        Node callNode = new Node(Token.CALL);
        callNode.addChildToBack(Node.newString(Token.NAME, "foo"));
        assertFalse(NodeUtil.isFunctionObjectCall(callNode));
    }

    @Test
    public void testIsFunctionObjectApply_True() {
        Node callNode = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(new Node(Token.NAME));
        getProp.addChildToBack(Node.newString("apply"));
        callNode.addChildToBack(getProp);
        assertTrue(NodeUtil.isFunctionObjectApply(callNode));
    }

    @Test
    public void testIsFunctionObjectApply_False() {
        Node callNode = new Node(Token.CALL);
        callNode.addChildToBack(Node.newString(Token.NAME, "foo"));
        assertFalse(NodeUtil.isFunctionObjectApply(callNode));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_Call() {
        Node callNode = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(new Node(Token.NAME));
        getProp.addChildToBack(Node.newString("call"));
        callNode.addChildToBack(getProp);
        assertTrue(NodeUtil.isFunctionObjectCallOrApply(callNode));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_Apply() {
        Node callNode = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(new Node(Token.NAME));
        getProp.addChildToBack(Node.newString("apply"));
        callNode.addChildToBack(getProp);
        assertTrue(NodeUtil.isFunctionObjectCallOrApply(callNode));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_False() {
        Node callNode = new Node(Token.CALL);
        callNode.addChildToBack(Node.newString(Token.NAME, "foo"));
        assertFalse(NodeUtil.isFunctionObjectCallOrApply(callNode));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_True() {
        Node callNode = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString(Token.NAME, "obj"));
        getProp.addChildToBack(Node.newString("call"));
        callNode.addChildToBack(getProp);
        assertTrue(NodeUtil.isSimpleFunctionObjectCall(callNode));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_False() {
        Node callNode = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(new Node(Token.THIS));
        getProp.addChildToBack(Node.newString("call"));
        callNode.addChildToBack(getProp);
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(callNode));
    }

    @Test
    public void testIsLhs_Assign() {
        Node assign = new Node(Token.ASSIGN);
        Node name = Node.newString(Token.NAME, "x");
        assign.addChildToBack(name);
        assertTrue(NodeUtil.isLhs(name, assign));
    }

    @Test
    public void testIsLhs_Var() {
        Node var = new Node(Token.VAR);
        Node name = Node.newString(Token.NAME, "x");
        var.addChildToBack(name);
        assertTrue(NodeUtil.isLhs(name, var));
    }

    @Test
    public void testIsLhs_False() {
        Node add = new Node(Token.ADD);
        Node name = Node.newString(Token.NAME, "x");
        add.addChildToBack(name);
        assertFalse(NodeUtil.isLhs(name, add));
    }

    @Test
    public void testIsObjectLitKey_String_InObject() {
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString("key");
        objLit.addChildToBack(key);
        assertTrue(NodeUtil.isObjectLitKey(key, objLit));
    }

    @Test
    public void testIsObjectLitKey_Number_InObject() {
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = Node.newNumber(0);
        objLit.addChildToBack(key);
        assertTrue(NodeUtil.isObjectLitKey(key, objLit));
    }

    @Test
    public void testIsObjectLitKey_GetSet() {
        Node getNode = new Node(Token.GET);
        assertTrue(NodeUtil.isObjectLitKey(getNode, null));
    }

    @Test
    public void testIsObjectLitKey_False() {
        assertFalse(NodeUtil.isObjectLitKey(new Node(Token.NAME), null));
    }

    @Test
    public void testGetObjectLitKeyName_String() {
        assertEquals("key", NodeUtil.getObjectLitKeyName(Node.newString("key")));
    }

    @Test
    public void testGetObjectLitKeyName_Number() {
        assertEquals("42", NodeUtil.getObjectLitKeyName(Node.newNumber(42)));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetObjectLitKeyName_Invalid() {
        NodeUtil.getObjectLitKeyName(new Node(Token.NAME));
    }

    @Test
    public void testGetObjectLitKeyTypeFromValueType_Get() {
        Node key = new Node(Token.GET);
        FunctionType fnType = new FunctionType(null, null, null, null, null);
        assertNull(NodeUtil.getObjectLitKeyTypeFromValueType(key, fnType));
    }

    @Test
    public void testGetObjectLitKeyTypeFromValueType_Set() {
        Node key = new Node(Token.SET);
        FunctionType fnType = new FunctionType(null, null, null, null, null);
        assertNull(NodeUtil.getObjectLitKeyTypeFromValueType(key, fnType));
    }

    @Test
    public void testGetObjectLitKeyTypeFromValueType_Null() {
        Node key = Node.newString("key");
        assertNull(NodeUtil.getObjectLitKeyTypeFromValueType(key, null));
    }

    @Test
    public void testIsGetOrSetKey_Get() {
        assertTrue(NodeUtil.isGetOrSetKey(new Node(Token.GET)));
    }

    @Test
    public void testIsGetOrSetKey_Set() {
        assertTrue(NodeUtil.isGetOrSetKey(new Node(Token.SET)));
    }

    @Test
    public void testIsGetOrSetKey_False() {
        assertFalse(NodeUtil.isGetOrSetKey(new Node(Token.STRING)));
    }

    @Test
    public void testOpToStr_BitOr() {
        assertEquals("|", NodeUtil.opToStr(Token.BITOR));
    }

    @Test
    public void testOpToStr_OR() {
        assertEquals("||", NodeUtil.opToStr(Token.OR));
    }

    @Test
    public void testOpToStr_Unknown() {
        assertNull(NodeUtil.opToStr(Token.BREAK));
    }

    @Test
    public void testOpToStrNoFail_Valid() {
        assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
    }

    @Test(expected = Error.class)
    public void testOpToStrNoFail_Invalid() {
        NodeUtil.opToStrNoFail(Token.BREAK);
    }

    @Test
    public void testContainsType_True() {
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(new Node(Token.FUNCTION));
        assertTrue(NodeUtil.containsType(script, Token.FUNCTION));
    }

    @Test
    public void testContainsType_False() {
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(Node.newString("a"));
        assertFalse(NodeUtil.containsType(script, Token.FUNCTION));
    }

    @Test
    public void testHas_True() {
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(Node.newString(Token.NAME, "x"));
        assertTrue(NodeUtil.has(script, new NodeUtil.MatchNameNode("x"), Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testHas_False() {
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(Node.newString("a"));
        assertFalse(NodeUtil.has(script, new NodeUtil.MatchNameNode("x"), Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testGetCount_One() {
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(new Node(Token.FUNCTION));
        assertEquals(1, NodeUtil.getCount(script, new NodeUtil.MatchNodeType(Token.FUNCTION), Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testGetCount_Zero() {
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(Node.newString("a"));
        assertEquals(0, NodeUtil.getCount(script, new NodeUtil.MatchNodeType(Token.FUNCTION), Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testHasFinally_True() {
        Node tryNode = new Node(Token.TRY);
        tryNode.addChildToBack(new Node(Token.BLOCK));
        tryNode.addChildToBack(new Node(Token.BLOCK));
        tryNode.addChildToBack(new Node(Token.BLOCK));
        assertTrue(NodeUtil.hasFinally(tryNode));
    }

    @Test
    public void testHasFinally_False() {
        Node tryNode = new Node(Token.TRY);
        tryNode.addChildToBack(new Node(Token.BLOCK));
        tryNode.addChildToBack(new Node(Token.BLOCK));
        assertFalse(NodeUtil.hasFinally(tryNode));
    }

    @Test
    public void testGetCatchBlock() {
        Node tryNode = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        Node catchBlock = new Node(Token.BLOCK);
        tryNode.addChildToBack(block);
        tryNode.addChildToBack(catchBlock);
        assertEquals(catchBlock, NodeUtil.getCatchBlock(tryNode));
    }

    @Test
    public void testHasCatchHandler_True() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.CATCH));
        assertTrue(NodeUtil.hasCatchHandler(block));
    }

    @Test
    public void testHasCatchHandler_False() {
        Node block = new Node(Token.BLOCK);
        assertFalse(NodeUtil.hasCatchHandler(block));
    }

    @Test
    public void testGetFnParameters() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, "f"));
        Node lp = new Node(Token.LP);
        lp.addChildToBack(Node.newString(Token.NAME, "x"));
        fn.addChildToBack(lp);
        fn.addChildToBack(new Node(Token.BLOCK));
        assertEquals(lp, NodeUtil.getFnParameters(fn));
    }

    @Test
    public void testIsConstantName_True() {
        Node name = Node.newString(Token.NAME, "x");
        name.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertTrue(NodeUtil.isConstantName(name));
    }

    @Test
    public void testIsConstantName_False() {
        Node name = Node.newString(Token.NAME, "x");
        assertFalse(NodeUtil.isConstantName(name));
    }

    @Test
    public void testNewUndefinedNode_WithRef() {
        Node ref = Node.newString("ref");
        Node undef = NodeUtil.newUndefinedNode(ref);
        assertEquals(Token.VOID, undef.getType());
        assertNotNull(undef.getFirstChild());
        assertEquals(Token.NUMBER, undef.getFirstChild().getType());
    }

    @Test
    public void testNewUndefinedNode_WithoutRef() {
        Node undef = NodeUtil.newUndefinedNode(null);
        assertEquals(Token.VOID, undef.getType());
        assertNotNull(undef.getFirstChild());
    }

    @Test
    public void testNewVarNode_WithValue() {
        Node var = NodeUtil.newVarNode("x", Node.newNumber(1));
        assertEquals(Token.VAR, var.getType());
        Node name = var.getFirstChild();
        assertEquals("x", name.getString());
        assertNotNull(name.getFirstChild());
    }

    @Test
    public void testNewVarNode_WithoutValue() {
        Node var = NodeUtil.newVarNode("x", null);
        assertEquals(Token.VAR, var.getType());
        Node name = var.getFirstChild();
        assertEquals("x", name.getString());
        assertNull(name.getFirstChild());
    }

    @Test
    public void testNewCallNode() {
        Node target = Node.newString(Token.NAME, "foo");
        Node param1 = Node.newNumber(1);
        Node call = NodeUtil.newCallNode(target, param1);
        assertEquals(Token.CALL, call.getType());
        assertSame(target, call.getFirstChild());
        assertSame(param1, target.getNext());
    }

    @Test
    public void testEvaluatesToLocalValue_Assign() {
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(new Node(Token.NAME));
        assign.addChildToBack(Node.newString("a"));
        assertTrue(NodeUtil.evaluatesToLocalValue(assign));
    }

    @Test
    public void testEvaluatesToLocalValue_And() {
        Node and = new Node(Token.AND);
        and.addChildToBack(Node.newString("a"));
        and.addChildToBack(Node.newString("b"));
        assertTrue(NodeUtil.evaluatesToLocalValue(and));
    }

    @Test
    public void testEvaluatesToLocalValue_Function() {
        Node fn = new Node(Token.FUNCTION);
        assertTrue(NodeUtil.evaluatesToLocalValue(fn));
    }
}