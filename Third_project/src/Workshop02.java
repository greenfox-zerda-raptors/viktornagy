import java.util.*;

/**
 * Created by viktor on 2016.11.07..
 */
public class Workshop02 {
    public static void main(String... args){
        String[] numbers = new String[] { "one", "two", "three", "four", "five"};
        // Initialize the arrayList using the numbers array
        ArrayList<String> arrayList = new ArrayList<String>(); // ??

        for (int i=0; i<5; i++) {
            arrayList.add(numbers[i]);
        }

        System.out.println(arrayList);
    }
}
