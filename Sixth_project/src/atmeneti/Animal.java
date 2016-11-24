package atmeneti;

/**
 * Created by viktor on 2016.11.15..
 */
public class Animal {

    public Animal() {
        this.lifeExpectancy=10;
        this.isCarnivore=false;

        System.out.println("atmeneti.Animal is created");
    }

    public Animal(String type) { this.lifeExpectancy=10; this.isCarnivore=false; System.out.println(type+" animal is created"); }

    public Animal(int alma,boolean repa)
    {
        this.lifeExpectancy=alma;
        this.isCarnivore=repa;
        System.out.println("atmeneti.Animal is created");
    }

    public void sleep() {
        System.out.println("atmeneti.Animal is sleeping");
    }

    public void eat() { System.out.println("atmeneti.Animal is eating"); }

    public void speak() {
        System.out.println("speaks");
    }


    public String toString() { return String.format("isCarnivore=%b, lifeExpectancy=%d",this.isCarnivore,this.lifeExpectancy); }




    int lifeExpectancy;
    boolean isCarnivore;

}
