/*
 * Faça um programa que leia as notas de 5 alunos, e que exiba a maior e
 * menor notas entre elas.
 */
package notas;
import java.util.Scanner; 

public class Notas {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int nota=0;
        int contador=1;
        int nmax=0;
        int nmin=9999;
        
        while (contador <=5){
            System.out.printf("\nDigite a nota %d:\n", contador);
            nota= entrada.nextInt();
            contador++;

            if(nota >nmax){
                nmax= nota;
            } if(nota <nmin){
                nmin= nota;
            }
        }
        System.out.printf("\nA maior nota é %d", nmax);
        System.out.printf("\nA menor nota é %d\n", nmin);
    }
}
