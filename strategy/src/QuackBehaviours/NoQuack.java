package QuackBehaviours;

/**
 * Created by work on 25/02/15.
 */
public class NoQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I can quack");
    }
}
