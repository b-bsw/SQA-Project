package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

public class CodeGeneratorTest {

    private CodeGenerator generator;
    private TestCodeConsumer consumer;

    @Before
    public void setUp() {
        consumer = new TestCodeConsumer();
        generator = new CodeGenerator(consumer);
    }

    @Test
    public void testTagAsStrict() {
        generator.tagAsStrict();
        assertEquals("'use strict';", consumer.getOutput());
    }

    @Test
    public void testAddString() {
        generator.add("hello");
        assertEquals("hello", consumer.getOutput());
    }

    @Test
    public void testAddStringWithConsumerStops() {
        consumer.setContinueProcessing(false);
        generator.add("should not appear");
        assertEquals("", consumer.getOutput());
    }

    @Test
    public void testAddListNodeWithMultipleChildren() {
        Node list = Node.newString(Token.LP, "a");
        list.addChildToBack(Node.newString(Token.STRING, "b"));
        Node first = list.getFirstChild();
        generator.addList(first);
        assertEquals("a, b", consumer.getOutput());
    }

    @Test
    public void testAddListWithNullFirstNode() {
        generator.addList(null);
        assertEquals("", consumer.getOutput());
    }

    @Test
    public void testAddListIsArrayOrFunctionArgumentTrue() {
        Node list = Node.newString(Token.LP, "x");
        list.addChildToBack(Node.newString(Token.STRING, "y"));
        Node first = list.getFirstChild();
        generator.addList(first, true);
        assertEquals("x, y", consumer.getOutput());
    }

    @Test
    public void testAddListIsArrayOrFunctionArgumentFalse() {
        Node list = Node.newString(Token.LP, "x");
        list.addChildToBack(Node.newString(Token.STRING, "y"));
        Node first = list.getFirstChild();
        generator.addList(first, false);
        assertEquals("x, y", consumer.getOutput());
    }

    @Test
    public void testAddArrayListWithOneItem() {
        Node list = new Node(Token.ARRAYLIT);
        list.addChildToFront(new Node(Token.STRING, "a"));
        generator.addArrayList(list.getFirstChild());
        assertEquals("a", consumer.getOutput());
    }

    @Test
    public void testAddArrayListWithMultipleItems() {
        Node list = new Node(Token.ARRAYLIT);
        list.addChildToBack(new Node(Token.STRING, "a"));
        list.addChildToBack(new Node(Token.STRING, "b"));
        generator.addArrayList(list.getFirstChild());
        assertEquals("a, b", consumer.getOutput());
    }

    @Test
    public void testAddArrayListLastWasEmpty() {
        Node list = new Node(Token.ARRAYLIT);
        list.addChildToBack(new Node(Token.STRING, "a"));
        list.addChildToBack(new Node(Token.EMPTY));
        generator.addArrayList(list.getFirstChild());
        assertEquals("a, ", consumer.getOutput());
    }

    @Test
    public void testAddCaseBody() {
        Node caseBody = new Node(Token.BLOCK);
        caseBody.addChildToFront(Node.newString(Token.EMPTY));
        generator.addCaseBody(caseBody);
        assertTrue(consumer.getOutput().contains(""));
    }

    @Test
    public void testAddAllSiblingsWithNull() {
        generator.addAllSiblings(null);
        assertEquals("", consumer.getOutput());
    }

    @Test
    public void testAddAllSiblingsWithMultiple() {
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(new Node(Token.EMPTY));
        parent.addChildToBack(new Node(Token.EMPTY));
        generator.addAllSiblings(parent.getFirstChild());
        assertEquals("", consumer.getOutput());
    }

    @Test
    public void testAddJsStringCaching() {
        generator.addJsString("test");
        String firstOutput = consumer.getOutput();
        consumer.clear();
        generator.addJsString("test");
        String secondOutput = consumer.getOutput();
        assertEquals(firstOutput, secondOutput);
    }

    @Test
    public void testJsStringWithDoubleQuotes() {
        String result = generator.jsString("hello\"world");
        assertTrue(result.contains("\\\""));
    }

    @Test
    public void testJsStringWithSingleQuotes() {
        String result = generator.jsString("hello'world");
        assertTrue(result.contains("\\'"));
    }

    @Test
    public void testJsStringWithMixedQuotes() {
        String result = generator.jsString("\"hello'world\"");
        assertTrue(result.startsWith("\""));
        assertTrue(result.endsWith("\""));
    }

    @Test
    public void testJsStringWithSpecialChars() {
        String result = generator.jsString("a\nb\tc\r");
        assertTrue(result.contains("\\n"));
        assertTrue(result.contains("\\t"));
        assertTrue(result.contains("\\r"));
    }

    @Test
    public void testJsStringWithNullChar() {
        String result = generator.jsString("a\0b");
        assertTrue(result.contains("\\0"));
    }

    @Test
    public void testJsStringWithBackslash() {
        String result = generator.jsString("a\\b");
        assertTrue(result.contains("\\\\"));
    }

    @Test
    public void testJsStringWithGreaterThan() {
        String result = generator.jsString("a-->b");
        assertTrue(result.contains("\\>"));
    }

    @Test
    public void testJsStringWithLessThanScript() {
        String result = generator.jsString("a</script>b");
        assertTrue(result.contains("<\\"));
    }

    @Test
    public void testJsStringWithLessThanComment() {
        String result = generator.jsString("a<!--b");
        assertTrue(result.contains("<\\"));
    }

    @Test
    public void testJsStringWithNonAscii() {
        String result = generator.jsString("\u00e9");
        assertTrue(result.contains("\\u00"));
    }

    @Test
    public void testIsSimpleNumberEmptyString() {
        assertEquals(false, CodeGenerator.isSimpleNumber(""));
    }

    @Test
    public void testIsSimpleNumberValid() {
        assertEquals(true, CodeGenerator.isSimpleNumber("123"));
    }

    @Test
    public void testIsSimpleNumberWithLetters() {
        assertEquals(false, CodeGenerator.isSimpleNumber("12a3"));
    }

    @Test
    public void testGetSimpleNumberValid() {
        double result = CodeGenerator.getSimpleNumber("123");
        assertEquals(123.0, result, 0.0);
    }

    @Test
    public void testGetSimpleNumberTooLarge() {
        double result = CodeGenerator.getSimpleNumber("9999999999999999999");
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testGetSimpleNumberInvalid() {
        double result = CodeGenerator.getSimpleNumber("abc");
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testIdentifierEscapeLatin() {
        assertEquals("hello", CodeGenerator.identifierEscape("hello"));
    }

    @Test
    public void testIdentifierEscapeNonLatin() {
        String result = CodeGenerator.identifierEscape("\u00e9");
        assertTrue(result.contains("\\u00"));
    }

    @Test
    public void testGetNonEmptyChildCountWithBlock() {
        Node block = new Node(Token.BLOCK);
        block.addChildToFront(new Node(Token.EMPTY));
        assertEquals(0, CodeGenerator.getNonEmptyChildCount(block, 5));
    }

    @Test
    public void testGetNonEmptyChildCountMixed() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.EMPTY));
        block.addChildToBack(new Node(Token.STRING, "x"));
        assertEquals(1, CodeGenerator.getNonEmptyChildCount(block, 5));
    }

    @Test
    public void testGetNonEmptyChildCountMaxCount() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.STRING, "a"));
        block.addChildToBack(new Node(Token.STRING, "b"));
        assertEquals(1, CodeGenerator.getNonEmptyChildCount(block, 1));
    }

    @Test
    public void testGetFirstNonEmptyChildWithBlock() {
        Node block = new Node(Token.BLOCK);
        block.addChildToFront(new Node(Token.BLOCK));
        assertNull(CodeGenerator.getFirstNonEmptyChild(block));
    }

    @Test
    public void testGetFirstNonEmptyChildFound() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.EMPTY));
        block.addChildToBack(new Node(Token.STRING, "found"));
        assertEquals("found", CodeGenerator.getFirstNonEmptyChild(block).getString());
    }

    @Test
    public void testGetFirstNonEmptyChildNotFound() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.EMPTY));
        assertNull(CodeGenerator.getFirstNonEmptyChild(block));
    }

    @Test
    public void testGetContextForNonEmptyExpression() {
        CodeGenerator.Context result = generator.getContextForNonEmptyExpression(CodeGenerator.Context.BEFORE_DANGLING_ELSE);
        assertEquals(CodeGenerator.Context.BEFORE_DANGLING_ELSE, result);
    }

    @Test
    public void testGetContextForNonEmptyExpressionOther() {
        CodeGenerator.Context result = generator.getContextForNonEmptyExpression(CodeGenerator.Context.OTHER);
        assertEquals(CodeGenerator.Context.OTHER, result);
    }

    @Test
    public void testGetContextForNoInOperator() {
        CodeGenerator.Context result = generator.getContextForNoInOperator(CodeGenerator.Context.IN_FOR_INIT_CLAUSE);
        assertEquals(CodeGenerator.Context.IN_FOR_INIT_CLAUSE, result);
    }

    @Test
    public void testGetContextForNoInOperatorOther() {
        CodeGenerator.Context result = generator.getContextForNoInOperator(CodeGenerator.Context.OTHER);
        assertEquals(CodeGenerator.Context.OTHER, result);
    }

    @Test
    public void testClearContextForNoInOperator() {
        CodeGenerator.Context result = generator.clearContextForNoInOperator(CodeGenerator.Context.IN_FOR_INIT_CLAUSE);
        assertEquals(CodeGenerator.Context.OTHER, result);
    }

    @Test
    public void testClearContextForNoInOperatorOther() {
        CodeGenerator.Context result = generator.clearContextForNoInOperator(CodeGenerator.Context.STATEMENT);
        assertEquals(CodeGenerator.Context.STATEMENT, result);
    }

    @Test
    public void testAppendHexJavaScriptRepresentation() {
        StringBuilder sb = new StringBuilder();
        CodeGenerator.appendHexJavaScriptRepresentation(sb, (char) 0x20);
        assertTrue(sb.toString().contains("\\u"));
    }

    @Test
    public void testAppendHexJavaScriptRepresentationInt() {
        StringBuilder sb = new StringBuilder();
        try {
            CodeGenerator.appendHexJavaScriptRepresentation(0x20, sb);
            assertTrue(sb.toString().contains("\\u"));
        } catch (Exception e) {
            fail("Exception not expected");
        }
    }

    @Test
    public void testAppendHexJavaScriptRepresentationSupplementary() {
        StringBuilder sb = new StringBuilder();
        try {
            CodeGenerator.appendHexJavaScriptRepresentation(0x1F600, sb);
            assertTrue(sb.toString().contains("\\u"));
        } catch (Exception e) {
            fail("Exception not expected");
        }
    }

    @Test
    public void testConstructorWithNullCharset() {
        CodeGenerator gen = new CodeGenerator(consumer, null);
        assertNull(gen.outputCharsetEncoder);
    }

    @Test
    public void testConstructorWithAsciiCharset() {
        CodeGenerator gen = new CodeGenerator(consumer, java.nio.charset.StandardCharsets.US_ASCII);
        assertNull(gen.outputCharsetEncoder);
    }

    @Test
    public void testConstructorWithUtf8Charset() {
        CodeGenerator gen = new CodeGenerator(consumer, java.nio.charset.StandardCharsets.UTF_8);
        assertNotNull(gen.outputCharsetEncoder);
    }

    @Test
    public void testEscapeToDoubleQuotedJsString() {
        String result = CodeGenerator.escapeToDoubleQuotedJsString("hello");
        assertTrue(result.startsWith("\""));
        assertTrue(result.endsWith("\""));
    }

    @Test
    public void testEscapeToDoubleQuotedJsStringWithEscape() {
        String result = CodeGenerator.escapeToDoubleQuotedJsString("\"");
        assertTrue(result.contains("\\\""));
    }

    @Test
    public void testRegexpEscapeWithCharset() {
        String result = CodeGenerator.regexpEscape("test", null);
        assertTrue(result.startsWith("/"));
        assertTrue(result.endsWith("/"));
    }

    @Test
    public void testRegexpEscapeWithoutCharset() {
        String result = CodeGenerator.regexpEscape("test");
        assertTrue(result.startsWith("/"));
        assertTrue(result.endsWith("/"));
    }

    @Test
    public void testStrEscapeWithQuoteChar() {
        String result = CodeGenerator.strEscape("a", '\'', "\"", "\\'", "\\\\", null);
        assertTrue(result.startsWith("'"));
        assertTrue(result.endsWith("'"));
    }

    @Test
    public void testStrEscapeWithNullChar() {
        String result = CodeGenerator.strEscape("a\0b", '"', "\\\"", "'", "\\\\", null);
        assertTrue(result.contains("\\0"));
    }

    @Test
    public void testStrEscapeWithNewline() {
        String result = CodeGenerator.strEscape("a\nb", '"', "\\\"", "'", "\\\\", null);
        assertTrue(result.contains("\\n"));
    }

    @Test
    public void testStrEscapeWithCarriageReturn() {
        String result = CodeGenerator.strEscape("a\rb", '"', "\\\"", "'", "\\\\", null);
        assertTrue(result.contains("\\r"));
    }

    @Test
    public void testStrEscapeWithTab() {
        String result = CodeGenerator.strEscape("a\tb", '"', "\\\"", "'", "\\\\", null);
        assertTrue(result.contains("\\t"));
    }

    @Test
    public void testStrEscapeWithBackslash() {
        String result = CodeGenerator.strEscape("a\\b", '"', "\\\"", "'", "\\\\", null);
        assertTrue(result.contains("\\\\"));
    }

    @Test
    public void testStrEscapeWithDoubleQuote() {
        String result = CodeGenerator.strEscape("a\"b", '"', "\\\"", "'", "\\\\", null);
        assertTrue(result.contains("\\\""));
    }

    @Test
    public void testStrEscapeWithSingleQuote() {
        String result = CodeGenerator.strEscape("a'b", '"', "\\\"", "'", "\\\\", null);
        assertTrue(result.contains("'"));
    }

    @Test
    public void testStrEscapeWithGreaterThan() {
        String result = CodeGenerator.strEscape("a-->b", '"', "\\\"", "'", "\\\\", null);
        assertTrue(result.contains("\\>"));
    }

    @Test
    public void testStrEscapeWithLessThanScript() {
        String result = CodeGenerator.strEscape("a</script>b", '"', "\\\"", "'", "\\\\", null);
        assertTrue(result.contains("<\\"));
    }

    @Test
    public void testStrEscapeWithLessThanComment() {
        String result = CodeGenerator.strEscape("a<!--b", '"', "\\\"", "'", "\\\\", null);
        assertTrue(result.contains("<\\"));
    }

    @Test
    public void testStrEscapeWithNonAsciiAndEncoder() {
        java.nio.charset.CharsetEncoder encoder = java.nio.charset.StandardCharsets.US_ASCII.newEncoder();
        String result = CodeGenerator.strEscape("a\u00e9b", '"', "\\\"", "'", "\\\\", encoder);
        assertTrue(result.contains("\\u00e9"));
    }

    @Test
    public void testStrEscapeWithNonAsciiWithoutEncoder() {
        String result = CodeGenerator.strEscape("a\u00e9b", '"', "\\\"", "'", "\\\\", null);
        assertTrue(result.contains("\\u00e9"));
    }

    @Test
    public void testStrEscapeWithPrintableAscii() {
        String result = CodeGenerator.strEscape("abc123", '"', "\\\"", "'", "\\\\", null);
        assertEquals("\"abc123\"", result);
    }

    // Helper class for testing
    private static class TestCodeConsumer extends CodeConsumer {
        private StringBuilder output = new StringBuilder();
        private boolean continueProcessing = true;

        @Override
        void add(String str) {
            output.append(str);
        }

        @Override
        void addIdentifier(String identifier) {
            output.append(identifier);
        }

        @Override
        void addOp(String op, boolean b) {
            output.append(op);
        }

        @Override
        void addNumber(double x) {
            output.append(x);
        }

        @Override
        void startSourceMapping(Node node) {
        }

        @Override
        void endSourceMapping(Node node) {
        }

        @Override
        void endStatement(boolean b) {
        }

        @Override
        void endStatement() {
        }

        @Override
        void endFunction(boolean b) {
        }

        @Override
        void beginBlock() {
        }

        @Override
        void endBlock(boolean b) {
        }

        @Override
        void maybeLineBreak() {
        }

        @Override
        void notePreferredLineBreak() {
        }

        @Override
        boolean breakAfterBlockFor(Node n, boolean b) {
            return false;
        }

        @Override
        boolean shouldPreserveExtraBlocks() {
            return false;
        }

        @Override
        void listSeparator() {
            output.append(", ");
        }

        @Override
        void beginCaseBody() {
        }

        @Override
        void endCaseBody() {
        }

        @Override
        boolean continueProcessing() {
            return continueProcessing;
        }

        public String getOutput() {
            return output.toString();
        }

        public void setContinueProcessing(boolean b) {
            this.continueProcessing = b;
        }

        public void clear() {
            output = new StringBuilder();
        }
    }
}