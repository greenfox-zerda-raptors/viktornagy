import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Viktor on 2016.12.06..
 */
public class NumberConverterTests {
    @Test
    public void shouldReturnIfor1 (){
        assertEquals("I", NumberConverter.arabicToRoman(1));
    }

    @Test
    public void shouldReturnIIfor2 (){
        assertEquals("II", NumberConverter.arabicToRoman(2));
    }

    @Test
    public void shouldReturnIIIfor3 (){
        assertEquals("III", NumberConverter.arabicToRoman(3));
    }

    @Test
    public void shouldReturnIVfor4 (){
        assertEquals("IV", NumberConverter.arabicToRoman(4));
    }

    @Test
    public void shouldReturnVfor5 (){
        assertEquals("V", NumberConverter.arabicToRoman(5));
    }

    @Test
    public void shouldReturnVIfor6 (){
        assertEquals("VI", NumberConverter.arabicToRoman(6));
    }

    @Test
    public void shouldReturnVIIIfor8 (){
        assertEquals("VIII", NumberConverter.arabicToRoman(8));
    }

    @Test
    public void shouldReturnIXfor9 (){
        assertEquals("IX", NumberConverter.arabicToRoman(9));
    }

    @Test
    public void shouldReturnXfor10 (){
        assertEquals("X", NumberConverter.arabicToRoman(10));
    }

    @Test
    public void shouldReturnXIfor11 (){
        assertEquals("XI", NumberConverter.arabicToRoman(11));
    }

    @Test
    public void shouldReturnXIIIfor13 (){
        assertEquals("XIII", NumberConverter.arabicToRoman(13));
    }

    @Test
    public void shouldReturnXVfor15 (){
        assertEquals("XV", NumberConverter.arabicToRoman(15));
    }

    @Test
    public void shouldReturnXVIIIfor18 (){
        assertEquals("XVIII", NumberConverter.arabicToRoman(18));
    }

    @Test
    public void shouldReturnXXXVIIIfor38 (){
        assertEquals("XXXVIII", NumberConverter.arabicToRoman(38));
    }

    @Test
    public void shouldReturnXLIXfor49 (){
        assertEquals("XLIX", NumberConverter.arabicToRoman(49));
    }

    @Test
    public void shouldReturnXXfor98 (){
        assertEquals("XCVIII", NumberConverter.arabicToRoman(98));
    }

    @Test
    public void shouldReturnCXXXVIIfor137 (){
        assertEquals("CXXXVII", NumberConverter.arabicToRoman(137));
    }

    @Test
    public void shouldReturnCLfor150 (){
        assertEquals("CL", NumberConverter.arabicToRoman(150));
    }
}
