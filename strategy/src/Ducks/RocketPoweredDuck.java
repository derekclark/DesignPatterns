package Ducks;

import FlyBehaviours.RocketPowered;
import QuackBehaviours.NoQuack;

public class RocketPoweredDuck extends Duck{
    public RocketPoweredDuck(){
        flyBehaviour = new RocketPowered();
        quackBehaviour = new NoQuack();

    }

    public void parachute(){
        System.out.println("I have a parachute");
    }
}
