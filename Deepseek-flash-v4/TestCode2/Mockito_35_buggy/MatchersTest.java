package org.mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.hamcrest.Matcher;
import org.junit.Test;

@SuppressWarnings("unchecked")
public class MatchersTest {

    @Test
    public void testAnyFamilyReturnsDefaultValues() {
        assertFalse(Matchers.anyBoolean());
        assertEquals((byte) 0, Matchers.anyByte());
        assertEquals((char) 0, Matchers.anyChar());
        assertEquals(0, Matchers.anyInt());
        assertEquals(0L, Matchers.anyLong());
        assertEquals(0.0f, Matchers.anyFloat(), 0.0f);
        assertEquals(0.0, Matchers.anyDouble(), 0.0);
        assertEquals((short) 0, Matchers.anyShort());
        assertNull(Matchers.anyObject());
        assertNull(Matchers.anyVararg());
        assertNull(Matchers.any(String.class));
        assertNull(Matchers.any());
        assertEquals("", Matchers.anyString());
        assertNotNull(Matchers.anyList());
        assertNotNull(Matchers.anyListOf(String.class));
        assertNotNull(Matchers.anySet());
        assertNotNull(Matchers.anySetOf(String.class));
        assertNotNull(Matchers.anyMap());
        assertNotNull(Matchers.anyCollection());
        assertNotNull(Matchers.anyCollectionOf(String.class));
    }

    @Test
    public void testEqAndRefEqReturnDefaults() {
        assertFalse(Matchers.eq(true));
        assertEquals((byte) 0, Matchers.eq(Byte.MAX_VALUE));
        assertEquals((char) 0, Matchers.eq(Character.MAX_VALUE));
        assertEquals(0.0, Matchers.eq(Double.MAX_VALUE), 0.0);
        assertEquals(0.0f, Matchers.eq(Float.MAX_VALUE), 0.0f);
        assertEquals(0, Matchers.eq(Integer.MAX_VALUE));
        assertEquals(0L, Matchers.eq(Long.MAX_VALUE));
        assertEquals((short) 0, Matchers.eq(Short.MAX_VALUE));
        assertNull(Matchers.eq("value"));
        assertNull(Matchers.eq((Object) null));
        assertNull(Matchers.refEq(new Object()));
        assertNull(Matchers.refEq(new Object(), "ignoredField"));
        assertNull(Matchers.same("value"));
        assertNull(Matchers.same(null));
    }

    @Test
    public void testNullAndTypeMatchersReturnNull() {
        Class<String> nullClass = null;
        assertNull(Matchers.any(nullClass));
        assertNull(Matchers.isA(String.class));
        assertNull(Matchers.isNull());
        assertNull(Matchers.notNull());
        assertNull(Matchers.isNotNull());
    }

    @Test
    public void testStringMatchersReturnEmptyString() {
        assertEquals("", Matchers.contains("abc"));
        assertEquals("", Matchers.contains(""));
        assertEquals("", Matchers.matches("[a-z]+"));
        assertEquals("", Matchers.matches(""));
        assertEquals("", Matchers.endsWith("suffix"));
        assertEquals("", Matchers.startsWith("prefix"));
    }

    @Test
    public void testCustomMatcherMethodsReturnDefaults() {
        assertNull(Matchers.argThat(anyMatcher()));
        assertEquals((char) 0, Matchers.charThat(anyMatcher()));
        assertFalse(Matchers.booleanThat(anyMatcher()));
        assertEquals((byte) 0, Matchers.byteThat(anyMatcher()));
        assertEquals((short) 0, Matchers.shortThat(anyMatcher()));
        assertEquals(0, Matchers.intThat(anyMatcher()));
        assertEquals(0L, Matchers.longThat(anyMatcher()));
        assertEquals(0.0f, Matchers.floatThat(anyMatcher()), 0.0f);
        assertEquals(0.0, Matchers.doubleThat(anyMatcher()), 0.0);
    }

    @SuppressWarnings("rawtypes")
    private static Matcher anyMatcher() {
        return org.hamcrest.CoreMatchers.anything();
    }
}