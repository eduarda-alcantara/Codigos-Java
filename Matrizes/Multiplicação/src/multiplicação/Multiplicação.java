/*
 * Faça um programa que carregue uma matriz 3x3 com números reais e receba 
 * um valor, digitado pelo usuário. Calcule e mostre a matriz resultante da 
 * multiplicação do número digitado por cada elemento da matriz.  
 */
package multiplicação;
import java.util.Scanner;

public class Multiplicação {
    public static void main(String[] args) {
       
        Scanner entrada= new Scanner (System.in);
        int [][] matriz= new int [3][3];
        int num;
        int [][] mult= new int[3][3];

        for (int linha=0; linha<3; linha++){
            for (int coluna=0; coluna<3; coluna++){
                System.out.println("Digite um número para["+(linha+1)+","+(coluna+1)+"]:");
                matriz[linha][coluna]= entrada.nextInt();
            }
        }
        System.out.printf("\nDigite um número para multiplicar:\n");
        num= entrada.nextInt();
        for (int linha=0; linha<3; linha++){
            for (int coluna=0; coluna<3; coluna++){
                mult[linha][coluna]= num * matriz [linha][coluna];
            }
        }
        System.out.printf("\nMATRIZ RESULTANTE DA MULTIPLICAÇÃO:\n");
        for (int linha=0; linha<3; linha++){
            for (int coluna=0; coluna<3; coluna++){
                System.out.print(mult[linha][coluna] +" ");
            }
            System.out.println();
        }
    }   
}
