/**
 * Created by viktor on 2016.11.10..
 */
/**************************************************************************************************
 * Workshop: Practice Exceptions: Having raised exceptions, then what?  I'm looking to get some
 * closure here.  "Finally" would do... whatever else, this is what I need if something goes
 * wrong...
 *
 *
 *
 * So, I'm looking for the following output:
 * try - first statement
 * start - myMethod
 * An Exception Occurred
 * Finally I did this instead
 * ::::FINISH LINE:::: out of the try/catch/finally statement
 *
 **************************************************************************************************/
import java.util.*;

public class Workshop08 {


    public static void myMethod() throws ArithmeticException // something should appear here before
    {
        Scanner userInput = new Scanner(System.in);
        int inNumber = userInput.nextInt();
        int divide = inNumber/0;
        System.out.println("This is 7, which one is not good.");
    }


    // do that thing that chucks the reprobate out


    public static void main(String[] args) {
        try {
         myMethod();

        }
        catch(ArithmeticException e){
            System.out.println("Ez egy kivétel kezelés!!!");

        }
    }
}