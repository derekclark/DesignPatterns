import TargetInterface.Duck;
import TargetInterface.MallardDuck;
import adaptee.Turkey;
import adaptee.WildTurkey;
import adapter.TurkeyAdapter;

/**
 * Created by work on 28/02/15.
 */
public class App {
    public static void main(String args[]){
        Duck mallard = new MallardDuck();
        System.out.println("the mallard says...");
        testDuck(mallard);

        Turkey wildTurkey = new WildTurkey();
        System.out.println("the wild turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        TurkeyAdapter adapter = new TurkeyAdapter(new WildTurkey());
        System.out.println("the turkey adapter says...");
        testDuck(adapter);
    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
