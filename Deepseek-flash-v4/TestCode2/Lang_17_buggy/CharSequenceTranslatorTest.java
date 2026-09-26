package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

public class CharSequenceTranslatorTest {

    private static final CharSequenceTranslator SINGLE = new CharSequenceTranslator() {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            switch (input.charAt(index)) {
                case 'a':
                    out.write('1');
                    return 1;
                case 'b':
                    out.write('2');
                    return 1;
                case 'c':
                    out.write('3');
                    return 1;
                default:
                    return 0;
            }
        }
    };

    private static final CharSequenceTranslator COPY = new CharSequenceTranslator() {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            return 0;
        }
    };

    @Test
    public void testTranslateCharSequence() {
        assertEquals("123", SINGLE.translate("abc"));
        assertEquals("1", SINGLE.translate("a"));
        assertEquals("", SINGLE.translate(""));
    }

    @Test
    public void testTranslateNullInput() {
        assertNull(SINGLE.translate((CharSequence) null));

        StringWriter out = new StringWriter();
        SINGLE.translate(null, out);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslateNullWriter() {
        try {
            SINGLE.translate("abc", null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The Writer must not be null", e.getMessage());
        }
    }

    @Test
    public void testTranslateCopiesUnmatchedCodePointsWhenConsumedIsZero() {
        assertEquals("abc", COPY.translate("abc"));

        String emoji = new String(Character.toChars(0x1F600));
        assertEquals(emoji, COPY.translate(emoji));
    }

    @Test
    public void testTranslateConsumesMultipleCodePoints() {
        CharSequenceTranslator multi = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                if (input.charAt(index) == 'a' || input.charAt(index) == 'c') {
                    out.write('X');
                    return 2;
                }
                return 0;
            }
        };

        assertEquals("XX", multi.translate("abcd"));
    }

    @Test
    public void testWithTranslators() {
        CharSequenceTranslator noop = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                return 0;
            }
        };

        CharSequenceTranslator mapA = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                if (input.charAt(index) == 'a') {
                    out.write('X');
                    return 1;
                }
                return 0;
            }
        };

        CharSequenceTranslator combined = noop.with(mapA);
        assertNotNull(combined);
        assertEquals("X", combined.translate("a"));

        assertNotNull(noop.with());
    }

    @Test
    public void testTranslatePropagatesIOException() {
        Writer failing = new Writer() {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("boom");
            }

            @Override
            public void flush() {
            }

            @Override
            public void close() {
            }
        };

        try {
            COPY.translate("abc", failing);
            fail("Expected IOException");
        } catch (IOException expected) {
        }
    }

    @Test
    public void testTranslateWrapsIOExceptionInRuntimeException() {
        CharSequenceTranslator throwing = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                throw new IOException("boom");
            }
        };

        try {
            throwing.translate("a");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertTrue(e.getCause() instanceof IOException);
        }
    }

    @Test
    public void testHex() {
        assertEquals("0", CharSequenceTranslator.hex(0));
        assertEquals("A", CharSequenceTranslator.hex(10));
        assertEquals("10", CharSequenceTranslator.hex(16));
        assertEquals("FF", CharSequenceTranslator.hex(255));
        assertEquals("ABCDEF", CharSequenceTranslator.hex(0xABCDEF));
    }
}