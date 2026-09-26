package org.mockito.internal.configuration.injection.filter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.util.MockUtil;
import org.mockito.mock.MockName;

import java.lang.reflect.Field;
import java.util.*;

import static org.junit.Assert.*;

public class NameBasedCandidateFilterTest {

    private NameBasedCandidateFilter filter;
    private StubMockCandidateFilter next;
    private FakeMockUtil fakeMockUtil;
    private Map<Object, String> mockNameMap;

    @Before
    public void setUp() throws Exception {
        next = new StubMockCandidateFilter();
        filter = new NameBasedCandidateFilter(next);
        fakeMockUtil = new FakeMockUtil();
        mockNameMap = new HashMap<>();
        fakeMockUtil.setNameMap(mockNameMap);

        // inject fake MockUtil via reflection
        Field mockUtilField = NameBasedCandidateFilter.class.getDeclaredField("mockUtil");
        mockUtilField.setAccessible(true);
        mockUtilField.set(filter, fakeMockUtil);
    }

    @Test(expected = NullPointerException.class)
    public void testNullMocks() {
        filter.filterCandidate(null, createField("someField"), new Object());
    }

    @Test
    public void testEmptyMocks() {
        Collection<Object> mocks = Collections.emptyList();
        OngoingInjecter result = filter.filterCandidate(mocks, createField("someField"), new Object());
        assertSame(next.lastResult, result);
        assertSame(mocks, next.lastMocks);
        assertEquals("someField", next.lastField.getName());
        assertNotNull(next.lastFieldInstance);
    }

    @Test
    public void testSingleMock() {
        Object mock = createMock("mock1");
        Collection<Object> mocks = Collections.singletonList(mock);
        OngoingInjecter result = filter.filterCandidate(mocks, createField("someField"), new Object());
        assertSame(next.lastResult, result);
        assertSame(mocks, next.lastMocks);
    }

    @Test
    public void testMultipleMocksWithMatch() {
        Object mock1 = createMock("fieldA");
        Object mock2 = createMock("fieldB");
        Collection<Object> mocks = Arrays.asList(mock1, mock2);
        Field field = createField("fieldA");

        OngoingInjecter result = filter.filterCandidate(mocks, field, new Object());
        assertSame(next.lastResult, result);
        assertEquals(1, next.lastMocks.size());
        assertTrue(next.lastMocks.contains(mock1));
        assertFalse(next.lastMocks.contains(mock2));
    }

    @Test
    public void testMultipleMocksWithMultipleMatches() {
        Object mock1 = createMock("fieldX");
        Object mock2 = createMock("fieldX");
        Object mock3 = createMock("fieldY");
        Collection<Object> mocks = Arrays.asList(mock1, mock2, mock3);
        Field field = createField("fieldX");

        OngoingInjecter result = filter.filterCandidate(mocks, field, new Object());
        assertSame(next.lastResult, result);
        assertEquals(2, next.lastMocks.size());
        assertTrue(next.lastMocks.containsAll(Arrays.asList(mock1, mock2)));
        assertFalse(next.lastMocks.contains(mock3));
    }

    @Test
    public void testMultipleMocksNoMatch() {
        Object mock1 = createMock("mockA");
        Object mock2 = createMock("mockB");
        Collection<Object> mocks = Arrays.asList(mock1, mock2);
        Field field = createField("fieldC");

        OngoingInjecter result = filter.filterCandidate(mocks, field, new Object());
        assertSame(next.lastResult, result);
        assertTrue(next.lastMocks.isEmpty());
    }

    // helper methods
    private Object createMock(String name) {
        Object mock = new Object();
        mockNameMap.put(mock, name);
        return mock;
    }

    private Field createField(String fieldName) {
        try {
            return DummyClass.class.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            // create a dummy field for the test
            // we can use reflection to add a field dynamically? Simpler: define static inner class
            throw new RuntimeException("Field not found: " + fieldName, e);
        }
    }

    // static inner class with fields for testing
    static class DummyClass {
        public String fieldA;
        public String fieldB;
        public String fieldC;
        public String fieldX;
        public String fieldY;
        public String someField;
    }

    // stub MockCandidateFilter
    static class StubMockCandidateFilter implements MockCandidateFilter {
        Collection<Object> lastMocks;
        Field lastField;
        Object lastFieldInstance;
        OngoingInjecter lastResult = new StubOngoingInjecter();

        @Override
        public OngoingInjecter filterCandidate(Collection<Object> mocks, Field field, Object fieldInstance) {
            this.lastMocks = mocks;
            this.lastField = field;
            this.lastFieldInstance = fieldInstance;
            return lastResult;
        }
    }

    static class StubOngoingInjecter implements OngoingInjecter {
        @Override
        public Object thenInject() {
            return null;
        }
    }

    // fake MockUtil that returns configurable mock names
    static class FakeMockUtil extends MockUtil {
        private Map<Object, String> nameMap;

        void setNameMap(Map<Object, String> map) {
            this.nameMap = map;
        }

        @Override
        public MockName getMockName(Object mock) {
            String name = nameMap.get(mock);
            if (name == null) {
                throw new IllegalArgumentException("No name for mock: " + mock);
            }
            return new FakeMockName(name);
        }
    }

    static class FakeMockName implements MockName {
        private final String name;

        FakeMockName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}