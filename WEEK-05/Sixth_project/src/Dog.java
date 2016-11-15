/**
 * Created by viktor on 2016.11.15..
 */
public class Dog extends Animal
{
    public Dog() {
        //super(15,true);
        super("dog");this.lifeExpectancy=15;this.isCarnivore=true;
        }

    public void speak() {
        System.out.println("barks");
    }

    public void beg() {
        System.out.println("begs");
    }

    boolean hasTail;
}
