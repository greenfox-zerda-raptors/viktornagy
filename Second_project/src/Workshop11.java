/**
 * Created by viktor on 2016.11.05..
 */
public class Workshop11 {
    public static void main(String[] args) {
        String[] ah = new String[] { "kuty", "macsk", "cic" };
        // add to all elements an 'a' on the end

        for (int j = 0; j < ah.length; j++) {
            ah[j] = ah[j] + "a";
        }

        for (int j = 0; j < ah.length; j++) {
            System.out.print(ah[j] + ", ");
        }
        System.out.println();
    }
}
