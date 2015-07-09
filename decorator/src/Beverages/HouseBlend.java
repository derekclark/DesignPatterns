package Beverages;

/**
 * Created by work on 26/02/15.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend";
    }
    @Override
    public double cost() {
        return .89;
    }
}
