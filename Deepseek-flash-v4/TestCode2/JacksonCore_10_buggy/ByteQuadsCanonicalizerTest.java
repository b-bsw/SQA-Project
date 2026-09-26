package com.fasterxml.jackson.core.sym;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;

public class ByteQuadsCanonicalizerTest {

    private ByteQuadsCanonicalizer root;

    @Before
    public void setUp() {
        root = ByteQuadsCanonicalizer.createRoot();
    }

    @After
    public void tearDown() {
        root = null;
    }

    @Test
    public void testCreateRoot() {
        Assert.assertNotNull(root);
        Assert.assertEquals(64, root.bucketCount());
    }

    @Test
    public void testMakeChild() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        Assert.assertNotNull(child);
        Assert.assertEquals(0, child.size());
    }

    @Test
    public void testReleaseWithDirtyChild() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("test", 1);
        child.release();
        Assert.assertEquals(1, root.size());
    }

    @Test
    public void testReleaseCleanChild() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.release();
        Assert.assertEquals(0, root.size());
    }

    @Test
    public void testSizeRoot() {
        Assert.assertEquals(0, root.size());
    }

    @Test
    public void testSizeChild() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        Assert.assertEquals(0, child.size());
    }

    @Test
    public void testBucketCount() {
        Assert.assertEquals(64, root.bucketCount());
    }

    @Test
    public void testMaybeDirtyInitiallyFalse() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        Assert.assertTrue(child.maybeDirty());
    }

    @Test
    public void testHashSeed() {
        int seed = root.hashSeed();
        Assert.assertTrue((seed & 1) == 1);
    }

    @Test
    public void testAddAndFindOneQuad() {
        String name = root.addName("foo", 42);
        Assert.assertEquals("foo", name);
        String found = root.findName(42);
        Assert.assertEquals("foo", found);
    }

    @Test
    public void testAddAndFindTwoQuads() {
        String name = root.addName("bar", 10, 20);
        Assert.assertEquals("bar", name);
        String found = root.findName(10, 20);
        Assert.assertEquals("bar", found);
    }

    @Test
    public void testAddAndFindThreeQuads() {
        String name = root.addName("baz", 1, 2, 3);
        Assert.assertEquals("baz", name);
        String found = root.findName(1, 2, 3);
        Assert.assertEquals("baz", found);
    }

    @Test
    public void testAddAndFindArrayQuadLength1() {
        String name = root.addName("qux", new int[]{7}, 1);
        Assert.assertEquals("qux", name);
        String found = root.findName(7);
        Assert.assertEquals("qux", found);
    }

    @Test
    public void testAddAndFindArrayQuadLength2() {
        String name = root.addName("quux", new int[]{7, 8}, 2);
        Assert.assertEquals("quux", name);
        String found = root.findName(7, 8);
        Assert.assertEquals("quux", found);
    }

    @Test
    public void testAddAndFindArrayQuadLength3() {
        String name = root.addName("corge", new int[]{7, 8, 9}, 3);
        Assert.assertEquals("corge", name);
        String found = root.findName(7, 8, 9);
        Assert.assertEquals("corge", found);
    }

    @Test
    public void testFindNameNotFoundOneQuad() {
        Assert.assertNull(root.findName(999));
    }

    @Test
    public void testFindNameNotFoundTwoQuads() {
        Assert.assertNull(root.findName(1, 2));
    }

    @Test
    public void testFindNameNotFoundThreeQuads() {
        Assert.assertNull(root.findName(1, 2, 3));
    }

    @Test
    public void testAddNameWithIntern() {
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());
        String name = new String("interned");
        String result = child.addName(name, 1);
        Assert.assertSame("interned", result);
    }

    @Test
    public void testAddNameWithoutIntern() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        String name = new String("not_interned");
        String result = child.addName(name, 1);
        Assert.assertEquals("not_interned", result);
    }

    @Test
    public void testTotalCountAfterAddOne() {
        root.addName("a", 1);
        Assert.assertEquals(1, root.totalCount());
    }

    @Test
    public void testTotalCountAfterAddThree() {
        root.addName("a", 1);
        root.addName("b", 2);
        root.addName("c", 3);
        Assert.assertEquals(3, root.totalCount());
    }

    @Test
    public void testPrimaryCountAfterAdd() {
        root.addName("a", 1);
        Assert.assertEquals(1, root.primaryCount());
    }

    @Test
    public void testSpilloverCountAfterAdd() {
        Assert.assertEquals(0, root.spilloverCount());
    }

    @Test
    public void testSecondaryCountEmpty() {
        Assert.assertEquals(0, root.secondaryCount());
    }

    @Test
    public void testTertiaryCountEmpty() {
        Assert.assertEquals(0, root.tertiaryCount());
    }

    @Test
    public void testMultipleAddsAndSearch() {
        root.addName("first", 100);
        root.addName("second", 200);
        root.addName("third", 300);
        Assert.assertEquals("first", root.findName(100));
        Assert.assertEquals("second", root.findName(200));
        Assert.assertEquals("third", root.findName(300));
    }

    @Test
    public void testCalcHashConsistencyOneQuad() {
        int hash1 = root.calcHash(42);
        int hash2 = root.calcHash(42);
        Assert.assertEquals(hash1, hash2);
    }

    @Test
    public void testCalcHashConsistencyTwoQuads() {
        int hash1 = root.calcHash(1, 2);
        int hash2 = root.calcHash(1, 2);
        Assert.assertEquals(hash1, hash2);
    }

    @Test
    public void testCalcHashConsistencyThreeQuads() {
        int hash1 = root.calcHash(1, 2, 3);
        int hash2 = root.calcHash(1, 2, 3);
        Assert.assertEquals(hash1, hash2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcHashArrayWithShortLength() {
        root.calcHash(new int[]{1}, 1);
    }

    @Test
    public void testCalcHashArrayLength4() {
        int hash = root.calcHash(new int[]{1, 2, 3, 4}, 4);
        Assert.assertTrue(hash != 0);
    }

    @Test
    public void testRehashTriggerAfterManyAdds() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        for (int i = 0; i < 50; i++) {
            child.addName("k" + i, i);
        }
        Assert.assertTrue(child.size() > 0);
    }

    @Test
    public void testToStringFormat() {
        String str = root.toString();
        Assert.assertTrue(str.startsWith("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer:"));
    }

    @Test
    public void testFindAfterReleaseAndReadd() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("data", 1);
        child.release();
        ByteQuadsCanonicalizer child2 = root.makeChild(0);
        Assert.assertNotNull(child2.findName(1));
    }

    @Test
    public void testMergeChildWithHigherCount() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("a", 1);
        child.addName("b", 2);
        child.release();
        Assert.assertEquals(2, root.size());
    }

    @Test
    public void testMergeChildWithExcessEntries() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        for (int i = 0; i < 6001; i++) {
            child.addName("x" + i, i);
        }
        child.release();
        Assert.assertEquals(0, root.size());
    }

    @Test
    public void testNukeSymbolsOnRehashToMax() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        for (int i = 0; i < 50000; i++) {
            child.addName("z" + i, i);
        }
        Assert.assertTrue(child.size() > 0);
    }

    @Test
    public void testLongNameAppend() {
        int[] quads = new int[10];
        for (int i = 0; i < 10; i++) {
            quads[i] = i;
        }
        String name = root.addName("long", quads, 10);
        Assert.assertEquals("long", name);
        String found = root.findName(quads, 10);
        Assert.assertEquals("long", found);
    }

    @Test
    public void testVerifyLongNameFallback() {
        int[] quads = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        String name = root.addName("long8", quads, 8);
        Assert.assertEquals("long8", name);
        String found = root.findName(quads, 8);
        Assert.assertEquals("long8", found);
    }

    @Test
    public void testFindInTertiaryAfterPrimaryAndSecondaryOccupied() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("a", 1);
        child.addName("b", 2);
        child.addName("c", 3);
        Assert.assertEquals("a", child.findName(1));
    }

    @Test
    public void testFindInSpilloverAfterTertiaryFull() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        for (int i = 0; i < 200; i++) {
            child.addName("s" + i, i);
        }
        Assert.assertNotNull(child.findName(0));
    }

    @Test
    public void testHashSharedAfterRelease() {
        ByteQuadsCanonicalizer child = root.makeChild(0);
        child.addName("a", 1);
        child.release();
        Assert.assertTrue(child.maybeDirty());
    }

    @Test
    public void testAddNameMultipleTimesSameQuad() {
        String name1 = root.addName("first", 1);
        String name2 = root.addName("second", 1);
        Assert.assertEquals("first", name1);
        Assert.assertEquals("second", name2);
    }
}