/**
 * Created by Viktor on 2016.12.06..
 */
public class NumberConverter {

    public static String arabicToRoman(int arabic) {
        StringBuilder builder=new StringBuilder();
        int remaining=arabic;

        remaining = appendSymbols(remaining, 9, "IX", builder);
        remaining = appendSymbols(remaining, 5, "V", builder);
        remaining = appendSymbols(remaining, 4, "IV", builder);


        if (remaining >= 9){
            builder.append("XI");
            remaining -= 9;
        }
        if (remaining >= 5){
            builder.append("V");
            remaining -= 5;
        }
        if (remaining>=4){
            builder.append("IV");
            remaining -= 4;
        }

            for (int i = 0; i < remaining; i++) {
                builder.append ("I");
            }

        return builder.toString();
    }

    public static int appendSymbols(int remaining, int number, String symbol, StringBuilder builder){
        if(remaining >= number){
            builder.append(symbol);
            remaining -= number;
        }
        return remaining;
    }
}
