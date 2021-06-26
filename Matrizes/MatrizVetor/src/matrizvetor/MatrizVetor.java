/*
 * Faça um programa que leia uma matriz 4 x 4 e imprima um vetor
 * contendo o maior elemento de cada linha
 */
package matrizvetor;
import java.util.Scanner;

public class MatrizVetor {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);        
        int [][] matriz= new int [4][4];
        int maior=-99999;
        int [] linhaMaior= new int [4];       
        
        for (int linha=0; linha<4; linha++){
           for (int coluna=0; coluna<4; coluna++){
            System.out.println("Digite um número para ["+(linha+1)+","+(coluna+1)+"]:");
            matriz[linha][coluna]= entrada.nextInt();           
            }
        } 
        for (int linha=0; linha<4; linha++){
           for (int coluna=0; coluna<4; coluna++){
               if(matriz[linha][coluna] >maior){
                  maior= matriz [linha][coluna]; 
               }              
           }
           linhaMaior[linha]= maior;
           maior=0;
        }   
         System.out.printf("\nMAIOR ELEMENTO DE CADA LINHA:\n");
         for (int linha=0; linha<4; linha++){  
              System.out.println((linha+1)+ "ºlinha= " +linhaMaior[linha] );                       
        }
    }    
}
     