import java.util.ArrayList;

/**
 * Created by Viktor on 2016.11.21..
 */


public class DummyApple {

    public DummyApple() {
        this.name="Apple";
    }

    public String getApple() {
        return this.name;
    }

    public static int getSum(ArrayList<Integer> intlist){
        int sum=0;
        if(intlist!=null)
        {
            for(int i:intlist)
            {
                sum+=i;
            }
        }
        return sum;
    }

    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }



    private String name;
}
