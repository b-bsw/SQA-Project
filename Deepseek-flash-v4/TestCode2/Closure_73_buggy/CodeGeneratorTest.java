package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

public class CodeGeneratorTest {

    private CodeGenerator codeGenerator;
    private TestCodeConsumer testCodeConsumer;

    @Before
    public void setUp() {
        testCodeConsumer = new TestCodeConsumer();
        codeGenerator = new CodeGenerator(testCodeConsumer, null);
    }

    private static class TestCodeConsumer implements CodeConsumer {
        StringBuilder output = new StringBuilder();
        boolean continueProcessing = true;

        @Override
        public boolean continueProcessing() {
            return continueProcessing;
        }

        @Override
        public void add(String str) {
            output.append(str);
        }

        @Override
        public void addIdentifier(String identifier) {
            output.append(identifier);
        }

        @Override
        public void addOp(String op, boolean b) {
            output.append(op);
        }

        @Override
        public void addNumber(double x) {
            if (x == (long) x) {
                output.append((long) x);
            } else {
                output.append(x);
            }
        }

        @Override
        public void listSeparator() {
            output.append(", ");
        }

        @Override
        public void endStatement(boolean b) {
            output.append(b ? ";\n" : ";");
        }

        @Override
        public void endStatement() {
            output.append(";");
        }

        @Override
        public void beginBlock() {
            output.append(" {");
        }

        @Override
        public void endBlock(boolean b) {
            output.append(" }");
        }

        @Override
        public boolean breakAfterBlockFor(Node n, boolean b) {
            return b;
        }

        @Override
        public void maybeLineBreak() {
            output.append("\n");
        }

        @Override
        public void notePreferredLineBreak() {
            output.append("\n");
        }

        @Override
        public void beginCaseBody() {
            output.append(" {");
        }

        @Override
        public void endCaseBody() {
            output.append(" }");
        }

        @Override
        public void endFunction(boolean b) {
            if (b) {
                output.append(";");
            }
        }

        @Override
        public boolean shouldPreserveExtraBlocks() {
            return false;
        }

        @Override
        public void startSourceMapping(Node n) {
        }

        @Override
        public void endSourceMapping(Node n) {
        }
    }

    @Test
    public void testTagAsStrict() {
        codeGenerator.tagAsStrict();
        assertEquals("'use strict';", testCodeConsumer.output.toString());
    }

    @Test
    public void testAddString() {
        codeGenerator.add("test string");
        assertEquals("test string", testCodeConsumer.output.toString());
    }

    @Test
    public void testAddNodeTry() {
        Node tryNode = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        Node catchBlock = new Node(Token.BLOCK);
        Node finallyBlock = new Node(Token.BLOCK);
        tryNode.addChildToBack(block);
        tryNode.addChildToBack(catchBlock);
        tryNode.addChildToBack(finallyBlock);
        
        Node catchNode = new Node(Token.CATCH);
        Node catchBody = new Node(Token.BLOCK);
        catchNode.addChildToBack(catchBody);
        catchBlock.addChildToBack(catchNode);
        
        codeGenerator.add(tryNode);
        assertTrue(testCodeConsumer.output.toString().contains("try"));
        assertTrue(testCodeConsumer.output.toString().contains("finally"));
    }

    @Test
    public void testAddNodeThrow() {
        Node throwNode = new Node(Token.THROW);
        Node expr = Node.newString(Token.NUMBER, 42);
        throwNode.addChildToBack(expr);
        codeGenerator.add(throwNode);
        assertTrue(testCodeConsumer.output.toString().contains("throw"));
    }

    @Test
    public void testAddNodeReturn() {
        Node returnNode = new Node(Token.RETURN);
        codeGenerator.add(returnNode);
        assertTrue(testCodeConsumer.output.toString().contains("return"));
    }

    @Test
    public void testAddNodeReturnWithValue() {
        Node returnNode = new Node(Token.RETURN);
        Node value = Node.newString(Token.STRING, "test");
        returnNode.addChildToBack(value);
        codeGenerator.add(returnNode);
        assertTrue(testCodeConsumer.output.toString().contains("return"));
        assertTrue(testCodeConsumer.output.toString().contains("test"));
    }

    @Test
    public void testAddNodeVar() {
        Node varNode = new Node(Token.VAR);
        Node name = Node.newString(Token.NAME, "x");
        varNode.addChildToBack(name);
        codeGenerator.add(varNode);
        assertTrue(testCodeConsumer.output.toString().contains("var"));
    }

    @Test
    public void testAddNodeNumber() {
        Node numberNode = Node.newNumber(123);
        codeGenerator.add(numberNode);
        assertEquals("123", testCodeConsumer.output.toString());
    }

    @Test
    public void testAddNodeString() {
        Node stringNode = Node.newString(Token.STRING, "hello");
        codeGenerator.add(stringNode);
        assertTrue(testCodeConsumer.output.toString().contains("hello"));
    }

    @Test
    public void testAddNodeIfNoElse() {
        Node ifNode = new Node(Token.IF);
        Node condition = Node.newString(Token.TRUE);
        Node thenBlock = new Node(Token.BLOCK);
        ifNode.addChildToBack(condition);
        ifNode.addChildToBack(thenBlock);
        codeGenerator.add(ifNode);
        assertTrue(testCodeConsumer.output.toString().contains("if"));
    }

    @Test
    public void testAddNodeIfWithElse() {
        Node ifNode = new Node(Token.IF);
        Node condition = Node.newString(Token.TRUE);
        Node thenBlock = new Node(Token.BLOCK);
        Node elseBlock = new Node(Token.BLOCK);
        ifNode.addChildToBack(condition);
        ifNode.addChildToBack(thenBlock);
        ifNode.addChildToBack(elseBlock);
        codeGenerator.add(ifNode);
        assertTrue(testCodeConsumer.output.toString().contains("if"));
        assertTrue(testCodeConsumer.output.toString().contains("else"));
    }

    @Test
    public void testAddNodeWhile() {
        Node whileNode = new Node(Token.WHILE);
        Node condition = Node.newString(Token.TRUE);
        Node body = new Node(Token.BLOCK);
        whileNode.addChildToBack(condition);
        whileNode.addChildToBack(body);
        codeGenerator.add(whileNode);
        assertTrue(testCodeConsumer.output.toString().contains("while"));
    }

    @Test
    public void testAddNodeDo() {
        Node doNode = new Node(Token.DO);
        Node body = new Node(Token.BLOCK);
        Node condition = Node.newString(Token.TRUE);
        doNode.addChildToBack(body);
        doNode.addChildToBack(condition);
        codeGenerator.add(doNode);
        assertTrue(testCodeConsumer.output.toString().contains("do"));
        assertTrue(testCodeConsumer.output.toString().contains("while"));
    }

    @Test
    public void testAddNodeFor() {
        Node forNode = new Node(Token.FOR);
        Node init = Node.newString(Token.NAME, "i");
        Node condition = Node.newString(Token.NUMBER, 0);
        Node incr = Node.newString(Token.NAME, "x");
        Node body = new Node(Token.BLOCK);
        forNode.addChildToBack(init);
        forNode.addChildToBack(condition);
        forNode.addChildToBack(incr);
        forNode.addChildToBack(body);
        codeGenerator.add(forNode);
        assertTrue(testCodeConsumer.output.toString().contains("for"));
    }

    @Test
    public void testAddNodeForIn() {
        Node forNode = new Node(Token.FOR);
        Node var = Node.newString(Token.NAME, "x");
        Node iterable = Node.newString(Token.NAME, "obj");
        Node body = new Node(Token.BLOCK);
        forNode.addChildToBack(var);
        forNode.addChildToBack(iterable);
        forNode.addChildToBack(body);
        codeGenerator.add(forNode);
        assertTrue(testCodeConsumer.output.toString().contains("for"));
        assertTrue(testCodeConsumer.output.toString().contains("in"));
    }

    @Test
    public void testAddNodeSwitch() {
        Node switchNode = new Node(Token.SWITCH);
        Node expr = Node.newString(Token.NAME, "x");
        switchNode.addChildToBack(expr);
        codeGenerator.add(switchNode);
        assertTrue(testCodeConsumer.output.toString().contains("switch"));
    }

    @Test
    public void testAddNodeCase() {
        Node caseNode = new Node(Token.CASE);
        Node value = Node.newString(Token.NUMBER, 1);
        Node body = new Node(Token.BLOCK);
        caseNode.addChildToBack(value);
        caseNode.addChildToBack(body);
        codeGenerator.add(caseNode);
        assertTrue(testCodeConsumer.output.toString().contains("case"));
    }

    @Test
    public void testAddNodeDefault() {
        Node defaultNode = new Node(Token.DEFAULT);
        Node body = new Node(Token.BLOCK);
        defaultNode.addChildToBack(body);
        codeGenerator.add(defaultNode);
        assertTrue(testCodeConsumer.output.toString().contains("default"));
    }

    @Test
    public void testAddNodeLabel() {
        Node labelNode = new Node(Token.LABEL);
        Node labelName = new Node(Token.LABEL_NAME);
        labelName.setString("myLabel");
        Node statement = new Node(Token.BLOCK);
        labelNode.addChildToBack(labelName);
        labelNode.addChildToBack(statement);
        codeGenerator.add(labelNode);
        assertTrue(testCodeConsumer.output.toString().contains("myLabel"));
    }

    @Test
    public void testAddNodeBreakWithLabel() {
        Node breakNode = new Node(Token.BREAK);
        Node labelName = new Node(Token.LABEL_NAME);
        labelName.setString("myLabel");
        breakNode.addChildToBack(labelName);
        codeGenerator.add(breakNode);
        assertTrue(testCodeConsumer.output.toString().contains("break"));
        assertTrue(testCodeConsumer.output.toString().contains("myLabel"));
    }

    @Test
    public void testAddNodeContinueWithLabel() {
        Node continueNode = new Node(Token.CONTINUE);
        Node labelName = new Node(Token.LABEL_NAME);
        labelName.setString("myLabel");
        continueNode.addChildToBack(labelName);
        codeGenerator.add(continueNode);
        assertTrue(testCodeConsumer.output.toString().contains("continue"));
        assertTrue(testCodeConsumer.output.toString().contains("myLabel"));
    }

    @Test
    public void testAddNodeDebugger() {
        Node debuggerNode = new Node(Token.DEBUGGER);
        codeGenerator.add(debuggerNode);
        assertTrue(testCodeConsumer.output.toString().contains("debugger"));
    }

    @Test
    public void testAddNodeThis() {
        Node thisNode = new Node(Token.THIS);
        codeGenerator.add(thisNode);
        assertEquals("this", testCodeConsumer.output.toString());
    }

    @Test
    public void testAddNodeTrue() {
        Node trueNode = new Node(Token.TRUE);
        codeGenerator.add(trueNode);
        assertEquals("true", testCodeConsumer.output.toString());
    }

    @Test
    public void testAddNodeFalse() {
        Node falseNode = new Node(Token.FALSE);
        codeGenerator.add(falseNode);
        assertEquals("false", testCodeConsumer.output.toString());
    }

    @Test
    public void testAddNodeNull() {
        Node nullNode = new Node(Token.NULL);
        codeGenerator.add(nullNode);
        assertEquals("null", testCodeConsumer.output.toString());
    }

    @Test
    public void testAddNodeNew() {
        Node newNode = new Node(Token.NEW);
        Node constructor = Node.newString(Token.NAME, "Object");
        newNode.addChildToBack(constructor);
        codeGenerator.add(newNode);
        assertTrue(testCodeConsumer.output.toString().contains("new"));
    }

    @Test
    public void testAddNodeDelProp() {
        Node delPropNode = new Node(Token.DELPROP);
        Node operand = Node.newString(Token.NAME, "x");
        delPropNode.addChildToBack(operand);
        codeGenerator.add(delPropNode);
        assertTrue(testCodeConsumer.output.toString().contains("delete"));
    }

    @Test
    public void testAddNodeGetElem() {
        Node getElemNode = new Node(Token.GETELEM);
        Node object = Node.newString(Token.NAME, "arr");
        Node index = Node.newString(Token.NUMBER, 0);
        getElemNode.addChildToBack(object);
        getElemNode.addChildToBack(index);
        codeGenerator.add(getElemNode);
        assertTrue(testCodeConsumer.output.toString().contains("["));
    }

    @Test
    public void testAddNodeGetProp() {
        Node getPropNode = new Node(Token.GETPROP);
        Node object = Node.newString(Token.NAME, "obj");
        Node prop = Node.newString(Token.STRING, "prop");
        getPropNode.addChildToBack(object);
        getPropNode.addChildToBack(prop);
        codeGenerator.add(getPropNode);
        assertTrue(testCodeConsumer.output.toString().contains("."));
    }

    @Test
    public void testAddNodeInc() {
        Node incNode = new Node(Token.INC);
        Node operand = Node.newString(Token.NAME, "x");
        incNode.addChildToBack(operand);
        codeGenerator.add(incNode);
        assertTrue(testCodeConsumer.output.toString().contains("++"));
    }

    @Test
    public void testAddNodeDec() {
        Node decNode = new Node(Token.DEC);
        Node operand = Node.newString(Token.NAME, "x");
        decNode.addChildToBack(operand);
        codeGenerator.add(decNode);
        assertTrue(testCodeConsumer.output.toString().contains("--"));
    }

    @Test
    public void testAddNodeTypeof() {
        Node typeofNode = new Node(Token.TYPEOF);
        Node operand = Node.newString(Token.NAME, "x");
        typeofNode.addChildToBack(operand);
        codeGenerator.add(typeofNode);
        assertTrue(testCodeConsumer.output.toString().contains("typeof"));
    }

    @Test
    public void testAddNodeVoid() {
        Node voidNode = new Node(Token.VOID);
        Node operand = Node.newString(Token.NUMBER, 0);
        voidNode.addChildToBack(operand);
        codeGenerator.add(voidNode);
        assertTrue(testCodeConsumer.output.toString().contains("void"));
    }

    @Test
    public void testAddNodeNot() {
        Node notNode = new Node(Token.NOT);
        Node operand = Node.newString(Token.TRUE);
        notNode.addChildToBack(operand);
        codeGenerator.add(notNode);
        assertTrue(testCodeConsumer.output.toString().contains("!"));
    }

    @Test
    public void testAddNodeBitnot() {
        Node bitnotNode = new Node(Token.BITNOT);
        Node operand = Node.newString(Token.NUMBER, 1);
        bitnotNode.addChildToBack(operand);
        codeGenerator.add(bitnotNode);
        assertTrue(testCodeConsumer.output.toString().contains("~"));
    }

    @Test
    public void testAddNodePos() {
        Node posNode = new Node(Token.POS);
        Node operand = Node.newString(Token.NUMBER, 5);
        posNode.addChildToBack(operand);
        codeGenerator.add(posNode);
        assertTrue(testCodeConsumer.output.toString().contains("+"));
    }

    @Test
    public void testAddNodeNeg() {
        Node negNode = new Node(Token.NEG);
        Node operand = Node.newString(Token.NUMBER, 5);
        negNode.addChildToBack(operand);
        codeGenerator.add(negNode);
        assertTrue(testCodeConsumer.output.toString().contains("-"));
    }

    @Test
    public void testAddNodeFunction() {
        Node funcNode = new Node(Token.FUNCTION);
        Node name = new Node(Token.NAME);
        name.setString("");
        Node params = new Node(Token.LP);
        Node body = new Node(Token.BLOCK);
        funcNode.addChildToBack(name);
        funcNode.addChildToBack(params);
        funcNode.addChildToBack(body);
        codeGenerator.add(funcNode);
        assertTrue(testCodeConsumer.output.toString().contains("function"));
    }

    @Test
    public void testAddNodeArrayLit() {
        Node arrayLitNode = new Node(Token.ARRAYLIT);
        Node elem1 = Node.newString(Token.NUMBER, 1);
        arrayLitNode.addChildToBack(elem1);
        codeGenerator.add(arrayLitNode);
        assertTrue(testCodeConsumer.output.toString().contains("["));
        assertTrue(testCodeConsumer.output.toString().contains("]"));
    }

    @Test
    public void testAddNodeObjectLit() {
        Node objLitNode = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "key");
        Node value = Node.newString(Token.NUMBER, 1);
        key.addChildToBack(value);
        objLitNode.addChildToBack(key);
        codeGenerator.add(objLitNode);
        assertTrue(testCodeConsumer.output.toString().contains("{"));
        assertTrue(testCodeConsumer.output.toString().contains("}"));
    }

    @Test
    public void testAddNodeRegExp() {
        Node regexpNode = new Node(Token.REGEXP);
        Node pattern = Node.newString(Token.STRING, "test");
        Node flags = Node.newString(Token.STRING, "g");
        regexpNode.addChildToBack(pattern);
        regexpNode.addChildToBack(flags);
        codeGenerator.add(regexpNode);
        assertTrue(testCodeConsumer.output.toString().contains("test"));
    }

    @Test
    public void testAddNodeExprResult() {
        Node exprResultNode = new Node(Token.EXPR_RESULT);
        Node expr = Node.newString(Token.NUMBER, 42);
        exprResultNode.addChildToBack(expr);
        codeGenerator.add(exprResultNode);
        assertEquals("42;", testCodeConsumer.output.toString());
    }

    @Test
    public void testAddNodeEmpty() {
        Node emptyNode = new Node(Token.EMPTY);
        codeGenerator.add(emptyNode);
        assertEquals("", testCodeConsumer.output.toString());
    }

    @Test
    public void testIsSimpleNumber() {
        assertTrue(CodeGenerator.isSimpleNumber("123"));
        assertFalse(CodeGenerator.isSimpleNumber("12a3"));
        assertFalse(CodeGenerator.isSimpleNumber(""));
    }

    @Test
    public void testGetSimpleNumber() {
        assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.001);
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("12a3")));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("")));
    }

    @Test
    public void testJsString() {
        String result = CodeGenerator.jsString("hello", null);
        assertTrue(result.contains("hello"));
    }

    @Test
    public void testRegexpEscape() {
        String result = CodeGenerator.regexpEscape("test", null);
        assertTrue(result.startsWith("/"));
        assertTrue(result.endsWith("/"));
    }

    @Test
    public void testStrEscape() {
        String result = CodeGenerator.strEscape("hello\nworld", '"', "\\\"", "'", "\\\\", null);
        assertTrue(result.contains("\\n"));
    }

    @Test
    public void testIdentifierEscapeSimple() {
        String result = CodeGenerator.identifierEscape("hello");
        assertEquals("hello", result);
    }

    @Test
    public void testIdentifierEscapeNonLatin() {
        String result = CodeGenerator.identifierEscape("\u00e9\u00e0");
        assertTrue(result.contains("\\u"));
    }

    @Test
    public void testGetNonEmptyChildCount() {
        Node block = new Node(Token.BLOCK);
        Node empty = new Node(Token.EMPTY);
        Node var = new Node(Token.VAR);
        block.addChildToBack(empty);
        block.addChildToBack(var);
        assertEquals(1, CodeGeneratorTest.callGetNonEmptyChildCount(block, 5));
    }

    private static int callGetNonEmptyChildCount(Node n, int maxCount) {
        return CodeGenerator.getNonEmptyChildCount(n, maxCount);
    }

    @Test
    public void testGetFirstNonEmptyChild() {
        Node block = new Node(Token.BLOCK);
        Node empty = new Node(Token.EMPTY);
        Node var = new Node(Token.VAR);
        block.addChildToBack(empty);
        block.addChildToBack(var);
        assertEquals(var, CodeGeneratorTest.callGetFirstNonEmptyChild(block));
    }

    private static Node callGetFirstNonEmptyChild(Node n) {
        return CodeGenerator.getFirstNonEmptyChild(n);
    }

    @Test
    public void testAddNodeFunctionStatement() {
        Node funcNode = new Node(Token.FUNCTION);
        Node name = new Node(Token.NAME);
        name.setString("myFunc");
        Node params = new Node(Token.LP);
        Node body = new Node(Token.BLOCK);
        funcNode.addChildToBack(name);
        funcNode.addChildToBack(params);
        funcNode.addChildToBack(body);
        codeGenerator.add(funcNode, CodeGenerator.Context.STATEMENT);
        assertTrue(testCodeConsumer.output.toString().contains("function"));
    }

    @Test
    public void testAddNodeUnknownType() {
        Node unknownNode = new Node(Token.LAST_TOKEN + 1);
        try {
            codeGenerator.add(unknownNode);
            fail("Expected exception for unknown type");
        } catch (Error e) {
            assertTrue(e.getMessage().contains("Unknown type"));
        }
    }

    @Test
    public void testAddNodeWithContinueProcessingFalse() {
        testCodeConsumer.continueProcessing = false;
        Node node = Node.newString(Token.NAME, "test");
        codeGenerator.add(node);
        assertEquals("", testCodeConsumer.output.toString());
    }
}