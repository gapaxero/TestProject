package testPolymorphism;

/**
 * @Author 1091522
 * @Description
 */
public class Test1 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal bird = new Bird();
        Animal fish = new Fish();
        Animal human = new Human();

        animal.move();
        bird.move();
        fish.move();
        human.move();

    }

}
