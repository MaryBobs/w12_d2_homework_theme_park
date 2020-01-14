import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;
    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollerCoaster;
    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void before() {
        themePark = new ThemePark("Adventure Towers");
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 9);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 8);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 5);
        visitor1 = new Visitor(18, 2.2, 30.00);
        visitor2 = new Visitor(10, 1.2, 20.00);
    }

    @Test
    public void hasName() {
        assertEquals("Adventure Towers", themePark.getName());
    }

    @Test
    public void canGetReviewedObjects() {
        assertEquals(2, themePark.getAllReviewed());
    }

    @Test
    public void canVisitAnAttraction() {
        themePark.visit(visitor1, park);
        assertEquals(1, park.getVisitCount());
        assertEquals(1, visitor1.countVistedAttractions());
    }
}
