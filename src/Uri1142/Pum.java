/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1142;

import java.util.Scanner;

/**
 *
 * @author jefersongit
 */
public class Pum {
        public String gerarSequencia(int numero){
        int cont = 0;
        String retorno = "";
            for(int j = 1; j <= (numero * 4); j++){
                retorno += j+" ";
                cont++;
                if(cont == 3){
                    j++;
                    retorno += "PUM ";
                    cont = 0;
                }
            }
            return retorno;
        }
}
