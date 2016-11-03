/**
 * Created by viktor on 2016.11.03..
 */
public class Workshop34 {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".

        for (int m = 1; m < 100; m++) {

            if ((m % 3 == 0) && (m % 5 == 0)) {
                System.out.println("FizzBuzz");
            }

            else if (m % 3 == 0) {
                System.out.println("Fizz");
            }

            else if (m % 5 == 0) {
                System.out.println("Buzz");
            }

            else {
                System.out.println(m);
            }
        }

    }
}
