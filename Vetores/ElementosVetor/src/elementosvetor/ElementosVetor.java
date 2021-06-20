/*
 * Faça um programa que leia um vetor com 10 elementos inteiros. 
 * Solicite ao usuário que informe um novo número, e verifique se este número 
 * encontra-se no vetor. Caso positivo, imprima a(s) posição(ões) em que este 
 * número estiver no vetor. Caso contrário, exiba uma mensagem avisando ao 
 * usuário informando que o número não se encontra no vetor
 */
package elementosvetor;
import java.util.Scanner;

public class ElementosVetor {
    public static void main(String[] args) {

        Scanner entrada= new Scanner (System.in);
        int [] vetor = new int [10];
        int num, pos;

        for (pos=0; pos<10; pos++){
            System.out.println("Digite um número inteiro para " +(pos+1)+"º posição:");
            vetor[pos]=entrada.nextInt();
        }

        System.out.printf("\n\nDigite um número inteiro para procurar no vetor:\n ");
        num= entrada.nextInt();

        for (pos=0; pos<10; pos++){
            if (num == vetor[pos]){
                System.out.println("O número informado está na posição: " +(pos+1));
            }else if (num != vetor[pos]){
                System.out.println("O número informado não se encontra no vetor");
            }
        }   
    }
}
