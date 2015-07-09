package Decorators;

import Beverages.Beverage;

/**
 * Created by work on 26/02/15.
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }


}
