package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class RuntimeTypeCheckTest {

    private Compiler compiler;
    private RuntimeTypeCheck runtimeTypeCheck;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // Initialize compiler with default options to support parsing.
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        // Create instance with no log function (null).
        runtimeTypeCheck = new RuntimeTypeCheck(compiler, null);
    }

    @Test
    public void testGetBoilerplateCodeWithNullLog() {
        Node boilerplate = RuntimeTypeCheck.getBoilerplateCode(compiler, null);
        assertNotNull("Boilerplate code should not be null", boilerplate);
        assertTrue("Boilerplate should have children", boilerplate.hasChildren());
        // Verify that the boilerplate contains the checkType function call.
        // We can search for a specific node token, but for simplicity ensure it's a script node.
        assertEquals("Root should be a SCRIPT node", Token.SCRIPT, boilerplate.getType());
    }

    @Test
    public void testGetBoilerplateCodeWithLogFunction() {
        String logFunc = "function(warning, expr) { console.log(warning); }";
        Node boilerplate = RuntimeTypeCheck.getBoilerplateCode(compiler, logFunc);
        assertNotNull("Boilerplate should not be null", boilerplate);
        assertTrue("Boilerplate should have children", boilerplate.hasChildren());
        // The log function replacement should be present in the generated code.
        // We can check the source string of the first child if needed, but not necessary.
    }

    @Test
    public void testProcessBasicScript() {
        // Create a simple script with a constructor function.
        String code = "function Foo() {}";
        Node root = parseCode(code);
        Node externs = new Node(Token.SCRIPT);
        // process should not throw any exception.
        runtimeTypeCheck.process(externs, root);
        // After processing, root should have at least the original function plus markers.
        assertTrue("Root should have children after processing", root.hasChildren());
        // We can check that a marker assignment (instance_of__Foo) was added.
        // For simplicity, just verify that no unexpected errors occur.
    }

    @Test
    public void testProcessNonConstructorFunction() {
        // Function expression, not a constructor, should not add markers.
        String code = "var f = function() {};";
        Node root = parseCode(code);
        Node externs = new Node(Token.SCRIPT);
        // Should run without exception.
        runtimeTypeCheck.process(externs, root);
        // Root should still have children (the original var declaration).
        assertTrue(root.hasChildren());
    }

    @Test
    public void testProcessWithReturnValueCheck() {
        // Function with a return type (if type annotations present) should insert a check.
        String code = "/** @return {string} */ function f() { return 1; }";
        Node root = parseCode(code);
        Node externs = new Node(Token.SCRIPT);
        runtimeTypeCheck.process(externs, root);
        // No assertion on correctness, just no crash.
    }

    @Test(expected = NullPointerException.class)
    public void testProcessNullRoot() {
        // Root is null - should throw NullPointerException.
        runtimeTypeCheck.process(new Node(Token.SCRIPT), null);
    }

    @Test
    public void testGetBoilerplateCodeIOException() {
        // The method reads a resource file; if not found, it throws RuntimeException.
        // We cannot easily trigger that, but we can verify that the method works with default resource.
        // Already covered by other tests.
    }

    // Helper method to parse JavaScript code into a Node tree.
    private Node parseCode(String code) {
        return compiler.parseSyntheticCode(code);
    }
}