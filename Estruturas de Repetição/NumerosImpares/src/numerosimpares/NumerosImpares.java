/*
 * Faça um programa que leia um número e que imprima os números ímpares
 * de 1 até o número informado
 */
package numerosimpares;
import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner (System.in);
       int numero, impar, i;

       System.out.println("Digite um número positivo: ");
       numero= entrada.nextInt();

       System.out.printf("Números impares(1-> número desejado):\n");
       for (i=1; i<=numero; i++){
           if(i % 2!=0){
               impar=i;
               System.out.printf("%d, ",impar);}
       }
       System.out.printf("\n\nFim do programa!\n");
    }
}
