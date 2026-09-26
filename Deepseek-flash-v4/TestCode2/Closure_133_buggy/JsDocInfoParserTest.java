package com.google.javascript.jscomp.parsing;

import com.google.common.collect.Sets;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

public class JsDocInfoParserTest {

  private static Config createTestConfig() {
    return new Config(
        Sets.<String>newHashSet(),
        Sets.<String>newHashSet(),
        false,
        Config.LanguageMode.ECMASCRIPT3,
        false);
  }

  @Test
  public void testParseTypeStringSimpleType() {
    Node node = JsDocInfoParser.parseTypeString("number");
    Assert.assertNotNull(node);
    Assert.assertEquals(Node.STRING, node.getType());
    Assert.assertEquals("number", node.getString());
  }

  @Test
  public void testParseTypeStringGenericType() {
    Node node = JsDocInfoParser.parseTypeString("Array<string>");
    Assert.assertNotNull(node);
    Assert.assertEquals(Node.STRING, node.getType());
    Assert.assertEquals("Array", node.getString());
    Assert.assertEquals(1, node.getChildCount());
    Node child = node.getFirstChild();
    Assert.assertNotNull(child);
    // child should have the type expression list (block) with one child
    Assert.assertTrue(child.isBlock());
    Assert.assertEquals(1, child.getChildCount());
    Node typeExpr = child.getFirstChild();
    Assert.assertEquals(Node.STRING, typeExpr.getType());
    Assert.assertEquals("string", typeExpr.getString());
  }

  @Test
  public void testParseTypeStringNullable() {
    Node node = JsDocInfoParser.parseTypeString("?number");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.QMARK, node.getType());
    Assert.assertEquals(1, node.getChildCount());
    Node child = node.getFirstChild();
    Assert.assertNotNull(child);
    Assert.assertEquals(Node.STRING, child.getType());
    Assert.assertEquals("number", child.getString());
  }

  @Test
  public void testParseTypeStringNonNullable() {
    Node node = JsDocInfoParser.parseTypeString("!number");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.BANG, node.getType());
    Assert.assertEquals(1, node.getChildCount());
    Node child = node.getFirstChild();
    Assert.assertNotNull(child);
    Assert.assertEquals(Node.STRING, child.getType());
    Assert.assertEquals("number", child.getString());
  }

  @Test
  public void testParseTypeStringUnion() {
    Node node = JsDocInfoParser.parseTypeString("number|string");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.PIPE, node.getType());
    Assert.assertEquals(2, node.getChildCount());
    Assert.assertEquals(Node.STRING, node.getFirstChild().getType());
    Assert.assertEquals("number", node.getFirstChild().getString());
    Assert.assertEquals(Node.STRING, node.getLastChild().getType());
    Assert.assertEquals("string", node.getLastChild().getString());
  }

  @Test
  public void testParseTypeStringFunction() {
    Node node = JsDocInfoParser.parseTypeString("function(this:Object, number):string");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.FUNCTION, node.getType());
    // function node: children: [context type?], params, return type
    Assert.assertTrue(node.getChildCount() >= 2);
  }

  @Test
  public void testParseTypeStringArrayLiteral() {
    Node node = JsDocInfoParser.parseTypeString("[number, string]");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.LB, node.getType());
    Assert.assertEquals(2, node.getChildCount());
  }

  @Test
  public void testParseTypeStringRecord() {
    Node node = JsDocInfoParser.parseTypeString("{myNum: number, myString: string}");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.LC, node.getType());
    Assert.assertEquals(1, node.getChildCount()); // fieldTypeList
    Node fieldList = node.getFirstChild();
    Assert.assertEquals(Token.LB, fieldList.getType());
    Assert.assertEquals(2, fieldList.getChildCount());
  }

  @Test
  public void testParseTypeStringEmpty() {
    Node node = JsDocInfoParser.parseTypeString("");
    Assert.assertNull(node);
  }

  @Test(expected = NullPointerException.class)
  public void testParseTypeStringNull() {
    JsDocInfoParser.parseTypeString(null);
  }

  @Test
  public void testParseTypeStringInvalidSyntax() {
    // This should produce a warning but return null
    Node node = JsDocInfoParser.parseTypeString("{invalid");
    Assert.assertNull(node);
  }

  @Test
  public void testParseInlineTypeDocSimple() {
    JsDocTokenStream stream = new JsDocTokenStream("{number}");
    Config config = createTestConfig();
    JsDocInfoParser parser = new JsDocInfoParser(
        stream, null, null, config, NullErrorReporter.forNewRhino());

    JSDocInfo docInfo = parser.parseInlineTypeDoc();
    Assert.assertNotNull(docInfo);
    JSTypeExpression typeExpr = docInfo.getType();
    Assert.assertNotNull(typeExpr);
    Node root = typeExpr.getRoot();
    Assert.assertNotNull(root);
    Assert.assertEquals(Node.STRING, root.getType());
    Assert.assertEquals("number", root.getString());
  }

  @Test
  public void testParseInlineTypeDocEmpty() {
    JsDocTokenStream stream = new JsDocTokenStream("");
    Config config = createTestConfig();
    JsDocInfoParser parser = new JsDocInfoParser(
        stream, null, null, config, NullErrorReporter.forNewRhino());

    JSDocInfo docInfo = parser.parseInlineTypeDoc();
    Assert.assertNull(docInfo);
  }

  @Test
  public void testParseTypeStringLoopMultiple() {
    // Test generic with multiple type parameters
    Node node = JsDocInfoParser.parseTypeString("Map<string, number>");
    Assert.assertNotNull(node);
    Assert.assertEquals(Node.STRING, node.getType());
    Assert.assertEquals("Map", node.getString());
    Assert.assertEquals(1, node.getChildCount());
    Node block = node.getFirstChild();
    Assert.assertTrue(block.isBlock());
    Assert.assertEquals(2, block.getChildCount());
  }
}