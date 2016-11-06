/**
 * Created by viktor on 2016.11.04..
 */
public class Workshop08 {
    public static void main(String[] args) {
        // Task 1: Create (dynamically) a two dimensional array with the following matrix. Use a loop!
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1
        // Task 2: Print this two dimensional array to the output
        int i;
        int[][] array = new int[4][4];
                /*                  {{1, 0, 0, 0},
                                    {0, 1, 0, 0},
                                    {0, 0, 1, 0},
                                    {0, 0, 0, 1}};
*/
        for (i = 0; i < array.length; i++) array[i][i]= 1;

        for ( i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        }
    }
