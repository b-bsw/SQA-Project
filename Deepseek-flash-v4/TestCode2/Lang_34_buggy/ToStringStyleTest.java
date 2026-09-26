package org.apache.commons.lang3.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ToStringStyleTest {

    private ToStringStyle style;
    private StringBuffer buf;

    @Before
    public void setUp() {
        style = new ToStringStyle() {};
        buf = new StringBuffer();
    }

    @After
    public void tearDown() {
        // clear registry to avoid cross-test contamination
        ToStringStyle.getRegistry().clear();
    }

    // ------------------------------------------------------------
    // Tests for appendSuper / appendToString
    // ------------------------------------------------------------
    @Test
    public void testAppendSuperWithNull() {
        buf.append("prefix");
        style.appendSuper(buf, null);
        assertEquals("prefix", buf.toString());
    }

    @Test
    public void testAppendSuperWithContent() {
        buf.append("prefix");
        style.appendSuper(buf, "Start[data]End");
        assertEquals("prefixdata,", buf.toString());
    }

    @Test
    public void testAppendSuperWithNoMatch() {
        buf.append("prefix");
        style.appendSuper(buf, "no brackets");
        assertEquals("prefix", buf.toString());
    }

    @Test
    public void testAppendSuperWithContentAndFieldSeparatorAtStart() {
        style.setFieldSeparatorAtStart(true);
        buf.append("prefix,");
        style.appendSuper(buf, "Start[data]End");
        assertEquals("prefixdata,", buf.toString());
    }

    @Test
    public void testAppendSuperWithContentPositionsEqual() {
        buf.append("prefix");
        style.appendSuper(buf, "[stuff]");
        assertEquals("prefix", buf.toString());
    }

    // ------------------------------------------------------------
    // Tests for appendStart / appendEnd
    // ------------------------------------------------------------
    @Test
    public void testAppendStartNullObject() {
        style.appendStart(buf, null);
        assertEquals("", buf.toString());
    }

    @Test
    public void testAppendStartNonNull() {
        style.setUseClassName(false);
        style.setUseIdentityHashCode(false);
        style.appendStart(buf, "hello");
        assertEquals("[", buf.toString());
    }

    @Test
    public void testAppendStartWithFieldSeparatorAtStart() {
        style.setUseClassName(false);
        style.setUseIdentityHashCode(false);
        style.setFieldSeparatorAtStart(true);
        style.appendStart(buf, "obj");
        assertEquals("[,", buf.toString());
    }

    @Test
    public void testAppendEndRemovesLastSeparator() {
        buf.append("a,b,");
        style.appendEnd(buf, "obj");
        assertEquals("a,b]", buf.toString());
    }

    @Test
    public void testAppendEndFieldSeparatorAtEndTrue() {
        style.setFieldSeparatorAtEnd(true);
        buf.append("a,b");
        style.appendEnd(buf, "obj");
        assertEquals("a,b]", buf.toString());
    }

    // ------------------------------------------------------------
    // Tests for removeLastFieldSeparator
    // ------------------------------------------------------------
    @Test
    public void testRemoveLastFieldSeparatorEmpty() {
        style.removeLastFieldSeparator(buf);
        assertEquals("", buf.toString());
    }

    @Test
    public void testRemoveLastFieldSeparatorShort() {
        buf.append(",");
        style.removeLastFieldSeparator(buf);
        assertEquals("", buf.toString());
    }

    @Test
    public void testRemoveLastFieldSeparatorMatch() {
        buf.append("hello,");
        style.removeLastFieldSeparator(buf);
        assertEquals("hello", buf.toString());
    }

    @Test
    public void testRemoveLastFieldSeparatorNoMatch() {
        buf.append("hello;");
        style.removeLastFieldSeparator(buf);
        assertEquals("hello;", buf.toString());
    }

    @Test
    public void testRemoveLastFieldSeparatorCustomSeparator() {
        style.setFieldSeparator("-");
        buf.append("abc-");
        style.removeLastFieldSeparator(buf);
        assertEquals("abc", buf.toString());
    }

    // ------------------------------------------------------------
    // Tests for append(Object) with null and fullDetail
    // ------------------------------------------------------------
    @Test
    public void testAppendNullObject() {
        style.append(buf, "field", (Object) null, null);
        assertEquals("field=<null>,", buf.toString());
    }

    @Test
    public void testAppendObjectWithDetailTrue() {
        style.append(buf, "field", "value", Boolean.TRUE);
        assertEquals("field=value,", buf.toString());
    }

    @Test
    public void testAppendObjectWithDetailFalse() {
        style.append(buf, "field", "hello", Boolean.FALSE);
        assertEquals("field=<java.lang.String>,", buf.toString());
    }

    @Test
    public void testAppendObjectWithDetailNullDefaultTrue() {
        style.setDefaultFullDetail(true);
        style.append(buf, "field", 42, null);
        assertEquals("field=42,", buf.toString());
    }

    @Test
    public void testAppendObjectWithDetailNullDefaultFalse() {
        style.setDefaultFullDetail(false);
        style.append(buf, "field", 42, null);
        assertEquals("field=<java.lang.Integer>,", buf.toString());
    }

    @Test
    public void testAppendCyclicObject() {
        // create an object that will be registered manually
        Object cycle = new Object() {
            @Override
            public String toString() {
                return "cycle";
            }
        };
        ToStringStyle.register(cycle);
        // now append it – should call appendCyclicObject (identityToString)
        style.append(buf, "field", cycle, Boolean.TRUE);
        // ObjectUtils.identityToString appends class@hash
        String result = buf.toString();
        assertTrue(result.startsWith("field="));
        assertTrue(result.endsWith(",}"));
        ToStringStyle.unregister(cycle);
    }

    @Test
    public void testAppendRegisteredPrimitiveWrapperNotCyclic() {
        // Numbers, Boolean, Character are exempt from cyclic detection
        ToStringStyle.register(Integer.valueOf(1));
        style.append(buf, "field", Integer.valueOf(1), Boolean.TRUE);
        assertEquals("field=1,", buf.toString());
        ToStringStyle.unregister(Integer.valueOf(1));
    }

    // ------------------------------------------------------------
    // Tests for append with arrays
    // ------------------------------------------------------------
    @Test
    public void testAppendNullArrayObject() {
        style.append(buf, "arr", (Object[]) null, null);
        assertEquals("arr=<null>,", buf.toString());
    }

    @Test
    public void testAppendObjectArrayDetail() {
        style.append(buf, "arr", new Object[] {"a", "b", null}, Boolean.TRUE);
        assertEquals("arr={a,b,<null>},", buf.toString());
    }

    @Test
    public void testAppendObjectArraySummary() {
        style.append(buf, "arr", new Object[] {"x", "y"}, Boolean.FALSE);
        assertEquals("arr=<size=2>,", buf.toString());
    }

    @Test
    public void testAppendPrimitiveArrayDetail() {
        style.append(buf, "nums", new int[] {5, 10}, Boolean.TRUE);
        assertEquals("nums={5,10},", buf.toString());
    }

    @Test
    public void testAppendPrimitiveArraySummary() {
        style.append(buf, "nums", new double[] {1.0}, Boolean.FALSE);
        assertEquals("nums=<size=1>,", buf.toString());
    }

    @Test
    public void testAppendEmptyArray() {
        style.append(buf, "empty", new long[0], Boolean.TRUE);
        assertEquals("empty={},", buf.toString());
    }

    // ------------------------------------------------------------
    // Tests for Collection and Map
    // ------------------------------------------------------------
    @Test
    public void testAppendCollectionDetail() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("x");
        style.append(buf, "list", coll, Boolean.TRUE);
        assertEquals("list=[x],", buf.toString());
    }

    @Test
    public void testAppendCollectionSummary() {
        Collection<Integer> coll = Arrays.asList(1,2,3);
        style.append(buf, "list", coll, Boolean.FALSE);
        assertEquals("list=<size=3>,", buf.toString());
    }

    @Test
    public void testAppendMapDetail() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 1);
        style.append(buf, "map", map, Boolean.TRUE);
        assertEquals("map={a=1},", buf.toString());
    }

    @Test
    public void testAppendMapSummary() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("k", "v");
        style.append(buf, "map", map, Boolean.FALSE);
        assertEquals("map=<size=1>,", buf.toString());
    }

    // ------------------------------------------------------------
    // Tests for append for primitives
    // ------------------------------------------------------------
    @Test
    public void testAppendPrimitiveLong() {
        style.append(buf, "l", 10L);
        assertEquals("l=10,", buf.toString());
    }

    @Test
    public void testAppendPrimitiveInt() {
        style.append(buf, "i", 42);
        assertEquals("i=42,", buf.toString());
    }

    @Test
    public void testAppendPrimitiveShort() {
        style.append(buf, "s", (short) 5);
        assertEquals("s=5,", buf.toString());
    }

    @Test
    public void testAppendPrimitiveByte() {
        style.append(buf, "b", (byte) 8);
        assertEquals("b=8,", buf.toString());
    }

    @Test
    public void testAppendPrimitiveChar() {
        style.append(buf, "c", 'A');
        assertEquals("c=A,", buf.toString());
    }

    @Test
    public void testAppendPrimitiveDouble() {
        style.append(buf, "d", 3.14);
        assertEquals("d=3.14,", buf.toString());
    }

    @Test
    public void testAppendPrimitiveFloat() {
        style.append(buf, "f", 2.5f);
        assertEquals("f=2.5,", buf.toString());
    }

    @Test
    public void testAppendPrimitiveBoolean() {
        style.append(buf, "b", true);
        assertEquals("b=true,", buf.toString());
    }

    // ------------------------------------------------------------
    // Tests for array append methods (long[], int[], ...)
    // ------------------------------------------------------------
    @Test
    public void testAppendNullLongArray() {
        style.append(buf, "arr", (long[]) null, null);
        assertEquals("arr=<null>,", buf.toString());
    }

    @Test
    public void testAppendLongArrayDetailEmpty() {
        style.append(buf, "arr", new long[0], Boolean.TRUE);
        assertEquals("arr={},", buf.toString());
    }

    @Test
    public void testAppendLongArrayDetailOne() {
        style.append(buf, "arr", new long[] {7L}, Boolean.TRUE);
        assertEquals("arr={7},", buf.toString());
    }

    @Test
    public void testAppendIntArrayDetail() {
        style.append(buf, "arr", new int[] {1, 2}, Boolean.TRUE);
        assertEquals("arr={1,2},", buf.toString());
    }

    @Test
    public void testAppendShortArrayDetail() {
        style.append(buf, "arr", new short[] {3, 4}, Boolean.TRUE);
        assertEquals("arr={3,4},", buf.toString());
    }

    @Test
    public void testAppendByteArrayDetail() {
        style.append(buf, "arr", new byte[] {5, 6}, Boolean.TRUE);
        assertEquals("arr={5,6},", buf.toString());
    }

    @Test
    public void testAppendCharArrayDetail() {
        style.append(buf, "arr", new char[] {'a', 'b'}, Boolean.TRUE);
        assertEquals("arr={a,b},", buf.toString());
    }

    @Test
    public void testAppendDoubleArrayDetail() {
        style.append(buf, "arr", new double[] {1.1, 2.2}, Boolean.TRUE);
        assertEquals("arr={1.1,2.2},", buf.toString());
    }

    @Test
    public void testAppendFloatArrayDetail() {
        style.append(buf, "arr", new float[] {9.9f}, Boolean.TRUE);
        assertEquals("arr={9.9},", buf.toString());
    }

    @Test
    public void testAppendBooleanArrayDetail() {
        style.append(buf, "arr", new boolean[] {true, false}, Boolean.TRUE);
        assertEquals("arr={true,false},", buf.toString());
    }

    // ------------------------------------------------------------
    // Tests for reflectionAppendArrayDetail (primitive arrays via reflection)
    // ------------------------------------------------------------
    @Test
    public void testReflectionAppendArrayDetail() {
        style.reflectionAppendArrayDetail(buf, "field", new int[] {1, 2, 3});
        assertEquals("{1,2,3}", buf.toString());
    }

    @Test
    public void testReflectionAppendArrayDetailEmpty() {
        style.reflectionAppendArrayDetail(buf, "field", new double[0]);
        assertEquals("{}", buf.toString());
    }

    // ------------------------------------------------------------
    // Tests for isFullDetail
    // ------------------------------------------------------------
    @Test
    public void testIsFullDetailNullReturnsDefault() {
        style.setDefaultFullDetail(false);
        assertFalse(style.isFullDetail(null));
    }

    @Test
    public void testIsFullDetailTrue() {
        assertTrue(style.isFullDetail(Boolean.TRUE));
    }

    @Test
    public void testIsFullDetailFalse() {
        assertFalse(style.isFullDetail(Boolean.FALSE));
    }

    // ------------------------------------------------------------
    // Tests for boolean flags (getters/setters) – just spot checks
    // ------------------------------------------------------------
    @Test
    public void testUseClassName() {
        style.setUseClassName(false);
        assertFalse(style.isUseClassName());
    }

    @Test
    public void testUseShortClassName() {
        style.setUseShortClassName(true);
        assertTrue(style.isUseShortClassName());
    }

    @Test
    public void testUseIdentityHashCode() {
        style.setUseIdentityHashCode(false);
        assertFalse(style.isUseIdentityHashCode());
    }

    @Test
    public void testUseFieldNames() {
        style.setUseFieldNames(false);
        assertFalse(style.isUseFieldNames());
    }

    @Test
    public void testDefaultFullDetail() {
        style.setDefaultFullDetail(false);
        assertFalse(style.isDefaultFullDetail());
    }

    @Test
    public void testArrayContentDetail() {
        style.setArrayContentDetail(false);
        assertFalse(style.isArrayContentDetail());
    }

    @Test
    public void testFieldSeparatorAtStart() {
        style.setFieldSeparatorAtStart(true);
        assertTrue(style.isFieldSeparatorAtStart());
    }

    @Test
    public void testFieldSeparatorAtEnd() {
        style.setFieldSeparatorAtEnd(true);
        assertTrue(style.isFieldSeparatorAtEnd());
    }

    // ------------------------------------------------------------
    // Tests for setter null handling (set to null -> empty string)
    // ------------------------------------------------------------
    @Test
    public void testSetArrayStartNull() {
        style.setArrayStart(null);
        assertEquals("", style.getArrayStart());
    }

    @Test
    public void testSetArrayEndNull() {
        style.setArrayEnd(null);
        assertEquals("", style.getArrayEnd());
    }

    @Test
    public void testSetArraySeparatorNull() {
        style.setArraySeparator(null);
        assertEquals("", style.getArraySeparator());
    }

    @Test
    public void testSetContentStartNull() {
        style.setContentStart(null);
        assertEquals("", style.getContentStart());
    }

    @Test
    public void testSetContentEndNull() {
        style.setContentEnd(null);
        assertEquals("", style.getContentEnd());
    }

    @Test
    public void testSetFieldNameValueSeparatorNull() {
        style.setFieldNameValueSeparator(null);
        assertEquals("", style.getFieldNameValueSeparator());
    }

    @Test
    public void testSetFieldSeparatorNull() {
        style.setFieldSeparator(null);
        assertEquals("", style.getFieldSeparator());
    }

    @Test
    public void testSetNullTextNull() {
        style.setNullText(null);
        assertEquals("", style.getNullText());
    }

    @Test
    public void testSetSizeStartTextNull() {
        style.setSizeStartText(null);
        assertEquals("", style.getSizeStartText());
    }

    @Test
    public void testSetSizeEndTextNull() {
        style.setSizeEndText(null);
        assertEquals("", style.getSizeEndText());
    }

    @Test
    public void testSetSummaryObjectStartTextNull() {
        style.setSummaryObjectStartText(null);
        assertEquals("", style.getSummaryObjectStartText());
    }

    @Test
    public void testSetSummaryObjectEndTextNull() {
        style.setSummaryObjectEndText(null);
        assertEquals("", style.getSummaryObjectEndText());
    }

    // ------------------------------------------------------------
    // Tests for static registry methods (register, unregister, isRegistered)
    // ------------------------------------------------------------
    @Test
    public void testGetRegistryInitiallyEmpty() {
        assertTrue(ToStringStyle.getRegistry().isEmpty());
    }

    @Test
    public void testRegisterNullDoesNothing() {
        ToStringStyle.register(null);
        assertTrue(ToStringStyle.getRegistry().isEmpty());
    }

    @Test
    public void testRegisterAndIsRegistered() {
        Object obj = new Object();
        ToStringStyle.register(obj);
        assertTrue(ToStringStyle.isRegistered(obj));
        ToStringStyle.unregister(obj);
    }

    @Test
    public void testUnregisterNullDoesNothing() {
        // should not throw
        ToStringStyle.unregister(null);
    }

    @Test
    public void testUnregisterRegisteredObject() {
        Object obj = new Object();
        ToStringStyle.register(obj);
        ToStringStyle.unregister(obj);
        assertFalse(ToStringStyle.isRegistered(obj));
    }

    @Test
    public void testIsRegisteredFalseForUnregistered() {
        assertFalse(ToStringStyle.isRegistered("not registered"));
    }

    @Test
    public void testRegisterMultipleAndUnregisterClearsRegistryWhenEmpty() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        ToStringStyle.register(obj1);
        ToStringStyle.register(obj2);
        assertTrue(ToStringStyle.getRegistry().size() == 2);
        ToStringStyle.unregister(obj1);
        assertTrue(ToStringStyle.getRegistry().size() == 1);
        ToStringStyle.unregister(obj2);
        assertTrue(ToStringStyle.getRegistry().isEmpty());
    }

    // ------------------------------------------------------------
    // Tests for appendClassName / appendIdentityHashCode
    // ------------------------------------------------------------
    @Test
    public void testAppendClassNameWithUseClassNameTrue() {
        style.setUseClassName(true);
        style.setUseShortClassName(false);
        style.appendClassName(buf, "test");
        String name = buf.toString();
        assertTrue(name.contains("String") || name.contains("java.lang.String"));
    }

    @Test
    public void testAppendClassNameWithUseShortClassName() {
        style.setUseShortClassName(true);
        style.appendClassName(buf, "test");
        assertEquals("String", buf.toString());
    }

    @Test
    public void testAppendClassNameWithUseClassNameFalse() {
        style.setUseClassName(false);
        style.appendClassName(buf, "test");
        assertEquals("", buf.toString());
    }

    @Test
    public void testAppendIdentityHashCodeEnabled() {
        style.setUseIdentityHashCode(true);
        style.appendIdentityHashCode(buf, "obj");
        String s = buf.toString();
        assertEquals('@', s.charAt(0));
        // hex part should be non-empty
        assertTrue(s.length() > 1);
    }

    @Test
    public void testAppendIdentityHashCodeDisabled() {
        style.setUseIdentityHashCode(false);
        style.appendIdentityHashCode(buf, "obj");
        assertEquals("", buf.toString());
    }

    // ------------------------------------------------------------
    // Tests for contentStart / contentEnd / nullText / fieldSeparator
    // ------------------------------------------------------------
    @Test
    public void testAppendContentStart() {
        style.setContentStart("<<");
        style.appendContentStart(buf);
        assertEquals("<<", buf.toString());
    }

    @Test
    public void testAppendContentEnd() {
        style.setContentEnd(">>");
        style.appendContentEnd(buf);
        assertEquals(">>", buf.toString());
    }

    @Test
    public void testAppendNullText() {
        style.setNullText("NULL");
        style.appendNullText(buf, "field");
        assertEquals("NULL", buf.toString());
    }

    @Test
    public void testAppendFieldSeparator() {
        style.setFieldSeparator(";");
        style.appendFieldSeparator(buf);
        assertEquals(";", buf.toString());
    }

    // ------------------------------------------------------------
    // Tests for appendFieldStart / appendFieldEnd
    // ------------------------------------------------------------
    @Test
    public void testAppendFieldStartWithUseFieldNamesTrue() {
        style.setUseFieldNames(true);
        style.appendFieldStart(buf, "name");
        assertEquals("name=", buf.toString());
    }

    @Test
    public void testAppendFieldStartWithUseFieldNamesFalse() {
        style.setUseFieldNames(false);
        style.appendFieldStart(buf, "name");
        assertEquals("", buf.toString());
    }

    @Test
    public void testAppendFieldStartNullFieldName() {
        style.appendFieldStart(buf, null);
        assertEquals("", buf.toString());
    }

    @Test
    public void testAppendFieldEndAddsSeparator() {
        style.appendFieldEnd(buf, "field");
        assertEquals(",", buf.toString());
    }

    // ------------------------------------------------------------
    // Tests for appendSummarySize
    // ------------------------------------------------------------
    @Test
    public void testAppendSummarySize() {
        style.appendSummarySize(buf, "field", 5);
        assertEquals("<size=5>", buf.toString());
    }

    // ------------------------------------------------------------
    // Tests for getShortClassName
    // ------------------------------------------------------------
    @Test
    public void testGetShortClassName() {
        String shortName = style.getShortClassName(String.class);
        assertEquals("String", shortName);
    }
}