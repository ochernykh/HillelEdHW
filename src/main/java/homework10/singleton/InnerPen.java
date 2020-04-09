package homework10.singleton;

public class InnerPen {

    private InnerPen() {
        System.out.println("InnerPen Singleton created!");
    }

    private static class SingletonHolder {
        public static final InnerPen HOLDER_INSTANCE = new InnerPen();
    }

    public static InnerPen getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}