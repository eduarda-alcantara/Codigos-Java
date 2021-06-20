/*
 * Faça um programa que leia um vetor com as notas de 10 alunos e imprima a 
 * maior e a menor nota, bem como quais os alunos que obtiveram essas notas.
 */
package notas;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int qtd=10;
        double nota[]= new double[qtd];
        double notaMaior=0;
        double notaMenor=0;
        String aluno [] = new String[qtd];
        int i;
        
        for(i=0;i<qtd;i++){
        System.out.printf("\nDigite o nome do %dº aluno: " ,(i+1));
        aluno[i]=entrada.nextLine();
        
        System.out.printf("Digite a nota do(a) %s: ", aluno[i]);
        nota[i]=entrada.nextDouble();
        entrada.nextLine();
        
        if(i==0){
          notaMaior=nota[i];
          notaMenor=nota[i];
        }
        if(nota[i]> notaMaior){
           notaMaior =nota[i];
        }
        if(nota[i]< notaMenor){
           notaMenor= nota[i];
        }
      }
        System.out.printf("\n\nALUNO(S) COM A MAIOR NOTA:");
    for(i=0;i<qtd;i++){
        if( nota[i]== notaMaior){
            System.out.printf("\nNome: %s |Nota:%.2f", aluno[i],notaMaior);
        }
    }
    System.out.printf("\n\nALUNO(S) COM A MENOR NOTA:");
    for(i=0;i<qtd;i++){
        if( nota[i]== notaMenor){
           System.out.printf("\nNome: %s |Nota:%.2f\n", aluno[i],notaMenor);
        }
    }
  }
}
