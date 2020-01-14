import attractions.Attraction;
import attractions.Park;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviews;

    public ThemePark(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.reviews;
    }


    public void visit(Visitor visitor, Attraction attraction) {
        attraction.addVisit();
        visitor.addAttraction(attraction);
    }
}
