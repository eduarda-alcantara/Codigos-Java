/*
 * Faça um programa que receba a cotação do dólar em reais, e um valor
 * que o usuário possui em dólares. Imprima este valor em reais.
 */
package cotaçãodolar;

import java.util.Scanner;

public class CotaçãoDolar {
    public static void main(String[] args) {
       
        Scanner entrada= new Scanner (System.in);       
        double cot, dolar;
        
        System.out.println ("Digite a cotação do dólar:");
        cot = entrada.nextDouble();
        
        System.out.println("Digite a sua quantia em dolares:");
        dolar = entrada.nextDouble();
        
        double real = cot*dolar;
        System.out.println ("Sua quantia em reais é:  "+real); 
    }
}
