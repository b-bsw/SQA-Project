package org.apache.commons.collections;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import static org.junit.Assert.*;

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
    public void testAddPropertyString() {
        props.addProperty("key", "value");
        assertEquals("value", props.getProperty("key"));
    }

    @Test
    public void testAddPropertyWithComma() {
        props.addProperty("key", "a,b,c");
        List values = (List) props.getProperty("key");
        assertEquals(3, values.size());
        assertEquals("a", values.get(0));
        assertEquals("b", values.get(1));
        assertEquals("c", values.get(2));
    }

    @Test
    public void testAddPropertyEscapedComma() {
        props.addProperty("key", "a\\,b");
        assertEquals("a,b", props.getProperty("key"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringNonStringValue() {
        props.addProperty("key", 123);
        props.getString("key");
    }

    @Test
    public void testGetStringFromList() {
        props.addProperty("key", "first");
        props.addProperty("key", "second");
        assertEquals("first", props.getString("key"));
    }

    @Test
    public void testGetStringDefault() {
        assertEquals("default", props.getString("missing", "default"));
    }

    @Test
    public void testGetStringNullDefault() {
        assertNull(props.getString("missing", null));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBooleanMissingNoDefault() {
        props.getBoolean("missing");
    }

    @Test
    public void testGetBooleanFromStringTrue() {
        props.addProperty("key", "true");
        assertTrue(props.getBoolean("key"));
    }

    @Test
    public void testGetBooleanFromStringOn() {
        props.addProperty("key", "on");
        assertTrue(props.getBoolean("key"));
    }

    @Test
    public void testGetBooleanFromStringYes() {
        props.addProperty("key", "yes");
        assertTrue(props.getBoolean("key"));
    }

    @Test
    public void testGetBooleanFromStringFalse() {
        props.addProperty("key", "false");
        assertFalse(props.getBoolean("key"));
    }

    @Test
    public void testGetBooleanFromStringOff() {
        props.addProperty("key", "off");
        assertFalse(props.getBoolean("key"));
    }

    @Test
    public void testGetBooleanFromStringNo() {
        props.addProperty("key", "no");
        assertFalse(props.getBoolean("key"));
    }

    @Test
    public void testGetBooleanDefaultTrue() {
        assertTrue(props.getBoolean("missing", true));
    }

    @Test
    public void testGetBooleanDefaultFalse() {
        assertFalse(props.getBoolean("missing", false));
    }

    @Test
    public void testGetIntegerFromString() {
        props.addProperty("key", "42");
        assertEquals(42, props.getInteger("key"));
    }

    @Test
    public void testGetIntegerDefault() {
        assertEquals(10, props.getInteger("missing", 10));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetIntegerNoDefaultMissing() {
        props.getInteger("missing");
    }

    @Test
    public void testGetByteFromString() {
        props.addProperty("key", "7");
        assertEquals((byte) 7, props.getByte("key"));
    }

    @Test
    public void testGetByteDefault() {
        assertEquals((byte) 3, props.getByte("missing", (byte) 3));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByteNoDefaultMissing() {
        props.getByte("missing");
    }

    @Test
    public void testGetShortFromString() {
        props.addProperty("key", "100");
        assertEquals((short) 100, props.getShort("key"));
    }

    @Test
    public void testGetShortDefault() {
        assertEquals((short) 5, props.getShort("missing", (short) 5));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShortNoDefaultMissing() {
        props.getShort("missing");
    }

    @Test
    public void testGetLongFromString() {
        props.addProperty("key", "1000000000000");
        assertEquals(1000000000000L, props.getLong("key"));
    }

    @Test
    public void testGetLongDefault() {
        assertEquals(42L, props.getLong("missing", 42L));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongNoDefaultMissing() {
        props.getLong("missing");
    }

    @Test
    public void testGetFloatFromString() {
        props.addProperty("key", "3.14");
        assertEquals(3.14f, props.getFloat("key"), 0.001f);
    }

    @Test
    public void testGetFloatDefault() {
        assertEquals(2.5f, props.getFloat("missing", 2.5f), 0.001f);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloatNoDefaultMissing() {
        props.getFloat("missing");
    }

    @Test
    public void testGetDoubleFromString() {
        props.addProperty("key", "2.71828");
        assertEquals(2.71828, props.getDouble("key"), 0.00001);
    }

    @Test
    public void testGetDoubleDefault() {
        assertEquals(1.5, props.getDouble("missing", 1.5), 0.00001);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleNoDefaultMissing() {
        props.getDouble("missing");
    }

    @Test
    public void testGetVectorFromString() {
        props.addProperty("key", "value");
        Vector v = props.getVector("key");
        assertEquals(1, v.size());
        assertEquals("value", v.get(0));
    }

    @Test
    public void testGetVectorFromList() {
        props.addProperty("key", "a");
        props.addProperty("key", "b");
        Vector v = props.getVector("key");
        assertEquals(2, v.size());
        assertEquals("a", v.get(0));
        assertEquals("b", v.get(1));
    }

    @Test
    public void testGetVectorDefault() {
        Vector def = new Vector();
        def.add("x");
        Vector v = props.getVector("missing", def);
        assertEquals(1, v.size());
        assertEquals("x", v.get(0));
    }

    @Test
    public void testGetVectorNullDefault() {
        Vector v = props.getVector("missing", null);
        assertNotNull(v);
        assertTrue(v.isEmpty());
    }

    @Test
    public void testGetListFromString() {
        props.addProperty("key", "value");
        List l = props.getList("key");
        assertEquals(1, l.size());
        assertEquals("value", l.get(0));
    }

    @Test
    public void testGetListFromMultiple() {
        props.addProperty("key", "a");
        props.addProperty("key", "b");
        List l = props.getList("key");
        assertEquals(2, l.size());
    }

    @Test
    public void testGetListDefault() {
        List def = new java.util.ArrayList();
        def.add("x");
        List l = props.getList("missing", def);
        assertEquals(1, l.size());
        assertEquals("x", l.get(0));
    }

    @Test
    public void testSetProperty() {
        props.setProperty("key", "value");
        assertEquals("value", props.getProperty("key"));
    }

    @Test
    public void testSetPropertyOverwrite() {
        props.addProperty("key", "old");
        props.setProperty("key", "new");
        assertEquals("new", props.getProperty("key"));
    }

    @Test
    public void testClearProperty() {
        props.addProperty("key", "value");
        props.clearProperty("key");
        assertNull(props.getProperty("key"));
    }

    @Test
    public void testClearPropertyNonExistent() {
        props.clearProperty("nonexistent");
    }

    @Test
    public void testGetKeysEmpty() {
        assertFalse(props.getKeys().hasNext());
    }

    @Test
    public void testGetKeys() {
        props.addProperty("a", "1");
        props.addProperty("b", "2");
        Iterator it = props.getKeys();
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetKeysWithPrefix() {
        props.addProperty("prefix.key1", "v1");
        props.addProperty("prefix.key2", "v2");
        props.addProperty("other", "v3");
        Iterator it = props.getKeys("prefix");
        List keys = new java.util.ArrayList();
        while (it.hasNext()) {
            keys.add(it.next());
        }
        assertEquals(2, keys.size());
        assertTrue(keys.contains("prefix.key1"));
        assertTrue(keys.contains("prefix.key2"));
    }

    @Test
    public void testSubsetValid() {
        props.addProperty("a.b", "1");
        props.addProperty("a.c", "2");
        ExtendedProperties sub = props.subset("a");
        assertNotNull(sub);
        assertEquals("1", sub.getProperty("b"));
        assertEquals("2", sub.getProperty("c"));
    }

    @Test
    public void testSubsetInvalid() {
        props.addProperty("x", "1");
        assertNull(props.subset("y"));
    }

    @Test
    public void testGetStringArrayFromString() {
        props.addProperty("key", "value");
        String[] arr = props.getStringArray("key");
        assertEquals(1, arr.length);
        assertEquals("value", arr[0]);
    }

    @Test
    public void testGetStringArrayFromList() {
        props.addProperty("key", "a");
        props.addProperty("key", "b");
        String[] arr = props.getStringArray("key");
        assertEquals(2, arr.length);
    }

    @Test
    public void testGetStringArrayMissing() {
        String[] arr = props.getStringArray("missing");
        assertEquals(0, arr.length);
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArrayWrongType() {
        props.addProperty("key", 42);
        props.getStringArray("key");
    }

    @Test
    public void testPutAndReturnOldValue() {
        props.addProperty("key", "old");
        Object ret = props.put("key", "new");
        assertEquals("old", ret);
        assertEquals("new", props.getProperty("key"));
    }

    @Test
    public void testRemove() {
        props.addProperty("key", "value");
        Object ret = props.remove("key");
        assertEquals("value", ret);
        assertNull(props.getProperty("key"));
    }

    @Test
    public void testCombine() {
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("a", "1");
        other.addProperty("b", "2");
        props.combine(other);
        assertEquals("1", props.getProperty("a"));
        assertEquals("2", props.getProperty("b"));
    }

    @Test
    public void testConvertProperties() {
        Properties p = new Properties();
        p.setProperty("key1", "val1");
        p.setProperty("key2", "val2");
        ExtendedProperties ep = ExtendedProperties.convertProperties(p);
        assertEquals("val1", ep.getProperty("key1"));
        assertEquals("val2", ep.getProperty("key2"));
    }

    @Test
    public void testInterpolateSimple() {
        props.addProperty("var", "world");
        props.addProperty("msg", "hello ${var}");
        assertEquals("hello world", props.getString("msg"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolateCircular() {
        props.addProperty("a", "${b}");
        props.addProperty("b", "${a}");
        props.getString("a");
    }

    @Test
    public void testInterpolateMissingKeepsToken() {
        props.addProperty("msg", "hello ${missing}");
        assertEquals("hello ${missing}", props.getString("msg"));
    }

    @Test
    public void testInterpolateNullBase() {
        ExtendedProperties ep = new ExtendedProperties();
        assertNull(ep.interpolate(null));
    }

    @Test
    public void testGetProperties() {
        props.addProperty("key", "a=1,b=2");
        Properties p = props.getProperties("key");
        assertEquals("1", p.getProperty("a"));
        assertEquals("2", p.getProperty("b"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertiesNoEquals() {
        props.addProperty("key", "badtoken");
        props.getProperties("key");
    }

    @Test
    public void testGetPropertiesWithDefaults() {
        props.addProperty("key", "x=10");
        Properties defaults = new Properties();
        defaults.setProperty("y", "20");
        Properties p = props.getProperties("key", defaults);
        assertEquals("10", p.getProperty("x"));
        assertEquals("20", p.getProperty("y"));
    }

    @Test
    public void testGetIncludeDefault() {
        assertEquals("include", props.getInclude());
    }

    @Test
    public void testSetInclude() {
        props.setInclude("import");
        assertEquals("import", props.getInclude());
    }

    @Test
    public void testSetIncludeNull() {
        props.setInclude(null);
        assertNull(props.getInclude());
    }

    @Test
    public void testSetIncludeEmpty() {
        props.setInclude("");
        assertNull(props.getInclude());
    }

    @Test(expected = ClassCastException.class)
    public void testGetBooleanWrongType() {
        props.addProperty("key", 123);
        props.getBoolean("key");
    }

    @Test
    public void testGetBooleanFromBooleanObject() {
        props.put("key", Boolean.TRUE);
        assertTrue(props.getBoolean("key"));
    }

    @Test
    public void testGetIntegerFromIntegerObject() {
        props.put("key", 42);
        assertEquals(42, props.getInteger("key"));
    }

    @Test
    public void testGetLongFromLongObject() {
        props.put("key", 100L);
        assertEquals(100L, props.getLong("key"));
    }

    @Test
    public void testGetFloatFromFloatObject() {
        props.put("key", 1.5f);
        assertEquals(1.5f, props.getFloat("key"), 0.001f);
    }

    @Test
    public void testGetDoubleFromDoubleObject() {
        props.put("key", 2.5);
        assertEquals(2.5, props.getDouble("key"), 0.001);
    }

    @Test
    public void testPutAllFromExtendedProperties() {
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("a", "1");
        other.addProperty("b", "2");
        props.putAll(other);
        assertEquals("1", props.getProperty("a"));
        assertEquals("2", props.getProperty("b"));
    }

    @Test
    public void testRemoveNonExistent() {
        assertNull(props.remove("nonexistent"));
    }

    @Test
    public void testIsInitializedAfterLoad() throws IOException {
        String data = "key=value\n";
        InputStream is = new ByteArrayInputStream(data.getBytes("8859_1"));
        props.load(is);
        assertTrue(props.isInitialized());
    }

    @Test
    public void testLoadWithInclude() throws IOException {
        String data = "include=included.properties\n";
        InputStream is = new ByteArrayInputStream(data.getBytes("8859_1"));
        props.load(is);
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArrayNonStringNonListValue() {
        props.addProperty("key", 123);
        props.getStringArray("key");
    }

    @Test
    public void testGetVectorWithDefaultNullValue() {
        props.addProperty("key", "value");
        Vector v = props.getVector("key", null);
        assertEquals(1, v.size());
    }

    @Test(expected = ClassCastException.class)
    public void testGetVectorWrongType() {
        props.addProperty("key", 123);
        props.getVector("key");
    }

    @Test(expected = ClassCastException.class)
    public void testGetListWrongType() {
        props.addProperty("key", 123);
        props.getList("key");
    }

    @Test
    public void testGetByteFromByteObject() {
        props.put("key", (byte) 5);
        assertEquals((byte) 5, props.getByte("key"));
    }

    @Test
    public void testGetShortFromShortObject() {
        props.put("key", (short) 20);
        assertEquals((short) 20, props.getShort("key"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetByteWrongType() {
        props.addProperty("key", 123);
        props.getByte("key");
    }

    @Test(expected = ClassCastException.class)
    public void testGetShortWrongType() {
        props.addProperty("key", 123);
        props.getShort("key");
    }
}