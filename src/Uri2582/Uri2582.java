/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri2582;

import java.util.Scanner;

/**
 *
 * @author jeferson.guesser
 */
public class Uri2582 {
    public static void run(){
        int quantidade, num1=0, num2=0;
        Dispositivo dispositivo = new Dispositivo();
        Scanner input = new Scanner(System.in);
        quantidade = input.nextInt();
        num1 = input.nextInt();
        num2 = input.nextInt();
        for (int i=0; quantidade > i; i++){
            dispositivo.botoes(num1, num2);
        }
    }
}
