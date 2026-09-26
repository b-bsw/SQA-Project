package org.mockito.internal.configuration.injection.filter;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;

public class MockCandidateFilterTest {

    private static class Target {
        private String name;
    }

    private static class StubCandidateFilter implements MockCandidateFilter {
        boolean called;

        public OngoingInjecter filterCandidate(Collection<Object> mocks, Field field, Object fieldInstance) {
            called = true;
            return new OngoingInjecter() {
                public Object thenInject() {
                    return "sentinel";
                }
            };
        }
    }

    private static Field nameField() throws Exception {
        Field field = Target.class.getDeclaredField("name");
        field.setAccessible(true);
        return field;
    }

    @Test
    public void finalMockCandidateFilter_injectsFirstCandidate_whenCandidatesExist() throws Exception {
        Target target = new Target();
        Field field = nameField();
        Object first = new Object();
        Object second = new Object();

        OngoingInjecter injecter = new FinalMockCandidateFilter().filterCandidate(
                Arrays.asList(first, second), field, target);

        assertSame(target, injecter.thenInject());
        assertSame(first, field.get(target));
    }

    @Test
    public void finalMockCandidateFilter_injectsSingleCandidate_andLeavesFieldNullWhenEmpty() throws Exception {
        Field field = nameField();
        Object mock = new Object();

        Target oneTarget = new Target();
        assertSame(oneTarget, new FinalMockCandidateFilter().filterCandidate(
                Collections.singletonList(mock), field, oneTarget).thenInject());
        assertSame(mock, field.get(oneTarget));

        Target emptyTarget = new Target();
        assertSame(emptyTarget, new FinalMockCandidateFilter().filterCandidate(
                Collections.<Object>emptyList(), field, emptyTarget).thenInject());
        assertNull(field.get(emptyTarget));
    }

    @Test(expected = NullPointerException.class)
    public void finalMockCandidateFilter_nullField_throwsOnInjection() throws Exception {
        Target target = new Target();
        Object mock = new Object();
        new FinalMockCandidateFilter().filterCandidate(
                Collections.singletonList(mock), null, target).thenInject();
    }

    @Test
    public void typeBasedCandidateFilter_injectsSingleCandidateWhenTypeMatches() throws Exception {
        Target target = new Target();
        Field field = nameField();
        String mock = "mock";
        StubCandidateFilter next = new StubCandidateFilter();

        OngoingInjecter injecter = new TypeBasedCandidateFilter(next)
                .filterCandidate(Collections.singletonList(mock), field, target);

        assertFalse(next.called);
        assertSame(target, injecter.thenInject());
        assertSame(mock, field.get(target));
    }

    @Test
    public void typeBasedCandidateFilter_delegatesWhenTypeDoesNotMatch() throws Exception {
        Target target = new Target();
        Field field = nameField();
        Object mock = new Object();
        StubCandidateFilter next = new StubCandidateFilter();

        OngoingInjecter injecter = new TypeBasedCandidateFilter(next)
                .filterCandidate(Collections.singletonList(mock), field, target);

        assertTrue(next.called);
        assertSame("sentinel", injecter.thenInject());
    }

    @Test
    public void typeBasedCandidateFilter_delegatesWhenMultipleCandidatesExist() throws Exception {
        Target target = new Target();
        Field field = nameField();
        StubCandidateFilter next = new StubCandidateFilter();

        OngoingInjecter injecter = new TypeBasedCandidateFilter(next)
                .filterCandidate(Arrays.asList(new String("first"), new Object()), field, target);

        assertTrue(next.called);
        assertSame("sentinel", injecter.thenInject());
    }

    @Test
    public void nameBasedCandidateFilter_injectsSingleCandidateWhenNameMatches() throws Exception {
        Target target = new Target();
        Field field = nameField();
        Object namedMock = new Object() {
            @Override
            public String toString() {
                return "name";
            }
        };
        StubCandidateFilter next = new StubCandidateFilter();

        OngoingInjecter injecter = new NameBasedCandidateFilter(next)
                .filterCandidate(Collections.singletonList(namedMock), field, target);

        assertFalse(next.called);
        assertSame(target, injecter.thenInject());
        assertSame(namedMock, field.get(target));
    }

    @Test
    public void nameBasedCandidateFilter_delegatesWhenNameDoesNotMatch() throws Exception {
        Target target = new Target();
        Field field = nameField();
        Object otherMock = new Object() {
            @Override
            public String toString() {
                return "other";
            }
        };
        StubCandidateFilter next = new StubCandidateFilter();

        OngoingInjecter injecter = new NameBasedCandidateFilter(next)
                .filterCandidate(Collections.singletonList(otherMock), field, target);

        assertTrue(next.called);
        assertSame("sentinel", injecter.thenInject());
    }

    @Test
    public void nameBasedCandidateFilter_delegatesWhenMultipleCandidatesExist() throws Exception {
        Target target = new Target();
        Field field = nameField();
        Object namedMock = new Object() {
            @Override
            public String toString() {
                return "name";
            }
        };
        Object otherMock = new Object() {
            @Override
            public String toString() {
                return "other";
            }
        };
        StubCandidateFilter next = new StubCandidateFilter();

        OngoingInjecter injecter = new NameBasedCandidateFilter(next)
                .filterCandidate(Arrays.asList(namedMock, otherMock), field, target);

        assertTrue(next.called);
        assertSame("sentinel", injecter.thenInject());
    }
}