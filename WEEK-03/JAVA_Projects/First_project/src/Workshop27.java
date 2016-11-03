/**
 * Created by viktor on 2016.11.03..
 */
public class Workshop27 {
    public static void main(String[] args) {
        String y = "seasonsss";
        int kszam = y.length();
        int out = 6;
        // if the last and the first letter of the string
        // are the same double the variable
        // called out, if not half it

        kszam--;
        if (y.charAt(0) == y.charAt(kszam)) {
            out *= 2;
        }
        else {
            out /= 2;
        }

        System.out.println(out);
    }
}
