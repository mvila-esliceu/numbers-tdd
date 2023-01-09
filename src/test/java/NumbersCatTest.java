import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test list:
 *  1. Nombres naturals (0-9)
 *  2. Primera dezena (10-19)
 *  3. Segona dezena (20-29)
 *  //D-U-C
 *  4. Decenes (30-99)
 *  5. Negatius
 *  6. Centenes
 */


public class NumbersCatTest {

    @Test
    public void donat_0_retorna_Zero() {
        assertEquals("Zero", NumbersCat.say(0));
    }

    @Test
    public void donat_1_retorna_Un() {
        assertEquals("Un", NumbersCat.say(1));
    }

}
