package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

public class JsDocInfoParserTest {

  @Test
  public void testParseSimpleType() {
    Node type = JsDocInfoParser.parseTypeString("string");
    assertNotNull(type);
    assertEquals(Token.STRING, type.getType());
    assertEquals("string", type.getString());
  }

  @Test
  public void testParseQualifiedType() {
    Node type = JsDocInfoParser.parseTypeString("goog.ui.Button");
    assertNotNull(type);
    assertEquals(Token.STRING, type.getType());
    assertEquals("goog.ui.Button", type.getString());
  }

  @Test
  public void testParseAllType() {
    Node type = JsDocInfoParser.parseTypeString("*");
    assertNotNull(type);
    assertEquals(Token.STAR, type.getType());
  }

  @Test
  public void testParseBareNullableType() {
    Node type = JsDocInfoParser.parseTypeString("?");
    assertNotNull(type);
    assertEquals(Token.QMARK, type.getType());
    assertEquals(0, type.getChildCount());
  }

  @Test
  public void testParseNonNullableType() {
    Node type = JsDocInfoParser.parseTypeString("!Object");
    assertNotNull(type);
    assertEquals(Token.BANG, type.getType());
    assertEquals(1, type.getChildCount());
    assertNotNull(type.getFirstChild());
    assertEquals("Object", type.getFirstChild().getString());
  }

  @Test
  public void testParseUnionType() {
    Node type = JsDocInfoParser.parseTypeString("string|number");
    assertNotNull(type);
    assertEquals(Token.PIPE, type.getType());
    assertEquals(2, type.getChildCount());
    assertEquals("string", type.getChildAt(0).getString());
    assertEquals("number", type.getChildAt(1).getString());
  }

  @Test
  public void testParseFunctionType() {
    Node type = JsDocInfoParser.parseTypeString("function(string): number");
    assertNotNull(type);
    assertEquals(Token.FUNCTION, type.getType());
  }

  @Test
  public void testParseRecordType() {
    Node type = JsDocInfoParser.parseTypeString("{key: string}");
    assertNotNull(type);
    assertEquals(Token.LC, type.getType());
  }

  @Test
  public void testParseArrayType() {
    Node type = JsDocInfoParser.parseTypeString("[string]");
    assertNotNull(type);
    assertEquals(Token.LB, type.getType());
  }

  @Test
  public void testParseEmptyStringReturnsNull() {
    assertNull(JsDocInfoParser.parseTypeString(""));
  }

  @Test
  public void testParseMalformedTypeReturnsNull() {
    assertNull(JsDocInfoParser.parseTypeString("Array.<"));
    assertNull(JsDocInfoParser.parseTypeString("("));
  }

  @Test(expected = NullPointerException.class)
  public void testParseNullThrowsNullPointerException() {
    JsDocInfoParser.parseTypeString(null);
  }
}