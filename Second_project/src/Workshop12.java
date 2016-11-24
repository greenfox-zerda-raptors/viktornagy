import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by viktor on 2016.11.05..
 */
public class Workshop12 {
    public static void main(String[] args) {
        // Swap the first element of the array
        // Expected outpt: third second first
        String[] abc = new String[] { "first", "second", "third" };
        String abc_temp = null;

        for(int i=0;i<abc.length/2;i++){
             abc_temp=abc[i];
             abc[i] = abc[abc.length-1-i];
             abc[abc.length-1-i] = abc_temp;
        }

        for(int i=0;i<abc.length;i++){
            System.out.print(abc[i] + " ");
        }
        System.out.println();
    }
}
