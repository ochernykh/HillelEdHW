package homework11;

public class Main {

    public static void main(String[] args) {

        Goldfinch goldfinch = new Goldfinch("Goldfinch - Carel Fabritius");
        goldfinch.eat();
        goldfinch.fly();
        System.out.println("========================================");

        Bird bird = new Penguin("Penguin Willy");
        //bird.swim; unreachable method

        Penguin penguin = new Penguin("Penguin Chilly");
        penguin.eat();
        penguin.fly();
        penguin.swim();

        System.out.println("========================================");

        FlyingFish flyingFish = new FlyingFish("Exocoetidae");
        flyingFish.swim();
        flyingFish.fly();
    }
}
