package homework12;

public class Caretaker {
    String name;

    public Caretaker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " '\n' Caretaker{" +
                "name='" + name +
                '}';
    }
}
