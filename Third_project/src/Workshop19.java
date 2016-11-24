/**
 * Created by viktor on 2016.11.07..
 */
public class Workshop19 {
    public static void main(String... args){
        String name = "World";
        StringBuilder builder = new StringBuilder("Heljo");
        builder.setCharAt(3,'l');
       // builder.replace(3,3,"l");
        builder.append(" "+name+"!");
        // Please change "Heljo" to "Hello" and add name ("World") to the end of the string builder

        System.out.println(builder);
    }
}
