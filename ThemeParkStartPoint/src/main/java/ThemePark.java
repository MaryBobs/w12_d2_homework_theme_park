import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;


import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> reviews;

    public ThemePark(String name) {
        this.name = name;
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

    public void add(IReviewed reviewed) {
        this.reviews.add(reviewed);
    }
}
