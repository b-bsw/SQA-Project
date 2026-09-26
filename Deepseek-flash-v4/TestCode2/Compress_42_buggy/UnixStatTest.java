package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class UnixStatTest {

    private static final int PERM_MASK = 07777;
    private static final int LINK_FLAG = 0120000;
    private static final int FILE_FLAG = 0100000;
    private static final int DIR_FLAG = 040000;
    private static final int DEFAULT_LINK_PERM = 0777;
    private static final int DEFAULT_DIR_PERM = 0755;
    private static final int DEFAULT_FILE_PERM = 0644;

    @Test
    public void testPermMaskValue() {
        assertEquals(PERM_MASK, UnixStat.PERM_MASK);
    }

    @Test
    public void testLinkFlagValue() {
        assertEquals(LINK_FLAG, UnixStat.LINK_FLAG);
    }

    @Test
    public void testFileFlagValue() {
        assertEquals(FILE_FLAG, UnixStat.FILE_FLAG);
    }

    @Test
    public void testDirFlagValue() {
        assertEquals(DIR_FLAG, UnixStat.DIR_FLAG);
    }

    @Test
    public void testDefaultLinkPermValue() {
        assertEquals(DEFAULT_LINK_PERM, UnixStat.DEFAULT_LINK_PERM);
    }

    @Test
    public void testDefaultDirPermValue() {
        assertEquals(DEFAULT_DIR_PERM, UnixStat.DEFAULT_DIR_PERM);
    }

    @Test
    public void testDefaultFilePermValue() {
        assertEquals(DEFAULT_FILE_PERM, UnixStat.DEFAULT_FILE_PERM);
    }

    @Test
    public void testPermMaskBits() {
        int permMask = UnixStat.PERM_MASK;
        assertEquals(0, permMask & ~07777);
    }

    @Test
    public void testLinkFlagBits() {
        int linkFlag = UnixStat.LINK_FLAG;
        assertTrue((linkFlag & UnixStat.PERM_MASK) == 0);
    }

    @Test
    public void testFileFlagBits() {
        int fileFlag = UnixStat.FILE_FLAG;
        assertTrue((fileFlag & UnixStat.PERM_MASK) == 0);
    }

    @Test
    public void testDirFlagBits() {
        int dirFlag = UnixStat.DIR_FLAG;
        assertTrue((dirFlag & UnixStat.PERM_MASK) == 0);
    }

    @Test
    public void testDefaultLinkPermWithinMask() {
        assertEquals(0, UnixStat.DEFAULT_LINK_PERM & ~UnixStat.PERM_MASK);
    }

    @Test
    public void testDefaultDirPermWithinMask() {
        assertEquals(0, UnixStat.DEFAULT_DIR_PERM & ~UnixStat.PERM_MASK);
    }

    @Test
    public void testDefaultFilePermWithinMask() {
        assertEquals(0, UnixStat.DEFAULT_FILE_PERM & ~UnixStat.PERM_MASK);
    }
}