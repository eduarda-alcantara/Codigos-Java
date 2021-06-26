/*
 * Faça um programa que peça ao usuário para informar os números de uma matriz
 * e calcule a soma da sua diagonal principal. 
 * Imprima a matriz informada e a soma.
 */
package somadiagonalprincipal;
import java.util.Scanner;

public class SomaDiagonalPrincipal {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        int matriz[][] = new int [3][3];
        int soma=0;
 
        for (int lin = 0; lin < matriz.length; lin++) {
           for (int col = 0; col < matriz.length; col++) {
               System.out.println("Digite um número para ["+(lin)+","+(col)+"]:");
                matriz [lin][col]= entrada.nextInt();
           }
           soma = soma + matriz[lin][lin];
        }
        
        System.out.printf("\nMATRIZ DIGITADA:\n");
        for (int lin = 0; lin < matriz.length; lin++) {
           for (int col = 0; col < matriz.length; col++) {
        System.out.print(matriz[lin][col]+ " ");
           }
           System.out.println();
        }
        System.out.printf("\nA SOMA DA DIAGONAL PRINCIPAL É: %d\n" ,soma); 
    }
}
