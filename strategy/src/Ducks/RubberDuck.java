package Ducks;

import QuackBehaviours.NoQuack;
import FlyBehaviours.NoWayFly;

/**
 * Created by work on 25/02/15.
 */
public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehaviour = new NoQuack();
        flyBehaviour = new NoWayFly();
    }
}
