import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(467, plane.getPlaneType().getCapacity());
    }

    @Test
    public void hasZeroTotalWeightAtStart() {
        assertEquals(0, plane.getTotalWeight());
    }
}
