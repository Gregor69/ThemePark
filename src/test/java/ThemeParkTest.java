import attractions.*;
import org.junit.Before;
import org.junit.Test;
import stalls.*;

import static org.junit.Assert.assertEquals;


public class ThemeParkTest {

    ThemePark themePark;
    Attraction attraction;
    Stall stall;

    @Before
    public void before() {
        themePark = new ThemePark("Six Flags: Charing Cross");
        attraction = new Dodgems("Bumper Cars", 5);
        attraction = new Park("Leafy Meadows", 9);
        attraction = new Playground("Fun Zone", 7);
        attraction = new RollerCoaster("Blue Ridge", 10);
        stall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1);
        stall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4);
        stall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Six Flags: Charing Cross", themePark.getName());
    }

    @Test
    public void canAddReviewed() {
        themePark.addReviewedItem(attraction);
        themePark.addReviewedItem(attraction);
        themePark.addReviewedItem(attraction);
        themePark.addReviewedItem(attraction);
        assertEquals(4, themePark.getAllReviewed());
    }
    @Test
    public void getAllReviewed(){
        themePark.addReviewedItem(stall);
        themePark.addReviewedItem(stall);
        themePark.addReviewedItem(stall);
        assertEquals(3, themePark.getAllReviewed());
    }
}