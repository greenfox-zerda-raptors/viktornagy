/**
 * Created by Viktor on 2016.12.06..
 */
public class NumberConverter {

    public static String arabicToRoman(int arabic) {
        String[]  symbols= new String[] {"CD", "C", "XC", "L",  "XL", "X", "IX", "V", "IV", "I"};
        int[] values = new int[] {400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder builder=new StringBuilder();
        int remaining=arabic;


        for (int i = 0; i < symbols.length; i++) {
            remaining = appendSymbols(remaining, values[i], symbols[i], builder);
        }


        return builder.toString();
    }

    public static int appendSymbols(int remaining, int number, String symbol, StringBuilder builder){
        while(remaining >= number){
            builder.append(symbol);
            remaining -= number;
        }
        return remaining;
    }
}
