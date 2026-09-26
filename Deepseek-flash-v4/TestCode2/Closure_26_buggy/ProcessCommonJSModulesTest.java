package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.File;

import org.junit.Test;

public class ProcessCommonJSModulesTest {

    @Test
    public void testToModuleNameStripsLeadingDotSlashAndReplacesSeparators() {
        String filename = "." + File.separator + "foo" + File.separator + "bar.js";
        assertEquals("module$foo$bar", ProcessCommonJSModules.toModuleName(filename));
    }

    @Test
    public void testToModuleNameReplacesHyphenWithUnderscore() {
        String filename = "." + File.separator + "my-mod.js";
        assertEquals("module$my_mod", ProcessCommonJSModules.toModuleName(filename));
    }

    @Test
    public void testToModuleNameWithoutLeadingDot() {
        assertEquals("module$foo", ProcessCommonJSModules.toModuleName("foo.js"));
    }

    @Test
    public void testToModuleNameEmptyString() {
        assertEquals("module$", ProcessCommonJSModules.toModuleName(""));
    }

    @Test
    public void testToModuleNameNullThrowsNullPointerException() {
        try {
            ProcessCommonJSModules.toModuleName((String) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testToModuleNameWithDotDotRelativePath() {
        String required = ".." + File.separator + "d.js";
        String current = "a" + File.separator + "b" + File.separator + "c.js";
        assertEquals("module$a$d", ProcessCommonJSModules.toModuleName(required, current));
    }

    @Test
    public void testToModuleNameWithDotRelativePath() {
        String required = "." + File.separator + "c.js";
        String current = "a" + File.separator + "b.js";
        assertEquals("module$a$c", ProcessCommonJSModules.toModuleName(required, current));
    }

    @Test
    public void testToModuleNameWithoutRelativePrefixIgnoresCurrentFilename() {
        assertEquals("module$foo", ProcessCommonJSModules.toModuleName("foo.js", "a" + File.separator + "b.js"));
    }

    @Test
    public void testToModuleNameWithInvalidUriThrowsRuntimeException() {
        String required = ". " + File.separator + "bad space.js";
        String current = "a" + File.separator + "b.js";
        try {
            ProcessCommonJSModules.toModuleName(required, current);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testGuessCJSModuleNameStripsConfiguredPrefix() {
        ProcessCommonJSModules processor = new ProcessCommonJSModules(null, ".");
        String filename = "." + File.separator + "foo" + File.separator + "bar.js";
        assertEquals("module$foo$bar", processor.guessCJSModuleName(filename));
    }

    @Test
    public void testGuessCJSModuleNameWithoutPrefix() {
        ProcessCommonJSModules processor = new ProcessCommonJSModules(null, ".");
        assertEquals("module$foo", processor.guessCJSModuleName("foo.js"));
    }

    @Test
    public void testGetModuleInitiallyNull() {
        ProcessCommonJSModules processor = new ProcessCommonJSModules(null, ".");
        assertNull(processor.getModule());
    }
}