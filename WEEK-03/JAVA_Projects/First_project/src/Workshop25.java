/**
 * Created by viktor on 2016.11.03..
 */
public class Workshop25 {
    public static void main(String[] args) {
        String x = "monkey";
        int a = 0;
        // if the string is longer than 4 characters
        // print 'Long!' otherwise print 'Short!'//
        a = x.length();

        if (a > 4) {
            System.out.println("\'Long\'");
        }
        else {
            System.out.println("\'Short\'");
        }
    }
}
