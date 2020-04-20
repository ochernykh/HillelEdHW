package homework12;

import homework11.Animal;

import java.util.ArrayList;

public class Enclosure {
    String name;
    ArrayList<Animal> animals = new ArrayList<>();

    public Enclosure() {
    }

    public Enclosure(String name) {
        this.name = name;
    }

    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }

    public void removeAnimal(Animal animal){
        this.animals.remove(animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return " Enclosure{" +
                "name='" + name +
                ", animals=" + animals +
                '}';
    }
}
