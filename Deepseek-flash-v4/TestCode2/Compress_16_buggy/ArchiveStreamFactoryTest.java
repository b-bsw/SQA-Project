package org.apache.commons.compress.archivers;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ArchiveStreamFactoryTest {
    private ArchiveStreamFactory factory;

    @Before
    public void setUp() {
        factory = new ArchiveStreamFactory();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamThrowsOnNullArchiverName() throws ArchiveException {
        factory.createArchiveInputStream((String) null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamThrowsOnNullInputStream() throws ArchiveException {
        factory.createArchiveInputStream("zip", null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStreamThrowsOnUnknownArchiverName() throws ArchiveException {
        factory.createArchiveInputStream("unknown", new ByteArrayInputStream(new byte[0]));
    }

    @Test
    public void testCreateArchiveInputStreamWithAr() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream result = factory.createArchiveInputStream("ar", in);
        assertTrue("Should be ArArchiveInputStream", result instanceof ArArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamWithZip() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream result = factory.createArchiveInputStream("zip", in);
        assertTrue("Should be ZipArchiveInputStream", result instanceof ZipArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamWithTar() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream result = factory.createArchiveInputStream("tar", in);
        assertTrue("Should be TarArchiveInputStream", result instanceof TarArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamWithJar() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream result = factory.createArchiveInputStream("jar", in);
        assertTrue("Should be JarArchiveInputStream", result instanceof JarArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamWithCpio() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream result = factory.createArchiveInputStream("cpio", in);
        assertTrue("Should be CpioArchiveInputStream", result instanceof CpioArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamWithDump() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream result = factory.createArchiveInputStream("dump", in);
        assertTrue("Should be DumpArchiveInputStream", result instanceof DumpArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamCaseInsensitive() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream result = factory.createArchiveInputStream("ZIP", in);
        assertTrue("Should be ZipArchiveInputStream with uppercase", result instanceof ZipArchiveInputStream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStreamThrowsOnNullArchiverName() throws ArchiveException {
        factory.createArchiveOutputStream(null, new OutputStream() {
            public void write(int b) throws IOException {}
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStreamThrowsOnNullOutputStream() throws ArchiveException {
        factory.createArchiveOutputStream("zip", null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStreamThrowsOnUnknownArchiverName() throws ArchiveException {
        factory.createArchiveOutputStream("unknown", new OutputStream() {
            public void write(int b) throws IOException {}
        });
    }

    @Test
    public void testCreateArchiveOutputStreamWithAr() throws ArchiveException {
        OutputStream out = new OutputStream() {
            public void write(int b) throws IOException {}
        };
        ArchiveOutputStream result = factory.createArchiveOutputStream("ar", out);
        assertTrue("Should be ArArchiveOutputStream", result instanceof ArArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStreamWithZip() throws ArchiveException {
        OutputStream out = new OutputStream() {
            public void write(int b) throws IOException {}
        };
        ArchiveOutputStream result = factory.createArchiveOutputStream("zip", out);
        assertTrue("Should be ZipArchiveOutputStream", result instanceof ZipArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStreamWithTar() throws ArchiveException {
        OutputStream out = new OutputStream() {
            public void write(int b) throws IOException {}
        };
        ArchiveOutputStream result = factory.createArchiveOutputStream("tar", out);
        assertTrue("Should be TarArchiveOutputStream", result instanceof TarArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStreamWithJar() throws ArchiveException {
        OutputStream out = new OutputStream() {
            public void write(int b) throws IOException {}
        };
        ArchiveOutputStream result = factory.createArchiveOutputStream("jar", out);
        assertTrue("Should be JarArchiveOutputStream", result instanceof JarArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStreamWithCpio() throws ArchiveException {
        OutputStream out = new OutputStream() {
            public void write(int b) throws IOException {}
        };
        ArchiveOutputStream result = factory.createArchiveOutputStream("cpio", out);
        assertTrue("Should be CpioArchiveOutputStream", result instanceof CpioArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStreamCaseInsensitive() throws ArchiveException {
        OutputStream out = new OutputStream() {
            public void write(int b) throws IOException {}
        };
        ArchiveOutputStream result = factory.createArchiveOutputStream("TAR", out);
        assertTrue("Should be TarArchiveOutputStream with uppercase", result instanceof TarArchiveOutputStream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamFromStreamThrowsOnNull() throws ArchiveException {
        factory.createArchiveInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamFromStreamThrowsOnNoMarkSupport() throws ArchiveException {
        InputStream in = new InputStream() {
            public int read() throws IOException { return -1; }
            public boolean markSupported() { return false; }
        };
        factory.createArchiveInputStream(in);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStreamFromStreamThrowsOnUnknownSignature() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        factory.createArchiveInputStream(in);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStreamThrowsOnNullName() throws ArchiveException {
        factory.createArchiveOutputStream(null, new OutputStream() {
            public void write(int b) throws IOException {}
        });
    }
}