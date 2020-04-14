package homework11;

public class FlyingFish extends Fish implements IFlyable {

    public FlyingFish(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I also can fly...or jump from water");
    }
}
