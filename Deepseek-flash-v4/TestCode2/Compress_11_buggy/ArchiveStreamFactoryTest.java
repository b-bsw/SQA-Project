package org.apache.commons.compress.archivers;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class ArchiveStreamFactoryTest {

    private ArchiveStreamFactory factory;
    private ByteArrayInputStream validStream;

    @Before
    public void setUp() {
        factory = new ArchiveStreamFactory();
        validStream = new ByteArrayInputStream(new byte[512]);
    }

    // --- createArchiveInputStream(String, InputStream) ---

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamNullName() throws ArchiveException {
        factory.createArchiveInputStream((String) null, validStream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamNullStream() throws ArchiveException {
        factory.createArchiveInputStream("zip", null);
    }

    @Test
    public void testCreateArchiveInputStreamAr() throws ArchiveException {
        assertNotNull(factory.createArchiveInputStream("ar", validStream));
    }

    @Test
    public void testCreateArchiveInputStreamZip() throws ArchiveException {
        assertNotNull(factory.createArchiveInputStream("ZIP", validStream));
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStreamUnknownFormat() throws ArchiveException {
        factory.createArchiveInputStream("unknown", validStream);
    }

    // --- createArchiveOutputStream(String, OutputStream) ---

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStreamNullName() throws ArchiveException {
        factory.createArchiveOutputStream(null, new java.io.ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStreamNullStream() throws ArchiveException {
        factory.createArchiveOutputStream("tar", null);
    }

    @Test
    public void testCreateArchiveOutputStreamAr() throws ArchiveException {
        assertNotNull(factory.createArchiveOutputStream("ar", new java.io.ByteArrayOutputStream()));
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStreamUnknownFormat() throws ArchiveException {
        factory.createArchiveOutputStream("unknown", new java.io.ByteArrayOutputStream());
    }

    // --- createArchiveInputStream(InputStream) ---

    @Test(expected = IllegalArgumentException.class)
    public void testCreateAutoDetectNullStream() throws ArchiveException {
        factory.createArchiveInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateAutoDetectMarkNotSupported() throws ArchiveException {
        InputStream noMark = new InputStream() {
            @Override
            public int read() throws IOException { return 0; }
            @Override
            public boolean markSupported() { return false; }
        };
        factory.createArchiveInputStream(noMark);
    }

    @Test
    public void testCreateAutoDetectZipSignature() throws ArchiveException, IOException {
        byte[] zipSig = new byte[] {0x50, 0x4B, 0x03, 0x04};
        ByteArrayInputStream zipStream = new ByteArrayInputStream(zipSig);
        assertNotNull(factory.createArchiveInputStream(zipStream));
    }

    @Test
    public void testCreateAutoDetectJarSignature() throws ArchiveException, IOException {
        byte[] jarSig = new byte[] {0x50, 0x4B, 0x03, 0x04};
        ByteArrayInputStream jarStream = new ByteArrayInputStream(jarSig);
        assertNotNull(factory.createArchiveInputStream(jarStream));
    }

    @Test
    public void testCreateAutoDetectArSignature() throws ArchiveException, IOException {
        byte[] arSig = new byte[] {0x21, 0x3C, 0x61, 0x72, 0x63, 0x68, 0x3E};
        ByteArrayInputStream arStream = new ByteArrayInputStream(arSig);
        assertNotNull(factory.createArchiveInputStream(arStream));
    }

    @Test(expected = ArchiveException.class)
    public void testCreateAutoDetectUnknownSignature() throws ArchiveException, IOException {
        byte[] unknown = new byte[] {0x00, 0x01, 0x02, 0x03};
        ByteArrayInputStream unknownStream = new ByteArrayInputStream(unknown);
        factory.createArchiveInputStream(unknownStream);
    }

    @Test
    public void testCreateAutoDetectTarViaTryBlock() throws ArchiveException, IOException {
        // Create a byte array that will fail signature checks but trigger the TarArchiveInputStream try block
        byte[] tarData = new byte[512];
        tarData[0] = 'g'; // not a valid signature but inside length
        ByteArrayInputStream tarStream = new ByteArrayInputStream(tarData);
        assertNotNull(factory.createArchiveInputStream(tarStream));
    }

    @Test(expected = ArchiveException.class)
    public void testCreateAutoDetectIoException() throws ArchiveException {
        InputStream broken = new InputStream() {
            private boolean resetCalled;
            @Override
            public int read() throws IOException { return 0; }
            @Override
            public boolean markSupported() { return true; }
            @Override
            public void mark(int readlimit) {}
            @Override
            public void reset() throws IOException {
                if (!resetCalled) {
                    resetCalled = true;
                    throw new IOException("reset failed");
                }
            }
        };
        factory.createArchiveInputStream(broken);
    }
}