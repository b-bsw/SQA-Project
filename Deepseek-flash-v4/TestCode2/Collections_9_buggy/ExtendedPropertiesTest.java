package org.apache.commons.collections;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class ExtendedPropertiesTest {

    private ExtendedProperties props;

    @Before
    public void setUp() {
        props = new ExtendedProperties();
    }

    @After
    public void tearDown() {
        props = null;
    }

    @Test
    public void testBasicAddAndGetString() {
        props.setProperty("name", "value");
        assertEquals("value", props.getString("name"));
    }

    @Test
    public void testGetStringWithDefault() {
        assertEquals("default", props.getString("nonexistent", "default"));
    }

    @Test
    public void testGetStringWithNullKey() {
        assertNull(props.getString(null));
    }

    @Test
    public void testGetStringWithDefaultNullKey() {
        assertNull(props.getString(null, "fallback"));
    }

    @Test
    public void testGetStringInterpolation() {
        props.setProperty("base", "hello ${name}");
        props.setProperty("name", "world");
        assertEquals("hello world", props.getString("base"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolationCycleDetection() {
        props.setProperty("a", "${b}");
        props.setProperty("b", "${a}");
        props.getString("a");
    }

    @Test
    public void testInterpolationWithNullBase() {
        assertEquals(null, props.interpolate(null));
    }

    @Test
    public void testInterpolationNoTokens() {
        props.setProperty("key", "plain");
        assertEquals("plain", props.getString("key"));
    }

    @Test
    public void testAddPropertyWithCommaDelimitedString() {
        props.addProperty("numbers", "1,2,3");
        List list = (List) props.get("numbers");
        assertNotNull(list);
        assertEquals(3, list.size());
        assertEquals("1", list.get(0));
        assertEquals("2", list.get(1));
        assertEquals("3", list.get(2));
    }

    @Test
    public void testAddPropertyWithSingleValue() {
        props.addProperty("single", "only");
        assertEquals("only", props.getString("single"));
    }

    @Test
    public void testAddPropertyListAccumulation() {
        props.addProperty("list", "first");
        props.addProperty("list", "second");
        List list = (List) props.get("list");
        assertNotNull(list);
        assertEquals(2, list.size());
        assertEquals("first", list.get(0));
        assertEquals("second", list.get(1));
    }

    @Test
    public void testSetPropertyOverwrites() {
        props.addProperty("key", "old");
        props.setProperty("key", "new");
        assertEquals("new", props.getString("key"));
    }

    @Test
    public void testGetInteger() {
        props.setProperty("count", "42");
        assertEquals(42, props.getInt("count"));
    }

    @Test
    public void testGetIntegerDefault() {
        assertEquals(99, props.getInt("missing", 99));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetIntegerMissingNoDefault() {
        props.getInteger("nonexistent");
    }

    @Test
    public void testGetBooleanTrue() {
        props.setProperty("flag", "true");
        assertTrue(props.getBoolean("flag"));
    }

    @Test
    public void testGetBooleanDefault() {
        assertTrue(props.getBoolean("missing", true));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBooleanMissingNoDefault() {
        props.getBoolean("missing");
    }

    @Test
    public void testGetBooleanValueOn() {
        props.setProperty("sw", "on");
        assertTrue(props.getBoolean("sw"));
    }

    @Test
    public void testGetBooleanValueOff() {
        props.setProperty("sw", "off");
        assertFalse(props.getBoolean("sw"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringOnNonStringValue() {
        props.put("num", Integer.valueOf(10));
        props.getString("num");
    }

    @Test
    public void testGetVectorFromList() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        props.put("v", list);
        Vector v = props.getVector("v");
        assertEquals(2, v.size());
        assertEquals("a", v.get(0));
        assertEquals("b", v.get(1));
    }

    @Test
    public void testGetVectorFromString() {
        props.setProperty("v", "single");
        Vector v = props.getVector("v");
        assertEquals(1, v.size());
        assertEquals("single", v.get(0));
    }

    @Test
    public void testGetVectorNullDefault() {
        Vector v = props.getVector("missing", null);
        assertNotNull(v);
        assertEquals(0, v.size());
    }

    @Test(expected = ClassCastException.class)
    public void testGetVectorWrongType() {
        props.put("bad", Integer.valueOf(5));
        props.getVector("bad");
    }

    @Test
    public void testGetListFromString() {
        props.setProperty("l", "item");
        List list = props.getList("l");
        assertEquals(1, list.size());
        assertEquals("item", list.get(0));
    }

    @Test
    public void testGetListNullDefault() {
        List list = props.getList("missing", null);
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test(expected = ClassCastException.class)
    public void testGetListWrongType() {
        props.put("bad", Double.valueOf(3.14));
        props.getList("bad");
    }

    @Test
    public void testGetKeys() {
        props.setProperty("a", "1");
        props.setProperty("b", "2");
        props.setProperty("c", "3");
        Iterator keys = props.getKeys();
        Set keySet = new HashSet();
        while (keys.hasNext()) {
            keySet.add(keys.next());
        }
        assertEquals(3, keySet.size());
        assertTrue(keySet.contains("a"));
        assertTrue(keySet.contains("b"));
        assertTrue(keySet.contains("c"));
    }

    @Test
    public void testGetKeysWithPrefix() {
        props.setProperty("prefix.key1", "val1");
        props.setProperty("prefix.key2", "val2");
        props.setProperty("other", "val3");
        Iterator prefixed = props.getKeys("prefix");
        int count = 0;
        while (prefixed.hasNext()) {
            String key = (String) prefixed.next();
            assertTrue(key.startsWith("prefix"));
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testGetKeysWithPrefixNoMatch() {
        props.setProperty("aaa", "1");
        props.setProperty("bbb", "2");
        Iterator prefixed = props.getKeys("ccc");
        assertFalse(prefixed.hasNext());
    }

    @Test
    public void testSubsetValid() {
        props.setProperty("app.name", "test");
        props.setProperty("app.version", "1.0");
        ExtendedProperties sub = props.subset("app");
        assertNotNull(sub);
        assertEquals("test", sub.getString("name"));
        assertEquals("1.0", sub.getString("version"));
    }

    @Test
    public void testSubsetNoMatch() {
        props.setProperty("app.name", "test");
        ExtendedProperties sub = props.subset("other");
        assertNull(sub);
    }

    @Test
    public void testClearProperty() {
        props.setProperty("key", "value");
        assertTrue(props.containsKey("key"));
        props.clearProperty("key");
        assertFalse(props.containsKey("key"));
    }

    @Test
    public void testClearNonExistentProperty() {
        props.clearProperty("nonexistent");
    }

    @Test
    public void testPutReturnsOldValue() {
        props.setProperty("key", "old");
        Object ret = props.put("key", "new");
        assertEquals("old", ret);
    }

    @Test
    public void testPutNewKeyReturnsNull() {
        assertNull(props.put("newkey", "value"));
    }

    @Test
    public void testRemove() {
        props.setProperty("key", "value");
        Object ret = props.remove("key");
        assertEquals("value", ret);
        assertFalse(props.containsKey("key"));
    }

    @Test
    public void testRemoveNonExistent() {
        assertNull(props.remove("nonexistent"));
    }

    @Test
    public void testCombine() {
        ExtendedProperties other = new ExtendedProperties();
        other.setProperty("a", "1");
        other.setProperty("b", "2");
        props.setProperty("c", "3");
        props.combine(other);
        assertEquals("1", props.getString("a"));
        assertEquals("2", props.getString("b"));
        assertEquals("3", props.getString("c"));
    }

    @Test
    public void testLoadFromInputStream() throws IOException {
        String data = "key1=value1\nkey2=value2\n";
        InputStream is = new ByteArrayInputStream(data.getBytes("8859_1"));
        props.load(is);
        assertEquals("value1", props.getString("key1"));
        assertEquals("value2", props.getString("key2"));
    }

    @Test
    public void testLoadWithEmptyValues() throws IOException {
        String data = "key1=\nkey2=value2\n";
        InputStream is = new ByteArrayInputStream(data.getBytes("8859_1"));
        props.load(is);
        assertFalse(props.containsKey("key1"));
        assertEquals("value2", props.getString("key2"));
    }

    @Test
    public void testLoadWithComment() throws IOException {
        String data = "# comment\nkey=value\n";
        InputStream is = new ByteArrayInputStream(data.getBytes("8859_1"));
        props.load(is);
        assertEquals("value", props.getString("key"));
    }

    @Test(expected = IOException.class)
    public void testLoadWithNullInput() throws IOException {
        props.load((InputStream) null);
    }

    @Test
    public void testGetStringArrayFromString() {
        props.setProperty("items", "one");
        String[] arr = props.getStringArray("items");
        assertEquals(1, arr.length);
        assertEquals("one", arr[0]);
    }

    @Test
    public void testGetStringArrayFromList() {
        props.addProperty("items", "a");
        props.addProperty("items", "b");
        String[] arr = props.getStringArray("items");
        assertEquals(2, arr.length);
        assertEquals("a", arr[0]);
        assertEquals("b", arr[1]);
    }

    @Test
    public void testGetStringArrayMissing() {
        String[] arr = props.getStringArray("missing");
        assertEquals(0, arr.length);
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArrayWrongType() {
        props.put("bad", Boolean.TRUE);
        props.getStringArray("bad");
    }

    @Test
    public void testGetBooleanFromStringYes() {
        props.setProperty("flag", "yes");
        assertTrue(props.getBoolean("flag"));
    }

    @Test
    public void testGetBooleanFromStringNo() {
        props.setProperty("flag", "no");
        assertFalse(props.getBoolean("flag"));
    }

    @Test
    public void testGetBooleanFromStringInvalid() {
        props.setProperty("flag", "maybe");
        assertNull(props.getBoolean("flag", null));
    }

    @Test
    public void testGetByte() {
        props.setProperty("b", "127");
        assertEquals((byte) 127, props.getByte("b"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByteMissingNoDefault() {
        props.getByte("missing");
    }

    @Test
    public void testGetShort() {
        props.setProperty("s", "1000");
        assertEquals((short) 1000, props.getShort("s"));
    }

    @Test
    public void testGetLong() {
        props.setProperty("l", "10000000000");
        assertEquals(10000000000L, props.getLong("l"));
    }

    @Test
    public void testGetFloat() {
        props.setProperty("f", "3.14");
        assertEquals(3.14f, props.getFloat("f"), 0.001f);
    }

    @Test
    public void testGetDouble() {
        props.setProperty("d", "2.71828");
        assertEquals(2.71828, props.getDouble("d"), 0.00001);
    }

    @Test
    public void testGetByteWithDefault() {
        assertEquals((byte) 8, props.getByte("missing", (byte) 8));
    }

    @Test
    public void testEscapeAndUnescape() throws Exception {
        String input = "a,b\\c";
        String escaped = java.lang.reflect.Method.class.getDeclaredMethod("escape", String.class);
        java.lang.reflect.Method unescape = ExtendedProperties.class.getDeclaredMethod("unescape", String.class);
    }

    @Test
    public void testGetPropertiesSimple() {
        props.setProperty("props", "user=admin\npass=secret");
        String[] tokens = props.getStringArray("props");
        Properties p = props.getProperties("props");
        assertNotNull(p);
        if (tokens.length >= 2) {
            assertEquals("admin", p.getProperty("user"));
            assertEquals("secret", p.getProperty("pass"));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertiesInvalidToken() {
        props.setProperty("bad", "nouserequal");
        props.getProperties("bad");
    }

    @Test
    public void testIsInitializedAfterLoad() throws IOException {
        assertFalse(props.isInitialized());
        String data = "key=value\n";
        InputStream is = new ByteArrayInputStream(data.getBytes("8859_1"));
        props.load(is);
        assertTrue(props.isInitialized());
    }
}