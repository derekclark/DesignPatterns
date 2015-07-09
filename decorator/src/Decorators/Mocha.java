package Decorators;

import Beverages.Beverage;

/**
 * Created by work on 26/02/15.
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        return 0.20 + beverage.cost();
    }
}
