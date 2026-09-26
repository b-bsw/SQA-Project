package com.google.debugging.sourcemap;

import static org.junit.Assert.*;

import com.google.debugging.sourcemap.proto.Mapping.OriginalMapping;
import java.util.Arrays;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SourceMapConsumerV3Test {

    private SourceMapConsumerV3 consumer;

    @Before
    public void setUp() {
        consumer = new SourceMapConsumerV3();
    }

    @After
    public void tearDown() {
        consumer = null;
    }

    private String mapString(String mappings, int lineCount, String[] sources, String[] names)
            throws Exception {
        JSONObject root = new JSONObject();
        root.put("version", 3);
        root.put("file", "out.js");
        root.put("lineCount", lineCount);
        root.put("mappings", mappings);
        root.put("sources", new JSONArray(Arrays.asList(sources)));
        root.put("names", new JSONArray(Arrays.asList(names)));
        return root.toString();
    }

    @Test
    public void testParseValidMinimalMap() throws Exception {
        consumer.parse(mapString("", 1, new String[] {"src.js"}, new String[] {}));
        assertEquals(Arrays.asList("src.js"), consumer.getOriginalSources());
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseNullStringThrows() throws Exception {
        consumer.parse(null);
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseEmptyStringThrows() throws Exception {
        consumer.parse("");
    }

    @Test
    public void testParseInvalidVersionThrows() throws Exception {
        JSONObject root = new JSONObject();
        root.put("version", 2);
        root.put("file", "out.js");

        try {
            consumer.parse(root.toString());
            fail("Expected SourceMapParseException for invalid version");
        } catch (SourceMapParseException e) {
            assertEquals("Unknown version: 2", e.getMessage());
        }
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseMissingFileThrows() throws Exception {
        JSONObject root = new JSONObject();
        root.put("version", 3);
        consumer.parse(root.toString());
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseSectionWithBothMapAndUrlThrows() throws Exception {
        JSONObject root = new JSONObject();
        root.put("version", 3);
        root.put("file", "out.js");

        JSONObject section = new JSONObject();
        section.put("map", "not-a-real-map");
        section.put("url", "http://example.com/map");

        JSONArray sections = new JSONArray();
        sections.put(section);
        root.put("sections", sections);

        consumer.parse(root.toString());
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseSectionWithNoMapOrUrlThrows() throws Exception {
        JSONObject root = new JSONObject();
        root.put("version", 3);
        root.put("file", "out.js");

        JSONObject section = new JSONObject();
        section.put("offset", new JSONObject().put("line", 0).put("column", 0));

        JSONArray sections = new JSONArray();
        sections.put(section);
        root.put("sections", sections);

        consumer.parse(root.toString());
    }

    @Test
    public void testGetMappingForLineReturnsNullForUnmappedLine() throws Exception {
        consumer.parse(mapString("", 1, new String[] {"src.js"}, new String[] {}));
        assertNull(consumer.getMappingForLine(1, 1));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetMappingForLineWithNegativeZeroLineThrows() throws Exception {
        consumer.parse(mapString("", 1, new String[] {"src.js"}, new String[] {}));
        consumer.getMappingForLine(0, 1);
    }

    @Test
    public void testGetMappingForLineReturnsValidMapping() throws Exception {
        consumer.parse(mapString("AAAA", 1, new String[] {"src.js"}, new String[] {}));
        OriginalMapping mapping = consumer.getMappingForLine(1, 1);

        assertNotNull(mapping);
        assertEquals("src.js", mapping.getOriginalFile());
        assertEquals(0, mapping.getLineNumber());
        assertEquals(0, mapping.getColumn());
    }

    @Test
    public void testGetMappingForLineBeforeFirstEntryReturnsNull() throws Exception {
        consumer.parse(mapString("FAAA", 1, new String[] {"src.js"}, new String[] {}));
        OriginalMapping mapping = consumer.getMappingForLine(1, 1);
        assertNull(mapping);
    }

    @Test
    public void testGetReverseMappingForKnownOriginalFile() throws Exception {
        consumer.parse(mapString("AAAA", 1, new String[] {"src.js"}, new String[] {}));
        Collection<OriginalMapping> mappings = consumer.getReverseMapping("src.js", 0, 0);

        assertNotNull(mappings);
        assertEquals(1, mappings.size());

        OriginalMapping mapping = mappings.iterator().next();
        assertEquals("src.js", mapping.getOriginalFile());
        assertEquals(0, mapping.getLineNumber());
        assertEquals(0, mapping.getColumn());
    }

    @Test
    public void testGetReverseMappingForUnknownFileReturnsEmptyCollection() throws Exception {
        consumer.parse(mapString("AAAA", 1, new String[] {"src.js"}, new String[] {}));
        Collection<OriginalMapping> mappings = consumer.getReverseMapping("nope.js", 0, 0);

        assertNotNull(mappings);
        assertTrue(mappings.isEmpty());
    }
}