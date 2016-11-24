import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Viktor on 2016.11.21..
 */
public class AppleTest {
    @Test
    public void getApple() throws Exception {
        Apple myObject = new Apple();
        assertEquals("foo", myObject.getApple());

    }

}