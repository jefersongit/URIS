package Uri1960;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeferson.guesser
 */
public class NumerosRomanosTest {
    
    public NumerosRomanosTest() {
    }

    /**
     * Test of getRomanos method, of class NumerosRomanos.
     */
    @Test
    public void testGetRomanos() {
        NumerosRomanos num = new NumerosRomanos();
        String experado = "IX";
        String result = num.getRomanos("9");
        assertEquals(experado, result);
    }
}
