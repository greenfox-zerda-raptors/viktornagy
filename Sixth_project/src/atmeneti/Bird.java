package atmeneti;

/**
 * Created by viktor on 2016.11.15..
 */
public class Bird extends Animal {

    public Bird() {
        super("atmeneti.Bird");this.lifeExpectancy=2;this.isCarnivore=false;
       //super(2,false);
    }

    public void fly() {
        System.out.println("The bird can fly");
    }

    public void eat() { super.eat(); }

    public void sleep() { System.out.println("The bird is sleeping");super.sleep(); }

    public void nightyNight() { super.eat(); this.sleep(); }

    public void speak(){
        System.out.println("chirp");
    }
}
