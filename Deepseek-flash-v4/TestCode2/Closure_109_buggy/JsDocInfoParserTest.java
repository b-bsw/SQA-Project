package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import org.junit.Assert;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class JsDocInfoParserTest {

  @Test
  public void testParseTypeString_SimpleType() {
    Node result = JsDocInfoParser.parseTypeString("string");
    Assert.assertNotNull(result);
    Assert.assertEquals(Token.STRING, result.getToken());
    Assert.assertEquals("string", result.getString());
  }

  @Test
  public void testParseTypeString_FunctionType() {
    Node result = JsDocInfoParser.parseTypeString("function(string, number): boolean");
    Assert.assertNotNull(result);
    Assert.assertEquals(Token.FUNCTION, result.getToken());
    Assert.assertEquals(3, result.getChildCount());
    Assert.assertEquals(Token.PARAM_LIST, result.getFirstChild().getToken());
    Assert.assertEquals(Token.STRING, result.getFirstChild().getFirstChild().getToken());
    Assert.assertEquals("string", result.getFirstChild().getFirstChild().getString());
    Assert.assertEquals(Token.STRING, result.getFirstChild().getLastChild().getToken());
    Assert.assertEquals("number", result.getFirstChild().getLastChild().getString());
    Assert.assertEquals(Token.STRING, result.getLastChild().getToken());
    Assert.assertEquals("boolean", result.getLastChild().getString());
  }

  @Test
  public void testParseTypeString_UnionType() {
    Node result = JsDocInfoParser.parseTypeString("(string|number)");
    Assert.assertNotNull(result);
    Assert.assertEquals(Token.PIPE, result.getToken());
    Assert.assertEquals(2, result.getChildCount());
    Assert.assertEquals(Token.STRING, result.getFirstChild().getToken());
    Assert.assertEquals("string", result.getFirstChild().getString());
    Assert.assertEquals(Token.STRING, result.getLastChild().getToken());
    Assert.assertEquals("number", result.getLastChild().getString());
  }

  @Test
  public void testParseTypeString_InvalidMissingRC() {
    Node result = JsDocInfoParser.parseTypeString("{string");
    Assert.assertNull(result);
  }

  @Test
  public void testParseTypeString_EmptyString() {
    Node result = JsDocInfoParser.parseTypeString("");
    Assert.assertNull(result);
  }
}