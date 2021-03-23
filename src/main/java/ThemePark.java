import behaviours.IReviewed;

import java.util.ArrayList;


public class ThemePark {

    private String name;
    private ArrayList<IReviewed> reviewedItems;

   public ThemePark (String name) {
        this.name = name;
        this.reviewedItems = new ArrayList<IReviewed>();
    }

    public String getName() {
        return name;
    }

    public void addReviewedItem(IReviewed reviewedItem) {
       this.reviewedItems.add(reviewedItem);
    }

    public int getAllReviewed(){
       return this.reviewedItems.size();
    }
}
