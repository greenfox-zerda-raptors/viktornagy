/**
 * Created by viktor on 2016.11.04..
 */
public class Workshop02 {
    public static void main(String... args) {
        int[] p1 = new int[] { 1, 2, 3 };
        int[] p2 = new int[] { 4, 5, 5 };
        int p1length = p1.length;
        int p2length = p2.length;
        // tell if p2 has more elements than p1

        if (p1length < p2length) {
            System.out.println("p2 has more elements than p1");
        }

        else if (p1length > p2length) {
            System.out.println("p1 has more elements than p2");
        }

        else {
            System.out.println("p1 equals with p2");
        }

    }
}
