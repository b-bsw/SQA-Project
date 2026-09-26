package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TypeHandlerTest {

    private File tempFile;

    @Before
    public void setUp() throws Exception {
        tempFile = File.createTempFile("TypeHandlerTest", ".tmp");
    }

    @After
    public void tearDown() {
        if (tempFile != null) {
            tempFile.delete();
        }
    }

    @Test
    public void testCreateValueObjectOverload() {
        Object value = TypeHandler.createValue("abc", (Object) String.class);
        assertEquals("abc", value);
    }

    @Test
    public void testCreateValueMappings() throws Exception {
        Object stringValue = TypeHandler.createValue("abc", String.class);
        assertEquals("abc", stringValue);

        Object objectValue = TypeHandler.createValue("java.lang.StringBuilder", Object.class);
        assertTrue(objectValue instanceof StringBuilder);

        Object numberValue = TypeHandler.createValue("42", Number.class);
        assertTrue(numberValue instanceof Number);
        assertEquals(42L, ((Number) numberValue).longValue());
        assertTrue(numberValue instanceof Long);

        Object classValue = TypeHandler.createValue("java.lang.String", Class.class);
        assertSame(String.class, classValue);

        Object fileValue = TypeHandler.createValue("sample.txt", File.class);
        assertEquals(new File("sample.txt"), fileValue);

        Object urlValue = TypeHandler.createValue("http://www.example.com", URL.class);
        assertEquals("http://www.example.com", urlValue.toString());
    }

    @Test
    public void testCreateValueUnsupportedType() {
        assertNull(TypeHandler.createValue("value", StringBuilder.class));
        assertNull(TypeHandler.createValue("value", (Class<?>) null));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValueDateUnsupported() {
        TypeHandler.createValue("2020-01-01", Date.class);
    }

    @Test
    public void testCreateValueExistingFile() throws Exception {
        Object value = TypeHandler.createValue(tempFile.getAbsolutePath(), FileInputStream.class);
        assertTrue(value instanceof FileInputStream);
        ((FileInputStream) value).close();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValueFilesUnsupported() {
        TypeHandler.createValue("file1,file2", File[].class);
    }

    @Test
    public void testCreateNumberWhole() {
        Number number = TypeHandler.createNumber("42");
        assertTrue(number instanceof Long);
        assertEquals(42L, number.longValue());
    }

    @Test
    public void testCreateNumberDecimal() {
        Number number = TypeHandler.createNumber("4.2");
        assertTrue(number instanceof Double);
        assertEquals(4.2, number.doubleValue(), 0.0001);
    }

    @Test(expected = ParseException.class)
    public void testCreateNumberInvalid() throws Exception {
        TypeHandler.createNumber("");
    }

    @Test(expected = NullPointerException.class)
    public void testCreateNumberNull() {
        TypeHandler.createNumber(null);
    }

    @Test
    public void testCreateClassExisting() throws Exception {
        assertSame(String.class, TypeHandler.createClass("java.lang.String"));
    }

    @Test(expected = ParseException.class)
    public void testCreateClassUnknown() throws Exception {
        TypeHandler.createClass("no.such.Class");
    }

    @Test
    public void testCreateObjectExisting() throws Exception {
        Object object = TypeHandler.createObject("java.lang.StringBuilder");
        assertTrue(object instanceof StringBuilder);
    }

    @Test(expected = ParseException.class)
    public void testCreateObjectUnknown() throws Exception {
        TypeHandler.createObject("no.such.Class");
    }

    @Test(expected = ParseException.class)
    public void testCreateObjectCannotInstantiate() throws Exception {
        TypeHandler.createObject("java.lang.Integer");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateDateUnsupported() {
        TypeHandler.createDate("2020-01-01");
    }

    @Test
    public void testCreateURLValid() throws Exception {
        URL url = TypeHandler.createURL("http://www.example.com/path");
        assertEquals("http://www.example.com/path", url.toString());
    }

    @Test(expected = ParseException.class)
    public void testCreateURLInvalid() throws Exception {
        TypeHandler.createURL("not a url");
    }

    @Test
    public void testCreateFile() {
        File file = TypeHandler.createFile("sample.txt");
        assertNotNull(file);
        assertEquals("sample.txt", file.getPath());
    }

    @Test
    public void testOpenFileExisting() throws Exception {
        FileInputStream in = TypeHandler.openFile(tempFile.getAbsolutePath());
        assertNotNull(in);
        in.close();
    }

    @Test(expected = ParseException.class)
    public void testOpenFileNonExistent() throws Exception {
        String path = tempFile.getAbsolutePath();
        assertTrue(tempFile.delete());
        TypeHandler.openFile(path);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateFilesUnsupported() {
        TypeHandler.createFiles("a,b");
    }
}