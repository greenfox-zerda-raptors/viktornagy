/**
 * Created by Viktor on 2016.12.06..
 */
public class NumberConverter {

    public static String arabicToRoman(int i) {
        String out="";
        if (i==4){
            out+="IV";
        }
        else {
            for (int j = 0; j < i; j++) {
                out += "I";
            }
        }
        return out;
    }
}
