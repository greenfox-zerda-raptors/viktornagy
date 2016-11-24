/**
 * Created by viktor on 2016.11.06..
 */
public class Workshop21 {

    public static double fact_the_number_recursive(int n) {
        if (n==1)
            return 1;
        else
            return fact_the_number_recursive(n-1)*n;

    }

    public static void main(String[] args) {
        // create a recursive function that returns it's input factorial

        System.out.println(fact_the_number_recursive(20));
    }
}
