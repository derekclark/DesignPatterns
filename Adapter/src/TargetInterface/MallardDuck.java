package TargetInterface;

/**
 * Created by work on 28/02/15.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
