package org.mockito.internal.configuration;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.MockUtil;

import static org.junit.Assert.*;

public class SpyAnnotationEngineTest {

    private SpyAnnotationEngine engine;

    @Before
    public void setUp() {
        engine = new SpyAnnotationEngine();
    }

    static class WithSpy {
        @Spy private Object spyField = new Object();
    }

    static class WithSpyNull {
        @Spy private Object spyField = null;
    }

    static class WithSpyAndMock {
        @Spy @Mock private Object spyMockField = new Object();
    }

    static class WithSpyAndCaptor {
        @Spy @Captor private Object spyCaptorField = new Object();
    }

    static class WithSpyOnMock {
        @Spy private Object spyMockField;
    }

    @Test
    public void testProcessSpyOnNewInstance() throws Exception {
        WithSpy instance = new WithSpy();
        engine.process(WithSpy.class, instance);
        Object fieldValue = WithSpy.class.getDeclaredField("spyField").get(instance);
        assertNotNull(fieldValue);
        assertTrue(new MockUtil().isMock(fieldValue));
        assertNotSame(new Object(), fieldValue);
    }

    @Test
    public void testProcessSpyOnMockInstance() throws Exception {
        WithSpyOnMock instance = new WithSpyOnMock();
        instance.spyMockField = Mockito.mock(Object.class);
        engine.process(WithSpyOnMock.class, instance);
        Object fieldValue = WithSpyOnMock.class.getDeclaredField("spyMockField").get(instance);
        assertNotNull(fieldValue);
        assertTrue(new MockUtil().isMock(fieldValue));
    }

    @Test(expected = MockitoException.class)
    public void testProcessSpyOnNullInstance() throws Exception {
        WithSpyNull instance = new WithSpyNull();
        engine.process(WithSpyNull.class, instance);
    }

    @Test
    public void testProcessSpyWithMockAnnotation() {
        WithSpyAndMock instance = new WithSpyAndMock();
        try {
            engine.process(WithSpyAndMock.class, instance);
            fail("Expected exception for @Mock and @Spy combination");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testProcessSpyWithCaptorAnnotation() {
        WithSpyAndCaptor instance = new WithSpyAndCaptor();
        try {
            engine.process(WithSpyAndCaptor.class, instance);
            fail("Expected exception for @Captor and @Spy combination");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testProcessNoSpyFields() throws Exception {
        class NoSpy {
            private Object field = "test";
        }
        NoSpy instance = new NoSpy();
        engine.process(NoSpy.class, instance);
        // no exception
    }
}