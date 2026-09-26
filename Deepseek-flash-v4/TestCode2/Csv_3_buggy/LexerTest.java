package org.apache.commons.csv;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.StringReader;

public class LexerTest {

    private CSVFormat defaultFormat;

    private static class StubBufferedReader extends ExtendedBufferedReader {
        private String input;
        private int pos;
        private int lastChar;
        private long lineNumber = 1;

        public StubBufferedReader(String input) {
            super(new StringReader(""));
            this.input = input;
            this.pos = 0;
        }

        @Override
        public int read() {
            if (pos >= input.length()) {
                return Constants.END_OF_STREAM;
            }
            int c = input.charAt(pos++);
            if (c == '\n') {
                lineNumber++;
            }
            lastChar = c;
            return c;
        }

        @Override
        public int lookAhead() {
            if (pos >= input.length()) {
                return Constants.END_OF_STREAM;
            }
            return input.charAt(pos);
        }

        @Override
        public int getLastChar() {
            return lastChar;
        }

        @Override
        public long getLineNumber() {
            return lineNumber;
        }
    }

    private static class TestLexer extends Lexer {
        public TestLexer(CSVFormat format, ExtendedBufferedReader in) {
            super(format, in);
        }

        @Override
        Token nextToken(Token reusableToken) throws IOException {
            return null;
        }
    }

    private TestLexer createLexer(String input) {
        StubBufferedReader reader = new StubBufferedReader(input);
        return new TestLexer(defaultFormat, reader);
    }

    @Before
    public void setUp() {
        defaultFormat = CSVFormat.DEFAULT
                .withEscape('\\')
                .withQuoteChar('"')
                .withCommentStart('#');
    }

    // readEscape tests
    @Test
    public void testReadEscapeReturnsCR() throws IOException {
        TestLexer lexer = createLexer("r");
        assertEquals(Constants.CR, lexer.readEscape());
    }

    @Test
    public void testReadEscapeReturnsLF() throws IOException {
        TestLexer lexer = createLexer("n");
        assertEquals(Constants.LF, lexer.readEscape());
    }

    @Test
    public void testReadEscapeReturnsTAB() throws IOException {
        TestLexer lexer = createLexer("t");
        assertEquals(Constants.TAB, lexer.readEscape());
    }

    @Test
    public void testReadEscapeReturnsBACKSPACE() throws IOException {
        TestLexer lexer = createLexer("b");
        assertEquals(Constants.BACKSPACE, lexer.readEscape());
    }

    @Test
    public void testReadEscapeReturnsFF() throws IOException {
        TestLexer lexer = createLexer("f");
        assertEquals(Constants.FF, lexer.readEscape());
    }

    @Test
    public void testReadEscapeReturnsCRChar() throws IOException {
        TestLexer lexer = createLexer("\r");
        assertEquals(Constants.CR, lexer.readEscape());
    }

    @Test
    public void testReadEscapeReturnsLFChar() throws IOException {
        TestLexer lexer = createLexer("\n");
        assertEquals(Constants.LF, lexer.readEscape());
    }

    @Test
    public void testReadEscapeReturnsFFChar() throws IOException {
        TestLexer lexer = createLexer("\f");
        assertEquals(Constants.FF, lexer.readEscape());
    }

    @Test
    public void testReadEscapeReturnsTABChar() throws IOException {
        TestLexer lexer = createLexer("\t");
        assertEquals(Constants.TAB, lexer.readEscape());
    }

    @Test
    public void testReadEscapeReturnsBACKSPACEChar() throws IOException {
        TestLexer lexer = createLexer("\b");
        assertEquals(Constants.BACKSPACE, lexer.readEscape());
    }

    @Test
    public void testReadEscapeReturnsDefault() throws IOException {
        TestLexer lexer = createLexer("x");
        assertEquals('x', lexer.readEscape());
    }

    @Test(expected = IOException.class)
    public void testReadEscapeThrowsIOExceptionOnEOF() throws IOException {
        TestLexer lexer = createLexer("");
        lexer.readEscape();
    }

    // trimTrailingSpaces tests
    @Test
    public void testTrimTrailingSpacesNoTrailing() {
        TestLexer lexer = createLexer("");
        StringBuilder buf = new StringBuilder("abc");
        lexer.trimTrailingSpaces(buf);
        assertEquals("abc", buf.toString());
    }

    @Test
    public void testTrimTrailingSpacesWithTrailing() {
        TestLexer lexer = createLexer("");
        StringBuilder buf = new StringBuilder("abc   ");
        lexer.trimTrailingSpaces(buf);
        assertEquals("abc", buf.toString());
    }

    @Test
    public void testTrimTrailingSpacesAllSpaces() {
        TestLexer lexer = createLexer("");
        StringBuilder buf = new StringBuilder("   ");
        lexer.trimTrailingSpaces(buf);
        assertEquals("", buf.toString());
    }

    @Test
    public void testTrimTrailingSpacesEmptyBuffer() {
        TestLexer lexer = createLexer("");
        StringBuilder buf = new StringBuilder("");
        lexer.trimTrailingSpaces(buf);
        assertEquals("", buf.toString());
    }

    @Test
    public void testTrimTrailingSpacesSingleCharNonSpace() {
        TestLexer lexer = createLexer("");
        StringBuilder buf = new StringBuilder("a");
        lexer.trimTrailingSpaces(buf);
        assertEquals("a", buf.toString());
    }

    // readEndOfLine tests
    @Test
    public void testReadEndOfLineCRLF() throws IOException {
        TestLexer lexer = createLexer("\r\n");
        assertTrue(lexer.readEndOfLine(Constants.CR));
    }

    @Test
    public void testReadEndOfLineCR() throws IOException {
        TestLexer lexer = createLexer("\r");
        assertTrue(lexer.readEndOfLine(Constants.CR));
    }

    @Test
    public void testReadEndOfLineLF() throws IOException {
        TestLexer lexer = createLexer("\n");
        assertTrue(lexer.readEndOfLine(Constants.LF));
    }

    @Test
    public void testReadEndOfLineOther() throws IOException {
        TestLexer lexer = createLexer("a");
        assertFalse(lexer.readEndOfLine('a'));
    }

    // isWhitespace tests
    @Test
    public void testIsWhitespaceDelimiter() {
        TestLexer lexer = createLexer("");
        assertFalse(lexer.isWhitespace(','));
    }

    @Test
    public void testIsWhitespaceSpace() {
        TestLexer lexer = createLexer("");
        assertTrue(lexer.isWhitespace(' '));
    }

    @Test
    public void testIsWhitespaceOther() {
        TestLexer lexer = createLexer("");
        assertFalse(lexer.isWhitespace('a'));
    }

    @Test
    public void testIsWhitespaceTab() {
        TestLexer lexer = createLexer("");
        assertTrue(lexer.isWhitespace('\t'));
    }

    // isStartOfLine tests
    @Test
    public void testIsStartOfLineLF() {
        TestLexer lexer = createLexer("");
        assertTrue(lexer.isStartOfLine('\n'));
    }

    @Test
    public void testIsStartOfLineCR() {
        TestLexer lexer = createLexer("");
        assertTrue(lexer.isStartOfLine('\r'));
    }

    @Test
    public void testIsStartOfLineUndefined() {
        TestLexer lexer = createLexer("");
        assertTrue(lexer.isStartOfLine(Constants.UNDEFINED));
    }

    @Test
    public void testIsStartOfLineOther() {
        TestLexer lexer = createLexer("");
        assertFalse(lexer.isStartOfLine('a'));
    }

    // isEndOfFile tests
    @Test
    public void testIsEndOfFileTrue() {
        TestLexer lexer = createLexer("");
        assertTrue(lexer.isEndOfFile(Constants.END_OF_STREAM));
    }

    @Test
    public void testIsEndOfFileFalse() {
        TestLexer lexer = createLexer("");
        assertFalse(lexer.isEndOfFile('a'));
    }

    // isDelimiter tests
    @Test
    public void testIsDelimiterTrue() {
        TestLexer lexer = createLexer("");
        assertTrue(lexer.isDelimiter(','));
    }

    @Test
    public void testIsDelimiterFalse() {
        TestLexer lexer = createLexer("");
        assertFalse(lexer.isDelimiter(';'));
    }

    // isEscape tests
    @Test
    public void testIsEscapeTrue() {
        TestLexer lexer = createLexer("");
        assertTrue(lexer.isEscape('\\'));
    }

    @Test
    public void testIsEscapeFalse() {
        TestLexer lexer = createLexer("");
        assertFalse(lexer.isEscape('x'));
    }

    // isQuoteChar tests
    @Test
    public void testIsQuoteCharTrue() {
        TestLexer lexer = createLexer("");
        assertTrue(lexer.isQuoteChar('"'));
    }

    @Test
    public void testIsQuoteCharFalse() {
        TestLexer lexer = createLexer("");
        assertFalse(lexer.isQuoteChar('\''));
    }

    // isCommentStart tests
    @Test
    public void testIsCommentStartTrue() {
        TestLexer lexer = createLexer("");
        assertTrue(lexer.isCommentStart('#'));
    }

    @Test
    public void testIsCommentStartFalse() {
        TestLexer lexer = createLexer("");
        assertFalse(lexer.isCommentStart('!'));
    }

    // getLineNumber tests
    @Test
    public void testGetLineNumberInitial() {
        TestLexer lexer = createLexer("");
        assertEquals(1, lexer.getLineNumber());
    }

    @Test
    public void testGetLineNumberAfterNewline() throws IOException {
        TestLexer lexer = createLexer("\n");
        lexer.in.read();
        assertEquals(2, lexer.getLineNumber());
    }

    // field access tests
    @Test
    public void testIgnoreSurroundingSpacesDefault() {
        TestLexer lexer = createLexer("");
        assertFalse(lexer.ignoreSurroundingSpaces);
    }

    @Test
    public void testIgnoreEmptyLinesDefault() {
        TestLexer lexer = createLexer("");
        assertFalse(lexer.ignoreEmptyLines);
    }
}