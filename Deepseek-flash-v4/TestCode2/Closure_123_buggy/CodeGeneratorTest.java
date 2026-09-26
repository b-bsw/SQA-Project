package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

public class CodeGeneratorTest {

    private static class TestCodeConsumer implements CodeConsumer {
        private final StringBuilder output = new StringBuilder();
        private boolean continueProcessing = true;

        @Override
        public void add(String str) {
            output.append(str);
        }

        @Override
        public void addIdentifier(String identifier) {
            output.append(identifier);
        }

        @Override
        public void addOp(String op, boolean spaceBefore) {
            output.append(op);
        }

        @Override
        public void addNumber(double x) {
            output.append(formatNumber(x));
        }

        private String formatNumber(double x) {
            if (x == (long) x) {
                return String.valueOf((long) x);
            }
            return String.valueOf(x);
        }

        @Override
        public void addConstant(String constant) {
            output.append(constant);
        }

        @Override
        public void startSourceMapping(Node n) {
        }

        @Override
        public void endSourceMapping(Node n) {
        }

        @Override
        public void beginBlock() {
            output.append("{");
        }

        @Override
        public void endBlock(boolean endLine) {
            output.append("}");
            if (endLine) {
                output.append("\n");
            }
        }

        @Override
        public boolean continueProcessing() {
            return continueProcessing;
        }

        public void setContinueProcessing(boolean continueProcessing) {
            this.continueProcessing = continueProcessing;
        }

        @Override
        public void listSeparator() {
            output.append(", ");
        }

        @Override
        public void beginCaseBody() {
            output.append(": ");
        }

        @Override
        public void endCaseBody() {
        }

        @Override
        public void endStatement(boolean b) {
            if (b) {
                output.append(";\n");
            } else {
                output.append(";");
            }
        }

        @Override
        public void endStatement() {
            output.append(";");
        }

        @Override
        public void maybeLineBreak() {
        }

        @Override
        public void notePreferredLineBreak() {
        }

        @Override
        public boolean breakAfterBlockFor(Node n, boolean isStatementContext) {
            return false;
        }

        @Override
        public boolean shouldPreserveExtraBlocks() {
            return false;
        }

        @Override
        public void endFunction(boolean isStatement) {
            if (isStatement) {
                output.append("\n");
            }
        }

        public String getOutput() {
            return output.toString();
        }

        public void clear() {
            output.setLength(0);
        }
    }

    private TestCodeConsumer consumer;
    private CodeGenerator generator;

    @Before
    public void setUp() {
        consumer = new TestCodeConsumer();
        generator = CodeGenerator.forCostEstimation(consumer);
    }

    // ---------- Static method tests ----------
    @Test
    public void testIsSimpleNumber_Valid() {
        assertTrue(CodeGenerator.isSimpleNumber("123"));
        assertTrue(CodeGenerator.isSimpleNumber("0"));
        assertTrue(CodeGenerator.isSimpleNumber("9"));
    }

    @Test
    public void testIsSimpleNumber_Invalid() {
        assertFalse(CodeGenerator.isSimpleNumber(""));
        assertFalse(CodeGenerator.isSimpleNumber("0123")); // leading zero
        assertFalse(CodeGenerator.isSimpleNumber("12.3"));
        assertFalse(CodeGenerator.isSimpleNumber("abc"));
    }

    @Test
    public void testGetSimpleNumber_Valid() {
        assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.0);
        assertEquals(0.0, CodeGenerator.getSimpleNumber("0"), 0.0);
    }

    @Test
    public void testGetSimpleNumber_Invalid() {
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("")));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("0123")));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("12.3")));
    }

    @Test
    public void testIdentifierEscape_Latin() {
        assertEquals("hello", CodeGenerator.identifierEscape("hello"));
    }

    @Test
    public void testIdentifierEscape_NonLatin() {
        String result = CodeGenerator.identifierEscape("\u00e9\u1234");
        assertTrue(result.contains("\\u"));
    }

    // ---------- Basic add operations ----------
    @Test
    public void testAddString() {
        generator.add("test");
        assertEquals("test", consumer.getOutput());
    }

    @Test
    public void testTagAsStrict() {
        generator.tagAsStrict();
        assertEquals("'use strict';", consumer.getOutput());
    }

    @Test
    public void testAddNumberNode() {
        Node n = new Node(Token.NUMBER);
        n.setDouble(42.5);
        generator.add(n);
        assertEquals("42.5", consumer.getOutput());
    }

    @Test
    public void testAddStringNode() {
        Node n = Node.newString(Token.STRING, "hello");
        generator.add(n);
        assertEquals("\"hello\"", consumer.getOutput());
    }

    @Test
    public void testAddNullNode() {
        Node n = new Node(Token.NULL);
        generator.add(n);
        assertEquals("null", consumer.getOutput());
    }

    @Test
    public void testAddThisNode() {
        Node n = new Node(Token.THIS);
        generator.add(n);
        assertEquals("this", consumer.getOutput());
    }

    @Test
    public void testAddTrueNode() {
        Node n = new Node(Token.TRUE);
        generator.add(n);
        assertEquals("true", consumer.getOutput());
    }

    @Test
    public void testAddFalseNode() {
        Node n = new Node(Token.FALSE);
        generator.add(n);
        assertEquals("false", consumer.getOutput());
    }

    @Test
    public void testAddEmptyNode() {
        Node n = new Node(Token.EMPTY);
        generator.add(n);
        assertEquals("", consumer.getOutput());
    }

    // ---------- Binary operator tests ----------
    @Test
    public void testAddBinaryOperator_Add() {
        Node left = new Node(Token.NUMBER);
        left.setDouble(1);
        Node right = new Node(Token.NUMBER);
        right.setDouble(2);
        Node add = new Node(Token.ADD, left, right);
        generator.add(add);
        assertEquals("1+2", consumer.getOutput());
    }

    @Test(expected = IllegalStateException.class)
    public void testBinaryOperator_WrongChildCount() {
        Node left = new Node(Token.NUMBER);
        left.setDouble(1);
        Node add = new Node(Token.ADD, left);
        // missing second child
        generator.add(add);
    }

    @Test
    public void testAddBinaryOperator_AssignmentChain() {
        Node x = Node.newString(Token.NAME, "x");
        Node y = Node.newString(Token.NAME, "y");
        Node z = Node.newString(Token.NAME, "z");
        Node assign1 = new Node(Token.ASSIGN, y, new Node(Token.NUMBER, 1));
        Node assign2 = new Node(Token.ASSIGN, z, assign1);
        Node root = new Node(Token.ASSIGN, x, assign2);
        generator.add(root);
        // Note: assignment chain is right-associative; expected: x = z = y = 1?
        // Actually our node tree: x = (z = (y = 1))
        // With unroll: should produce "x = z = y = 1"
        assertEquals("x = z = y = 1", consumer.getOutput().trim());
    }

    // ---------- Control flow tokens ----------
    @Test
    public void testAddIfElse() {
        Node cond = new Node(Token.TRUE);
        Node thenBlock = new Node(Token.BLOCK);
        Node elseBlock = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF, cond, thenBlock, elseBlock);
        generator.add(ifNode);
        assertEquals("if(true)", consumer.getOutput());
    }

    @Test
    public void testAddTryCatchFinally() {
        try {
            Node block = new Node(Token.BLOCK);
            Node catchNode = new Node(Token.CATCH, Node.newString("e"), block);
            Node tryNode = new Node(Token.TRY, block, catchNode);
            generator.add(tryNode);
            fail("Expected Preconditions.checkState failure because first child's next is not a block with no additional children");
        } catch (Exception e) {
            // expected
        }
    }

    @Test(expected = Error.class)
    public void testUnknownTokenType() {
        Node n = new Node(9999); // unknown type
        generator.add(n);
    }

    // ---------- List operations ----------
    @Test
    public void testAddList_Single() {
        Node n = new Node(Token.NUMBER);
        n.setDouble(5);
        generator.addList(n, false);
        assertEquals("5", consumer.getOutput());
    }

    @Test
    public void testAddList_Multiple() {
        Node n1 = new Node(Token.NUMBER);
        n1.setDouble(1);
        Node n2 = new Node(Token.NUMBER);
        n2.setDouble(2);
        Node n1Next = new Node(Token.NUMBER, n2);
        n1.setNext(n1Next);
        generator.addList(n1, false);
        assertEquals("1, 2", consumer.getOutput());
    }

    @Test
    public void testAddArrayList_Normal() {
        Node n1 = new Node(Token.NUMBER);
        n1.setDouble(1);
        Node n2 = new Node(Token.NUMBER);
        n2.setDouble(2);
        Node n1Next = new Node(Token.NUMBER, n2);
        n1.setNext(n1Next);
        generator.addArrayList(n1);
        assertEquals("1, 2", consumer.getOutput());
    }

    @Test
    public void testAddArrayList_TrailingEmpty() {
        Node n1 = new Node(Token.NUMBER);
        n1.setDouble(1);
        Node emptyNode = new Node(Token.EMPTY);
        n1.setNext(emptyNode);
        generator.addArrayList(n1);
        assertEquals("1, ", consumer.getOutput());
    }

    // ---------- Edge cases ----------
    @Test
    public void testAddWithContinueProcessingFalse() {
        consumer.setContinueProcessing(false);
        Node n = new Node(Token.NUMBER);
        n.setDouble(10);
        generator.add(n);
        assertEquals("", consumer.getOutput());
    }

    @Test
    public void testJsStringEscaping_Quotes() {
        // Test addJsString indirectly via Node with STRING token
        Node n = Node.newString(Token.STRING, "a\"b");
        generator.add(n);
        assertEquals("\"a\\\"b\"", consumer.getOutput());
    }

    @Test
    public void testJsStringEscaping_ControlChar() {
        Node n = Node.newString(Token.STRING, "a\nb");
        generator.add(n);
        assertEquals("\"a\\nb\"", consumer.getOutput());
    }

    // ---------- Static method: getSimpleNumber with large number ----------
    @Test
    public void testGetSimpleNumber_Large() {
        // A number within range but can be parsed as long
        assertEquals(2147483647.0, CodeGenerator.getSimpleNumber("2147483647"), 0.0);
        // Exceeding MAX_POSITIVE_INTEGER_NUMBER? Let's use 1<<53 approx 9007199254740992
        // We don't have NodeUtil, so we assume value just below limit
        // We'll test that it returns NaN for very large numbers
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("99999999999999999999")));
    }
}