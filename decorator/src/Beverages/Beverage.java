package Beverages;

/**
 * Created by work on 26/02/15.
 */
public abstract class Beverage {
    String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
