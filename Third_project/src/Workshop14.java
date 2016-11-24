import java.util.*;

/**
 * Created by viktor on 2016.11.07..
 */
public class Workshop14 {
    public static void main(String... args){
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók"));
        // Add "a" to every string in al. Use an iterator!

/*        for (int i=0; i<al.size(); i++) {
            al.set(i, al.get(i)+"a");
        }
*/

        ListIterator<String> iterator = al.listIterator();
                while (iterator.hasNext()) {
                    String o = iterator.next();
                    iterator.set(o+"a");
                }

        System.out.println(al);
    }
}
