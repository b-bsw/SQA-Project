package org.apache.commons.compress.changes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;

public class ChangeSetPerformerTest {

    private ChangeSetPerformer performer;
    private ChangeSet changeSet;

    @Before
    public void setUp() {
        changeSet = new ChangeSet();
        performer = new ChangeSetPerformer(changeSet);
    }

    @Test
    public void testPerformNoChanges() throws IOException {
        ArchiveInputStream in = new ArchiveInputStream() {
            private boolean done = false;
            @Override
            public ArchiveEntry getNextEntry() throws IOException {
                if (done) return null;
                done = true;
                return new ArchiveEntry() {
                    @Override
                    public String getName() { return "file.txt"; }
                    @Override
                    public long getSize() { return 5; }
                    @Override
                    public boolean isDirectory() { return false; }
                    @Override
                    public int hashCode() { return 0; }
                    @Override
                    public boolean equals(Object obj) { return false; }
                };
            }
            @Override
            public int read(byte[] b, int off, int len) throws IOException { return -1; }
            @Override
            public void close() throws IOException {}
            @Override
            public int read() throws IOException { return -1; }
        };
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ArchiveOutputStream out = new ArchiveOutputStream() {
            @Override
            public void putArchiveEntry(ArchiveEntry entry) throws IOException {}
            @Override
            public void closeArchiveEntry() throws IOException {}
            @Override
            public void write(byte[] b, int off, int len) throws IOException {}
            @Override
            public void close() throws IOException {}
            @Override
            public void finish() throws IOException {}
            @Override
            public ArchiveEntry createArchiveEntry(InputStream inputStream, String s) throws IOException { return null; }
        };
        ChangeSetResults results = performer.perform(in, out);
        assertNotNull(results);
        assertEquals(0, results.addedFromChangeSet().size());
        assertEquals(0, results.deleted().size());
    }

    @Test
    public void testPerformAddReplaceMode() throws IOException {
        final ArchiveEntry addEntry = new ArchiveEntry() {
            @Override
            public String getName() { return "newfile.txt"; }
            @Override
            public long getSize() { return 3; }
            @Override
            public boolean isDirectory() { return false; }
            @Override
            public int hashCode() { return 0; }
            @Override
            public boolean equals(Object obj) { return false; }
        };
        InputStream addInput = new ByteArrayInputStream("abc".getBytes());
        changeSet.add(addEntry, addInput, true);

        ArchiveInputStream in = new ArchiveInputStream() {
            private boolean done = false;
            @Override
            public ArchiveEntry getNextEntry() throws IOException {
                if (done) return null;
                done = true;
                return new ArchiveEntry() {
                    @Override
                    public String getName() { return "existing.txt"; }
                    @Override
                    public long getSize() { return 4; }
                    @Override
                    public boolean isDirectory() { return false; }
                    @Override
                    public int hashCode() { return 0; }
                    @Override
                    public boolean equals(Object obj) { return false; }
                };
            }
            @Override
            public int read(byte[] b, int off, int len) throws IOException { return -1; }
            @Override
            public void close() throws IOException {}
            @Override
            public int read() throws IOException { return -1; }
        };
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ArchiveOutputStream out = new ArchiveOutputStream() {
            private boolean entryWritten = false;
            @Override
            public void putArchiveEntry(ArchiveEntry entry) throws IOException {
                entryWritten = true;
                assertEquals("newfile.txt", entry.getName());
            }
            @Override
            public void closeArchiveEntry() throws IOException {
                assertTrue(entryWritten);
            }
            @Override
            public void write(byte[] b, int off, int len) throws IOException {}
            @Override
            public void close() throws IOException {}
            @Override
            public void finish() throws IOException {}
            @Override
            public ArchiveEntry createArchiveEntry(InputStream inputStream, String s) throws IOException { return null; }
        };
        ChangeSetResults results = performer.perform(in, out);
        assertTrue(results.addedFromChangeSet().contains("newfile.txt"));
        assertFalse(results.addedFromStream().contains("existing.txt"));
    }

    @Test
    public void testPerformDeleteEntry() throws IOException {
        changeSet.delete("fileToDelete.txt");
        ArchiveInputStream in = new ArchiveInputStream() {
            private int count = 0;
            @Override
            public ArchiveEntry getNextEntry() throws IOException {
                if (count >= 2) return null;
                count++;
                final String name = (count == 1) ? "fileToDelete.txt" : "keep.txt";
                return new ArchiveEntry() {
                    @Override
                    public String getName() { return name; }
                    @Override
                    public long getSize() { return 5; }
                    @Override
                    public boolean isDirectory() { return false; }
                    @Override
                    public int hashCode() { return 0; }
                    @Override
                    public boolean equals(Object obj) { return false; }
                };
            }
            @Override
            public int read(byte[] b, int off, int len) throws IOException { return -1; }
            @Override
            public void close() throws IOException {}
            @Override
            public int read() throws IOException { return -1; }
        };
        final java.util.List<String> writtenEntries = new java.util.ArrayList<String>();
        ArchiveOutputStream out = new ArchiveOutputStream() {
            @Override
            public void putArchiveEntry(ArchiveEntry entry) throws IOException {
                writtenEntries.add(entry.getName());
            }
            @Override
            public void closeArchiveEntry() throws IOException {}
            @Override
            public void write(byte[] b, int off, int len) throws IOException {}
            @Override
            public void close() throws IOException {}
            @Override
            public void finish() throws IOException {}
            @Override
            public ArchiveEntry createArchiveEntry(InputStream inputStream, String s) throws IOException { return null; }
        };
        ChangeSetResults results = performer.perform(in, out);
        assertTrue(results.deleted().contains("fileToDelete.txt"));
        assertEquals(1, writtenEntries.size());
        assertTrue(writtenEntries.contains("keep.txt"));
    }

    @Test
    public void testPerformDeleteDirectory() throws IOException {
        changeSet.deleteDir("dir");
        ArchiveInputStream in = new ArchiveInputStream() {
            private int count = 0;
            @Override
            public ArchiveEntry getNextEntry() throws IOException {
                if (count >= 2) return null;
                count++;
                final String name = (count == 1) ? "dir/file.txt" : "other.txt";
                return new ArchiveEntry() {
                    @Override
                    public String getName() { return name; }
                    @Override
                    public long getSize() { return 5; }
                    @Override
                    public boolean isDirectory() { return false; }
                    @Override
                    public int hashCode() { return 0; }
                    @Override
                    public boolean equals(Object obj) { return false; }
                };
            }
            @Override
            public int read(byte[] b, int off, int len) throws IOException { return -1; }
            @Override
            public void close() throws IOException {}
            @Override
            public int read() throws IOException { return -1; }
        };
        final java.util.List<String> writtenEntries = new java.util.ArrayList<String>();
        ArchiveOutputStream out = new ArchiveOutputStream() {
            @Override
            public void putArchiveEntry(ArchiveEntry entry) throws IOException {
                writtenEntries.add(entry.getName());
            }
            @Override
            public void closeArchiveEntry() throws IOException {}
            @Override
            public void write(byte[] b, int off, int len) throws IOException {}
            @Override
            public void close() throws IOException {}
            @Override
            public void finish() throws IOException {}
            @Override
            public ArchiveEntry createArchiveEntry(InputStream inputStream, String s) throws IOException { return null; }
        };
        ChangeSetResults results = performer.perform(in, out);
        assertTrue(results.deleted().contains("dir/file.txt"));
        assertEquals(1, writtenEntries.size());
        assertTrue(writtenEntries.contains("other.txt"));
    }

    @Test
    public void testPerformAddAfterDeleteExactMatch() throws IOException {
        final ArchiveEntry addEntry = new ArchiveEntry() {
            @Override
            public String getName() { return "file.txt"; }
            @Override
            public long getSize() { return 3; }
            @Override
            public boolean isDirectory() { return false; }
            @Override
            public int hashCode() { return 0; }
            @Override
            public boolean equals(Object obj) { return false; }
        };
        InputStream addInput = new ByteArrayInputStream("xyz".getBytes());
        changeSet.add(addEntry, addInput, false);
        changeSet.delete("file.txt");
        ArchiveInputStream in = new ArchiveInputStream() {
            @Override
            public ArchiveEntry getNextEntry() throws IOException { return null; }
            @Override
            public int read(byte[] b, int off, int len) throws IOException { return -1; }
            @Override
            public void close() throws IOException {}
            @Override
            public int read() throws IOException { return -1; }
        };
        final java.util.List<String> writtenNames = new java.util.ArrayList<String>();
        ArchiveOutputStream out = new ArchiveOutputStream() {
            @Override
            public void putArchiveEntry(ArchiveEntry entry) throws IOException {
                writtenNames.add(entry.getName());
            }
            @Override
            public void closeArchiveEntry() throws IOException {}
            @Override
            public void write(byte[] b, int off, int len) throws IOException {}
            @Override
            public void close() throws IOException {}
            @Override
            public void finish() throws IOException {}
            @Override
            public ArchiveEntry createArchiveEntry(InputStream inputStream, String s) throws IOException { return null; }
        };
        ChangeSetResults results = performer.perform(in, out);
        assertTrue(writtenNames.isEmpty());
        assertTrue(results.addedFromChangeSet().isEmpty());
    }

    @Test
    public void testIsDeletedLaterReturnsTrueWhenDeletedExact() {
        Set workingSet = new LinkedHashSet();
        Change deleteChange = new Change(Change.TYPE_DELETE, "file.txt", null);
        workingSet.add(deleteChange);
        ArchiveEntry entry = new ArchiveEntry() {
            @Override
            public String getName() { return "file.txt"; }
            @Override
            public long getSize() { return 0; }
            @Override
            public boolean isDirectory() { return false; }
            @Override
            public int hashCode() { return 0; }
            @Override
            public boolean equals(Object obj) { return false; }
        };
        boolean result = performer.isDeletedLater(workingSet, entry);
        assertTrue(result);
    }

    @Test
    public void testIsDeletedLaterReturnsFalseForNonMatchingDelete() {
        Set workingSet = new LinkedHashSet();
        Change deleteChange = new Change(Change.TYPE_DELETE, "other.txt", null);
        workingSet.add(deleteChange);
        ArchiveEntry entry = new ArchiveEntry() {
            @Override
            public String getName() { return "file.txt"; }
            @Override
            public long getSize() { return 0; }
            @Override
            public boolean isDirectory() { return false; }
            @Override
            public int hashCode() { return 0; }
            @Override
            public boolean equals(Object obj) { return false; }
        };
        boolean result = performer.isDeletedLater(workingSet, entry);
        assertFalse(result);
    }
}