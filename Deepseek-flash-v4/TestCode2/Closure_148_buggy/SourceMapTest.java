package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.io.IOException;
import java.io.StringWriter;

public class SourceMapTest {

    private SourceMap sourceMap;

    @Before
    public void setUp() {
        sourceMap = new SourceMap();
    }

    private Node createNode(String sourceFile, int lineno, int charno, String originalName) {
        Node node = new Node(Token.SCRIPT);
        if (sourceFile != null) {
            node.putProp(Node.SOURCEFILE_PROP, sourceFile);
        }
        node.setLineno(lineno);
        node.setCharno(charno);
        if (originalName != null) {
            node.putProp(Node.ORIGINALNAME_PROP, originalName);
        }
        return node;
    }

    @Test(expected = IllegalStateException.class)
    public void testAddMappingNullSourceFile() throws IOException {
        Node node = createNode(null, 1, 0, null);
        sourceMap.addMapping(node, new Position(0, 0), new Position(0, 10));
        sourceMap.appendTo(new StringWriter(), "test.js");
    }

    @Test(expected = IllegalStateException.class)
    public void testAddMappingNegativeLineno() throws IOException {
        Node node = createNode("file.js", -1, 0, null);
        sourceMap.addMapping(node, new Position(0, 0), new Position(0, 10));
        sourceMap.appendTo(new StringWriter(), "test.js");
    }

    @Test
    public void testAddMappingNormal() throws IOException {
        Node node = createNode("file.js", 1, 5, null);
        sourceMap.addMapping(node, new Position(0, 0), new Position(0, 10));
        StringWriter writer = new StringWriter();
        sourceMap.appendTo(writer, "test.js");
        String result = writer.toString();
        assertTrue(result.contains("\"file.js\""));
        assertTrue(result.contains("1,5"));
    }

    @Test
    public void testAddMappingWithOriginalName() throws IOException {
        Node node = createNode("file.js", 2, 3, "myFunc");
        sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));
        StringWriter writer = new StringWriter();
        sourceMap.appendTo(writer, "test.js");
        String result = writer.toString();
        assertTrue(result.contains("\"file.js\""));
        assertTrue(result.contains("2,3"));
        assertTrue(result.contains("\"myFunc\""));
    }

    @Test
    public void testAddMappingOffsetStartingPosition() throws IOException {
        sourceMap.setStartingPosition(2, 1);
        Node node = createNode("file.js", 1, 0, null);
        sourceMap.addMapping(node, new Position(0, 5), new Position(0, 15));
        StringWriter writer = new StringWriter();
        sourceMap.appendTo(writer, "test.js");
        String result = writer.toString();
        assertTrue(result.contains("\"file.js\""));
    }

    @Test
    public void testSetWrapperPrefixAndAdjustOutput() throws IOException {
        sourceMap.setWrapperPrefix("abc\ndef\n");
        Node node = createNode("file.js", 1, 0, null);
        sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));
        StringWriter writer = new StringWriter();
        sourceMap.appendTo(writer, "test.js");
        String result = writer.toString();
        assertTrue(result.contains("[]")); // file information section lines
        assertTrue(result.contains("\"file.js\""));
    }

    @Test(expected = IllegalStateException.class)
    public void testResetClearsMappings() throws IOException {
        Node node = createNode("file.js", 1, 0, null);
        sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));
        sourceMap.reset();
        sourceMap.appendTo(new StringWriter(), "test.js");
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendToThrowsWhenNoMappings() throws IOException {
        sourceMap.appendTo(new StringWriter(), "test.js");
    }

    @Test
    public void testMappingAppendTo() throws IOException {
        SourceMap.Mapping mapping = new SourceMap.Mapping();
        mapping.id = 0;
        mapping.sourceFile = "file.js";
        mapping.originalPosition = new Position(1, 2);
        mapping.startPosition = new Position(0, 0);
        mapping.endPosition = new Position(0, 5);
        mapping.originalName = "func";
        StringBuilder sb = new StringBuilder();
        mapping.appendTo(sb);
        String result = sb.toString();
        assertTrue(result.startsWith("["));
        assertTrue(result.contains("file.js"));
        assertTrue(result.contains("1,2"));
        assertTrue(result.contains("func"));
        assertTrue(result.endsWith("]"));
    }

    @Test
    public void testMultipleNonOverlappingMappings() throws IOException {
        Node node1 = createNode("a.js", 1, 0, null);
        Node node2 = createNode("b.js", 2, 5, "bar");
        sourceMap.addMapping(node1, new Position(0, 0), new Position(2, 10));
        sourceMap.addMapping(node2, new Position(3, 0), new Position(5, 5));
        StringWriter writer = new StringWriter();
        sourceMap.appendTo(writer, "test.js");
        String result = writer.toString();
        assertTrue(result.contains("\"a.js\""));
        assertTrue(result.contains("\"b.js\""));
        assertTrue(result.contains("\"bar\""));
    }

    @Test
    public void testOverlappingMappings() throws IOException {
        Node nodeOuter = createNode("outer.js", 1, 0, null);
        Node nodeInner = createNode("inner.js", 2, 0, null);
        sourceMap.addMapping(nodeOuter, new Position(0, 0), new Position(10, 0));
        sourceMap.addMapping(nodeInner, new Position(3, 0), new Position(7, 0));
        StringWriter writer = new StringWriter();
        sourceMap.appendTo(writer, "test.js");
        String result = writer.toString();
        assertTrue(result.contains("\"outer.js\""));
        assertTrue(result.contains("\"inner.js\""));
    }
}