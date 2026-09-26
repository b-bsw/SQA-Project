import static org.junit.Assert.*;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShapeListTest {

    private ShapeList list;
    private Shape shapeA;
    private Shape shapeB;

    @Before
    public void setUp() {
        list = new ShapeList();
        shapeA = new Rectangle2D.Double(0, 0, 10, 10);
        shapeB = new Rectangle2D.Double(20, 20, 30, 30);
    }

    @After
    public void tearDown() {
        list = null;
        shapeA = null;
        shapeB = null;
    }

    @Test
    public void testNewListIsEmpty() {
        assertEquals(0, list.size());
    }

    @Test
    public void testAdd() {
        list.add(shapeA);

        assertEquals(1, list.size());
        assertSame(shapeA, list.get(0));
    }

    @Test
    public void testAddMultipleShapes() {
        list.add(shapeA);
        list.add(shapeB);

        assertEquals(2, list.size());
        assertSame(shapeA, list.get(0));
        assertSame(shapeB, list.get(1));
    }

    @Test
    public void testRemoveFirstShape() {
        list.add(shapeA);
        list.add(shapeB);

        list.remove(shapeA);

        assertEquals(1, list.size());
        assertSame(shapeB, list.get(0));
    }

    @Test
    public void testRemoveLastShape() {
        list.add(shapeA);
        list.add(shapeB);

        list.remove(shapeB);

        assertEquals(1, list.size());
        assertSame(shapeA, list.get(0));
    }

    @Test
    public void testRemoveShapeNotFound() {
        list.add(shapeA);

        list.remove(shapeB);

        assertEquals(1, list.size());
        assertSame(shapeA, list.get(0));
    }

    @Test
    public void testRemoveUsingEqualShape() {
        list.add(shapeA);

        list.remove(new Rectangle2D.Double(0, 0, 10, 10));

        assertEquals(0, list.size());
    }
}