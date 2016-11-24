import java.util.Scanner;

/**
 * Created by viktor on 2016.11.06..
 */
public class Workshop19 {

    public static double fact_the_number() {

        Scanner scanner_num = new Scanner(System.in);
        int read_int=scanner_num.nextInt();
        double fact_temp = 1;

        for (int i = 1; i < read_int+1; i++) {
            fact_temp = fact_temp*i;

        }
        return fact_temp;
    }
    public static void main(String[] args) {
        // create a function that returns it's input factorial

        System.out.println(fact_the_number());
    }
}
