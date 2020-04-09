package homework10.singleton;

public class LazyPen {
    private static LazyPen instance;

    private LazyPen() {
        System.out.println("Lazy Singleton created!");
    }

    public static synchronized LazyPen getInstance() {
        if (instance == null) {
            instance = new LazyPen();
        }
        return instance;
    }
}
