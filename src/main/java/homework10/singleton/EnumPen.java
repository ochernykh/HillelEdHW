package homework10.singleton;

public enum EnumPen {
    INSTANCE;

    private EnumPen() {
        System.out.println("Singleton created! " +
                "By the way, in Enums the constructor is private by default - " +
                "so there is no need to write private constructor by yourself");
    }
}
