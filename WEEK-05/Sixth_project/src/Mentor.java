/**
 * Created by viktor on 2016.11.15..
 */
public class Mentor extends  Person {

    public Mentor() {
        super();
    }

    public Mentor(String name, int age, String seniorityLevel, String subject) {
        super(name, age);
        this.seniorityLevel=seniorityLevel;
        this.subject=subject;
    }

    public String toString() {

        return super.toString()+String.format("Level: %s, Subject: %s", this.seniorityLevel, this.subject);
    }

    String seniorityLevel;
    String subject;

}
