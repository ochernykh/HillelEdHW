package homework11;

public abstract class Fish extends Animal implements ISwimmable {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
    }

    @Override
    public void see() {
        System.out.println("I can see under water");
    }

    @Override
    public void swim() {
        System.out.printf( "Fish %s can swim by moving fins \n", this.getName());

    }
}
