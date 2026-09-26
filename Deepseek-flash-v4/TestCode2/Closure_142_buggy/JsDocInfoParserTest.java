package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class JsDocInfoParserTest {

    @Test
    public void testParseTypeStringBasicType() {
        Node node = JsDocInfoParser.parseTypeString("number");
        assertNotNull(node);
        assertEquals(Token.STRING, node.getType());
        assertEquals("number", node.getString());
    }

    @Test
    public void testParseTypeStringNullable() {
        Node node = JsDocInfoParser.parseTypeString("?number");
        assertNotNull(node);
        assertEquals(Token.QMARK, node.getType());
        Node child = node.getFirstChild();
        assertNotNull(child);
        assertEquals(Token.STRING, child.getType());
        assertEquals("number", child.getString());
    }

    @Test
    public void testParseTypeStringNonNullable() {
        Node node = JsDocInfoParser.parseTypeString("!number");
        assertNotNull(node);
        assertEquals(Token.BANG, node.getType());
        Node child = node.getFirstChild();
        assertEquals("number", child.getString());
    }

    @Test
    public void testParseTypeStringUnion() {
        Node node = JsDocInfoParser.parseTypeString("(number|string)");
        assertNotNull(node);
        assertEquals(Token.PIPE, node.getType());
        assertTrue(node.getChildCount() >= 2);
    }

    @Test
    public void testParseTypeStringFunctionNoParams() {
        Node node = JsDocInfoParser.parseTypeString("function():void");
        assertNotNull(node);
        assertEquals(Token.FUNCTION, node.getType());
        assertTrue(node.getChildCount() >= 2);
    }

    @Test
    public void testParseTypeStringFunctionWithParams() {
        Node node = JsDocInfoParser.parseTypeString("function(string, number):boolean");
        assertNotNull(node);
        assertEquals(Token.FUNCTION, node.getType());
    }

    @Test
    public void testParseTypeStringRecord() {
        Node node = JsDocInfoParser.parseTypeString("{myNum: number, myString: string}");
        assertNotNull(node);
        assertEquals(Token.LC, node.getType());
        Node fieldList = node.getFirstChild();
        assertNotNull(fieldList);
        assertEquals(Token.LB, fieldList.getType());
        assertTrue(fieldList.getChildCount() > 0);
    }

    @Test
    public void testParseTypeStringArray() {
        Node node = JsDocInfoParser.parseTypeString("[number, string]");
        assertNotNull(node);
        assertEquals(Token.LB, node.getType());
        assertTrue(node.getChildCount() >= 2);
    }

    @Test
    public void testParseTypeStringGeneric() {
        Node node = JsDocInfoParser.parseTypeString("Array.<number>");
        assertNotNull(node);
        assertEquals(Token.STRING, node.getType());
        assertEquals("Array", node.getString());
        assertTrue(node.getChildCount() > 0);
    }

    @Test
    public void testParseTypeStringStar() {
        Node node = JsDocInfoParser.parseTypeString("*");
        assertNotNull(node);
        assertEquals(Token.STAR, node.getType());
    }

    @Test
    public void testParseTypeStringEmptyString() {
        Node node = JsDocInfoParser.parseTypeString("");
        assertNull(node);
    }

    @Test(expected = NullPointerException.class)
    public void testParseTypeStringNull() {
        JsDocInfoParser.parseTypeString(null);
    }

    @Test
    public void testParseTypeStringInvalidSyntax() {
        Node node = JsDocInfoParser.parseTypeString("{invalid");
        assertNull(node);
    }

    @Test
    public void testParseTypeStringFunctionVarArgs() {
        Node node = JsDocInfoParser.parseTypeString("function(...string):void");
        assertNotNull(node);
        assertEquals(Token.FUNCTION, node.getType());
    }

    @Test
    public void testParseTypeStringNullableUnion() {
        Node node = JsDocInfoParser.parseTypeString("?number|string");
        assertNotNull(node);
    }
}