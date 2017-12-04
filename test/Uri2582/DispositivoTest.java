/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri2582;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeferson.guesser
 */
public class DispositivoTest {
    
    public DispositivoTest() {
    }
    
    @Test
    public void test() {
        System.out.println("4");
        String expResult = "HOST!";
        Dispositivo celular = new Dispositivo();
        assertEquals(expResult, celular.botoes(2, 2));
    }
    
}
