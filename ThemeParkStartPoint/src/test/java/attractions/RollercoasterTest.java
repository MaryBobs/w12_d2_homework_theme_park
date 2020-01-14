package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(18, 2.2, 30.00);
        visitor2 = new Visitor(10, 2.2, 30.00);
        visitor3 = new Visitor(18, 1.2, 30.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedToRideRollercoaster() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void isNotAllowedToRideRollerCoaster() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void chargeDoubleFeeIfOverTwoMetres() {
        assertEquals(16.80, rollerCoaster.priceForVisitor(visitor2), 0.01);
        assertEquals(8.40, rollerCoaster.priceForVisitor(visitor3), 0.01);
    }
}
