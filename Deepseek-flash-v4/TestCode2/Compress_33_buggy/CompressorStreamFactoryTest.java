package org.apache.commons.compress.compressors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

public class CompressorStreamFactoryTest {

    @Test
    public void testCreateInputStreamWithNullStream() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            factory.createCompressorInputStream((InputStream) null);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Stream must not be null.", e.getMessage());
        } catch (CompressorException e) {
            fail("Unexpected CompressorException: " + e.getMessage());
        }
    }

    @Test
    public void testCreateInputStreamWithoutMarkSupport() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        InputStream noMark = new InputStream() {
            @Override
            public int read() throws IOException {
                return -1;
            }
            @Override
            public boolean markSupported() {
                return false;
            }
        };
        try {
            factory.createCompressorInputStream(noMark);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Mark is not supported.", e.getMessage());
        } catch (CompressorException e) {
            fail("Unexpected CompressorException: " + e.getMessage());
        }
    }

    @Test
    public void testCreateInputStreamWithBZip2Signature() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[] {
            (byte) 0x42, (byte) 0x5A, (byte) 0x68, // BZip2 magic
            0, 0, 0, 0, 0, 0, 0, 0, 0
        });
        CompressorInputStream result = factory.createCompressorInputStream(in);
        assertNotNull(result);
        assertTrue(result instanceof BZip2CompressorInputStream);
    }

    @Test
    public void testCreateInputStreamWithGzipSignature() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[] {
            (byte) 0x1F, (byte) 0x8B, // Gzip magic
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0
        });
        CompressorInputStream result = factory.createCompressorInputStream(in);
        assertNotNull(result);
        assertTrue(result instanceof GzipCompressorInputStream);
    }

    @Test
    public void testCreateInputStreamWithUnknownSignature() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        try {
            factory.createCompressorInputStream(in);
            fail("Should throw CompressorException");
        } catch (CompressorException e) {
            assertEquals("No Compressor found for the stream signature.", e.getMessage());
        }
    }

    @Test
    public void testCreateInputStreamWithIOException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        InputStream broken = new InputStream() {
            private boolean first = true;
            @Override
            public int read() throws IOException {
                throw new IOException("broken");
            }
            @Override
            public boolean markSupported() {
                return true;
            }
            @Override
            public void mark(int readlimit) {
            }
            @Override
            public void reset() throws IOException {
                if (first) {
                    first = false;
                    throw new IOException("reset broken");
                }
            }
        };
        try {
            factory.createCompressorInputStream(broken);
            fail("Should throw CompressorException");
        } catch (CompressorException e) {
            assertTrue(e.getMessage().contains("Failed to detect Compressor from InputStream."));
        }
    }

    @Test
    public void testCreateNamedInputStreamWithNullName() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            factory.createCompressorInputStream((String) null, new ByteArrayInputStream(new byte[0]));
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Compressor name and stream must not be null.", e.getMessage());
        } catch (CompressorException e) {
            fail("Unexpected CompressorException: " + e.getMessage());
        }
    }

    @Test
    public void testCreateNamedInputStreamWithNullStream() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            factory.createCompressorInputStream("gz", (InputStream) null);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Compressor name and stream must not be null.", e.getMessage());
        } catch (CompressorException e) {
            fail("Unexpected CompressorException: " + e.getMessage());
        }
    }

    @Test
    public void testCreateNamedInputStreamGzip() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        CompressorInputStream result = factory.createCompressorInputStream("gz", new ByteArrayInputStream(new byte[0]));
        assertNotNull(result);
        assertTrue(result instanceof GzipCompressorInputStream);
    }

    @Test
    public void testCreateNamedInputStreamBZip2() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        CompressorInputStream result = factory.createCompressorInputStream("bzip2", new ByteArrayInputStream(new byte[0]));
        assertNotNull(result);
        assertTrue(result instanceof BZip2CompressorInputStream);
    }

    @Test
    public void testCreateNamedInputStreamXZ() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        CompressorInputStream result = factory.createCompressorInputStream("xz", new ByteArrayInputStream(new byte[0]));
        assertNotNull(result);
        assertTrue(result instanceof XZCompressorInputStream);
    }

    @Test
    public void testCreateNamedInputStreamUnknown() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            factory.createCompressorInputStream("unknown", new ByteArrayInputStream(new byte[0]));
            fail("Should throw CompressorException");
        } catch (CompressorException e) {
            assertEquals("Compressor: unknown not found.", e.getMessage());
        }
    }

    @Test
    public void testCreateNamedInputStreamDeflate() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        CompressorInputStream result = factory.createCompressorInputStream("deflate", new ByteArrayInputStream(new byte[0]));
        assertNotNull(result);
        assertTrue(result instanceof DeflateCompressorInputStream);
    }

    @Test
    public void testCreateNamedOutputStreamWithNullName() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            factory.createCompressorOutputStream((String) null, new ByteArrayOutputStream());
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Compressor name and stream must not be null.", e.getMessage());
        } catch (CompressorException e) {
            fail("Unexpected CompressorException: " + e.getMessage());
        }
    }

    @Test
    public void testCreateNamedOutputStreamWithNullStream() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            factory.createCompressorOutputStream("gz", (OutputStream) null);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Compressor name and stream must not be null.", e.getMessage());
        } catch (CompressorException e) {
            fail("Unexpected CompressorException: " + e.getMessage());
        }
    }

    @Test
    public void testCreateNamedOutputStreamGzip() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        CompressorOutputStream result = factory.createCompressorOutputStream("gz", new ByteArrayOutputStream());
        assertNotNull(result);
        assertTrue(result instanceof GzipCompressorOutputStream);
    }

    @Test
    public void testCreateNamedOutputStreamBZip2() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        CompressorOutputStream result = factory.createCompressorOutputStream("bzip2", new ByteArrayOutputStream());
        assertNotNull(result);
        assertTrue(result instanceof BZip2CompressorOutputStream);
    }

    @Test
    public void testCreateNamedOutputStreamXZ() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        CompressorOutputStream result = factory.createCompressorOutputStream("xz", new ByteArrayOutputStream());
        assertNotNull(result);
        assertTrue(result instanceof XZCompressorOutputStream);
    }

    @Test
    public void testCreateNamedOutputStreamDeflate() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        CompressorOutputStream result = factory.createCompressorOutputStream("deflate", new ByteArrayOutputStream());
        assertNotNull(result);
        assertTrue(result instanceof DeflateCompressorOutputStream);
    }

    @Test
    public void testCreateNamedOutputStreamUnknown() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            factory.createCompressorOutputStream("unknown", new ByteArrayOutputStream());
            fail("Should throw CompressorException");
        } catch (CompressorException e) {
            assertEquals("Compressor: unknown not found.", e.getMessage());
        }
    }

    @Test
    public void testDecompressConcatenatedDefault() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        assertEquals(false, factory.getDecompressConcatenated());
    }

    @Test
    public void testDecompressConcatenatedTrue() {
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        assertEquals(true, factory.getDecompressConcatenated());
    }

    @Test
    public void testSetDecompressConcatenatedAfterConstructor() {
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        try {
            factory.setDecompressConcatenated(false);
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Cannot override the setting defined by the constructor", e.getMessage());
        }
    }

    @Test
    public void testSetDecompressConcatenatedWithoutConstructor() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.setDecompressConcatenated(true);
        assertEquals(true, factory.getDecompressConcatenated());
    }
}