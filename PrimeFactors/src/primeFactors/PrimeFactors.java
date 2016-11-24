package primeFactors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Viktor on 2016.11.22..
 */
public class PrimeFactors {


    public static List<Integer> generate(int n) {
        //return new ArrayList<Integer>();

        List<Integer> result = new ArrayList<Integer>();

        for (int candidate = 2; n >1; candidate++)
            for (; n%candidate == 0; n/=candidate){
                result.add(candidate);

        }
        return result;
    }
}
