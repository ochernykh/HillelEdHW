package homework10.singleton;

public class Main {

    public static void main(String[] args) {
        //Simple Singleton
        Pen.INSTANCE.write();
        System.out.println(Pen.INSTANCE.getClass());

        //Lazy initialization
        LazyPen firstLazyPenInstance = LazyPen.getInstance();
        System.out.println(firstLazyPenInstance.getClass());
        LazyPen secondInstance = LazyPen.getInstance();//new object is not created
        System.out.println(firstLazyPenInstance == secondInstance);//true

        //Inner class initialization
        InnerPen firstInnerPenInstance = InnerPen.getInstance();
        System.out.println(firstInnerPenInstance.getClass());
        InnerPen secondInnerPenInstance = InnerPen.getInstance();

        //Enum
        System.out.println(EnumPen.INSTANCE);
        System.out.println(EnumPen.INSTANCE);
    }
}

