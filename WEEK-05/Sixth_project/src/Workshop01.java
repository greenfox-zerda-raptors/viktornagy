/**
 * Created by viktor on 2016.11.15..
 */
public class Workshop01 {
    public static void main(String... args) {
        Bird bird = new Bird();
        //Animal animal = new Animal();
        bird.fly();
        bird.eat();
        bird.sleep();
        //animal.sleep();
        bird.nightyNight();
        Animal animal1= new Animal(5,true);
        System.out.println(animal1.toString());


    }
}
