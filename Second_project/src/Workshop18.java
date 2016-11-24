
import java.util.Scanner;

/**
 * Created by viktor on 2016.11.05..
 */
public class Workshop18 {

    public static void main(String[] args) {

        System.out.println(sum_the_numbers());
    }

    public static int sum_the_numbers() {
        boolean _read=true;

        int sum=0;
        Scanner scanner_numbers = new Scanner(System.in);

        while(_read) {
            int read_int=scanner_numbers.nextInt();

            if(read_int==0) {
                _read=false;
            }
            else {
                sum+=read_int;
            }
        }

        return sum;
    }


}
