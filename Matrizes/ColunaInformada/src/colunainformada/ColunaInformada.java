/*
 * Faça um programa que leia uma matriz 4 x 4. Solicite ao usuário que
 * informe o número de uma coluna. Imprima todos os elementos da coluna
 * informada.
 */
package colunainformada;

import java.util.Scanner;

public class ColunaInformada {
    public static void main(String[] args) {
       
       Scanner entrada= new Scanner (System.in);
       int [][] matriz= new int [4][4];
       int numero;

       for(int linha=0; linha<4; linha++){
           for (int coluna=0; coluna<4; coluna++){
               System.out.println("Digite um número para ["+(linha)+","+(coluna)+"]:");
               matriz[linha][coluna]= entrada.nextInt();
           }
       }
       System.out.printf("\nDigite o número de uma coluna (0-3) para imprimir os dados desejados:\n");
       numero= entrada.nextInt();
       
       System.out.printf("\nIMPRIMINDO COLUNA %d:\n", numero);
       for (int linha=0; linha<4; linha++){
           System.out.print(matriz [linha][numero] +" ");
           System.out.println();
       }
    }  
}
