package homework12;

import homework11.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //ArrayList
        System.out.println("======== ArrayList ======= \n");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("King"));
        animals.add(new Lion("Timba"));
        animals.add(new Penguin("Chilly"));
        animals.add(new Goldfinch("Gold"));
        animals.add(new FlyingFish("Fly"));
        animals.add(new Lion("Simba"));

        System.out.println("Print animals ArrayList");
        for (Animal animal:animals) {
            if(animal instanceof Lion){
                System.out.println(animal.getName() + " is Lion");
            }else {
                System.out.println(animal.getName() + " is " + animal.getClass().getSimpleName());
            }
        }

        //HashMap
        System.out.println("======== Hashmap ======= \n");
        Map<String,Enclosure> enclosureMap = new HashMap<>();
        enclosureMap.put("Lions", new Enclosure("Lions Enclosure"));
        enclosureMap.put("Fishes", new Enclosure("Aquarium"));
        enclosureMap.put("Birds", new Aviary("Birds"));

        //Sort animals to enclosures
        for (Animal a:animals) {
            if(a instanceof Lion){
                enclosureMap.get("Lions").addAnimal(a);
            }else if(a instanceof Bird){
                enclosureMap.get("Birds").addAnimal(a);
            }else {
                enclosureMap.get("Fishes").addAnimal(a);
            }
        }

        Iterator iterator = enclosureMap.entrySet().iterator();
        System.out.println("Sorted animals");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    //Prepare objects
        System.out.println("======= Zoo ====== \n");
        Zoo zoo = new Zoo("Kyiv Zoo");
        Goldfinch goldfinch = new Goldfinch("Goldfinch");
        Aviary aviary = new Aviary("Birds");
        Caretaker john = new Caretaker("John");
        Caretaker pete = new Caretaker("Peter");
        HashMap<Caretaker,Enclosure> aqua = new HashMap<>();

        zoo.hireCaretaker(john);
        zoo.hireCaretaker(pete);

        aqua.put(john,new Enclosure("Fishes"));
        aqua.get(john).addAnimal(new FlyingFish("Fish to fly"));

        zoo.setEnclosures(aqua);
        zoo.getEnclosures().put(pete,aviary);

        aviary.addAnimal(goldfinch);

        System.out.println(zoo);
    }

}
