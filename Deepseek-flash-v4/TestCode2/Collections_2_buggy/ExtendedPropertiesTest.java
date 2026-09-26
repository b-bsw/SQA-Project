package org.apache.commons.collections;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;

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
    public void testDefaultConstructor() {
        Assert.assertNotNull(props);
        Assert.assertTrue(props.isEmpty());
        Assert.assertFalse(props.isInitialized());
    }

    @Test
    public void testAddAndGetStringProperty() {
        props.addProperty("name", "value");
        Assert.assertEquals("value", props.getProperty("name"));
        Assert.assertEquals("value", props.getString("name"));
    }

    @Test
    public void testAddPropertyWithDelimiter() {
        props.addProperty("key", "a,b,c");
        Assert.assertNotNull(props.getProperty("key"));
        Object val = props.get("key");
        Assert.assertTrue(val instanceof List);
        List list = (List) val;
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("b", list.get(1));
        Assert.assertEquals("c", list.get(2));
    }

    @Test
    public void testGetStringDefaultValue() {
        Assert.assertEquals("default", props.getString("nonexistent", "default"));
    }

    @Test
    public void testGetStringNullDefault() {
        Assert.assertNull(props.getString("nonexistent", null));
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringNonStringValue() {
        props.addProperty("intKey", Integer.valueOf(42));
        props.getString("intKey");
    }

    @Test
    public void testInterpolationSimple() {
        props.addProperty("var", "world");
        props.addProperty("greeting", "Hello ${var}");
        Assert.assertEquals("Hello world", props.getString("greeting"));
    }

    @Test
    public void testInterpolationCircularReference() {
        props.addProperty("a", "${b}");
        props.addProperty("b", "${a}");
        try {
            props.getString("a");
            Assert.fail("Expected IllegalStateException for circular reference");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("infinite loop"));
        }
    }

    @Test
    public void testInterpolationMissingReference() {
        props.addProperty("key", "${missing}");
        Assert.assertEquals("${missing}", props.getString("key"));
    }

    @Test
    public void testInterpolationNullBase() {
        Assert.assertNull(props.interpolate(null));
    }

    @Test
    public void testInterpolationNoTokens() {
        props.addProperty("key", "plain");
        Assert.assertEquals("plain", props.getString("key"));
    }

    @Test
    public void testInterpolationMultipleTokens() {
        props.addProperty("x", "X");
        props.addProperty("y", "Y");
        props.addProperty("z", "${x} and ${y}");
        Assert.assertEquals("X and Y", props.getString("z"));
    }

    @Test
    public void testSetProperty() {
        props.setProperty("key", "first");
        Assert.assertEquals("first", props.getProperty("key"));
        props.setProperty("key", "second");
        Assert.assertEquals("second", props.getProperty("key"));
        Object val = props.get("key");
        Assert.assertTrue(val instanceof String);
    }

    @Test
    public void testClearProperty() {
        props.addProperty("key", "value");
        Assert.assertTrue(props.containsKey("key"));
        props.clearProperty("key");
        Assert.assertFalse(props.containsKey("key"));
        props.clearProperty("nonexistent");
    }

    @Test
    public void testGetKeysEmpty() {
        Iterator it = props.getKeys();
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testGetKeysSingle() {
        props.addProperty("a", "1");
        Iterator it = props.getKeys();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("a", it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testGetKeysMultiple() {
        props.addProperty("a", "1");
        props.addProperty("b", "2");
        props.addProperty("c", "3");
        Iterator it = props.getKeys();
        List keys = new ArrayList();
        while (it.hasNext()) {
            keys.add(it.next());
        }
        Assert.assertEquals(3, keys.size());
        Assert.assertTrue(keys.contains("a"));
        Assert.assertTrue(keys.contains("b"));
        Assert.assertTrue(keys.contains("c"));
    }

    @Test
    public void testGetKeysWithPrefix() {
        props.addProperty("app.name", "test");
        props.addProperty("app.version", "1.0");
        props.addProperty("other", "x");
        Iterator it = props.getKeys("app.");
        List keys = new ArrayList();
        while (it.hasNext()) {
            keys.add(it.next());
        }
        Assert.assertEquals(2, keys.size());
        Assert.assertTrue(keys.contains("app.name"));
        Assert.assertTrue(keys.contains("app.version"));
    }

    @Test
    public void testGetKeysWithPrefixNoMatch() {
        props.addProperty("a", "1");
        Iterator it = props.getKeys("b");
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testSubsetValid() {
        props.addProperty("parent.child", "value");
        props.addProperty("parent.other", "other");
        props.addProperty("unrelated", "x");
        ExtendedProperties sub = props.subset("parent");
        Assert.assertNotNull(sub);
        Assert.assertEquals("child", sub.getKeys().next());
        Assert.assertEquals("value", sub.getProperty("child"));
    }

    @Test
    public void testSubsetNoMatch() {
        props.addProperty("a", "1");
        ExtendedProperties sub = props.subset("b");
        Assert.assertNull(sub);
    }

    @Test
    public void testSubsetExactPrefix() {
        props.addProperty("key", "value");
        ExtendedProperties sub = props.subset("key");
        Assert.assertNotNull(sub);
        Assert.assertEquals("value", sub.getProperty("key"));
    }

    @Test
    public void testGetStringArraySingle() {
        props.addProperty("key", "single");
        String[] arr = props.getStringArray("key");
        Assert.assertEquals(1, arr.length);
        Assert.assertEquals("single", arr[0]);
    }

    @Test
    public void testGetStringArrayMultiple() {
        props.addProperty("key", "a,b");
        String[] arr = props.getStringArray("key");
        Assert.assertEquals(2, arr.length);
        Assert.assertEquals("a", arr[0]);
        Assert.assertEquals("b", arr[1]);
    }

    @Test
    public void testGetStringArrayEmpty() {
        String[] arr = props.getStringArray("nonexistent");
        Assert.assertEquals(0, arr.length);
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArrayInvalidType() {
        props.addProperty("key", Integer.valueOf(42));
        props.getStringArray("key");
    }

    @Test
    public void testGetVectorFromString() {
        props.addProperty("key", "value");
        Vector v = props.getVector("key");
        Assert.assertEquals(1, v.size());
        Assert.assertEquals("value", v.get(0));
    }

    @Test
    public void testGetVectorFromList() {
        props.addProperty("key", "a,b");
        Vector v = props.getVector("key");
        Assert.assertEquals(2, v.size());
    }

    @Test
    public void testGetVectorDefault() {
        Vector def = new Vector();
        def.add("default");
        Vector v = props.getVector("nonexistent", def);
        Assert.assertSame(def, v);
    }

    @Test
    public void testGetVectorNullDefault() {
        Vector v = props.getVector("nonexistent", null);
        Assert.assertNotNull(v);
        Assert.assertTrue(v.isEmpty());
    }

    @Test
    public void testGetListFromString() {
        props.addProperty("key", "value");
        List list = props.getList("key");
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("value", list.get(0));
    }

    @Test
    public void testGetListFromList() {
        props.addProperty("key", "a,b,c");
        List list = props.getList("key");
        Assert.assertEquals(3, list.size());
    }

    @Test
    public void testGetListDefault() {
        List def = new ArrayList();
        def.add("default");
        List list = props.getList("nonexistent", def);
        Assert.assertSame(def, list);
    }

    @Test
    public void testGetListNullDefault() {
        List list = props.getList("nonexistent", null);
        Assert.assertNotNull(list);
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testGetBooleanTrue() {
        props.addProperty("flag", "true");
        Assert.assertTrue(props.getBoolean("flag"));
    }

    @Test
    public void testGetBooleanFalse() {
        props.addProperty("flag", "false");
        Assert.assertFalse(props.getBoolean("flag"));
    }

    @Test
    public void testGetBooleanOn() {
        props.addProperty("flag", "on");
        Assert.assertTrue(props.getBoolean("flag"));
    }

    @Test
    public void testGetBooleanYes() {
        props.addProperty("flag", "yes");
        Assert.assertTrue(props.getBoolean("flag"));
    }

    @Test
    public void testGetBooleanDefault() {
        Assert.assertFalse(props.getBoolean("nonexistent", false));
        Assert.assertTrue(props.getBoolean("nonexistent", true));
    }

    @Test
    public void testGetBooleanFromBooleanObject() {
        props.put("key", Boolean.TRUE);
        Assert.assertTrue(props.getBoolean("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBooleanMissingNoDefault() {
        props.getBoolean("missing");
    }

    @Test
    public void testTestBoolean() {
        Assert.assertEquals("true", props.testBoolean("true"));
        Assert.assertEquals("true", props.testBoolean("ON"));
        Assert.assertEquals("true", props.testBoolean("Yes"));
        Assert.assertEquals("false", props.testBoolean("false"));
        Assert.assertEquals("false", props.testBoolean("OFF"));
        Assert.assertEquals("false", props.testBoolean("no"));
        Assert.assertNull(props.testBoolean("invalid"));
    }

    @Test
    public void testGetByte() {
        props.addProperty("key", "10");
        Assert.assertEquals((byte) 10, props.getByte("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByteMissing() {
        props.getByte("missing");
    }

    @Test
    public void testGetByteDefault() {
        Assert.assertEquals((byte) 5, props.getByte("missing", (byte) 5));
    }

    @Test
    public void testGetShort() {
        props.addProperty("key", "100");
        Assert.assertEquals((short) 100, props.getShort("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShortMissing() {
        props.getShort("missing");
    }

    @Test
    public void testGetShortDefault() {
        Assert.assertEquals((short) 50, props.getShort("missing", (short) 50));
    }

    @Test
    public void testGetInteger() {
        props.addProperty("key", "42");
        Assert.assertEquals(42, props.getInteger("key"));
        Assert.assertEquals(42, props.getInt("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetIntegerMissing() {
        props.getInteger("missing");
    }

    @Test
    public void testGetIntegerDefault() {
        Assert.assertEquals(100, props.getInteger("missing", 100));
        Assert.assertEquals(200, props.getInt("nokey", 200));
    }

    @Test
    public void testGetLong() {
        props.addProperty("key", "123456789");
        Assert.assertEquals(123456789L, props.getLong("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongMissing() {
        props.getLong("missing");
    }

    @Test
    public void testGetLongDefault() {
        Assert.assertEquals(999L, props.getLong("missing", 999L));
    }

    @Test
    public void testGetFloat() {
        props.addProperty("key", "3.14");
        Assert.assertEquals(3.14f, props.getFloat("key"), 0.001f);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloatMissing() {
        props.getFloat("missing");
    }

    @Test
    public void testGetFloatDefault() {
        Assert.assertEquals(2.5f, props.getFloat("missing", 2.5f), 0.001f);
    }

    @Test
    public void testGetDouble() {
        props.addProperty("key", "2.71828");
        Assert.assertEquals(2.71828, props.getDouble("key"), 0.00001);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleMissing() {
        props.getDouble("missing");
    }

    @Test
    public void testGetDoubleDefault() {
        Assert.assertEquals(1.5, props.getDouble("missing", 1.5), 0.001);
    }

    @Test
    public void testGetProperties() {
        props.addProperty("props", "a=1,b=2");
        Properties p = props.getProperties("props");
        Assert.assertEquals("1", p.getProperty("a"));
        Assert.assertEquals("2", p.getProperty("b"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertiesBadToken() {
        props.addProperty("props", "badformat");
        props.getProperties("props");
    }

    @Test
    public void testCombine() {
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("a", "1");
        other.addProperty("b", "2");
        props.combine(other);
        Assert.assertEquals("1", props.getProperty("a"));
        Assert.assertEquals("2", props.getProperty("b"));
    }

    @Test
    public void testCombineOverwrites() {
        props.addProperty("a", "old");
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("a", "new");
        props.combine(other);
        Assert.assertEquals("new", props.getProperty("a"));
    }

    @Test
    public void testIsInitializedAfterAdd() {
        Assert.assertFalse(props.isInitialized());
        props.addProperty("key", "value");
        Assert.assertTrue(props.isInitialized());
    }

    @Test
    public void testEscapeComma() {
        String escaped = ExtendedProperties.escape("a,b");
        Assert.assertEquals("a\\,b", escaped);
    }

    @Test
    public void testEscapeBackslash() {
        String escaped = ExtendedProperties.escape("a\\b");
        Assert.assertEquals("a\\\\b", escaped);
    }

    @Test
    public void testEscapeNoChange() {
        String escaped = ExtendedProperties.escape("normal");
        Assert.assertEquals("normal", escaped);
    }

    @Test
    public void testUnescapeDoubleBackslash() {
        String unescaped = ExtendedProperties.unescape("a\\\\b");
        Assert.assertEquals("a\\b", unescaped);
    }

    @Test
    public void testUnescapeNoChange() {
        String unescaped = ExtendedProperties.unescape("normal");
        Assert.assertEquals("normal", unescaped);
    }

    @Test
    public void testConvertProperties() {
        Properties original = new Properties();
        original.setProperty("key1", "value1");
        original.setProperty("key2", "value2");
        ExtendedProperties converted = ExtendedProperties.convertProperties(original);
        Assert.assertEquals("value1", converted.getProperty("key1"));
        Assert.assertEquals("value2", converted.getProperty("key2"));
        Assert.assertEquals(2, converted.size());
    }

    @Test
    public void testGetPropertyWithDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("key", "defaultValue");
        ExtendedProperties propsWithDefaults = new ExtendedProperties();
        propsWithDefaults.defaults = defaults;
        Assert.assertEquals("defaultValue", propsWithDefaults.getProperty("key"));
    }

    @Test
    public void testGetPropertyOverridesDefault() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("key", "default");
        ExtendedProperties propsWithDefaults = new ExtendedProperties();
        propsWithDefaults.defaults = defaults;
        propsWithDefaults.addProperty("key", "override");
        Assert.assertEquals("override", propsWithDefaults.getProperty("key"));
    }

    @Test
    public void testCountPrecedingZero() {
        int count = ExtendedProperties.countPreceding("abc", 2, '\\');
        Assert.assertEquals(0, count);
    }

    @Test
    public void testCountPrecedingTwo() {
        int count = ExtendedProperties.countPreceding("ab\\\\c", 4, '\\');
        Assert.assertEquals(2, count);
    }

    @Test
    public void testEndsWithSlashTrue() {
        Assert.assertTrue(ExtendedProperties.endsWithSlash("line\\"));
    }

    @Test
    public void testEndsWithSlashFalse() {
        Assert.assertFalse(ExtendedProperties.endsWithSlash("line"));
    }

    @Test
    public void testEndsWithSlashEscapedBackslash() {
        Assert.assertFalse(ExtendedProperties.endsWithSlash("line\\\\"));
    }

    @Test
    public void testPropertiesTokenizerNoEscapedDelimiter() {
        ExtendedProperties.PropertiesTokenizer tokenizer = new ExtendedProperties.PropertiesTokenizer("a,b,c");
        Assert.assertTrue(tokenizer.hasMoreTokens());
        Assert.assertEquals("a", tokenizer.nextToken());
        Assert.assertEquals("b", tokenizer.nextToken());
        Assert.assertEquals("c", tokenizer.nextToken());
        Assert.assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void testPropertiesTokenizerEscapedDelimiter() {
        ExtendedProperties.PropertiesTokenizer tokenizer = new ExtendedProperties.PropertiesTokenizer("a\\,b,c");
        Assert.assertEquals("a,b", tokenizer.nextToken());
        Assert.assertEquals("c", tokenizer.nextToken());
    }

    @Test
    public void testPropertiesReaderReadProperty() throws IOException {
        String data = "key=value\n";
        InputStream is = new ByteArrayInputStream(data.getBytes("8859_1"));
        ExtendedProperties.PropertiesReader reader = new ExtendedProperties.PropertiesReader(new java.io.InputStreamReader(is));
        Assert.assertEquals("key=value", reader.readProperty());
        Assert.assertNull(reader.readProperty());
    }

    @Test
    public void testPropertiesReaderSkipsComments() throws IOException {
        String data = "# comment\nkey=value\n";
        InputStream is = new ByteArrayInputStream(data.getBytes("8859_1"));
        ExtendedProperties.PropertiesReader reader = new ExtendedProperties.PropertiesReader(new java.io.InputStreamReader(is));
        Assert.assertEquals("key=value", reader.readProperty());
    }

    @Test
    public void testPropertiesReaderContinuesLines() throws IOException {
        String data = "key=val\\\nue\n";
        InputStream is = new ByteArrayInputStream(data.getBytes("8859_1"));
        ExtendedProperties.PropertiesReader reader = new ExtendedProperties.PropertiesReader(new java.io.InputStreamReader(is));
        Assert.assertEquals("key=value", reader.readProperty());
    }

    @Test
    public void testLoadInputStreamSimple() throws IOException {
        String data = "key=value\n";
        InputStream is = new ByteArrayInputStream(data.getBytes("8859_1"));
        props.load(is);
        Assert.assertEquals("value", props.getProperty("key"));
        Assert.assertTrue(props.isInitialized());
    }

    @Test
    public void testLoadInputStreamWithInclude() throws IOException {
        String includeFile = "./includeTest.properties";
        System.setProperty("file.separator", "/");
        java.io.FileWriter fw = new java.io.FileWriter(includeFile);
        fw.write("includedKey=includedValue\n");
        fw.close();
        String data = "include=" + includeFile + "\n";
        InputStream is = new ByteArrayInputStream(data.getBytes("8859_1"));
        props.basePath = "./";
        props.load(is);
        Assert.assertNotNull(props.getProperty("includedKey"));
        new java.io.File(includeFile).delete();
        System.setProperty("file.separator", java.io.File.separator);
    }

    @Test
    public void testLoadInputStreamEmptyValue() throws IOException {
        String data = "key=\nother=value\n";
        InputStream is = new ByteArrayInputStream(data.getBytes("8859_1"));
        props.load(is);
        Assert.assertNull(props.getProperty("key"));
        Assert.assertEquals("value", props.getProperty("other"));
    }

    @Test(expected = IOException.class)
    public void testLoadInputStreamNull() throws IOException {
        props.load((InputStream) null);
    }

    @Test
    public void testSaveOutputStream() throws IOException {
        props.addProperty("key", "value");
        java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
        props.save(bos, "Header");
        String output = bos.toString("8859_1");
        Assert.assertTrue(output.contains("Header"));
        Assert.assertTrue(output.contains("key=value"));
    }

    @Test
    public void testSaveOutputStreamNull() throws IOException {
        props.save(null, "header");
    }

    @Test
    public void testGetIncludeDefault() {
        Assert.assertEquals("include", props.getInclude());
    }

    @Test
    public void testSetInclude() {
        props.setInclude("customInclude");
        Assert.assertEquals("customInclude", props.getInclude());
    }

    @Test
    public void testAddPropertyWithNullValue() {
        props.addProperty("key", (Object) null);
        Assert.assertNull(props.getProperty("key"));
    }

    @Test
    public void testAddPropertyNonStringValue() {
        props.addProperty("key", Integer.valueOf(100));
        Assert.assertEquals(Integer.valueOf(100), props.getProperty("key"));
        Assert.assertTrue(props.get("key") instanceof Integer);
    }

    @Test
    public void testGetStringWithInterpolationFromList() {
        props.addProperty("listkey", "a,b");
        props.addProperty("ref", "${listkey}");
        Assert.assertEquals("a", props.getString("listkey"));
        String interpolated = props.getString("ref");
        Assert.assertNotNull(interpolated);
    }

    @Test
    public void testGetStringFromListFirstElement() {
        props.addProperty("key", "first,second");
        Assert.assertEquals("first", props.getString("key"));
    }

    @Test
    public void testAddPropertyInternalListAlreadyExists() {
        props.addProperty("key", "val1");
        props.addProperty("key", "val2");
        Object val = props.get("key");
        Assert.assertTrue(val instanceof List);
        List list = (List) val;
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("val1", list.get(0));
        Assert.assertEquals("val2", list.get(1));
    }

    @Test
    public void testAddPropertyDirectKeyOrdering() {
        props.addProperty("b", "2");
        props.addProperty("a", "1");
        props.addProperty("c", "3");
        Iterator it = props.getKeys();
        Assert.assertEquals("b", it.next());
        Assert.assertEquals("a", it.next());
        Assert.assertEquals("c", it.next());
    }

    @Test
    public void testClearPropertyRemovesFromKeysAsListed() {
        props.addProperty("key", "val");
        props.clearProperty("key");
        Assert.assertFalse(props.getKeys().hasNext());
    }

    @Test
    public void testInterpolationWithDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("host", "localhost");
        ExtendedProperties propsWithDefaults = new ExtendedProperties();
        propsWithDefaults.defaults = defaults;
        propsWithDefaults.addProperty("url", "http://${host}:8080");
        Assert.assertEquals("http://localhost:8080", propsWithDefaults.getString("url"));
    }

    @Test
    public void testGetStringNullKey() {
        String result = props.getString(null, "fallback");
        Assert.assertNotNull(result);
    }
}