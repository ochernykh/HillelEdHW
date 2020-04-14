package homework11;

public class Penguin extends Bird implements ISwimmable {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void see() {
        System.out.printf("Penguin can see far away ");
    }

    @Override
    public void fly() {
        System.out.println("I don't have wings, I just can move my hands \uD83D\uDC27");
    }

    @Override
    public void swim() {
        System.out.println("I'm a bird, and can't fly, but I can...swim \uD83D\uDC27");

    }
}
