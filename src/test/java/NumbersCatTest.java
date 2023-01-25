import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test list:
 *  1. Nombres naturals (0-9) --> OK
 *  2. Decenes
 *      2.1 Decenes (30-99)
 *      2.2 Primera dezena (10-19)
 *      2.3 Segona dezena (20-29)
 *  //D-U-C
 *  5. Negatius
 *  6. Centenes
 *  7. Nombres més complexes: 10, 20, 11...19, 21...29, 30...
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

    @Test
    public void donat_2_retorna_Dos() {
        assertEquals("Dos", NumbersCat.say(2));
    }


    @Test
    public void donat_7_retornat_Set() {
        assertEquals("Set", NumbersCat.say(7));
    }

    @Test
    public void donat_3_negatiu_retorna_Menys_tres() {
        assertEquals("Menys tres", NumbersCat.say(-33));
    }

    @Test
    public void donat_31_retorna_Trenta_un() {
        assertEquals("Trenta-un", NumbersCat.say(31));
    }

    @Test
    public void donat_33_retorna_Trenta_tres() {
        assertEquals("Trenta-tres", NumbersCat.say(33));
    }

    @Test
    public void donat_30_retorna_Trenta() {
        assertEquals("Trenta", NumbersCat.say(30));
    }

    @Test
    public void donat_20_retorna_Vint() {
        assertEquals("Vint", NumbersCat.say(20));
    }


    @Test
    public void donat_21_retorna_Vint_i_un() {
        assertEquals("Vint-i-un", NumbersCat.say(21));
    }

    @Test
    public void donat_10_retorna_Deu() {
        assertEquals("Deu", NumbersCat.say(10));
    }

    @Test
    public void donat_11_retorna_Onze() {
        assertEquals("Onze", NumbersCat.say(11));
    }

    @Test
    public void donat_15_retornat_Quinze() {
        assertEquals("Quinze", NumbersCat.say(15));
    }

    @Test
    @Ignore
    public void donat_100_retorna_Cent() {
        assertEquals("Cent", NumbersCat.say(100));

    }
}
