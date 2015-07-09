package Beverages;

/**
 * Created by work on 26/02/15.
 */
public class Espresso extends Beverage{

    public Espresso(){
        description = "Beverages.Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
