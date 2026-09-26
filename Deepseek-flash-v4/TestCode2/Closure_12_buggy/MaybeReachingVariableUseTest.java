package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowAnalysis;
import com.google.javascript.jscomp.MaybeReachingVariableUse;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.rhino.Node;
import java.util.ArrayList;
import java.util.Collection;

public class MaybeReachingVariableUseTest {
    private Compiler compiler;
    private ControlFlowAnalysis cfa;

    @Before
    public void setUp() {
        compiler = new Compiler();
        compiler.init(new ArrayList<SourceFile>(), new ArrayList<SourceFile>(), null);
        cfa = new ControlFlowAnalysis(compiler, false, false);
    }

    private Node parseAndGetFunction(String code) {
        Node root = compiler.parse(code);
        for (Node child = root.getFirstChild(); child != null; child = child.getNext()) {
            if (child.isFunction()) return child;
        }
        fail("No function found in: " + code);
        return null;
    }

    private MaybeReachingVariableUse analyzeFunction(Node fnNode) {
        Node body = fnNode.getLastChild();
        Scope scope = compiler.getScope(fnNode);
        ControlFlowGraph<Node> cfg = cfa.analyze(body);
        MaybeReachingVariableUse analysis = new MaybeReachingVariableUse(cfg, scope, compiler);
        analysis.analyze();
        return analysis;
    }

    @Test
    public void testSimpleDefinitionUse() {
        String code = "function f() { var x = 1; var y = x; }";
        Node fn = parseAndGetFunction(code);
        MaybeReachingVariableUse analysis = analyzeFunction(fn);
        Node body = fn.getLastChild();
        Node varX = body.getFirstChild();
        Node nameX = varX.getFirstChild();
        Collection<Node> uses = analysis.getUses("x", nameX);
        assertNotNull(uses);
        assertEquals(1, uses.size());
        Node varY = body.getLastChild();
        Node nameY = varY.getFirstChild();
        Node useNode = nameY.getFirstChild();
        assertSame(useNode, uses.iterator().next());
    }

    @Test
    public void testDefinitionInConditional() {
        String code = "function f() { var x = 1; if (true) { x = 2; } var y = x; }";
        Node fn = parseAndGetFunction(code);
        MaybeReachingVariableUse analysis = analyzeFunction(fn);
        Node body = fn.getLastChild();
        Node varX = body.getFirstChild();
        Node nameX = varX.getFirstChild();
        Collection<Node> uses = analysis.getUses("x", nameX);
        assertNotNull(uses);
        assertTrue(uses.isEmpty());
    }

    @Test
    public void testForInLoop() {
        String code = "function f() { var x; for (var y in x) { } }";
        Node fn = parseAndGetFunction(code);
        MaybeReachingVariableUse analysis = analyzeFunction(fn);
        Node body = fn.getLastChild();
        Node varX = body.getFirstChild();
        Node nameX = varX.getFirstChild();
        Collection<Node> uses = analysis.getUses("x", nameX);
        assertNotNull(uses);
        assertTrue(uses.size() > 0);
    }

    @Test
    public void testCompoundAssignment() {
        String code = "function f() { var x = 1; x += 2; var y = x; }";
        Node fn = parseAndGetFunction(code);
        MaybeReachingVariableUse analysis = analyzeFunction(fn);
        Node body = fn.getLastChild();
        Node varX = body.getFirstChild();
        Node nameX = varX.getFirstChild();
        Collection<Node> uses = analysis.getUses("x", nameX);
        assertNotNull(uses);
        assertEquals(2, uses.size());
    }

    @Test
    public void testEscapedVariable() {
        String code = "function f() { var x = 1; var escape = function() { return x; }; var y = x; }";
        Node fn = parseAndGetFunction(code);
        MaybeReachingVariableUse analysis = analyzeFunction(fn);
        Node body = fn.getLastChild();
        Node varX = body.getFirstChild();
        Node nameX = varX.getFirstChild();
        Collection<Node> uses = analysis.getUses("x", nameX);
        assertNotNull(uses);
        assertTrue(uses.isEmpty());
    }

    @Test
    public void testLogicalAndOrOperator() {
        String code = "function f() { var x = 1; var y = x && x; }";
        Node fn = parseAndGetFunction(code);
        MaybeReachingVariableUse analysis = analyzeFunction(fn);
        Node body = fn.getLastChild();
        Node varX = body.getFirstChild();
        Node nameX = varX.getFirstChild();
        Collection<Node> uses = analysis.getUses("x", nameX);
        assertNotNull(uses);
        assertEquals(2, uses.size());
    }

    @Test
    public void testHookOperator() {
        String code = "function f() { var x = 1; var y = true ? x : x; }";
        Node fn = parseAndGetFunction(code);
        MaybeReachingVariableUse analysis = analyzeFunction(fn);
        Node body = fn.getLastChild();
        Node varX = body.getFirstChild();
        Node nameX = varX.getFirstChild();
        Collection<Node> uses = analysis.getUses("x", nameX);
        assertNotNull(uses);
        assertEquals(2, uses.size());
    }

    @Test(expected = NullPointerException.class)
    public void testGetUsesWithNullDefNode() {
        String code = "function f() { var x = 1; }";
        Node fn = parseAndGetFunction(code);
        MaybeReachingVariableUse analysis = analyzeFunction(fn);
        analysis.getUses("x", null);
    }

    @Test(expected = NullPointerException.class)
    public void testGetUsesForNonexistentVar() {
        String code = "function f() { var x = 1; }";
        Node fn = parseAndGetFunction(code);
        MaybeReachingVariableUse analysis = analyzeFunction(fn);
        Node body = fn.getLastChild();
        Node varX = body.getFirstChild();
        Node nameX = varX.getFirstChild();
        analysis.getUses("y", nameX);
    }
}