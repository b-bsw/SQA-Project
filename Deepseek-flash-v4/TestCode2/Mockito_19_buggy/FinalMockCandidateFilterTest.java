package org.mockito.internal.configuration.injection.filter;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;

public class FinalMockCandidateFilterTest {

    static class BeanWithSetter {
        private Object value;
        public void setValue(Object value) { this.value = value; }
        public Object getValue() { return value; }
    }

    static class BeanWithoutSetter {
        public Object value;
    }

    static class BeanWithPrimitiveInt {
        public int value;
    }

    private final FinalMockCandidateFilter filter = new FinalMockCandidateFilter();

    @Test
    public void testZeroMocks() throws Exception {
        Collection<Object> mocks = Collections.emptyList();
        Field field = BeanWithSetter.class.getDeclaredField("value");
        Object fieldInstance = new BeanWithSetter();
        assertNull(filter.filterCandidate(mocks, field, fieldInstance).thenInject());
    }

    @Test
    public void testMultipleMocks() throws Exception {
        Collection<Object> mocks = Arrays.asList("mock1", "mock2");
        Field field = BeanWithSetter.class.getDeclaredField("value");
        Object fieldInstance = new BeanWithSetter();
        assertNull(filter.filterCandidate(mocks, field, fieldInstance).thenInject());
    }

    @Test
    public void testOneMockSuccessWithSetter() throws Exception {
        Collection<Object> mocks = Collections.singletonList("theMock");
        Field field = BeanWithSetter.class.getDeclaredField("value");
        BeanWithSetter bean = new BeanWithSetter();
        OngoingInjecter injecter = filter.filterCandidate(mocks, field, bean);
        Object result = injecter.thenInject();
        assertSame("theMock", result);
        assertEquals("theMock", bean.getValue());
    }

    @Test
    public void testOneMockFallbackToField() throws Exception {
        Collection<Object> mocks = Collections.singletonList("theMock");
        Field field = BeanWithoutSetter.class.getDeclaredField("value");
        BeanWithoutSetter bean = new BeanWithoutSetter();
        OngoingInjecter injecter = filter.filterCandidate(mocks, field, bean);
        Object result = injecter.thenInject();
        assertSame("theMock", result);
        assertSame("theMock", bean.value);
    }

    @Test(expected = RuntimeException.class)
    public void testOneMockException() throws Exception {
        Collection<Object> mocks = Collections.singletonList("theMock");
        Field field = BeanWithPrimitiveInt.class.getDeclaredField("value");
        filter.filterCandidate(mocks, field, null).thenInject();
    }

    @Test(expected = NullPointerException.class)
    public void testNullMocks() throws Exception {
        Field field = BeanWithSetter.class.getDeclaredField("value");
        Object fieldInstance = new BeanWithSetter();
        filter.filterCandidate(null, field, fieldInstance);
    }
}