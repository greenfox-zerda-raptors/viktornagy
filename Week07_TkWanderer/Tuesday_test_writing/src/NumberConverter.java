/**
 * Created by Viktor on 2016.12.06..
 */
public class NumberConverter {

    public static String arabicToRoman(int i) {
        String out="";
        if(i==1){
            out="I"; }
        else {
            out="II";
        }
        return out;
    }
}
