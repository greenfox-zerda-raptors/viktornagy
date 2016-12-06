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

}
