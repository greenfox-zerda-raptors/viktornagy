/**
 * Created by viktor on 2016.11.04..
 */
public class Workshop09 {
    public static void main(String[] args) {
        int[] ag = new int[]{3, 4, 5, 6, 7};
        // please double all the elements of the list
        for (int i = 0; i < ag.length; i++) {
            ag[i] = ag[i] * 2;
        }
            for (int itemFromag : ag) {
                System.out.println(itemFromag);
            }
        }
    }