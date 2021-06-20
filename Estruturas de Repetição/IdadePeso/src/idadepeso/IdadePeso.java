/*
 * Faça um programa que leia a idade e peso de sete pessoas. Calcule e mostre:
 * - a quantidade de pessoas com mais de 90 kg
 * - a média das idades das sete pessoas
 */
package idadepeso;
import java.util.Scanner;

public class IdadePeso {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        double peso,idade;
        int contador= 1;
        int p90=0;  // pessoas com + de 90kg
        double mediaid=0;  // media das idades
        double somaid=0;  // soma das idades

        while(contador <=7){
            System.out.printf("Informe a idade da pessoa %d:\n", contador);
            idade= entrada.nextDouble();
            somaid = somaid+idade;
            System.out.println("Informe o peso(em kg): ");
            peso= entrada.nextDouble();
            contador++;

            if (peso >90){
                p90++;
            }
        }
        System.out.printf("\nA quantidade de pessoas com mais de 90kg é= %d",p90);
        mediaid= somaid/7;
        System.out.printf("\nA média das idades é= %.2f\n", mediaid);
    }    
}
