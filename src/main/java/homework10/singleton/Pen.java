package homework10.singleton;

public class Pen {
    private Pen() {
        System.out.println("Singleton created!");
    }

    public static final Pen INSTANCE = new Pen();

    public void write() {
        System.out.println("Pen is writing!");
    }
}
