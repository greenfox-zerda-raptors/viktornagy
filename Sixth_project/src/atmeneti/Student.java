package atmeneti;

import java.util.ArrayList;

/**
 * Created by viktor on 2016.11.15..
 */
public class Student extends Person {

    public Student() {
        super();
        this.Grades = new ArrayList<Integer>();

    }

    public Student(String name, int age) {
        super(name,age);
        this.Grades = new ArrayList<Integer>();
    }

    public void addGrade(int grade) {
            this.Grades.add(grade);
    }

    public double getAverage(){
        double sum=0;
        for (int grade:this.Grades) {
            sum+=grade;
        }

        return(sum/this.Grades.size());
    }

    public String toString(){
        return super.toString()+String.format(" Avarage: %f",this.getAverage());
    }

    ArrayList<Integer> Grades;


}
