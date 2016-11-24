import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Viktor on 2016.11.20..
 */
public class PetRockTest {
    private PetRock rocky = new PetRock("Rocky");

    @Test
    public void getName() throws Exception {
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void testUnhappyToStart() throws Exception {
        assertFalse(rocky.isHappy());

    }

    @Test
    public void testHappyAfterPlay() throws Exception {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }

    @Test
    public void name() throws Exception {
        rocky.printHappyMessage();
    }
}