/**
 * Created by viktor on 2016.11.05..
 */
public class Workshop14 {
    public static void main(String[] args) {
        // Reverse the order of ah
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };
        int ah_temp = 0;

        for(int i=0;i<ah.length/2;i++){
            ah_temp=ah[i];
            ah[i] = ah[ah.length-1-i];
            ah[ah.length-1-i] = ah_temp;
        }

        for(int i=0;i<5;i++){
            System.out.println(ah[i]);
        }

        System.out.println();
    }
}
