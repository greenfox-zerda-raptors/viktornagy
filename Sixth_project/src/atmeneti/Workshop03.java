package atmeneti;

/**
 * Created by viktor on 2016.11.15..
 */
public class Workshop03 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println("Testing atmeneti.Animal");
        // how does it speak, sleep, and tell me about its lifeExpectancy and if its a carnivore
        animal.speak();
        animal.sleep();
        System.out.println(animal.toString());

        System.out.println("\nTesting atmeneti.Bird");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore


        System.out.println("\nTesting atmeneti.Dog");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?


        System.out.println("\nTesting Dog2");
        Animal dog2 = new Dog();
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?

        System.out.println("\nTesting atmeneti.Dog 'd'");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?

    }
}