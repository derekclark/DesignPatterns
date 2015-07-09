package Beverages;

/**
 * Created by work on 26/02/15.
 */
public class Decaf extends Beverage{
    public Decaf(){
        description="Beverages.Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
