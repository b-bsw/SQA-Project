package org.apache.commons.collections;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.*;

public class ExtendedPropertiesTest {

    private ExtendedProperties props;

    @Before
    public void setUp() {
        props = new ExtendedProperties();
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(props);
        assertFalse(props.isInitialized());
    }

    @Test
    public void testAddPropertyStringValue() {
        props.addProperty("key1", "value1");
        assertEquals("value1", props.getProperty("key1"));
        assertTrue(props.isInitialized());
    }

    @Test
    public void testAddPropertyWithCommaDelimiter() {
        props.addProperty("key", "val1,val2,val3");
        Object val = props.getProperty("key");
        assertTrue(val instanceof List);
        List list = (List) val;
        assertEquals(3, list.size());
        assertEquals("val1", list.get(0));
        assertEquals("val2", list.get(1));
        assertEquals("val3", list.get(2));
    }

    @Test
    public void testAddPropertyMultipleCallsSameKey() {
        props.addProperty("key", "first");
        props.addProperty("key", "second");
        Object val = props.getProperty("key");
        assertTrue(val instanceof List);
        assertEquals(2, ((List) val).size());
    }

    @Test
    public void testAddPropertyNonStringValue() {
        Integer intVal = Integer.valueOf(42);
        props.addProperty("num", intVal);
        assertEquals(intVal, props.getProperty("num"));
    }

    @Test
    public void testSetPropertyOverwrites() {
        props.addProperty("key", "old");
        props.setProperty("key", "new");
        assertEquals("new", props.getProperty("key"));
    }

    @Test
    public void testGetPropertyWithDefault() {
        assertNull(props.getProperty("nonexistent"));
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("defkey", "defval");
        props.defaults = defaults;
        assertEquals("defval", props.getProperty("defkey"));
    }

    @Test
    public void testClearProperty() {
        props.addProperty("key", "value");
        assertNotNull(props.getProperty("key"));
        props.clearProperty("key");
        assertNull(props.getProperty("key"));
    }

    @Test
    public void testGetKeysEmpty() {
        assertFalse(props.getKeys().hasNext());
    }

    @Test
    public void testGetKeysWithMultiple() {
        props.addProperty("a", "1");
        props.addProperty("b", "2");
        props.addProperty("c", "3");
        Iterator it = props.getKeys();
        List<String> keys = new ArrayList<String>();
        while (it.hasNext()) {
            keys.add((String) it.next());
        }
        assertEquals(Arrays.asList("a", "b", "c"), keys);
    }

    @Test
    public void testGetKeysWithPrefix() {
        props.addProperty("prefix.key1", "v1");
        props.addProperty("prefix.key2", "v2");
        props.addProperty("other", "v3");
        Iterator it = props.getKeys("prefix");
        List<String> keys = new ArrayList<String>();
        while (it.hasNext()) {
            keys.add((String) it.next());
        }
        assertEquals(2, keys.size());
        assertTrue(keys.contains("prefix.key1"));
        assertTrue(keys.contains("prefix.key2"));
    }

    @Test
    public void testSubsetValid() {
        props.addProperty("app.name", "test");
        props.addProperty("app.version", "1.0");
        props.addProperty("other", "x");
        ExtendedProperties sub = props.subset("app");
        assertNotNull(sub);
        assertEquals("test", sub.getProperty("name"));
        assertEquals("1.0", sub.getProperty("version"));
    }

    @Test
    public void testSubsetInvalid() {
        props.addProperty("nomatch", "val");
        assertNull(props.subset("prefix"));
    }

    @Test
    public void testGetString() {
        props.addProperty("str", "hello");
        assertEquals("hello", props.getString("str"));
    }

    @Test
    public void testGetStringWithDefault() {
        assertEquals("default", props.getString("missing", "default"));
    }

    @Test
    public void testGetStringNullKeyReturnsNull() {
        assertNull(props.getString("nonexistent"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringNonStringThrows() {
        props.addProperty("num", Integer.valueOf(1));
        props.getString("num");
    }

    @Test
    public void testGetBooleanTrue() {
        props.addProperty("flag", "true");
        assertTrue(props.getBoolean("flag"));
    }

    @Test
    public void testGetBooleanFalse() {
        props.addProperty("flag", "false");
        assertFalse(props.getBoolean("flag"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBooleanMissingThrows() {
        props.getBoolean("missing");
    }

    @Test
    public void testGetBooleanDefault() {
        assertTrue(props.getBoolean("missing", true));
    }

    @Test
    public void testGetInteger() {
        props.addProperty("num", "123");
        assertEquals(123, props.getInteger("num"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetIntegerMissingThrows() {
        props.getInteger("missing");
    }

    @Test
    public void testGetIntegerDefault() {
        assertEquals(42, props.getInteger("missing", 42));
    }

    @Test
    public void testGetLong() {
        props.addProperty("l", "123456789");
        assertEquals(123456789L, props.getLong("l"));
    }

    @Test
    public void testGetFloat() {
        props.addProperty("f", "3.14");
        assertEquals(3.14f, props.getFloat("f"), 0.001f);
    }

    @Test
    public void testGetDouble() {
        props.addProperty("d", "2.71828");
        assertEquals(2.71828, props.getDouble("d"), 0.00001);
    }

    @Test
    public void testGetByte() {
        props.addProperty("b", "127");
        assertEquals((byte) 127, props.getByte("b"));
    }

    @Test
    public void testGetShort() {
        props.addProperty("s", "1000");
        assertEquals((short) 1000, props.getShort("s"));
    }

    @Test
    public void testGetStringArrayWithSingleString() {
        props.addProperty("key", "value");
        String[] arr = props.getStringArray("key");
        assertArrayEquals(new String[]{"value"}, arr);
    }

    @Test
    public void testGetStringArrayWithList() {
        props.addProperty("key", "a,b");
        String[] arr = props.getStringArray("key");
        assertArrayEquals(new String[]{"a", "b"}, arr);
    }

    @Test
    public void testGetStringArrayMissing() {
        assertArrayEquals(new String[0], props.getStringArray("missing"));
    }

    @Test
    public void testGetVectorStringValue() {
        props.addProperty("key", "val");
        Vector v = props.getVector("key");
        assertEquals(1, v.size());
        assertEquals("val", v.get(0));
    }

    @Test
    public void testGetVectorListValue() {
        props.addProperty("key", "a,b");
        Vector v = props.getVector("key");
        assertEquals(2, v.size());
    }

    @Test
    public void testGetVectorMissingDefault() {
        Vector def = new Vector();
        def.add("default");
        Vector result = props.getVector("missing", def);
        assertEquals(def, result);
    }

    @Test
    public void testGetListStringValue() {
        props.addProperty("key", "val");
        List list = props.getList("key");
        assertEquals(1, list.size());
        assertEquals("val", list.get(0));
    }

    @Test
    public void testGetProperties() {
        props.addProperty("props", "a=1,b=2");
        Properties p = props.getProperties("props");
        assertEquals("1", p.getProperty("a"));
        assertEquals("2", p.getProperty("b"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertiesInvalidToken() {
        props.addProperty("bad", "novalue");
        props.getProperties("bad");
    }

    @Test
    public void testInterpolateSimple() {
        props.addProperty("var", "world");
        props.addProperty("greeting", "hello ${var}");
        assertEquals("hello world", props.getString("greeting"));
    }

    @Test
    public void testInterpolateWithDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("var", "default");
        props.defaults = defaults;
        props.addProperty("key", "${var}");
        assertEquals("default", props.getString("key"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolateInfiniteLoop() {
        props.addProperty("a", "${b}");
        props.addProperty("b", "${a}");
        props.getString("a");
    }

    @Test
    public void testInterpolateNullBase() {
        assertNull(props.interpolate(null));
    }

    @Test
    public void testPutNewKey() {
        assertNull(props.put("newkey", "value"));
        assertEquals("value", props.getProperty("newkey"));
    }

    @Test
    public void testPutExistingKey() {
        props.addProperty("key", "old");
        Object ret = props.put("key", "new");
        assertEquals("old", ret);
        assertEquals("new", props.getProperty("key"));
    }

    @Test
    public void testRemoveExisting() {
        props.addProperty("key", "value");
        Object removed = props.remove("key");
        assertEquals("value", removed);
        assertNull(props.getProperty("key"));
    }

    @Test
    public void testRemoveMissing() {
        assertNull(props.remove("nonexistent"));
    }

    @Test
    public void testPutAllExtendedProperties() {
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("x", "1");
        other.addProperty("y", "2");
        props.putAll(other);
        assertEquals("1", props.getProperty("x"));
        assertEquals("2", props.getProperty("y"));
    }

    @Test
    public void testPutAllRegularMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "1");
        map.put("b", "2");
        props.putAll(map);
        assertEquals("1", props.getProperty("a"));
        assertEquals("2", props.getProperty("b"));
    }

    @Test
    public void testCombine() {
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("combo", "value");
        props.addProperty("existing", "stay");
        props.combine(other);
        assertEquals("stay", props.getProperty("existing"));
        assertEquals("value", props.getProperty("combo"));
    }

    @Test
    public void testIsInitializedAfterLoad() throws IOException {
        String data = "key=value\n";
        InputStream in = new ByteArrayInputStream(data.getBytes("8859_1"));
        props.load(in);
        assertTrue(props.isInitialized());
    }

    @Test
    public void testLoadWithEncoding() throws IOException {
        String data = "k=v\n";
        InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));
        props.load(in, "UTF-8");
        assertEquals("v", props.getProperty("k"));
    }

    @Test
    public void testIncludePropertyNameDefault() {
        assertEquals("include", props.getInclude());
    }

    @Test
    public void testSetIncludeProperty() {
        props.setInclude("import");
        assertEquals("import", props.getInclude());
        props.setInclude(null);
        assertNull(props.getInclude());
    }

    @Test
    public void testConvertProperties() {
        Properties p = new Properties();
        p.setProperty("a", "1");
        p.setProperty("b", "2");
        ExtendedProperties ep = ExtendedProperties.convertProperties(p);
        assertEquals("1", ep.getProperty("a"));
        assertEquals("2", ep.getProperty("b"));
    }
}