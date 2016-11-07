import java.util.*;

/**
 * Created by viktor on 2016.11.07..
 */
public class Workshop17 {
    // Implement trimAll(..)
    // Expected output:
    // "first"
    // "second"
    // "third"
    // "fourth"
    // "fifth"

    static void trimAll(List<String> strings) {
        for(String actstring : strings){
            strings.set(strings.indexOf(actstring),actstring.trim());
        }
    }

    public static void main(String... args){
        List<String> strList = new ArrayList<String>(Arrays.asList("   first", "second   ", "  third ", "fourth", "    fifth "));
        trimAll(strList);
        for (String str : strList) {
            System.out.format("\"%s\"%n", str);
        }
    }
}
