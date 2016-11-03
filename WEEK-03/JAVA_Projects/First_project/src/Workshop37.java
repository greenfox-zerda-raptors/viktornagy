/**
 * Created by viktor on 2016.11.03..
 */
public class Workshop37 {
    public static void main(String[] args) {
        // Write a program which has this output
        //# # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        // The # character should be replacable, hence store it in a variable

        for (int i = 0; i < 7; i++) {
                int j = 0;
                if (i%2 == 0) {j = 0;}
                else {j = 1;}
            while (j < 14) {
                if (j%2 == 0) {System.out.print(" "); j++;}
                else {System.out.print("#"); j++;}
            }
            System.out.println("");
        }

    }
}
