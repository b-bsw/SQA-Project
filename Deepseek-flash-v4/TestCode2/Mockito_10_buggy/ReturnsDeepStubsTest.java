package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.reflection.GenericMetadataSupport;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ReturnsDeepStubsTest {

    private ReturnsDeepStubs spy;
    private InvocationOnMock invocation;
    private GenericMetadataSupport genericMetadata;

    @Before
    public void setUp() throws Exception {
        spy = spy(new ReturnsDeepStubs());
        invocation = mock(InvocationOnMock.class);
        genericMetadata = mock(GenericMetadataSupport.class);
        when(genericMetadata.resolveGenericReturnType(any(java.lang.reflect.Method.class))).thenReturn(genericMetadata);
    }

    @Test
    public void testAnswerWhenTypeNotMockable_returnsNull() throws Throwable {
        when(genericMetadata.rawType()).thenReturn((Class) String.class);
        doReturn(genericMetadata).when(spy).actualParameterizedType(any());

        Object result = spy.answer(invocation);

        assertNull(result);
    }

    @Test
    public void testAnswerWhenTypeMockable_returnsDeepStubMock() throws Throwable {
        when(genericMetadata.rawType()).thenReturn((Class) List.class);
        doReturn(genericMetadata).when(spy).actualParameterizedType(any());

        Object mock = mock(List.class);
        when(invocation.getMock()).thenReturn(mock);

        Object result = spy.answer(invocation);

        assertNotNull(result);
        assertTrue("result should be a mock", MockUtil.isMock(result));
    }
}