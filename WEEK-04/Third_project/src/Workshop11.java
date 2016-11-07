import java.util.*;

/**
 * Created by viktor on 2016.11.07..
 */
public class Workshop11 {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("first", "second", "third", "fourth", "fifth"));
        // Print all elements of the list

        for (String listElements : list) {
            System.out.println(listElements);
        }
    }
}
