/*
 * Faça um programa que leia um vetor com 10 elementos. Em seguida, troque todos
 * os valores negativos do vetor por 0. Imprima o vetor alterado.
 */
package negativos;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
       
    Scanner entrada= new Scanner (System.in);
    int [] vetor = new int [10];
    int pos;

    for (pos=0; pos<10; pos++){
        System.out.println("Digite um valor para " +(pos+1)+"º posição:");
        vetor[pos]=entrada.nextInt();
    }
    for (pos=0; pos<10; pos++){
         if (vetor[pos]<0){
            vetor[pos]=0;
        }
        System.out.printf("Novo elemento %d: %d\n" ,(pos+1), vetor[pos]);
    }
  }  
}
