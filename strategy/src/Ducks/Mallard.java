package Ducks;

import FlyBehaviours.FlyWithWings;
import QuackBehaviours.Quack;

/**
 * Created by work on 25/02/15.
 */
public class Mallard extends Duck{
    public Mallard (){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
}
