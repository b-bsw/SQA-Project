package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;

public class CodeGeneratorTest {

    private StringBuilder output;
    private CodeConsumer consumer;
    private CodeGenerator generator;

    @Before
    public void setUp() {
        output = new StringBuilder();
        consumer = new TestCodeConsumer(output);
        generator = new CodeGenerator(consumer, createDefaultOptions());
    }

    private CompilerOptions createDefaultOptions() {
        CompilerOptions options = new CompilerOptions();
        options.setOutputCharset(null);
        options.preferSingleQuotes = false;
        options.trustedStrings = true;
        return options;
    }

    // ---------------------------------------------------------------
    //  Stub implementations for CodeConsumer and CompilerOptions
    // ---------------------------------------------------------------

    private static class TestCodeConsumer implements CodeConsumer {
        private final StringBuilder out;

        TestCodeConsumer(StringBuilder out) {
            this.out = out;
        }

        @Override public void add(String str) { out.append(str); }
        @Override public void addIdentifier(String identifier) { out.append(identifier); }
        @Override public void addOp(String op, boolean isKeyword) { out.append(op); }
        @Override public void addNumber(double x) { out.append(Double.toString(x)); }
        @Override public void addConstant(String constant) { out.append(constant); }
        @Override public void startSourceMapping(Node n) { }
        @Override public void endSourceMapping(Node n) { }
        @Override public boolean continueProcessing() { return true; }
        @Override public void endStatement() { out.append(";"); }
        @Override public void endStatement(boolean ignore) { out.append(";"); }
        @Override public void beginBlock() { out.append("{"); }
        @Override public void endBlock(boolean breakAfter) { out.append("}"); if (breakAfter) out.append(";"); }
        @Override public boolean breakAfterBlockFor(Node n, boolean isStatement) { return false; }
        @Override public void notePreferredLineBreak() { }
        @Override public void maybeLineBreak() { }
        @Override public boolean shouldPreserveExtraBlocks() { return false; }
        @Override public void listSeparator() { out.append(","); }
        @Override public void beginCaseBody() { out.append(":"); }
        @Override public void endCaseBody() { }
    }

    private static class TestCompilerOptions extends CompilerOptions {
        private Charset outputCharset;
        boolean preferSingleQuotes;
        boolean trustedStrings;

        @Override public Charset getOutputCharset() { return outputCharset; }
        public void setOutputCharset(Charset c) { this.outputCharset = c; }
    }

    // ---------------------------------------------------------------
    //  Helper methods to create Nodes quickly
    // ---------------------------------------------------------------

    private Node numberNode(double val) {
        Node n = new Node(Token.NUMBER);
        n.setDouble(val);
        return n;
    }

    private Node stringNode(String str) {
        Node n = new Node(Token.STRING);
        n.setString(str);
        return n;
    }

    private Node nameNode(String name) {
        Node n = new Node(Token.NAME);
        n.setString(name);
        return n;
    }

    private Node labelNameNode(String name) {
        Node n = new Node(Token.LABEL_NAME);
        n.setString(name);
        return n;
    }

    private Node blockNode(Node... children) {
        Node block = new Node(Token.BLOCK);
        for (Node c : children) {
            block.addChildToBack(c);
        }
        return block;
    }

    // ---------------------------------------------------------------
    //  Tests
    // ---------------------------------------------------------------

    @Test
    public void testTagAsStrict() {
        generator.tagAsStrict();
        assertEquals("'use strict';", output.toString());
    }

    @Test
    public void testAddStringLiteral() {
        generator.add(stringNode("hello"));
        assertEquals("\"hello\"", output.toString());
    }

    @Test
    public void testAddNumber() {
        generator.add(numberNode(42.0));
        assertEquals("42.0", output.toString());
    }

    @Test
    public void testAddIdentifier() {
        generator.add(nameNode("foo"));
        assertEquals("foo", output.toString());
    }

    @Test
    public void testNameWithInit() {
        Node name = nameNode("x");
        name.addChildToBack(numberNode(10));
        generator.add(name);
        assertEquals("x=10", output.toString());
    }

    @Test
    public void testGetProp() {
        Node getprop = new Node(Token.GETPROP, nameNode("a"), stringNode("b"));
        generator.add(getprop);
        assertEquals("a.b", output.toString());
    }

    @Test
    public void testCall() {
        Node call = new Node(Token.CALL, nameNode("foo"), stringNode("arg"));
        generator.add(call);
        assertEquals("foo(\"arg\")", output.toString());
    }

    @Test
    public void testIndirectEvalCall() {
        Node eval = nameNode("eval");
        eval.putBooleanProp(Node.DIRECT_EVAL, false);
        Node call = new Node(Token.CALL, eval, stringNode("x"));
        generator.add(call);
        assertEquals("(0,eval)(\"x\")", output.toString());
    }

    @Test
    public void testIfElse() {
        Node cond = nameNode("c");
        Node thenBlock = blockNode(nameNode("a"));
        Node elseBlock = blockNode(nameNode("b"));
        Node ifNode = new Node(Token.IF, cond, thenBlock, elseBlock);
        generator.add(ifNode);
        assertEquals("if(c){a}else{b}", output.toString());
    }

    @Test
    public void testForLoop() {
        Node init = new Node(Token.VAR, nameNode("i"));
        init.getFirstChild().addChildToFront(numberNode(0));
        Node cond = new Node(Token.LT, nameNode("i"), numberNode(10));
        Node inc = new Node(Token.INC, nameNode("i"));
        inc.putIntProp(Node.INCRDECR_PROP, 1); // postfix
        Node body = blockNode(nameNode("x"));
        Node forNode = new Node(Token.FOR, init, cond, inc, body);
        generator.add(forNode);
        assertEquals("for(var i=0;i<10;i++)x", output.toString());
    }

    @Test
    public void testObjectLiteral() {
        Node key1 = stringNode("a");
        key1.setType(Token.STRING_KEY);
        key1.addChildToFront(numberNode(1));
        Node key2 = stringNode("b");
        key2.setType(Token.STRING_KEY);
        key2.addChildToFront(numberNode(2));
        Node obj = new Node(Token.OBJECTLIT, key1, key2);
        generator.add(obj);
        // keys are unquoted if they are valid identifiers (a, b are)
        assertEquals("{a:1,b:2}", output.toString());
    }

    @Test
    public void testIsSimpleNumber() {
        assertFalse(CodeGenerator.isSimpleNumber(""));
        assertFalse(CodeGenerator.isSimpleNumber("0"));
        assertTrue(CodeGenerator.isSimpleNumber("123"));
        assertFalse(CodeGenerator.isSimpleNumber("012"));
        assertFalse(CodeGenerator.isSimpleNumber("12a"));
    }

    @Test
    public void testGetSimpleNumber() {
        assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.0);
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("012")));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("999999999999999999"))); // > MAX_POSITIVE_INTEGER
    }

    @Test
    public void testIdentifierEscape() {
        assertEquals("abc", CodeGenerator.identifierEscape("abc"));
        assertEquals("\\u0100", CodeGenerator.identifierEscape("\u0100"));
    }

    @Test
    public void testStrEscapeWithNullEncoder() {
        // Use a generator with outputCharsetEncoder = null
        CompilerOptions opts = createDefaultOptions();
        opts.trustedStrings = true;
        CodeGenerator gen = new CodeGenerator(consumer, opts);
        String result = gen.escapeToDoubleQuotedJsString("a\"b\\nc");
        assertEquals("\"a\\\"b\\\\nc\"", result);
    }

    @Test
    public void testStrEscapeNonASCII() {
        CompilerOptions opts = createDefaultOptions();
        opts.trustedStrings = true;
        CodeGenerator gen = new CodeGenerator(consumer, opts);
        String result = gen.escapeToDoubleQuotedJsString("\u00e9");
        assertEquals("\"\\u00e9\"", result);
    }

    @Test
    public void testRegexpEscape() {
        String result = CodeGenerator.regexpEscape("a.b", null);
        assertEquals("/a\\.b/", result);
    }

    @Test
    public void testConstructorWithCharsetEncoder() {
        CompilerOptions opts = createDefaultOptions();
        opts.setOutputCharset(Charset.forName("ISO-8859-1"));
        CodeGenerator gen = new CodeGenerator(consumer, opts);
        assertNotNull(gen.outputCharsetEncoder); // field is package-private, cannot assert directly but we can test behaviour
        // we'll test indirectly by generating a string with a character encodable in ISO-8859-1
        // For simplicity we just check that the generator doesn't throw.
        gen.add(stringNode("a"));
        assertEquals("\"a\"", output.toString());
    }

    @Test
    public void testConstructorWithNullCharset() {
        CompilerOptions opts = createDefaultOptions();
        opts.setOutputCharset(null);
        CodeGenerator gen = new CodeGenerator(consumer, opts);
        // no encoder, should still work
        gen.add(stringNode("b"));
        assertEquals("\"b\"", output.toString());
    }

    @Test
    public void testTrustedStringsFalse() {
        CompilerOptions opts = createDefaultOptions();
        opts.trustedStrings = false;
        CodeGenerator gen = new CodeGenerator(consumer, opts);
        // '<' followed by 'script' should be escaped
        String result = gen.escapeToDoubleQuotedJsString("</script");
        assertEquals("\"<\\/script\"", result);  // actual: < becomes \x3c, / is not escaped? Let's check: strEscape with '/' inside? It's not a special char. Actually </script should become \x3c/script? Wait: the code checks regionMatches for "/script". So '<' is escaped to \x3c. The '/' is not touched. So result: "\x3c/script". But we need to match exactly. Let's compute: start with double quote, then for '<': if !trustedStrings && !isRegexp -> sb.append(LT_ESCAPED) which is "\\x3c". So output begins with '\x3c' (backslash, x, 3, c). Then '/' stays. Then "script". So result = "\"\\x3c/script\"". That's what we assert.
        assertEquals("\"\\x3c/script\"", result);
    }

    @Test
    public void testUnrollBinaryOperator() {
        // Create expression: a + b + c (left associative)
        Node plus1 = new Node(Token.ADD, nameNode("a"), nameNode("b"));
        Node plus2 = new Node(Token.ADD, plus1, nameNode("c"));
        generator.add(plus2);
        // Expected: a+b+c
        assertEquals("a+b+c", output.toString());
    }

    @Test
    public void testPrecedenceParens() {
        // a + b * c  (multiplication has higher precedence)
        Node mul = new Node(Token.MUL, nameNode("b"), nameNode("c"));
        Node add = new Node(Token.ADD, nameNode("a"), mul);
        generator.add(add);
        assertEquals("a+b*c", output.toString());
    }

    @Test
    public void testNegUnaryNumber() {
        Node neg = new Node(Token.NEG, numberNode(5.0));
        generator.add(neg);
        assertEquals("-5.0", output.toString());
    }

    @Test
    public void testNegUnaryNonNumber() {
        Node neg = new Node(Token.NEG, nameNode("x"));
        generator.add(neg);
        assertEquals("-x", output.toString());
    }

    @Test
    public void testReturnWithValue() {
        Node ret = new Node(Token.RETURN, numberNode(1.0));
        generator.add(ret);
        assertEquals("return1.0;", output.toString());
    }

    @Test
    public void testThrow() {
        Node thr = new Node(Token.THROW, stringNode("error"));
        generator.add(thr);
        assertEquals("throw\"error\";", output.toString());
    }

    @Test
    public void testContinueWithLabel() {
        Node cont = new Node(Token.CONTINUE, labelNameNode("outer"));
        generator.add(cont);
        assertEquals("continue outer;", output.toString());
    }

    @Test
    public void testBreakWithLabel() {
        Node brk = new Node(Token.BREAK, labelNameNode("inner"));
        generator.add(brk);
        assertEquals("break inner;", output.toString());
    }

    @Test
    public void testForInLoop() {
        Node forIn = new Node(Token.FOR, nameNode("x"), nameNode("obj"), blockNode(nameNode("body")));
        generator.add(forIn);
        assertEquals("for(x in obj)body", output.toString());
    }

    @Test
    public void testDoWhile() {
        Node d = new Node(Token.DO, blockNode(nameNode("a")), nameNode("cond"));
        generator.add(d);
        assertEquals("do{a}while(cond);", output.toString());
    }

    @Test
    public void testWhile() {
        Node w = new Node(Token.WHILE, nameNode("cond"), blockNode(nameNode("body")));
        generator.add(w);
        assertEquals("while(cond)body", output.toString());
    }

    @Test
    public void testNew() {
        Node ctor = nameNode("Foo");
        Node newExpr = new Node(Token.NEW, ctor, nameNode("arg"));
        generator.add(newExpr);
        assertEquals("new Foo(arg)", output.toString());
    }

    @Test
    public void testDelete() {
        Node del = new Node(Token.DELPROP, new Node(Token.GETPROP, nameNode("obj"), stringNode("prop")));
        generator.add(del);
        assertEquals("delete obj.prop", output.toString());
    }

    @Test
    public void testHook() {
        Node hook = new Node(Token.HOOK, nameNode("cond"), nameNode("then"), nameNode("else"));
        generator.add(hook);
        assertEquals("cond?then:else", output.toString());
    }

    @Test
    public void testComma() {
        Node comma = new Node(Token.COMMA, numberNode(1.0), numberNode(2.0));
        generator.add(comma);
        assertEquals("1,2", output.toString());
    }

    @Test
    public void testCast() {
        Node cast = new Node(Token.CAST, nameNode("a"));
        generator.add(cast);
        assertEquals("(a)", output.toString());
    }

    @Test
    public void testSwitch() {
        Node switchNode = new Node(Token.SWITCH, nameNode("x"),
                new Node(Token.CASE, numberNode(1), blockNode(nameNode("a"))),
                new Node(Token.DEFAULT_CASE, blockNode(nameNode("b"))));
        generator.add(switchNode);
        // Expected: switch(x){case 1:a;default:b;}
        assertEquals("switch(x){case 1:a;default:b;}", output.toString());
    }

    @Test
    public void testTryCatchFinally() {
        Node tryBody = blockNode(nameNode("tryBody"));
        Node catchNode = new Node(Token.CATCH, nameNode("e"), blockNode(nameNode("catchBody")));
        Node finallyBody = blockNode(nameNode("finallyBody"));
        Node tryNode = new Node(Token.TRY, tryBody, catchNode, finallyBody);
        generator.add(tryNode);
        // Expected: try{tryBody}catch(e){catchBody}finally{finallyBody}
        assertEquals("try{tryBody}catch(e){catchBody}finally{finallyBody}", output.toString());
    }
}