package Beverages;

/**
 * Created by work on 26/02/15.
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description="Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
