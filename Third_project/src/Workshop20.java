/**
 * Created by viktor on 2016.11.07..
 */
public class Workshop20 {
    public static void main(String... args){
        StringBuilder sb = new StringBuilder("second line\n");
        sb.insert(0, "first line\n");
        int length_sb = sb.toString().length()-1;
        sb.insert(length_sb, "\nthird line");
        // Add "first line" to the beginning of the sb
        // Add "third line" to the end of the sb
        // Expected output:
        // first line
        // second line
        // third line


        System.out.println(sb.toString());
    }
}
