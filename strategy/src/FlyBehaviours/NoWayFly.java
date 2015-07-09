package FlyBehaviours;

/**
 * Created by work on 25/02/15.
 */
public class NoWayFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
