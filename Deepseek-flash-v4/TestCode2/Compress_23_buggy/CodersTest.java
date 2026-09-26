package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CodersTest {

    private ByteArrayInputStream emptyInputStream;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() {
        emptyInputStream = new ByteArrayInputStream(new byte[0]);
        outputStream = new ByteArrayOutputStream();
    }

    @Test
    public void testAddDecoder_COPY() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.COPY.getId();
        coder.properties = new byte[0];
        InputStream result = Coders.addDecoder(emptyInputStream, coder, null);
        assertNotNull(result);
        assertSame(emptyInputStream, result);
    }

    @Test(expected = IOException.class)
    public void testAddDecoder_UnsupportedMethod() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = new byte[]{0x00, 0x00};
        Coders.addDecoder(emptyInputStream, coder, null);
    }

    @Test
    public void testAddEncoder_COPY() throws IOException {
        OutputStream result = Coders.addEncoder(outputStream, SevenZMethod.COPY, null);
        assertNotNull(result);
        assertSame(outputStream, result);
    }

    @Test(expected = IOException.class)
    public void testAddEncoder_UnsupportedMethod() throws IOException {
        Coders.addEncoder(outputStream, new SevenZMethod(new byte[]{0x00, 0x00}), null);
    }

    @Test
    public void testAddDecoder_LZMA_Success() throws IOException {
        byte[] props = new byte[5];
        props[0] = 0x5D; // lc=3, lp=0, pb=2
        props[1] = 0x00; // dict size low byte
        props[2] = 0x10; // dict size byte 1
        props[3] = 0x00; // dict size byte 2
        props[4] = 0x00; // dict size byte 3
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.LZMA.getId();
        coder.properties = props;
        InputStream result = Coders.addDecoder(emptyInputStream, coder, null);
        assertNotNull(result);
    }

    @Test(expected = IOException.class)
    public void testAddDecoder_LZMA_DictTooLarge() throws IOException {
        byte[] props = new byte[5];
        props[0] = 0x5D;
        props[1] = (byte) 0xFF;
        props[2] = (byte) 0xFF;
        props[3] = (byte) 0xFF;
        props[4] = (byte) 0xFF;
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.LZMA.getId();
        coder.properties = props;
        Coders.addDecoder(emptyInputStream, coder, null);
    }

    @Test(expected = IOException.class)
    public void testLZMADecoder_Decode_NullProperties() throws IOException {
        byte[] props = new byte[0];
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.LZMA.getId();
        coder.properties = props;
        Coders.addDecoder(emptyInputStream, coder, null);
    }

    @Test
    public void testAddDecoder_DEFLATE_Success() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.DEFLATE.getId();
        coder.properties = new byte[0];
        InputStream result = Coders.addDecoder(emptyInputStream, coder, null);
        assertNotNull(result);
    }

    @Test
    public void testAddDecoder_BZIP2_Success() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.BZIP2.getId();
        coder.properties = new byte[0];
        InputStream result = Coders.addDecoder(emptyInputStream, coder, null);
        assertNotNull(result);
    }

    @Test(expected = IOException.class)
    public void testAddDecoder_AES256SHA256_NullPassword() throws IOException {
        byte[] props = new byte[2];
        props[0] = 0x01; // numCyclesPower=1, saltSize=0, ivSize=1
        props[1] = 0x01; // ivSize low 4 bits = 1, saltSize high 4 bits = 0
        byte[] extendedProps = new byte[2 + 1];
        extendedProps[0] = props[0];
        extendedProps[1] = props[1];
        extendedProps[2] = 0x00; // IV byte
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = extendedProps;
        Coders.addDecoder(emptyInputStream, coder, null);
    }

    @Test(expected = IOException.class)
    public void testAddDecoder_AES256SHA256_PropertiesTooShort() throws IOException {
        byte[] props = new byte[2];
        props[0] = (byte) 0xC0; // saltSize=1, ivSize=0
        props[1] = 0x10; // saltSize high 4 bits = 1, ivSize low 4 bits = 0
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = props;
        Coders.addDecoder(emptyInputStream, coder, new byte[]{'p'});
    }

    @Test
    public void testLZMADecoder_Decode_SmallDict() throws IOException {
        byte[] props = new byte[5];
        props[0] = 0x5D;
        props[1] = 0x01;
        props[2] = 0x00;
        props[3] = 0x00;
        props[4] = 0x00;
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.LZMA.getId();
        coder.properties = props;
        InputStream result = Coders.addDecoder(emptyInputStream, coder, null);
        assertNotNull(result);
    }

    @Test
    public void testCopyDecoder_Encode() {
        CopyDecoder decoder = new CopyDecoder();
        OutputStream result = decoder.encode(outputStream, null);
        assertSame(outputStream, result);
    }

    @Test
    public void testDeflateDecoder_Encode() {
        DeflateDecoder decoder = new DeflateDecoder();
        OutputStream result = decoder.encode(outputStream, null);
        assertNotNull(result);
    }

    @Test
    public void testBZIP2Decoder_Encode() throws IOException {
        BZIP2Decoder decoder = new BZIP2Decoder();
        OutputStream result = decoder.encode(outputStream, null);
        assertNotNull(result);
    }

    @Test(expected = IOException.class)
    public void testAES256SHA256Decoder_Decode_SaltIvTooLong() throws IOException {
        byte[] props = new byte[2];
        props[0] = (byte) 0xFF; // saltSize=1, ivSize=63
        props[1] = (byte) 0xFF; // ivSize low 4 bits = 15, saltSize high 4 bits = 15
        byte[] extendedProps = new byte[2 + 16 + 16 + 1];
        extendedProps[0] = props[0];
        extendedProps[1] = props[1];
        Arrays.fill(extendedProps, 2, extendedProps.length, (byte) 0);
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = extendedProps;
        Coders.addDecoder(emptyInputStream, coder, new byte[] {'p'});
    }

    @Test(expected = IOException.class)
    public void testAES256SHA256Decoder_Decode_PropertiesTooShortForSaltIv() throws IOException {
        byte[] props = new byte[2];
        props[0] = (byte) 0xC0; // saltSize=1, ivSize=0
        props[1] = 0x10; // saltSize high 4 bits = 1
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = props;
        Coders.addDecoder(emptyInputStream, coder, new byte[] {'p'});
    }

    private static class Coder {
        byte[] decompressionMethodId;
        byte[] properties;
    }
}