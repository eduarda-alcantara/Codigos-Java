/*
 * Faça um programa que leia as notas de 10 alunos, calcule a
 * média das notas, e imprima:
 * - A média das notas
 * - Uma listagem contendo os alunos, com suas respectivas notas, que obtiveram 
 * notas abaixo da média
 * - Uma listagem contendo os alunos, com suas respectivas notas, que obtiveram 
 * notas maiores ou iguais à média
 */
package mediaalunos;
import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        int [] nota = new int [10];
        int cont, soma=0, media=0;
        String situacao;

        for (cont=0; cont<10; cont++){
            System.out.println("Digite a nota do aluno "+(cont+1)+":");
            nota[cont]= entrada.nextInt();
            soma= soma+nota[cont];
        }

        for (cont=0; cont<10; cont++){
            media=soma/10;
        }
        System.out.printf("\nMÉDIA= %d\n" ,media);
        System.out.printf("\nSITUAÇÃO GERAL:");

        for (cont=0; cont<10; cont++){
            if(nota[cont]>media){
                situacao= "Nota maior que a média";
                System.out.printf("\nAluno:%d |Nota:%d |Situação: %s", cont+1, nota[cont], situacao);
            }else if(nota[cont]<media){
                situacao= "Nota menor que a média";
                System.out.printf("\nAluno:%d |Nota:%d |Situação: %s", cont+1,nota[cont], situacao);
            }else{
                situacao= "Nota igual a média";
                System.out.printf("\nAluno:%d |Nota:%d |Situação: %s", cont+1, nota[cont], situacao);
            }
        }
        System.out.printf("\n\nNOTAS MAIORES OU IGUAIS A MÉDIA\n");
        for (cont=0; cont<10; cont++){
            if(nota[cont]>=media){
                System.out.printf("Aluno:%d |Nota:%d\n", cont+1, nota[cont]);}
        }

        System.out.printf("\nNOTAS MENORES QUE A MÉDIA\n");
        for (cont=0; cont<10; cont++){
            if(nota[cont]<media){
                System.out.printf("Aluno:%d |Nota:%d\n", cont+1,nota[cont]);
            }
        }
    }
}
