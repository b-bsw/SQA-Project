package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class CodePrinterTest {

    private Node createEmptyScript() {
        return new Node(Token.SCRIPT);
    }

    private Node createSimpleScript() {
        Node script = new Node(Token.SCRIPT);
        Node exprResult = new Node(Token.EXPR_RESULT);
        exprResult.addChildToBack(new Node(Token.NUMBER, 1.0));
        script.addChildToBack(exprResult);
        return script;
    }

    @Test
    public void testEmptyScript() {
        String code = new CodePrinter.Builder(createEmptyScript()).build();
        assertEquals("", code);
    }

    @Test
    public void testNullRootThrows() {
        try {
            new CodePrinter.Builder(null).build();
            fail("Expected RuntimeException for null root");
        } catch (RuntimeException expected) {
            // Expected.
        }
    }

    @Test
    public void testSimpleExpression() {
        String code = new CodePrinter.Builder(createSimpleScript()).build();
        assertNotNull(code);
        assertTrue("Expected generated code to contain '1' but was: " + code, code.contains("1"));
    }

    @Test
    public void testPrettyPrint() {
        String compact = new CodePrinter.Builder(createSimpleScript()).build();
        String pretty = new CodePrinter.Builder(createSimpleScript())
                .setPrettyPrint(true)
                .build();
        assertEquals(stripWhitespace(compact), stripWhitespace(pretty));
    }

    @Test
    public void testLineLengthThresholdBoundary() {
        String code = new CodePrinter.Builder(createSimpleScript())
                .setLineLengthThreshold(0)
                .build();
        assertTrue("Code should still contain the number: " + code, code.contains("1"));
    }

    @Test
    public void testTagAsStrict() {
        String code = new CodePrinter.Builder(createEmptyScript())
                .setTagAsStrict(true)
                .build();
        assertTrue("Strict output should contain 'use strict' but was: " + code, code.contains("use strict"));
    }

    private static String stripWhitespace(String input) {
        return input.replaceAll("\\s+", "");
    }
}