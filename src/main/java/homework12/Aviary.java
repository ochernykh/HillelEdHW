package homework12;

import homework11.Animal;
import homework11.Bird;

public class Aviary extends Enclosure {

    public Aviary(String name) {
        super(name);
    }

    @Override
    public void addAnimal(Animal bird) {
        if(bird instanceof Bird){
            animals.add(bird);
        }else {
            System.out.println("This animal is not a bird");
        }
    }

    @Override
    public void removeAnimal(Animal animal) {
        super.removeAnimal(animal);
    }
}
