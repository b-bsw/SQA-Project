package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Field;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.jscomp.NodeTraversal.Callback;

public class MakeDeclaredNamesUniqueTest {

    private AbstractCompiler compiler;
    private int reportCodeChangeCount;

    @Before
    public void setUp() {
        compiler = new AbstractCompiler() {
            @Override
            public void reportCodeChange() {
                reportCodeChangeCount++;
            }
            // implement necessary abstract methods
            @Override
            public CompilerInput getInput(SourceFile file) {
                return null;
            }
            @Override
            public SourceFile getSourceFile(String name) {
                return null;
            }
            @Override
            public String getSourceLine(String sourceName, int lineno) {
                return null;
            }
            @Override
            public Region getSourceRegion(String sourceName, int lineno) {
                return null;
            }
            @Override
            public void handleChange() {}
            @Override
            public CheckLevel getErrorLevel(JSError error) {
                return null;
            }
            @Override
            public boolean hasHaltingErrors() {
                return false;
            }
            @Override
            public void handleTypedChange() {}
            @Override
            public void report(JSError error) {}
            @Override
            public void setErrorManager(ErrorManager errorManager) {}
            @Override
            public ErrorManager getErrorManager() {
                return null;
            }
            @Override
            public boolean isErrorReportingEnabled() {
                return false;
            }
            @Override
            public void setMessageFormatter(MessageFormatter formatter) {}
            @Override
            public void setPassConfig(PassConfig passConfig) {}
            @Override
            public PassConfig getPassConfig() {
                return null;
            }
            @Override
            public CompilerOptions getOptions() {
                return null;
            }
            @Override
            public void setProgress(Progress progress) {}
            @Override
            public Progress getProgress() {
                return null;
            }
            @Override
            public boolean isTypeCheckingEnabled() {
                return false;
            }
            @Override
            public void generateNewUniqueId() {}
            @Override
            public String getUniqueId() {
                return "";
            }
            @Override
            public void maybeInsertEmptyStatement(NodeTraversal t, Node n, Node parent) {}
            @Override
            public void reportCodeChange(Node source) {}
            @Override
            public void reportChange() {}
            @Override
            public boolean hasChange() {
                return false;
            }
            @Override
            public void setChange(boolean isChanged) {}
            @Override
            public void setChanged(boolean isChanged) {}
            @Override
            public boolean hasCompilationLevel() {
                return false;
            }
            @Override
            public CompilationLevel getCompilationLevel() {
                return null;
            }
            @Override
            public void inject(Region region) {}
            @Override
            public boolean needsLazySourceFilesLoading() {
                return false;
            }
            @Override
            public void setSourceMap(SourceMap sourceMap) {}
            @Override
            public SourceMap getSourceMap() {
                return null;
            }
            @Override
            public void setMessageFormatter(MessageFormatter formatter) {}
        };
        reportCodeChangeCount = 0;
    }

    // Stub to create NodeTraversal with controlled scope/scopeRoot
    private NodeTraversal createNodeTraversal(Node scopeRoot, Scope scope) {
        NodeTraversal t = new NodeTraversal(compiler, new Callback() {
            @Override
            public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
                return true;
            }
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        }) {
            @Override
            public Scope getScope() {
                return scope;
            }
            @Override
            public Node getScopeRoot() {
                return scopeRoot;
            }
        };
        return t;
    }

    @Test
    public void testDefaultConstructor() {
        MakeDeclaredNamesUnique m = new MakeDeclaredNamesUnique();
        assertNotNull(m);
    }

    @Test
    public void testConstructorWithRenamer() {
        MakeDeclaredNamesUnique.Renamer custom = new MakeDeclaredNamesUnique.Renamer() {
            @Override
            public void addDeclaredName(String name) {}
            @Override
            public String getReplacementName(String oldName) { return null; }
            @Override
            public boolean stripConstIfReplaced() { return false; }
            @Override
            public MakeDeclaredNamesUnique.Renamer forChildScope() { return this; }
        };
        MakeDeclaredNamesUnique m = new MakeDeclaredNamesUnique(custom);
        assertNotNull(m);
    }

    @Test
    public void testContextualRenamerGlobalReserveName() {
        MakeDeclaredNamesUnique.ContextualRenamer r = new MakeDeclaredNamesUnique.ContextualRenamer();
        r.addDeclaredName("x");
        assertNull(r.getReplacementName("x"));
    }

    @Test
    public void testContextualRenamerNonGlobalFirstDecl() {
        MakeDeclaredNamesUnique.ContextualRenamer r = new MakeDeclaredNamesUnique.ContextualRenamer();
        // simulate a child scope
        MakeDeclaredNamesUnique.Renamer child = r.forChildScope();
        child.addDeclaredName("y");
        assertEquals("y$$1", child.getReplacementName("y"));
    }

    @Test
    public void testContextualRenamerNonGlobalSecondDeclSameName() {
        MakeDeclaredNamesUnique.ContextualRenamer r = new MakeDeclaredNamesUnique.ContextualRenamer();
        MakeDeclaredNamesUnique.Renamer child = r.forChildScope();
        child.addDeclaredName("z");
        child.addDeclaredName("z");
        // second addDeclaredName should not create new name (already in declarations)
        assertEquals("z$$1", child.getReplacementName("z"));
    }

    @Test
    public void testContextualRenamerForChildScope() {
        MakeDeclaredNamesUnique.ContextualRenamer r = new MakeDeclaredNamesUnique.ContextualRenamer();
        MakeDeclaredNamesUnique.Renamer child = r.forChildScope();
        assertNotNull(child);
        assertTrue(child instanceof MakeDeclaredNamesUnique.ContextualRenamer);
    }

    @Test
    public void testContextualRenamerStripConstIfReplaced() {
        MakeDeclaredNamesUnique.ContextualRenamer r = new MakeDeclaredNamesUnique.ContextualRenamer();
        assertFalse(r.stripConstIfReplaced());
    }

    @Test
    public void testInlineRenamerAddDeclaredName() {
        final String[] id = {"0"};
        java.util.function.Supplier<String> supplier = () -> id[0]++;
        MakeDeclaredNamesUnique.InlineRenamer r = new MakeDeclaredNamesUnique.InlineRenamer(
                () -> id[0]++, "prefix", false);
        r.addDeclaredName("a");
        assertEquals("a$$prefix0", r.getReplacementName("a"));
    }

    @Test
    public void testInlineRenamerAddDeclaredNameWithSeparator() {
        final String[] id = {"0"};
        MakeDeclaredNamesUnique.InlineRenamer r = new MakeDeclaredNamesUnique.InlineRenamer(
                () -> id[0]++, "p", false);
        r.addDeclaredName("b$$10");
        // should strip suffix before adding
        assertEquals("b$$p0", r.getReplacementName("b$$10"));
    }

    @Test
    public void testInlineRenamerForChildScope() {
        final String[] id = {"0"};
        MakeDeclaredNamesUnique.InlineRenamer r = new MakeDeclaredNamesUnique.InlineRenamer(
                () -> id[0]++, "x", true);
        MakeDeclaredNamesUnique.Renamer child = r.forChildScope();
        assertTrue(child instanceof MakeDeclaredNamesUnique.InlineRenamer);
    }

    @Test
    public void testInlineRenamerStripConstIfReplaced() {
        MakeDeclaredNamesUnique.InlineRenamer r = new MakeDeclaredNamesUnique.InlineRenamer(
                () -> "id", "pre", true);
        assertTrue(r.stripConstIfReplaced());
        r = new MakeDeclaredNamesUnique.InlineRenamer(() -> "id", "pre", false);
        assertFalse(r.stripConstIfReplaced());
    }

    @Test
    public void testContextualRenameInverterStaticMethods() {
        assertEquals("original", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("original$$1"));
        assertEquals("name", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("name"));
        assertEquals(5, MakeDeclaredNamesUnique.ContextualRenameInverter.indexOfSeparator("hello$$world"));
        assertEquals(-1, MakeDeclaredNamesUnique.ContextualRenameInverter.indexOfSeparator("noway"));
        assertTrue(MakeDeclaredNamesUnique.ContextualRenameInverter.containsSeparator("a$$b"));
        assertFalse(MakeDeclaredNamesUnique.ContextualRenameInverter.containsSeparator("ab"));
        assertEquals("prefix", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalNameInternal("prefix$$suffix", 6));
        assertEquals("suffix", MakeDeclaredNamesUnique.ContextualRenameInverter.getNameSuffix("prefix$$suffix", 6));
    }

    // Integration test for enterScope global block
    @Test
    public void testEnterScopeGlobalBlock() {
        Node block = new Node(Token.BLOCK);
        Node varNode = new Node(Token.VAR, new Node(Token.NAME, "myVar"));
        block.addChildToBack(varNode);
        Scope globalScope = new Scope(null, block);
        NodeTraversal t = createNodeTraversal(block, globalScope);
        MakeDeclaredNamesUnique m = new MakeDeclaredNamesUnique();
        m.enterScope(t);
        // Now visit a NAME node "myVar" in this scope
        Node nameNode = new Node(Token.NAME, "myVar");
        m.visit(t, nameNode, block);
        // myVar should be renamed to "myVar$$1" (contextual)
        assertEquals("myVar$$1", nameNode.getString());
        assertTrue(reportCodeChangeCount > 0);
    }

    @Test
    public void testExitScopeGlobalDoesNotPop() {
        Node block = new Node(Token.BLOCK);
        Scope globalScope = new Scope(null, block);
        NodeTraversal t = createNodeTraversal(block, globalScope);
        MakeDeclaredNamesUnique m = new MakeDeclaredNamesUnique();
        m.enterScope(t);
        m.exitScope(t); // global, should not pop
        // subsequent enter should still see the same renamer
        NodeTraversal t2 = createNodeTraversal(block, globalScope);
        m.enterScope(t2);
        // No exception, ok
    }

    @Test
    public void testExitScopeNonGlobalPops() {
        Node function = new Node(Token.FUNCTION, new Node(Token.NAME, "f"));
        Scope functionScope = new Scope(new Scope(null, new Node(Token.BLOCK)), function);
        NodeTraversal t = createNodeTraversal(function, functionScope);
        MakeDeclaredNamesUnique m = new MakeDeclaredNamesUnique();
        m.shouldTraverse(t, function, null); // push child scope
        m.exitScope(t); // non-global, should pop
        // after pop, shouldTraverse again should push a new child
        m.shouldTraverse(t, function, null);
        // no exception
    }

    @Test
    public void testShouldTraverseFunctionExpressionAddsRecursiveName() {
        Node func = new Node(Token.FUNCTION, new Node(Token.NAME, "recursiveFunc"));
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(func);
        Scope globalScope = new Scope(null, parent);
        NodeTraversal t = createNodeTraversal(func, globalScope);
        MakeDeclaredNamesUnique m = new MakeDeclaredNamesUnique();
        m.shouldTraverse(t, func, parent);
        // now visit the name node
        Node nameNode = func.getFirstChild(); // "recursiveFunc"
        m.visit(t, nameNode, func);
        // should be renamed to "recursiveFunc$$1"
        assertEquals("recursiveFunc$$1", nameNode.getString());
    }

    @Test
    public void testShouldTraverseFunctionDeclarationDoesNotAddRecursiveName() {
        Node func = new Node(Token.FUNCTION, new Node(Token.NAME, "declaredFunc"));
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(func);
        Scope globalScope = new Scope(null, parent);
        NodeTraversal t = createNodeTraversal(func, globalScope);
        MakeDeclaredNamesUnique m = new MakeDeclaredNamesUnique();
        m.shouldTraverse(t, func, parent);
        Node nameNode = func.getFirstChild();
        m.visit(t, nameNode, func);
        // should NOT be renamed because isFunctionDeclaration is true
        assertEquals("declaredFunc", nameNode.getString());
    }

    @Test
    public void testShouldTraverseCatchAddsExceptionName() {
        Node catchNode = new Node(Token.CATCH, new Node(Token.NAME, "e"));
        Node parent = new Node(Token.TRY);
        parent.addChildToBack(catchNode);
        Scope globalScope = new Scope(null, parent);
        NodeTraversal t = createNodeTraversal(catchNode, globalScope);
        MakeDeclaredNamesUnique m = new MakeDeclaredNamesUnique();
        m.shouldTraverse(t, catchNode, parent);
        Node nameNode = catchNode.getFirstChild();
        m.visit(t, nameNode, catchNode);
        // "e" should be renamed
        assertEquals("e$$1", nameNode.getString());
    }

    @Test
    public void testVisitFunctionPopsStack() {
        Node func = new Node(Token.FUNCTION, new Node(Token.NAME, "g"));
        Scope globalScope = new Scope(null, func);
        NodeTraversal t = createNodeTraversal(func, globalScope);
        MakeDeclaredNamesUnique m = new MakeDeclaredNamesUnique();
        m.shouldTraverse(t, func, new Node(Token.EXPR_RESULT));
        Node nameNode = func.getFirstChild();
        m.visit(t, func, null); // pops
        // after pop, the name from shouldTraverse should be removed from stack
        // next visit of a name should not be replaced
        Node otherName = new Node(Token.NAME, "g");
        m.visit(t, otherName, func);
        // since renamer popped, no replacement
        assertEquals("g", otherName.getString());
    }

    @Test
    public void testVisitCatchPopsStack() {
        Node catchNode = new Node(Token.CATCH, new Node(Token.NAME, "ex"));
        Node tryNode = new Node(Token.TRY);
        tryNode.addChildToBack(catchNode);
        Scope globalScope = new Scope(null, tryNode);
        NodeTraversal t = createNodeTraversal(catchNode, globalScope);
        MakeDeclaredNamesUnique m = new MakeDeclaredNamesUnique();
        m.shouldTraverse(t, catchNode, tryNode);
        Node nameNode = catchNode.getFirstChild();
        m.visit(t, catchNode, tryNode); // pop catch scope
        // second visit should not replace
        Node nameAgain = new Node(Token.NAME, "ex");
        m.visit(t, nameAgain, catchNode);
        assertEquals("ex", nameAgain.getString());
    }

    @Test
    public void testVisitNameNoReplacement() {
        Node name = new Node(Token.NAME, "undeclared");
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(name);
        Scope globalScope = new Scope(null, parent);
        NodeTraversal t = createNodeTraversal(parent, globalScope);
        MakeDeclaredNamesUnique m = new MakeDeclaredNamesUnique();
        m.enterScope(t);
        String old = name.getString();
        m.visit(t, name, parent);
        assertEquals(old, name.getString());
    }

    @Test
    public void testVisitNameWithReplacementAndStripConst() {
        Node block = new Node(Token.BLOCK);
        Node varNode = new Node(Token.VAR, new Node(Token.NAME, "constVar"));
        block.addChildToBack(varNode);
        Node constName = varNode.getFirstChild();
        constName.putProp(Node.IS_CONSTANT_NAME, true);
        Scope globalScope = new Scope(null, block);
        NodeTraversal t = createNodeTraversal(block, globalScope);
        MakeDeclaredNamesUnique m = new MakeDeclaredNamesUnique();
        m.enterScope(t);
        m.visit(t, constName, varNode);
        // constVar renamed to "constVar$$1", and property removed
        assertEquals("constVar$$1", constName.getString());
        assertNull(constName.getProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testGetReplacementNameWalksStack() throws Exception {
        MakeDeclaredNamesUnique m = new MakeDeclaredNamesUnique();
        // Add a renamer to the stack via internal field
        Field nameStackField = MakeDeclaredNamesUnique.class.getDeclaredField("nameStack");
        nameStackField.setAccessible(true);
        java.util.Deque<MakeDeclaredNamesUnique.Renamer> stack =
                (java.util.Deque<MakeDeclaredNamesUnique.Renamer>) nameStackField.get(m);
        // Add ContextualRenamer
        MakeDeclaredNamesUnique.ContextualRenamer r1 = new MakeDeclaredNamesUnique.ContextualRenamer();
        stack.push(r1.forChildScope()); // non-global
        stack.peek().addDeclaredName("a");
        // add another child scope
        MakeDeclaredNamesUnique.Renamer r2 = stack.peek().forChildScope();
        r2.addDeclaredName("b");
        stack.push(r2);
        // Call private getReplacementName via reflection
        java.lang.reflect.Method method = MakeDeclaredNamesUnique.class.getDeclaredMethod("getReplacementName", String.class);
        method.setAccessible(true);
        String result = (String) method.invoke(m, "a");
        assertEquals("a$$1", result);
        result = (String) method.invoke(m, "b");
        assertEquals("b$$1", result);
        result = (String) method.invoke(m, "c");
        assertNull(result);
    }

    @Test
    public void testFindDeclaredNamesFunctionDeclaration() throws Exception {
        MakeDeclaredNamesUnique m = new MakeDeclaredNamesUnique();
        MakeDeclaredNamesUnique.ContextualRenamer r = new MakeDeclaredNamesUnique.ContextualRenamer();
        MakeDeclaredNamesUnique.Renamer child = r.forChildScope();
        // simulate findDeclaredNames on a function declaration node
        Node func = new Node(Token.FUNCTION, new Node(Token.NAME, "myFunc"));
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(func);
        java.lang.reflect.Method method = MakeDeclaredNamesUnique.class.getDeclaredMethod(
                "findDeclaredNames", Node.class, Node.class, MakeDeclaredNamesUnique.Renamer.class);
        method.setAccessible(true);
        method.invoke(m, parent, null, child);
        assertEquals("myFunc$$1", child.getReplacementName("myFunc"));
    }
}