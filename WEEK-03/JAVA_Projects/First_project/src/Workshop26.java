/**
 * Created by viktor on 2016.11.03..
 */
public class Workshop26 {
    public static void main(String[] args) {
        String x = "cheese";
        int a = 0;
        Boolean b = false;
        // Tell if the x has even or odd number of
        // characters with a True for even and
        // false False output otherwise
        a = x.length();

        if (a%2 == 0) {
            b = true;
        }

        System.out.println(b);
    }
}
