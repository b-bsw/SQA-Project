package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class UncheckedIOExceptionTest {

    @Test
    public void testIoExceptionWithNonNullCause() {
        IOException original = new IOException("test error");
        UncheckedIOException ex = new UncheckedIOException(original);
        assertSame("ioException should return the same IOException instance", original, ex.ioException());
        assertTrue("UncheckedIOException should be a RuntimeException", ex instanceof RuntimeException);
    }

    @Test
    public void testIoExceptionWithNullCause() {
        UncheckedIOException ex = new UncheckedIOException(null);
        assertNull("ioException should be null when cause is null", ex.ioException());
        assertNull("getCause should also be null", ex.getCause());
    }
}