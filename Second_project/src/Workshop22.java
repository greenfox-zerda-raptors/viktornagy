import java.util.ArrayList;

/**
 * Created by viktor on 2016.11.06..
 */
public class Workshop22 {

    public static void print_the_input(String[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
    public static void main(String... args) {
        // create a function which prints the input String parameters (can have multiple number of arguments)
        String a = "alma";
        String b = "körte";
        String c = "narancs";

        String[] string_list = new String[] {a,b,c};
        print_the_input(string_list);

        System.out.println();
    }
}
