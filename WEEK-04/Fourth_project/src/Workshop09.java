/**
 * Created by viktor on 2016.11.10..
 */
/**************************************************************************************************
 * Workshop: Practice Exceptions: I have to have it my way.  When an exception occurs, I want a
 * special error message, namely "7's are cannibals!" printed.
 *
 *
 * So, I'm looking for the following output:
 * try - first statement
 * start - myMethod
 * An Exception Occurred
 * 7's are cannibals
 * Finally I did this instead
 * ::::FINISH LINE:::: out of the try/catch/finally statement
 *
 * Refer to Workshop07
 **************************************************************************************************/
import java.util.*;

public class Workshop09{

    public static void myMethod(int testnum) throws ArithmeticException // something should appear here before
    {
        System.out.println("start - myMethod");
        if (testnum == 7) {
                int test = testnum / 0;
                System.out.println("This is 7, which one is not good.");

        }
    }

    public static void main(String[] args) {

        try {
            System.out.println("try - first statement");
            Scanner userInput = new Scanner(System.in);
            int number = userInput.nextInt();
            myMethod(number);
        }

                catch (ArithmeticException e) {
                    System.out.println("An Exception Occurred\n7's are cannibals");
                }
                finally {
            System.out.println("Finally I did this instead");
        }
        System.out.println("::::FINISH LINE::::");
            }

        }