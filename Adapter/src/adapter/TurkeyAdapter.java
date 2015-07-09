package adapter;

import TargetInterface.Duck;
import adaptee.Turkey;

/**
 * Created by work on 28/02/15.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }



    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i=0; i<5; i++){
            turkey.fly();
        }
    }
}
