package org.apache.commons.collections;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class ExtendedPropertiesTest {
    private ExtendedProperties props;

    @Before
    public void setUp() {
        props = new ExtendedProperties();
    }

    @Test
    public void testSetAndGetString() {
        props.setProperty("name", "value");
        assertEquals("value", props.getString("name"));
    }

    @Test
    public void testGetStringWithDefault() {
        assertEquals("default", props.getString("nonexistent", "default"));
    }

    @Test
    public void testGetStringFromDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("key", "defaultVal");
        props.defaults = defaults;
        assertEquals("defaultVal", props.getString("key"));
    }

    @Test
    public void testGetStringWithListValue() {
        List<String> list = new ArrayList<>();
        list.add("first");
        props.put("key", list);
        assertEquals("first", props.getString("key"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringWithNonStringNonList() {
        props.put("key", 123);
        props.getString("key");
    }

    @Test
    public void testInterpolateSimple() {
        props.setProperty("var", "world");
        props.setProperty("greeting", "${var}");
        assertEquals("world", props.getString("greeting"));
    }

    @Test
    public void testInterpolateWithNullBase() {
        assertNull(props.interpolateHelper(null, null));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolateInfiniteLoop() {
        props.setProperty("a", "${b}");
        props.setProperty("b", "${a}");
        props.getString("a");
    }

    @Test
    public void testInterpolateWithDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("var", "fromDefault");
        props.defaults = defaults;
        props.setProperty("key", "${var}");
        assertEquals("fromDefault", props.getString("key"));
    }

    @Test
    public void testInterpolateWithMissingDefault() {
        props.setProperty("key", "${missing}");
        assertEquals("${missing}", props.getString("key"));
    }

    @Test
    public void testAddPropertySingle() {
        props.addProperty("key", "value");
        assertEquals("value", props.get("key"));
    }

    @Test
    public void testAddPropertyWithComma() {
        props.addProperty("key", "a,b,c");
        List<?> list = (List<?>) props.get("key");
        assertNotNull(list);
        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

    @Test
    public void testAddPropertyWithEscapedComma() {
        props.addProperty("key", "a\\,b");
        assertEquals("a,b", props.get("key"));
    }

    @Test
    public void testAddPropertyMultiple() {
        props.addProperty("key", "first");
        props.addProperty("key", "second");
        List<?> list = (List<?>) props.get("key");
        assertEquals(2, list.size());
    }

    @Test
    public void testAddPropertyNonString() {
        Integer val = 42;
        props.addProperty("key", val);
        assertSame(val, props.get("key"));
    }

    @Test
    public void testClearProperty() {
        props.setProperty("key", "value");
        props.clearProperty("key");
        assertNull(props.get("key"));
        assertFalse(props.keysAsListed.contains("key"));
    }

    @Test
    public void testClearNonExistent() {
        props.clearProperty("nonexistent");
    }

    @Test
    public void testGetKeys() {
        props.setProperty("a", "1");
        props.setProperty("b", "2");
        Set<String> keys = new HashSet<>();
        Iterator it = props.getKeys();
        while (it.hasNext()) keys.add((String) it.next());
        assertTrue(keys.contains("a"));
        assertTrue(keys.contains("b"));
        assertEquals(2, keys.size());
    }

    @Test
    public void testGetKeysWithPrefix() {
        props.setProperty("app.name", "test");
        props.setProperty("app.version", "1.0");
        props.setProperty("other", "x");
        Iterator it = props.getKeys("app");
        List<String> matching = new ArrayList<>();
        while (it.hasNext()) matching.add((String) it.next());
        assertEquals(2, matching.size());
        assertTrue(matching.contains("app.name"));
        assertTrue(matching.contains("app.version"));
    }

    @Test
    public void testSubsetValid() {
        props.setProperty("prefix.key1", "val1");
        props.setProperty("prefix.key2", "val2");
        ExtendedProperties sub = props.subset("prefix");
        assertNotNull(sub);
        assertEquals("val1", sub.get("key1"));
        assertEquals("val2", sub.get("key2"));
    }

    @Test
    public void testSubsetNoMatch() {
        props.setProperty("a", "1");
        assertNull(props.subset("b"));
    }

    @Test
    public void testSubsetExactMatch() {
        props.setProperty("prefix", "value");
        ExtendedProperties sub = props.subset("prefix");
        assertNotNull(sub);
        assertEquals("value", sub.get("prefix"));
    }

    @Test
    public void testCombine() {
        ExtendedProperties other = new ExtendedProperties();
        other.setProperty("key1", "val1");
        props.setProperty("key2", "val2");
        props.combine(other);
        assertEquals("val1", props.get("key1"));
        assertEquals("val2", props.get("key2"));
    }

    @Test
    public void testGetStringArrayFromString() {
        props.setProperty("key", "single");
        String[] arr = props.getStringArray("key");
        assertEquals(1, arr.length);
        assertEquals("single", arr[0]);
    }

    @Test
    public void testGetStringArrayFromList() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        props.put("key", list);
        String[] arr = props.getStringArray("key");
        assertEquals(2, arr.length);
    }

    @Test
    public void testGetStringArrayFromDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("key", "fromDefault");
        props.defaults = defaults;
        String[] arr = props.getStringArray("key");
        assertEquals(1, arr.length);
        assertEquals("fromDefault", arr[0]);
    }

    @Test
    public void testGetStringArrayNullKey() {
        String[] arr = props.getStringArray("nonexistent");
        assertEquals(0, arr.length);
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArrayInvalidType() {
        props.put("key", 123);
        props.getStringArray("key");
    }

    @Test
    public void testGetVectorFromString() {
        props.setProperty("key", "value");
        Vector<?> vec = props.getVector("key");
        assertEquals(1, vec.size());
        assertEquals("value", vec.get(0));
    }

    @Test
    public void testGetVectorFromList() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        props.put("key", list);
        Vector<?> vec = props.getVector("key");
        assertEquals(2, vec.size());
    }

    @Test
    public void testGetVectorDefault() {
        Vector<?> vec = props.getVector("nonexistent", null);
        assertNotNull(vec);
        assertTrue(vec.isEmpty());
    }

    @Test
    public void testGetVectorFromDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("key", "val");
        props.defaults = defaults;
        Vector<?> vec = props.getVector("key");
        assertEquals(1, vec.size());
        assertEquals("val", vec.get(0));
    }

    @Test(expected = ClassCastException.class)
    public void testGetVectorInvalidType() {
        props.put("key", 123);
        props.getVector("key");
    }

    @Test
    public void testGetIntegerFromString() {
        props.setProperty("key", "42");
        assertEquals(42, props.getInteger("key"));
    }

    @Test
    public void testGetIntegerFromInteger() {
        props.put("key", 100);
        assertEquals(100, props.getInteger("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetIntegerMissingNoDefault() {
        props.getInteger("nonexistent");
    }

    @Test
    public void testGetIntegerWithDefault() {
        assertEquals(5, props.getInteger("nonexistent", 5));
    }

    @Test
    public void testGetIntegerFromDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("key", "99");
        props.defaults = defaults;
        Integer val = props.getInteger("key", 1);
        assertEquals(99, val.intValue());
    }

    @Test(expected = ClassCastException.class)
    public void testGetIntegerInvalidType() {
        props.put("key", new Object());
        props.getInteger("key");
    }

    @Test
    public void testGetBooleanFromStringTrue() {
        props.setProperty("key", "true");
        assertTrue(props.getBoolean("key"));
    }

    @Test
    public void testGetBooleanFromStringOn() {
        props.setProperty("key", "on");
        assertTrue(props.getBoolean("key"));
    }

    @Test
    public void testGetBooleanFromStringYes() {
        props.setProperty("key", "yes");
        assertTrue(props.getBoolean("key"));
    }

    @Test
    public void testGetBooleanFromStringFalse() {
        props.setProperty("key", "false");
        assertFalse(props.getBoolean("key"));
    }

    @Test
    public void testGetBooleanFromStringOff() {
        props.setProperty("key", "off");
        assertFalse(props.getBoolean("key"));
    }

    @Test
    public void testGetBooleanFromStringNo() {
        props.setProperty("key", "no");
        assertFalse(props.getBoolean("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBooleanMissingNoDefault() {
        props.getBoolean("nonexistent");
    }

    @Test
    public void testGetBooleanWithDefault() {
        assertFalse(props.getBoolean("nonexistent", false));
    }

    @Test
    public void testGetBooleanFromDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("key", "true");
        props.defaults = defaults;
        assertTrue(props.getBoolean("key"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetBooleanInvalidType() {
        props.put("key", new Object());
        props.getBoolean("key");
    }

    @Test
    public void testGetByteFromString() {
        props.setProperty("key", "10");
        assertEquals((byte) 10, props.getByte("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByteMissingNoDefault() {
        props.getByte("nonexistent");
    }

    @Test
    public void testGetByteWithDefault() {
        assertEquals((byte) 7, props.getByte("nonexistent", (byte) 7));
    }

    @Test
    public void testGetShortFromString() {
        props.setProperty("key", "200");
        assertEquals((short) 200, props.getShort("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShortMissingNoDefault() {
        props.getShort("nonexistent");
    }

    @Test
    public void testGetShortWithDefault() {
        assertEquals((short) 15, props.getShort("nonexistent", (short) 15));
    }

    @Test
    public void testGetLongFromString() {
        props.setProperty("key", "1000000000000");
        assertEquals(1000000000000L, props.getLong("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongMissingNoDefault() {
        props.getLong("nonexistent");
    }

    @Test
    public void testGetLongWithDefault() {
        assertEquals(42L, props.getLong("nonexistent", 42L));
    }

    @Test
    public void testGetFloatFromString() {
        props.setProperty("key", "3.14");
        assertEquals(3.14f, props.getFloat("key"), 0.001f);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloatMissingNoDefault() {
        props.getFloat("nonexistent");
    }

    @Test
    public void testGetFloatWithDefault() {
        assertEquals(2.5f, props.getFloat("nonexistent", 2.5f), 0.001f);
    }

    @Test
    public void testGetDoubleFromString() {
        props.setProperty("key", "2.71828");
        assertEquals(2.71828, props.getDouble("key"), 0.00001);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleMissingNoDefault() {
        props.getDouble("nonexistent");
    }

    @Test
    public void testGetDoubleWithDefault() {
        assertEquals(1.0, props.getDouble("nonexistent", 1.0), 0.001);
    }

    @Test
    public void testGetPropertyWithDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("key", "val");
        props.defaults = defaults;
        assertEquals("val", props.getProperty("key"));
    }

    @Test
    public void testGetPropertyOwn() {
        props.setProperty("key", "own");
        assertEquals("own", props.getProperty("key"));
    }

    @Test
    public void testGetPropertyNull() {
        assertNull(props.getProperty("nonexistent"));
    }

    @Test
    public void testIsInitializedAfterLoad() throws IOException {
        assertFalse(props.isInitialized());
        String content = "key=value\n";
        InputStream is = new ByteArrayInputStream(content.getBytes(StandardCharsets.ISO_8859_1));
        props.load(is);
        assertTrue(props.isInitialized());
    }

    @Test
    public void testLoadSimple() throws IOException {
        String content = "key1=value1\nkey2=value2\n";
        InputStream is = new ByteArrayInputStream(content.getBytes(StandardCharsets.ISO_8859_1));
        props.load(is);
        assertEquals("value1", props.get("key1"));
        assertEquals("value2", props.get("key2"));
    }

    @Test
    public void testLoadWithComment() throws IOException {
        String content = "# comment\nkey=value\n";
        InputStream is = new ByteArrayInputStream(content.getBytes(StandardCharsets.ISO_8859_1));
        props.load(is);
        assertEquals("value", props.get("key"));
    }

    @Test
    public void testLoadWithBlankLine() throws IOException {
        String content = "key=value\n\nkey2=val2\n";
        InputStream is = new ByteArrayInputStream(content.getBytes(StandardCharsets.ISO_8859_1));
        props.load(is);
        assertEquals("value", props.get("key"));
    }

    @Test
    public void testLoadEmptyValue() throws IOException {
        String content = "key=\n";
        InputStream is = new ByteArrayInputStream(content.getBytes(StandardCharsets.ISO_8859_1));
        props.load(is);
        assertNull(props.get("key"));
    }

    @Test
    public void testLoadWithContinuation() throws IOException {
        String content = "key=first\\\nsecond\n";
        InputStream is = new ByteArrayInputStream(content.getBytes(StandardCharsets.ISO_8859_1));
        props.load(is);
        assertEquals("firstsecond", props.get("key"));
    }

    @Test
    public void testLoadWithEncoding() throws IOException {
        String content = "key=value\n";
        InputStream is = new ByteArrayInputStream(content.getBytes("UTF-8"));
        props.load(is, "UTF-8");
        assertEquals("value", props.get("key"));
    }

    @Test
    public void testLoadWithUnsupportedEncodingFallback() throws IOException {
        String content = "key=value\n";
        InputStream is = new ByteArrayInputStream(content.getBytes(StandardCharsets.ISO_8859_1));
        props.load(is, "nonexistent");
        assertEquals("value", props.get("key"));
    }

    @Test
    public void testGetPropertiesSimple() {
        props.setProperty("props", "a=1,b=2");
        Properties p = props.getProperties("props");
        assertEquals("1", p.getProperty("a"));
        assertEquals("2", p.getProperty("b"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertiesNoEquals() {
        props.setProperty("props", "bad");
        props.getProperties("props");
    }

    @Test
    public void testGetPropertiesWithDefaults() {
        Properties defaults = new Properties();
        defaults.setProperty("c", "3");
        props.setProperty("props", "a=1");
        Properties p = props.getProperties("props", defaults);
        assertEquals("1", p.getProperty("a"));
        assertEquals("3", p.getProperty("c"));
    }

    @Test
    public void testConvertProperties() {
        Properties original = new Properties();
        original.setProperty("a", "1");
        original.setProperty("b", "2");
        ExtendedProperties converted = ExtendedProperties.convertProperties(original);
        assertEquals("1", converted.get("a"));
        assertEquals("2", converted.get("b"));
    }

    @Test
    public void testPutAllWithExtendedProperties() {
        ExtendedProperties other = new ExtendedProperties();
        other.setProperty("k1", "v1");
        other.setProperty("k2", "v2");
        props.putAll(other);
        assertEquals("v1", props.get("k1"));
        assertEquals("v2", props.get("k2"));
    }

    @Test
    public void testPutAllWithMap() {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        props.putAll(map);
        assertEquals("v1", props.get("k1"));
        assertEquals("v2", props.get("k2"));
    }

    @Test
    public void testEscape() {
        assertEquals("a\\,b", ExtendedProperties.escape("a,b"));
        assertEquals("a\\\\b", ExtendedProperties.escape("a\\b"));
        assertEquals("normal", ExtendedProperties.escape("normal"));
    }

    @Test
    public void testUnescape() {
        assertEquals("a,b", ExtendedProperties.unescape("a\\,b"));
        assertEquals("a\\b", ExtendedProperties.unescape("a\\\\b"));
        assertEquals("normal", ExtendedProperties.unescape("normal"));
    }

    @Test
    public void testCountPreceding() {
        assertEquals(0, ExtendedProperties.countPreceding("abc", 2, '\\'));
        assertEquals(2, ExtendedProperties.countPreceding("\\\\c", 2, '\\'));
        assertEquals(1, ExtendedProperties.countPreceding("\\bc", 1, '\\'));
    }

    @Test
    public void testEndsWithSlash() {
        assertTrue(ExtendedProperties.endsWithSlash("test\\"));
        assertFalse(ExtendedProperties.endsWithSlash("test\\\\"));
        assertFalse(ExtendedProperties.endsWithSlash("test"));
        assertTrue(ExtendedProperties.endsWithSlash("\\\\\\"));
    }

    @Test
    public void testSetInclude() {
        props.setInclude("myInclude");
        assertEquals("myInclude", props.getInclude());
    }

    @Test
    public void testSetIncludeNull() {
        props.setInclude(null);
        assertEquals("", props.getInclude());
    }

    @Test
    public void testGetIncludeDefault() {
        assertEquals("include", props.getInclude());
    }

    @Test
    public void testDisplayOutput() {
        props.setProperty("key", "value");
        props.display();
    }

    @Test
    public void testSave() throws IOException {
        props.setProperty("key", "value");
        props.save(System.out, "Header");
    }

    @Test
    public void testSaveWithNullOutput() throws IOException {
        props.save(null, "header");
    }

    @Test
    public void testSaveWithListValues() throws IOException {
        props.addProperty("key", "a");
        props.addProperty("key", "b");
        props.save(System.out, null);
    }

    @Test
    public void testPutAllWithMapEntry() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("k1", "v1");
        props.putAll(map);
        assertEquals("v1", props.get("k1"));
    }

    @Test
    public void testCombineWithEmpty() {
        ExtendedProperties other = new ExtendedProperties();
        props.setProperty("k", "v");
        props.combine(other);
        assertEquals("v", props.get("k"));
    }

    @Test
    public void testSubsetNullIfNoMatch() {
        assertNull(props.subset("nonexistent"));
    }

    @Test
    public void testIsInitializedAfterAddProperty() {
        assertFalse(props.isInitialized());
        props.addProperty("key", "val");
        assertTrue(props.isInitialized());
    }

    @Test
    public void testGetStringInterpolationWithDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("var", "defaultVal");
        props.defaults = defaults;
        props.setProperty("key", "${var}");
        assertEquals("defaultVal", props.getString("key"));
    }

    @Test
    public void testInterpolateWithNestedVariables() {
        props.setProperty("a", "hello");
        props.setProperty("b", "${a} world");
        assertEquals("hello world", props.getString("b"));
    }
}