package org.apache.commons.math.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;

public class RotationTest {

    private static final double EPS = 1e-10;

    private static final RotationOrder[] ORDERS = {
        RotationOrder.XYZ, RotationOrder.XZY, RotationOrder.YXZ, RotationOrder.YZX,
        RotationOrder.ZXY, RotationOrder.ZYX, RotationOrder.XYX, RotationOrder.XZX,
        RotationOrder.YXY, RotationOrder.YZY, RotationOrder.ZXZ, RotationOrder.ZYZ
    };

    @Test
    public void testQuaternionConstructorAndGetters() {
        Rotation r = new Rotation(1.0, 0.0, 0.0, 0.0, false);
        assertEquals(1.0, r.getQ0(), EPS);
        assertEquals(0.0, r.getQ1(), EPS);
        assertEquals(0.0, r.getQ2(), EPS);
        assertEquals(0.0, r.getQ3(), EPS);
    }

    @Test
    public void testQuaternionNormalization() {
        Rotation r = new Rotation(2.0, 2.0, 2.0, 2.0, true);
        assertEquals(0.5, r.getQ0(), EPS);
        assertEquals(0.5, r.getQ1(), EPS);
        assertEquals(0.5, r.getQ2(), EPS);
        assertEquals(0.5, r.getQ3(), EPS);
    }

    @Test(expected = RuntimeException.class)
    public void testAxisAngleRejectsZeroAxis() {
        new Rotation(new Vector3D(0.0, 0.0, 0.0), 1.0);
    }

    @Test
    public void testAxisAngleRotation() {
        Rotation r = new Rotation(new Vector3D(0.0, 0.0, 1.0), Math.PI / 2);
        assertEquals(Math.PI / 2, r.getAngle(), EPS);
        assertEquals(0.0, r.getAxis().getX(), EPS);
        assertEquals(0.0, r.getAxis().getY(), EPS);
        assertEquals(1.0, r.getAxis().getZ(), EPS);
    }

    @Test(expected = NotARotationMatrixException.class)
    public void testMatrixConstructorRejectsBadDimensions() throws Exception {
        new Rotation(new double[2][3], 1e-10);
    }

    @Test(expected = NotARotationMatrixException.class)
    public void testMatrixConstructorRejectsNegativeDeterminant() throws Exception {
        new Rotation(new double[][] {{1, 0, 0}, {0, 1, 0}, {0, 0, -1}}, 1e-10);
    }

    @Test
    public void testMatrixConstructorKnownMatrices() throws Exception {
        Rotation rx = new Rotation(new double[][] {{1, 0, 0}, {0, -1, 0}, {0, 0, -1}}, 1e-10);
        assertEquals(0.0, rx.getQ0(), EPS);
        assertEquals(1.0, Math.abs(rx.getQ1()), EPS);

        Rotation ry = new Rotation(new double[][] {{-1, 0, 0}, {0, 1, 0}, {0, 0, -1}}, 1e-10);
        assertEquals(0.0, ry.getQ0(), EPS);
        assertEquals(1.0, Math.abs(ry.getQ2()), EPS);

        Rotation rz = new Rotation(new double[][] {{-1, 0, 0}, {0, -1, 0}, {0, 0, 1}}, 1e-10);
        assertEquals(0.0, rz.getQ0(), EPS);
        assertEquals(1.0, Math.abs(rz.getQ3()), EPS);
    }

    @Test
    public void testMatrixRoundTrip() throws Exception {
        Rotation original = new Rotation(new Vector3D(1.0, -2.0, 3.0), 0.7);
        Rotation rebuilt = new Rotation(original.getMatrix(), 1e-10);
        assertEquals(original.getQ0(), rebuilt.getQ0(), 1e-9);
        assertEquals(original.getQ1(), rebuilt.getQ1(), 1e-9);
        assertEquals(original.getQ2(), rebuilt.getQ2(), 1e-9);
        assertEquals(original.getQ3(), rebuilt.getQ3(), 1e-9);
    }

    @Test(expected = RuntimeException.class)
    public void testVectorRotationRejectsZeroVector() {
        new Rotation(new Vector3D(0.0, 0.0, 0.0), Vector3D.PLUS_I);
    }

    @Test
    public void testVectorRotationMapsVector() {
        Rotation r = new Rotation(Vector3D.PLUS_I, Vector3D.PLUS_K);
        Vector3D mapped = r.applyTo(Vector3D.PLUS_I);
        assertEquals(0.0, mapped.getX(), EPS);
        assertEquals(0.0, mapped.getY(), EPS);
        assertEquals(1.0, mapped.getZ(), EPS);
    }

    @Test
    public void testVectorRotationOppositeVectors() {
        Rotation r = new Rotation(Vector3D.PLUS_I, new Vector3D(-1.0, 0.0, 0.0));
        assertEquals(0.0, r.getQ0(), EPS);
        Vector3D mapped = r.applyTo(Vector3D.PLUS_I);
        assertEquals(-1.0, mapped.getX(), EPS);
        assertEquals(0.0, mapped.getY(), EPS);
        assertEquals(0.0, mapped.getZ(), EPS);
    }

    @Test(expected = RuntimeException.class)
    public void testFourVectorRejectsZeroVector() {
        new Rotation(Vector3D.PLUS_I, Vector3D.PLUS_J, Vector3D.PLUS_I, new Vector3D(0.0, 0.0, 0.0));
    }

    @Test
    public void testFourVectorConstructors() {
        Rotation identity = new Rotation(Vector3D.PLUS_I, Vector3D.PLUS_J, Vector3D.PLUS_I, Vector3D.PLUS_J);
        assertEquals(1.0, identity.getQ0(), EPS);
        assertEquals(0.0, identity.getQ1(), EPS);
        assertEquals(0.0, identity.getQ2(), EPS);
        assertEquals(0.0, identity.getQ3(), EPS);

        Rotation quarter = new Rotation(Vector3D.PLUS_I, Vector3D.PLUS_J, Vector3D.PLUS_J, new Vector3D(-1.0, 0.0, 0.0));
        assertEquals(-Math.sqrt(2.0) / 2.0, quarter.getQ0(), EPS);
        assertEquals(0.0, quarter.getQ1(), EPS);
        assertEquals(0.0, quarter.getQ2(), EPS);
        assertEquals(Math.sqrt(2.0) / 2.0, quarter.getQ3(), EPS);
    }

    @Test
    public void testGetAnglesForAllOrders() throws Exception {
        Rotation original = new Rotation(new Vector3D(0.2, -1.3, 2.1), 0.37);
        for (RotationOrder order : ORDERS) {
            double[] angles = original.getAngles(order);
            assertEquals(3, angles.length);
            Rotation rebuilt = new Rotation(order, angles[0], angles[1], angles[2]);
            double dot = original.getQ0() * rebuilt.getQ0() +
                         original.getQ1() * rebuilt.getQ1() +
                         original.getQ2() * rebuilt.getQ2() +
                         original.getQ3() * rebuilt.getQ3();
            assertEquals(1.0, Math.abs(dot), 1e-9);
        }
    }

    @Test(expected = CardanEulerSingularityException.class)
    public void testGetAnglesSingularity() throws Exception {
        new Rotation(new Vector3D(0.0, 1.0, 0.0), Math.PI / 2).getAngles(RotationOrder.XYZ);
    }

    @Test
    public void testApplyAndApplyInverseVector() {
        Rotation r = new Rotation(new Vector3D(1.0, -2.0, 0.5), 0.9);
        Vector3D u = new Vector3D(2.0, -1.0, 3.0);
        Vector3D rotated = r.applyTo(u);
        Vector3D back = r.applyInverseTo(rotated);
        assertEquals(u.getX(), back.getX(), EPS);
        assertEquals(u.getY(), back.getY(), EPS);
        assertEquals(u.getZ(), back.getZ(), EPS);
    }

    @Test
    public void testCompositionWithRevertIsIdentity() {
        Rotation r = new Rotation(new Vector3D(1.0, 0.0, 0.0), 0.8);
        Rotation composed = r.applyTo(r.revert());
        assertEquals(1.0, Math.abs(composed.getQ0()), EPS);
        assertEquals(0.0, composed.getQ1(), EPS);
        assertEquals(0.0, composed.getQ2(), EPS);
        assertEquals(0.0, composed.getQ3(), EPS);

        Rotation composed2 = r.applyInverseTo(r);
        assertEquals(1.0, Math.abs(composed2.getQ0()), EPS);
        assertEquals(0.0, composed2.getQ1(), EPS);
        assertEquals(0.0, composed2.getQ2(), EPS);
        assertEquals(0.0, composed2.getQ3(), EPS);
    }

    @Test
    public void testDistance() {
        Rotation r = new Rotation(new Vector3D(1.0, 0.0, 0.0), 0.3);
        assertEquals(0.0, Rotation.distance(r, r), EPS);
        assertEquals(r.getAngle(), Rotation.distance(Rotation.IDENTITY, r), 1e-9);
    }

    @Test
    public void testGetAxisAndAngleBranches() {
        Rotation id = Rotation.IDENTITY;
        assertEquals(1.0, id.getAxis().getX(), EPS);
        assertEquals(0.0, id.getAngle(), EPS);

        Rotation negative = new Rotation(-0.5, Math.sqrt(0.75), 0.0, 0.0, false);
        assertEquals(1.0, negative.getAxis().getX(), EPS);
        assertEquals(2.0 * Math.acos(0.5), negative.getAngle(), EPS);

        Rotation smallNegative = new Rotation(-0.05, Math.sqrt(0.9975), 0.0, 0.0, false);
        Rotation smallPositive = new Rotation(0.05, Math.sqrt(0.9975), 0.0, 0.0, false);
        assertEquals(2.0 * Math.acos(0.05), smallNegative.getAngle(), EPS);
        assertEquals(2.0 * Math.acos(0.05), smallPositive.getAngle(), EPS);
    }
}