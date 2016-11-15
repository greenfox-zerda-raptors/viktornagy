/**
 * Created by viktor on 2016.11.15..
 */
public class Animal {

    public Animal() {
        this.lifeExpectancy=10;
        this.isCarnivore=false;

        System.out.println("Animal is created");
    }

    public Animal(String type) { this.lifeExpectancy=10; this.isCarnivore=false; System.out.println(type+" animal is created"); }

    public Animal(int alma,boolean repa)
    {
        this.lifeExpectancy=alma;
        this.isCarnivore=repa;
        System.out.println("Animal is created");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void eat() { System.out.println("Animal is eating"); }

    public void speak() {
        System.out.println("speaks");
    }


    public String toString() { return String.format("isCarnivore=%b, lifeExpectancy=%d",this.isCarnivore,this.lifeExpectancy); }




    int lifeExpectancy;
    boolean isCarnivore;

}
