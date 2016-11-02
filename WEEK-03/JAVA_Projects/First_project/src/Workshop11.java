/**
 * Created by viktor on 2016.11.02..
 */
public class Workshop11 {
    public static void main(String[] args) {
        int k = 16;
        // tell if k is dividable by 3 or 5

        if((k%3 == 0)||(k%5 == 0)){
            System.out.println("k osztható 3-al vagy 5-el");
        }
        else{
            System.out.println("k NEM osztható 3 -al és 5-el sem, csak maradékosan");
        }

    }
}
