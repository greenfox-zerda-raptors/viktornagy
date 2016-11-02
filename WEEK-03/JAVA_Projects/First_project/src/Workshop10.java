/**
 * Created by viktor on 2016.11.02..
 */
public class Workshop10 {
    public static void main(String[] args) {
        int j1 = 30;
        int j2 = 3;
        // tell if j1 is between j2 squared and j2 cubed

        if((Math.pow(j2, 2) <= j1)&&(j1 <= Math.pow(j2, 3))){
            System.out.println("j1, j2 négyzete és köbe között van");
        }
        else{
            System.out.println("j1, j2 négyzeténél kisebb vagy j2 köbénél nagyobb");
        }


     /*   System.out.println((Math.pow(j2, 2) <= j1)&&(j1 <= Math.pow(j2, 3)));*/
    }
}
