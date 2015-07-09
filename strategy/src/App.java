import Ducks.Duck;
import Ducks.Mallard;
import Ducks.RocketPoweredDuck;
import Ducks.RubberDuck;
import FlyBehaviours.FlyWithWings;

public class App {
    public static void main(String args[]){
        Duck mallard = new Mallard();
        mallard.performFly();
        mallard.performQuack();

        Duck rubberDuck = new RubberDuck();

        rubberDuck.performFly();
        rubberDuck.performQuack();

        System.out.println("let's dynamically change the flying behaviour of rubber duck");
        rubberDuck.setFlyBehaviour(new FlyWithWings());
        rubberDuck.performFly();

        System.out.println("new type of duck added with another method added which is not in Duck class");
        System.out.println("so we have to create it with a type of RocketPoweredDuck to access the new method as Duck cannot see it");
        RocketPoweredDuck rocketPoweredDuck = new RocketPoweredDuck();
        rocketPoweredDuck.performFly();
        rocketPoweredDuck.performQuack();
        rocketPoweredDuck.parachute();
    }
}
