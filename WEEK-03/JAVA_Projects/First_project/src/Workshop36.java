/**
 * Created by viktor on 2016.11.03..
 */
public class Workshop36 {
    public static void main(String[] args) {
        // Write a program which has this output
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // The # character should be replacable, hence store it in a variable
        String c = "#";

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print(c);
            }
            System.out.println("");
        }

    }
}
