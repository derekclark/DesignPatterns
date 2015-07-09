package adaptee;

/**
 * Created by work on 28/02/15.
 */
public class WildTurkey implements Turkey{
    public void gobble(){
        System.out.println("gobble");
    }

    public void fly(){
        System.out.println("i only fly short distances");
    }
}
