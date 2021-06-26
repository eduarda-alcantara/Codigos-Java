/*
 * Faça um programa que solicite ao usuário que informe inicialmente os 6
 * números sorteados na Mega Sena. Em seguida, peça que ele digite os 6 
 * números do cartão que jogou. Imprima a quantidade de pontos que ele fez no concurso
 */
package megasena;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
   
   Scanner entrada= new Scanner (System.in);
   int [] sorteados = new int [6];
   int [] jogados = new int [6];
   int i,j, qtdAcertos=0;

   for (i=0; i<6; i++){
       System.out.println("Digite o " +(i+1)+"º número sorteado:");
       sorteados[i]=entrada.nextInt();
   }
   for (j=0; j<6; j++){
       System.out.println("Digite o " +(j+1)+"º número que você jogou:");
       jogados[j]=entrada.nextInt();
       for (i=0; i<6; i++){
            if (jogados[j] == sorteados [i]){
                 qtdAcertos++;
            }
        }
   }
   System.out.printf("\n\nA quantidade de acertos foi: %d\n" ,qtdAcertos);
    }
} 


