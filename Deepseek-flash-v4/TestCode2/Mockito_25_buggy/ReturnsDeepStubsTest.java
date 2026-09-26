package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.mockito.Mockito;

public class ReturnsDeepStubsTest {

    public interface SampleService {
        SampleRepository repository();
        int count();
        Void nothing();
    }

    public interface SampleRepository {
        SampleEntity find();
    }

    public interface SampleEntity {
    }

    public interface MultiService {
        One one();
        Two two();
        Three three();
        Four four();
    }

    public interface One {
    }

    public interface Two {
    }

    public interface Three {
    }

    public interface Four {
    }

    @Test
    public void answerShouldCreateDeepStubWhenNoStubbedInvocationsExist() {
        SampleService mock = Mockito.mock(SampleService.class, new ReturnsDeepStubs());

        SampleRepository repository = mock.repository();
        SampleEntity entity = repository.find();

        assertNotNull(repository);
        assertNotNull(entity);
    }

    @Test
    public void answerShouldReuseSameDeepStubWhenInvocationMatchesStubbedInvocation() {
        SampleService mock = Mockito.mock(SampleService.class, new ReturnsDeepStubs());

        SampleRepository first = mock.repository();
        SampleRepository second = mock.repository();

        assertSame(first, second);
    }

    @Test
    public void answerShouldSearchMultipleStubbedInvocationsWhenNoMatchingStubExists() {
        MultiService mock = Mockito.mock(MultiService.class, new ReturnsDeepStubs());

        assertNotNull(mock.one());
        assertNotNull(mock.two());
        assertNotNull(mock.three());
        assertNotNull(mock.four());
    }

    @Test
    public void answerShouldReturnDefaultValueForNonMockableRawType() {
        SampleService mock = Mockito.mock(SampleService.class, new ReturnsDeepStubs());

        assertEquals(0, mock.count());
        assertNull(mock.nothing());
    }

    @Test(expected = NullPointerException.class)
    public void answerWithNullInvocationShouldThrowNullPointerException() throws Throwable {
        new ReturnsDeepStubs().answer(null);
    }
}