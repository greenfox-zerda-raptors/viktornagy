import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Viktor on 2016.11.21..
 */
public class App {

    public static int sum(ArrayList<Integer> a) {
        int sum=0;
          for (int i=0; i<a.size(); i++){
            sum += a.get(i);
        }
        return sum;
    }

}
