import java.util.*;

/**
 * Created by viktor on 2016.11.07..
 */
public class Workshop13 {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("first", "second", "third", "fourth", "fifth"));
        // Print all elements of the list using a for loop and an Iterator

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
