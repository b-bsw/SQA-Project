package org.mockito.internal.configuration.injection.filter;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class TypeBasedCandidateFilterTest {

    public static class Target {
        public CharSequence text;
    }

    private static class RecordingMockCandidateFilter implements MockCandidateFilter {
        Collection<Object> filteredMocks;
        Field filteredField;
        Object filteredInstance;

        public OngoingInjecter filterCandidate(Collection<Object> mocks, Field field, Object fieldInstance) {
            this.filteredMocks = mocks;
            this.filteredField = field;
            this.filteredInstance = fieldInstance;
            return null;
        }
    }

    @Test
    public void filterCandidate_withMixedMocks_filtersByAssignableTypeAndDelegatesToNext() throws Exception {
        RecordingMockCandidateFilter next = new RecordingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(next);

        Object stringMock = "string";
        Object integerMock = Integer.valueOf(42);
        Object builderMock = new StringBuilder("builder");
        List<Object> mocks = Arrays.<Object>asList(stringMock, integerMock, builderMock);

        Target target = new Target();
        Field field = Target.class.getField("text");

        OngoingInjecter result = filter.filterCandidate(mocks, field, target);

        assertNull(result);
        assertNotSame(mocks, next.filteredMocks);
        assertNotNull(next.filteredMocks);
        assertSame(field, next.filteredField);
        assertSame(target, next.filteredInstance);

        List<Object> passedMocks = new ArrayList<Object>(next.filteredMocks);
        assertEquals(2, passedMocks.size());
        assertSame(stringMock, passedMocks.get(0));
        assertSame(builderMock, passedMocks.get(1));
    }

    @Test
    public void filterCandidate_withEmptyMocks_passesEmptyListToNext() throws Exception {
        RecordingMockCandidateFilter next = new RecordingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(next);

        Target target = new Target();
        Field field = Target.class.getField("text");

        OngoingInjecter result = filter.filterCandidate(Collections.<Object>emptyList(), field, target);

        assertNull(result);
        assertNotNull(next.filteredMocks);
        assertEquals(0, next.filteredMocks.size());
        assertSame(field, next.filteredField);
        assertSame(target, next.filteredInstance);
    }

    @Test
    public void filterCandidate_withSingleMatchingMock_passesSingleElementListToNext() throws Exception {
        RecordingMockCandidateFilter next = new RecordingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(next);

        Object onlyMock = "only";
        Target target = new Target();
        Field field = Target.class.getField("text");

        OngoingInjecter result = filter.filterCandidate(Collections.<Object>singletonList(onlyMock), field, target);

        assertNull(result);
        assertEquals(1, next.filteredMocks.size());
        assertSame(onlyMock, next.filteredMocks.iterator().next());
    }

    @Test(expected = NullPointerException.class)
    public void filterCandidate_withNullMocks_throwsNullPointerException() throws Exception {
        RecordingMockCandidateFilter next = new RecordingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(next);

        filter.filterCandidate(null, Target.class.getField("text"), new Target());
    }
}