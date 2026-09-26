package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;

public class InlineVariablesTest extends CompilerTestCase {
    private InlineVariables.Mode mode = InlineVariables.Mode.ALL;
    private boolean inlineAllStrings = true;

    @Override
    protected CompilerPass getProcessor(Compiler compiler) {
        return new InlineVariables(compiler, mode, inlineAllStrings);
    }

    @Before
    public void setUp() {
        mode = InlineVariables.Mode.ALL;
        inlineAllStrings = true;
    }

    @Test
    public void testConstantsOnlyMode() {
        mode = InlineVariables.Mode.CONSTANTS_ONLY;
        test("var x = 1; alert(x)", "alert(1)");
    }

    @Test
    public void testLocalsOnlyMode() {
        mode = InlineVariables.Mode.LOCALS_ONLY;
        test("function f() { var y = 2; alert(y); } f();",
             "function f() { alert(2); } f();");
    }

    @Test
    public void testAllMode() {
        mode = InlineVariables.Mode.ALL;
        test("var z = 3; alert(z)", "alert(3)");
    }

    @Test
    public void testLocalsOnlyDoesNotInlineGlobal() {
        mode = InlineVariables.Mode.LOCALS_ONLY;
        test("var global = 1; alert(global)", "var global = 1; alert(global)");
    }

    @Test
    public void testConstantsOnlyDoesNotInlineNonConstant() {
        mode = InlineVariables.Mode.CONSTANTS_ONLY;
        test("var x = 1; x = 2; alert(x)", "var x = 1; x = 2; alert(x)");
    }

    @Test
    public void testStringInliningWithInlineAllStringsFalse() {
        mode = InlineVariables.Mode.ALL;
        inlineAllStrings = false;
        test("var s = 'a'; alert(s)", "alert('a')");
    }

    @Test
    public void testAliasCandidateInlining() {
        mode = InlineVariables.Mode.ALL;
        test("var x = 1; var y = x; alert(y)", "alert(1)");
    }

    @Test
    public void testNoArgumentsModification() {
        mode = InlineVariables.Mode.ALL;
        test("function f() { var a = 1; alert(a); } f();",
             "function f() { alert(1); } f();");
    }

    @Test
    public void testFunctionDeclarationInlining() {
        mode = InlineVariables.Mode.ALL;
        test("var f = function() { return 1; }; alert(f());",
             "alert(function() { return 1; }())");
    }

    @Test
    public void testObjectLiteralNotInlined() {
        mode = InlineVariables.Mode.ALL;
        test("var obj = {a:1}; alert(obj)", "var obj = {a:1}; alert(obj)");
    }

    @Test
    public void testConstantNonImmutableNotInlined() {
        mode = InlineVariables.Mode.CONSTANTS_ONLY;
        test("var obj = {a:1}; alert(obj)", "var obj = {a:1}; alert(obj)");
    }
}