/**
 * Created by viktor on 2016.11.07..
 */
public class Workshop18 {
    public static void main(String... args) {
        String example = "A long example string";

        //example.replace("long", "short");
        // I would like to replace "long" with "short" in this example, but it has a problem. Please fix it! Don't forget that String is immutable
        // Expected output: A short example string
        String replaced = example.replace("long", "short");

        System.out.println(example);
        System.out.println(replaced);
    }
}
