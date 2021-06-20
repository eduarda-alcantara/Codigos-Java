/*
 * Faça um programa que leia dois vetores com 10 elementos cada um. 
 * Utilize outros dois vetores que recebam o resultado da multiplicação 
 * e divisão dos elementos de mesmo índice do primeiro vetor pelo segundo. 
 * Imprima em seguida os 4 vetores
 */
package pkg4vetores;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner entrada= new Scanner (System.in);
    int [] vetor1 = new int [10];
    int [] vetor2 = new int [10];
    int [] mult = new int [10];
    int [] div = new int [10];
    int pos;
    
    for (pos=0; pos<10; pos++){
        System.out.println("Digite o valor do " +(pos+1)+"º elemento do Vetor 1:");
        vetor1[pos]=entrada.nextInt();
    }
    System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    for (pos=0; pos<10; pos++){
        System.out.println("Digite o valor do " +(pos+1)+"º elemento do Vetor 2:");
        vetor2[pos]=entrada.nextInt();
    }
    for (pos=0; pos<10; pos++){
    mult[pos]= vetor1[pos]*vetor2[pos];
    div[pos]= vetor1[pos]/vetor2[pos];
    }   

    System.out.printf("\n\nVetor 1:\n");
    for (pos=0; pos<10; pos++){
        System.out.println(vetor1[pos]);
    }
        System.out.println("Vetor 2:");
    for (pos=0; pos<10; pos++){
        System.out.println(vetor2[pos]);
    }
    System.out.println("Vetor de Multiplicação:");
    for (pos=0; pos<10; pos++){
        System.out.println(mult[pos]);
    }
    System.out.println("Vetor de divisão:");
    for (pos=0; pos<10; pos++){
        System.out.println(div[pos]);
    }
  }
}
