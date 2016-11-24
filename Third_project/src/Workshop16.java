import java.util.*;

/**
 * Created by viktor on 2016.11.07..
 */
public class Workshop16 {
    public static void main(String... args){
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 3456, 56 ));
        // Fix this code fragment! It should remove every even number from the list.

/*        for(int element : al){
            if(element % 2 == 0){
                al.remove(element);

            }
        }
*/
        for(int i=al.size()-1;i>=0;i--){
            if(al.get(i) % 2 == 0){
                al.remove(al.get(i));
            }
        }
        System.out.println(al);
    }
}
