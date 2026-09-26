package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.debugging.sourcemap.FilePosition;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SourceMapTest {
  private SourceMap sourceMap;

  @Before
  public void setUp() throws Exception {
    sourceMap = SourceMap.Format.V1.getInstance();
  }

  @After
  public void tearDown() {
    sourceMap = null;
  }

  private Node createNode(String source, int line, int charno) {
    Node n = new Node(Token.NAME);
    if (source != null) {
      n.setSourceFile(source);
    }
    n.setLineno(line);
    n.setCharno(charno);
    return n;
  }

  @SuppressWarnings("unchecked")
  private Map<String, String> getFixupCache() throws Exception {
    Field field = SourceMap.class.getDeclaredField("sourceLocationFixupCache");
    field.setAccessible(true);
    return (Map<String, String>) field.get(sourceMap);
  }

  @Test
  public void testFormatGetInstance() {
    assertNotNull(SourceMap.Format.V1.getInstance());
    assertNotNull(SourceMap.Format.DEFAULT.getInstance());
    assertNotNull(SourceMap.Format.V2.getInstance());
    assertNotNull(SourceMap.Format.V3.getInstance());
  }

  @Test
  public void testDetailLevelAll() {
    assertTrue(SourceMap.DetailLevel.ALL.apply(null));
    assertTrue(SourceMap.DetailLevel.ALL.apply(new Node(Token.NAME)));
  }

  @Test
  public void testDetailLevelSymbols() {
    SourceMap.DetailLevel level = SourceMap.DetailLevel.SYMBOLS;
    assertTrue(level.apply(new Node(Token.CALL)));
    assertTrue(level.apply(new Node(Token.NEW)));
    assertTrue(level.apply(new Node(Token.FUNCTION)));
    assertTrue(level.apply(new Node(Token.NAME)));
    assertTrue(level.apply(new Node(Token.GETPROP)));
    assertTrue(level.apply(new Node(Token.GETELEM)));
    assertFalse(level.apply(new Node(Token.NUMBER)));
  }

  @Test
  public void testDetailLevelSymbolsStringProperty() {
    Node parent = new Node(Token.GETPROP);
    Node str = new Node(Token.STRING);
    parent.addChildToBack(str);
    assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(str));
  }

  @Test
  public void testLocationMapping() {
    SourceMap.LocationMapping mapping = new SourceMap.LocationMapping("foo", "bar");
    assertEquals("foo", mapping.prefix);
    assertEquals("bar", mapping.replacement);
  }

  @Test
  public void testAddMappingWithEmptyPrefixMappingsDoesNotCache() throws Exception {
    Node n = createNode("test.js", 1, 0);
    sourceMap.addMapping(n, new FilePosition(0, 0), new FilePosition(1, 1));
    assertEquals(0, getFixupCache().size());
  }

  @Test
  public void testAddMappingNullSourceDoesNotCache() throws Exception {
    Node n = createNode(null, 1, 0);
    sourceMap.addMapping(n, new FilePosition(0, 0), new FilePosition(1, 1));
    assertEquals(0, getFixupCache().size());
  }

  @Test
  public void testAddMappingNegativeLineDoesNotCache() throws Exception {
    Node n = createNode("test.js", -1, 0);
    sourceMap.addMapping(n, new FilePosition(0, 0), new FilePosition(1, 1));
    assertEquals(0, getFixupCache().size());
  }

  @Test
  public void testAddMappingRemapsSourceFileAndCaches() throws Exception {
    List<SourceMap.LocationMapping> mappings = new ArrayList<SourceMap.LocationMapping>();
    mappings.add(new SourceMap.LocationMapping("foo", "bar"));
    sourceMap.setPrefixMappings(mappings);

    Node n = createNode("foo.js", 1, 0);
    sourceMap.addMapping(n, new FilePosition(0, 0), new FilePosition(1, 1));

    Map<String, String> cache = getFixupCache();
    assertEquals(1, cache.size());
    assertEquals("bar.js", cache.get("foo.js"));
  }

  @Test
  public void testAddMappingWhenNoPrefixMatchUsesOriginalAndCaches() throws Exception {
    List<SourceMap.LocationMapping> mappings = new ArrayList<SourceMap.LocationMapping>();
    mappings.add(new SourceMap.LocationMapping("x", "y"));
    sourceMap.setPrefixMappings(mappings);

    Node n = createNode("foo.js", 1, 0);
    sourceMap.addMapping(n, new FilePosition(0, 0), new FilePosition(1, 1));

    Map<String, String> cache = getFixupCache();
    assertEquals(1, cache.size());
    assertEquals("foo.js", cache.get("foo.js"));
  }

  @Test
  public void testAddMappingUsesFirstPrefixMatch() throws Exception {
    List<SourceMap.LocationMapping> mappings = new ArrayList<SourceMap.LocationMapping>();
    mappings.add(new SourceMap.LocationMapping("foo", "bar"));
    mappings.add(new SourceMap.LocationMapping("foobar", "baz"));
    sourceMap.setPrefixMappings(mappings);

    Node n = createNode("foobar.js", 1, 0);
    sourceMap.addMapping(n, new FilePosition(0, 0), new FilePosition(1, 1));

    assertEquals("barbar.js", getFixupCache().get("foobar.js"));
  }

  @Test
  public void testAddMappingCacheHitReturnsCachedValue() throws Exception {
    List<SourceMap.LocationMapping> mappings = new ArrayList<SourceMap.LocationMapping>();
    mappings.add(new SourceMap.LocationMapping("foo", "bar"));
    sourceMap.setPrefixMappings(mappings);

    Node n1 = createNode("foo.js", 1, 0);
    sourceMap.addMapping(n1, new FilePosition(0, 0), new FilePosition(1, 1));

    List<SourceMap.LocationMapping> mappings2 = new ArrayList<SourceMap.LocationMapping>();
    mappings2.add(new SourceMap.LocationMapping("foo", "baz"));
    sourceMap.setPrefixMappings(mappings2);

    Map<String, String> cache = getFixupCache();
    assertEquals("bar.js", cache.get("foo.js"));

    Node n2 = createNode("foo.js", 2, 0);
    sourceMap.addMapping(n2, new FilePosition(0, 0), new FilePosition(1, 1));
    assertEquals("bar.js", cache.get("foo.js"));
    assertEquals(1, cache.size());
  }

  @Test
  public void testResetClearsFixupCache() throws Exception {
    List<SourceMap.LocationMapping> mappings = new ArrayList<SourceMap.LocationMapping>();
    mappings.add(new SourceMap.LocationMapping("foo", "bar"));
    sourceMap.setPrefixMappings(mappings);

    Node n = createNode("foo.js", 1, 0);
    sourceMap.addMapping(n, new FilePosition(0, 0), new FilePosition(1, 1));
    assertEquals(1, getFixupCache().size());

    sourceMap.reset();
    assertEquals(0, getFixupCache().size());
  }

  @Test
  public void testDelegateMethods() throws Exception {
    sourceMap.setStartingPosition(1, 0);
    sourceMap.setWrapperPrefix("(");
    sourceMap.validate(true);
    sourceMap.appendTo(new StringBuilder(), "out.js");
    sourceMap.setPrefixMappings(Collections.<SourceMap.LocationMapping>emptyList());
    sourceMap.reset();
  }
}