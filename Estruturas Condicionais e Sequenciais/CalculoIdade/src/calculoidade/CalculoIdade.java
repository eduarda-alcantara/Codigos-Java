/*
 * Faça um programa que receba o ano de nascimento de uma pessoa, o
 * ano atual e solicite um ano para que o programa informe a idade atual 
 * e a idade que ela terá no ano informado.
 */
package calculoidade;
import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        int AnoNasc, AnoAtual, AnoFut;
        
        System.out.println("Digite o ano do seu nascimento:");
        AnoNasc= entrada.nextInt();
         
        System.out.println("Digite o ano atual:");
        AnoAtual= entrada.nextInt();
    
        System.out.println("Digite o ano que deseja saber:");
        AnoFut= entrada.nextInt();
        
        int idade= (AnoAtual- AnoNasc);
        System.out.printf("\nSua idade atual é: %d anos\n" ,idade);
        
        int IdFut= (AnoFut- AnoNasc);
        System.out.printf("Sua idade em %d será: %d anos\n" ,AnoFut,IdFut);
    }   
}
