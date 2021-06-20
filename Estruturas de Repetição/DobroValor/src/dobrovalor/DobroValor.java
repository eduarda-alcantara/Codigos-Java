/*
 * Faça um programa que faça a leitura de 5 valores, e para cada valor, mostre
 * o seu dobro na tela.
 */
package dobrovalor;
import static java.lang.Math.pow;
import java.util.Scanner;

public class DobroValor {
    public static void main(String[] args) {
         
        Scanner entrada = new Scanner (System.in);
        int n;
        
        for(int valores=0; valores<5; valores++){
            System.out.printf("\nDigite um valor:\n");
            n= entrada.nextInt();
            
            System.out.println("Seu dobro é: " +pow(n,2));
        } 
         System.out.printf("\nFim do programa!\n");
    }   
}
