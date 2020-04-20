package homework11;

public abstract class Bird extends Animal implements IFlyable {
    public Bird(String name) {
        super(name);
    }

    public void sing(){
        System.out.printf("The bird %s is singing \n",this.getName());
    }

    @Override
    public void eat() {
        System.out.printf("The Bird %s is eating...chew \n" , this.getName());
    }

    @Override
    public abstract void see();

    @Override
    public void fly() {
        System.out.printf("The Bird %s is flying \n" , this.getName());
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
