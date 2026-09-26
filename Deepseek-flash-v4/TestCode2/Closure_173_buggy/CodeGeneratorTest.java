package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.charset.CharsetEncoder;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for CodeGenerator private methods.
 * Uses reflection to exercise private constructor and strEscape().
 */
public class CodeGeneratorTest {

    private CodeGenerator generator;

    @Before
    public void setUp() throws Exception {
        Constructor<CodeGenerator> ctor =
                CodeGenerator.class.getDeclaredConstructor(CodeConsumer.class);
        ctor.setAccessible(true);
        generator = ctor.newInstance(new Object[]{null});
    }

    private String strEscape(
            String s,
            char quote,
            String doublequoteEscape,
            String singlequoteEscape,
            String backslashEscape,
            CharsetEncoder encoder,
            boolean regexp,
            boolean isRegexp) throws Exception {

        Method m = CodeGenerator.class.getDeclaredMethod(
                "strEscape",
                String.class,
                char.class,
                String.class,
                String.class,
                String.class,
                CharsetEncoder.class,
                boolean.class,
                boolean.class);
        m.setAccessible(true);

        return (String) m.invoke(generator, new Object[]{
                s,
                quote,
                doublequoteEscape,
                singlequoteEscape,
                backslashEscape,
                encoder,
                regexp,
                isRegexp
        });
    }

    @Test
    public void testEscapesDoubleQuote() throws Exception {
        String result = strEscape(
                "a\"b",
                '"',
                "\\\"",
                "'",
                "\\\\",
                null,
                false,
                false);

        assertEquals("\"a\\\"b\"", result);
    }

    @Test
    public void testEscapesBackslash() throws Exception {
        String result = strEscape(
                "a\\b",
                '"',
                "\\\"",
                "'",
                "\\\\",
                null,
                false,
                false);

        assertEquals("\"a\\\\b\"", result);
    }

    @Test
    public void testEscapesNewline() throws Exception {
        String result = strEscape(
                "a\nb",
                '"',
                "\\\"",
                "'",
                "\\\\",
                null,
                false,
                false);

        assertEquals("\"a\\nb\"", result);
    }

    @Test
    public void testEscapesTab() throws Exception {
        String result = strEscape(
                "a\tb",
                '"',
                "\\\"",
                "'",
                "\\\\",
                null,
                false,
                false);

        assertEquals("\"a\\tb\"", result);
    }

    @Test
    public void testEscapesNullCharacter() throws Exception {
        String result = strEscape(
                "a\u0000b",
                '"',
                "\\\"",
                "'",
                "\\\\",
                null,
                false,
                false);

        assertEquals("\"a\\x00b\"", result);
    }

    @Test
    public void testEscapesUnicodeLineSeparator() throws Exception {
        String result = strEscape(
                "a\u2028b",
                '"',
                "\\\"",
                "'",
                "\\\\",
                null,
                false,
                false);

        assertEquals("\"a\\u2028b\"", result);
    }

    @Test
    public void testKeepsSingleQuoteInDoubleQuotedString() throws Exception {
        String result = strEscape(
                "a'b",
                '"',
                "\\\"",
                "'",
                "\\\\",
                null,
                false,
                false);

        assertEquals("\"a'b\"", result);
    }
}