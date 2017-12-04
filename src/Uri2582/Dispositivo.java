/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri2582;

/**
 *
 * @author jefeg
 */
public class Dispositivo {
    
    public String botoes (int num1, int num2){        
        String retorno = "";
        int soma = num1 + num2;
        
        switch (soma){
            case 0:
                retorno = "PROXYCITY";
                break;
            case 1:
                retorno = "P.Y.N.G.";
                break;
            case 2:
                retorno = "DNSUEY!";
                break;
            case 3:
                retorno = "SERVERS";
                break;
            case 4:
                retorno = "HOST!";
                break;
            case 5:
                retorno = "CRIPTONIZE";
                break;
            case 6:
                retorno = "OFFLINE DAY";
                break;
            case 7:
                retorno = "SALT";
                break;
            case 8:
                retorno = "ANSWER!";
                break;
            case 9:
                retorno = "RAR?";
                break;
            case 10:
                retorno = "WIFI ANTENNAS";
                break;
        }
        return retorno;
    }
}
    

