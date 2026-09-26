package org.apache.commons.lang3.builder;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class HashCodeBuilderTest {

    static class TestClass {
        int intField = 7;
        String strField = "test";
        transient int transField = 99;
        static int staticField = 1;
        int $dollar = 100;
    }

    private HashCodeBuilder builder;

    @Before
    public void setUp() {
        builder = new HashCodeBuilder();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorZeroInitial() {
        new HashCodeBuilder(0, 37);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorEvenInitial() {
        new HashCodeBuilder(20, 37);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorZeroMultiplier() {
        new HashCodeBuilder(17, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorEvenMultiplier() {
        new HashCodeBuilder(17, 40);
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals(17, builder.toHashCode());
    }

    @Test
    public void testCustomConstructor() {
        HashCodeBuilder b = new HashCodeBuilder(19, 43);
        assertEquals(19, b.toHashCode());
    }

    @Test
    public void testAppendBoolean() {
        builder.append(true);
        assertEquals(17 * 37 + 0, builder.toHashCode());
        builder.append(false);
        assertEquals((17 * 37 + 0) * 37 + 1, builder.toHashCode());
    }

    @Test
    public void testAppendBooleanArrayNull() {
        builder.append((boolean[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendBooleanArrayEmpty() {
        builder.append(new boolean[0]);
        assertEquals(17, builder.toHashCode());
    }

    @Test
    public void testAppendBooleanArrayNonEmpty() {
        builder.append(new boolean[]{true, false});
        assertEquals((17 * 37 + 0) * 37 + 1, builder.toHashCode());
    }

    @Test
    public void testAppendByte() {
        builder.append((byte) 5);
        assertEquals(17 * 37 + 5, builder.toHashCode());
    }

    @Test
    public void testAppendByteArrayNull() {
        builder.append((byte[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendByteArrayEmpty() {
        builder.append(new byte[0]);
        assertEquals(17, builder.toHashCode());
    }

    @Test
    public void testAppendByteArrayNonEmpty() {
        builder.append(new byte[]{3, 4});
        assertEquals((17 * 37 + 3) * 37 + 4, builder.toHashCode());
    }

    @Test
    public void testAppendChar() {
        builder.append('A');
        assertEquals(17 * 37 + 65, builder.toHashCode());
    }

    @Test
    public void testAppendCharArrayNull() {
        builder.append((char[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendCharArrayNonEmpty() {
        builder.append(new char[]{'x', 'y'});
        assertEquals((17 * 37 + 120) * 37 + 121, builder.toHashCode());
    }

    @Test
    public void testAppendDouble() {
        builder.append(3.14);
        long bits = Double.doubleToLongBits(3.14);
        int val = (int) (bits ^ (bits >> 32));
        assertEquals(17 * 37 + val, builder.toHashCode());
    }

    @Test
    public void testAppendDoubleArrayNull() {
        builder.append((double[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendDoubleArrayNonEmpty() {
        builder.append(new double[]{1.0, 2.0});
        long bits1 = Double.doubleToLongBits(1.0);
        long bits2 = Double.doubleToLongBits(2.0);
        int val1 = (int) (bits1 ^ (bits1 >> 32));
        int val2 = (int) (bits2 ^ (bits2 >> 32));
        assertEquals((17 * 37 + val1) * 37 + val2, builder.toHashCode());
    }

    @Test
    public void testAppendFloat() {
        builder.append(2.5f);
        int bits = Float.floatToIntBits(2.5f);
        assertEquals(17 * 37 + bits, builder.toHashCode());
    }

    @Test
    public void testAppendFloatArrayNull() {
        builder.append((float[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendFloatArrayNonEmpty() {
        builder.append(new float[]{1.5f, 2.5f});
        int bits1 = Float.floatToIntBits(1.5f);
        int bits2 = Float.floatToIntBits(2.5f);
        assertEquals((17 * 37 + bits1) * 37 + bits2, builder.toHashCode());
    }

    @Test
    public void testAppendInt() {
        builder.append(42);
        assertEquals(17 * 37 + 42, builder.toHashCode());
    }

    @Test
    public void testAppendIntArrayNull() {
        builder.append((int[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendIntArrayEmpty() {
        builder.append(new int[0]);
        assertEquals(17, builder.toHashCode());
    }

    @Test
    public void testAppendIntArrayNonEmpty() {
        builder.append(new int[]{1, 2, 3});
        assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, builder.toHashCode());
    }

    @Test
    public void testAppendLong() {
        builder.append(123456789L);
        long val = 123456789L;
        int hash = (int) (val ^ (val >> 32));
        assertEquals(17 * 37 + hash, builder.toHashCode());
    }

    @Test
    public void testAppendLongArrayNull() {
        builder.append((long[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendLongArrayNonEmpty() {
        builder.append(new long[]{100L, 200L});
        int v1 = (int) (100L ^ (100L >> 32));
        int v2 = (int) (200L ^ (200L >> 32));
        assertEquals((17 * 37 + v1) * 37 + v2, builder.toHashCode());
    }

    @Test
    public void testAppendShort() {
        builder.append((short) 100);
        assertEquals(17 * 37 + 100, builder.toHashCode());
    }

    @Test
    public void testAppendShortArrayNull() {
        builder.append((short[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendShortArrayNonEmpty() {
        builder.append(new short[]{10, 20});
        assertEquals((17 * 37 + 10) * 37 + 20, builder.toHashCode());
    }

    @Test
    public void testAppendObjectNull() {
        builder.append((Object) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendObjectNonArray() {
        builder.append("hello");
        assertEquals(17 * 37 + "hello".hashCode(), builder.toHashCode());
    }

    @Test
    public void testAppendObjectArray() {
        builder.append(new String[]{"a", "b"});
        int expected = 17 * 37 + "a".hashCode();
        expected = expected * 37 + "b".hashCode();
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendObjectArrayNull() {
        builder.append((Object[]) null);
        assertEquals(17 * 37, builder.toHashCode());
    }

    @Test
    public void testAppendObjectIntArray() {
        builder.append(new int[]{5, 6});
        assertEquals((17 * 37 + 5) * 37 + 6, builder.toHashCode());
    }

    @Test
    public void testAppendObjectDoubleArray() {
        builder.append(new double[]{3.0, 4.0});
        long bits1 = Double.doubleToLongBits(3.0);
        long bits2 = Double.doubleToLongBits(4.0);
        int val1 = (int) (bits1 ^ (bits1 >> 32));
        int val2 = (int) (bits2 ^ (bits2 >> 32));
        assertEquals((17 * 37 + val1) * 37 + val2, builder.toHashCode());
    }

    @Test
    public void testAppendSuper() {
        builder.appendSuper(100);
        assertEquals(17 * 37 + 100, builder.toHashCode());
    }

    @Test
    public void testHashCodeMethod() {
        assertEquals(builder.toHashCode(), builder.hashCode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCodeNullObject() {
        HashCodeBuilder.reflectionHashCode(17, 37, null);
    }

    @Test
    public void testReflectionHashCodeSimple() {
        TestClass obj = new TestClass();
        int hash = HashCodeBuilder.reflectionHashCode(17, 37, obj);
        int expected = 17;
        expected = expected * 37 + 7;
        expected = expected * 37 + "test".hashCode();
        assertEquals(expected, hash);
    }

    @Test
    public void testReflectionHashCodeExcludeFields() {
        TestClass obj = new TestClass();
        String[] exclude = {"strField"};
        int hash = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, null, exclude);
        int expected = 17;
        expected = expected * 37 + 7;
        assertEquals(expected, hash);
    }

    @Test
    public void testReflectionHashCodeWithTransient() {
        TestClass obj = new TestClass();
        int hash = HashCodeBuilder.reflectionHashCode(17, 37, obj, true, null, null);
        int expected = 17;
        expected = expected * 37 + 7;
        expected = expected * 37 + "test".hashCode();
        expected = expected * 37 + 99;
        assertEquals(expected, hash);
    }

    @Test
    public void testReflectionHashCodeWithoutTransient() {
        TestClass obj = new TestClass();
        int hash = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, null, null);
        int expected = 17;
        expected = expected * 37 + 7;
        expected = expected * 37 + "test".hashCode();
        assertEquals(expected, hash);
    }

    @Test
    public void testReflectionHashCodeReflectUpToClass() {
        class SubTestClass extends TestClass {
            int subField = 100;
        }
        SubTestClass obj = new SubTestClass();
        int hash = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, TestClass.class, null);
        int expected = 17;
        expected = expected * 37 + 7;
        expected = expected * 37 + "test".hashCode();
        assertEquals(expected, hash);
    }

    @Test
    public void testReflectionHashCodeFullHierarchy() {
        class SubTestClass extends TestClass {
            int subField = 100;
        }
        SubTestClass obj = new SubTestClass();
        int hash = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, null, null);
        int expected = 17;
        expected = expected * 37 + 100;
        expected = expected * 37 + 7;
        expected = expected * 37 + "test".hashCode();
        assertEquals(expected, hash);
    }

    @Test
    public void testReflectionHashCodeRegistryCleaned() {
        TestClass obj = new TestClass();
        HashCodeBuilder.reflectionHashCode(17, 37, obj);
        assertFalse("Object should be unregistered after reflection", HashCodeBuilder.isRegistered(obj));
    }

    @Test
    public void testReflectionHashCodeExcludeDollarField() {
        class DollarClass {
            int $value = 5;
            int normal = 10;
        }
        DollarClass obj = new DollarClass();
        int hash = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, null, null);
        int expected = 17;
        expected = expected * 37 + 10;
        assertEquals(expected, hash);
    }
}