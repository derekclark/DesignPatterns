package Ducks;

import FlyBehaviours.FlyBehaviour;
import FlyBehaviours.FlyWithWings;
import QuackBehaviours.QuackBehaviour;

/**
 * Created by work on 25/02/15.
 */
public class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyWithWings flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
