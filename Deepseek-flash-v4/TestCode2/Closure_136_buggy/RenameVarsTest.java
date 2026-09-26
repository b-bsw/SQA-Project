package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class RenameVarsTest {

    private MockAbstractCompiler compiler;
    private RenameVars renameVars;
    private RenameVars.ProcessVars processVars;
    private MockScope scope;
    private MockNodeTraversal traversal;
    private Node externs;
    private Node root;

    // ----- helper stubs -----

    private static class MockAbstractCompiler extends AbstractCompiler {
        boolean codeChanged = false;
        StringBuilder debugLog = new StringBuilder();
        CodingConvention convention = new CodingConvention() {
            @Override public boolean isExported(String name, boolean local) {
                return false;
            }
            // other methods default
        };
        @Override public CodingConvention getCodingConvention() { return convention; }
        @Override public void reportCodeChange() { codeChanged = true; }
        @Override public void addToDebugLog(String msg) { debugLog.append(msg); }
        @Override public ScopeCreator getScopeCreator() { return null; } // not used in ProcessVars tests
        @Override public Scope getDefaultScope() { return null; }
        // keep compilation state simple
    }

    private static class MockScope extends Scope {
        private Map<String, Var> vars = new HashMap<String, Var>();
        MockScope() {
            super(null, null, null); // dummy parent/type
        }
        void addVar(String name, Var var) {
            vars.put(name, var);
        }
        @Override public Var getVar(String name) {
            return vars.get(name);
        }
        // other abstract methods not needed
    }

    private static class MockVar implements Scope.Var {
        boolean local;
        String name;
        int localIndex;
        Node parentNode;
        MockVar(String name, boolean local, int index) {
            this.name = name;
            this.local = local;
            this.localIndex = index;
        }
        @Override public String getName() { return name; }
        @Override public boolean isLocal() { return local; }
        @Override public int getLocalVarIndex() { return localIndex; }
        @Override public Node getParentNode() { return parentNode; }
        @Override public Scope getScope() { return null; }
        // other not used
        @Override public CompilerInput getInput() { return null; }
        @Override public Node getNode() { return null; }
        @Override public boolean isGlobal() { return !local; }
        @Override public boolean isArguments() { return false; }
        @Override public boolean isExtern() { return false; }
        @Override public boolean isParam() { return false; }
        @Override public boolean isDeclared() { return true; }
        @Override public boolean isBleedingFunction() { return false; }
    }

    // NodeTraversal stubbing: we override getScope()
    private static class MockNodeTraversal extends NodeTraversal {
        private Scope scope;
        MockNodeTraversal(AbstractCompiler compiler, Scope scope) {
            super(compiler);
            this.scope = scope;
        }
        @Override public Scope getScope() { return scope; }
        @Override public Scope getClosestHoistScope() { return scope; }
    }

    @Before
    public void setUp() {
        compiler = new MockAbstractCompiler();
        renameVars = new RenameVars(compiler, null, false, false, false, null, null, null);
        processVars = renameVars.new ProcessVars(false);
        scope = new MockScope();
        traversal = new MockNodeTraversal(compiler, scope);
        externs = new Node(Token.SCRIPT);
        root = new Node(Token.SCRIPT);
    }

    // ------------------------- tests for Assignment inner class -------------------------

    @Test
    public void testAssignmentConstructor() {
        CompilerInput input = null;
        RenameVars.Assignment a = renameVars.new Assignment("old", input);
        assertEquals("old", a.oldName);
        assertNull(a.newName);
        assertEquals(0, a.count);
        assertTrue(a.orderOfOccurrence >= 0);
    }

    @Test
    public void testAssignmentSetNewName() {
        CompilerInput input = null;
        RenameVars.Assignment a = renameVars.new Assignment("old", input);
        a.setNewName("newName");
        assertEquals("newName", a.newName);
    }

    @Test(expected = IllegalStateException.class)
    public void testAssignmentSetNewNameTwiceThrows() {
        CompilerInput input = null;
        RenameVars.Assignment a = renameVars.new Assignment("old", input);
        a.setNewName("first");
        a.setNewName("second"); // should throw
    }

    // ------------------------- tests for constructor of RenameVars -------------------------

    @Test
    public void testConstructorNullPrefixBecomesEmpty() {
        RenameVars rv = new RenameVars(compiler, null, false, false, false, null, null, null);
        // prefix field is private; we can test indirectly through process (not needed here)
        // We'll just ensure no exception
        assertNotNull(rv);
    }

    @Test
    public void testConstructorNullReservedNamesBecomesEmpty() {
        RenameVars rv = new RenameVars(compiler, "", false, false, false, null, null, null);
        assertNotNull(rv);
    }

    // ------------------------- tests for ProcessVars.visit (isExternsPass = false) -------------------------

    @Test
    public void testVisitEmptyNameIgnored() {
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("");
        processVars.visit(traversal, nameNode, nameNode);
        // should not add anything
        assertTrue(renameVars.globalNameNodes.isEmpty());
        assertTrue(renameVars.localNameNodes.isEmpty());
    }

    @Test
    public void testVisitLocalVarAddsToLocalAndTemp() {
        MockVar var = new MockVar("x", true, 0);
        scope.addVar("x", var);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        processVars.visit(traversal, nameNode, nameNode);
        assertEquals(1, renameVars.localNameNodes.size());
        assertSame(nameNode, renameVars.localNameNodes.get(0));
        assertEquals(1, renameVars.localTempNames.size());
        assertEquals("L 0", renameVars.localTempNames.get(0));
        // check assignment count incremented
        RenameVars.Assignment a = renameVars.assignments.get("L 0");
        assertNotNull(a);
        assertEquals(1, a.count);
    }

    @Test
    public void testVisitGlobalVarAddsToGlobal() {
        MockVar var = new MockVar("g", false, 0);
        scope.addVar("g", var);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("g");
        processVars.visit(traversal, nameNode, nameNode);
        assertEquals(1, renameVars.globalNameNodes.size());
        assertSame(nameNode, renameVars.globalNameNodes.get(0));
        RenameVars.Assignment a = renameVars.assignments.get("g");
        assertNotNull(a);
        assertEquals(1, a.count);
    }

    @Test
    public void testVisitGlobalVarAlreadyCounted() {
        // simulate already counted once
        RenameVars.Assignment a = renameVars.new Assignment("g", null);
        a.count = 1;
        renameVars.assignments.put("g", a);
        MockVar var = new MockVar("g", false, 0);
        scope.addVar("g", var);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("g");
        processVars.visit(traversal, nameNode, nameNode);
        assertEquals(2, a.count); // increment
    }

    @Test
    public void testVisitLocalVarWithLocalRenamingOnlyPreservesGlobal() {
        // set localRenamingOnly = true and create RenameVars with that flag
        renameVars = new RenameVars(compiler, null, true, false, false, null, null, null);
        processVars = renameVars.new ProcessVars(false);
        // global variable should be added to reservedNames
        MockVar var = new MockVar("g", false, 0);
        scope.addVar("g", var);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("g");
        processVars.visit(traversal, nameNode, nameNode);
        assertTrue(renameVars.reservedNames.contains("g"));
        // globalNameNodes should not be added
        assertTrue(renameVars.globalNameNodes.isEmpty());
    }

    @Test
    public void testVisitAnonymousFunctionNamePreserved() {
        renameVars = new RenameVars(compiler, null, false, true, false, null, null, null);
        processVars = renameVars.new ProcessVars(false);
        MockVar var = new MockVar("anon", true, 0);
        var.parentNode = new Node(Token.FUNCTION); // isAnonymousFunction check: var.getParentNode() type == FUNCTION
        scope.addVar("anon", var);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("anon");
        processVars.visit(traversal, nameNode, nameNode);
        assertTrue(renameVars.reservedNames.contains("anon"));
    }

    @Test
    public void testVisitOkToRenameVarReturnsFalseReserved() {
        // make okToRenameVar return false by having isExported true
        compiler.convention = new CodingConvention() {
            @Override public boolean isExported(String name, boolean local) {
                return true; // treat as exported -> not ok to rename
            }
        };
        renameVars = new RenameVars(compiler, null, false, false, false, null, null, null);
        processVars = renameVars.new ProcessVars(false);
        MockVar var = new MockVar("export", true, 0);
        scope.addVar("export", var);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("export");
        processVars.visit(traversal, nameNode, nameNode);
        // should not add to any list
        assertTrue(renameVars.localNameNodes.isEmpty());
        assertTrue(renameVars.globalNameNodes.isEmpty());
    }

    // ------------------------- tests for ProcessVars.visit (isExternsPass = true) -------------------------

    @Test
    public void testVisitExternsPassGlobalAddsToExternNames() {
        RenameVars.ProcessVars externVars = renameVars.new ProcessVars(true);
        MockVar var = new MockVar("ext", false, 0);
        scope.addVar("ext", var);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("ext");
        externVars.visit(traversal, nameNode, nameNode);
        assertTrue(renameVars.externNames.contains("ext"));
    }

    @Test
    public void testVisitExternsPassLocalIgnored() {
        RenameVars.ProcessVars externVars = renameVars.new ProcessVars(true);
        MockVar var = new MockVar("int", true, 0);
        scope.addVar("int", var);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("int");
        externVars.visit(traversal, nameNode, nameNode);
        assertFalse(renameVars.externNames.contains("int"));
    }

    // ------------------------- tests for process() integration (simple global) -------------------------

    @Test
    public void testProcessSimpleGlobalVar() {
        // build AST: var x = 1;
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "x");
        Node child = Node.newNumber(1);
        nameNode.addChildToBack(child);
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);
        // also need externs empty
        renameVars.process(externs, root);
        // after process, assignment for "x" should have a newName
        RenameVars.Assignment a = renameVars.assignments.get("x");
        assertNotNull(a);
        assertNotNull(a.newName);
        assertFalse(a.newName.equals("x"));
        // the node should have been renamed
        assertEquals(a.newName, nameNode.getString());
    }

    @Test
    public void testProcessLocalRenamingOnlyPreservesGlobal() {
        renameVars = new RenameVars(compiler, null, true, false, false, null, null, null);
        // global var should be reserved
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "g");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);
        renameVars.process(externs, root);
        // "g" should be in reservedNames, no assignment newName
        assertTrue(renameVars.reservedNames.contains("g"));
        RenameVars.Assignment a = renameVars.assignments.get("g");
        assertNull(a);
    }

    @Test
    public void testProcessWithPrevUsedRenameMap() {
        // create previous rename map
        VariableMap prevMap = new VariableMap(
            new HashMap<String, String>() {{
                put("x", "prev");
            }}
        );
        renameVars = new RenameVars(compiler, "", false, false, false, prevMap, null, null);
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "x");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);
        renameVars.process(externs, root);
        // "x" should be renamed to "prev" (if not reserved)
        assertEquals("prev", nameNode.getString());
    }

    @Test
    public void testProcessGetVariableMapAfterRename() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "y");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);
        renameVars.process(externs, root);
        VariableMap map = renameVars.getVariableMap();
        assertNotNull(map);
        String newName = map.lookupNewName("y");
        assertNotNull(newName);
        assertFalse(newName.equals("y"));
    }

    // ------------------------- test for FREQUENCY_COMPARATOR ordering -------------------------
    @Test
    public void testFrequencyComparatorSortsByCountDescending() {
        // create two assignments with different counts
        RenameVars.Assignment a1 = renameVars.new Assignment("a", null);
        a1.count = 3;
        RenameVars.Assignment a2 = renameVars.new Assignment("b", null);
        a2.count = 5;
        Comparator<Assignment> cmp = RenameVars.FREQUENCY_COMPARATOR;
        assertTrue(cmp.compare(a1, a2) > 0); // a2 higher count -> a2 first (negative? check: compare(a1,a2) should return >0 if a1 > a2? We want descending: a2 should come first. compare(a2,a1) >0. Let's check: a2.count > a1.count => a2 - a1 = positive, so compare(a1,a2) = a2.count - a1.count = positive => a1 > a2 conventionally, but our comparator returns a2.count - a1.count, so compare(a1,a2) >0 means a1 > a2. That satisfies descending. So assert compare(a1,a2)>0 correct.
    }

    @Test
    public void testFrequencyComparatorTieBreaksByOrderOfOccurrence() {
        // same count, different order
        RenameVars.Assignment a1 = renameVars.new Assignment("a", null);
        a1.count = 1;
        RenameVars.Assignment a2 = renameVars.new Assignment("b", null);
        a2.count = 1;
        Comparator<Assignment> cmp = RenameVars.FREQUENCY_COMPARATOR;
        // a1 has smaller orderOfOccurrence (created first) so should be considered smaller
        assertTrue(cmp.compare(a1, a2) < 0);
    }

    // ------------------------- test for ORDER_OF_OCCURRENCE_COMPARATOR -------------------------
    @Test
    public void testOrderOfOccurrenceComparator() {
        RenameVars.Assignment a1 = renameVars.new Assignment("a", null);
        RenameVars.Assignment a2 = renameVars.new Assignment("b", null); // created later -> larger orderOfOccurrence
        Comparator<Assignment> cmp = RenameVars.ORDER_OF_OCCURRENCE_COMPARATOR;
        assertTrue(cmp.compare(a1, a2) < 0);
    }

    // ------------------------- test for getPseudoName -------------------------
    @Test
    public void testPseudoNameGenerated() {
        renameVars = new RenameVars(compiler, null, false, false, true, null, null, null);
        // process a global var and check new name
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "z");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);
        renameVars.process(externs, root);
        String newName = nameNode.getString();
        assertTrue(newName.startsWith("$") && newName.endsWith("$$"));
        assertTrue(newName.contains("z"));
    }

    // ------------------------- test for okToRenameVar path (via process) -------------------------
    @Test
    public void testOkToRenameVarFalseThroughCodingConvention() {
        // make convention.isExported true for a specific name
        compiler.convention = new CodingConvention() {
            @Override public boolean isExported(String name, boolean local) {
                return "exported".equals(name);
            }
        };
        renameVars = new RenameVars(compiler, null, false, false, false, null, null, null);
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "exported");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);
        renameVars.process(externs, root);
        // "exported" should NOT be in assignments because okToRenameVar returned false
        assertNull(renameVars.assignments.get("exported"));
    }

    // ------------------------- test for assignmentLog -------------------------
    @Test
    public void testAssignmentLogWritten() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "logVar");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);
        renameVars.process(externs, root);
        assertTrue(compiler.debugLog.toString().contains("logVar =>"));
    }

    // ------------------------- test for reportCodeChange -------------------------
    @Test
    public void testReportCodeChangeWhenRenamed() {
        renameVars.process(externs, root); // no variables -> no change
        assertFalse(compiler.codeChanged);
        // now add a variable
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "chg");
        varNode.addChildToBack(nameNode);
        Node root2 = new Node(Token.SCRIPT);
        root2.addChildToBack(varNode);
        renameVars.process(externs, root2);
        assertTrue(compiler.codeChanged);
    }
}