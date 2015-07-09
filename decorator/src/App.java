import Beverages.Beverage;
import Beverages.DarkRoast;
import Beverages.Espresso;
import Decorators.Mocha;
import Decorators.Whip;

/**
 * Created by work on 26/02/15.
 */
public class App {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
