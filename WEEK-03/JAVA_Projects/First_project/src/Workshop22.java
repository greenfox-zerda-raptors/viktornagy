/**
 * Created by viktor on 2016.11.03..
*/
public class Workshop22 {
    public static void main(String... args){
        String first = "I am the first string!";
        String second = "I think I'm longer than first..";
        String comparisonResult = "Valami";
        int a = first.length();
        int b = second.length();
        // Decide if "first" string is longer than "second" string and store it in a variable
        // Print the value of the variable


        if(a > b){
            comparisonResult = "The first sentence is longer than the second";
        }
        else if (a < b){
            comparisonResult = "The second sentence is longer than the first";
        }
        else {
            comparisonResult = "The length of sentences are same";
        }

        System.out.println(comparisonResult);
    }
}
