/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1151;

/**
 *
 * @author felipe.reblin
 */
public class Fibonacci {
     public void gerarFibonacci(int numero){
        int n1 = 1, n2 = 0;
        System.out.print(n2 + " ");
        System.out.print(n1 + " ");
        
            for(int j = 0; j < (numero-2); j++){
                n1 = n1 + n2;
                n2 = n1 - n2;
                System.out.print(n1 + " ");
            }
    }
}
