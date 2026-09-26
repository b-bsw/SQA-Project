package org.apache.commons.compress.archivers;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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
    public void testCreateArchiveInputStreamNullArchiverName() throws ArchiveException {
        factory.createArchiveInputStream((String) null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamNullInputStream() throws ArchiveException {
        factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStreamUnknownArchiver() throws ArchiveException {
        factory.createArchiveInputStream("unknown", new ByteArrayInputStream(new byte[0]));
    }

    @Test
    public void testCreateArchiveInputStreamAr() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        assertNotNull(factory.createArchiveInputStream(ArchiveStreamFactory.AR, in));
    }

    @Test
    public void testCreateArchiveInputStreamArjWithoutEncoding() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        assertNotNull(factory.createArchiveInputStream(ArchiveStreamFactory.ARJ, in));
    }

    @Test
    public void testCreateArchiveInputStreamZipWithoutEncoding() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        assertNotNull(factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, in));
    }

    @Test
    public void testCreateArchiveInputStreamTarWithoutEncoding() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        assertNotNull(factory.createArchiveInputStream(ArchiveStreamFactory.TAR, in));
    }

    @Test
    public void testCreateArchiveInputStreamJarWithoutEncoding() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        assertNotNull(factory.createArchiveInputStream(ArchiveStreamFactory.JAR, in));
    }

    @Test
    public void testCreateArchiveInputStreamCpioWithoutEncoding() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        assertNotNull(factory.createArchiveInputStream(ArchiveStreamFactory.CPIO, in));
    }

    @Test
    public void testCreateArchiveInputStreamDumpWithoutEncoding() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        assertNotNull(factory.createArchiveInputStream(ArchiveStreamFactory.DUMP, in));
    }

    @Test(expected = StreamingNotSupportedException.class)
    public void testCreateArchiveInputStreamSevenZThrowsStreamingNotSupported() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        factory.createArchiveInputStream(ArchiveStreamFactory.SEVEN_Z, in);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStreamNullArchiverName() throws ArchiveException {
        factory.createArchiveOutputStream((String) null, new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStreamNullOutputStream() throws ArchiveException {
        factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStreamUnknownArchiver() throws ArchiveException {
        factory.createArchiveOutputStream("unknown", new ByteArrayOutputStream());
    }

    @Test
    public void testCreateArchiveOutputStreamAr() throws ArchiveException {
        OutputStream out = new ByteArrayOutputStream();
        assertNotNull(factory.createArchiveOutputStream(ArchiveStreamFactory.AR, out));
    }

    @Test
    public void testCreateArchiveOutputStreamZip() throws ArchiveException {
        OutputStream out = new ByteArrayOutputStream();
        assertNotNull(factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, out));
    }

    @Test
    public void testCreateArchiveOutputStreamTarWithoutEncoding() throws ArchiveException {
        OutputStream out = new ByteArrayOutputStream();
        assertNotNull(factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, out));
    }

    @Test
    public void testCreateArchiveOutputStreamJar() throws ArchiveException {
        OutputStream out = new ByteArrayOutputStream();
        assertNotNull(factory.createArchiveOutputStream(ArchiveStreamFactory.JAR, out));
    }

    @Test
    public void testCreateArchiveOutputStreamCpioWithoutEncoding() throws ArchiveException {
        OutputStream out = new ByteArrayOutputStream();
        assertNotNull(factory.createArchiveOutputStream(ArchiveStreamFactory.CPIO, out));
    }

    @Test(expected = StreamingNotSupportedException.class)
    public void testCreateArchiveOutputStreamSevenZThrowsStreamingNotSupported() throws ArchiveException {
        OutputStream out = new ByteArrayOutputStream();
        factory.createArchiveOutputStream(ArchiveStreamFactory.SEVEN_Z, out);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamFromStreamNull() throws ArchiveException {
        factory.createArchiveInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamFromStreamMarkNotSupported() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]) {
            @Override
            public boolean markSupported() {
                return false;
            }
        };
        factory.createArchiveInputStream(in);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStreamFromStreamNoMatch() throws ArchiveException {
        InputStream in = new ByteArrayInputStream(new byte[0]) {
            @Override
            public boolean markSupported() {
                return true;
            }

            @Override
            public synchronized void mark(int readlimit) {
                // no-op
            }

            @Override
            public synchronized void reset() throws IOException {
                // no-op
            }

            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                return -1;
            }
        };
        factory.createArchiveInputStream(in);
    }

    @Test
    public void testCreateArchiveInputStreamFromStreamZipMatch() throws ArchiveException {
        byte[] zipSig = new byte[] {0x50, 0x4B, 0x03, 0x04, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
        InputStream in = new ByteArrayInputStream(zipSig) {
            @Override
            public boolean markSupported() {
                return true;
            }
        };
        assertNotNull(factory.createArchiveInputStream(in));
    }

    @Test
    public void testCreateArchiveInputStreamFromStreamJarMatch() throws ArchiveException {
        byte[] jarSig = new byte[] {0x50, 0x4B, 0x03, 0x04, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
        InputStream in = new ByteArrayInputStream(jarSig) {
            @Override
            public boolean markSupported() {
                return true;
            }
        };
        assertNotNull(factory.createArchiveInputStream(in));
    }

    @Test
    public void testGetEntryEncodingDefault() {
        assertNull(new ArchiveStreamFactory().getEntryEncoding());
    }

    @Test
    public void testGetEntryEncodingWithEncoding() {
        ArchiveStreamFactory factoryWithEncoding = new ArchiveStreamFactory("UTF-8");
        assertEquals("UTF-8", factoryWithEncoding.getEntryEncoding());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetEntryEncodingAfterConstructorWithEncoding() {
        ArchiveStreamFactory factoryWithEncoding = new ArchiveStreamFactory("UTF-8");
        factoryWithEncoding.setEntryEncoding("ISO-8859-1");
    }

    @Test
    public void testSetEntryEncodingWhenConstructorNull() {
        ArchiveStreamFactory factoryWithNull = new ArchiveStreamFactory(null);
        factoryWithNull.setEntryEncoding("UTF-8");
        assertEquals("UTF-8", factoryWithNull.getEntryEncoding());
    }

    @Test
    public void testGetEntryEncodingInitialValue() {
        ArchiveStreamFactory fact = new ArchiveStreamFactory();
        assertNull(fact.getEntryEncoding());
    }

    @Test(expected = StreamingNotSupportedException.class)
    public void testCreateArchiveInputStreamFromStreamSevenZMatch() throws ArchiveException {
        byte[] sevenZSig = new byte[] {'7', 'z', (byte)0xBC, (byte)0xAF, 0x27, 0x1C, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
        InputStream in = new ByteArrayInputStream(sevenZSig) {
            @Override
            public boolean markSupported() {
                return true;
            }
        };
        factory.createArchiveInputStream(in);
    }
}