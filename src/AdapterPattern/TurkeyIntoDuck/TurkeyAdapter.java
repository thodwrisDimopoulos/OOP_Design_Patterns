package AdapterPattern.TurkeyIntoDuck;

/**
 * Created by theo on 7/1/16.
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey=turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0;i<5;i++)
            turkey.fly();
    }
}
