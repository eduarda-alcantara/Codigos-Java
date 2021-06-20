/*
 * Faça um programa que solicite ao usuário que informe a matrícula e as três
 * notas de um conjunto de alunos. O programa deverá exibir a mensagem
 * informando se o aluno foi aprovado (média maior ou igual a 70), exame (nota
 * maior ou igual a 60 e menor que 70) ou reprovado (nota inferior a 60). O
 * programa irá terminar quando o usuário informar uma matrícula negativa.
 */
package medianotas;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);        
        int matricula= 0;
        int n1, n2, n3, media;
        
        System.out.println("Digite o número de matricula: ");
        matricula= entrada.nextInt();
        
        while (matricula >=1){        
        System.out.println("Digite a primeira nota: ");
        n1= entrada.nextInt();
        
        System.out.println("Digite a segunda nota: ");
        n2= entrada.nextInt();
        
        System.out.println("Digite a terceira nota: ");
        n3= entrada.nextInt();
        
        media= (n1+n2+n3)/3;
            if(media >=70){
                System.out.printf("\nAluno: %d | Situação: Aprovado\n",matricula);
            } else if(media >=60){
                System.out.printf("\nAluno: %d | Situação: Exame\n",matricula);
            }else
                System.out.printf("\nAluno: %d | Situação: Reprovado\n",matricula);
        
        System.out.printf("\nDigite o número de matricula se deseja prosseguir, se deseja finalizar digite um número negativo:\n");
        matricula= entrada.nextInt();        
        } 
    }    
}
