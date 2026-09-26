package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import org.junit.Test;

public class FlowSensitiveInlineVariablesTest {

    @Test
    public void testProcessNullRootThrows() {
        FlowSensitiveInlineVariables pass =
                new FlowSensitiveInlineVariables(new Compiler());

        try {
            pass.process(null, null);
            fail("Expected RuntimeException when processing a null root");
        } catch (RuntimeException expected) {
            // expected exception path
        }
    }

    @Test
    public void testExitScopeIsNoOp() {
        FlowSensitiveInlineVariables pass =
                new FlowSensitiveInlineVariables(new Compiler());
        pass.exitScope(null);
    }

    @Test
    public void testProcessEmptyFunctionDoesNotThrow() {
        runPass("function f(){}");
    }

    @Test
    public void testProcessGlobalCodeDoesNotThrow() {
        runPass("var a=1; foo(a);");
    }

    @Test
    public void testProcessInlinesSingleUseVariable() {
        Node root = runPass("function f(){var id=1; foo(id);}");
        String tree = root.toStringTree();

        assertFalse("Expected variable 'id' to be inlined away",
                tree.contains("NAME id"));
        assertFalse("Expected variable 'id' to be inlined away",
                tree.contains("NAME  id"));
    }

    @Test
    public void testProcessMultipleVariablesDoesNotThrow() {
        runPass("function f(){var a=1,b=2; foo(a); bar(b);}");
    }

    @Test
    public void testProcessLoopDoesNotThrow() {
        runPass("function f(){var i=0; while(i<10){i++;}}");
    }

    private Node runPass(String code) {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());

        Node root = compiler.parseSyntheticCode(code);
        FlowSensitiveInlineVariables pass =
                new FlowSensitiveInlineVariables(compiler);

        pass.process(null, root);
        return root;
    }
}