package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import org.junit.Before;
import org.junit.Test;

public class CodeGeneratorTest {

    private static class TestCodeConsumer implements CodeConsumer {
        StringBuilder sb = new StringBuilder();
        boolean continueProcessing = true;
        boolean preserveExtraBlocks = false;
        int indent = 0;

        @Override public void add(String str) { sb.append(str); }
        @Override public void addIdentifier(String identifier) { sb.append(identifier); }
        @Override public void addOp(String op, boolean bin) { sb.append(op); }
        @Override public void addNumber(double x) { sb.append(x == (long)x ? String.valueOf((long)x) : String.valueOf(x)); }
        @Override public void startSourceMapping(Node n) {}
        @Override public void endSourceMapping(Node n) {}
        @Override public void beginBlock() { sb.append("{"); indent++; }
        @Override public void endBlock(boolean breakAfter) { indent--; sb.append("}"); if (breakAfter) sb.append("\n"); }
        @Override public void listSeparator() { sb.append(","); }
        @Override public void endStatement(boolean needSemicolon) { if (needSemicolon) sb.append(";"); else endStatement(); }
        @Override public void endStatement() { sb.append(";"); }
        @Override public void endFunction(boolean isStatement) { if (isStatement) sb.append("\n"); }
        @Override public void beginCaseBody() { sb.append(":"); }
        @Override public void endCaseBody() { sb.append("\n"); }
        @Override public boolean continueProcessing() { return continueProcessing; }
        @Override public boolean breakAfterBlockFor(Node n, boolean isStatement) { return isStatement; }
        @Override public boolean shouldPreserveExtraBlocks() { return preserveExtraBlocks; }
        @Override public void maybeLineBreak() { sb.append("\n"); }
        @Override public void notePreferredLineBreak() { }
    }

    private TestCodeConsumer consumer;
    private CodeGenerator gen;

    @Before
    public void setUp() {
        consumer = new TestCodeConsumer();
        gen = new CodeGenerator(consumer);
    }

    @Test
    public void testTagAsStrict() {
        gen.tagAsStrict();
        assertEquals("'use strict';", consumer.sb.toString());
    }

    @Test
    public void testAddString() {
        gen.add("hello");
        assertEquals("hello", consumer.sb.toString());
    }

    @Test
    public void testJsStringWithDoubleQuotes() {
        String result = CodeGenerator.jsString("hello\"world", null);
        assertEquals("\"hello\\\"world\"", result);
    }

    @Test
    public void testJsStringWithSingleQuotes() {
        String result = CodeGenerator.jsString("hello'world", null);
        assertEquals("'hello\\'world'", result);
    }

    @Test
    public void testJsStringWithMoreSingleQuotes() {
        String result = CodeGenerator.jsString("a'b\"c", null);
        assertEquals("\"a'b\\\"c\"", result);
    }

    @Test
    public void testJsStringWithNewline() {
        String result = CodeGenerator.jsString("a\nb", null);
        assertEquals("\"a\\nb\"", result);
    }

    @Test
    public void testRegexpEscape() {
        String result = CodeGenerator.regexpEscape("a/b", null);
        assertEquals("/a\\/b/", result);
    }

    @Test
    public void testStrEscapeWithBackslash() {
        String result = CodeGenerator.strEscape("a\\b", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"a\\\\b\"", result);
    }

    @Test
    public void testStrEscapeWithNonAscii() {
        String result = CodeGenerator.strEscape("a\u00e9b", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"a\\u00e9b\"", result);
    }

    @Test
    public void testStrEscapeWithSupplementary() {
        String result = CodeGenerator.strEscape("a\ud83d\ude00b", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"a\\ud83d\\ude00b\"", result);
    }

    @Test
    public void testIdentifierEscapeAscii() {
        String result = CodeGenerator.identifierEscape("hello");
        assertEquals("hello", result);
    }

    @Test
    public void testIdentifierEscapeNonLatin() {
        String result = CodeGenerator.identifierEscape("h\u00e9llo");
        assertEquals("h\\u00e9llo", result);
    }

    @Test
    public void testAddNull() {
        Node n = new Node(Token.NULL);
        gen.add(n);
        assertEquals("null", consumer.sb.toString());
    }

    @Test
    public void testAddTrue() {
        Node n = new Node(Token.TRUE);
        gen.add(n);
        assertEquals("true", consumer.sb.toString());
    }

    @Test
    public void testAddFalse() {
        Node n = new Node(Token.FALSE);
        gen.add(n);
        assertEquals("false", consumer.sb.toString());
    }

    @Test
    public void testAddThis() {
        Node n = new Node(Token.THIS);
        gen.add(n);
        assertEquals("this", consumer.sb.toString());
    }

    @Test
    public void testAddNumberZero() {
        Node n = new Node(Token.NUMBER, 0.0);
        gen.add(n);
        assertEquals("0", consumer.sb.toString());
    }

    @Test
    public void testAddNumberNegative() {
        Node n = new Node(Token.NEG);
        Node child = new Node(Token.NUMBER, 1.5);
        n.addChildToFront(child);
        gen.add(n);
        assertEquals("-1.5", consumer.sb.toString());
    }

    @Test
    public void testAddNumberInObjectLitHasOneChild() {
        Node obj = new Node(Token.OBJECTLIT);
        Node num = new Node(Token.NUMBER, 42);
        num.setParent(obj);
        obj.addChildToFront(num);
        Node key = new Node(Token.STRING, "x");
        key.addChildToFront(num);
        obj.addChildToFront(key);
        gen.add(num);
        assertEquals("42", consumer.sb.toString());
    }

    @Test
    public void testAddNameWithoutInitializer() {
        Node n = Node.newString(Token.NAME, "x");
        gen.add(n);
        assertEquals("x", consumer.sb.toString());
    }

    @Test
    public void testAddNameWithInitializer() {
        Node n = Node.newString(Token.NAME, "x");
        Node val = new Node(Token.NUMBER, 1.0);
        n.addChildToFront(val);
        gen.add(n);
        assertEquals("x=1", consumer.sb.toString());
    }

    @Test
    public void testAddNameWithCommaInitializer() {
        Node n = Node.newString(Token.NAME, "x");
        Node comma = new Node(Token.COMMA);
        Node a = new Node(Token.NUMBER, 1.0);
        Node b = new Node(Token.NUMBER, 2.0);
        comma.addChildToFront(b);
        comma.addChildToFront(a);
        n.addChildToFront(comma);
        gen.add(n);
        assertEquals("x=(1,2)", consumer.sb.toString());
    }

    @Test
    public void testAddReturnNoArg() {
        Node n = new Node(Token.RETURN);
        gen.add(n);
        assertEquals("return;", consumer.sb.toString());
    }

    @Test
    public void testAddReturnWithArg() {
        Node n = new Node(Token.RETURN);
        Node arg = new Node(Token.NUMBER, 42);
        n.addChildToFront(arg);
        gen.add(n);
        assertEquals("return42", consumer.sb.toString());
    }

    @Test
    public void testAddThrow() {
        Node n = new Node(Token.THROW);
        Node arg = new Node(Token.TRUE);
        n.addChildToFront(arg);
        gen.add(n);
        assertEquals("throwtrue", consumer.sb.toString());
    }

    @Test
    public void testAddVar() {
        Node n = new Node(Token.VAR);
        Node name = Node.newString(Token.NAME, "a");
        Node val = new Node(Token.NUMBER, 1);
        name.addChildToFront(val);
        n.addChildToFront(name);
        gen.add(n);
        assertEquals("var a=1", consumer.sb.toString());
    }

    @Test
    public void testAddEmptyVar() {
        Node n = new Node(Token.VAR);
        gen.add(n);
        assertEquals("", consumer.sb.toString());
    }

    @Test
    public void testAddLabelName() {
        Node n = Node.newString(Token.LABEL_NAME, "myLabel");
        gen.add(n);
        assertEquals("myLabel", consumer.sb.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testAddLabelNameEmpty() {
        Node n = Node.newString(Token.LABEL_NAME, "");
        gen.add(n);
    }

    @Test
    public void testAddArrayLit() {
        Node arr = new Node(Token.ARRAYLIT);
        arr.addChildToFront(new Node(Token.NUMBER, 1));
        arr.addChildToFront(new Node(Token.NUMBER, 2));
        gen.add(arr);
        assertEquals("[1,2]", consumer.sb.toString());
    }

    @Test
    public void testAddArrayLitEmpty() {
        Node arr = new Node(Token.ARRAYLIT);
        gen.add(arr);
        assertEquals("[]", consumer.sb.toString());
    }

    @Test
    public void testAddArrayLitWithEmptyTrailing() {
        Node arr = new Node(Token.ARRAYLIT);
        Node empty = new Node(Token.EMPTY);
        arr.addChildToFront(empty);
        arr.addChildToFront(new Node(Token.NUMBER, 1));
        gen.add(arr);
        assertEquals("[1,]", consumer.sb.toString());
    }

    @Test
    public void testAddCallSimple() {
        Node call = new Node(Token.CALL);
        Node name = Node.newString(Token.NAME, "f");
        call.addChildToFront(name);
        gen.add(call);
        assertEquals("f()", consumer.sb.toString());
    }

    @Test
    public void testAddCallWithArgs() {
        Node call = new Node(Token.CALL);
        Node name = Node.newString(Token.NAME, "f");
        call.addChildToFront(name);
        call.addChildToFront(new Node(Token.NUMBER, 1));
        gen.add(call);
        assertEquals("f(1)", consumer.sb.toString());
    }

    @Test
    public void testAddCallIndirectEval() {
        Node call = new Node(Token.CALL);
        Node eval = Node.newString(Token.NAME, "eval");
        eval.putBooleanProp(Node.DIRECT_EVAL, false);
        call.addChildToFront(eval);
        gen.add(call);
        assertEquals("(0,eval)()", consumer.sb.toString());
    }

    @Test
    public void testAddCallDirectEval() {
        Node call = new Node(Token.CALL);
        Node eval = Node.newString(Token.NAME, "eval");
        eval.putBooleanProp(Node.DIRECT_EVAL, true);
        call.addChildToFront(eval);
        gen.add(call);
        assertEquals("eval()", consumer.sb.toString());
    }

    @Test
    public void testAddNewNoArgs() {
        Node newn = new Node(Token.NEW);
        Node name = Node.newString(Token.NAME, "Foo");
        newn.addChildToFront(name);
        gen.add(newn);
        assertEquals("new Foo", consumer.sb.toString());
    }

    @Test
    public void testAddNewWithArgs() {
        Node newn = new Node(Token.NEW);
        Node name = Node.newString(Token.NAME, "Foo");
        newn.addChildToFront(name);
        newn.addChildToFront(new Node(Token.NUMBER, 1));
        gen.add(newn);
        assertEquals("new Foo(1)", consumer.sb.toString());
    }

    @Test
    public void testAddGetProp() {
        Node getprop = new Node(Token.GETPROP);
        Node obj = Node.newString(Token.NAME, "a");
        Node prop = Node.newString(Token.STRING, "b");
        getprop.addChildToFront(prop);
        getprop.addChildToFront(obj);
        gen.add(getprop);
        assertEquals("a.b", consumer.sb.toString());
    }

    @Test
    public void testAddGetPropNumberNeedsParens() {
        Node getprop = new Node(Token.GETPROP);
        Node num = new Node(Token.NUMBER, 1);
        Node prop = Node.newString(Token.STRING, "x");
        getprop.addChildToFront(prop);
        getprop.addChildToFront(num);
        gen.add(getprop);
        assertEquals("(1).x", consumer.sb.toString());
    }

    @Test
    public void testAddGetElem() {
        Node getelem = new Node(Token.GETELEM);
        Node obj = Node.newString(Token.NAME, "a");
        Node index = new Node(Token.NUMBER, 0);
        getelem.addChildToFront(index);
        getelem.addChildToFront(obj);
        gen.add(getelem);
        assertEquals("a[0]", consumer.sb.toString());
    }

    @Test
    public void testAddString() {
        Node n = Node.newString(Token.STRING, "hello");
        gen.add(n);
        assertEquals("\"hello\"", consumer.sb.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testAddStringWithUnexpectedChildren() {
        Node n = Node.newString(Token.STRING, "x");
        n.addChildToFront(new Node(Token.EMPTY));
        gen.add(n);
    }

    @Test
    public void testAddStringInObjectLit() {
        Node obj = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "key");
        Node val = new Node(Token.STRING, "val");
        val.setParent(obj);
        key.addChildToFront(val);
        obj.addChildToFront(key);
        gen.add(val);
        assertEquals("\"val\"", consumer.sb.toString());
    }

    @Test
    public void testAddHook() {
        Node hook = new Node(Token.HOOK);
        hook.addChildToFront(new Node(Token.TRUE));
        hook.addChildToFront(new Node(Token.NUMBER, 1));
        hook.addChildToFront(new Node(Token.NUMBER, 2));
        gen.add(hook);
        assertEquals("true?1:2", consumer.sb.toString());
    }

    @Test
    public void testAddBinaryOp() {
        Node add = new Node(Token.ADD);
        add.addChildToFront(new Node(Token.NUMBER, 1));
        add.addChildToFront(new Node(Token.NUMBER, 2));
        gen.add(add);
        assertEquals("1+2", consumer.sb.toString());
    }

    @Test
    public void testAddBinaryOpAssociative() {
        Node add1 = new Node(Token.ADD);
        Node add2 = new Node(Token.ADD);
        add2.addChildToFront(new Node(Token.NUMBER, 1));
        add2.addChildToFront(new Node(Token.NUMBER, 2));
        add1.addChildToFront(add2);
        add1.addChildToFront(new Node(Token.NUMBER, 3));
        gen.add(add1);
        assertEquals("1+2+3", consumer.sb.toString());
    }

    @Test
    public void testAddBinaryOpAssignment() {
        Node assign1 = new Node(Token.ASSIGN);
        Node assign2 = new Node(Token.ASSIGN);
        Node a = Node.newString(Token.NAME, "a");
        Node b = Node.newString(Token.NAME, "b");
        Node c = new Node(Token.NUMBER, 1);
        assign2.addChildToFront(c);
        assign2.addChildToFront(b);
        assign1.addChildToFront(assign2);
        assign1.addChildToFront(a);
        gen.add(assign1);
        assertEquals("a=b=1", consumer.sb.toString());
    }

    @Test
    public void testAddUnaryOp() {
        Node not = new Node(Token.NOT);
        not.addChildToFront(new Node(Token.TRUE));
        gen.add(not);
        assertEquals("!true", consumer.sb.toString());
    }

    @Test
    public void testAddPos() {
        Node pos = new Node(Token.POS);
        pos.addChildToFront(new Node(Token.NUMBER, 5));
        gen.add(pos);
        assertEquals("+5", consumer.sb.toString());
    }

    @Test
    public void testAddBitnot() {
        Node bitnot = new Node(Token.BITNOT);
        bitnot.addChildToFront(new Node(Token.NUMBER, 1));
        gen.add(bitnot);
        assertEquals("~1", consumer.sb.toString());
    }

    @Test
    public void testAddVoid() {
        Node v = new Node(Token.VOID);
        v.addChildToFront(new Node(Token.NUMBER, 0));
        gen.add(v);
        assertEquals("void0", consumer.sb.toString());
    }

    @Test
    public void testAddTypeof() {
        Node t = new Node(Token.TYPEOF);
        t.addChildToFront(Node.newString(Token.NAME, "x"));
        gen.add(t);
        assertEquals("typeof x", consumer.sb.toString());
    }

    @Test
    public void testAddIncPrefix() {
        Node inc = new Node(Token.INC);
        inc.putIntProp(Node.INCRDECR_PROP, 0);
        inc.addChildToFront(Node.newString(Token.NAME, "x"));
        gen.add(inc);
        assertEquals("++x", consumer.sb.toString());
    }

    @Test
    public void testAddIncPostfix() {
        Node inc = new Node(Token.INC);
        inc.putIntProp(Node.INCRDECR_PROP, 1);
        inc.addChildToFront(Node.newString(Token.NAME, "x"));
        gen.add(inc);
        assertEquals("x++", consumer.sb.toString());
    }

    @Test
    public void testAddDecPrefix() {
        Node dec = new Node(Token.DEC);
        dec.putIntProp(Node.INCRDECR_PROP, 0);
        dec.addChildToFront(Node.newString(Token.NAME, "x"));
        gen.add(dec);
        assertEquals("--x", consumer.sb.toString());
    }

    @Test
    public void testAddDecPostfix() {
        Node dec = new Node(Token.DEC);
        dec.putIntProp(Node.INCRDECR_PROP, 1);
        dec.addChildToFront(Node.newString(Token.NAME, "x"));
        gen.add(dec);
        assertEquals("x--", consumer.sb.toString());
    }

    @Test
    public void testAddDelprop() {
        Node del = new Node(Token.DELPROP);
        del.addChildToFront(Node.newString(Token.NAME, "x"));
        gen.add(del);
        assertEquals("delete x", consumer.sb.toString());
    }

    @Test
    public void testAddBreak() {
        Node brk = new Node(Token.BREAK);
        gen.add(brk);
        assertEquals("break;", consumer.sb.toString());
    }

    @Test
    public void testAddBreakWithLabel() {
        Node brk = new Node(Token.BREAK);
        brk.addChildToFront(Node.newString(Token.LABEL_NAME, "loop"));
        gen.add(brk);
        assertEquals("break loop;", consumer.sb.toString());
    }

    @Test
    public void testAddContinue() {
        Node cont = new Node(Token.CONTINUE);
        gen.add(cont);
        assertEquals("continue;", consumer.sb.toString());
    }

    @Test
    public void testAddContinueWithLabel() {
        Node cont = new Node(Token.CONTINUE);
        cont.addChildToFront(Node.newString(Token.LABEL_NAME, "loop"));
        gen.add(cont);
        assertEquals("continue loop;", consumer.sb.toString());
    }

    @Test
    public void testAddDebugger() {
        Node d = new Node(Token.DEBUGGER);
        gen.add(d);
        assertEquals("debugger;", consumer.sb.toString());
    }

    @Test
    public void testAddEmpty() {
        Node e = new Node(Token.EMPTY);
        gen.add(e);
        assertEquals("", consumer.sb.toString());
    }

    @Test
    public void testAddExprResult() {
        Node expr = new Node(Token.EXPR_RESULT);
        expr.addChildToFront(new Node(Token.NUMBER, 1));
        gen.add(expr);
        assertEquals("1", consumer.sb.toString());
    }

    @Test
    public void testAddLabel() {
        Node label = new Node(Token.LABEL);
        label.addChildToFront(Node.newString(Token.LABEL_NAME, "loop"));
        label.addChildToFront(new Node(Token.TRUE));
        gen.add(label);
        assertEquals("loop:true", consumer.sb.toString());
    }

    @Test
    public void testAddIfNoElse() {
        Node iff = new Node(Token.IF);
        iff.addChildToFront(new Node(Token.TRUE));
        iff.addChildToFront(new Node(Token.NUMBER, 1));
        gen.add(iff);
        assertEquals("if(true)1", consumer.sb.toString());
    }

    @Test
    public void testAddIfWithElse() {
        Node iff = new Node(Token.IF);
        iff.addChildToFront(new Node(Token.TRUE));
        iff.addChildToFront(new Node(Token.NUMBER, 1));
        iff.addChildToFront(new Node(Token.NUMBER, 2));
        gen.add(iff);
        assertEquals("if(true)1else2", consumer.sb.toString());
    }

    @Test
    public void testAddIfDanglingElse() {
        Node iff = new Node(Token.IF);
        iff.addChildToFront(new Node(Token.TRUE));
        iff.addChildToFront(new Node(Token.NUMBER, 1));
        gen.add(iff, CodeGenerator.Context.BEFORE_DANGLING_ELSE);
        assertTrue(consumer.sb.toString().startsWith("{"));
        assertTrue(consumer.sb.toString().endsWith("}"));
    }

    @Test
    public void testAddWhile() {
        Node w = new Node(Token.WHILE);
        w.addChildToFront(new Node(Token.TRUE));
        w.addChildToFront(new Node(Token.NUMBER, 1));
        gen.add(w);
        assertEquals("while(true)1", consumer.sb.toString());
    }

    @Test
    public void testAddDo() {
        Node d = new Node(Token.DO);
        d.addChildToFront(new Node(Token.NUMBER, 1));
        d.addChildToFront(new Node(Token.TRUE));
        gen.add(d);
        assertEquals("do1while(true);", consumer.sb.toString());
    }

    @Test
    public void testAddForRegular() {
        Node f = new Node(Token.FOR);
        Node init = new Node(Token.NUMBER, 0);
        Node cond = new Node(Token.NUMBER, 1);
        Node incr = new Node(Token.NUMBER, 2);
        Node body = new Node(Token.NUMBER, 3);
        f.addChildToFront(init);
        f.addChildToFront(cond);
        f.addChildToFront(incr);
        f.addChildToFront(body);
        gen.add(f);
        assertEquals("for(0;1;2)3", consumer.sb.toString());
    }

    @Test
    public void testAddForVarInit() {
        Node f = new Node(Token.FOR);
        Node var = new Node(Token.VAR);
        Node name = Node.newString(Token.NAME, "i");
        name.addChildToFront(new Node(Token.NUMBER, 0));
        var.addChildToFront(name);
        Node cond = new Node(Token.NUMBER, 1);
        Node incr = new Node(Token.NUMBER, 2);
        Node body = new Node(Token.NUMBER, 3);
        f.addChildToFront(var);
        f.addChildToFront(cond);
        f.addChildToFront(incr);
        f.addChildToFront(body);
        gen.add(f);
        assertEquals("for(var i=0;1;2)3", consumer.sb.toString());
    }

    @Test
    public void testAddForIn() {
        Node f = new Node(Token.FOR);
        Node var = Node.newString(Token.NAME, "k");
        Node obj = Node.newString(Token.NAME, "o");
        Node body = new Node(Token.NUMBER, 1);
        f.addChildToFront(var);
        f.addChildToFront(obj);
        f.addChildToFront(body);
        gen.add(f);
        assertEquals("for(k in o)1", consumer.sb.toString());
    }

    @Test
    public void testAddWith() {
        Node w = new Node(Token.WITH);
        w.addChildToFront(Node.newString(Token.NAME, "o"));
        w.addChildToFront(new Node(Token.NUMBER, 1));
        gen.add(w);
        assertEquals("with(o)1", consumer.sb.toString());
    }

    @Test
    public void testAddSwitch() {
        Node sw = new Node(Token.SWITCH);
        sw.addChildToFront(new Node(Token.NUMBER, 0));
        Node case1 = new Node(Token.CASE);
        case1.addChildToFront(new Node(Token.NUMBER, 1));
        case1.addChildToFront(new Node(Token.NUMBER, 2));
        sw.addChildToFront(case1);
        gen.add(sw);
        assertTrue(consumer.sb.toString().contains("switch(0){case 1:2"));
    }

    @Test
    public void testAddDefault() {
        Node def = new Node(Token.DEFAULT);
        def.addChildToFront(new Node(Token.NUMBER, 1));
        gen.add(def);
        assertEquals("default:1\n", consumer.sb.toString());
    }

    @Test
    public void testAddFunction() {
        Node func = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "f");
        Node params = new Node(Token.LP);
        Node body = new Node(Token.BLOCK);
        body.addChildToFront(new Node(Token.NUMBER, 1));
        func.addChildToFront(name);
        func.addChildToFront(params);
        func.addChildToFront(body);
        gen.add(func);
        assertTrue(consumer.sb.toString().contains("function f()"));
        assertTrue(consumer.sb.toString().contains("{1}"));
    }

    @Test
    public void testAddFunctionStartOfExpr() {
        Node func = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "");
        Node params = new Node(Token.LP);
        Node body = new Node(Token.BLOCK);
        func.addChildToFront(name);
        func.addChildToFront(params);
        func.addChildToFront(body);
        gen.add(func, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("(function(){" + "})", consumer.sb.toString());
    }

    @Test
    public void testAddObjectLit() {
        Node obj = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "x");
        key.setQuotedString();
        key.addChildToFront(new Node(Token.NUMBER, 1));
        obj.addChildToFront(key);
        gen.add(obj);
        assertTrue(consumer.sb.toString().contains("\"x\":1"));
    }

    @Test
    public void testAddObjectLitUnquotedKey() {
        Node obj = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "x");
        key.addChildToFront(new Node(Token.NUMBER, 1));
        obj.addChildToFront(key);
        gen.add(obj);
        assertEquals("{x:1}", consumer.sb.toString());
    }

    @Test
    public void testAddObjectLitStartOfExpr() {
        Node obj = new Node(Token.OBJECTLIT);
        gen.add(obj, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("({})", consumer.sb.toString());
    }

    @Test
    public void testGetContextForNonEmptyExpression() {
        assertEquals(CodeGenerator.Context.OTHER,
            gen.getContextForNonEmptyExpression(CodeGenerator.Context.OTHER));
        assertEquals(CodeGenerator.Context.BEFORE_DANGLING_ELSE,
            gen.getContextForNonEmptyExpression(CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void testGetContextForNoInOperator() {
        assertEquals(CodeGenerator.Context.IN_FOR_INIT_CLAUSE,
            gen.getContextForNoInOperator(CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        assertEquals(CodeGenerator.Context.OTHER,
            gen.getContextForNoInOperator(CodeGenerator.Context.OTHER));
    }

    @Test
    public void testClearContextForNoInOperator() {
        assertEquals(CodeGenerator.Context.OTHER,
            gen.clearContextForNoInOperator(CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        assertEquals(CodeGenerator.Context.STATEMENT,
            gen.clearContextForNoInOperator(CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void testAddListEmpty() {
        gen.addList(null);
        assertEquals("", consumer.sb.toString());
    }

    @Test
    public void testAddListOne() {
        Node n = new Node(Token.NUMBER, 1);
        gen.addList(n);
        assertEquals("1", consumer.sb.toString());
    }

    @Test
    public void testAddListMultiple() {
        Node n1 = new Node(Token.NUMBER, 1);
        Node n2 = new Node(Token.NUMBER, 2);
        n1.setNext(n2);
        gen.addList(n1);
        assertEquals("1,2", consumer.sb.toString());
    }

    @Test
    public void testAddArrayListEmpty() {
        gen.addArrayList(null);
        assertEquals("", consumer.sb.toString());
    }

    @Test
    public void testAddArrayListOne() {
        Node n = new Node(Token.NUMBER, 1);
        gen.addArrayList(n);
        assertEquals("1", consumer.sb.toString());
    }

    @Test
    public void testAddArrayListMultiple() {
        Node n1 = new Node(Token.NUMBER, 1);
        Node n2 = new Node(Token.NUMBER, 2);
        n1.setNext(n2);
        gen.addArrayList(n1);
        assertEquals("1,2", consumer.sb.toString());
    }

    @Test
    public void testAddArrayListTrailingEmpty() {
        Node n1 = new Node(Token.NUMBER, 1);
        Node n2 = new Node(Token.EMPTY);
        n1.setNext(n2);
        gen.addArrayList(n1);
        assertEquals("1,", consumer.sb.toString());
    }

    @Test
    public void testAddAllSiblings() {
        Node n1 = new Node(Token.NUMBER, 1);
        Node n2 = new Node(Token.NUMBER, 2);
        n1.setNext(n2);
        gen.addAllSiblings(n1);
        assertEquals("12", consumer.sb.toString());
    }

    @Test
    public void testAddCaseBody() {
        Node body = new Node(Token.NUMBER, 1);
        gen.addCaseBody(body);
        assertEquals(":1\n", consumer.sb.toString());
    }

    @Test
    public void testEscapeToDoubleQuotedJsString() {
        String result = CodeGenerator.escapeToDoubleQuotedJsString("a'b\"c");
        assertEquals("\"a'b\\\"c\"", result);
    }

    @Test
    public void testRegexpEscapeOverload() {
        String result = CodeGenerator.regexpEscape("test");
        assertEquals("/test/", result);
    }

    @Test
    public void testConstructorWithCharsetNull() {
        CodeGenerator g = new CodeGenerator(consumer, null);
        assertNull(g.outputCharsetEncoder);
    }

    @Test
    public void testConstructorWithCharsetUsAscii() {
        CodeGenerator g = new CodeGenerator(consumer, Charsets.US_ASCII);
        assertNull(g.outputCharsetEncoder);
    }

    @Test
    public void testConstructorWithCharsetUtf8() {
        CodeGenerator g = new CodeGenerator(consumer, StandardCharsets.UTF_8);
        assertNotNull(g.outputCharsetEncoder);
    }

    @Test
    public void testStopProcessing() {
        consumer.continueProcessing = false;
        Node n = new Node(Token.NUMBER, 1);
        gen.add(n);
        assertEquals("", consumer.sb.toString());
    }

    @Test
    public void testAddLeftExpr() {
        Node n = new Node(Token.NUMBER, 1);
        gen.addLeftExpr(n, 0, CodeGenerator.Context.OTHER);
        assertEquals("1", consumer.sb.toString());
    }

    @Test
    public void testAddExprWithParen() {
        Node n = new Node(Token.NUMBER, 1);
        gen.addExpr(n, 100);
        assertEquals("(1)", consumer.sb.toString());
    }

    @Test
    public void testAddExprInForInit() {
        Node inNode = new Node(Token.IN);
        inNode.addChildToFront(Node.newString(Token.NAME, "a"));
        inNode.addChildToFront(Node.newString(Token.NAME, "b"));
        gen.addExpr(inNode, 0, CodeGenerator.Context.IN_FOR_INIT_CLAUSE);
        assertEquals("(a in b)", consumer.sb.toString());
    }

    @Test
    public void testGetFirstNonEmptyChildNull() {
        Node block = new Node(Token.BLOCK);
        assertNull(CodeGenerator.getFirstNonEmptyChild(block));
    }

    @Test
    public void testGetFirstNonEmptyChildSingle() {
        Node block = new Node(Token.BLOCK);
        block.addChildToFront(new Node(Token.NUMBER, 1));
        assertNotNull(CodeGenerator.getFirstNonEmptyChild(block));
    }

    @Test(expected = Error.class)
    public void testUnknownType() {
        Node n = new Node(Token.LAST);
        gen.add(n);
    }

    @Test(expected = Error.class)
    public void testGetSetUnexpectedParent() {
        Node get = new Node(Token.GET);
        Node fn = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "");
        Node params = new Node(Token.LP);
        Node body = new Node(Token.BLOCK);
        fn.addChildToFront(name);
        fn.addChildToFront(params);
        fn.addChildToFront(body);
        get.addChildToFront(fn);
        get.setString("x");
        gen.add(get);
    }
}