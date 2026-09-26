package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

public class ProcessCommonJSModulesTest {

    private Compiler compiler;
    private ProcessCommonJSModules pass;

    @Before
    public void setUp() {
        compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
    }

    @Test
    public void testDefaultFilenamePrefix() {
        pass = new ProcessCommonJSModules(compiler, "");
        assertEquals("./", pass.filenamePrefix);
    }

    @Test
    public void testFilenamePrefixWithSlash() {
        pass = new ProcessCommonJSModules(compiler, "src/");
        assertEquals("src/", pass.filenamePrefix);
    }

    @Test
    public void testFilenamePrefixWithoutSlash() {
        pass = new ProcessCommonJSModules(compiler, "src");
        assertEquals("src/", pass.filenamePrefix);
    }

    @Test
    public void testToModuleNameSimple() {
        assertEquals("module$foo", ProcessCommonJSModules.toModuleName("foo.js"));
    }

    @Test
    public void testToModuleNameWithPath() {
        assertEquals("module$bar$foo", ProcessCommonJSModules.toModuleName("bar/foo.js"));
    }

    @Test
    public void testToModuleNameWithDotSlash() {
        assertEquals("module$foo", ProcessCommonJSModules.toModuleName("./foo.js"));
    }

    @Test
    public void testToModuleNameWithDots() {
        assertEquals("module$foo$bar", ProcessCommonJSModules.toModuleName("./foo/bar.js"));
    }

    @Test
    public void testToModuleNameWithHyphen() {
        assertEquals("module$my_module", ProcessCommonJSModules.toModuleName("my-module.js"));
    }

    @Test
    public void testToModuleNameNoJsSuffix() {
        assertEquals("module$foo", ProcessCommonJSModules.toModuleName("./foo"));
    }

    @Test
    public void testToModuleNameWithRelativeCurrent() {
        assertEquals("module$bar$foo", ProcessCommonJSModules.toModuleName("./foo", "bar/baz.js"));
    }

    @Test
    public void testToModuleNameWithRelativeParent() {
        assertEquals("module$bar$foo", ProcessCommonJSModules.toModuleName("../foo", "bar/baz.js"));
    }

    @Test
    public void testToModuleNameWithRelativeSameDir() {
        assertEquals("module$bar$foo", ProcessCommonJSModules.toModuleName("./foo", "bar/baz.js"));
    }

    @Test
    public void testToModuleNameRelativeFromRoot() {
        assertEquals("module$dir$foo", ProcessCommonJSModules.toModuleName("dir/foo.js", "bar/baz.js"));
    }

    @Test
    public void testGuessCJSModuleNameRemovesPrefix() {
        pass = new ProcessCommonJSModules(compiler, "src/");
        assertEquals("module$foo", pass.guessCJSModuleName("src/foo.js"));
    }

    @Test
    public void testGuessCJSModuleNameNoPrefix() {
        pass = new ProcessCommonJSModules(compiler, "src/");
        assertEquals("module$foo", pass.guessCJSModuleName("foo.js"));
    }

    @Test
    public void testProcessNoDependencies() {
        pass = new ProcessCommonJSModules(compiler, "", false);
        Node root = parseScript("var x = require('foo'); x;");
        pass.process(null, root);
        assertNull(pass.getModule());
    }

    @Test
    public void testProcessWithDependencies() {
        pass = new ProcessCommonJSModules(compiler, "", true);
        Node root = parseScript("var x = require('foo'); x;");
        pass.process(null, root);
        assertNull(pass.getModule());
    }

    @Test
    public void testProcessMultipleScripts() {
        pass = new ProcessCommonJSModules(compiler, "", true);
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(parseScript("a;"));
        root.addChildToBack(parseScript("b;"));
        try {
            pass.process(null, root);
            fail("Expected exception for multiple scripts");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("one invocation"));
        }
    }

    @Test
    public void testToModuleNameNullFilename() {
        try {
            ProcessCommonJSModules.toModuleName(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void testToModuleNameEmptyFilename() {
        assertEquals("module$", ProcessCommonJSModules.toModuleName(""));
    }

    @Test
    public void testToModuleNameJustJs() {
        assertEquals("module$", ProcessCommonJSModules.toModuleName(".js"));
    }

    @Test
    public void testToModuleNameWithManySlashes() {
        assertEquals("module$a$b$c$d", ProcessCommonJSModules.toModuleName("a/b/c/d.js"));
    }

    @Test
    public void testNormalizeSourceNameWithPrefix() {
        pass = new ProcessCommonJSModules(compiler, "base/");
        assertEquals("foo.js", pass.normalizeSourceName("base/foo.js"));
    }

    @Test
    public void testNormalizeSourceNameWithoutPrefix() {
        pass = new ProcessCommonJSModules(compiler, "base/");
        assertEquals("foo.js", pass.normalizeSourceName("foo.js"));
    }

    private Node parseScript(String code) {
        return compiler.parseSyntheticCode("test.js", code);
    }

}