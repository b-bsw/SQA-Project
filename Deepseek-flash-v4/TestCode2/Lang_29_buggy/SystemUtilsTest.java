package org.apache.commons.lang3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class SystemUtilsTest {

    @Test
    public void testGetUserDir() {
        assertEquals(new File(System.getProperty("user.dir")).getAbsolutePath(),
                SystemUtils.getUserDir().getAbsolutePath());
    }

    @Test
    public void testGetUserHome() {
        assertEquals(new File(System.getProperty("user.home")).getAbsolutePath(),
                SystemUtils.getUserHome().getAbsolutePath());
    }

    @Test
    public void testGetJavaHome() {
        assertEquals(new File(System.getProperty("java.home")).getAbsolutePath(),
                SystemUtils.getJavaHome().getAbsolutePath());
    }

    @Test
    public void testGetJavaIoTmpDir() {
        assertEquals(new File(System.getProperty("java.io.tmpdir")).getAbsolutePath(),
                SystemUtils.getJavaIoTmpDir().getAbsolutePath());
    }

    @Test
    public void testIsJavaAwtHeadless() {
        boolean expected = "true".equals(System.getProperty("java.awt.headless"));
        assertTrue(expected == SystemUtils.isJavaAwtHeadless());
    }

    @Test
    public void testIsJavaVersionAtLeastIntBoundaries() {
        int current = SystemUtils.JAVA_VERSION_INT;
        assertTrue(SystemUtils.isJavaVersionAtLeast(current));
        assertTrue(SystemUtils.isJavaVersionAtLeast(current - 1));
        assertFalse(SystemUtils.isJavaVersionAtLeast(current + 1));
    }

    @Test
    public void testIsJavaVersionAtLeastFloatBoundaries() {
        float current = SystemUtils.JAVA_VERSION_FLOAT;
        assertTrue(SystemUtils.isJavaVersionAtLeast(current));
        assertTrue(SystemUtils.isJavaVersionAtLeast(0.0f));
        assertFalse(SystemUtils.isJavaVersionAtLeast(current + 1.0f));
    }

    @Test
    public void testIsJavaVersionMatch() {
        assertFalse(SystemUtils.isJavaVersionMatch(null, "1"));
        assertTrue(SystemUtils.isJavaVersionMatch("1.7", "1.7"));
        assertTrue(SystemUtils.isJavaVersionMatch("1.7.0_45", "1.7"));
        assertTrue(SystemUtils.isJavaVersionMatch("1.7", "1"));
        assertFalse(SystemUtils.isJavaVersionMatch("2.7", "1"));
        assertTrue(SystemUtils.isJavaVersionMatch("1.7", ""));
    }

    @Test
    public void testIsOSNameMatch() {
        assertFalse(SystemUtils.isOSNameMatch(null, "Windows"));
        assertTrue(SystemUtils.isOSNameMatch("Windows 10", "Windows"));
        assertFalse(SystemUtils.isOSNameMatch("Mac", "Windows"));
        assertTrue(SystemUtils.isOSNameMatch("Windows", ""));
    }

    @Test
    public void testIsOSMatch() {
        assertFalse(SystemUtils.isOSMatch(null, "5.1", "Windows", "5"));
        assertFalse(SystemUtils.isOSMatch("Windows", null, "Windows", "5"));
        assertTrue(SystemUtils.isOSMatch("Windows 7", "6.1", "Windows", "6"));
        assertFalse(SystemUtils.isOSMatch("Windows 7", "6.1", "Windows", "5"));
        assertFalse(SystemUtils.isOSMatch("Windows 7", "6.1", "Mac", "6"));
        assertFalse(SystemUtils.isOSMatch("Windows", "6.1", "Windows", "7"));
    }

    @Test
    public void testToJavaVersionIntArray() {
        assertArrayEquals(new int[0], SystemUtils.toJavaVersionIntArray(null));
        assertArrayEquals(new int[] {1, 5, 2}, SystemUtils.toJavaVersionIntArray("1.5.2"));
        assertArrayEquals(new int[] {1, 5, 0, 21}, SystemUtils.toJavaVersionIntArray("1.5.0_21"));
    }

    @Test
    public void testToJavaVersionInt() {
        assertEquals(0.0, SystemUtils.toJavaVersionInt(null), 0.0);
        assertEquals(0.0, SystemUtils.toJavaVersionInt(""), 0.0);
        assertEquals(100.0, SystemUtils.toJavaVersionInt("1"), 0.01);
        assertEquals(150.0, SystemUtils.toJavaVersionInt("1.5"), 0.01);
        assertEquals(152.0, SystemUtils.toJavaVersionInt("1.5.2"), 0.01);
        assertEquals(160.0, SystemUtils.toJavaVersionInt("1.6.0_21"), 0.01);
    }

    @Test
    public void testToJavaVersionFloat() {
        assertEquals(0.0f, SystemUtils.toJavaVersionFloat(null), 0.0001f);
        assertEquals(0.0f, SystemUtils.toJavaVersionFloat(""), 0.0001f);
        assertEquals(1.0f, SystemUtils.toJavaVersionFloat("1"), 0.0001f);
        assertEquals(1.5f, SystemUtils.toJavaVersionFloat("1.5"), 0.0001f);
        assertEquals(1.52f, SystemUtils.toJavaVersionFloat("1.5.2"), 0.0001f);
        assertEquals(1.6f, SystemUtils.toJavaVersionFloat("1.6.0_21"), 0.0001f);
    }
}