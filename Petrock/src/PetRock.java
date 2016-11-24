/**
 * Created by viktor on 2016.11.19..
 */
public class PetRock {
    private String name;
    private boolean happy = false;

    public PetRock(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void playWithRock() {
        happy = true;
    }

    public void printHappyMessage () {
        if (!happy) {
            throw new IllegalStateException();
        }
        System.out.println("I'm happy");
    }
}
