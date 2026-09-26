package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class CompilerTest {

    private static class TestErrorManager implements ErrorManager {
        private List<JSError> errors = new ArrayList<>();
        private List<JSError> warnings = new ArrayList<>();

        @Override
        public void report(CheckLevel level, JSError error) {
            if (level == CheckLevel.ERROR) {
                errors.add(error);
            } else if (level == CheckLevel.WARNING) {
                warnings.add(error);
            }
        }

        @Override
        public JSError[] getErrors() {
            return errors.toArray(new JSError[0]);
        }

        @Override
        public JSError[] getWarnings() {
            return warnings.toArray(new JSError[0]);
        }

        @Override
        public int getErrorCount() {
            return errors.size();
        }

        @Override
        public int getWarningCount() {
            return warnings.size();
        }

        @Override
        public void generateReport() {
        }

        @Override
        public void setTypedPercent(double typedPercent) {
        }

        @Override
        public double getTypedPercent() {
            return 0.0;
        }
    }

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(compiler);
    }

    @Test
    public void testConstructorWithPrintStream() {
        Compiler c = new Compiler(System.out);
        assertNotNull(c);
    }

    @Test
    public void testConstructorWithErrorManager() {
        TestErrorManager em = new TestErrorManager();
        Compiler c = new Compiler(em);
        assertNotNull(c);
    }

    @Test(expected = NullPointerException.class)
    public void testSetErrorManagerNull() {
        compiler.setErrorManager(null);
    }

    @Test
    public void testInitOptionsNoErrorManagerWithOutStream() {
        Compiler c = new Compiler(System.out);
        CompilerOptions options = new CompilerOptions();
        c.initOptions(options);
        assertNotNull(c.getErrorManager());
    }

    @Test
    public void testInitOptionsNoErrorManagerNoOutStream() {
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        assertNotNull(compiler.getErrorManager());
    }

    @Test
    public void testInitSimple() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var a;");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var b = 1;");
        CompilerOptions options = new CompilerOptions();
        compiler.init(new JSSourceFile[]{extern}, new JSSourceFile[]{input}, options);
        assertNotNull(compiler.getRoot());
    }

    @Test
    public void testInitModulesEmpty() {
        TestErrorManager em = new TestErrorManager();
        compiler.setErrorManager(em);
        CompilerOptions options = new CompilerOptions();
        compiler.init(new JSSourceFile[0], new JSModule[0], options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testInitModuleFirstModuleEmptyInputs() {
        TestErrorManager em = new TestErrorManager();
        compiler.setErrorManager(em);
        JSModule module = new JSModule("root");
        CompilerOptions options = new CompilerOptions();
        compiler.init(new JSSourceFile[0], new JSModule[]{module}, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testInitInputsByNameMapDuplicateExtern() {
        TestErrorManager em = new TestErrorManager();
        compiler.setErrorManager(em);
        JSSourceFile extern = JSSourceFile.fromCode("dup.js", "var x;");
        CompilerOptions options = new CompilerOptions();
        compiler.init(new JSSourceFile[]{extern, extern}, new JSSourceFile[0], options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testInitInputsByNameMapDuplicateInput() {
        TestErrorManager em = new TestErrorManager();
        compiler.setErrorManager(em);
        JSSourceFile input = JSSourceFile.fromCode("dup.js", "var y;");
        CompilerOptions options = new CompilerOptions();
        compiler.init(new JSSourceFile[0], new JSSourceFile[]{input, input}, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testGetInput() {
        JSSourceFile input = JSSourceFile.fromCode("test.js", "var z = 0;");
        CompilerOptions options = new CompilerOptions();
        compiler.init(new JSSourceFile[0], new JSSourceFile[]{input}, options);
        assertNotNull(compiler.getInput("test.js"));
    }

    @Test
    public void testGetInputNonExistent() {
        assertNull(compiler.getInput("nonexistent.js"));
    }

    @Test
    public void testHasErrorsTrue() {
        TestErrorManager em = new TestErrorManager();
        compiler.setErrorManager(em);
        em.report(CheckLevel.ERROR, JSError.make("JSC_TEST_ERROR", "test error"));
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testHasErrorsFalse() {
        TestErrorManager em = new TestErrorManager();
        compiler.setErrorManager(em);
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testParseSyntheticCode() {
        Node node = compiler.parseSyntheticCode("test", "var a = 1;");
        assertNotNull(node);
        assertEquals(Token.SCRIPT, node.getType());
    }

    @Test
    public void testResetUniqueNameId() {
        compiler.resetUniqueNameId();
        assertNotNull(compiler.getUniqueNameIdSupplier());
        assertEquals("0", compiler.getUniqueNameIdSupplier().get());
        assertEquals("1", compiler.getUniqueNameIdSupplier().get());
    }

    @Test(expected = NullPointerException.class)
    public void testSetPassConfigNull() {
        compiler.setPassConfig(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testSetPassConfigAlreadyAssigned() {
        compiler.setPassConfig(new DefaultPassConfig(new CompilerOptions()));
        compiler.setPassConfig(new DefaultPassConfig(new CompilerOptions()));
    }

    @Test
    public void testGetSourceLineInvalidLineNumber() {
        assertNull(compiler.getSourceLine("any.js", 0));
        assertNull(compiler.getSourceLine("any.js", -1));
    }

    @Test
    public void testGetSourceRegionInvalidLineNumber() {
        assertNull(compiler.getSourceRegion("any.js", 0));
        assertNull(compiler.getSourceRegion("any.js", -1));
    }

    @Test
    public void testGetSourceLineExistingLine() {
        JSSourceFile input = JSSourceFile.fromCode("test.js", "line1\nline2\nline3");
        CompilerOptions options = new CompilerOptions();
        compiler.init(new JSSourceFile[0], new JSSourceFile[]{input}, options);
        String line = compiler.getSourceLine("test.js", 2);
        assertEquals("line2", line);
    }

    @Test
    public void testGetUniqueNameIdSupplier() {
        assertNotNull(compiler.getUniqueNameIdSupplier());
        assertEquals("0", compiler.getUniqueNameIdSupplier().get());
    }

    @Test
    public void testSetNormalized() {
        compiler.setNormalized();
        assertTrue(compiler.isNormalized());
    }

    @Test
    public void testSetUnnormalized() {
        compiler.setNormalized();
        compiler.setUnnormalized();
        assertFalse(compiler.isNormalized());
    }

    @Test
    public void testGetModuleGraph() {
        assertNull(compiler.getModuleGraph());
    }

    @Test
    public void testGetTypeRegistry() {
        assertNotNull(compiler.getTypeRegistry());
    }
}