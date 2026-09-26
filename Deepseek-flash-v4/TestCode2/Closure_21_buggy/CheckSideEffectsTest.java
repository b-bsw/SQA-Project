package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.ArrayList;
import java.util.List;

public class CheckSideEffectsTest {

    private TestCompiler compiler;
    private CheckSideEffects pass;

    private static class TestCompiler extends Compiler {
        List<JSError> reports = new ArrayList<>();
        boolean codeChangeReported = false;
        CompilerInput synthesizedExternsInput = null;

        @Override
        public void report(JSError error) {
            reports.add(error);
        }

        @Override
        public CompilerInput getSynthesizedExternsInput() {
            if (synthesizedExternsInput == null) {
                Node script = new Node(Token.SCRIPT);
                script.setInputId(new com.google.javascript.jscomp.InputId("synthesized-externs"));
                synthesizedExternsInput = new CompilerInput(script);
            }
            return synthesizedExternsInput;
        }

        @Override
        public void reportCodeChange() {
            codeChangeReported = true;
        }
    }

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
    }

    private Node createExprResult(Node expression) {
        return new Node(Token.EXPR_RESULT, expression);
    }

    private Node createStringLiteralExpr() {
        return createExprResult(IR.string("hello"));
    }

    @Test
    public void testProcess_StringLiteral_ReportsWarning() {
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(createStringLiteralExpr());

        pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
        pass.process(null, root);

        assertEquals(1, compiler.reports.size());
        JSError error = compiler.reports.get(0);
        assertTrue(error.getDescription().contains("Is there a missing '+'"));
    }

    @Test
    public void testProcess_SideEffectCall_NoWarning() {
        Node call = IR.call(IR.name("foo"));
        Node exprResult = createExprResult(call);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(exprResult);

        pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
        pass.process(null, root);

        assertEquals(0, compiler.reports.size());
    }

    @Test
    public void testProcess_SimpleOperator_ResultUnused_Reports() {
        Node add = IR.add(IR.name("x"), IR.name("y"));
        Node exprResult = createExprResult(add);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(exprResult);

        pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
        pass.process(null, root);

        assertEquals(1, compiler.reports.size());
        JSError error = compiler.reports.get(0);
        assertTrue(error.getDescription().contains("The result of the 'add' operator is not being used."));
    }

    @Test
    public void testProcess_ProtectSideEffects_ReplacesNodeWithProtectorCall() {
        Node root = new Node(Token.SCRIPT);
        Node stringExpr = createStringLiteralExpr();
        root.addChildToBack(stringExpr);

        pass = new CheckSideEffects(compiler, CheckLevel.WARNING, true);
        pass.process(null, root);

        CompilerInput externsInput = compiler.getSynthesizedExternsInput();
        Node externsRoot = externsInput.getAstRoot(compiler);
        Node var = externsRoot.getFirstChild();
        assertNotNull(var);
        assertEquals(Token.VAR, var.getType());
        Node nameNode = var.getFirstChild();
        assertTrue(nameNode.isName());
        assertEquals(CheckSideEffects.PROTECTOR_FN, nameNode.getString());

        Node exprResult = root.getFirstChild();
        assertNotNull(exprResult);
        assertEquals(Token.EXPR_RESULT, exprResult.getType());
        Node call = exprResult.getFirstChild();
        assertNotNull(call);
        assertEquals(Token.CALL, call.getType());
        Node target = call.getFirstChild();
        assertTrue(target.isName());
        assertEquals(CheckSideEffects.PROTECTOR_FN, target.getString());
        Node arg = target.getNext();
        assertTrue(arg.isString());
        assertEquals("hello", arg.getString());
        assertTrue(compiler.codeChangeReported);
    }

    @Test
    public void testProcess_NoProblemNodes_NoExternAdded() {
        Node call = IR.call(IR.name("foo"));
        Node exprResult = createExprResult(call);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(exprResult);

        pass = new CheckSideEffects(compiler, CheckLevel.WARNING, true);
        pass.process(null, root);

        assertFalse(compiler.codeChangeReported);
        CompilerInput externsInput = compiler.getSynthesizedExternsInput();
        Node externsRoot = externsInput.getAstRoot(compiler);
        assertFalse(externsRoot.hasChildren());
    }

    @Test
    public void testHotSwapScript_ReportsWarning() {
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(createStringLiteralExpr());

        pass = new CheckSideEffects(compiler, CheckLevel.WARNING, true);
        pass.hotSwapScript(root, root);

        assertEquals(1, compiler.reports.size());
    }

    @Test
    public void testStripProtection_RemovesProtectorCall() {
        Node protectedCall = IR.call(
                IR.name(CheckSideEffects.PROTECTOR_FN),
                IR.string("hello"));
        Node exprResult = new Node(Token.EXPR_RESULT, protectedCall);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(exprResult);

        CheckSideEffects.StripProtection stripper = new CheckSideEffects.StripProtection(compiler);
        stripper.process(null, root);

        Node after = root.getFirstChild().getFirstChild();
        assertTrue(after.isString());
        assertEquals("hello", after.getString());
    }

    @Test
    public void testProcess_QualifiedNameWithJSDoc_NoWarning() {
        Node qname = IR.getprop(IR.name("a"), IR.string("b"));
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        builder.recordNoAlias();
        qname.setJSDocInfo(builder.build(qname));

        Node exprResult = createExprResult(qname);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(exprResult);

        pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
        pass.process(null, root);

        assertEquals(0, compiler.reports.size());
    }
}