package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class CompilerTest {

    private Compiler compiler;
    private CompilerOptions options;

    @Before
    public void setUp() {
        compiler = new Compiler();
        options = new CompilerOptions();
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(compiler);
    }

    @Test(expected = NullPointerException.class)
    public void testSetErrorManagerNull() {
        compiler.setErrorManager(null);
    }

    @Test
    public void testInitOptionsWithNullOutStream() {
        // outStream == null (default constructor)
        compiler.initOptions(options);
        assertNotNull(compiler.getErrorManager());
        assertTrue(compiler.getErrorManager() instanceof LoggerErrorManager);
    }

    @Test
    public void testInitOptionsWithOutStream() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        Compiler compilerWithStream = new Compiler(ps);
        compilerWithStream.initOptions(options);
        assertNotNull(compilerWithStream.getErrorManager());
        assertTrue(compilerWithStream.getErrorManager() instanceof PrintStreamErrorManager);
    }

    @Test
    public void testInitOptionsWithExistingErrorManager() {
        ErrorManager stub = new StubErrorManager();
        compiler.setErrorManager(stub);
        compiler.initOptions(options);
        assertSame(stub, compiler.getErrorManager());
    }

    @Test
    public void testInitWithArrays() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
        compiler.init(new JSSourceFile[]{extern}, new JSSourceFile[]{input}, options);
        assertNotNull(compiler.getRoot());
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testInitWithEmptyInputs() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        compiler.init(new JSSourceFile[]{extern}, new JSSourceFile[0], options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testInitWithEmptyRootModule() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSModule root = new JSModule("root");
        JSModule second = new JSModule("second");
        second.add(JSSourceFile.fromCode("second.js", "var b=2;"));
        compiler.initModules(Lists.newArrayList(extern), Lists.newArrayList(root, second), options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testDuplicateExternInput() {
        JSSourceFile extern1 = JSSourceFile.fromCode("dupe.js", "");
        JSSourceFile extern2 = JSSourceFile.fromCode("dupe.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var a;");
        compiler.init(new JSSourceFile[]{extern1, extern2}, new JSSourceFile[]{input}, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testDuplicateInput() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile input1 = JSSourceFile.fromCode("dupe.js", "var a;");
        JSSourceFile input2 = JSSourceFile.fromCode("dupe.js", "var b;");
        compiler.init(new JSSourceFile[]{extern}, new JSSourceFile[]{input1, input2}, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testFillEmptyModules() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSModule module = new JSModule("testModule");
        compiler.initModules(Lists.newArrayList(extern), Lists.newArrayList(module), options);
        List<CompilerInput> moduleInputs = module.getInputs();
        assertEquals(1, moduleInputs.size());
        assertEquals("[testModule]", moduleInputs.get(0).getName());
    }

    @Test
    public void testParseSyntheticCode() {
        Node node = compiler.parseSyntheticCode("var x = 10;");
        assertNotNull(node);
        assertEquals(Token.SCRIPT, node.getType());
    }

    @Test
    public void testParseTestCode() {
        Node node = compiler.parseTestCode("var y = 'test';");
        assertNotNull(node);
        assertEquals(Token.SCRIPT, node.getType());
    }

    @Test
    public void testResetUniqueNameId() {
        compiler.initCompilerOptionsIfTesting();
        // getUniqueNameIdSupplier returns Supplier that calls nextUniqueNameId()
        java.util.concurrent.Callable<String> supplier = new java.util.concurrent.Callable<String>() {
            @Override
            public String call() {
                return compiler.getUniqueNameIdSupplier().get();
            }
        };
        try {
            assertEquals("0", supplier.call());
            assertEquals("1", supplier.call());
            compiler.resetUniqueNameId();
            assertEquals("0", supplier.call());
        } catch (Exception e) {
            fail("Exception: " + e);
        }
    }

    @Test
    public void testGetInput() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var a;");
        compiler.init(new JSSourceFile[]{extern}, new JSSourceFile[]{input}, options);
        assertNotNull(compiler.getInput("input.js"));
        assertNull(compiler.getInput("nonexistent"));
    }

    @Test
    public void testNewExternInput() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var a;");
        compiler.init(new JSSourceFile[]{extern}, new JSSourceFile[]{input}, options);
        CompilerInput newExt = compiler.newExternInput("customExtern");
        assertNotNull(newExt);
        assertSame(newExt, compiler.getInput("customExtern"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewExternInputDuplicate() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var a;");
        compiler.init(new JSSourceFile[]{extern}, new JSSourceFile[]{input}, options);
        compiler.newExternInput("extern.js");
    }

    @Test
    public void testGetSourceLine() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "line1\nline2\n");
        compiler.init(new JSSourceFile[]{extern}, new JSSourceFile[]{input}, options);
        assertEquals("line2", compiler.getSourceLine("input.js", 2));
        assertNull(compiler.getSourceLine("input.js", 0));
        assertNull(compiler.getSourceLine("nonexistent", 1));
    }

    @Test
    public void testGetSourceRegion() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "a\nb\nc\nd\n");
        compiler.init(new JSSourceFile[]{extern}, new JSSourceFile[]{input}, options);
        assertNotNull(compiler.getSourceRegion("input.js", 2));
        assertNull(compiler.getSourceRegion("input.js", 0));
    }

    @Test
    public void testSetPassConfigNormal() {
        PassConfig pc = new DefaultPassConfig(options);
        compiler.setPassConfig(pc);
        assertSame(pc, compiler.getPassConfig());
    }

    @Test(expected = NullPointerException.class)
    public void testSetPassConfigNull() {
        compiler.setPassConfig(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testSetPassConfigAlreadySet() {
        PassConfig pc1 = new DefaultPassConfig(options);
        compiler.setPassConfig(pc1);
        PassConfig pc2 = new DefaultPassConfig(options);
        compiler.setPassConfig(pc2);
    }

    @Test
    public void testCompileSimple() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
        Result result = compiler.compile(extern, input, options);
        assertNotNull(result);
        assertEquals(0, result.errors.length);
    }

    @Test
    public void testCompileWithSyntaxError() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = ;");
        Result result = compiler.compile(extern, input, options);
        assertNotNull(result);
        assertTrue(result.errors.length > 0);
    }

    @Test
    public void testCompileModules() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSModule mod1 = new JSModule("m1");
        mod1.add(JSSourceFile.fromCode("m1.js", "var x=1;"));
        JSModule mod2 = new JSModule("m2");
        mod2.add(JSSourceFile.fromCode("m2.js", "var y=2;"));
        Result result = compiler.compileModules(Lists.newArrayList(extern), Lists.newArrayList(mod1, mod2), options);
        assertNotNull(result);
        assertEquals(0, result.errors.length);
    }

    @Test
    public void testToSource() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
        compiler.compile(extern, input, options);
        String src = compiler.toSource();
        assertTrue(src.contains("var a = 1"));
    }

    @Test
    public void testGetInputsInOrder() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile input1 = JSSourceFile.fromCode("a.js", "var a;");
        JSSourceFile input2 = JSSourceFile.fromCode("b.js", "var b;");
        compiler.init(new JSSourceFile[]{extern}, new JSSourceFile[]{input1, input2}, options);
        List<CompilerInput> inputs = compiler.getInputsInOrder();
        assertEquals(2, inputs.size());
        assertEquals("a.js", inputs.get(0).getName());
        assertEquals("b.js", inputs.get(1).getName());
    }

    @Test
    public void testGetExternsForTesting() {
        JSSourceFile extern1 = JSSourceFile.fromCode("ext1.js", "");
        JSSourceFile extern2 = JSSourceFile.fromCode("ext2.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var a;");
        compiler.init(new JSSourceFile[]{extern1, extern2}, new JSSourceFile[]{input}, options);
        List<CompilerInput> externs = compiler.getExternsForTesting();
        assertEquals(2, externs.size());
    }

    @Test
    public void testGetNodeForCodeInsertionNoModule() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var a;");
        compiler.init(new JSSourceFile[]{extern}, new JSSourceFile[]{input}, options);
        Node node = compiler.getNodeForCodeInsertion(null);
        assertNotNull(node);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetNodeForCodeInsertionRootModuleNoInputs() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSModule root = new JSModule("root");
        compiler.initModules(Lists.newArrayList(extern), Lists.newArrayList(root), options);
        compiler.getNodeForCodeInsertion(root);
    }

    @Test
    public void testRegExpGlobalReferences() {
        assertTrue(compiler.hasRegExpGlobalReferences());
        compiler.setHasRegExpGlobalReferences(false);
        assertFalse(compiler.hasRegExpGlobalReferences());
    }

    @Test
    public void testNormalizedFlag() {
        assertFalse(compiler.isNormalized());
        compiler.setNormalized();
        assertTrue(compiler.isNormalized());
        compiler.setUnnormalized();
        assertFalse(compiler.isNormalized());
    }

    @Test
    public void testGetDefaultErrorReporter() {
        assertNotNull(compiler.getDefaultErrorReporter());
    }

    @Test
    public void testGetCodingConvention() {
        assertNotNull(compiler.getCodingConvention());
    }

    @Test
    public void testGetTypeRegistry() {
        assertNotNull(compiler.getTypeRegistry());
    }

    @Test
    public void testGetErrorsAndWarnings() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = ;");
        compiler.compile(extern, input, options);
        assertTrue(compiler.getErrors().length > 0);
        assertEquals(0, compiler.getWarnings().length);
    }

    @Test
    public void testDisableThreads() {
        compiler.disableThreads();
    }

    @Test
    public void testSetLoggingLevel() {
        Compiler.setLoggingLevel(Level.OFF);
    }

    // static inner class for stub ErrorManager
    private static class StubErrorManager implements ErrorManager {
        @Override
        public void report(CheckLevel level, JSError error) {}

        @Override
        public void generateReport() {}

        @Override
        public int getErrorCount() { return 0; }

        @Override
        public int getWarningCount() { return 0; }

        @Override
        public JSError[] getErrors() { return new JSError[0]; }

        @Override
        public JSError[] getWarnings() { return new JSError[0]; }
    }
}